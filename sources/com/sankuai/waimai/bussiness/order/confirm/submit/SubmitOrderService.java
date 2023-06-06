package com.sankuai.waimai.bussiness.order.confirm.submit;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface SubmitOrderService {
    @POST("v6/order/submit")
    @FormUrlEncoded
    rx.d<BaseResponse<SubmitOrderResponse>> orderSubmit(@Field("data") String str);
}
