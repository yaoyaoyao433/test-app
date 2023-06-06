package com.sankuai.waimai.store.drug.goods.list.delegate.impl;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.drug.goods.list.controller.DrugShopStatusViewModel;
import com.sankuai.waimai.store.expose.v2.entity.c;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class i implements c.a {
    public static ChangeQuickRedirect a;
    private final c b;

    public i(c cVar) {
        this.b = cVar;
    }

    @Override // com.sankuai.waimai.store.expose.v2.entity.c.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f07684b1351f39ad3053356b9974ade", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f07684b1351f39ad3053356b9974ade");
            return;
        }
        c cVar = this.b;
        Object[] objArr2 = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4be98c514a99b4fbedf8e9c426656e27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4be98c514a99b4fbedf8e9c426656e27");
        } else {
            DrugShopStatusViewModel.b(cVar.x.h(), 2, cVar.y.d());
        }
    }
}
