package com.sankuai.waimai.business.im.common.api;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.business.im.common.model.a;
import com.sankuai.waimai.business.im.common.model.g;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface WmImFoodSafetyGroupService {
    @POST("v6/im/querygroupchat")
    @FormUrlEncoded
    d<BaseResponse<a>> getFoodSafetyGroupChatInfo(@Field("group_id") long j, @Field("group_type") int i);

    @POST("v6/im/poi/redpacket/take")
    @FormUrlEncoded
    d<BaseResponse<g>> takeRedPacket(@Field("poi_id") long j, @Field("poi_id_str") String str, @Field("group_id") long j2, @Field("poi_wallet_id") long j3, @Field("out_id") long j4);
}
