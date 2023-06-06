package com.sankuai.android.favorite.rx.retrofit;

import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Path;
import com.sankuai.meituan.retrofit2.http.Query;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface BaseApiRetrofitService {
    @POST("group/v1/user/{userid}/addCollections")
    @FormUrlEncoded
    Call<com.sankuai.android.favorite.rx.model.a> addFavorite(@Path("userid") long j, @Query("token") String str, @Query("ci") long j2, @Field("type") String str2, @Field("ids") String str3);

    @POST("group/v1/user/{userid}/delCollections")
    @FormUrlEncoded
    Call<com.sankuai.android.favorite.rx.model.a> deleteFavorite(@Path("userid") long j, @Query("token") String str, @Field("deleteIds") String str2);
}
