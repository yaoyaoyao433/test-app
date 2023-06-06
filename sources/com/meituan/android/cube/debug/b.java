package com.meituan.android.cube.debug;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a = null;
    private static boolean b = false;
    private static a c = new d();

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(String str, Object... objArr);

        void b(String str, Object... objArr);
    }

    public static boolean a() {
        return b;
    }

    public static void a(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "d2042a4b62494f9a5bd7e7f3c08ad00b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "d2042a4b62494f9a5bd7e7f3c08ad00b");
        } else if (c != null) {
            c.a(str, objArr);
        }
    }

    public static void b(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "b6bf0afde065a9bade2a3fba15d77a79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "b6bf0afde065a9bade2a3fba15d77a79");
        } else if (c != null) {
            c.b(str, objArr);
        }
    }
}
