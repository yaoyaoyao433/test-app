package com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends com.sankuai.waimai.store.newwidgets.list.g<com.sankuai.waimai.store.repository.model.g, com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a> {
    public static ChangeQuickRedirect a;
    private TextView b;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final int a() {
        return R.layout.wm_st_goods_list_layout_main_guess_title;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final /* synthetic */ void a(com.sankuai.waimai.store.repository.model.g gVar, int i) {
        com.sankuai.waimai.store.repository.model.g gVar2 = gVar;
        Object[] objArr = {gVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75d2c75e5decdc85f59ec48d1b9cd484", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75d2c75e5decdc85f59ec48d1b9cd484");
        } else {
            this.b.setText(gVar2.c);
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1f35a0692356dcde0e9f1b409bdeed5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1f35a0692356dcde0e9f1b409bdeed5");
        } else {
            this.b = (TextView) view.findViewById(R.id.wm_sc_tv_floor_title);
        }
    }
}
