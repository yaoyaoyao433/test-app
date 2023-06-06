package com.sankuai.waimai.store.poilist.view.sub;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.business.widgets.layout.ScrollProductLayout;
import com.sankuai.waimai.store.platform.domain.core.poi.Product;
import com.sankuai.waimai.store.poilist.view.sub.d;
import com.sankuai.waimai.store.repository.model.LastBoughtProduct;
import com.sankuai.waimai.store.repository.model.PoiVerticality;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends b {
    public static ChangeQuickRedirect c;
    public com.sankuai.waimai.store.expose.v2.entity.b d;
    protected com.sankuai.waimai.store.poilist.view.a e;
    private ViewStub f;
    private ScrollProductLayout g;
    private com.sankuai.waimai.store.base.statistic.a h;
    private int i;
    private ViewGroup j;
    private ViewGroup k;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final int a() {
        return R.layout.wm_sc_sugoo_recommend_poi_list_adapter;
    }

    public e(com.sankuai.waimai.store.base.statistic.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a830b2e5a7124abd2cbd7ea13450e759", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a830b2e5a7124abd2cbd7ea13450e759");
        } else {
            this.h = aVar;
        }
    }

    @Override // com.sankuai.waimai.store.poilist.view.sub.b, com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82f29ad94498561ee994edd2b3dc0de5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82f29ad94498561ee994edd2b3dc0de5");
            return;
        }
        super.a(view);
        this.e = (com.sankuai.waimai.store.poilist.view.a) b();
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c4b7948a529a9bf4b26a61439dc52bfa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c4b7948a529a9bf4b26a61439dc52bfa");
        } else {
            this.f = (ViewStub) view.findViewById(R.id.vs_products_layout);
            this.j = (ViewGroup) view.findViewById(R.id.container);
            this.k = (ViewGroup) view.findViewById(R.id.root_layout);
        }
        if (this.h != null) {
            this.d = this.h.a(view);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.waimai.store.poilist.view.sub.b, com.sankuai.waimai.store.newwidgets.list.g
    public final void a(final PoiVerticality poiVerticality, final int i) {
        boolean z;
        int i2;
        Object[] objArr = {poiVerticality, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ca9463804271c542b78a3eed426df22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ca9463804271c542b78a3eed426df22");
            return;
        }
        Object[] objArr2 = {poiVerticality, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3e144ef359e3b4dea1b6792024a691e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3e144ef359e3b4dea1b6792024a691e7");
        } else {
            Object[] objArr3 = {poiVerticality, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect3 = c;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "836159e64c65dcd08320f83ed181b266", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "836159e64c65dcd08320f83ed181b266");
            } else if (poiVerticality != null) {
                Object[] objArr4 = {poiVerticality, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect4 = c;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e53726afff131d022eebdf67a915f3a6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e53726afff131d022eebdf67a915f3a6");
                } else {
                    if (poiVerticality != null) {
                        List<LastBoughtProduct> list = poiVerticality.products;
                        Object[] objArr5 = {list, 3};
                        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.shangou.stone.util.a.a;
                        if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "50a8d05680cc3c21e10cfea09d2ec8ee", RobustBitConfig.DEFAULT_VALUE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "50a8d05680cc3c21e10cfea09d2ec8ee")).booleanValue();
                        } else {
                            z = com.sankuai.shangou.stone.util.a.b(list) || list.size() <= 3;
                        }
                        if (!z) {
                            if (this.g == null) {
                                this.g = (ScrollProductLayout) this.f.inflate();
                            }
                            u.a(this.g);
                            final Context context = this.p.getContext();
                            this.g.setItemClickListener(new com.sankuai.waimai.store.business.widgets.layout.a() { // from class: com.sankuai.waimai.store.poilist.view.sub.e.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.store.business.widgets.layout.a
                                public final void a(Product product, View view, int i3) {
                                    Object[] objArr6 = {product, view, Integer.valueOf(i3)};
                                    ChangeQuickRedirect changeQuickRedirect6 = a;
                                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "df8826b9c73aa7d689346007eecddbf5", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "df8826b9c73aa7d689346007eecddbf5");
                                    } else if (com.sankuai.waimai.store.util.b.a(context) || product == null || poiVerticality == null) {
                                    } else {
                                        com.sankuai.waimai.store.manager.judas.b.a(context, "b_waimai_sg_xmwt0dz3_mc").a("poi_id", poiVerticality.getOfficialPoiId()).a("index", Integer.valueOf(i)).a("spu_index", Integer.valueOf(i3)).a("spu_id", Long.valueOf(product.spuId)).a("sku_id", Long.valueOf(product.skuId)).a("stid", poiVerticality.specialStid).a();
                                        com.sankuai.waimai.store.router.d.a(context, product.scheme);
                                    }
                                }
                            });
                            this.g.setItemDataSetListener(new com.sankuai.waimai.store.business.widgets.layout.b() { // from class: com.sankuai.waimai.store.poilist.view.sub.e.2
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.store.business.widgets.layout.b
                                public final void a(Product product, View view, int i3) {
                                    Object[] objArr6 = {product, view, Integer.valueOf(i3)};
                                    ChangeQuickRedirect changeQuickRedirect6 = a;
                                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "4c3ca5cad24f1c5e8e06f5b8775f7d02", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "4c3ca5cad24f1c5e8e06f5b8775f7d02");
                                    } else if (!(e.this.p.getContext() instanceof Activity) || com.sankuai.waimai.store.util.b.a(context) || com.sankuai.waimai.store.util.b.a(context) || !(context instanceof com.sankuai.waimai.store.expose.v2.a)) {
                                    } else {
                                        com.sankuai.waimai.store.expose.v2.entity.b a2 = com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) context, view);
                                        if (a2 == null) {
                                            a2 = new com.sankuai.waimai.store.expose.v2.entity.c("b_waimai_sg_xmwt0dz3_mv", view);
                                            com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) context, a2);
                                        } else {
                                            a2.g();
                                        }
                                        a2.e = product.toString();
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("poi_id", poiVerticality.getOfficialPoiId());
                                        hashMap.put("index", Integer.valueOf(i));
                                        hashMap.put("spu_index", Integer.valueOf(i3));
                                        hashMap.put("spu_id", Long.valueOf(product.spuId));
                                        hashMap.put("sku_id", Long.valueOf(product.skuId));
                                        hashMap.put("stid", poiVerticality.specialStid);
                                        a2.b(hashMap);
                                    }
                                }
                            });
                            this.g.setData(poiVerticality.products);
                        }
                    }
                    u.c(this.g);
                }
            }
        }
        super.a(poiVerticality, i);
        if (this.h != null) {
            Map<String, Object> a = a.a(poiVerticality, i);
            if (this.o instanceof d.b) {
                this.i = ((d.b) this.o).a();
                i2 = ((d.b) this.o).b();
            } else {
                i2 = 0;
            }
            a.put(DataConstants.INDEX, Integer.valueOf(this.i));
            a.put("is_have_sku", Boolean.valueOf(!com.sankuai.shangou.stone.util.a.b(poiVerticality.products)));
            this.h.a(this.d, i, a);
        } else {
            i2 = 0;
        }
        if (this.j != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.j.getLayoutParams();
            marginLayoutParams.topMargin = h.a(this.j.getContext(), i == 0 ? 0.0f : 4.0f);
            this.j.setLayoutParams(marginLayoutParams);
        }
        if (this.k != null) {
            this.k.setPadding(0, h.a(this.k.getContext(), 4.0f), 0, h.a(this.k.getContext(), i != i2 - 1 ? 12.0f : 4.0f));
        }
    }

    @Override // com.sankuai.waimai.store.poilist.view.sub.b
    public final com.sankuai.waimai.store.poilist.view.b a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b7fc4ebfe63e997075e9a6fecdb36b3", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.poilist.view.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b7fc4ebfe63e997075e9a6fecdb36b3") : new com.sankuai.waimai.store.poilist.view.d(context);
    }
}
