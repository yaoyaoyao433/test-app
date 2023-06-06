package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.StyleableRes;
import android.support.v4.content.res.ResourcesCompat;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class aw {
    public final TypedArray a;
    private final Context b;
    private TypedValue c;

    public static aw a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new aw(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static aw a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new aw(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public static aw a(Context context, int i, int[] iArr) {
        return new aw(context, context.obtainStyledAttributes(i, iArr));
    }

    private aw(Context context, TypedArray typedArray) {
        this.b = context;
        this.a = typedArray;
    }

    public final Drawable a(int i) {
        int resourceId;
        if (this.a.hasValue(i) && (resourceId = this.a.getResourceId(i, 0)) != 0) {
            return android.support.v7.content.res.b.b(this.b, resourceId);
        }
        return this.a.getDrawable(i);
    }

    public final Drawable b(int i) {
        int resourceId;
        if (!this.a.hasValue(i) || (resourceId = this.a.getResourceId(i, 0)) == 0) {
            return null;
        }
        return g.a().a(this.b, resourceId, true);
    }

    @Nullable
    public final Typeface a(@StyleableRes int i, int i2, @NonNull TextView textView) {
        int resourceId = this.a.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.c == null) {
            this.c = new TypedValue();
        }
        return ResourcesCompat.getFont(this.b, resourceId, this.c, i2, textView);
    }

    public final CharSequence c(int i) {
        return this.a.getText(i);
    }

    public final String d(int i) {
        return this.a.getString(i);
    }

    public final boolean a(int i, boolean z) {
        return this.a.getBoolean(i, z);
    }

    public final int a(int i, int i2) {
        return this.a.getInt(i, i2);
    }

    public final float a(int i, float f) {
        return this.a.getFloat(i, f);
    }

    public final int b(int i, int i2) {
        return this.a.getColor(i, i2);
    }

    public final ColorStateList e(int i) {
        int resourceId;
        ColorStateList a;
        return (!this.a.hasValue(i) || (resourceId = this.a.getResourceId(i, 0)) == 0 || (a = android.support.v7.content.res.b.a(this.b, resourceId)) == null) ? this.a.getColorStateList(i) : a;
    }

    public final int c(int i, int i2) {
        return this.a.getInteger(i, i2);
    }

    public final int d(int i, int i2) {
        return this.a.getDimensionPixelOffset(i, i2);
    }

    public final int e(int i, int i2) {
        return this.a.getDimensionPixelSize(i, i2);
    }

    public final int f(int i, int i2) {
        return this.a.getLayoutDimension(i, i2);
    }

    public final int g(int i, int i2) {
        return this.a.getResourceId(i, i2);
    }

    public final boolean f(int i) {
        return this.a.hasValue(i);
    }
}
