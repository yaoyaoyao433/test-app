package com.sankuai.waimai.store.drug.base.net;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FieldMap;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Url;
import com.sankuai.waimai.store.base.net.BaseResponse;
import com.sankuai.waimai.store.drug.alita.model.AlitaMarketingBean;
import com.sankuai.waimai.store.drug.coupon.model.DrugMemberCouponStatusResponse;
import com.sankuai.waimai.store.drug.coupon.model.DrugMemberResponse;
import com.sankuai.waimai.store.drug.home.new_home.realtime.ShoppingGuideRealtimeData;
import com.sankuai.waimai.store.drug.home.refactor.card.float_card.order.OrderMessageEntity;
import com.sankuai.waimai.store.drug.order.OrderRXInquiryResponse;
import com.sankuai.waimai.store.platform.domain.core.goods.RecommendPair;
import com.sankuai.waimai.store.platform.domain.core.goods.SpuProductsResponse;
import com.sankuai.waimai.store.platform.domain.core.im.DrugImEntranceEntity;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiShoppingCartAndPoi;
import com.sankuai.waimai.store.platform.domain.core.shop.GetMenuResponse;
import com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.NetPriceCalculatorResult;
import com.sankuai.waimai.store.poi.subscribe.PoiSubscribeResponse;
import com.sankuai.waimai.store.repository.model.GoodDetailResponse;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.repository.model.RecommendSearchResponse;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.widgets.filterbar.home.model.FilterConditionResponse;
import java.util.Map;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface DrugApiService {
    @POST("drug/order/preview/check")
    @FormUrlEncoded
    d<BaseResponse<OrderRXInquiryResponse>> checkRXInquiryRequest(@Field("submit_data") String str, @Field("drug_extra") String str2, @Field("cid") String str3);

    @POST("v1/health/marketingc/member/score/exchange/token")
    d<BaseResponse<Poi.MemberToken>> exchangeToken();

    @POST("v9/product/smooth/render")
    @FormUrlEncoded
    d<BaseResponse<SpuProductsResponse>> getAddProductsByIds(@Field("wm_poi_id") String str, @Field("poi_id_str") String str2, @Field("spuIds") String str3);

    @POST("health/marketingc/realtimePushAct/v1/triggerAlitaRule")
    @FormUrlEncoded
    d<BaseResponse<AlitaMarketingBean>> getAlitaMarketingData(@FieldMap Map<String, Object> map);

    @POST("v1/health/marketingc/gateway/delivery/newUserTouch/getMaterials")
    @FormUrlEncoded
    d<BaseResponse<AlitaMarketingBean>> getAlitaMarketingDataV2(@FieldMap Map<String, Object> map);

    @POST("v6/poi/drug/info")
    @FormUrlEncoded
    d<BaseResponse<GoodDetailResponse>> getDrugDetail(@FieldMap Map<String, String> map);

    @POST("v1/drug/im/entrance")
    @FormUrlEncoded
    d<BaseResponse<DrugImEntranceEntity>> getDrugEntranceData(@Field("poi_id") String str, @Field("poi_id_str") String str2, @Field("page_source") String str3, @Field("spu_id") String str4);

    @POST("v1/drug/channelpage/vision")
    @FormUrlEncoded
    d<BaseResponse<PoiVerticalityDataResponse>> getDrugHomeFirstVision(@Field("category_type") long j, @Field("second_category_type") String str, @Field("page_index") long j2, @Field("page_size") int i, @Field("navigate_type") long j3, @Field("sort_type") long j4, @Field("rank_trace_id") String str2, @Field("session_id") String str3, @Field("union_id") String str4, @Field("is_home_page") int i2, @Field("activity_filter_codes") String str5, @Field("pageSource") String str6, @Field("spu_filter_codes") String str7, @Field("template_code") int i3, @Field("request_type") int i4, @Field("is_partial_refresh") int i5, @Field("supplement_feed_mode") int i6, @Field("extra") String str8, @Field("new_drug_home_page") boolean z);

    @POST("v1/drug/channelpage/poi_list")
    @FormUrlEncoded
    d<BaseResponse<PoiVerticalityDataResponse>> getDrugHomePoiList(@Field("category_type") long j, @Field("second_category_type") String str, @Field("page_index") long j2, @Field("page_size") int i, @Field("navigate_type") long j3, @Field("sort_type") long j4, @Field("rank_trace_id") String str2, @Field("session_id") String str3, @Field("union_id") String str4, @Field("is_home_page") int i2, @Field("activity_filter_codes") String str5, @Field("pageSource") String str6, @Field("spu_filter_codes") String str7, @Field("template_code") int i3, @Field("request_type") int i4, @Field("is_partial_refresh") int i5, @Field("supplement_feed_mode") int i6, @Field("extra") String str8);

    @POST("v6/poi/activity_groups")
    @FormUrlEncoded
    d<BaseResponse<FilterConditionResponse>> getFilterConditionByType(@Field("first_category_type") long j, @Field("second_category_type") String str, @Field("filter_scene") int i, @Field("is_home_page") int i2, @Field("template_code") int i3);

    @POST("v1/drug/channelpage/guess_you_find")
    d<BaseResponse<ShoppingGuideRealtimeData>> getImTileRealtimeData();

    @POST("v1/health/marketingc/member/cardBindPop")
    @FormUrlEncoded
    d<BaseResponse<DrugMemberCouponStatusResponse>> getMemberCouponStatus(@Field("wm_poi_id") long j, @Field("poi_id_str") String str);

    @POST("v7/shoppingcart/calculateprice")
    @FormUrlEncoded
    d<BaseResponse<NetPriceCalculatorResult>> getNetPriceCalculatorResult(@Field("data") String str);

    @POST("v2/drug/channelpage/poi_list")
    @FormUrlEncoded
    d<BaseResponse<PoiVerticalityDataResponse>> getNewDrugHomeFeedList(@Field("request_type") int i, @Field("realtime") boolean z, @Field("first_category_code") long j, @Field("category_code_type") int i2, @Field("quick_filter") String str, @Field("page_type") int i3, @Field("rank_trace_id") String str2, @Field("session_id") String str3, @Field("union_id") String str4, @Field("realtime_poi_location") int i4, @Field("realtime_size") int i5, @Field("exposure_poi_list") String str5, @Field("poi_id_str_list") String str6, @Field("theme_realtime") boolean z2);

    @POST("v2/poi/food/collect")
    @FormUrlEncoded
    d<BaseResponse<com.sankuai.waimai.drug.model.d>> getNewShopCartPatchWork(@Field("wm_poi_id") long j, @Field("poi_id_str") String str, @Field("diff_price") double d, @Field("collect_type") int i, @Field("shipping_fee") double d2, @Field("min_price") double d3, @Field("product_list") String str2, @Field("cart_extend_info") String str3, @Field("total_price") double d4);

    @POST("v1/drug/channelpage/last_order")
    d<BaseResponse<OrderMessageEntity>> getOrderMessageData();

    @POST("v8/poi/cart/info")
    @FormUrlEncoded
    d<BaseResponse<PoiShoppingCartAndPoi>> getPoiAndShopcartInfo(@Field("wm_poi_id") String str, @Field("poi_id_str") String str2, @Field("extra") String str3, @Field("page_source") int i);

    @POST("v6/popupmenu/getmenu")
    @FormUrlEncoded
    d<BaseResponse<GetMenuResponse>> getPopupMenu(@Field("wm_poi_id") long j, @Field("poi_id_str") String str, @Field("source") int i, @Field("additional_fields") String str2);

    @POST("v7/poi/sputag/products")
    @FormUrlEncoded
    d<BaseResponse<SpuProductsResponse>> getProducts(@Field("page_index") int i, @Field("spu_tag_id") String str, @Field("wm_poi_id") String str2, @Field("poi_id_str") String str3, @Field("tag_type") int i2, @Field("sort_type") int i3, @Field("is_support_smooth_render") int i4, @Field("product_spu_id") long j, @Field("brand_ids") String str4, @Field("extra") String str5, @Field("smooth_render_type") String str6);

    @POST("v9/product/smooth/render")
    @FormUrlEncoded
    d<BaseResponse<SpuProductsResponse>> getProductsByIds(@Field("wm_poi_id") long j, @Field("poi_id_str") String str, @Field("spu_tag_id") String str2, @Field("tag_type") int i, @Field("spuIds") String str3, @Field("page_source") String str4, @Field("trace_id") String str5);

    @POST("v1/drug/poi/channelpage/realtime")
    @FormUrlEncoded
    d<BaseResponse<PoiVerticalityDataResponse>> getRealTimeUpdateInfo(@Field("category_type") long j, @Field("second_category_type") String str, @Field("page_index") long j2, @Field("page_size") int i, @Field("navigate_type") long j3, @Field("sort_type") long j4, @Field("rank_trace_id") String str2, @Field("session_id") String str3, @Field("union_id") String str4, @Field("is_home_page") int i2, @Field("activity_filter_codes") String str5, @Field("pageSource") String str6, @Field("spu_filter_codes") String str7, @Field("template_code") int i3, @Field("request_type") int i4, @Field("is_partial_refresh") int i5, @Field("supplement_feed_mode") int i6, @Field("extra") String str8, @Field("realtime_poi_location") int i7, @Field("realtime_size") int i8, @Field("exposure_poi_list") String str9, @Field("poi_id_str_list") String str10);

    @POST("v1/search/box/hotKeyWords")
    @FormUrlEncoded
    d<BaseResponse<RecommendSearchResponse>> getRecommendSearchKeyword(@Field("search_category_type") long j, @Field("navigate_type") long j2, @Field("page_type") String str);

    @POST("v9/poi/food")
    @FormUrlEncoded
    d<BaseResponse<RestMenuResponse>> getShopMenu(@Field("wm_poi_id") long j, @Field("poi_id_str") String str, @Field("product_spu_id") Long l, @Field("page_index") int i, @Field("tag_id") Long l2, @Field("extra") String str2);

    @POST("v8/poi/food")
    @FormUrlEncoded
    d<BaseResponse<RestMenuResponse>> getShopMenuV8(@Field("wm_poi_id") long j, @Field("poi_id_str") String str, @Field("product_spu_id") Long l, @Field("page_index") int i, @Field("tag_id") Long l2, @Field("extra") String str2, @Field("page_source") String str3);

    @POST("v1/health/marketingc/member/cardBind")
    @FormUrlEncoded
    d<BaseResponse<DrugMemberResponse>> joinDrugMember(@Field("mobile") String str, @Field("poi_id") long j, @Field("poi_id_str") String str2, @Field("brand_id") long j2, @Field("verify_type") int i, @Field("grabCouponList") String str3);

    @POST
    @FormUrlEncoded
    d<BaseResponse<Object>> machRequest(@Url String str, @FieldMap Map<String, String> map);

    @POST("health/marketingc/delivery/receive/coupon")
    @FormUrlEncoded
    d<BaseResponse<Poi.PoiCouponItem>> receiveCoupon(@Field("wm_poi_id") long j, @Field("poi_id_str") String str, @Field("coupon_pool_id") long j2, @Field("coupon_id") long j3, @Field("coupon_type") long j4, @Field("activity_id") long j5, @Field("extra_data") String str2);

    @POST("v1/supermarket/newuser/refresh")
    @FormUrlEncoded
    d<BaseResponse<Map<String, Object>>> refreshNewUser(@Field("category_type") long j);

    @POST("poi/buy_together")
    @FormUrlEncoded
    d<BaseResponse<RecommendPair>> requestRecommendPair(@Field("wm_poi_id") long j, @Field("poi_id_str") String str, @Field("sku_id") long j2);

    @POST("v1/health/marketingc/member/exchangeCoupon")
    @FormUrlEncoded
    d<BaseResponse<Poi.PoiCouponItem>> scoreDrugExchangeCoupons(@Field("member_token") String str, @Field("third_activity_id") String str2, @Field("score") int i, @Field("source") int i2, @Field("poi_id") long j, @Field("poi_id_str") String str3);

    @POST("v1/submit/question")
    @FormUrlEncoded
    d<BaseResponse<String>> submitMedicalQuestionnaireData(@Field("questionInfo") String str);

    @POST("v1/poi/subscribepoi")
    @FormUrlEncoded
    d<BaseResponse<PoiSubscribeResponse>> subscribePoi(@Field("wm_poi_id") long j, @Field("poi_id_str") String str, @Field("subscribe") int i);
}
