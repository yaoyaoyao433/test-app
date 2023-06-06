package com.sankuai.waimai.business.restaurant.base.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.again.AgainManager;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class PoiInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean isShip;
    public com.sankuai.waimai.platform.domain.core.poi.a mAppendPoiImInfo;
    public long poiId;
    public String poiIdStr;
    public String poiLabelUrl;
    public String poiLogo;
    public String poiName;
    public double poiScore;
    @SerializedName("poi_type")
    @Expose
    public int poiType;
    public String scheme;
    public String shipDistanceTips;
    public String shipTimeTips;
    @SerializedName("bottom_poi_im_info")
    public com.sankuai.waimai.platform.domain.core.poi.a shoppingCartPoiImInfo;

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "196ece9aff3680fd61b3913b35b3deda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "196ece9aff3680fd61b3913b35b3deda");
        } else if (jSONObject != null) {
            this.poiId = jSONObject.optLong("poi_id");
            this.poiIdStr = jSONObject.optString(FoodDetailNetWorkPreLoader.URI_POI_STR);
            this.poiName = jSONObject.optString(AgainManager.EXTRA_POI_NAME);
            this.poiType = jSONObject.optInt("poi_type");
            this.poiLogo = jSONObject.optString("poi_logo");
            this.poiScore = jSONObject.optDouble("poi_score", -1.0d);
            this.poiLabelUrl = jSONObject.optString("poi_label_url");
            this.shipDistanceTips = jSONObject.optString("ship_distance_tips");
            this.shipTimeTips = jSONObject.optString("ship_time_tips");
            this.isShip = jSONObject.optBoolean("is_ship", false);
            this.scheme = jSONObject.optString(NetLogConstants.Details.SCHEME);
            this.mAppendPoiImInfo = com.sankuai.waimai.platform.domain.core.poi.a.a(jSONObject.optJSONObject("poi_im_info"));
            this.shoppingCartPoiImInfo = com.sankuai.waimai.platform.domain.core.poi.a.a(jSONObject.optJSONObject("bottom_poi_im_info"));
        }
    }
}
