package com.meituan.msc.modules.engine;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public enum n {
    NONE,
    PRE_CREATE,
    PRELOAD_BASE,
    PRELOAD_BUSINESS,
    PRELOAD_PAGE;
    
    public static ChangeQuickRedirect a;

    n() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4bdc3e27fc9c30aed2f3b8df6ff42ec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4bdc3e27fc9c30aed2f3b8df6ff42ec");
        }
    }

    public static n valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "210176a1fb6a1b943eaa8ab93bd69dd2", RobustBitConfig.DEFAULT_VALUE) ? (n) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "210176a1fb6a1b943eaa8ab93bd69dd2") : (n) Enum.valueOf(n.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static n[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7b9a7c664007ba0b7365a6b66b731f60", RobustBitConfig.DEFAULT_VALUE) ? (n[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7b9a7c664007ba0b7365a6b66b731f60") : (n[]) values().clone();
    }

    public static String a(n nVar) {
        Object[] objArr = {nVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b3b52089e847af491e20cb683fadf6d8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b3b52089e847af491e20cb683fadf6d8");
        }
        if (nVar == null) {
            return "none";
        }
        switch (nVar) {
            case PRE_CREATE:
                return "preCreate";
            case PRELOAD_BASE:
                return "preloadBase";
            case PRELOAD_BUSINESS:
                return "preloadBusiness";
            case PRELOAD_PAGE:
                return "preloadPage";
            default:
                return "none";
        }
    }
}
