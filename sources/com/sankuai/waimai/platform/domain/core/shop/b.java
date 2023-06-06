package com.sankuai.waimai.platform.domain.core.shop;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class b implements Serializable {
    @SerializedName("change_shop_buy")
    public boolean a;
    @SerializedName("separate_pack")
    public boolean b;
    @SerializedName("support_customer_service")
    public boolean c;
    @SerializedName("show_food_sort")
    public boolean d;
    @SerializedName("food_sort_ban_map")
    public Map<String, List<String>> e;
    @SerializedName("new_shopping_cart_style")
    public boolean f;
}
