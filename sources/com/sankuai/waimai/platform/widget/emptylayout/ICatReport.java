package com.sankuai.waimai.platform.widget.emptylayout;

import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.Header;
import com.sankuai.meituan.retrofit2.http.Headers;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Url;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface ICatReport {
    @POST
    @FormUrlEncoded
    @Headers({"Accept-Encoding: gzip, deflate, br", "Content-Type:application/x-www-form-urlencoded"})
    Call<ap> report(@Url String str, @Header("User-Agent") String str2, @Header("Referer") String str3, @Field("c") String str4);
}
