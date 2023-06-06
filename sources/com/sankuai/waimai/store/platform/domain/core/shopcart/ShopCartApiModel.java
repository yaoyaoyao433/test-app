package com.sankuai.waimai.store.platform.domain.core.shopcart;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class ShopCartApiModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String aloneOrderButtonText;
    public int autoExpand;
    public String collageOrderButtonText;
    public String collagePopUpsButtonText;
    public String collectTitle;
    public String drugExtra;
    public double orderActualPurchaseThresholdPrice;
    private a shopCartDrugRisk;
    public String wmExtendInfo;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public String a;
        public long b;
    }

    public a getShopCartDrugRisk() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d58529e6930c1570c3b793b6d7f9a69", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d58529e6930c1570c3b793b6d7f9a69");
        }
        if (this.shopCartDrugRisk == null) {
            this.shopCartDrugRisk = new a();
        }
        return this.shopCartDrugRisk;
    }
}
