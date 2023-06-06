package android.support.design.widget;

import android.content.Context;
import android.support.v4.math.MathUtils;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {
    OverScroller a;
    private Runnable b;
    private boolean c;
    private int d;
    private int e;
    private int f;
    private VelocityTracker g;

    void a(CoordinatorLayout coordinatorLayout, V v) {
    }

    boolean c(V v) {
        return false;
    }

    public HeaderBehavior() {
        this.d = -1;
        this.f = -1;
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = -1;
        this.f = -1;
    }

    @Override // android.support.design.widget.CoordinatorLayout.a
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f < 0) {
            this.f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getAction() == 2 && this.c) {
            return true;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.c = false;
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (c(v) && coordinatorLayout.a(v, x, y)) {
                    this.e = y;
                    this.d = motionEvent.getPointerId(0);
                    c();
                    break;
                }
                break;
            case 1:
            case 3:
                this.c = false;
                this.d = -1;
                if (this.g != null) {
                    this.g.recycle();
                    this.g = null;
                    break;
                }
                break;
            case 2:
                int i = this.d;
                if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                    int y2 = (int) motionEvent.getY(findPointerIndex);
                    if (Math.abs(y2 - this.e) > this.f) {
                        this.c = true;
                        this.e = y2;
                        break;
                    }
                }
                break;
        }
        if (this.g != null) {
            this.g.addMovement(motionEvent);
        }
        return this.c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    @Override // android.support.design.widget.CoordinatorLayout.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.support.design.widget.CoordinatorLayout r20, V r21, android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.HeaderBehavior.onTouchEvent(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a_(CoordinatorLayout coordinatorLayout, V v, int i) {
        return a(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    int a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int clamp;
        int b = b();
        if (i2 == 0 || b < i2 || b > i3 || b == (clamp = MathUtils.clamp(i, i2, i3))) {
            return 0;
        }
        a(clamp);
        return b - clamp;
    }

    int a() {
        return b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return a(coordinatorLayout, v, a() - i, i2, i3);
    }

    int b(V v) {
        return -v.getHeight();
    }

    int a(V v) {
        return v.getHeight();
    }

    private void c() {
        if (this.g == null) {
            this.g = VelocityTracker.obtain();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class a implements Runnable {
        private final CoordinatorLayout b;
        private final V c;

        a(CoordinatorLayout coordinatorLayout, V v) {
            this.b = coordinatorLayout;
            this.c = v;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.c == null || HeaderBehavior.this.a == null) {
                return;
            }
            if (HeaderBehavior.this.a.computeScrollOffset()) {
                HeaderBehavior.this.a_(this.b, this.c, HeaderBehavior.this.a.getCurrY());
                ViewCompat.postOnAnimation(this.c, this);
                return;
            }
            HeaderBehavior.this.a(this.b, this.c);
        }
    }
}
