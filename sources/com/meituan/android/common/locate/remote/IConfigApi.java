package com.meituan.android.common.locate.remote;

import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.Query;
/* loaded from: classes2.dex */
public interface IConfigApi {
    @GET("locate/v2/sdk/config")
    Call<ap> getConfigJsonNew(@Query("appname") String str, @Query("platform") String str2, @Query("version") String str3, @Query("source_appname") String str4, @Query("source_appver") String str5, @Query("timestamp") String str6, @Query("IMEI") String str7);
}
