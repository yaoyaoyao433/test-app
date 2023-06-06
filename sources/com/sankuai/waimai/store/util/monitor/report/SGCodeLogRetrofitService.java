package com.sankuai.waimai.store.util.monitor.report;

import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.http.Body;
import com.sankuai.meituan.retrofit2.http.POST;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface SGCodeLogRetrofitService {
    @POST("broker-service/applog")
    Call<Void> codeLog(@Body ak akVar);
}
