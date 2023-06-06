package com.meituan.android.neohybrid.neo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public enum n {
    START,
    VISIBLE,
    VISIBLE_WITH_LOADING,
    FINISHED,
    END;
    
    public static ChangeQuickRedirect a;

    n() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eceaf2e2d899bf4ad1a6f6245049be02", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eceaf2e2d899bf4ad1a6f6245049be02");
        }
    }

    public static n valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9a5bbb9ace9fd2cd83970ce7eb1f08e5", RobustBitConfig.DEFAULT_VALUE) ? (n) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9a5bbb9ace9fd2cd83970ce7eb1f08e5") : (n) Enum.valueOf(n.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static n[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "954c7e1a380c1dbe89077bdafb55f111", RobustBitConfig.DEFAULT_VALUE) ? (n[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "954c7e1a380c1dbe89077bdafb55f111") : (n[]) values().clone();
    }
}
