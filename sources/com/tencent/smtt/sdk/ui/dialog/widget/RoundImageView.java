package com.tencent.smtt.sdk.ui.dialog.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
/* loaded from: classes6.dex */
public class RoundImageView extends ImageView {
    private Paint a;
    private Xfermode b;
    private Bitmap c;
    private float[] d;
    private RectF e;
    private int f;
    private WeakReference<Bitmap> g;
    private float h;
    private Path i;

    public RoundImageView(Context context) {
        this(context, null);
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        this.f = Color.parseColor("#eaeaea");
        this.a = new Paint();
        this.a.setAntiAlias(true);
        this.i = new Path();
        this.d = new float[8];
        this.e = new RectF();
        this.h = com.tencent.smtt.sdk.ui.dialog.c.a(context, 16.46f);
        for (int i = 0; i < this.d.length; i++) {
            this.d[i] = this.h;
        }
    }

    private Bitmap a() {
        Bitmap bitmap;
        Throwable th;
        try {
            bitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            try {
                Canvas canvas = new Canvas(bitmap);
                Paint paint = new Paint(1);
                paint.setColor(-16777216);
                canvas.drawRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), this.h, this.h, paint);
            } catch (Throwable th2) {
                th = th2;
                th.printStackTrace();
                return bitmap;
            }
        } catch (Throwable th3) {
            bitmap = null;
            th = th3;
        }
        return bitmap;
    }

    private void a(int i, int i2) {
        this.i.reset();
        this.a.setStrokeWidth(i);
        this.a.setColor(i2);
        this.a.setStyle(Paint.Style.STROKE);
    }

    private void a(Canvas canvas, int i, int i2, RectF rectF, float[] fArr) {
        a(i, i2);
        this.i.addRoundRect(rectF, fArr, Path.Direction.CCW);
        canvas.drawPath(this.i, this.a);
    }

    @Override // android.view.View
    public void invalidate() {
        this.g = null;
        if (this.c != null) {
            this.c.recycle();
            this.c = null;
        }
        super.invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    @SuppressLint({"DrawAllocation"})
    protected void onDraw(Canvas canvas) {
        Bitmap bitmap = this.g == null ? null : this.g.get();
        if (bitmap == null || bitmap.isRecycled()) {
            Drawable drawable = getDrawable();
            if (drawable != null) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                float f = intrinsicWidth;
                float f2 = intrinsicHeight;
                float max = Math.max((getWidth() * 1.0f) / f, (getHeight() * 1.0f) / f2);
                drawable.setBounds(0, 0, (int) (f * max), (int) (max * f2));
                drawable.draw(canvas2);
                if (this.c == null || this.c.isRecycled()) {
                    this.c = a();
                }
                this.a.reset();
                this.a.setFilterBitmap(false);
                this.a.setXfermode(this.b);
                if (this.c != null) {
                    canvas2.drawBitmap(this.c, 0.0f, 0.0f, this.a);
                }
                this.a.setXfermode(null);
                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
                this.g = new WeakReference<>(createBitmap);
            }
        } else {
            this.a.setXfermode(null);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.a);
        }
        a(canvas, 1, this.f, this.e, this.d);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.e.set(0.5f, 0.5f, i - 0.5f, i2 - 0.5f);
    }
}
