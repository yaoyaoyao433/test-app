package com.meituan.android.neohybrid.v2.neo.loading;

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
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "780c16422e351652597b88c346cdaa8e", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "780c16422e351652597b88c346cdaa8e") : (c) Enum.valueOf(c.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static c[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1f639c847ad66b1c61701208e45eea27", RobustBitConfig.DEFAULT_VALUE) ? (c[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1f639c847ad66b1c61701208e45eea27") : (c[]) values().clone();
    }

    c(int i2) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9f034594b01f4f3e8844bba5a60b42d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9f034594b01f4f3e8844bba5a60b42d");
        } else {
            this.h = i2;
        }
    }
}
