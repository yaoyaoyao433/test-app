package com.meituan.android.paycommon.lib.settings;

import com.meituan.android.cipstorage.q;
import com.meituan.android.neohybrid.Neo;
import com.meituan.android.paybase.utils.af;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBWebManager;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d {
    public static ChangeQuickRedirect a = null;
    private static boolean b = false;
    private static boolean c = true;
    private static boolean d = false;
    private static boolean e = true;
    private static boolean f = false;
    private static boolean g = false;
    private static boolean h = false;
    private static boolean i = true;

    public static void a(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "534c86bb01d53fb8da444646e8fd6fb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "534c86bb01d53fb8da444646e8fd6fb2");
        } else {
            Neo.debugger().a("debug_nest_config", (String) Integer.valueOf(i2));
        }
    }

    public static int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6210a71d97eb64add368a26bbd9d4d2a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6210a71d97eb64add368a26bbd9d4d2a")).intValue() : Neo.debugger().a("debug_nest_config", 0);
    }

    public static boolean b() {
        return b;
    }

    public static void a(boolean z) {
        b = z;
    }

    public static boolean c() {
        return c;
    }

    public static void b(boolean z) {
        c = z;
    }

    public static boolean d() {
        return d;
    }

    public static void c(boolean z) {
        d = z;
    }

    public static boolean e() {
        return e;
    }

    public static void d(boolean z) {
        e = z;
    }

    public static boolean f() {
        return f;
    }

    public static void e(boolean z) {
        f = z;
    }

    public static boolean g() {
        return g;
    }

    public static void f(boolean z) {
        g = z;
    }

    public static boolean h() {
        return i;
    }

    public static void g(boolean z) {
        i = z;
    }

    public static void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8fd2f2e312064240510dd2ceb144c94d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8fd2f2e312064240510dd2ceb144c94d");
            return;
        }
        q a2 = af.a("finance_debug");
        a2.a("finance_enable_setting", b);
        a2.a("finance_shark_cip_switch", c);
        a2.a("finance_horn_downgrade_switch", e);
        a2.a("finance_knb_debug_switch", f);
        a2.a("finance_alita_debug_switch", g);
        a2.a("finance_elderly_debug_switch", d);
    }

    public static void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2017d217c8a8d0b3d510170334f41fc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2017d217c8a8d0b3d510170334f41fc0");
            return;
        }
        q a2 = af.a("finance_debug");
        b = a2.b("finance_enable_setting", b);
        i = true;
        if (!b) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d086cbddcbbd49925b1fb52cb4bcba33", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d086cbddcbbd49925b1fb52cb4bcba33");
                return;
            }
            b = false;
            c = true;
            e = true;
            f = false;
            g = false;
            d = false;
            return;
        }
        c = a2.b("finance_shark_cip_switch", c);
        e = a2.b("finance_horn_downgrade_switch", e);
        f = a2.b("finance_knb_debug_switch", f);
        g = a2.b("finance_alita_debug_switch", g);
        d = a2.b("finance_elderly_debug_switch", d);
    }

    public static void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5850399b6479b7ee6223111a6b262a18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5850399b6479b7ee6223111a6b262a18");
        } else if (b) {
            com.meituan.android.paybase.downgrading.a.a(e);
            com.meituan.android.paybase.downgrading.d.a(e);
            KNBWebManager.enableDebugMode(f);
            com.meituan.android.paybase.utils.b.a(i);
        }
    }
}
