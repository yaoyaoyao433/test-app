package com.meituan.msc.common.utils;

import android.content.Context;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ar {
    public static ChangeQuickRedirect a;
    public static float b;

    public static Context a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ed1b170340ae8e8b15c67b906f9c2e27", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ed1b170340ae8e8b15c67b906f9c2e27") : MSCEnvHelper.getContext();
    }

    public static float b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d2a681af56f316b2036e7f56d61ad7e2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d2a681af56f316b2036e7f56d61ad7e2")).floatValue();
        }
        if (b == 0.0f) {
            b = a().getResources().getDisplayMetrics().density;
        }
        return b;
    }

    public static int a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a4364abed84f254e002d89ffc3a158b6", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a4364abed84f254e002d89ffc3a158b6")).intValue() : (int) ((f * b()) + 0.5f);
    }

    public static int a(int i, float f) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3e54ceaf6f05ed694a7cf65bf8341da7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3e54ceaf6f05ed694a7cf65bf8341da7")).intValue() : Math.round(i / f);
    }
}
