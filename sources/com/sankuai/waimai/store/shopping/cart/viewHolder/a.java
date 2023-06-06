package com.sankuai.waimai.store.shopping.cart.viewHolder;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.store.model.ShopCartTotalBoxPriceInfo;
import com.sankuai.waimai.store.newwidgets.list.g;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
import com.sankuai.waimai.store.shopping.cart.adapter.a;
import com.sankuai.waimai.store.shopping.cart.ui.ShopCartBoxPriceDialog;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends g<com.sankuai.waimai.store.platform.domain.core.order.a, a.InterfaceC1328a> {
    public static ChangeQuickRedirect a;
    final SCPageConfig b;
    final long c;
    final String d;
    private TextView e;
    private TextView f;
    private View g;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final int a() {
        return R.layout.wm_st_shopcart_adapter_box_fee;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final /* synthetic */ void a(com.sankuai.waimai.store.platform.domain.core.order.a aVar, int i) {
        final com.sankuai.waimai.store.platform.domain.core.order.a aVar2 = aVar;
        Object[] objArr = {aVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7d3791f5f059a5d6ebd3128c12022c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7d3791f5f059a5d6ebd3128c12022c5");
            return;
        }
        Object[] objArr2 = {aVar2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "262c61bcfd4a77582104c69a219da86d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "262c61bcfd4a77582104c69a219da86d");
            return;
        }
        final ShopCartTotalBoxPriceInfo shopCartTotalBoxPriceInfo = aVar2.r;
        if (shopCartTotalBoxPriceInfo != null) {
            Object[] objArr3 = {shopCartTotalBoxPriceInfo};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e77e0ca6335637038f8bd2e27e3aaf7e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e77e0ca6335637038f8bd2e27e3aaf7e");
            } else {
                this.f.setVisibility(0);
                this.f.setText(shopCartTotalBoxPriceInfo.totalBoxPrice);
            }
            Object[] objArr4 = {shopCartTotalBoxPriceInfo};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6b4d45a199bda683243b5a7a3496f69a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6b4d45a199bda683243b5a7a3496f69a");
            } else {
                this.e.setText(shopCartTotalBoxPriceInfo.activityTotalOrderBoxPriceDesc);
            }
            if (!shopCartTotalBoxPriceInfo.isPackingFeeValued()) {
                this.g.setVisibility(0);
            } else {
                this.g.setVisibility(8);
                this.g.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.shopping.cart.viewHolder.a.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr5 = {view};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "7b6b1ccfcd3ea641b67bcb8ec5692f9d", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "7b6b1ccfcd3ea641b67bcb8ec5692f9d");
                        } else if (shopCartTotalBoxPriceInfo.isPackingFeeValued()) {
                            ShopCartBoxPriceDialog shopCartBoxPriceDialog = new ShopCartBoxPriceDialog(view.getContext());
                            shopCartBoxPriceDialog.a(aVar2.r);
                            shopCartBoxPriceDialog.show();
                            com.sankuai.waimai.store.manager.judas.b.a(a.this.b.d, "b_vhcsyqyl").a("poi_id", com.sankuai.waimai.store.platform.domain.manager.poi.a.a(a.this.d, a.this.c)).a("stid", aVar2.l).a();
                        }
                    }
                });
            }
            this.g.setVisibility(shopCartTotalBoxPriceInfo.isPackingFeeValued() ? 8 : 0);
        }
    }

    public a(SCPageConfig sCPageConfig, long j, String str) {
        Object[] objArr = {sCPageConfig, new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22c3818cec85ee56f0651e49d788661e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22c3818cec85ee56f0651e49d788661e");
            return;
        }
        this.b = sCPageConfig;
        this.c = j;
        this.d = str;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d31b11bfb79bee7716d3bceb5dff4db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d31b11bfb79bee7716d3bceb5dff4db");
            return;
        }
        this.e = (TextView) view.findViewById(R.id.txt_box_name);
        this.f = (TextView) view.findViewById(R.id.txt_box_fee);
        this.g = view.findViewById(R.id.box_fee_detail);
    }
}
