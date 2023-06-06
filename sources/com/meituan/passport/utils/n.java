package com.meituan.passport.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class n {
    public static ChangeQuickRedirect a;

    public static void a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d40da1d22c6aab08a5067186470a532a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d40da1d22c6aab08a5067186470a532a");
            return;
        }
        com.dianping.networklog.c.a("Passport, " + str + ", " + str2 + ", " + str3, 3);
    }
}
