package com.sankuai.waimai.bussiness.order.confirm.service;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.bussiness.order.confirm.remark.RemarkInfoResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface OrderRemarkService {
    @POST("v7/remark/list")
    @FormUrlEncoded
    d<BaseResponse<RemarkInfoResponse>> requestRemarksInfo(@Field("param") String str, @Field("mtCityInfo") String str2, @Field("biz_line") String str3);
}
