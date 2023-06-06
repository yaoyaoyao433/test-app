package com.meituan.android.mrn.engine;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public enum p {
    UNKNOWN(-1),
    PENDING(0),
    READY(1),
    ERROR(2),
    USED(3),
    DIRTY(4);
    
    public static ChangeQuickRedirect a;
    private int h;

    public static p valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2ca7bdc45c43338ca2cff119f3b8af5d", RobustBitConfig.DEFAULT_VALUE) ? (p) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2ca7bdc45c43338ca2cff119f3b8af5d") : (p) Enum.valueOf(p.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static p[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "74d21d5fc9cd638a1fa3f929c2305353", RobustBitConfig.DEFAULT_VALUE) ? (p[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "74d21d5fc9cd638a1fa3f929c2305353") : (p[]) values().clone();
    }

    p(int i2) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd8d2ca3a2d634d2b196afaa013ca180", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd8d2ca3a2d634d2b196afaa013ca180");
        } else {
            this.h = i2;
        }
    }
}
