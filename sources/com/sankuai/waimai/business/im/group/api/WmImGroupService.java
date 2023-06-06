package com.sankuai.waimai.business.im.group.api;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.business.im.group.model.c;
import com.sankuai.waimai.business.im.group.model.e;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface WmImGroupService {
    @POST("v6/im/atinfos")
    @FormUrlEncoded
    d<BaseResponse<com.sankuai.waimai.business.im.group.model.b>> getGroupAtInfo(@Field("order_view_id") long j, @Field("poi_id") long j2, @Field("poi_id_str") String str, @Field("roles") String str2);

    @POST("v6/im/groupinfo")
    @FormUrlEncoded
    d<BaseResponse<c>> getGroupImInfo(@Field("order_view_id") long j, @Field("poi_id") long j2, @Field("poi_id_str") String str, @Field("scene") int i);

    @POST("v6/im/memberinfos")
    @FormUrlEncoded
    d<BaseResponse<com.sankuai.waimai.business.im.group.model.d>> getGroupMemberInfo(@Field("group_id") long j);

    @POST("v6/im/chatinfos")
    @FormUrlEncoded
    d<BaseResponse<e>> getGroupSessionInfo(@Field("group_ids") String str);
}
