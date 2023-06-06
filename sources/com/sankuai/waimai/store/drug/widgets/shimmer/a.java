package com.sankuai.waimai.store.drug.widgets.shimmer;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.animation.LinearInterpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends Drawable {
    public static ChangeQuickRedirect a;
    @Nullable
    public ValueAnimator b;
    @Nullable
    DrugShimmer c;
    private final ValueAnimator.AnimatorUpdateListener d;
    private final Paint e;
    private final Rect f;
    private final Matrix g;

    private float a(float f, float f2, float f3) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ee3200b98ad57affb9a4a8d22bdaa98", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ee3200b98ad57affb9a4a8d22bdaa98")).floatValue() : f + ((f2 - f) * f3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eded21cd6c0226c1a16c00d91de91721", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eded21cd6c0226c1a16c00d91de91721");
            return;
        }
        this.d = new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.store.drug.widgets.shimmer.a.1
            public static ChangeQuickRedirect a;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object[] objArr2 = {valueAnimator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "396c9bd74240c10417bbf3f4c70533ac", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "396c9bd74240c10417bbf3f4c70533ac");
                } else {
                    a.this.invalidateSelf();
                }
            }
        };
        this.e = new Paint();
        this.f = new Rect();
        this.g = new Matrix();
        this.e.setAntiAlias(true);
    }

    public final void a(@Nullable DrugShimmer drugShimmer) {
        Object[] objArr = {drugShimmer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60b5bbc70a22c3a384cce6e087665048", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60b5bbc70a22c3a384cce6e087665048");
            return;
        }
        this.c = drugShimmer;
        if (this.c != null) {
            this.e.setXfermode(new PorterDuffXfermode(this.c.r ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        }
        d();
        c();
        invalidateSelf();
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b80c62e55dd17d62350aa09cac93ec8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b80c62e55dd17d62350aa09cac93ec8")).booleanValue() : this.b != null && this.b.isStarted();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67f4406bf38f30721a004e092ac31a87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67f4406bf38f30721a004e092ac31a87");
            return;
        }
        super.onBoundsChange(rect);
        this.f.set(rect);
        d();
        b();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        float a2;
        float a3;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "466e52667df01981795c5da7ac61f9d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "466e52667df01981795c5da7ac61f9d0");
        } else if (this.c == null || this.e.getShader() == null) {
        } else {
            float tan = (float) Math.tan(Math.toRadians(this.c.o));
            float height = this.f.height() + (this.f.width() * tan);
            float width = this.f.width() + (tan * this.f.height());
            float f = 0.0f;
            float floatValue = this.b != null ? ((Float) this.b.getAnimatedValue()).floatValue() : 0.0f;
            switch (this.c.e) {
                case 1:
                    a2 = a(-height, height, floatValue);
                    f = a2;
                    a3 = 0.0f;
                    break;
                case 2:
                    a3 = a(width, -width, floatValue);
                    break;
                case 3:
                    a2 = a(height, -height, floatValue);
                    f = a2;
                    a3 = 0.0f;
                    break;
                default:
                    a3 = a(-width, width, floatValue);
                    break;
            }
            this.g.reset();
            this.g.setRotate(this.c.o, this.f.width() / 2.0f, this.f.height() / 2.0f);
            this.g.postTranslate(a3, f);
            this.e.getShader().setLocalMatrix(this.g);
            canvas.drawRect(this.f, this.e);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (this.c != null) {
            return (this.c.p || this.c.r) ? -3 : -1;
        }
        return -1;
    }

    private void c() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d6f0e9a77c8b9d14bf393f721323643", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d6f0e9a77c8b9d14bf393f721323643");
        } else if (this.c == null) {
        } else {
            if (this.b != null) {
                z = this.b.isStarted();
                this.b.cancel();
                this.b.removeAllUpdateListeners();
            } else {
                z = false;
            }
            this.b = ValueAnimator.ofFloat(0.0f, ((float) (this.c.v / this.c.u)) + 1.0f);
            this.b.setInterpolator(new LinearInterpolator());
            this.b.setRepeatMode(this.c.t);
            this.b.setStartDelay(this.c.w);
            this.b.setRepeatCount(this.c.s);
            this.b.setDuration(this.c.u + this.c.v);
            this.b.addUpdateListener(this.d);
            if (z) {
                this.b.start();
            }
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1402b521ad5ee841f71a120d957c3a2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1402b521ad5ee841f71a120d957c3a2b");
        } else if (this.b == null || this.b.isStarted() || this.c == null || !this.c.q || getCallback() == null) {
        } else {
            this.b.start();
        }
    }

    private void d() {
        Shader radialGradient;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdc65362e9ea4afd47eb01d909d55df2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdc65362e9ea4afd47eb01d909d55df2");
            return;
        }
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        if (width == 0 || height == 0 || this.c == null) {
            return;
        }
        int a2 = this.c.a(width);
        int b = this.c.b(height);
        boolean z = true;
        if (this.c.h != 1) {
            if (this.c.e != 1 && this.c.e != 3) {
                z = false;
            }
            if (z) {
                a2 = 0;
            }
            if (!z) {
                b = 0;
            }
            radialGradient = new LinearGradient(0.0f, 0.0f, a2, b, this.c.c, this.c.b, Shader.TileMode.CLAMP);
        } else {
            radialGradient = new RadialGradient(a2 / 2.0f, b / 2.0f, (float) (Math.max(a2, b) / Math.sqrt(2.0d)), this.c.c, this.c.b, Shader.TileMode.CLAMP);
        }
        this.e.setShader(radialGradient);
    }
}
