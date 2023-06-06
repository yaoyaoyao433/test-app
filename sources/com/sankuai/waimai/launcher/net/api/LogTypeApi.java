package com.sankuai.waimai.launcher.net.api;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface LogTypeApi {
    @POST("v7/app/adImpLogs")
    @FormUrlEncoded
    d<BaseResponse<String>> reportADLog(@Field("data") String str);

    @POST("v6/app/userinfo")
    @FormUrlEncoded
    d<BaseResponse> uploadUnionId(@Field("unionid") String str);

    @POST("v6/app/userinfo")
    @FormUrlEncoded
    d<BaseResponse> uploadUserInfo(@Field("notify_status") String str);
}
