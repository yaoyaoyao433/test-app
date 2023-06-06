package com.sankuai.xm.im.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.trace.j;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "57b5ea059bdf68ccbc88310679f4e593", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "57b5ea059bdf68ccbc88310679f4e593");
        } else {
            com.sankuai.xm.log.c.a("im", str, objArr);
        }
    }

    public static void b(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "57238c3c68540ec72a3ecb3ecd602958", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "57238c3c68540ec72a3ecb3ecd602958");
        } else {
            com.sankuai.xm.log.c.b("im", str, objArr);
        }
    }

    public static void a(String str, String str2, String str3, Object... objArr) {
        Object[] objArr2 = {str, str2, str3, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "97a8b48494cde4a6860358961b73b435", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "97a8b48494cde4a6860358961b73b435");
        } else {
            b(com.sankuai.xm.log.c.a(str, str2, str3), objArr);
        }
    }

    public static void c(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "dd1ede2c4e0da4f1fe0ade5049f51904", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "dd1ede2c4e0da4f1fe0ade5049f51904");
        } else {
            com.sankuai.xm.log.c.c("im", str, objArr);
        }
    }

    public static void b(String str, String str2, String str3, Object... objArr) {
        Object[] objArr2 = {str, str2, str3, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "6f2b5142e77d032b9bd495884861a7d4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "6f2b5142e77d032b9bd495884861a7d4");
        } else {
            c(com.sankuai.xm.log.c.a(str, str2, str3), objArr);
        }
    }

    public static void d(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "be3036f8e0e6c523e9254453cb06692e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "be3036f8e0e6c523e9254453cb06692e");
        } else {
            a(null, str, objArr);
        }
    }

    public static void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4b275482772c5af55aaad9b598a9a215", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4b275482772c5af55aaad9b598a9a215");
        } else {
            a(th, "", new Object[0]);
        }
    }

    public static void a(Throwable th, String str, Object... objArr) {
        Object[] objArr2 = {th, str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "89ec3bbae7965b293b73578d0639c581", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "89ec3bbae7965b293b73578d0639c581");
        } else {
            com.sankuai.xm.log.c.a("im", th, j.a("error", str, objArr), new Object[0]);
        }
    }

    public static void a(String str, String str2, Throwable th, String str3, Object... objArr) {
        Object[] objArr2 = {str, str2, th, str3, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "55a1fdc3c00045d1c9c018ace8390aca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "55a1fdc3c00045d1c9c018ace8390aca");
        } else {
            a(th, com.sankuai.xm.log.c.a(str, str2, str3), objArr);
        }
    }
}
