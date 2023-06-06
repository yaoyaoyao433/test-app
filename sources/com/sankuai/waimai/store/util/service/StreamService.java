package com.sankuai.waimai.store.util.service;

import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ae;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.Multipart;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Part;
import com.sankuai.meituan.retrofit2.http.Streaming;
import com.sankuai.meituan.retrofit2.http.Url;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface StreamService {
    @Streaming
    @GET
    Call<ap> getFileResponseBody(@Url String str);

    @POST
    @Multipart
    Call<ap> uploadImage(@Url String str, @Part ae.b bVar);
}
