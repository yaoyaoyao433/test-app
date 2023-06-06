package com.meituan.android.cashier.oneclick.retrofit;

import com.meituan.android.cashier.oneclick.model.bean.OneClickPay;
import com.meituan.android.cashier.oneclick.model.bean.OneClickPayOrderState;
import com.meituan.android.cashier.oneclick.model.bean.OneClickPayRouteInfo;
import com.meituan.android.cashier.oneclick.model.bean.OpenOneClickPay;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FieldMap;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.Header;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Path;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface OneClickRequestService {
    @POST("{path}")
    @FormUrlEncoded
    Call<ap> adjustOneClickPay(@Path(encoded = true, value = "path") String str, @FieldMap HashMap<String, String> hashMap, @Header("retrofit-mt-request-timeout") long j);

    @POST("{path}")
    @FormUrlEncoded
    Call<OneClickPay> oneClickPay(@Path(encoded = true, value = "path") String str, @Field("tradeno") String str2, @Field("pay_token") String str3, @Field("verify_token") String str4, @Field("ext_param") String str5, @Field("outer_business_data") String str6, @Field("ext_dim_stat") String str7, @Header("retrofit-mt-request-timeout") long j, @FieldMap HashMap<String, String> hashMap);

    @POST("{path}")
    @FormUrlEncoded
    Call<OneClickPayOrderState> oneClickPayQuery(@Path(encoded = true, value = "path") String str, @Field("tradeno") String str2, @Field("pay_token") String str3, @Field("ext_param") String str4, @Field("outer_business_data") String str5, @Field("ext_dim_stat") String str6, @Header("retrofit-mt-request-timeout") long j, @FieldMap HashMap<String, String> hashMap);

    @POST("/cashier/oneclickpaydispatcher")
    @FormUrlEncoded
    Call<OneClickPayRouteInfo> oneClickPayRoute(@Field("tradeno") String str, @Field("pay_token") String str2, @Field("oneClickPayOpenStatus") int i, @Field("serialCode") String str3, @Field("ext_param") String str4, @Field("outer_business_data") String str5, @Field("ext_dim_stat") String str6, @Header("retrofit-mt-request-timeout") long j, @FieldMap HashMap<String, String> hashMap);

    @POST("{path}")
    @FormUrlEncoded
    Call<OpenOneClickPay> openAndAdjustOneClickPay(@Path(encoded = true, value = "path") String str, @FieldMap HashMap<String, String> hashMap, @Header("retrofit-mt-request-timeout") long j);

    @POST("{path}")
    @FormUrlEncoded
    Call<OpenOneClickPay> openOneClickPay(@Path(encoded = true, value = "path") String str, @Field("scene") int i, @Field("serialCode") String str2, @Field("openType") String str3, @Field("creditPayUtmSource") String str4, @Field("verifyToken") String str5, @Field("nb_fingerprint") String str6, @Field("outer_business_data") String str7, @Field("ext_dim_stat") String str8, @Header("retrofit-mt-request-timeout") long j, @FieldMap HashMap<String, String> hashMap);
}
