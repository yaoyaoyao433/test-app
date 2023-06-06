package com.sankuai.waimai.platform.widget.dial.domain.net;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.widget.dial.domain.model.PrivacyInfo;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface OrderPrivacyInfoApi {
    @POST("v6/privacy/binding")
    @FormUrlEncoded
    d<BaseResponse<PrivacyInfo.PrivacyData>> bindPrivacyNum(@Field("order_view_id") String str, @Field("third_party_phone") String str2, @Field("user_phone") String str3, @Field("scene_code") int i);

    @POST("v6/privacy/info")
    @FormUrlEncoded
    d<BaseResponse<PrivacyInfo.PrivacyData>> getPrivacyInfo(@Field("order_view_id") String str, @Field("third_party_phone") String str2, @Field("user_phone") String str3, @Field("scene_code") int i);
}
