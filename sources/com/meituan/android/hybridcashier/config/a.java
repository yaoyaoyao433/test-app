package com.meituan.android.hybridcashier.config;

import android.content.Context;
import com.meituan.android.hybridcashier.cashier.HybridCashierSetting;
import com.meituan.android.hybridcashier.config.bean.BreatheOptions;
import com.meituan.android.hybridcashier.config.bean.EnableOptions;
import com.meituan.android.hybridcashier.config.bean.HybridCashierConfig;
import com.meituan.android.hybridcashier.config.bean.NSROptions;
import com.meituan.android.hybridcashier.config.bean.NeoConfigurations;
import com.meituan.android.hybridcashier.config.bean.PreLoadOptions;
import com.meituan.android.hybridcashier.config.bean.SSROptions;
import com.meituan.android.hybridcashier.config.horn.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static HybridCashierSetting a(HybridCashierConfig hybridCashierConfig, String str) {
        Object[] objArr = {hybridCashierConfig, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf75ac19bdf41637d8b292189b79d901", RobustBitConfig.DEFAULT_VALUE)) {
            return (HybridCashierSetting) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf75ac19bdf41637d8b292189b79d901");
        }
        if (hybridCashierConfig != null) {
            return a(hybridCashierConfig);
        }
        return a(str);
    }

    private static HybridCashierSetting a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1af504509cdecc913172d8e57c18d6d4", RobustBitConfig.DEFAULT_VALUE) ? (HybridCashierSetting) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1af504509cdecc913172d8e57c18d6d4") : a(c.a(str));
    }

    public static HybridCashierSetting a(HybridCashierConfig hybridCashierConfig) {
        Object[] objArr = {hybridCashierConfig};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ebde34409fbef57a24b66a0bf217a7d2", RobustBitConfig.DEFAULT_VALUE)) {
            return (HybridCashierSetting) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ebde34409fbef57a24b66a0bf217a7d2");
        }
        HybridCashierSetting.a builder = HybridCashierSetting.builder();
        if (hybridCashierConfig == null || !hybridCashierConfig.isHybridCashierEnable()) {
            return builder.a();
        }
        builder.a(hybridCashierConfig.getHybridCashierPath()).c(hybridCashierConfig.getHybridUserFlag()).b(hybridCashierConfig.getGreyFlag()).g(hybridCashierConfig.isOfflinePkgCheckAvailable(false)).f(hybridCashierConfig.isCheckOfflinePackageEnable());
        NeoConfigurations neoConfigurations = hybridCashierConfig.getNeoConfigurations();
        if (neoConfigurations != null) {
            builder.a(neoConfigurations.isLoadingEnable()).h(neoConfigurations.isEnableNeoBridge()).j(neoConfigurations.isEnableNeoRequestBridge()).k(neoConfigurations.isEnableNeoPrerenderBridge()).l(neoConfigurations.isEnableCheckUpsePayStatus()).i(neoConfigurations.isEnablePresetBundle());
            NSROptions nsrOptions = neoConfigurations.getNsrOptions();
            if (nsrOptions != null) {
                builder.b(nsrOptions.isNsrEnabled()).c(nsrOptions.isNsrKeepEnabled()).d(nsrOptions.isNsrAllPagesEnabled()).a(nsrOptions.getNsrDelay()).b(nsrOptions.getNsrBusinessLimitTime()).d(nsrOptions.getNsrLoadPath());
            }
            SSROptions ssrOptions = neoConfigurations.getSsrOptions();
            if (ssrOptions != null) {
                builder.m(ssrOptions.isSsrEnabled()).e(ssrOptions.getSsrRequestPath()).f(ssrOptions.getSsrShowOnVisible());
            }
            PreLoadOptions preLoadOptions = neoConfigurations.getPreLoadOptions();
            if (preLoadOptions != null) {
                builder.n(preLoadOptions.isPreloadEnabled()).g(preLoadOptions.getPreloadPath()).o(preLoadOptions.isPreloadUsedEnabled());
            }
            BreatheOptions breatheOptions = neoConfigurations.getBreatheOptions();
            if (breatheOptions != null) {
                builder.p(breatheOptions.isEnableNeoBreathe()).q(breatheOptions.isEnablePixelColor()).r(breatheOptions.isEnableCheckDomCount()).a(breatheOptions.getBreatheUnresponsiveTimesAsBroken()).d(breatheOptions.getBreatheIntervalTimeMillis()).e(breatheOptions.getBreatheDelayMillis()).f(breatheOptions.getBreatheTimeoutMillis()).h(breatheOptions.getBreatheDeathOptions());
            }
        }
        EnableOptions enableOptions = hybridCashierConfig.getEnableOptions();
        if (enableOptions != null) {
            builder.e(enableOptions.isWebUnavailableDowngrade()).c(enableOptions.getWebUnavailableTimeout()).a(enableOptions.getEnableChromeVersion());
        }
        return builder.a();
    }

    public static boolean b(HybridCashierConfig hybridCashierConfig) {
        Object[] objArr = {hybridCashierConfig};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1ffac845cfb23e8a0bb80e69a1bc0cce", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1ffac845cfb23e8a0bb80e69a1bc0cce")).booleanValue() : hybridCashierConfig != null && hybridCashierConfig.isHybridCashierEnable() && l();
    }

    private static boolean l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "963450a88af8dca34831c4da6c35ab16", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "963450a88af8dca34831c4da6c35ab16")).booleanValue() : com.meituan.android.neohybrid.init.a.c() != null;
    }

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "51354bf23a80d704081ad1e67d570b59", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "51354bf23a80d704081ad1e67d570b59") : com.meituan.android.paybase.config.a.d().q();
    }

    public static Context b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d68d5593f48e9b0f4b10395c8624de50", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d68d5593f48e9b0f4b10395c8624de50") : com.meituan.android.neohybrid.init.a.d();
    }

    public static String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a8a9d631276782a149076b8122e0e44", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a8a9d631276782a149076b8122e0e44") : com.meituan.android.neohybrid.init.a.c().c();
    }

    public static String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "186f0dd2bae6c9c04954e18d90a93361", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "186f0dd2bae6c9c04954e18d90a93361") : com.meituan.android.neohybrid.init.a.c().e();
    }

    public static String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b477294a94422fe1b348cced2da178bc", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b477294a94422fe1b348cced2da178bc") : com.meituan.android.neohybrid.init.a.g();
    }

    public static String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c1fa3ef04f06e5fedec2831f346143db", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c1fa3ef04f06e5fedec2831f346143db") : com.meituan.android.neohybrid.init.a.c().g();
    }

    public static String g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "58338d2f2abf62728a26ff2f7e9cb01d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "58338d2f2abf62728a26ff2f7e9cb01d") : com.meituan.android.neohybrid.init.a.c().h();
    }

    public static String h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6ae1c31b366e9af01391a091238aae3a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6ae1c31b366e9af01391a091238aae3a") : com.meituan.android.neohybrid.init.a.c().i();
    }

    public static String i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "71fc6ef10947922f06773bd5a49d7bac", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "71fc6ef10947922f06773bd5a49d7bac") : com.meituan.android.neohybrid.init.a.c().k();
    }

    public static String j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b2ea9d99072a729d3ef8599a73b14acd", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b2ea9d99072a729d3ef8599a73b14acd") : com.meituan.android.neohybrid.init.a.c().l();
    }

    public static String k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3d265adff73f942fe32e9de692cbaebf", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3d265adff73f942fe32e9de692cbaebf") : com.meituan.android.neohybrid.init.a.e();
    }
}
