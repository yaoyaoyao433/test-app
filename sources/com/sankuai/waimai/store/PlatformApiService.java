package com.sankuai.waimai.store;

import com.sankuai.meituan.retrofit2.ae;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.http.FieldMap;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.Multipart;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Part;
import com.sankuai.meituan.retrofit2.http.Url;
import com.sankuai.waimai.store.base.net.BaseResponse;
import com.sankuai.waimai.store.goods.subscribe.SpuSubscribeResponse;
import com.sankuai.waimai.store.platform.marketing.MarketingResponse;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface PlatformApiService {
    @POST("v1/im/group/coupon")
    @FormUrlEncoded
    rx.d<BaseResponse<MarketingResponse>> getIMMarketingEntry(@FieldMap Map<String, Object> map);

    @POST("v1/activity/dialog")
    @FormUrlEncoded
    rx.d<BaseResponse<MarketingResponse>> getMarketingEntry(@FieldMap Map<String, Object> map);

    @POST
    @FormUrlEncoded
    rx.d<BaseResponse<Object>> machRequest(@Url String str, @FieldMap Map<String, String> map);

    @POST("v1/poi/subscribe")
    @FormUrlEncoded
    rx.d<BaseResponse<SpuSubscribeResponse>> subscribePoi(@FieldMap Map<String, String> map);

    @POST("v1/upload/inquiry")
    @Multipart
    rx.d<BaseResponse<String>> uploadFile(@Part("description") ak akVar, @Part ae.b bVar);
}
