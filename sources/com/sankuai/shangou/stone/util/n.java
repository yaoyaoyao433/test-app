package com.sankuai.shangou.stone.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class n {
    public static ChangeQuickRedirect a;

    public static float a(float f, float f2, float f3) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(0.0f), Float.valueOf(1.0f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2899ca7f37500d1d17383dda855e9805", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2899ca7f37500d1d17383dda855e9805")).floatValue();
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4704b8375320bc11b9951c31a9b41ff9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4704b8375320bc11b9951c31a9b41ff9")).intValue();
        }
        if (i > 0) {
            return 1;
        }
        return i < 0 ? -1 : 0;
    }

    public static int b(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a83b58c6bd9e2e82756e2cd529e27044", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a83b58c6bd9e2e82756e2cd529e27044")).intValue() : i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static float a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), 0, Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c67853a53da7f31b97ff45aaaf7656c2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c67853a53da7f31b97ff45aaaf7656c2")).floatValue();
        }
        Object[] objArr2 = {Integer.valueOf(i), 0, Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        return a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "71090be6a859b27850da70cbcbe94e9b", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "71090be6a859b27850da70cbcbe94e9b")).floatValue() : i3 == 0 ? 0.0f : (i + 0) / (i3 + 0), 0.0f, 1.0f);
    }
}
