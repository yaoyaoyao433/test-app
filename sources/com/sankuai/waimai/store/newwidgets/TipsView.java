package com.sankuai.waimai.store.newwidgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class TipsView extends RelativeLayout {
    public static ChangeQuickRedirect a;
    private final Point b;
    private Paint c;
    private int d;
    private int e;
    private int f;
    private float g;
    private final RectF h;
    private final Path i;
    private float j;
    private boolean k;
    private int l;
    private Paint m;
    private RectF n;
    private BlurMaskFilter o;

    public TipsView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f559fd93a7f70701c9531c6c7ced0d77", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f559fd93a7f70701c9531c6c7ced0d77");
        }
    }

    public TipsView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d692de9020109f7a73fcc75e639d7504", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d692de9020109f7a73fcc75e639d7504");
        }
    }

    public TipsView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb0d1abbbedf94af4e2c83eed392b0de", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb0d1abbbedf94af4e2c83eed392b0de");
            return;
        }
        this.g = 37.0f;
        this.h = new RectF();
        this.i = new Path();
        this.j = a(R.dimen.wm_sc_common_dimen_1);
        this.b = new Point(1, 1);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a35b2c72cd87d9a29df496de183213af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a35b2c72cd87d9a29df496de183213af");
        } else {
            setOnClickListener(null);
            setBackgroundColor(0);
            int i2 = (this.e / 2) + 1;
            setPadding(getPaddingLeft() + i2, getPaddingTop() + i2, getPaddingRight() + i2, getPaddingBottom() + i2);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.shadowRadius, R.attr.backColor, R.attr.arrowHeight, R.attr.corner, R.attr.arrowDirection, R.attr.hasShadow});
        int color = obtainStyledAttributes.getColor(1, getContext().getResources().getColor(R.color.wm_sg_color_cc33312d));
        this.d = obtainStyledAttributes.getDimensionPixelOffset(2, a(R.dimen.wm_sc_common_dimen_4));
        this.e = obtainStyledAttributes.getDimensionPixelOffset(3, a(R.dimen.wm_sc_common_dimen_4));
        this.k = obtainStyledAttributes.getBoolean(5, false);
        this.l = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        this.c = new Paint();
        this.c.setAntiAlias(true);
        this.c.setColor(color);
        this.c.setStyle(Paint.Style.FILL_AND_STROKE);
        this.c.setStrokeWidth(0.1f);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cea8052771d27f5614a1d282f526efd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cea8052771d27f5614a1d282f526efd2");
        } else if (this.k) {
            setLayerType(1, null);
            this.m = new Paint();
            this.m.setColor(436207616);
            this.m.setStyle(Paint.Style.FILL);
            this.m.setAntiAlias(true);
            this.n = new RectF();
            this.o = new BlurMaskFilter(this.l, BlurMaskFilter.Blur.OUTER);
        }
        obtainStyledAttributes.recycle();
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cd292b4046f374665ae0ff3ce58037a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cd292b4046f374665ae0ff3ce58037a");
            return;
        }
        this.f = i2;
        int i3 = this.d + this.e;
        if (i < i3) {
            i = i3;
        } else if (i > getMeasuredWidth() - (this.d + this.e)) {
            i = getMeasuredWidth() - (this.d + this.e);
        }
        this.b.x = i;
    }

    public void setBackground(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6ce2e8e89afaf30d0eed451ec0a2e43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6ce2e8e89afaf30d0eed451ec0a2e43");
        } else {
            this.c.setColor(i);
        }
    }

    public void setCorner(int i) {
        this.e = i;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf5a6ae2d3b5e9357f88cd45fe41e667", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf5a6ae2d3b5e9357f88cd45fe41e667");
            return;
        }
        super.onDraw(canvas);
        Object[] objArr2 = {canvas};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e5c60b962edf65054288027a1d3fc652", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e5c60b962edf65054288027a1d3fc652");
        } else if (this.k && this.n != null) {
            float f = this.l;
            float f2 = this.l;
            float width = getWidth() - this.l;
            float height = getHeight();
            if (this.f == 80) {
                height -= this.d;
            } else {
                f2 += this.d;
            }
            if (this.o != null) {
                this.m.setMaskFilter(this.o);
            }
            this.n.set(f, f2, width, height);
            canvas.drawRoundRect(this.n, this.e, this.e, this.m);
            canvas.save();
        }
        Object[] objArr3 = {canvas};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d42f1e11929e00c2dae756401679aca2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d42f1e11929e00c2dae756401679aca2");
        } else {
            this.i.reset();
            if (this.f == 80) {
                this.b.y = getMeasuredHeight() - 1;
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8d18b17e832d0447173775a32e8701e5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8d18b17e832d0447173775a32e8701e5");
                } else {
                    float f3 = this.b.x - (this.d / 0.618f);
                    float f4 = this.b.y - this.d;
                    this.i.moveTo(f3, f4);
                    this.h.set(f3 - this.d, f4, f3 + this.d, (this.d * 2) + f4);
                    this.i.arcTo(this.h, 270.0f, this.g);
                    float f5 = this.b.x;
                    float f6 = this.b.y;
                    this.h.set(f5 - this.j, f6 - (this.j * 2.0f), f5 + this.j, f6);
                    this.i.lineTo((float) (((this.h.left + this.h.right) / 2.0f) + (this.j * Math.cos(Math.toRadians(120.0d)))), (float) (((this.h.top + this.h.bottom) / 2.0f) + (this.j * Math.sin(Math.toRadians(120.0d)))));
                    this.i.arcTo(this.h, 120.0f, -60.0f);
                    float f7 = this.b.x + (this.d / 0.618f);
                    float f8 = this.b.y - this.d;
                    this.h.set(f7 - this.d, f8, f7 + this.d, (this.d * 2) + f8);
                    this.i.lineTo((float) (((this.h.left + this.h.right) / 2.0f) + (this.d * Math.cos(Math.toRadians(270.0f - this.g)))), (float) (((this.h.top + this.h.bottom) / 2.0f) + (this.d * Math.sin(Math.toRadians(270.0f - this.g)))));
                    this.i.arcTo(this.h, 270.0f - this.g, this.g);
                }
            } else {
                this.b.y = 1;
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "3228f555ec08a05176aec7e275c25eff", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "3228f555ec08a05176aec7e275c25eff");
                } else {
                    float f9 = this.b.x - (this.d / 0.618f);
                    float f10 = this.b.y + this.d;
                    this.i.moveTo(f9, f10);
                    this.h.set(f9 - this.d, f10 - (this.d * 2), f9 + this.d, f10);
                    this.i.arcTo(this.h, 90.0f, -this.g);
                    float f11 = this.b.x;
                    float f12 = this.b.y;
                    this.h.set(f11 - this.j, f12, f11 + this.j, (this.j * 2.0f) + f12);
                    this.i.lineTo((float) (((this.h.left + this.h.right) / 2.0f) + (this.j * Math.cos(Math.toRadians(240.0d)))), (float) (((this.h.top + this.h.bottom) / 2.0f) + (this.j * Math.sin(Math.toRadians(240.0d)))));
                    this.i.arcTo(this.h, 240.0f, 60.0f);
                    float f13 = this.b.x + (this.d / 0.618f);
                    float f14 = this.b.y + this.d;
                    this.h.set(f13 - this.d, f14 - (this.d * 2), f13 + this.d, f14);
                    this.i.lineTo((float) (((this.h.left + this.h.right) / 2.0f) + (this.d * Math.cos(Math.toRadians(this.g + 90.0f)))), (float) (((this.h.top + this.h.bottom) / 2.0f) + (this.d * Math.sin(Math.toRadians(this.g + 90.0f)))));
                    this.i.arcTo(this.h, this.g + 90.0f, -this.g);
                }
            }
            this.i.close();
            canvas.drawPath(this.i, this.c);
        }
        Object[] objArr6 = {canvas};
        ChangeQuickRedirect changeQuickRedirect6 = a;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "b124b5b0afde87b85295b746cef67708", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "b124b5b0afde87b85295b746cef67708");
            return;
        }
        RectF rectF = new RectF();
        rectF.top = this.l + 1;
        rectF.left = this.l + 1;
        rectF.right = (getWidth() - 1) - this.l;
        rectF.bottom = getHeight() - 1;
        int i = this.e;
        if (this.f == 80) {
            rectF.bottom -= this.d;
        } else {
            rectF.top += this.d;
        }
        float f15 = i;
        canvas.drawRoundRect(rectF, f15, f15, this.c);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cb593dce4eba0af950658b4390728e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cb593dce4eba0af950658b4390728e4");
            return;
        }
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight() + this.d);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08963e02722cc611f2798a4bfdfa03a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08963e02722cc611f2798a4bfdfa03a8");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        int childCount = getChildCount();
        int i5 = this.f == 80 ? 0 : this.d;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                childAt.layout(childAt.getLeft() + 0, childAt.getTop() + i5, childAt.getRight() + 0, childAt.getBottom() + i5);
            }
        }
    }

    public final int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b7b4512224f60477d15650c53e729fa", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b7b4512224f60477d15650c53e729fa")).intValue() : getContext().getResources().getDimensionPixelOffset(i);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76c283f0d2676b9e333ad64b720e3fda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76c283f0d2676b9e333ad64b720e3fda");
        } else if (onClickListener != null) {
            super.setOnClickListener(onClickListener);
        } else {
            setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.newwidgets.TipsView.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "754604d4930eb8e23e514def4b823f9f", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "754604d4930eb8e23e514def4b823f9f");
                    }
                }
            });
        }
    }
}
