package com.sankuai.waimai.bussiness.order.confirm.service;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.bussiness.order.confirm.preview.model.DeliveryListResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface GetPreDeliveryTimeService {
    @POST("v7/order/getdeliverytime")
    @FormUrlEncoded
    d<BaseResponse<DeliveryListResponse>> deliveryTimePre(@Field("wm_poi_id") String str, @Field("poi_id_str") String str2, @Field("order_token") String str3, @Field("addr_longitude") String str4, @Field("addr_latitude") String str5, @Field("business_type") String str6, @Field("wm_order_pay_type") String str7, @Field("preview_order_callback_info") String str8, @Field("wm_order_tag_type") String str9, @Field("foodlist") String str10, @Field("cycle_purchase_info") String str11);
}
