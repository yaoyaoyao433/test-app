package com.sankuai.waimai.business.restaurant.poicontainer.machpro.nested;

import android.support.annotation.Keep;
import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.component.MPComponent;
import com.sankuai.waimai.platform.widget.coordinator.ExpandableScrollingBehavior;
import com.sankuai.waimai.platform.widget.coordinator.a;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class MPExpandableScrollingBehavior extends ExpandableScrollingBehavior {
    public static ChangeQuickRedirect changeQuickRedirect;
    private MPComponent mpComponent;

    @Override // com.sankuai.waimai.platform.widget.coordinator.ExpandableScrollingBehavior, android.support.design.widget.CoordinatorLayout.a
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {coordinatorLayout, view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cf304e59fd4a9d2862071cddbe5d4c8a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cf304e59fd4a9d2862071cddbe5d4c8a")).booleanValue();
        }
        MPExpandableHeaderBehavior headerBehaviour = getHeaderBehaviour(coordinatorLayout, view);
        if (headerBehaviour != null) {
            view.measure(i, View.MeasureSpec.makeMeasureSpec((int) (this.mpComponent.getYogaNode().t() - headerBehaviour.getMinPosition()), 1073741824));
            return true;
        }
        return false;
    }

    private MPExpandableHeaderBehavior getHeaderBehaviour(CoordinatorLayout coordinatorLayout, View view) {
        Object[] objArr = {coordinatorLayout, view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dea677ee645d8315176292779f63c90f", RobustBitConfig.DEFAULT_VALUE)) {
            return (MPExpandableHeaderBehavior) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dea677ee645d8315176292779f63c90f");
        }
        CoordinatorLayout.a a = a.a(a.a(coordinatorLayout, view));
        if (a instanceof MPExpandableHeaderBehavior) {
            return (MPExpandableHeaderBehavior) a;
        }
        return null;
    }

    public void setComponent(MPComponent mPComponent) {
        this.mpComponent = mPComponent;
    }
}
