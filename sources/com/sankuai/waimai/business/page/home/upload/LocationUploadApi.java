package com.sankuai.waimai.business.page.home.upload;

import com.sankuai.meituan.retrofit2.http.POST;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface LocationUploadApi {
    @POST("v6/marketinginfo/upload")
    d<LocationUploadResponse> uploadLocation();
}
