package android.support.design.widget;

import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.ViewDragHelper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.a<V> {
    private boolean a;
    ViewDragHelper b;
    a c;
    private boolean i;
    private float h = 0.0f;
    int d = 2;
    float e = 0.5f;
    float f = 0.0f;
    float g = 0.5f;
    private final ViewDragHelper.Callback j = new ViewDragHelper.Callback() { // from class: android.support.design.widget.SwipeDismissBehavior.1
        private int b;
        private int c = -1;

        @Override // android.support.v4.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(View view, int i) {
            return this.c == -1 && SwipeDismissBehavior.this.a(view);
        }

        @Override // android.support.v4.widget.ViewDragHelper.Callback
        public void onViewCaptured(View view, int i) {
            this.c = i;
            this.b = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // android.support.v4.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i) {
            if (SwipeDismissBehavior.this.c != null) {
                SwipeDismissBehavior.this.c.a(i);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
            if (java.lang.Math.abs(r8.getLeft() - r7.b) >= java.lang.Math.round(r8.getWidth() * r7.a.e)) goto L40;
         */
        @Override // android.support.v4.widget.ViewDragHelper.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onViewReleased(android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                r10 = -1
                r7.c = r10
                int r10 = r8.getWidth()
                r0 = 0
                r1 = 0
                r2 = 1
                int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r3 == 0) goto L3f
                int r4 = android.support.v4.view.ViewCompat.getLayoutDirection(r8)
                if (r4 != r2) goto L16
                r4 = 1
                goto L17
            L16:
                r4 = 0
            L17:
                android.support.design.widget.SwipeDismissBehavior r5 = android.support.design.widget.SwipeDismissBehavior.this
                int r5 = r5.d
                r6 = 2
                if (r5 != r6) goto L1f
                goto L5b
            L1f:
                android.support.design.widget.SwipeDismissBehavior r5 = android.support.design.widget.SwipeDismissBehavior.this
                int r5 = r5.d
                if (r5 != 0) goto L2f
                if (r4 == 0) goto L2c
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L5d
                goto L5b
            L2c:
                if (r3 <= 0) goto L5d
                goto L5b
            L2f:
                android.support.design.widget.SwipeDismissBehavior r5 = android.support.design.widget.SwipeDismissBehavior.this
                int r5 = r5.d
                if (r5 != r2) goto L5d
                if (r4 == 0) goto L3a
                if (r3 <= 0) goto L5d
                goto L5b
            L3a:
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L5d
                goto L5b
            L3f:
                int r9 = r8.getLeft()
                int r0 = r7.b
                int r9 = r9 - r0
                int r0 = r8.getWidth()
                float r0 = (float) r0
                android.support.design.widget.SwipeDismissBehavior r3 = android.support.design.widget.SwipeDismissBehavior.this
                float r3 = r3.e
                float r0 = r0 * r3
                int r0 = java.lang.Math.round(r0)
                int r9 = java.lang.Math.abs(r9)
                if (r9 < r0) goto L5d
            L5b:
                r9 = 1
                goto L5e
            L5d:
                r9 = 0
            L5e:
                if (r9 == 0) goto L71
                int r9 = r8.getLeft()
                int r0 = r7.b
                if (r9 >= r0) goto L6c
                int r9 = r7.b
                int r9 = r9 - r10
                goto L6f
            L6c:
                int r9 = r7.b
                int r9 = r9 + r10
            L6f:
                r1 = 1
                goto L73
            L71:
                int r9 = r7.b
            L73:
                android.support.design.widget.SwipeDismissBehavior r10 = android.support.design.widget.SwipeDismissBehavior.this
                android.support.v4.widget.ViewDragHelper r10 = r10.b
                int r0 = r8.getTop()
                boolean r9 = r10.settleCapturedViewAt(r9, r0)
                if (r9 == 0) goto L8c
                android.support.design.widget.SwipeDismissBehavior$b r9 = new android.support.design.widget.SwipeDismissBehavior$b
                android.support.design.widget.SwipeDismissBehavior r10 = android.support.design.widget.SwipeDismissBehavior.this
                r9.<init>(r8, r1)
                android.support.v4.view.ViewCompat.postOnAnimation(r8, r9)
                return
            L8c:
                if (r1 == 0) goto L9b
                android.support.design.widget.SwipeDismissBehavior r9 = android.support.design.widget.SwipeDismissBehavior.this
                android.support.design.widget.SwipeDismissBehavior$a r9 = r9.c
                if (r9 == 0) goto L9b
                android.support.design.widget.SwipeDismissBehavior r9 = android.support.design.widget.SwipeDismissBehavior.this
                android.support.design.widget.SwipeDismissBehavior$a r9 = r9.c
                r9.a(r8)
            L9b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.SwipeDismissBehavior.AnonymousClass1.onViewReleased(android.view.View, float, float):void");
        }

        @Override // android.support.v4.widget.ViewDragHelper.Callback
        public int getViewHorizontalDragRange(View view) {
            return view.getWidth();
        }

        @Override // android.support.v4.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            int width;
            int width2;
            boolean z = ViewCompat.getLayoutDirection(view) == 1;
            if (SwipeDismissBehavior.this.d == 0) {
                if (z) {
                    width = this.b - view.getWidth();
                    width2 = this.b;
                } else {
                    width = this.b;
                    width2 = view.getWidth() + this.b;
                }
            } else if (SwipeDismissBehavior.this.d != 1) {
                width = this.b - view.getWidth();
                width2 = view.getWidth() + this.b;
            } else if (z) {
                width = this.b;
                width2 = view.getWidth() + this.b;
            } else {
                width = this.b - view.getWidth();
                width2 = this.b;
            }
            return SwipeDismissBehavior.a(width, i, width2);
        }

        @Override // android.support.v4.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // android.support.v4.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            float width = this.b + (view.getWidth() * SwipeDismissBehavior.this.f);
            float width2 = this.b + (view.getWidth() * SwipeDismissBehavior.this.g);
            float f = i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.a(0.0f, 1.0f - SwipeDismissBehavior.b(width, width2, f), 1.0f));
            }
        }
    };

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    @interface SwipeDirection {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void a(int i);

        void a(View view);
    }

    static float b(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    public boolean a(@NonNull View view) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // android.support.design.widget.CoordinatorLayout.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.support.design.widget.CoordinatorLayout r5, V r6, android.view.MotionEvent r7) {
        /*
            r4 = this;
            boolean r0 = r4.a
            int r1 = r7.getActionMasked()
            r2 = 3
            r3 = 0
            if (r1 == r2) goto L21
            switch(r1) {
                case 0: goto Le;
                case 1: goto L21;
                default: goto Ld;
            }
        Ld:
            goto L23
        Le:
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            boolean r6 = r5.a(r6, r0, r1)
            r4.a = r6
            boolean r0 = r4.a
            goto L23
        L21:
            r4.a = r3
        L23:
            if (r0 == 0) goto L45
            android.support.v4.widget.ViewDragHelper r6 = r4.b
            if (r6 != 0) goto L3e
            boolean r6 = r4.i
            if (r6 == 0) goto L36
            float r6 = r4.h
            android.support.v4.widget.ViewDragHelper$Callback r0 = r4.j
            android.support.v4.widget.ViewDragHelper r5 = android.support.v4.widget.ViewDragHelper.create(r5, r6, r0)
            goto L3c
        L36:
            android.support.v4.widget.ViewDragHelper$Callback r6 = r4.j
            android.support.v4.widget.ViewDragHelper r5 = android.support.v4.widget.ViewDragHelper.create(r5, r6)
        L3c:
            r4.b = r5
        L3e:
            android.support.v4.widget.ViewDragHelper r5 = r4.b
            boolean r5 = r5.shouldInterceptTouchEvent(r7)
            return r5
        L45:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.SwipeDismissBehavior.onInterceptTouchEvent(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.support.design.widget.CoordinatorLayout.a
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.b != null) {
            this.b.processTouchEvent(motionEvent);
            return true;
        }
        return false;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class b implements Runnable {
        private final View b;
        private final boolean c;

        b(View view, boolean z) {
            this.b = view;
            this.c = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (SwipeDismissBehavior.this.b != null && SwipeDismissBehavior.this.b.continueSettling(true)) {
                ViewCompat.postOnAnimation(this.b, this);
            } else if (!this.c || SwipeDismissBehavior.this.c == null) {
            } else {
                SwipeDismissBehavior.this.c.a(this.b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float a(float f, float f2, float f3) {
        return Math.min(Math.max(0.0f, f2), 1.0f);
    }

    static int a(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }
}
