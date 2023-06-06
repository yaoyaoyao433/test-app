package com.sankuai.waimai.store.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.NestedScrollingParent2;
import android.support.v4.view.NestedScrollingParentHelper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Scroller;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.widget.MachViewGroup;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class HorizontalSpringBackView extends MachViewGroup implements NestedScrollingParent2 {
    public static ChangeQuickRedirect a;
    private NestedScrollingParentHelper b;
    private View c;
    private boolean d;
    private Scroller e;
    private boolean f;
    private a g;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void bJ_();
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i, int i2) {
        return (i & 1) != 0;
    }

    public HorizontalSpringBackView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50aa238ec0d856a93ae08d993fb6c50c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50aa238ec0d856a93ae08d993fb6c50c");
            return;
        }
        this.b = new NestedScrollingParentHelper(this);
        this.c = null;
        this.d = false;
        this.f = false;
        this.e = new Scroller(context);
    }

    public HorizontalSpringBackView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc60a0a070324441252cccbb349eeb45", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc60a0a070324441252cccbb349eeb45");
            return;
        }
        this.b = new NestedScrollingParentHelper(this);
        this.c = null;
        this.d = false;
        this.f = false;
        this.e = new Scroller(context);
    }

    public void setSpringBackView(View view) {
        this.c = view;
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i, int i2) {
        Object[] objArr = {view, view2, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7830ad583cda889d29cfa7de2de31dbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7830ad583cda889d29cfa7de2de31dbe");
        } else {
            this.b.onNestedScrollAccepted(view, view2, i, i2);
        }
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onStopNestedScroll(@NonNull View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ed55c9d9f42976a0d1f370c3cca1dab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ed55c9d9f42976a0d1f370c3cca1dab");
        } else {
            this.b.onStopNestedScroll(view, i);
        }
    }

    @Override // android.view.ViewGroup, android.support.v4.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc50e657ba855c90750a62cb4c931369", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc50e657ba855c90750a62cb4c931369")).intValue() : this.b.getNestedScrollAxes();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22797b90ad0785b99aac6db46aa88330", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22797b90ad0785b99aac6db46aa88330")).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    this.d = true;
                    break;
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        this.d = false;
        View innerRootView = getInnerRootView();
        if (innerRootView != null && this.c != null) {
            if (innerRootView.getScrollX() > (this.c.getWidth() * 3) / 4) {
                this.f = true;
            }
            this.e.startScroll(innerRootView.getScrollX(), 0, -innerRootView.getScrollX(), 0, 300);
            invalidate();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4, int i5) {
        View innerRootView;
        int width;
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1d2b6871efc814374979e4cfaed98b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1d2b6871efc814374979e4cfaed98b9");
        } else if (this.c == null || !this.d || (innerRootView = getInnerRootView()) == null || (width = this.c.getWidth()) <= 0 || innerRootView.getScrollX() >= width || i3 <= 0) {
        } else {
            if (innerRootView.getScrollX() + i3 > width) {
                i3 -= (innerRootView.getScrollX() + i3) - width;
            }
            StringBuilder sb = new StringBuilder("dx = ");
            sb.append(i3);
            sb.append(", getScrollX = ");
            sb.append(innerRootView.getScrollX());
            innerRootView.scrollBy(i3 / 2, 0);
        }
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onNestedPreScroll(@NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), iArr, Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9fb63db6937ec0cf508c964aa119d08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9fb63db6937ec0cf508c964aa119d08");
        } else if (this.c == null) {
        } else {
            iArr[0] = 0;
            iArr[1] = 0;
            View innerRootView = getInnerRootView();
            if (innerRootView != null && this.c.getWidth() > 0 && innerRootView.getScrollX() > 0 && i < 0) {
                if (innerRootView.getScrollX() + i < 0) {
                    i = -innerRootView.getScrollX();
                }
                iArr[0] = i;
                iArr[1] = 0;
                StringBuilder sb = new StringBuilder("dx = ");
                sb.append(i);
                sb.append(", getScrollX = ");
                sb.append(innerRootView.getScrollX());
                innerRootView.scrollBy(i, 0);
            }
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bbe2d306ea1d27721dbb901818fa471", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bbe2d306ea1d27721dbb901818fa471");
            return;
        }
        super.computeScroll();
        View innerRootView = getInnerRootView();
        if (innerRootView == null) {
            return;
        }
        if (this.e.computeScrollOffset()) {
            innerRootView.scrollTo(this.e.getCurrX(), this.e.getCurrY());
            invalidate();
        } else if (this.d || !this.f || this.g == null) {
        } else {
            this.g.bJ_();
        }
    }

    private View getInnerRootView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28371ee6cd8fbb849ebebe8e52e9051d", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28371ee6cd8fbb849ebebe8e52e9051d");
        }
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    public void setSpringBackCallback(a aVar) {
        this.g = aVar;
    }
}
