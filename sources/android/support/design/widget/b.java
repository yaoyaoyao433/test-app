package android.support.design.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.ColorUtils;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class b extends Drawable {
    float d;
    float e;
    private int f;
    private int g;
    private int h;
    private int i;
    private ColorStateList j;
    private int k;
    final Rect b = new Rect();
    final RectF c = new RectF();
    private boolean l = true;
    final Paint a = new Paint(1);

    public b() {
        this.a.setStyle(Paint.Style.STROKE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i, int i2, int i3, int i4) {
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(float f) {
        if (this.d != f) {
            this.d = f;
            this.a.setStrokeWidth(f * 1.3333f);
            this.l = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect rect;
        if (this.l) {
            Paint paint = this.a;
            copyBounds(this.b);
            float height = this.d / rect.height();
            paint.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{ColorUtils.compositeColors(this.f, this.k), ColorUtils.compositeColors(this.g, this.k), ColorUtils.compositeColors(ColorUtils.setAlphaComponent(this.g, 0), this.k), ColorUtils.compositeColors(ColorUtils.setAlphaComponent(this.i, 0), this.k), ColorUtils.compositeColors(this.i, this.k), ColorUtils.compositeColors(this.h, this.k)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.l = false;
        }
        float strokeWidth = this.a.getStrokeWidth() / 2.0f;
        RectF rectF = this.c;
        copyBounds(this.b);
        rectF.set(this.b);
        rectF.left += strokeWidth;
        rectF.top += strokeWidth;
        rectF.right -= strokeWidth;
        rectF.bottom -= strokeWidth;
        canvas.save();
        canvas.rotate(this.e, rectF.centerX(), rectF.centerY());
        canvas.drawOval(rectF, this.a);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int round = Math.round(this.d);
        rect.set(round, round, round, round);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.a.setAlpha(i);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.k = colorStateList.getColorForState(getState(), this.k);
        }
        this.j = colorStateList;
        this.l = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.d > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.l = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return (this.j != null && this.j.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState;
        if (this.j != null && (colorForState = this.j.getColorForState(iArr, this.k)) != this.k) {
            this.l = true;
            this.k = colorForState;
        }
        if (this.l) {
            invalidateSelf();
        }
        return this.l;
    }
}
