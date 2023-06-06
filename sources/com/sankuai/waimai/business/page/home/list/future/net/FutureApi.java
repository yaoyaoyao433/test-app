package com.sankuai.waimai.business.page.home.list.future.net;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FieldMap;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import com.sankuai.waimai.rocks.page.model.RocksResponse;
import java.util.Map;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface FutureApi {
    @POST("v6/home/feeds/mainlist")
    @FormUrlEncoded
    d<BaseResponse<RocksServerModel>> getHomeComplexList(@Field("refresh_type") int i, @Field("offset") int i2, @Field("rank_trace_id") String str, @Field("rank_list_id") String str2, @Field("seq_num") int i3, @Field("activity_filter_codes") String str3, @Field("slider_select_data") String str4, @Field("dynamic_page") boolean z, @Field("behavioral_characteristics") String str5, @Field("intent_type") int i4, @Field("net_stat") int i5, @Field("address_plaintext") String str6, @Field("exposure_obfuscate_data_ids") String str7, @Field("ad_data_ids") String str8, @Field("client_resort") boolean z2, @FieldMap Map<String, Object> map);

    @POST("v6/intent/interactive")
    @FormUrlEncoded
    d<RocksResponse<a>> getInteractiveCardData(@FieldMap Map<String, Object> map);

    @POST("v6/userprefer/submit")
    @FormUrlEncoded
    d<BaseResponse<RocksServerModel>> userPreferSubmit(@Field("source_type") int i, @Field("question_id") long j);

    @POST("v6/userprefer/submit")
    @FormUrlEncoded
    d<BaseResponse<RocksServerModel>> userPreferSubmit(@Field("source_type") int i, @Field("question_id") long j, @Field("value") String str);
}
