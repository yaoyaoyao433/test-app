package com.meituan.msc.modules.update;

import android.support.annotation.Nullable;
import com.meituan.msc.modules.reporter.MSCReporter;
import com.meituan.msc.modules.update.PackageLoadReporter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.vivo.push.PushClientConstants;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class PackagePreLoadReporter extends MSCReporter {
    public static ChangeQuickRedirect d;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public @interface PackageLoadSourceFrom {
    }

    public PackagePreLoadReporter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6623e6f37a227729d2096a6499df8949", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6623e6f37a227729d2096a6499df8949");
        } else {
            a("sdkVersion", "1.18.23.2");
        }
    }

    public static PackagePreLoadReporter b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6dcd823e33c3d6c557b8d7f352a09e24", RobustBitConfig.DEFAULT_VALUE) ? (PackagePreLoadReporter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6dcd823e33c3d6c557b8d7f352a09e24") : new PackagePreLoadReporter();
    }

    public final void a(com.meituan.android.mercury.msc.adaptor.core.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6364191fcd15df66efbfd3421413ed6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6364191fcd15df66efbfd3421413ed6f");
        } else {
            a(0, eVar);
        }
    }

    public void a(int i, @Nullable com.meituan.android.mercury.msc.adaptor.core.e eVar) {
        Object[] objArr = {Integer.valueOf(i), eVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad69fe78219d70e69d337fef90e19883", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad69fe78219d70e69d337fef90e19883");
        } else {
            b("msc.metainfo.load.success.rate").a(i).a("loadType", "remote").a("sourceFrom", PackageLoadReporter.Source.PREFETCH).a("errorCode", Integer.valueOf(eVar != null ? eVar.a() : -1)).a("errorMsg", eVar != null ? eVar.getMessage() : "").b();
        }
    }

    public final void a(k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19dbb6afee3db35558e5a1e6512dfabd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19dbb6afee3db35558e5a1e6512dfabd");
        } else {
            a(kVar, 1, null);
        }
    }

    public final void a(k kVar, @Nullable Exception exc) {
        Object[] objArr = {kVar, exc};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ddd9da2d253514d6b1215e037fc0596", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ddd9da2d253514d6b1215e037fc0596");
        } else {
            a(kVar, 0, exc);
        }
    }

    private void a(k kVar, @MSCReporter.ReportValue int i, @Nullable Exception exc) {
        Object[] objArr = {kVar, Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33ff5d9fea4a4801b135fdf183ff0fdc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33ff5d9fea4a4801b135fdf183ff0fdc");
        } else {
            b("msc.package.load.success.rate").a(i).a("mscAppId", kVar.a).a("mscAppVersion", kVar.b).a("sourceFrom", kVar.c).a("loadType", kVar.d).a("pkgType", kVar.f).a(PushClientConstants.TAG_PKG_NAME, kVar.e).a("errorCode", Integer.valueOf(PackageLoadReporter.a(exc))).a("errorMsg", PackageLoadReporter.b(exc)).b();
        }
    }
}
