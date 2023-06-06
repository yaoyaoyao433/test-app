package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class pu extends LinearLayout {
    private Path a;
    private Paint b;
    private Paint c;
    private RectF d;
    private float e;
    private float f;
    private int g;

    public pu(Context context) {
        super(context);
        this.g = -1;
        a();
    }

    private pu(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = -1;
        a();
    }

    private void a() {
        this.f = getResources().getDisplayMetrics().density / 2.0f;
        this.a = new Path();
        b();
    }

    private void b() {
        this.b = new Paint();
        this.b.setColor(this.g);
        this.b.setAntiAlias(true);
        this.b.setStyle(Paint.Style.FILL);
        this.b.setShadowLayer(this.f, 0.0f, 0.0f, -1);
        this.c = new Paint();
        this.c.setColor(this.g);
        this.c.setAntiAlias(true);
        this.c.setStyle(Paint.Style.STROKE);
        this.c.setShadowLayer(this.f, 0.0f, 0.0f, -16777216);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int saveLayer = canvas.saveLayer(this.d, null, 31);
        canvas.drawColor(this.g);
        canvas.drawPath(this.a, this.c);
        if (Build.VERSION.SDK_INT <= 27) {
            this.b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas.drawPath(this.a, this.b);
        } else {
            this.b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            Path path = new Path();
            path.addRect(0.0f, 0.0f, getWidth(), getHeight(), Path.Direction.CW);
            path.op(this.a, Path.Op.DIFFERENCE);
            canvas.drawPath(path, this.b);
        }
        canvas.restoreToCount(saveLayer);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.d == null) {
            this.d = new RectF();
        }
        this.d.right = getMeasuredWidth();
        this.d.bottom = getMeasuredHeight();
        if (this.d.width() < this.d.height()) {
            this.e = this.d.width() / 2.0f;
        } else {
            this.e = this.d.height() / 2.0f;
        }
        this.a.reset();
        this.a.addRoundRect(this.d, this.e, this.e, Path.Direction.CW);
    }

    private void a(Canvas canvas) {
        if (Build.VERSION.SDK_INT <= 27) {
            this.b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas.drawPath(this.a, this.b);
            return;
        }
        this.b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        Path path = new Path();
        path.addRect(0.0f, 0.0f, getWidth(), getHeight(), Path.Direction.CW);
        path.op(this.a, Path.Op.DIFFERENCE);
        canvas.drawPath(path, this.b);
    }

    public final void setDarkStyle(boolean z) {
        if (z) {
            this.g = Color.parseColor("#2C2C2C");
        } else {
            this.g = -1;
        }
        b();
        invalidate();
    }
}
