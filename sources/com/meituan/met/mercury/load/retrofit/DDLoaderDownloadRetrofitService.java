package com.meituan.met.mercury.load.retrofit;

import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.Header;
import com.sankuai.meituan.retrofit2.http.Streaming;
import com.sankuai.meituan.retrofit2.http.Url;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface DDLoaderDownloadRetrofitService {
    @Streaming
    @GET
    Call<ap> download(@Url String str);

    @Streaming
    @GET
    Call<ap> download(@Url String str, @Header("Range") String str2);
}
