package com.sankuai.waimai.platform.domain.manager.againstcheat;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface AgainstCheatingApi {
    @POST("/appAction/waimai")
    @FormUrlEncoded
    d<AgainstCheatingResponseData> uploadData(@Field("context") String str);
}
