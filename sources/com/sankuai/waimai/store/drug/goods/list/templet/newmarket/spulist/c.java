package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.d;
import com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.i;
import com.sankuai.waimai.store.newwidgets.list.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends e<d> {
    public static ChangeQuickRedirect a;
    private i c;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final int a() {
        return R.layout.wm_drug_shop_content_goods_sort_item_layout;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60c5b744579395da8c8842f7dcbd0642", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60c5b744579395da8c8842f7dcbd0642");
            return;
        }
        this.c = new i();
        this.c.a((i) this.o);
        this.c.a(view);
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.e
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b06cfadfaa4f9bb667c6fa22e5e8dae9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b06cfadfaa4f9bb667c6fa22e5e8dae9");
        } else {
            this.c.a(((d) this.o).b(i), i);
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.e
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0f6845dbbe763fe9e25d464e4eba71b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0f6845dbbe763fe9e25d464e4eba71b");
            return;
        }
        super.b();
        i iVar = this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = i.a;
        if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "285c6d9874d8a432e8206cca6398bed6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "285c6d9874d8a432e8206cca6398bed6");
        } else if (iVar.b != null) {
            iVar.b.onDestroy();
        }
    }
}
