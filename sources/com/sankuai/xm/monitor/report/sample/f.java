package com.sankuai.xm.monitor.report.sample;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public enum f {
    TIME,
    COUNT,
    FIRST;
    
    public static ChangeQuickRedirect a;

    f() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35045fb0543a2fbdfcbb1394560303a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35045fb0543a2fbdfcbb1394560303a1");
        }
    }

    public static f valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5951708c1c27f36522df515fd1429344", 6917529027641081856L) ? (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5951708c1c27f36522df515fd1429344") : (f) Enum.valueOf(f.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static f[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e497ade85f0f42812ed114fa79b294a2", 6917529027641081856L) ? (f[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e497ade85f0f42812ed114fa79b294a2") : (f[]) values().clone();
    }
}
