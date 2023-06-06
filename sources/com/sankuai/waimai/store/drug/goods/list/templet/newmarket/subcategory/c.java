package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.subcategory;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h;
import com.sankuai.waimai.store.newwidgets.list.SCRecyclerView;
import com.sankuai.waimai.store.newwidgets.list.k;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.view.a;
import com.sankuai.waimai.store.widgets.recycler.ExtendedLinearLayoutManager;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.store.base.b implements d, k {
    public static ChangeQuickRedirect a;
    @NonNull
    protected final h b;
    protected g c;
    protected ImageView d;
    protected SCRecyclerView e;
    protected View f;
    protected com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.c g;

    public c(@NonNull Context context, @NonNull h hVar, @NonNull com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.d dVar) {
        super(context);
        Object[] objArr = {context, hVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed1bd7b463c3e26e7982a1c1d10b0789", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed1bd7b463c3e26e7982a1c1d10b0789");
            return;
        }
        this.b = hVar;
        this.g = new com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.c(context, dVar);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5f8ff2731dc3b613cd55e5f067bd00b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5f8ff2731dc3b613cd55e5f067bd00b");
            return;
        }
        super.onViewCreated();
        this.f = findView(R.id.sub_category_layout);
        this.d = (ImageView) findView(R.id.tab_ic);
        this.d.setImageDrawable(com.sankuai.waimai.store.view.a.a(this.d.getContext(), R.dimen.wm_sc_common_dimen_11, R.dimen.wm_sc_common_dimen_6, R.color.wm_sg_color_999794, R.dimen.wm_sc_common_dimen_1_half, a.EnumC1338a.DOWN));
        this.e = (SCRecyclerView) findView(R.id.tab_lv);
        this.e.setLayoutManager(new ExtendedLinearLayoutManager(getContext(), 0, false));
        this.e.setNestedScrollingEnabled(false);
        this.e.setOnItemClickListener(this);
        this.c = new g(this);
        this.e.setAdapter((com.sankuai.waimai.store.newwidgets.list.f<?, ?>) this.c);
        this.g.bindView(this.mView);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.subcategory.d
    public final boolean a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd8960cfbeb4af180c1f541fb6e5338e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd8960cfbeb4af180c1f541fb6e5338e")).booleanValue();
        }
        return ((eVar == null || eVar.b != 0) ? 0 : this.b.a(eVar.a)) > 0;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.subcategory.d
    public final void a(int i, View view) {
        Object[] objArr = {Integer.valueOf(i), view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e402bd15eb82cce0bc8339f70753c66c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e402bd15eb82cce0bc8339f70753c66c");
            return;
        }
        GoodsPoiCategory h = this.c.h(i);
        if (h == null) {
            return;
        }
        if (h.type == 1) {
            this.b.o();
            return;
        }
        this.b.w().a(h, i, 2);
        this.b.r();
        this.b.b(h);
        this.b.f(false);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.subcategory.d
    public final void a(GoodsPoiCategory goodsPoiCategory, int i, View view) {
        Object[] objArr = {goodsPoiCategory, Integer.valueOf(i), view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "007907371a77b7edfa03e2ce02e1fcd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "007907371a77b7edfa03e2ce02e1fcd1");
        } else {
            this.b.w().a(goodsPoiCategory, i, view, 2);
        }
    }

    public final void a(GoodsPoiCategory goodsPoiCategory, List<GoodsPoiCategory> list) {
        Object[] objArr = {goodsPoiCategory, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c5b0e7961fd64646e15c51960145ab9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c5b0e7961fd64646e15c51960145ab9");
            return;
        }
        if (com.sankuai.shangou.stone.util.a.c(list) <= 1) {
            this.c.b_(null);
            this.f.setVisibility(8);
            com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.c cVar = this.g;
            Object[] objArr2 = {goodsPoiCategory};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "1d4b2668c40cff52f7df1b6af89a2d7b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "1d4b2668c40cff52f7df1b6af89a2d7b");
            } else {
                cVar.a(goodsPoiCategory);
                cVar.d.setVisibility(8);
            }
        } else {
            this.c.b_(list);
            this.f.setVisibility(0);
            this.g.hide();
        }
        if (com.sankuai.shangou.stone.util.a.c(list) < 5) {
            this.d.setVisibility(8);
        } else {
            this.d.setVisibility(0);
            this.d.setOnClickListener(new a());
        }
        int v = this.b.v();
        Object[] objArr3 = {Integer.valueOf(v)};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1bf8fc9989dbaca4f17630404b017e8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1bf8fc9989dbaca4f17630404b017e8d");
        } else if (v >= 0) {
            try {
                ((ExtendedLinearLayoutManager) this.e.getLayoutManager()).scrollToPositionWithOffset(v, 0);
            } catch (Exception e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
            }
        }
    }

    public final int a(GoodsPoiCategory goodsPoiCategory, GoodsPoiCategory goodsPoiCategory2) {
        Object[] objArr = {goodsPoiCategory, goodsPoiCategory2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e412c2dc539018423f2deba964ddc40", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e412c2dc539018423f2deba964ddc40")).intValue() : this.g.a(goodsPoiCategory, goodsPoiCategory2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect a;

        private a() {
            Object[] objArr = {c.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76abe90a2f31c46bb60a66a4ca41305f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76abe90a2f31c46bb60a66a4ca41305f");
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42661c3322253a52fa03c8f0a8aa854a", 4611686018427387906L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42661c3322253a52fa03c8f0a8aa854a");
                return;
            }
            c.this.b.w().a(true);
            c.this.b.o();
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34ab451d0d2d92528aad496b611f6ade", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34ab451d0d2d92528aad496b611f6ade");
            return;
        }
        this.c.notifyDataSetChanged();
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "227f8e00d5261d7d0eac5ea7b8550ef0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "227f8e00d5261d7d0eac5ea7b8550ef0");
        } else if (i >= 0) {
            try {
                ((ExtendedLinearLayoutManager) this.e.getLayoutManager()).b(i);
            } catch (Exception e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
            }
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.k
    public final void a(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "944c26dfd98e3df805e36d19da661258", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "944c26dfd98e3df805e36d19da661258");
            return;
        }
        GoodsPoiCategory h = this.c.h(i);
        if (h != null) {
            this.b.w().a(h, i, 1);
            this.b.b(h);
            this.b.f(false);
        }
    }
}
