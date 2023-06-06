package com.meituan.android.neohybrid.neo.loading;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public enum c {
    READY(-1),
    SHOW(0),
    HIDE(1),
    CANCEL(2),
    FAIL(3),
    CLEAR(4);
    
    public static ChangeQuickRedirect a;
    int h;

    public static c valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f9876567f62e10cb4e4c371106352b6c", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f9876567f62e10cb4e4c371106352b6c") : (c) Enum.valueOf(c.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static c[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "61f057875228f04c647f43da37462b3c", RobustBitConfig.DEFAULT_VALUE) ? (c[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "61f057875228f04c647f43da37462b3c") : (c[]) values().clone();
    }

    c(int i2) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5a27afb8f09166db1ad44c0448641e2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5a27afb8f09166db1ad44c0448641e2");
        } else {
            this.h = i2;
        }
    }
}
