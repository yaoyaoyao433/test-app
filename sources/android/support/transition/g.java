package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g extends Visibility {
    public g(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.i = i;
    }

    public g() {
    }

    @Override // android.support.transition.Visibility, android.support.transition.Transition
    public final void a(@NonNull x xVar) {
        super.a(xVar);
        xVar.a.put("android:fade:transitionAlpha", Float.valueOf(ak.c(xVar.b)));
    }

    private Animator a(final View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        ak.a(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, ak.a, f2);
        ofFloat.addListener(new a(view));
        a(new t() { // from class: android.support.transition.g.1
            @Override // android.support.transition.t, android.support.transition.Transition.b
            public final void b(@NonNull Transition transition) {
                ak.a(view, 1.0f);
                ak.e(view);
                transition.b(this);
            }
        });
        return ofFloat;
    }

    @Override // android.support.transition.Visibility
    public final Animator a(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        float a2 = a(xVar, 0.0f);
        return a(view, a2 != 1.0f ? a2 : 0.0f, 1.0f);
    }

    @Override // android.support.transition.Visibility
    public final Animator b(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        ak.d(view);
        return a(view, a(xVar, 1.0f), 0.0f);
    }

    private static float a(x xVar, float f) {
        Float f2;
        return (xVar == null || (f2 = (Float) xVar.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a extends AnimatorListenerAdapter {
        private final View a;
        private boolean b = false;

        a(View view) {
            this.a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            if (ViewCompat.hasOverlappingRendering(this.a) && this.a.getLayerType() == 0) {
                this.b = true;
                this.a.setLayerType(2, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ak.a(this.a, 1.0f);
            if (this.b) {
                this.a.setLayerType(0, null);
            }
        }
    }
}
