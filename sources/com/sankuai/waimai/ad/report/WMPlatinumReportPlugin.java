package com.sankuai.waimai.ad.report;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ad.b;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMPlatinumReportPlugin extends WMCommonReportPlugin {
    public static ChangeQuickRedirect c;
    private static final String d = b.c.a;

    @Override // com.sankuai.waimai.ad.report.WMCommonReportPlugin, com.sankuai.waimai.ad.report.PouchCommonReportPlugin, com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchReportPlugin
    public final com.sankuai.waimai.pouch.plugin.report.a a(com.sankuai.waimai.pouch.plugin.report.b bVar) throws Exception {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f18870238b0b8e4f7e6606c819e6e79", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.pouch.plugin.report.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f18870238b0b8e4f7e6606c819e6e79");
        }
        a(b(new com.sankuai.waimai.pouch.plugin.report.b(bVar)));
        return super.a(bVar);
    }

    @Override // com.sankuai.waimai.ad.report.WMCommonReportPlugin, com.sankuai.waimai.ad.report.PouchCommonReportPlugin
    public final int a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c680e8611d2e5d772e7360662fbc4753", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c680e8611d2e5d772e7360662fbc4753")).intValue();
        }
        if (jSONObject == null) {
            return 0;
        }
        if (jSONObject.has("adType")) {
            return jSONObject.optInt("adType");
        }
        if (jSONObject.has("ad") && (optJSONObject = jSONObject.optJSONObject("ad")) != null && optJSONObject.has("adType")) {
            return optJSONObject.optInt("adType");
        }
        return 0;
    }

    @Override // com.sankuai.waimai.ad.report.WMCommonReportPlugin, com.sankuai.waimai.ad.report.PouchCommonReportPlugin
    public final String b(JSONObject jSONObject) {
        JSONObject optJSONObject;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6874d4fa87b3ec5af98da9468ce13537", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6874d4fa87b3ec5af98da9468ce13537");
        }
        if (jSONObject == null) {
            return null;
        }
        if (jSONObject.has("chargeInfo")) {
            return jSONObject.optString("chargeInfo");
        }
        if (jSONObject.has("ad") && (optJSONObject = jSONObject.optJSONObject("ad")) != null && optJSONObject.has("adChargeInfo")) {
            return optJSONObject.optString("adChargeInfo");
        }
        return null;
    }

    @Override // com.sankuai.waimai.ad.report.WMCommonReportPlugin
    public final void c(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ddccd4be781e08cc5cfb44da24b78b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ddccd4be781e08cc5cfb44da24b78b2");
            return;
        }
        if (jSONObject != null && jSONObject.has("adType")) {
            jSONObject.remove("adType");
        }
        if (jSONObject != null && jSONObject.has("chargeInfo")) {
            jSONObject.remove("chargeInfo");
        }
        if (jSONObject != null && jSONObject.has("adId") && !jSONObject.has("ad_id")) {
            jSONObject.put("ad_id", Long.valueOf(jSONObject.optLong("adId")));
            jSONObject.remove("adId");
        }
        if (jSONObject != null && jSONObject.has("poiId") && !jSONObject.has("poi_id")) {
            jSONObject.put("poi_id", jSONObject.optString("poiId"));
            jSONObject.remove("poiId");
        }
        if (jSONObject == null || !jSONObject.has(FoodDetailNetWorkPreLoader.URI_POI_STR)) {
            return;
        }
        jSONObject.put("poi_id", jSONObject.optString(FoodDetailNetWorkPreLoader.URI_POI_STR));
    }
}
