package com.meituan.android.common.statistics.network;

import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.Headers;
import com.sankuai.meituan.retrofit2.http.Streaming;
import com.sankuai.meituan.retrofit2.http.Url;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface OceanBlackService {
    @Streaming
    @GET
    @Headers({"Content-Encoding:gzip"})
    Call<ap> downloadBlackFile(@Url String str);

    @GET
    @Headers({"Accept-Charset: UTF-8", "Content-Type: application/json;charset=UTF-8"})
    Call<ap> getBlackConfig(@Url String str);
}
