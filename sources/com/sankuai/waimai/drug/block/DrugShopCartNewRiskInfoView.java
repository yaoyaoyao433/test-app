package com.sankuai.waimai.drug.block;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.android.bus.annotation.ThreadMode;
import com.meituan.android.common.aidata.raptoruploader.RaptorConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.drug.order.confirm.model.DrugRisk;
import com.sankuai.waimai.drug.order.confirm.model.DrugRisks;
import com.sankuai.waimai.store.newwidgets.list.SCRecyclerView;
import com.sankuai.waimai.store.util.e;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class DrugShopCartNewRiskInfoView extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    private final int e;
    private final int f;
    private DrugRisks g;
    private com.sankuai.waimai.drug.order.confirm.model.a h;
    private SCRecyclerView i;
    private LinearLayout j;
    private ImageView k;
    private ImageView l;
    private TextView m;
    private ImageView n;
    private a o;
    private boolean p;
    private boolean q;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_drug_new_shopcart_risk_layout;
    }

    public DrugShopCartNewRiskInfoView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a21aa6267eb4e02fc0317539f83462ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a21aa6267eb4e02fc0317539f83462ae");
            return;
        }
        this.e = 1;
        this.f = 2;
        this.p = false;
        this.q = false;
        this.j.setOnClickListener(com.sankuai.waimai.drug.block.a.a(this));
    }

    public static /* synthetic */ void a(DrugShopCartNewRiskInfoView drugShopCartNewRiskInfoView, View view) {
        Object[] objArr = {drugShopCartNewRiskInfoView, view};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a1f02501fdbe9c2aa0117c8e4d1537e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a1f02501fdbe9c2aa0117c8e4d1537e1");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, drugShopCartNewRiskInfoView, changeQuickRedirect2, false, "d6c7ded824381f56ee2ceae1d6590cb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, drugShopCartNewRiskInfoView, changeQuickRedirect2, false, "d6c7ded824381f56ee2ceae1d6590cb2");
            return;
        }
        drugShopCartNewRiskInfoView.a(2);
        drugShopCartNewRiskInfoView.p = !drugShopCartNewRiskInfoView.p;
        boolean z = drugShopCartNewRiskInfoView.p;
        Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect3 = d;
        if (PatchProxy.isSupport(objArr3, drugShopCartNewRiskInfoView, changeQuickRedirect3, false, "8bcf483dfbd3dd8b35e91c1a27e8c134", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, drugShopCartNewRiskInfoView, changeQuickRedirect3, false, "8bcf483dfbd3dd8b35e91c1a27e8c134");
        } else {
            com.meituan.android.bus.a.a().c(new com.sankuai.waimai.drug.event.b(z, System.identityHashCode(drugShopCartNewRiskInfoView.c)));
        }
        drugShopCartNewRiskInfoView.e();
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9946624f07e619277696616867c1cc58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9946624f07e619277696616867c1cc58");
            return;
        }
        super.b();
        this.i = (SCRecyclerView) this.b.findViewById(R.id.rv_new_shopcart_rist_layout_risk_list);
        this.j = (LinearLayout) this.b.findViewById(R.id.iv_new_shopcart_rist_layout_head_container);
        this.k = (ImageView) this.b.findViewById(R.id.iv_new_shopcart_rist_layout_icon_bg);
        this.l = (ImageView) this.b.findViewById(R.id.iv_new_shopcart_rist_layout_icon);
        this.m = (TextView) this.b.findViewById(R.id.tv_new_shopcart_rist_layout_title);
        this.n = (ImageView) this.b.findViewById(R.id.tv_new_shopcart_rist_layout_arrow);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0064644a39df0e7a209d2ae5c0a4d2af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0064644a39df0e7a209d2ae5c0a4d2af");
        } else {
            this.j.setBackground(new e.a().a(com.sankuai.shangou.stone.util.h.a(this.c, 31.0f)).a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{-6323, -8935}).a());
            this.k.setBackground(new e.a().a(com.sankuai.shangou.stone.util.h.a(this.c, 14.0f)).c(-67106).a());
            com.sankuai.waimai.store.util.m.b("https://p1.meituan.net/travelcube/4aee6b3a4625fd392c3e28e9fc02ad501442.png", this.l, com.sankuai.shangou.stone.util.h.a(this.c, 15.0f));
        }
        this.b.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.sankuai.waimai.drug.block.DrugShopCartNewRiskInfoView.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4332beef44afaaf1dbad29065ed3e5d1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4332beef44afaaf1dbad29065ed3e5d1");
                } else {
                    com.meituan.android.bus.a.a().a(DrugShopCartNewRiskInfoView.this);
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d62b511a7a29d08265cf1ef2757631a4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d62b511a7a29d08265cf1ef2757631a4");
                } else {
                    com.meituan.android.bus.a.a().b(DrugShopCartNewRiskInfoView.this);
                }
            }
        });
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends com.sankuai.waimai.store.widgets.recycler.a<b> {
        public static ChangeQuickRedirect a;
        private List<DrugRisk> b;

        @Override // com.sankuai.waimai.store.widgets.recycler.a
        public final int a(int i) {
            return 0;
        }

        public a() {
        }

        @Override // com.sankuai.waimai.store.widgets.recycler.a
        public final /* synthetic */ void a(b bVar, int i) {
            b bVar2 = bVar;
            Object[] objArr = {bVar2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ecbe571cda256b07f5ac790b9297764", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ecbe571cda256b07f5ac790b9297764");
                return;
            }
            DrugRisk drugRisk = this.b.get(i);
            if (drugRisk != null) {
                bVar2.a.setText(drugRisk.info);
            }
            if (com.sankuai.shangou.stone.util.a.a((List) this.b) - 1 == i) {
                u.c(bVar2.b);
                u.d(bVar2.a, 0, 0, 0, 0);
                return;
            }
            u.a(bVar2.b);
            u.d(bVar2.a, 0, 0, 0, com.sankuai.shangou.stone.util.h.a(bVar2.a.getContext(), 8.0f));
        }

        public final void a(List<DrugRisk> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb3206c5758fe721e80b24e0a131af6d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb3206c5758fe721e80b24e0a131af6d");
                return;
            }
            this.b = list;
            m();
        }

        @Override // com.sankuai.waimai.store.widgets.recycler.a
        public final int a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9c05047948f4a7fd033bfa2078e7d64", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9c05047948f4a7fd033bfa2078e7d64")).intValue();
            }
            if (com.sankuai.shangou.stone.util.a.b(this.b)) {
                return 0;
            }
            return this.b.size();
        }

        @Override // com.sankuai.waimai.store.widgets.recycler.a
        public final com.sankuai.waimai.store.widgets.recycler.e a(ViewGroup viewGroup, int i) {
            Object[] objArr = {viewGroup, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ced1c549c38d69c95829c5f2a383f9be", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.widgets.recycler.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ced1c549c38d69c95829c5f2a383f9be") : new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_drug_new_shopcart_risk_info_list_item, viewGroup, false));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b extends com.sankuai.waimai.store.widgets.recycler.e {
        public TextView a;
        public View b;

        public b(View view) {
            super(view);
            this.a = (TextView) a(R.id.risk_item_tv);
            this.b = a(R.id.view_divider);
        }
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aabd12effac768088096f241af4e3151", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aabd12effac768088096f241af4e3151");
            return;
        }
        if (this.p != z) {
            this.p = z;
        }
        e();
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0030d6bb43605497e6c1b397e2389872", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0030d6bb43605497e6c1b397e2389872");
        } else if (this.g == null || com.sankuai.shangou.stone.util.a.b(this.g.riskList)) {
            f();
        } else {
            this.m.setText(this.c.getString(R.string.wm_drug_risk_info_header_tips, Integer.valueOf(this.g.riskList.size())));
            int a2 = com.sankuai.shangou.stone.util.h.a(this.c, 12.0f);
            if (this.p) {
                u.d(this.j, a2, 0, 0, 0);
                com.sankuai.waimai.store.util.m.b("https://p0.meituan.net/travelcube/175b7b4a8c647acb28a623928f87543e294.png", this.n, com.sankuai.shangou.stone.util.h.a(this.c, 10.0f));
                this.i.setVisibility(0);
                if (this.o == null) {
                    this.o = new a();
                    this.i.setLayoutManager(new LinearLayoutManager(this.c));
                    this.i.setAdapter(new com.sankuai.waimai.store.widgets.recycler.l(this.o));
                }
                this.o.a(this.g.riskList);
                this.i.scrollToPosition(0);
            } else {
                u.d(this.j, a2, 0, 0, a2);
                com.sankuai.waimai.store.util.m.b("https://p1.meituan.net/travelcube/226a860cb1779fa30539c132a004b124313.png", this.n, com.sankuai.shangou.stone.util.h.a(this.c, 10.0f));
                this.i.setVisibility(8);
            }
            if (this.q) {
                return;
            }
            a(1);
            this.q = true;
        }
    }

    public final void a(DrugRisks drugRisks, com.sankuai.waimai.drug.order.confirm.model.a aVar) {
        Object[] objArr = {drugRisks, aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c109a47da06373bd97814540731f6796", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c109a47da06373bd97814540731f6796");
            return;
        }
        this.h = aVar;
        if (drugRisks != null) {
            this.g = drugRisks;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = d;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fc54c40c8ed68db0fe4fec974a95c781", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fc54c40c8ed68db0fe4fec974a95c781");
            } else {
                a().setVisibility(0);
            }
            a(drugRisks.isAutoUnFold);
            return;
        }
        f();
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "382ddd3bf916764187d781a6f7dff8e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "382ddd3bf916764187d781a6f7dff8e9");
        } else {
            a().setVisibility(8);
        }
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42c141117a819f27a91f2a27107c3951", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42c141117a819f27a91f2a27107c3951");
        } else if (this.h == null || this.g == null || com.sankuai.shangou.stone.util.a.b(this.g.riskList)) {
        } else {
            if (i == 2) {
                com.sankuai.waimai.store.manager.judas.b.a(this.h.a, com.sankuai.waimai.store.manager.judas.b.a((Object) this.c), this.p ? "b_waimai_sg_d5n9hpkb_mc" : "b_waimai_sg_tzrc6a4u_mc").a("poi_id", this.h.b).a(RaptorConstants.JS_BATCH_NUM, Integer.valueOf(this.g.riskList.size())).a();
            } else if (i == 1) {
                com.sankuai.waimai.store.manager.judas.b.b(this.h.a, com.sankuai.waimai.store.manager.judas.b.a((Object) this.c), this.p ? "b_waimai_sg_d5n9hpkb_mv" : "b_waimai_sg_tzrc6a4u_mv").a("poi_id", this.h.b).a(RaptorConstants.JS_BATCH_NUM, Integer.valueOf(this.g.riskList.size())).a();
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void updateFoldStatusByEvent(com.sankuai.waimai.drug.event.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a869f7ef9b067adba6d3a6fac5b4d6ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a869f7ef9b067adba6d3a6fac5b4d6ac");
        } else if (bVar == null || System.identityHashCode(this.c) != bVar.b) {
        } else {
            a(bVar.a);
        }
    }
}
