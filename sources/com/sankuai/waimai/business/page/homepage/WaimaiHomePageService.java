package com.sankuai.waimai.business.page.homepage;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface WaimaiHomePageService {
    @POST("v6/feedStatus")
    @FormUrlEncoded
    d<BaseResponse> consumeBubble(@Field("bubble_type") String str);
}
