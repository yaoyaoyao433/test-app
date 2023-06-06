package com.sankuai.waimai.router.core;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a = null;
    @Nullable
    private static a b = null;
    private static boolean c = false;
    private static boolean d = false;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(String str, Object... objArr);

        void b(String str, Object... objArr);

        void b(Throwable th);

        void c(String str, Object... objArr);

        void c(Throwable th);

        void d(String str, Object... objArr);
    }

    public static void a(a aVar) {
        b = aVar;
    }

    public static void a(boolean z) {
        c = z;
    }

    public static boolean a() {
        return c;
    }

    public static void b(boolean z) {
        d = z;
    }

    public static boolean b() {
        return d;
    }

    public static void a(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "5bc874f39b25a4554a31f1f68f9918a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "5bc874f39b25a4554a31f1f68f9918a4");
        } else if (b != null) {
            b.a(str, objArr);
        }
    }

    public static void b(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "3fbe40e8fcd0a9ff789aa9ec17b67e0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "3fbe40e8fcd0a9ff789aa9ec17b67e0f");
        } else if (b != null) {
            b.b(str, objArr);
        }
    }

    public static void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5ad80266910484c80c6c9c9ff568ca4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5ad80266910484c80c6c9c9ff568ca4e");
        } else if (b != null) {
            b.b(th);
        }
    }

    public static void c(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "1f260289c7731a282e12471901d147c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "1f260289c7731a282e12471901d147c3");
        } else if (b != null) {
            b.c(str, objArr);
        }
    }

    public static void d(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "437eabedada1897dec1f8f9d70822ae3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "437eabedada1897dec1f8f9d70822ae3");
        } else if (b != null) {
            b.d(str, objArr);
        }
    }

    public static void b(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "081f3f0f729a716537ef8ae0caa0cf2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "081f3f0f729a716537ef8ae0caa0cf2f");
        } else if (b != null) {
            b.c(th);
        }
    }
}
