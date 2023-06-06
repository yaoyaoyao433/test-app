package com.airbnb.lottie;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.FloatRange;
import android.support.annotation.IntRange;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import com.airbnb.lottie.parser.q;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class LottieDrawable extends Drawable implements Animatable, Drawable.Callback {
    private static final String m = "LottieDrawable";
    public e a;
    @Nullable
    com.airbnb.lottie.manager.b e;
    @Nullable
    String f;
    @Nullable
    c g;
    @Nullable
    public com.airbnb.lottie.manager.a h;
    @Nullable
    public b i;
    @Nullable
    public o j;
    public boolean k;
    boolean l;
    @Nullable
    private com.airbnb.lottie.model.layer.b p;
    private final Matrix n = new Matrix();
    public final com.airbnb.lottie.utils.c b = new com.airbnb.lottie.utils.c();
    float c = 1.0f;
    private final Set<Object> o = new HashSet();
    final ArrayList<a> d = new ArrayList<>();
    private int q = 255;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface RepeatMode {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void a(e eVar);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }

    public LottieDrawable() {
        this.b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.airbnb.lottie.LottieDrawable.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (LottieDrawable.this.p != null) {
                    LottieDrawable.this.p.a(LottieDrawable.this.b.b());
                }
            }
        });
    }

    public final void a(boolean z) {
        if (this.k != z && Build.VERSION.SDK_INT >= 19) {
            this.k = z;
            if (this.a != null) {
                g();
            }
        }
    }

    public final void a() {
        if (this.e != null) {
            this.e.a();
        }
    }

    public final boolean a(e eVar) {
        if (this.a == eVar) {
            return false;
        }
        b();
        this.a = eVar;
        g();
        com.airbnb.lottie.utils.c cVar = this.b;
        boolean z = cVar.g == null;
        cVar.g = eVar;
        if (z) {
            cVar.a((int) Math.max(cVar.e, eVar.i), (int) Math.min(cVar.f, eVar.j));
        } else {
            cVar.a((int) eVar.i, (int) eVar.j);
        }
        cVar.a((int) cVar.d);
        cVar.c = System.nanoTime();
        c(this.b.getAnimatedFraction());
        d(this.c);
        h();
        Iterator it = new ArrayList(this.d).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(eVar);
            it.remove();
        }
        this.d.clear();
        eVar.a(this.l);
        return true;
    }

    private void g() {
        this.p = new com.airbnb.lottie.model.layer.b(this, q.a(this.a), this.a.g, this.a);
    }

    public final void b() {
        a();
        if (this.b.isRunning()) {
            this.b.cancel();
        }
        this.a = null;
        this.p = null;
        this.e = null;
        this.b.c();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = 255) int i) {
        this.q = i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.q;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        float f;
        d.c("Drawable#draw");
        if (this.p == null) {
            return;
        }
        float f2 = this.c;
        float min = Math.min(canvas.getWidth() / this.a.h.width(), canvas.getHeight() / this.a.h.height());
        if (f2 > min) {
            f = this.c / min;
        } else {
            min = f2;
            f = 1.0f;
        }
        int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        if (i > 0) {
            canvas.save();
            float width = this.a.h.width() / 2.0f;
            float height = this.a.h.height() / 2.0f;
            float f3 = width * min;
            float f4 = height * min;
            canvas.translate((this.c * width) - f3, (this.c * height) - f4);
            canvas.scale(f, f, f3, f4);
        }
        this.n.reset();
        this.n.preScale(min, min);
        this.p.a(canvas, this.n, this.q);
        d.d("Drawable#draw");
        if (i > 0) {
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Animatable
    @MainThread
    public void start() {
        c();
    }

    @MainThread
    public final void c() {
        if (this.p == null) {
            this.d.add(new a() { // from class: com.airbnb.lottie.LottieDrawable.5
                @Override // com.airbnb.lottie.LottieDrawable.a
                public final void a(e eVar) {
                    LottieDrawable.this.c();
                }
            });
        } else {
            this.b.e();
        }
    }

    @MainThread
    public final void d() {
        if (this.p == null) {
            this.d.add(new a() { // from class: com.airbnb.lottie.LottieDrawable.6
                @Override // com.airbnb.lottie.LottieDrawable.a
                public final void a(e eVar) {
                    LottieDrawable.this.d();
                }
            });
        } else {
            this.b.h();
        }
    }

    public final void a(final int i) {
        if (this.a == null) {
            this.d.add(new a() { // from class: com.airbnb.lottie.LottieDrawable.7
                @Override // com.airbnb.lottie.LottieDrawable.a
                public final void a(e eVar) {
                    LottieDrawable.this.a(i);
                }
            });
        } else {
            this.b.b(i);
        }
    }

    public final void a(final float f) {
        if (this.a == null) {
            this.d.add(new a() { // from class: com.airbnb.lottie.LottieDrawable.8
                @Override // com.airbnb.lottie.LottieDrawable.a
                public final void a(e eVar) {
                    LottieDrawable.this.a(f);
                }
            });
            return;
        }
        float f2 = this.a.i;
        a((int) (f2 + (f * (this.a.j - f2))));
    }

    public final void b(final int i) {
        if (this.a == null) {
            this.d.add(new a() { // from class: com.airbnb.lottie.LottieDrawable.9
                @Override // com.airbnb.lottie.LottieDrawable.a
                public final void a(e eVar) {
                    LottieDrawable.this.b(i);
                }
            });
        } else {
            this.b.c(i);
        }
    }

    public final void b(@FloatRange(from = 0.0d, to = 1.0d) final float f) {
        if (this.a == null) {
            this.d.add(new a() { // from class: com.airbnb.lottie.LottieDrawable.10
                @Override // com.airbnb.lottie.LottieDrawable.a
                public final void a(e eVar) {
                    LottieDrawable.this.b(f);
                }
            });
            return;
        }
        float f2 = this.a.i;
        b((int) (f2 + (f * (this.a.j - f2))));
    }

    public final void a(final int i, final int i2) {
        if (this.a == null) {
            this.d.add(new a() { // from class: com.airbnb.lottie.LottieDrawable.11
                @Override // com.airbnb.lottie.LottieDrawable.a
                public final void a(e eVar) {
                    LottieDrawable.this.a(i, i2);
                }
            });
        } else {
            this.b.a(i, i2);
        }
    }

    public final void a(@FloatRange(from = 0.0d, to = 1.0d) final float f, @FloatRange(from = 0.0d, to = 1.0d) final float f2) {
        if (this.a == null) {
            this.d.add(new a() { // from class: com.airbnb.lottie.LottieDrawable.12
                @Override // com.airbnb.lottie.LottieDrawable.a
                public final void a(e eVar) {
                    LottieDrawable.this.a(f, f2);
                }
            });
            return;
        }
        float f3 = this.a.i;
        int i = (int) (f3 + (f * (this.a.j - f3)));
        float f4 = this.a.i;
        a(i, (int) (f4 + (f2 * (this.a.j - f4))));
    }

    public final void c(final int i) {
        if (this.a == null) {
            this.d.add(new a() { // from class: com.airbnb.lottie.LottieDrawable.2
                @Override // com.airbnb.lottie.LottieDrawable.a
                public final void a(e eVar) {
                    LottieDrawable.this.c(i);
                }
            });
        } else {
            this.b.a(i);
        }
    }

    public final void c(@FloatRange(from = 0.0d, to = 1.0d) final float f) {
        if (this.a == null) {
            this.d.add(new a() { // from class: com.airbnb.lottie.LottieDrawable.3
                @Override // com.airbnb.lottie.LottieDrawable.a
                public final void a(e eVar) {
                    LottieDrawable.this.c(f);
                }
            });
            return;
        }
        float f2 = this.a.i;
        c((int) (f2 + (f * (this.a.j - f2))));
    }

    public final void d(int i) {
        this.b.setRepeatCount(i);
    }

    public final void d(float f) {
        this.c = f;
        h();
    }

    public final boolean e() {
        return this.j == null && this.a.e.size() > 0;
    }

    private void h() {
        if (this.a == null) {
            return;
        }
        float f = this.c;
        setBounds(0, 0, (int) (this.a.h.width() * f), (int) (this.a.h.height() * f));
    }

    public final void f() {
        this.d.clear();
        this.b.cancel();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.a == null) {
            return -1;
        }
        return (int) (this.a.h.width() * this.c);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.a == null) {
            return -1;
        }
        return (int) (this.a.h.height() * this.c);
    }

    private List<com.airbnb.lottie.model.e> a(com.airbnb.lottie.model.e eVar) {
        if (this.p == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.p.a(eVar, 0, arrayList, new com.airbnb.lottie.model.e(new String[0]));
        return arrayList;
    }

    public final <T> void a(final com.airbnb.lottie.model.e eVar, final T t, final com.airbnb.lottie.value.c<T> cVar) {
        if (this.p == null) {
            this.d.add(new a() { // from class: com.airbnb.lottie.LottieDrawable.4
                @Override // com.airbnb.lottie.LottieDrawable.a
                public final void a(e eVar2) {
                    LottieDrawable.this.a(eVar, t, cVar);
                }
            });
            return;
        }
        boolean z = true;
        if (eVar.a != null) {
            eVar.a.a(t, cVar);
        } else {
            List<com.airbnb.lottie.model.e> a2 = a(eVar);
            for (int i = 0; i < a2.size(); i++) {
                a2.get(i).a.a(t, cVar);
            }
            if (a2.isEmpty()) {
                z = false;
            }
        }
        if (z) {
            invalidateSelf();
            if (t == i.w) {
                c(this.b.b());
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    @Override // android.graphics.drawable.Animatable
    @MainThread
    public void stop() {
        this.d.clear();
        this.b.f();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.b.isRunning();
    }

    @Nullable
    public final Bitmap a(String str) {
        com.airbnb.lottie.manager.b bVar;
        if (getCallback() == null) {
            bVar = null;
        } else {
            if (this.e != null) {
                com.airbnb.lottie.manager.b bVar2 = this.e;
                Drawable.Callback callback = getCallback();
                Context context = (callback == null || !(callback instanceof View)) ? null : ((View) callback).getContext();
                if (!((context == null && bVar2.a == null) || bVar2.a.equals(context))) {
                    this.e.a();
                    this.e = null;
                }
            }
            if (this.e == null) {
                this.e = new com.airbnb.lottie.manager.b(getCallback(), this.f, this.g, this.a.c);
            }
            bVar = this.e;
        }
        if (bVar != null) {
            return bVar.a(str);
        }
        return null;
    }
}
