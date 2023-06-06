package com.meituan.android.common.statistics.network;

import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.Headers;
import com.sankuai.meituan.retrofit2.http.QueryMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface ConfigApiRetrofitService {
    @GET("path")
    @Headers({"Accept-Charset: UTF-8", "Content-Type: application/json;charset=UTF-8"})
    Call<ap> getConfig(@QueryMap Map<String, String> map);
}
