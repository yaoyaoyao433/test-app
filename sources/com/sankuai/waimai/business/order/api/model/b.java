package com.sankuai.waimai.business.order.api.model;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends BaseResponse {
    @SerializedName("feedback_cover")
    public a a;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements Serializable {
        @SerializedName(RemoteMessageConst.Notification.ICON)
        public String a;
        @SerializedName("desc")
        public String b;
        @SerializedName("feedback_summary")
        public String c;
        @SerializedName("scheme_desc")
        public String d;
        @SerializedName("scheme_link")
        public String e;
        @SerializedName("type")
        public int f;
        @SerializedName("title")
        public String g;
        @SerializedName("is_stimulate_order")
        public int h;
        @SerializedName("stimulate_type")
        public int i;
    }
}
