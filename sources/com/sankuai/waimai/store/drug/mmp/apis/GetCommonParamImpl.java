package com.sankuai.waimai.store.drug.mmp.apis;

import com.meituan.android.common.statistics.Statistics;
import com.meituan.msi.api.extension.medicine.IRequestCommonParam;
import com.meituan.msi.api.extension.medicine.RequestCommonResponse;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.g;
import com.sankuai.waimai.platform.b;
import com.sankuai.waimai.platform.model.c;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class GetCommonParamImpl extends IRequestCommonParam {
    public static ChangeQuickRedirect b;

    @Override // com.meituan.msi.api.extension.medicine.IRequestCommonParam
    public final void a(MsiCustomContext msiCustomContext, i<RequestCommonResponse> iVar) {
        String H;
        Object[] objArr = {msiCustomContext, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d724448ba4bc06c3e2cc9cbd93e3f992", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d724448ba4bc06c3e2cc9cbd93e3f992");
            return;
        }
        RequestCommonResponse requestCommonResponse = new RequestCommonResponse();
        requestCommonResponse.app_model = String.valueOf(c.a().b());
        requestCommonResponse.wm_seq = String.valueOf(b.A().p());
        requestCommonResponse.req_time = String.valueOf(com.meituan.android.time.c.b());
        requestCommonResponse.push_token = b.A().D();
        WMLocation i = g.a().i();
        if (i != null) {
            double latitude = i.getLatitude();
            double longitude = i.getLongitude();
            requestCommonResponse.wm_actual_latitude = String.valueOf((long) (latitude * 1000000.0d));
            requestCommonResponse.wm_actual_longitude = String.valueOf((long) (longitude * 1000000.0d));
        } else {
            requestCommonResponse.wm_actual_latitude = "0";
            requestCommonResponse.wm_actual_longitude = "0";
        }
        WMLocation p = g.a().p();
        if (p != null) {
            try {
                requestCommonResponse.wm_custom_latitude = String.valueOf((long) (p.getLatitude() * 1000000.0d));
                requestCommonResponse.wm_custom_longitude = String.valueOf((long) (p.getLongitude() * 1000000.0d));
            } catch (NullPointerException unused) {
            }
        }
        requestCommonResponse.personalized = String.valueOf(b.A().I());
        requestCommonResponse.wm_did = b.A().b();
        requestCommonResponse.region_id = com.sankuai.waimai.router.set_id.b.a().b().get("region_id");
        requestCommonResponse.region_version = com.sankuai.waimai.router.set_id.b.a().b().get("region_version");
        requestCommonResponse.region_user_id = com.sankuai.waimai.router.set_id.b.a().b().get("region_user_id");
        requestCommonResponse.utm_medium = b.A().o();
        requestCommonResponse.utm_source = b.A().d();
        requestCommonResponse.utm_term = String.valueOf(b.A().j());
        requestCommonResponse.utm_content = b.A().b();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.drug.c.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "abb040f402ff16800820bea402b283db", RobustBitConfig.DEFAULT_VALUE)) {
            H = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "abb040f402ff16800820bea402b283db");
        } else {
            b.A();
            H = b.H();
        }
        requestCommonResponse.utm_campaign = H;
        requestCommonResponse.ci = String.valueOf(com.sankuai.waimai.foundation.location.g.a());
        requestCommonResponse.uuid = b.A().c();
        requestCommonResponse.request_id = Statistics.getRequestId("");
        requestCommonResponse.seq_id = a();
        iVar.a(requestCommonResponse);
    }

    private static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "73ef76edc459c1934f657ae9d30232dd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "73ef76edc459c1934f657ae9d30232dd");
        }
        try {
            return String.valueOf(Statistics.getChannel().getSeq());
        } catch (Exception unused) {
            return "";
        }
    }
}
