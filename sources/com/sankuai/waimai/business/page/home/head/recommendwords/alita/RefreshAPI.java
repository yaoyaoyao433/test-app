package com.sankuai.waimai.business.page.home.head.recommendwords.alita;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface RefreshAPI {
    @POST("search/home/rcmd/word")
    @FormUrlEncoded
    d<BaseResponse<RefreshResponseData>> getAlitaRecommendSearchKeyword(@Field("category_type") int i, @Field("is_refresh_request") boolean z, @Field("real_features") String str, @Field("fresh_exp_bucket") String str2);
}
