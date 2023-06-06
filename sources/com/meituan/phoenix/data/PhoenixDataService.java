package com.meituan.phoenix.data;

import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.Query;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface PhoenixDataService {
    @GET("/sully/v2/native/api/getSourceCityCdnList")
    Call<d> getPhoenixData(@Query("appkey") String str, @Query("config") String str2);
}
