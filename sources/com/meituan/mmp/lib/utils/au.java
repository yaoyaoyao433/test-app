package com.meituan.mmp.lib.utils;

import android.content.Context;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class au {
    public static ChangeQuickRedirect a;
    public static float b;

    public static Context a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e4b0ef7d24adf9e0ef9fdfac54620d66", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e4b0ef7d24adf9e0ef9fdfac54620d66") : MMPEnvHelper.getContext();
    }

    private static float c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d8c1f69f2bd334dd26a34ea5a81e5657", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d8c1f69f2bd334dd26a34ea5a81e5657")).floatValue();
        }
        if (b == 0.0f) {
            b = a().getResources().getDisplayMetrics().density;
        }
        return b;
    }

    public static int a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "725e65caa9544450c691dc570c2bf26f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "725e65caa9544450c691dc570c2bf26f")).intValue() : (int) ((f * c()) + 0.5f);
    }

    public static int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e078b2b8f8ea658f5f07330d10e662c6", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e078b2b8f8ea658f5f07330d10e662c6")).intValue() : a().getResources().getDisplayMetrics().widthPixels;
    }
}
