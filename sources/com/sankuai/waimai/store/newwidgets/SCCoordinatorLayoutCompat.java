package com.sankuai.waimai.store.newwidgets;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.log.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SCCoordinatorLayoutCompat extends CoordinatorLayout {
    public static ChangeQuickRedirect i;

    public static String getCid() {
        return "";
    }

    public SCCoordinatorLayoutCompat(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f65b04e8972c56f8b1bb1f2c75531c6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f65b04e8972c56f8b1bb1f2c75531c6");
        }
    }

    public SCCoordinatorLayoutCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2581e5110b5bb34f873b9daec9ce6a64", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2581e5110b5bb34f873b9daec9ce6a64");
        }
    }

    public SCCoordinatorLayoutCompat(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c985706ebfd707acef15d7ab92a1521", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c985706ebfd707acef15d7ab92a1521");
        }
    }

    @Override // android.support.design.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        Object[] objArr = {view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6761b2322f4a74628aa62bf8aa30121", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6761b2322f4a74628aa62bf8aa30121");
            return;
        }
        super.onNestedScroll(view, i2, i3, i4, i5);
        a.d("sugoo6", "#onNestedScroll, comsumed=%d,unconsumed=%d", Integer.valueOf(i3), Integer.valueOf(i5));
    }

    @Override // android.view.View
    public void onScrollChanged(int i2, int i3, int i4, int i5) {
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d37daf3380cd56948deee8cdf44c7de3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d37daf3380cd56948deee8cdf44c7de3");
        } else {
            super.onScrollChanged(i2, i3, i4, i5);
        }
    }
}
