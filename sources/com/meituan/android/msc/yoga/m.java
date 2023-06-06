package com.meituan.android.msc.yoga;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public enum m {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);
    
    public static ChangeQuickRedirect a;
    private final int e;

    public static m valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "df68389ef310092423cd1af4cbf2e8c4", RobustBitConfig.DEFAULT_VALUE) ? (m) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "df68389ef310092423cd1af4cbf2e8c4") : (m) Enum.valueOf(m.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static m[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f84af0d574fc2d25c8f2e4a20bf68721", RobustBitConfig.DEFAULT_VALUE) ? (m[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f84af0d574fc2d25c8f2e4a20bf68721") : (m[]) values().clone();
    }

    m(int i) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7142579694012634ea4d0ec7e8d5ce64", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7142579694012634ea4d0ec7e8d5ce64");
        } else {
            this.e = i;
        }
    }

    public static m a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cc09d1dc02bcbd59a084ce6db3934b94", RobustBitConfig.DEFAULT_VALUE)) {
            return (m) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cc09d1dc02bcbd59a084ce6db3934b94");
        }
        switch (i) {
            case 0:
                return UNDEFINED;
            case 1:
                return EXACTLY;
            case 2:
                return AT_MOST;
            default:
                throw new IllegalArgumentException("Unknown enum value: " + i);
        }
    }
}
