package com.dianping.picassomodule.widget.scroll;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class WrapContentViewPager extends DirectionalViewPager {
    public static ChangeQuickRedirect h;
    protected boolean i;

    public WrapContentViewPager(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2e516fd96c548a9a71c78a805cd223e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2e516fd96c548a9a71c78a805cd223e");
        }
    }

    public WrapContentViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "439595e2c599ca5b6a3a77cb44ed3f29", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "439595e2c599ca5b6a3a77cb44ed3f29");
        } else {
            this.i = true;
        }
    }

    @Override // android.support.v4.view.ViewPager, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc3d23f7f76f27fd4dfc40c05d9a644a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc3d23f7f76f27fd4dfc40c05d9a644a");
            return;
        }
        super.onMeasure(i, i2);
        int i3 = 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            childAt.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = childAt.getMeasuredHeight();
            if (measuredHeight > i3) {
                i3 = measuredHeight;
            }
        }
        setMeasuredDimension(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
    }

    public void setUserScrollEnabled(boolean z) {
        this.i = z;
    }

    @Override // com.dianping.picassomodule.widget.scroll.DirectionalViewPager, android.support.v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "033b5fb08c48979425701199b72f3983", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "033b5fb08c48979425701199b72f3983")).booleanValue() : this.i && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.dianping.picassomodule.widget.scroll.DirectionalViewPager, android.support.v4.view.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5066b05f58c08f3fb45363a1aa33f00", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5066b05f58c08f3fb45363a1aa33f00")).booleanValue() : this.i && super.onTouchEvent(motionEvent);
    }
}
