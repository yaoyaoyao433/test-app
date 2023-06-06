package com.sankuai.waimai.business.page.home.locate;

import com.google.gson.annotations.SerializedName;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Query;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.domain.manager.location.model.NewHistoryAddressResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface AddressRcmdApi {

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        @SerializedName("addressId")
        public long a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b {
        @SerializedName("rcmd_addrs")
        public String a;
    }

    @POST("v6/home/rcmdaddrs")
    d<BaseResponse<b>> getAddressListA();

    @POST("v7/user/address/getaddr")
    d<NewHistoryAddressResponse> getAddressListB(@Query("type") String str, @Query("wm_poi_id") String str2);
}
