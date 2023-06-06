package com.sankuai.waimai.business.im.msgcenter;

import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.business.im.api.msgcenter.model.UnReadMsgData;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface MsgCenterApi {
    @POST("v7/message/unread")
    d<BaseResponse<UnReadMsgData>> getUnreadSystemMsg();
}
