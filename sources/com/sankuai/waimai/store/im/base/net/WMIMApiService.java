package com.sankuai.waimai.store.im.base.net;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.business.order.api.model.g;
import com.sankuai.waimai.store.base.net.BaseResponse;
import com.sankuai.waimai.store.platform.domain.core.im.MessageUnreadInfoResponse;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiSimpleResultResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface WMIMApiService {
    @POST("v7/message/unread")
    @FormUrlEncoded
    rx.d<BaseResponse<MessageUnreadInfoResponse>> getMessageUnReadNum(@Field("biz_type") int i);

    @POST("v6/order/simplelist")
    @FormUrlEncoded
    rx.d<BaseResponse<com.sankuai.waimai.store.im.poi.ordersimplelist.c>> getSimpleList(@Field("poi_id") long j, @Field("poi_id_str") String str, @Field("type") int i);

    @POST("v6/poi/simplelist")
    @FormUrlEncoded
    rx.d<BaseResponse<PoiSimpleResultResponse>> getSimpleList(@Field("poi_ids") String str);

    @POST("v6/order/onekeyremind")
    @FormUrlEncoded
    rx.d<BaseResponse<g>> onekeyremind(@Field("hash_id") String str, @Field("force_flag") String str2, @Field("source_page_code") int i);

    @POST("v6/user/poicoupons/im_receive")
    @FormUrlEncoded
    rx.d<BaseResponse<Object>> receiveImCoupon(@Field("wm_poi_id") long j, @Field("coupon_pool_id") long j2, @Field("coupon_id") long j3, @Field("coupon_type") int i, @Field("activity_id") long j4);
}
