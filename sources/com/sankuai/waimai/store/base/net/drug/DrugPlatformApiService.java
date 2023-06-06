package com.sankuai.waimai.store.base.net.drug;

import com.sankuai.meituan.retrofit2.http.FieldMap;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.store.base.net.BaseResponse;
import com.sankuai.waimai.store.platform.marketing.MarketingResponse;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface DrugPlatformApiService {
    @POST("v1/health/marketingc/delivery/activity/dialog")
    @FormUrlEncoded
    rx.d<BaseResponse<MarketingResponse>> getMarketingEntry(@FieldMap Map<String, Object> map);
}
