package com.meituan.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fba64ee669081f5e45f8ddb28339263", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fba64ee669081f5e45f8ddb28339263");
        }
    }

    private ShadowLayout(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99115bd6a0fbc54bba5480b9f7c22ecc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99115bd6a0fbc54bba5480b9f7c22ecc");
        }
    }

    public ShadowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArray;
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09ec049a8d8677368b61c2742b943e95", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09ec049a8d8677368b61c2742b943e95");
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
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "71d876ed6eae9267a7eb8ae7757ab9e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "71d876ed6eae9267a7eb8ae7757ab9e0");
            return;
        }
        setLayerType(1, null);
        setWillNotDraw(false);
        try {
            typedArray = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.shadowColor, R.attr.shadowRadius, R.attr.shadowDx, R.attr.shadowDy, R.attr.shadowRx, R.attr.shadowRy, R.attr.shadowShape, R.attr.shadowSide, R.attr.sl_cornerRadius, R.attr.sl_shadowRadius, R.attr.sl_shadowColor, R.attr.sl_dx, R.attr.sl_dy});
            if (typedArray != null) {
                try {
                    this.d = typedArray.getColor(0, getContext().getResources().getColor(17170444));
                    this.e = typedArray.getDimension(1, com.meituan.android.base.ui.a.a(getContext(), 0.0f));
                    this.f = typedArray.getDimension(2, com.meituan.android.base.ui.a.a(getContext(), 0.0f));
                    this.g = typedArray.getDimension(3, com.meituan.android.base.ui.a.a(getContext(), 0.0f));
                    this.j = typedArray.getDimension(4, com.meituan.android.base.ui.a.a(getContext(), 0.0f));
                    this.k = typedArray.getDimension(5, com.meituan.android.base.ui.a.a(getContext(), 0.0f));
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

    public void setShadowColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9beffa856f1171975b5177decbca2413", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9beffa856f1171975b5177decbca2413");
            return;
        }
        this.d = i;
        requestLayout();
    }

    public void setShadowRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "512236440b14e6a0b15e4ee219234ff9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "512236440b14e6a0b15e4ee219234ff9");
            return;
        }
        this.e = f;
        requestLayout();
    }

    public void setShadowDx(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce59c7da537214dd455339004a998dbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce59c7da537214dd455339004a998dbb");
            return;
        }
        this.f = f;
        requestLayout();
    }

    public void setShadowDy(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3c4c843d1c553939dc4ec656769f6af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3c4c843d1c553939dc4ec656769f6af");
            return;
        }
        this.g = f;
        requestLayout();
    }

    public void setShadowShape(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "098c369c5de04238f6e0285737366817", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "098c369c5de04238f6e0285737366817");
            return;
        }
        this.i = i;
        requestLayout();
    }

    public void setShadowSide(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdd0fa6a08ad0f06ef9a93a810ccd4cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdd0fa6a08ad0f06ef9a93a810ccd4cc");
            return;
        }
        this.h = i;
        requestLayout();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a19ac2c4a51a02d290a6ba5aa91489b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a19ac2c4a51a02d290a6ba5aa91489b");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1a2dd527710cfaeae5de7d9224be25b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1a2dd527710cfaeae5de7d9224be25b9");
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
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "37f38da0f466410310be0b3e441aa066", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "37f38da0f466410310be0b3e441aa066");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12d2355ba9b4415d5d33fbc08b0c52a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12d2355ba9b4415d5d33fbc08b0c52a5");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54672ffaaaf5a4c340c4234597a8f4c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54672ffaaaf5a4c340c4234597a8f4c2");
            return;
        }
        this.b.reset();
        this.b.setAntiAlias(true);
        this.b.setColor(0);
        this.b.setShadowLayer(this.e, this.f, this.g, this.d);
    }
}
