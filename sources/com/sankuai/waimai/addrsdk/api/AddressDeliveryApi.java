package com.sankuai.waimai.addrsdk.api;

import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.Query;
import com.sankuai.waimai.addrsdk.mvp.bean.AddressSearchResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface AddressDeliveryApi {
    @GET("address/search")
    d<AddressSearchResponse> search(@Query("key") String str, @Query("keyword") String str2, @Query("location") String str3, @Query("type") String str4, @Query("city") String str5, @Query("citylimit") String str6, @Query("region") String str7, @Query("scenario") String str8, @Query("pagesize") String str9, @Query("page") String str10, @Query("radius") String str11, @Query("orderby") String str12, @Query("sig") String str13, @Query("timestamp") String str14, @Query("uuid") String str15, @Query("wifiFinger") String str16, @Query("service_type") String str17, @Query("appId") String str18, @Query("token") String str19, @Query("userId") String str20);
}
