package com.sankuai.waimai.store.widgets.smoothnestedscroll.base;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.widgets.smoothnestedscroll.core.c;
import com.sankuai.waimai.store.widgets.smoothnestedscroll.core.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SmoothNestedScrollCoordinatorLayout extends CoordinatorLayout implements e {
    public static ChangeQuickRedirect i;

    public SmoothNestedScrollCoordinatorLayout(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06ee170e16fcbde243f6206739c3b58f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06ee170e16fcbde243f6206739c3b58f");
        }
    }

    public SmoothNestedScrollCoordinatorLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bad466d97dfb5d188c688bd694198ad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bad466d97dfb5d188c688bd694198ad");
        }
    }

    @Override // android.support.design.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de13216d1feaf2aa0abee5c876bfce2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de13216d1feaf2aa0abee5c876bfce2a");
            return;
        }
        a();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e2753b0396ad797029beaaa60778978", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e2753b0396ad797029beaaa60778978");
            return;
        }
        a();
        super.onStartTemporaryDetach();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0211ca95f7cd25e217a8ecd7ccc2ea57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0211ca95f7cd25e217a8ecd7ccc2ea57");
            return;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                childAt.getLayoutParams();
            }
        }
    }

    @Override // com.sankuai.waimai.store.widgets.smoothnestedscroll.core.e
    public final void a(View view, int i2, int i3, int i4, int i5, c cVar) {
        Object[] objArr = {view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), cVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "711bd861d32c59974b056414e7ec98f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "711bd861d32c59974b056414e7ec98f8");
            return;
        }
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8 && (((CoordinatorLayout.c) childAt.getLayoutParams()).a instanceof com.sankuai.waimai.store.widgets.smoothnestedscroll.core.a)) {
                return;
            }
        }
    }

    @Override // com.sankuai.waimai.store.widgets.smoothnestedscroll.core.e
    public final void a_(View view, int i2, int i3, int i4, int i5) {
        Object[] objArr = {view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c25f9d7f1e0bab65faf8b1aa2cdccb2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c25f9d7f1e0bab65faf8b1aa2cdccb2f");
            return;
        }
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8 && (((CoordinatorLayout.c) childAt.getLayoutParams()).a instanceof com.sankuai.waimai.store.widgets.smoothnestedscroll.core.a)) {
                return;
            }
        }
    }
}
