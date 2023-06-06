package com.sankuai.meituan.takeoutnew.ui.page.boot.ad;

import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.Url;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface AdFileDownloadService {
    @GET
    Call<ap> downloadFile(@Url String str);
}
