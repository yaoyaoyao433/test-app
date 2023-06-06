package com.sankuai.waimai.store.goods.list.templet.drugselfbusiness.index;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.store.goods.list.delegate.e;
import com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.d;
import com.sankuai.waimai.store.platform.domain.core.shop.PoiCategory;
import com.sankuai.waimai.store.platform.shop.interfaces.a;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends d {
    public static ChangeQuickRedirect a;
    private RunnableC1184a i;
    private int j;

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.d
    public final int b() {
        return R.layout.wm_sc_goods_list_market_drug_self_business_content_layout;
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.d
    public final int c() {
        return 3;
    }

    public a(@NonNull e eVar, a.InterfaceC1266a interfaceC1266a) {
        super(eVar, interfaceC1266a);
        Object[] objArr = {eVar, interfaceC1266a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad9104122036936038e8c93c24ac6ff5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad9104122036936038e8c93c24ac6ff5");
        } else {
            this.j = -1;
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.d
    public final com.sankuai.waimai.store.goods.list.viewblocks.header.b a(@NonNull com.sankuai.waimai.store.goods.list.delegate.d dVar, ViewGroup viewGroup) {
        Object[] objArr = {dVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5ea9a152a3310ad84ae2130428039c5", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.goods.list.viewblocks.header.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5ea9a152a3310ad84ae2130428039c5") : new b(dVar, viewGroup);
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.d
    public final com.sankuai.waimai.store.widgets.drawable.a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e21a275a2c9cfb841286d047760c1335", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.widgets.drawable.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e21a275a2c9cfb841286d047760c1335");
        }
        com.sankuai.waimai.store.widgets.drawable.a aVar = new com.sankuai.waimai.store.widgets.drawable.a();
        aVar.b = ViewCompat.MEASURED_SIZE_MASK;
        aVar.e = h.a(this.mContext, 60.0f);
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
        if (r12.j > r13) goto L17;
     */
    @Override // com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.d, com.sankuai.waimai.store.goods.list.viewblocks.content.view.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.sankuai.waimai.store.repository.model.MarketGuessResponse r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.store.goods.list.templet.drugselfbusiness.index.a.a
            java.lang.String r11 = "2d160536dc1649946d019e2b36eb2996"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            return
        L1b:
            super.a(r13)
            if (r13 != 0) goto L21
            return
        L21:
            java.util.ArrayList<com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu> r1 = r13.c
            if (r1 == 0) goto L38
            int r13 = r13.e
            if (r13 != 0) goto L38
            com.sankuai.waimai.store.newwidgets.MarketNestedScrollRecyclerView r13 = r12.f
            int r13 = com.sankuai.shangou.stone.util.q.a(r13)
            int r1 = r12.j
            if (r1 <= 0) goto L38
            int r1 = r12.j
            if (r1 <= r13) goto L38
            goto L39
        L38:
            r0 = 0
        L39:
            if (r0 == 0) goto L40
            int r13 = r12.j
            r12.a(r13)
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.goods.list.templet.drugselfbusiness.index.a.a(com.sankuai.waimai.store.repository.model.MarketGuessResponse):void");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class b extends com.sankuai.waimai.store.goods.list.viewblocks.header.b {
        public static ChangeQuickRedirect c;
        private com.sankuai.waimai.store.goods.list.viewblocks.header.preferential.b g;

        @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.b, com.sankuai.waimai.store.goods.list.viewblocks.header.j
        public final int a() {
            return R.layout.wm_st_drug_self_business_compose_goods_list_layout_head;
        }

        public b(@NonNull com.sankuai.waimai.store.goods.list.delegate.d dVar, ViewGroup viewGroup) {
            super(dVar, viewGroup);
            Object[] objArr = {dVar, viewGroup};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f3bcdbac79ed5933a08c8a8ff4dbaec", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f3bcdbac79ed5933a08c8a8ff4dbaec");
            }
        }

        @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.j, com.sankuai.waimai.store.base.b
        public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
            Object[] objArr = {layoutInflater, viewGroup};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1d639d17589425d57566cf987875b6e", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1d639d17589425d57566cf987875b6e");
            }
            View onCreateView = super.onCreateView(layoutInflater, viewGroup);
            this.g = new com.sankuai.waimai.store.goods.list.viewblocks.header.preferential.old.a(this.a.k(), this.b, this.a.l());
            this.g.bindView(onCreateView.findViewById(R.id.preferential_view));
            return onCreateView;
        }

        @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.j
        public final void a(RestMenuResponse restMenuResponse, com.sankuai.waimai.store.goods.list.viewblocks.header.d dVar) {
            Object[] objArr = {restMenuResponse, dVar};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4351f766be7d52a65cac7541b42adcd6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4351f766be7d52a65cac7541b42adcd6");
                return;
            }
            super.a(restMenuResponse, dVar);
            this.g.a(restMenuResponse.getPoi().getLabelInfoList(), restMenuResponse.getPoi().getPoiCoupon());
        }

        @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.j, com.sankuai.waimai.store.base.b
        public final void onDestroy() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69f5e8343c5fb0a890cac20119b66816", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69f5e8343c5fb0a890cac20119b66816");
                return;
            }
            super.onDestroy();
            this.g.onDestroy();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.d
    public final void a(RestMenuResponse restMenuResponse) {
        List<GoodsPoiCategory> goodsPoiCategories;
        PoiCategory selectPoiCategory;
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac1183bb3e55ee8cf4bcd370d19ad1dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac1183bb3e55ee8cf4bcd370d19ad1dd");
            return;
        }
        super.a(restMenuResponse);
        if (restMenuResponse == null || (goodsPoiCategories = restMenuResponse.getGoodsPoiCategories()) == null || (selectPoiCategory = restMenuResponse.getSelectPoiCategory()) == null || !selectPoiCategory.isSelected()) {
            return;
        }
        this.j = goodsPoiCategories.indexOf(selectPoiCategory) + this.e.h();
        a(this.j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.goods.list.templet.drugselfbusiness.index.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class RunnableC1184a implements Runnable {
        public static ChangeQuickRedirect a;
        public int b;

        public RunnableC1184a(int i) {
            Object[] objArr = {a.this, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6fc772271fe65d4ff7c1f6e0cea3ec1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6fc772271fe65d4ff7c1f6e0cea3ec1");
            } else {
                this.b = i;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb2d64996c611d5cc6516e27592fa752", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb2d64996c611d5cc6516e27592fa752");
                return;
            }
            a.this.c.e().a();
            int measuredHeight = a.this.g.c.getMeasuredHeight();
            a aVar = a.this;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            ((LinearLayoutManager) a.this.f.getLayoutManager()).scrollToPositionWithOffset(this.b, measuredHeight + (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "00c8da5fdf5da90bc40d9ed040034ba6", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "00c8da5fdf5da90bc40d9ed040034ba6")).intValue() : h.a(aVar.getContext(), 100.0f)));
        }
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0665e79bc2c5cbbde36e064401c236b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0665e79bc2c5cbbde36e064401c236b1");
        } else if (i < 0 || this.g.c == null) {
        } else {
            if (this.i != null) {
                this.g.c.removeCallbacks(this.i);
            }
            this.i = new RunnableC1184a(i);
            this.g.c.post(this.i);
        }
    }
}
