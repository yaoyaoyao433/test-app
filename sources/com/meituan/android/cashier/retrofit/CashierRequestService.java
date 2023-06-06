package com.meituan.android.cashier.retrofit;

import com.meituan.android.cashier.model.bean.MTPaymentURL;
import com.meituan.android.cashier.model.bean.OrderResult;
import com.meituan.android.cashier.model.bean.PayResult;
import com.meituan.android.cashier.model.bean.RouteInfo;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FieldMap;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Path;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface CashierRequestService {
    @POST("{path}")
    @FormUrlEncoded
    Call<MTPaymentURL> goHelloPay(@Path(encoded = true, value = "path") String str, @FieldMap HashMap<String, String> hashMap, @Field("nb_fingerprint") String str2);

    @POST("/cashier/gohellopay")
    @FormUrlEncoded
    Call<MTPaymentURL> goHelloPay(@FieldMap HashMap<String, String> hashMap);

    @POST("/cashier/queryorder")
    @FormUrlEncoded
    Call<OrderResult> queryOrder(@Field("tradeno") String str, @Field("pay_token") String str2, @Field("isauto") String str3, @Field("outer_business_data") String str4, @Field("ext_dim_stat") String str5, @FieldMap HashMap<String, String> hashMap);

    @POST("/cashier/actioninfo")
    @FormUrlEncoded
    Call<PayResult> saveActionInfo(@FieldMap HashMap<String, Object> hashMap);

    @POST("/cashier/limitguidewxnpopen")
    @FormUrlEncoded
    Call<Boolean> sendWxnpAction(@Field("tradeno") String str, @Field("pay_token") String str2, @Field("type") String str3, @Field("nb_fingerprint") String str4);

    @POST("/cashier/directpay")
    @FormUrlEncoded
    Call<PayResult> startDirectPay(@FieldMap HashMap<String, String> hashMap, @Field("nb_fingerprint") String str, @Field("app_id") String str2, @Field("ext_param") String str3, @Field("guide_plan_infos") String str4, @Field("cashier_type") String str5, @Field("outer_business_data") String str6, @Field("ext_dim_stat") String str7, @FieldMap HashMap<String, String> hashMap2);

    @POST("/cashier/dispatcher")
    @FormUrlEncoded
    Call<RouteInfo> startRouting(@Field("tradeno") String str, @Field("pay_token") String str2, @Field("rooted") String str3, @Field("installed_apps") String str4, @Field("callback_url") String str5, @Field("dispatcher_scene") String str6, @Field("nb_fingerprint") String str7, @Field("upsepay_type") String str8, @Field("ext_param") String str9, @Field("guide_plan_infos") String str10, @Field("outer_business_data") String str11, @Field("ext_dim_stat") String str12, @FieldMap HashMap<String, String> hashMap);

    @POST("{path}")
    @FormUrlEncoded
    Call<Object> startTransGuide(@Path(encoded = true, value = "path") String str, @Field("tradeno") String str2, @Field("pay_token") String str3, @Field("with_contract") String str4, @Field("nb_fingerprint") String str5);
}
