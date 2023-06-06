package com.sankuai.waimai.platform.domain.manager.location.geo;

import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.Query;
import com.sankuai.waimai.platform.domain.manager.location.model.MtAddressSearchResponse;
import com.sankuai.waimai.platform.domain.manager.location.model.SelfDeliveryRouteResponse;
import com.tencent.map.geolocation.internal.TencentExtraKeys;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface MafApi {
    @GET(TencentExtraKeys.LOCATION_KEY_ROUTE)
    d<SelfDeliveryRouteResponse> route(@Query("key") String str, @Query("origin") String str2, @Query("destination") String str3, @Query("mode") String str4);

    @GET("search")
    d<MtAddressSearchResponse> search(@Query("key") String str, @Query("keyword") String str2, @Query("location") String str3, @Query("type") String str4, @Query("city") String str5, @Query("citylimit") String str6, @Query("region") String str7, @Query("scenario") String str8, @Query("pagesize") String str9, @Query("page") String str10, @Query("radius") String str11, @Query("orderby") String str12, @Query("sig") String str13, @Query("timestamp") String str14, @Query("uuid") String str15);
}
