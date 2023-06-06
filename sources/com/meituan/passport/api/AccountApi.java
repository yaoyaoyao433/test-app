package com.meituan.passport.api;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import com.meituan.passport.pojo.Result;
import com.meituan.passport.pojo.User;
import com.meituan.passport.pojo.UserBaseInfo;
import com.meituan.passport.pojo.YodaResult;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FieldMap;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Query;
import java.util.Map;
import rx.d;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public interface AccountApi {
    public static final int CONFIRM_NONE = 0;
    public static final int CONFIRM_REGESTERED = 2;
    public static final int CONFIRM_UNREGESTER = 1;
    public static final int connect_need_yoda_verify = 101157;
    public static final int connect_not_bind_mobile = 101155;
    public static final int connect_not_login_success = 101156;
    public static final int user_already_unioned = 101176;
    public static final int user_cannot_union = 101177;
    public static final int user_err_bind_by_others_comfirm = 101055;
    public static final int user_err_captcha_error = 101092;
    public static final int user_err_current_password_too_weak = 101193;
    public static final int user_err_denied_1m = 101089;
    public static final int user_err_denied_24h = 101090;
    public static final int user_err_internal = 101000;
    public static final int user_err_login_captcha_err = 101040;
    public static final int user_err_login_need_captcha = 101039;
    public static final int user_err_login_yoda_verify = 101190;
    public static final int user_err_mobile_already_signup = 101066;
    public static final int user_err_mobile_code_error = 101095;
    public static final int user_err_mobile_code_expired = 101093;
    public static final int user_err_mobile_code_invalid = 101094;
    public static final int user_err_mobile_inval = 101012;
    public static final int user_err_need_captcha = 101091;
    public static final int user_err_need_captcha_yoda = 101190;
    public static final int user_err_not_exist = 101050;
    public static final int user_err_not_login_found = 101159;
    public static final int user_err_password_none = 101110;
    public static final int user_err_password_too_short = 101024;
    public static final int user_err_password_wrong = 101005;
    public static final int user_err_signupnick_need_captcha = 101061;
    public static final int user_err_username_charerr = 101022;
    public static final int user_err_username_exist = 101023;
    public static final int user_err_username_firstchar = 101018;
    public static final int user_err_username_reserved = 101017;
    public static final int user_err_username_too_long = 101021;
    public static final int user_err_username_too_short = 101020;
    public static final int user_err_yoda_verify_failed = 101158;
    public static final int user_has_risk = 101144;
    public static final int user_has_risk_2 = 101135;
    public static final int user_need_reopen = 101236;
    public static final int user_reopen_deny = 101235;
    public static final int user_union_failed = 101178;

    @POST("v2/account/bindmobilelogincode")
    @FormUrlEncoded
    d<YodaResult> bindMobileLoginCode(@FieldMap Map<String, Object> map, @Field("fingerprint") String str, @Query("uuid") @NonNull String str2);

    @POST("v2/account/bindmobilelogin")
    @FormUrlEncoded
    d<User> bindmobilelogin(@FieldMap Map<String, Object> map, @Field("supportSecondaryMobile") int i, @Field("confirm") int i2, @Field("fingerprint") String str, @Query("uuid") @NonNull String str2);

    @POST("v7/account/login")
    @FormUrlEncoded
    d<User> loginv7(@FieldMap Map<String, Object> map, @Field("requestCode") @Nullable String str, @Field("responseCode") @Nullable String str2, @Field("fingerprint") String str3, @Query("uuid") @NonNull String str4);

    @POST("v2/account/mobilelogin")
    @FormUrlEncoded
    @Deprecated
    d<User> mobileLogin(@Field("mobile") @NonNull String str, @Field("code") @NonNull String str2, @Field("fingerprint") String str3, @Query("uuid") @NonNull String str4);

    @POST("v3/account/mobileloginapply")
    @FormUrlEncoded
    d<YodaResult> mobileLoginApply(@Field("encryptMobile") @NonNull String str, @Field("countryCode") String str2, @Field("verifyLevel") int i, @Field("smsVerifyLevel") int i2, @Field("poiid") String str3, @Field("specialRiskCode") String str4, @Field("needRetry") int i3, @Field("fingerprint") String str5, @Query("uuid") @NonNull String str6);

    @POST("v2/account/mobilelogincode")
    @FormUrlEncoded
    @Deprecated
    d<Result> mobileLoginCode(@Field("mobile") @NonNull String str, @Field("captcha") @Nullable String str2, @Field("fingerprint") String str3, @Query("uuid") @NonNull String str4);

    @POST("v3/account/mobilelogin")
    @FormUrlEncoded
    d<User> mobileLoginv3(@FieldMap Map<String, Object> map, @Field("responseCode") @NonNull String str, @Field("fingerprint") String str2, @Query("uuid") @NonNull String str3, @Field("specialRiskCode") String str4);

    @POST("v3/account/mobileloginapply")
    @FormUrlEncoded
    d<YodaResult> peaseRequestCode(@FieldMap Map<String, Object> map, @Field("verifyLevel") int i, @Field("smsVerifyLevel") int i2, @Field("specialRiskCode") String str, @Field("needRetry") int i3, @Field("fingerprint") String str2, @Query("uuid") @NonNull String str3);

    @POST("v1/account/refreshtoken")
    @FormUrlEncoded
    Call<Result> refeshToken(@FieldMap Map<String, Object> map, @Field("token") @NonNull String str, @Field("fingerprint") String str2);

    @POST("v1/account/ticketlogin")
    @FormUrlEncoded
    d<User> ticketLogin(@FieldMap Map<String, Object> map, @Field("userTicket") String str, @Field("fingerprint") String str2, @Query("uuid") String str3);

    @POST("v1/account/ticketlogincheck")
    @FormUrlEncoded
    d<UserBaseInfo> ticketLoginCheck(@Field("userTicket") String str, @Field("fingerprint") String str2, @Query("uuid") String str3);

    @POST("v1/account/verifylogin")
    @FormUrlEncoded
    d<User> verifyLogin(@FieldMap Map<String, Object> map, @Field("responseCode") @NonNull String str, @Field("userTicket") @NonNull String str2, @Field("requestCode") @NonNull String str3, @Field("fingerprint") String str4);
}
