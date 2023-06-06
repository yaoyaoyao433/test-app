package com.sankuai.waimai.restaurant.shopcart.widget.tablayout;

import android.support.v4.view.animation.FastOutLinearInInterpolator;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.support.v4.view.animation.LinearOutSlowInInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static final Interpolator b = new LinearInterpolator();
    public static final Interpolator c = new FastOutSlowInInterpolator();
    public static final Interpolator d = new FastOutLinearInInterpolator();
    public static final Interpolator e = new LinearOutSlowInInterpolator();
    public static final Interpolator f = new DecelerateInterpolator();

    public static int a(int i, int i2, float f2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dc60c82b103e2e28c9a7da5a7c5f8287", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dc60c82b103e2e28c9a7da5a7c5f8287")).intValue() : i + Math.round(f2 * (i2 - i));
    }
}
