package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v4.graphics.ColorUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class as {
    private static final ThreadLocal<TypedValue> i = new ThreadLocal<>();
    static final int[] a = {-16842910};
    static final int[] b = {16842908};
    static final int[] c = {16843518};
    static final int[] d = {16842919};
    static final int[] e = {16842912};
    static final int[] f = {16842913};
    static final int[] g = {-16842919, -16842908};
    static final int[] h = new int[0];
    private static final int[] j = new int[1];

    public static int a(Context context, int i2) {
        j[0] = i2;
        aw a2 = aw.a(context, (AttributeSet) null, j);
        try {
            return a2.b(0, 0);
        } finally {
            a2.a.recycle();
        }
    }

    public static ColorStateList b(Context context, int i2) {
        j[0] = i2;
        aw a2 = aw.a(context, (AttributeSet) null, j);
        try {
            return a2.e(0);
        } finally {
            a2.a.recycle();
        }
    }

    public static int c(Context context, int i2) {
        ColorStateList b2 = b(context, i2);
        if (b2 != null && b2.isStateful()) {
            return b2.getColorForState(a, b2.getDefaultColor());
        }
        TypedValue typedValue = i.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            i.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f2 = typedValue.getFloat();
        int a2 = a(context, i2);
        return ColorUtils.setAlphaComponent(a2, Math.round(Color.alpha(a2) * f2));
    }
}
