package com.sankuai.waimai.store.newwidgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.goods.list.viewblocks.video.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class StandardPoiPriorityNestedScrollView extends PrioritySmoothNestedScrollView {
    public static ChangeQuickRedirect a;
    public a b;
    public boolean c;

    public StandardPoiPriorityNestedScrollView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de0ba0a1a81e41f4d39aa1928ba4bbb0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de0ba0a1a81e41f4d39aa1928ba4bbb0");
        } else {
            this.c = false;
        }
    }

    public StandardPoiPriorityNestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a62406c39cb39f71c9e4aeed9e17b28", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a62406c39cb39f71c9e4aeed9e17b28");
        } else {
            this.c = false;
        }
    }

    public StandardPoiPriorityNestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23be4b855893b4b014280af873f92643", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23be4b855893b4b014280af873f92643");
        } else {
            this.c = false;
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView, com.sankuai.waimai.store.widgets.smoothnestedscroll.base.SmoothNestedScrollView, android.support.v4.widget.NestedScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80ecc2269018c4bde96162607fc543ff", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80ecc2269018c4bde96162607fc543ff")).booleanValue();
        }
        if (!this.c || this.b == null || !this.b.a() || motionEvent.getRawY() > this.b.b()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView, android.support.v4.widget.NestedScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf301b346076d3bdba68f60e5dd4366f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf301b346076d3bdba68f60e5dd4366f")).booleanValue();
        }
        if (!this.c || this.b == null || !this.b.a() || motionEvent.getRawY() > this.b.b()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }
}
