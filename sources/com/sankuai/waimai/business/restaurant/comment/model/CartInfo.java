package com.sankuai.waimai.business.restaurant.comment.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.ArrayList;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class CartInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("shopping_cart_sku_list")
    public ArrayList<a> shoppingCartSkuList;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a {
        @SerializedName("sku_id")
        public long a;
        @SerializedName("spu_id")
        public long b;

        public a() {
        }
    }
}
