package com.sankuai.waimai.globalcart.response;

import com.google.gson.annotations.SerializedName;
import com.sankuai.waimai.globalcart.model.GlobalCart;
import com.sankuai.waimai.platform.globalcart.poimix.GlobalCartBrief;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends a {
    @SerializedName("poi_shopping_cart_list")
    public List<GlobalCart> a;
    @SerializedName("product_count")
    public int b;
    @SerializedName("global_shopping_status_list")
    public List<GlobalCartBrief> c;
    @SerializedName("new_user")
    public boolean d;
}
