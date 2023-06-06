package android.support.design.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class i extends android.support.v7.graphics.drawable.a {
    static final double a = Math.cos(Math.toRadians(45.0d));
    final Paint b;
    final Paint c;
    final RectF d;
    float e;
    Path f;
    float g;
    float h;
    float i;
    float j;
    boolean k;
    float l;
    private boolean n;
    private final int o;
    private final int p;
    private final int q;
    private boolean r;

    @Override // android.support.v7.graphics.drawable.a, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public i(Context context, Drawable drawable, float f, float f2, float f3) {
        super(drawable);
        this.n = true;
        this.k = true;
        this.r = false;
        this.o = ContextCompat.getColor(context, R.color.design_fab_shadow_start_color);
        this.p = ContextCompat.getColor(context, R.color.design_fab_shadow_mid_color);
        this.q = ContextCompat.getColor(context, R.color.design_fab_shadow_end_color);
        this.b = new Paint(5);
        this.b.setStyle(Paint.Style.FILL);
        this.e = Math.round(f);
        this.d = new RectF();
        this.c = new Paint(this.b);
        this.c.setAntiAlias(false);
        a(f2, f3);
    }

    private static int b(float f) {
        int round = Math.round(f);
        return round % 2 == 1 ? round - 1 : round;
    }

    @Override // android.support.v7.graphics.drawable.a, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        super.setAlpha(i);
        this.b.setAlpha(i);
        this.c.setAlpha(i);
    }

    @Override // android.support.v7.graphics.drawable.a, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.n = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(float f, float f2) {
        if (f < 0.0f || f2 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float b = b(f);
        float b2 = b(f2);
        if (b > b2) {
            if (!this.r) {
                this.r = true;
            }
            b = b2;
        }
        if (this.j == b && this.h == b2) {
            return;
        }
        this.j = b;
        this.h = b2;
        this.i = Math.round(b * 1.5f);
        this.g = b2;
        this.n = true;
        invalidateSelf();
    }

    @Override // android.support.v7.graphics.drawable.a, android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil(a(this.h, this.e, this.k));
        int ceil2 = (int) Math.ceil(b(this.h, this.e, this.k));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public static float a(float f, float f2, boolean z) {
        return z ? (float) ((f * 1.5f) + ((1.0d - a) * f2)) : f * 1.5f;
    }

    public static float b(float f, float f2, boolean z) {
        return z ? (float) (f + ((1.0d - a) * f2)) : f;
    }

    @Override // android.support.v7.graphics.drawable.a, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        int i;
        int i2;
        if (this.n) {
            Rect bounds = getBounds();
            float f = this.h * 1.5f;
            this.d.set(bounds.left + this.h, bounds.top + f, bounds.right - this.h, bounds.bottom - f);
            this.m.setBounds((int) this.d.left, (int) this.d.top, (int) this.d.right, (int) this.d.bottom);
            RectF rectF = new RectF(-this.e, -this.e, this.e, this.e);
            RectF rectF2 = new RectF(rectF);
            rectF2.inset(-this.i, -this.i);
            if (this.f == null) {
                this.f = new Path();
            } else {
                this.f.reset();
            }
            this.f.setFillType(Path.FillType.EVEN_ODD);
            this.f.moveTo(-this.e, 0.0f);
            this.f.rLineTo(-this.i, 0.0f);
            this.f.arcTo(rectF2, 180.0f, 90.0f, false);
            this.f.arcTo(rectF, 270.0f, -90.0f, false);
            this.f.close();
            float f2 = -rectF2.top;
            if (f2 > 0.0f) {
                float f3 = this.e / f2;
                this.b.setShader(new RadialGradient(0.0f, 0.0f, f2, new int[]{0, this.o, this.p, this.q}, new float[]{0.0f, f3, ((1.0f - f3) / 2.0f) + f3, 1.0f}, Shader.TileMode.CLAMP));
            }
            z = true;
            this.c.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, new int[]{this.o, this.p, this.q}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
            this.c.setAntiAlias(false);
            this.n = false;
        } else {
            z = true;
        }
        int save = canvas.save();
        canvas.rotate(this.l, this.d.centerX(), this.d.centerY());
        float f4 = (-this.e) - this.i;
        float f5 = this.e;
        float f6 = f5 * 2.0f;
        boolean z2 = this.d.width() - f6 > 0.0f;
        if (this.d.height() - f6 <= 0.0f) {
            z = false;
        }
        float f7 = this.j - (this.j * 0.25f);
        float f8 = f5 / ((this.j - (this.j * 0.5f)) + f5);
        float f9 = f5 / (f7 + f5);
        float f10 = f5 / ((this.j - (this.j * 1.0f)) + f5);
        int save2 = canvas.save();
        canvas.translate(this.d.left + f5, this.d.top + f5);
        canvas.scale(f8, f9);
        canvas.drawPath(this.f, this.b);
        if (z2) {
            canvas.scale(1.0f / f8, 1.0f);
            i = save;
            i2 = save2;
            canvas.drawRect(0.0f, f4, this.d.width() - f6, -this.e, this.c);
        } else {
            i = save;
            i2 = save2;
        }
        canvas.restoreToCount(i2);
        int save3 = canvas.save();
        canvas.translate(this.d.right - f5, this.d.bottom - f5);
        canvas.scale(f8, f10);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f, this.b);
        if (z2) {
            canvas.scale(1.0f / f8, 1.0f);
            canvas.drawRect(0.0f, f4, this.d.width() - f6, (-this.e) + this.i, this.c);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        canvas.translate(this.d.left + f5, this.d.bottom - f5);
        canvas.scale(f8, f10);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f, this.b);
        if (z) {
            canvas.scale(1.0f / f10, 1.0f);
            canvas.drawRect(0.0f, f4, this.d.height() - f6, -this.e, this.c);
        }
        canvas.restoreToCount(save4);
        int save5 = canvas.save();
        canvas.translate(this.d.right - f5, this.d.top + f5);
        canvas.scale(f8, f9);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f, this.b);
        if (z) {
            canvas.scale(1.0f / f9, 1.0f);
            canvas.drawRect(0.0f, f4, this.d.height() - f6, -this.e, this.c);
        }
        canvas.restoreToCount(save5);
        canvas.restoreToCount(i);
        super.draw(canvas);
    }

    public final void a(float f) {
        a(f, this.h);
    }
}
