package com.sankuai.waimai.store.goods.list.templet.newmarket.spulist;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.store.newwidgets.list.e<j> {
    public static ChangeQuickRedirect a;
    private b c;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final int a() {
        return R.layout.wm_sc_aggregation_pinned_goods_sort_and_title_item_layout;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b585749ce0685f76cff86041ae8b8db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b585749ce0685f76cff86041ae8b8db");
            return;
        }
        this.c = new b(((j) this.o).getContext(), (j) this.o);
        this.c.bindView(view);
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.e
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ab471cbd5e79f92823842cf956b11f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ab471cbd5e79f92823842cf956b11f8");
        } else {
            this.c.a(((j) this.o).b(i), i);
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.e
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b89589f4c01acd9727f730d561ed745", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b89589f4c01acd9727f730d561ed745");
            return;
        }
        super.b();
        if (this.c != null) {
            this.c.onDestroy();
        }
    }
}
