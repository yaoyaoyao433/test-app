package com.meituan.banma.jarvis.api;

import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.http.FieldMap;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface JarvisApiService {
    @POST("/client/getConfig")
    @FormUrlEncoded
    Call<ap> loadJarvisConfig(@FieldMap Map<String, Object> map);
}
