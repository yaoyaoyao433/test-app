package com.sankuai.waimai.business.restaurant.poicontainer.pga.baseblock;

import android.content.Context;
import android.support.constraint.R;
import android.support.v4.app.FragmentTransaction;
import com.google.gson.JsonObject;
import com.meituan.android.cube.pga.action.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.framework.g;
import com.sankuai.waimai.business.restaurant.poicontainer.WMRestaurantActivity;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends g<com.meituan.android.cube.pga.view.a, b, com.sankuai.waimai.business.restaurant.poicontainer.pga.b> {
    public static ChangeQuickRedirect r;
    public MPNestedContainerFragment t;
    private JsonObject u;
    private List<GoodsSpu> v;
    private String w;
    private com.sankuai.waimai.business.restaurant.poicontainer.machpro.notification.a x;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99050cd44749f1a3f741992e88f67da6", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99050cd44749f1a3f741992e88f67da6") : new b();
    }

    public a(com.sankuai.waimai.business.restaurant.poicontainer.pga.b bVar, JsonObject jsonObject) {
        super(bVar);
        Object[] objArr = {bVar, jsonObject};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4966157015ef2057e44681db25f5e4b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4966157015ef2057e44681db25f5e4b");
            return;
        }
        this.w = "mach_pro_waimai_restaurant_page_new";
        this.u = jsonObject;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = r;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "90dbb1fc9e977fa2586c31700263787a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "90dbb1fc9e977fa2586c31700263787a");
        } else if (this.x == null) {
            this.x = new com.sankuai.waimai.business.restaurant.poicontainer.machpro.notification.a((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F());
            this.x.a((com.meituan.android.cube.pga.action.c) new com.meituan.android.cube.pga.action.c<com.sankuai.waimai.business.restaurant.base.config.a, JsonObject>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.pga.baseblock.a.6
                @Override // com.meituan.android.cube.pga.action.c
                public final /* bridge */ /* synthetic */ JsonObject a(com.sankuai.waimai.business.restaurant.base.config.a aVar) {
                    return aVar.a;
                }
            });
            b((com.meituan.android.cube.pga.block.b) this.x);
            this.x.c(this.u);
        }
        ad.c(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.pga.baseblock.a.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c4df3e43c76a09540c3be0255022a9a5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c4df3e43c76a09540c3be0255022a9a5");
                    return;
                }
                a.this.M();
                if (a.this.x != null) {
                    a.this.x.h = a.this.t;
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.support.v4.app.FragmentActivity, android.arch.lifecycle.f] */
    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98ced70b2d29189b29af3d956b13b2fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98ced70b2d29189b29af3d956b13b2fd");
            return;
        }
        super.s();
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).K.m.a(new com.meituan.android.cube.pga.action.b<List<GoodsSpu>>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.pga.baseblock.a.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(List<GoodsSpu> list) {
                List<GoodsSpu> list2 = list;
                Object[] objArr2 = {list2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8f96884d23cb3ef5f07161654e713764", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8f96884d23cb3ef5f07161654e713764");
                } else {
                    a.this.v = list2;
                }
            }
        }).a(J());
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).K.n.b = new d<List<GoodsSpu>>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.pga.baseblock.a.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ List<GoodsSpu> a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1dd77a78fddcdbbb1f057785b843e4ae", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1dd77a78fddcdbbb1f057785b843e4ae") : a.this.v;
            }
        };
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).I.j.a().b.a(l(), new com.sankuai.waimai.business.restaurant.framework.backpress.a() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.pga.baseblock.a.4
            public static ChangeQuickRedirect b;

            @Override // com.sankuai.waimai.business.restaurant.framework.backpress.a
            public final boolean b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fdea30bda77ebafebf4aa76771341c00", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fdea30bda77ebafebf4aa76771341c00")).booleanValue();
                }
                if (a.this.t != null) {
                    return a.this.t.aD_();
                }
                return false;
            }
        });
    }

    public final void a(JsonObject jsonObject) {
        Object[] objArr = {jsonObject};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "555686f82403ac41b3855aafee72291e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "555686f82403ac41b3855aafee72291e");
            return;
        }
        this.u = jsonObject;
        String b = b(jsonObject);
        if (!b.equals(this.w)) {
            this.w = b;
            M();
            if (this.x != null) {
                this.x.h = this.t;
            }
        }
        if (this.t != null) {
            this.t.a(jsonObject);
        }
    }

    private String b(JsonObject jsonObject) {
        boolean z = false;
        Object[] objArr = {jsonObject};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c1a242c69b38da6ec36b7d10e5a6fc2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c1a242c69b38da6ec36b7d10e5a6fc2");
        }
        try {
            if (jsonObject.get("app_model").getAsLong() == 1) {
                z = true;
            }
        } catch (Exception unused) {
        }
        return z ? "mach_pro_waimai_restaurant_elder_page" : "mach_pro_waimai_restaurant_page_new";
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final com.meituan.android.cube.pga.view.a z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "102d07192405c07f4b8ebe08f04b5e26", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.view.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "102d07192405c07f4b8ebe08f04b5e26") : new com.meituan.android.cube.pga.view.a(m(), this.h) { // from class: com.sankuai.waimai.business.restaurant.poicontainer.pga.baseblock.a.5
            @Override // com.meituan.android.cube.pga.view.a
            public final int d() {
                return R.layout.page_mach_pro_block;
            }
        };
    }

    @Override // com.sankuai.waimai.business.restaurant.framework.g, com.meituan.android.cube.core.f
    public final void bE_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b61c4cdab3f82d6cf2e2a34294ee17a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b61c4cdab3f82d6cf2e2a34294ee17a6");
            return;
        }
        super.bE_();
        this.u = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a7b571ea1fc52dc1fea62a87bdb0436", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a7b571ea1fc52dc1fea62a87bdb0436");
            return;
        }
        try {
            Context m = m();
            if (m instanceof WMRestaurantActivity) {
                WMRestaurantActivity wMRestaurantActivity = (WMRestaurantActivity) m;
                com.sankuai.waimai.business.restaurant.poicontainer.machpro.a.a("MPRestaurantPageBlock_initRender isFinishing:" + wMRestaurantActivity.isFinishing());
                if (wMRestaurantActivity.isFinishing()) {
                    return;
                }
                StringBuilder sb = new StringBuilder("MPRestaurantPageBlock_initRender id == null:");
                sb.append(wMRestaurantActivity.findViewById(R.id.page_mach_pro_root_container) == null);
                com.sankuai.waimai.business.restaurant.poicontainer.machpro.a.a(sb.toString());
                FragmentTransaction beginTransaction = wMRestaurantActivity.getSupportFragmentManager().beginTransaction();
                this.t = MPNestedContainerFragment.a(this.u, wMRestaurantActivity.getIntent(), this.w);
                beginTransaction.replace(R.id.page_mach_pro_root_container, this.t);
                beginTransaction.commitAllowingStateLoss();
            }
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            Context m2 = m();
            if (m2 instanceof WMRestaurantActivity) {
                ((WMRestaurantActivity) m2).n();
                com.sankuai.waimai.business.restaurant.poicontainer.machpro.a.a("MPRestaurantPageBlock_initRender exception retry:" + e.getMessage());
            }
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dd91ceb628b12abe18610ca79ee9437", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dd91ceb628b12abe18610ca79ee9437");
            return;
        }
        super.v();
        this.x = null;
        w();
        if (l() != null && l().getSupportFragmentManager() != null && this.t != null) {
            l().getSupportFragmentManager().beginTransaction().remove(this.t).commitAllowingStateLoss();
        }
        J().a();
    }
}
