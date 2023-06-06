package com.sankuai.waimai.business.restaurant.base.repository.model;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class j implements Serializable {
    public static ChangeQuickRedirect a;
    @SerializedName("frequency")
    public int b;
    @SerializedName(Constants.LAG_THRESHOLD)
    public int c;
    @SerializedName("event_type")
    public int d;
    @SerializedName(RemoteMessageConst.Notification.ICON)
    public String e;
    @SerializedName("content")
    public String f;
    @SerializedName("sub_content")
    public String g;
    @SerializedName("click_action")
    public int h;
    @SerializedName("link_url")
    public String i;
    @SerializedName("show_strategy")
    public int j;
    @SerializedName("disappear_strategy")
    public int k;
    @SerializedName("remain_time")
    public int l;
}
