package com.sankuai.waimai.bussiness.order.detailnew.pgablock.childblock.crossshoppurchase;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface CrossShopPurchaseApi {
    @POST("crossShopPurchase/detailPage")
    @FormUrlEncoded
    d<BaseResponse<a>> crossShopPurchase(@Field("orderId") String str, @Field("cid") String str2);
}
