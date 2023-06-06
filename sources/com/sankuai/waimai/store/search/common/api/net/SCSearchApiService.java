package com.sankuai.waimai.store.search.common.api.net;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Query;
import com.sankuai.waimai.platform.domain.manager.location.model.NewHistoryAddressResponse;
import com.sankuai.waimai.platform.widget.filterbar.implement.model.FilterConditionBean;
import com.sankuai.waimai.store.base.net.BaseResponse;
import com.sankuai.waimai.store.poi.subscribe.PoiSubscribeResponse;
import com.sankuai.waimai.store.search.model.GlobalPageResponse;
import com.sankuai.waimai.store.search.model.PromotionWordsResponse;
import com.sankuai.waimai.store.search.model.SGSearchFilterEntity;
import com.sankuai.waimai.store.search.model.j;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface SCSearchApiService {
    @POST("v7/user/address/getaddr")
    d<NewHistoryAddressResponse> getAddr(@Query("type") String str, @Query("wm_poi_id") String str2);

    @POST("v1/search/getfiltercondition")
    @FormUrlEncoded
    d<BaseResponse<FilterConditionBean>> getFilterCondition(@Field("show_mode") int i, @Field("keyword") String str, @Field("entrance_id") long j, @Field("category_type") int i2, @Field("sub_category_type") int i3);

    @POST("v2/search/getfiltercondition")
    @FormUrlEncoded
    d<BaseResponse<SGSearchFilterEntity>> getFilterConditionV2(@Field("show_mode") int i, @Field("keyword") String str, @Field("entrance_id") long j, @Field("category_type") int i2, @Field("sub_category_type") int i3);

    @POST("v11/search/promotionwords")
    @FormUrlEncoded
    d<BaseResponse<PromotionWordsResponse>> promotionwords(@Field("jingangId") long j, @Field("searchSource") int i);

    @POST("v1/search/non-delivery/poi")
    @FormUrlEncoded
    d<BaseResponse<j>> searchGlobalNonDelivery(@Field("entrance_id") long j, @Field("category_type") int i, @Field("sub_category_type") int i2, @Field("keyword") String str, @Field("query_type") int i3, @Field("page_index") int i4, @Field("page_size") int i5, @Field("channel") int i6);

    @POST("v1/search/globalpage")
    @FormUrlEncoded
    d<BaseResponse<GlobalPageResponse>> searchGlobalPage(@Field("entrance_id") long j, @Field("category_type") int i, @Field("category_text") String str, @Field("sub_category_type") int i2, @Field("keyword") String str2, @Field("query_type") int i3, @Field("page_index") int i4, @Field("page_size") int i5, @Field("activity_filter_codes") String str3, @Field("cpv_filter_properties") String str4, @Field("slider_select_data") String str5, @Field("sort_type") long j2, @Field("is_fix_keyword") boolean z, @Field("search_global_id") String str6, @Field("filter_mapping") String str7, @Field("show_mode") Integer num, @Field("search_source") int i6, @Field("product_card_page_index") int i7, @Field("product_tag_id") String str8, @Field("search_cursor") long j3, @Field("search_page_type") int i8, @Field("filter_item_status") int i9, @Field("agg_style_switch_button") String str9, @Field("search_need_module") String str10, @Field("originGuideQuery") String str11, @Field("secondGuidedShowText") String str12, @Field("drug_select_advice_tipid") long j4);

    @POST("v1/poi/subscribepoi")
    @FormUrlEncoded
    d<BaseResponse<PoiSubscribeResponse>> subscribePoi(@Field("wm_poi_id") long j, @Field("subscribe") int i);
}
