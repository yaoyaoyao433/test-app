package com.sankuai.waimai.store.goods.list.templet.newmarket.subcategory;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.i;
import com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j;
import com.sankuai.waimai.store.newwidgets.list.SCRecyclerView;
import com.sankuai.waimai.store.newwidgets.list.k;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.view.a;
import com.sankuai.waimai.store.widgets.recycler.ExtendedLinearLayoutManager;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class d extends com.sankuai.waimai.store.base.b implements e, k {
    public static ChangeQuickRedirect b;
    @NonNull
    protected final com.sankuai.waimai.store.goods.list.templet.newmarket.e c;
    protected h d;
    protected ImageView e;
    protected SCRecyclerView f;
    protected View g;
    protected i h;

    public d(@NonNull Context context, @NonNull com.sankuai.waimai.store.goods.list.templet.newmarket.e eVar, @NonNull j jVar) {
        super(context);
        Object[] objArr = {context, eVar, jVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "188967f47ba9b7cb1d943e19bb0071f7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "188967f47ba9b7cb1d943e19bb0071f7");
            return;
        }
        this.c = eVar;
        this.h = new i(context, jVar);
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45cf9b5b5be80311e15962141868d3c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45cf9b5b5be80311e15962141868d3c8");
            return;
        }
        super.onViewCreated();
        this.g = findView(R.id.sub_category_layout);
        this.e = (ImageView) findView(R.id.tab_ic);
        this.e.setImageDrawable(com.sankuai.waimai.store.view.a.a(this.e.getContext(), R.dimen.wm_sc_common_dimen_11, R.dimen.wm_sc_common_dimen_6, R.color.wm_sg_color_999794, R.dimen.wm_sc_common_dimen_1_half, a.EnumC1338a.DOWN));
        this.f = (SCRecyclerView) findView(R.id.tab_lv);
        this.f.setLayoutManager(new ExtendedLinearLayoutManager(getContext(), 0, false));
        this.f.setNestedScrollingEnabled(false);
        this.f.setOnItemClickListener(this);
        this.d = new h(this);
        this.f.setAdapter((com.sankuai.waimai.store.newwidgets.list.f<?, ?>) this.d);
        this.h.bindView(this.mView);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.subcategory.e
    public final boolean a(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e444706cf707d79aaae0559197775219", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e444706cf707d79aaae0559197775219")).booleanValue();
        }
        return ((fVar == null || fVar.b != 0) ? 0 : this.c.a(fVar.a)) > 0;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.subcategory.e
    public final void a(int i, View view) {
        Object[] objArr = {Integer.valueOf(i), view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a533595c82722cbd9aaa4d850998213e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a533595c82722cbd9aaa4d850998213e");
            return;
        }
        GoodsPoiCategory h = this.d.h(i);
        if (h == null) {
            return;
        }
        if (h.type == 1) {
            this.c.v();
            return;
        }
        this.c.D().a(h, i, 2);
        this.c.y();
        this.c.b(h);
        this.c.e(false);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.subcategory.e
    public final void a(GoodsPoiCategory goodsPoiCategory, int i, View view) {
        Object[] objArr = {goodsPoiCategory, Integer.valueOf(i), view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d629d36bbd0ec23b0144525c50ab6eda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d629d36bbd0ec23b0144525c50ab6eda");
        } else {
            this.c.D().a(goodsPoiCategory, i, view, 2);
        }
    }

    public void a(GoodsPoiCategory goodsPoiCategory, List<GoodsPoiCategory> list) {
        Object[] objArr = {goodsPoiCategory, list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c530a6b4bd3497a1b5b466c6fc53cb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c530a6b4bd3497a1b5b466c6fc53cb0");
            return;
        }
        if (com.sankuai.shangou.stone.util.a.c(list) <= 1) {
            this.d.b_(null);
            this.g.setVisibility(8);
            this.h.a(goodsPoiCategory);
        } else {
            this.d.b_(list);
            this.g.setVisibility(0);
            this.h.hide();
        }
        if (com.sankuai.shangou.stone.util.a.c(list) < 5) {
            this.e.setVisibility(8);
        } else {
            this.e.setVisibility(0);
            this.e.setOnClickListener(new a());
        }
        a(this.c.C());
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bd86ca74aca53bfe09180e69258e74e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bd86ca74aca53bfe09180e69258e74e");
        } else if (i < 0) {
        } else {
            try {
                ((ExtendedLinearLayoutManager) this.f.getLayoutManager()).scrollToPositionWithOffset(i, 0);
            } catch (Exception e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
            }
        }
    }

    public final int a(GoodsPoiCategory goodsPoiCategory, GoodsPoiCategory goodsPoiCategory2) {
        Object[] objArr = {goodsPoiCategory, goodsPoiCategory2};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e73cade7e4326e365d8177232c4e5f14", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e73cade7e4326e365d8177232c4e5f14")).intValue() : this.h.a(goodsPoiCategory, goodsPoiCategory2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect a;

        private a() {
            Object[] objArr = {d.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3641cfb9dab4251e42d4cdbdc1ab1c50", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3641cfb9dab4251e42d4cdbdc1ab1c50");
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "912a94fc56a73ad0aea9d1395b5e3864", 4611686018427387906L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "912a94fc56a73ad0aea9d1395b5e3864");
                return;
            }
            d.this.c.D().a(true);
            d.this.c.v();
        }
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e90e52d3716877b8a7697f37dd4f9e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e90e52d3716877b8a7697f37dd4f9e7");
            return;
        }
        this.d.notifyDataSetChanged();
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cadfa53e220ae7de6af626e7efc0b94f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cadfa53e220ae7de6af626e7efc0b94f");
        } else if (i >= 0) {
            try {
                ((ExtendedLinearLayoutManager) this.f.getLayoutManager()).b(i);
            } catch (Exception e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
            }
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.k
    public final void a(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bea95f3d8a32c251600003663b3d51f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bea95f3d8a32c251600003663b3d51f9");
            return;
        }
        GoodsPoiCategory h = this.d.h(i);
        if (h != null) {
            this.c.D().a(h, i, 1);
            this.c.b(h);
            this.c.e(false);
        }
    }
}
