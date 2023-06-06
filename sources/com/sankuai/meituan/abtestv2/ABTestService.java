package com.sankuai.meituan.abtestv2;

import com.sankuai.meituan.abtestv2.mode.ABTestResponseBody;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.Query;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface ABTestService {
    @GET("v1/getAllStrategys")
    Call<ABTestResponseBody> getAllStrategys(@Query("platform") String str, @Query("app") String str2, @Query("uuid") String str3, @Query("ci") String str4);
}
