package com.sankuai.waimai.business.restaurant.base.repository.model;

import android.support.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class PoiBannerAD implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("ad_type")
    public int adType;
    @SerializedName("charge_info")
    public String chargeInfo;
    @SerializedName("menu_entrance")
    public MerchantsInfoPoiCategory menuEntrance;

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f84a5c63a77d6644aeae4ee4da5d00dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f84a5c63a77d6644aeae4ee4da5d00dd");
        } else if (jSONObject != null) {
            this.adType = jSONObject.optInt("ad_type");
            this.chargeInfo = jSONObject.optString("charge_info");
            this.menuEntrance = (MerchantsInfoPoiCategory) new Gson().fromJson(jSONObject.optString("menu_entrance"), (Class<Object>) MerchantsInfoPoiCategory.class);
            if (this.menuEntrance == null || this.menuEntrance.items == null) {
                return;
            }
            for (PoiMerchantsInfoItem poiMerchantsInfoItem : this.menuEntrance.items) {
                if (poiMerchantsInfoItem != null) {
                    poiMerchantsInfoItem.landPageUrl = this.menuEntrance.landPageUrl;
                    poiMerchantsInfoItem.chargeInfo = this.chargeInfo;
                    poiMerchantsInfoItem.adType = this.adType;
                }
            }
        }
    }
}
