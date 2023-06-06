package com.sankuai.waimai.machpro.component.swiper_v2;

import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.component.swiper_v2.MPViewPager;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends MPViewPager.c {
    public static ChangeQuickRedirect a;
    MPViewPager.d b;
    private final LinearLayoutManager c;

    @Override // com.sankuai.waimai.machpro.component.swiper_v2.MPViewPager.c
    public final void a(int i) {
    }

    @Override // com.sankuai.waimai.machpro.component.swiper_v2.MPViewPager.c
    public final void b(int i) {
    }

    public e(LinearLayoutManager linearLayoutManager) {
        Object[] objArr = {linearLayoutManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78834c396267f0c86990fc577985e8cc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78834c396267f0c86990fc577985e8cc");
        } else {
            this.c = linearLayoutManager;
        }
    }

    @Override // com.sankuai.waimai.machpro.component.swiper_v2.MPViewPager.c
    public final void a(int i, float f, int i2) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3be2a5c2dcb1aa3557735ba7ea374bb1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3be2a5c2dcb1aa3557735ba7ea374bb1");
        } else if (this.b != null) {
            float f2 = -f;
            for (int i3 = 0; i3 < this.c.getChildCount(); i3++) {
                View childAt = this.c.getChildAt(i3);
                if (childAt != null) {
                    this.b.a(childAt, (this.c.getPosition(childAt) - i) + f2);
                }
            }
        }
    }
}
