package com.meituan.android.common.locate.remote;

import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.http.Body;
import com.sankuai.meituan.retrofit2.http.Headers;
import com.sankuai.meituan.retrofit2.http.POST;
/* loaded from: classes2.dex */
public interface IBLEInfoReportApi {
    @POST("mk/v2/sdk/error")
    @Headers({"gzipped:1"})
    Call<ap> send2BLEInfo(@Body ak akVar);
}
