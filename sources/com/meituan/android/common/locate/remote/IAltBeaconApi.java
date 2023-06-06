package com.meituan.android.common.locate.remote;

import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.http.Body;
import com.sankuai.meituan.retrofit2.http.POST;
/* loaded from: classes2.dex */
public interface IAltBeaconApi {
    @POST("https://mars.meituan.com/locate/v2/trace/start/download")
    Call<ap> getAltBeaconConfig(@Body ak akVar);
}
