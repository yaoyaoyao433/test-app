package com.sankuai.eh.component.service.network;

import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ae;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.http.Body;
import com.sankuai.meituan.retrofit2.http.FieldMap;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.HeaderMap;
import com.sankuai.meituan.retrofit2.http.Multipart;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Part;
import com.sankuai.meituan.retrofit2.http.PartMap;
import com.sankuai.meituan.retrofit2.http.Path;
import com.sankuai.meituan.retrofit2.http.QueryMap;
import com.sankuai.meituan.retrofit2.http.Url;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface EHNetService {
    @GET
    Call<ap> callDynamic(@Url String str, @QueryMap HashMap<String, String> hashMap);

    @GET
    Call<ap> callDynamic(@Url String str, @HeaderMap HashMap<String, String> hashMap, @QueryMap HashMap<String, String> hashMap2);

    @GET
    Call<ap> callDynamic(@Url String str, @QueryMap Map<String, Object> map);

    @GET("config/package/{path}")
    Call<ap> callEHConfig(@Path(encoded = true, value = "path") String str, @QueryMap HashMap<String, String> hashMap);

    @GET("files/{path}")
    Call<ap> callEHFiles(@Path(encoded = true, value = "path") String str, @QueryMap HashMap<String, String> hashMap);

    @GET("skeleton/test/unit")
    Call<ap> callJunit(@QueryMap HashMap<String, String> hashMap);

    @GET("api/skeleton/get")
    Call<ap> callPlayGround(@QueryMap HashMap<String, String> hashMap);

    @GET("skeleton/package/{path}")
    Call<ap> callSkeletons(@Path(encoded = true, value = "path") String str, @QueryMap HashMap<String, String> hashMap);

    @GET
    Call<ap> getData(@Url String str, @HeaderMap Map<String, String> map);

    @POST
    @FormUrlEncoded
    Call<ap> postForm(@Url String str, @HeaderMap Map<String, String> map, @FieldMap Map<String, String> map2);

    @POST
    @Multipart
    Call<ap> postFormData(@Url String str, @HeaderMap Map<String, String> map, @PartMap Map<String, ak> map2);

    @POST
    Call<ap> postJson(@Url String str, @HeaderMap Map<String, String> map, @Body ak akVar);

    @POST
    @Multipart
    Call<ap> upload2Venus(@Url String str, @HeaderMap HashMap<String, String> hashMap, @Part ae.b bVar);
}
