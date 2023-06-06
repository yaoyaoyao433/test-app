package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class l {
    final ArrayList<a> a = new ArrayList<>();
    a b = null;
    ValueAnimator c = null;
    private final Animator.AnimatorListener d = new AnimatorListenerAdapter() { // from class: android.support.design.widget.l.1
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (l.this.c == animator) {
                l.this.c = null;
            }
        }
    };

    public final void a(int[] iArr, ValueAnimator valueAnimator) {
        a aVar = new a(iArr, valueAnimator);
        valueAnimator.addListener(this.d);
        this.a.add(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void cancel() {
        if (this.c != null) {
            this.c.cancel();
            this.c = null;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class a {
        final int[] a;
        final ValueAnimator b;

        a(int[] iArr, ValueAnimator valueAnimator) {
            this.a = iArr;
            this.b = valueAnimator;
        }
    }
}
