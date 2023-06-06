package com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends com.sankuai.waimai.store.newwidgets.list.g<com.sankuai.waimai.store.repository.model.g, com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a> {
    public static ChangeQuickRedirect a;
    private View b;
    private View c;
    private View d;
    private Drawable e;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final int a() {
        return R.layout.wm_st_goods_list_layout_main_blank_item;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final /* synthetic */ void a(com.sankuai.waimai.store.repository.model.g gVar, int i) {
        com.sankuai.waimai.store.repository.model.g gVar2 = gVar;
        Object[] objArr = {gVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "913483ef9dab378899515060bc76f0d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "913483ef9dab378899515060bc76f0d7");
        } else if (gVar2.f == 1) {
            this.b.setVisibility(0);
            this.c.setVisibility(8);
        } else if (gVar2.f == 2) {
            this.b.setVisibility(8);
            this.c.setVisibility(0);
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae38f9bf93c48ddb214087448bed74b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae38f9bf93c48ddb214087448bed74b1");
            return;
        }
        this.b = view.findViewById(R.id.white_view);
        this.c = view.findViewById(R.id.ll_gray_view);
        this.d = view.findViewById(R.id.v_blank_item);
        if (this.e == null) {
            this.e = new e.a().c(com.sankuai.waimai.store.util.b.b(this.d.getContext(), R.color.wm_common_white)).a(0.0f, 0.0f, com.sankuai.shangou.stone.util.h.a(this.d.getContext(), 12.0f), com.sankuai.shangou.stone.util.h.a(this.d.getContext(), 12.0f)).a();
        }
        this.d.setBackground(this.e);
    }
}
