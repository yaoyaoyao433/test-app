package com.sankuai.waimai.business.search.ui.result.behavior;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SearchStickyContainerBehavior extends CoordinatorLayout.a {
    public static ChangeQuickRedirect a;
    public a b;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(float f);
    }

    public SearchStickyContainerBehavior() {
    }

    public SearchStickyContainerBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e013e6904ce1149d5740889deda70a3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e013e6904ce1149d5740889deda70a3");
        }
    }

    @Override // android.support.design.widget.CoordinatorLayout.a
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Object[] objArr = {coordinatorLayout, view, view2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6a7081a280e5e9f414f945c0278a782", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6a7081a280e5e9f414f945c0278a782")).booleanValue();
        }
        if (view2.getVisibility() == 8) {
            view.setY(0.0f);
        }
        return view2 instanceof LinearLayout;
    }

    @Override // android.support.design.widget.CoordinatorLayout.a
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Object[] objArr = {coordinatorLayout, view, view2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00a5bfa33f7cd48eb1edba98d3d3d2dc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00a5bfa33f7cd48eb1edba98d3d3d2dc")).booleanValue();
        }
        float y = view2.getY();
        if (y > 0.0f) {
            view2.setY(0.0f);
            return true;
        }
        float height = y + view2.getHeight();
        if (height < 0.0f) {
            height = 0.0f;
        }
        if (this.b != null) {
            this.b.a(height / view2.getHeight());
        }
        view.setY(height);
        return true;
    }
}
