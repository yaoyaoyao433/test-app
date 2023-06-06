package com.sankuai.waimai.business.page.home.im;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.business.im.api.msgcenter.model.UnReadMsgData;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface HomePageImApi {
    @POST("v7/message/unread")
    d<BaseResponse<UnReadMsgData>> getUnreadSystemMsg();

    @POST("v7/message/readUpload")
    @FormUrlEncoded
    d<BaseResponse<UnReadMsgData>> readUploadSystemMsg(@Field("messageId") long j, @Field("categoryId") String str);
}
