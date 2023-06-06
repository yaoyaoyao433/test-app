package com.meituan.android.paybase.utils;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.support.annotation.ColorInt;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class l {
    public static ChangeQuickRedirect a;

    public static GradientDrawable a(float f, int i) {
        Object[] objArr = {Float.valueOf(f), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0be07912af4127f43237adb1ba5af3c0", RobustBitConfig.DEFAULT_VALUE) ? (GradientDrawable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0be07912af4127f43237adb1ba5af3c0") : a(f, i, -1, 0);
    }

    private static GradientDrawable a(float f, @ColorInt int i, int i2, int i3) {
        Object[] objArr = {Float.valueOf(f), Integer.valueOf(i), -1, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "39448a498eadd8671da464f8b3a57225", RobustBitConfig.DEFAULT_VALUE)) {
            return (GradientDrawable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "39448a498eadd8671da464f8b3a57225");
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(f);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    public static void a(View view, Drawable drawable) {
        Object[] objArr = {view, drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ed85b574b9666e0ece816b3a667ffc48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ed85b574b9666e0ece816b3a667ffc48");
        } else if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }
}
