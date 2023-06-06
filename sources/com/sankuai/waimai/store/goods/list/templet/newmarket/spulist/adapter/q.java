package com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class q extends p {
    public static ChangeQuickRedirect a;
    private i f;

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.p, com.sankuai.waimai.store.newwidgets.list.g
    public final int a() {
        return R.layout.wm_sc_shop_content_goods_sort_and_title_item_layout;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.p, com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71259668fd8fe52a8451ac98e946f24d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71259668fd8fe52a8451ac98e946f24d");
            return;
        }
        this.f = new i(view.getContext(), (j) this.o);
        this.f.bindView(view);
        super.a(view);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.p, com.sankuai.waimai.store.newwidgets.list.g
    public final void a(k kVar, int i) {
        Object[] objArr = {kVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6aa7187cbfce9675ef2660fb2ed27f22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6aa7187cbfce9675ef2660fb2ed27f22");
            return;
        }
        super.a(kVar, i);
        i iVar = this.f;
        Object[] objArr2 = {kVar};
        ChangeQuickRedirect changeQuickRedirect2 = i.a;
        if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "9ee9d103af2ad9fd47426ded736595e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "9ee9d103af2ad9fd47426ded736595e3");
        } else if (kVar == null) {
        } else {
            if (i.b(kVar.c, kVar.b) && iVar.b.a(kVar.c)) {
                iVar.b(kVar.c);
            } else {
                iVar.c.setVisibility(8);
            }
        }
    }
}
