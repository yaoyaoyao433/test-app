package com.meituan.msc.uimanager.layoutanimation;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public enum g {
    CREATE,
    UPDATE,
    DELETE;
    
    public static ChangeQuickRedirect a;

    g() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a79d312ecc35992220d542523bc7213", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a79d312ecc35992220d542523bc7213");
        }
    }

    public static g valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4e2e2542635ed594d8439e0daae437c3", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4e2e2542635ed594d8439e0daae437c3") : (g) Enum.valueOf(g.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static g[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6aaf0cb04ef8bbd724b040b1721378e4", RobustBitConfig.DEFAULT_VALUE) ? (g[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6aaf0cb04ef8bbd724b040b1721378e4") : (g[]) values().clone();
    }

    public static String a(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4016419659187a036d642c8b89e07a56", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4016419659187a036d642c8b89e07a56");
        }
        switch (gVar) {
            case CREATE:
                return "create";
            case UPDATE:
                return "update";
            case DELETE:
                return "delete";
            default:
                throw new IllegalArgumentException("Unsupported LayoutAnimationType: " + gVar);
        }
    }
}
