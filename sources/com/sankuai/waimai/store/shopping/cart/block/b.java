package com.sankuai.waimai.store.shopping.cart.block;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.order.prescription.model.DrugRisks;
import com.sankuai.waimai.store.order.prescription.view.OrderConfirmDrugRiskInfoView;
import com.sankuai.waimai.store.platform.domain.core.shopcart.ShopCartApiModel;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    OrderConfirmDrugRiskInfoView b;
    private final com.sankuai.waimai.store.platform.domain.manager.poi.a c;
    private final SCPageConfig d;
    private final com.sankuai.waimai.store.shopping.cart.contract.a e;

    public b(@NonNull Context context, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, SCPageConfig sCPageConfig, com.sankuai.waimai.store.shopping.cart.contract.a aVar2) {
        super(context);
        Object[] objArr = {context, aVar, sCPageConfig, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41621e3fd958e513c7e1f7dd94edf9b0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41621e3fd958e513c7e1f7dd94edf9b0");
            return;
        }
        this.c = aVar;
        this.d = sCPageConfig;
        this.e = aVar2;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdd124a4f7d69309b9a84787e8339450", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdd124a4f7d69309b9a84787e8339450");
        }
        this.b = new OrderConfirmDrugRiskInfoView(getContext());
        return this.b.a();
    }

    public final void a(@NonNull ShopCartApiModel.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "272a4a7e08006858d3284273f3e86c0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "272a4a7e08006858d3284273f3e86c0c");
            return;
        }
        DrugRisks drugRisks = (DrugRisks) com.sankuai.waimai.store.util.i.a(aVar.a, DrugRisks.class);
        if (drugRisks != null) {
            drugRisks.updateTime = aVar.b;
        }
        com.sankuai.waimai.store.order.prescription.model.a aVar2 = new com.sankuai.waimai.store.order.prescription.model.a();
        if (this.d != null) {
            aVar2.b = this.d.d;
        }
        if (this.c != null) {
            long f = this.c.f();
            Object[] objArr2 = {new Long(f)};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.order.prescription.model.a.a;
            if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "0a438a9bf6f5091637b3b9dda3a1ace3", RobustBitConfig.DEFAULT_VALUE)) {
                com.sankuai.waimai.store.order.prescription.model.a aVar3 = (com.sankuai.waimai.store.order.prescription.model.a) PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "0a438a9bf6f5091637b3b9dda3a1ace3");
            } else {
                aVar2.c = f;
            }
        }
        this.b.a(drugRisks, aVar2);
    }
}
