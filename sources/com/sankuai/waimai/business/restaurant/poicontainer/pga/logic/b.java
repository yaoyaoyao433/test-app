package com.sankuai.waimai.business.restaurant.poicontainer.pga.logic;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.meituan.android.cube.pga.block.b<c, com.sankuai.waimai.business.restaurant.poicontainer.pga.b> {
    public static ChangeQuickRedirect f;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ c L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c63da5bb0b4ba300c9c54b103806a1f", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c63da5bb0b4ba300c9c54b103806a1f") : new c(F());
    }

    public b(com.sankuai.waimai.business.restaurant.poicontainer.pga.b bVar) {
        super(bVar);
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "925af8932634b26dddc9c5a803030b99", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "925af8932634b26dddc9c5a803030b99");
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e85655b15481da879fc7daa90da89313", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e85655b15481da879fc7daa90da89313");
            return;
        }
        super.s();
        ((c) this.n).p = F().u.a().b;
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void c(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1adc16aa9640712ac333d8c7cac833e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1adc16aa9640712ac333d8c7cac833e0");
        } else {
            super.c(obj);
        }
    }
}
