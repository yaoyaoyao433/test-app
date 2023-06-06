package com.sankuai.meituan.android.knb.upload.retrofit;

import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ae;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.Header;
import com.sankuai.meituan.retrofit2.http.Multipart;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Part;
import com.sankuai.meituan.retrofit2.http.Path;
import com.sankuai.meituan.retrofit2.http.Query;
import com.sankuai.meituan.retrofit2.http.Url;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface DefaultUploadFileRetrofitService {
    @GET
    Call<SecureTokenResponse> getSecureToken(@Url String str, @Query("clientId") String str2, @Query("clientSecret") String str3, @Query("url") String str4, @Query("maxAge") int i);

    @GET
    Call<VenusTokenResponse> getVenusToken(@Url String str, @Query("bucket") String str2, @Query("clientId") String str3, @Query("clientSecret") String str4);

    @POST("extrastorage/new/{bucket}")
    @Multipart
    Call<DefaultUploadFileResponse> upload(@Path("bucket") String str, @Header("token") String str2, @Header("client-id") String str3, @Part ae.b bVar);

    @POST("extrastorage/new/{bucket}")
    @Multipart
    Call<DefaultUploadFileResponse> upload(@Path("bucket") String str, @Header("token") String str2, @Header("client-id") String str3, @Part ae.b bVar, @Query("type") String str4);

    @POST("extrastorage/{bucket}")
    @Multipart
    Call<DefaultUploadFileResponse> uploadWithoutToken(@Path("bucket") String str, @Header("time") String str2, @Header("Authorization") String str3, @Part ae.b bVar);

    @POST("extrastorage/{bucket}")
    @Multipart
    Call<DefaultUploadFileResponse> uploadWithoutToken(@Path("bucket") String str, @Header("time") String str2, @Header("Authorization") String str3, @Part ae.b bVar, @Query("type") String str4);
}
