package com.dianping.sdk.pike;

import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class i {
    public static ChangeQuickRedirect a;

    public static void a(String str, String... strArr) {
        Object[] objArr = {str, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c9d20e9c7db2c1b9b7caf50beeb73cd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c9d20e9c7db2c1b9b7caf50beeb73cd0");
        } else if (f.d()) {
            StringBuilder sb = new StringBuilder();
            for (String str2 : strArr) {
                sb.append(str2);
            }
            String.format("%s/%s", "Pike", str);
        }
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6ebd4aa93ba9d0ba26f2989d124c4fef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6ebd4aa93ba9d0ba26f2989d124c4fef");
            return;
        }
        if (f.d()) {
            String.format("%s/%s", "Pike", str);
        }
        com.dianping.networklog.c.a(String.format("%s/%s %s", "Pike", str, str2), 11);
    }

    public static void a(String str, String str2, Throwable th) {
        Object[] objArr = {str, str2, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "94cae391b0b3ad5541e5fae708767330", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "94cae391b0b3ad5541e5fae708767330");
            return;
        }
        if (f.d()) {
            Log.d(String.format("%s/%s", "Pike", str), str2, th);
        }
        com.dianping.networklog.c.a(String.format("%s/%s %s, ex: %s", "Pike", str, str2, a(th)), 11);
    }

    public static String a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c6f2e34b320258bebad7afe7e71b66ae", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c6f2e34b320258bebad7afe7e71b66ae") : com.dianping.nvtunnelkit.logger.b.b(th);
    }

    public static void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f1e63d758458d6bb038408ee47ec103e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f1e63d758458d6bb038408ee47ec103e");
        } else if (f.d()) {
            throw new RuntimeException(str + ": " + str2);
        } else {
            a(str, str2);
        }
    }
}
