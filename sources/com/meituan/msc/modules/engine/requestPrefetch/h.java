package com.meituan.msc.modules.engine.requestPrefetch;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public enum h {
    PAGE_OUTSIDE("outside"),
    ROUTER("router"),
    PAGE_START("pageStart");
    
    public static ChangeQuickRedirect a;
    public String e;

    public static h valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7112e49bf25cf51c0958b2884f409eb4", RobustBitConfig.DEFAULT_VALUE) ? (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7112e49bf25cf51c0958b2884f409eb4") : (h) Enum.valueOf(h.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static h[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d5575409ac02a85a58fceb67bd48bad8", RobustBitConfig.DEFAULT_VALUE) ? (h[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d5575409ac02a85a58fceb67bd48bad8") : (h[]) values().clone();
    }

    h(String str) {
        Object[] objArr = {r10, Integer.valueOf(r11), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "885604daab5757138e8a453589814027", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "885604daab5757138e8a453589814027");
        } else {
            this.e = str;
        }
    }
}
