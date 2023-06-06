package com.sankuai.waimai.platform.domain.core.multiperson.inner;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class ShoppingCart implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("box_price")
    private double boxPrice;
    @SerializedName("style")
    private int cartStyle;
    @SerializedName("id")
    private String id;
    @SerializedName("original_price")
    private double originPrice;
    @SerializedName("price")
    private double price;
    @SerializedName("self_delivery_tip")
    public String selfDeliveryTip;
    @SerializedName("shipping_fee_cart_tip")
    private String shippingFeeTip;
    @SerializedName("shopping_list")
    private ArrayList<ShoppingItem> shoppingItems;
    @SerializedName("single_buy_product_info")
    private a singleBuyProductInfo;

    public static ShoppingCart fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        a aVar = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f4751324c04e89afacbc88678caec18a", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShoppingCart) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f4751324c04e89afacbc88678caec18a");
        }
        if (jSONObject == null) {
            return null;
        }
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setId(jSONObject.optString("id"));
        shoppingCart.setPrice(jSONObject.optDouble("price"));
        shoppingCart.setOriginPrice(jSONObject.optDouble("original_price"));
        shoppingCart.setShippingFeeTip(jSONObject.optString("shipping_fee_cart_tip"));
        shoppingCart.setSelfDeliveryTip(jSONObject.optString("self_delivery_tip"));
        shoppingCart.setShoppingItems(ShoppingItem.fromJsonArray(jSONObject.optJSONArray("shopping_list")));
        shoppingCart.setBoxPrice(jSONObject.optDouble("box_price"));
        shoppingCart.setCartStyle(jSONObject.optInt("style"));
        JSONObject optJSONObject = jSONObject.optJSONObject("single_buy_product_info");
        Object[] objArr2 = {optJSONObject};
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "a739f66256169a5713c6d56f65ced52c", RobustBitConfig.DEFAULT_VALUE)) {
            aVar = (a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "a739f66256169a5713c6d56f65ced52c");
        } else if (optJSONObject != null) {
            aVar = new a();
            aVar.b = optJSONObject.optBoolean("only_single_buy");
            aVar.c = optJSONObject.optString("tips");
        }
        shoppingCart.setSingleBuyProductInfo(aVar);
        return shoppingCart;
    }

    public String getId() {
        return this.id;
    }

    public double getPrice() {
        return this.price;
    }

    public double getOriginPrice() {
        return this.originPrice;
    }

    public double getBoxPrice() {
        return this.boxPrice;
    }

    public String getShippingFeeTip() {
        return this.shippingFeeTip;
    }

    public String getSelfDeliveryTip() {
        return this.selfDeliveryTip;
    }

    public ArrayList<ShoppingItem> getShoppingItems() {
        return this.shoppingItems;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setPrice(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f5aacacf991d759a7835ce4f09abfa8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f5aacacf991d759a7835ce4f09abfa8");
        } else {
            this.price = d;
        }
    }

    public void setOriginPrice(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3bcb3c5a6c7a23edc2a5b545963332c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3bcb3c5a6c7a23edc2a5b545963332c9");
        } else {
            this.originPrice = d;
        }
    }

    public void setBoxPrice(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef3be7bec5f6881f7d0647bf0a606548", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef3be7bec5f6881f7d0647bf0a606548");
        } else {
            this.boxPrice = d;
        }
    }

    public void setShippingFeeTip(String str) {
        this.shippingFeeTip = str;
    }

    public void setSelfDeliveryTip(String str) {
        this.selfDeliveryTip = str;
    }

    public void setShoppingItems(ArrayList<ShoppingItem> arrayList) {
        this.shoppingItems = arrayList;
    }

    public int getCartStyle() {
        return this.cartStyle;
    }

    public void setCartStyle(int i) {
        this.cartStyle = i;
    }

    public a getSingleBuyProductInfo() {
        return this.singleBuyProductInfo;
    }

    public void setSingleBuyProductInfo(a aVar) {
        this.singleBuyProductInfo = aVar;
    }
}
