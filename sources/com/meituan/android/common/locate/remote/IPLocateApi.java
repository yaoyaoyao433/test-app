package com.meituan.android.common.locate.remote;

import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.Headers;
import com.sankuai.meituan.retrofit2.http.Query;
/* loaded from: classes2.dex */
public interface IPLocateApi {
    @GET("locate/v2/ip/loc")
    Call<ap> sendRequestWithIP(@Query("client_source") String str, @Query("ip") String str2, @Query("rgeo") boolean z);

    @GET("locate/v2/ip/loc")
    @Headers({"X-Default-Location:1", "X-Response-Encrypt:1", "X-Response-Encoding:gzip"})
    Call<ap> sendRequestWithNoIP(@Query("client_source") String str, @Query("rgeo") boolean z, @Query("cityid") int i);

    Call<ap> sendRequestWithNoIPEncrypted(@Query("client_source") String str, @Query("rgeo") boolean z, @Query("cityid") int i);
}
