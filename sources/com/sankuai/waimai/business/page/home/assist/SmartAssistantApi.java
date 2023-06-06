package com.sankuai.waimai.business.page.home.assist;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface SmartAssistantApi {
    @POST("v6/smartassistant/sceneinfo")
    @FormUrlEncoded
    d<BaseResponse<Object>> getSceneInfo(@Field("condition") String str, @Field("condition_param") String str2, @Field("scene_param") String str3);

    @POST("v6/smartassistant/showentrance")
    @FormUrlEncoded
    d<BaseResponse<Object>> postSAShowEntrance(@Field("channel") int i);
}
