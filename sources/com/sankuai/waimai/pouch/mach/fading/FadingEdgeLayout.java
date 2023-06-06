package com.sankuai.waimai.pouch.mach.fading;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class FadingEdgeLayout extends FrameLayout {
    public static ChangeQuickRedirect a;
    private static final int[] b = {0, -16777216};
    private static final int[] c = {-16777216, 0};
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private float h;
    private float i;
    private float j;
    private float k;
    private Paint l;
    private Paint m;
    private Paint n;
    private Paint o;
    private Rect p;
    private Rect q;
    private Rect r;
    private Rect s;
    private int t;

    private float a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7667faa272b6b26dbc761c703c168df5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7667faa272b6b26dbc761c703c168df5")).floatValue();
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        return f;
    }

    public FadingEdgeLayout(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7959f8a33a84dd60e43e5269c3fcc0eb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7959f8a33a84dd60e43e5269c3fcc0eb");
        } else {
            a(null, 0);
        }
    }

    public FadingEdgeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c895598ec3ec314efe614c12b023dc7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c895598ec3ec314efe614c12b023dc7");
        } else {
            a(attributeSet, 0);
        }
    }

    private void a(AttributeSet attributeSet, int i) {
        Object[] objArr = {attributeSet, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88c9c1f09ff617bed71bb0513b4ce317", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88c9c1f09ff617bed71bb0513b4ce317");
            return;
        }
        int applyDimension = (int) TypedValue.applyDimension(1, 20.0f, getResources().getDisplayMetrics());
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.fel_edge, R.attr.fel_size_top, R.attr.fel_size_bottom, R.attr.fel_size_left, R.attr.fel_size_right}, 0, 0);
            int i2 = obtainStyledAttributes.getInt(0, 0);
            this.d = (i2 & 1) == 1;
            this.e = (i2 & 2) == 2;
            this.f = (i2 & 4) == 4;
            this.g = (i2 & 8) == 8;
            this.h = obtainStyledAttributes.getDimensionPixelSize(1, applyDimension);
            this.i = obtainStyledAttributes.getDimensionPixelSize(2, applyDimension);
            this.j = obtainStyledAttributes.getDimensionPixelSize(3, applyDimension);
            this.k = obtainStyledAttributes.getDimensionPixelSize(4, applyDimension);
            if (this.d && this.h > 0.0f) {
                this.t |= 1;
            }
            if (this.f && this.j > 0.0f) {
                this.t |= 4;
            }
            if (this.e && this.i > 0.0f) {
                this.t = 2 | this.t;
            }
            if (this.g && this.k > 0.0f) {
                this.t |= 8;
            }
            obtainStyledAttributes.recycle();
        } else {
            float f = applyDimension;
            this.k = f;
            this.j = f;
            this.i = f;
            this.h = f;
        }
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        this.l = new Paint(1);
        this.l.setXfermode(porterDuffXfermode);
        this.m = new Paint(1);
        this.m.setXfermode(porterDuffXfermode);
        this.n = new Paint(1);
        this.n.setXfermode(porterDuffXfermode);
        this.o = new Paint(1);
        this.o.setXfermode(porterDuffXfermode);
        this.p = new Rect();
        this.r = new Rect();
        this.q = new Rect();
        this.s = new Rect();
    }

    public final void a(float f, float f2, float f3, float f4) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5186c458c3e7b5a5b9ff08bb2478353", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5186c458c3e7b5a5b9ff08bb2478353");
            return;
        }
        if (this.h != a(f)) {
            this.h = a(f);
            this.t |= 1;
        }
        if (this.j != a(f2)) {
            this.j = a(f2);
            this.t |= 4;
        }
        if (this.i != a(f3)) {
            this.i = a(f3);
            this.t |= 2;
        }
        if (this.k != a(f4)) {
            this.k = a(f4);
            this.t |= 8;
        }
        if (this.t != 0) {
            invalidate();
        }
    }

    public final void a(boolean z, boolean z2, boolean z3, boolean z4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), Byte.valueOf(z4 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "500250919bc96ec95f68a08db3112580", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "500250919bc96ec95f68a08db3112580");
            return;
        }
        if (this.d != z) {
            this.d = z;
            this.t |= 1;
        }
        if (this.f != z2) {
            this.f = z2;
            this.t |= 4;
        }
        if (this.e != z3) {
            this.e = z3;
            this.t |= 2;
        }
        if (this.g != z4) {
            this.g = z4;
            this.t |= 8;
        }
        if (this.t != 0) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0293c394c06b80adfc4be8821d0b767e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0293c394c06b80adfc4be8821d0b767e");
            return;
        }
        if (getPaddingLeft() != i) {
            this.t |= 4;
        }
        if (getPaddingTop() != i2) {
            this.t |= 1;
        }
        if (getPaddingRight() != i3) {
            this.t |= 8;
        }
        if (getPaddingBottom() != i4) {
            this.t |= 2;
        }
        super.setPadding(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a5132b8cc7d8ce4e9f745da70474756", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a5132b8cc7d8ce4e9f745da70474756");
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.t |= 4;
            this.t |= 8;
        }
        if (i2 != i4) {
            this.t |= 1;
            this.t |= 2;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3406989f63ded2e52a0fcf64f4ce5fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3406989f63ded2e52a0fcf64f4ce5fe");
            return;
        }
        int width = getWidth();
        int height = getHeight();
        boolean z = this.d || this.e || this.f || this.g;
        if (getVisibility() == 8 || width == 0 || height == 0 || !z) {
            super.dispatchDraw(canvas);
            return;
        }
        if ((this.t & 1) == 1) {
            this.t &= -2;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eb93f4bd2d69b07e0da46f1e97e73365", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eb93f4bd2d69b07e0da46f1e97e73365");
            } else {
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                int width2 = getWidth() - getPaddingRight();
                int min = ((int) Math.min(this.h * getHeight(), height2)) + paddingTop;
                this.p.set(paddingLeft, paddingTop, width2, min);
                float f = paddingLeft;
                this.l.setShader(new LinearGradient(f, paddingTop, f, min, b, (float[]) null, Shader.TileMode.CLAMP));
            }
        }
        if ((this.t & 4) == 4) {
            this.t &= -5;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bb58acfe682019e10f7f4fa0df18655e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bb58acfe682019e10f7f4fa0df18655e");
            } else {
                int width3 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                int paddingLeft2 = getPaddingLeft();
                int paddingTop2 = getPaddingTop();
                int min2 = ((int) Math.min(this.j * getWidth(), width3)) + paddingLeft2;
                this.r.set(paddingLeft2, paddingTop2, min2, getHeight() - getPaddingBottom());
                float f2 = paddingLeft2;
                float f3 = paddingTop2;
                this.n.setShader(new LinearGradient(f2, f3, min2, f3, b, (float[]) null, Shader.TileMode.CLAMP));
            }
        }
        if ((this.t & 2) == 2) {
            this.t &= -3;
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7819aaef43600c5c3852e62d73efbca2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7819aaef43600c5c3852e62d73efbca2");
            } else {
                int height3 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int min3 = (int) Math.min(this.i * getHeight(), height3);
                int paddingLeft3 = getPaddingLeft();
                int paddingTop3 = (getPaddingTop() + height3) - min3;
                int i = min3 + paddingTop3;
                this.q.set(paddingLeft3, paddingTop3, getWidth() - getPaddingRight(), i);
                float f4 = paddingLeft3;
                this.m.setShader(new LinearGradient(f4, paddingTop3, f4, i, c, (float[]) null, Shader.TileMode.CLAMP));
            }
        }
        if ((this.t & 8) == 8) {
            this.t &= -9;
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "75916a79f5a396ed052212335bfe437b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "75916a79f5a396ed052212335bfe437b");
            } else {
                int width4 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                int min4 = (int) Math.min(this.k * getWidth(), width4);
                int paddingLeft4 = (getPaddingLeft() + width4) - min4;
                int paddingTop4 = getPaddingTop();
                int i2 = min4 + paddingLeft4;
                this.s.set(paddingLeft4, paddingTop4, i2, getHeight() - getPaddingBottom());
                float f5 = paddingTop4;
                this.o.setShader(new LinearGradient(paddingLeft4, f5, i2, f5, c, (float[]) null, Shader.TileMode.CLAMP));
            }
        }
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        super.dispatchDraw(canvas);
        if (this.d && this.h > 0.0f) {
            canvas.drawRect(this.p, this.l);
        }
        if (this.e && this.i > 0.0f) {
            canvas.drawRect(this.q, this.m);
        }
        if (this.f && this.j > 0.0f) {
            canvas.drawRect(this.r, this.n);
        }
        if (this.g && this.k > 0.0f) {
            canvas.drawRect(this.s, this.o);
        }
        canvas.restoreToCount(saveLayer);
    }
}
