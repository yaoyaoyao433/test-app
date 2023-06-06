package com.meituan.android.common.metricx.fileuploader;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.cipstorage.ag;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.metricx.Internal;
import com.meituan.android.common.metricx.helpers.SysDateAlarm;
import com.meituan.android.common.metricx.task.ThreadManager;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.android.common.metricx.utils.StoreUtils;
import com.meituan.android.mrn.engine.MRNBundleManager;
import com.meituan.metrics.common.Constants;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.shadowsong.mss.e;
import com.meituan.shadowsong.mss.h;
import com.sankuai.android.jarvis.c;
import com.sankuai.common.utils.ProcessUtils;
import com.sankuai.waimai.launcher.util.aop.b;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FileUpLoader implements SysDateAlarm.Alarm {
    private static final String CHANNEL_FILE_UPLOAD = "metricx_file_upload";
    private static final long FETCH_HORN_DELAY_MS = 20000;
    private static final String KEY_COST_BYTES = "cost_bytes";
    private static final String KEY_FILE_ID = "file_id";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile FileUpLoader sInstance;
    private AtomicLong costBytes;
    private Gson fileGson;
    private ag fileIdSerializer;
    private AtomicInteger fileTaskCount;
    private FileUpLoadConfig fileUpLoadConfig;
    private q fileUpLoadStorage;
    private volatile boolean isFileTaskOn;
    private volatile boolean isInit;
    private HashSet<String> lastUploadedFileId;
    private volatile boolean shouldResetTraffic;
    private ConcurrentHashMap<String, Object> targetUrls;

    public FileUpLoader() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "add345fc1dfd83cd1d2968d98c13864d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "add345fc1dfd83cd1d2968d98c13864d");
            return;
        }
        this.fileGson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        this.targetUrls = new ConcurrentHashMap<>();
        this.lastUploadedFileId = new HashSet<>();
        this.fileTaskCount = new AtomicInteger(0);
        this.costBytes = new AtomicLong(0L);
        this.isFileTaskOn = false;
        this.isInit = false;
        this.shouldResetTraffic = false;
        this.fileIdSerializer = new ag() { // from class: com.meituan.android.common.metricx.fileuploader.FileUpLoader.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.cipstorage.ag
            public Object deserializeFromString(String str) {
                HashSet hashSet;
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e8425223bf7c06cc3a354eee8fe537a1", RobustBitConfig.DEFAULT_VALUE)) {
                    return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e8425223bf7c06cc3a354eee8fe537a1");
                }
                try {
                    hashSet = (HashSet) FileUpLoader.this.fileGson.fromJson(str, new TypeToken<HashSet<String>>() { // from class: com.meituan.android.common.metricx.fileuploader.FileUpLoader.1.1
                        public static ChangeQuickRedirect changeQuickRedirect;
                    }.getType());
                } catch (Throwable unused) {
                    hashSet = null;
                }
                return hashSet == null ? new HashSet() : hashSet;
            }

            @Override // com.meituan.android.cipstorage.ag
            public String serializeAsString(Object obj) {
                Object[] objArr2 = {obj};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "01ed84e6de4c0e13d23cd5856e30635f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "01ed84e6de4c0e13d23cd5856e30635f") : FileUpLoader.this.fileGson.toJson(obj);
            }
        };
    }

    public static FileUpLoader getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ce3a8633bbfed4640f6ade6aaf5a2c34", RobustBitConfig.DEFAULT_VALUE)) {
            return (FileUpLoader) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ce3a8633bbfed4640f6ade6aaf5a2c34");
        }
        if (sInstance == null) {
            synchronized (FileUpLoader.class) {
                if (sInstance == null) {
                    sInstance = new FileUpLoader();
                }
            }
        }
        return sInstance;
    }

    public void init(final Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7996f2749b02eb5dcebabfe7ef04d4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7996f2749b02eb5dcebabfe7ef04d4e");
        } else if (this.isInit || !ProcessUtils.isMainProcess(context)) {
        } else {
            SysDateAlarm.getInstance().registerListener(this);
            ThreadManager.getInstance().postRunnableDelayed(new Runnable() { // from class: com.meituan.android.common.metricx.fileuploader.FileUpLoader.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ab01c7662ba5fb336a2579cb916ddbdc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ab01c7662ba5fb336a2579cb916ddbdc");
                    } else {
                        Horn.register("metricx_fileupload", new HornCallback() { // from class: com.meituan.android.common.metricx.fileuploader.FileUpLoader.2.1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // com.meituan.android.common.horn.HornCallback
                            public void onChanged(boolean z, String str) {
                                Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "3c672a02ed855f9c9961c57604b0869b", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "3c672a02ed855f9c9961c57604b0869b");
                                } else if (!z || TextUtils.isEmpty(str) || FileUpLoader.this.isFileTaskOn || !FileUpLoader.this.isInit) {
                                } else {
                                    try {
                                        FileUpLoader.this.fileUpLoadConfig = (FileUpLoadConfig) FileUpLoader.this.fileGson.fromJson(str, (Class<Object>) FileUpLoadConfig.class);
                                        if (FileUpLoader.this.fileUpLoadConfig == null) {
                                            return;
                                        }
                                        FileUpLoader.this.fileUpLoadStorage = q.a(context, FileUpLoader.CHANNEL_FILE_UPLOAD, 2);
                                        if (FileUpLoader.this.shouldResetTraffic) {
                                            FileUpLoader.this.fileUpLoadStorage.a(FileUpLoader.KEY_COST_BYTES, 0L);
                                        } else {
                                            FileUpLoader.this.costBytes.set(FileUpLoader.this.fileUpLoadStorage.b(FileUpLoader.KEY_COST_BYTES, 0L));
                                        }
                                        if (FileUpLoader.this.fileUpLoadConfig.reset_file_id_limit) {
                                            FileUpLoader.this.fileUpLoadStorage.a("file_id", (String) FileUpLoader.this.lastUploadedFileId, (ag<String>) FileUpLoader.this.fileIdSerializer);
                                        } else {
                                            FileUpLoader.this.lastUploadedFileId = (HashSet) FileUpLoader.this.fileUpLoadStorage.a("file_id", FileUpLoader.this.fileIdSerializer);
                                            if (FileUpLoader.this.lastUploadedFileId == null) {
                                                FileUpLoader.this.lastUploadedFileId = new HashSet();
                                            }
                                        }
                                        if (FileUpLoader.this.shouldUpload()) {
                                            FileUpLoader.this.compressAndUploadFile(FileUpLoader.this.convertToFullFilePath(context), context);
                                        }
                                    } catch (Exception e) {
                                        Logger.getBabelLogger().e(e.getMessage());
                                    }
                                }
                            }
                        });
                    }
                }
            }, FETCH_HORN_DELAY_MS);
            this.isInit = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldUpload() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72ac5e341eb4fc7425e06a8ce84691b3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72ac5e341eb4fc7425e06a8ce84691b3")).booleanValue();
        }
        if (this.fileUpLoadConfig.is_traffic_whitelist || this.costBytes.get() < this.fileUpLoadConfig.upload_size) {
            return (this.lastUploadedFileId.containsAll(this.fileUpLoadConfig.external_files.keySet()) && this.lastUploadedFileId.containsAll(this.fileUpLoadConfig.internal_files.keySet()) && this.lastUploadedFileId.containsAll(this.fileUpLoadConfig.custom_files.keySet())) ? false : true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void compressAndUploadFile(final HashMap<String, String> hashMap, Context context) {
        Object[] objArr = {hashMap, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e6b55d76fbe3b407c3608bc7d48dd078", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e6b55d76fbe3b407c3608bc7d48dd078");
            return;
        }
        this.isFileTaskOn = true;
        final File file = StoreUtils.getFile(context, "metricx_fileupload");
        if (!file.exists()) {
            file.mkdirs();
        }
        file.getPath();
        this.fileTaskCount.set(hashMap.size());
        for (final String str : hashMap.keySet()) {
            if (this.lastUploadedFileId.contains(str)) {
                finishIfLast(hashMap);
            } else {
                final String str2 = hashMap.get(str);
                b.a(c.a(), new Runnable() { // from class: com.meituan.android.common.metricx.fileuploader.FileUpLoader.3
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7e912053aa748448a4d9b131e3381fc6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7e912053aa748448a4d9b131e3381fc6");
                            return;
                        }
                        File file2 = new File(str2);
                        final File file3 = new File(file, str + CommonConstant.Symbol.UNDERLINE + Internal.getAppEnvironment().getUuid() + CommonConstant.Symbol.UNDERLINE + TimeUtil.currentTimeMillisSNTP() + MRNBundleManager.MRN_BUNDLE_SUFFIX);
                        String a = com.meituan.shadowsong.mss.b.a(file2, file3);
                        if (TextUtils.equals(a, "success")) {
                            if (!FileUpLoader.this.fileUpLoadConfig.is_traffic_whitelist) {
                                FileUpLoader.this.costBytes.addAndGet(file3.length());
                            }
                            h.a.a.a(file3, new e() { // from class: com.meituan.android.common.metricx.fileuploader.FileUpLoader.3.1
                                public static ChangeQuickRedirect changeQuickRedirect;

                                @Override // com.meituan.shadowsong.mss.e
                                public void onFailure() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "e7f49f051f53a7124c298fdea942843c", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "e7f49f051f53a7124c298fdea942843c");
                                        return;
                                    }
                                    FileUpLoader.this.targetUrls.put(str, "file upload fail");
                                    if (file3.exists()) {
                                        file3.delete();
                                    }
                                    FileUpLoader.this.finishIfLast(hashMap);
                                }

                                @Override // com.meituan.shadowsong.mss.e
                                public void onSuccess() {
                                    String str3;
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "942bc108c0267ea2fdbb44bcd4516488", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "942bc108c0267ea2fdbb44bcd4516488");
                                        return;
                                    }
                                    h hVar = h.a.a;
                                    String name = file3.getName();
                                    Object[] objArr4 = {name};
                                    ChangeQuickRedirect changeQuickRedirect5 = h.a;
                                    if (PatchProxy.isSupport(objArr4, hVar, changeQuickRedirect5, false, "c23aa8b7ef12b4284c64f4e206850379", RobustBitConfig.DEFAULT_VALUE)) {
                                        str3 = (String) PatchProxy.accessDispatch(objArr4, hVar, changeQuickRedirect5, false, "c23aa8b7ef12b4284c64f4e206850379");
                                    } else {
                                        str3 = "https://s3plus.sankuai.com/v1/mss_9bac99a330e2415d94ee9fa9bbfc83db/simple-perf/" + name;
                                    }
                                    FileUpLoader.this.targetUrls.put(str, str3);
                                    if (file3.exists()) {
                                        file3.delete();
                                    }
                                    FileUpLoader.this.finishIfLast(hashMap);
                                }
                            });
                            return;
                        }
                        FileUpLoader.this.targetUrls.put(str, a);
                        if (file3.exists()) {
                            file3.delete();
                        }
                        FileUpLoader.this.finishIfLast(hashMap);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, String> convertToFullFilePath(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d3d39fbf7f1cf6ade5aa9d2185fd6f4", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d3d39fbf7f1cf6ade5aa9d2185fd6f4");
        }
        HashMap<String, String> hashMap = new HashMap<>();
        File externalFilesDir = context.getExternalFilesDir(null);
        File filesDir = context.getFilesDir();
        if (externalFilesDir != null && this.fileUpLoadConfig.external_files != null) {
            String parent = externalFilesDir.getParent();
            for (String str : this.fileUpLoadConfig.external_files.keySet()) {
                hashMap.put(str, parent + this.fileUpLoadConfig.external_files.get(str));
            }
        }
        if (filesDir != null && this.fileUpLoadConfig.internal_files != null) {
            String parent2 = filesDir.getParent();
            for (String str2 : this.fileUpLoadConfig.internal_files.keySet()) {
                hashMap.put(str2, parent2 + this.fileUpLoadConfig.internal_files.get(str2));
            }
        }
        if (this.fileUpLoadConfig.custom_files != null) {
            for (String str3 : this.fileUpLoadConfig.custom_files.keySet()) {
                hashMap.put(str3, this.fileUpLoadConfig.custom_files.get(str3));
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishIfLast(HashMap<String, String> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bbfcf222a79a2fe848a97c7e045061ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bbfcf222a79a2fe848a97c7e045061ac");
        } else if (this.fileTaskCount.decrementAndGet() == 0) {
            Babel.log(new Log.Builder(this.fileGson.toJson(this.targetUrls)).generalChannelStatus(true).tag(Constants.FILE).build());
            this.fileUpLoadStorage.a("file_id", (String) hashMap.keySet(), (ag<String>) this.fileIdSerializer);
            if (!this.shouldResetTraffic) {
                this.fileUpLoadStorage.a(KEY_COST_BYTES, this.costBytes.get());
            } else {
                this.fileUpLoadStorage.a(KEY_COST_BYTES, 0L);
                this.costBytes.set(0L);
            }
            this.isFileTaskOn = false;
        }
    }

    @Override // com.meituan.android.common.metricx.helpers.SysDateAlarm.Alarm
    public void onMainProcessNewDate(String str, String str2) {
        this.shouldResetTraffic = true;
    }
}
