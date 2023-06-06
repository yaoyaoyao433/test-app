package com.sankuai.waimai.business.im.common.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;
    @SerializedName("order_status_desc")
    public String b;
    @SerializedName("order_operate_desc")
    public String c;
    @SerializedName("order_operate_suffix")
    public String d;
    @SerializedName("order_status")
    public int e;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String f;
    @SerializedName("interval")
    public int g;

    public final boolean a() {
        return this.e == 8;
    }

    public final boolean b() {
        return this.e == 9;
    }
}
