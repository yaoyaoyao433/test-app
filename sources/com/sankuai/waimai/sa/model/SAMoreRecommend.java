package com.sankuai.waimai.sa.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SAMoreRecommend {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("fast_reply_type")
    public int fast_reply_type;
    @SerializedName(RemoteMessageConst.Notification.ICON)
    public String icon;
    @SerializedName("icon_url")
    public String iconUrl;
    @SerializedName("label")
    public String label;
    @SerializedName("log_field")
    public a logField;
    @SerializedName("msg")
    public String msg;
    @SerializedName("scheme_url")
    public String schemeUrl;
    @SerializedName("short_msg")
    public String shortMsg;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        @SerializedName("type")
        public int a;
    }
}
