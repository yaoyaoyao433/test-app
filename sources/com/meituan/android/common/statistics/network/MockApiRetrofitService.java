package com.meituan.android.common.statistics.network;

import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.http.Body;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.HeaderMap;
import com.sankuai.meituan.retrofit2.http.Headers;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Url;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface MockApiRetrofitService {
    @GET
    @Headers({"Accept-Charset: UTF-8", "Content-Type: application/json;charset=UTF-8"})
    Call<Void> getMockRegist(@Url String str, @HeaderMap Map<String, String> map);

    @POST
    @Headers({"Accept-Charset: UTF-8", "Content-Type: application/json;charset=UTF-8", "Content-Encoding:gzip"})
    Call<Void> postMockData(@Url String str, @HeaderMap Map<String, String> map, @Body ak akVar);
}
