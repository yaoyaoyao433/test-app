package com.dianping.judas.util;

import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    private static volatile boolean b = false;
    private static volatile boolean c = false;

    public static void a(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "8fca3c501d3c186d7d1858845d4c3748", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "8fca3c501d3c186d7d1858845d4c3748");
        } else if (b) {
            a(3, null, str, objArr);
        }
    }

    public static void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "16237d9bcc3a9d05619de8099b3b4c18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "16237d9bcc3a9d05619de8099b3b4c18");
        } else {
            a(6, th, null, new Object[0]);
        }
    }

    public static void b(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "8acf71b51520498f61627b91527306f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "8acf71b51520498f61627b91527306f3");
        } else {
            a(6, null, str, objArr);
        }
    }

    private static void a(int i, Throwable th, String str, Object... objArr) {
        Object[] objArr2 = {Integer.valueOf(i), th, str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "d59cb7071e554d0d949d60070874a1e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "d59cb7071e554d0d949d60070874a1e3");
        } else if (c) {
            String format = objArr.length > 0 ? String.format(str, objArr) : str;
            if (th != null) {
                if (format == null) {
                    format = th.getMessage();
                }
                format = String.format("%1$s\n%2$s", format, Log.getStackTraceString(th));
            }
            Log.println(i, "GAHelper", format);
        }
    }
}
