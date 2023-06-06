package com.sankuai.waimai.platform.machpro.module;

import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.http.Body;
import com.sankuai.meituan.retrofit2.http.FieldMap;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.HeaderMap;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.QueryMap;
import com.sankuai.meituan.retrofit2.http.Url;
import java.util.Map;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface MPRequestApi {
    @GET
    d<ap> get(@Url String str, @QueryMap Map<String, Object> map, @HeaderMap Map<String, Object> map2);

    @POST
    d<ap> post(@Url String str, @Body ak akVar, @QueryMap Map<String, Object> map, @HeaderMap Map<String, Object> map2);

    @POST
    @FormUrlEncoded
    d<ap> post(@Url String str, @QueryMap Map<String, Object> map, @FieldMap Map<String, Object> map2, @HeaderMap Map<String, Object> map3);

    @POST
    @FormUrlEncoded
    d<ap> postWmApi(@Url String str, @QueryMap Map<String, Object> map, @FieldMap Map<String, Object> map2, @HeaderMap Map<String, Object> map3);
}
