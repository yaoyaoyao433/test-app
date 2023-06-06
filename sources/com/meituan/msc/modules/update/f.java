package com.meituan.msc.modules.update;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.dio.easy.DioFile;
import com.meituan.mmp.lib.update.MMPAppProp;
import com.meituan.msc.modules.engine.FetchMetaInfoScene;
import com.meituan.msc.modules.engine.MSCHornRollbackConfig;
import com.meituan.msc.modules.engine.RuntimeCreateScene;
import com.meituan.msc.modules.manager.ModuleName;
import com.meituan.msc.modules.manager.p;
import com.meituan.msc.modules.page.render.webview.o;
import com.meituan.msc.modules.update.a;
import com.meituan.msc.modules.update.bean.AppMetaInfoWrapper;
import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@ModuleName(name = "MSCAppModule")
/* loaded from: classes3.dex */
public final class f extends com.meituan.msc.modules.manager.k {
    public static ChangeQuickRedirect a = null;
    public static String b = null;
    public static o.b c = null;
    public static final int d = 7;
    public static String e;
    public String f;
    public String g;
    @Nullable
    public volatile AppMetaInfoWrapper h;
    public volatile PackageInfoWrapper i;
    @RuntimeCreateScene
    public int j;
    @FetchMetaInfoScene
    public int k;
    public String l;
    private final String m;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3579fa8e7b1553b92db41a589d4918df", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3579fa8e7b1553b92db41a589d4918df");
            return;
        }
        this.m = "MSCAppModule@" + Integer.toHexString(hashCode());
        this.f = "release";
        this.j = -1;
        this.k = -1;
    }

    public final int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da33275fb845ccb301374044c63d1c76", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da33275fb845ccb301374044c63d1c76")).intValue() : U_().s.l(str);
    }

    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67acacc5ec9c1b5a7404a245bd9d6210", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67acacc5ec9c1b5a7404a245bd9d6210")).intValue() : U_().s.e();
    }

    public final String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbb5dcc2e8d93e3ea1ed45e915758d32", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbb5dcc2e8d93e3ea1ed45e915758d32") : U_().s.a(str);
    }

    public final String c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed73495b1193d7a1fb2169b414e7415e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed73495b1193d7a1fb2169b414e7415e") : U_().s.b(str);
    }

    public final String d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f038dd9bcaf8a626e8bbaa2295b174e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f038dd9bcaf8a626e8bbaa2295b174e") : U_().s.j(str);
    }

    public final boolean i(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe0952771e41290d79a6947a5f951460", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe0952771e41290d79a6947a5f951460")).booleanValue() : U_().s.k(str);
    }

    public void a(AppMetaInfoWrapper appMetaInfoWrapper) {
        Object[] objArr = {appMetaInfoWrapper};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8eff084f9ab51af7ad5bb9dfb26b0350", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8eff084f9ab51af7ad5bb9dfb26b0350");
        } else if (appMetaInfoWrapper == null) {
            throw new com.meituan.msc.modules.apploader.events.a(2005, "metaInfo is null");
        }
    }

    public final String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e465b283174bdd21ed6d12755586fb53", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e465b283174bdd21ed6d12755586fb53");
        }
        AppMetaInfoWrapper appMetaInfoWrapper = this.h;
        a(appMetaInfoWrapper);
        return appMetaInfoWrapper.getMainPackagePath();
    }

    public final a.EnumC0474a j(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c93f22e39dcdb62ee3716e77d1e2384f", RobustBitConfig.DEFAULT_VALUE) ? (a.EnumC0474a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c93f22e39dcdb62ee3716e77d1e2384f") : U_().s.c(str);
    }

    public final boolean k(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2eec6e807e5c915c9ed0199731ba630f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2eec6e807e5c915c9ed0199731ba630f")).booleanValue() : U_().s.d(str);
    }

    public final boolean l(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88e899e660ef871d5006bd382b02089b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88e899e660ef871d5006bd382b02089b")).booleanValue() : U_().s.i(str);
    }

    public final String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bcc3e534c5f0aba0ee01e37ab7bc406", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bcc3e534c5f0aba0ee01e37ab7bc406") : U_().s.g();
    }

    public final boolean m(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8214d3ef2efde67abc14384c0fc17419", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8214d3ef2efde67abc14384c0fc17419")).booleanValue() : U_().s.m(str);
    }

    public final boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "884ca4beb08330a616fe80b0d6ec6b40", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "884ca4beb08330a616fe80b0d6ec6b40")).booleanValue() : U_().s.h();
    }

    public final List<com.meituan.msc.modules.page.view.tab.b> h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5629a3ed368c212d5ab96cb47de40fd2", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5629a3ed368c212d5ab96cb47de40fd2") : U_().s.i();
    }

    public final boolean n(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb63ddf9aa7d43aece5abb648cca612c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb63ddf9aa7d43aece5abb648cca612c")).booleanValue() : U_().s.n(str);
    }

    public final com.meituan.msc.b o(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad4a33e2d56985fc7e461402e3dc4538", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msc.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad4a33e2d56985fc7e461402e3dc4538") : U_().s.o(str);
    }

    @Nullable
    public final List<String> p(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6beff36fe56fdd646c40ff9f73b4b9f5", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6beff36fe56fdd646c40ff9f73b4b9f5") : U_().s.p(str);
    }

    public final boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "915ba32b5ceab648b25769ec25a46035", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "915ba32b5ceab648b25769ec25a46035")).booleanValue();
        }
        AppMetaInfoWrapper appMetaInfoWrapper = this.h;
        return appMetaInfoWrapper != null && appMetaInfoWrapper.isInner();
    }

    public final String j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c8bc5933c8a3c3b04411b91330ecf40", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c8bc5933c8a3c3b04411b91330ecf40");
        }
        AppMetaInfoWrapper appMetaInfoWrapper = this.h;
        return appMetaInfoWrapper != null ? appMetaInfoWrapper.getAppId() : this.g;
    }

    public final String k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d62eace97af29f148248645f3abcaa68", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d62eace97af29f148248645f3abcaa68");
        }
        AppMetaInfoWrapper appMetaInfoWrapper = this.h;
        return appMetaInfoWrapper != null ? appMetaInfoWrapper.getAppName() : "";
    }

    public final void b(AppMetaInfoWrapper appMetaInfoWrapper) {
        Object[] objArr = {appMetaInfoWrapper};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50bbb10ac2cee1079478151326e15b8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50bbb10ac2cee1079478151326e15b8f");
            return;
        }
        this.h = appMetaInfoWrapper;
        U_().d().d(MSCHornRollbackConfig.n() ? null : (String) r("mmpAppId"));
    }

    public final String l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e84d5f7c734e97e03aa967cd943899a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e84d5f7c734e97e03aa967cd943899a");
        }
        AppMetaInfoWrapper appMetaInfoWrapper = this.h;
        if (appMetaInfoWrapper != null) {
            return appMetaInfoWrapper.getIconPath();
        }
        return null;
    }

    public final boolean m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7aea794412f867a2ec2b5af7979f64e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7aea794412f867a2ec2b5af7979f64e")).booleanValue();
        }
        AppMetaInfoWrapper appMetaInfoWrapper = this.h;
        return appMetaInfoWrapper != null && appMetaInfoWrapper.shareSupported();
    }

    public final String n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88741cb52cc6c0ca1bc678a316ae060b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88741cb52cc6c0ca1bc678a316ae060b");
        }
        PackageInfoWrapper packageInfoWrapper = this.i;
        return packageInfoWrapper == null ? "" : packageInfoWrapper.getVersion();
    }

    public final boolean v() {
        return this.h != null;
    }

    public final String w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "844c12be34e35d1920a5d76a6e77424f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "844c12be34e35d1920a5d76a6e77424f");
        }
        AppMetaInfoWrapper appMetaInfoWrapper = this.h;
        if (appMetaInfoWrapper == null) {
            return "0";
        }
        if (TextUtils.isEmpty(appMetaInfoWrapper.getPublishId())) {
            return appMetaInfoWrapper.getVersion();
        }
        return appMetaInfoWrapper.getPublishId();
    }

    public final boolean x() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2558e51ea4c37b7c0d5efb17374d4f7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2558e51ea4c37b7c0d5efb17374d4f7")).booleanValue();
        }
        AppMetaInfoWrapper appMetaInfoWrapper = this.h;
        return appMetaInfoWrapper != null && appMetaInfoWrapper.isDebug();
    }

    public final String y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aece1e7756c130057f1241e64813b141", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aece1e7756c130057f1241e64813b141");
        }
        AppMetaInfoWrapper appMetaInfoWrapper = this.h;
        return appMetaInfoWrapper != null ? appMetaInfoWrapper.getVersion() : "";
    }

    public final PackageInfoWrapper q(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8920c916b1881be368f4bf33c6f9f1f8", RobustBitConfig.DEFAULT_VALUE)) {
            return (PackageInfoWrapper) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8920c916b1881be368f4bf33c6f9f1f8");
        }
        AppMetaInfoWrapper appMetaInfoWrapper = this.h;
        a(appMetaInfoWrapper);
        return appMetaInfoWrapper.getLoadedPackageInfoDefaultReturnMain(str);
    }

    public final PackageInfoWrapper z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f3d105b34200f59ef3f030490cf28ac", RobustBitConfig.DEFAULT_VALUE)) {
            return (PackageInfoWrapper) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f3d105b34200f59ef3f030490cf28ac");
        }
        AppMetaInfoWrapper appMetaInfoWrapper = this.h;
        a(appMetaInfoWrapper);
        return appMetaInfoWrapper.createMainPackageWrapper();
    }

    public final Object r(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1d7e292bedebff0ce18f7fc2162e5f9", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1d7e292bedebff0ce18f7fc2162e5f9");
        }
        AppMetaInfoWrapper appMetaInfoWrapper = this.h;
        a(appMetaInfoWrapper);
        return appMetaInfoWrapper.getExtraConfigValue(str);
    }

    public final List<DioFile> a(String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b79a293cdfd060d4995f6d8bdbe9d0ef", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b79a293cdfd060d4995f6d8bdbe9d0ef");
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                e s = s(str);
                if (s == null) {
                    com.meituan.msc.modules.reporter.g.a(this.m, "jsResourceData is null");
                } else {
                    DioFile dioFile = s.b;
                    if (dioFile == null || !dioFile.c()) {
                        U_().q.handleException(new p("importScripts not exist! " + str + CommonConstant.Symbol.COMMA + a(str, s)));
                        if (dioFile != null) {
                            com.meituan.msc.modules.reporter.g.a(this.m, "DioFile: " + dioFile.g());
                        }
                        b(str, s);
                    } else {
                        com.meituan.msc.modules.reporter.g.b("AppService", "importScripts: ", str, " -> ", dioFile);
                        arrayList.add(dioFile);
                    }
                }
            }
        }
        return arrayList;
    }

    public final String a(String str, e eVar) {
        boolean z;
        boolean z2 = false;
        Object[] objArr = {str, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53ac3f0c673e01da2dec4623acdc0f10", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53ac3f0c673e01da2dec4623acdc0f10");
        }
        if (eVar.a == null) {
            PackageLoadReporter.a(U_()).f(str);
            return "infoWrapper is null";
        }
        DioFile dioFile = new DioFile(eVar.a.getLocalPath());
        boolean c2 = dioFile.c();
        try {
            z = eVar.a.isLocalCacheValid();
        } catch (IOException e2) {
            e = e2;
            z = false;
        }
        try {
            if (dioFile.n().a(eVar.c) != null) {
                z2 = true;
            }
        } catch (IOException e3) {
            e = e3;
            com.meituan.msc.modules.reporter.g.b(this.m, e, "findDioEntryByPath or isLocalCacheValid Error");
            return "isDioFileExist:" + c2 + ",isMd5Same:" + z + ",isJsResourceExist:" + z2;
        }
        return "isDioFileExist:" + c2 + ",isMd5Same:" + z + ",isJsResourceExist:" + z2;
    }

    public final void b(String str, e eVar) {
        boolean z;
        boolean z2;
        boolean z3;
        Object[] objArr = {str, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6758f7d6ba500d42dc3349161fb54c40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6758f7d6ba500d42dc3349161fb54c40");
        } else if (eVar.a == null) {
            com.meituan.msc.modules.reporter.g.a(this.m, "getDioFiles infoWrapper is null");
            PackageLoadReporter.a(U_()).f(str);
        } else {
            DioFile dioFile = new DioFile(eVar.a.getLocalPath());
            boolean c2 = dioFile.c();
            try {
                z = eVar.a.isLocalCacheValid();
            } catch (IOException e2) {
                e = e2;
                z = false;
            }
            try {
                z2 = z;
                z3 = dioFile.n().a(eVar.c) != null;
            } catch (IOException e3) {
                e = e3;
                com.meituan.msc.modules.reporter.g.b(this.m, e, "findDioEntryByPath");
                z2 = z;
                z3 = false;
                PackageLoadReporter.a(U_()).a(str, dioFile.h(), c2, z2, z3);
            }
            PackageLoadReporter.a(U_()).a(str, dioFile.h(), c2, z2, z3);
        }
    }

    @Nullable
    public final e s(String str) {
        int indexOf;
        PackageInfoWrapper t;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfb64b91432f33daeb08c8db84c6e0e1", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfb64b91432f33daeb08c8db84c6e0e1");
        }
        if (str.startsWith("file:///data/")) {
            if (com.meituan.msc.common.utils.p.a(str, U_().d().d())) {
                return new e(new DioFile(str));
            }
            return null;
        } else if (str.startsWith(MMPAppProp.PREFIX_FRAMEWORK)) {
            PackageInfoWrapper packageInfoWrapper = this.i;
            if (packageInfoWrapper == null) {
                return null;
            }
            return new e(packageInfoWrapper, new DioFile(packageInfoWrapper.getLocalPath(), str.replace(MMPAppProp.PREFIX_FRAMEWORK, "")), str.replace(MMPAppProp.PREFIX_FRAMEWORK, ""));
        } else if (str.startsWith("/__app/main_app/")) {
            AppMetaInfoWrapper appMetaInfoWrapper = this.h;
            a(appMetaInfoWrapper);
            return new e(appMetaInfoWrapper.getMainPackageCached(), new DioFile(appMetaInfoWrapper.getMainPackageCached().getLocalPath(), str.replace("/__app/main_app/", "")), str.replace("/__app/main_app/", ""));
        } else {
            if (str.startsWith("/__app/")) {
                AppMetaInfoWrapper appMetaInfoWrapper2 = this.h;
                a(appMetaInfoWrapper2);
                if (!com.meituan.msc.common.utils.f.a((List) appMetaInfoWrapper2.getSubPackagesCached()) && (indexOf = str.indexOf(File.separatorChar, d)) > d && (t = t(str.substring(d, indexOf))) != null) {
                    int i = indexOf + 1;
                    if (i >= str.length()) {
                        return null;
                    }
                    return new e(t, new DioFile(t.getLocalPath(), str.substring(i)), str.substring(i));
                }
            }
            PackageInfoWrapper q = q(str);
            return new e(q, new DioFile(q.getLocalPath(), str), str);
        }
    }

    @Nullable
    public PackageInfoWrapper t(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8706d3e1be0f34ec7a4743dfafc82ab", RobustBitConfig.DEFAULT_VALUE)) {
            return (PackageInfoWrapper) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8706d3e1be0f34ec7a4743dfafc82ab");
        }
        AppMetaInfoWrapper appMetaInfoWrapper = this.h;
        a(appMetaInfoWrapper);
        return appMetaInfoWrapper.getSubPackageByName(str);
    }

    public final String A() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf993efd11483218349bfb7750686111", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf993efd11483218349bfb7750686111");
        }
        return "mmp_" + j();
    }

    public final String B() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8fb78b19706dcfe7c2808b8d96e9e8c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8fb78b19706dcfe7c2808b8d96e9e8c");
        }
        PackageInfoWrapper packageInfoWrapper = this.i;
        return packageInfoWrapper == null ? "" : packageInfoWrapper.getDDResourceName();
    }

    public final String D() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cd1f7a04249c10ad31e5bddb79f38ed", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cd1f7a04249c10ad31e5bddb79f38ed");
        }
        PackageInfoWrapper packageInfoWrapper = this.i;
        return packageInfoWrapper == null ? "" : packageInfoWrapper.getFetchStrategy();
    }

    public final PackageInfoWrapper E() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04dc85b5903bf3721648f7b272f10434", RobustBitConfig.DEFAULT_VALUE)) {
            return (PackageInfoWrapper) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04dc85b5903bf3721648f7b272f10434");
        }
        AppMetaInfoWrapper appMetaInfoWrapper = this.h;
        a(appMetaInfoWrapper);
        return appMetaInfoWrapper.getMainPackageCached();
    }

    public final PackageInfoWrapper u(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d36c91d6e1ed0ed3590622164c1577c4", RobustBitConfig.DEFAULT_VALUE)) {
            return (PackageInfoWrapper) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d36c91d6e1ed0ed3590622164c1577c4");
        }
        AppMetaInfoWrapper appMetaInfoWrapper = this.h;
        a(appMetaInfoWrapper);
        return appMetaInfoWrapper.createSubPackageWrapper(str);
    }

    @NonNull
    public final PackageInfoWrapper F() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a89cf7f9d333a3b1daf6f29f9a14838", RobustBitConfig.DEFAULT_VALUE)) {
            return (PackageInfoWrapper) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a89cf7f9d333a3b1daf6f29f9a14838");
        }
        if (this.i == null) {
            this.i = new PackageInfoWrapper();
        }
        return this.i;
    }

    public final boolean v(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1fe76d17e3b33636f354faa94995491", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1fe76d17e3b33636f354faa94995491")).booleanValue();
        }
        AppMetaInfoWrapper appMetaInfoWrapper = this.h;
        a(appMetaInfoWrapper);
        return appMetaInfoWrapper.isPackageLoaded(str);
    }

    public final PackageInfoWrapper w(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74f8187534ffc83a5c59bf6df936c613", RobustBitConfig.DEFAULT_VALUE)) {
            return (PackageInfoWrapper) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74f8187534ffc83a5c59bf6df936c613");
        }
        AppMetaInfoWrapper appMetaInfoWrapper = this.h;
        a(appMetaInfoWrapper);
        return appMetaInfoWrapper.getLoadedPackageInfoWithoutDefault(str);
    }

    public final String C() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59c57686b32d18c42fcc6a1e370a5024", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59c57686b32d18c42fcc6a1e370a5024") : this.i == null ? "" : this.i.getLoadType();
    }
}
