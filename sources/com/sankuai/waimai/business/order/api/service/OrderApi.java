package com.sankuai.waimai.business.order.api.service;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.business.order.api.model.g;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface OrderApi {
    @POST("v6/order/onekeyremind")
    @FormUrlEncoded
    d<BaseResponse<g>> onekeyremind(@Field("hash_id") String str, @Field("force_flag") String str2, @Field("source_page_code") int i);

    @POST("v6/order/remindorder")
    @FormUrlEncoded
    d<BaseResponse<g>> remindOrder(@Field("hash_id") String str, @Field("force_flag") String str2, @Field("source_page_code") int i);
}
