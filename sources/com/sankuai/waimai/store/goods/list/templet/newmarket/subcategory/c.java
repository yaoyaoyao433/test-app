package com.sankuai.waimai.store.goods.list.templet.newmarket.subcategory;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends g {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.subcategory.g, com.sankuai.waimai.store.newwidgets.list.g
    public final void a(f fVar, int i) {
        Object[] objArr = {fVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c02e1153fd26c09f9250a39fa9342ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c02e1153fd26c09f9250a39fa9342ef");
            return;
        }
        super.a(fVar, i);
        if (fVar != null) {
            ((e) this.o).a(fVar.a, i, this.p);
        }
    }
}
