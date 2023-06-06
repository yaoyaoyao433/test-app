package com.dianping.nvnetwork.tunnel.tool;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* loaded from: classes.dex */
public class Log {
    public static boolean DEBUG = false;
    private static String TAG_DEFAULT = "nvnetwork";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "acae4fadd194db83d2b738d99a211f61", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "acae4fadd194db83d2b738d99a211f61");
        }
    }

    public static void w(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fca008202d7e8faea0a43c01359b7bf5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fca008202d7e8faea0a43c01359b7bf5");
        } else {
            com.dianping.networklog.c.a(str, 4);
        }
    }
}
