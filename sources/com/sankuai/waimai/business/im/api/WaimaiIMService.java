package com.sankuai.waimai.business.im.api;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.business.im.common.model.c;
import com.sankuai.waimai.business.im.model.PoiImInfo;
import com.sankuai.waimai.business.im.model.RiderImInfo;
import com.sankuai.waimai.business.im.model.e;
import com.sankuai.waimai.business.im.model.g;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface WaimaiIMService {
    @POST("v6/im/addmsg")
    @FormUrlEncoded
    d<BaseResponse> addCustomReply(@Field("type") int i, @Field("msg") String str);

    @POST("v6/im/delmsg")
    @FormUrlEncoded
    d<BaseResponse> deleteCustomReply(@Field("msg_id") long j);

    @POST("v6/im/autoinfo")
    @FormUrlEncoded
    d<BaseResponse<e>> getAutoAnswerInfo(@Field("type") int i, @Field("order_view_id") long j, @Field("poi_id") long j2, @Field("poi_id_str") String str);

    @POST("v6/im/autoinfobymsg")
    @FormUrlEncoded
    d<BaseResponse<e>> getAutoAnswerInfo(@Field("user_msg") String str, @Field("order_view_id") long j, @Field("poi_id") long j2, @Field("poi_id_str") String str2);

    @POST("v6/im/getautoanswers")
    @FormUrlEncoded
    d<BaseResponse<g>> getAutoAnswerTypeList(@Field("im_input") String str, @Field("has_order") boolean z, @Field("im_type") int i, @Field("condition") int i2, @Field("order_view_id") long j);

    @POST("v6/im/msg/list")
    @FormUrlEncoded
    d<BaseResponse<c>> getCustomReplyList(@Field("type") int i);

    @POST("v6/im/getpoiiminfo")
    @FormUrlEncoded
    d<BaseResponse<PoiImInfo>> getPoiImInfo(@Field("source") int i, @Field("order_view_id") long j, @Field("poi_id") long j2, @Field("poi_id_str") String str, @Field("spu_id") long j3, @Field("scene_set") String str2, @Field("ref") int i2, @Field("located_scity") long j4, @Field("located_tcity") long j5);

    @POST("v6/im/getinfo")
    @FormUrlEncoded
    d<BaseResponse<RiderImInfo>> getRiderImInfo(@Field("order_view_id") long j, @Field("rider_dx_id") long j2);

    @POST("v6/im/getImUserCancelInfo")
    d<BaseResponse<Object>> getUserGroupChatInfo();

    @POST("v6/im/refuseContact")
    @FormUrlEncoded
    d<BaseResponse> refuseContact(@Field("refuse_type") int i, @Field("comment_id") long j, @Field("poi_id") long j2, @Field("poi_id_str") String str, @Field("group_id") long j3);
}
