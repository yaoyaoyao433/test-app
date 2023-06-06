package com.sankuai.waimai.drug.order.confirm.rocks.risk;

import android.content.Context;
import android.os.SystemClock;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.android.bus.annotation.ThreadMode;
import com.meituan.android.common.aidata.raptoruploader.RaptorConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.drug.order.confirm.model.DrugRisk;
import com.sankuai.waimai.drug.order.confirm.model.DrugRisks;
import com.sankuai.waimai.store.newwidgets.list.SCRecyclerView;
import com.sankuai.waimai.store.widgets.recycler.e;
import com.sankuai.waimai.store.widgets.recycler.l;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class OrderConfirmRocksDrugRiskInfoView extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d = null;
    static boolean g = false;
    static long h = SystemClock.elapsedRealtime();
    DrugRisks e;
    com.sankuai.waimai.drug.order.confirm.model.a f;
    private final int i;
    private final int j;
    private TextView k;
    private View l;
    private TextView m;
    private SCRecyclerView n;
    private View o;
    private a p;
    private boolean q;
    private View.OnClickListener r;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_drug_order_confirm_drug_risk_layout;
    }

    public static /* synthetic */ void a(OrderConfirmRocksDrugRiskInfoView orderConfirmRocksDrugRiskInfoView) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, orderConfirmRocksDrugRiskInfoView, changeQuickRedirect, false, "d20c5189c6c98aa1b10dd24e0faafcb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, orderConfirmRocksDrugRiskInfoView, changeQuickRedirect, false, "d20c5189c6c98aa1b10dd24e0faafcb3");
            return;
        }
        orderConfirmRocksDrugRiskInfoView.a(2);
        g = !g;
        orderConfirmRocksDrugRiskInfoView.b(g);
        orderConfirmRocksDrugRiskInfoView.g();
    }

    public OrderConfirmRocksDrugRiskInfoView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd4fb88c2ada69bce146ac1d7a636177", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd4fb88c2ada69bce146ac1d7a636177");
            return;
        }
        this.i = 1;
        this.j = 2;
        this.q = false;
        this.r = new View.OnClickListener() { // from class: com.sankuai.waimai.drug.order.confirm.rocks.risk.OrderConfirmRocksDrugRiskInfoView.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e4212994dc04357e03cbfd8db6f5536b", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e4212994dc04357e03cbfd8db6f5536b");
                } else {
                    OrderConfirmRocksDrugRiskInfoView.a(OrderConfirmRocksDrugRiskInfoView.this);
                }
            }
        };
        this.k.setOnClickListener(this.r);
        this.m.setOnClickListener(this.r);
        this.n.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.drug.order.confirm.rocks.risk.OrderConfirmRocksDrugRiskInfoView.2
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "77d82e6e61b0289bd2ab821bb28c7cc7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "77d82e6e61b0289bd2ab821bb28c7cc7");
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                if (OrderConfirmRocksDrugRiskInfoView.this.n.canScrollVertically(-1)) {
                    OrderConfirmRocksDrugRiskInfoView.this.o.setVisibility(0);
                } else {
                    OrderConfirmRocksDrugRiskInfoView.this.o.setVisibility(8);
                }
            }
        });
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fd9bb608eb7b5ab9d4eebc650da7238", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fd9bb608eb7b5ab9d4eebc650da7238");
            return;
        }
        super.b();
        this.k = (TextView) this.b.findViewById(R.id.risk_info_folded_tv);
        this.l = this.b.findViewById(R.id.unfold_layout);
        this.m = (TextView) this.b.findViewById(R.id.unfold_risk_title_tv);
        this.n = (SCRecyclerView) this.b.findViewById(R.id.unfold_risk_list);
        this.o = this.b.findViewById(R.id.line_divider);
        this.b.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.sankuai.waimai.drug.order.confirm.rocks.risk.OrderConfirmRocksDrugRiskInfoView.3
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b1bbbc122cca34da3e9d3beb525db22a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b1bbbc122cca34da3e9d3beb525db22a");
                } else {
                    com.meituan.android.bus.a.a().a(OrderConfirmRocksDrugRiskInfoView.this);
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1892a36ce3d96e705d0049e30f7e1d0d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1892a36ce3d96e705d0049e30f7e1d0d");
                } else {
                    com.meituan.android.bus.a.a().b(OrderConfirmRocksDrugRiskInfoView.this);
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0504f07e80aaaa0bce5a2f3604e8f66b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0504f07e80aaaa0bce5a2f3604e8f66b");
                return;
            }
            DrugRisk drugRisk = this.b.get(i);
            if (drugRisk != null) {
                bVar2.a.setText(drugRisk.info);
            }
        }

        public final void a(List<DrugRisk> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cab6a2d9bfd6f9c3397203c269c838ed", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cab6a2d9bfd6f9c3397203c269c838ed");
                return;
            }
            this.b = list;
            m();
        }

        @Override // com.sankuai.waimai.store.widgets.recycler.a
        public final int a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf7f9765c50ca98e57fb24e4e6970a87", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf7f9765c50ca98e57fb24e4e6970a87")).intValue();
            }
            if (com.sankuai.shangou.stone.util.a.b(this.b)) {
                return 0;
            }
            return this.b.size();
        }

        @Override // com.sankuai.waimai.store.widgets.recycler.a
        public final e a(ViewGroup viewGroup, int i) {
            Object[] objArr = {viewGroup, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "414c5705b8f0016bfbc011a67c2f8720", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "414c5705b8f0016bfbc011a67c2f8720") : new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_drug_block_drug_risk_list_item, viewGroup, false));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b extends e {
        public TextView a;

        public b(View view) {
            super(view);
            this.a = (TextView) a(R.id.risk_item_tv);
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b43dd6e2efbe3b2a3ab5d02d89d89f96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b43dd6e2efbe3b2a3ab5d02d89d89f96");
            return;
        }
        if (g != z) {
            g = z;
            b(g);
        }
        g();
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63fbefb6cc110917b0968e1150fd4bf1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63fbefb6cc110917b0968e1150fd4bf1");
        } else if (this.e == null || com.sankuai.shangou.stone.util.a.b(this.e.riskList)) {
            f();
        } else {
            if (g) {
                this.l.setVisibility(0);
                this.k.setVisibility(8);
                this.m.setText(this.c.getString(R.string.wm_drug_risk_info_header_tips, Integer.valueOf(this.e.riskList.size())));
                if (this.p == null) {
                    this.p = new a();
                    this.n.setLayoutManager(new LinearLayoutManager(this.c));
                    this.n.setAdapter(new l(this.p));
                }
                this.p.a(this.e.riskList);
                this.n.scrollToPosition(0);
            } else {
                this.k.setVisibility(0);
                this.l.setVisibility(8);
                this.k.setText(this.c.getString(R.string.wm_drug_risk_info_header_tips, Integer.valueOf(this.e.riskList.size())));
            }
            if (this.q) {
                return;
            }
            a(1);
            this.q = true;
        }
    }

    public final Map<String, String> e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81f5609e49f598474231a4f0cdbc58ef", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81f5609e49f598474231a4f0cdbc58ef");
        }
        HashMap hashMap = new HashMap();
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.e != null) {
                jSONObject.put("risk_key", this.e.riskKey);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        hashMap.put("medication_remind", jSONObject.toString());
        return hashMap;
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f13a00923e8a751b55f60cfbd5936be9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f13a00923e8a751b55f60cfbd5936be9");
        } else {
            a().setVisibility(8);
        }
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b49bc299fb54d0ad7abc475ac0f6b75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b49bc299fb54d0ad7abc475ac0f6b75");
        } else if (this.f == null || this.e == null || com.sankuai.shangou.stone.util.a.b(this.e.riskList)) {
        } else {
            if (i == 2) {
                com.sankuai.waimai.store.manager.judas.b.a(this.f.a, com.sankuai.waimai.store.manager.judas.b.a((Object) this.c), g ? "b_waimai_sg_d5n9hpkb_mc" : "b_waimai_sg_tzrc6a4u_mc").a("poi_id", this.f.b).a(RaptorConstants.JS_BATCH_NUM, Integer.valueOf(this.e.riskList.size())).a();
            } else if (i == 1) {
                com.sankuai.waimai.store.manager.judas.b.b(this.f.a, com.sankuai.waimai.store.manager.judas.b.a((Object) this.c), g ? "b_waimai_sg_d5n9hpkb_mv" : "b_waimai_sg_tzrc6a4u_mv").a("poi_id", this.f.b).a(RaptorConstants.JS_BATCH_NUM, Integer.valueOf(this.e.riskList.size())).a();
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void updateFoldStatusByEvent(com.sankuai.waimai.drug.order.confirm.event.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98552eaa4bf6da510263efa71c058fa7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98552eaa4bf6da510263efa71c058fa7");
        } else if (aVar != null) {
            a(aVar.a);
        }
    }

    private void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86788c36dc77eeb4936c3cb96e223a19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86788c36dc77eeb4936c3cb96e223a19");
            return;
        }
        com.meituan.android.bus.a.a().c(new com.sankuai.waimai.drug.order.confirm.event.a(z));
        h = SystemClock.elapsedRealtime();
    }
}
