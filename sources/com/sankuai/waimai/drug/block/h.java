package com.sankuai.waimai.drug.block;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.drug.adapter.a;
import com.sankuai.waimai.store.platform.domain.core.shopcart.ShopCartApiModel;
import com.sankuai.waimai.store.repository.model.GoodDetailResponse;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h extends com.sankuai.waimai.store.base.b implements a.InterfaceC0932a {
    public static ChangeQuickRedirect a;
    final com.sankuai.waimai.store.platform.domain.manager.poi.a b;
    final SCPageConfig c;
    public View d;
    public ListView e;
    private com.sankuai.waimai.store.shopping.cart.contract.a f;
    private TextView g;
    private TextView h;
    private com.sankuai.waimai.drug.adapter.a i;
    private TextView j;
    private FrameLayout k;
    private d l;
    private GoodDetailResponse m;

    public h(@NonNull Context context, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, SCPageConfig sCPageConfig, com.sankuai.waimai.store.shopping.cart.contract.a aVar2, GoodDetailResponse goodDetailResponse) {
        super(context);
        Object[] objArr = {context, aVar, sCPageConfig, aVar2, goodDetailResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85702f3b0bc7a41b65033a7ed6e39223", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85702f3b0bc7a41b65033a7ed6e39223");
            return;
        }
        this.f = aVar2;
        this.b = aVar;
        this.c = sCPageConfig;
        this.m = goodDetailResponse;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c5eced2b3ef0c1aa5cb971f97b36c08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c5eced2b3ef0c1aa5cb971f97b36c08");
            return;
        }
        super.onViewCreated();
        this.d = this.mView.findViewById(R.id.layout_shop_cart);
        this.e = (ListView) this.mView.findViewById(R.id.list_shop_cart);
        this.k = (FrameLayout) this.mView.findViewById(R.id.shop_cart_risk_info);
        this.g = (TextView) this.mView.findViewById(R.id.txt_cart_name);
        this.j = (TextView) this.mView.findViewById(R.id.txt_cart_hint);
        this.h = (TextView) this.mView.findViewById(R.id.btn_clear);
        this.i = new com.sankuai.waimai.drug.adapter.a(this, this.b, this.c, this.m);
        this.e.setAdapter((ListAdapter) this.i);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f44a47d0ea03d95881a3de326b787e5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f44a47d0ea03d95881a3de326b787e5a");
        } else {
            this.d.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.drug.block.h.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "55deb2e8581421fe675d1f0af93e7433", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "55deb2e8581421fe675d1f0af93e7433");
                        return;
                    }
                    h hVar = h.this;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = h.a;
                    if (PatchProxy.isSupport(objArr4, hVar, changeQuickRedirect4, false, "36d423b529d5aabb83d8ab0c34933579", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, hVar, changeQuickRedirect4, false, "36d423b529d5aabb83d8ab0c34933579");
                    } else if (hVar.d.getVisibility() == 0) {
                        com.sankuai.waimai.store.manager.judas.b.a(hVar.c.d, "b_bh3yobwi").a("poi_id", hVar.b.d()).a();
                        hVar.b();
                    }
                }
            });
            this.e.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.sankuai.waimai.drug.block.h.2
                public static ChangeQuickRedirect a;

                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    Object[] objArr3 = {adapterView, view, Integer.valueOf(i), new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "79adc5fa02d0f2063db4db643f900bf7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "79adc5fa02d0f2063db4db643f900bf7");
                        return;
                    }
                    View findViewById = view.findViewById(R.id.layout_food_item);
                    if (findViewById != null) {
                        findViewById.performClick();
                    }
                }
            });
            this.h.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.drug.block.h.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6d42cb8ba575b799cdeff256b6d96074", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6d42cb8ba575b799cdeff256b6d96074");
                        return;
                    }
                    com.sankuai.waimai.store.manager.judas.b.a(h.this.c.d, "b_t72u5rml").a("poi_id", h.this.b.d()).a();
                    com.sankuai.waimai.store.order.a.e().a(h.this.b.d(), (com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b) null);
                    com.sankuai.waimai.store.order.a.e().c(h.this.b.d());
                }
            });
        }
        Context context = this.mContext;
        Object[] objArr3 = {context};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8a6811fc795924eba202f60625cbc734", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8a6811fc795924eba202f60625cbc734");
            return;
        }
        this.l = new d(context, this.b, this.c, this.f);
        this.l.createAndReplaceView(this.k);
    }

    public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a093e760b8aa87f716c0eb28bda52bec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a093e760b8aa87f716c0eb28bda52bec");
            return;
        }
        List<com.sankuai.waimai.drug.model.f> a2 = new com.sankuai.waimai.drug.model.e().a(bVar);
        this.l.a(bVar != null ? bVar.d().getShopCartDrugRisk() : new ShopCartApiModel.a());
        if (com.sankuai.waimai.foundation.utils.b.b(a2)) {
            b();
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6c5f6553f00f8f0ed99b83925188a7fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6c5f6553f00f8f0ed99b83925188a7fa");
        } else {
            int j = com.sankuai.waimai.store.order.a.e().j(this.b.d());
            this.g.setText(this.mContext.getString(R.string.wm_st_shop_cart_title));
            String d = d();
            if (TextUtils.isEmpty(d)) {
                this.j.setText(this.mContext.getString(R.string.wm_st_shopcart_cart_num, Integer.valueOf(j)));
            } else {
                this.j.setText(this.mContext.getString(R.string.wm_st_shopcart_cart_num_with_weight, Integer.valueOf(j), d));
            }
        }
        this.i.a(a2);
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6eb4b3a99bb7bd90a28e5b144ac83174", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6eb4b3a99bb7bd90a28e5b144ac83174");
            return;
        }
        this.d.setVisibility(8);
        if (this.i != null) {
            this.i.a();
        }
        if (this.f != null) {
            this.f.f();
        }
    }

    public final void c() {
        int i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcb02a9b846c78431654f31dbf69d915", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcb02a9b846c78431654f31dbf69d915");
            return;
        }
        this.d.setVisibility(0);
        if (!TextUtils.isEmpty(d())) {
            com.sankuai.waimai.store.manager.judas.b.b(this.c.d, "b_waimai_9vh9z4fm_mv").a("poi_id", this.b.d()).a();
        }
        com.sankuai.waimai.store.callback.a a2 = com.sankuai.waimai.store.manager.judas.b.b(this.c.d, "b_waimai_x4xz7u4h_mv").a("poi_id", this.b.d());
        List<com.sankuai.waimai.drug.model.f> a3 = new com.sankuai.waimai.drug.model.e().a(com.sankuai.waimai.store.order.a.e().k(this.b.d()));
        Object[] objArr2 = {a3};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "82aaee1ca332b8b7a979b617c9c861cc", RobustBitConfig.DEFAULT_VALUE)) {
            i = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "82aaee1ca332b8b7a979b617c9c861cc")).intValue();
        } else {
            int i2 = 0;
            for (int i3 = 0; i3 < a3.size(); i3++) {
                com.sankuai.waimai.drug.model.f fVar = a3.get(i3);
                if (fVar != null && fVar.d == 1) {
                    i2++;
                }
            }
            i = i2;
        }
        a2.a("item_num", Integer.valueOf(i)).a();
    }

    @Override // com.sankuai.waimai.drug.adapter.a.InterfaceC0932a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "734df2a7378058963bba068300d082d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "734df2a7378058963bba068300d082d5");
            return;
        }
        com.sankuai.waimai.store.manager.judas.b.a(this.c.d, "b_waimai_c22mzzp1_mc").a("poi_id", this.b.d()).a();
        com.sankuai.waimai.store.order.a.e().g(this.b.d());
    }

    private String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4df09a7793c5a4bcc3fa4ab14a7e52a9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4df09a7793c5a4bcc3fa4ab14a7e52a9");
        }
        com.sankuai.waimai.store.platform.domain.core.shopcart.b k = com.sankuai.waimai.store.order.a.e().k(this.b.d());
        return k.t == null ? "" : k.t.getTotalWeightText();
    }
}
