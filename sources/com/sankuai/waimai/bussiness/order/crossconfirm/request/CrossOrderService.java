package com.sankuai.waimai.bussiness.order.crossconfirm.request;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.submit.result.CrossOrderSubmitResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface CrossOrderService {
    @POST("v6/order/multi/preview")
    @FormUrlEncoded
    rx.d<CrossOrderResponse> crossOrderPreview(@Field("data") String str);

    @POST("v6/order/tableware-setting")
    @FormUrlEncoded
    rx.d<BaseResponse> crossOrderSetTableware(@Field("poiId") long j, @Field("settingId") long j2, @Field("selectedOption") int i);

    @POST("v6/order/multi/submit")
    @FormUrlEncoded
    rx.d<CrossOrderSubmitResponse> crossOrderSubmit(@Field("data") String str);

    @POST("v6/order/multi/update")
    @FormUrlEncoded
    rx.d<CrossOrderResponse> crossOrderUpdate(@Field("data") String str);
}
