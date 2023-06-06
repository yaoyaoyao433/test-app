package com.sankuai.meituan.mtliveqos;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a = null;
    private static com.sankuai.meituan.mtliveqos.common.b b = null;
    private static boolean c = false;
    private static boolean d = false;
    private static int e = 10;

    public static synchronized void a(com.sankuai.meituan.mtliveqos.common.b bVar) {
        synchronized (b.class) {
            if (b != null) {
                return;
            }
            b = bVar;
        }
    }

    public static int a() {
        if (e <= 0) {
            e = 10;
        }
        return e * 1000;
    }

    public static com.sankuai.meituan.mtliveqos.common.b b() {
        return b;
    }

    public static void a(String str, com.sankuai.meituan.mtliveqos.common.d dVar) {
        Object[] objArr = {str, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f3f752301641ac4af26c9ea6dbf4ae02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f3f752301641ac4af26c9ea6dbf4ae02");
        } else {
            com.sankuai.meituan.mtliveqos.common.e.a(str, dVar);
        }
    }

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3dbb127e0498b858c0dafdaca6447ed9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3dbb127e0498b858c0dafdaca6447ed9") : com.sankuai.meituan.mtliveqos.common.e.a(str);
    }
}
