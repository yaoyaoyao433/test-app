package com.sankuai.waimai.store.drug.goods.list.controller;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.util.LongSparseArray;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.store.drug.goods.list.helper.d;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.domain.core.tip.SCShareTip;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class i extends com.sankuai.waimai.store.drug.goods.list.base.e implements d.a {
    public static ChangeQuickRedirect c;
    final h d;
    public TextView e;
    private final f f;
    private final d g;
    private View h;
    private View i;
    private com.sankuai.waimai.imbase.d j;
    private e k;
    private View.OnClickListener l;

    public i(@NonNull com.sankuai.waimai.store.drug.goods.list.delegate.c cVar) {
        super(cVar);
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8246980b3c46f8f84a8ee5ed630632c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8246980b3c46f8f84a8ee5ed630632c0");
            return;
        }
        this.j = new com.sankuai.waimai.imbase.d() { // from class: com.sankuai.waimai.store.drug.goods.list.controller.i.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.imbase.d
            public final void updateUnReadCount(@NonNull LongSparseArray<Integer> longSparseArray) {
                Object[] objArr2 = {longSparseArray};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cbcc1ca83912f7e96a6934ed0ae3bce8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cbcc1ca83912f7e96a6934ed0ae3bce8");
                } else {
                    i.this.d.e();
                }
            }
        };
        this.l = new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.goods.list.controller.i.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4014a4555266ae646230a77644e32474", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4014a4555266ae646230a77644e32474");
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("poi_id", i.this.b.d());
                hashMap.put(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(i.this.b.v()));
                com.sankuai.waimai.store.manager.judas.b.a(i.this.a.b(), "b_610oD").b(hashMap).a();
                Context context = i.this.mContext;
                long g = i.this.b.g();
                String d = i.this.b.d();
                Poi poi = i.this.b.b;
                Object[] objArr3 = {context, new Long(g), d, poi};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.drug.util.d.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "95d6802b5ae27307810a26f03d497415", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "95d6802b5ae27307810a26f03d497415");
                    return;
                }
                String str = (poi == null || t.a(poi.poiSpuSaleText)) ? "" : poi.poiSpuSaleText;
                String str2 = (poi == null || t.a(poi.schemeForInshop)) ? "" : poi.schemeForInshop;
                Object[] objArr4 = {context, new Long(g), d, poi, str, str2};
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.drug.util.d.a;
                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "e57e24b5f221260d33b7f310129cf434", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "e57e24b5f221260d33b7f310129cf434");
                } else if (!t.a(str2)) {
                    com.sankuai.waimai.store.router.d.a().a(context, str2);
                } else {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("poi_search_placeholder", com.sankuai.waimai.store.drug.util.d.a(str));
                    hashMap2.put("poi_id", String.valueOf(g));
                    hashMap2.put(FoodDetailNetWorkPreLoader.URI_POI_STR, d);
                    String a2 = com.sankuai.waimai.store.router.a.a(com.sankuai.waimai.store.router.h.i, com.sankuai.waimai.store.router.a.a(hashMap2));
                    d.a a3 = com.sankuai.waimai.store.router.d.a().a(hashMap2);
                    if (poi != null) {
                        a3.a("arg_poi", (String) poi);
                    }
                    a3.a(context, a2);
                }
            }
        };
        this.d = new h(cVar);
        this.f = new f(cVar);
        this.g = new d(cVar);
        com.sankuai.waimai.imbase.manager.e.a().a(this.j);
    }

    @Override // com.sankuai.waimai.store.base.b
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5a3c8ddebb795a75f99ebe6142b0951", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5a3c8ddebb795a75f99ebe6142b0951");
        }
        View inflate = layoutInflater.inflate(a(), viewGroup, false);
        this.e = (TextView) inflate.findViewById(R.id.search_view);
        this.h = inflate.findViewById(R.id.view_background);
        this.i = inflate.findViewById(R.id.v_space_search);
        this.k = new e(this.a);
        this.f.a(inflate);
        this.d.a(inflate);
        this.g.a(inflate);
        this.k.a(inflate);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "efbcc1326a788631073ba20ccd0e3173", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "efbcc1326a788631073ba20ccd0e3173");
        } else {
            this.e.setOnClickListener(this.l);
            h hVar = this.d;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = c.a;
            if (PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect3, false, "3546d50f01b953d208f1cedcf3bf1907", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect3, false, "3546d50f01b953d208f1cedcf3bf1907");
            } else {
                hVar.a();
                hVar.f.a(new int[]{2, 6, 8});
            }
        }
        return inflate;
    }

    public int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2771c49aa9c73f005045d2958954acbe", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2771c49aa9c73f005045d2958954acbe")).intValue() : this.a.d().b.selfSellPoi ? R.layout.wm_drug_self_business_shop_action_bar : R.layout.wm_drug_goods_list_shop_action_bar;
    }

    public final void a(RestMenuResponse restMenuResponse) {
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "511ad2110a5415e8e63d725f12e16e97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "511ad2110a5415e8e63d725f12e16e97");
            return;
        }
        h hVar = this.d;
        SCShareTip poiShareTip = restMenuResponse.getPoiShareTip();
        List<Poi.LabelInfoListItem> shareLabelInfo = restMenuResponse.getPoi() != null ? restMenuResponse.getPoi().getShareLabelInfo() : null;
        hVar.d = poiShareTip;
        hVar.e = shareLabelInfo;
        SCPageConfig.a(9, 22, this.a.b(), 0L);
        d dVar = this.g;
        Object[] objArr2 = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect2 = d.e;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "8a66154de51c2f8969446bebcca05b42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "8a66154de51c2f8969446bebcca05b42");
        } else {
            dVar.f.setVisibility(0);
        }
        this.g.a(this.b.b.isFavorite());
        String str = restMenuResponse.getPoi().poiSpuSaleText;
        if (TextUtils.isEmpty(str)) {
            str = getContext().getString(R.string.wm_sc_common_search_tip_in_shop);
        }
        this.e.setHint(str);
        String stids = restMenuResponse.getStids();
        Object[] objArr3 = {stids};
        ChangeQuickRedirect changeQuickRedirect3 = c;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "55b60111412beebe95ba883d4c65d5d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "55b60111412beebe95ba883d4c65d5d3");
            return;
        }
        com.sankuai.waimai.store.expose.v2.entity.b bVar = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_wqkbtgvk_mv", this.e);
        bVar.a("if_med_poi", 0);
        bVar.a("poi_id", this.b.d());
        bVar.a("stid", stids);
        com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) this.mContext, bVar);
    }

    public final void a(float f) {
        float f2;
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8edf3cdedf5ab14c0154f3373e6b693", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8edf3cdedf5ab14c0154f3373e6b693");
            return;
        }
        double d = f;
        if (com.sankuai.shangou.stone.util.i.c(Double.valueOf(d), Double.valueOf(0.0d))) {
            f2 = 0.0f;
        } else {
            f2 = com.sankuai.shangou.stone.util.i.e(Double.valueOf(d), Double.valueOf(1.0d)) ? 1.0f : f;
        }
        this.h.setAlpha(f2);
        f fVar = this.f;
        Object[] objArr2 = {Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = f.b;
        if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "c5927fa43b8dea6e5cd7845402f2cbac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "c5927fa43b8dea6e5cd7845402f2cbac");
        } else {
            fVar.c.setColorFraction(1.0f - f2);
        }
        h hVar = this.d;
        Object[] objArr3 = {Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect3 = h.o;
        if (PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect3, false, "a17564e11dd90f51b80e4e7e7d03a43c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect3, false, "a17564e11dd90f51b80e4e7e7d03a43c");
        } else {
            hVar.p.setColorFraction(1.0f - f2);
        }
        d dVar = this.g;
        Object[] objArr4 = {Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect4 = d.e;
        if (PatchProxy.isSupport(objArr4, dVar, changeQuickRedirect4, false, "88572c9b0ea49957daf44393cfed0ae5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, dVar, changeQuickRedirect4, false, "88572c9b0ea49957daf44393cfed0ae5");
        } else {
            dVar.g = 1.0f - f2;
            dVar.f.setColorFraction(dVar.g);
        }
        if (f < 0.5f) {
            this.e.setBackgroundResource(R.drawable.wm_drug_poi_market_action_bar_bg_search);
        } else {
            this.e.setBackgroundResource(R.drawable.wm_drug_poi_market_action_bar_bg_search_select_gray);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.helper.d.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bb3333d5dc4d26031416433193981f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bb3333d5dc4d26031416433193981f9");
        } else if (this.i != null) {
            ViewGroup.LayoutParams layoutParams = this.i.getLayoutParams();
            layoutParams.width = i;
            this.i.setLayoutParams(layoutParams);
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4f1d0566c11e6f8fcde3898bd57a6e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4f1d0566c11e6f8fcde3898bd57a6e8");
            return;
        }
        com.sankuai.waimai.imbase.manager.e.a().b(this.j);
        d dVar = this.g;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "b400489aee4c8213f899ae6f484fee30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "b400489aee4c8213f899ae6f484fee30");
        } else {
            com.sankuai.waimai.store.drug.manager.collection.b a = com.sankuai.waimai.store.drug.manager.collection.b.a();
            Object[] objArr3 = {dVar};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.drug.manager.collection.b.a;
            if (PatchProxy.isSupport(objArr3, a, changeQuickRedirect3, false, "c57b22a7c467f47bae781293cc131483", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a, changeQuickRedirect3, false, "c57b22a7c467f47bae781293cc131483");
            } else if (a.b != null && a.b.contains(dVar)) {
                a.b.remove(dVar);
            }
        }
        h hVar = this.d;
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = c.a;
        if (PatchProxy.isSupport(objArr4, hVar, changeQuickRedirect4, false, "47eeb2076b863ba05f2913106eeb0e98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, hVar, changeQuickRedirect4, false, "47eeb2076b863ba05f2913106eeb0e98");
            return;
        }
        hVar.n.m().a("restaurant_menu_service");
        com.sankuai.waimai.drug.im.number.a a2 = com.sankuai.waimai.drug.im.number.a.a();
        com.sankuai.waimai.store.im.number.c cVar = hVar.h;
        Object[] objArr5 = {cVar};
        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.drug.im.number.a.a;
        if (PatchProxy.isSupport(objArr5, a2, changeQuickRedirect5, false, "289956bb6d0bb2ca7297092e0c7376a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, a2, changeQuickRedirect5, false, "289956bb6d0bb2ca7297092e0c7376a7");
        } else {
            a2.b.remove(cVar);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.helper.d.a
    public final void b(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bbe40bf36c88b44b1ca7de606ef5610", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bbe40bf36c88b44b1ca7de606ef5610");
            return;
        }
        e eVar = this.k;
        Object[] objArr2 = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "a28453b7d5024179e2b93c40d96c7848", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "a28453b7d5024179e2b93c40d96c7848");
        } else {
            u.a(eVar.b, f);
        }
    }
}
