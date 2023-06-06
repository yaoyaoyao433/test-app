package com.sankuai.waimai.platform.globalcart.biz;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface GlobalcartService {
    @POST("v6/globalcart/upload")
    @FormUrlEncoded
    d<BaseResponse<String>> globalCartUpload(@Field("poi_shopping_cart_list") String str);
}
