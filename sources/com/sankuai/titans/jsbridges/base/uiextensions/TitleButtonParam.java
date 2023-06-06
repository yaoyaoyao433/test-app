package com.sankuai.titans.jsbridges.base.uiextensions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TitleButtonParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("disable")
    @Expose
    public int disable;
    @SerializedName(RemoteMessageConst.Notification.ICON)
    @Expose
    public String icon;
    @SerializedName("text")
    @Expose
    public String text;
    @SerializedName("type")
    @Expose
    public String type;
}
