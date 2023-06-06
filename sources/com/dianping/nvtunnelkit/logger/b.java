package com.dianping.nvtunnelkit.logger;

import com.dianping.networklog.c;
import com.dianping.nvtunnelkit.utils.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.PrintWriter;
import java.io.StringWriter;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public static ChangeQuickRedirect a = null;
    private static String b = "TunnelKit";
    private static boolean c = false;

    public static void a(boolean z) {
        c = z;
    }

    public static boolean a() {
        return c;
    }

    private static String c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "43404fd18c4872b0250a58a20af75ba3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "43404fd18c4872b0250a58a20af75ba3");
        }
        return "[" + ("tid: " + Thread.currentThread().getId()) + "] --> " + str;
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "933e98bf78efc50d78e7492004836805", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "933e98bf78efc50d78e7492004836805");
        } else {
            b(b, str);
        }
    }

    public static void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a9e53bc5aade4f106ecad6cfe9a5c613", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a9e53bc5aade4f106ecad6cfe9a5c613");
        } else {
            a(b, th);
        }
    }

    public static void a(String str, Throwable th) {
        Object[] objArr = {str, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fe43ea260c8d5861beeeb585a9fc8dd8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fe43ea260c8d5861beeeb585a9fc8dd8");
        } else {
            a(str, "", th);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        boolean z = false;
        Object[] objArr = {str, str2, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "854cfcd2465f9e36bf9f06ec90cb48b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "854cfcd2465f9e36bf9f06ec90cb48b0");
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (f.b(str2)) {
            stringBuffer.append(str2);
            z = true;
        }
        String b2 = b(th);
        if (f.b(b2)) {
            if (z) {
                stringBuffer.append("\t");
            }
            stringBuffer.append(b2);
        }
        b(str, stringBuffer.toString());
    }

    public static String b(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f01e1510aa0d4670f2c6db995b44b788", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f01e1510aa0d4670f2c6db995b44b788");
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

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4245e96b7aea34aa438e327eaf465a42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4245e96b7aea34aa438e327eaf465a42");
        } else if (c) {
            c(str2);
        }
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fecd83cb83ee3f3ed7a650918671dbd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fecd83cb83ee3f3ed7a650918671dbd7");
        } else if (c) {
            c(str);
        }
    }

    public static void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5e3a5179e1e30032b532bf624a4ee54f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5e3a5179e1e30032b532bf624a4ee54f");
            return;
        }
        if (c) {
            a(str, str2);
        }
        c.a(String.format("%s %s", str, c(str2)), 4);
    }
}
