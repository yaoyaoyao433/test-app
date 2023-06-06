package com.sankuai.waimai.bussiness.order.detailnew.pgablock.abnormal;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.e;
import com.sankuai.waimai.bussiness.order.rocks.OrderRocksServerModel;
import com.sankuai.waimai.platform.utils.l;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.meituan.android.cube.pga.block.a<c, C0911a, com.sankuai.waimai.bussiness.order.detailnew.a> implements com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.animation.b {
    public static ChangeQuickRedirect r;
    private String s;
    private e t;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93f5a694f8225ec4a58ddd145c5247ec", RobustBitConfig.DEFAULT_VALUE) ? (C0911a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93f5a694f8225ec4a58ddd145c5247ec") : new C0911a();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ c z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8b3f6e4dcd57a6a6aa548e050b606d7", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8b3f6e4dcd57a6a6aa548e050b606d7") : new c(m(), "wm_order_status_abnormal_info", ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).u.a().b);
    }

    public a(com.sankuai.waimai.bussiness.order.detailnew.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54fa7014089d064fef71e319d86153ac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54fa7014089d064fef71e319d86153ac");
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22f5f67c6f9a0af6d6236846ceda3f34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22f5f67c6f9a0af6d6236846ceda3f34");
            return;
        }
        super.s();
        this.s = getClass().getSimpleName() + System.currentTimeMillis();
        ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).m.a(new com.meituan.android.cube.pga.action.a() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.abnormal.a.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d139d80babdb62da93784b2c7d760037", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d139d80babdb62da93784b2c7d760037");
                    return;
                }
                c cVar = (c) a.this.g;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = c.d;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "aa0093aa94bbbf3371248c150dc3eab0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "aa0093aa94bbbf3371248c150dc3eab0");
                    return;
                }
                b bVar = cVar.e;
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = b.a;
                if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "34cf1d431344912b195ebaeda59dc7c0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "34cf1d431344912b195ebaeda59dc7c0");
                    return;
                }
                com.sankuai.waimai.platform.capacity.network.retrofit.b.a("second_delivery");
                if (bVar.l == null || bVar.l.isUnsubscribed()) {
                    return;
                }
                bVar.l.unsubscribe();
            }
        });
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bf98d91d49c3ffe2452106355619fb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bf98d91d49c3ffe2452106355619fb6");
            return;
        }
        super.I();
        if (this.t == null) {
            this.t = new e();
            this.t.c = "waimai_order_order_status_abnormal_remind_style_1";
            this.t.d = "waimai_order_order_status_abnormal_remind_style_1";
        }
        this.t.h = ((C0911a) this.n).q;
        ((c) this.g).a(this.t, ((C0911a) this.n).p, this, ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).ai.a());
    }

    @Override // com.meituan.android.cube.core.f
    public final void bE_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de1f3fbb14ff525509a69f4ca9fe3454", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de1f3fbb14ff525509a69f4ca9fe3454");
            return;
        }
        super.bE_();
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a("second_delivery");
        l.cancel(this.s);
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(this.s);
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.animation.b
    public final void M() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42bc19b578529f7020c095883a640d9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42bc19b578529f7020c095883a640d9c");
            return;
        }
        Boolean bool = ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).aa.a().b;
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).Z.a((com.meituan.android.cube.pga.common.b<Integer>) 0);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.bussiness.order.detailnew.pgablock.abnormal.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0911a extends com.meituan.android.cube.pga.viewmodel.a<OrderRocksServerModel> {
        public static ChangeQuickRedirect o;
        @NonNull
        OrderAbnormalInfo p;
        Map<String, Object> q;

        public C0911a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = o;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2bd6fab268571e44b249cd6ae564a9c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2bd6fab268571e44b249cd6ae564a9c");
                return;
            }
            this.p = new OrderAbnormalInfo();
            this.q = new HashMap();
        }

        @Override // com.meituan.android.cube.pga.viewmodel.a
        public final void d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = o;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbe1f5c024296053112a09ca2114884c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbe1f5c024296053112a09ca2114884c");
                return;
            }
            super.d();
            if (this.c != 0) {
                this.p = OrderAbnormalInfo.convert((OrderRocksServerModel) this.c);
                this.q = ((OrderRocksServerModel) this.c).b("wm_order_status_abnormal_remind");
                this.q.putAll(((OrderRocksServerModel) this.c).f);
                this.q.putAll(((OrderRocksServerModel) this.c).g);
            }
        }
    }
}
