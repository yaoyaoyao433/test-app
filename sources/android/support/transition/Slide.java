package android.support.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class Slide extends Visibility {
    private static final TimeInterpolator j = new DecelerateInterpolator();
    private static final TimeInterpolator k = new AccelerateInterpolator();
    private static final a m = new b() { // from class: android.support.transition.Slide.1
        @Override // android.support.transition.Slide.a
        public final float a(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    };
    private static final a n = new b() { // from class: android.support.transition.Slide.2
        @Override // android.support.transition.Slide.a
        public final float a(ViewGroup viewGroup, View view) {
            if (ViewCompat.getLayoutDirection(viewGroup) == 1) {
                return view.getTranslationX() + viewGroup.getWidth();
            }
            return view.getTranslationX() - viewGroup.getWidth();
        }
    };
    private static final a o = new c() { // from class: android.support.transition.Slide.3
        @Override // android.support.transition.Slide.a
        public final float b(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    };
    private static final a p = new b() { // from class: android.support.transition.Slide.4
        @Override // android.support.transition.Slide.a
        public final float a(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    };
    private static final a q = new b() { // from class: android.support.transition.Slide.5
        @Override // android.support.transition.Slide.a
        public final float a(ViewGroup viewGroup, View view) {
            if (ViewCompat.getLayoutDirection(viewGroup) == 1) {
                return view.getTranslationX() - viewGroup.getWidth();
            }
            return view.getTranslationX() + viewGroup.getWidth();
        }
    };
    private static final a r = new c() { // from class: android.support.transition.Slide.6
        @Override // android.support.transition.Slide.a
        public final float b(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    };
    private a l;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public @interface GravityFlag {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        float a(ViewGroup viewGroup, View view);

        float b(ViewGroup viewGroup, View view);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static abstract class b implements a {
        private b() {
        }

        @Override // android.support.transition.Slide.a
        public final float b(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static abstract class c implements a {
        private c() {
        }

        @Override // android.support.transition.Slide.a
        public final float a(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }
    }

    private static void d(x xVar) {
        int[] iArr = new int[2];
        xVar.b.getLocationOnScreen(iArr);
        xVar.a.put("android:slide:screenPosition", iArr);
    }

    @Override // android.support.transition.Visibility, android.support.transition.Transition
    public final void a(@NonNull x xVar) {
        super.a(xVar);
        d(xVar);
    }

    @Override // android.support.transition.Visibility, android.support.transition.Transition
    public final void b(@NonNull x xVar) {
        super.b(xVar);
        d(xVar);
    }

    @Override // android.support.transition.Visibility
    public final Animator a(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        if (xVar2 == null) {
            return null;
        }
        int[] iArr = (int[]) xVar2.a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return z.a(view, xVar2, iArr[0], iArr[1], this.l.a(viewGroup, view), this.l.b(viewGroup, view), translationX, translationY, j);
    }

    @Override // android.support.transition.Visibility
    public final Animator b(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        if (xVar == null) {
            return null;
        }
        int[] iArr = (int[]) xVar.a.get("android:slide:screenPosition");
        return z.a(view, xVar, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.l.a(viewGroup, view), this.l.b(viewGroup, view), k);
    }
}
