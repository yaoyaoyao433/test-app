package com.sankuai.xm.login;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.trace.j;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static void a(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "0d1e7d3f300b1b1338e0c6435b085dfb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "0d1e7d3f300b1b1338e0c6435b085dfb");
        } else {
            com.sankuai.xm.log.a.a().a("imcore", str, objArr);
        }
    }

    public static void b(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "35c138cefb268095b2e67fbed75d3364", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "35c138cefb268095b2e67fbed75d3364");
        } else {
            com.sankuai.xm.log.a.a().b("imcore", str, objArr);
        }
    }

    public static void c(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "779845bffa38656df6367776f5225f94", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "779845bffa38656df6367776f5225f94");
        } else {
            com.sankuai.xm.log.a.a().c("imcore", str, objArr);
        }
    }

    public static void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4542062a2da8a1b825342328fb0576b5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4542062a2da8a1b825342328fb0576b5");
        } else {
            a(th, null, new Object[0]);
        }
    }

    public static void d(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "3002e568e422261398b6dfb36afc0a87", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "3002e568e422261398b6dfb36afc0a87");
        } else {
            a(null, str, objArr);
        }
    }

    public static void a(Throwable th, String str, Object... objArr) {
        Object[] objArr2 = {th, str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "1ec75b4ddabda30b2ccc2d7140d4292e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "1ec75b4ddabda30b2ccc2d7140d4292e");
        } else {
            com.sankuai.xm.log.a.a().a("imcore", th, j.a("error", str, objArr), new Object[0]);
        }
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "175ceedbfd2e864e7f9328be1227684e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "175ceedbfd2e864e7f9328be1227684e");
        } else {
            com.sankuai.xm.log.a.a().b("imcore", str, new Object[0]);
        }
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cd69c4ca489f43bb562f6fa7c791727c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cd69c4ca489f43bb562f6fa7c791727c");
        } else {
            com.sankuai.xm.log.a.a().a("imcore", str, new Object[0]);
        }
    }
}
