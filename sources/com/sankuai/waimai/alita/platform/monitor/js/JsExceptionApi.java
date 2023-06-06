package com.sankuai.waimai.alita.platform.monitor.js;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.Header;
import com.sankuai.meituan.retrofit2.http.POST;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface JsExceptionApi {
    @POST("api/log?v=1")
    @FormUrlEncoded
    d<Void> log(@Header("referer") String str, @Field("c") String str2);
}
