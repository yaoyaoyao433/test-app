package com.meituan.passport;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4c4b4f0da3b0dff08c965650be1c4cba", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4c4b4f0da3b0dff08c965650be1c4cba")).booleanValue();
        }
        com.meituan.passport.plugins.q a2 = com.meituan.passport.plugins.q.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.passport.plugins.q.a;
        return (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "8723b3ea97c376660c42d363b53208e2", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.passport.plugins.b) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "8723b3ea97c376660c42d363b53208e2") : a2.h.get()) != null ? false : false;
    }
}
