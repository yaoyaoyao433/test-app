package com.airbnb.lottie.utils;

import android.animation.Animator;
import android.os.Build;
import android.support.annotation.FloatRange;
import android.support.annotation.MainThread;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.view.Choreographer;
import com.tencent.mapsdk.internal.bw;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c extends a implements Choreographer.FrameCallback {
    @Nullable
    public com.airbnb.lottie.e g;
    public float b = 1.0f;
    private boolean i = false;
    public long c = 0;
    public float d = 0.0f;
    private int j = 0;
    public float e = -2.14748365E9f;
    public float f = 2.14748365E9f;
    @VisibleForTesting
    protected boolean h = false;

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(b());
    }

    @FloatRange(from = 0.0d, to = bw.a)
    public final float b() {
        if (this.g == null) {
            return 0.0f;
        }
        return (this.d - this.g.i) / (this.g.j - this.g.i);
    }

    @Override // android.animation.ValueAnimator
    @FloatRange(from = 0.0d, to = bw.a)
    public final float getAnimatedFraction() {
        if (this.g == null) {
            return 0.0f;
        }
        if (k()) {
            return (j() - this.d) / (j() - i());
        }
        return (this.d - i()) / (j() - i());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        if (this.g == null) {
            return 0L;
        }
        return this.g.a();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.h;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        l();
        if (this.g == null || !isRunning()) {
            return;
        }
        long nanoTime = System.nanoTime();
        float abs = ((float) (nanoTime - this.c)) / (this.g == null ? Float.MAX_VALUE : (1.0E9f / this.g.k) / Math.abs(this.b));
        float f = this.d;
        if (k()) {
            abs = -abs;
        }
        this.d = f + abs;
        float f2 = this.d;
        boolean z = !(f2 >= i() && f2 <= j());
        this.d = e.a(this.d, i(), j());
        this.c = nanoTime;
        a();
        if (z) {
            if (getRepeatCount() != -1 && this.j >= getRepeatCount()) {
                this.d = j();
                b(true);
                a(k());
            } else {
                for (Animator.AnimatorListener animatorListener : this.a) {
                    animatorListener.onAnimationRepeat(this);
                }
                this.j++;
                if (getRepeatMode() == 2) {
                    this.i = !this.i;
                    d();
                } else {
                    this.d = k() ? j() : i();
                }
                this.c = nanoTime;
            }
        }
        if (this.g != null) {
            if (this.d < this.e || this.d > this.f) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.e), Float.valueOf(this.f), Float.valueOf(this.d)));
            }
        }
    }

    public final void c() {
        this.g = null;
        this.e = -2.14748365E9f;
        this.f = 2.14748365E9f;
    }

    public final void a(int i) {
        float f = i;
        if (this.d == f) {
            return;
        }
        this.d = e.a(f, i(), j());
        this.c = System.nanoTime();
        a();
    }

    public final void b(int i) {
        a(i, (int) this.f);
    }

    public final void c(int i) {
        a((int) this.e, i);
    }

    public final void a(int i, int i2) {
        float f = this.g == null ? -3.4028235E38f : this.g.i;
        float f2 = this.g == null ? Float.MAX_VALUE : this.g.j;
        float f3 = i;
        this.e = e.a(f3, f, f2);
        float f4 = i2;
        this.f = e.a(f4, f, f2);
        a((int) e.a(this.d, f3, f4));
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.i) {
            return;
        }
        this.i = false;
        d();
    }

    @MainThread
    public final void e() {
        this.h = true;
        boolean k = k();
        for (Animator.AnimatorListener animatorListener : this.a) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, k);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
        a((int) (k() ? j() : i()));
        this.c = System.nanoTime();
        this.j = 0;
        l();
    }

    @MainThread
    public final void h() {
        this.h = true;
        l();
        this.c = System.nanoTime();
        if (k() && this.d == i()) {
            this.d = j();
        } else if (k() || this.d != j()) {
        } else {
            this.d = i();
        }
    }

    public final float i() {
        if (this.g == null) {
            return 0.0f;
        }
        if (this.e != -2.14748365E9f) {
            return this.e;
        }
        return this.g.i;
    }

    public final float j() {
        if (this.g == null) {
            return 0.0f;
        }
        if (this.f != 2.14748365E9f) {
            return this.f;
        }
        return this.g.j;
    }

    private void l() {
        if (isRunning()) {
            b(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @MainThread
    private void b(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.h = false;
        }
    }

    public final void d() {
        this.b = -this.b;
    }

    @MainThread
    public final void f() {
        b(true);
        a(k());
    }

    @MainThread
    public final void g() {
        b(true);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    @MainThread
    public final void cancel() {
        for (Animator.AnimatorListener animatorListener : this.a) {
            animatorListener.onAnimationCancel(this);
        }
        b(true);
    }

    private boolean k() {
        return this.b < 0.0f;
    }
}
