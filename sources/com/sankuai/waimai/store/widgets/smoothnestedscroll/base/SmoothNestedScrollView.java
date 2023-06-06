package com.sankuai.waimai.store.widgets.smoothnestedscroll.base;

import android.content.Context;
import android.support.v4.widget.NestedScrollView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.n;
import com.sankuai.waimai.store.widgets.smoothnestedscroll.core.c;
import com.sankuai.waimai.store.widgets.smoothnestedscroll.core.d;
import com.sankuai.waimai.store.widgets.smoothnestedscroll.core.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SmoothNestedScrollView extends NestedScrollView implements e {
    public static ChangeQuickRedirect g;
    private VelocityTracker a;
    private boolean b;
    private int c;
    private int d;
    private int e;
    private boolean f;
    public final d h;
    protected int i;
    protected a j;

    @Override // android.support.v4.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
    }

    public void setOnHomePageSmoothNestedScrollListener(a aVar) {
        this.j = aVar;
    }

    public void setSmoothNestedScrollState(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff381d729b6ff0ee0878bf1630accc08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff381d729b6ff0ee0878bf1630accc08");
        } else {
            a(i, false);
        }
    }

    private void a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17bbcb33e5f3cb4c75458cf5635a61c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17bbcb33e5f3cb4c75458cf5635a61c7");
            return;
        }
        boolean z2 = this.i != i;
        this.i = i;
        if (this.i == 3 || !z2 || this.j == null) {
            return;
        }
        this.j.a(this, this.i, z);
    }

    public int getSmoothNestedScrollState() {
        return this.i;
    }

    public SmoothNestedScrollView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd761be35130cd9158edf6c5535ab507", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd761be35130cd9158edf6c5535ab507");
            return;
        }
        this.h = new d(this);
        this.a = VelocityTracker.obtain();
        this.b = false;
        this.i = 0;
        a(context);
    }

    public SmoothNestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba97424e0643f64ff7bdd54cbdcf4744", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba97424e0643f64ff7bdd54cbdcf4744");
            return;
        }
        this.h = new d(this);
        this.a = VelocityTracker.obtain();
        this.b = false;
        this.i = 0;
        a(context);
    }

    public SmoothNestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc4f4b5a37707bd73a500d4dd7437836", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc4f4b5a37707bd73a500d4dd7437836");
            return;
        }
        this.h = new d(this);
        this.a = VelocityTracker.obtain();
        this.b = false;
        this.i = 0;
        a(context);
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b1f132b40a37aa000410449dcf26a8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b1f132b40a37aa000410449dcf26a8f");
            return;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.c = viewConfiguration.getScaledMinimumFlingVelocity();
        this.d = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99746cc96f254d4d1ef933e5efb888a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99746cc96f254d4d1ef933e5efb888a0");
            return;
        }
        this.h.a();
        setSmoothNestedScrollState(0);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21d6c9761983118f81ada3ddb51c4cdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21d6c9761983118f81ada3ddb51c4cdf");
            return;
        }
        this.h.a();
        setSmoothNestedScrollState(0);
        super.onStartTemporaryDetach();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13d96da4a19bc50c67bf754bdf9f09ec", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13d96da4a19bc50c67bf754bdf9f09ec")).booleanValue();
        }
        this.h.a();
        if (this.i == 2) {
            setSmoothNestedScrollState(0);
        }
        if (motionEvent.getAction() == 0) {
            this.a.clear();
            this.e = (int) motionEvent.getRawY();
        }
        this.a.addMovement(motionEvent);
        try {
            z = super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            z = false;
        }
        int action = motionEvent.getAction();
        if ((action == 1 || action == 3) && this.i != 3 && this.i != 2) {
            setSmoothNestedScrollState(0);
        }
        return z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.support.v4.widget.NestedScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        boolean z;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b66a33db37b521c9c9c5b1437226416", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b66a33db37b521c9c9c5b1437226416")).booleanValue();
        }
        this.b = false;
        switch (motionEvent.getAction()) {
            case 0:
            case 2:
                this.f = true;
                i = 0;
                break;
            case 1:
                this.a.computeCurrentVelocity(1000, this.d);
                i = -((int) this.a.getYVelocity());
                if (Math.abs(i) > this.c) {
                    if (n.a(this.e - ((int) motionEvent.getRawY())) == n.a(i)) {
                        this.b = true;
                    } else {
                        com.sankuai.shangou.stone.util.log.a.d("LinkedFlingScroll", "error vy ignored", new Object[0]);
                    }
                }
                com.sankuai.shangou.stone.util.log.a.a("LinkedFlingScroll", "vy = %d", Integer.valueOf(i));
                this.a.clear();
                this.f = false;
                break;
            case 3:
                this.f = false;
                this.a.clear();
                i = 0;
                break;
            default:
                i = 0;
                break;
        }
        try {
            z = super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            z = false;
        }
        if (this.b) {
            this.b = false;
            float f = i;
            if (!dispatchNestedPreFling(0.0f, f)) {
                dispatchNestedFling(0.0f, f, false);
            }
        }
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked == 1 || actionMasked == 3) && this.i != 3 && this.i != 2) {
            setSmoothNestedScrollState(0);
        }
        return z;
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b1dc6386c2587778bc36900f81dfe5c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b1dc6386c2587778bc36900f81dfe5c")).booleanValue();
        }
        this.b = false;
        b(this, 0, (int) f, 0, (int) f2, new c() { // from class: com.sankuai.waimai.store.widgets.smoothnestedscroll.base.SmoothNestedScrollView.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.widgets.smoothnestedscroll.core.c
            public final void a(View view, int i, int i2, int i3, int i4) {
                Object[] objArr2 = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5913093a9443ce0716d04e0412f0c42b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5913093a9443ce0716d04e0412f0c42b");
                    return;
                }
                if (i3 == 0 && i4 == 0) {
                    SmoothNestedScrollView.this.setSmoothNestedScrollState(0);
                } else {
                    SmoothNestedScrollView.this.setSmoothNestedScrollState(2);
                }
                SmoothNestedScrollView.this.h.a(i, i2, i3, i4, new c() { // from class: com.sankuai.waimai.store.widgets.smoothnestedscroll.base.SmoothNestedScrollView.1.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.widgets.smoothnestedscroll.core.c
                    public final void a(View view2, int i5, int i6, int i7, int i8) {
                        Object[] objArr3 = {view2, Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f2d279dc416cc5ee92b7015eff9de84d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f2d279dc416cc5ee92b7015eff9de84d");
                        } else {
                            SmoothNestedScrollView.this.b(view2, i5, i6, i7, i8);
                        }
                    }
                });
            }
        });
        return true;
    }

    public final void b(View view, int i, int i2, int i3, int i4, c cVar) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), cVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b854161a05ce1ca4f6519cdd84d6366", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b854161a05ce1ca4f6519cdd84d6366");
        } else {
            this.h.a(view, i, i2, i3, i4, cVar);
        }
    }

    public final void b(View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d1fc40b185e44fbd5e8b94025a6747e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d1fc40b185e44fbd5e8b94025a6747e");
            return;
        }
        this.h.a(view, i, i2, i3, i4);
        setSmoothNestedScrollState(0);
    }

    public void a(View view, int i, int i2, int i3, int i4, c cVar) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), cVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe75207a1f2ffcf2d0bd8c2cbc02a365", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe75207a1f2ffcf2d0bd8c2cbc02a365");
        } else {
            b(view, i, i2, i3, i4, cVar);
        }
    }

    public void a_(View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0e3e0fea3824f0b614935bdd49c91cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0e3e0fea3824f0b614935bdd49c91cc");
        } else {
            b(view, i, i2, i3, i4);
        }
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dac676964bf1c85834ed11e882ddecda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dac676964bf1c85834ed11e882ddecda");
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        if (Math.abs(i2 - i4) >= 8 && this.i != 2) {
            a(1, !this.f);
        }
        if (this.j != null) {
            this.j.a(this, i2);
        }
    }
}
