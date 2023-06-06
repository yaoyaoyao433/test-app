package com.meituan.msc.modules.devtools;

import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class DebugHelper {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;
    public static boolean c = true;
    public static boolean d = false;
    public static boolean e = false;
    public static Boolean f = null;
    public static boolean g = false;
    public static boolean h = false;
    public static boolean i = false;
    public static boolean j = false;
    public static boolean k = false;
    public static boolean l = false;
    public static Long m = null;
    public static boolean n = false;
    public static Boolean o = null;
    private static boolean p = false;
    @MultiProcessMode
    private static int q = -1;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public @interface MultiProcessMode {
    }

    public static void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "97027acf447faae1c66175a9f17505c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "97027acf447faae1c66175a9f17505c6");
        } else if (MSCEnvHelper.getEnvInfo().isProdEnv()) {
            g.a("throwNotProd", th);
        } else {
            throw new RuntimeException(th);
        }
    }

    public static boolean a() {
        return p;
    }

    public static boolean b() {
        return b;
    }

    public static Boolean c() {
        return o;
    }
}
