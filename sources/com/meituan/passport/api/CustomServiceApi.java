package com.meituan.passport.api;

import com.meituan.passport.pojo.CustomServiceUrl;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.http.FieldMap;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.Header;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Path;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface CustomServiceApi {
    @POST("api/url/{appKey}")
    @FormUrlEncoded
    Call<CustomServiceUrl> getCustomServiceUrl(@Path("appKey") String str, @Header("accessToken") String str2, @FieldMap Map<String, Object> map);
}
