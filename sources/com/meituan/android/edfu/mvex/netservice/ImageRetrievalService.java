package com.meituan.android.edfu.mvex.netservice;

import com.meituan.android.edfu.mvex.netservice.entity.imageretrieval.BaseResult;
import com.meituan.android.edfu.mvex.netservice.entity.imageretrieval.Config;
import com.meituan.android.edfu.mvex.netservice.entity.imageretrieval.ImageRetrievalRequest;
import com.meituan.android.edfu.mvex.netservice.entity.imageretrieval.MedicineRetrievalResult;
import com.sankuai.meituan.retrofit2.http.Body;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.Headers;
import com.sankuai.meituan.retrofit2.http.POST;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface ImageRetrievalService {
    @GET("/api/medicine/config")
    rx.d<BaseResult<Config>> getConfig();

    @POST("/api/product/search")
    @Headers({"Content-type:application/json;charset=UTF-8"})
    rx.d<BaseResult<MedicineRetrievalResult>> retrievalImage(@Body ImageRetrievalRequest imageRetrievalRequest);
}
