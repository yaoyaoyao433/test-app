package com.sankuai.waimai.business.order.api.service;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.business.order.api.model.a;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface OrderCommentService {
    @POST("v6/comment/scheme")
    @FormUrlEncoded
    d<BaseResponse<a>> getCommentScheme(@Field("order_view_id") String str, @Field("wm_poi_id") String str2, @Field("poi_id_str") String str3);

    @POST("v8/comment/gocomment")
    @FormUrlEncoded
    d<BaseResponse<String>> goCommentRequest(@Field("order_view_id") String str, @Field("wm_poi_id") String str2, @Field("poi_id_str") String str3, @Field("scity") String str4);
}
