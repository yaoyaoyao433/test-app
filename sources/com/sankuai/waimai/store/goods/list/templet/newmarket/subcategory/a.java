package com.sankuai.waimai.store.goods.list.templet.newmarket.subcategory;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j;
import com.sankuai.waimai.store.newwidgets.list.k;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends d implements e, k {
    public static ChangeQuickRedirect a;

    public a(@NonNull Context context, @NonNull com.sankuai.waimai.store.goods.list.templet.newmarket.e eVar, @NonNull j jVar) {
        super(context, eVar, jVar);
        Object[] objArr = {context, eVar, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e589ae556a3f978d2820f300ef6d5ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e589ae556a3f978d2820f300ef6d5ee");
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.subcategory.d, com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6af789c3dd7083ccfb9d6a27f7aa3b15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6af789c3dd7083ccfb9d6a27f7aa3b15");
            return;
        }
        super.onViewCreated();
        if (this.e != null) {
            this.e.setVisibility(8);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.subcategory.d
    public final void a(GoodsPoiCategory goodsPoiCategory, List<GoodsPoiCategory> list) {
        Object[] objArr = {goodsPoiCategory, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6403c121a7cedd5bbc11df61e7876982", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6403c121a7cedd5bbc11df61e7876982");
            return;
        }
        if (com.sankuai.shangou.stone.util.a.c(list) <= 1) {
            this.d.b_(null);
            this.g.setVisibility(8);
            if (!com.sankuai.shangou.stone.util.a.b(list)) {
                this.h.a(goodsPoiCategory);
            } else {
                this.h.hide();
            }
        } else {
            this.d.b_(list);
            this.g.setVisibility(0);
            this.h.hide();
        }
        if (com.sankuai.shangou.stone.util.a.c(list) < 5) {
            this.e.setVisibility(8);
        } else {
            this.e.setVisibility(0);
            this.e.setOnClickListener(new View$OnClickListenerC1189a());
        }
        a(this.c.C());
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.goods.list.templet.newmarket.subcategory.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class View$OnClickListenerC1189a implements View.OnClickListener {
        public static ChangeQuickRedirect a;

        public View$OnClickListenerC1189a() {
            Object[] objArr = {a.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "674a552f712fe00756f5d4b15033371a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "674a552f712fe00756f5d4b15033371a");
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "161b51726607fa1ad08b30484f102fa2", 4611686018427387906L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "161b51726607fa1ad08b30484f102fa2");
                return;
            }
            a.this.c.D().a(true);
            a.this.c.v();
        }
    }
}
