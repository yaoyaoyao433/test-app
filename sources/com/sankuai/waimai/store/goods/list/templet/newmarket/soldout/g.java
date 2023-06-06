package com.sankuai.waimai.store.goods.list.templet.newmarket.soldout;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.cell.view.InnerCellView;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.util.h;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g extends com.sankuai.waimai.store.newwidgets.list.g<GoodsSpu, e> implements com.sankuai.waimai.store.cell.core.b {
    public static ChangeQuickRedirect a;
    private a b;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.waimai.store.cell.core.b
    public final void a(GoodsSpu goodsSpu, int i) {
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void a(GoodsSpu goodsSpu, View view, h hVar, int i) {
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void b(GoodsSpu goodsSpu, int i) {
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void b(GoodsSpu goodsSpu, h hVar, int i) {
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void c(GoodsSpu goodsSpu, int i) {
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final /* synthetic */ void a(GoodsSpu goodsSpu, int i) {
        GoodsSpu goodsSpu2 = goodsSpu;
        Object[] objArr = {goodsSpu2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7010b1abd53bcf402153f7b4e6d45a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7010b1abd53bcf402153f7b4e6d45a3");
        } else if (goodsSpu2 == null) {
        } else {
            ((e) this.o).a(goodsSpu2, i, this.b);
            this.b.a(goodsSpu2, i);
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        this.b = (a) view;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3798da6af9b599ef84edf26fb6d0c660", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3798da6af9b599ef84edf26fb6d0c660");
        }
        a aVar = new a(viewGroup.getContext());
        aVar.setPoiHelper(((e) this.o).g());
        aVar.setActionCallback(this);
        return aVar;
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void a(GoodsSpu goodsSpu, h hVar, int i) {
        Object[] objArr = {goodsSpu, hVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81258f6c9dd114bd5d1003cd103306f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81258f6c9dd114bd5d1003cd103306f2");
            return;
        }
        ((e) this.o).b(goodsSpu, i);
        com.sankuai.waimai.store.platform.domain.manager.goods.a.a().e = ((e) this.o).f();
        com.sankuai.waimai.store.router.g.a(this.b.getContext(), goodsSpu, ((e) this.o).g().b, hVar);
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void a(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41afb65b9f5f47b7ab632b52843a4d5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41afb65b9f5f47b7ab632b52843a4d5c");
        } else if (this.b.getContext() instanceof SCBaseActivity) {
            ((e) this.o).a(goodsSpu, this.b.I());
            com.sankuai.waimai.store.goods.subscribe.a.a().a((SCBaseActivity) this.b.getContext(), ((e) this.o).g().f(), ((e) this.o).g().h(), goodsSpu, (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.getSkuList(), 0), null);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static final class a extends InnerCellView {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.store.cell.view.InnerCellView, com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final int getLayoutId() {
            return R.layout.wm_st_poi_market_sold_out_item;
        }

        public a(@NonNull Context context) {
            super(context);
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc5f3595761279f5e21ce4a3f13c89e9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc5f3595761279f5e21ce4a3f13c89e9");
            }
        }

        public final int I() {
            return this.ag;
        }
    }
}
