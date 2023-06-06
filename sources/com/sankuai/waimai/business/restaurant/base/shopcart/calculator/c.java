package com.sankuai.waimai.business.restaurant.base.shopcart.calculator;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.poi.PoiShoppingCart;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private PoiShoppingCart.ActivityInfo b;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void a(double d, double d2);

        void a(double d, double d2, double d3);

        void a(double d, double d2, double d3, double d4);
    }

    public c(PoiShoppingCart.ActivityInfo activityInfo) {
        Object[] objArr = {activityInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1cf33424f72752dc5a86a025cf3594c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1cf33424f72752dc5a86a025cf3594c");
        } else {
            this.b = activityInfo;
        }
    }

    public final void a(double d, a aVar) {
        boolean z;
        PoiShoppingCart.ActivityInfo.PolicyItem policyItem;
        char c = 0;
        char c2 = 1;
        Object[] objArr = {Double.valueOf(d), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7dfd61eeae7a754eaeb3432f78fbda0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7dfd61eeae7a754eaeb3432f78fbda0");
            return;
        }
        List<PoiShoppingCart.ActivityInfo.PolicyItem> a2 = a(this.b);
        int size = a2.size();
        if (size <= 0) {
            aVar.a();
            return;
        }
        int i = 0;
        while (i < size) {
            PoiShoppingCart.ActivityInfo.PolicyItem policyItem2 = a2.get(i);
            if (policyItem2 != null) {
                double d2 = policyItem2.priceLower;
                double d3 = policyItem2.priceHigher;
                double d4 = policyItem2.reduce;
                Object[] objArr2 = new Object[3];
                objArr2[c] = Double.valueOf(d);
                objArr2[c2] = Double.valueOf(d2);
                objArr2[2] = Double.valueOf(d3);
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cf716e0c1a09fdad7369d69cd52faf55", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cf716e0c1a09fdad7369d69cd52faf55")).booleanValue();
                } else {
                    z = com.sankuai.waimai.foundation.utils.h.c(Double.valueOf(0.0d), Double.valueOf(d2)) && com.sankuai.waimai.foundation.utils.h.c(Double.valueOf(d2), Double.valueOf(d3)) && com.sankuai.waimai.foundation.utils.h.c(Double.valueOf(d2), Double.valueOf(d)) && com.sankuai.waimai.foundation.utils.h.b(Double.valueOf(d), Double.valueOf(d3));
                }
                if (z) {
                    int i2 = size - 1;
                    if (i == i2) {
                        aVar.a(d2, d4);
                        return;
                    } else if (i < i2 && (policyItem = a2.get(i + 1)) != null) {
                        aVar.a(d3 - d, d4, policyItem.reduce, d3);
                        return;
                    }
                } else if (i == 0 && com.sankuai.waimai.foundation.utils.h.b(Double.valueOf(d), Double.valueOf(d2))) {
                    aVar.a(d2 - d, d4, d2);
                    return;
                }
            }
            i++;
            c = 0;
            c2 = 1;
        }
    }

    @NonNull
    private List<PoiShoppingCart.ActivityInfo.PolicyItem> a(PoiShoppingCart.ActivityInfo activityInfo) {
        Object[] objArr = {activityInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "918c41c5f536ad5855a801dbb513c74f", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "918c41c5f536ad5855a801dbb513c74f");
        }
        ArrayList arrayList = new ArrayList();
        if (activityInfo != null && com.sankuai.waimai.foundation.utils.b.a(activityInfo.policy)) {
            Iterator<PoiShoppingCart.ActivityInfo.PolicyItem> it = activityInfo.policy.iterator();
            while (it.hasNext()) {
                PoiShoppingCart.ActivityInfo.PolicyItem next = it.next();
                if (next != null) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }
}
