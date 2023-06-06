package com.sankuai.waimai.platform.widget.coordinator;

import android.content.Context;
import android.support.annotation.Keep;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class ExpandableScrollingBehavior extends CoordinatorLayout.a<View> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public ExpandableScrollingBehavior() {
    }

    public ExpandableScrollingBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4aa7a2113e7b6a6daa1704f41e701a22", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4aa7a2113e7b6a6daa1704f41e701a22");
        }
    }

    @Override // android.support.design.widget.CoordinatorLayout.a
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Object[] objArr = {coordinatorLayout, view, view2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ff76d4fe78f4cd379f777720015a285", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ff76d4fe78f4cd379f777720015a285")).booleanValue() : a.a(view2) instanceof ExpandableHeaderBehavior;
    }

    @Override // android.support.design.widget.CoordinatorLayout.a
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        Object[] objArr = {coordinatorLayout, view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7581fb5984a8004d7d82ef3eed0fc03f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7581fb5984a8004d7d82ef3eed0fc03f")).booleanValue();
        }
        ExpandableHeaderBehavior headerBehaviour = getHeaderBehaviour(coordinatorLayout, view);
        if (headerBehaviour != null) {
            int currentPosition = headerBehaviour.getCurrentPosition();
            view.layout(0, currentPosition, view.getMeasuredWidth(), view.getMeasuredHeight() + currentPosition);
            return true;
        }
        return super.onLayoutChild(coordinatorLayout, view, i);
    }

    @Override // android.support.design.widget.CoordinatorLayout.a
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {coordinatorLayout, view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f5dfec336e384d55d3b260f462b3911", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f5dfec336e384d55d3b260f462b3911")).booleanValue();
        }
        ExpandableHeaderBehavior headerBehaviour = getHeaderBehaviour(coordinatorLayout, view);
        if (headerBehaviour != null) {
            view.measure(i, View.MeasureSpec.makeMeasureSpec(coordinatorLayout.getMeasuredHeight() - headerBehaviour.getMinPosition(), 1073741824));
            return true;
        }
        return super.onMeasureChild(coordinatorLayout, view, i, i2, i3, i4);
    }

    private ExpandableHeaderBehavior getHeaderBehaviour(CoordinatorLayout coordinatorLayout, View view) {
        Object[] objArr = {coordinatorLayout, view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "930480e19ba341620d7b4724d64be489", RobustBitConfig.DEFAULT_VALUE)) {
            return (ExpandableHeaderBehavior) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "930480e19ba341620d7b4724d64be489");
        }
        CoordinatorLayout.a a = a.a(a.a(coordinatorLayout, view));
        if (a instanceof ExpandableHeaderBehavior) {
            return (ExpandableHeaderBehavior) a;
        }
        return null;
    }
}
