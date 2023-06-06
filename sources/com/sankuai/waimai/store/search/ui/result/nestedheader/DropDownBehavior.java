package com.sankuai.waimai.store.search.ui.result.nestedheader;

import android.content.Context;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DropDownBehavior extends CoordinatorLayout.a {
    public static ChangeQuickRedirect a;

    public DropDownBehavior() {
    }

    public DropDownBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76aac2831b717aaf6b0754a9ac71397f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76aac2831b717aaf6b0754a9ac71397f");
        }
    }

    @Override // android.support.design.widget.CoordinatorLayout.a
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof AppBarLayout;
    }

    @Override // android.support.design.widget.CoordinatorLayout.a
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Object[] objArr = {coordinatorLayout, view, view2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40ab9bcb714fb558273a539e4be12632", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40ab9bcb714fb558273a539e4be12632")).booleanValue();
        }
        float y = view2.getY();
        float height = view.getHeight();
        float height2 = view2.getHeight() + y;
        if (y > 0.0f) {
            view.setAlpha(0.0f);
            view.setY(-height);
            return true;
        }
        float f = 2.0f * height;
        if (height2 >= f) {
            view.setAlpha(0.0f);
            view.setY(-height);
        } else if (height2 < f && height2 >= height) {
            view.setY(0.0f);
            view.setAlpha(1.0f - ((height2 - height) / height));
            view.setZ(20.0f);
        } else if (height2 < height) {
            view.setY(0.0f);
            view.setAlpha(1.0f);
            view.setZ(20.0f);
        }
        return true;
    }
}
