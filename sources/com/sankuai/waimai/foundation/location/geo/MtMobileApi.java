package com.sankuai.waimai.foundation.location.geo;

import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.Path;
import com.sankuai.meituan.retrofit2.http.Query;
import com.sankuai.waimai.foundation.location.model.CityResponse;
import com.sankuai.waimai.foundation.location.model.LocationBaseResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface MtMobileApi {
    @GET("/group/v1/city/latlng/{location}")
    d<LocationBaseResponse<CityResponse>> getCityInfo(@Path("location") String str, @Query("tag") String str2, @Query("locMtBack") int i, @Query("locAdmin") int i2);
}
