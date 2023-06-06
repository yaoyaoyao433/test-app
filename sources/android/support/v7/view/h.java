package android.support.v7.view;

import android.support.annotation.RestrictTo;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class h {
    ViewPropertyAnimatorListener b;
    boolean c;
    private Interpolator e;
    private long d = -1;
    private final ViewPropertyAnimatorListenerAdapter f = new ViewPropertyAnimatorListenerAdapter() { // from class: android.support.v7.view.ViewPropertyAnimatorCompatSet$1
        private boolean b = false;
        private int c = 0;

        @Override // android.support.v4.view.ViewPropertyAnimatorListenerAdapter, android.support.v4.view.ViewPropertyAnimatorListener
        public void onAnimationStart(View view) {
            if (this.b) {
                return;
            }
            this.b = true;
            if (h.this.b != null) {
                h.this.b.onAnimationStart(null);
            }
        }

        @Override // android.support.v4.view.ViewPropertyAnimatorListenerAdapter, android.support.v4.view.ViewPropertyAnimatorListener
        public void onAnimationEnd(View view) {
            int i = this.c + 1;
            this.c = i;
            if (i == h.this.a.size()) {
                if (h.this.b != null) {
                    h.this.b.onAnimationEnd(null);
                }
                this.c = 0;
                this.b = false;
                h.this.c = false;
            }
        }
    };
    final ArrayList<ViewPropertyAnimatorCompat> a = new ArrayList<>();

    public final h a(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat) {
        if (!this.c) {
            this.a.add(viewPropertyAnimatorCompat);
        }
        return this;
    }

    public final h a(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat, ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2) {
        this.a.add(viewPropertyAnimatorCompat);
        viewPropertyAnimatorCompat2.setStartDelay(viewPropertyAnimatorCompat.getDuration());
        this.a.add(viewPropertyAnimatorCompat2);
        return this;
    }

    public final void a() {
        if (this.c) {
            return;
        }
        Iterator<ViewPropertyAnimatorCompat> it = this.a.iterator();
        while (it.hasNext()) {
            ViewPropertyAnimatorCompat next = it.next();
            if (this.d >= 0) {
                next.setDuration(this.d);
            }
            if (this.e != null) {
                next.setInterpolator(this.e);
            }
            if (this.b != null) {
                next.setListener(this.f);
            }
            next.start();
        }
        this.c = true;
    }

    public final void cancel() {
        if (this.c) {
            Iterator<ViewPropertyAnimatorCompat> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
            this.c = false;
        }
    }

    public final h a(long j) {
        if (!this.c) {
            this.d = 250L;
        }
        return this;
    }

    public final h a(Interpolator interpolator) {
        if (!this.c) {
            this.e = interpolator;
        }
        return this;
    }

    public final h a(ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        if (!this.c) {
            this.b = viewPropertyAnimatorListener;
        }
        return this;
    }
}
