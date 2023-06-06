package com.meituan.android.mrn.network;

import com.google.gson.JsonElement;
import com.meituan.android.common.unionid.oneid.network.OneIdNetworkTool;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ae;
import com.sankuai.meituan.retrofit2.http.Body;
import com.sankuai.meituan.retrofit2.http.DELETE;
import com.sankuai.meituan.retrofit2.http.FieldMap;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.HTTP;
import com.sankuai.meituan.retrofit2.http.HeaderMap;
import com.sankuai.meituan.retrofit2.http.Multipart;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Part;
import com.sankuai.meituan.retrofit2.http.QueryMap;
import com.sankuai.meituan.retrofit2.http.Url;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface MRNApiRetrofitService {
    @DELETE
    Call<JsonElement> deleteRequest(@HeaderMap Map<String, String> map, @Url String str, @QueryMap Map<String, Object> map2);

    @GET
    Call<JsonElement> getRequest(@HeaderMap Map<String, String> map, @Url String str, @QueryMap Map<String, Object> map2);

    @POST
    @FormUrlEncoded
    Call<JsonElement> postFormRequest(@HeaderMap Map<String, String> map, @Url String str, @QueryMap Map<String, Object> map2, @FieldMap Map<String, Object> map3);

    @POST
    Call<JsonElement> postJsonRequest(@HeaderMap Map<String, String> map, @Url String str, @QueryMap Map<String, Object> map2, @Body Map<String, Object> map3);

    @POST
    @Multipart
    Call<JsonElement> postMultiPartRequest(@HeaderMap Map<String, String> map, @Url String str, @QueryMap Map<String, Object> map2, @Part List<ae.b> list);

    @HTTP(hasBody = true, method = OneIdNetworkTool.PUT)
    Call<JsonElement> putRequest(@HeaderMap Map<String, String> map, @Url String str, @QueryMap Map<String, Object> map2, @Body Map<String, Object> map3);
}
