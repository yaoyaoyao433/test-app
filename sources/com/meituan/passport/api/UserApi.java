package com.meituan.passport.api;

import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import com.meituan.passport.pojo.LoggedInAppsResult;
import com.meituan.passport.pojo.LogoutResult;
import com.meituan.passport.pojo.ResetTokenData;
import com.meituan.passport.pojo.Result;
import com.meituan.passport.pojo.User;
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
public interface UserApi {
    @POST("v1/login/switch/login")
    @FormUrlEncoded
    Call<User> exchangeLogin(@FieldMap Map<String, Object> map, @Field("ticket") String str, @Field("fingerprint") String str2);

    @POST("v1/sharelogin/applist")
    @FormUrlEncoded
    Call<LoggedInAppsResult> getLoggedInApps(@Field("fingerprint") String str, @Field("unionid") String str2, @Field("installedApps") String str3);

    @POST("v1/logout/check")
    @FormUrlEncoded
    Call<LogoutResult> logoutCheckV1(@Field("token") String str, @Field("componentName") String str2, @Field("logoutScenes") String str3, @Field("extraInfo") String str4);

    @POST("v1/sharelogin/login")
    @FormUrlEncoded
    d<User> newShareLogin(@FieldMap Map<String, Object> map, @Field("fingerprint") String str, @Field("ticket") String str2);

    @POST("v1/sharelogin/report")
    @FormUrlEncoded
    Call<Result> reportLoginInfo(@Field("fingerprint") String str, @Query("uuid") @NonNull String str2, @FieldMap Map<String, Object> map);

    @POST("v1/logout/reset-token")
    @FormUrlEncoded
    Call<ResetTokenData> reportLogoutInfo(@Field("fingerprint") String str, @Query("uuid") @NonNull String str2, @FieldMap Map<String, Object> map);
}
