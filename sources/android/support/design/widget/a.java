package android.support.design.widget;

import android.support.v4.view.animation.FastOutLinearInInterpolator;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.support.v4.view.animation.LinearOutSlowInInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    static final Interpolator a = new LinearInterpolator();
    static final Interpolator b = new FastOutSlowInInterpolator();
    static final Interpolator c = new FastOutLinearInInterpolator();
    static final Interpolator d = new LinearOutSlowInInterpolator();
    static final Interpolator e = new DecelerateInterpolator();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, int i2, float f) {
        return i + Math.round(f * (i2 - i));
    }
}
