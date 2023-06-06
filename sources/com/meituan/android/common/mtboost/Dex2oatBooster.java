package com.meituan.android.common.mtboost;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.FileObserver;
import android.os.Handler;
import android.os.UserHandle;
import android.support.annotation.AnyThread;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.system.Os;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import com.sankuai.common.utils.ProcessUtils;
import com.sankuai.waimai.launcher.util.aop.b;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class Dex2oatBooster implements HornCallback {
    private static final int BACKGROUND_DELAY = 5000;
    public static final int ERROR_CODE_DONE = 3;
    public static final int ERROR_CODE_EXCEPTION = -2;
    public static final int ERROR_CODE_HORN_DISABLE = -1;
    public static final int ERROR_CODE_NOT_MAIN_PROCESS = 5;
    public static final int ERROR_CODE_OTHERS = -1000;
    public static final int ERROR_CODE_PROFILE_ERROR = -3;
    public static final int ERROR_CODE_SINGLE_OVER = 1;
    public static final int ERROR_CODE_SUCCESS = 0;
    public static final int ERROR_CODE_SYSTEM_DONE = 4;
    public static final int ERROR_CODE_TOTAL_OVER = 2;
    public static final int ERROR_CODE_VERSION_LESS_N = 6;
    private static final String HORN_TYPE_DEX2OAT = "metricx_dex2oat";
    private static final String KEY_DEX2OAT_TOTAL_TIME = "dex2oat_compile_times";
    private static final String KEY_NEED_DEX2OAT = "need_dex2oat";
    private static final String TAG = "Dex2oatBooster";
    public static ChangeQuickRedirect changeQuickRedirect;
    private volatile boolean mAppInForeground;
    @Nullable
    private final Handler mBgHandler;
    private Runnable mBgHandlerRunnable;
    private final Context mContext;
    private volatile boolean mDex2oatToggling;
    private volatile Boolean mHornEnable;
    private int mMultiLaunchCanCompile;
    private FileObserver mProfileObserver;
    private int mSingleLaunchCanCompile;
    protected q mStorage;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public @interface ErrorCode {
    }

    public int validBaseArtLength() {
        return 2097152;
    }

    public Dex2oatBooster(@NonNull Context context, @Nullable Handler handler, boolean z) {
        Object[] objArr = {context, handler, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69f3f29c5fe5b631303359bbdb0be97d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69f3f29c5fe5b631303359bbdb0be97d");
            return;
        }
        this.mDex2oatToggling = false;
        this.mAppInForeground = true;
        this.mHornEnable = null;
        this.mSingleLaunchCanCompile = 4;
        this.mMultiLaunchCanCompile = 10;
        this.mBgHandlerRunnable = new Runnable() { // from class: com.meituan.android.common.mtboost.Dex2oatBooster.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4ee5d5a115d7ed6f46d7b08263a2c31e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4ee5d5a115d7ed6f46d7b08263a2c31e");
                } else {
                    b.a(c.a(), new Runnable() { // from class: com.meituan.android.common.mtboost.Dex2oatBooster.2.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // java.lang.Runnable
                        public void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "89b1bbf0199ad9f9dc164dcebbff9d8b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "89b1bbf0199ad9f9dc164dcebbff9d8b");
                            } else {
                                Dex2oatBooster.this.toggleDex2oatWithCheck();
                            }
                        }
                    });
                }
            }
        };
        this.mContext = context.getApplicationContext();
        this.mBgHandler = handler;
        if (Build.VERSION.SDK_INT >= 24) {
            Horn.init(context);
            Horn.register(HORN_TYPE_DEX2OAT, new ProxyHornCallback(this));
            if (z) {
                initStorage();
                this.mStorage.i().a(KEY_NEED_DEX2OAT, true).a(KEY_DEX2OAT_TOTAL_TIME, 0);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class ProxyHornCallback implements HornCallback {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final WeakReference<HornCallback> callback;

        public ProxyHornCallback(HornCallback hornCallback) {
            Object[] objArr = {hornCallback};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7d6e61e58e71d6cfea95bcd6f5ecc89", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7d6e61e58e71d6cfea95bcd6f5ecc89");
            } else {
                this.callback = new WeakReference<>(hornCallback);
            }
        }

        @Override // com.meituan.android.common.horn.HornCallback
        public void onChanged(boolean z, String str) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e202bd53a6110201b7fc0848bfc3af5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e202bd53a6110201b7fc0848bfc3af5");
                return;
            }
            HornCallback hornCallback = this.callback.get();
            if (hornCallback != null) {
                hornCallback.onChanged(z, str);
            }
        }
    }

    public int isNeedDex2Oat() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cf7a11bc60d87d1f74b073b22fd828bd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cf7a11bc60d87d1f74b073b22fd828bd")).intValue();
        }
        if (Build.VERSION.SDK_INT < 24) {
            return -1;
        }
        initStorage();
        return this.mStorage.b(KEY_NEED_DEX2OAT, true) ? 1 : 0;
    }

    public static int baseArtLength(@NonNull Context context) {
        String str;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2235878876026d4547a2f70fc9eb92b2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2235878876026d4547a2f70fc9eb92b2")).intValue();
        }
        String packageCodePath = context.getPackageCodePath();
        String substring = packageCodePath.substring(0, packageCodePath.lastIndexOf(47));
        if (new File(substring + "/oat/arm").exists()) {
            str = substring + "/oat/arm/base.art";
        } else {
            if (!new File(substring + "/oat/arm64").exists()) {
                return -1;
            }
            str = substring + "/oat/arm64/base.art";
        }
        File file = new File(str);
        try {
            if (file.exists() && file.isFile()) {
                return (int) file.length();
            }
            return -2;
        } catch (Throwable unused) {
            return -2;
        }
    }

    public void initStorage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4afc67198ec88ed208cbad9b2be70b24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4afc67198ec88ed208cbad9b2be70b24");
        } else if (this.mStorage == null) {
            this.mStorage = q.a(this.mContext, "mtboost_config");
        }
    }

    @CallSuper
    @SuppressLint({"DefaultLocale"})
    public void onFinish(@ErrorCode int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eba34e0e753ed84d01a89f9444fca226", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eba34e0e753ed84d01a89f9444fca226");
            return;
        }
        System.out.println(String.format("code: %d, msg=%s", Integer.valueOf(i), str));
        initStorage();
        if (i != 1) {
            this.mStorage.i().a(KEY_NEED_DEX2OAT, false);
        }
        if (this.mProfileObserver != null) {
            this.mProfileObserver.stopWatching();
        }
        if (this.mBgHandler != null) {
            this.mBgHandler.removeCallbacks(this.mBgHandlerRunnable);
        }
    }

    @Override // com.meituan.android.common.horn.HornCallback
    public void onChanged(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c944ae336a02764f7d1f4171c8cc3325", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c944ae336a02764f7d1f4171c8cc3325");
            return;
        }
        if (!z) {
            this.mHornEnable = Boolean.FALSE;
            onFinish(-1, "horn global enable false");
        }
        try {
            JsonObject asJsonObject = new JsonParser().parse(str).getAsJsonObject();
            this.mHornEnable = Boolean.valueOf(asJsonObject.get("enable").getAsBoolean());
            if (!this.mHornEnable.booleanValue()) {
                onFinish(-1, "disabled");
                return;
            }
            if (asJsonObject.has("single_max_retry")) {
                this.mSingleLaunchCanCompile = asJsonObject.get("max_retry").getAsInt();
            }
            if (asJsonObject.has("multiple_max_retry")) {
                this.mMultiLaunchCanCompile = asJsonObject.get("multiple_max_retry").getAsInt();
            }
            this.mBgHandlerRunnable.run();
        } catch (Exception e) {
            this.mHornEnable = Boolean.FALSE;
            onFinish(-2, e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public void toggleDex2oatWithCheck() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b41b186dfe3471268a92f23328343e01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b41b186dfe3471268a92f23328343e01");
        } else if (Build.VERSION.SDK_INT < 24) {
            onFinish(6, "Dex2oatBooster only work on Android 7 and higher");
        } else if (!ProcessUtils.isMainProcess(this.mContext)) {
            onFinish(5, "Dex2oatBooster only work in Main process");
        } else if (this.mAppInForeground || this.mHornEnable == null || !this.mHornEnable.booleanValue()) {
        } else {
            if (!this.mDex2oatToggling) {
                synchronized (this) {
                    if (this.mDex2oatToggling) {
                        return;
                    }
                    this.mDex2oatToggling = true;
                }
            }
            try {
                try {
                    initStorage();
                    if (!this.mStorage.b(KEY_NEED_DEX2OAT, true)) {
                        onFinish(3, "dex2oat has done, don't retry");
                        synchronized (this) {
                            this.mDex2oatToggling = false;
                        }
                        return;
                    }
                    int b = this.mStorage.b(KEY_DEX2OAT_TOTAL_TIME, 0);
                    if (b >= this.mMultiLaunchCanCompile) {
                        onFinish(2, "multi compile over");
                        synchronized (this) {
                            this.mDex2oatToggling = false;
                        }
                        return;
                    }
                    int profileLength = profileLength();
                    if (profileLength < 0) {
                        onFinish(-3, "profile error: " + profileLength);
                        synchronized (this) {
                            this.mDex2oatToggling = false;
                        }
                    } else if (profileLength == 0) {
                        monitorProfileLength();
                        synchronized (this) {
                            this.mDex2oatToggling = false;
                        }
                    } else {
                        dex2oat(this.mContext);
                        this.mSingleLaunchCanCompile--;
                        this.mStorage.i().a(KEY_DEX2OAT_TOTAL_TIME, b + 1);
                        if (baseArtLength(this.mContext) > validBaseArtLength()) {
                            onFinish(3, "success");
                        } else if (this.mSingleLaunchCanCompile <= 0) {
                            onFinish(1, "cann't retry again");
                        } else {
                            monitorProfileLength();
                        }
                        synchronized (this) {
                            this.mDex2oatToggling = false;
                        }
                    }
                } catch (Exception e) {
                    onFinish(-2, e.getMessage());
                    synchronized (this) {
                        this.mDex2oatToggling = false;
                    }
                }
            } catch (Throwable th) {
                synchronized (this) {
                    this.mDex2oatToggling = false;
                    throw th;
                }
            }
        }
    }

    private void monitorProfileLength() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4c9c966c2aaead9586b204015767952", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4c9c966c2aaead9586b204015767952");
        } else if (this.mProfileObserver == null) {
            this.mProfileObserver = new FileObserver(profilePath(), 2) { // from class: com.meituan.android.common.mtboost.Dex2oatBooster.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.os.FileObserver
                public void onEvent(int i, @Nullable String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "89d8ee94891b0bc8b4e8866adcbd5b4a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "89d8ee94891b0bc8b4e8866adcbd5b4a");
                    } else if (Dex2oatBooster.this.mBgHandler != null) {
                        Dex2oatBooster.this.mBgHandler.removeCallbacks(Dex2oatBooster.this.mBgHandlerRunnable);
                        Dex2oatBooster.this.mBgHandler.postDelayed(Dex2oatBooster.this.mBgHandlerRunnable, MetricsAnrManager.ANR_THRESHOLD);
                    } else {
                        Dex2oatBooster.this.mBgHandlerRunnable.run();
                    }
                }
            };
            this.mProfileObserver.startWatching();
        }
    }

    @SuppressLint({"NewApi"})
    private static int getUserId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a191071a930dedc08a06188a6e231420", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a191071a930dedc08a06188a6e231420")).intValue();
        }
        try {
            return ((Integer) UserHandle.class.getDeclaredMethod("getUserId", Integer.TYPE).invoke(null, Integer.valueOf(Os.getuid()))).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    private String profilePath() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d88c6029735bcf153f1bc5ee1c9acea", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d88c6029735bcf153f1bc5ee1c9acea");
        }
        return "/data/misc/profiles/cur/" + getUserId() + "/" + this.mContext.getPackageName() + "/primary.prof";
    }

    private int profileLength() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a4c6ad2b70f3e39574dd59ae550ecbe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a4c6ad2b70f3e39574dd59ae550ecbe")).intValue();
        }
        File file = new File(profilePath());
        try {
            if (file.exists()) {
                return (int) file.length();
            }
            return -1;
        } catch (SecurityException unused) {
            return -2;
        }
    }

    private boolean dex2oat(Context context) throws IOException, InterruptedException {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b25bafbaf0dd71264f66880123db7cf7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b25bafbaf0dd71264f66880123db7cf7")).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("cmd");
        arrayList.add("package");
        arrayList.add("compile");
        arrayList.add("-m");
        arrayList.add("speed-profile");
        arrayList.add(context.getPackageName());
        return new ProcessBuilder(arrayList).start().waitFor() == 0;
    }

    @AnyThread
    public void onForeground() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef24e54bd8e38d0cc2c0853cba9e1481", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef24e54bd8e38d0cc2c0853cba9e1481");
            return;
        }
        this.mAppInForeground = true;
        if (this.mBgHandler != null) {
            this.mBgHandler.removeCallbacks(this.mBgHandlerRunnable);
        }
    }

    @AnyThread
    public void onBackground() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a0d3f981d33be7e1b06cf9b039ce753", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a0d3f981d33be7e1b06cf9b039ce753");
            return;
        }
        this.mAppInForeground = false;
        if (this.mBgHandler != null) {
            this.mBgHandler.postDelayed(this.mBgHandlerRunnable, MetricsAnrManager.ANR_THRESHOLD);
        } else {
            this.mBgHandlerRunnable.run();
        }
    }
}
