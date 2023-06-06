package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.transition.Transition;
import android.support.transition.b;
import android.view.View;
import android.view.ViewGroup;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class Visibility extends Transition {
    private static final String[] j = {"android:visibility:visibility", "android:visibility:parent"};
    int i = 3;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public @interface Mode {
    }

    public Animator a(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        return null;
    }

    public Animator b(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        return null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b {
        boolean a;
        boolean b;
        int c;
        int d;
        ViewGroup e;
        ViewGroup f;

        private b() {
        }
    }

    @Override // android.support.transition.Transition
    @Nullable
    public final String[] a() {
        return j;
    }

    private static void d(x xVar) {
        xVar.a.put("android:visibility:visibility", Integer.valueOf(xVar.b.getVisibility()));
        xVar.a.put("android:visibility:parent", xVar.b.getParent());
        int[] iArr = new int[2];
        xVar.b.getLocationOnScreen(iArr);
        xVar.a.put("android:visibility:screenLocation", iArr);
    }

    @Override // android.support.transition.Transition
    public void a(@NonNull x xVar) {
        d(xVar);
    }

    @Override // android.support.transition.Transition
    public void b(@NonNull x xVar) {
        d(xVar);
    }

    private static b b(x xVar, x xVar2) {
        b bVar = new b();
        bVar.a = false;
        bVar.b = false;
        if (xVar != null && xVar.a.containsKey("android:visibility:visibility")) {
            bVar.c = ((Integer) xVar.a.get("android:visibility:visibility")).intValue();
            bVar.e = (ViewGroup) xVar.a.get("android:visibility:parent");
        } else {
            bVar.c = -1;
            bVar.e = null;
        }
        if (xVar2 != null && xVar2.a.containsKey("android:visibility:visibility")) {
            bVar.d = ((Integer) xVar2.a.get("android:visibility:visibility")).intValue();
            bVar.f = (ViewGroup) xVar2.a.get("android:visibility:parent");
        } else {
            bVar.d = -1;
            bVar.f = null;
        }
        if (xVar != null && xVar2 != null) {
            if (bVar.c == bVar.d && bVar.e == bVar.f) {
                return bVar;
            }
            if (bVar.c != bVar.d) {
                if (bVar.c == 0) {
                    bVar.b = false;
                    bVar.a = true;
                } else if (bVar.d == 0) {
                    bVar.b = true;
                    bVar.a = true;
                }
            } else if (bVar.f == null) {
                bVar.b = false;
                bVar.a = true;
            } else if (bVar.e == null) {
                bVar.b = true;
                bVar.a = true;
            }
        } else if (xVar == null && bVar.d == 0) {
            bVar.b = true;
            bVar.a = true;
        } else if (xVar2 == null && bVar.c == 0) {
            bVar.b = false;
            bVar.a = true;
        }
        return bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x017c, code lost:
        if (r19.f != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0186 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f4 A[RETURN, SYNTHETIC] */
    @Override // android.support.transition.Transition
    @android.support.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator a(@android.support.annotation.NonNull android.view.ViewGroup r20, @android.support.annotation.Nullable android.support.transition.x r21, @android.support.annotation.Nullable android.support.transition.x r22) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.transition.Visibility.a(android.view.ViewGroup, android.support.transition.x, android.support.transition.x):android.animation.Animator");
    }

    @Override // android.support.transition.Transition
    public final boolean a(x xVar, x xVar2) {
        if (xVar == null && xVar2 == null) {
            return false;
        }
        if (xVar == null || xVar2 == null || xVar2.a.containsKey("android:visibility:visibility") == xVar.a.containsKey("android:visibility:visibility")) {
            b b2 = b(xVar, xVar2);
            return b2.a && (b2.c == 0 || b2.d == 0);
        }
        return false;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class a extends AnimatorListenerAdapter implements Transition.b, b.a {
        private final View b;
        private final int c;
        private final ViewGroup d;
        private boolean f;
        boolean a = false;
        private final boolean e = true;

        @Override // android.support.transition.Transition.b
        public final void a(@NonNull Transition transition) {
        }

        @Override // android.support.transition.Transition.b
        public final void e(@NonNull Transition transition) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }

        a(View view, int i, boolean z) {
            this.b = view;
            this.c = i;
            this.d = (ViewGroup) view.getParent();
            a(true);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, android.support.transition.b.a
        public final void onAnimationPause(Animator animator) {
            if (this.a) {
                return;
            }
            ak.a(this.b, this.c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, android.support.transition.b.a
        public final void onAnimationResume(Animator animator) {
            if (this.a) {
                return;
            }
            ak.a(this.b, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            a();
        }

        @Override // android.support.transition.Transition.b
        public final void b(@NonNull Transition transition) {
            a();
            transition.b(this);
        }

        @Override // android.support.transition.Transition.b
        public final void c(@NonNull Transition transition) {
            a(false);
        }

        @Override // android.support.transition.Transition.b
        public final void d(@NonNull Transition transition) {
            a(true);
        }

        private void a() {
            if (!this.a) {
                ak.a(this.b, this.c);
                if (this.d != null) {
                    this.d.invalidate();
                }
            }
            a(false);
        }

        private void a(boolean z) {
            if (!this.e || this.f == z || this.d == null) {
                return;
            }
            this.f = z;
            ad.a(this.d, z);
        }
    }
}
