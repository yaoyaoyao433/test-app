package com.sankuai.meituan.takeoutnew.net.api;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.takeoutnew.net.response.LoadInfoResponse;
import com.sankuai.meituan.takeoutnew.net.response.StartPictureResponse;
import com.sankuai.waimai.platform.capacity.abtest.ABTestExpStrategyResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface WmApi {
    @POST("v6/ab/exp/strategy")
    @FormUrlEncoded
    d<BaseResponse<ABTestExpStrategyResponse>> getABTestStrategy(@Field("extendParam") String str);

    @POST("v7/loadInfo")
    @FormUrlEncoded
    d<BaseResponse<LoadInfoResponse>> getLoadInfo(@Field("app_pn") String str, @Field("width") int i, @Field("height") int i2, @Field("last_time_latitude") long j, @Field("last_time_longitude") long j2, @Field("user_agent") String str2, @Field("net_stat") int i3);

    @POST("v7/startpicture")
    @FormUrlEncoded
    d<BaseResponse<StartPictureResponse>> getStartPicture(@Field("scene_id") int i, @Field("width") int i2, @Field("height") int i3, @Field("last_time_latitude") long j, @Field("last_time_longitude") long j2, @Field("user_agent") String str, @Field("net_stat") int i4, @Field("ad_params") String str2);

    @POST("v7/openscreen")
    @FormUrlEncoded
    d<BaseResponse<StartPictureResponse>> getWelcomeAd(@Field("scene_id") int i, @Field("width") int i2, @Field("height") int i3, @Field("ct_second_id") int i4, @Field("ct_third_id") int i5, @Field("user_agent") String str, @Field("net_stat") int i6, @Field("ad_params") String str2);

    @POST("v6/act/share/envelope")
    @FormUrlEncoded
    d<BaseResponse> shareRemind(@Field("order_id_view") String str, @Field("url_key") String str2, @Field("share_channel") String str3);
}
