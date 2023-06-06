package com.tencent.smtt.sdk.ui.dialog.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
/* loaded from: classes6.dex */
public class c extends Drawable {
    private float a;
    private float b;
    private float c;
    private float d;
    private Path e;
    private Paint f = new Paint();
    private RectF g;

    public c(int i, float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.d = f3;
        this.c = f4;
        this.f.setStyle(Paint.Style.FILL);
        this.f.setAntiAlias(true);
        this.f.setColor(i);
        this.g = new RectF();
    }

    public void a(int i, int i2) {
        this.g.left = 0.0f;
        this.g.top = 0.0f;
        this.g.right = i;
        this.g.bottom = i2;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.e == null) {
            this.e = new Path();
        }
        this.e.reset();
        this.e.addRoundRect(this.g, new float[]{this.a, this.a, this.b, this.b, this.d, this.d, this.c, this.c}, Path.Direction.CCW);
        this.e.close();
        canvas.drawPath(this.e, this.f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
