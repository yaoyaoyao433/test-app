package com.meituan.msc.mmpviews.shell.background;

import android.support.v4.view.ViewCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static int a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0af42a0a139a869e2d28a5fac4260e75", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0af42a0a139a869e2d28a5fac4260e75")).intValue();
        }
        if (i2 == 255) {
            return i;
        }
        if (i2 == 0) {
            return i & ViewCompat.MEASURED_SIZE_MASK;
        }
        return (i & ViewCompat.MEASURED_SIZE_MASK) | ((((i >>> 24) * (i2 + (i2 >> 7))) >> 8) << 24);
    }
}
