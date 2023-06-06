package com.sankuai.waimai.restaurant.shopcart.net;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import java.util.List;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface ShopcartApi {
    @POST("v6/food/collect")
    @FormUrlEncoded
    d<BaseResponse<List<GoodsSpu>>> getTryLuckyFood(@Field("wm_poi_id") long j, @Field("poi_id_str") String str, @Field("order_price") double d, @Field("poi_min_price") double d2);
}
