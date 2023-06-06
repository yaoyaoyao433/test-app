package com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g implements Serializable {
    @SerializedName("code")
    public int a;
    @SerializedName("msg")
    public String b;
    @SerializedName("exception_product_list")
    public List<b> c;
    @SerializedName("exception_infos")
    public a d;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements Serializable {
        @SerializedName("max_buy_count")
        public int a;
    }
}
