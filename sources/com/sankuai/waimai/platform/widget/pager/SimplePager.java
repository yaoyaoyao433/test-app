package com.sankuai.waimai.platform.widget.pager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SimplePager extends HorizontalScrollView {
    public static ChangeQuickRedirect a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private VelocityTracker h;
    private a i;
    private c j;
    private b k;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        int a(SimplePager simplePager, int i, int i2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface c {
    }

    public SimplePager(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "762ad3b18592ed3f0515fd99a447be5b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "762ad3b18592ed3f0515fd99a447be5b");
            return;
        }
        this.b = -1;
        this.c = 0;
        this.d = 0;
        this.h = VelocityTracker.obtain();
        a(context);
    }

    public SimplePager(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e59a2a7170441672b341498d6953bbf7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e59a2a7170441672b341498d6953bbf7");
            return;
        }
        this.b = -1;
        this.c = 0;
        this.d = 0;
        this.h = VelocityTracker.obtain();
        a(context);
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f4936b4f1fcff8c635fa58e9be8002d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f4936b4f1fcff8c635fa58e9be8002d");
            return;
        }
        setHorizontalScrollBarEnabled(false);
        scrollTo(0, 0);
        float f = context.getResources().getDisplayMetrics().density;
        this.g = (int) (400.0f * f);
        this.f = (int) (f * 25.0f);
    }

    public void setOnPageChangedListener(a aVar) {
        this.i = aVar;
    }

    public void setOnPageScrollListener(c cVar) {
        this.j = cVar;
    }

    public void setOnPageCountChangedListener(b bVar) {
        this.k = bVar;
    }

    public int getPageLength() {
        return this.c;
    }

    public int getPageCount() {
        return this.b;
    }

    public int getCurrentPage() {
        return this.d;
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06706b356dc265a8c6992f1fbf007958", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06706b356dc265a8c6992f1fbf007958");
        } else {
            b(this.d + i);
        }
    }

    private void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b36d7b8965487eca9bcd4e55056175b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b36d7b8965487eca9bcd4e55056175b5");
            return;
        }
        this.d = c(i);
        smoothScrollTo(this.c * this.d, getScrollY());
    }

    private int c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26e73c5c726849528c23625c8b755f43", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26e73c5c726849528c23625c8b755f43")).intValue();
        }
        if (i >= getPageCount()) {
            i = getPageCount() - 1;
        }
        if (i < 0) {
            return 0;
        }
        return i;
    }

    private void setPageCountInternal(int i) {
        int i2;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9002fea4d52f5e6feb05d7ac22edd350", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9002fea4d52f5e6feb05d7ac22edd350");
        } else if (i >= 0 && i != this.b) {
            int i3 = this.b;
            this.b = i;
            if (this.k != null) {
                i2 = this.k.a(this, i3, this.b);
            } else {
                i2 = this.d;
            }
            Object[] objArr2 = {Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b0903dfaf02e2ce1e43621035642eae0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b0903dfaf02e2ce1e43621035642eae0");
                return;
            }
            this.d = c(i2);
            scrollTo(this.c * this.d, getScrollY());
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4436d3582bf64b2ed34225efdadcdf51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4436d3582bf64b2ed34225efdadcdf51");
        } else if (getChildCount() > 0 && (getChildAt(0) instanceof com.sankuai.waimai.platform.widget.pager.a)) {
            Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "08496e6ee16148c4de6fc9740f687e7d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "08496e6ee16148c4de6fc9740f687e7d");
                return;
            }
            int defaultSize = getDefaultSize(getSuggestedMinimumWidth(), i);
            this.c = (defaultSize - getPaddingLeft()) - getPaddingRight();
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(defaultSize, 1073741824), i2);
            setPageCountInternal(((com.sankuai.waimai.platform.widget.pager.a) getChildAt(0)).a());
        } else {
            Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d834e9886f4eede1eeceaf6dfa281620", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d834e9886f4eede1eeceaf6dfa281620");
                return;
            }
            int defaultSize2 = getDefaultSize(getSuggestedMinimumWidth(), i);
            this.c = (defaultSize2 - getPaddingLeft()) - getPaddingRight();
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(defaultSize2, 1073741824), i2);
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                int measuredWidth = childAt.getMeasuredWidth();
                setPageCountInternal(measuredWidth / this.c);
                int i3 = this.b * this.c;
                if (measuredWidth != i3) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                    return;
                }
                return;
            }
            setPageCountInternal(0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb48aebb18929b74266b212048cc4c14", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb48aebb18929b74266b212048cc4c14")).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            this.e = (int) motionEvent.getRawX();
        }
        this.h.addMovement(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8463d4630d4f76434edf2a42f0aa2a3d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8463d4630d4f76434edf2a42f0aa2a3d")).booleanValue();
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action != 3) {
                return onTouchEvent;
            }
            this.h.clear();
            a(0);
            return true;
        }
        int rawX = ((int) motionEvent.getRawX()) - this.e;
        this.h.computeCurrentVelocity(1000);
        float xVelocity = this.h.getXVelocity(0);
        this.h.clear();
        if (Math.abs(rawX) <= this.f || Math.abs(xVelocity) <= this.g) {
            int scrollX = getScrollX();
            if (scrollX % this.c != 0) {
                b((scrollX + (this.c / 2)) / this.c);
            }
        } else if (rawX > 0) {
            a(-1);
        } else {
            a(1);
        }
        return true;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c7d44cb76ce600ddda8b097fad505fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c7d44cb76ce600ddda8b097fad505fb");
        } else {
            super.onScrollChanged(i, i2, i3, i4);
        }
    }
}
