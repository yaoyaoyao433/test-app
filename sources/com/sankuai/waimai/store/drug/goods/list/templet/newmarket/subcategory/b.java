package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.subcategory;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends f {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.subcategory.f, com.sankuai.waimai.store.newwidgets.list.g
    public final void a(e eVar, int i) {
        Object[] objArr = {eVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f82f7a824c199451cd8253ecd20a56f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f82f7a824c199451cd8253ecd20a56f3");
            return;
        }
        super.a(eVar, i);
        if (eVar != null) {
            ((d) this.o).a(eVar.a, i, this.p);
        }
    }
}
