package com.meituan.android.pay.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class o {
    public static ChangeQuickRedirect a = null;
    private static boolean b = false;

    public static void a() {
        b = false;
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "90d2ad5a7997f84b321e6b19991e69bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "90d2ad5a7997f84b321e6b19991e69bb");
        } else if (b) {
        } else {
            b = true;
            com.meituan.android.pay.common.analyse.b.b("b_pay_hybrid_sign_level_cashier_sc", null, str);
        }
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "54c8f3b99ab37176a979cd3323ab8b19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "54c8f3b99ab37176a979cd3323ab8b19");
        } else if (b) {
            com.meituan.android.pay.common.analyse.b.b("b_pay_hybrid_sign_back_cashier_sc", null, str);
            b = false;
        }
    }
}
