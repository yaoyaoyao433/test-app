package com.sankuai.waimai.store.view.price;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public double b;
    public String c;
    public int d;
    public String e;

    public b(double d, String str, int i, String str2) {
        Object[] objArr = {Double.valueOf(d), str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "691a8a615c111332e92b10de17bb4128", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "691a8a615c111332e92b10de17bb4128");
            return;
        }
        this.b = d;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    public final String[] a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70bdff61b3c890df47512b4702d9c12b", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70bdff61b3c890df47512b4702d9c12b") : this.c.split("\\.");
    }

    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e0fb811e52a29dbdfbac8277f5c1469", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e0fb811e52a29dbdfbac8277f5c1469")).intValue() : this.c.replace(CommonConstant.Symbol.DOT, "").length();
    }
}
