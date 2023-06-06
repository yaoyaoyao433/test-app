package com.sankuai.meituan.bundle.service;

import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.Streaming;
import com.sankuai.meituan.retrofit2.http.Url;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface DownloadService {
    @Streaming
    @GET
    Call<ap> download(@Url String str);
}
