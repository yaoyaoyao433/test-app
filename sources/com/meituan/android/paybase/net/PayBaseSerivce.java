package com.meituan.android.paybase.net;

import com.meituan.android.paybase.encrypt.Encrypt;
import com.meituan.android.paybase.fingerprint.bean.FingerprintVerifyResult;
import com.meituan.android.paybase.fingerprint.bean.UpLoadSoterKeyResult;
import com.meituan.android.paybase.password.verifypassword.PasswordVerifyResult;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FieldMap;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Path;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface PayBaseSerivce {
    @POST("/hellopay/uploadcardimg")
    @FormUrlEncoded
    Call<Object> uploadCardPic(@FieldMap HashMap<String, String> hashMap, @Field("nb_fingerprint") String str);

    @POST("{path}")
    @FormUrlEncoded
    Call<UpLoadSoterKeyResult> uploadSoterKey(@Path(encoded = true, value = "path") String str, @Encrypt @FieldMap HashMap<String, String> hashMap, @Encrypt @FieldMap Map<String, String> map, @Encrypt @Field("nb_fingerprint") String str2);

    @POST("/qdbverify/publicverify")
    @FormUrlEncoded
    Call<FingerprintVerifyResult> verifyFingerprint(@Encrypt @FieldMap HashMap<String, String> hashMap, @Encrypt @Field("verify_type") String str, @Field("merchantNo") String str2, @Field("verifyNo") String str3, @Field("orderNo") String str4, @Field("scene") String str5, @Field("risk_partnerid") String str6, @Encrypt @Field("finger_type") String str7, @Encrypt @Field("challenge") String str8, @Encrypt @FieldMap HashMap<String, String> hashMap2);

    @POST("/qdbverify/publicverify")
    @FormUrlEncoded
    Call<PasswordVerifyResult> verifyIdentifyVarPassword(@Encrypt @Field("pay_password") String str, @Encrypt @Field("verify_type") String str2, @Field("merchantNo") String str3, @Field("verifyNo") String str4, @Field("risk_partnerid") String str5, @Field("orderNo") String str6, @Field("scene") String str7, @Encrypt @FieldMap HashMap<String, String> hashMap);
}
