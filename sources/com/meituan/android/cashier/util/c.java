package com.meituan.android.cashier.util;

import com.meituan.android.cashier.common.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static long b;

    public static void a(long j) {
        b = j;
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "88c61e6b98d5262d4239be0575f35fdb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "88c61e6b98d5262d4239be0575f35fdb");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(System.currentTimeMillis() - b));
        hashMap.put("lastResumedPage", str);
        q.a("c_PJmoK", "b_ti8debp1", "", hashMap, str2);
    }

    public static String b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dc544fac68c0ff350848c779ea58b0e1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dc544fac68c0ff350848c779ea58b0e1") : "hybrid_preposed_mtcashier".equals(str) ? "degrade_from_preposed_mtcashier" : "oneclickpay".equals(str) ? "degrade_from_oneclickpay" : "hybrid_standard_cashier".equals(str) ? "degrade_from_hybrid_cashier" : str2;
    }
}
