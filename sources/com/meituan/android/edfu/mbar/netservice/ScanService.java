package com.meituan.android.edfu.mbar.netservice;

import com.meituan.android.edfu.mbar.netservice.bean.BaseResult;
import com.meituan.android.edfu.mbar.netservice.bean.CodeResult;
import com.meituan.android.edfu.mbar.netservice.bean.ImageScanRequest;
import com.sankuai.meituan.retrofit2.http.Body;
import com.sankuai.meituan.retrofit2.http.Headers;
import com.sankuai.meituan.retrofit2.http.POST;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface ScanService {
    @POST("/api/certification/validate")
    @Headers({"Content-type:application/json;charset=UTF-8"})
    rx.d<BaseResult<CodeResult>> scanCodeImage(@Body ImageScanRequest imageScanRequest);
}
