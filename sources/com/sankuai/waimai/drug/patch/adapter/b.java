package com.sankuai.waimai.drug.patch.adapter;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.i;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.shop.model.PriceOptAB;
import com.sankuai.waimai.store.widgets.recycler.e;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.sankuai.waimai.store.widgets.recycler.a<e> {
    public static ChangeQuickRedirect a;
    public final List<a> b;
    @NonNull
    com.sankuai.waimai.drug.patch.contract.a c;
    @NonNull
    protected final com.sankuai.waimai.store.expose.a<Integer> d;
    private com.sankuai.waimai.store.platform.domain.manager.poi.a e;
    @NonNull
    private final com.sankuai.waimai.drug.patch.contract.c f;
    @NonNull
    private final com.sankuai.waimai.store.shopping.cart.contract.a g;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class a {
        public int a;
        public List<GoodsSpu> b;
        public com.sankuai.waimai.drug.model.a c;
        public String d;
        public int e;
        public PriceOptAB f;
    }

    public b(com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, @NonNull com.sankuai.waimai.drug.patch.contract.c cVar, com.sankuai.waimai.store.shopping.cart.contract.a aVar2, com.sankuai.waimai.drug.patch.contract.a aVar3) {
        Object[] objArr = {aVar, cVar, aVar2, aVar3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ca8278c8687aef40c2471e340bf0f6c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ca8278c8687aef40c2471e340bf0f6c");
            return;
        }
        this.b = new ArrayList();
        this.e = aVar;
        this.f = cVar;
        this.g = aVar2;
        this.c = aVar3;
        this.d = new com.sankuai.waimai.store.expose.a<Integer>() { // from class: com.sankuai.waimai.drug.patch.adapter.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.expose.a
            public final /* synthetic */ boolean a(View view, Integer num) {
                a aVar4;
                Integer num2 = num;
                Object[] objArr2 = {view, num2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fc193fc163e50a0954ac27abfe735a0b", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fc193fc163e50a0954ac27abfe735a0b")).booleanValue();
                }
                if (view != null && num2 != null && (aVar4 = (a) com.sankuai.shangou.stone.util.a.a((List<Object>) b.this.b, num2.intValue())) != null && aVar4.a == 0 && b.this.c != null) {
                    b.this.c.a(aVar4.c, aVar4.e);
                }
                return true;
            }
        };
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cf21a13551daca0bc2eeded0c1ad786", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cf21a13551daca0bc2eeded0c1ad786")).intValue() : com.sankuai.shangou.stone.util.a.a((List) this.b);
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63a6d72acda638729cf1296b84de7904", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63a6d72acda638729cf1296b84de7904")).intValue();
        }
        a aVar = (a) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, i);
        if (aVar != null) {
            return aVar.a;
        }
        return 2;
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final e a(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a58c2d561df2c37b72d3763682333302", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a58c2d561df2c37b72d3763682333302");
        }
        switch (i) {
            case 0:
                return new com.sankuai.waimai.drug.adapter.c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_drug_shopcart_patchwork_layout_combination, (ViewGroup) null), this.e, this.c);
            case 1:
                return new com.sankuai.waimai.drug.patch.viewHolder.a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_drug_shopcart_patchwork_layout_hot_sale, (ViewGroup) null), this.f, this.c);
            default:
                return new c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_drug_shopcart_patchwork_layout_combination_title, (ViewGroup) null));
        }
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final void a(e eVar, int i) {
        Object[] objArr = {eVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "939874f404a9d6c40558ba79b0cd86b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "939874f404a9d6c40558ba79b0cd86b7");
            return;
        }
        a aVar = this.b.get(i);
        if (aVar == null) {
            return;
        }
        if (eVar instanceof com.sankuai.waimai.drug.patch.viewHolder.a) {
            com.sankuai.waimai.drug.patch.viewHolder.a aVar2 = (com.sankuai.waimai.drug.patch.viewHolder.a) eVar;
            List<GoodsSpu> list = aVar.b;
            PriceOptAB priceOptAB = aVar.f;
            Object[] objArr2 = {list, priceOptAB};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.drug.patch.viewHolder.a.a;
            if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "f646985bc0f889890b9e6c1bd756e845", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "f646985bc0f889890b9e6c1bd756e845");
                return;
            }
            aVar2.e = priceOptAB;
            aVar2.a();
            aVar2.b.clear();
            if (!com.sankuai.shangou.stone.util.a.b(list)) {
                aVar2.b.addAll(list);
            }
            aVar2.c.m();
        } else if (eVar instanceof com.sankuai.waimai.drug.adapter.c) {
            final com.sankuai.waimai.drug.adapter.c cVar = (com.sankuai.waimai.drug.adapter.c) eVar;
            final com.sankuai.waimai.drug.model.a aVar3 = aVar.c;
            final int i2 = aVar.e;
            Object[] objArr3 = {aVar3, Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.drug.adapter.c.a;
            if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "6fb763f4f44583394b6842ea50244252", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "6fb763f4f44583394b6842ea50244252");
            } else if (aVar3 != null) {
                cVar.g = aVar3.f;
                cVar.f.a(aVar3.f, aVar3.a);
                cVar.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.drug.adapter.c.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr4 = {view};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1770d09a4c6d1101ca37e49e211666b7", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1770d09a4c6d1101ca37e49e211666b7");
                        } else if (cVar.h != null) {
                            cVar.h.a(cVar.g, aVar3.a, i2);
                        }
                    }
                });
                u.a(cVar.b, aVar3.e);
                if (aVar3.c >= 0.0d) {
                    u.a(cVar.c, cVar.itemView.getContext().getString(R.string.wm_sc_goods_detail_price_no_space, i.a(aVar3.c)));
                } else {
                    cVar.c.setVisibility(8);
                }
                u.a(cVar.d, i.a(aVar3.d));
                u.a(cVar.e, cVar.b(aVar3));
                cVar.a(aVar3);
            }
        } else if (eVar instanceof c) {
            c cVar2 = (c) eVar;
            String str = aVar.d;
            Object[] objArr4 = {str};
            ChangeQuickRedirect changeQuickRedirect4 = c.a;
            if (PatchProxy.isSupport(objArr4, cVar2, changeQuickRedirect4, false, "70a38d4616a431ae7a4ce47c46a2e5f9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, cVar2, changeQuickRedirect4, false, "70a38d4616a431ae7a4ce47c46a2e5f9");
            } else {
                u.a(cVar2.b, str);
            }
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74a7c725279c1d7db34fe84138fc6159", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74a7c725279c1d7db34fe84138fc6159");
        } else {
            this.d.a();
        }
    }
}
