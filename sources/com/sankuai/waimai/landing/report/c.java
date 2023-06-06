package com.sankuai.waimai.landing.report;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.sankuai.waimai.log.judas.JudasManualManager;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c implements a {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.landing.report.a
    public final void a(com.sankuai.waimai.landing.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9073fc38501448e1ac6b257415379dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9073fc38501448e1ac6b257415379dd");
        } else if (aVar == null) {
        } else {
            JudasManualManager.b("b_waimai_m_is0hs499_mv", "c_waimai_m_h86jy86k", "").a("slot", aVar.b).a("channel", aVar.c).a("page_type", aVar.a().name()).a("reject", aVar.i ? "1" : "0").a("page_title", aVar.b()).b("waimai_m");
        }
    }

    @Override // com.sankuai.waimai.landing.report.a
    public final void a(com.sankuai.waimai.landing.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e961e8677033370bf9c03f67283dfd69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e961e8677033370bf9c03f67283dfd69");
        } else if (aVar == null || z) {
        } else {
            JudasManualManager.b("b_waimai_m_khhsg52c_mv", "c_waimai_m_h86jy86k", "").a("slot", aVar.b).a("channel", aVar.c).a("elapsed_time", aVar.h).a("page_type", aVar.a().name()).a(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, aVar.f).a("type", "ROUTE_FAILED").a("page_title", aVar.b()).b("waimai_m");
        }
    }

    @Override // com.sankuai.waimai.landing.report.a
    public final void b(com.sankuai.waimai.landing.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6559a87d6c5c7df52d84533a05581628", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6559a87d6c5c7df52d84533a05581628");
        } else if (aVar == null) {
        } else {
            JudasManualManager.b("b_waimai_m_6oe6zhnj_mv", "c_waimai_m_h86jy86k", "").a("slot", aVar.b).a("channel", aVar.c).a("elapsed_time", aVar.h).a("page_type", aVar.a().name()).b("waimai_m");
        }
    }

    @Override // com.sankuai.waimai.landing.report.a
    public final void b(com.sankuai.waimai.landing.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "888ec11152c4a92d7b59977b3514935a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "888ec11152c4a92d7b59977b3514935a");
        } else if (aVar == null) {
        } else {
            if (z) {
                JudasManualManager.b("b_waimai_m_2o0p4jz6_mv", "c_waimai_m_h86jy86k", "").a("slot", aVar.b).a("channel", aVar.c).a("elapsed_time", aVar.h).a("api_name", aVar.d).a("page_type", aVar.a().name()).b("waimai_m");
            } else {
                JudasManualManager.b("b_waimai_m_khhsg52c_mv", "c_waimai_m_h86jy86k", "").a("slot", aVar.b).a("channel", aVar.c).a("elapsed_time", aVar.h).a("api_name", aVar.d).a("page_type", aVar.a().name()).a(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, aVar.f).a("type", "DATA_FAILED").b("waimai_m");
            }
        }
    }

    @Override // com.sankuai.waimai.landing.report.a
    public final void c(com.sankuai.waimai.landing.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb78125b06dbfe29c190e7cf68f9e793", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb78125b06dbfe29c190e7cf68f9e793");
        } else if (aVar == null) {
        } else {
            JudasManualManager.b("b_waimai_m_5ravysvc_mv", "c_waimai_m_h86jy86k", "").a("slot", aVar.b).a("channel", aVar.c).a("elapsed_time", aVar.h).a("page_type", aVar.a().name()).b("waimai_m");
        }
    }
}
