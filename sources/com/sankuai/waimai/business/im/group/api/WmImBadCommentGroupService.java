package com.sankuai.waimai.business.im.group.api;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface WmImBadCommentGroupService {
    @POST("v6/im/closegroupchat")
    @FormUrlEncoded
    d<BaseResponse<com.sankuai.waimai.business.im.group.model.a>> closeBadCommentGroupChatInfo(@Field("group_id") long j, @Field("group_type") int i);

    @POST("v6/im/querygroupchat")
    @FormUrlEncoded
    d<BaseResponse<com.sankuai.waimai.business.im.common.model.a>> getBadCommentGroupChatInfo(@Field("group_id") long j, @Field("group_type") int i);
}
