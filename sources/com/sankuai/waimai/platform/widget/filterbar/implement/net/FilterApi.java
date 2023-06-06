package com.sankuai.waimai.platform.widget.filterbar.implement.net;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.widget.filterbar.implement.model.CategoryBean;
import com.sankuai.waimai.platform.widget.filterbar.implement.model.FilterConditionBean;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface FilterApi {
    @POST("v7/home/homecategorygroups")
    d<BaseResponse<CategoryBean>> getFilterCategory();

    @POST("v9/poi/search/getfiltercondition")
    @FormUrlEncoded
    d<BaseResponse<FilterConditionBean>> getFilterCondition(@Field("show_mode") int i, @Field("keyword") String str);

    @POST("v6/poi/activity_groups")
    @FormUrlEncoded
    d<BaseResponse<FilterConditionBean>> getFilterConditionByType(@Field("first_category_type") long j, @Field("second_category_type") long j2, @Field("navigate_type") int i, @Field("filter_scene") int i2, @Field("group_id") long j3, @Field("filter_reveal") boolean z, @Field("page_source_type") int i3);
}
