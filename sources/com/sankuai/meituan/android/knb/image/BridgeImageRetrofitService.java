package com.sankuai.meituan.android.knb.image;

import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ae;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.Header;
import com.sankuai.meituan.retrofit2.http.Multipart;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Part;
import com.sankuai.meituan.retrofit2.http.Path;
import com.sankuai.meituan.retrofit2.http.Url;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface BridgeImageRetrofitService {
    @GET
    Call<ap> download(@Url String str);

    @GET
    Call<VenusSignatureResponse> getVenusToken(@Url String str);

    @POST("extrastorage/new/{bucket}")
    @Multipart
    Call<ImageUploadServiceData> upload(@Path("bucket") String str, @Header("token") String str2, @Header("client-id") String str3, @Part ae.b bVar);

    @POST("extrastorage/{bucket}")
    @Multipart
    Call<ImageUploadServiceData> uploadWithoutToken(@Path("bucket") String str, @Header("time") String str2, @Header("Authorization") String str3, @Part ae.b bVar);
}
