package com.meituan.android.elderly.retrofit;

import com.meituan.android.elderly.bean.PayResult;
import com.meituan.android.elderly.bean.RouteInfo;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FieldMap;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface CashierRequestService {
    @POST("/cashier/queryorder")
    @FormUrlEncoded
    Call<HashMap<String, Boolean>> queryOrder(@Field("tradeno") String str, @Field("pay_token") String str2, @Field("isauto") String str3, @Field("outer_business_data") String str4, @Field("ext_dim_stat") String str5, @FieldMap HashMap<String, String> hashMap);

    @POST("/cashier/directpay")
    @FormUrlEncoded
    Call<PayResult> startDirectPay(@FieldMap HashMap<String, String> hashMap, @Field("nb_fingerprint") String str, @Field("app_id") String str2, @Field("ext_param") String str3, @Field("guide_plan_infos") String str4, @Field("cashier_type") String str5, @Field("app_display_type") String str6, @Field("outer_business_data") String str7, @Field("ext_dim_stat") String str8, @FieldMap HashMap<String, String> hashMap2);

    @POST("/cashier/dispatcher")
    @FormUrlEncoded
    Call<RouteInfo> startRouting(@Field("tradeno") String str, @Field("pay_token") String str2, @Field("rooted") String str3, @Field("installed_apps") String str4, @Field("callback_url") String str5, @Field("dispatcher_scene") String str6, @Field("nb_fingerprint") String str7, @Field("upsepay_type") String str8, @Field("ext_param") String str9, @Field("guide_plan_infos") String str10, @Field("app_display_type") String str11, @Field("outer_business_data") String str12, @Field("ext_dim_stat") String str13, @FieldMap HashMap<String, String> hashMap);
}
