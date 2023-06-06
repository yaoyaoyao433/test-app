package com.meituan.android.preload.config;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public enum g {
    PROD,
    STAGE,
    TEST;
    
    public static ChangeQuickRedirect a;

    g() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d8d195881999c4dbbf6902c6a0e2920", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d8d195881999c4dbbf6902c6a0e2920");
        }
    }

    public static g valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fc76fa22af4cba81460da71a3b2428e9", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fc76fa22af4cba81460da71a3b2428e9") : (g) Enum.valueOf(g.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static g[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cb040c7d5fd251bc3769713ce8dda9b5", RobustBitConfig.DEFAULT_VALUE) ? (g[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cb040c7d5fd251bc3769713ce8dda9b5") : (g[]) values().clone();
    }
}
