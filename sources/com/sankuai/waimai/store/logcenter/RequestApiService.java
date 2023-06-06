package com.sankuai.waimai.store.logcenter;

import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.http.Body;
import com.sankuai.meituan.retrofit2.http.Headers;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Url;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface RequestApiService {
    @POST
    @Headers({"Accept: application/json", "Content-Type: application/x-www-form-urlencoded"})
    Call<Void> reportLog(@Url String str, @Body ak akVar);
}
