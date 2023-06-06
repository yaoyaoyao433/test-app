package com.sankuai.waimai.store.msi.shopcart;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.react.bridge.WritableMap;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.android.bus.annotation.ThreadMode;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.msi.api.extension.sgc.shopcart.ShowShopcartParam;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.core.service.order.d;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.store.mrn.d;
import com.sankuai.waimai.store.mrn.shopcartbridge.SGMRNShopCartBridge;
import com.sankuai.waimai.store.mrn.shopcartbridge.event.e;
import com.sankuai.waimai.store.msi.SGMSCContextManager;
import com.sankuai.waimai.store.msi.listener.a;
import com.sankuai.waimai.store.newwidgets.pullrefresh.DefaultHeaderService;
import com.sankuai.waimai.store.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiShoppingCartAndPoi;
import com.sankuai.waimai.store.shopcart.SGShopCartRNFragment;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
import com.sankuai.waimai.store.shopping.cart.c;
import com.sankuai.waimai.store.shopping.cart.cache.b;
import com.sankuai.waimai.store.shopping.cart.event.C1560a;
import com.sankuai.waimai.store.shopping.cart.f;
import com.sankuai.waimai.store.shopping.cart.pre.c;
import com.sankuai.waimai.store.util.am;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.util.monitor.monitor.GsonMonitor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGMSCShopcartDelegate {
    public static ChangeQuickRedirect a;
    private static final List<Activity> k = new ArrayList();
    public a b;
    public SGShopCartRNFragment c;
    public FragmentActivity d;
    public SGMSCContextManager.a e;
    public com.sankuai.waimai.store.platform.domain.manager.poi.a f;
    public SCPageConfig g;
    protected String h;
    public JSONObject i;
    public boolean j;
    private boolean l;
    private boolean m;
    private String n;

    public SGMSCShopcartDelegate(FragmentActivity fragmentActivity, ShowShopcartParam showShopcartParam) {
        SGMSCContextManager.a aVar;
        long j;
        com.sankuai.waimai.store.platform.domain.manager.poi.a aVar2;
        FragmentActivity fragmentActivity2;
        Object[] objArr = {fragmentActivity, showShopcartParam};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d662a6693c170156f777e812f46a908", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d662a6693c170156f777e812f46a908");
            return;
        }
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.j = true;
        this.d = fragmentActivity;
        this.h = com.sankuai.waimai.store.msi.listener.a.a((Activity) fragmentActivity);
        Object[] objArr2 = {fragmentActivity, showShopcartParam};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bd39090e9f3b2dfcb4fdf6c01b114717", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bd39090e9f3b2dfcb4fdf6c01b114717");
            return;
        }
        SGMSCContextManager a2 = SGMSCContextManager.a();
        Object[] objArr3 = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect3 = SGMSCContextManager.a;
        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "d9a70b2888ef6380218e8eff6ab9158f", RobustBitConfig.DEFAULT_VALUE)) {
            aVar = (SGMSCContextManager.a) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "d9a70b2888ef6380218e8eff6ab9158f");
        } else {
            aVar = fragmentActivity != null ? SGMSCContextManager.b.get(Integer.valueOf(fragmentActivity.hashCode())) : null;
        }
        this.e = aVar;
        if (this.e != null) {
            this.e.a(this);
        }
        JSONObject jSONObject = new JSONObject((Map) showShopcartParam.data);
        this.n = jSONObject.optString("source");
        this.l = GearsLocator.DETAIL.equals(this.n);
        this.m = DefaultHeaderService.KEY_STORE.equals(this.n);
        PoiShoppingCartAndPoi parseJson = PoiShoppingCartAndPoi.parseJson(jSONObject);
        String str = showShopcartParam.poiID;
        String str2 = showShopcartParam.poi_id_str;
        Object[] objArr4 = {parseJson, str, str2};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b52129d60ba3204c05d23f01a1a59714", RobustBitConfig.DEFAULT_VALUE)) {
            aVar2 = (com.sankuai.waimai.store.platform.domain.manager.poi.a) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b52129d60ba3204c05d23f01a1a59714");
        } else {
            long a3 = r.a(str, 0L);
            com.sankuai.waimai.store.platform.domain.manager.poi.a e = com.sankuai.waimai.store.order.a.e().e(a3);
            Poi poi = parseJson != null ? parseJson.poi : null;
            boolean z = poi != null;
            if (e == null) {
                if (z) {
                    aVar2 = new com.sankuai.waimai.store.platform.domain.manager.poi.a(parseJson.poi);
                } else {
                    aVar2 = new com.sankuai.waimai.store.platform.domain.manager.poi.a();
                }
                j = a3;
            } else {
                if (z) {
                    Object[] objArr5 = {e, poi};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    j = a3;
                    poi = PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "356fbadc2e8c123941574d131f11eaae", RobustBitConfig.DEFAULT_VALUE) ? (Poi) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "356fbadc2e8c123941574d131f11eaae") : com.sankuai.waimai.store.platform.domain.manager.poi.a.a(e, poi);
                } else {
                    j = a3;
                }
                aVar2 = e;
            }
            aVar2.a(poi, 1);
            long j2 = j;
            com.sankuai.waimai.store.order.a.e().a(j2, poi);
            if (parseJson != null && parseJson.poi != null) {
                com.sankuai.waimai.store.order.a.e().a(j2, !t.a(str2) ? str2 : aVar2.h(), parseJson.poi.id, parseJson.poi.getStringPoiId());
            }
            b.a(parseJson);
            com.meituan.android.bus.a.a().c(new e(str, this.f, true));
            f.a().d = aVar2;
        }
        this.f = aVar2;
        this.i = jSONObject.optJSONObject("extraInfo");
        this.j = this.i.optBoolean("hideShopcartAfterInit", false);
        long a4 = r.a(showShopcartParam.spuID, 0L);
        String optString = this.i != null ? this.i.optString("shopCartLocalBusinessExtraInfo") : "";
        Bundle bundle = new Bundle();
        bundle.putLong("poi_id", this.f.f());
        bundle.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, this.f.h());
        bundle.putLong("spu_id", a4);
        if (!t.a(optString)) {
            bundle.putString("localBusinessExtra", optString);
        }
        bundle.putInt(KernelConfig.KEY_CONTAINER_TYPE, this.f.v());
        bundle.putString("cid", showShopcartParam.cid);
        bundle.putString("volley_tag", com.sankuai.waimai.store.msi.listener.a.a((Activity) fragmentActivity));
        bundle.putInt("page_source", DefaultHeaderService.KEY_STORE.equals(this.n) ? 1 : 0);
        Object[] objArr6 = {showShopcartParam, jSONObject, new Long(a4)};
        ChangeQuickRedirect changeQuickRedirect6 = a;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "4ee92d2a7124680b0d0913f8a06ef94a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "4ee92d2a7124680b0d0913f8a06ef94a");
        } else if (this.l) {
            this.g = SCPageConfig.a(2, 33, showShopcartParam.cid, a4);
        } else if (DefaultHeaderService.KEY_STORE.equals(this.n)) {
            this.g = SCPageConfig.a(1, 33, showShopcartParam.cid, a4);
            com.sankuai.waimai.store.platform.domain.core.shopcart.b d = com.sankuai.waimai.store.order.a.e().d(this.f.f());
            if (d != null) {
                JSONObject optJSONObject = jSONObject.optJSONObject("poi_info");
                if (optJSONObject != null) {
                    d.z = (Map) i.a(optJSONObject.toString(), Map.class);
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject("shopping_cart");
                if (optJSONObject2 != null) {
                    d.y = (Map) i.a(optJSONObject2.toString(), Map.class);
                }
            }
        } else {
            this.g = SCPageConfig.a(0, 33, showShopcartParam.cid, a4);
        }
        this.c = SGShopCartRNFragment.s();
        this.c.setArguments(bundle);
        if (this.c.isVisible()) {
            fragmentActivity2 = fragmentActivity;
        } else {
            FragmentTransaction beginTransaction = fragmentActivity.getSupportFragmentManager().beginTransaction();
            beginTransaction.add(this.c, com.sankuai.waimai.store.msi.listener.a.a((Activity) fragmentActivity));
            beginTransaction.commitNowAllowingStateLoss();
            View view = this.c.getView();
            fragmentActivity2 = fragmentActivity;
            this.b = new a(fragmentActivity2, this);
            this.b.addView(view);
            this.b.setId(10000);
            if (this.j) {
                this.b.setVisibility(8);
            }
        }
        SGShopCartRNFragment sGShopCartRNFragment = this.c;
        Object[] objArr7 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect7 = SGShopCartRNFragment.a;
        if (PatchProxy.isSupport(objArr7, sGShopCartRNFragment, changeQuickRedirect7, false, "492939cc1e490d722f51e1dc07cff14e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, sGShopCartRNFragment, changeQuickRedirect7, false, "492939cc1e490d722f51e1dc07cff14e");
        } else {
            com.sankuai.waimai.store.order.a.e().a(sGShopCartRNFragment);
        }
        com.sankuai.waimai.store.msi.listener.a.a((Context) fragmentActivity).a(fragmentActivity2, new a.c() { // from class: com.sankuai.waimai.store.msi.shopcart.SGMSCShopcartDelegate.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.msi.listener.a.c
            public final void a(Activity activity) {
                Object[] objArr8 = {activity};
                ChangeQuickRedirect changeQuickRedirect8 = a;
                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "6904371189cd00a050466b395293a8ec", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "6904371189cd00a050466b395293a8ec");
                    return;
                }
                if (!SGMSCShopcartDelegate.k.contains(activity)) {
                    SGMSCShopcartDelegate.k.add(activity);
                }
                SGMSCShopcartDelegate sGMSCShopcartDelegate = SGMSCShopcartDelegate.this;
                Object[] objArr9 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect9 = SGMSCShopcartDelegate.a;
                if (PatchProxy.isSupport(objArr9, sGMSCShopcartDelegate, changeQuickRedirect9, false, "0cea2ec82a3dda8b2d3819253c82c731", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr9, sGMSCShopcartDelegate, changeQuickRedirect9, false, "0cea2ec82a3dda8b2d3819253c82c731");
                } else {
                    com.meituan.android.bus.a.a().a(sGMSCShopcartDelegate);
                }
            }

            @Override // com.sankuai.waimai.store.msi.listener.a.c
            public final void b(Activity activity) {
                Object[] objArr8 = {activity};
                ChangeQuickRedirect changeQuickRedirect8 = a;
                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "87d35bc4fc5901f85e9c04cb845f03c6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "87d35bc4fc5901f85e9c04cb845f03c6");
                    return;
                }
                SGMSCShopcartDelegate.k.remove(activity);
                SGMSCShopcartDelegate.this.a();
            }
        });
        if (this.i == null || !this.i.optBoolean("isopenshopcart", false)) {
            return;
        }
        this.c.a("mrn_show_shopcart_list", d.a());
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb98faeb3019a6dcb37115fe2ce9472f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb98faeb3019a6dcb37115fe2ce9472f");
        } else {
            com.meituan.android.bus.a.a().b(this);
        }
    }

    @Subscribe
    public void onMRNPoiSubscribeEvent(com.sankuai.waimai.store.mrn.shopcartbridge.event.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3beff41c2a51ab66022835a4bb26f9ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3beff41c2a51ab66022835a4bb26f9ef");
            return;
        }
        com.sankuai.waimai.store.platform.domain.manager.poi.a l = com.sankuai.waimai.store.order.a.e().l(fVar.a);
        if (l == null || this.c == null || !this.c.b) {
            return;
        }
        l.b.subscribe = fVar.b;
        com.sankuai.waimai.store.platform.domain.core.shopcart.b k2 = com.sankuai.waimai.store.order.a.e().k(fVar.a);
        if (k2 != null && k2.z != null) {
            k2.z.put("subscribe", Integer.valueOf(fVar.b));
        }
        this.c.a("mrn_shopcart_update", SGMRNShopCartBridge.getMrnShopCartData(this.f.d()));
    }

    @Subscribe
    public void onSubmitOrderEvent(com.sankuai.waimai.store.shopping.cart.event.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "582d6d787af96c24de54d1c8ba361547", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "582d6d787af96c24de54d1c8ba361547");
        } else if (eVar == null || eVar.d != e()) {
        } else {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2cba6ff30eb9b9fb15ed0b954caf3873", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2cba6ff30eb9b9fb15ed0b954caf3873");
            } else if (this.f != null) {
                com.sankuai.waimai.store.shopping.cart.pre.d.a(this.d, this.f, this.g).a(new c() { // from class: com.sankuai.waimai.store.msi.shopcart.SGMSCShopcartDelegate.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.shopping.cart.pre.c
                    public final void a() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b5eef5f642be171c9b5f03bb830bdfe1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b5eef5f642be171c9b5f03bb830bdfe1");
                        } else {
                            SGMSCShopcartDelegate.this.b();
                        }
                    }
                });
            }
        }
    }

    @Subscribe
    public void onShowAddFoodWithHideOnClose(com.sankuai.waimai.store.shopping.cart.event.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6545fdb90aab7d6f6fa107d6fc0858c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6545fdb90aab7d6f6fa107d6fc0858c8");
        } else if (this.d != cVar.b) {
        } else {
            WritableMap a2 = d.a();
            a2.putInt("rootTag", e());
            this.c.a("mrn_shopcart_show_add_goods_with_hide_on_close", a2);
        }
    }

    @Subscribe
    public void onShowCollectOrderFloatLayer(com.sankuai.waimai.store.shopping.cart.event.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39a17e03149171510d6fa776efe9f446", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39a17e03149171510d6fa776efe9f446");
        } else if (this.d != dVar.b) {
        } else {
            WritableMap a2 = d.a();
            a2.putInt("rootTag", e());
            a2.putBoolean("hideShopCartAfterClose", true);
            a2.putInt("collectSplitFlag", dVar.c);
            this.c.a("mrn_shopcart_show_collect_order_float_layer", a2);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onHideShopCartViewEvent(C1560a c1560a) {
        Object[] objArr = {c1560a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e768956a9ca807668e596ed49f41af7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e768956a9ca807668e596ed49f41af7");
        } else if (String.valueOf(e()).equals(c1560a.a)) {
            this.b.setVisibility(8);
        }
    }

    @Subscribe
    public void onMscShowShopCarPopEvent(com.sankuai.waimai.store.shopping.cart.event.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d076145ff83dec0710033c9629d9431", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d076145ff83dec0710033c9629d9431");
        } else if (bVar == null || bVar.a != this.d.hashCode()) {
        } else {
            if (bVar.b) {
                am.a((Activity) this.d, bVar.c);
            }
            this.c.a("mrn_show_shopcart_list", d.a());
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b34790d44b2c0e6df78288eb078b8906", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b34790d44b2c0e6df78288eb078b8906");
        } else if (com.sankuai.waimai.store.order.a.e().i(this.f.d())) {
            new com.sankuai.waimai.store.shopping.cart.c(this.d, this.f, this.g, this.h).a(new c.a() { // from class: com.sankuai.waimai.store.msi.shopcart.SGMSCShopcartDelegate.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.shopping.cart.c.a
                public final void a(d.a aVar) {
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "20f391407f7386de5c1003f85f8b4487", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "20f391407f7386de5c1003f85f8b4487");
                    }
                }

                @Override // com.sankuai.waimai.store.shopping.cart.c.a
                public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
                    Object[] objArr2 = {jSONObject, jSONObject2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "93997a3f988cf05fcb752e9e6125ebd0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "93997a3f988cf05fcb752e9e6125ebd0");
                        return;
                    }
                    SGMSCShopcartDelegate sGMSCShopcartDelegate = SGMSCShopcartDelegate.this;
                    Object[] objArr3 = {jSONObject};
                    ChangeQuickRedirect changeQuickRedirect3 = SGMSCShopcartDelegate.a;
                    if (PatchProxy.isSupport(objArr3, sGMSCShopcartDelegate, changeQuickRedirect3, false, "b678568f770c6b7a2d3d2566f9fd2cca", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, sGMSCShopcartDelegate, changeQuickRedirect3, false, "b678568f770c6b7a2d3d2566f9fd2cca");
                    } else {
                        com.sankuai.waimai.store.shopping.cart.d.a().a("order_business_channel", jSONObject);
                    }
                    com.sankuai.waimai.store.platform.domain.core.shopcart.b k2 = com.sankuai.waimai.store.order.a.e().k(SGMSCShopcartDelegate.this.f.d());
                    if (k2 == null) {
                        return;
                    }
                    k2.d();
                    try {
                        if ((SGMSCShopcartDelegate.this.l || SGMSCShopcartDelegate.this.m) && SGMSCShopcartDelegate.this.i != null) {
                            String optString = SGMSCShopcartDelegate.this.i.optString("orderParam");
                            if (!t.a(optString)) {
                                try {
                                    jSONObject.put("i_input_param", new JSONObject(optString));
                                } catch (JSONException e) {
                                    com.sankuai.waimai.store.util.monitor.c.a(GsonMonitor.ParseFailure, "orderParam=" + optString + " msg=" + e.getMessage(), "msc - commitOrder");
                                }
                            }
                        }
                        List<OrderedFood> p = com.sankuai.waimai.store.order.a.e().p(SGMSCShopcartDelegate.this.f.d());
                        OrderedFood orderedFood = com.sankuai.shangou.stone.util.a.a((List) p) == 1 ? (OrderedFood) com.sankuai.shangou.stone.util.a.a((List<Object>) p, 0) : null;
                        if (orderedFood != null && orderedFood.sku != null && orderedFood.sku.installment != null) {
                            jSONObject2.put("store_installment", i.a(orderedFood.sku.installment));
                        }
                        if (t.a(SGMSCShopcartDelegate.this.f.b.orderPreviewExtend)) {
                            return;
                        }
                        try {
                            JSONObject jSONObject3 = new JSONObject(SGMSCShopcartDelegate.this.f.b.orderPreviewExtend);
                            Iterator<String> keys = jSONObject3.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                jSONObject.put(next, jSONObject3.opt(next));
                            }
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    private int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f7ca0be5eaa832f89466bf917ea1f5b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f7ca0be5eaa832f89466bf917ea1f5b")).intValue();
        }
        if (this.c != null) {
            return this.c.t();
        }
        return 0;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends FrameLayout {
        public static ChangeQuickRedirect a;
        public SGMSCShopcartDelegate b;

        public a(@NonNull Context context, SGMSCShopcartDelegate sGMSCShopcartDelegate) {
            super(context);
            Object[] objArr = {context, sGMSCShopcartDelegate};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f2ac329f6ef50a5576b8ed0ecc8b64a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f2ac329f6ef50a5576b8ed0ecc8b64a");
                return;
            }
            this.b = null;
            this.b = sGMSCShopcartDelegate;
        }
    }

    public static Activity c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0ffedf489d0343404ded0962b3fcd554", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0ffedf489d0343404ded0962b3fcd554");
        }
        if (k.size() == 0) {
            return null;
        }
        List<Activity> list = k;
        return list.get(list.size() - 1);
    }
}
