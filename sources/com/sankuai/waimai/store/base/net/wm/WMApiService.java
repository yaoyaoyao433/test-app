package com.sankuai.waimai.store.base.net.wm;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.business.order.api.model.OrderListResponse;
import com.sankuai.waimai.business.order.api.model.g;
import com.sankuai.waimai.store.base.net.BaseResponse;
import com.sankuai.waimai.store.entity.RestRecommendPoi;
import com.sankuai.waimai.store.orderlist.model.OrderDeleteResponse;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiShoppingCartAndPoi;
import com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.NetPriceCalculatorResult;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface WMApiService {
    @POST("v6/order/confirmreceive")
    @FormUrlEncoded
    d<BaseResponse<com.sankuai.waimai.store.orderlist.model.a>> confirmReceiveFood(@Field("hash_id") String str);

    @POST("v7/order/delete")
    @FormUrlEncoded
    d<BaseResponse<OrderDeleteResponse>> deleteOrder(@Field("order_id") String str, @Field("order_time") String str2);

    @POST("v6/payment/genpay")
    @FormUrlEncoded
    d<BaseResponse<Object>> genPay(@Field("hash_id") String str, @Field("page_code") String str2);

    @POST("v7/shoppingcart/calculateprice")
    @FormUrlEncoded
    d<BaseResponse<NetPriceCalculatorResult>> getNetPriceCalculatorResult(@Field("data") String str);

    @POST("v8/poi/cart/info")
    @FormUrlEncoded
    d<BaseResponse<PoiShoppingCartAndPoi>> getPoiAndShopcartInfo(@Field("wm_poi_id") String str, @Field("extra") String str2, @Field("page_source") int i);

    @POST("v6/poi/closing/rcmd/relevant")
    @FormUrlEncoded
    d<BaseResponse<RestRecommendPoi>> getRestRecommendPoi(@Field("wm_poi_id") String str, @Field("scene") int i);

    @POST("v8/order/getuserorders")
    @FormUrlEncoded
    d<BaseResponse<OrderListResponse>> getUserOrders(@Field("cursor") String str, @Field("type") String str2, @Field("category") int i, @Field("biz_id") String str3, @Field("poi_category") String str4);

    @POST("v8/comment/gocomment")
    @FormUrlEncoded
    d<BaseResponse<String>> goCommentRequest(@Field("order_view_id") String str, @Field("wm_poi_id") String str2);

    @POST("v6/order/remindorder")
    @FormUrlEncoded
    d<BaseResponse<g>> onekeyremind(@Field("hash_id") String str, @Field("force_flag") String str2, @Field("source_page_code") int i);
}
