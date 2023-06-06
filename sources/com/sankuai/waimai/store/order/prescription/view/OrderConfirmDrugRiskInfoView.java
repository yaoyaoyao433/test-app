package com.sankuai.waimai.store.order.prescription.view;

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
import com.sankuai.waimai.store.newwidgets.list.SCRecyclerView;
import com.sankuai.waimai.store.order.prescription.model.DrugRisk;
import com.sankuai.waimai.store.order.prescription.model.DrugRisks;
import com.sankuai.waimai.store.widgets.recycler.l;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class OrderConfirmDrugRiskInfoView extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d = null;
    private static boolean o = false;
    private static long p = SystemClock.elapsedRealtime();
    private final int e;
    private final int f;
    private DrugRisks g;
    private com.sankuai.waimai.store.order.prescription.model.a h;
    private TextView i;
    private View j;
    private TextView k;
    private SCRecyclerView l;
    private View m;
    private a n;
    private boolean q;
    private View.OnClickListener r;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_sg_order_confirm_drug_risk_layout;
    }

    public static /* synthetic */ void a(OrderConfirmDrugRiskInfoView orderConfirmDrugRiskInfoView) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, orderConfirmDrugRiskInfoView, changeQuickRedirect, false, "1a84962629cb53ef13476dbbfd9cf2e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, orderConfirmDrugRiskInfoView, changeQuickRedirect, false, "1a84962629cb53ef13476dbbfd9cf2e9");
            return;
        }
        orderConfirmDrugRiskInfoView.a(2);
        o = !o;
        orderConfirmDrugRiskInfoView.b(o);
        orderConfirmDrugRiskInfoView.e();
    }

    public OrderConfirmDrugRiskInfoView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20426f613d93260a63cefc4ea1e1ccef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20426f613d93260a63cefc4ea1e1ccef");
            return;
        }
        this.e = 1;
        this.f = 2;
        this.q = false;
        this.r = new View.OnClickListener() { // from class: com.sankuai.waimai.store.order.prescription.view.OrderConfirmDrugRiskInfoView.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "807f8549a99900ede4eafe3c63d94b0b", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "807f8549a99900ede4eafe3c63d94b0b");
                } else {
                    OrderConfirmDrugRiskInfoView.a(OrderConfirmDrugRiskInfoView.this);
                }
            }
        };
        this.i.setOnClickListener(this.r);
        this.k.setOnClickListener(this.r);
        this.l.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.store.order.prescription.view.OrderConfirmDrugRiskInfoView.2
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "72e1d14496334351f60da0236020d616", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "72e1d14496334351f60da0236020d616");
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                if (OrderConfirmDrugRiskInfoView.this.l.canScrollVertically(-1)) {
                    OrderConfirmDrugRiskInfoView.this.m.setVisibility(0);
                } else {
                    OrderConfirmDrugRiskInfoView.this.m.setVisibility(8);
                }
            }
        });
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0025ef87826136ca9e8042a28a06f925", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0025ef87826136ca9e8042a28a06f925");
            return;
        }
        super.b();
        this.i = (TextView) this.b.findViewById(R.id.risk_info_folded_tv);
        this.j = this.b.findViewById(R.id.unfold_layout);
        this.k = (TextView) this.b.findViewById(R.id.unfold_risk_title_tv);
        this.l = (SCRecyclerView) this.b.findViewById(R.id.unfold_risk_list);
        this.m = this.b.findViewById(R.id.line_divider);
        this.b.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.sankuai.waimai.store.order.prescription.view.OrderConfirmDrugRiskInfoView.3
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c72d9c35078050c268c611bc854a7112", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c72d9c35078050c268c611bc854a7112");
                } else {
                    com.meituan.android.bus.a.a().a(OrderConfirmDrugRiskInfoView.this);
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "861d3a8dda59de63c4cd3115c6cd1b4e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "861d3a8dda59de63c4cd3115c6cd1b4e");
                } else {
                    com.meituan.android.bus.a.a().b(OrderConfirmDrugRiskInfoView.this);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef5b1554c0a11da3c58bd4327538f04a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef5b1554c0a11da3c58bd4327538f04a");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a162d38328387fb0416f6c4f8467cf2e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a162d38328387fb0416f6c4f8467cf2e");
                return;
            }
            this.b = list;
            m();
        }

        @Override // com.sankuai.waimai.store.widgets.recycler.a
        public final int a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "859640bc5b9e0ee489e4ddb279bd0271", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "859640bc5b9e0ee489e4ddb279bd0271")).intValue();
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
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bd4c625281f9f1704819fb2e87a38d1", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.widgets.recycler.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bd4c625281f9f1704819fb2e87a38d1") : new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_sg_block_drug_risk_list_item, viewGroup, false));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b extends com.sankuai.waimai.store.widgets.recycler.e {
        public TextView a;

        public b(View view) {
            super(view);
            this.a = (TextView) a(R.id.risk_item_tv);
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f688f3f1f49577dd0d9e76a7c63fc3fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f688f3f1f49577dd0d9e76a7c63fc3fd");
            return;
        }
        if (o != z) {
            o = z;
            b(o);
        }
        e();
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20b9713be4f88337e37fefd5f6a111ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20b9713be4f88337e37fefd5f6a111ee");
        } else if (this.g == null || com.sankuai.shangou.stone.util.a.b(this.g.riskList)) {
            f();
        } else {
            if (o) {
                this.j.setVisibility(0);
                this.i.setVisibility(8);
                this.k.setText(this.c.getString(R.string.wm_sg_drug_risk_info_header_tips, Integer.valueOf(this.g.riskList.size())));
                if (this.n == null) {
                    this.n = new a();
                    this.l.setLayoutManager(new LinearLayoutManager(this.c));
                    this.l.setAdapter(new l(this.n));
                }
                this.n.a(this.g.riskList);
                this.l.scrollToPosition(0);
            } else {
                this.i.setVisibility(0);
                this.j.setVisibility(8);
                this.i.setText(this.c.getString(R.string.wm_sg_drug_risk_info_header_tips, Integer.valueOf(this.g.riskList.size())));
            }
            if (this.q) {
                return;
            }
            a(1);
            this.q = true;
        }
    }

    public final void a(DrugRisks drugRisks, com.sankuai.waimai.store.order.prescription.model.a aVar) {
        boolean z = false;
        Object[] objArr = {drugRisks, aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12aa90f1614a6dbaf8a27b95a58e5239", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12aa90f1614a6dbaf8a27b95a58e5239");
            return;
        }
        this.h = aVar;
        if (drugRisks != null) {
            this.g = drugRisks;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = d;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "886515ba4fb5e32b83e427cd545ff539", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "886515ba4fb5e32b83e427cd545ff539");
            } else {
                a().setVisibility(0);
            }
            if (p > this.g.updateTime) {
                z = o;
            } else if (o || this.g.isAutoUnFold) {
                z = true;
            }
            a(z);
            return;
        }
        f();
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4e2013562d703217b0b084e5106f0fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4e2013562d703217b0b084e5106f0fa");
        } else {
            a().setVisibility(8);
        }
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "420dba6ab6e407a959f29835f7f9917c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "420dba6ab6e407a959f29835f7f9917c");
        } else if (this.h == null || this.g == null || com.sankuai.shangou.stone.util.a.b(this.g.riskList)) {
        } else {
            if (i == 2) {
                com.sankuai.waimai.store.manager.judas.b.a(this.h.b, com.sankuai.waimai.store.manager.judas.b.a((Object) this.c), o ? "b_waimai_sg_d5n9hpkb_mc" : "b_waimai_sg_tzrc6a4u_mc").a("poi_id", Long.valueOf(this.h.c)).a(RaptorConstants.JS_BATCH_NUM, Integer.valueOf(this.g.riskList.size())).a();
            } else if (i == 1) {
                com.sankuai.waimai.store.manager.judas.b.b(this.h.b, com.sankuai.waimai.store.manager.judas.b.a((Object) this.c), o ? "b_waimai_sg_d5n9hpkb_mv" : "b_waimai_sg_tzrc6a4u_mv").a("poi_id", Long.valueOf(this.h.c)).a(RaptorConstants.JS_BATCH_NUM, Integer.valueOf(this.g.riskList.size())).a();
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void updateFoldStatusByEvent(com.sankuai.waimai.store.order.prescription.model.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f69bf3adda03a8083f0e8417234d3eb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f69bf3adda03a8083f0e8417234d3eb9");
        } else if (eVar != null) {
            a(eVar.a);
        }
    }

    private void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2864a12f1039c4cd36f78d3e223f3cbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2864a12f1039c4cd36f78d3e223f3cbc");
            return;
        }
        com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.order.prescription.model.e(z));
        p = SystemClock.elapsedRealtime();
    }
}
