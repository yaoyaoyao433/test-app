package com.sankuai.waimai.bussiness.order.list.net;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.business.order.api.model.OrderListResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface OrderListApi {
    @POST("v6/order/recenteat")
    d<BaseResponse<OrderListResponse.RecentEat>> getRecentEat();

    @POST("v8/order/getuserorders")
    @FormUrlEncoded
    d<BaseResponse<OrderListResponse>> getUserOrders(@Field("cursor") String str, @Field("multi_cursor") String str2, @Field("type") String str3, @Field("category") int i);

    @POST("v8/order/getuserorders")
    @FormUrlEncoded
    d<BaseResponse<OrderListResponse>> getUserOrders(@Field("cursor") String str, @Field("multi_cursor") String str2, @Field("type") String str3, @Field("category") int i, @Field("source") int i2);
}
