package com.sankuai.waimai.store.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.DimenRes;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.g;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class CouponLayout extends RelativeLayout {
    public static ChangeQuickRedirect a;
    private final Paint b;
    private final RectF c;
    private final Path d;
    private final Path e;
    private final Paint f;
    private final RectF g;
    private final float[] h;
    private float i;
    private float j;
    private float k;
    private int l;
    private int m;
    private float n;
    private float o;
    private float p;

    public CouponLayout(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89465eee8a63aba86c5c68dba4f440b8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89465eee8a63aba86c5c68dba4f440b8");
        }
    }

    public CouponLayout(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd1240ac43afcf39334ab109e4d10f72", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd1240ac43afcf39334ab109e4d10f72");
        }
    }

    public CouponLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cf02f802960cdae5213c453e133d2ce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cf02f802960cdae5213c453e133d2ce");
            return;
        }
        this.c = new RectF();
        this.d = new Path();
        this.e = new Path();
        this.g = new RectF();
        this.h = new float[8];
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = ViewCompat.MEASURED_SIZE_MASK;
        this.m = ViewCompat.MEASURED_SIZE_MASK;
        this.n = 0.0f;
        this.f = a();
        this.b = a();
        this.b.setStyle(Paint.Style.STROKE);
        Object[] objArr2 = {attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "acf57edd45744fa6eda740ea38574720", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "acf57edd45744fa6eda740ea38574720");
        } else {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.borderColor, R.attr.borderWidth, R.attr.couponCornerRadius, R.attr.leftAndRightEdgeRadii, R.attr.topAndBottomEdgeRadii, R.attr.leftAreaSize, R.attr.rightAreaSize, R.attr.effectColor}, i, i);
            this.i = obtainStyledAttributes.getDimensionPixelSize(3, 0);
            this.j = obtainStyledAttributes.getDimensionPixelSize(4, 0);
            this.k = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.l = obtainStyledAttributes.getColor(0, ViewCompat.MEASURED_SIZE_MASK);
            this.m = obtainStyledAttributes.getColor(7, ViewCompat.MEASURED_SIZE_MASK);
            this.o = obtainStyledAttributes.getDimensionPixelSize(5, -1);
            this.p = obtainStyledAttributes.getDimensionPixelSize(6, -1);
            a(obtainStyledAttributes.getDimensionPixelSize(2, 0));
            obtainStyledAttributes.recycle();
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "68f5c7b19c341f67789035db105bc90b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "68f5c7b19c341f67789035db105bc90b");
        } else if (getBackground() == null) {
            setBackgroundColor(0);
        }
    }

    private void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ab7ddbf3c22905d700ae30e141b3317", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ab7ddbf3c22905d700ae30e141b3317");
            return;
        }
        for (int i = 0; i < 8; i++) {
            this.h[i] = f;
        }
    }

    public void setEffectColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1265879ee93a8cd914ff12d0f3296e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1265879ee93a8cd914ff12d0f3296e1");
            return;
        }
        this.m = i;
        invalidate();
    }

    public void setBorderColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f9d314c40591bd2ff25dd7baac74b2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f9d314c40591bd2ff25dd7baac74b2a");
            return;
        }
        this.l = i;
        invalidate();
    }

    public void setRightAreaSize(@DimenRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bd105a266d7450f603fe0bc5f509a71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bd105a266d7450f603fe0bc5f509a71");
            return;
        }
        this.p = getContext().getResources().getDimensionPixelSize(i);
        requestLayout();
    }

    private Paint a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bff5d33faf1cf763c0388a5527bcc3d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Paint) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bff5d33faf1cf763c0388a5527bcc3d3");
        }
        Paint paint = new Paint(3);
        paint.setColor(0);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(0.5f);
        return paint;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "123382c42eea587fd7fb0f6359e87cab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "123382c42eea587fd7fb0f6359e87cab");
            return;
        }
        this.n = getTopAndLeft();
        this.c.set(0.0f, 0.0f, getWidth(), getHeight());
        Path path = this.d;
        Object[] objArr2 = {path};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "337d14e28cc4207e313796b6b733ad53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "337d14e28cc4207e313796b6b733ad53");
        } else {
            path.reset();
            Object[] objArr3 = {path};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3227a37d86179eeccd0d472a4e7aa06c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3227a37d86179eeccd0d472a4e7aa06c");
            } else {
                path.moveTo(this.c.left, this.c.top + this.h[0]);
                this.g.set(this.c.left, this.c.top, this.c.left + (this.h[0] * 2.0f), this.c.top + (this.h[0] * 2.0f));
                path.arcTo(this.g, 180.0f, 90.0f);
            }
            Object[] objArr4 = {path};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "63590fba2629d63567815abcf5cefd47", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "63590fba2629d63567815abcf5cefd47");
            } else {
                this.g.set((this.c.left + this.n) - (this.j * 1.2f), this.c.top - this.j, this.c.left + this.n + (this.j * 1.2f), this.c.top + this.j);
                path.arcTo(this.g, 180.0f, -180.0f);
            }
            Object[] objArr5 = {path};
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "7bbdfc822e203c720862203d2d2726aa", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "7bbdfc822e203c720862203d2d2726aa");
            } else {
                this.g.set(this.c.right - (this.h[1] * 2.0f), this.c.top, this.c.right, this.c.top + (this.h[1] * 2.0f));
                path.arcTo(this.g, 270.0f, 90.0f);
            }
            Object[] objArr6 = {path};
            ChangeQuickRedirect changeQuickRedirect6 = a;
            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "d4b782576a4b17f378edffb67a29181b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "d4b782576a4b17f378edffb67a29181b");
            } else {
                this.g.set(this.c.right - this.i, ((this.c.bottom + this.c.top) / 2.0f) - (this.i * 1.2f), this.c.right + this.i, ((this.c.bottom + this.c.top) / 2.0f) + (this.i * 1.2f));
                path.arcTo(this.g, 270.0f, -180.0f);
            }
            Object[] objArr7 = {path};
            ChangeQuickRedirect changeQuickRedirect7 = a;
            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "80d4d7a11549bce65ceeeaf668a69973", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "80d4d7a11549bce65ceeeaf668a69973");
            } else {
                this.g.set(this.c.right - (this.h[2] * 2.0f), this.c.bottom - (this.h[2] * 2.0f), this.c.right, this.c.bottom);
                path.arcTo(this.g, 0.0f, 90.0f);
            }
            Object[] objArr8 = {path};
            ChangeQuickRedirect changeQuickRedirect8 = a;
            if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "6857afbe0e611bbad801d1d5cd22a470", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "6857afbe0e611bbad801d1d5cd22a470");
            } else {
                this.g.set((this.c.left + this.n) - (this.j * 1.2f), this.c.bottom - this.j, this.c.left + this.n + (this.j * 1.2f), this.c.bottom + this.j);
                path.arcTo(this.g, 0.0f, -180.0f);
            }
            Object[] objArr9 = {path};
            ChangeQuickRedirect changeQuickRedirect9 = a;
            if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "ad37229c0255d4630a717fbe9acfb864", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "ad37229c0255d4630a717fbe9acfb864");
            } else {
                this.g.set(this.c.left, this.c.bottom - (this.h[3] * 2.0f), this.c.left + (this.h[3] * 2.0f), this.c.bottom);
                path.arcTo(this.g, 90.0f, 90.0f);
            }
            Object[] objArr10 = {path};
            ChangeQuickRedirect changeQuickRedirect10 = a;
            if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "0634c81704af5f39a2321f88474c4393", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "0634c81704af5f39a2321f88474c4393");
            } else {
                this.g.set(this.c.left - this.i, ((this.c.bottom + this.c.top) / 2.0f) - (this.i * 1.2f), this.c.left + this.i, ((this.c.bottom + this.c.top) / 2.0f) + (this.i * 1.2f));
                path.arcTo(this.g, 90.0f, -180.0f);
            }
            path.close();
        }
        Object[] objArr11 = {canvas};
        ChangeQuickRedirect changeQuickRedirect11 = a;
        if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "801748fc144b8adf43cbffebb176ae2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "801748fc144b8adf43cbffebb176ae2f");
        } else {
            canvas.clipPath(this.d);
            canvas.drawPath(this.d, this.f);
        }
        super.draw(canvas);
        Object[] objArr12 = {canvas};
        ChangeQuickRedirect changeQuickRedirect12 = a;
        if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "9f35b9b6cb18461bc5c3fe30f7d0c19d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "9f35b9b6cb18461bc5c3fe30f7d0c19d");
        } else {
            this.b.setColor(this.l);
            this.b.setStrokeWidth(this.k * 2.0f);
            this.b.setPathEffect(null);
            canvas.drawPath(this.d, this.b);
        }
        Object[] objArr13 = {canvas};
        ChangeQuickRedirect changeQuickRedirect13 = a;
        if (PatchProxy.isSupport(objArr13, this, changeQuickRedirect13, false, "0ff25d066ab08ba4c38da4b5f265379e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect13, false, "0ff25d066ab08ba4c38da4b5f265379e");
            return;
        }
        this.e.reset();
        this.b.setStrokeWidth(this.k);
        this.b.setColor(this.m);
        float f = this.j * 2.5f;
        Paint paint = this.b;
        float[] fArr = new float[2];
        fArr[0] = 9.0f;
        float height = this.c.height() - (2.0f * f);
        Object[] objArr14 = {Float.valueOf(height), Float.valueOf(9.0f)};
        ChangeQuickRedirect changeQuickRedirect14 = a;
        fArr[1] = PatchProxy.isSupport(objArr14, this, changeQuickRedirect14, false, "bd92dcebf9bf1653204bbd6502d1b7e9", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr14, this, changeQuickRedirect14, false, "bd92dcebf9bf1653204bbd6502d1b7e9")).floatValue() : ((height - 9.0f) / ((int) (height / 14.625f))) - 9.0f;
        paint.setPathEffect(new DashPathEffect(fArr, 0.0f));
        this.e.moveTo(this.c.left + this.n, this.c.top + f);
        this.e.lineTo(this.c.left + this.n, this.c.bottom - f);
        canvas.drawPath(this.e, this.b);
    }

    private float getTopAndLeft() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f7b34f7546f3aa92afca7202e40574e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f7b34f7546f3aa92afca7202e40574e")).floatValue();
        }
        if (g.a(-1.0f, this.o) && g.a(-1.0f, this.p)) {
            if (getChildCount() > 0) {
                return getChildAt(0).getWidth();
            }
            return 0.0f;
        } else if (!g.a(-1.0f, this.o)) {
            return this.o;
        } else {
            return getWidth() - this.p;
        }
    }
}
