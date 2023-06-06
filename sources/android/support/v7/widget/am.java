package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class am extends Drawable {
    static a a;
    private static final double g = Math.cos(Math.toRadians(45.0d));
    float b;
    float c;
    float d;
    ColorStateList e;
    private final int h;
    private Paint j;
    private Paint k;
    private final RectF l;
    private Path m;
    private float n;
    private final int o;
    private final int p;
    boolean f = true;
    private boolean q = true;
    private boolean r = false;
    private Paint i = new Paint(5);

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public am(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.o = resources.getColor(R.color.cardview_shadow_start_color);
        this.p = resources.getColor(R.color.cardview_shadow_end_color);
        this.h = resources.getDimensionPixelSize(R.dimen.cardview_compat_inset_shadow);
        a(colorStateList);
        this.j = new Paint(5);
        this.j.setStyle(Paint.Style.FILL);
        this.b = (int) (f + 0.5f);
        this.l = new RectF();
        this.k = new Paint(this.j);
        this.k.setAntiAlias(false);
        a(f2, f3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.e = colorStateList;
        this.i.setColor(this.e.getColorForState(getState(), this.e.getDefaultColor()));
    }

    private static int a(float f) {
        int i = (int) (f + 0.5f);
        return i % 2 == 1 ? i - 1 : i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z) {
        this.q = z;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.i.setAlpha(i);
        this.j.setAlpha(i);
        this.k.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(float f, float f2) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f + ". Must be >= 0");
        } else if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid max shadow size " + f2 + ". Must be >= 0");
        } else {
            float a2 = a(f);
            float a3 = a(f2);
            if (a2 > a3) {
                if (!this.r) {
                    this.r = true;
                }
                a2 = a3;
            }
            if (this.d == a2 && this.c == a3) {
                return;
            }
            this.d = a2;
            this.c = a3;
            this.n = (int) ((a2 * 1.5f) + this.h + 0.5f);
            this.f = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil(a(this.c, this.b, this.q));
        int ceil2 = (int) Math.ceil(b(this.c, this.b, this.q));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float a(float f, float f2, boolean z) {
        return z ? (float) ((f * 1.5f) + ((1.0d - g) * f2)) : f * 1.5f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float b(float f, float f2, boolean z) {
        return z ? (float) (f + ((1.0d - g) * f2)) : f;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        int colorForState = this.e.getColorForState(iArr, this.e.getDefaultColor());
        if (this.i.getColor() == colorForState) {
            return false;
        }
        this.i.setColor(colorForState);
        this.f = true;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return (this.e != null && this.e.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.i.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        if (this.f) {
            Rect bounds = getBounds();
            float f = this.c * 1.5f;
            this.l.set(bounds.left + this.c, bounds.top + f, bounds.right - this.c, bounds.bottom - f);
            RectF rectF = new RectF(-this.b, -this.b, this.b, this.b);
            RectF rectF2 = new RectF(rectF);
            rectF2.inset(-this.n, -this.n);
            if (this.m == null) {
                this.m = new Path();
            } else {
                this.m.reset();
            }
            this.m.setFillType(Path.FillType.EVEN_ODD);
            this.m.moveTo(-this.b, 0.0f);
            this.m.rLineTo(-this.n, 0.0f);
            this.m.arcTo(rectF2, 180.0f, 90.0f, false);
            this.m.arcTo(rectF, 270.0f, -90.0f, false);
            this.m.close();
            this.j.setShader(new RadialGradient(0.0f, 0.0f, this.b + this.n, new int[]{this.o, this.o, this.p}, new float[]{0.0f, this.b / (this.b + this.n), 1.0f}, Shader.TileMode.CLAMP));
            this.k.setShader(new LinearGradient(0.0f, (-this.b) + this.n, 0.0f, (-this.b) - this.n, new int[]{this.o, this.o, this.p}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
            this.k.setAntiAlias(false);
            this.f = false;
        }
        canvas.translate(0.0f, this.d / 2.0f);
        float f2 = (-this.b) - this.n;
        float f3 = this.b + this.h + (this.d / 2.0f);
        float f4 = f3 * 2.0f;
        boolean z = this.l.width() - f4 > 0.0f;
        boolean z2 = this.l.height() - f4 > 0.0f;
        int save = canvas.save();
        canvas.translate(this.l.left + f3, this.l.top + f3);
        canvas.drawPath(this.m, this.j);
        if (z) {
            i = save;
            canvas.drawRect(0.0f, f2, this.l.width() - f4, -this.b, this.k);
        } else {
            i = save;
        }
        canvas.restoreToCount(i);
        int save2 = canvas.save();
        canvas.translate(this.l.right - f3, this.l.bottom - f3);
        canvas.rotate(180.0f);
        canvas.drawPath(this.m, this.j);
        if (z) {
            canvas.drawRect(0.0f, f2, this.l.width() - f4, (-this.b) + this.n, this.k);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        canvas.translate(this.l.left + f3, this.l.bottom - f3);
        canvas.rotate(270.0f);
        canvas.drawPath(this.m, this.j);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.l.height() - f4, -this.b, this.k);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        canvas.translate(this.l.right - f3, this.l.top + f3);
        canvas.rotate(90.0f);
        canvas.drawPath(this.m, this.j);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.l.height() - f4, -this.b, this.k);
        }
        canvas.restoreToCount(save4);
        canvas.translate(0.0f, (-this.d) / 2.0f);
        a.a(canvas, this.l, this.b, this.i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float a() {
        return (Math.max(this.c, this.b + this.h + (this.c / 2.0f)) * 2.0f) + ((this.c + this.h) * 2.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float b() {
        return (Math.max(this.c, this.b + this.h + ((this.c * 1.5f) / 2.0f)) * 2.0f) + (((this.c * 1.5f) + this.h) * 2.0f);
    }
}
