package com.meituan.android.customerservice.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.meituan.android.customerservice.kit.utils.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ShadowLayout extends RelativeLayout {
    public static ChangeQuickRedirect a;
    private Paint b;
    private RectF c;
    private int d;
    private float e;
    private float f;
    private float g;
    private int h;
    private int i;
    private float j;
    private float k;

    public ShadowLayout(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13a0eae04094fc2f82a70643dbf2aa95", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13a0eae04094fc2f82a70643dbf2aa95");
        }
    }

    public ShadowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "870cdfa7961a59a51b6c1fc9b0e0e45a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "870cdfa7961a59a51b6c1fc9b0e0e45a");
        }
    }

    public ShadowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArray;
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c54ef65ffdfbf6644f5eab154a476359", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c54ef65ffdfbf6644f5eab154a476359");
            return;
        }
        this.b = new Paint(1);
        this.c = new RectF();
        this.d = 0;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 4369;
        this.i = 1;
        this.j = 0.0f;
        this.k = 0.0f;
        Object[] objArr2 = {attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "037986ca5beebf58682bee9745e8ec59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "037986ca5beebf58682bee9745e8ec59");
            return;
        }
        setLayerType(1, null);
        setWillNotDraw(false);
        try {
            typedArray = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.cs_shadowColor, R.attr.cs_shadowRadius, R.attr.cs_shadowDx, R.attr.cs_shadowDy, R.attr.cs_shadowRx, R.attr.cs_shadowRy, R.attr.cs_shadowShape, R.attr.cs_shadowSide});
            if (typedArray != null) {
                try {
                    this.d = typedArray.getColor(0, getContext().getResources().getColor(17170444));
                    this.e = typedArray.getDimension(1, c.a(getContext(), 0.0f));
                    this.f = typedArray.getDimension(2, c.a(getContext(), 0.0f));
                    this.g = typedArray.getDimension(3, c.a(getContext(), 0.0f));
                    this.j = typedArray.getDimension(4, c.a(getContext(), 0.0f));
                    this.k = typedArray.getDimension(5, c.a(getContext(), 0.0f));
                    this.h = typedArray.getInt(7, 4369);
                    this.i = typedArray.getInt(6, 1);
                } catch (Throwable th) {
                    th = th;
                    if (typedArray != null) {
                        typedArray.recycle();
                    }
                    throw th;
                }
            }
            if (typedArray != null) {
                typedArray.recycle();
            }
            a();
        } catch (Throwable th2) {
            th = th2;
            typedArray = null;
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfeee3c7b25695965d572c687062c66c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfeee3c7b25695965d572c687062c66c");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1c0e9a499f1a63acfe4db588243797e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1c0e9a499f1a63acfe4db588243797e5");
        } else {
            int i3 = (this.h & 1) == 1 ? (int) this.e : 0;
            int i4 = (this.h & 16) == 16 ? (int) this.e : 0;
            int i5 = (this.h & 256) == 256 ? (int) this.e : 0;
            int i6 = (this.h & 4096) == 4096 ? (int) this.e : 0;
            if (this.g != 0.0f) {
                i6 += (int) this.g;
            }
            if (this.f != 0.0f) {
                i5 += (int) this.f;
            }
            setPadding(i3, i4, i5, i6);
        }
        super.onMeasure(i, i2);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "39f007906367d569b35616871ce6c77c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "39f007906367d569b35616871ce6c77c");
            return;
        }
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float f = (this.h & 1) == 1 ? this.e : 0.0f;
        float f2 = (this.h & 16) == 16 ? this.e : 0.0f;
        if ((this.h & 256) == 256) {
            measuredWidth = getMeasuredWidth() - this.e;
        }
        if ((this.h & 4096) == 4096) {
            measuredHeight = getMeasuredHeight() - this.e;
        }
        if (this.g != 0.0f) {
            measuredHeight -= this.g;
        }
        if (this.f != 0.0f) {
            measuredWidth -= this.f;
        }
        this.c.left = f;
        this.c.top = f2;
        this.c.right = measuredWidth;
        this.c.bottom = measuredHeight;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92e97a40fb1153448f2c5c1d245250c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92e97a40fb1153448f2c5c1d245250c2");
            return;
        }
        super.onDraw(canvas);
        a();
        if (this.i == 1) {
            canvas.drawRoundRect(this.c, this.j, this.k, this.b);
        } else if (this.i == 16) {
            canvas.drawCircle(this.c.centerX(), this.c.centerY(), Math.min(this.c.width(), this.c.height()) / 2.0f, this.b);
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3948dd52bc0e7bdcaf08ea518ce62b48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3948dd52bc0e7bdcaf08ea518ce62b48");
            return;
        }
        this.b.reset();
        this.b.setAntiAlias(true);
        this.b.setColor(0);
        this.b.setShadowLayer(this.e, this.f, this.g, this.d);
    }
}
