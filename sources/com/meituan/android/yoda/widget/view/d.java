package com.meituan.android.yoda.widget.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.android.privacy.interfaces.p;
import com.meituan.android.yoda.widget.view.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d extends AutoFitSurfaceView implements ValueAnimator.AnimatorUpdateListener, SurfaceHolder.Callback {
    public static ChangeQuickRedirect d;
    public float e;
    public a f;
    public int g;
    public Context h;
    public TextView i;
    public Runnable j;
    public String k;
    private p l;
    private SurfaceHolder m;

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        Object[] objArr = {surfaceHolder, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc340bdaca59cb367113f1e508493d96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc340bdaca59cb367113f1e508493d96");
        }
    }

    public d(Context context, ViewGroup viewGroup) {
        super(context);
        Object[] objArr = {context, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e9786ebb29d99b5a75aae3fb45fa4e6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e9786ebb29d99b5a75aae3fb45fa4e6");
            return;
        }
        this.e = 0.0f;
        this.g = -16777216;
        this.j = new Runnable() { // from class: com.meituan.android.yoda.widget.view.d.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "306bf26fe9aeb4dfc27b76e86575334c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "306bf26fe9aeb4dfc27b76e86575334c");
                } else if (d.this.i == null || TextUtils.isEmpty(d.this.k)) {
                } else {
                    d.this.i.setText(d.this.k);
                    d.this.i.announceForAccessibility(d.this.k);
                }
            }
        };
        this.h = context;
        Object[] objArr2 = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dcfa4bf01aa330ca6aaec188a35770ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dcfa4bf01aa330ca6aaec188a35770ce");
            return;
        }
        this.m = getHolder();
        this.m.addCallback(this);
        this.m.setType(3);
        this.m.setSizeFromLayout();
        if (com.meituan.android.yoda.config.ui.d.a().f() == 1) {
            com.meituan.android.yoda.monitor.log.a.a("CameraSurfacePreview", "init, maskMode = FACE_MASK_UPPER_BODY", true);
            this.f = new c(viewGroup, this);
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a("CameraSurfacePreview", "init, maskMode = FACE_MASK_CIRCLE", true);
        this.f = new b(viewGroup, this);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        Object[] objArr = {surfaceHolder};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a2c230b1401cbed25e48b73ef471d1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a2c230b1401cbed25e48b73ef471d1a");
            return;
        }
        this.f.a(surfaceHolder);
        setWillNotDraw(false);
        try {
            if (this.l != null) {
                this.l.a(surfaceHolder);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        Object[] objArr = {surfaceHolder};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb2c9a7e85546f10a03579a3f5b00fc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb2c9a7e85546f10a03579a3f5b00fc4");
        } else {
            surfaceHolder.removeCallback(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28b0ff38f03cc4fc4dac97216a005330", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28b0ff38f03cc4fc4dac97216a005330");
        } else {
            this.f.a(canvas);
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object[] objArr = {valueAnimator};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1de2a1c5e9e22a008486b0daf21b6ddf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1de2a1c5e9e22a008486b0daf21b6ddf");
            return;
        }
        this.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    public final void setCamera(p pVar) {
        this.l = pVar;
    }

    public final float getViewfinderWidthRatio() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "710ddde4b202b9a6326cb621daaa6d66", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "710ddde4b202b9a6326cb621daaa6d66")).floatValue() : this.f.b();
    }

    public final float getViewfinderHeightRatio() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59a93c8dd6d97db0c1aa990e9e43eefa", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59a93c8dd6d97db0c1aa990e9e43eefa")).floatValue() : this.f.c();
    }

    public final float getViewfinderMarginTopRatio() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9095e816893ee71a9a3ed646d6c29e0", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9095e816893ee71a9a3ed646d6c29e0")).floatValue() : this.f.a();
    }

    public final void setTargetAngle(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e1d669b311d5ac731cff4437f094c21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e1d669b311d5ac731cff4437f094c21");
        } else {
            this.f.a(f, this);
        }
    }

    public final a.EnumC0383a getFaqMode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b86ba61e831ee3089f5a25a614a7c659", RobustBitConfig.DEFAULT_VALUE) ? (a.EnumC0383a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b86ba61e831ee3089f5a25a614a7c659") : this.f.i();
    }

    public final void a(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abd5ceafce6eddeda3b7dd4991638384", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abd5ceafce6eddeda3b7dd4991638384");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (this.i == null) {
                this.k = str;
            } else if (!str.equals(this.k)) {
                this.k = str;
                this.i.postDelayed(this.j, j);
            } else {
                this.k = str;
                this.i.setText(this.k);
            }
        }
    }

    public final void setSurfaceBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ea4b75b6229670e1a0b8ec192f81461", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ea4b75b6229670e1a0b8ec192f81461");
            return;
        }
        if (this.f != null) {
            this.f.a(i);
        }
        invalidate();
    }

    public final void setTipsColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "179cabbb0c8cd044fe37d3d5ac5e71e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "179cabbb0c8cd044fe37d3d5ac5e71e6");
        } else if (this.i != null) {
            this.i.setTextColor(i);
        }
    }
}
