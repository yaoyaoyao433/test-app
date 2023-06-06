package com.meituan.android.msc.yoga;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public enum r {
    STATIC(0),
    RELATIVE(1),
    ABSOLUTE(2),
    FIXED(3);
    
    public static ChangeQuickRedirect a;
    final int f;

    public static r valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a720a96c5f54f234fbb87565807b0013", RobustBitConfig.DEFAULT_VALUE) ? (r) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a720a96c5f54f234fbb87565807b0013") : (r) Enum.valueOf(r.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static r[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1b8fc6cba51eed7f4c01c1d40030534b", RobustBitConfig.DEFAULT_VALUE) ? (r[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1b8fc6cba51eed7f4c01c1d40030534b") : (r[]) values().clone();
    }

    r(int i) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d0859ae2570222240d3be97f9b7ef57", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d0859ae2570222240d3be97f9b7ef57");
        } else {
            this.f = i;
        }
    }

    public static r a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3a11b9eb34412b92a1494321f7d78ada", RobustBitConfig.DEFAULT_VALUE)) {
            return (r) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3a11b9eb34412b92a1494321f7d78ada");
        }
        switch (i) {
            case 0:
                return STATIC;
            case 1:
                return RELATIVE;
            case 2:
                return ABSOLUTE;
            case 3:
                return FIXED;
            default:
                throw new IllegalArgumentException("Unknown enum value: " + i);
        }
    }
}
