package com.sankuai.waimai.business.restaurant.base.shopcart.calculator;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface ShopCartApiService {
    @POST("v6/shoppingcart/calculateprice")
    @FormUrlEncoded
    rx.d<BaseResponse<com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.f>> getNetPriceCalculatorResult(@Field("data") String str, @Field("is_cross") String str2, @Field("link_identifier_info") String str3);
}
