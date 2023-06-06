package com.sankuai.meituan.takeoutnew.net.api;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface LogTypeApi {
    @POST("v6/app/userinfo")
    @FormUrlEncoded
    d<BaseResponse> uploadUserInfo(@Field("notify_status") String str);
}
