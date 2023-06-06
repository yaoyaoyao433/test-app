package com.sankuai.waimai.foundation.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class o {
    public static ChangeQuickRedirect a;

    public static float a(float f, float f2, float f3) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(0.0f), Float.valueOf(1.0f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9cf7834c43d73fe7723e9f58692bb815", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9cf7834c43d73fe7723e9f58692bb815")).floatValue();
        }
        if (f < 0.0f) {
            return 0.0f;
        }
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    public static int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a311a8d751eafbbf2a1a31bf260994f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a311a8d751eafbbf2a1a31bf260994f")).intValue();
        }
        if (i > 0) {
            return 1;
        }
        return i < 0 ? -1 : 0;
    }

    public static int b(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d761c9058101ade974a67360c88b7b1b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d761c9058101ade974a67360c88b7b1b")).intValue() : i < i2 ? i2 : i > i3 ? i3 : i;
    }

    private static float c(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "93e3b07b8e702f359ade2e3c02a838e3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "93e3b07b8e702f359ade2e3c02a838e3")).floatValue();
        }
        if (i2 == i3) {
            return 0.0f;
        }
        return (i - i2) / (i3 - i2);
    }

    public static float a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "74533cc81a67bdbd553d2805d7fc35ec", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "74533cc81a67bdbd553d2805d7fc35ec")).floatValue() : a(c(i, i2, i3), 0.0f, 1.0f);
    }
}
