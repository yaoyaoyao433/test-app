package com.sankuai.waimai.business.user.comment.net;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.business.user.comment.net.response.CommentShortLinkResponse;
import com.sankuai.waimai.business.user.comment.net.response.MyCommentResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface CommentApi {
    @POST("v6/comment/delete")
    @FormUrlEncoded
    d<BaseResponse<Object>> deleteComment(@Field("wm_comment_id") long j, @Field("wm_poi_id") long j2);

    @POST("v6/comment/short/link")
    @FormUrlEncoded
    d<BaseResponse<CommentShortLinkResponse>> getCommentShortLink(@Field("link") String str);

    @POST("v6/comment/mycommentlist")
    @FormUrlEncoded
    d<BaseResponse<MyCommentResponse>> getMyCommentList(@Field("page_offset") int i, @Field("page_size") int i2, @Field("user_id") long j, @Field("wm_comment_id") long j2);

    @POST("v7/comment/additional/submit")
    @FormUrlEncoded
    d<BaseResponse<Object>> submitComment(@Field("comment_id") long j, @Field("content") String str);
}
