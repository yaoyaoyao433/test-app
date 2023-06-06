package com.meituan.android.common.locate.remote;

import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.http.Body;
import com.sankuai.meituan.retrofit2.http.POST;
/* loaded from: classes2.dex */
public interface ICollectReportApi {
    @POST("locate/v2/sdk/locationreport")
    Call<ap> reportCollect(@Body ak akVar);
}
