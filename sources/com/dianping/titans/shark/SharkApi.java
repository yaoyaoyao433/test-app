package com.dianping.titans.shark;

import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.http.Body;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.Header;
import com.sankuai.meituan.retrofit2.http.HeaderMap;
import com.sankuai.meituan.retrofit2.http.OPTIONS;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Url;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface SharkApi {
    @GET
    Call<ap> doGet(@Url String str, @Header("Cookie") String str2);

    @POST
    Call<ap> doPost(@Url String str, @Header("Content-Type") String str2, @Header("Cookie") String str3, @Body String str4);

    @POST
    Call<ap> doPost(@Url String str, @Header("Content-Type") String str2, @Header("Cookie") String str3, @Body JSONObject jSONObject);

    @GET
    Call<ap> get(@Url String str, @HeaderMap Map<String, String> map);

    @OPTIONS
    Call<ap> options(@Url String str, @HeaderMap Map<String, String> map);

    @POST
    Call<ap> post(@Url String str, @HeaderMap Map<String, String> map, @Body ak akVar);
}
