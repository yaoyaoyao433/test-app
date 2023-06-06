package com.meituan.android.mrn.monitor;

import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.Header;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Query;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface IMRNApiLog {
    @POST("api/log")
    @FormUrlEncoded
    rx.d<ap> log(@Header("Referer") String str, @Query("v") String str2, @Field("c") String str3);
}
