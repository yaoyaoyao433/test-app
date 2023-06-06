package com.sankuai.waimai.foundation.location.geo;

import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Query;
import com.sankuai.waimai.foundation.location.model.LocationHistoryAddressResponse;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface LocationUserAddressAPI {

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface AddressType {
    }

    @POST("v7/user/address/getaddr")
    d<LocationHistoryAddressResponse> fetchNewHistoryAddress(@Query("type") String str, @Query("wm_poi_id") String str2);
}
