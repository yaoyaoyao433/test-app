package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.annotation.RequiresApi;
/* compiled from: ProGuard */
@RequiresApi(21)
/* loaded from: classes.dex */
public final class al extends Drawable {
    float a;
    float b;
    ColorStateList c;
    private final RectF e;
    private final Rect f;
    private PorterDuffColorFilter i;
    private ColorStateList j;
    private boolean g = false;
    private boolean h = true;
    private PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;
    private final Paint d = new Paint(5);

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public al(ColorStateList colorStateList, float f) {
        this.a = f;
        a(colorStateList);
        this.e = new RectF();
        this.f = new Rect();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.c = colorStateList;
        this.d.setColor(this.c.getColorForState(getState(), this.c.getDefaultColor()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(float f, boolean z, boolean z2) {
        if (f == this.b && this.g == z && this.h == z2) {
            return;
        }
        this.b = f;
        this.g = z;
        this.h = z2;
        a((Rect) null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.d;
        if (this.i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.i);
            z = true;
        }
        canvas.drawRoundRect(this.e, this.a, this.a, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.e.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f.set(rect);
        if (this.g) {
            float a = am.a(this.b, this.a, this.h);
            this.f.inset((int) Math.ceil(am.b(this.b, this.a, this.h)), (int) Math.ceil(a));
            this.e.set(this.f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f, this.a);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.d.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        this.i = a(this.j, this.k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.k = mode;
        this.i = a(this.j, this.k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        int colorForState = this.c.getColorForState(iArr, this.c.getDefaultColor());
        boolean z = colorForState != this.d.getColor();
        if (z) {
            this.d.setColor(colorForState);
        }
        if (this.j == null || this.k == null) {
            return z;
        }
        this.i = a(this.j, this.k);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (this.j == null || !this.j.isStateful()) {
            return (this.c != null && this.c.isStateful()) || super.isStateful();
        }
        return true;
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }
}
