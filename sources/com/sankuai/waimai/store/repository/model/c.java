package com.sankuai.waimai.store.repository.model;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.metrics.traffic.report.NetLogConstants;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c implements Serializable {
    @SerializedName("scene_id")
    public int a;
    @SerializedName(RemoteMessageConst.Notification.ICON)
    public String b;
    @SerializedName("title")
    public String c;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String d;
}
