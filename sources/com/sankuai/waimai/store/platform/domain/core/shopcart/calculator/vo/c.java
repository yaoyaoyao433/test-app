package com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo;

import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    @SerializedName("cart_id")
    public int a;
    @SerializedName("activity_name")
    public String b;
    @SerializedName("activity_title")
    public String c;
    @SerializedName("activity_desc")
    public String d;
    @SerializedName("activity_tag_id")
    public String e;
    @SerializedName("activity_type")
    public int f;
    @SerializedName("product_list")
    public List<b> g;
    @SerializedName("activity_group_list")
    public List<c> h;
    @SerializedName("activity_button")
    public String i;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String j;
    @SerializedName("sub_box_price")
    private double k;
    @SerializedName("activity_label")
    private String l;
}
