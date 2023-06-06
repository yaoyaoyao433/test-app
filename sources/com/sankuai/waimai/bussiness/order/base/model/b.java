package com.sankuai.waimai.bussiness.order.base.model;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    @SerializedName("poi_coupon")
    public a a;
    @SerializedName("confirm_success_toast")
    public String b;
    @SerializedName("is_redirect")
    public int c;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a {
        @SerializedName(RemoteMessageConst.Notification.ICON)
        public String a;
        @SerializedName("title")
        public String b;
        @SerializedName("desc")
        public String c;
    }
}
