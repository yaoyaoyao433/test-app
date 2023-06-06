package com.sankuai.waimai.platform.domain.manager.poi.collect;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface CollectApi {
    @POST("v6/user/favorites/add")
    @FormUrlEncoded
    d<BaseResponse<AddCollectResponse>> addFavorites(@Field("wmpoiid") String str, @Field("poi_id_str") String str2);

    @POST("v6/user/favorites/cancel")
    @FormUrlEncoded
    d<BaseResponse> cancelFavorites(@Field("wmpoiid") String str, @Field("poi_id_str") String str2);

    @POST("v6/user/favorites/check")
    @FormUrlEncoded
    d<BaseResponse<CheckPoiCollectResponse>> checkFavorites(@Field("wmpoiid") String str, @Field("poi_id_str") String str2);
}
