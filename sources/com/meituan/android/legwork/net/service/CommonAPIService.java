package com.meituan.android.legwork.net.service;

import com.meituan.android.legwork.bean.DpShopUnderTakePageBean;
import com.meituan.android.legwork.bean.PayBean;
import com.meituan.android.legwork.bean.PayCashierBean;
import com.meituan.android.legwork.bean.PayTypeBean;
import com.meituan.android.legwork.bean.TipSubmitBean;
import com.meituan.android.legwork.bean.UserHintBean;
import com.meituan.android.legwork.bean.address.DeliveryPlaceBean;
import com.meituan.android.legwork.bean.address.MtRevGeoBean;
import com.meituan.android.legwork.bean.address.SmallGrainRegeoBean;
import com.meituan.android.legwork.bean.im.IMInitializeData;
import com.meituan.android.legwork.bean.im.RiderImBean;
import com.meituan.android.legwork.bean.im.insertmassage.ImInsertMessageView;
import com.meituan.android.legwork.bean.orderDetail.PrivacyPhoneBean;
import com.meituan.android.legwork.net.response.BaseEntity;
import com.meituan.android.legwork.net.response.MapBaseEntity;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FieldMap;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.Headers;
import com.sankuai.meituan.retrofit2.http.POST;
import java.util.List;
import java.util.Map;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface CommonAPIService {
    @POST("v1/balance/payment")
    @FormUrlEncoded
    @Headers({"Legwork-Fingerprint: true"})
    d<BaseEntity<PayBean>> balancePayment(@Field("orderViewId") String str);

    @POST("v1/client/config")
    d<BaseEntity<Object>> getClientConfig();

    @POST("v1/poi/dpShop/underTakePage")
    @FormUrlEncoded
    d<BaseEntity<DpShopUnderTakePageBean>> getDpUnderTakePage(@Field("mtPoiId") String str);

    @POST("v1/im/getImInsertMessageList")
    @FormUrlEncoded
    d<BaseEntity<List<ImInsertMessageView>>> getImInsertMessageList(@Field("orderViewId") String str);

    @POST("v2/im/getInitializeData")
    @FormUrlEncoded
    d<BaseEntity<IMInitializeData>> getInitializeData(@Field("orderViewId") String str);

    @POST("v1/coupon/luckyPoster")
    @FormUrlEncoded
    d<ap> getLuckyPoster(@Field("orderViewId") String str);

    @POST("v1/balance/cashier")
    @FormUrlEncoded
    @Headers({"Legwork-Fingerprint: true"})
    d<BaseEntity<PayCashierBean>> getPayCashierInfo(@Field("orderViewId") String str);

    @POST("v1/order/payment")
    @FormUrlEncoded
    @Headers({"Legwork-Fingerprint: true"})
    d<BaseEntity<PayBean>> getPayParams(@Field("orderViewId") String str);

    @POST("v2/balance/payTypePop")
    @FormUrlEncoded
    @Headers({"Legwork-Fingerprint: true"})
    d<BaseEntity<PayTypeBean>> getPayTypeInfo(@FieldMap Map<String, Object> map);

    @POST("v1/im/getRiderImId")
    @FormUrlEncoded
    d<BaseEntity<RiderImBean>> getRiderImId(@Field("orderViewId") String str);

    @POST("v2/order/getRiderPrivacyPhone")
    @FormUrlEncoded
    d<BaseEntity<PrivacyPhoneBean>> getRiderPrivacyPhone(@Field("orderViewId") String str);

    @POST("v1/address/queryDeliveryPlace")
    @FormUrlEncoded
    d<BaseEntity<DeliveryPlaceBean>> querySupportDeliveryPlace(@FieldMap Map<String, Object> map);

    @POST("v1/map/regeo")
    @FormUrlEncoded
    d<BaseEntity<MapBaseEntity<MtRevGeoBean>>> regeo(@Field("location") String str);

    @POST("v2/report/metrics")
    @FormUrlEncoded
    d<BaseEntity<String>> reportMetrics(@Field("metrics") String str);

    @POST("v1/map/searchAddress")
    @FormUrlEncoded
    d<BaseEntity<SmallGrainRegeoBean>> smallGrainRegeo(@Field("location") String str);

    @POST("v1/order/modifySubmit")
    @FormUrlEncoded
    d<BaseEntity<TipSubmitBean>> submitOrderModifyInfo(@FieldMap Map<String, Object> map);

    @POST("v1/tipfee/submit")
    @FormUrlEncoded
    d<BaseEntity<TipSubmitBean>> submitTip(@Field("orderViewId") String str, @Field("orderToken") String str2, @Field("pushToken") String str3, @Field("tipFee") double d, @Field("payType") int i);

    @POST("v2/order/updateBindPhone")
    @FormUrlEncoded
    d<BaseEntity<PrivacyPhoneBean>> updateBindPhone(@Field("orderViewId") String str, @Field("bindPhone") String str2);

    @POST("v1/user/action")
    @FormUrlEncoded
    d<BaseEntity> userAction(@Field("type") int i);

    @POST("v1/home/userHints")
    d<BaseEntity<UserHintBean>> userHints();
}
