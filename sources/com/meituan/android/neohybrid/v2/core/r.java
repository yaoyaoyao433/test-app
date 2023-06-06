package com.meituan.android.neohybrid.v2.core;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public enum r {
    BASE,
    NATIVE_SIDE_RENDER,
    PRE_LOAD;
    
    public static ChangeQuickRedirect a;

    r() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c6898bd1424f696b8dc148eb2bf538d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c6898bd1424f696b8dc148eb2bf538d");
        }
    }

    public static r valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "79fb0ebb2bce3e38896c95a42d9fe285", RobustBitConfig.DEFAULT_VALUE) ? (r) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "79fb0ebb2bce3e38896c95a42d9fe285") : (r) Enum.valueOf(r.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static r[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "377bbcc20f7b364b8f6e017c09951ab9", RobustBitConfig.DEFAULT_VALUE) ? (r[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "377bbcc20f7b364b8f6e017c09951ab9") : (r[]) values().clone();
    }
}
