package com.dianping.titans.js.jshandler;

import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.http.Body;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.QueryMap;
import com.sankuai.meituan.retrofit2.http.Url;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface Api {
    @GET
    Call<BridgeAccessResult> bridgeAccess(@Url String str, @QueryMap(encoded = true) Map<String, String> map);

    @GET
    Call<ap> load(@Url String str);

    @POST
    Call<ap> postJSON(@Url String str, @Body JSONObject jSONObject);
}
