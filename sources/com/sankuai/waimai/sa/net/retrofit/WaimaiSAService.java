package com.sankuai.waimai.sa.net.retrofit;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.sa.model.b;
import com.sankuai.waimai.sa.model.m;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface WaimaiSAService {
    @POST("v6/smartassistant/correct")
    @FormUrlEncoded
    d<BaseResponse<com.sankuai.waimai.sa.model.d>> getSACorrectResult(@Field("msg") String str);

    @POST("v6/smartassistant/parseRecommendProduct")
    @FormUrlEncoded
    d<BaseResponse<m>> getSARecommendProduct(@Field("wm_poi_id") long j, @Field("result_id") long j2);

    @POST("v6/smartassistant/parse")
    @FormUrlEncoded
    d<BaseResponse<b>> getSAResult(@Field("msg") String str, @Field("label") String str2, @Field("channel") int i);

    @POST("v6/smartassistant/init")
    @FormUrlEncoded
    d<BaseResponse<Object>> postFeedbacklUrl(@Field("channel") int i);

    @POST("v6/smartassistant/feedback")
    @FormUrlEncoded
    d<BaseResponse<String>> postSAFeedBack(@Field("result_id") long j, @Field("feedback") int i);
}
