package com.sankuai.waimai.bussiness.order.confirm.service;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.bussiness.order.confirm.collect.model.CollectOrderFoodResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface AddCollectOrderFoodService {
    @POST("v6/order/add_collect_order_food")
    @FormUrlEncoded
    d<BaseResponse<CollectOrderFoodResponse>> getOrderFoodList(@Field("coupon_price") double d, @Field("can_use_coupon_price") double d2, @Field("coupon_discount_price") double d3, @Field("wm_poi_id") long j, @Field("poi_id_str") String str, @Field("collect_order_type") int i, @Field("spread_money") double d4, @Field("poi_first_cate_id") long j2, @Field("act_uuid") String str2);
}
