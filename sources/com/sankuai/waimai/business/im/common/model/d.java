package com.sankuai.waimai.business.im.common.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d implements Serializable {
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String a;
    @SerializedName("group_id")
    public long b;
    @SerializedName("group_type")
    public int c;
}
