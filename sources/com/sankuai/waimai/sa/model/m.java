package com.sankuai.waimai.sa.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class m implements c {
    @SerializedName("id")
    public String a;
    @SerializedName("poiId")
    public long b;
    @SerializedName("recommend_title")
    public String c;
    @SerializedName("recommend_reason")
    public String d;
    @SerializedName("activity_text")
    public String e;
    @SerializedName("product_list")
    public List<Product> f;
    @SerializedName("package_price")
    public double g;
    @SerializedName("package_price_actual")
    public double h;
    @SerializedName("package_price_save")
    public double i;
    @SerializedName("box_price")
    public double j;
    public long k;

    @Override // com.sankuai.waimai.sa.model.c
    public final List<Product> a() {
        return this.f;
    }

    @Override // com.sankuai.waimai.sa.model.c
    public final double f() {
        return this.h;
    }

    @Override // com.sankuai.waimai.sa.model.c
    public final double g() {
        return this.g;
    }

    @Override // com.sankuai.waimai.sa.model.c
    public final String c() {
        return this.e;
    }

    @Override // com.sankuai.waimai.sa.model.c
    public final double e() {
        return this.j;
    }

    @Override // com.sankuai.waimai.sa.model.c
    public final String b() {
        return this.c;
    }

    @Override // com.sankuai.waimai.sa.model.c
    public final String d() {
        return this.d;
    }

    @Override // com.sankuai.waimai.sa.model.c
    public final long h() {
        return this.b;
    }
}
