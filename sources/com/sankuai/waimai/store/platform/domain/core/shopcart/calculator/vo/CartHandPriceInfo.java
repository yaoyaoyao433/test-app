package com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class CartHandPriceInfo implements Serializable {
    public static final int CART_HAND_PRICE_INFO_TYPE_BOX_FEE = 2;
    public static final int CART_HAND_PRICE_INFO_TYPE_DISCOUNT = 3;
    public static final int CART_HAND_PRICE_INFO_TYPE_DISCOUNT_COUPON = 4;
    public static final int CART_HAND_PRICE_INFO_TYPE_HAND_PRICE = 100;
    public static final int CART_HAND_PRICE_INFO_TYPE_TOTAL_PRICE = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("price_str")
    public String price;
    @SerializedName("sub_title")
    public String subTitle;
    @SerializedName("title")
    public String title;
    @SerializedName("type")
    public int type;
    @SerializedName("underline_price")
    public String underlinePrice;
}
