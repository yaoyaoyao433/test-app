package com.meituan.android.pay.desk.retrofit;

import com.meituan.android.pay.common.promotion.bean.PromotionRefreshment;
import com.meituan.android.pay.desk.payment.bean.standarddesk.RefreshInstallment;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FieldMap;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface PayDeskRequestService {
    @POST("/qdbdisplay/querycreditpayinstallment")
    @FormUrlEncoded
    Call<RefreshInstallment> halfPageRefreshInstallment(@Field("trans_id") String str, @Field("pay_token") String str2, @Field("pay_type") String str3, @Field("installment_info") String str4, @Field("selected_promo_info") String str5, @Field("nb_fingerprint") String str6, @Field("outer_business_data") String str7, @Field("ext_dim_stat") String str8, @FieldMap HashMap<String, String> hashMap);

    @POST("/qdbdisplay/promotioncalculate")
    @FormUrlEncoded
    Call<PromotionRefreshment> promotionCalculate(@Field("pay_type") String str, @Field("cashier_type") String str2, @Field("trans_id") String str3, @FieldMap HashMap<String, Object> hashMap);

    @POST("/cashier/queryinstallmentinfo")
    @FormUrlEncoded
    Call<RefreshInstallment> refreshInstallment(@Field("tradeno") String str, @Field("pay_token") String str2, @Field("pay_type") String str3, @Field("installment_info") String str4, @Field("selected_promo_info") String str5, @Field("nb_fingerprint") String str6, @Field("outer_business_data") String str7, @Field("ext_dim_stat") String str8, @FieldMap HashMap<String, String> hashMap);
}
