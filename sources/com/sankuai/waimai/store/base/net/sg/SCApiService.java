package com.sankuai.waimai.store.base.net.sg;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FieldMap;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Path;
import com.sankuai.waimai.store.base.net.BaseResponse;
import com.sankuai.waimai.store.convenient.model.SGConvenientLandingResponse;
import com.sankuai.waimai.store.goods.list.SCPoiFoodContainerResponse;
import com.sankuai.waimai.store.goods.list.model.SCRangeEntity;
import com.sankuai.waimai.store.goods.list.viewblocks.strollaround.StrollAroundFloorResponse;
import com.sankuai.waimai.store.goods.list.viewblocks.strollaround.WaterFallMachResponse;
import com.sankuai.waimai.store.goods.subscribe.SpuSubscribeResponse;
import com.sankuai.waimai.store.mach.page.MachTileResponse;
import com.sankuai.waimai.store.order.detail.model.OrderDetailRecommendResponse;
import com.sankuai.waimai.store.platform.domain.core.activities.MutliPoiCouponItem;
import com.sankuai.waimai.store.platform.domain.core.goods.RecommendPair;
import com.sankuai.waimai.store.platform.domain.core.goods.SGNewUserLandPoisResponse;
import com.sankuai.waimai.store.platform.domain.core.goods.SGNewUserLandResponse;
import com.sankuai.waimai.store.platform.domain.core.goods.ScanProductResponse;
import com.sankuai.waimai.store.platform.domain.core.goods.SpuProductsResponse;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiShoppingCartAndPoi;
import com.sankuai.waimai.store.platform.domain.core.shop.GetMenuResponse;
import com.sankuai.waimai.store.poi.list.newp.home.model.HomeTileResponse;
import com.sankuai.waimai.store.poi.list.newp.home.model.SGHomeTileResponse;
import com.sankuai.waimai.store.poi.subscribe.PoiSubscribeResponse;
import com.sankuai.waimai.store.recipe.model.Recipe;
import com.sankuai.waimai.store.recipe.model.RecipeLikeResponse;
import com.sankuai.waimai.store.recipe.model.RecipeResponse;
import com.sankuai.waimai.store.repository.model.FeedbackData;
import com.sankuai.waimai.store.repository.model.GoodDetailResponse;
import com.sankuai.waimai.store.repository.model.GoodsDetailResponse;
import com.sankuai.waimai.store.repository.model.MarketGuessResponse;
import com.sankuai.waimai.store.repository.model.MarketGuessTagResponse;
import com.sankuai.waimai.store.repository.model.MemberCouponStatusResponse;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.repository.model.RecommendSearchResponse;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.widgets.filterbar.home.model.FilterConditionResponse;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface SCApiService {
    @POST("v6/poi/batch/receivecoupon")
    @FormUrlEncoded
    rx.d<BaseResponse<Map<String, MutliPoiCouponItem>>> batchReceiveCoupon(@Field("wm_poi_id") long j, @Field("poi_id_str") String str, @Field("receive_coupon_input_list") String str2, @Field("scene_code") String str3, @Field("sub_scene_code") String str4);

    @POST("v1/member/cardscore/exchangetoken")
    rx.d<BaseResponse<Poi.MemberToken>> exchangeToken();

    @POST("v1/vision/modules/{pageID}")
    @FormUrlEncoded
    rx.d<BaseResponse<PoiVerticalityDataResponse>> fetchModuleRefresh(@Path("pageID") String str, @Field("params") String str2);

    @POST("v9/product/smooth/render")
    @FormUrlEncoded
    rx.d<BaseResponse<SpuProductsResponse>> getAddProductsByIds(@Field("wm_poi_id") String str, @Field("poi_id_str") String str2, @Field("spuIds") String str3);

    @POST("v8/poi/activity/sputag/products")
    @FormUrlEncoded
    rx.d<BaseResponse<RestMenuResponse>> getAggregationMenu(@Field("wm_poi_id") long j, @Field("poi_id_str") String str, @Field("product_spu_id") Long l, @Field("page_index") int i, @Field("tag_id") Long l2, @Field("source_type") int i2, @Field("extra") String str2);

    @POST("v1/cdq/poi/product/guess")
    @FormUrlEncoded
    rx.d<BaseResponse<MarketGuessResponse>> getCDQGuessData(@Field("page_index") int i, @Field("page_size") int i2, @Field("wm_poi_id") long j, @Field("poi_id_str") String str);

    @POST("v1/vision/page/sc-native-channel")
    @FormUrlEncoded
    rx.d<BaseResponse<PoiVerticalityDataResponse>> getChannelTileBlocks(@Field("params") String str);

    @POST("v1/shelf/pois")
    @FormUrlEncoded
    rx.d<BaseResponse<SGConvenientLandingResponse>> getConvenientLandingListV1(@Field("page_index") int i, @Field("wm_poi_id") long j, @Field("shelf_id") String str, @Field("spu_sku_id_list") String str2, @Field("first_category_code") long j2, @Field("second_category_code") long j3, @Field("rank_trace_id") String str3, @Field("shelf_page_trace_id") String str4, @Field("next_page_offset") int i2, @Field("activity_filter_codes") String str5, @Field("sort_type") int i3, @Field("extra") String str6, @Field("request_type") int i4);

    @POST("v1/vision/page/super-store-shelf")
    @FormUrlEncoded
    rx.d<BaseResponse<SGHomeTileResponse>> getConvenientLandingTile(@Field("params") String str);

    @POST("v1/channel/smooth/cardrender")
    @FormUrlEncoded
    rx.d<BaseResponse<PoiVerticalityDataResponse>> getDrugCommodityModeSpulist(@Field("spus") String str, @Field("category_type") long j, @Field("second_category_type") String str2, @Field("second_category_name") String str3);

    @POST("v6/poi/drug/info")
    @FormUrlEncoded
    rx.d<BaseResponse<GoodDetailResponse>> getDrugDetail(@FieldMap Map<String, String> map);

    @POST("v1/question/entrance")
    @FormUrlEncoded
    rx.d<BaseResponse<FeedbackData>> getFeedbackData(@Field("wm_poi_id") String str, @Field("poi_id_str") String str2, @Field("page_type") String str3);

    @POST("v6/poi/activity_groups")
    @FormUrlEncoded
    rx.d<BaseResponse<FilterConditionResponse>> getFilterConditionByType(@Field("first_category_type") long j, @Field("second_category_type") String str, @Field("filter_scene") int i, @Field("is_home_page") int i2, @Field("template_code") int i3);

    @POST("v6/poi/product/info")
    @FormUrlEncoded
    rx.d<BaseResponse<GoodDetailResponse>> getGoodDetail(@FieldMap Map<String, String> map);

    @POST("v1/vision/page/sc-native-product-page")
    @FormUrlEncoded
    rx.d<BaseResponse<GoodsDetailResponse>> getGoodsDetail(@FieldMap Map<String, String> map);

    @POST("v1/vision/modules/sc-native-product-page")
    @FormUrlEncoded
    rx.d<BaseResponse<GoodsDetailResponse>> getGoodsDetailModule(@FieldMap Map<String, String> map);

    @POST("v8/poi/product/guess")
    @FormUrlEncoded
    rx.d<BaseResponse<MarketGuessResponse>> getGuessData(@Field("page_source") int i, @Field("page_index") int i2, @Field("page_size") int i3, @Field("wm_poi_id") long j, @Field("poi_id_str") String str);

    @POST("v8/poi/product/guess")
    @FormUrlEncoded
    rx.d<BaseResponse<WaterFallMachResponse>> getGuessDataWithModuleList(@Field("page_index") int i, @Field("page_size") int i2, @Field("wm_poi_id") long j, @Field("poi_id_str") String str, @Field("page_source") int i3);

    @POST("v1/poi/product/tag")
    @FormUrlEncoded
    rx.d<BaseResponse<MarketGuessTagResponse>> getGuessTagData(@Field("page_source") int i, @Field("tag_id") String str, @Field("extra") String str2, @Field("tag_type") int i2, @Field("wm_poi_id") long j, @Field("poi_id_str") String str3);

    @POST("v1/vision/page/sc-native-home-superstore")
    @FormUrlEncoded
    rx.d<BaseResponse<PoiVerticalityDataResponse>> getHomeSuperTileBlocks(@Field("params") String str);

    @POST("v1/vision/page")
    @FormUrlEncoded
    rx.d<BaseResponse<PoiVerticalityDataResponse>> getHomeTileBlocks(@Field("params") String str);

    @POST("v1/vision/page/sc-native-home2")
    @FormUrlEncoded
    rx.d<BaseResponse<PoiVerticalityDataResponse>> getHomeV2TileBlocks(@Field("params") String str);

    @POST("v2/activity/newuser/product/render")
    @FormUrlEncoded
    rx.d<BaseResponse<SGNewUserLandResponse.ProductList>> getHotProductRender(@Field("tab_id") int i, @Field("module_type") String str, @Field("page_index") int i2, @Field("page_trace_id") String str2);

    @POST("v1/poi/queryMemberCouponStatus")
    @FormUrlEncoded
    rx.d<BaseResponse<MemberCouponStatusResponse>> getMemberCouponStatus(@Field("wm_poi_id") long j, @Field("poi_id_str") String str);

    @POST("v1/mtcaidaquan/poi/food")
    @FormUrlEncoded
    rx.d<BaseResponse<RestMenuResponse>> getNearbyPoi(@Field("extra") String str);

    @POST("v2/activity/newuser/set")
    @FormUrlEncoded
    rx.d<BaseResponse<SGNewUserLandResponse>> getNewUserLandData(@Field("category_code") String str, @Field("second_category_type") String str2, @Field("page_sourse_type") String str3, @Field("spu_id") String str4, @Field("sku_id") String str5, @Field("poi_id_str") String str6, @Field("source_id") String str7, @Field("extra") String str8, @Field("upc") String str9, @Field("hangDownProductsInfo") String str10, @Field("reqSource") String str11, @Field("third_categroy_code") String str12);

    @POST("v2/activity/newuser/poi")
    @FormUrlEncoded
    rx.d<BaseResponse<SGNewUserLandPoisResponse>> getNewUserPois(@Field("category_code") String str, @Field("second_category_type") String str2, @Field("page_sourse_type") String str3, @Field("spu_id") String str4, @Field("sku_id") String str5, @Field("poi_id_str") String str6, @Field("source_id") String str7, @Field("extra") String str8);

    @POST("v1/activity/newuser/prize")
    @FormUrlEncoded
    rx.d<BaseResponse<String>> getNewUserPrize(@Field("callback") String str);

    @POST("v2/activity/newuser/product/render")
    @FormUrlEncoded
    rx.d<BaseResponse<SGNewUserLandResponse.ProductList>> getNewUserRender(@Field("ids") String str, @Field("module_type") String str2);

    @POST("v1/product/recommend/product")
    @FormUrlEncoded
    rx.d<BaseResponse<OrderDetailRecommendResponse>> getOrderDetailRecommendCardList(@Field("order_view_id") String str, @Field("page_source") String str2, @Field("page_size") int i, @Field("page_index") int i2, @Field("rank_trace_id") String str3);

    @POST("v8/poi/cart/info")
    @FormUrlEncoded
    rx.d<BaseResponse<PoiShoppingCartAndPoi>> getPoiAndShopcartInfo(@Field("wm_poi_id") String str, @Field("poi_id_str") String str2, @Field("extra") String str3, @Field("page_source") int i);

    @POST("v10/poi/food/container")
    @FormUrlEncoded
    rx.d<BaseResponse<SCPoiFoodContainerResponse>> getPoiFoodContainer(@Field("wm_poi_id") String str, @Field("poi_id_str") String str2);

    @POST("v7/poi/supermarket/channelpage")
    @FormUrlEncoded
    rx.d<BaseResponse<PoiVerticalityDataResponse>> getPoiVerticalitylist(@Field("category_type") long j, @Field("second_category_type") String str, @Field("page_index") long j2, @Field("page_size") int i, @Field("navigate_type") long j3, @Field("sort_type") long j4, @Field("rank_trace_id") String str2, @Field("session_id") String str3, @Field("union_id") String str4, @Field("is_home_page") int i2, @Field("bannerScene") int i3, @Field("activity_filter_codes") String str5, @Field("pageSource") String str6, @Field("spu_filter_codes") String str7, @Field("template_code") int i4);

    @POST("v10/poi/supermarket/channelpage")
    @FormUrlEncoded
    rx.d<BaseResponse<PoiVerticalityDataResponse>> getPoiVerticalitylistV10(@Field("category_type") long j, @Field("second_category_type") String str, @Field("page_index") long j2, @Field("page_size") int i, @Field("navigate_type") long j3, @Field("sort_type") long j4, @Field("rank_trace_id") String str2, @Field("session_id") String str3, @Field("union_id") String str4, @Field("is_home_page") int i2, @Field("activity_filter_codes") String str5, @Field("pageSource") String str6, @Field("spu_filter_codes") String str7, @Field("template_code") int i3, @Field("request_type") int i4, @Field("is_partial_refresh") int i5, @Field("extra") String str8);

    @POST("v9/poi/supermarket/channelpage")
    @FormUrlEncoded
    rx.d<BaseResponse<PoiVerticalityDataResponse>> getPoiVerticalitylistV9(@Field("category_type") long j, @Field("second_category_type") String str, @Field("page_index") long j2, @Field("page_size") int i, @Field("navigate_type") long j3, @Field("sort_type") long j4, @Field("rank_trace_id") String str2, @Field("session_id") String str3, @Field("union_id") String str4, @Field("is_home_page") int i2, @Field("activity_filter_codes") String str5, @Field("pageSource") String str6, @Field("spu_filter_codes") String str7, @Field("template_code") int i3, @Field("request_type") int i4, @Field("is_partial_refresh") int i5, @Field("extra") String str8, @Field("coupon_id") String str9, @Field("extra_param") String str10, @Field("extra_sub_navi") String str11, @Field("custom_ext_category") String str12, @Field("g_source") String str13);

    @POST("v6/popupmenu/getmenu")
    @FormUrlEncoded
    rx.d<BaseResponse<GetMenuResponse>> getPopupMenu(@Field("wm_poi_id") long j, @Field("poi_id_str") String str, @Field("source") int i, @Field("additional_fields") String str2);

    @POST("v1/poi/scan_upc")
    @FormUrlEncoded
    rx.d<BaseResponse<ScanProductResponse>> getProductWithUpc(@Field("wm_poi_id") String str, @Field("upc_code") String str2);

    @POST("v7/poi/sputag/products")
    @FormUrlEncoded
    rx.d<BaseResponse<SpuProductsResponse>> getProducts(@Field("page_index") int i, @Field("spu_tag_id") String str, @Field("wm_poi_id") String str2, @Field("poi_id_str") String str3, @Field("tag_type") int i2, @Field("sort_type") int i3, @Field("is_support_smooth_render") int i4, @Field("product_spu_id") long j, @Field("brand_ids") String str4, @Field("extra") String str5, @Field("smooth_render_type") String str6, @Field("page_source") int i5);

    @POST("v9/product/smooth/render")
    @FormUrlEncoded
    rx.d<BaseResponse<SpuProductsResponse>> getProductsByIds(@Field("wm_poi_id") String str, @Field("poi_id_str") String str2, @Field("spu_tag_id") String str3, @Field("tag_type") int i, @Field("spuIds") String str4, @Field("page_source") String str5, @Field("trace_id") String str6, @Field("extra") String str7);

    @POST("v2/quickbuy/home")
    @FormUrlEncoded
    rx.d<BaseResponse<PoiVerticalityDataResponse>> getQuickBuyHome(@Field("category_type") String str, @Field("sort_type") long j, @Field("session_id") String str2, @Field("union_id") String str3, @Field("activity_filter_codes") String str4, @Field("g_source") String str5);

    @POST("v3/quickbuy/home")
    @FormUrlEncoded
    rx.d<BaseResponse<PoiVerticalityDataResponse>> getQuickBuyHomeNew(@Field("category_type") String str, @Field("second_category_type") String str2, @Field("sort_type") long j, @Field("session_id") String str3, @Field("union_id") String str4, @Field("activity_filter_codes") String str5, @Field("g_source") String str6);

    @POST("v1/search/box/hotKeyWords")
    @FormUrlEncoded
    rx.d<BaseResponse<RecommendSearchResponse>> getRecommendSearchKeyword(@Field("search_category_type") long j, @Field("navigate_type") long j2, @Field("page_type") String str);

    @POST("v8/poi/product/guess")
    @FormUrlEncoded
    rx.d<BaseResponse<WaterFallMachResponse>> getSGDetailGuessData(@Field("page_index") int i, @Field("page_size") int i2, @Field("wm_poi_id") long j, @Field("sku_id") long j2, @Field("spu_id") long j3, @Field("page_source") int i3);

    @POST("v1/poi/items")
    @FormUrlEncoded
    rx.d<BaseResponse<RestMenuResponse>> getShopAllSpus(@Field("wm_poi_id") long j, @Field("poi_id_str") String str, @Field("homepage_tag_id") long j2, @Field("extra") String str2);

    @POST("v1/poi/food/collect")
    @FormUrlEncoded
    rx.d<BaseResponse<com.sankuai.waimai.store.shopping.patchwork.model.b>> getShopCartPatchwork(@Field("wm_poi_id") long j, @Field("diff_price") double d, @Field("collect_type") int i);

    @POST("v9/poi/food")
    @FormUrlEncoded
    rx.d<BaseResponse<RestMenuResponse>> getShopMenu(@Field("wm_poi_id") long j, @Field("poi_id_str") String str, @Field("product_spu_id") Long l, @Field("page_index") int i, @Field("tag_id") Long l2, @Field("page_source") int i2, @Field("extra") String str2);

    @POST("v9/poi/food")
    @FormUrlEncoded
    rx.d<BaseResponse<RestMenuResponse>> getShopMenu(@Field("wm_poi_id") long j, @Field("poi_id_str") String str, @Field("product_spu_id") Long l, @Field("page_index") int i, @Field("tag_id") Long l2, @Field("extra") String str2, @Field("need_spu_count_cut") int i2);

    @POST("v8/poi/food")
    @FormUrlEncoded
    rx.d<BaseResponse<RestMenuResponse>> getShopMenuV8(@Field("wm_poi_id") long j, @Field("product_spu_id") Long l, @Field("page_index") int i, @Field("tag_id") Long l2, @Field("extra") String str, @Field("page_source") String str2);

    @POST("v1/poi/food/floor")
    @FormUrlEncoded
    rx.d<BaseResponse<StrollAroundFloorResponse>> getStrollAround(@Field("wm_poi_id") long j, @Field("poi_id_str") String str, @Field("extra") String str2);

    @POST("v7/poi/sputag/products")
    @FormUrlEncoded
    rx.d<BaseResponse<SpuProductsResponse>> getTabProducts(@Field("page_index") int i, @Field("spu_tag_id") String str, @Field("wm_poi_id") String str2, @Field("tag_type") int i2, @Field("sort_type") int i3, @Field("is_support_smooth_render") int i4, @Field("product_spu_id") long j, @Field("product_sku_id") long j2, @Field("brand_ids") String str3, @Field("extra") String str4, @Field("page_source") int i5, @Field("smooth_render_type") String str5);

    @POST("v1/shippingarea/check")
    @FormUrlEncoded
    rx.d<BaseResponse<SCRangeEntity>> getTakeoutRange(@Field("wm_poi_id") String str, @Field("mt_poi_id") String str2, @Field("poi_id_str") String str3);

    @POST("v1/vision/page/{page_id}")
    @FormUrlEncoded
    rx.d<BaseResponse<MachTileResponse>> getTileBlocks(@Path("page_id") String str, @Field("params") String str2);

    @POST("v1/vision/page/{page_id}")
    @FormUrlEncoded
    rx.d<BaseResponse<HomeTileResponse>> getTileBlocks2(@Path("page_id") String str, @Field("params") String str2);

    @POST("v1/vision/list/{page_id}")
    @FormUrlEncoded
    rx.d<BaseResponse<MachTileResponse>> getTilePageList(@Path("page_id") String str, @Field("params") String str2);

    @POST("v1/poi/menu/floating")
    @FormUrlEncoded
    rx.d<BaseResponse<RecipeResponse>> loadRecipeFloating(@Field("poi_id") long j, @Field("spu_id") long j2, @Field("sku_ids") List<Long> list, @Field("menu_id") String str);

    @POST("v1/poi/menu/floating/tab")
    @FormUrlEncoded
    rx.d<BaseResponse<Recipe>> loadRecipeFloatingTab(@Field("poi_id") long j, @Field("spu_id") long j2, @Field("sku_ids") List<Long> list, @Field("menu_id") String str);

    @POST("v1/poi/receive/multiCoupons")
    @FormUrlEncoded
    rx.d<BaseResponse<List<Poi.PoiCouponItem>>> receiveAllCoupon(@Field("poiReceiveCouponInputVOs") String str);

    @POST("v6/poi/receivecoupon")
    @FormUrlEncoded
    rx.d<BaseResponse<Poi.PoiCouponItem>> receiveCoupon(@Field("wm_poi_id") long j, @Field("poi_id_str") String str, @Field("coupon_pool_id") long j2, @Field("coupon_id") long j3, @Field("coupon_type") long j4, @Field("activity_id") long j5, @Field("scene_code") String str2, @Field("sub_scene_code") String str3, @Field("extra_data") String str4);

    @POST("v1/poi/menu/like")
    @FormUrlEncoded
    rx.d<BaseResponse<RecipeLikeResponse>> recipePraise(@Field("like") int i, @Field("menu_id") long j);

    @POST("v1/supermarket/newuser/refresh")
    @FormUrlEncoded
    rx.d<BaseResponse<Map<String, Object>>> refreshNewUser(@Field("category_type") long j);

    @POST("v1/poi/food/collocate")
    @FormUrlEncoded
    rx.d<BaseResponse<RecommendPair>> requestRecommendPair(@Field("poi_id") long j, @Field("poi_id_str") String str, @Field("spu_id") long j2, @Field("sku_id") long j3, @Field("type") int i, @Field("scene") String str2, @Field("extParams") String str3);

    @POST("drug/v1/member/point/exchangeCoupon")
    @FormUrlEncoded
    rx.d<BaseResponse<Poi.PoiCouponItem>> scoreExchangeCoupons(@Field("member_token") String str, @Field("third_activity_id") String str2, @Field("score") int i, @Field("source") int i2, @Field("poi_id") long j);

    @POST("v1/submit/question")
    @FormUrlEncoded
    rx.d<BaseResponse<String>> submitMedicalQuestionnaireData(@Field("questionInfo") String str);

    @POST("v1/poi/subscribepoi")
    @FormUrlEncoded
    rx.d<BaseResponse<PoiSubscribeResponse>> subscribePoi(@Field("wm_poi_id") long j, @Field("subscribe") int i);

    @POST("v1/poi/subscribe")
    @FormUrlEncoded
    rx.d<BaseResponse<SpuSubscribeResponse>> subscribeWarmUp(@Field("wm_poi_id") long j, @Field("spu_id") long j2, @Field("sku_id") long j3, @Field("spu_name") String str, @Field("subscribe") long j4);

    @POST("v1/poi/cancel/recommend/pop")
    @FormUrlEncoded
    rx.d<BaseResponse<Boolean>> uploadRecommend(@Field("wm_poi_id") long j);
}
