package com.sankuai.waimai.business.order.api.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class f {
    @SerializedName("user_coin_amount")
    public int a;
    @SerializedName("coin_picture")
    public String b;
    @SerializedName("coupon_picture")
    public String c;
    @SerializedName("stimulate_desc")
    public String d;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String e;
    @SerializedName("trans_resource_views")
    public List<e> f;
}
