package com.meituan.itc.android.mtnn;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public enum h {
    PRECISION_NORMAL(0),
    PRECISION_HIGH(1),
    PRECISION_LOW(2);
    
    public static ChangeQuickRedirect a;
    public int e;

    public static h valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "08e8eae91fd689a864db529469e8ca15", RobustBitConfig.DEFAULT_VALUE) ? (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "08e8eae91fd689a864db529469e8ca15") : (h) Enum.valueOf(h.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static h[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7fec6cb59b549056fb2074a6bcaba701", RobustBitConfig.DEFAULT_VALUE) ? (h[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7fec6cb59b549056fb2074a6bcaba701") : (h[]) values().clone();
    }

    h(int i) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2dd71814d47e029b87179e0305b55b6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2dd71814d47e029b87179e0305b55b6");
        } else {
            this.e = i;
        }
    }
}
