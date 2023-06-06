package com.sankuai.waimai.store.base.net.sg;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.store.base.net.BaseResponse;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiShoppingCartAndPoi;
import com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.NetPriceCalculatorResult;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface SCPlatformApiService {
    @POST("v7/shoppingcart/calculateprice")
    @FormUrlEncoded
    rx.d<BaseResponse<NetPriceCalculatorResult>> getNetPriceCalculatorResult(@Field("data") String str);

    @POST("v8/poi/cart/info")
    @FormUrlEncoded
    rx.d<BaseResponse<PoiShoppingCartAndPoi>> getPoiAndShopcartInfo(@Field("wm_poi_id") String str, @Field("poi_id_str") String str2, @Field("extra") String str3, @Field("page_source") int i);
}
