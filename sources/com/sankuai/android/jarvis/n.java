package com.sankuai.android.jarvis;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public enum n {
    PRIORITY_LOW(10),
    PRIORITY_DEFAULT(0),
    PRIORITY_HIGH(-2);
    
    public static ChangeQuickRedirect a;
    final int e;

    public static n valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8f8f3791a34cce8a1fc6ca6040c6b02a", RobustBitConfig.DEFAULT_VALUE) ? (n) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8f8f3791a34cce8a1fc6ca6040c6b02a") : (n) Enum.valueOf(n.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static n[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ba092ba5763a6575177bc13410a1e981", RobustBitConfig.DEFAULT_VALUE) ? (n[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ba092ba5763a6575177bc13410a1e981") : (n[]) values().clone();
    }

    n(int i) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0fdd3e881f244742a8f6b19756a811e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0fdd3e881f244742a8f6b19756a811e");
        } else {
            this.e = i;
        }
    }
}
