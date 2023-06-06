package com.sankuai.waimai.bussiness.order.confirm.request;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface OrderService {
    @POST("v7/order/preview")
    @FormUrlEncoded
    d<OrderResponse> orderPreview(@Field("data") String str);

    @POST("v8/order/preview")
    @FormUrlEncoded
    d<OrderResponse> orderPreviewRocks(@Field("data") String str);

    @POST("v6/order/tableware-setting")
    @FormUrlEncoded
    d<BaseResponse> orderSetTableware(@Field("poiId") long j, @Field("poi_id_str") String str, @Field("settingId") long j2, @Field("selectedOption") int i, @Field("previewOrderCallbackInfo") String str2);

    @POST("v6/order/tableware-setting")
    @FormUrlEncoded
    d<BaseResponse> orderSetTablewareForAddress(@Field("poiId") long j, @Field("poi_id_str") String str, @Field("settingId") long j2, @Field("selectedOption") int i, @Field("previewOrderCallbackInfo") String str2, @Field("is_self_pick_up") long j3, @Field("setting_for_address") int i2, @Field("address_id") long j4);

    @POST("v6/order/submit")
    @FormUrlEncoded
    d<OrderResponse> orderSubmit(@Field("data") String str);

    @POST("v7/order/update")
    @FormUrlEncoded
    d<OrderResponse> orderUpdate(@Field("data") String str);

    @POST("v8/order/update")
    @FormUrlEncoded
    d<OrderResponse> orderUpdateRocks(@Field("data") String str);
}
