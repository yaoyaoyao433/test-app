package com.sankuai.waimai.globalcart.biz;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.globalcart.response.b;
import com.sankuai.waimai.globalcart.response.c;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface GlobalCartApi {
    @POST("v6/globalcart/sync")
    @FormUrlEncoded
    d<BaseResponse<c>> globalCartSync(@Field("poi_shopping_cart_list") String str);

    @POST("v6/globalcart/changestatus")
    @FormUrlEncoded
    d<BaseResponse<b>> globalChangeStatus(@Field("change_status") String str);
}
