package com.meituan.android.common.horn;

import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.http.Body;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.HeaderMap;
import com.sankuai.meituan.retrofit2.http.Headers;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.QueryMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface HornService {
    @GET("horn")
    @Headers({"Accept-Encoding:identity"})
    Call<ap> loadBabelConfig(@QueryMap Map<String, Object> map, @HeaderMap Map<String, String> map2);

    @POST("hornNew")
    Call<ap> loadHornConfig(@QueryMap Map<String, Object> map, @Body ak akVar);

    @POST("https://met-horn-log.dreport.meituan.net")
    @Headers({"Content-Encoding:gzip"})
    Call<ap> postLogData(@Body ak akVar);
}
