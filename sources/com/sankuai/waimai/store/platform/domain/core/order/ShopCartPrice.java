package com.sankuai.waimai.store.platform.domain.core.order;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class ShopCartPrice implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String bagPacketFee;
    public String mEstimatePackFee;
    public String mOriginShippingFeeTxt;
    public String mShippingFeeTxt;
    public String originPacketFee;
    public double mTotalDiscountedAndBoxPrice = 0.0d;
    public double mTotalDiscountedAndBoxPriceWithoutPlus = 0.0d;
    public double mTotalDiscountedPrice = 0.0d;
    public double mTotalBoxPrice = 0.0d;
    public double mTotalAndBoxPrice = 0.0d;
    public boolean hasTipsOrderNumLimit = false;
    public double mThresholdPrice = 0.0d;
}
