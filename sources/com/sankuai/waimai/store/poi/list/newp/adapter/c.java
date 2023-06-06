package com.sankuai.waimai.store.poi.list.newp.adapter;

import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.i;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.expose.v2.entity.c;
import com.sankuai.waimai.store.goods.list.views.cell.view.SpuFlowerCellView;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.poilist.viewholders.e;
import com.sankuai.waimai.store.repository.model.PoiCardInfo;
import com.sankuai.waimai.store.repository.model.PoiVerticality;
import com.sankuai.waimai.store.repository.model.SpuInfo;
import com.sankuai.waimai.store.repository.model.f;
import com.sankuai.waimai.store.router.g;
import com.sankuai.waimai.store.util.h;
import com.sankuai.waimai.store.widgets.recycler.e;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.store.widgets.recycler.b<e> {
    public static ChangeQuickRedirect a;
    @NonNull
    final List<f> b;
    final com.sankuai.waimai.store.param.a c;
    final SCBaseActivity d;
    private final LayoutInflater g;
    private com.sankuai.waimai.store.poilist.mach.d h;
    private com.sankuai.waimai.store.cell.core.b i;

    public static /* synthetic */ com.sankuai.waimai.store.callback.a a(c cVar, f fVar, String str, int i) {
        Object[] objArr = {fVar, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "9f2693380e14d64eb50cde5a706befe1", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.callback.a) PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "9f2693380e14d64eb50cde5a706befe1");
        }
        if (cVar.c == null || fVar.b == null || fVar.b.spu == null || fVar.b.poi == null) {
            return null;
        }
        GoodsSpu goodsSpu = fVar.b.spu;
        Poi poi = fVar.b.poi;
        String str2 = cVar.c.l.get(cVar.c.f);
        com.sankuai.waimai.store.callback.a a2 = com.sankuai.waimai.store.manager.judas.b.a(cVar.c.G, str).a("poi_id", poi.getOfficialPoiId()).a("spu_id", Long.valueOf(goodsSpu.id)).a("index", Integer.valueOf(i)).a("cat_id", Long.valueOf(cVar.c.c)).a("sec_cat_id", cVar.c.f == null ? "" : cVar.c.f).a("sort", Long.valueOf(cVar.c.g)).a("filter", cVar.c.n()).a("delivery_fee", i.a(Double.valueOf(poi.shippingFee), Double.valueOf(0.0d)) ? cVar.d.getString(R.string.wm_sc_goods_label_delivery_fee_free) : "").a("delivery_time", poi.mtDeliveryTime == null ? "" : poi.mtDeliveryTime).a("score", Double.valueOf(poi.poiScore)).a("activity_type", Integer.valueOf(goodsSpu.activityType)).a("orig_price", Double.valueOf(goodsSpu.getOriginPrice())).a("current_price", Double.valueOf(goodsSpu.getMinPrice())).a("sale", Integer.valueOf(goodsSpu.monthSaled));
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        return a2.a("rank_trace_id", str2);
    }

    public c(@NonNull SCBaseActivity sCBaseActivity, @NonNull com.sankuai.waimai.store.param.a aVar, com.sankuai.waimai.store.poilist.mach.d dVar) {
        Object[] objArr = {sCBaseActivity, aVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11a2fa0c4719a256bb0cd110bb449249", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11a2fa0c4719a256bb0cd110bb449249");
            return;
        }
        this.b = new ArrayList();
        this.i = new com.sankuai.waimai.store.cell.core.b() { // from class: com.sankuai.waimai.store.poi.list.newp.adapter.c.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.cell.core.b
            public final void a(GoodsSpu goodsSpu) {
            }

            @Override // com.sankuai.waimai.store.cell.core.b
            public final void b(GoodsSpu goodsSpu, int i) {
            }

            @Override // com.sankuai.waimai.store.cell.core.b
            public final void b(GoodsSpu goodsSpu, h hVar, int i) {
            }

            @Override // com.sankuai.waimai.store.cell.core.b
            public final void c(GoodsSpu goodsSpu, int i) {
            }

            @Override // com.sankuai.waimai.store.cell.core.b
            public final void a(GoodsSpu goodsSpu, h hVar, int i) {
                com.sankuai.waimai.store.callback.a a2;
                Object[] objArr2 = {goodsSpu, hVar, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "30f8be4d526ac9215631b8aa15c84480", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "30f8be4d526ac9215631b8aa15c84480");
                    return;
                }
                f fVar = (f) com.sankuai.shangou.stone.util.a.a((List<Object>) c.this.b, i);
                if (fVar != null && (a2 = c.a(c.this, fVar, "b_waimai_7s9v2dsb_mc", i)) != null) {
                    a2.a();
                }
                if (p.a(goodsSpu) || TextUtils.isEmpty(goodsSpu.poiDetailScheme)) {
                    return;
                }
                com.sankuai.waimai.store.router.d.a(c.this.d, goodsSpu.poiDetailScheme);
            }

            @Override // com.sankuai.waimai.store.cell.core.b
            public final void a(GoodsSpu goodsSpu, int i) {
                Object[] objArr2 = {goodsSpu, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cb9be77caa3f2a9e5fdf7e2374bf617c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cb9be77caa3f2a9e5fdf7e2374bf617c");
                    return;
                }
                f fVar = (f) com.sankuai.shangou.stone.util.a.a((List<Object>) c.this.b, i);
                if (fVar == null) {
                    return;
                }
                com.sankuai.waimai.store.callback.a a2 = c.a(c.this, fVar, "b_waimai_ut4wmdjd_mc", i);
                if (a2 != null) {
                    a2.a();
                }
                g.a(c.this.d, fVar, c.this.c, 5, i);
            }

            @Override // com.sankuai.waimai.store.cell.core.b
            public final void a(GoodsSpu goodsSpu, final View view, h hVar, int i) {
                Object[] objArr2 = {goodsSpu, view, hVar, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0bd2258169b8caf1d5af2eae694f702c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0bd2258169b8caf1d5af2eae694f702c");
                    return;
                }
                com.sankuai.shangou.stone.util.log.a.b("addGoodsFromList,%s", goodsSpu);
                f fVar = (f) com.sankuai.shangou.stone.util.a.a((List<Object>) c.this.b, i);
                if (fVar == null) {
                    return;
                }
                com.sankuai.waimai.store.callback.a a2 = c.a(c.this, fVar, "b_waimai_fkgl4gx7_mc", i);
                if (a2 != null) {
                    a2.a();
                }
                if (fVar.b == null || fVar.b.poi == null) {
                    return;
                }
                com.sankuai.waimai.store.order.a.e().a(fVar.b.poi.id, goodsSpu, (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.getSkuList(), 0), (GoodsAttr[]) null, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b() { // from class: com.sankuai.waimai.store.poi.list.newp.adapter.c.1.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                    public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
                        Object[] objArr3 = {bVar};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4863577ba3c119ed77be24727bff1bff", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4863577ba3c119ed77be24727bff1bff");
                            return;
                        }
                        com.sankuai.shangou.stone.util.log.a.b("addGoodsFromList,onSuccess,%s", bVar);
                        com.sankuai.waimai.store.shopping.cart.f.a().a(view, (ImageView) c.this.d.findViewById(R.id.btn_global_cart));
                    }

                    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                    public final void a(com.sankuai.waimai.store.exceptions.a aVar2) {
                        Object[] objArr3 = {aVar2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "63c15bf7631c9b54b040d68817e69aec", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "63c15bf7631c9b54b040d68817e69aec");
                            return;
                        }
                        com.sankuai.shangou.stone.util.log.a.b("addGoodsFromList,onFailure,%s", aVar2);
                        super.a(aVar2);
                    }
                });
            }
        };
        this.g = LayoutInflater.from(sCBaseActivity);
        this.d = sCBaseActivity;
        this.c = aVar;
        this.h = dVar;
    }

    @MainThread
    public final void a(@Nullable List<f> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9d58736babef984d410c667a1d0fae0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9d58736babef984d410c667a1d0fae0");
            return;
        }
        try {
            this.b.clear();
            if (!com.sankuai.shangou.stone.util.a.b(list)) {
                this.b.addAll(list);
            }
            m();
        } catch (Exception unused) {
        }
    }

    public final void b(List<f> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05b9f4e7f6e6354d6b2f297babcc7480", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05b9f4e7f6e6354d6b2f297babcc7480");
        } else if (list == null || this.b == null) {
        } else {
            int size = this.b.size();
            this.b.addAll(list);
            if (this.b.size() > size) {
                c(size, this.b.size() - size);
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "96b47d0e7621f53ad7f1c7503b8b89b0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "96b47d0e7621f53ad7f1c7503b8b89b0");
            } else if (this.b != null) {
                b(this.b.size(), i());
            }
        }
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "188418c03b7d1ca29ca04af158fc625b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "188418c03b7d1ca29ca04af158fc625b")).intValue() : com.sankuai.shangou.stone.util.a.a((List) this.b);
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final int a(int i) {
        boolean z = true;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "197ff5a88864070bb123040a5d6ec9b6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "197ff5a88864070bb123040a5d6ec9b6")).intValue();
        }
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        f fVar = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b9f62c7762081ffa39774aa6e7ca8366", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b9f62c7762081ffa39774aa6e7ca8366") : (f) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, i);
        if (fVar == null) {
            return 7;
        }
        if (fVar.d == -2147483643) {
            return PoiVerticality.TEMPLATE_SPU_TYPE_HEADER;
        }
        if (fVar.d == 7) {
            return 7;
        }
        if (fVar.d == 8) {
            return 8;
        }
        PoiCardInfo poiCardInfo = fVar.i;
        if (poiCardInfo != null && poiCardInfo.cardType == 1) {
            BaseModuleDesc baseModuleDesc = poiCardInfo.moduleDesc;
            Object[] objArr3 = {baseModuleDesc};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3dea6d34ca82f160f5a6de2cd432c6db", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3dea6d34ca82f160f5a6de2cd432c6db")).booleanValue();
            } else if (baseModuleDesc == null || !"mach".equals(baseModuleDesc.nativeId)) {
                z = false;
            }
            if (z) {
                return 6;
            }
        }
        return (poiCardInfo == null || poiCardInfo.cardType != 2) ? 7 : 10;
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final e a(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "937d76ed176a15a47f833d8ff4bf68a8", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "937d76ed176a15a47f833d8ff4bf68a8");
        }
        if (i == -2147483643) {
            com.sankuai.waimai.store.poilist.viewholders.g gVar = new com.sankuai.waimai.store.poilist.viewholders.g(LayoutInflater.from(this.d).inflate(R.layout.wm_sc_poi_channel_recycle_spu_header_mach_item, viewGroup, false));
            gVar.b = this.h;
            return gVar;
        } else if (i != 6) {
            if (i != 8) {
                if (i == 10) {
                    com.sankuai.waimai.store.poilist.viewholders.g gVar2 = new com.sankuai.waimai.store.poilist.viewholders.g(LayoutInflater.from(this.d).inflate(R.layout.wm_sc_poi_channel_recycle_mach_item, viewGroup, false));
                    com.sankuai.waimai.store.poilist.viewholders.g gVar3 = gVar2;
                    gVar3.b = this.h;
                    gVar3.d = this.c;
                    return gVar2;
                }
                SpuFlowerCellView spuFlowerCellView = new SpuFlowerCellView(this.d);
                spuFlowerCellView.setInDataParam(this.c);
                spuFlowerCellView.setActionCallback(this.i);
                return new com.sankuai.waimai.store.poilist.viewholders.d(spuFlowerCellView, this.c);
            }
            return new com.sankuai.waimai.store.poilist.viewholders.c(LayoutInflater.from(this.d).inflate(R.layout.wm_st_view_flower_scene_cell, viewGroup, false), this.c);
        } else {
            return new com.sankuai.waimai.store.poilist.viewholders.e(new e.a(this.d, this.c));
        }
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final void a(com.sankuai.waimai.store.widgets.recycler.e eVar, final int i) {
        Object[] objArr = {eVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d802c7268d0b348d1c677d7c8844433", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d802c7268d0b348d1c677d7c8844433");
            return;
        }
        final f fVar = (f) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, i);
        if (fVar == null) {
            return;
        }
        PoiCardInfo poiCardInfo = fVar.i;
        if (poiCardInfo != null && poiCardInfo.moduleDesc != null) {
            if (poiCardInfo.cardType == 1) {
                if (eVar instanceof com.sankuai.waimai.store.poilist.viewholders.e) {
                    ((com.sankuai.waimai.store.poilist.viewholders.e) eVar).a(poiCardInfo, i);
                }
            } else if (poiCardInfo.cardType == 2) {
                if (fVar.j == null) {
                    fVar.j = this.h.a(poiCardInfo, i);
                }
                com.sankuai.waimai.store.poilist.viewholders.g gVar = (com.sankuai.waimai.store.poilist.viewholders.g) eVar;
                View view = gVar.itemView;
                a aVar = new a(view, System.identityHashCode(fVar) + CommonConstant.Symbol.COLON + i);
                aVar.a(new c.a() { // from class: com.sankuai.waimai.store.poi.list.newp.adapter.c.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.expose.v2.entity.c.a
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "25c8051d8d7ee05e5e94a466c8ea5f49", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "25c8051d8d7ee05e5e94a466c8ea5f49");
                            return;
                        }
                        com.sankuai.waimai.mach.recycler.c cVar = fVar.j.b;
                        if (cVar != null) {
                            if (cVar.b() != null) {
                                cVar.b().a("index", Integer.valueOf(i));
                            }
                            cVar.e();
                        }
                    }
                });
                com.sankuai.waimai.store.expose.v2.b.a().a(this.d, aVar);
                gVar.a(fVar.j, i);
                gVar.a(fVar);
            }
        } else if (eVar instanceof com.sankuai.waimai.store.poilist.viewholders.d) {
            SpuInfo spuInfo = fVar.b;
            if (spuInfo == null) {
                return;
            }
            ((com.sankuai.waimai.store.poilist.viewholders.d) eVar).a(spuInfo, i);
        } else if (eVar instanceof com.sankuai.waimai.store.poilist.viewholders.c) {
            ((com.sankuai.waimai.store.poilist.viewholders.c) eVar).a(fVar, i);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a, com.sankuai.waimai.store.widgets.recycler.i
    public final void a(@NonNull com.sankuai.waimai.store.widgets.recycler.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "717c1b10b4a3118649c0b3a5f3460273", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "717c1b10b4a3118649c0b3a5f3460273");
        } else if (eVar instanceof com.sankuai.waimai.store.poilist.viewholders.g) {
            ((com.sankuai.waimai.store.poilist.viewholders.g) eVar).a();
        }
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b0e526e9ec5ad8d66750f1351683315", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b0e526e9ec5ad8d66750f1351683315");
        } else {
            d.a(view);
        }
    }
}
