package com.sankuai.waimai.business.page.home.weather;

import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.Origin;
import com.sankuai.meituan.retrofit2.http.Url;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface TemplateDownloadService {
    @GET
    d<ap> downloadFile(@Url String str, @Origin com.sankuai.meituan.retrofit2.d dVar);
}
