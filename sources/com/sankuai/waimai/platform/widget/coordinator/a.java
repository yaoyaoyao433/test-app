package com.sankuai.waimai.platform.widget.coordinator;

import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    private static CoordinatorLayout.c b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b1f4ae20e12de98bc8a6065e56c33891", RobustBitConfig.DEFAULT_VALUE)) {
            return (CoordinatorLayout.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b1f4ae20e12de98bc8a6065e56c33891");
        }
        if (view == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.c) {
            return (CoordinatorLayout.c) layoutParams;
        }
        return null;
    }

    public static boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Object[] objArr = {coordinatorLayout, view, view2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6217662682b806b421916648394486a2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6217662682b806b421916648394486a2")).booleanValue();
        }
        CoordinatorLayout.a a2 = a(view);
        return a2 != null && a2.layoutDependsOn(coordinatorLayout, view, view2);
    }

    public static View a(CoordinatorLayout coordinatorLayout, View view) {
        Object[] objArr = {coordinatorLayout, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ca07a47d68f802931ee4fb0c9e59b301", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ca07a47d68f802931ee4fb0c9e59b301");
        }
        int childCount = coordinatorLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = coordinatorLayout.getChildAt(i);
            if (childAt != view && a(coordinatorLayout, view, childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public static CoordinatorLayout.a a(View view) {
        CoordinatorLayout.c b;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "600ea462ed5ab3451e2850066a18bab2", RobustBitConfig.DEFAULT_VALUE)) {
            return (CoordinatorLayout.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "600ea462ed5ab3451e2850066a18bab2");
        }
        if (view == null || (b = b(view)) == null) {
            return null;
        }
        return b.a;
    }
}
