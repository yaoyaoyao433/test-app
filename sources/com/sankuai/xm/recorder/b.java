package com.sankuai.xm.recorder;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b {
    public static ChangeQuickRedirect a = null;
    public static String b = "Video";

    public static void a(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "7869bb18ca9c6ed13d7fc7ac1b961c50", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "7869bb18ca9c6ed13d7fc7ac1b961c50");
        } else {
            com.sankuai.xm.log.c.a(b, str, objArr);
        }
    }

    public static void b(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "382615d702907dc6b6ad524f55c852c4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "382615d702907dc6b6ad524f55c852c4");
        } else {
            com.sankuai.xm.log.c.b(b, str, objArr);
        }
    }

    public static void c(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "2f8bdcb2353f48d6344a3da72f8e0bbf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "2f8bdcb2353f48d6344a3da72f8e0bbf");
        } else {
            com.sankuai.xm.log.c.c(b, str, objArr);
        }
    }

    public static void d(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "6c111a622ae6444e45a2026ef3ae3848", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "6c111a622ae6444e45a2026ef3ae3848");
        } else {
            com.sankuai.xm.log.c.d(b, str, objArr);
        }
    }

    public static void a(Throwable th, String str, Object... objArr) {
        Object[] objArr2 = {th, str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "307251bb2ead61f4b158392aebc575ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "307251bb2ead61f4b158392aebc575ae");
        } else {
            com.sankuai.xm.log.c.a(b, th, str, objArr);
        }
    }
}
