package com.sankuai.waimai.business.page.kingkong.future.network;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.rocks.model.RocksServerModel;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface FKKApi {
    @POST("v6/channel/feeds/tabs")
    @FormUrlEncoded
    rx.d<BaseResponse<RocksServerModel>> channelFeed(@Field("resource_id") int i, @Field("seq_num") int i2, @Field("offset") int i3, @Field("dynamic_page") boolean z, @Field("label_latitude") long j, @Field("label_longitude") long j2, @Field("page_index") long j3, @Field("sort_type") long j4, @Field("first_category_type") long j5, @Field("second_category_type") long j6, @Field("navigate_type") long j7, @Field("activity_filter_codes") String str, @Field("slider_select_data") String str2, @Field("rank_trace_id") String str3, @Field("rank_list_id") String str4, @Field("session_id") String str5, @Field("union_id") String str6, @Field("behavioral_characteristics") String str7, @Field("poi_card_show_style") int i4, @Field("address_plaintext") String str8);

    @POST("v6/channel/feeds/list")
    @FormUrlEncoded
    rx.d<BaseResponse<RocksServerModel>> channelMainlist(@Field("seq_num") int i, @Field("offset") int i2, @Field("dynamic_page") boolean z, @Field("label_latitude") long j, @Field("label_longitude") long j2, @Field("page_index") long j3, @Field("sort_type") long j4, @Field("first_category_type") long j5, @Field("second_category_type") long j6, @Field("navigate_type") long j7, @Field("activity_filter_codes") String str, @Field("slider_select_data") String str2, @Field("rank_trace_id") String str3, @Field("rank_list_id") String str4, @Field("session_id") String str5, @Field("union_id") String str6, @Field("behavioral_characteristics") String str7, @Field("poi_card_show_style") int i3, @Field("address_plaintext") String str8);

    @POST("v6/channel/feeds/rcmd")
    @FormUrlEncoded
    rx.d<BaseResponse<RocksServerModel>> channelRcmd(@Field("resource_id") int i, @Field("navigate_type") long j, @Field("rank_list_id") String str, @Field("first_category_type") long j2, @Field("net_stat") int i2);
}
