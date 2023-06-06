package com.meituan.android.paybase.fingerprint.soter.sotercore.fingerprint;

import android.content.Context;
import android.os.Build;
import com.meituan.android.paybase.utils.af;
import com.meituan.android.paybase.utils.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static int a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d77b979f16277ab6d26a3c0832720c2f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d77b979f16277ab6d26a3c0832720c2f")).intValue() : g(context);
    }

    public static void a(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "abc736d7017d8cfcc696bf22f216c66f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "abc736d7017d8cfcc696bf22f216c66f");
        } else if (i < 0) {
        } else {
            b(context, i);
        }
    }

    private static long f(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7e5ac9608a6dd5b4ec75b75904e15af3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7e5ac9608a6dd5b4ec75b75904e15af3")).longValue();
        }
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b76fa2d6c9df698c31b7f3abcff43707", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b76fa2d6c9df698c31b7f3abcff43707")).longValue();
        }
        if (context == null) {
            return -1L;
        }
        return af.a(context, i(context)).b("key_last_freeze_time", -1L);
    }

    private static void a(Context context, long j) {
        Object[] objArr = {context, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "549da4e844ff199eb3362c8877ef9e15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "549da4e844ff199eb3362c8877ef9e15");
        } else if (j < -1) {
        } else {
            Object[] objArr2 = {context, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b05079c526be206e0d88a2bf643395a7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b05079c526be206e0d88a2bf643395a7");
            } else if (context != null) {
                af.a(context, i(context)).a("key_last_freeze_time", j);
            }
        }
    }

    public static void b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a4140df858db0977c2b8616c4b2a402f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a4140df858db0977c2b8616c4b2a402f");
            return;
        }
        t.a("SoterAntiBruteForceStrategy", "freeze");
        a(context, 5);
        a(context, System.currentTimeMillis());
    }

    public static void c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b3e1def1885d6c1c6b76725b33f4bf54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b3e1def1885d6c1c6b76725b33f4bf54");
            return;
        }
        t.a("SoterAntiBruteForceStrategy", "unFreeze");
        a(context, -1L);
        a(context, 0);
    }

    public static boolean d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1364baf39c75b73adee7a80ae50dc694", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1364baf39c75b73adee7a80ae50dc694")).booleanValue() : ((int) ((System.currentTimeMillis() - f(context)) / 1000)) > 30;
    }

    public static boolean e(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cde439004d224461fb2148d62ecf8b42", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cde439004d224461fb2148d62ecf8b42")).booleanValue() : a(context) <= 4;
    }

    private static void b(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e8f8a1fd5124f6001dd55678030f52c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e8f8a1fd5124f6001dd55678030f52c7");
        } else if (context == null) {
        } else {
            af.a(context, i(context)).a("key_fail_times", i);
        }
    }

    private static int g(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b59a7c0889bea430fdb002c0afce66e1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b59a7c0889bea430fdb002c0afce66e1")).intValue();
        }
        if (context == null) {
            return 0;
        }
        return af.a(context, i(context)).b("key_fail_times", 0);
    }

    private static String h(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5f2683278274db3c9a003a9f40acf55a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5f2683278274db3c9a003a9f40acf55a");
        }
        return context.getPackageName() + "_preferences";
    }

    private static String i(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ec0b2709c17be86cdef7351258b84037", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ec0b2709c17be86cdef7351258b84037");
        }
        return "jinrong_" + h(context);
    }
}
