package com.sankuai.waimai.store.drug.home.newp.presenter;

import android.arch.lifecycle.q;
import android.support.v4.app.FragmentActivity;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.assembler.component.PageEventHandler;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.drug.base.net.b;
import com.sankuai.waimai.store.drug.home.DrugHomePoiIdManager;
import com.sankuai.waimai.store.drug.home.newp.contract.a;
import com.sankuai.waimai.store.drug.home.refactor.cat.DrugHomeMonitor;
import com.sankuai.waimai.store.drug.home.refactor.event.d;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.util.monitor.c;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements a.InterfaceC1155a {
    public static ChangeQuickRedirect a;
    a.b b;
    PoiVerticalityDataResponse c;
    PoiVerticalityDataResponse d;
    com.sankuai.waimai.store.param.a e;
    boolean f;
    boolean g;
    EnumC1156a h;

    public static /* synthetic */ void a(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "e46b337a43d5421059ae1d557efbb101", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "e46b337a43d5421059ae1d557efbb101");
        } else if (aVar.g) {
            if (aVar.h == EnumC1156a.SUCCESS) {
                aVar.f = false;
                aVar.b.a(aVar.d);
            } else if (aVar.h == EnumC1156a.FAILED) {
                aVar.f = false;
                aVar.b.a(null);
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.drug.home.newp.presenter.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public enum EnumC1156a {
        INIT,
        SUCCESS,
        FAILED;
        
        public static ChangeQuickRedirect a;

        EnumC1156a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "230a0bd8ecfff21dfbec13426c7dbc86", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "230a0bd8ecfff21dfbec13426c7dbc86");
            }
        }

        public static EnumC1156a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "730dd6a0b5f89d325943253c58951660", RobustBitConfig.DEFAULT_VALUE) ? (EnumC1156a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "730dd6a0b5f89d325943253c58951660") : (EnumC1156a) Enum.valueOf(EnumC1156a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC1156a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a580d83164abc2513a7c451774e103ed", RobustBitConfig.DEFAULT_VALUE) ? (EnumC1156a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a580d83164abc2513a7c451774e103ed") : (EnumC1156a[]) values().clone();
        }
    }

    public a(a.b bVar, com.sankuai.waimai.store.param.a aVar) {
        Object[] objArr = {bVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88ccf954f03da197f1e4d1a43d1cd4de", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88ccf954f03da197f1e4d1a43d1cd4de");
            return;
        }
        this.f = false;
        this.g = false;
        this.h = EnumC1156a.INIT;
        this.b = bVar;
        this.e = aVar;
    }

    @Override // com.sankuai.waimai.store.drug.home.newp.contract.a.InterfaceC1155a
    public final void a(int i) {
        com.sankuai.waimai.store.drug.home.model.a aVar;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "306f387980d74e1ab2e01866662a13ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "306f387980d74e1ab2e01866662a13ee");
            return;
        }
        this.e.n = i;
        this.e.b = 0L;
        final com.sankuai.waimai.store.param.a aVar2 = this.e;
        Object[] objArr2 = {aVar2, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dea8be0cb5f36e26676dc26aa00251ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dea8be0cb5f36e26676dc26aa00251ba");
            return;
        }
        Object[] objArr3 = {aVar2, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "94f344c57b86b0520669d27bacfe9dd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "94f344c57b86b0520669d27bacfe9dd5");
            return;
        }
        this.b.a(aVar2, true);
        this.f = true;
        this.c = null;
        this.d = null;
        this.g = false;
        this.h = EnumC1156a.INIT;
        Object[] objArr4 = {aVar2};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9a1e425c94a6c38f253325f762f1127e", RobustBitConfig.DEFAULT_VALUE)) {
            aVar = (com.sankuai.waimai.store.drug.home.model.a) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9a1e425c94a6c38f253325f762f1127e");
        } else {
            aVar = new com.sankuai.waimai.store.drug.home.model.a();
            aVar.a = this.b.bb_();
            aVar.b = aVar2.ae;
            aVar.c = this.e.b;
            aVar.d = aVar2.c;
            aVar.e = aVar2.f;
            aVar.f = aVar2.k;
            aVar.g = this.b.c();
            aVar.h = this.b.d();
            aVar.j = this.b.e();
            aVar.i = aVar2.J;
            int i2 = aVar2.K;
            if (aVar2.k()) {
                i2 = aVar2.aD;
            }
            aVar.k = i2;
            aVar.l = aVar2.a();
            aVar.m = 0;
            aVar.n = 0;
            aVar.o = aVar2.aj;
        }
        com.sankuai.waimai.store.drug.home.model.a aVar3 = aVar;
        Object[] objArr5 = {aVar3, aVar2, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "66d8a0db60cf2c21b47112400053e035", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "66d8a0db60cf2c21b47112400053e035");
        } else {
            b.a(aVar3.a).a(aVar3.b, aVar3.c, 20, aVar3.d, aVar3.e, aVar3.f, Statistics.getSession(), com.sankuai.waimai.store.drug.home.model.b.a(), aVar3.g, aVar3.h, aVar3.i, aVar3.j, aVar3.k, aVar3.l, aVar3.m, aVar3.n, aVar3.o, new k<PoiVerticalityDataResponse>() { // from class: com.sankuai.waimai.store.drug.home.newp.presenter.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(Object obj) {
                    PoiVerticalityDataResponse poiVerticalityDataResponse = (PoiVerticalityDataResponse) obj;
                    Object[] objArr6 = {poiVerticalityDataResponse};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "5b5a2fb237df3538f75756b59e5da5fb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "5b5a2fb237df3538f75756b59e5da5fb");
                        return;
                    }
                    com.sankuai.waimai.store.drug.home.util.b.a(aVar2, com.sankuai.waimai.store.drug.home.util.b.b);
                    a.this.g = true;
                    a.this.c = poiVerticalityDataResponse;
                    a.this.b.a(a.this.c, aVar2, r3, false);
                    a.a(a.this);
                    com.sankuai.waimai.store.param.a aVar4 = aVar2;
                    Object[] objArr7 = {aVar4};
                    ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.store.drug.home.refactor.cat.a.a;
                    if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "d3047497f160852593e96fd796d16a7d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "d3047497f160852593e96fd796d16a7d");
                    } else if (com.sankuai.waimai.store.drug.home.refactor.cat.a.b(aVar4)) {
                        c.a(new DrugHomeMonitor("DrugHomeRequest"));
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                    Object[] objArr6 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "c893920be5f87b48d40e9509782e10f7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "c893920be5f87b48d40e9509782e10f7");
                        return;
                    }
                    com.sankuai.waimai.store.drug.home.util.b.a(aVar2, com.sankuai.waimai.store.drug.home.util.b.b);
                    aVar2.ag = -1L;
                    a.this.f = false;
                    boolean a2 = bVar.a();
                    a.this.b.a(a2 ? "" : bVar.b, bVar, r3, a2);
                    com.sankuai.waimai.store.param.a aVar4 = aVar2;
                    String str = bVar.b;
                    int i3 = bVar.c;
                    Object[] objArr7 = {aVar4, str, Integer.valueOf(i3)};
                    ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.store.drug.home.refactor.cat.a.a;
                    if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "daf8269057451cfe06f7d781abe36af3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "daf8269057451cfe06f7d781abe36af3");
                    } else if (com.sankuai.waimai.store.drug.home.refactor.cat.a.b(aVar4)) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("ExceptionCode", String.valueOf(i3));
                        hashMap.put("ExceptionMsg", str);
                        c.a(new DrugHomeMonitor("DrugHomeRequest"), null, null, hashMap);
                    }
                    com.sankuai.waimai.store.param.a aVar5 = aVar2;
                    com.sankuai.waimai.store.drug.home.refactor.cat.a.a(aVar5, "网络请求失败:" + bVar.b, bVar.c);
                }
            });
        }
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = a;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "bd033e3155c9197a2bc6c17cf04d0850", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "bd033e3155c9197a2bc6c17cf04d0850");
            return;
        }
        if (!com.sankuai.waimai.store.util.b.a(this.b.b())) {
            ((PageEventHandler) q.a((FragmentActivity) this.b.b()).a(PageEventHandler.class)).a((PageEventHandler) new d(true));
        }
        b.a(this.b.bb_()).a(new k<PoiVerticalityDataResponse>() { // from class: com.sankuai.waimai.store.drug.home.newp.presenter.a.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final /* synthetic */ void a(Object obj) {
                PoiVerticalityDataResponse poiVerticalityDataResponse = (PoiVerticalityDataResponse) obj;
                Object[] objArr7 = {poiVerticalityDataResponse};
                ChangeQuickRedirect changeQuickRedirect7 = a;
                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "8e3075e4596c7890723dbc4c994bec05", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "8e3075e4596c7890723dbc4c994bec05");
                    return;
                }
                DrugHomePoiIdManager.a(a.this.b.b(), poiVerticalityDataResponse);
                a.this.h = EnumC1156a.SUCCESS;
                a.this.d = poiVerticalityDataResponse;
                boolean z = (poiVerticalityDataResponse.judasField == null || poiVerticalityDataResponse.judasField.rankTraceId == null) ? false : true;
                a.this.e.k = z ? poiVerticalityDataResponse.judasField.rankTraceId : "";
                a.this.e.aF = poiVerticalityDataResponse.traceId;
                com.sankuai.waimai.store.drug.home.util.b.a(a.this.e, com.sankuai.waimai.store.drug.home.util.b.f, 0);
                com.sankuai.waimai.store.drug.home.util.b.a(a.this.e, com.sankuai.waimai.store.drug.home.util.b.e, "");
                com.sankuai.waimai.store.drug.home.new_home.util.a.a(a.this.b.b(), poiVerticalityDataResponse, a.this.e, true);
                a.a(a.this);
            }

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                Object[] objArr7 = {bVar};
                ChangeQuickRedirect changeQuickRedirect7 = a;
                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "0a5b8037a52e5f02fb673b0560734985", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "0a5b8037a52e5f02fb673b0560734985");
                    return;
                }
                a.this.h = EnumC1156a.FAILED;
                a.a(a.this);
            }
        }, 0, false, 0L, 0, "", 0, this.e.k, Statistics.getSession(), com.sankuai.waimai.store.drug.home.model.b.a(), 0, 0, "", "", false);
    }

    @Override // com.sankuai.waimai.store.drug.home.newp.contract.a.InterfaceC1155a
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14b3f1283abf875c64813612a47e6426", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14b3f1283abf875c64813612a47e6426")).booleanValue() : this.c == null || com.sankuai.shangou.stone.util.a.b(this.c.moduleList);
    }

    @Override // com.sankuai.waimai.store.drug.home.newp.contract.a.InterfaceC1155a
    public final boolean b() {
        return this.f;
    }
}
