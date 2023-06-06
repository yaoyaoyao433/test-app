package com.sankuai.xm.file.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "18fb300cdd4b5f7c8b5115e524163dda", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "18fb300cdd4b5f7c8b5115e524163dda");
        } else {
            com.sankuai.xm.log.c.a("FileLogUtil::file", str, objArr);
        }
    }

    public static void b(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "bb56f22c25db09f323f9aa03035b1f38", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "bb56f22c25db09f323f9aa03035b1f38");
        } else {
            com.sankuai.xm.log.c.b("FileLogUtil::file", str, objArr);
        }
    }

    public static void c(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "c05c4742310037ed23870fc181271414", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "c05c4742310037ed23870fc181271414");
        } else {
            com.sankuai.xm.log.c.c("FileLogUtil::file", str, objArr);
        }
    }

    public static void d(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "7a2a81f75efff2e2a039856e4a4c0233", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "7a2a81f75efff2e2a039856e4a4c0233");
        } else {
            com.sankuai.xm.log.c.d("FileLogUtil::file", str, objArr);
        }
    }

    public static void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9cc1cbcc86bb9785bdb25f5011194132", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9cc1cbcc86bb9785bdb25f5011194132");
        } else {
            com.sankuai.xm.log.c.a("file", th);
        }
    }

    public static void a(String str, Throwable th) {
        Object[] objArr = {str, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dcbe942abeb03812773ad2421998f79b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dcbe942abeb03812773ad2421998f79b");
            return;
        }
        com.sankuai.xm.log.c.a("FileLogUtil::file exception request-Id is: " + str, th);
    }
}
