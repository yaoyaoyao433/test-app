package com.sankuai.waimai.bussiness.order.confirm.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e implements Serializable {
    @SerializedName("delivery_date")
    public String a;
    @SerializedName("delivery_time")
    public String b;
    @SerializedName("shipping_fee")
    public double c;
    @SerializedName("shipping_fee_text")
    public String d;
    @SerializedName("reduced_shipping_fee")
    public String e;
    @SerializedName("is_selected")
    public int f;
    @SerializedName("unixtime")
    public int g;
    @SerializedName("callback_info")
    public String h;
    @SerializedName("delivery_text")
    public String i;
}
