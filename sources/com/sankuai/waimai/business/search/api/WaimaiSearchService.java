package com.sankuai.waimai.business.search.api;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.business.search.model.GlobalPageResponse;
import com.sankuai.waimai.business.search.model.PromotionWordsResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface WaimaiSearchService {
    @POST("v7/poi/search/home/hotlabelandhistory")
    @FormUrlEncoded
    d<com.sankuai.waimai.business.search.model.a<Object>> hotLabelAndHistory(@Field("entrance_id") long j, @Field("category_type") int i, @Field("sub_category_type") int i2, @Field("search_found") int i3, @Field("page_index") int i4, @Field("poi_with_word_list") String str, @Field("inner_box_list") String str2, @Field("need_region") String str3, @Field("gaoda_id") int i5, @Field("weien_id") int i6, @Field("search_source") int i7, @Field("show_word_list") String str4, @Field("app_model") int i8);

    @POST("search/guide/ranks")
    @FormUrlEncoded
    d<com.sankuai.waimai.business.search.model.a<Object>> hotSearchRank(@Field("category_type") int i, @Field("rank_list_id") String str, @Field("ref_list_id") String str2, @Field("search_source") int i2);

    @POST("v11/search/promotionwords")
    @FormUrlEncoded
    d<com.sankuai.waimai.business.search.model.a<PromotionWordsResponse>> promotionwords(@Field("jingangId") long j, @Field("searchSource") int i);

    @POST("/api/sg/poi/receivecoupon")
    @FormUrlEncoded
    d<com.sankuai.waimai.business.search.model.a<Object>> receiveCoupon(@Field("coupon_id") long j, @Field("coupon_type") long j2, @Field("extra_data") String str);

    @POST("v11/search/globalpage")
    @FormUrlEncoded
    d<com.sankuai.waimai.business.search.model.a<GlobalPageResponse>> searchGlobalPage(@Field("entrance_id") long j, @Field("category_type") int i, @Field("sub_category_type") int i2, @Field("keyword") String str, @Field("origin_guide_query") String str2, @Field("second_guided_show_text") String str3, @Field("query_type") int i3, @Field("page_index") int i4, @Field("page_size") int i5, @Field("activity_filter_codes") String str4, @Field("slider_select_data") String str5, @Field("sort_type") int i6, @Field("is_fix_keyword") boolean z, @Field("search_global_id") String str6, @Field("filter_mapping") String str7, @Field("show_mode") Integer num, @Field("search_source") int i7, @Field("product_card_page_index") int i8, @Field("product_tag_id") String str8, @Field("search_cursor") long j2, @Field("search_page_type") int i9, @Field("search_longitude") long j3, @Field("search_latitude") long j4, @Field("word_source") String str9, @Field("gaoda_id") int i10, @Field("weien_id") int i11, @Field("gaoda_param") String str10, @Field("app_model") int i12, @Field("inner_source") int i13, @Field("ref_list_id") String str11, @Field("rank_list_id") String str12, @Field("behavioral_characteristics") String str13);
}
