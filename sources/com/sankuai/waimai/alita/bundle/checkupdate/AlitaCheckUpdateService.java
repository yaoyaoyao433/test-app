package com.sankuai.waimai.alita.bundle.checkupdate;

import com.sankuai.meituan.retrofit2.http.Body;
import com.sankuai.meituan.retrofit2.http.Headers;
import com.sankuai.meituan.retrofit2.http.POST;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface AlitaCheckUpdateService {
    @POST("/appupdate/alita/checkUpdate")
    @Headers({"post-fail-over:true"})
    d<AlitaCheckUpdateResponse> checkUpdate(@Body AlitaCheckUpdateParam alitaCheckUpdateParam);
}
