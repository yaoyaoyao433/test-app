package com.sankuai.waimai.store.newwidgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.widgets.smoothnestedscroll.base.SmoothNestedScrollRecyclerView;
import com.sankuai.waimai.store.widgets.smoothnestedscroll.core.c;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MarketNestedScrollRecyclerView extends SmoothNestedScrollRecyclerView {
    public static ChangeQuickRedirect a;
    private boolean b;

    public MarketNestedScrollRecyclerView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fb6cf07aabe5f5db1df2a33d7091ced", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fb6cf07aabe5f5db1df2a33d7091ced");
        } else {
            this.b = true;
        }
    }

    public MarketNestedScrollRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4377a48dfe5506389a6be015d238aeb1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4377a48dfe5506389a6be015d238aeb1");
        } else {
            this.b = true;
        }
    }

    public MarketNestedScrollRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e65bf7dc9da58d5924567d44cce5daa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e65bf7dc9da58d5924567d44cce5daa");
        } else {
            this.b = true;
        }
    }

    public void setDispatchNestedPreFling(boolean z) {
        this.b = z;
    }

    @Override // com.sankuai.waimai.store.widgets.smoothnestedscroll.base.SmoothNestedScrollRecyclerView, android.support.v7.widget.RecyclerView, android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c7a8a4991d9a9e25de0336fc9419b5e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c7a8a4991d9a9e25de0336fc9419b5e")).booleanValue() : this.b && super.dispatchNestedPreFling(f, f2);
    }

    @Override // com.sankuai.waimai.store.widgets.smoothnestedscroll.base.SmoothNestedScrollRecyclerView
    public final void b(View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbc83b4cf19bfbdc0621b86283e444dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbc83b4cf19bfbdc0621b86283e444dc");
        } else if (this.b) {
            super.b(view, i, i2, i3, i4);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.smoothnestedscroll.base.SmoothNestedScrollRecyclerView
    public final void b(View view, int i, int i2, int i3, int i4, c cVar) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "146911cad0a6e9cdf16eb43f7ccf2fea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "146911cad0a6e9cdf16eb43f7ccf2fea");
        } else if (this.b) {
            super.b(view, i, i2, i3, i4, cVar);
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.support.v4.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), iArr, Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "265637e1b55e16b169249609df53dbb2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "265637e1b55e16b169249609df53dbb2")).booleanValue() : this.b && super.dispatchNestedScroll(i, i2, i3, i4, iArr, i5);
    }
}
