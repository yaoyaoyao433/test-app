package com.sankuai.waimai.drug.order.confirm.block;

import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.android.cube.pga.common.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.drug.order.confirm.model.DrugRisks;
import com.sankuai.waimai.drug.order.confirm.model.OrderConfirmMachTemplateMap;
import com.sankuai.waimai.drug.order.confirm.model.b;
import com.sankuai.waimai.drug.order.confirm.model.mach.OrderConfirmMachTemplate;
import com.sankuai.waimai.drug.order.confirm.view.OrderConfirmDrugRiskInfoView;
import java.util.Map;
/* compiled from: ProGuard */
@DynamicBinder(modelType = OrderConfirmMachTemplateMap.class, nativeId = {"wm_confirm_order_drug_risk_info"}, viewModel = b.class)
/* loaded from: classes4.dex */
public class a extends com.meituan.android.cube.pga.block.a<OrderConfirmDrugRiskInfoView, b, com.sankuai.waimai.business.order.api.confirm.block.a> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "026e7e10fa90dbd382007315915f15bd", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "026e7e10fa90dbd382007315915f15bd") : new b();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ OrderConfirmDrugRiskInfoView z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b67fb2f0cb93508005fedade66e18544", RobustBitConfig.DEFAULT_VALUE) ? (OrderConfirmDrugRiskInfoView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b67fb2f0cb93508005fedade66e18544") : new OrderConfirmDrugRiskInfoView(m());
    }

    public a(com.sankuai.waimai.business.order.api.confirm.block.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f2a4537226ee819aaaba4fd6c915ba0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f2a4537226ee819aaaba4fd6c915ba0");
        } else {
            ((com.sankuai.waimai.business.order.api.confirm.block.a) F()).o().a(new com.sankuai.waimai.business.order.api.a<i.c<Integer, Map<String, Object>>>(i()) { // from class: com.sankuai.waimai.drug.order.confirm.block.a.1
                public static ChangeQuickRedirect b;

                @Override // com.sankuai.waimai.business.order.api.a
                public final /* synthetic */ void b(i.c<Integer, Map<String, Object>> cVar) {
                    i.c<Integer, Map<String, Object>> cVar2 = cVar;
                    Object[] objArr2 = {cVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = b;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bc4d48800c19be5b6ebcf8dcc9fc9dad", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bc4d48800c19be5b6ebcf8dcc9fc9dad");
                    } else if (cVar2 == null || cVar2.d == null) {
                    } else {
                        cVar2.d.putAll(a.this.r().e());
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7280b12d479fa473ca66fccdb066b57e", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7280b12d479fa473ca66fccdb066b57e") : i();
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        DrugRisks drugRisks;
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a24d21dda45415c0b62fb0c277b06e73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a24d21dda45415c0b62fb0c277b06e73");
            return;
        }
        super.I();
        com.sankuai.waimai.drug.order.confirm.model.a aVar = new com.sankuai.waimai.drug.order.confirm.model.a();
        aVar.a = "c_ykhs39e";
        aVar.b = String.valueOf(((com.sankuai.waimai.business.order.api.confirm.block.a) F()).i().a().b);
        OrderConfirmDrugRiskInfoView r2 = r();
        OrderConfirmMachTemplate orderConfirmMachTemplate = ((b) G()).p;
        Object[] objArr2 = {orderConfirmMachTemplate, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = OrderConfirmDrugRiskInfoView.d;
        if (PatchProxy.isSupport(objArr2, r2, changeQuickRedirect2, false, "2cdc9e5133b2b339dfaf92b62f56de3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, r2, changeQuickRedirect2, false, "2cdc9e5133b2b339dfaf92b62f56de3d");
            return;
        }
        r2.f = orderConfirmMachTemplate;
        if (r2.f != null) {
            drugRisks = (DrugRisks) com.sankuai.waimai.store.util.i.a(r2.f.nativeData, DrugRisks.class);
            if (drugRisks != null) {
                drugRisks.updateTime = SystemClock.elapsedRealtime();
            }
        } else {
            drugRisks = null;
        }
        DrugRisks drugRisks2 = drugRisks;
        Object[] objArr3 = {drugRisks2, aVar};
        ChangeQuickRedirect changeQuickRedirect3 = OrderConfirmDrugRiskInfoView.d;
        if (PatchProxy.isSupport(objArr3, r2, changeQuickRedirect3, false, "72aad7c578147cdc9182434a36d012e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, r2, changeQuickRedirect3, false, "72aad7c578147cdc9182434a36d012e0");
            return;
        }
        r2.g = aVar;
        if (drugRisks2 != null) {
            r2.e = drugRisks2;
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = OrderConfirmDrugRiskInfoView.d;
            if (PatchProxy.isSupport(objArr4, r2, changeQuickRedirect4, false, "4a75ac51711a53fe111e26f1a0de65a3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, r2, changeQuickRedirect4, false, "4a75ac51711a53fe111e26f1a0de65a3");
            } else {
                r2.a().setVisibility(0);
            }
            if (OrderConfirmDrugRiskInfoView.i > r2.e.updateTime) {
                z = OrderConfirmDrugRiskInfoView.h;
            } else if (OrderConfirmDrugRiskInfoView.h || r2.e.isAutoUnFold) {
                z = true;
            }
            r2.a(z);
            return;
        }
        r2.f();
    }
}
