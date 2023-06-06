package com.sankuai.waimai.alita.alitarule;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface AlitaRuleService {
    @POST("marketing/appbeh/getruleidsbyuserid")
    @FormUrlEncoded
    d<BaseResponse<AlitaRuleResponse>> getAlitaRule(@Field("userId") long j, @Field("ruleIds") String str);
}
