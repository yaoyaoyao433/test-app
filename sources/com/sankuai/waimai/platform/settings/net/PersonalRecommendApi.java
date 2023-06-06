package com.sankuai.waimai.platform.settings.net;

import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.Query;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface PersonalRecommendApi {
    @GET("/user/privacy/get-switches")
    d<BaseResponse<PersonalRecommendResponse>> getSwitches(@Query("token") String str, @Query("joinkey") String str2, @Query("packageName") String str3);

    @GET("/user/v1/info")
    d<UserInfoResponse> getUserInfo(@Query("token") String str, @Query("fields") String str2);
}
