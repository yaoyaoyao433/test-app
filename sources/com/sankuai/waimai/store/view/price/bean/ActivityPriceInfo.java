package com.sankuai.waimai.store.view.price.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ActivityPriceInfo implements Serializable {
    public static final int ACTUAL_PRICE = 2;
    public static final int BRAND_DISCOUNT_PRICE = 5;
    public static final int COMMODITY_DISCOUNT_PRICE = 4;
    public static final int EXPLOSIVE_PRICE = 7;
    public static final int ORIGIN_PRICE = 1;
    public static final int POI_VIP_PRICE = 3;
    public static final int PRE_SALE_DISCOUNT_PRICE = 6;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_price")
    public double activityPrice;
    @SerializedName("activity_price_source")
    public int activityPriceSource;
    @SerializedName("activity_price_str")
    public String activityPriceStr;
    @SerializedName("activity_price_suffix")
    public String activityPriceSuffix;
    @SerializedName("secondary_activity_price")
    public double secondaryActivityPrice;
    @SerializedName("secondary_activity_price_source")
    public int secondaryActivityPriceSource;
    @SerializedName("secondary_activity_price_str")
    public String secondaryActivityPriceStr;
    @SerializedName("secondary_activity_price_suffix")
    public String secondaryActivityPriceSuffix;
    @SerializedName("sku_id")
    public long skuID;

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f6efc20880635f64fec5cbc2603d6da", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f6efc20880635f64fec5cbc2603d6da");
        }
        return "ActivityPriceInfo{skuID=" + this.skuID + ", activityPrice=" + this.activityPrice + ", activityPriceStr='" + this.activityPriceStr + "', activityPriceSource=" + this.activityPriceSource + ", activityPriceSuffix='" + this.activityPriceSuffix + "', secondaryActivityPrice=" + this.secondaryActivityPrice + ", secondaryActivityPriceStr='" + this.secondaryActivityPriceStr + "', secondaryActivityPriceSuffix='" + this.secondaryActivityPriceSuffix + "', secondaryActivityPriceSource=" + this.secondaryActivityPriceSource + '}';
    }
}
