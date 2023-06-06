package com.meituan.msc.modules.reporter;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.api.report.MSCReportBizTagsManager;
import com.meituan.msc.modules.engine.r;
import com.meituan.msc.modules.engine.s;
import com.meituan.msc.modules.update.bean.AppMetaInfoWrapper;
import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.bean.TitansConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private final WeakReference<com.meituan.msc.modules.engine.h> b;
    private final WeakReference<com.meituan.msc.modules.page.render.d> c;
    private final String d;
    private final Boolean e;

    private static String b(String str) {
        return str != null ? str : "unknown";
    }

    public static a a(com.meituan.msc.modules.engine.h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e9d9ada910cae5d4637f66fabd81c795", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e9d9ada910cae5d4637f66fabd81c795") : a(hVar, (com.meituan.msc.modules.page.render.d) null, (Boolean) null);
    }

    public static a a(com.meituan.msc.modules.engine.h hVar, com.meituan.msc.modules.page.render.d dVar, Boolean bool) {
        Object[] objArr = {hVar, dVar, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "73ef2d27b24991deca59c49f79dd60d6", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "73ef2d27b24991deca59c49f79dd60d6") : new a(hVar, dVar, null, null);
    }

    public static a a(com.meituan.msc.modules.engine.h hVar, com.meituan.msc.modules.page.render.d dVar, String str, Boolean bool) {
        Object[] objArr = {hVar, dVar, str, bool};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9088d0491c07cd1e8413aa7b8838f637", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9088d0491c07cd1e8413aa7b8838f637") : new a(hVar, dVar, str, bool);
    }

    private a(com.meituan.msc.modules.engine.h hVar, com.meituan.msc.modules.page.render.d dVar, String str, Boolean bool) {
        Object[] objArr = {hVar, dVar, str, bool};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c2a639afa67df25fe60c5d0ae53aa14", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c2a639afa67df25fe60c5d0ae53aa14");
            return;
        }
        this.b = new WeakReference<>(hVar);
        this.c = new WeakReference<>(dVar);
        this.d = str;
        this.e = bool;
    }

    public final Map<String, Object> a() {
        AppMetaInfoWrapper appMetaInfoWrapper;
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f70293166475b14b5eaa19b16b248000", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f70293166475b14b5eaa19b16b248000");
        }
        com.meituan.msc.modules.engine.h hVar = this.b.get();
        com.meituan.msc.modules.page.render.d dVar = this.c.get();
        HashMap hashMap = new HashMap();
        hashMap.put("sdkVersion", "1.18.23.2");
        if (hVar != null) {
            com.meituan.msc.modules.update.f fVar = hVar.r;
            appMetaInfoWrapper = fVar != null ? fVar.h : null;
            hashMap.put("runtime", hVar.b);
        } else {
            appMetaInfoWrapper = null;
        }
        String b = b(this.d != null ? this.d : dVar != null ? dVar.k.a : null);
        String a2 = a(hVar, appMetaInfoWrapper);
        String version = appMetaInfoWrapper != null ? appMetaInfoWrapper.getVersion() : "unknown";
        String d = d(hVar);
        String publishId = appMetaInfoWrapper != null ? appMetaInfoWrapper.getPublishId() : "unknown";
        String buildId = appMetaInfoWrapper != null ? appMetaInfoWrapper.getBuildId() : "unknown";
        String a3 = b != null ? a(b) : "unknown";
        String a4 = hVar != null ? r.a(hVar.i) : "unknown";
        String a5 = hVar != null ? s.a(hVar.H) : "unknown";
        String a6 = hVar != null ? r.a(hVar.F) : "unknown";
        String a7 = a(b, hVar, appMetaInfoWrapper);
        if (appMetaInfoWrapper != null) {
            str = appMetaInfoWrapper.isFromCache() ? "cache" : "network";
        } else {
            str = "unknown";
        }
        String a8 = a(dVar);
        hashMap.put("mscAppId", a2);
        hashMap.put("mscAppVersion", version);
        hashMap.put("basePkgVersion", d);
        hashMap.put("publishId", publishId);
        hashMap.put("buildId", buildId);
        if (b == null) {
            b = "unknown";
        }
        hashMap.put("pagePath", b);
        hashMap.put("purePath", a3);
        hashMap.put("runtimeSource", a4);
        hashMap.put("runtimeStateBeforeLaunch", a5);
        if (!TextUtils.equals(a6, "unknown")) {
            hashMap.put("originRuntimeSource", a6);
        }
        hashMap.put("pkgMode", a7);
        hashMap.put("checkUpdateMode", str);
        hashMap.put("isFirstPage", this.e != null ? String.valueOf(this.e) : "unknown");
        hashMap.put("renderType", a8);
        hashMap.put("env", MSCEnvHelper.getEnvInfo().isProdEnv() ? "prod" : "test");
        if (com.meituan.msc.modules.update.f.b != null) {
            hashMap.put("chrome", com.meituan.msc.modules.update.f.b);
        }
        String b2 = b();
        String e = e(hVar);
        String c = c(hVar);
        hashMap.put("webViewType", b2);
        hashMap.put("appState", e);
        hashMap.put("basePackageStrategy", c);
        MSCReportBizTagsManager.BizTagsData a9 = MSCReportBizTagsManager.a().a(a2, null);
        if (a9 != null) {
            hashMap.put("bizTagsForAppId", a9.getBizTagsForAppId());
        }
        return hashMap;
    }

    private String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9277d5feeb51329d306c43340b377db", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9277d5feeb51329d306c43340b377db");
        }
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(63);
        return indexOf < 0 ? str : str.substring(0, indexOf);
    }

    private String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecdfb84a7f6fdf4126ccf3a1358299e2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecdfb84a7f6fdf4126ccf3a1358299e2");
        }
        if (com.meituan.msc.modules.update.f.c == null) {
            return "";
        }
        switch (com.meituan.msc.modules.update.f.c) {
            case CHROME:
                return "chrome";
            case X5:
                return TitansConstants.WebKernel.KERNEL_X5;
            case MT_WEB_VIEW:
                return "mtwebview";
            default:
                return "";
        }
    }

    private static String a(com.meituan.msc.modules.page.render.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c298fdd5c3e294209568100a34a4c47a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c298fdd5c3e294209568100a34a4c47a");
        }
        if (dVar == null || dVar.n() == null) {
            return "unknown";
        }
        switch (dVar.n()) {
            case RN:
                return "rn-native";
            case WEBVIEW:
                return "mp-webview";
            case NATIVE:
                return "mp-native";
            default:
                return "unknown";
        }
    }

    private static String a(com.meituan.msc.modules.engine.h hVar, AppMetaInfoWrapper appMetaInfoWrapper) {
        Object[] objArr = {hVar, appMetaInfoWrapper};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "472bc907664eb5e464baa08440473ce7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "472bc907664eb5e464baa08440473ce7");
        }
        if (hVar == null) {
            return "unknown";
        }
        if (appMetaInfoWrapper == null) {
            return PackageInfoWrapper.PACKAGE_TYPE_STR_BASE;
        }
        String appId = appMetaInfoWrapper.getAppId();
        return TextUtils.isEmpty(appId) ? hVar.a() : appId;
    }

    private static String a(String str, com.meituan.msc.modules.engine.h hVar, AppMetaInfoWrapper appMetaInfoWrapper) {
        boolean z = false;
        Object[] objArr = {str, hVar, appMetaInfoWrapper};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cf116a5ef5eec564ca98d21895308fc5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cf116a5ef5eec564ca98d21895308fc5");
        }
        if (str == null || appMetaInfoWrapper == null) {
            return "unknown";
        }
        if (a(appMetaInfoWrapper.getOrCreateSubPackageWrapperByPath(str)) && a(appMetaInfoWrapper.mainPackageCached) && a(b(hVar))) {
            z = true;
        }
        return z ? "cache" : "network";
    }

    private static boolean a(PackageInfoWrapper packageInfoWrapper) {
        Object[] objArr = {packageInfoWrapper};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1d9bc9624cdbd4598bf62122ad6e12ad", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1d9bc9624cdbd4598bf62122ad6e12ad")).booleanValue() : packageInfoWrapper == null || !packageInfoWrapper.isFromNet();
    }

    private String c(@Nullable com.meituan.msc.modules.engine.h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "caf8d6589f1f79939aee73088b7d408e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "caf8d6589f1f79939aee73088b7d408e") : hVar == null ? "" : hVar.r.D();
    }

    private String d(com.meituan.msc.modules.engine.h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "497ab782382485ef198b80339613b59a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "497ab782382485ef198b80339613b59a") : (hVar == null || hVar.r == null) ? "unknown" : hVar.r.n();
    }

    private static String e(com.meituan.msc.modules.engine.h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9500df95db9142d05870a90070489987", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9500df95db9142d05870a90070489987");
        }
        if (hVar == null) {
            return "unknown";
        }
        com.meituan.msc.modules.engine.e eVar = hVar.d;
        return (eVar != null && eVar.a()) ? "foreground" : "background";
    }

    public static PackageInfoWrapper b(com.meituan.msc.modules.engine.h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "40aac91cee62d76a298c735b6f8857a1", RobustBitConfig.DEFAULT_VALUE)) {
            return (PackageInfoWrapper) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "40aac91cee62d76a298c735b6f8857a1");
        }
        if (hVar.r == null) {
            return null;
        }
        return hVar.r.i;
    }
}
