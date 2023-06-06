package com.sankuai.waimai.bussiness.order.detailnew.pgablock.childblock.recommend;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.childblock.recommend.RecommendModel;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface RecommendApi {
    @POST("v7/poi/order/recommedproduct")
    @FormUrlEncoded
    d<BaseResponse<RecommendModel.RecommendResponse>> recommedProduct(@Field("order_view_id") String str, @Field("rank_list_id") String str2);
}
