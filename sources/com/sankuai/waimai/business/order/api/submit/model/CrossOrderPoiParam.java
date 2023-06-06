package com.sankuai.waimai.business.order.api.submit.model;

import android.support.annotation.Keep;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class CrossOrderPoiParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("common_params")
    public JsonObject commonParams;
    @SerializedName("product_list")
    public ArrayList<CrossOrderFood> foodList;
    @SerializedName("wm_poi_id")
    public long poiId;
    @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
    public String poiIdStr = "";

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class Attr {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("id")
        public long id;
        @SerializedName("value")
        public String value;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class CrossOrderFood {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("activity_extra")
        public String activityExtra;
        @SerializedName("activity_tag")
        public String activityTag;
        @SerializedName("attrs")
        public List<Attr> attrs;
        @SerializedName("count")
        public int count;
        @SerializedName("sku_id")
        public long id;
        @SerializedName("spu_id")
        public long spuId;
    }
}
