package com.sankuai.waimai.platform.domain.core.multiperson.inner;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PoiInfo implements Serializable {
    public static final int STATUS_NORMAL = 1;
    public static final int STATUS_REST = 3;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("min_price")
    private double minPrice;
    @SerializedName("wm_poi_id")
    private long poiId;
    @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
    private String poiIdStr;
    @SerializedName("name")
    private String poiName;
    @SerializedName("status")
    private int status;

    public static PoiInfo fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ab7c18ac112c7eb58e3ffec05215027b", RobustBitConfig.DEFAULT_VALUE)) {
            return (PoiInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ab7c18ac112c7eb58e3ffec05215027b");
        }
        if (jSONObject == null) {
            return null;
        }
        PoiInfo poiInfo = new PoiInfo();
        poiInfo.setStatus(jSONObject.optInt("status"));
        poiInfo.setPoiId(jSONObject.optLong("wm_poi_id"));
        poiInfo.setPoiIdStr(jSONObject.optString(FoodDetailNetWorkPreLoader.URI_POI_STR));
        poiInfo.setPoiName(jSONObject.optString("name"));
        poiInfo.setMinPrice(jSONObject.optDouble("min_price"));
        return poiInfo;
    }

    public int getStatus() {
        return this.status;
    }

    public long getPoiId() {
        return this.poiId;
    }

    public String getPoiIdStr() {
        return this.poiIdStr;
    }

    public String getPoiName() {
        return this.poiName;
    }

    public double getMinPrice() {
        return this.minPrice;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setPoiId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "857e356b9635f7136fcf5137835a5043", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "857e356b9635f7136fcf5137835a5043");
        } else {
            this.poiId = j;
        }
    }

    public void setPoiName(String str) {
        this.poiName = str;
    }

    public void setMinPrice(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "37d8f49a6eb9fd67bcbfa50af955dfa2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "37d8f49a6eb9fd67bcbfa50af955dfa2");
        } else {
            this.minPrice = d;
        }
    }

    public void setPoiIdStr(String str) {
        this.poiIdStr = str;
    }
}
