package com.sankuai.waimai.business.search.ui.result.behavior;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.math.MathUtils;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {
    public static ChangeQuickRedirect a;
    public OverScroller b;
    private Runnable c;
    private boolean e;
    private int f;
    private int g;
    private int h;
    private VelocityTracker i;

    public boolean a(V v) {
        return false;
    }

    public HeaderBehavior() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb00cef6b0942e16f50cd0ccbc5d84eb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb00cef6b0942e16f50cd0ccbc5d84eb");
            return;
        }
        this.f = -1;
        this.h = -1;
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ab30404696b133091e89c2b7c8b9ba2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ab30404696b133091e89c2b7c8b9ba2");
            return;
        }
        this.f = -1;
        this.h = -1;
    }

    @Override // android.support.design.widget.CoordinatorLayout.a
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int findPointerIndex;
        Object[] objArr = {coordinatorLayout, v, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90cb898f2ba409af812594d62d496fcc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90cb898f2ba409af812594d62d496fcc")).booleanValue();
        }
        if (coordinatorLayout.getTop() > 0) {
            return false;
        }
        if (this.h < 0) {
            this.h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getAction() == 2 && this.e) {
            return true;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.e = false;
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (a((HeaderBehavior<V>) v) && coordinatorLayout.a(v, x, y)) {
                    this.g = y;
                    this.f = motionEvent.getPointerId(0);
                    b();
                    break;
                }
                break;
            case 1:
            case 3:
                this.e = false;
                this.f = -1;
                if (this.i != null) {
                    this.i.recycle();
                    this.i = null;
                    break;
                }
                break;
            case 2:
                int i = this.f;
                if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                    int y2 = (int) motionEvent.getY(findPointerIndex);
                    if (Math.abs(y2 - this.g) > this.h) {
                        this.e = true;
                        this.g = y2;
                        break;
                    }
                }
                break;
        }
        if (this.i != null) {
            this.i.addMovement(motionEvent);
        }
        return this.e;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f8  */
    @Override // android.support.design.widget.CoordinatorLayout.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.support.design.widget.CoordinatorLayout r29, V r30, android.view.MotionEvent r31) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.search.ui.result.behavior.HeaderBehavior.onTouchEvent(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public final int a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int clamp;
        Object[] objArr = {coordinatorLayout, v, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dadacc958dec3599586fcf064c22799", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dadacc958dec3599586fcf064c22799")).intValue();
        }
        int a2 = a();
        if (i2 == 0 || a2 < i2 || a2 > i3 || a2 == (clamp = MathUtils.clamp(i, i2, i3))) {
            return 0;
        }
        a(clamp);
        return a2 - clamp;
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65f4df61f1aa127e5e3ebb485b95a2ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65f4df61f1aa127e5e3ebb485b95a2ad");
        } else if (this.i == null) {
            this.i = VelocityTracker.obtain();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class a implements Runnable {
        public static ChangeQuickRedirect a;
        private final CoordinatorLayout c;
        private final V d;

        public a(CoordinatorLayout coordinatorLayout, V v) {
            Object[] objArr = {HeaderBehavior.this, coordinatorLayout, v};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1141165d6aec42800e834f3ed3686d24", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1141165d6aec42800e834f3ed3686d24");
                return;
            }
            this.c = coordinatorLayout;
            this.d = v;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50aeac178eef4673b07ffea9a89c69e4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50aeac178eef4673b07ffea9a89c69e4");
            } else if (this.d == null || HeaderBehavior.this.b == null || !HeaderBehavior.this.b.computeScrollOffset()) {
            } else {
                HeaderBehavior headerBehavior = HeaderBehavior.this;
                CoordinatorLayout coordinatorLayout = this.c;
                V v = this.d;
                int currY = HeaderBehavior.this.b.getCurrY();
                Object[] objArr2 = {coordinatorLayout, v, Integer.valueOf(currY)};
                ChangeQuickRedirect changeQuickRedirect2 = HeaderBehavior.a;
                if (PatchProxy.isSupport(objArr2, headerBehavior, changeQuickRedirect2, false, "4c6fcb54554996ccc9ae43ea6fbf227f", RobustBitConfig.DEFAULT_VALUE)) {
                    ((Integer) PatchProxy.accessDispatch(objArr2, headerBehavior, changeQuickRedirect2, false, "4c6fcb54554996ccc9ae43ea6fbf227f")).intValue();
                } else {
                    headerBehavior.a(coordinatorLayout, v, currY, Integer.MIN_VALUE, Integer.MAX_VALUE);
                }
                ViewCompat.postOnAnimation(this.d, this);
            }
        }
    }
}
