package com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.GridLayoutManager;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newwidgets.list.SCRecyclerView;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.widgets.recycler.l;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h extends com.sankuai.waimai.store.newwidgets.list.g<com.sankuai.waimai.store.repository.model.g, com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a> implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private SCRecyclerView b;
    private com.sankuai.waimai.store.goods.list.viewblocks.experimental.category.a c;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final int a() {
        return R.layout.wm_sc_physical_category_two_lines;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9390083471562cd3651c73f22f414e9c", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9390083471562cd3651c73f22f414e9c");
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final /* synthetic */ void a(com.sankuai.waimai.store.repository.model.g gVar, int i) {
        com.sankuai.waimai.store.repository.model.g gVar2 = gVar;
        Object[] objArr = {gVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54becdb31eee0da46b1ec24015484f89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54becdb31eee0da46b1ec24015484f89");
            return;
        }
        try {
            if (this.o != 0) {
                com.sankuai.waimai.store.manager.judas.b.b(((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).k(), "b_waimai_nlueeobg_mv").a();
            }
        } catch (Throwable unused) {
        }
        List<RestMenuResponse.NavigateItem> list = gVar2.k;
        com.sankuai.waimai.store.goods.list.viewblocks.experimental.category.a aVar = this.c;
        Object[] objArr2 = {2, (byte) 1, list};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.goods.list.viewblocks.experimental.category.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "4f16240d2b90c0819801f7b8227cb9ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "4f16240d2b90c0819801f7b8227cb9ab");
            return;
        }
        aVar.f = true;
        Object[] objArr3 = {2, list};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.goods.list.viewblocks.experimental.category.a.a;
        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "199be568a3989324c3c67b5147b799f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "199be568a3989324c3c67b5147b799f2");
            return;
        }
        aVar.e = 2;
        aVar.d.clear();
        if (!com.sankuai.shangou.stone.util.a.b(list)) {
            aVar.d.addAll(list);
        }
        aVar.m();
    }

    public h(com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dc7dc52cb4fd87b9434edc4ec9b3339", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dc7dc52cb4fd87b9434edc4ec9b3339");
            return;
        }
        this.o = aVar;
        this.c = new com.sankuai.waimai.store.goods.list.viewblocks.experimental.category.a((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o);
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12810c6ae80342ee8d6e5eaa0a6e3fa7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12810c6ae80342ee8d6e5eaa0a6e3fa7");
            return;
        }
        this.b = (SCRecyclerView) view.findViewById(R.id.rl_phy_tags);
        this.b.setLayoutManager(new GridLayoutManager(((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).j(), 4));
        this.b.setAdapter(new l(this.c));
    }
}
