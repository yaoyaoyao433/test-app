package com.sankuai.waimai.pouch;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public static b b;

    public static boolean a() {
        if (b == null) {
            return false;
        }
        return b.a;
    }

    public static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a14556c779810fa9b22f1c436889e05b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a14556c779810fa9b22f1c436889e05b")).booleanValue() : b != null && a() && b.b;
    }

    public static String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9de4e1bdab263bcb369326d787596a5d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9de4e1bdab263bcb369326d787596a5d");
        }
        if (b == null) {
            return "UN_KNOW";
        }
        switch (b.c) {
            case 1:
                return "LOW";
            case 2:
                return "MIDDLE";
            case 3:
                return "HIGH";
            default:
                return "UN_KNOW";
        }
    }
}
