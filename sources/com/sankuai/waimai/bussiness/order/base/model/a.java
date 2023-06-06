package com.sankuai.waimai.bussiness.order.base.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements Serializable {
    public static int a = 1;
    @SerializedName("pay_result_tip")
    public String b;
    @SerializedName("pay_result_code")
    public int c;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String d;
}
