package com.dianping.nvlbservice;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.PrintWriter;
import java.io.StringWriter;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class i {
    public static ChangeQuickRedirect a;
    public static boolean b;
    static boolean c;

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9f037db983dc2a089dd0d7f8506f43de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9f037db983dc2a089dd0d7f8506f43de");
        }
    }

    public static void a(String str, Throwable th) {
        Object[] objArr = {str, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "047c57163f3a0b722fe17ab29c5928af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "047c57163f3a0b722fe17ab29c5928af");
        } else {
            b(str, a(th));
        }
    }

    public static void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7ea7ea95965c68f171b59f3d1a9b8b8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7ea7ea95965c68f171b59f3d1a9b8b8f");
            return;
        }
        if (b) {
            a(str, str2);
        }
        com.dianping.networklog.c.a(str + " -> " + str2, 4);
    }

    private static String a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6749fad894e19004f19b0d850f1d31e8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6749fad894e19004f19b0d850f1d31e8");
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
}
