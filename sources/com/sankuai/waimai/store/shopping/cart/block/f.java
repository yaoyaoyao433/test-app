package com.sankuai.waimai.store.shopping.cart.block;

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
import com.sankuai.waimai.store.platform.domain.core.shopcart.ShopCartApiModel;
import com.sankuai.waimai.store.repository.model.GoodDetailResponse;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
import com.sankuai.waimai.store.shopping.cart.adapter.a;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends com.sankuai.waimai.store.base.b implements a.InterfaceC1328a {
    public static ChangeQuickRedirect a;
    final com.sankuai.waimai.store.platform.domain.manager.poi.a b;
    final SCPageConfig c;
    public View d;
    public ListView e;
    private com.sankuai.waimai.store.shopping.cart.contract.a f;
    private TextView g;
    private TextView h;
    private com.sankuai.waimai.store.shopping.cart.adapter.a i;
    private TextView j;
    private FrameLayout k;
    private b l;
    private GoodDetailResponse m;

    public f(@NonNull Context context, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, SCPageConfig sCPageConfig, com.sankuai.waimai.store.shopping.cart.contract.a aVar2, GoodDetailResponse goodDetailResponse) {
        super(context);
        Object[] objArr = {context, aVar, sCPageConfig, aVar2, goodDetailResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "870f9a0272011bb36ce89f9686875fa1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "870f9a0272011bb36ce89f9686875fa1");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2acdb87a4d3970c7b979fc67d454b7bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2acdb87a4d3970c7b979fc67d454b7bb");
            return;
        }
        super.onViewCreated();
        this.d = this.mView.findViewById(R.id.layout_shop_cart);
        this.e = (ListView) this.mView.findViewById(R.id.list_shop_cart);
        this.k = (FrameLayout) this.mView.findViewById(R.id.shop_cart_risk_info);
        this.g = (TextView) this.mView.findViewById(R.id.txt_cart_name);
        this.j = (TextView) this.mView.findViewById(R.id.txt_cart_hint);
        this.h = (TextView) this.mView.findViewById(R.id.btn_clear);
        this.i = new com.sankuai.waimai.store.shopping.cart.adapter.a(this, this.b, this.c, this.m);
        this.e.setAdapter((ListAdapter) this.i);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6fcded871f542cdce43331e85e52f73b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6fcded871f542cdce43331e85e52f73b");
        } else {
            this.d.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.shopping.cart.block.f.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "004fc25b99f3c312d8e0a5e568595cac", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "004fc25b99f3c312d8e0a5e568595cac");
                        return;
                    }
                    f fVar = f.this;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = f.a;
                    if (PatchProxy.isSupport(objArr4, fVar, changeQuickRedirect4, false, "b0a013ec8896b548449a54bdd129225b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, fVar, changeQuickRedirect4, false, "b0a013ec8896b548449a54bdd129225b");
                    } else if (fVar.d.getVisibility() == 0) {
                        com.sankuai.waimai.store.manager.judas.b.a(fVar.c.d, "b_bh3yobwi").a("poi_id", fVar.b.d()).a();
                        fVar.b();
                    }
                }
            });
            this.e.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.sankuai.waimai.store.shopping.cart.block.f.2
                public static ChangeQuickRedirect a;

                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    Object[] objArr3 = {adapterView, view, Integer.valueOf(i), new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "453a7061ce634850467799ff7a3da945", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "453a7061ce634850467799ff7a3da945");
                        return;
                    }
                    View findViewById = view.findViewById(R.id.layout_food_item);
                    if (findViewById != null) {
                        findViewById.performClick();
                    }
                }
            });
            this.h.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.shopping.cart.block.f.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "61440187bcdf27632856980f51330e42", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "61440187bcdf27632856980f51330e42");
                        return;
                    }
                    com.sankuai.waimai.store.manager.judas.b.a(f.this.c.d, "b_t72u5rml").a("poi_id", f.this.b.d()).a();
                    com.sankuai.waimai.store.order.a.e().a(f.this.b.d(), (com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b) null);
                    com.sankuai.waimai.store.order.a.e().c(f.this.b.d());
                }
            });
        }
        Context context = this.mContext;
        Object[] objArr3 = {context};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4f0263c97d9cac39b4e6c7302230384d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4f0263c97d9cac39b4e6c7302230384d");
            return;
        }
        this.l = new b(context, this.b, this.c, this.f);
        this.l.createAndReplaceView(this.k);
    }

    public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "328ffc3094fdd4207e4d536919f7de24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "328ffc3094fdd4207e4d536919f7de24");
            return;
        }
        List<com.sankuai.waimai.store.platform.domain.core.order.a> a2 = new com.sankuai.waimai.store.shopping.cart.e().a(bVar);
        this.l.a(bVar != null ? bVar.d().getShopCartDrugRisk() : new ShopCartApiModel.a());
        if (com.sankuai.waimai.foundation.utils.b.b(a2)) {
            b();
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fae5d317dcfff689c6ed3697a0e10e7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fae5d317dcfff689c6ed3697a0e10e7e");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6cc9d9142d984a71d1c88462ac724ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6cc9d9142d984a71d1c88462ac724ed");
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
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e61964231e29aed98ee6a321395c556", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e61964231e29aed98ee6a321395c556");
            return;
        }
        this.d.setVisibility(0);
        if (!TextUtils.isEmpty(d())) {
            com.sankuai.waimai.store.manager.judas.b.b(this.c.d, "b_waimai_9vh9z4fm_mv").a("poi_id", this.b.d()).a();
        }
        b bVar = this.l;
        Object[] objArr2 = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "dd65cd072083405fac1834ed45097d0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "dd65cd072083405fac1834ed45097d0f");
        } else {
            bVar.b.a(true);
        }
    }

    @Override // com.sankuai.waimai.store.shopping.cart.adapter.a.InterfaceC1328a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e64b828065c6ba25ab979e7c78779340", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e64b828065c6ba25ab979e7c78779340");
            return;
        }
        com.sankuai.waimai.store.manager.judas.b.a(this.c.d, "b_waimai_c22mzzp1_mc").a("poi_id", this.b.d()).a();
        com.sankuai.waimai.store.order.a e = com.sankuai.waimai.store.order.a.e();
        long f = this.b.f();
        Object[] objArr2 = {new Long(f)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.order.a.a;
        if (PatchProxy.isSupport(objArr2, e, changeQuickRedirect2, false, "92e510f30c8fb50e08c7666bf652b1e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, e, changeQuickRedirect2, false, "92e510f30c8fb50e08c7666bf652b1e0");
        } else {
            e.g(String.valueOf(f));
        }
    }

    private String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4c8159b1dc0fcaa32868f115beaa4f6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4c8159b1dc0fcaa32868f115beaa4f6");
        }
        com.sankuai.waimai.store.platform.domain.core.shopcart.b k = com.sankuai.waimai.store.order.a.e().k(this.b.d());
        return k.t == null ? "" : k.t.getTotalWeightText();
    }
}
