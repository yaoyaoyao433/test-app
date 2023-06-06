package com.sankuai.waimai.business.page.home.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface MvpCouponAPI {

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        @SerializedName("show_icon")
        public int a;
        @SerializedName("icon_url")
        public String b;
        @SerializedName("type")
        public int c;
        @SerializedName(NetLogConstants.Details.SCHEME)
        public String d;
    }

    @POST("v6/task/mvpcoupon/valid")
    @FormUrlEncoded
    rx.d<BaseResponse<a>> getValidResponse(@Field("category_type") Long l, @Field("second_category_type") Long l2, @Field("navigate_type") Long l3);
}
