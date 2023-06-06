package com.meituan.android.msc.yoga;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public enum k {
    FLEX_START(0),
    CENTER(1),
    FLEX_END(2),
    SPACE_BETWEEN(3),
    SPACE_AROUND(4),
    SPACE_EVENLY(5);
    
    public static ChangeQuickRedirect a;
    final int h;

    public static k valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0f5ef46b64abe5129828330efca986a4", RobustBitConfig.DEFAULT_VALUE) ? (k) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0f5ef46b64abe5129828330efca986a4") : (k) Enum.valueOf(k.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static k[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "45cbd0e9c47394c7df1cdcfe72163c8f", RobustBitConfig.DEFAULT_VALUE) ? (k[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "45cbd0e9c47394c7df1cdcfe72163c8f") : (k[]) values().clone();
    }

    k(int i2) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9b0ceca403500011af2fab5b093000c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9b0ceca403500011af2fab5b093000c");
        } else {
            this.h = i2;
        }
    }
}
