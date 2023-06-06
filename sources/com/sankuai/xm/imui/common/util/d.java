package com.sankuai.xm.imui.common.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static void a(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "534017b0bf1131af5b63db1ba86de61e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "534017b0bf1131af5b63db1ba86de61e");
        } else {
            com.sankuai.xm.log.c.a("imui", str, objArr);
        }
    }

    public static void b(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "0f91a8442a441c4a15bb7c1a63d514cd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "0f91a8442a441c4a15bb7c1a63d514cd");
        } else {
            com.sankuai.xm.log.c.b("imui", str, objArr);
        }
    }

    public static void a(String str, String str2, String str3, Object... objArr) {
        Object[] objArr2 = {str, str2, str3, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "ccd50848ac6cc8f3630f12be9ad07b34", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "ccd50848ac6cc8f3630f12be9ad07b34");
        } else {
            b(com.sankuai.xm.log.c.a(str, str2, str3), objArr);
        }
    }

    public static void c(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "0a796be4514e3394f5aadacc5c68c493", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "0a796be4514e3394f5aadacc5c68c493");
        } else {
            com.sankuai.xm.log.c.c("imui", str, objArr);
        }
    }

    public static void b(String str, String str2, String str3, Object... objArr) {
        Object[] objArr2 = {str, str2, str3, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "83d26786e9d282722290b4a858e7382f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "83d26786e9d282722290b4a858e7382f");
        } else {
            c(com.sankuai.xm.log.c.a(str, str2, str3), objArr);
        }
    }

    public static void d(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "656e765e203ae3a4d1692ba30190fc66", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "656e765e203ae3a4d1692ba30190fc66");
        } else {
            a(null, str, objArr);
        }
    }

    public static void c(String str, String str2, String str3, Object... objArr) {
        Object[] objArr2 = {str, str2, str3, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "1c80de3ba99ad82425cc413fc73fea78", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "1c80de3ba99ad82425cc413fc73fea78");
        } else {
            d(com.sankuai.xm.log.c.a(str, str2, str3), objArr);
        }
    }

    public static void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b6c6be7b0eff6ac46024a8b70e8a44df", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b6c6be7b0eff6ac46024a8b70e8a44df");
        } else {
            a(th, "", new Object[0]);
        }
    }

    public static void a(Throwable th, String str, Object... objArr) {
        Object[] objArr2 = {th, str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "245ea055294c4982cf955c8b178e31d0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "245ea055294c4982cf955c8b178e31d0");
        } else {
            com.sankuai.xm.log.c.a("imui", th, com.sankuai.xm.base.trace.j.a("error", str, objArr), new Object[0]);
        }
    }
}
