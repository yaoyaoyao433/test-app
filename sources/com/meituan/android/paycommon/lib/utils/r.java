package com.meituan.android.paycommon.lib.utils;

import com.meituan.android.paybase.utils.ae;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class r {
    public static ChangeQuickRedirect a;

    private static void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5c770516feb4faae5cc6b753e8506a35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5c770516feb4faae5cc6b753e8506a35");
            return;
        }
        try {
            ae.a(str, map, "c_pay_l8d5iya4", "com.meituan.android.paycommon.lib.utils.PaymentDialogStatisticsUtilsUtil");
        } catch (Exception unused) {
            com.meituan.android.paybase.common.analyse.cat.a.a("PaymentDialogStatisticsUtilsUtil", "techMis");
        }
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7ceeb6318facc2a30ecc6d33f46af545", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7ceeb6318facc2a30ecc6d33f46af545");
        } else {
            a(str, (Map<String, Object>) null);
        }
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "03f7b77782821fd426e3bd1ea7fba317", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "03f7b77782821fd426e3bd1ea7fba317");
            return;
        }
        try {
            HashMap hashMap = new HashMap(1);
            hashMap.put("errorMessage", str2);
            a(str, hashMap);
        } catch (Exception unused) {
            com.meituan.android.paybase.common.analyse.cat.a.a("PaymentDialogStatisticsUtilsUtil", "error");
        }
    }
}
