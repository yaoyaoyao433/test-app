package com.sankuai.waimai.business.user.api.user.request;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface AccountReq {
    @POST("v6/account/info")
    d<BaseResponse<com.sankuai.waimai.business.user.api.user.response.a>> accountInfo();

    @POST("v6/data/binduser")
    @FormUrlEncoded
    d<BaseResponse<Object>> bindUser(@Field("login_token") String str, @Field("pass_msg_verify") String str2);

    @POST("v6/friend/unbind")
    d<BaseResponse<String>> unbind();
}
