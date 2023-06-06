package com.sankuai.waimai.store.drug.base.net;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.store.base.net.BaseResponse;
import com.sankuai.waimai.store.drug.coupon.model.DrugMemberCouponStatusResponse;
import com.sankuai.waimai.store.drug.goods.list.model.SCRangeEntity;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiShoppingCartAndPoi;
import com.sankuai.waimai.store.platform.domain.core.shop.GetMenuResponse;
import com.sankuai.waimai.store.repository.model.MarketGuessTagResponse;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface SCApiService {
    @POST("v1/member/cardscore/exchangetoken")
    d<BaseResponse<Poi.MemberToken>> exchangeToken();

    @POST("v8/poi/activity/sputag/products")
    @FormUrlEncoded
    d<BaseResponse<RestMenuResponse>> getAggregationMenu(@Field("wm_poi_id") long j, @Field("product_spu_id") Long l, @Field("page_index") int i, @Field("tag_id") Long l2, @Field("extra") String str);

    @POST("v1/poi/product/tag")
    @FormUrlEncoded
    d<BaseResponse<MarketGuessTagResponse>> getGuessTagData(@Field("tag_id") String str, @Field("extra") String str2, @Field("tag_type") int i, @Field("wm_poi_id") long j);

    @POST("v1/poi/queryMemberCouponStatus")
    @FormUrlEncoded
    d<BaseResponse<DrugMemberCouponStatusResponse>> getMemberCouponStatus(@Field("wm_poi_id") long j, @Field("poi_id_str") String str);

    @POST("v8/poi/cart/info")
    @FormUrlEncoded
    d<BaseResponse<PoiShoppingCartAndPoi>> getPoiAndShopcartInfo(@Field("wm_poi_id") String str, @Field("extra") String str2, @Field("page_source") int i);

    @POST("v6/popupmenu/getmenu")
    @FormUrlEncoded
    d<BaseResponse<GetMenuResponse>> getPopupMenu(@Field("wm_poi_id") long j, @Field("poi_id_str") String str, @Field("source") int i, @Field("additional_fields") String str2);

    @POST("v1/poi/items")
    @FormUrlEncoded
    d<BaseResponse<RestMenuResponse>> getShopAllSpus(@Field("wm_poi_id") long j, @Field("poi_id_str") String str, @Field("homepage_tag_id") long j2, @Field("extra") String str2);

    @POST("v1/shippingarea/check")
    @FormUrlEncoded
    d<BaseResponse<SCRangeEntity>> getTakeoutRange(@Field("wm_poi_id") String str, @Field("mt_poi_id") String str2, @Field("poi_id_str") String str3);

    @POST("v6/poi/receivecoupon")
    @FormUrlEncoded
    d<BaseResponse<Poi.PoiCouponItem>> receiveCoupon(@Field("wm_poi_id") long j, @Field("poi_id_str") String str, @Field("coupon_pool_id") long j2, @Field("coupon_id") long j3, @Field("coupon_type") long j4, @Field("activity_id") long j5, @Field("extra_data") String str2);

    @POST("drug/v1/member/point/exchangeCoupon")
    @FormUrlEncoded
    d<BaseResponse<Poi.PoiCouponItem>> scoreExchangeCoupons(@Field("member_token") String str, @Field("third_activity_id") String str2, @Field("score") int i, @Field("source") int i2, @Field("poi_id") long j, @Field("poi_id_str") String str3);
}
