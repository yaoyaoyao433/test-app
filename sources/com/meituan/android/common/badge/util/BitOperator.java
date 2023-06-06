package com.meituan.android.common.badge.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class BitOperator {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static boolean isBitSettled(int i, int i2) {
        return (i & i2) != 0;
    }

    public static int setBit(int i, int i2, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3eb067319778ecdd1cd0da0a295cd28f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3eb067319778ecdd1cd0da0a295cd28f")).intValue() : z ? i | i2 : i & (~i2);
    }
}
