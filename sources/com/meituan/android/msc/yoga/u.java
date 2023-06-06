package com.meituan.android.msc.yoga;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public enum u {
    NO_WRAP(0),
    WRAP(1),
    WRAP_REVERSE(2);
    
    public static ChangeQuickRedirect a;
    final int e;

    public static u valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5ab4fd96612b8bbcd4209d338dc7a566", RobustBitConfig.DEFAULT_VALUE) ? (u) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5ab4fd96612b8bbcd4209d338dc7a566") : (u) Enum.valueOf(u.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static u[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c513e717064dfb7bd9b33f3a08498a33", RobustBitConfig.DEFAULT_VALUE) ? (u[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c513e717064dfb7bd9b33f3a08498a33") : (u[]) values().clone();
    }

    u(int i) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff081feb9da91af809c3fca5aa4fe75b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff081feb9da91af809c3fca5aa4fe75b");
        } else {
            this.e = i;
        }
    }
}
