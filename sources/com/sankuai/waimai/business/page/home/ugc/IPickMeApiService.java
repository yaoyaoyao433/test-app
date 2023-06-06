package com.sankuai.waimai.business.page.home.ugc;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IPickMeApiService {
    @POST("v7/content/contentlandingpage")
    @FormUrlEncoded
    d<BaseResponse<String>> getPickMeData(@Field("scene") String str, @Field("param") String str2, @Field("source_id") String str3);
}
