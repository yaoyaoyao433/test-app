package com.meituan.android.neohybrid.v2.neo.recce;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;

    private static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "609b80184de88d848fd3e115eb47d37a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "609b80184de88d848fd3e115eb47d37a");
        }
        return "b_pay_" + str + "_sc";
    }

    public static void a(com.meituan.android.neohybrid.v2.core.a aVar, String str, Map<String, Object> map) {
        Object[] objArr = {aVar, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "59951e7f23da7c3578dda3c61875ad12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "59951e7f23da7c3578dda3c61875ad12");
            return;
        }
        com.meituan.android.neohybrid.v2.neo.report.a.c(aVar, str, map);
        com.meituan.android.neohybrid.v2.neo.report.a.a(aVar, a(str), map);
    }
}
