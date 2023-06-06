package com.dianping.agentsdk.framework;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public enum ap {
    UPDATE_ALL,
    UPDATE_SECTION,
    UPDATE_ROW,
    INSERT_SECTION,
    INSERT_ROW,
    REMOVE_SECTION,
    REMOVE_ROW;
    
    public static ChangeQuickRedirect a;

    ap() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c61fccb52da50eeb84fe15e453f8545", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c61fccb52da50eeb84fe15e453f8545");
        }
    }

    public static ap valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "53a32c79c2ccded25a416a1205a85911", RobustBitConfig.DEFAULT_VALUE) ? (ap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "53a32c79c2ccded25a416a1205a85911") : (ap) Enum.valueOf(ap.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static ap[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aafb31574dd14863da5dae7bb9206e4c", RobustBitConfig.DEFAULT_VALUE) ? (ap[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aafb31574dd14863da5dae7bb9206e4c") : (ap[]) values().clone();
    }
}
