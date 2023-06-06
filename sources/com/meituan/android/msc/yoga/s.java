package com.meituan.android.msc.yoga;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public enum s {
    UNDEFINED(0),
    POINT(1),
    PERCENT(2),
    AUTO(3);
    
    public static ChangeQuickRedirect a;
    final int f;

    public static s valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "17323262b22721ba9ad14c93298e2d7c", RobustBitConfig.DEFAULT_VALUE) ? (s) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "17323262b22721ba9ad14c93298e2d7c") : (s) Enum.valueOf(s.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static s[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cef98d866b97985e4234086c28b1b057", RobustBitConfig.DEFAULT_VALUE) ? (s[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cef98d866b97985e4234086c28b1b057") : (s[]) values().clone();
    }

    s(int i) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1ba3c2035f553d82033f5bc94ce208c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1ba3c2035f553d82033f5bc94ce208c");
        } else {
            this.f = i;
        }
    }

    public static s a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ad7d9230d3de6dfcbd1890716298725c", RobustBitConfig.DEFAULT_VALUE)) {
            return (s) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ad7d9230d3de6dfcbd1890716298725c");
        }
        switch (i) {
            case 0:
                return UNDEFINED;
            case 1:
                return POINT;
            case 2:
                return PERCENT;
            case 3:
                return AUTO;
            default:
                throw new IllegalArgumentException("Unknown enum value: " + i);
        }
    }
}
