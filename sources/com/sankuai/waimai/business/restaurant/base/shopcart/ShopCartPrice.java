package com.sankuai.waimai.business.restaurant.base.shopcart;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class ShopCartPrice implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String crossTip;
    public String mOriginShippingFeeTxt;
    public String mShippingFeeTxt;
    public String previewSubTip;
    public String pricePrefix;
    public String totalBoxPrice;
    public double mTotalDiscountedAndBoxPrice = 0.0d;
    public double mTotalDiscountedAndBoxPriceWithoutGoodCoupon = 0.0d;
    public double mTotalDiscountedPrice = 0.0d;
    public double mTotalBoxPrice = 0.0d;
    public double mTotalAndBoxPrice = 0.0d;
    public boolean hasTipsOrderNumLimit = false;
    public double mThresholdPrice = 0.0d;
}
