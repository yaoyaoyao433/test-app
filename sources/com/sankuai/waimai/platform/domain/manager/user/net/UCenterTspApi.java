package com.sankuai.waimai.platform.domain.manager.user.net;

import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface UCenterTspApi {
    @POST("/api/ucenter/canceled")
    d<BaseResponse<UserCanceledResponse>> getCanceledStatus();

    @POST("/api/ucenter/canceled/dp")
    d<BaseResponse<UserCanceledResponse>> getCanceledStatusDp();

    @POST("/api/ucenter/canceled/mt")
    d<BaseResponse<UserCanceledResponse>> getCanceledStatusMt();
}
