package com.sankuai.waimai.business.page.common.net.request;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface DislikeApi {
    @POST("v6/user/dislike/cancel")
    @FormUrlEncoded
    d<BaseResponse<Object>> cancelDislike(@Field("wm_poi_id") long j, @Field("poi_id_str") String str);

    @POST("v6/user/dislike/check")
    @FormUrlEncoded
    d<BaseResponse<com.sankuai.waimai.business.page.common.list.model.a>> checkDislike(@Field("wm_poi_id") long j, @Field("poi_id_str") String str);

    @POST("v6/user/dislike/add")
    @FormUrlEncoded
    d<BaseResponse<Object>> dislike(@Field("wm_poi_id") long j, @Field("reason_code") String str, @Field("poi_id_str") String str2);
}
