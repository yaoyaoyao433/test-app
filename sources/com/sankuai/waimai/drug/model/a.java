package com.sankuai.waimai.drug.model;

import com.google.gson.annotations.SerializedName;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    @SerializedName("group_id")
    public String a;
    @SerializedName("recommend_labels")
    public List<C0936a> b;
    @SerializedName("group_origin_price")
    public double c;
    @SerializedName("group_price")
    public double d;
    @SerializedName("buy_button")
    public String e;
    @SerializedName("products")
    public List<GoodsSpu> f;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.drug.model.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0936a {
        @SerializedName("label_title")
        public String a;
        @SerializedName("label_detail")
        public String b;
    }
}
