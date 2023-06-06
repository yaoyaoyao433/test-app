package com.sankuai.waimai.ugc.creator.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.ColorRes;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class CircularProgressBar extends View {
    public static ChangeQuickRedirect a;
    private Paint b;
    private Paint c;
    private RectF d;
    private boolean e;
    private int f;
    private int g;
    private int h;
    private int i;
    private float j;

    public CircularProgressBar(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6eff0d04d9dcd054a983e46d68b2c91", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6eff0d04d9dcd054a983e46d68b2c91");
        }
    }

    private CircularProgressBar(Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b1261c50859987ac31c6549a70a50c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b1261c50859987ac31c6549a70a50c8");
        }
    }

    public CircularProgressBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z = false;
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4dc7732d5878ac2e09bee696d109a06", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4dc7732d5878ac2e09bee696d109a06");
            return;
        }
        this.e = false;
        this.j = 0.0f;
        Object[] objArr2 = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dd69ec8d1dab9994dae6279fcb309b45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dd69ec8d1dab9994dae6279fcb309b45");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.backgroundStrokeColor, R.attr.backgroundStrokeWidth, R.attr.progressStrokeColor, R.attr.progressStrokeWidth});
        this.i = obtainStyledAttributes.getColor(0, 0);
        this.h = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.g = obtainStyledAttributes.getColor(2, -13261);
        this.f = obtainStyledAttributes.getDimensionPixelSize(3, g.a(context, 4.0f));
        obtainStyledAttributes.recycle();
        if (this.i != 0 && this.h > 0) {
            z = true;
        }
        this.e = z;
        this.b = new Paint();
        this.b.setStyle(Paint.Style.STROKE);
        this.b.setAntiAlias(true);
        this.b.setDither(true);
        this.c = new Paint();
        this.c.setStyle(Paint.Style.STROKE);
        this.c.setAntiAlias(true);
        this.c.setDither(true);
        a();
        this.d = new RectF();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aeeac14165dddb3a6f6aa04949712073", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aeeac14165dddb3a6f6aa04949712073");
            return;
        }
        this.b.setStrokeWidth(this.h);
        this.b.setColor(this.i);
        this.c.setStrokeWidth(this.f);
        this.c.setColor(this.g);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f604b58c0f3c428e5b19ada49d4c011", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f604b58c0f3c428e5b19ada49d4c011");
            return;
        }
        super.onMeasure(i, i2);
        int min = Math.min((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        int max = Math.max(this.f, this.h);
        int i3 = max / 2;
        int paddingLeft = getPaddingLeft() + i3;
        int paddingTop = getPaddingTop() + i3;
        int i4 = min - max;
        this.d.left = paddingLeft;
        this.d.top = paddingTop;
        this.d.right = paddingLeft + i4;
        this.d.bottom = paddingTop + i4;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0df7a5fca301810e4b24dbc752a294d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0df7a5fca301810e4b24dbc752a294d2");
            return;
        }
        super.onDraw(canvas);
        if (this.e) {
            canvas.drawArc(this.d, -90.0f, 360.0f, false, this.b);
        }
        canvas.drawArc(this.d, -90.0f, this.j, false, this.c);
    }

    public void setProgressStrokeWidth(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "169416bc045150e25a146d5cb5e78e16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "169416bc045150e25a146d5cb5e78e16");
            return;
        }
        this.f = i;
        a();
        invalidate();
    }

    public void setProgressStrokeColor(@ColorRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9419aba418c2290ce2752485851c6a12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9419aba418c2290ce2752485851c6a12");
            return;
        }
        this.g = ContextCompat.getColor(getContext(), i);
        a();
        invalidate();
    }

    public void setBackgroundStrokeWidth(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50333d28afa97c21d751da0d3f2ad4e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50333d28afa97c21d751da0d3f2ad4e3");
            return;
        }
        this.h = i;
        a();
        invalidate();
    }

    public void setBackgroundStrokeColor(@ColorRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4275a9fd5433594a12ff59c7787d430", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4275a9fd5433594a12ff59c7787d430");
            return;
        }
        this.i = ContextCompat.getColor(getContext(), i);
        a();
        invalidate();
    }

    public void setProgress(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08ab05bec1488dbc714179efec936566", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08ab05bec1488dbc714179efec936566");
            return;
        }
        this.j = f;
        invalidate();
    }
}
