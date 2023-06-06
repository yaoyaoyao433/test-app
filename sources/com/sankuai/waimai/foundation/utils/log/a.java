package com.sankuai.waimai.foundation.utils.log;

import android.support.annotation.NonNull;
import android.util.Log;
import com.meituan.crashreporter.c;
import com.meituan.metrics.lifecycle.MetricsActivityLifecycleManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.v;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final Executor c = new v();
    private static final String[] d = {"L.wtf", "Critical error"};
    public static boolean b = false;

    public static void a(boolean z) {
        b = true;
    }

    public static void a(@NonNull String str, String str2, Object... objArr) {
        Object[] objArr2 = {str, str2, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "e035c6e56ab652a4924250ae99becaa8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "e035c6e56ab652a4924250ae99becaa8");
        } else if (b) {
            b(str2, objArr);
        }
    }

    public static void a(@NonNull Class cls, String str, Object... objArr) {
        Object[] objArr2 = {cls, str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "86087e9ba2ce209cde6df056102dc2dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "86087e9ba2ce209cde6df056102dc2dc");
        } else if (b) {
            cls.getSimpleName();
            b(str, objArr);
        }
    }

    public static void b(@NonNull String str, String str2, Object... objArr) {
        Object[] objArr2 = {str, str2, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "bc2d1d3756c63bb547d6139ad009f737", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "bc2d1d3756c63bb547d6139ad009f737");
        } else if (b) {
            b(str2, objArr);
        }
    }

    public static void c(@NonNull String str, String str2, Object... objArr) {
        Object[] objArr2 = {str, str2, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "95bef5f3fc970c33e319a9256baa2356", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "95bef5f3fc970c33e319a9256baa2356");
        } else if (b) {
            b(str2, objArr);
        }
    }

    public static void d(@NonNull String str, String str2, Object... objArr) {
        Object[] objArr2 = {str, str2, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "e1c3e0f931f8c5bf790e14a5cdc50110", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "e1c3e0f931f8c5bf790e14a5cdc50110");
        } else if (b) {
            Log.println(5, str, b(str2, objArr));
        }
    }

    public static void a(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "062ea1d06e4b2aaf771c267c19321f6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "062ea1d06e4b2aaf771c267c19321f6e");
        } else {
            e("Throwable", str, objArr);
        }
    }

    public static void e(@NonNull String str, String str2, Object... objArr) {
        Object[] objArr2 = {str, str2, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "43df0774c9ba48121ca37526f0b0a84d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "43df0774c9ba48121ca37526f0b0a84d");
        } else if (b) {
            Log.e(str, b(str2, objArr));
        }
    }

    public static void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9a64fa1184fc911dff469a07061d4850", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9a64fa1184fc911dff469a07061d4850");
        } else if (b) {
            Log.e("Throwable", Log.getStackTraceString(th));
        }
    }

    public static void a(@NonNull String str, Throwable th) {
        Object[] objArr = {str, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "427fd78b21460aff539161debd753800", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "427fd78b21460aff539161debd753800");
        } else if (b) {
            Log.e(str, Log.getStackTraceString(th));
        }
    }

    public static void a(@NonNull String str, String str2, Throwable th) {
        Object[] objArr = {str, str2, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c406d81d9cf5c45a0cc451b7cfc712c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c406d81d9cf5c45a0cc451b7cfc712c7");
        } else if (b) {
            Log.e(str, str2, th);
        }
    }

    public static void a(@NonNull String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2fce54e06970bf8ed621c928370807ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2fce54e06970bf8ed621c928370807ce");
        } else if (b) {
            Log.e(str, str2);
        }
    }

    public static void b(final Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aedaba9875fa351c023639ca41939f8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aedaba9875fa351c023639ca41939f8f");
            return;
        }
        final String str = MetricsActivityLifecycleManager.currentActivity;
        com.sankuai.waimai.launcher.util.aop.b.a(c, new Runnable() { // from class: com.sankuai.waimai.foundation.utils.log.a.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "018288cc131864e5099bfe8641942a14", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "018288cc131864e5099bfe8641942a14");
                    return;
                }
                c.a(th, 1, str, false);
                com.dianping.networklog.c.a(Log.getStackTraceString(th), 3, a.d);
            }
        });
        if (b) {
            Log.wtf("Fatal", th);
        }
    }

    public static void b(@NonNull String str, final Throwable th) {
        Object[] objArr = {str, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bb57d89c9722cda9e6498cd0a2ffc45c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bb57d89c9722cda9e6498cd0a2ffc45c");
            return;
        }
        final String str2 = MetricsActivityLifecycleManager.currentActivity;
        com.sankuai.waimai.launcher.util.aop.b.a(c, new Runnable() { // from class: com.sankuai.waimai.foundation.utils.log.a.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d1326e3b8a7dec08b442d55984e7959f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d1326e3b8a7dec08b442d55984e7959f");
                } else {
                    c.a(th, 1, str2, false);
                }
            }
        });
        if (b) {
            Log.e(str, Log.getStackTraceString(th));
        }
    }

    public static void b(@NonNull String str, String str2, final Throwable th) {
        Object[] objArr = {str, str2, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b109d0a27dbc2b072ff8253ca5d235c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b109d0a27dbc2b072ff8253ca5d235c0");
            return;
        }
        final String str3 = MetricsActivityLifecycleManager.currentActivity;
        com.sankuai.waimai.launcher.util.aop.b.a(c, new Runnable() { // from class: com.sankuai.waimai.foundation.utils.log.a.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "010c0de7d296557f3939a446296d7a70", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "010c0de7d296557f3939a446296d7a70");
                } else {
                    c.a(th, 1, str3, false);
                }
            }
        });
        if (b) {
            Log.e(str, str2, th);
        }
    }

    private static String b(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "8118dfa76ebab66139b8396bd08a2442", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "8118dfa76ebab66139b8396bd08a2442") : (objArr == null || objArr.length == 0) ? str : String.format(str, objArr);
    }
}
