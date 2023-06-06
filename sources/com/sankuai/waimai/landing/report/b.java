package com.sankuai.waimai.landing.report;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.util.Collections;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements a {
    public static ChangeQuickRedirect a;
    private static final String b;
    private static final String c;
    private static final String d;
    private static final String e;
    private static final String f;
    private static final String g;
    private static final String h;
    private static final String i;
    private static final String j;

    static {
        if (com.sankuai.waimai.foundation.core.a.b()) {
            b = "LandingRateKey_TEST";
            c = "LandingRateAdClick_TEST";
            d = "LandingRateRouteStart_TEST";
            e = "LandingRateRouteSuccess_TEST";
            f = "LandingRatePageCreated_TEST";
            g = "LandingRatePageDataSuccess_TEST";
            h = "LandingRatePageShown_TEST";
            i = "LandingRateFailed_TEST";
            j = "LandingRateError_TEST";
            return;
        }
        b = "LandingRateKey";
        c = "LandingRateAdClick";
        d = "LandingRateRouteStart";
        e = "LandingRateRouteSuccess";
        f = "LandingRatePageCreated";
        g = "LandingRatePageDataSuccess";
        h = "LandingRatePageShown";
        i = "LandingRateFailed";
        j = "LandingRateError";
    }

    @Override // com.sankuai.waimai.landing.report.a
    public final void a(com.sankuai.waimai.landing.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98745a844833cd902a3aad838306f996", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98745a844833cd902a3aad838306f996");
        } else if (aVar == null || !aVar.c()) {
        } else {
            com.sankuai.waimai.report.c.a().a(b, Collections.singletonList(Float.valueOf(1.0f))).a("slot_channel", String.format("%s_%s", aVar.b, aVar.c)).a();
            com.sankuai.waimai.report.c.a().a(a(d, aVar), Collections.singletonList(Float.valueOf(1.0f))).a("page_type", aVar.a().name()).a("reject", aVar.i ? "1" : "0").a("page_title", aVar.b()).a();
        }
    }

    @Override // com.sankuai.waimai.landing.report.a
    public final void a(com.sankuai.waimai.landing.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "425e7ff674d2084abf35236ba2c4da72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "425e7ff674d2084abf35236ba2c4da72");
        } else if (aVar == null || !aVar.c()) {
        } else {
            if (!z) {
                com.sankuai.waimai.report.c.a().a(a(i, aVar), Collections.singletonList(Float.valueOf(1.0f))).a("page_type", aVar.a().name()).a("page_title", aVar.b()).a(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, String.valueOf(aVar.f)).a("type", "ROUTE_FAILED").a();
            } else {
                com.sankuai.waimai.report.c.a().a(a(e, aVar), Collections.singletonList(Float.valueOf(1.0f))).a("page_type", aVar.a().name()).a("page_title", aVar.b()).a();
            }
        }
    }

    @Override // com.sankuai.waimai.landing.report.a
    public final void b(com.sankuai.waimai.landing.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8864cbbf198dccd07761cd626684b09e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8864cbbf198dccd07761cd626684b09e");
        } else if (aVar == null || !aVar.c()) {
        } else {
            com.sankuai.waimai.report.c.a().a(a(f, aVar), Collections.singletonList(Float.valueOf(1.0f))).a("page_type", aVar.a().name()).a();
        }
    }

    @Override // com.sankuai.waimai.landing.report.a
    public final void b(com.sankuai.waimai.landing.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f2fe9eaffb0ca62ddd1a72fdbc199ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f2fe9eaffb0ca62ddd1a72fdbc199ee");
        } else if (aVar == null || !aVar.c()) {
        } else {
            if (z) {
                com.sankuai.waimai.report.c.a().a(a(g, aVar), Collections.singletonList(Float.valueOf(1.0f))).a("api_name", aVar.d).a("page_type", aVar.a().name()).a();
            } else {
                com.sankuai.waimai.report.c.a().a(a(i, aVar), Collections.singletonList(Float.valueOf(1.0f))).a("api_name", aVar.d).a("page_type", aVar.a().name()).a(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, String.valueOf(aVar.f)).a("type", "DATA_FAILED").a();
            }
        }
    }

    @Override // com.sankuai.waimai.landing.report.a
    public final void c(com.sankuai.waimai.landing.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b0c20261c06fd2b398d2495f3756fdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b0c20261c06fd2b398d2495f3756fdf");
        } else if (aVar == null || !aVar.c()) {
        } else {
            com.sankuai.waimai.report.c.a().a(a(h, aVar), Collections.singletonList(Float.valueOf(1.0f))).a("page_type", aVar.a().name()).a();
        }
    }

    private String a(String str, com.sankuai.waimai.landing.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "964c1e0f0208eaf1ba3cedde887750a6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "964c1e0f0208eaf1ba3cedde887750a6") : aVar == null ? str : String.format("%s_%s_%s", str, aVar.b, aVar.c);
    }

    public static void a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fee3e8025f12d3e07f10ba5a397970b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fee3e8025f12d3e07f10ba5a397970b3");
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
        } else {
            com.sankuai.waimai.report.c.a().a(j, Collections.singletonList(Float.valueOf(1.0f))).a("slot_channel", String.format("%s_%s", str, str2)).a("type", str3).a();
        }
    }
}
