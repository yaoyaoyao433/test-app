package com.sankuai.waimai.lottie;

import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.Url;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface DownloadService {
    @GET
    rx.d<ap> downloadFile(@Url String str);
}
