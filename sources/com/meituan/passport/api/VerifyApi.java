package com.meituan.passport.api;

import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import com.meituan.passport.pojo.BaseResult;
import com.meituan.passport.pojo.YodaCodeInfo;
import com.meituan.passport.pojo.YodaResult;
import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FieldMap;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Path;
import com.sankuai.meituan.retrofit2.http.Query;
import java.util.Map;
import rx.d;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public interface VerifyApi {
    public static final int CODE_PAY_PASSWORD_ERROR_TOO_MANY_TIMES = 121064;
    public static final int CODE_REFRESH_TOO_MANY_TIMES = 121061;
    public static final int CODE_VERIFY_ERROR = 121008;
    public static final int CODE_VERIFY_FAILED_TOO_MANY_TIMES = 121065;
    public static final int CODE_VERIFY_TIMEOUT = 121019;
    public static final int CODE_VERIFY_TIMES_OVER_LIMIT = 121055;
    public static final int CODE_VERIFY_TOO_MANY_TIMES = 121046;
    public static final int need_pic_verify = 121048;
    public static final int need_slider_verify = 121060;
    public static final int user_err_too_many_sms_code = 121038;
    public static final int user_err_voice_failed = 121066;

    @POST("v2/ext_api/page_data")
    @FormUrlEncoded
    d<YodaResult> getPageData(@Field("requestCode") String str, @Field("fingerprint") String str2, @Query("uuid") @NonNull String str3);

    @POST("v2/ext_api/{action}/info")
    @FormUrlEncoded
    d<BaseResult> info(@Path("action") String str, @FieldMap Map<String, Object> map, @Field("fingerprint") String str2, @Query("uuid") String str3);

    @POST("v2/ext_api/login/info")
    @FormUrlEncoded
    @Deprecated
    d<BaseResult> loginInfo(@FieldMap Map<String, Object> map, @Field("id") int i, @Field("fingerprint") String str, @Query("uuid") String str2);

    @POST("v2/ext_api/setbindmobile/verify")
    @FormUrlEncoded
    @Deprecated
    d<BaseResult<YodaCodeInfo>> setbindmobileCodeVerify(@FieldMap Map<String, Object> map, @Field("id") @NonNull int i, @Field("fingerprint") String str, @Query("uuid") @NonNull String str2);

    @POST("v2/ext_api/{action}/verify")
    @FormUrlEncoded
    d<BaseResult<YodaCodeInfo>> verify(@Path("action") String str, @FieldMap Map<String, Object> map, @Field("fingerprint") String str2, @Query("uuid") String str3);
}
