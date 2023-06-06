package com.sankuai.waimai.mach.utils;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.Header;
import com.sankuai.meituan.retrofit2.http.Headers;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Query;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface MachWebRaptorService {
    @POST("api/log?v=1")
    @FormUrlEncoded
    @Headers({"post-fail-over:true"})
    rx.d<Void> log(@Header("referer") String str, @Field("c") String str2, @Query("pageId") String str3);
}
