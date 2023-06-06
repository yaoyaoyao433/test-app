package com.dianping.imagemanager.image.cache;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public enum a {
    DEFAULT(15, 200),
    ICON(30, 20),
    HOMEPAGE(15, 20);
    
    public static ChangeQuickRedirect a;
    public int e;
    public int f;

    public static a valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a0e125d68149ae0df949418b8bca3927", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a0e125d68149ae0df949418b8bca3927") : (a) Enum.valueOf(a.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static a[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9331cdb1e923f1766358e8754a621771", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9331cdb1e923f1766358e8754a621771") : (a[]) values().clone();
    }

    a(int i, int i2) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8a8e71f25a03c0b6173cbefeb676abd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8a8e71f25a03c0b6173cbefeb676abd");
            return;
        }
        this.e = i;
        this.f = (i2 << 10) << 10;
    }
}
