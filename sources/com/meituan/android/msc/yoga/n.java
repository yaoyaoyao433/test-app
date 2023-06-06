package com.meituan.android.msc.yoga;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class n {
    public static ChangeQuickRedirect a;

    public static long a(int i, int i2) {
        float f;
        float f2;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "252588f6335dca191df9ab2b67e81be1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "252588f6335dca191df9ab2b67e81be1")).longValue();
        }
        Object[] objArr2 = {Float.valueOf(i), Float.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2030ccbd99642dc375c2c3f5876ab247", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2030ccbd99642dc375c2c3f5876ab247")).longValue();
        }
        return Float.floatToRawIntBits(f2) | (Float.floatToRawIntBits(f) << 32);
    }
}
