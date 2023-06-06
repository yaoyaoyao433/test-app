package com.sankuai.waimai.platform.net;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum a {
    OFFLINE(0),
    POOR(1),
    GOOD(2),
    EXCELLENT(3);
    
    public static ChangeQuickRedirect a;
    public final int f;

    public static a valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e42539500bc0f30a97b07b5b1a7a5f47", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e42539500bc0f30a97b07b5b1a7a5f47") : (a) Enum.valueOf(a.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static a[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "484ba3938aed6c919e0e3c5f23811d08", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "484ba3938aed6c919e0e3c5f23811d08") : (a[]) values().clone();
    }

    a(int i) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fec905c881c3482dc5f7b03d40fde472", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fec905c881c3482dc5f7b03d40fde472");
        } else {
            this.f = i;
        }
    }
}
