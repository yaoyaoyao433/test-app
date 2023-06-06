package com.dianping.imagemanager.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public enum b {
    NULL,
    PENDING,
    SUCCEED,
    FAILED;
    
    public static ChangeQuickRedirect a;

    b() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba939dfcc2f1344ad8df86cac1648647", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba939dfcc2f1344ad8df86cac1648647");
        }
    }

    public static b valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "233c00eb6ce2b5acc2fd61754c17ac2d", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "233c00eb6ce2b5acc2fd61754c17ac2d") : (b) Enum.valueOf(b.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static b[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d68679ac824b7a96472c506e7d419ba0", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d68679ac824b7a96472c506e7d419ba0") : (b[]) values().clone();
    }
}
