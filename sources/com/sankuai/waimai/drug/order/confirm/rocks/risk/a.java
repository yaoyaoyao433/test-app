package com.sankuai.waimai.drug.order.confirm.rocks.risk;

import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.android.cube.pga.common.b;
import com.meituan.android.cube.pga.common.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.drug.order.confirm.model.DrugRisks;
import com.sankuai.waimai.drug.order.confirm.model.OrderConfirmMachTemplateMap;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
@DynamicBinder(modelType = OrderConfirmMachTemplateMap.class, nativeId = {"wm_confirm_order_drug_risk_info_style_1"}, viewModel = C0941a.class)
/* loaded from: classes4.dex */
public class a extends com.meituan.android.cube.pga.block.a<OrderConfirmRocksDrugRiskInfoView, C0941a, com.sankuai.waimai.business.order.api.confirm.block.a> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d816999d855ea8c4e59051e13b7431c", RobustBitConfig.DEFAULT_VALUE) ? (C0941a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d816999d855ea8c4e59051e13b7431c") : new C0941a();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ OrderConfirmRocksDrugRiskInfoView z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "454b2144225b67953e2cdb939b4268b4", RobustBitConfig.DEFAULT_VALUE) ? (OrderConfirmRocksDrugRiskInfoView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "454b2144225b67953e2cdb939b4268b4") : new OrderConfirmRocksDrugRiskInfoView(m());
    }

    public a(com.sankuai.waimai.business.order.api.confirm.block.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29205f1484d3bff7419147ceca0d65d2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29205f1484d3bff7419147ceca0d65d2");
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7fd629145ca7875df4a40cc58ed2389", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7fd629145ca7875df4a40cc58ed2389") : i();
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9870ecb410a642694f803689a3ecabb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9870ecb410a642694f803689a3ecabb0");
            return;
        }
        super.I();
        if (((C0941a) G()).c().booleanValue()) {
            com.sankuai.waimai.drug.order.confirm.model.a aVar = new com.sankuai.waimai.drug.order.confirm.model.a();
            aVar.a = "c_ykhs39e";
            aVar.b = com.sankuai.waimai.store.platform.domain.manager.poi.a.a(((C0941a) G()).p.poiId, ((C0941a) G()).p.poiIdStr);
            OrderConfirmRocksDrugRiskInfoView r2 = r();
            DrugRisks drugRisks = ((C0941a) G()).p;
            Object[] objArr2 = {drugRisks, aVar};
            ChangeQuickRedirect changeQuickRedirect2 = OrderConfirmRocksDrugRiskInfoView.d;
            if (PatchProxy.isSupport(objArr2, r2, changeQuickRedirect2, false, "8031e49592771cc9b4084c5278aa25b9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, r2, changeQuickRedirect2, false, "8031e49592771cc9b4084c5278aa25b9");
            } else {
                if (drugRisks != null) {
                    drugRisks.updateTime = SystemClock.elapsedRealtime();
                }
                Object[] objArr3 = {drugRisks, aVar};
                ChangeQuickRedirect changeQuickRedirect3 = OrderConfirmRocksDrugRiskInfoView.d;
                if (PatchProxy.isSupport(objArr3, r2, changeQuickRedirect3, false, "dfded80be9b5bdb9001096e208b1a1c5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, r2, changeQuickRedirect3, false, "dfded80be9b5bdb9001096e208b1a1c5");
                } else {
                    r2.f = aVar;
                    if (drugRisks != null) {
                        r2.e = drugRisks;
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = OrderConfirmRocksDrugRiskInfoView.d;
                        if (PatchProxy.isSupport(objArr4, r2, changeQuickRedirect4, false, "74a90f5d6b4ed097c0e82ee76283f685", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, r2, changeQuickRedirect4, false, "74a90f5d6b4ed097c0e82ee76283f685");
                        } else {
                            r2.a().setVisibility(0);
                        }
                        r2.a(OrderConfirmRocksDrugRiskInfoView.h > r2.e.updateTime ? OrderConfirmRocksDrugRiskInfoView.g : OrderConfirmRocksDrugRiskInfoView.g || r2.e.isAutoUnFold);
                    } else {
                        r2.f();
                    }
                }
            }
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = r;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "ed0af39e6f0a5474580cdce9d6366e8b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "ed0af39e6f0a5474580cdce9d6366e8b");
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("model_input_map", r().e());
            HashMap hashMap2 = new HashMap();
            hashMap2.put("data", hashMap);
            hashMap2.put("isUpdate", 0);
            ((com.sankuai.waimai.business.order.api.confirm.block.a) F()).p().a((b<i.c<Integer, Map<String, Object>>>) i.a(1, hashMap2));
            return;
        }
        r().f();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.drug.order.confirm.rocks.risk.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0941a extends com.meituan.android.cube.pga.viewmodel.a<HashMap<String, Object>> {
        public static ChangeQuickRedirect o;
        DrugRisks p;

        @Override // com.meituan.android.cube.pga.viewmodel.a
        public final void d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = o;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8979e7a7783e02b1525f120fb2f834a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8979e7a7783e02b1525f120fb2f834a");
            } else if (this.c != 0) {
                this.p = (DrugRisks) com.sankuai.waimai.store.util.i.a(com.sankuai.waimai.store.util.i.a(this.c), DrugRisks.class);
            }
        }

        @Override // com.meituan.android.cube.pga.viewmodel.a
        public final Boolean c() {
            boolean z = false;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = o;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d805f5e9c3cebb333a9cc7b070f08b9", RobustBitConfig.DEFAULT_VALUE)) {
                return (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d805f5e9c3cebb333a9cc7b070f08b9");
            }
            if (this.p != null && !com.sankuai.shangou.stone.util.a.b(this.p.riskList)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }
}
