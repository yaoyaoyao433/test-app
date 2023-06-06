package com.meituan.android.common.aidata.resources.config;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.aidata.AIData;
import com.meituan.android.common.aidata.ai.bundle.AiDownloadEnv;
import com.meituan.android.common.aidata.ai.bundle.BundleUtil;
import com.meituan.android.common.aidata.ai.utils.AiUtils;
import com.meituan.android.common.aidata.ai.utils.ZipUtil;
import com.meituan.android.common.aidata.async.AsyncManager;
import com.meituan.android.common.aidata.jsengine.instance.InstanceContainer;
import com.meituan.android.common.aidata.jsengine.utils.BridgeUtil;
import com.meituan.android.common.aidata.raptoruploader.BlueException;
import com.meituan.android.common.aidata.resources.downloader.DDResRawResultCallback;
import com.meituan.android.common.aidata.utils.Constants;
import com.meituan.met.mercury.load.core.DDResource;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import com.sankuai.meituan.Lifecycle.b;
import com.sankuai.meituan.Lifecycle.d;
import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class JSFrameworkResourceManager {
    private static final String KEY_BRIDGE_FRAMEWORK_CONFIG = "bridge_framework_config";
    private static final String KEY_BRIDGE_FRAMEWORK_NAME = "name";
    private static final String KEY_BRIDGE_FRAMEWORK_VERSION = "version";
    private static final String KEY_CHECK_UPDATE_IN_BACKGROUND = "check_update_in_background";
    private static final String KEY_MAX_WAIT_DURATION = "max_wait_duration";
    private static final String TAG = "JSFrameworkResourceManager";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile String sFrameworkRootDirPath;
    private boolean mCheckUpdateInBackground;
    private ScheduledExecutorService mCountDownService;
    @NonNull
    private final Map<String, Boolean> mFrameworkDownloadStatus;
    private boolean mInited;
    private double mMaxWaitDuration;
    private String mRemoteFrameworkName;
    private String mRemoteFrameworkVersion;
    private String mRemoteHighestVersion;
    @NonNull
    private final List<IJSFrameworkUpdateResultCallback> mUpdateResultCallbacks;

    public JSFrameworkResourceManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09e6073a85c27a5128889898b36b039e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09e6073a85c27a5128889898b36b039e");
            return;
        }
        this.mRemoteHighestVersion = AiDownloadEnv.AI_JS_FRAMEWORK_PRESET_VERSION;
        this.mMaxWaitDuration = 0.0d;
        this.mFrameworkDownloadStatus = new HashMap();
        this.mCheckUpdateInBackground = false;
        this.mInited = false;
        this.mUpdateResultCallbacks = new ArrayList();
        b.a().a(new d() { // from class: com.meituan.android.common.aidata.resources.config.JSFrameworkResourceManager.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.sankuai.meituan.Lifecycle.d
            public void applicationEnterForeground() {
            }

            @Override // com.sankuai.meituan.Lifecycle.d
            public void applicationEnterBackground() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "88e2772e1f87a6db6d23f6dc86a65ce1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "88e2772e1f87a6db6d23f6dc86a65ce1");
                    return;
                }
                boolean z = JSFrameworkResourceManager.this.mCheckUpdateInBackground;
                new StringBuilder("app enter background, update framework in the background? ").append(z);
                if (z) {
                    JSFrameworkResourceManager.getInstance().startUpdateFramework();
                }
            }
        });
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class FrameworkResourceManagerHolder {
        private static final JSFrameworkResourceManager INSTANCE = new JSFrameworkResourceManager();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public static JSFrameworkResourceManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cc7b396fc8d99ea4e6782c098ee0e4d2", RobustBitConfig.DEFAULT_VALUE) ? (JSFrameworkResourceManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cc7b396fc8d99ea4e6782c098ee0e4d2") : FrameworkResourceManagerHolder.INSTANCE;
    }

    public synchronized void init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d19961f2fedf78b509096e8fe8d00fc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d19961f2fedf78b509096e8fe8d00fc4");
        } else if (this.mInited) {
        } else {
            this.mInited = true;
            updateHeadJSInstanceManagerAtNonUIThread();
        }
    }

    public void handleConfigDataResponse(@Nullable String str) {
        JSONObject optJSONObject;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7b87ea85ee6516d636a721b219e9605", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7b87ea85ee6516d636a721b219e9605");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            JSONObject jSONObject = null;
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
            if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject(KEY_BRIDGE_FRAMEWORK_CONFIG)) == null || optJSONObject.keys() == null) {
                return;
            }
            new StringBuilder("bridge_framework_config is ").append(optJSONObject.toString());
            String optString = optJSONObject.optString("name");
            String optString2 = optJSONObject.optString("version");
            if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
                return;
            }
            synchronized (this) {
                this.mCheckUpdateInBackground = optJSONObject.optBoolean(KEY_CHECK_UPDATE_IN_BACKGROUND, false);
                this.mMaxWaitDuration = optJSONObject.optDouble(KEY_MAX_WAIT_DURATION, 0.0d);
                this.mRemoteFrameworkName = optString;
                this.mRemoteFrameworkVersion = optString2;
                StringBuilder sb = new StringBuilder("name = ");
                sb.append(optString);
                sb.append(", version = ");
                sb.append(optString2);
                sb.append(", check_update_in_background = ");
                sb.append(this.mCheckUpdateInBackground);
                sb.append(", max_wait_duration = ");
                sb.append(this.mMaxWaitDuration);
                startUpdateFramework();
            }
        }
    }

    public void startUpdateFramework() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1aa0368b309e9528428787f22882f0a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1aa0368b309e9528428787f22882f0a3");
        } else {
            startUpdateFramework(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e2, code lost:
        r13.onUpdateFinish(false, false, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void startUpdateFramework(@android.support.annotation.Nullable com.meituan.android.common.aidata.resources.config.IJSFrameworkUpdateResultCallback r13) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.aidata.resources.config.JSFrameworkResourceManager.startUpdateFramework(com.meituan.android.common.aidata.resources.config.IJSFrameworkUpdateResultCallback):void");
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.common.aidata.resources.config.JSFrameworkResourceManager$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 implements DDResRawResultCallback {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final /* synthetic */ String val$frameworkName;
        public final /* synthetic */ String val$frameworkRootDir;
        public final /* synthetic */ File val$frameworkRootDirFile;
        public final /* synthetic */ String val$frameworkVersion;

        public AnonymousClass2(String str, String str2, String str3, File file) {
            this.val$frameworkVersion = str;
            this.val$frameworkRootDir = str2;
            this.val$frameworkName = str3;
            this.val$frameworkRootDirFile = file;
        }

        @Override // com.meituan.android.common.aidata.resources.downloader.DDResRawResultCallback
        public void onSuccess(DDResource dDResource) {
            Object[] objArr = {dDResource};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22c6efd2891cad9c6756939e9a9f727a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22c6efd2891cad9c6756939e9a9f727a");
            } else if (dDResource == null || TextUtils.isEmpty(dDResource.getLocalPath())) {
            } else {
                synchronized (JSFrameworkResourceManager.this) {
                    if (AiUtils.compareAppVersion(this.val$frameworkVersion, JSFrameworkResourceManager.this.mRemoteFrameworkVersion) >= 0) {
                        String frameworkVersion = JSFrameworkResourceManager.this.getFrameworkVersion();
                        if (AiUtils.compareAppVersion(frameworkVersion, this.val$frameworkVersion) > 0) {
                            StringBuilder sb = new StringBuilder("JSFrameworkResourceManager local version ");
                            sb.append(frameworkVersion);
                            sb.append(" is higher, skip unzipping ");
                            sb.append(this.val$frameworkVersion);
                            return;
                        }
                        File file = new File(dDResource.getLocalPath());
                        if (ZipUtil.isZipFile(file)) {
                            ZipUtil.unZipFile(file, this.val$frameworkRootDir + File.separator + this.val$frameworkVersion, new ZipUtil.Callback() { // from class: com.meituan.android.common.aidata.resources.config.JSFrameworkResourceManager.2.1
                                public static ChangeQuickRedirect changeQuickRedirect;

                                @Override // com.meituan.android.common.aidata.ai.utils.ZipUtil.Callback
                                public void unzipSuccess() {
                                    Object[] objArr2 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3ee1d4b6c0bfddd43e97c62f4e94cbbd", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3ee1d4b6c0bfddd43e97c62f4e94cbbd");
                                        return;
                                    }
                                    StringBuilder sb2 = new StringBuilder("JSFrameworkResourceManager unzip ");
                                    sb2.append(AnonymousClass2.this.val$frameworkName);
                                    sb2.append(StringUtil.SPACE);
                                    sb2.append(AnonymousClass2.this.val$frameworkVersion);
                                    sb2.append(" success");
                                    File[] listFiles = AnonymousClass2.this.val$frameworkRootDirFile.listFiles(new FilenameFilter() { // from class: com.meituan.android.common.aidata.resources.config.JSFrameworkResourceManager.2.1.1
                                        public static ChangeQuickRedirect changeQuickRedirect;

                                        @Override // java.io.FilenameFilter
                                        public boolean accept(File file2, String str) {
                                            Object[] objArr3 = {file2, str};
                                            ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                            return PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "deb343f93de43303e554f697af208e80", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "deb343f93de43303e554f697af208e80")).booleanValue() : (str == null || str.equals(AnonymousClass2.this.val$frameworkVersion)) ? false : true;
                                        }
                                    });
                                    if (listFiles != null) {
                                        for (File file2 : listFiles) {
                                            AiUtils.deleteDir(file2);
                                        }
                                    }
                                    JSFrameworkResourceManager.this.updateHeadJSInstanceManagerAtNonUIThread();
                                    JSFrameworkResourceManager.this.mFrameworkDownloadStatus.put(AnonymousClass2.this.val$frameworkVersion, Boolean.FALSE);
                                    JSFrameworkResourceManager.this.notifyUpdateFrameworkResult(true, true, null);
                                }

                                @Override // com.meituan.android.common.aidata.ai.utils.ZipUtil.Callback
                                public void unzipFailed(Exception exc) {
                                    Object[] objArr2 = {exc};
                                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5cfb2e1ab49d2a55ba5b88e69f3ee7ac", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5cfb2e1ab49d2a55ba5b88e69f3ee7ac");
                                        return;
                                    }
                                    new StringBuilder("JSFrameworkResourceManager unzip failed: ").append(exc.getMessage());
                                    JSFrameworkResourceManager.this.mFrameworkDownloadStatus.put(AnonymousClass2.this.val$frameworkVersion, Boolean.FALSE);
                                    JSFrameworkResourceManager.this.notifyUpdateFrameworkResult(false, false, new BlueException("unzip framework failed"));
                                }
                            });
                            return;
                        }
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder("JSFrameworkResourceManager higher version ");
                    sb2.append(JSFrameworkResourceManager.this.mRemoteFrameworkVersion);
                    sb2.append(" framework is downloading, stop update framework ");
                    sb2.append(this.val$frameworkVersion);
                }
            }
        }

        @Override // com.meituan.android.common.aidata.resources.downloader.DDResRawResultCallback
        public void onFail(Exception exc) {
            Object[] objArr = {exc};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96f74f1b61542ac56d2f300c260c4184", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96f74f1b61542ac56d2f300c260c4184");
                return;
            }
            StringBuilder sb = new StringBuilder("download resource ");
            sb.append(this.val$frameworkName);
            sb.append(this.val$frameworkVersion);
            sb.append(" from DD info fail: ");
            sb.append(exc.toString());
            synchronized (JSFrameworkResourceManager.this) {
                JSFrameworkResourceManager.this.mFrameworkDownloadStatus.put(this.val$frameworkVersion, Boolean.FALSE);
                JSFrameworkResourceManager.this.notifyUpdateFrameworkResult(false, false, new BlueException("download framework failed"));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void notifyUpdateFrameworkResult(boolean z, boolean z2, @Nullable BlueException blueException) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), blueException};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "83bc85b968d906210e9ac5587f994d21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "83bc85b968d906210e9ac5587f994d21");
            return;
        }
        synchronized (this) {
            if (this.mUpdateResultCallbacks.isEmpty()) {
                return;
            }
            ArrayList<IJSFrameworkUpdateResultCallback> arrayList = new ArrayList(this.mUpdateResultCallbacks);
            this.mUpdateResultCallbacks.clear();
            StringBuilder sb = new StringBuilder("start notify update framework result: success = ");
            sb.append(z);
            sb.append(", frameworkUpgraded = ");
            sb.append(z2);
            for (IJSFrameworkUpdateResultCallback iJSFrameworkUpdateResultCallback : arrayList) {
                if (iJSFrameworkUpdateResultCallback != null) {
                    iJSFrameworkUpdateResultCallback.onUpdateFinish(z, z2, blueException);
                }
            }
        }
    }

    private void checkUpdateFrameworkTimeout(@Nullable final IJSFrameworkUpdateResultCallback iJSFrameworkUpdateResultCallback, long j) {
        Object[] objArr = {iJSFrameworkUpdateResultCallback, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "230fb8b38d14e0a0f59fc61a1eed6507", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "230fb8b38d14e0a0f59fc61a1eed6507");
        } else if (iJSFrameworkUpdateResultCallback == null || j <= 0) {
        } else {
            synchronized (this) {
                if (this.mCountDownService == null) {
                    this.mCountDownService = c.b("ai_check_update_framework_timeout", 4);
                }
                this.mCountDownService.schedule(new Runnable() { // from class: com.meituan.android.common.aidata.resources.config.JSFrameworkResourceManager.3
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        boolean remove;
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3e8edb0cf8609edfa1f74962458b871c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3e8edb0cf8609edfa1f74962458b871c");
                            return;
                        }
                        synchronized (JSFrameworkResourceManager.this) {
                            remove = JSFrameworkResourceManager.this.mUpdateResultCallbacks.remove(iJSFrameworkUpdateResultCallback);
                        }
                        if (remove) {
                            iJSFrameworkUpdateResultCallback.onUpdateFinish(false, false, new BlueException("update framework timeout"));
                        }
                    }
                }, j, TimeUnit.MILLISECONDS);
            }
        }
    }

    private synchronized boolean isFrameworkDownloading() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd30b453d618ccbbfac39e8017f33184", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd30b453d618ccbbfac39e8017f33184")).booleanValue();
        }
        if (!TextUtils.isEmpty(this.mRemoteFrameworkName) && !TextUtils.isEmpty(this.mRemoteFrameworkVersion)) {
            Boolean bool = this.mFrameworkDownloadStatus.get(this.mRemoteFrameworkVersion);
            return bool != null && bool.booleanValue();
        }
        return false;
    }

    private static synchronized String getFrameworkRootDirPath() {
        synchronized (JSFrameworkResourceManager.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "75d113214c247540173ee43cd0cdfcb7", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "75d113214c247540173ee43cd0cdfcb7");
            }
            if (TextUtils.isEmpty(sFrameworkRootDirPath)) {
                Context context = AIData.getContext();
                File a = q.a(context, Constants.SDK_LOG_TAG, AiDownloadEnv.AI_ROOT_DIR + File.separator + AiDownloadEnv.AI_JS_FRAMEWORK_DIR);
                sFrameworkRootDirPath = a != null ? a.getAbsolutePath() : "";
            }
            return sFrameworkRootDirPath;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateHeadJSInstanceManagerAtNonUIThread() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cf73b90f7e9c7eb59838dd06fc03a32c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cf73b90f7e9c7eb59838dd06fc03a32c");
        } else if (AsyncManager.isMainThread()) {
            c.a("ai_data_update_head_js_instance", new Runnable() { // from class: com.meituan.android.common.aidata.resources.config.JSFrameworkResourceManager.4
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1570c7aa38ffb4d4e16c55880325ebd6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1570c7aa38ffb4d4e16c55880325ebd6");
                    } else {
                        JSFrameworkResourceManager.this.updateHeadJSInstanceManager();
                    }
                }
            }).start();
        } else {
            updateHeadJSInstanceManager();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateHeadJSInstanceManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8eb27b3249a8b8273c3c311f83f4cae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8eb27b3249a8b8273c3c311f83f4cae");
            return;
        }
        String[] frameworkInfo = getFrameworkInfo();
        InstanceContainer.getInstance().updateHeadJSInstanceManager(frameworkInfo[0], frameworkInfo[1], frameworkInfo[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public String getFrameworkVersion() {
        File[] listFiles;
        File[] listFiles2;
        File parentFile;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6717c400170a850a83bda7be1b6f73bc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6717c400170a850a83bda7be1b6f73bc");
        }
        String str = "";
        String frameworkRootDirPath = getFrameworkRootDirPath();
        synchronized (this) {
            File file = new File(frameworkRootDirPath);
            if (file.exists() && (listFiles = file.listFiles(new FileFilter() { // from class: com.meituan.android.common.aidata.resources.config.JSFrameworkResourceManager.5
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.io.FileFilter
                public boolean accept(File file2) {
                    Object[] objArr2 = {file2};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "634eef49e3704f5cdf936dc070749065", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "634eef49e3704f5cdf936dc070749065")).booleanValue() : file2 != null && file2.isDirectory();
                }
            })) != null && listFiles.length > 0 && (listFiles2 = listFiles[0].listFiles(new FilenameFilter() { // from class: com.meituan.android.common.aidata.resources.config.JSFrameworkResourceManager.6
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.io.FilenameFilter
                public boolean accept(File file2, String str2) {
                    Object[] objArr2 = {file2, str2};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "01734fd13820b1709c62f53098a02466", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "01734fd13820b1709c62f53098a02466")).booleanValue() : AiDownloadEnv.AI_JS_FRAMEWORK_FILE_NAME.equals(str2);
                }
            })) != null && listFiles2.length > 0 && (parentFile = listFiles2[0].getParentFile()) != null) {
                str = parentFile.getName();
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = AiDownloadEnv.AI_JS_FRAMEWORK_PRESET_VERSION;
        }
        new StringBuilder("local framework version = ").append(str);
        return str;
    }

    @NonNull
    private String[] getFrameworkInfo() {
        File[] listFiles;
        File[] listFiles2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "497751fbe27eb830e6daac017bd0b503", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "497751fbe27eb830e6daac017bd0b503");
        }
        String[] strArr = new String[3];
        String str = "";
        String str2 = "";
        String str3 = "";
        String frameworkRootDirPath = getFrameworkRootDirPath();
        synchronized (this) {
            File file = new File(frameworkRootDirPath);
            if (file.exists() && (listFiles = file.listFiles(new FileFilter() { // from class: com.meituan.android.common.aidata.resources.config.JSFrameworkResourceManager.7
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.io.FileFilter
                public boolean accept(File file2) {
                    Object[] objArr2 = {file2};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "60d850723cdf7ae2fd6b4b37ffcfabd6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "60d850723cdf7ae2fd6b4b37ffcfabd6")).booleanValue() : file2 != null && file2.isDirectory();
                }
            })) != null && listFiles.length > 0 && (listFiles2 = listFiles[0].listFiles(new FilenameFilter() { // from class: com.meituan.android.common.aidata.resources.config.JSFrameworkResourceManager.8
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.io.FilenameFilter
                public boolean accept(File file2, String str4) {
                    Object[] objArr2 = {file2, str4};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b33d2c0a2150bde7cb33666fc621593f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b33d2c0a2150bde7cb33666fc621593f")).booleanValue() : AiDownloadEnv.AI_JS_FRAMEWORK_FILE_NAME.equals(str4) || AiDownloadEnv.AI_JS_FRAMEWORK_CONFIG_NAME.equals(str4);
                }
            })) != null && listFiles2.length > 0) {
                String str4 = "";
                String str5 = "";
                for (File file2 : listFiles2) {
                    if (file2 != null) {
                        String name = file2.getName();
                        if (AiDownloadEnv.AI_JS_FRAMEWORK_FILE_NAME.equals(name)) {
                            File parentFile = file2.getParentFile();
                            if (parentFile != null) {
                                str5 = parentFile.getName();
                            }
                            str2 = BundleUtil.readFileAsString(file2.getAbsolutePath());
                        } else if (AiDownloadEnv.AI_JS_FRAMEWORK_CONFIG_NAME.equals(name)) {
                            str4 = BundleUtil.readFileAsString(file2.getAbsolutePath());
                        }
                    }
                }
                str = str5;
                str3 = str4;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            str = AiDownloadEnv.AI_JS_FRAMEWORK_PRESET_VERSION;
            str2 = getLocalPresetFrameworkContent();
            str3 = "";
        }
        strArr[0] = str;
        strArr[1] = str2;
        strArr[2] = str3;
        StringBuilder sb = new StringBuilder("local framework version = ");
        sb.append(str);
        sb.append(", content = \n");
        sb.append(str2);
        sb.append(",\n config = ");
        sb.append(str3);
        return strArr;
    }

    private static String getLocalPresetFrameworkContent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "66ef565f0942da0983f70427cb4283c8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "66ef565f0942da0983f70427cb4283c8") : BridgeUtil.assetFile2Str(AIData.getContext(), "native-bundle-main.js");
    }
}
