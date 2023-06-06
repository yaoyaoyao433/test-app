package com.meituan.android.common.locate.remote;

import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.http.Body;
import com.sankuai.meituan.retrofit2.http.Headers;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Query;
/* loaded from: classes2.dex */
public interface IGearsLocatorApi {
    @POST("locate/v3/sdk/loc?")
    @Headers({"Content-Encoding:gzip", "X-Request-Encrypt:1", "X-Request-Platform:1", "Content-Type:application/json", "X-Request-Type:0", "X-Response-Encrypt:1", "X-Response-Encoding:gzip"})
    Call<ap> sendGotWithGzipped(@Body ak akVar);

    @POST("locate/v3/sdk/loc?")
    @Headers({"Content-Encoding:gzip", "X-Request-Encrypt:1", "X-Request-Platform:1", "Content-Type:application/json", "X-Request-Type:0"})
    Call<ap> sendWithGzipped(@Body ak akVar);

    @POST("locate/v2/sdk/loc")
    @Headers({"gzipped:1", "encryptv:1"})
    Call<ap> sendWithGzipped(@Query("ci") String str, @Body ak akVar);

    @POST("locate/v3/sdk/loc?")
    @Headers({"X-Request-Encrypt:0", "X-Request-Platform:1", "Content-Type:application/json", "X-Request-Type:0"})
    Call<ap> sendWithPlain(@Body ak akVar);

    @POST("locate/v2/sdk/loc")
    @Headers({"gzipped:0"})
    Call<ap> sendWithPlain(@Query("ci") String str, @Body ak akVar);
}
