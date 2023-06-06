package com.meituan.android.common.statistics.network;

import com.meituan.android.common.statistics.network.NetworkController;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.http.Body;
import com.sankuai.meituan.retrofit2.http.Headers;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Url;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface ReportApiRetrofitService {
    @POST
    @Headers({"Accept-Charset: UTF-8", "Content-Type: application/json;charset=UTF-8", "Content-Encoding:gzip"})
    Call<NetworkController.RealResponse> postData(@Url String str, @Body ak akVar);

    @POST
    @Headers({"Accept-Charset: UTF-8", "Content-Type: application/json;charset=UTF-8", "Content-Encoding:gzip", "retrofit-mt-request-timeout:5000"})
    Call<NetworkController.RealResponse> postQuickData(@Url String str, @Body ak akVar);
}
