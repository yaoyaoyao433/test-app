package com.sankuai.waimai.drug.viewHolder;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.store.model.ShopCartTotalBoxPriceInfo;
import com.sankuai.waimai.drug.adapter.a;
import com.sankuai.waimai.drug.controller.ShopCartBoxPriceDialog;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.store.newwidgets.list.g<com.sankuai.waimai.drug.model.f, a.InterfaceC0932a> {
    public static ChangeQuickRedirect a;
    final SCPageConfig b;
    final long c;
    private TextView d;
    private TextView e;
    private View f;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final int a() {
        return R.layout.wm_drug_shopcart_adapter_box_fee;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final /* synthetic */ void a(com.sankuai.waimai.drug.model.f fVar, int i) {
        final com.sankuai.waimai.drug.model.f fVar2 = fVar;
        Object[] objArr = {fVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f3ef77e9d327a459d3f7f36f2553083", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f3ef77e9d327a459d3f7f36f2553083");
            return;
        }
        Object[] objArr2 = {fVar2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f575e961c4bd497c23218532373b75c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f575e961c4bd497c23218532373b75c7");
            return;
        }
        final ShopCartTotalBoxPriceInfo shopCartTotalBoxPriceInfo = fVar2.r;
        if (shopCartTotalBoxPriceInfo != null) {
            Object[] objArr3 = {shopCartTotalBoxPriceInfo};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "55e6e8e9385d718bcbc67c750956f4b3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "55e6e8e9385d718bcbc67c750956f4b3");
            } else {
                this.e.setVisibility(0);
                this.e.setText(shopCartTotalBoxPriceInfo.totalBoxPrice);
            }
            Object[] objArr4 = {shopCartTotalBoxPriceInfo};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "29aa245904808418e86e3360a502b4cd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "29aa245904808418e86e3360a502b4cd");
            } else {
                this.d.setText(shopCartTotalBoxPriceInfo.totalBoxPriceDesc);
            }
            if (com.sankuai.shangou.stone.util.a.b(shopCartTotalBoxPriceInfo.boxPriceItems)) {
                this.f.setVisibility(0);
            } else {
                this.f.setVisibility(8);
                this.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.drug.viewHolder.a.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr5 = {view};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "c1bbd471a4aff11da2f88fa3347d6783", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "c1bbd471a4aff11da2f88fa3347d6783");
                        } else if (com.sankuai.shangou.stone.util.a.b(shopCartTotalBoxPriceInfo.boxPriceItems)) {
                        } else {
                            ShopCartBoxPriceDialog shopCartBoxPriceDialog = new ShopCartBoxPriceDialog(view.getContext());
                            shopCartBoxPriceDialog.a(fVar2.r);
                            shopCartBoxPriceDialog.show();
                            com.sankuai.waimai.store.manager.judas.b.a(a.this.b.d, "b_vhcsyqyl").a("poi_id", Long.valueOf(a.this.c)).a("stid", fVar2.l).a();
                        }
                    }
                });
            }
            this.f.setVisibility(com.sankuai.shangou.stone.util.a.b(shopCartTotalBoxPriceInfo.boxPriceItems) ? 8 : 0);
        }
    }

    public a(SCPageConfig sCPageConfig, long j) {
        Object[] objArr = {sCPageConfig, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fe843cd22fdb7e0fe3440225b290d00", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fe843cd22fdb7e0fe3440225b290d00");
            return;
        }
        this.b = sCPageConfig;
        this.c = j;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "041963d5ad9e630861f9296b3cc28181", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "041963d5ad9e630861f9296b3cc28181");
            return;
        }
        this.d = (TextView) view.findViewById(R.id.txt_box_name);
        this.e = (TextView) view.findViewById(R.id.txt_box_fee);
        this.f = view.findViewById(R.id.box_fee_detail);
    }
}
