package com.sankuai.waimai.platform.domain.core.poi;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.again.AgainManager;
import com.sankuai.waimai.foundation.utils.h;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class TodayRecommendPoi implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("ad_icon")
    public String adIcon;
    @SerializedName("filter_name")
    public String filterMame;
    @SerializedName("foods_activity")
    public List<Object> foodActivity;
    public boolean isExposed;
    @SerializedName("not_food_activity")
    public List<Object> notFoodActivity;
    @SerializedName("origin_price")
    public double originPrice;
    @SerializedName("other_fees")
    public List<Object> otherFees;
    @SerializedName("poi_id")
    public long poiId;
    @SerializedName(AgainManager.EXTRA_POI_NAME)
    public String poiName;
    @SerializedName("poi_pic")
    public String poiPic;
    @SerializedName("poi_tags")
    public List<String> poiTags;
    @SerializedName("price")
    public double price;
    @SerializedName("recmd_id")
    public long recmdId;
    @SerializedName("recommend_info")
    public String recommendInfo;
    @SerializedName("ad_info")
    public a todayRecPoiAdInfo;
    @SerializedName("foods")
    public List<GoodsSpu> todayRecommendSpuList;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements Serializable {
        @SerializedName("charge_info")
        public String a;
        @SerializedName("ad_type")
        public int b;
    }

    public TodayRecommendPoi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "994b47f4366c7722067b73f6d768f40a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "994b47f4366c7722067b73f6d768f40a");
        } else {
            this.isExposed = false;
        }
    }

    public String getReducePrice() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44b7075cba97586a21c62346a21fb4c8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44b7075cba97586a21c62346a21fb4c8") : h.a(Double.valueOf(this.originPrice - this.price), 0, 2);
    }
}
