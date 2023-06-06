package com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.feed;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.android.bus.annotation.ThreadMode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.store.drug.goods.list.controller.i;
import com.sankuai.waimai.store.mach.clickhandler.a;
import com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.util.am;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DrugComposeShopHeaderBlock extends com.sankuai.waimai.store.drug.goods.list.viewblocks.header.a implements e, PrioritySmoothNestedScrollView.a {
    public static ChangeQuickRedirect c;
    private c i;
    private View j;
    private com.sankuai.waimai.store.drug.goods.list.helper.d k;

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.header.a
    public final int c() {
        return R.layout.wm_drug_goods_list_drug_layout_extensible_header;
    }

    public DrugComposeShopHeaderBlock(@NonNull com.sankuai.waimai.store.drug.goods.list.delegate.c cVar) {
        super(cVar);
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35d30254f72d7572b4a38778ba776d81", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35d30254f72d7572b4a38778ba776d81");
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.header.a
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "941ce14f8002639cc279da43322f9c92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "941ce14f8002639cc279da43322f9c92");
            return;
        }
        view.findViewById(R.id.layout_divider_line).setVisibility(8);
        com.meituan.android.bus.a.a().a(this);
        this.i = new c(this, (LinearLayout) view.findViewById(R.id.layout_header_view));
        this.k = new com.sankuai.waimai.store.drug.goods.list.helper.d(this.e);
        this.j = view.findViewById(R.id.v_space_tab_bottom);
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d93535821595b8ec9054a96c4fc8adb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d93535821595b8ec9054a96c4fc8adb");
            return;
        }
        super.onViewCreated();
        i iVar = this.f;
        Object[] objArr2 = {Integer.valueOf((int) R.drawable.sc_wm_super_drugstore_cart)};
        ChangeQuickRedirect changeQuickRedirect2 = i.c;
        if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "e0d7213218f91cbeb02d43b50b8dd825", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "e0d7213218f91cbeb02d43b50b8dd825");
        } else if (iVar.e != null) {
            iVar.e.setCompoundDrawablesWithIntrinsicBounds(com.sankuai.waimai.store.util.b.d(iVar.getContext(), R.drawable.sc_wm_super_drugstore_cart), (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.header.a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0395a3b0040056fff814f640b256be5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0395a3b0040056fff814f640b256be5c");
        } else if ("1".equals(str)) {
            this.j.setVisibility(8);
        } else {
            this.j.setVisibility(0);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.header.a
    public final void a(@NonNull Poi poi, List<BaseModuleDesc> list) {
        Object[] objArr = {poi, list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "845b2f8c5b1b09a4318a191109b361a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "845b2f8c5b1b09a4318a191109b361a5");
        } else {
            this.i.a(list);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.base.b
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d454b709683639623ea5097946cc5157", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d454b709683639623ea5097946cc5157")).intValue() : this.i.a() + d();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.base.b
    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea55c18a1e2ef36df81eff09d8a4032e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea55c18a1e2ef36df81eff09d8a4032e")).intValue() : com.sankuai.shangou.stone.util.h.a(this.mContext, 48.0f) + u.a(this.g.getContext());
    }

    private int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b07bbac9a2ea0e06b22a5a6e3388690", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b07bbac9a2ea0e06b22a5a6e3388690")).intValue();
        }
        if (this.j == null) {
            return 0;
        }
        return this.j.getHeight();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0054, code lost:
        if (r13 < 0.5d) goto L10;
     */
    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.header.a, com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c_(int r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r9 = 0
            r8[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.feed.DrugComposeShopHeaderBlock.c
            java.lang.String r11 = "781c2d9b6f2e9184072c0e05bd63647c"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1f
            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            return
        L1f:
            float r13 = (float) r13
            r1 = 1065353216(0x3f800000, float:1.0)
            float r13 = r13 * r1
            int r2 = r12.b()
            float r2 = (float) r2
            float r13 = r13 / r2
            r2 = 0
            float r13 = com.sankuai.shangou.stone.util.n.a(r13, r2, r1)
            com.sankuai.waimai.store.drug.goods.list.controller.i r1 = r12.f
            r1.a(r13)
            android.view.View r1 = r12.g
            r1.setAlpha(r13)
            com.sankuai.waimai.store.drug.goods.list.delegate.c r1 = r12.a
            com.sankuai.waimai.store.platform.domain.manager.poi.a r1 = r1.d()
            com.sankuai.waimai.store.platform.domain.core.poi.Poi r1 = r1.b
            boolean r1 = r1.selfSellPoi
            if (r1 == 0) goto L4b
            android.content.Context r13 = r12.mContext
            android.app.Activity r13 = (android.app.Activity) r13
            r1 = r13
            goto L57
        L4b:
            android.content.Context r1 = r12.mContext
            android.app.Activity r1 = (android.app.Activity) r1
            double r2 = (double) r13
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r13 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r13 >= 0) goto L57
            goto L58
        L57:
            r0 = 0
        L58:
            com.sankuai.shangou.stone.util.k.c(r1, r0)
            com.sankuai.waimai.store.drug.goods.list.helper.d r13 = r12.k
            com.sankuai.waimai.store.drug.goods.list.controller.i r0 = r12.f
            com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.feed.c r1 = r12.i
            android.view.View r1 = r1.c()
            int r2 = r12.b()
            r13.a(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.feed.DrugComposeShopHeaderBlock.c_(int):void");
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.feed.e
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c36a40f88af89c3f5d189b6f32ca82b3", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.platform.domain.manager.poi.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c36a40f88af89c3f5d189b6f32ca82b3") : this.a.d();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.feed.e
    public final com.sankuai.waimai.store.drug.goods.list.delegate.c f() {
        return this.a;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.header.a, com.sankuai.waimai.store.base.b
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d0a0586455a8d3542881cfac0802f0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d0a0586455a8d3542881cfac0802f0d");
            return;
        }
        super.onDestroy();
        com.meituan.android.bus.a.a().b(this);
        if (this.i != null) {
            this.i.b();
        }
        if (this.k != null) {
            this.k.a();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMachAddEvent(a.C1218a c1218a) {
        Object[] objArr = {c1218a};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8183a9d9527d2eff77c4e45017601a27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8183a9d9527d2eff77c4e45017601a27");
        } else if (this.a == null || this.a.d() == null || c1218a == null || getContext() != c1218a.b || c1218a.f == null || !com.sankuai.waimai.store.platform.domain.manager.poi.a.a(this.a.d().h(), c1218a.e, this.a.d().g(), c1218a.d)) {
        } else {
            View view = c1218a.c;
            GoodsSpu goodsSpu = c1218a.f;
            int i = c1218a.h;
            if (c1218a.h > 0) {
                this.a.a(getContext(), view, c1218a.a(), goodsSpu);
            } else if (i < 0) {
                com.sankuai.waimai.store.order.a.e().b(c1218a.a(), goodsSpu, (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.skus, 0), (GoodsAttr[]) null, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.feed.DrugComposeShopHeaderBlock.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                    public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
                    }

                    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                    public final void a(com.sankuai.waimai.store.exceptions.a aVar) {
                        Object[] objArr2 = {aVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "134dad2269bcb1132fa5d862f821fc53", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "134dad2269bcb1132fa5d862f821fc53");
                        } else if (TextUtils.isEmpty(aVar.getMessage())) {
                        } else {
                            am.a((Activity) DrugComposeShopHeaderBlock.this.a.k(), aVar.getMessage());
                        }
                    }
                });
            }
        }
    }
}
