package com.sankuai.xm.video;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.support.constraint.R;
import android.support.v4.internal.view.SupportMenu;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class RoundProgressBar extends View {
    public static ChangeQuickRedirect a;
    private Paint b;
    private int c;
    private int d;
    private int e;
    private float f;
    private float g;
    private float h;
    private int i;
    private int j;
    private boolean k;
    private int l;

    public RoundProgressBar(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf04d16bbacfe8b229c591028c198242", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf04d16bbacfe8b229c591028c198242");
        }
    }

    public RoundProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc8b5d90f86c94135d163ab50863ff5c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc8b5d90f86c94135d163ab50863ff5c");
        }
    }

    public RoundProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8fb2f6003bfbce48a970a91c23d12e5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8fb2f6003bfbce48a970a91c23d12e5");
            return;
        }
        this.b = new Paint();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.video_roundColor, R.attr.video_progressColor, R.attr.video_roundWidth, R.attr.video_roundMargin, R.attr.video_textColor, R.attr.video_textSize, R.attr.video_progress_max, R.attr.video_textIsDisplayable, R.attr.video_style});
        this.c = obtainStyledAttributes.getColor(0, SupportMenu.CATEGORY_MASK);
        this.d = obtainStyledAttributes.getColor(1, -16711936);
        this.e = obtainStyledAttributes.getColor(4, -16711936);
        this.f = obtainStyledAttributes.getDimension(5, 15.0f);
        this.g = obtainStyledAttributes.getDimension(2, 5.0f);
        this.h = obtainStyledAttributes.getDimension(3, 0.0f);
        this.i = obtainStyledAttributes.getInteger(6, 100);
        this.k = obtainStyledAttributes.getBoolean(7, false);
        this.l = obtainStyledAttributes.getInt(8, 1);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ac15912b4daf81aec6c5f58dc14826b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ac15912b4daf81aec6c5f58dc14826b");
            return;
        }
        super.onDraw(canvas);
        int width = getWidth() / 2;
        float f = width;
        int i = (int) (f - (this.g / 2.0f));
        this.b.setColor(this.c);
        this.b.setStyle(Paint.Style.STROKE);
        this.b.setStrokeWidth(this.g);
        this.b.setAntiAlias(true);
        canvas.drawCircle(f, f, i, this.b);
        this.b.setStrokeWidth(0.0f);
        this.b.setColor(this.e);
        this.b.setTextSize(this.f);
        this.b.setTypeface(Typeface.DEFAULT_BOLD);
        int i2 = (int) ((this.j / this.i) * 100.0f);
        float measureText = this.b.measureText(i2 + "%");
        if (this.k && i2 != 0 && this.l == 0) {
            canvas.drawText(i2 + "%", f - (measureText / 2.0f), f + (this.f / 2.0f), this.b);
        }
        this.b.setStrokeWidth(this.g);
        this.b.setColor(this.d);
        float f2 = width - i;
        float f3 = width + i;
        RectF rectF = new RectF(this.g + f2 + this.h, f2 + this.g + this.h, (f3 - this.g) - this.h, (f3 - this.g) - this.h);
        switch (this.l) {
            case 0:
                this.b.setStyle(Paint.Style.STROKE);
                canvas.drawArc(rectF, 270.0f, (this.j * 360) / this.i, false, this.b);
                return;
            case 1:
                this.b.setStyle(Paint.Style.FILL);
                canvas.drawArc(rectF, 270.0f, (this.j * 360) / this.i, true, this.b);
                return;
            default:
                return;
        }
    }

    public synchronized int getMax() {
        return this.i;
    }

    public synchronized void setMax(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "454ac8260de3fc9cd4f764e72048972c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "454ac8260de3fc9cd4f764e72048972c");
        } else if (i < 0) {
            throw new IllegalArgumentException("mMax not less than 0");
        } else {
            this.i = i;
        }
    }

    public synchronized int getProgress() {
        return this.j;
    }

    public synchronized void setProgress(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08ada1c654b20f62eb2526edcc382a17", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08ada1c654b20f62eb2526edcc382a17");
        } else if (i < 0) {
            throw new IllegalArgumentException("mProgress not less than 0");
        } else {
            if (i > this.i) {
                i = this.i;
            }
            this.j = i;
            postInvalidate();
        }
    }

    public int getCricleColor() {
        return this.c;
    }

    public void setCricleColor(int i) {
        this.c = i;
    }

    public int getCricleProgressColor() {
        return this.d;
    }

    public void setCricleProgressColor(int i) {
        this.d = i;
    }

    public int getTextColor() {
        return this.e;
    }

    public void setTextColor(int i) {
        this.e = i;
    }

    public float getTextSize() {
        return this.f;
    }

    public void setTextSize(float f) {
        this.f = f;
    }

    public float getRoundWidth() {
        return this.g;
    }

    public void setRoundWidth(float f) {
        this.g = f;
    }
}
