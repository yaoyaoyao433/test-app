package com.sankuai.waimai.store.platform.domain.core.shopcart.tip;

import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements Serializable {
    @SerializedName("type")
    public int a;
    public int b;
    @SerializedName("text")
    public String c;
    @SerializedName("tip_threshold_price")
    public double d;
    @SerializedName("style")
    public int e;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String f;

    public final boolean a() {
        return this.e == 2;
    }
}
