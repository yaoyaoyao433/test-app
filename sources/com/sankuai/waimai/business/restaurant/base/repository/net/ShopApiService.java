package com.sankuai.waimai.business.restaurant.base.repository.net;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FieldMap;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.business.order.api.model.Order;
import com.sankuai.waimai.business.restaurant.base.repository.model.FullReduceEntrance;
import com.sankuai.waimai.business.restaurant.base.repository.model.GetMenuResponse;
import com.sankuai.waimai.business.restaurant.base.repository.model.MagicCouponPreUpgradeDialogInfo;
import com.sankuai.waimai.business.restaurant.base.repository.model.PoiCommentResponse;
import com.sankuai.waimai.business.restaurant.base.repository.model.RecommendPackageFloatResponse;
import com.sankuai.waimai.business.restaurant.base.repository.model.RecommendWithPackageFloatResponse;
import com.sankuai.waimai.business.restaurant.base.repository.model.ReportReasonResponse;
import com.sankuai.waimai.business.restaurant.base.repository.model.RestMenuBaseResponse;
import com.sankuai.waimai.business.restaurant.base.repository.model.TagData;
import com.sankuai.waimai.business.restaurant.base.repository.model.g;
import com.sankuai.waimai.business.restaurant.poicontainer.base.repository.model.FullReduceAnim;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.domain.core.goods.FoodMultiSpuResponse;
import com.sankuai.waimai.platform.domain.core.goods.SpuProductsResponse;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
import com.sankuai.waimai.platform.domain.core.poi.PoiShoppingCartAndPoi;
import com.sankuai.waimai.platform.domain.core.poi.RestRecommendPoi;
import java.util.Map;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface ShopApiService {
    @POST("v6/comment/support")
    @FormUrlEncoded
    d<BaseResponse<Object>> doCommentSupport(@Field("comment_id") long j, @Field("type") int i, @Field("wm_poi_id") long j2, @Field("poi_id_str") String str);

    @POST("v6/poi/usercredit/exchange/poicoupon")
    @FormUrlEncoded
    d<BaseResponse<Object>> doExchangePoiCoupon(@Field("wm_poi_id") long j);

    @POST("v8/poi/tips")
    @FormUrlEncoded
    d<BaseResponse<Object>> getAvailableCouponTip(@Field("wm_poi_id") long j, @Field("poi_id_str") String str, @Field("mt_city_info") com.sankuai.waimai.business.restaurant.base.repository.model.b bVar);

    @POST("v6/comment/poi")
    @FormUrlEncoded
    d<BaseResponse<PoiCommentResponse>> getComments(@Field("wmpoiid") long j, @Field("poi_id_str") String str, @Field("page_offset") int i, @Field("page_size") int i2, @Field("comment_score_type") int i3, @Field("label_id") long j2);

    @POST("customerservice/info")
    @FormUrlEncoded
    d<BaseResponse<Object>> getCustomerService(@Field("paramStr") String str);

    @POST("shop/v1/poi/productlist")
    @FormUrlEncoded
    d<RestMenuBaseResponse> getFoodList(@Field("group_chat_share") String str, @Field("wm_poi_id") long j, @Field("poi_id_str") String str2, @Field("product_spu_id") Long l, @Field("recall_type") int i, @Field("search_word") String str3, @Field("search_log_id") String str4, @Field("page_index") int i2, @Field("recommend_product") String str5, @Field("source_page_type") int i3, @Field("style_template_ids") String str6, @Field("allowance_alliance_scenes") String str7, @Field("content_info") String str8, @Field("ad_activity_flag") String str9, @Field("brand_page_type") String str10, @Field("is_cross") String str11, @Field("request_mark") String str12, @Field("cart_spu_ids") String str13, @Field("share_bill_mode") boolean z, @Field("dynamic_mode") boolean z2, @Field("recipient_address") String str14, @Field("show_health_food") int i4, @Field("health_food_query_word") String str15, @Field("click_id") String str16, @Field("preview_item_str") String str17, @Field("elderly_render_dynamic") boolean z3, @Field("whole_render_dynamic") boolean z4, @Field("accessibility_type") int i5, @Field("link_identifier_info") String str18);

    @POST("v6/poi/food/multispu")
    @FormUrlEncoded
    d<BaseResponse<FoodMultiSpuResponse>> getFoodMultiSpu(@Field("poiId") long j, @Field("poi_id_str") String str, @Field("spuId") long j2, @Field("skuIds") String str2, @Field("spuAttrs") String str3);

    @POST("poi/attrs")
    @FormUrlEncoded
    d<BaseResponse<String>> getFoodMultiSpuNew(@Field("paramStr") String str);

    @POST("v7/poi/product/info")
    @FormUrlEncoded
    d<BaseResponse<String>> getGoodDetail(@FieldMap Map<String, String> map);

    @POST("v6/poi/coupon/pre_upgrade")
    @FormUrlEncoded
    d<BaseResponse<MagicCouponPreUpgradeDialogInfo>> getMagicCouponPreUpgradeDialogInfo(@Field("coupon_view_id") String str);

    @POST("v7/order/getfoodlist")
    @FormUrlEncoded
    d<BaseResponse<Order>> getOrderFoodList(@Field("id") String str, @Field("order_user_id") String str2);

    @POST("v8/poi/cart/info")
    @FormUrlEncoded
    d<BaseResponse<PoiShoppingCartAndPoi>> getPoiAndShopcartInfo(@Field("wm_poi_id") String str, @Field("poi_id_str") String str2, @Field("ad_activity_flag") String str3, @Field("source") int i, @Field("is_cross") String str4, @Field("extra") String str5, @Field("link_identifier_info") String str6);

    @POST("v6/popupmenu/getmenu")
    @FormUrlEncoded
    d<BaseResponse<GetMenuResponse>> getPopupMenu(@Field("wm_poi_id") long j, @Field("poi_id_str") String str, @Field("source") int i, @Field("business_type") int i2);

    @POST("v7/poi/sputag/products")
    @FormUrlEncoded
    d<BaseResponse<SpuProductsResponse>> getProductsList(@FieldMap Map<String, String> map, @Field("mt_city_info") com.sankuai.waimai.business.restaurant.base.repository.model.b bVar);

    @POST("v6/product/recommend/foodpage")
    @FormUrlEncoded
    d<BaseResponse<RecommendPackageFloatResponse>> getRecommendPackageFloat(@FieldMap Map<String, String> map);

    @POST("v6/comment/food")
    @FormUrlEncoded
    d<BaseResponse<RecommendWithPackageFloatResponse>> getRecommendWithPackageFloat(@Field("praise_food_str") String str, @Field("wm_poi_id") long j, @Field("poi_id_str") String str2, @Field("wm_comment_id") long j2, @Field("style_template_ids") String str3);

    @POST("v6/content/report/reason/list")
    @FormUrlEncoded
    d<BaseResponse<ReportReasonResponse>> getReportReasonList(@Field("resource_id") long j, @Field("resource_type") int i, @Field("scene") int i2);

    @POST("v6/poi/closing/rcmd/relevant")
    @FormUrlEncoded
    d<BaseResponse<RestRecommendPoi>> getRestRecommendPoi(@Field("wm_poi_id") String str, @Field("poi_id_str") String str2);

    @POST("v8/poi/food")
    @FormUrlEncoded
    d<RestMenuBaseResponse> getShopMenuStr(@Field("group_chat_share") String str, @Field("wm_poi_id") long j, @Field("poi_id_str") String str2, @Field("product_spu_id") Long l, @Field("recall_type") int i, @Field("search_word") String str3, @Field("search_log_id") String str4, @Field("page_index") int i2, @Field("recommend_product") String str5, @Field("source_page_type") int i3, @Field("style_template_ids") String str6, @Field("allowance_alliance_scenes") String str7, @Field("content_info") String str8, @Field("ad_activity_flag") String str9, @Field("brand_page_type") String str10, @Field("is_cross") String str11, @Field("request_mark") String str12, @Field("cart_spu_ids") String str13, @Field("share_bill_mode") boolean z, @Field("dynamic_mode") boolean z2, @Field("recipient_address") String str14, @Field("show_health_food") int i4, @Field("resource_id") String str15, @Field("health_food_query_word") String str16, @Field("click_id") String str17, @Field("preview_item_str") String str18, @Field("foodlist_uniform_mode") int i5, @Field("elderly_render_dynamic") boolean z3, @Field("whole_render_dynamic") boolean z4, @Field("accessibility_type") int i6, @Field("link_identifier_info") String str19);

    @POST("poi/copies")
    @FormUrlEncoded
    d<BaseResponse<String>> getSoldOutGuideCopies(@Field("paramStr") String str);

    @POST("v6/wmpoi/taginfo")
    @FormUrlEncoded
    d<BaseResponse<TagData>> getTakeoutTag(@Field("mt_poi_id") String str);

    @POST("v7/cart/modify")
    @FormUrlEncoded
    d<BaseResponse<String>> modifyCart(@Field("data") String str);

    @POST("v6/poi/receivecoupon")
    @FormUrlEncoded
    d<BaseResponse<Poi.PoiCouponItem>> receiveCoupon(@Field("wm_poi_id") long j, @Field("coupon_pool_id") long j2, @Field("coupon_id") long j3, @Field("activity_id") long j4, @Field("coupon_activity_type") long j5);

    @POST("v6/smartassistant/purchasetips")
    @FormUrlEncoded
    d<BaseResponse<FullReduceAnim>> showFullReduceAnim(@Field("wm_poi_id") long j, @Field("poi_id_str") String str, @Field("sku_id") long j2, @Field("spu_id") long j3, @Field("mt_city_info") com.sankuai.waimai.business.restaurant.base.repository.model.b bVar);

    @POST("v6/smartassistant/containrecommend")
    @FormUrlEncoded
    d<BaseResponse<FullReduceEntrance>> showFullReduceEntrance(@Field("wm_poi_id") long j, @Field("poi_id_str") String str, @Field("is_first") boolean z, @Field("mt_city_info") com.sankuai.waimai.business.restaurant.base.repository.model.b bVar);

    @POST("v7/cart/start")
    @FormUrlEncoded
    d<BaseResponse<String>> startCart(@Field("data") String str);

    @POST("v6/content/report/submit")
    @FormUrlEncoded
    d<BaseResponse<g>> submitReport(@Field("resource_id") long j, @Field("resource_type") int i, @Field("scene") int i2, @Field("report_reason_type") int i3, @Field("report_reason_description") String str);
}
