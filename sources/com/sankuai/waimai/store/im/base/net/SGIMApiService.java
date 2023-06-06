package com.sankuai.waimai.store.im.base.net;

import com.sankuai.meituan.retrofit2.ae;
import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.Multipart;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Part;
import com.sankuai.waimai.store.base.net.BaseResponse;
import com.sankuai.waimai.store.base.net.upload.ImageInfo;
import com.sankuai.waimai.store.im.group.model.JoinGroupInfo;
import com.sankuai.waimai.store.im.group.model.SGGroupBriefInfo;
import com.sankuai.waimai.store.im.group.model.UserGroupImInfo;
import com.sankuai.waimai.store.im.medical.model.DrugEnterInfo;
import com.sankuai.waimai.store.im.poi.model.IMServiceEvaluationInfo;
import com.sankuai.waimai.store.im.poi.model.ImRecommendScriptInfo;
import com.sankuai.waimai.store.im.poi.model.QuickButtonInfo;
import com.sankuai.waimai.store.im.poi.model.SGModifyAddressAllowed;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface SGIMApiService {
    @POST("v1/drug/kf/im/comment/check")
    @FormUrlEncoded
    rx.d<BaseResponse<IMServiceEvaluationInfo>> drugIsSendMsg(@Field("poi_id") long j, @Field("poi_id_str") String str);

    @POST("v2/drug/im/enter")
    @FormUrlEncoded
    rx.d<BaseResponse<DrugEnterInfo>> getDrugEnterScheme(@Field("page_source") int i, @Field("wm_poi_id") long j, @Field("poi_id_str") String str, @Field("spu_id") String str2);

    @POST("v1/im/common/recStatement")
    @FormUrlEncoded
    rx.d<BaseResponse<ImRecommendScriptInfo>> getRecStatement(@Field("wm_poi_id") String str, @Field("poi_id_str") String str2, @Field("order_view_id") String str3, @Field("cts") String str4, @Field("session_id") String str5, @Field("dialog_source") String str6, @Field("content") String str7);

    @POST("v1/im/group/batchGetGroupBriefInfo")
    @FormUrlEncoded
    rx.d<BaseResponse<SGGroupBriefInfo>> getSGGroupBriefInfo(@Field("group_id_list") String str, @Field("xm_id") long j);

    @POST("v1/im/group/baseinfo")
    @FormUrlEncoded
    rx.d<BaseResponse<UserGroupImInfo>> getUserGroupImInfo(@Field("group_id") long j, @Field("xm_id") long j2);

    @POST("v1/im/group/join")
    @FormUrlEncoded
    rx.d<BaseResponse<JoinGroupInfo>> joinUserGroupIM(@Field("wm_poi_id") long j, @Field("poi_id_str") String str);

    @POST("v1/im/address/modify/allowed")
    @FormUrlEncoded
    rx.d<BaseResponse<SGModifyAddressAllowed>> modifyAddressAllowed(@Field("wm_poi_id") String str, @Field("poi_id_str") String str2, @Field("order_view_id") String str3, @Field("scene_type") int i);

    @POST("v1/im/praise")
    @FormUrlEncoded
    rx.d<BaseResponse<Object>> praiseRobot(@Field("wm_poi_id") long j, @Field("poi_id_str") String str, @Field("msg_id") long j2, @Field("operation") long j3);

    @POST("v1/im/system/message")
    @FormUrlEncoded
    rx.d<BaseResponse<Object>> pushMessageToB(@Field("wm_poi_id") String str, @Field("wm_poi_id") String str2, @Field("content") String str3);

    @POST("v1/im/peerButton")
    @FormUrlEncoded
    rx.d<BaseResponse<QuickButtonInfo>> qucikButtonClick(@Field("wm_poi_id") long j, @Field("poi_id_str") String str, @Field("button_id") int i);

    @POST("v1/im/groupButton")
    @FormUrlEncoded
    rx.d<BaseResponse<Object>> qucikGroupButtonClick(@Field("wm_poi_id") long j, @Field("group_id") long j2, @Field("xm_id") long j3, @Field("button_id") int i);

    @POST("v6/poi/receivecoupon")
    @FormUrlEncoded
    rx.d<BaseResponse<Object>> receiveGroupCoupon(@Field("coupon_biz_type") int i, @Field("channel_url_key") String str, @Field("group_id") long j, @Field("wm_poi_id") long j2, @Field("poi_id_str") String str2, @Field("nick_name") String str3);

    @POST("v6/poi/receivecoupon")
    @FormUrlEncoded
    rx.d<BaseResponse<Poi.PoiCouponItem>> receiveSGIMCoupon(@Field("wm_poi_id") long j, @Field("poi_id_str") String str, @Field("coupon_id") long j2, @Field("coupon_type") long j3, @Field("activity_id") long j4);

    @POST("v1/im/isSend")
    @FormUrlEncoded
    rx.d<BaseResponse<IMServiceEvaluationInfo>> scIsSendMsg(@Field("wm_poi_id") long j, @Field("poi_id_str") String str);

    @POST("v1/mss/upload")
    @Multipart
    rx.d<BaseResponse<ImageInfo>> uploadFile(@Part ae.b bVar);

    @POST("v1/im/recommend")
    @FormUrlEncoded
    rx.d<BaseResponse<Object>> uploadShopCartProduct(@Field("wm_poi_id") String str, @Field("poi_id_str") String str2, @Field("scene_ids") String str3, @Field("products") String str4);
}
