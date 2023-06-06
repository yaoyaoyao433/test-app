package com.meituan.msc.modules.update;

import android.support.annotation.Nullable;
import com.meituan.msc.modules.reporter.MSCReporter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.vivo.push.PushClientConstants;
import java.util.Arrays;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class PackageLoadReporter extends com.meituan.msc.modules.reporter.f {
    public static ChangeQuickRedirect d;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public @interface LoadType {
        public static final String INNER = "inner";
        public static final String LOCAL = "local";
        public static final String NETWORK = "network";
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public @interface Source {
        public static final String LAUNCH = "launch";
        public static final String PREFETCH = "prefetch";
    }

    private PackageLoadReporter(com.meituan.msc.modules.reporter.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0888a330d68f3ab722f6b9c4a9ab7022", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0888a330d68f3ab722f6b9c4a9ab7022");
        }
    }

    public static PackageLoadReporter a(com.meituan.msc.modules.engine.h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cefc21c8d30b7ad4663c1cdd1ad920c3", RobustBitConfig.DEFAULT_VALUE) ? (PackageLoadReporter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cefc21c8d30b7ad4663c1cdd1ad920c3") : new PackageLoadReporter(com.meituan.msc.modules.reporter.a.a(hVar));
    }

    public final void a(@MSCReporter.ReportValue int i, @LoadType String str, @Source String str2) {
        Object[] objArr = {1, str, str2};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "981cd634e710cb3d8d12515a12fcb76c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "981cd634e710cb3d8d12515a12fcb76c");
        } else {
            a(1, str, str2, (Exception) null);
        }
    }

    public final void a(@MSCReporter.ReportValue int i, @LoadType String str, @Source String str2, Exception exc) {
        Object[] objArr = {Integer.valueOf(i), str, str2, exc};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38bbbb7828375c866d90f07bf3a79161", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38bbbb7828375c866d90f07bf3a79161");
        } else {
            b("msc.metainfo.load.success.rate").a(i).a("loadType", str).a("sourceFrom", str2).a("errorCode", Integer.valueOf(a(exc))).a("errorMsg", b(exc)).b();
        }
    }

    public static int a(@Nullable Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fe20bafa4a1defecfa8c9320686008da", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fe20bafa4a1defecfa8c9320686008da")).intValue();
        }
        if (exc instanceof com.meituan.android.mercury.msc.adaptor.core.e) {
            return ((com.meituan.android.mercury.msc.adaptor.core.e) exc).a();
        }
        return -1;
    }

    public static String b(@Nullable Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a451e4b1f15fe7e2e44c2274c9de673b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a451e4b1f15fe7e2e44c2274c9de673b") : exc instanceof com.meituan.android.mercury.msc.adaptor.core.e ? exc.getMessage() : "empty error msg";
    }

    public final void a(k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ab5a911e44f7a2ad7d57267bf046871", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ab5a911e44f7a2ad7d57267bf046871");
        } else {
            a(kVar, 1, (Exception) null);
        }
    }

    public final void a(k kVar, @Nullable Exception exc) {
        Object[] objArr = {kVar, exc};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcebcf3707f738fcbca4c0a0a650d487", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcebcf3707f738fcbca4c0a0a650d487");
        } else {
            a(kVar, 0, exc);
        }
    }

    private void a(k kVar, @MSCReporter.ReportValue int i, @Nullable Exception exc) {
        Object[] objArr = {kVar, Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "131b3adafe63236a52984370222c12b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "131b3adafe63236a52984370222c12b1");
        } else {
            b("msc.package.load.success.rate").a(i).a("loadType", kVar.d).a("pkgType", kVar.f).a(PushClientConstants.TAG_PKG_NAME, kVar.e).a("sourceFrom", kVar.c).a("errorCode", Integer.valueOf(a(exc))).a("errorMsg", b(exc)).b();
        }
    }

    public final void a(@MSCReporter.ReportValue int i, String str, int i2, String str2) {
        Object[] objArr = {Integer.valueOf(i), str, Integer.valueOf(i2), str2};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e036cfeb0619f0ad456860c72d2c484", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e036cfeb0619f0ad456860c72d2c484");
        } else {
            a(i, str, new String[0], i2, str2);
        }
    }

    public final void a(@MSCReporter.ReportValue int i, String str, String[] strArr) {
        Object[] objArr = {1, str, strArr};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55bff4f68c038e8a1b472eb12bc51266", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55bff4f68c038e8a1b472eb12bc51266");
        } else {
            a(1, str, strArr, -1, "");
        }
    }

    public final void a(@MSCReporter.ReportValue int i, String str, String[] strArr, int i2, String str2) {
        Object[] objArr = {Integer.valueOf(i), str, strArr, Integer.valueOf(i2), str2};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ea7e3b2f68a3b3c4a6ab08b1f65bd28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ea7e3b2f68a3b3c4a6ab08b1f65bd28");
        } else {
            b("msc.package.inject.success.rate").a(i).a("injectType", str).a("fileUris", Arrays.asList(strArr)).a("errorCode", Integer.valueOf(i2)).a("errorMsg", str2).c();
        }
    }

    public final void f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e61ac68cebd274a80c67b00972febc68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e61ac68cebd274a80c67b00972febc68");
        } else {
            b("msc.js.resource.not.exist.count").a("fileUri", str).b();
        }
    }

    public final void a(String str, String str2, boolean z, boolean z2, boolean z3) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aba44cad49be11317b5bc9bee768e089", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aba44cad49be11317b5bc9bee768e089");
        } else {
            b("msc.js.resource.not.exist.count").a("fileUri", str).a("dioFilePath", str2).a("isDioFileExist", Boolean.valueOf(z)).a("isMd5Same", Boolean.valueOf(z2)).a("isJsResourceExist", Boolean.valueOf(z3)).b();
        }
    }

    public final void a(String str, boolean z, int i) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2735fb6f43142c4526700dc6c13cbfc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2735fb6f43142c4526700dc6c13cbfc4");
        } else {
            b("msc.base.package.version.error.count").a("minVersion", str).a("isTriggerUpgrade", Boolean.valueOf(z)).a(i).b();
        }
    }

    public JSONArray a(String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "573077dab99f9b7ee82c8e338aed897b", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "573077dab99f9b7ee82c8e338aed897b");
        }
        JSONArray jSONArray = new JSONArray();
        for (String str : strArr) {
            jSONArray.put(str);
        }
        return jSONArray;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends MSCReporter {
        public static ChangeQuickRedirect d;

        public static a b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = d;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ffd3cff2363c058e9724b8660eac9ba3", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ffd3cff2363c058e9724b8660eac9ba3") : new a();
        }

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4107288986cd1be68ee82265fe6dcaa", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4107288986cd1be68ee82265fe6dcaa");
            } else {
                a("sdkVersion", "1.18.23.2");
            }
        }
    }
}
