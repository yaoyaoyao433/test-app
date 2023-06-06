package com.dianping.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.PrintWriter;
import java.io.StringWriter;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static final String[] b = {"catmetrics"};

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0912582f57a5c9b1ef42f5e3fc4f72dd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0912582f57a5c9b1ef42f5e3fc4f72dd");
        } else {
            boolean z = com.dianping.monitor.impl.a.DEBUG;
        }
    }

    public static void b(String str) {
        com.dianping.networklog.c.a(str, 5);
    }

    public static void c(String str) {
        com.dianping.networklog.c.a(str, 1);
    }

    public static void a(Throwable th) {
        if (com.dianping.monitor.impl.a.DEBUG && th != null) {
            th.printStackTrace();
        }
        com.dianping.networklog.c.a(b(th), 1);
    }

    public static void a(String str, long j, long j2, boolean z) {
        boolean z2 = com.dianping.monitor.impl.a.DEBUG;
        if (z) {
            return;
        }
        Object[] objArr = {str, 5, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = com.dianping.networklog.g.a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8628d6c49018ae1ab22d83b3d20c2d51", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8628d6c49018ae1ab22d83b3d20c2d51");
        } else {
            com.dianping.networklog.c.a(str, 5, 1, null, j, j2);
        }
    }

    public static String b(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2393c2975fe5547ae6c00da1bb521cbe", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2393c2975fe5547ae6c00da1bb521cbe");
        }
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            th.printStackTrace(printWriter);
            printWriter.flush();
            String stringWriter2 = stringWriter.toString();
            printWriter.close();
            return stringWriter2;
        } catch (Throwable unused) {
            printWriter.close();
            return "";
        }
    }

    public static void a(com.dianping.monitor.metric.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0ca550ddf3265bd5555925f75674d632", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0ca550ddf3265bd5555925f75674d632");
        } else if (com.dianping.monitor.impl.c.i()) {
            com.dianping.networklog.c.a(aVar.a().toString(), 5, b);
        }
    }
}
