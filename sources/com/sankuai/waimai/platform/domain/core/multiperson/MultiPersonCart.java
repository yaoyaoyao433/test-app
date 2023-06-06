package com.sankuai.waimai.platform.domain.core.multiperson;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.multiperson.inner.CartShareInfo;
import com.sankuai.waimai.platform.domain.core.multiperson.inner.PoiInfo;
import com.sankuai.waimai.platform.domain.core.multiperson.inner.ShoppingCart;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class MultiPersonCart implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("cart_share_vo")
    private CartShareInfo cartShareInfo;
    private String goodsCouponViewId;
    private boolean isSelfDelivery;
    @SerializedName("poi_info")
    private PoiInfo poiInfo;
    @SerializedName("shopping_cart")
    private ShoppingCart shoppingCart;
    @SerializedName("status")
    private int status;

    public static MultiPersonCart fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1785163a819f623d4a5d5eaf4b9c1e2c", RobustBitConfig.DEFAULT_VALUE)) {
            return (MultiPersonCart) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1785163a819f623d4a5d5eaf4b9c1e2c");
        }
        if (jSONObject == null) {
            return null;
        }
        MultiPersonCart multiPersonCart = new MultiPersonCart();
        multiPersonCart.setStatus(jSONObject.optInt("status"));
        multiPersonCart.setCartShareInfo(CartShareInfo.fromJson(jSONObject.optJSONObject("cart_share_vo")));
        multiPersonCart.setPoiInfo(PoiInfo.fromJson(jSONObject.optJSONObject("poi_info")));
        multiPersonCart.setShoppingCart(ShoppingCart.fromJson(jSONObject.optJSONObject("shopping_cart")));
        return multiPersonCart;
    }

    public int getStatus() {
        return this.status;
    }

    public CartShareInfo getCartShareInfo() {
        return this.cartShareInfo;
    }

    public PoiInfo getPoiInfo() {
        return this.poiInfo;
    }

    public ShoppingCart getShoppingCart() {
        return this.shoppingCart;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setCartShareInfo(CartShareInfo cartShareInfo) {
        this.cartShareInfo = cartShareInfo;
    }

    public void setPoiInfo(PoiInfo poiInfo) {
        this.poiInfo = poiInfo;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public boolean isSelfDelivery() {
        return this.isSelfDelivery;
    }

    public void setIsSelfDelivery(boolean z) {
        this.isSelfDelivery = z;
    }

    public String getGoodsCouponViewId() {
        return this.goodsCouponViewId;
    }

    public void setGoodsCouponViewId(String str) {
        this.goodsCouponViewId = str;
    }
}
