package com.meituan.android.yoda.network.retrofit;

import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.Headers;
import com.sankuai.meituan.retrofit2.http.QueryMap;
import com.sankuai.meituan.retrofit2.http.Url;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface MtsiApiRetrofitService {
    @GET
    @Headers({"retrofit-mt-request-timeout:5000"})
    Call<ap> mtsiVerify(@Url String str, @QueryMap Map<String, String> map);
}
