package com.meituan.roodesign.widgets.internal;

import android.graphics.Color;
import android.support.annotation.AttrRes;
import android.support.annotation.ColorInt;
import android.support.annotation.FloatRange;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.v4.graphics.ColorUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;

    @ColorInt
    public static int a(@NonNull View view, @AttrRes int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "52bdf6d18159ab5da8546965ce4668ad", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "52bdf6d18159ab5da8546965ce4668ad")).intValue() : com.meituan.roodesign.widgets.resources.a.a(view, i);
    }

    @ColorInt
    public static int a(@ColorInt int i, @ColorInt int i2, @FloatRange(from = 0.0d, to = 1.0d) float f) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "23e3f4b4be6be4cff2b6e31574fc1891", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "23e3f4b4be6be4cff2b6e31574fc1891")).intValue() : a(i, ColorUtils.setAlphaComponent(i2, Math.round(Color.alpha(i2) * f)));
    }

    @ColorInt
    private static int a(@ColorInt int i, @ColorInt int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ba53fa2f34ac04cb50eabe20a4df4f80", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ba53fa2f34ac04cb50eabe20a4df4f80")).intValue() : ColorUtils.compositeColors(i2, i);
    }
}
