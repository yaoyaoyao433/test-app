package com.meituan.android.common.unionid.oneid.network;

import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.http.Body;
import com.sankuai.meituan.retrofit2.http.Header;
import com.sankuai.meituan.retrofit2.http.Headers;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.PUT;
import com.sankuai.meituan.retrofit2.http.Url;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface ReportApiRetrofitService {
    @POST
    @Headers({"Accept-Charset: UTF-8", "Content-Type: application/json;charset=UTF-8"})
    Call<ap> postData(@Url String str, @Body ak akVar, @Header("uuidRequestId") String str2, @Header("uuidSessionId") String str3);

    @POST
    @Headers({"Accept-Charset: UTF-8", "Content-Type: application/json;charset=UTF-8"})
    Call<ap> postIp(@Url String str, @Body ak akVar);

    @Headers({"Accept-Charset: UTF-8", "Content-Type: application/json;charset=UTF-8"})
    @PUT
    Call<ap> putData(@Url String str, @Body ak akVar, @Header("uuidRequestId") String str2, @Header("uuidSessionId") String str3);
}
