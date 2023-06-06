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
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.expose.v2.entity.c;
import com.sankuai.waimai.store.goods.list.views.cell.view.SpuFlowerCellView;
import com.sankuai.waimai.store.newwidgets.list.o;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.poilist.viewholders.f;
import com.sankuai.waimai.store.repository.model.PoiCardInfo;
import com.sankuai.waimai.store.repository.model.SpuInfo;
import com.sankuai.waimai.store.repository.model.f;
import com.sankuai.waimai.store.router.g;
import com.sankuai.waimai.store.util.h;
import com.sankuai.waimai.store.widgets.recycler.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.widgets.recycler.b<e> {
    public static ChangeQuickRedirect a;
    @NonNull
    public final List<f> b;
    final com.sankuai.waimai.store.param.a c;
    final SCBaseActivity d;
    private final LayoutInflater g;
    @Nullable
    private final com.sankuai.waimai.store.poilist.mach.d h;
    private com.sankuai.waimai.store.cell.core.b i;

    public static /* synthetic */ com.sankuai.waimai.store.callback.a a(b bVar, f fVar, String str, int i) {
        Object[] objArr = {fVar, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "3b49021673effd82c10ab3e42db41e8c", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.callback.a) PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "3b49021673effd82c10ab3e42db41e8c");
        }
        if (bVar.c == null || fVar.b == null || fVar.b.spu == null || fVar.b.poi == null) {
            return null;
        }
        GoodsSpu goodsSpu = fVar.b.spu;
        Poi poi = fVar.b.poi;
        String str2 = bVar.c.l.get(bVar.c.f);
        com.sankuai.waimai.store.callback.a a2 = com.sankuai.waimai.store.manager.judas.b.a(bVar.c.G, str).a("poi_id", poi.getOfficialPoiId()).a("spu_id", Long.valueOf(goodsSpu.id)).a("index", Integer.valueOf(i)).a("cat_id", Long.valueOf(bVar.c.c)).a("sec_cat_id", bVar.c.f == null ? "" : bVar.c.f).a("sort", Long.valueOf(bVar.c.g)).a("filter", bVar.c.n()).a("delivery_fee", i.a(Double.valueOf(poi.shippingFee), Double.valueOf(0.0d)) ? bVar.d.getString(R.string.wm_sc_goods_label_delivery_fee_free) : "").a("delivery_time", poi.mtDeliveryTime == null ? "" : poi.mtDeliveryTime).a("score", Double.valueOf(poi.poiScore)).a("activity_type", Integer.valueOf(goodsSpu.activityType)).a("orig_price", Double.valueOf(goodsSpu.getOriginPrice())).a("current_price", Double.valueOf(goodsSpu.getMinPrice())).a("sale", Integer.valueOf(goodsSpu.monthSaled));
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        return a2.a("rank_trace_id", str2);
    }

    public b(@NonNull SCBaseActivity sCBaseActivity, @NonNull com.sankuai.waimai.store.param.a aVar, com.sankuai.waimai.store.poilist.mach.d dVar) {
        Object[] objArr = {sCBaseActivity, aVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42d33766dc5f3fd0d047a9b378f8eeb5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42d33766dc5f3fd0d047a9b378f8eeb5");
            return;
        }
        this.b = new ArrayList();
        this.i = new com.sankuai.waimai.store.cell.core.b() { // from class: com.sankuai.waimai.store.poi.list.newp.adapter.b.1
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
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8af32ecae9a02d08cf5191b306b9a15a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8af32ecae9a02d08cf5191b306b9a15a");
                    return;
                }
                f fVar = (f) com.sankuai.shangou.stone.util.a.a((List<Object>) b.this.b, i);
                if (fVar != null && (a2 = b.a(b.this, fVar, "b_waimai_7s9v2dsb_mc", i)) != null) {
                    a2.a();
                }
                if (p.a(goodsSpu) || TextUtils.isEmpty(goodsSpu.poiDetailScheme)) {
                    return;
                }
                com.sankuai.waimai.store.router.d.a(b.this.d, goodsSpu.poiDetailScheme);
            }

            @Override // com.sankuai.waimai.store.cell.core.b
            public final void a(GoodsSpu goodsSpu, int i) {
                Object[] objArr2 = {goodsSpu, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "29baacfbca215e63089eb31bc37f99d6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "29baacfbca215e63089eb31bc37f99d6");
                    return;
                }
                f fVar = (f) com.sankuai.shangou.stone.util.a.a((List<Object>) b.this.b, i);
                if (fVar == null) {
                    return;
                }
                com.sankuai.waimai.store.callback.a a2 = b.a(b.this, fVar, "b_waimai_ut4wmdjd_mc", i);
                if (a2 != null) {
                    a2.a();
                }
                g.a(b.this.d, fVar, b.this.c, 5, i);
            }

            @Override // com.sankuai.waimai.store.cell.core.b
            public final void a(GoodsSpu goodsSpu, final View view, h hVar, int i) {
                Object[] objArr2 = {goodsSpu, view, hVar, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "17766bb19b0cc1e56cdfa0895ee2df2c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "17766bb19b0cc1e56cdfa0895ee2df2c");
                    return;
                }
                com.sankuai.shangou.stone.util.log.a.b("addGoodsFromList,%s", goodsSpu);
                f fVar = (f) com.sankuai.shangou.stone.util.a.a((List<Object>) b.this.b, i);
                if (fVar == null) {
                    return;
                }
                com.sankuai.waimai.store.callback.a a2 = b.a(b.this, fVar, "b_waimai_fkgl4gx7_mc", i);
                if (a2 != null) {
                    a2.a();
                }
                if (fVar.b == null || fVar.b.poi == null) {
                    return;
                }
                com.sankuai.waimai.store.order.a.e().a(fVar.b.poi.id, goodsSpu, (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.getSkuList(), 0), (GoodsAttr[]) null, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b() { // from class: com.sankuai.waimai.store.poi.list.newp.adapter.b.1.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                    public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
                        Object[] objArr3 = {bVar};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1f4d6949938ec9a83c6de9c9ee5b8c3f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1f4d6949938ec9a83c6de9c9ee5b8c3f");
                            return;
                        }
                        com.sankuai.shangou.stone.util.log.a.b("addGoodsFromList,onSuccess,%s", bVar);
                        com.sankuai.waimai.store.shopping.cart.f.a().a(view, (ImageView) b.this.d.findViewById(R.id.btn_global_cart));
                    }

                    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                    public final void a(com.sankuai.waimai.store.exceptions.a aVar2) {
                        Object[] objArr3 = {aVar2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "44c0b3cb9e1636080558a7f1bfc100cf", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "44c0b3cb9e1636080558a7f1bfc100cf");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5f20cc88b5e0ad4abe9ae3c04bf1e4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5f20cc88b5e0ad4abe9ae3c04bf1e4b");
            return;
        }
        this.b.clear();
        if (!com.sankuai.shangou.stone.util.a.b(list)) {
            this.b.addAll(list);
        }
        m();
    }

    @MainThread
    public final void b(@Nullable List<f> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0e415075849465b7c03f06e8a9336c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0e415075849465b7c03f06e8a9336c5");
        } else if (com.sankuai.shangou.stone.util.a.b(list) || this.b == null) {
        } else {
            int c = com.sankuai.shangou.stone.util.a.c(this.b);
            this.b.addAll(list);
            if (o.b()) {
                c(c, com.sankuai.shangou.stone.util.a.c(list));
            } else {
                m();
            }
        }
    }

    public final f b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "473c39bee110c593eb38ef16e1c13457", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "473c39bee110c593eb38ef16e1c13457") : (f) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, i);
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3a222deaff6c2704e47dfc9d8715a0d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3a222deaff6c2704e47dfc9d8715a0d")).intValue() : com.sankuai.shangou.stone.util.a.a((List) this.b);
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final int a(int i) {
        boolean z;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c47b2fb74725ad6421ac6a0b288d10e9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c47b2fb74725ad6421ac6a0b288d10e9")).intValue();
        }
        f b = b(i);
        if (b == null) {
            return 101;
        }
        if (b.d == 7) {
            return 7;
        }
        if (b.d == 8) {
            return 8;
        }
        PoiCardInfo poiCardInfo = b.i;
        if (poiCardInfo != null && poiCardInfo.cardType == 1) {
            BaseModuleDesc baseModuleDesc = poiCardInfo.moduleDesc;
            Object[] objArr2 = {baseModuleDesc};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8c05dca84713916d93c37d1c10ec0a22", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8c05dca84713916d93c37d1c10ec0a22")).booleanValue();
            } else {
                z = baseModuleDesc != null && "mach".equals(baseModuleDesc.nativeId);
            }
            if (z) {
                return 6;
            }
        }
        if (poiCardInfo == null || poiCardInfo.cardType != 2) {
            if (b.a() == null || b.a().containerTemplate == null) {
                return 101;
            }
            int i2 = b.a().containerTemplate.type;
            return (i2 == 3 || i2 == 2) ? 102 : 101;
        }
        return 10;
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final e a(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "808c0137867300b27021c005fb729cca", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "808c0137867300b27021c005fb729cca");
        }
        switch (i) {
            case 6:
                return new com.sankuai.waimai.store.poilist.viewholders.f(new f.a(this.d, this.c));
            case 7:
                SpuFlowerCellView spuFlowerCellView = new SpuFlowerCellView(this.d);
                spuFlowerCellView.setInDataParam(this.c);
                spuFlowerCellView.setActionCallback(this.i);
                return new com.sankuai.waimai.store.poilist.viewholders.d(spuFlowerCellView, this.c);
            case 8:
                return new com.sankuai.waimai.store.poilist.viewholders.c(LayoutInflater.from(this.d).inflate(R.layout.wm_st_view_flower_scene_cell, viewGroup, false), this.c);
            default:
                com.sankuai.waimai.store.poilist.viewholders.g gVar = new com.sankuai.waimai.store.poilist.viewholders.g(LayoutInflater.from(this.d).inflate(R.layout.wm_sc_poi_verticality_channel_recycle_mach_item, viewGroup, false));
                com.sankuai.waimai.store.poilist.viewholders.g gVar2 = gVar;
                gVar2.b = this.h;
                gVar2.d = this.c;
                return gVar;
        }
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final void a(e eVar, final int i) {
        long j;
        int i2 = 0;
        Object[] objArr = {eVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c35d9942097acc8709c036837602694a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c35d9942097acc8709c036837602694a");
            return;
        }
        final com.sankuai.waimai.store.repository.model.f fVar = (com.sankuai.waimai.store.repository.model.f) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, i);
        if (fVar == null) {
            return;
        }
        if (eVar instanceof com.sankuai.waimai.store.poilist.viewholders.d) {
            SpuInfo spuInfo = fVar.b;
            if (spuInfo == null) {
                return;
            }
            ((com.sankuai.waimai.store.poilist.viewholders.d) eVar).a(spuInfo, i);
        } else if (eVar instanceof com.sankuai.waimai.store.poilist.viewholders.c) {
            ((com.sankuai.waimai.store.poilist.viewholders.c) eVar).a(fVar, i);
        } else {
            PoiCardInfo poiCardInfo = fVar.i;
            if (poiCardInfo == null || poiCardInfo.moduleDesc == null) {
                return;
            }
            if (poiCardInfo.cardType == 1) {
                if (eVar instanceof com.sankuai.waimai.store.poilist.viewholders.f) {
                    com.sankuai.waimai.store.poilist.viewholders.f fVar2 = (com.sankuai.waimai.store.poilist.viewholders.f) eVar;
                    Object[] objArr2 = {poiCardInfo, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.poilist.viewholders.f.a;
                    if (PatchProxy.isSupport(objArr2, fVar2, changeQuickRedirect2, false, "e70ef8133bb9d0061a2691879140e8fa", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, fVar2, changeQuickRedirect2, false, "e70ef8133bb9d0061a2691879140e8fa");
                    } else {
                        fVar2.b.c(poiCardInfo.moduleDesc, i);
                    }
                }
            } else if (poiCardInfo.cardType == 2) {
                if (fVar.j == null && this.h != null) {
                    fVar.j = this.h.a(poiCardInfo, i);
                }
                if (fVar.j == null) {
                    return;
                }
                a aVar = new a(eVar.itemView, System.identityHashCode(fVar) + CommonConstant.Symbol.COLON + i);
                aVar.a(new c.a() { // from class: com.sankuai.waimai.store.poi.list.newp.adapter.b.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.expose.v2.entity.c.a
                    public final void a() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fef59dc6104dac7f2df316f8bf19a3ed", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fef59dc6104dac7f2df316f8bf19a3ed");
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
                com.sankuai.waimai.store.poilist.viewholders.g gVar = (com.sankuai.waimai.store.poilist.viewholders.g) eVar;
                gVar.a(fVar.j, i);
                gVar.a(fVar);
                Object[] objArr3 = {fVar};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.poilist.viewholders.g.a;
                if (PatchProxy.isSupport(objArr3, gVar, changeQuickRedirect3, false, "40023d4d0eae8791a19b8ff2fca847f9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, gVar, changeQuickRedirect3, false, "40023d4d0eae8791a19b8ff2fca847f9");
                    return;
                }
                String str = "";
                if (fVar != null) {
                    if (fVar.a() != null) {
                        j = fVar.a().id;
                        i2 = fVar.a().subscribe;
                        str = fVar.a().poiIdStr;
                    } else if (fVar.i != null && fVar.i.moduleDesc != null && fVar.i.moduleDesc.jsonData != null) {
                        j = com.sankuai.waimai.store.poi.list.util.c.a(fVar.i.moduleDesc.jsonData);
                        i2 = com.sankuai.waimai.store.poilist.viewholders.g.a(fVar.i.moduleDesc);
                        str = com.sankuai.waimai.store.poi.list.util.c.b(fVar.i.moduleDesc.jsonData);
                        if (t.a(str)) {
                            str = com.sankuai.waimai.store.poi.list.util.c.d(fVar.i.moduleDesc.jsonData);
                        }
                    }
                    if ((j > 0 && t.a(str)) || gVar.c == null || gVar.c.l() == null) {
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("poi_id", Long.valueOf(j));
                    hashMap.put(FoodDetailNetWorkPreLoader.URI_POI_STR, str);
                    hashMap.put("subscribe", Integer.valueOf(i2));
                    gVar.c.l().sendJsEvent("sg_poi_subscribe_changed", hashMap);
                }
                j = 0;
                if (j > 0) {
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("poi_id", Long.valueOf(j));
                hashMap2.put(FoodDetailNetWorkPreLoader.URI_POI_STR, str);
                hashMap2.put("subscribe", Integer.valueOf(i2));
                gVar.c.l().sendJsEvent("sg_poi_subscribe_changed", hashMap2);
            }
        }
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4f57116e5560b69357ccfb4ab3bf950", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4f57116e5560b69357ccfb4ab3bf950");
        } else {
            d.a(view);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a, com.sankuai.waimai.store.widgets.recycler.i
    public final void a(@NonNull @NotNull e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28caced07b2513244eb3c67b53e4fe0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28caced07b2513244eb3c67b53e4fe0d");
        } else if (eVar instanceof com.sankuai.waimai.store.poilist.viewholders.g) {
            ((com.sankuai.waimai.store.poilist.viewholders.g) eVar).a();
        }
    }
}
