package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.soldout;

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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d707b46d53e2887494204efab85e56b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d707b46d53e2887494204efab85e56b9");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08360fb2a61190ccd756560ce8d35891", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08360fb2a61190ccd756560ce8d35891");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c198dffcbfb02628a2929330ff20cf14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c198dffcbfb02628a2929330ff20cf14");
            return;
        }
        ((e) this.o).b(goodsSpu, i);
        com.sankuai.waimai.store.platform.domain.manager.goods.a.a().e = ((e) this.o).f();
        com.sankuai.waimai.store.drug.util.d.a(this.b.getContext(), goodsSpu, ((e) this.o).g().b, hVar);
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void a(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0820226cb1233074e6b0e1d3e18cd681", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0820226cb1233074e6b0e1d3e18cd681");
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
            return R.layout.wm_drug_poi_market_sold_out_item;
        }

        public a(@NonNull Context context) {
            super(context);
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42e012a5ef8af6e3a6b6f3fc30b139f7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42e012a5ef8af6e3a6b6f3fc30b139f7");
            }
        }

        public final int I() {
            return this.ag;
        }
    }
}
