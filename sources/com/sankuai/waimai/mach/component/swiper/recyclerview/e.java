package com.sankuai.waimai.mach.component.swiper.recyclerview;

import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static void a(RecyclerView recyclerView, ViewPagerLayoutManager viewPagerLayoutManager, int i) {
        Object[] objArr = {recyclerView, viewPagerLayoutManager, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d2cbcb2f85871b6e90ae80944105015b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d2cbcb2f85871b6e90ae80944105015b");
        } else if (recyclerView == null || viewPagerLayoutManager == null) {
        } else {
            int a2 = viewPagerLayoutManager.a(i);
            if (viewPagerLayoutManager.getOrientation() == 1) {
                recyclerView.smoothScrollBy(0, a2);
            } else {
                recyclerView.smoothScrollBy(a2, 0);
            }
        }
    }
}
