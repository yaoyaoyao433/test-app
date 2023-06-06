package com.sankuai.waimai.business.page.home.model;

import com.google.gson.JsonElement;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FieldMap;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.QueryMap;
import com.sankuai.waimai.business.page.home.gray.HomeGrayModel;
import com.sankuai.waimai.platform.capacity.abtest.ABTestExpStrategyResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.domain.core.ad.Ad;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface API {

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public @interface HomeMode {
    }

    @POST("v6/ab/exp/strategy")
    @FormUrlEncoded
    rx.d<BaseResponse<ABTestExpStrategyResponse>> getABTestStrategy(@Field("extendParam") String str);

    @POST("v7/act/getinfo")
    @FormUrlEncoded
    rx.d<BaseResponse<String>> getActInfoRequestNew(@Field("navigate_type") int i, @Field("extra_param") String str, @Field("is_just_login") boolean z);

    @POST("v6/home/dynamic/tabs")
    @FormUrlEncoded
    rx.d<BaseResponse<DynamicTabListInfoResponse>> getDynamicTabInfo(@Field("content_query") String str, @QueryMap Map<String, Object> map);

    @POST("v6/home/feeds/tabs")
    @FormUrlEncoded
    rx.d<BaseResponse<f>> getHomeFutureTabs(@FieldMap Map<String, Object> map);

    @POST("v6/home/feeds/rcmdboard")
    @FormUrlEncoded
    rx.d<BaseResponse<String>> getHomeNewRcmdboard(@FieldMap Map<String, Object> map);

    @POST("v8/home/gettopbanner")
    @FormUrlEncoded
    rx.d<BaseResponse<List<Ad>>> getTopBanner(@Field("topbanner_refresh_poi_ids") String str, @Field("topbanner_refresh_activity_ids") String str2, @Field("params") String str3);

    @POST("v6/product/tag")
    @FormUrlEncoded
    rx.d<BaseResponse<Object>> optimizationFeedbackReport(@Field("poi_id") long j, @Field("tag_type") int i, @Field("entry_id") int i2, @Field("reason_type") int i3, @Field("extend") String str);

    @POST("v6/content/homefeedlist")
    @FormUrlEncoded
    rx.d<Response<JsonElement>> preloadHomeUgcFeedList(@Field("page_scene") String str, @Field("offset") int i, @Field("rank_list_id") String str2, @Field("ref_list_id") String str3, @Field("preview_item_str") String str4, @Field("click_id") String str5, @Field("page_style") String str6, @Field("feed_list_version") int i2, @Field("content_param") String str7, @Field("showBubbleType") int i3, @QueryMap Map<String, Object> map);

    @POST("v6/home/topbuoy")
    rx.d<BaseResponse<e>> requestHeaderFloatData();

    @POST("v6/home/gray")
    @FormUrlEncoded
    rx.d<BaseResponse<HomeGrayModel>> requestHomeGray(@Field("prefecture_level_id") long j, @Field("county_level_id") long j2);

    @POST("v6/home/second/floor")
    rx.d<BaseResponse<HomeSecondFloorResponse>> requestSecondFloorData();

    @POST("v6/home/sidebar")
    rx.d<BaseResponse<e>> requestSideBarData();
}
