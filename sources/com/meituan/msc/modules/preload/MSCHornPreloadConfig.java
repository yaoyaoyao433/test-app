package com.meituan.msc.modules.preload;

import android.os.Build;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.dianping.shield.entity.ExposeAction;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.metrics.util.DeviceUtil;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MSCHornPreloadConfig extends com.meituan.msc.common.config.a<Config> {
    public static ChangeQuickRedirect c;
    private static MSCHornPreloadConfig d;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static class Config {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("preload_app_default")
        @Nullable
        public String defaultPreloadApp;
        @SerializedName("preload_app_override")
        @Nullable
        public String overridePreloadApp;
        @SerializedName("appList")
        @Nullable
        public PrefetchAppInfo[] prefetchApps;
        @SerializedName("preload_app_skip")
        @Nullable
        public String[] preloadSkipApps;
        @SerializedName("preload_app")
        public boolean enablePreloadApp = false;
        @SerializedName("preload_page")
        public boolean enablePreloadPage = true;
        @SerializedName("preload_page_after_t3")
        public boolean preloadPageAfterT3 = true;
        @SerializedName("preload_page_delay_t3")
        public long preloadPageDelayT3 = ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE;
        @SerializedName("preload_start_by_init")
        public boolean startPreloadByInit = false;
        @SerializedName("preload_page_immediately")
        public boolean preloadPageImmediately = false;
        @SerializedName("preload_page_in_sub_process")
        public boolean enablePreloadPageInSubProcess = true;
        @SerializedName("preload_page_to_home")
        public boolean preloadPageToHome = true;
        @SerializedName("preload_page_when_keep_alive")
        public boolean preloadPageWhenKeepAlive = true;
        @SerializedName("preload_home_skip_app")
        @Nullable
        public String[] preloadHomeSkipApps = {"mmp_87dffc23944d"};
        @SerializedName("enableBlankPagePreload")
        public boolean enableBlankPagePreload = true;
        @SerializedName("preload_force_keep_time")
        public long preloadForceKeepTime = 0;
        @SerializedName("appInstanceLimitWhenPreload")
        public int appInstanceLimitWhenPreload = 2;
        @SerializedName("re_preload_app")
        public boolean enableRePreloadApp = true;
        @SerializedName("re_preload_app_when_normal_destroy")
        public boolean enableRePreloadAppWhenNormalDestroy = true;
        @SerializedName("enable")
        public boolean enablePrefetch = false;
        @SerializedName("prefetch_earliest_time")
        public long prefetchEarliestTime = MetricsAnrManager.ANR_THRESHOLD;
        @SerializedName("unzip")
        public boolean unzipAfterPrefetch = true;
        @SerializedName("interval")
        public long prefetchIntervalMinutes = 360;
        @SerializedName("merge_initial_scripts_to_template")
        public boolean mergeInitialScripts = true;
        @SerializedName("preload_cached_framework_package")
        public boolean preloadCachedFrameworkPkg = true;
        @SerializedName("preload_app_queue")
        public String[] preloadAppQueue = null;
        @SerializedName("enforce_main_process_when_preload_miss")
        public boolean enforceMainProcessWhenPreloadMiss = false;
        @SerializedName("enablePreload")
        public boolean enablePreload = true;
        @SerializedName("enableBasePreload")
        public boolean enableBasePreload = true;
        @SerializedName("enableBizPreload")
        public boolean enableBizPreload = true;
        @SerializedName("appWhiteList")
        public String[] appWhiteList = {"7122f6e193de47c1", "61cbdaae3b504b9b"};
        @SerializedName("priorityAppList")
        public String[] priorityAppList = null;
        @SerializedName("appInstanceLimitWhenPreloadByAPI")
        public int appInstanceLimitWhenPreloadByAPI = 2;
        @SerializedName("enablePreCreatePageForLaunch")
        public boolean enablePreCreatePageForLaunch = true;
        public int basePreloadDelayWhenUsed = 2;
        public int batchCheckUpdateDelayAfterFP = 5;
        public int startPendingPreloadBizTaskAfterFP = 5;
        public int startPreloadBaseTaskAfterFP = 7;
        public String[] preloadWithoutPendingList = {"7122f6e193de47c1"};
        public boolean enablePreCreateRuntimeAtActivityCreateBeginning = false;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static class PrefetchAppInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String appId;
        public long[] cityIds;
        public boolean onlyWifi;
    }

    public static MSCHornPreloadConfig d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d4bb9203d39df084aeb95dfa5711b6ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (MSCHornPreloadConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d4bb9203d39df084aeb95dfa5711b6ff");
        }
        if (d == null) {
            synchronized (MSCHornPreloadConfig.class) {
                if (d == null) {
                    d = new MSCHornPreloadConfig();
                }
            }
        }
        return d;
    }

    public MSCHornPreloadConfig() {
        super("msc_preload", Config.class);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96e90c7ac374653e22f2dea632f61b8c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96e90c7ac374653e22f2dea632f61b8c");
        }
    }

    @Override // com.meituan.msc.common.config.a
    public final Map<String, Object> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35c710a54e271d0218b7f26b7e47e675", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35c710a54e271d0218b7f26b7e47e675");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("cityId", Long.valueOf(com.meituan.android.singleton.a.a().b()));
        hashMap.put("chromeVersion", com.meituan.msc.modules.api.web.a.a(MSCEnvHelper.getContext()));
        hashMap.put("deviceLevel", Integer.valueOf(DeviceUtil.getDeviceLevel(MSCEnvHelper.getContext()).getValue()));
        hashMap.put("deviceScore", Double.valueOf(DeviceUtil.getDeviceScore(MSCEnvHelper.getContext())));
        try {
            String str = Build.MANUFACTURER;
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("manufacturer", str);
            }
        } catch (Throwable unused) {
        }
        return hashMap;
    }

    @Override // com.meituan.msc.common.config.a
    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b3c75f9de595142641bc32a81764c15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b3c75f9de595142641bc32a81764c15");
        } else {
            super.b(str);
        }
    }

    public final boolean c(String str) {
        boolean z;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc844fe3ab52b7e9d68576ce0ed277bf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc844fe3ab52b7e9d68576ce0ed277bf")).booleanValue();
        }
        if (((Config) this.b).preloadPageToHome) {
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a572aff4ad0f3ba77c4a4dacde853c51", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a572aff4ad0f3ba77c4a4dacde853c51")).booleanValue();
            } else {
                if (((Config) this.b).preloadHomeSkipApps != null) {
                    for (String str2 : ((Config) this.b).preloadHomeSkipApps) {
                        if (TextUtils.equals(str, str2)) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        return ((Config) this.b).preloadPageWhenKeepAlive;
    }

    public final boolean f() {
        return ((Config) this.b).enableBlankPagePreload;
    }

    public static boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5f0e2c68da2aed76807d5c4c0208eb90", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5f0e2c68da2aed76807d5c4c0208eb90")).booleanValue() : ((Config) d().b).mergeInitialScripts;
    }

    public static boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f05ed60f5fb2465e6f7a54d5f57c39cd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f05ed60f5fb2465e6f7a54d5f57c39cd")).booleanValue() : ((Config) d().b).enablePreload;
    }

    public static boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b211d2576c4a7cf78664947dee863adf", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b211d2576c4a7cf78664947dee863adf")).booleanValue() : h() && ((Config) d().b).enableBasePreload;
    }

    public static boolean j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cdca97ca72484df2ccff4489422a726e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cdca97ca72484df2ccff4489422a726e")).booleanValue() : h() && ((Config) d().b).enableBizPreload;
    }

    public static boolean d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a2426f30cadd5f05738af341f51a213e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a2426f30cadd5f05738af341f51a213e")).booleanValue();
        }
        String[] strArr = ((Config) d().b).appWhiteList;
        if (strArr == null) {
            return false;
        }
        for (String str2 : strArr) {
            if (TextUtils.equals(str2, str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f5c77e64c7cd39d48d571f45d16551e5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f5c77e64c7cd39d48d571f45d16551e5")).booleanValue();
        }
        String[] strArr = ((Config) d().b).priorityAppList;
        if (strArr == null) {
            return false;
        }
        for (String str2 : strArr) {
            if (TextUtils.equals(str2, str)) {
                return true;
            }
        }
        return false;
    }

    public static String[] k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c046caeb6f0e26ada7f24df26391f7b7", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c046caeb6f0e26ada7f24df26391f7b7") : ((Config) d().b).priorityAppList;
    }

    public static int l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "18a073b5f945adc10550a7241b7eb1ee", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "18a073b5f945adc10550a7241b7eb1ee")).intValue() : ((Config) d().b).appInstanceLimitWhenPreloadByAPI;
    }

    public static int m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a95c76dc19c7faa68378f316edccdf3", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a95c76dc19c7faa68378f316edccdf3")).intValue() : ((Config) d().b).basePreloadDelayWhenUsed;
    }

    public static boolean n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e4a33ca2dce5f1b914d106b7078580bf", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e4a33ca2dce5f1b914d106b7078580bf")).booleanValue() : ((Config) d().b).enablePreCreatePageForLaunch;
    }

    public static boolean f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a467b9578ada62d19f8f8118b3454572", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a467b9578ada62d19f8f8118b3454572")).booleanValue();
        }
        String[] strArr = ((Config) d().b).preloadWithoutPendingList;
        if (strArr == null) {
            return false;
        }
        for (String str2 : strArr) {
            if (TextUtils.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bd7a46f19be15d5cac98f57f2f73cf2c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bd7a46f19be15d5cac98f57f2f73cf2c")).booleanValue() : ((Config) d().b).enablePreCreateRuntimeAtActivityCreateBeginning;
    }
}
