package com.meituan.mtwebkit.internal;

import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public static boolean b;

    static {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a.a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fbe0eb314337b73a438788fa792dddcc", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fbe0eb314337b73a438788fa792dddcc")).booleanValue();
        } else if ((a.a().getApplicationInfo().flags & 2) != 0) {
            z = true;
        }
        b = z;
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ffc28b57f02d55f71135dc50d2bbb1cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ffc28b57f02d55f71135dc50d2bbb1cc");
        } else {
            System.out.println(c(str, str2, null));
        }
    }

    public static void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ab8f8bbf032216d0b65e69fdabefb2e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ab8f8bbf032216d0b65e69fdabefb2e1");
        } else {
            System.err.println(c(str, str2, null));
        }
    }

    public static void a(String str, String str2, Throwable th) {
        Object[] objArr = {str, str2, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e824d31564e03c445a182316dbb69696", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e824d31564e03c445a182316dbb69696");
        } else {
            System.err.println(c(str, str2, th));
        }
    }

    private static String c(String str, String str2, Throwable th) {
        Object[] objArr = {str, str2, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c7fe4861c6ef81914ff8bc3eba7ed8f1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c7fe4861c6ef81914ff8bc3eba7ed8f1");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[MTWebView][");
        sb.append(str);
        sb.append("] ");
        sb.append(str2);
        if (th != null) {
            sb.append('\n');
            sb.append(Log.getStackTraceString(th));
        }
        return sb.toString();
    }

    public static void c(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "526ce3b550d3c7fd87660b0327312258", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "526ce3b550d3c7fd87660b0327312258");
        } else {
            b(str, str2, null);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        Object[] objArr = {str, str2, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3b0d73489e8d6b877f14068b4a3e7db4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3b0d73489e8d6b877f14068b4a3e7db4");
            return;
        }
        String c = c(str, str2, th);
        com.dianping.networklog.c.a(c, 3, new String[]{"MTWebView"});
        if (b) {
            System.err.println(c);
        }
    }
}
