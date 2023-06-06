package com.sankuai.waimai.drug.order.confirm.view;

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
import com.sankuai.waimai.drug.order.confirm.model.mach.OrderConfirmMachTemplate;
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
public class OrderConfirmDrugRiskInfoView extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d = null;
    public static boolean h = false;
    public static long i = SystemClock.elapsedRealtime();
    public DrugRisks e;
    public OrderConfirmMachTemplate f;
    public com.sankuai.waimai.drug.order.confirm.model.a g;
    private final int j;
    private final int k;
    private TextView l;
    private View m;
    private TextView n;
    private SCRecyclerView o;
    private View p;
    private a q;
    private boolean r;
    private View.OnClickListener s;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_drug_order_confirm_drug_risk_layout;
    }

    public static /* synthetic */ void a(OrderConfirmDrugRiskInfoView orderConfirmDrugRiskInfoView) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, orderConfirmDrugRiskInfoView, changeQuickRedirect, false, "0d3788033420099945e71457a65c12b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, orderConfirmDrugRiskInfoView, changeQuickRedirect, false, "0d3788033420099945e71457a65c12b9");
            return;
        }
        orderConfirmDrugRiskInfoView.a(2);
        h = !h;
        orderConfirmDrugRiskInfoView.b(h);
        orderConfirmDrugRiskInfoView.g();
    }

    public OrderConfirmDrugRiskInfoView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1332c19a83fea89de5261c3276d97d2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1332c19a83fea89de5261c3276d97d2");
            return;
        }
        this.j = 1;
        this.k = 2;
        this.r = false;
        this.s = new View.OnClickListener() { // from class: com.sankuai.waimai.drug.order.confirm.view.OrderConfirmDrugRiskInfoView.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5bb2b27aab79a6b3f0eae6f5eb71d6bc", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5bb2b27aab79a6b3f0eae6f5eb71d6bc");
                } else {
                    OrderConfirmDrugRiskInfoView.a(OrderConfirmDrugRiskInfoView.this);
                }
            }
        };
        this.l.setOnClickListener(this.s);
        this.n.setOnClickListener(this.s);
        this.o.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.drug.order.confirm.view.OrderConfirmDrugRiskInfoView.2
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9d24594ebfa28797a1de5c4969f4d2ae", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9d24594ebfa28797a1de5c4969f4d2ae");
                    return;
                }
                super.onScrolled(recyclerView, i2, i3);
                if (OrderConfirmDrugRiskInfoView.this.o.canScrollVertically(-1)) {
                    OrderConfirmDrugRiskInfoView.this.p.setVisibility(0);
                } else {
                    OrderConfirmDrugRiskInfoView.this.p.setVisibility(8);
                }
            }
        });
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7fbe61634cb119303bd8abcf4468828", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7fbe61634cb119303bd8abcf4468828");
            return;
        }
        super.b();
        this.l = (TextView) this.b.findViewById(R.id.risk_info_folded_tv);
        this.m = this.b.findViewById(R.id.unfold_layout);
        this.n = (TextView) this.b.findViewById(R.id.unfold_risk_title_tv);
        this.o = (SCRecyclerView) this.b.findViewById(R.id.unfold_risk_list);
        this.p = this.b.findViewById(R.id.line_divider);
        this.b.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.sankuai.waimai.drug.order.confirm.view.OrderConfirmDrugRiskInfoView.3
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d4f8e72308a195744957229f5256d693", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d4f8e72308a195744957229f5256d693");
                } else {
                    com.meituan.android.bus.a.a().a(OrderConfirmDrugRiskInfoView.this);
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8fb0489c1d38ebb55b29751fef6f0708", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8fb0489c1d38ebb55b29751fef6f0708");
                } else {
                    com.meituan.android.bus.a.a().b(OrderConfirmDrugRiskInfoView.this);
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f45f91ea4623fd299f3d7c53c509bfe", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f45f91ea4623fd299f3d7c53c509bfe");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8c7cef0063721d368b6b69f72e5ebf0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8c7cef0063721d368b6b69f72e5ebf0");
                return;
            }
            this.b = list;
            m();
        }

        @Override // com.sankuai.waimai.store.widgets.recycler.a
        public final int a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3b3243e3aa4fe3a5886254329aca201", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3b3243e3aa4fe3a5886254329aca201")).intValue();
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
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6792a0f589e589795d2935b5a622cbd9", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6792a0f589e589795d2935b5a622cbd9") : new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_drug_block_drug_risk_list_item, viewGroup, false));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class b extends e {
        public TextView a;

        public b(View view) {
            super(view);
            this.a = (TextView) a(R.id.risk_item_tv);
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba4d8739d8c859374a646a7e86f0f021", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba4d8739d8c859374a646a7e86f0f021");
            return;
        }
        if (h != z) {
            h = z;
            b(h);
        }
        g();
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a68ec698c60bcb40084d163c954e2ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a68ec698c60bcb40084d163c954e2ae");
        } else if (this.e == null || com.sankuai.shangou.stone.util.a.b(this.e.riskList)) {
            f();
        } else {
            if (h) {
                this.m.setVisibility(0);
                this.l.setVisibility(8);
                this.n.setText(this.c.getString(R.string.wm_drug_risk_info_header_tips, Integer.valueOf(this.e.riskList.size())));
                if (this.q == null) {
                    this.q = new a();
                    this.o.setLayoutManager(new LinearLayoutManager(this.c));
                    this.o.setAdapter(new l(this.q));
                }
                this.q.a(this.e.riskList);
                this.o.scrollToPosition(0);
            } else {
                this.l.setVisibility(0);
                this.m.setVisibility(8);
                this.l.setText(this.c.getString(R.string.wm_drug_risk_info_header_tips, Integer.valueOf(this.e.riskList.size())));
            }
            if (this.r) {
                return;
            }
            a(1);
            this.r = true;
        }
    }

    public final Map<String, String> e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92845cbbf553dd1e2bdec91ba8825df0", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92845cbbf553dd1e2bdec91ba8825df0");
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
        if (this.f != null) {
            hashMap.put(this.f.modelType, jSONObject.toString());
        }
        return hashMap;
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d639cf5ebea92ee602b18c7254002db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d639cf5ebea92ee602b18c7254002db");
        } else {
            a().setVisibility(8);
        }
    }

    private void a(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c0c0049cb59f1213d82375b13504ab1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c0c0049cb59f1213d82375b13504ab1");
        } else if (this.g == null || this.e == null || com.sankuai.shangou.stone.util.a.b(this.e.riskList)) {
        } else {
            if (i2 == 2) {
                com.sankuai.waimai.store.manager.judas.b.a(this.g.a, com.sankuai.waimai.store.manager.judas.b.a((Object) this.c), h ? "b_waimai_sg_d5n9hpkb_mc" : "b_waimai_sg_tzrc6a4u_mc").a("poi_id", this.g.b).a(RaptorConstants.JS_BATCH_NUM, Integer.valueOf(this.e.riskList.size())).a();
            } else if (i2 == 1) {
                com.sankuai.waimai.store.manager.judas.b.b(this.g.a, com.sankuai.waimai.store.manager.judas.b.a((Object) this.c), h ? "b_waimai_sg_d5n9hpkb_mv" : "b_waimai_sg_tzrc6a4u_mv").a("poi_id", this.g.b).a(RaptorConstants.JS_BATCH_NUM, Integer.valueOf(this.e.riskList.size())).a();
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void updateFoldStatusByEvent(com.sankuai.waimai.drug.order.confirm.event.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acae6b35eb580b3e3e4b49e222afca82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acae6b35eb580b3e3e4b49e222afca82");
        } else if (aVar != null) {
            a(aVar.a);
        }
    }

    private void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a68f4b313285f1c58bdcad904897a0a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a68f4b313285f1c58bdcad904897a0a1");
            return;
        }
        com.meituan.android.bus.a.a().c(new com.sankuai.waimai.drug.order.confirm.event.a(z));
        i = SystemClock.elapsedRealtime();
    }
}
