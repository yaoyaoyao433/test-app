package com.meituan.android.common.locate.remote;

import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.Path;
import com.sankuai.meituan.retrofit2.http.Query;
/* loaded from: classes2.dex */
public interface IGeocoderApi {
    @GET("group/v1/city/latlng/{latitude},{longitude}")
    Call<ap> send(@Path("latitude") double d, @Path("longitude") double d2, @Query("tag") int i);

    @GET("group/v1/city/latlng/{enLatLng}")
    Call<ap> sendGotEncryptData(@Path("enLatLng") String str, @Query("tag") int i, @Query("encrypt") int i2);
}
