package com.sankuai.waimai.store.util.mach;

import android.support.annotation.NonNull;
import com.meituan.android.common.aidata.ai.bundle.cache.CacheException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.g;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements g {
    public static ChangeQuickRedirect a;
    private final String b;
    private final String c;
    private com.sankuai.waimai.platform.mach.monitor.a d;

    @Override // com.sankuai.waimai.mach.g
    public final void a() {
    }

    @Override // com.sankuai.waimai.mach.g
    public final void a(int i) {
    }

    @Override // com.sankuai.waimai.mach.g
    public final void a(com.sankuai.waimai.mach.node.a aVar) {
    }

    @Override // com.sankuai.waimai.mach.g
    public final void b() {
    }

    public b(@NonNull String str, @NonNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "305349ffce4f3dcd8f21e0fe21ca6250", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "305349ffce4f3dcd8f21e0fe21ca6250");
            return;
        }
        this.b = str;
        this.c = str2;
        this.d = new com.sankuai.waimai.platform.mach.monitor.a(str);
    }

    private SGCommonMachReportInfo c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfa29417e40d5cd47c53de6b7ce3deec", RobustBitConfig.DEFAULT_VALUE)) {
            return (SGCommonMachReportInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfa29417e40d5cd47c53de6b7ce3deec");
        }
        SGCommonMachReportInfo sGCommonMachReportInfo = new SGCommonMachReportInfo(this.c);
        sGCommonMachReportInfo.e = this.b;
        return sGCommonMachReportInfo;
    }

    @Override // com.sankuai.waimai.mach.g
    public final void a(int i, Throwable th) {
        Object[] objArr = {Integer.valueOf(i), th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d879990316714707cce63e22f911c802", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d879990316714707cce63e22f911c802");
            return;
        }
        this.d.a(i, "", this.b, "", th);
        SGCommonMachReportInfo c = c();
        c.c = String.valueOf(i);
        c.d = 0;
        c.i = th == null ? "" : th.toString();
        a.a(c);
    }

    @Override // com.sankuai.waimai.mach.g
    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85df53b375986578663dd0bd84d8eb3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85df53b375986578663dd0bd84d8eb3e");
            return;
        }
        this.d.a("", this.b, str, str2);
        SGCommonMachReportInfo c = c();
        c.d = 1;
        c.i = "表达式错误！";
        c.f = str;
        c.g = str2;
        a.a(c);
    }

    @Override // com.sankuai.waimai.mach.g
    public final void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2144ba286975ef5805fd0c4d1450ebe1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2144ba286975ef5805fd0c4d1450ebe1");
            return;
        }
        this.d.a("", this.b, th);
        SGCommonMachReportInfo c = c();
        c.d = 2;
        c.i = th == null ? "" : th.toString();
        a.a(c);
    }

    public final void a(int i, String str, String str2, String str3, Throwable th) {
        Object[] objArr = {Integer.valueOf((int) CacheException.LOAD_BUNDLE_SUCCESS_RENDER_FAILURE), str, str2, str3, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abe3e333e9a239caf9c6efa326ad0d04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abe3e333e9a239caf9c6efa326ad0d04");
            return;
        }
        this.d.a(CacheException.LOAD_BUNDLE_SUCCESS_RENDER_FAILURE, str, str2, str3, th);
        SGCommonMachReportInfo c = c();
        c.c = "17801";
        c.d = 3;
        c.h = str3;
        c.i = th.toString();
        a.a(c);
    }

    public final void a(String str, String str2, com.sankuai.waimai.mach.manager.cache.CacheException cacheException) {
        Object[] objArr = {str, str2, cacheException};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35b7d7ff1149cb4f1bb2169b9959be96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35b7d7ff1149cb4f1bb2169b9959be96");
            return;
        }
        this.d.a(str, str2, cacheException);
        SGCommonMachReportInfo c = c();
        c.d = 4;
        c.i = cacheException.a();
        a.a(c);
    }
}
