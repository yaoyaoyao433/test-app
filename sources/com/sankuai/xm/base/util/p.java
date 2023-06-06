package com.sankuai.xm.base.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class p {
    public static ChangeQuickRedirect a;
    private static volatile Boolean b;

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f2f0cce7516fc42948a589c16be8ef0b", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f2f0cce7516fc42948a589c16be8ef0b")).booleanValue();
        }
        if (b == null) {
            b = Boolean.valueOf(x.b("android.content.Intent") != null);
        }
        return b.booleanValue();
    }

    public static String a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "68f83a4562fd290c47b058a65dd8e4fe", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "68f83a4562fd290c47b058a65dd8e4fe");
        }
        if (th == null) {
            return "";
        }
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof UnknownHostException) {
                return "";
            }
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    public static int a(Object... objArr) {
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "277af3cef17994ba2a23a49b6b75a23e", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "277af3cef17994ba2a23a49b6b75a23e")).intValue() : Arrays.hashCode(objArr);
    }

    public static boolean a(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ab42d5af4dcb0315039620f25368ded3", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ab42d5af4dcb0315039620f25368ded3")).booleanValue() : obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
