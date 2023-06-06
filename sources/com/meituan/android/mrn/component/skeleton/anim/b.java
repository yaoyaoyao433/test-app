package com.meituan.android.mrn.component.skeleton.anim;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.SparseArray;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b extends a {
    public static ChangeQuickRedirect d;
    private float e;
    private Matrix f;
    private SparseArray<LinearGradient> g;

    public b(View view) {
        super(view);
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56f139e018812bb662fce77ba7263b80", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56f139e018812bb662fce77ba7263b80");
            return;
        }
        this.f = new Matrix();
        this.g = new SparseArray<>();
    }

    @Override // com.meituan.android.mrn.component.skeleton.anim.a
    public final ValueAnimator a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5a138cf365bbcbc169eca35b06bf792", RobustBitConfig.DEFAULT_VALUE)) {
            return (ValueAnimator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5a138cf365bbcbc169eca35b06bf792");
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(2600L);
        ofFloat.setRepeatMode(1);
        ofFloat.setRepeatCount(-1);
        return ofFloat;
    }

    @Override // com.meituan.android.mrn.component.skeleton.anim.a
    public final void a(Canvas canvas, RectF rectF, Paint paint) {
        Object[] objArr = {canvas, rectF, paint};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acc7cd0019528917fa15e6a2031d489a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acc7cd0019528917fa15e6a2031d489a");
            return;
        }
        float height = rectF.height();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (height > (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ed8c19abb00918d97d4ca5753494d90c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ed8c19abb00918d97d4ca5753494d90c")).intValue() : this.c.getContext().getResources().getDisplayMetrics().heightPixels) / 11) {
            paint.setShader(null);
            return;
        }
        LinearGradient linearGradient = this.g.get(paint.getColor(), null);
        if (linearGradient == null) {
            LinearGradient linearGradient2 = new LinearGradient(0.0f, this.c.getMeasuredHeight(), this.c.getMeasuredWidth(), this.c.getMeasuredHeight(), new int[]{paint.getColor(), a(paint.getColor(), 1), a(paint.getColor(), 2), a(paint.getColor(), 2), a(paint.getColor(), 1), paint.getColor()}, (float[]) null, Shader.TileMode.CLAMP);
            this.f.setTranslate((float) (this.c.getMeasuredWidth() * (-1.3d)), 0.0f);
            linearGradient2.setLocalMatrix(this.f);
            paint.setShader(linearGradient2);
            this.g.put(paint.getColor(), linearGradient2);
            return;
        }
        this.f.setTranslate((float) ((this.c.getMeasuredWidth() * (-1.3d)) + (this.c.getMeasuredWidth() * 2.6d * this.e)), 0.0f);
        linearGradient.setLocalMatrix(this.f);
        paint.setShader(linearGradient);
    }

    @Override // com.meituan.android.mrn.component.skeleton.anim.a
    public final void a(ValueAnimator valueAnimator) {
        Object[] objArr = {valueAnimator};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56f26446a96905d6383b58f4170e44e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56f26446a96905d6383b58f4170e44e3");
            return;
        }
        this.e = valueAnimator.getAnimatedFraction();
        this.c.postInvalidate();
    }

    private int a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6dee533ae91e6b03b791294dfcac4654", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6dee533ae91e6b03b791294dfcac4654")).intValue();
        }
        int i3 = i2 * 6;
        return ((Color.blue(i) - i3) & 255) | (-16777216) | (((Color.red(i) - i3) & 255) << 16) | (((Color.green(i) - i3) & 255) << 8);
    }
}
