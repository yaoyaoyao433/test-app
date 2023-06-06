package com.sankuai.xm.im.bridge.base.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.log.c;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    private static String b = "IMBridgeLog";

    public static void a(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "a556929deb509a80c4b7c414abc988fa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "a556929deb509a80c4b7c414abc988fa");
        } else {
            c.b(b, str, objArr);
        }
    }

    public static void b(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "31522696f3e604508cf064dbe94c1062", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "31522696f3e604508cf064dbe94c1062");
        } else {
            c.c(b, str, objArr);
        }
    }

    public static void c(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "5eee3e370f2d9af3045857d7476e1ff9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "5eee3e370f2d9af3045857d7476e1ff9");
        } else {
            c.d(b, str, objArr);
        }
    }
}
