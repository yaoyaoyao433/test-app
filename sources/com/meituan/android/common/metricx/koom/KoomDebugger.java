package com.meituan.android.common.metricx.koom;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.cipstorage.ag;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.android.mrn.engine.MRNBundleManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class KoomDebugger {
    public static final String CRASH = "crash";
    public static final String C_LOG = "c_log";
    public static final String DIAGNOSE = "diagnose";
    public static final String HPROF_NAME = "hprof_name";
    public static final String IS_ENABLE = "is_enable";
    public static final String IS_FORK_DUMP_INIT_SUCCESS = "is_fork_dump_init_success";
    public static final String IS_OUT_OF_MEMORY_ERROR = "isOutOfMemoryError";
    public static final String IS_SDK_VERSION_SUPPORTED = "is_sdk_version_supported";
    public static final String IS_SO_LOADED = "is_so_loaded";
    public static final String MEMORY_TOUCH_TOP = "memory_touch_top";
    public static final String RESUME_AND_WAIT = "resume_and_wait";
    public static final String SOURCE = "source";
    public static final String UPLOAD_COUNT = "dumpCount";
    public static final String UPLOAD_ZIPS_RECORD = "upload_zips_record";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static volatile boolean isInit = false;
    private static volatile KoomDebugger sInstance;
    private q koomStorage;
    public final ag<ArrayList<String>> serializer;

    public KoomDebugger() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11c4e8123873fb0be4c47d80903b3a49", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11c4e8123873fb0be4c47d80903b3a49");
        } else {
            this.serializer = new ag<ArrayList<String>>() { // from class: com.meituan.android.common.metricx.koom.KoomDebugger.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.cipstorage.ag
                public ArrayList<String> deserializeFromString(String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "669e723150e0156ac1348977843b017e", RobustBitConfig.DEFAULT_VALUE)) {
                        return (ArrayList) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "669e723150e0156ac1348977843b017e");
                    }
                    try {
                        return (ArrayList) new Gson().fromJson(str, new TypeToken<ArrayList<String>>() { // from class: com.meituan.android.common.metricx.koom.KoomDebugger.2.1
                            public static ChangeQuickRedirect changeQuickRedirect;
                        }.getType());
                    } catch (Throwable th) {
                        Logger.getMetricxLogger().e(KoomDebugger.C_LOG, th);
                        return null;
                    }
                }

                @Override // com.meituan.android.cipstorage.ag
                public String serializeAsString(ArrayList<String> arrayList) {
                    Object[] objArr2 = {arrayList};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7b5abd5a90107bd1752ccf6d8627fb50", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7b5abd5a90107bd1752ccf6d8627fb50") : new Gson().toJson(arrayList);
                }
            };
        }
    }

    public static KoomDebugger getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1cd51b6b6e503203de8258b993fb8a8c", RobustBitConfig.DEFAULT_VALUE)) {
            return (KoomDebugger) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1cd51b6b6e503203de8258b993fb8a8c");
        }
        if (sInstance == null) {
            synchronized (KoomDebugger.class) {
                if (sInstance == null) {
                    sInstance = new KoomDebugger();
                }
            }
        }
        return sInstance;
    }

    public void init(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e70109c5abc31622d94597ff08bbecdc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e70109c5abc31622d94597ff08bbecdc");
        } else if (isInit) {
        } else {
            this.koomStorage = q.a(context, "koom_debug", 2);
            isInit = true;
        }
    }

    public void reportKoomInMain(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "87d27c03d3cb35508da4fac7bfea7140", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "87d27c03d3cb35508da4fac7bfea7140");
            return;
        }
        deleteNoUploadFile();
        if (!this.koomStorage.b(IS_OUT_OF_MEMORY_ERROR, false)) {
            if (z) {
                this.koomStorage.c();
                return;
            }
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(UPLOAD_ZIPS_RECORD, this.koomStorage.b(UPLOAD_ZIPS_RECORD, (Set<String>) null));
        linkedHashMap.put(C_LOG, this.koomStorage.a(C_LOG, this.serializer));
        linkedHashMap.put(IS_ENABLE, Boolean.valueOf(this.koomStorage.b(IS_ENABLE, false)));
        linkedHashMap.put(IS_SO_LOADED, Boolean.valueOf(this.koomStorage.b(IS_SO_LOADED, false)));
        linkedHashMap.put(IS_FORK_DUMP_INIT_SUCCESS, Boolean.valueOf(this.koomStorage.b(IS_FORK_DUMP_INIT_SUCCESS, false)));
        linkedHashMap.put(IS_SDK_VERSION_SUPPORTED, Boolean.valueOf(this.koomStorage.b(IS_SDK_VERSION_SUPPORTED, false)));
        linkedHashMap.put(RESUME_AND_WAIT, this.koomStorage.b(RESUME_AND_WAIT, StringUtil.NULL));
        linkedHashMap.put(HPROF_NAME, this.koomStorage.b(HPROF_NAME, StringUtil.NULL));
        linkedHashMap.put("source", this.koomStorage.b("source", StringUtil.NULL));
        Babel.log(new Log.Builder("").tag("koom_debug").generalChannelStatus(true).optional(linkedHashMap).build());
        this.koomStorage.c();
    }

    private void deleteNoUploadFile() {
        File[] listFiles;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ff9b71b885b099e3a5bfbf5d653d894", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ff9b71b885b099e3a5bfbf5d653d894");
            return;
        }
        File koomDir = KoomFileUploader.koomDir();
        if (!koomDir.exists() || (listFiles = koomDir.listFiles()) == null || listFiles.length == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (File file : listFiles) {
            if (file.getName().endsWith(MRNBundleManager.MRN_BUNDLE_SUFFIX)) {
                arrayList.add(file);
            }
        }
        if (arrayList.size() > 1) {
            File[] fileArr = (File[]) arrayList.toArray(new File[arrayList.size()]);
            orderByDate(fileArr);
            for (int i = 0; i < fileArr.length - 1; i++) {
                getInstance().updateKoomCIPS(UPLOAD_ZIPS_RECORD, "delete no uploaded file: " + fileArr[i].getName());
                fileArr[i].delete();
            }
        }
    }

    private void orderByDate(File[] fileArr) {
        Object[] objArr = {fileArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fdd060feed6dd4b6d5bc79e7d603b52c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fdd060feed6dd4b6d5bc79e7d603b52c");
        } else {
            Arrays.sort(fileArr, new Comparator<File>() { // from class: com.meituan.android.common.metricx.koom.KoomDebugger.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.util.Comparator
                public int compare(File file, File file2) {
                    Object[] objArr2 = {file, file2};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2fe05ea6fdfea65f3298fea6a960c025", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2fe05ea6fdfea65f3298fea6a960c025")).intValue();
                    }
                    int i = ((file.lastModified() - file2.lastModified()) > 0L ? 1 : ((file.lastModified() - file2.lastModified()) == 0L ? 0 : -1));
                    if (i > 0) {
                        return 1;
                    }
                    return i == 0 ? 0 : -1;
                }
            });
        }
    }

    public void updateKoomCIPS(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06a9f7f9e7d168097d9ce732b81db560", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06a9f7f9e7d168097d9ce732b81db560");
        } else if (isInit) {
            if (UPLOAD_ZIPS_RECORD.equals(str)) {
                Set<String> b = this.koomStorage.b(str, (Set<String>) null);
                if (b == null) {
                    b = new HashSet<>();
                }
                int b2 = this.koomStorage.b(UPLOAD_COUNT, 1);
                b.add(b2 + CommonConstant.Symbol.MINUS + str2);
                this.koomStorage.a(UPLOAD_COUNT, b2 + 1);
                this.koomStorage.a(str, b);
                return;
            }
            this.koomStorage.a(str, str2);
        }
    }

    public void updateKoomCIPS(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1490534f28e81a3f1f989041c7c42bc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1490534f28e81a3f1f989041c7c42bc1");
        } else if (isInit) {
            this.koomStorage.a(str, z);
        }
    }

    public void updateKoomCIPS(String str, ArrayList<String> arrayList) {
        Object[] objArr = {str, arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8696d7a8fc1e27ea2d03c788ec1eb455", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8696d7a8fc1e27ea2d03c788ec1eb455");
        } else if (isInit) {
            this.koomStorage.a(str, (String) arrayList, (ag<String>) this.serializer);
        }
    }
}
