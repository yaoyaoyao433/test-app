package com.meituan.android.recce.shark;

import com.google.gson.JsonElement;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.http.Body;
import com.sankuai.meituan.retrofit2.http.FieldMap;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.HeaderMap;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Path;
import com.sankuai.meituan.retrofit2.http.QueryMap;
import com.sankuai.meituan.retrofit2.http.Url;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface WasaiRequestService {
    @POST("{path}")
    @FormUrlEncoded
    Call<ap> postForm(@Path(encoded = true, value = "path") String str, @QueryMap(encoded = true) Map<String, String> map, @HeaderMap Map<String, String> map2, @FieldMap Map<String, Object> map3);

    @POST
    @FormUrlEncoded
    Call<ap> postFormWithUrl(@Url String str, @QueryMap(encoded = true) Map<String, String> map, @HeaderMap Map<String, String> map2, @FieldMap Map<String, Object> map3);

    @POST("{path}")
    Call<ap> postJson(@Path(encoded = true, value = "path") String str, @QueryMap(encoded = true) Map<String, String> map, @HeaderMap Map<String, String> map2, @Body JsonElement jsonElement);
}
