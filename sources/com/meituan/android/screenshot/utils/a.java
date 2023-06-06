package com.meituan.android.screenshot.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final boolean b = "meituaninternaltest".equals(com.meituan.android.base.a.f);

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0b9996a2969757e89b979448b01ef153", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0b9996a2969757e89b979448b01ef153");
        } else if (b) {
            throw new RuntimeException(str);
        }
    }

    public static void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0542e4dccf1cfb595408e5acd9f17f15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0542e4dccf1cfb595408e5acd9f17f15");
        } else if (b) {
            throw new RuntimeException(th);
        }
    }
}
