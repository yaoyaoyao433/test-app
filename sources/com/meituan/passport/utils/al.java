package com.meituan.passport.utils;

import com.meituan.passport.PassportConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class al {
    public static ChangeQuickRedirect a;

    public static int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5b8cdd41df397173e3a8e0110b634d79", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5b8cdd41df397173e3a8e0110b634d79")).intValue() : (!PassportConfig.n() && PassportConfig.o()) ? 2 : 1;
    }
}
