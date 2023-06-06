package com.sankuai.waimai.business.restaurant.poicontainer.dynamic.net;

import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.Url;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface FileDownloadApi {
    @GET
    Call<ap> downloadFile(@Url String str);
}
