package com.sankuai.waimai.drug.block;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.drug.order.confirm.model.DrugRisks;
import com.sankuai.waimai.store.platform.domain.core.shopcart.ShopCartApiModel;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    private final com.sankuai.waimai.store.platform.domain.manager.poi.a b;
    private final SCPageConfig c;
    private DrugShopCartNewRiskInfoView d;

    public d(@NonNull Context context, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, SCPageConfig sCPageConfig, com.sankuai.waimai.store.shopping.cart.contract.a aVar2) {
        super(context);
        Object[] objArr = {context, aVar, sCPageConfig, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7cba8f4dfb9611f5ee58e930813772d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7cba8f4dfb9611f5ee58e930813772d");
            return;
        }
        this.b = aVar;
        this.c = sCPageConfig;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ea2130712eab0919a1e74bebfcf2a1e", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ea2130712eab0919a1e74bebfcf2a1e");
        }
        this.d = new DrugShopCartNewRiskInfoView(getContext());
        return this.d.a();
    }

    public final void a(@NonNull ShopCartApiModel.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72d32ec8f111ce1903ae209f7213394b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72d32ec8f111ce1903ae209f7213394b");
            return;
        }
        DrugRisks drugRisks = (DrugRisks) com.sankuai.waimai.store.util.i.a(aVar.a, DrugRisks.class);
        if (drugRisks != null) {
            drugRisks.updateTime = aVar.b;
        }
        com.sankuai.waimai.drug.order.confirm.model.a aVar2 = new com.sankuai.waimai.drug.order.confirm.model.a();
        if (this.c != null) {
            aVar2.a = this.c.d;
        }
        if (this.b != null) {
            aVar2.b = this.b.d();
        }
        this.d.a(drugRisks, aVar2);
    }
}
