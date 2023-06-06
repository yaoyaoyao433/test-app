package com.meituan.android.legwork.utils.address;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static boolean a(double d, double d2) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "14f2b9379c62813a59f85433578dab8c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "14f2b9379c62813a59f85433578dab8c")).booleanValue() : !(d == 0.0d && d2 == 0.0d) && d >= -180.0d && d <= 180.0d && d2 >= -90.0d && d2 <= 90.0d;
    }
}
