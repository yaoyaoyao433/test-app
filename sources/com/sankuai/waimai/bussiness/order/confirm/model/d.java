package com.sankuai.waimai.bussiness.order.confirm.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d implements Serializable {
    @SerializedName("delivery_time_text")
    public String a;
    @SerializedName("delivery_time_scope")
    public String b;
    @SerializedName("shipping_time_fee_list")
    public List<e> c;
    @SerializedName("shipping_time_fee_select")
    public e d;
}
