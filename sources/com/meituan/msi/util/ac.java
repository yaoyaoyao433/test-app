package com.meituan.msi.util;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ac {
    public static ChangeQuickRedirect a;
    public static float b;

    private static float a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "de7a308294f1b70aad63ad92a88c22e4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "de7a308294f1b70aad63ad92a88c22e4")).floatValue();
        }
        if (b == 0.0f) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            b = (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4182a08b75770ef5f1c5daa1f5cbfc33", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4182a08b75770ef5f1c5daa1f5cbfc33") : com.meituan.msi.a.f()).getResources().getDisplayMetrics().density;
        }
        return b;
    }

    public static int a(float f) {
        Object[] objArr = {Float.valueOf(55.0f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f71d38c3db4d5d1d996bae9bc43c5df2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f71d38c3db4d5d1d996bae9bc43c5df2")).intValue() : (int) ((a() * 55.0f) + 0.5f);
    }

    public static int b(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e485d72994a9a9fa0c6807f9cf44911a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e485d72994a9a9fa0c6807f9cf44911a")).intValue() : (int) ((f / a()) + 0.5f);
    }
}
