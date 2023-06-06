package com.meituan.mmp.lib.trace;

import android.app.Activity;
import android.arch.lifecycle.d;
import android.support.annotation.Nullable;
import com.meituan.mmp.lib.HeraActivity;
import com.meituan.mmp.lib.engine.o;
import com.meituan.mmp.lib.engine.q;
import com.meituan.mmp.lib.p;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static com.meituan.crashreporter.container.c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "50b8cb2d965183c0eb92ab33948e025b", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.crashreporter.container.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "50b8cb2d965183c0eb92ab33948e025b") : com.meituan.crashreporter.c.a(ContainerInfo.ENV_MMP);
    }

    public static void a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "53ff22e08f5cc1ed6f3fb7fc3f1d8bb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "53ff22e08f5cc1ed6f3fb7fc3f1d8bb9");
            return;
        }
        p.c(str);
        a().c(String.format("mmp://mmp?targetPath=%s&mmpId=%s&openType=%s", str, str2, str3));
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7956f2831cb713f7189ae6cab18dbb26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7956f2831cb713f7189ae6cab18dbb26");
        } else {
            a().b();
        }
    }

    @Nullable
    public static String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "17523bf267a195d456fac21d50c3537c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "17523bf267a195d456fac21d50c3537c");
        }
        if (com.meituan.mmp.a.c.d.a(d.b.CREATED)) {
            Activity b = com.meituan.mmp.a.b.b();
            if (b instanceof HeraActivity) {
                return ((HeraActivity) b).g();
            }
            return null;
        }
        return null;
    }

    public static void a(String str, String str2) {
        q c;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0f2dfc27981ad2abe5b67286360930a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0f2dfc27981ad2abe5b67286360930a8");
        } else if (!com.meituan.mmp.lib.mp.a.f() || (c = o.c(str)) == null) {
        } else {
            b.a("CrashReporterHelper", "notifyPreloadStarted", str + CommonConstant.Symbol.MINUS + str2, c);
        }
    }

    public static void b(String str, String str2) {
        q c;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f9fa8d3e1a88c0c44074c0223bb85648", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f9fa8d3e1a88c0c44074c0223bb85648");
        } else if (!com.meituan.mmp.lib.mp.a.f() || (c = o.c(str)) == null) {
        } else {
            b.a("CrashReporterHelper", "notifyPreloadEnd", str + CommonConstant.Symbol.MINUS + str2, c);
        }
    }
}
