package com.sankuai.waimai.bussiness.order.confirm.service;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface SubmitHuaweiTrackService {
    @POST("wmdstrategy/smart/touchstrategy")
    @FormUrlEncoded
    d<BaseResponse<String>> trackSubmit(@Field("businessCode") int i, @Field("strategyName") String str, @Field("strategyResult") double d, @Field("featureParam") String str2);
}
