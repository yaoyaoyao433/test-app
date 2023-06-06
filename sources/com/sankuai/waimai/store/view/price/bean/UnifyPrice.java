package com.sankuai.waimai.store.view.price.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class UnifyPrice implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_info")
    public ActivityPriceInfo activityInfo;
    @SerializedName("actual_price_info")
    public ActualPriceInfo actualPriceInfo;
    @SerializedName("price")
    public double price;
    @SerializedName("price_str")
    public String priceStr;
    @SerializedName("underlined_price")
    public double underlinedPrice;
    @SerializedName("underlined_price_str")
    public String underlinedPriceStr;

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be66a14e5174dfd484791f077cc40b31", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be66a14e5174dfd484791f077cc40b31");
        }
        return "UnifyPrice{price=" + this.price + ", priceStr='" + this.priceStr + "', underlinedPrice=" + this.underlinedPrice + ", underlinedPriceStr='" + this.underlinedPriceStr + "', activityInfo=" + this.activityInfo + ", actualPriceInfo=" + this.actualPriceInfo + '}';
    }
}
