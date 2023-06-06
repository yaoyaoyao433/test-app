package com.sankuai.meituan.mapfoundation.starship;

import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.http.Body;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.HeaderMap;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.QueryMap;
import com.sankuai.meituan.retrofit2.http.Url;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IStarShipAPI {
    @GET
    Call<ap> get(@Url String str, @HeaderMap Map<String, Object> map, @QueryMap Map<String, Object> map2);

    @POST
    Call<ap> post(@Url String str, @HeaderMap Map<String, Object> map, @QueryMap Map<String, Object> map2, @Body ak akVar);
}
