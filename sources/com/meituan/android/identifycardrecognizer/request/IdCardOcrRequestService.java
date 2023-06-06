package com.meituan.android.identifycardrecognizer.request;

import com.meituan.android.identifycardrecognizer.bean.AuthenticationResult;
import com.meituan.android.identifycardrecognizer.bean.ImageOcrResult;
import com.meituan.android.identifycardrecognizer.bean.UploadImgResult;
import com.meituan.android.paybase.encrypt.Encrypt;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FieldMap;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface IdCardOcrRequestService {
    @POST("/conch/auth/authenticate")
    @FormUrlEncoded
    Call<AuthenticationResult> authenticate(@Field("frontImgUrl") String str, @Field("backImgUrl") String str2, @FieldMap HashMap<String, String> hashMap);

    @POST("/conch/auth/imageOcr")
    @FormUrlEncoded
    Call<ImageOcrResult> imageOcr(@Field("imageType") String str, @Field("bizId") int i, @Field("imageUrl1") String str2, @Field("imageUrl2") String str3, @Field("customId") long j, @Field("encrypt_params") String str4);

    @POST("/conch/auth/uploadHandheldImg")
    @FormUrlEncoded
    Call<UploadImgResult> uploadHandheldImg(@Encrypt @Field("imgB64") String str, @FieldMap HashMap<String, String> hashMap);

    @POST("/conch/auth/uploadIDImg")
    @FormUrlEncoded
    Call<UploadImgResult> uploadIDImg(@Encrypt @Field("imgB64") String str, @FieldMap HashMap<String, String> hashMap);

    @POST("/conch/auth/uploadImages")
    @FormUrlEncoded
    Call<UploadImgResult> uploadImages(@Field("imageType") String str, @Field("bizId") int i, @Encrypt @Field("imgB64") String str2);
}
