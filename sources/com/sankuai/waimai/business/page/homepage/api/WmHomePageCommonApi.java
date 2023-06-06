package com.sankuai.waimai.business.page.homepage.api;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.business.page.homepage.response.a;
import com.sankuai.waimai.business.page.homepage.response.b;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface WmHomePageCommonApi {
    @POST("v6/order/lastorderstatus")
    @FormUrlEncoded
    d<BaseResponse<a>> fetchOrderStatus(@Field("located_scity") long j, @Field("located_tcity") long j2, @Field("actual_scity") long j3, @Field("actual_tcity") long j4);

    @POST("v6/weather")
    @FormUrlEncoded
    d<BaseResponse<b>> getWeatherStatus(@Field("prefecture_level_id") long j, @Field("county_level_id") long j2);
}
