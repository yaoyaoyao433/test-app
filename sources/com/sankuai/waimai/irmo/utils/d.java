package com.sankuai.waimai.irmo.utils;

import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static ExecutorService b = com.sankuai.android.jarvis.c.a("INF-Log");
    private static int c = 2;

    public static void a(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "abbccf6aee39eff0f55a437d31914bf7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "abbccf6aee39eff0f55a437d31914bf7");
        } else if (TextUtils.isEmpty(str) || c > 3) {
        } else {
            a(f(str, objArr), 3);
        }
    }

    public static void b(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "be509432b370d28a10acdd107903c8fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "be509432b370d28a10acdd107903c8fa");
        } else if (TextUtils.isEmpty(str) || c > 4) {
        } else {
            a(f(str, objArr), 4);
        }
    }

    public static void c(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "b4d2ae606746327bd0f2e7cde8e336ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "b4d2ae606746327bd0f2e7cde8e336ca");
        } else if (TextUtils.isEmpty(str) || c > 2) {
        } else {
            a(f(str, objArr), 2);
        }
    }

    public static void d(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "6715ee50d1711c67d102e128235fe3f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "6715ee50d1711c67d102e128235fe3f6");
        } else if (TextUtils.isEmpty(str) || c > 5) {
        } else {
            a(f(str, objArr), 5);
        }
    }

    public static void e(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "e96c059fa9092c94a72e9224dcd26b5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "e96c059fa9092c94a72e9224dcd26b5f");
        } else if (TextUtils.isEmpty(str) || c > 6) {
        } else {
            a(f(str, objArr), 6);
        }
    }

    private static String f(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "5bcbed17f9ff15ed12a3ca9e6078ade2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "5bcbed17f9ff15ed12a3ca9e6078ade2") : (objArr == null || objArr.length == 0) ? str : String.format(str, objArr);
    }

    private static void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5f5237f830cd4031b31099d9c492c0a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5f5237f830cd4031b31099d9c492c0a2");
            return;
        }
        Log.e("INF_LOG", str);
        a("INF_LOG" + str);
    }

    private static void a(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "268d0f2ee8869ea6560d52629fa737a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "268d0f2ee8869ea6560d52629fa737a7");
            return;
        }
        try {
            b.execute(new Runnable() { // from class: com.sankuai.waimai.irmo.utils.d.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "943ccb9b943e1bd3b7a8252180e95298", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "943ccb9b943e1bd3b7a8252180e95298");
                        return;
                    }
                    try {
                        com.dianping.networklog.c.a(str, 3);
                    } catch (Exception unused) {
                    }
                }
            });
        } catch (Exception unused) {
        }
    }
}
