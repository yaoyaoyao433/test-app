package com.meituan.android.pay.retrofit;

import com.google.gson.JsonObject;
import com.meituan.android.pay.model.bean.BankInfo;
import com.meituan.android.pay.model.bean.CardBinTip;
import com.meituan.android.pay.model.bean.SMSCodeResult;
import com.meituan.android.paybase.encrypt.Encrypt;
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
public interface PayRequestService {
    @POST("{path}")
    @FormUrlEncoded
    Call<CardBinTip> getCardBinTip(@Path(encoded = true, value = "path") String str, @Field("cardbin") String str2, @Encrypt @FieldMap Map<String, String> map, @Field("nb_source") String str3, @Field("nb_fingerprint") String str4);

    @POST("/qdbpay/prepayroute")
    @FormUrlEncoded
    Call<BankInfo> prepayroute(@Encrypt @FieldMap Map<String, String> map);

    @POST("/cashier/queryorder")
    @FormUrlEncoded
    Call<JsonObject> queryOrder(@Field("tradeno") String str, @Field("pay_token") String str2, @Field("isauto") String str3, @Field("outer_business_data") String str4, @Field("ext_dim_stat") String str5, @FieldMap HashMap<String, String> hashMap);

    @POST("{path}")
    @FormUrlEncoded
    Call<SMSCodeResult> sendSMSCode(@Path(encoded = true, value = "path") String str, @Encrypt @FieldMap Map<String, String> map, @Encrypt @FieldMap HashMap<String, String> hashMap, @Encrypt @Field("extra_data") String str2, @Field("nb_source") String str3, @Field("nb_fingerprint") String str4);

    @POST("{path}")
    @FormUrlEncoded
    Call<BankInfo> startHelloPayRequest(@Path(encoded = true, value = "path") String str, @Encrypt @FieldMap Map<String, String> map, @FieldMap HashMap<String, String> hashMap, @Encrypt @FieldMap HashMap<String, String> hashMap2, @Field("nb_source") String str2, @Field("nb_fingerprint") String str3);

    @POST("{path}")
    @FormUrlEncoded
    Call<BankInfo> startMTPayRequest(@Path(encoded = true, value = "path") String str, @Encrypt @FieldMap Map<String, String> map, @Encrypt @FieldMap HashMap<String, String> hashMap, @Encrypt @Field("has_touchid") String str2, @Encrypt @Field("extra_data") String str3, @Field("nb_source") String str4, @Field("nb_fingerprint") String str5);

    @POST("{path}")
    @FormUrlEncoded
    Call<BankInfo> startNoPassPayRequest(@Path(encoded = true, value = "path") String str, @Field("confirm_nopasswordpay") String str2, @Field("nomore_nopasswordpay_confirm") String str3, @Encrypt @FieldMap Map<String, String> map, @Field("nb_source") String str4, @Field("nb_fingerprint") String str5);
}
