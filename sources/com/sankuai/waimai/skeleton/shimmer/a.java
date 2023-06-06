package com.sankuai.waimai.skeleton.shimmer;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
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
    ValueAnimator b;
    private final ValueAnimator.AnimatorUpdateListener c;
    private final Paint d;
    private final Rect e;
    private final Matrix f;
    @Nullable
    private Shimmer g;

    private float a(float f, float f2, float f3) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd65bd00e0c3a665dcc1e27f287b1a7c", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd65bd00e0c3a665dcc1e27f287b1a7c")).floatValue() : f + ((f2 - f) * f3);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc2a694fe43828b58d9b74ebe27e4721", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc2a694fe43828b58d9b74ebe27e4721");
            return;
        }
        this.c = new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.skeleton.shimmer.a.1
            public static ChangeQuickRedirect a;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object[] objArr2 = {valueAnimator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3ef8455a954cb661911b7756965ad334", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3ef8455a954cb661911b7756965ad334");
                } else {
                    a.this.invalidateSelf();
                }
            }
        };
        this.d = new Paint();
        this.e = new Rect();
        this.f = new Matrix();
        this.d.setAntiAlias(true);
    }

    public final void a(@Nullable Shimmer shimmer) {
        boolean z;
        Object[] objArr = {shimmer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f426106d43cec0f80f128b0cbd81534d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f426106d43cec0f80f128b0cbd81534d");
            return;
        }
        this.g = shimmer;
        if (this.g != null) {
            this.d.setXfermode(new PorterDuffXfermode(this.g.q ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        }
        c();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7dfaada6e79089b64f4f31e22034730d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7dfaada6e79089b64f4f31e22034730d");
        } else if (this.g != null) {
            if (this.b != null) {
                z = this.b.isStarted();
                this.b.cancel();
                this.b.removeAllUpdateListeners();
            } else {
                z = false;
            }
            this.b = ValueAnimator.ofFloat(0.0f, ((float) (this.g.u / this.g.t)) + 1.0f);
            this.b.setInterpolator(new LinearInterpolator());
            this.b.setRepeatMode(this.g.s);
            this.b.setStartDelay(this.g.v);
            this.b.setRepeatCount(this.g.r);
            this.b.setDuration(this.g.t + this.g.u);
            this.b.addUpdateListener(this.c);
            if (z) {
                this.b.start();
            }
        }
        invalidateSelf();
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb7841828711288d8e3874b3c357e727", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb7841828711288d8e3874b3c357e727")).booleanValue() : this.b != null && this.b.isStarted();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cc7a5304d0b68c2e7a7a0c1d564deed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cc7a5304d0b68c2e7a7a0c1d564deed");
            return;
        }
        super.onBoundsChange(rect);
        this.e.set(rect);
        c();
        b();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        float a2;
        float a3;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dcc87392631d87cb7f7abfcf8fe2e3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dcc87392631d87cb7f7abfcf8fe2e3b");
        } else if (this.g == null || this.d.getShader() == null) {
        } else {
            float tan = (float) Math.tan(Math.toRadians(this.g.n));
            float height = this.e.height() + (this.e.width() * tan);
            float width = this.e.width() + (tan * this.e.height());
            float f = 0.0f;
            float floatValue = this.b != null ? ((Float) this.b.getAnimatedValue()).floatValue() : 0.0f;
            switch (this.g.d) {
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
            this.f.reset();
            this.f.setRotate(this.g.n, this.e.width() / 2.0f, this.e.height() / 2.0f);
            this.f.postTranslate(a3, f);
            this.d.getShader().setLocalMatrix(this.f);
            canvas.drawRect(this.e, this.d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (this.g != null) {
            return (this.g.o || this.g.q) ? -3 : -1;
        }
        return -1;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a80ad02eb03389ac5b909afd919542e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a80ad02eb03389ac5b909afd919542e");
        } else if (this.b == null || this.b.isStarted() || this.g == null || !this.g.p || getCallback() == null) {
        } else {
            this.b.start();
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb7110038305b5c398db3e34063152ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb7110038305b5c398db3e34063152ec");
            return;
        }
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        if (width == 0 || height == 0 || this.g == null) {
            return;
        }
        int a2 = this.g.a(width);
        this.g.b(height);
        this.d.setShader(new LinearGradient(0.0f, 0.0f, a2, 0.0f, this.g.c, this.g.b, Shader.TileMode.CLAMP));
    }
}
