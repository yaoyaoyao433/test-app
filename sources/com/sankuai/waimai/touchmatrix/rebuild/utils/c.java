package com.sankuai.waimai.touchmatrix.rebuild.utils;

import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static int b;
    private static boolean c;

    static {
        int i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "804fa35112184034d239f3ea0b390f90", RobustBitConfig.DEFAULT_VALUE)) {
            i = ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "804fa35112184034d239f3ea0b390f90")).intValue();
        } else {
            i = com.sankuai.waimai.touchmatrix.utils.d.a(com.meituan.android.singleton.b.a, "t_matrix_log_tidy", false) ? 5 : 2;
        }
        b = i;
        c = com.sankuai.waimai.touchmatrix.utils.d.a(com.meituan.android.singleton.b.a, "t_matrix_log_enable", true);
    }

    public static void a(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "7d76332cc0979df1dd3e221b87754109", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "7d76332cc0979df1dd3e221b87754109");
        } else if (!c || TextUtils.isEmpty(str) || b > 3) {
        } else {
            a(f(str, objArr), 3);
        }
    }

    public static void b(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "ec09c6e1b10bb7678902b4ceed2f1578", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "ec09c6e1b10bb7678902b4ceed2f1578");
        } else if (!c || TextUtils.isEmpty(str) || b > 4) {
        } else {
            a(f(str, objArr), 4);
        }
    }

    public static void c(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "f4f53ddc63a4dde38ae68fc5ca4f438b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "f4f53ddc63a4dde38ae68fc5ca4f438b");
        } else if (!c || TextUtils.isEmpty(str) || b > 2) {
        } else {
            a(f(str, objArr), 2);
        }
    }

    public static void d(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "cfc0173461f82e8c9b85d9527983397a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "cfc0173461f82e8c9b85d9527983397a");
        } else if (!c || TextUtils.isEmpty(str) || b > 5) {
        } else {
            a(f(str, objArr), 5);
        }
    }

    public static void e(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "93a731164bb98359676f5579760b9aad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "93a731164bb98359676f5579760b9aad");
        } else if (!c || TextUtils.isEmpty(str) || b > 6) {
        } else {
            a(f(str, objArr), 6);
        }
    }

    private static String f(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "90b5bab8a62b16b83d5a8e46fd67ded8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "90b5bab8a62b16b83d5a8e46fd67ded8") : (objArr == null || objArr.length == 0) ? str : String.format(str, objArr);
    }

    private static void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9c83739f160dc2a2b19bb701a0c2edbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9c83739f160dc2a2b19bb701a0c2edbd");
            return;
        }
        switch (i) {
            case 6:
                Log.e("T_MATRIX_LOG: ", str);
                break;
        }
        a("T_MATRIX_LOG: " + str);
        com.sankuai.waimai.touchmatrix.utils.a a2 = com.sankuai.waimai.touchmatrix.utils.a.a();
        a2.a("\nT_MATRIX_LOG: " + str);
    }

    private static void a(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d0709003b6fabc90103cd5f7be392173", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d0709003b6fabc90103cd5f7be392173");
            return;
        }
        try {
            e.b().execute(new Runnable() { // from class: com.sankuai.waimai.touchmatrix.rebuild.utils.c.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "be812a4eaa4877f0f2f17a23cca34807", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "be812a4eaa4877f0f2f17a23cca34807");
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
