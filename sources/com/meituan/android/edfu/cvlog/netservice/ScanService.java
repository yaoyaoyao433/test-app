package com.meituan.android.edfu.cvlog.netservice;

import com.meituan.android.edfu.cvlog.netservice.bean.ConfigResult;
import com.meituan.android.edfu.cvlog.netservice.bean.ImageResult;
import com.meituan.android.edfu.cvlog.netservice.bean.ImageSaveRequest;
import com.sankuai.meituan.retrofit2.http.Body;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Query;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface ScanService {
    @GET("/api/cvLogConfig")
    rx.d<ConfigResult> getConfig(@Query("project_id") String str, @Query("group_id") String str2);

    @POST("/api/capture")
    rx.d<ImageResult> saveImage(@Body ImageSaveRequest imageSaveRequest);
}
