package com.sankuai.waimai.bussiness.order.confirm.coupon.model;

import com.google.gson.annotations.SerializedName;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.CallbackInfo;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a implements Serializable {
    @SerializedName("intent_poi_id")
    public String a;
    @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
    public String b;
    @SerializedName("poicoupon_view_id")
    public String c;
    @SerializedName("goods_coupon_view_id")
    public String d;
    @SerializedName("sg_item_coupon_view_id")
    public String e;
    @SerializedName("ap_params")
    public List<Map<String, Object>> f;
    @SerializedName("selected_coupons")
    public List<f> g;
    @SerializedName("callback_info")
    public CallbackInfo h;
}
