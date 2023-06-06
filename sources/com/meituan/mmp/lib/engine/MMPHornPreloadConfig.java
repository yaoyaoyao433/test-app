package com.meituan.mmp.lib.engine;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.dianping.shield.entity.ExposeAction;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.mmp.lib.DebugHelper;
import com.meituan.mmp.lib.executor.a;
import com.meituan.mmp.lib.trace.b;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MMPHornPreloadConfig {
    public static ChangeQuickRedirect a;
    private static MMPHornPreloadConfig e;
    private static String f;
    public final SharedPreferences c;
    public Data d;
    private ScheduledFuture g;
    static final Gson b = new Gson();
    private static String h = null;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static class PrefetchAppInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String appId;
        public long[] cityIds;
        public boolean onlyWifi;
    }

    public static /* synthetic */ void a(MMPHornPreloadConfig mMPHornPreloadConfig, final Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mMPHornPreloadConfig, changeQuickRedirect, false, "ec6027bbb2e535854955f5d8a931f6f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mMPHornPreloadConfig, changeQuickRedirect, false, "ec6027bbb2e535854955f5d8a931f6f5");
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.meituan.mmp.lib.engine.MMPHornPreloadConfig.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b2123e0a91cc6c632362472698870668", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b2123e0a91cc6c632362472698870668");
                    return;
                }
                com.meituan.mmp.lib.trace.b.c("Periodically running prefetch");
                com.meituan.mmp.lib.r.a(context);
            }
        };
        if (mMPHornPreloadConfig.g != null) {
            mMPHornPreloadConfig.g.cancel(true);
        }
        mMPHornPreloadConfig.g = a.c.a(runnable, 0L, mMPHornPreloadConfig.e());
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static class Data {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("appInstanceLimitWhenPreload")
        public int appInstanceLimitWhenPreload;
        @SerializedName("preload_app_default")
        @Nullable
        public String defaultPreloadApp;
        @SerializedName("disablePreloadPageStrategyIds")
        public List<String> disablePreloadPageStrategyIds;
        @SerializedName("disablePreloadWithStrategyAppIds")
        public List<String> disablePreloadWithStrategyAppIds;
        @SerializedName("enableBlankPagePreload")
        public boolean enableBlankPagePreload;
        @SerializedName("enable_external_prefetch_packages")
        public boolean enableExternalPrefetchPackages;
        @SerializedName("enable")
        public boolean enablePrefetch;
        @SerializedName("preload_app")
        public boolean enablePreloadApp;
        @SerializedName("preload_page")
        public boolean enablePreloadPage;
        @SerializedName("preload_page_in_sub_process")
        public boolean enablePreloadPageInSubProcess;
        @SerializedName("re_preload_app")
        public boolean enableRePreloadApp;
        @SerializedName("re_preload_app_when_normal_destroy")
        public boolean enableRePreloadAppWhenNormalDestroy;
        @SerializedName("enableX5VO")
        public boolean enableX5InOV;
        @SerializedName("enforce_main_process_when_preload_miss")
        public boolean enforceMainProcessWhenPreloadMiss;
        public transient boolean isDefaultConfig;
        @SerializedName("merge_initial_scripts_to_template")
        public boolean mergeInitialScripts;
        @SerializedName("preload_app_override")
        @Nullable
        public String overridePreloadApp;
        @SerializedName("appList")
        @Nullable
        public PrefetchAppInfo[] prefetchApps;
        @SerializedName("prefetch_earliest_time")
        public long prefetchEarliestTime;
        @SerializedName("interval")
        public long prefetchIntervalMinutes;
        @SerializedName("preload_app_queue")
        public String[] preloadAppQueue;
        @SerializedName("preload_cached_framework_package")
        public boolean preloadCachedFrameworkPkg;
        @SerializedName("preload_force_keep_time")
        public long preloadForceKeepTime;
        @SerializedName("preload_home_skip_app")
        @Nullable
        public String[] preloadHomeSkipApps;
        @SerializedName("preload_page_after_t3")
        public boolean preloadPageAfterT3;
        @SerializedName("preload_page_delay_t3")
        public long preloadPageDelayT3;
        @SerializedName("preload_page_immediately")
        public boolean preloadPageImmediately;
        @SerializedName("preload_page_to_home")
        public boolean preloadPageToHome;
        @SerializedName("preload_page_when_keep_alive")
        public boolean preloadPageWhenKeepAlive;
        @SerializedName("preload_app_skip")
        @Nullable
        public String[] preloadSkipApps;
        @SerializedName("preload_start_by_init")
        public boolean startPreloadByInit;
        @SerializedName("unzip")
        public boolean unzipAfterPrefetch;

        public Data() {
            this.isDefaultConfig = false;
            this.enablePreloadApp = false;
            this.enablePreloadPage = true;
            this.preloadPageAfterT3 = true;
            this.preloadPageDelayT3 = ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE;
            this.startPreloadByInit = false;
            this.preloadPageImmediately = false;
            this.enablePreloadPageInSubProcess = true;
            this.preloadPageToHome = true;
            this.preloadPageWhenKeepAlive = true;
            this.preloadHomeSkipApps = new String[]{"mmp_87dffc23944d"};
            this.enableBlankPagePreload = true;
            this.preloadForceKeepTime = 0L;
            this.appInstanceLimitWhenPreload = 2;
            this.enableRePreloadApp = true;
            this.enableRePreloadAppWhenNormalDestroy = true;
            this.enablePrefetch = false;
            this.prefetchEarliestTime = MetricsAnrManager.ANR_THRESHOLD;
            this.unzipAfterPrefetch = true;
            this.prefetchIntervalMinutes = 360L;
            this.enableX5InOV = false;
            this.mergeInitialScripts = true;
            this.preloadCachedFrameworkPkg = true;
            this.preloadAppQueue = null;
            this.enforceMainProcessWhenPreloadMiss = false;
            this.enableExternalPrefetchPackages = false;
        }

        public Data(boolean z) {
            this.isDefaultConfig = false;
            this.enablePreloadApp = false;
            this.enablePreloadPage = true;
            this.preloadPageAfterT3 = true;
            this.preloadPageDelayT3 = ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE;
            this.startPreloadByInit = false;
            this.preloadPageImmediately = false;
            this.enablePreloadPageInSubProcess = true;
            this.preloadPageToHome = true;
            this.preloadPageWhenKeepAlive = true;
            this.preloadHomeSkipApps = new String[]{"mmp_87dffc23944d"};
            this.enableBlankPagePreload = true;
            this.preloadForceKeepTime = 0L;
            this.appInstanceLimitWhenPreload = 2;
            this.enableRePreloadApp = true;
            this.enableRePreloadAppWhenNormalDestroy = true;
            this.enablePrefetch = false;
            this.prefetchEarliestTime = MetricsAnrManager.ANR_THRESHOLD;
            this.unzipAfterPrefetch = true;
            this.prefetchIntervalMinutes = 360L;
            this.enableX5InOV = false;
            this.mergeInitialScripts = true;
            this.preloadCachedFrameworkPkg = true;
            this.preloadAppQueue = null;
            this.enforceMainProcessWhenPreloadMiss = false;
            this.enableExternalPrefetchPackages = false;
            this.isDefaultConfig = z;
        }
    }

    public static MMPHornPreloadConfig a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "804a9545946ca9cffe4b504add3e9bab", RobustBitConfig.DEFAULT_VALUE)) {
            return (MMPHornPreloadConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "804a9545946ca9cffe4b504add3e9bab");
        }
        if (e == null) {
            synchronized (MMPHornPreloadConfig.class) {
                if (e == null) {
                    e = new MMPHornPreloadConfig();
                }
            }
        }
        return e;
    }

    public MMPHornPreloadConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dda433c8309d7378c4983bf9bfda34a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dda433c8309d7378c4983bf9bfda34a9");
            return;
        }
        this.c = MMPEnvHelper.getSharedPreferences("mmp_horn_preload_config");
        String string = this.c.getString("data", null);
        if (string != null) {
            try {
                this.d = (Data) b.fromJson(string, (Class<Object>) Data.class);
                return;
            } catch (Exception e2) {
                b.a.c("loadPreloadConfig", e2.toString());
            }
        }
        this.d = new Data(true);
    }

    public static String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e1035730d3b28ca6ff9e1a6f2c5af500", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e1035730d3b28ca6ff9e1a6f2c5af500");
        }
        if (h != null) {
            return h;
        }
        if (context != null) {
            try {
                h = context.getPackageManager().getPackageInfo("com.google.android.webview", 0).versionName;
            } catch (Exception unused) {
            }
        }
        if (h == null) {
            h = "";
        }
        return h;
    }

    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e63e699c2f97c2967bae5a1aae42a1cf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e63e699c2f97c2967bae5a1aae42a1cf")).booleanValue();
        }
        if (this.d.preloadSkipApps == null) {
            return false;
        }
        return Arrays.asList(this.d.preloadSkipApps).contains(str);
    }

    public final String b() {
        if (this.d.defaultPreloadApp != null) {
            return this.d.defaultPreloadApp;
        }
        return f;
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fcd9c4d791913e7eeb33a4a601506d6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fcd9c4d791913e7eeb33a4a601506d6")).booleanValue();
        }
        if (DebugHelper.l != null) {
            return DebugHelper.l.booleanValue();
        }
        return this.d.enablePreloadApp;
    }

    public final boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "205c4decbe795058bf2f2acf06d4fa6d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "205c4decbe795058bf2f2acf06d4fa6d")).booleanValue();
        }
        if (this.d.preloadHomeSkipApps != null) {
            for (String str2 : this.d.preloadHomeSkipApps) {
                if (TextUtils.equals(str, str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public long d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a7bff0c4aaf43c0d5c2f0550a8b71bd", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a7bff0c4aaf43c0d5c2f0550a8b71bd")).longValue() : this.c.getLong("lastCheck", 0L);
    }

    public long e() {
        return this.d.prefetchIntervalMinutes * LocationStrategy.LOCATION_TIMEOUT;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0077, code lost:
        if ((com.meituan.robust.PatchProxy.isSupport(r1, null, r11, true, "2022e4392d0012c6a1921d2c6d8d453d", com.meituan.robust.utils.RobustBitConfig.DEFAULT_VALUE) ? ((java.lang.Boolean) com.meituan.robust.PatchProxy.accessDispatch(r1, null, r11, true, "2022e4392d0012c6a1921d2c6d8d453d")).booleanValue() : "vivo".equalsIgnoreCase(android.os.Build.BRAND)) == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean f() {
        /*
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.mmp.lib.engine.MMPHornPreloadConfig.a
            java.lang.String r10 = "460f7f9ad873f1da4bae515c1d85f181"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L21
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r3, r9, r2, r10)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L21:
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r1 >= r4) goto L83
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = com.meituan.mmp.lib.utils.n.a
            java.lang.String r12 = "d3913487cfa823f1ce717c3909c49bf4"
            r6 = 0
            r8 = 1
            r10 = 4611686018427387904(0x4000000000000000, double:2.0)
            r5 = r1
            r7 = r4
            r9 = r12
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10)
            if (r5 == 0) goto L45
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r1, r3, r4, r2, r12)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            goto L4e
        L45:
            java.lang.String r1 = "oppo"
            java.lang.String r4 = android.os.Build.BRAND
            boolean r1 = r1.equalsIgnoreCase(r4)
        L4e:
            if (r1 != 0) goto L7a
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r11 = com.meituan.mmp.lib.utils.n.a
            java.lang.String r12 = "2022e4392d0012c6a1921d2c6d8d453d"
            r5 = 0
            r7 = 1
            r9 = 4611686018427387904(0x4000000000000000, double:2.0)
            r4 = r1
            r6 = r11
            r8 = r12
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9)
            if (r4 == 0) goto L6e
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r1, r3, r11, r2, r12)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            goto L77
        L6e:
            java.lang.String r1 = "vivo"
            java.lang.String r2 = android.os.Build.BRAND
            boolean r1 = r1.equalsIgnoreCase(r2)
        L77:
            if (r1 != 0) goto L7a
            goto L83
        L7a:
            com.meituan.mmp.lib.engine.MMPHornPreloadConfig r0 = a()
            com.meituan.mmp.lib.engine.MMPHornPreloadConfig$Data r0 = r0.d
            boolean r0 = r0.enableX5InOV
            return r0
        L83:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.engine.MMPHornPreloadConfig.f():boolean");
    }

    public static boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "91979411e5d4847cd3224c772fd6b014", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "91979411e5d4847cd3224c772fd6b014")).booleanValue() : a().d.mergeInitialScripts;
    }

    public static boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "03fd0b051eef976338ebda29ae11e540", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "03fd0b051eef976338ebda29ae11e540")).booleanValue() : a().d.preloadCachedFrameworkPkg;
    }

    public static String[] i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7baf47a1511f92439306fb0fcf3e9091", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7baf47a1511f92439306fb0fcf3e9091") : a().d.preloadAppQueue;
    }

    public static boolean j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5ecc8242bcf673316b7a5ea4ac6e122d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5ecc8242bcf673316b7a5ea4ac6e122d")).booleanValue() : a().d.enforceMainProcessWhenPreloadMiss;
    }

    public static boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8475df7816c456fddb81e8865a1131b5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8475df7816c456fddb81e8865a1131b5")).booleanValue();
        }
        List<String> list = a().d.disablePreloadWithStrategyAppIds;
        if (list == null) {
            return false;
        }
        return list.contains(str);
    }
}
