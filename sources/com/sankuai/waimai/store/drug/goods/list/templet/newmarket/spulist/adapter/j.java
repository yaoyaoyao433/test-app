package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class j extends i {
    public static ChangeQuickRedirect c;
    private c d;

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.i, com.sankuai.waimai.store.newwidgets.list.g
    public final int a() {
        return R.layout.wm_drug_shop_content_goods_sort_and_title_item_layout;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.i, com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b26df5e220a2f8dc75e2ed66718962f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b26df5e220a2f8dc75e2ed66718962f");
            return;
        }
        this.d = new c(view.getContext(), (d) this.o);
        this.d.bindView(view);
        super.a(view);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.i, com.sankuai.waimai.store.newwidgets.list.g
    public final void a(e eVar, int i) {
        Object[] objArr = {eVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb035250d8bc90506d01a5e5768a84c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb035250d8bc90506d01a5e5768a84c3");
            return;
        }
        super.a(eVar, i);
        c cVar = this.d;
        Object[] objArr2 = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "72a0a239509eff7ffcfc3fddb488fe9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "72a0a239509eff7ffcfc3fddb488fe9c");
        } else if (eVar == null) {
        } else {
            if (c.b(eVar.c, eVar.b) && cVar.b.a(eVar.c)) {
                cVar.a(eVar.c);
            } else {
                cVar.c.setVisibility(8);
            }
        }
    }
}
