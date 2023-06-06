package com.sankuai.waimai.store.drug.goods.list.templet.newmarket;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class StandardPoiPriorityNestedScrollView extends PrioritySmoothNestedScrollView {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.store.drug.goods.list.viewblocks.video.a b;
    public boolean c;

    public StandardPoiPriorityNestedScrollView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40e20e28ecd8c178dacc286c0b9d24f3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40e20e28ecd8c178dacc286c0b9d24f3");
        } else {
            this.c = false;
        }
    }

    public StandardPoiPriorityNestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8a003037c6b0fb18bb7af619a9819f8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8a003037c6b0fb18bb7af619a9819f8");
        } else {
            this.c = false;
        }
    }

    public StandardPoiPriorityNestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04953a3f4563116e1748e96fbde24c4e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04953a3f4563116e1748e96fbde24c4e");
        } else {
            this.c = false;
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView, com.sankuai.waimai.store.widgets.smoothnestedscroll.base.SmoothNestedScrollView, android.support.v4.widget.NestedScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "feff2be24256480a0374e783190f45be", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "feff2be24256480a0374e783190f45be")).booleanValue();
        }
        try {
            if (!this.c || this.b == null || !this.b.a() || motionEvent.getRawY() > this.b.b()) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
            return true;
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView, android.support.v4.widget.NestedScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7851defac0c6a647e69a9c9f6d3fc64", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7851defac0c6a647e69a9c9f6d3fc64")).booleanValue();
        }
        if (!this.c || this.b == null || !this.b.a() || motionEvent.getRawY() > this.b.b()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }
}
