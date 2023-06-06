package com.meituan.android.yoda.network.retrofit;

import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import com.meituan.android.yoda.bean.YodaResult;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ae;
import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FieldMap;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.Headers;
import com.sankuai.meituan.retrofit2.http.Multipart;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Part;
import com.sankuai.meituan.retrofit2.http.Path;
import com.sankuai.meituan.retrofit2.http.Query;
import com.sankuai.meituan.retrofit2.http.Url;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface YodaApiRetrofitService {
    @POST("mtgsig/v2/api/login/authorize")
    @FormUrlEncoded
    Call<YodaResult> authorize(@Field("riskLevel") String str, @Field("uuid") String str2, @Field("ip") String str3, @Field("platform") int i, @Field("partner") int i2, @Field("ua") String str4, @Field("version") String str5, @Field("app") int i3, @Field("user") String str6, @Field("succCallbackUrl") String str7, @Field("mobile") String str8, @Field("autoSend") String str9, @Field("theme") String str10, @Field("accountSystem") int i4, @Field("sequenceId") String str11, @Field("needInput") String str12, @Field("isVoiceAndSMSBanded") String str13);

    @POST("/v2/api/{action}/authorize")
    @FormUrlEncoded
    Call<YodaResult> authorize(@Path("action") String str, @FieldMap Map<String, String> map);

    @GET("mtgsig/v2/captcha")
    @Headers({"retrofit-mt-request-timeout:3000"})
    Call<Bitmap> captcha(@Query("request_code") @NonNull String str, @Query("action") String str2, @Query("feVersion") String str3);

    @GET
    Call<Bitmap> getBitmap(@Url String str);

    @POST("mtgsig/v2/ext_api/page_data")
    @FormUrlEncoded
    @Headers({"retrofit-mt-request-timeout:3000"})
    Call<YodaResult> getPageData(@Field("requestCode") String str, @Field("fingerprint") String str2, @Field("source") int i, @Field("feVersion") String str3);

    @POST("mtgsig/v2/ext_api/{action}/{job}")
    @Multipart
    Call<YodaResult> yodaRequest(@Path("action") String str, @Path("job") String str2, @Part ae.b bVar, @Part List<ae.b> list);

    @POST("mtgsig/v2/ext_api/{action}/{job}")
    @FormUrlEncoded
    @Headers({"retrofit-mt-request-timeout:6000"})
    Call<YodaResult> yodaRequest(@Path("action") String str, @Path("job") String str2, @FieldMap Map<String, String> map);
}
