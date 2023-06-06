package com.sankuai.waimai.mach.component.swiper.recyclerview;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class d extends a {
    public static ChangeQuickRedirect e;

    @Override // com.sankuai.waimai.mach.component.swiper.recyclerview.a, android.support.v7.widget.RecyclerView.i
    public boolean onFling(int i, int i2) {
        int i3;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "335e6891f8d686c04567e25415a677c9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "335e6891f8d686c04567e25415a677c9")).booleanValue();
        }
        ViewPagerLayoutManager viewPagerLayoutManager = (ViewPagerLayoutManager) this.b.getLayoutManager();
        if (viewPagerLayoutManager == null || this.b.getAdapter() == null) {
            return false;
        }
        if (viewPagerLayoutManager.n || !(viewPagerLayoutManager.i == viewPagerLayoutManager.d() || viewPagerLayoutManager.i == viewPagerLayoutManager.e())) {
            int minFlingVelocity = this.b.getMinFlingVelocity();
            this.c.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            if (viewPagerLayoutManager.e == 1 && Math.abs(i2) > minFlingVelocity) {
                int g = viewPagerLayoutManager.g();
                i3 = ((float) this.c.getFinalY()) * viewPagerLayoutManager.b() > viewPagerLayoutManager.l ? 1 : 0;
                e.a(this.b, viewPagerLayoutManager, viewPagerLayoutManager.getReverseLayout() ? (-g) - i3 : g + i3);
                return true;
            } else if (viewPagerLayoutManager.e != 0 || Math.abs(i) <= minFlingVelocity) {
                return true;
            } else {
                int g2 = viewPagerLayoutManager.g();
                i3 = ((float) this.c.getFinalX()) * viewPagerLayoutManager.b() > viewPagerLayoutManager.l ? 1 : 0;
                if (i < 0) {
                    i3 = -1;
                }
                e.a(this.b, viewPagerLayoutManager, viewPagerLayoutManager.getReverseLayout() ? (-g2) - i3 : g2 + i3);
                return true;
            }
        }
        return false;
    }
}
