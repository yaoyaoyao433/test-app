package com.meituan.android.base.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.constraint.R;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class NoDefaultPaddingTextView extends View {
    public static ChangeQuickRedirect a;
    private TextPaint b;
    private String c;
    private Rect d;
    private float e;
    private int f;

    public NoDefaultPaddingTextView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca66b8629254064a48ef3a2052658911", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca66b8629254064a48ef3a2052658911");
            return;
        }
        this.c = "";
        this.d = new Rect();
        a(context, null, 0, 0);
    }

    public NoDefaultPaddingTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2642e7ead91d9bf323c92111a912069b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2642e7ead91d9bf323c92111a912069b");
            return;
        }
        this.c = "";
        this.d = new Rect();
        a(context, attributeSet, i, 0);
    }

    private void a(Context context, AttributeSet attributeSet, int i, int i2) {
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e7a362e63f45a8b8fe9fb1d22dd1c2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e7a362e63f45a8b8fe9fb1d22dd1c2b");
            return;
        }
        a(context, attributeSet);
        setWillNotDraw(false);
        this.b = new TextPaint();
        this.b.setTextSize(this.e);
        this.b.setColor(this.f);
        this.b.setTextAlign(Paint.Align.LEFT);
        this.b.setAntiAlias(true);
    }

    private void a(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cea4989011c66de119d01c388a825770", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cea4989011c66de119d01c388a825770");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.nopadding_text_color, R.attr.nopadding_text_size, R.attr.nopadding_text});
        this.f = obtainStyledAttributes.getColor(0, getResources().getColor(R.color.commonui_black2));
        this.e = obtainStyledAttributes.getDimensionPixelSize(1, a(context, 28.0f));
        this.c = obtainStyledAttributes.getString(2);
        if (TextUtils.isEmpty(this.c)) {
            this.c = "";
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b0751fbf104b35ec1d1ecdc42e6ab91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b0751fbf104b35ec1d1ecdc42e6ab91");
            return;
        }
        super.onDraw(canvas);
        if (this.c != null) {
            canvas.drawText(this.c, (int) ((getWidth() - ((int) this.b.measureText(this.c))) / 2.0f), (getHeight() - ((getHeight() - this.d.height()) / 2)) - this.d.bottom, this.b);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int width;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f1a35c5adcea1a7b141c4272d44c75c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f1a35c5adcea1a7b141c4272d44c75c");
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (TextUtils.isEmpty(this.c)) {
            i3 = 0;
            z = false;
            i4 = 0;
        } else {
            if (mode == 1073741824) {
                i4 = size;
                z = false;
            } else {
                z = true;
                i4 = 0;
            }
            if (mode2 == 1073741824) {
                i3 = size2;
            } else {
                i3 = 0;
                z = true;
            }
        }
        if (z) {
            int measureText = (int) this.b.measureText(this.c);
            this.b.getTextBounds(this.c, 0, this.c.length(), this.d);
            if (mode == Integer.MIN_VALUE) {
                width = Math.min(size, measureText);
            } else {
                width = this.d.width();
            }
            i4 = width;
            if (mode2 == Integer.MIN_VALUE) {
                i3 = Math.min(size2, this.d.height());
            } else {
                i3 = this.d.height();
            }
        }
        setMeasuredDimension(i4, i3);
    }

    private static int a(Context context, float f) {
        Object[] objArr = {context, Float.valueOf(28.0f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dbb436710583ce739d7dcc7f44d63f33", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dbb436710583ce739d7dcc7f44d63f33")).intValue() : (int) ((context.getResources().getDisplayMetrics().scaledDensity * 28.0f) + 0.5f);
    }

    public String getText() {
        return this.c;
    }

    public void setText(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d62940d2985d7df4d96f231288942190", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d62940d2985d7df4d96f231288942190");
            return;
        }
        if (str == null) {
            this.c = "";
        } else {
            this.c = str;
        }
        this.b.getTextBounds(str, 0, str.length(), this.d);
        requestLayout();
    }

    public float getTextSize() {
        return this.e;
    }

    public void setTextSize(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fe77e40de0adbc60454859aa1319ad7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fe77e40de0adbc60454859aa1319ad7");
            return;
        }
        this.e = f;
        this.b.setTextSize(f);
        requestLayout();
    }

    public int getTextColor() {
        return this.f;
    }

    public void setTextColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41a0b0ad5254e95461f13b52464bc5e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41a0b0ad5254e95461f13b52464bc5e0");
            return;
        }
        this.f = i;
        this.b.setColor(this.f);
        invalidate();
    }
}
