package com.sankuai.waimai.store.widgets.lottie;

import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.Url;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface FileDownloadService {
    @GET
    Call<ap> downloadFile(@Url String str);
}
