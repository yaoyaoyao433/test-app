package com.sankuai.waimai.mach.manager_new.config;

import com.sankuai.meituan.retrofit2.http.Body;
import com.sankuai.meituan.retrofit2.http.Headers;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.mach.manager.download.update.MachUpdateRequest;
import com.sankuai.waimai.mach.manager.download.update.UpdateResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface _MachUpdateService {
    @POST("/appupdate/mach/checkUpdate")
    @Headers({"post-fail-over:true"})
    d<UpdateResponse> checkUpdate(@Body MachUpdateRequest machUpdateRequest);
}
