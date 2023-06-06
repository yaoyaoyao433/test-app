package com.meituan.passport.api;

import com.meituan.passport.pojo.User;
import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FieldMap;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Query;
import java.util.Map;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface OperatorApi {
    @POST("v1/login/onekey/chinamobile")
    @FormUrlEncoded
    d<User> chinamobileLogin(@Field("access_token") String str, @Query("uuid") String str2, @Field("fingerprint") String str3, @Field("appid") String str4, @Field("request_code") String str5, @Field("response_code") String str6, @Field("ticket") String str7, @FieldMap Map<String, Object> map);

    @POST("v1/login/onekey/chinatelecom")
    @FormUrlEncoded
    d<User> chinatelecomLogin(@Field("access_token") String str, @Query("uuid") String str2, @Field("fingerprint") String str3, @Field("appid") String str4, @Field("request_code") String str5, @Field("response_code") String str6, @Field("ticket") String str7, @FieldMap Map<String, Object> map);

    @POST("v1/login/onekey/chinaunicom")
    @FormUrlEncoded
    d<User> chinaunicomLogin(@Field("access_token") String str, @Query("uuid") String str2, @Field("fingerprint") String str3, @Field("client_id") String str4, @Field("request_code") String str5, @Field("response_code") String str6, @Field("ticket") String str7, @FieldMap Map<String, Object> map);
}
