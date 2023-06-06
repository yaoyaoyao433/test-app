package com.dianping.nvnetwork.cache;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public enum c {
    DISABLED,
    NORMAL,
    HOURLY,
    DAILY,
    SERVICE,
    CRITICAL,
    FORCE;
    
    public static ChangeQuickRedirect a;

    c() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2065e2f11c2cebf8144321c2f09bbdc4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2065e2f11c2cebf8144321c2f09bbdc4");
        }
    }

    public static c valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7e6af690ceeff0c16a3246ebe9ad738c", 6917529027641081856L) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7e6af690ceeff0c16a3246ebe9ad738c") : (c) Enum.valueOf(c.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static c[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "72e30ce4ce517009b111f4662186bc0b", 6917529027641081856L) ? (c[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "72e30ce4ce517009b111f4662186bc0b") : (c[]) values().clone();
    }
}
