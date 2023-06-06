package com.sankuai.waimai.business.restaurant.poicontainer.machpro.nested;

import android.support.annotation.Keep;
import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.platform.widget.coordinator.ExpandableHeaderBehavior;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class MPExpandableHeaderBehavior extends ExpandableHeaderBehavior {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.widget.coordinator.ExpandableHeaderBehavior
    public int scrollByWithTarget(int i, CoordinatorLayout coordinatorLayout, View view, View view2) {
        Object[] objArr = {Integer.valueOf(i), coordinatorLayout, view, view2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49280fff28e8c9df7171734ef782693b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49280fff28e8c9df7171734ef782693b")).intValue();
        }
        if (i == 0 || coordinatorLayout == null || view == null || view2 == null) {
            return 0;
        }
        return performScrollBy(i, coordinatorLayout, view, ah.a(coordinatorLayout, view2, 15));
    }
}
