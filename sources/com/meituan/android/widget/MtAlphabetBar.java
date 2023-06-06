package com.meituan.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MtAlphabetBar extends View {
    public static ChangeQuickRedirect a;
    private float b;
    private float c;
    private boolean d;
    private float e;
    private float f;
    private int g;
    private float h;
    private Paint i;
    private String[] j;
    private int k;
    private boolean l;
    private a m;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
    }

    public MtAlphabetBar(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d6c9f93a7969bb6bcb2b220e9b563c4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d6c9f93a7969bb6bcb2b220e9b563c4");
        }
    }

    private MtAlphabetBar(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5307412761b3115c3df500012b57d43a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5307412761b3115c3df500012b57d43a");
        }
    }

    public MtAlphabetBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f92fccd8b0e9432dbc27afb8bdde0bd4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f92fccd8b0e9432dbc27afb8bdde0bd4");
            return;
        }
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = false;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0;
        this.h = 0.0f;
        this.l = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.mtText_distance, R.attr.mtText_size, R.attr.mtCenter_vertical}, i, 0);
        this.c = obtainStyledAttributes.getDimension(0, 0.0f);
        this.d = obtainStyledAttributes.getBoolean(2, false);
        this.b = obtainStyledAttributes.getDimension(1, 0.0f);
        obtainStyledAttributes.recycle();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5d086b5ad8e928a2849f449faa71e191", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5d086b5ad8e928a2849f449faa71e191");
            return;
        }
        this.i = new Paint();
        this.i.setColor(a("#999999", Color.alpha(0)));
        this.i.setAntiAlias(true);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        String[] strArr;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e01d55c6ad1b119a3c3b17e19f881a6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e01d55c6ad1b119a3c3b17e19f881a6e");
            return;
        }
        super.onMeasure(i, i2);
        if (this.j == null) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        this.k = getMeasuredHeight();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f4bd5221c2dd4286070485d8de8e77d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f4bd5221c2dd4286070485d8de8e77d7");
        } else {
            this.e = (this.k / 26.0f) * 0.8f;
            if (this.b <= 0.0f && this.c <= 0.0f) {
                a();
            } else if (this.b <= 0.0f) {
                if ((this.e * this.j.length) + (this.c * (this.j.length - 1)) > this.k) {
                    a();
                } else {
                    this.f = this.c;
                    this.g = (int) ((this.e * this.j.length) + (this.f * (this.j.length - 1)));
                }
            } else if (this.c <= 0.0f) {
                if (this.b * this.j.length > this.k) {
                    a();
                } else {
                    this.e = this.b;
                    this.f = (this.k - (this.e * this.j.length)) / (this.j.length - 1);
                    this.g = this.k;
                }
            } else if ((this.b * this.j.length) + (this.c * (this.j.length - 1)) > this.k) {
                a();
            } else {
                this.e = this.b;
                this.f = this.c;
                this.g = (int) ((this.b * this.j.length) + (this.c * (this.j.length - 1)));
            }
        }
        this.h = this.d ? (this.k - this.g) / 2 : 0.0f;
        this.i.setTextSize(this.e);
        for (String str : this.j) {
            if (measuredWidth < this.i.measureText(str)) {
                setMeasuredDimension(View.MeasureSpec.makeMeasureSpec((int) this.i.measureText(str), 1073741824), View.MeasureSpec.makeMeasureSpec(this.k, 1073741824));
                return;
            }
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i = 0;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "624c8bcd09636981d72291549b1d3c65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "624c8bcd09636981d72291549b1d3c65");
            return;
        }
        super.onDraw(canvas);
        if (this.j == null || this.j.length == 0) {
            return;
        }
        int width = getWidth();
        while (i < this.j.length) {
            int i2 = i + 1;
            canvas.drawText(this.j[i], (width / 2) - (this.i.measureText(this.j[i]) / 2.0f), (this.e * i2) + (this.f * i) + this.h, this.i);
            i = i2;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9edd0b2ba11a37d4c820ccbba9ef941", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9edd0b2ba11a37d4c820ccbba9ef941")).booleanValue();
        }
        if (this.j == null) {
            return true;
        }
        motionEvent.getAction();
        motionEvent.getY();
        invalidate();
        return true;
    }

    public void setAlphas(String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b512e09fcca8e5a66eef373f3ae958c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b512e09fcca8e5a66eef373f3ae958c3");
            return;
        }
        this.j = strArr;
        invalidate();
        requestLayout();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71c00be5bd400e3f478fbbbf89c26628", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71c00be5bd400e3f478fbbbf89c26628");
            return;
        }
        this.f = (this.k - (this.e * this.j.length)) / (this.j.length - 1);
        this.g = this.k;
    }

    private static int a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8417be506bc362fbef890f4f01db12e0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8417be506bc362fbef890f4f01db12e0")).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return i;
        }
    }

    public void setTouchable(boolean z) {
        this.l = z;
    }

    public void setOnTouchingLetterChangedListener(a aVar) {
        this.m = aVar;
    }
}
