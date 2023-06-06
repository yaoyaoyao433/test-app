package com.meituan.android.cashier.retrofit;

import com.meituan.android.cashier.bean.CashierRouterInfo;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FieldMap;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface CashierRouterRequestService {
    @POST("node/api/cashier/combinedispatcher")
    @FormUrlEncoded
    Call<CashierRouterInfo> bffNode(@FieldMap Map<String, String> map);

    @POST("cashier/predispatcher")
    @FormUrlEncoded
    Call<CashierRouterInfo> predispatcher(@Field("tradeno") String str, @Field("pay_token") String str2, @Field("clientRouterParam") String str3, @Field("outer_business_data") String str4, @Field("ext_dim_stat") String str5, @Field("app_display_type") String str6, @FieldMap HashMap<String, String> hashMap);
}
