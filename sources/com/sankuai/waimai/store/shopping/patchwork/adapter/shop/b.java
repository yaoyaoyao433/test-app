package com.sankuai.waimai.store.shopping.patchwork.adapter.shop;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.shopping.patchwork.adapter.f;
import com.sankuai.waimai.store.util.z;
import com.sankuai.waimai.store.widgets.recycler.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.shopping.patchwork.adapter.b<c> {
    public static ChangeQuickRedirect e;

    public b(@NonNull f fVar) {
        super(fVar);
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8a38e191618016f201bdfdb9a4a7756", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8a38e191618016f201bdfdb9a4a7756");
        }
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final e a(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "658a5e91ee2ecfee19d79878b41b2793", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "658a5e91ee2ecfee19d79878b41b2793") : new c(z.a(viewGroup.getContext(), R.layout.wm_st_shopcart_patchwork_price_range_item, viewGroup, false), this.b, this.c);
    }
}
