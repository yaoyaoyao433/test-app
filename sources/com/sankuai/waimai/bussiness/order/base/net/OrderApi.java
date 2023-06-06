package com.sankuai.waimai.bussiness.order.base.net;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.business.order.api.model.f;
import com.sankuai.waimai.bussiness.order.base.model.RelevantPoiResponse;
import com.sankuai.waimai.bussiness.order.base.model.a;
import com.sankuai.waimai.bussiness.order.confirm.submit.SubmitOrderResponse;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.OrderBaseRocksResponse;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.OrderSecondDelivery;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.b;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.c;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.g;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.k;
import com.sankuai.waimai.bussiness.order.rocks.OrderRocksServerModel;
import com.sankuai.waimai.bussiness.order.rocks.n;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import java.util.Map;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface OrderApi {
    @POST("v6/order/cancel")
    @FormUrlEncoded
    d<BaseResponse<b>> cancelOrder(@Field("hash_id") String str);

    @POST("v10/order/cancelFeed")
    @FormUrlEncoded
    d<BaseResponse<c>> cancelOrderSync(@Field("id") String str, @Field("order_time") int i);

    @POST("v7/order/cancel")
    @FormUrlEncoded
    d<BaseResponse<com.sankuai.waimai.bussiness.order.detailnew.network.response.d>> cancelTogetherOrder(@Field("hash_id") String str, @Field("is_submit_alert") int i);

    @POST("v6/payment/checkpay")
    @FormUrlEncoded
    d<BaseResponse<a>> checkPay(@Field("hash_id") String str, @Field("trade_no") String str2);

    @POST("v6/order/confirmreceive")
    @FormUrlEncoded
    d<BaseResponse<com.sankuai.waimai.bussiness.order.base.model.b>> confirmReceiveFood(@Field("hash_id") String str);

    @POST("v6/payment/genpay")
    @FormUrlEncoded
    d<BaseResponse<SubmitOrderResponse>> genPay(@Field("hash_id") String str, @Field("page_code") String str2, @Field("no_yb_pay") int i, @Field("ext_param") String str3, @Field("payment_type") int i2);

    @POST("v10/order/diningOpenFind")
    @FormUrlEncoded
    d<BaseResponse<Object>> getDiningCabinetStatus(@Field("deviceSn") String str, @Field("pickupOrderId") String str2);

    @POST("v6/order/simplestatus")
    d<BaseResponse<k>> getFeedbackNum();

    @POST("v6/feedback/preview")
    @FormUrlEncoded
    d<BaseResponse<com.sankuai.waimai.business.order.api.model.c>> getFeedbackQuestions(@Field("order_view_id") String str, @Field("support_types") String str2, @Field("page_from") int i);

    @POST("v6/ugc/couponprogress")
    d<BaseResponse<f>> getGoldenCoinProgress();

    @POST("v7/order/detail")
    @FormUrlEncoded
    d<OrderBaseRocksResponse<Map<String, Object>>> getOrderDetailRocks(@Field("id") String str);

    @POST("v6/app/preferentialdesc")
    @FormUrlEncoded
    d<BaseResponse<Object>> getOrderPricePreferential(@Field("post_stub") String str);

    @POST("v1/wmorder/wmOrderDetailFeed")
    @FormUrlEncoded
    d<BaseResponse<n>> getOrderStatusFeedFlowInfo(@Field("orderViewId") String str, @Field("wmPoiId") long j, @Field("cid") String str2, @Field("pageSize") int i, @Field("pageNum") int i2);

    @POST("v11/order/status")
    @FormUrlEncoded
    d<BaseResponse<OrderRocksServerModel>> getOrderStatusInfoRocks(@Field("order_view_id") String str, @Field("exclude_region") String str2, @Field("push_switch") int i, @Field("feedback_address_ids") String str3);

    @POST("v6/poi/coupon/preexchange_or_guide_buy")
    @FormUrlEncoded
    d<BaseResponse<com.sankuai.waimai.bussiness.order.confirm.coupon.model.d>> getPreExchangeCouponDialogInfo(@Field("wm_poi_id") long j, @Field("poi_id_str") String str, @Field("coupon_view_id") String str2, @Field("actualSecondCityId") String str3, @Field("actualThirdCityId") String str4, @Field("selectSecondCityId") String str5, @Field("selectThirdCityId") String str6, @Field("addressSecondCityId") String str7, @Field("addressThirdCityId") String str8, @Field("other_poi_selected_coupon_view_ids") String str9, @Field("card_type") int i, @Field("outer_code") String str10, @Field("product_id") long j2, @Field("request_page_source") int i2, @Field("exchange_type") int i3, @Field("extend_info") String str11);

    @POST("v6/poi/order/looklike")
    @FormUrlEncoded
    d<BaseResponse<RelevantPoiResponse>> getRelevantPoi(@Field("wm_poi_id") long j, @Field("poi_id_str") String str);

    @POST("v6/delivery/seconddelivery")
    @FormUrlEncoded
    d<BaseResponse<OrderSecondDelivery>> getSecondDelivery(@Field("order_view_id") String str);

    @POST("v9/order/historystatus")
    @FormUrlEncoded
    d<BaseResponse<g>> historyStatus(@Field("order_view_id") String str);

    @POST("v10/order/diningOpen")
    @FormUrlEncoded
    d<BaseResponse<Object>> openDiningCabinet(@Field("deviceSn") String str, @Field("waybillId") long j);

    @POST("v6/delivery/customer/location")
    @FormUrlEncoded
    d<BaseResponse> reportCustomerLocation(@Field("order_view_id") long j, @Field("poi_id") long j2, @Field("poi_id_str") String str, @Field("report_time") long j3, @Field("longitude") long j4, @Field("latitude") long j5);

    @POST("v6/poi/coupon/exchange")
    @FormUrlEncoded
    d<BaseResponse<com.sankuai.waimai.bussiness.order.confirm.coupon.model.b>> submitExchangeCoupon(@Field("actualSecondCityId") String str, @Field("actualThirdCityId") String str2, @Field("selectSecondCityId") String str3, @Field("selectThirdCityId") String str4, @Field("addressSecondCityId") String str5, @Field("addressThirdCityId") String str6, @Field("wm_poi_id") long j, @Field("poi_id_str") String str7, @Field("coupon_view_id") String str8, @Field("other_poi_selected_coupon_view_ids") String str9, @Field("outer_code") String str10, @Field("card_type") int i, @Field("product_id") long j2, @Field("exchange_type") int i2, @Field("coin_count") int i3, @Field("trans_token") String str11, @Field("request_page_source") int i4, @Field("coin_trans_token") String str12);

    @POST("v6/order/submitextra")
    @FormUrlEncoded
    d<BaseResponse> submitExtraOrderInfo(@Field("order_view_id") long j, @Field("type") int i, @Field("remark") String str, @Field("invoice_title") String str2, @Field("invoice_type") int i2, @Field("taxpayer_id_number") String str3, @Field("diners_count") int i3, @Field("phone") String str4);

    @POST("v6/feedback/answer")
    @FormUrlEncoded
    d<BaseResponse<com.sankuai.waimai.business.order.api.model.b>> submitFeedbackAnswer(@Field("order_view_id") String str, @Field("question_id") long j, @Field("answers") String str2, @Field("extensions_info") String str3);

    @POST("v6/order/validate")
    @FormUrlEncoded
    d<BaseResponse<Object>> validateCodeSubmit(@Field("order_token") String str, @Field("verify_code") String str2, @Field("login_token") String str3, @Field("source") int i, @Field("check_type") int i2, @Field("response_code") String str4, @Field("request_code") String str5);
}
