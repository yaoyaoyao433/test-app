package com.sankuai.waimai.store.msi.apis;

import com.meituan.android.common.statistics.Statistics;
import com.meituan.msi.api.extension.sgc.operator.IRequestInfo;
import com.meituan.msi.api.extension.sgc.operator.RequestInfoResponse;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.g;
import com.sankuai.waimai.platform.b;
import com.sankuai.waimai.platform.model.c;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGIRequestInfo extends IRequestInfo {
    public static ChangeQuickRedirect b;

    @Override // com.meituan.msi.api.extension.sgc.operator.IRequestInfo
    public final void a(MsiCustomContext msiCustomContext, i<RequestInfoResponse> iVar) {
        Object[] objArr = {msiCustomContext, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71f1eae5e023a29c9eaf18a2869b424c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71f1eae5e023a29c9eaf18a2869b424c");
            return;
        }
        try {
            RequestInfoResponse requestInfoResponse = new RequestInfoResponse();
            requestInfoResponse.result = a();
            iVar.a(requestInfoResponse);
        } catch (Throwable th) {
            iVar.a(1000, th.getMessage());
        }
    }

    public static Map a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1430f72c8fc2997c2943f86f1c288e64", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1430f72c8fc2997c2943f86f1c288e64");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("app_model", String.valueOf(c.a().b()));
        hashMap.put("wm_seq", String.valueOf(b.A().p()));
        hashMap.put("req_time", String.valueOf(com.meituan.android.time.c.b()));
        hashMap.put("push_token", b.A().D());
        WMLocation i = g.a().i();
        if (i != null) {
            double latitude = i.getLatitude();
            double longitude = i.getLongitude();
            hashMap.put("wm_actual_latitude", String.valueOf((long) (latitude * 1000000.0d)));
            hashMap.put("wm_actual_longitude", String.valueOf((long) (longitude * 1000000.0d)));
        } else {
            hashMap.put("wm_actual_latitude", "0");
            hashMap.put("wm_actual_longitude", "0");
        }
        WMLocation p = g.a().p();
        if (p != null) {
            try {
                hashMap.put("wm_latitude", String.valueOf((long) (p.getLatitude() * 1000000.0d)));
                hashMap.put("wm_longitude", String.valueOf((long) (p.getLongitude() * 1000000.0d)));
            } catch (NullPointerException unused) {
            }
        }
        hashMap.put("personalized", String.valueOf(b.A().I()));
        hashMap.put("wm_did", b.A().b());
        if (com.sankuai.waimai.router.set_id.b.a().b().get("region_id") != null) {
            hashMap.put("region_id", com.sankuai.waimai.router.set_id.b.a().b().get("region_id"));
        }
        if (com.sankuai.waimai.router.set_id.b.a().b().get("region_version") != null) {
            hashMap.put("region_version", com.sankuai.waimai.router.set_id.b.a().b().get("region_version"));
        }
        if (com.sankuai.waimai.router.set_id.b.a().b().get("region_user_id") != null) {
            hashMap.put("region_user_id", com.sankuai.waimai.router.set_id.b.a().b().get("region_user_id"));
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.c.a;
        hashMap.putAll(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "910c888d587066d6731e5b43d2693f01", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "910c888d587066d6731e5b43d2693f01") : com.sankuai.waimai.platform.net.c.a().g());
        hashMap.put("uuid", b.A().c());
        hashMap.put("request_id", Statistics.getRequestId(""));
        hashMap.put("seq_id", b());
        try {
            hashMap.put("wm_dversion", b.A().h());
        } catch (Throwable th) {
            com.sankuai.waimai.store.base.log.a.a(th);
        }
        return hashMap;
    }

    private static String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "05cb5c809bb1b3519f0a62266f5aae8f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "05cb5c809bb1b3519f0a62266f5aae8f");
        }
        try {
            return String.valueOf(Statistics.getChannel().getSeq());
        } catch (Exception unused) {
            return "";
        }
    }
}
