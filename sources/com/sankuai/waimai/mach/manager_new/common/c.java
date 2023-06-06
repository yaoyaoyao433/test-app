package com.sankuai.waimai.mach.manager_new.common;

import android.os.Trace;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.common.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;
    private static boolean c = false;
    private static boolean d = true;
    private static boolean e = true;
    private static boolean f = false;

    public static void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a6a9f82a6dd36e13b4f16f9ed7c775b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a6a9f82a6dd36e13b4f16f9ed7c775b7");
        }
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a95c2c07016907e6742dbfbab02ba348", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a95c2c07016907e6742dbfbab02ba348");
        } else if (i.a().h()) {
            Trace.beginSection(str);
        }
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c4d85c10e9c0ab5c0497f609cf402686", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c4d85c10e9c0ab5c0497f609cf402686");
        } else if (i.a().h()) {
            Trace.endSection();
        }
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6e2c457bcb3971e3544d453f8332f575", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6e2c457bcb3971e3544d453f8332f575");
        } else {
            com.sankuai.waimai.mach.log.b.b("_Mach", str);
        }
    }

    public static void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dacae16795f311eab48bd3fba4a16c82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dacae16795f311eab48bd3fba4a16c82");
        } else {
            com.sankuai.waimai.mach.log.b.a("_Mach", str);
        }
    }

    public static void e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e52e70314c7283309619697d8edeb478", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e52e70314c7283309619697d8edeb478");
        } else {
            com.sankuai.waimai.mach.log.b.a("_Mach", str);
        }
    }

    public static void f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3e4fe6f0e1e0cd86cb61bca295d26771", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3e4fe6f0e1e0cd86cb61bca295d26771");
        } else if (c) {
            com.sankuai.waimai.mach.log.b.b("_MachDownload", str);
        }
    }

    public static void g(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "344b3d43c1d80037c3830d9af617bde1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "344b3d43c1d80037c3830d9af617bde1");
        } else if (c) {
            com.sankuai.waimai.mach.log.b.a("_MachDownload", str, new Object[0]);
        }
    }

    public static void h(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9c35d057663ef421b01d6eb971aedeb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9c35d057663ef421b01d6eb971aedeb3");
        } else if (c) {
            com.sankuai.waimai.mach.log.b.b("_MachDownload", str, new Object[0]);
        }
    }

    public static void i(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c73b8d0e2e6b7e00c4add06e4868c026", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c73b8d0e2e6b7e00c4add06e4868c026");
        } else if (d) {
            com.sankuai.waimai.mach.log.b.b("_MachIOQ", str);
        }
    }

    public static void j(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d7d487d66a774fe5441c8983c75ca30f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d7d487d66a774fe5441c8983c75ca30f");
        } else if (d) {
            com.sankuai.waimai.mach.log.b.a("_MachIOQ", str, new Object[0]);
        }
    }

    public static void k(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c57e8a2da77a334ce042d218f32cd36c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c57e8a2da77a334ce042d218f32cd36c");
        } else if (d) {
            com.sankuai.waimai.mach.log.b.b("_MachIOQ", str, new Object[0]);
        }
    }

    public static void l(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "00766393bab436fcc7f682971ce4e8df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "00766393bab436fcc7f682971ce4e8df");
        } else if (i.a().h() && e) {
            com.sankuai.waimai.mach.log.b.a("_MachBundleState", str, new Object[0]);
        }
    }

    public static void m(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e3275c7f7f0ced12e05377ce737d2f32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e3275c7f7f0ced12e05377ce737d2f32");
        } else if (i.a().h() && e) {
            com.sankuai.waimai.mach.log.b.b("_MachBundleState", str, new Object[0]);
        }
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "43e2ccb1e74b0354835b22056feb3882", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "43e2ccb1e74b0354835b22056feb3882");
        } else if (i.a().h() && f) {
            StringBuilder sb = new StringBuilder();
            for (StackTraceElement stackTraceElement : new Throwable("同步调用").getStackTrace()) {
                sb.append(stackTraceElement.toString());
                sb.append("\n");
            }
            e(sb.toString());
        }
    }
}
