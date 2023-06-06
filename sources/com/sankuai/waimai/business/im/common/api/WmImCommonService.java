package com.sankuai.waimai.business.im.common.api;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.business.im.common.model.b;
import com.sankuai.waimai.business.im.common.model.e;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface WmImCommonService {
    @POST("v6/im/checkmodifyaddress")
    @FormUrlEncoded
    d<BaseResponse<b>> checkModifyAddress(@Field("order_view_id") long j);

    @POST("v10/order/orderstatusdesc")
    @FormUrlEncoded
    d<BaseResponse<e>> getOrderStatus(@Field("scene") long j, @Field("order_view_id") long j2, @Field("located_scity") long j3, @Field("located_tcity") long j4, @Field("actual_scity") long j5, @Field("actual_tcity") long j6);

    @POST("v6/im/joinGroup")
    @FormUrlEncoded
    d<BaseResponse<com.sankuai.waimai.business.im.common.model.d>> getUserGroupChatInfo(@Field("poi_id") long j, @Field("poi_id_str") String str, @Field("order_view_id") long j2, @Field("source") int i);
}
