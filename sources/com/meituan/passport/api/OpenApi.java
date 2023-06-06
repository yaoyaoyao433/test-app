package com.meituan.passport.api;

import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import com.meituan.passport.pojo.BindStatus;
import com.meituan.passport.pojo.LoginConfigResult;
import com.meituan.passport.pojo.Result;
import com.meituan.passport.pojo.Ticket;
import com.meituan.passport.pojo.User;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ae;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FieldMap;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.Header;
import com.sankuai.meituan.retrofit2.http.Headers;
import com.sankuai.meituan.retrofit2.http.Multipart;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Part;
import com.sankuai.meituan.retrofit2.http.PartMap;
import com.sankuai.meituan.retrofit2.http.Path;
import com.sankuai.meituan.retrofit2.http.Query;
import java.util.Map;
import rx.d;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public interface OpenApi {
    @POST("/thirdlogin/commonlogin/oauth2/access_token/{thirdType}")
    @FormUrlEncoded
    d<User> accessTokenOauth(@FieldMap Map<String, Object> map, @Path("thirdType") String str, @Field("state") String str2, @Field("accessTokensJson") String str3, @Field("justVerify") boolean z, @Field("fingerprint") String str4, @Query("uuid") @NonNull String str5);

    @POST("/user/v1/bindthird")
    @FormUrlEncoded
    d<BindStatus> bind(@Field("type") String str, @Field("openid") String str2, @Field("accesstoken") String str3, @Field("thirdAppId") String str4, @FieldMap Map<String, Object> map);

    @POST("/user/v1/code/bindthird")
    @FormUrlEncoded
    d<BindStatus> bindOauthCode(@Field("type") String str, @Field("code") String str2, @Field("thirdAppId") String str3, @FieldMap Map<String, Object> map);

    @POST("/user/v1/resetpasswordapply")
    @FormUrlEncoded
    d<Ticket> checkUserName(@FieldMap Map<String, Object> map, @Field("encryptMobile") String str, @Field("countryCode") String str2, @Field("requestCode") String str3, @Field("responseCode") String str4, @Field("fingerprint") String str5, @Query("uuid") @NonNull String str6);

    @POST("/thirdlogin/commonlogin/oauth2/code/{thirdType}")
    @FormUrlEncoded
    d<User> codeOauth(@FieldMap Map<String, Object> map, @Path("thirdType") String str, @Field("state") String str2, @Field("code") String str3, @Field("justVerify") boolean z, @Field("fingerprint") String str4, @Query("uuid") @NonNull String str5);

    @GET("user/v1/privatePolicy")
    d<Object> policySwitch();

    @POST("/thirdinfo/thirdrequest/oauth2/accessToken2ThirdUserinfo/weixin")
    @FormUrlEncoded
    @Headers({"Content-Type: application/x-www-form-urlencoded"})
    d<Object> refreshWeixinAvatar(@Field("accessTokenJson") String str, @Field("state") String str2);

    @GET("/thirdlogin/commonlogin/thirdentries")
    Call<LoginConfigResult> requestLoginConfigs(@Query("joinkey") String str);

    @POST("/user/v1/resetpasswordcheck")
    @FormUrlEncoded
    Call<Ticket> resetPasswordCheck(@Field("encryptMobile") String str, @Field("countryCode") String str2, @Field("ticket") String str3, @Field("fingerprint") String str4, @Query("uuid") @NonNull String str5);

    @POST("/user/v2/resetpassword")
    @FormUrlEncoded
    d<Result> resetPasswordV2(@FieldMap Map<String, Object> map, @Field("fingerprint") String str, @Query("uuid") @NonNull String str2);

    @GET("user/v1/info")
    Call<User> updateUser(@Header("token") String str, @Query("fields") String str2);

    @POST("/user/settings")
    @Multipart
    Call<User> uploadUserAvatarPicture(@PartMap Map<String, ak> map, @Part ae.b bVar, @Part ae.b bVar2);

    @POST("/user/status/reopen")
    @FormUrlEncoded
    d<User> userReopen(@FieldMap Map<String, Object> map, @Field("userTicket") String str, @Field("requestCode") String str2, @Field("responseCode") String str3, @Query("uuid") @NonNull String str4);
}
