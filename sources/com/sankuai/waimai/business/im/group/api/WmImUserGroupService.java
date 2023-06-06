package com.sankuai.waimai.business.im.group.api;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.business.im.group.model.g;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface WmImUserGroupService {
    @POST("v6/im/getGroupInfo")
    @FormUrlEncoded
    d<BaseResponse<g>> getUserGroupChatInfo(@Field("poi_id") long j, @Field("poi_id_str") String str, @Field("group_id") long j2, @Field("group_type") int i);
}
