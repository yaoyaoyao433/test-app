package com.sankuai.waimai.bussiness.order.base.net;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.GenerateRefundResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface PaymentApi {
    @POST("v6/payment/refund/cancel")
    @FormUrlEncoded
    d<BaseResponse> cancelRefundAppeal(@Field("hash_id") String str);

    @POST("v7/payment/refund/preview")
    @FormUrlEncoded
    d<BaseResponse<GenerateRefundResponse>> refundPreview(@Field("view_id") String str);
}
