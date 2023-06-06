package com.sankuai.waimai.machpro.component.swiper_v2;

import android.support.annotation.NonNull;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.component.swiper_v2.MPViewPager;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements MPViewPager.d {
    public static ChangeQuickRedirect a;
    private final List<MPViewPager.d> b;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a50d5b2241d6cd3880f4dccec484b8f1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a50d5b2241d6cd3880f4dccec484b8f1");
        } else {
            this.b = new ArrayList();
        }
    }

    public final void a(@NonNull MPViewPager.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "241821824a7670fe263d98f952f74a05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "241821824a7670fe263d98f952f74a05");
        } else {
            this.b.add(dVar);
        }
    }

    @Override // com.sankuai.waimai.machpro.component.swiper_v2.MPViewPager.d
    public final void a(@NonNull View view, float f) {
        Object[] objArr = {view, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "884930055d0e59d6f83f5d456792ff70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "884930055d0e59d6f83f5d456792ff70");
            return;
        }
        for (MPViewPager.d dVar : this.b) {
            dVar.a(view, f);
        }
    }
}
