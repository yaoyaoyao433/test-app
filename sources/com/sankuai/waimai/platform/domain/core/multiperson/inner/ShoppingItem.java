package com.sankuai.waimai.platform.domain.core.multiperson.inner;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class ShoppingItem implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("box_price")
    private double boxPrice;
    @SerializedName("discount_price")
    private double discountPrice;
    @SerializedName("price")
    private double payPrice;
    @SerializedName("product_list")
    private ArrayList<Product> productList;
    @SerializedName("shipping_fee")
    private double shippingFee;
    @SerializedName("user_info")
    private UserInfo userInfo;

    public static ShoppingItem fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "96552de1b3f4f9f9e2b1fb16ee862c37", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShoppingItem) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "96552de1b3f4f9f9e2b1fb16ee862c37");
        }
        if (jSONObject == null) {
            return null;
        }
        ShoppingItem shoppingItem = new ShoppingItem();
        shoppingItem.setUserInfo(UserInfo.fromJson(jSONObject.optJSONObject("user_info")));
        shoppingItem.setProductList(Product.formJsonArray(jSONObject.optJSONArray("product_list")));
        shoppingItem.setBoxPrice(jSONObject.optDouble("box_price"));
        shoppingItem.setShippingFee(jSONObject.optDouble("shipping_fee"));
        shoppingItem.setDiscountPrice(jSONObject.optDouble("discount_price"));
        shoppingItem.setPayPrice(jSONObject.optDouble("price"));
        return shoppingItem;
    }

    public static ArrayList<ShoppingItem> fromJsonArray(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "26dcf0719e7b2d2bff9ee79840b7408f", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "26dcf0719e7b2d2bff9ee79840b7408f");
        }
        if (jSONArray == null) {
            return null;
        }
        ArrayList<ShoppingItem> arrayList = new ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            ShoppingItem fromJson = fromJson(jSONArray.optJSONObject(i));
            if (fromJson != null) {
                arrayList.add(fromJson);
            }
        }
        return arrayList;
    }

    public boolean hasNoFoods() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d36544f06a580bc7b65ffd74d0592261", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d36544f06a580bc7b65ffd74d0592261")).booleanValue() : this.productList == null || this.productList.size() == 0;
    }

    public UserInfo getUserInfo() {
        return this.userInfo;
    }

    public ArrayList<Product> getProductList() {
        return this.productList;
    }

    public double getBoxPrice() {
        return this.boxPrice;
    }

    public double getShippingFee() {
        return this.shippingFee;
    }

    public double getDiscountPrice() {
        return this.discountPrice;
    }

    public double getPayPrice() {
        return this.payPrice;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public void setProductList(ArrayList<Product> arrayList) {
        this.productList = arrayList;
    }

    public void setBoxPrice(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5077a368fa4ec52e8a10f0930aa6f0bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5077a368fa4ec52e8a10f0930aa6f0bd");
        } else {
            this.boxPrice = d;
        }
    }

    public void setShippingFee(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6387cedaef08a81e07d80aa3eb24b94f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6387cedaef08a81e07d80aa3eb24b94f");
        } else {
            this.shippingFee = d;
        }
    }

    public void setDiscountPrice(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c0fbef5092ce66d4e904af99883a17a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c0fbef5092ce66d4e904af99883a17a");
        } else {
            this.discountPrice = d;
        }
    }

    public void setPayPrice(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f40cba0bbbeaceab2bb8653bd593aabf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f40cba0bbbeaceab2bb8653bd593aabf");
        } else {
            this.payPrice = d;
        }
    }
}
