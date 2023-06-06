package android.support.v7.graphics.drawable;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.support.annotation.FloatRange;
import android.support.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class DrawerArrowDrawable extends Drawable {
    private static final float b = (float) Math.toRadians(45.0d);
    private final Paint a;
    private float c;
    private float d;
    private float e;
    private float f;
    private boolean g;
    private final Path h;
    private final int i;
    private boolean j;
    private float k;
    private float l;
    private int m;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public @interface ArrowDirection {
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void a(boolean z) {
        if (this.j != z) {
            this.j = z;
            invalidateSelf();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (android.support.v4.graphics.drawable.DrawableCompat.getLayoutDirection(r19) == 1) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (android.support.v4.graphics.drawable.DrawableCompat.getLayoutDirection(r19) == 0) goto L6;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r20) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.graphics.drawable.DrawerArrowDrawable.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i != this.a.getAlpha()) {
            this.a.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.i;
    }

    public final void a(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        if (this.k != f) {
            this.k = f;
            invalidateSelf();
        }
    }
}
