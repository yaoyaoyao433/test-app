package com.sankuai.waimai.store.mrn.shopcartbridge;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.ViewGroup;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.base.SGCommonRNFragment;
import com.sankuai.waimai.store.i.user.a;
import com.sankuai.waimai.store.mrn.shopcartbridge.event.d;
import com.sankuai.waimai.store.mrn.shopcartbridge.event.e;
import com.sankuai.waimai.store.mrn.shopcartbridge.event.i;
import com.sankuai.waimai.store.mrn.shopcartbridge.event.j;
import com.sankuai.waimai.store.router.g;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
import com.sankuai.waimai.store.shopping.cart.f;
import com.sankuai.waimai.store.util.ah;
import com.sankuai.waimai.store.util.monitor.monitor.DrugMrnPageMonitor;
import com.sankuai.waimai.store.util.monitor.monitor.StoreException;
import java.util.HashMap;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ShopCartBridgeVessel extends com.sankuai.waimai.store.base.vessel.impl.a implements com.sankuai.waimai.store.i.user.a, com.sankuai.waimai.store.observers.a {
    public static ChangeQuickRedirect a;
    private boolean d;
    private com.sankuai.waimai.store.platform.domain.manager.poi.a e;
    private String f;
    private ViewGroup g;
    private com.sankuai.waimai.store.shopping.cart.delegate.c h;
    private SGCommonRNFragment i;
    private final String j;
    private final String k;
    private final String l;

    @Override // com.sankuai.waimai.store.base.vessel.a
    public final boolean b() {
        return false;
    }

    public ShopCartBridgeVessel(@NonNull SCBaseActivity sCBaseActivity) {
        super(sCBaseActivity);
        Object[] objArr = {sCBaseActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "477e4c7f722c372dc7ce2b68b6d03c8b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "477e4c7f722c372dc7ce2b68b6d03c8b");
            return;
        }
        this.d = false;
        this.j = "supermarket";
        this.k = "flashbuy-activities-collection";
        this.l = "flashbuy-activities-collection";
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.vessel.a
    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6e9a497de59e49d480c22a319e344a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6e9a497de59e49d480c22a319e344a4");
            return;
        }
        super.a(bundle);
        this.i = SGShopCartRNFragment.a(l());
        if (this.i == null) {
            m();
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ccee0e8508a603a97381c24122081a37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ccee0e8508a603a97381c24122081a37");
        } else {
            Uri data = l().getData();
            if (data != null && this.i != null) {
                Set<String> queryParameterNames = data.getQueryParameterNames();
                if (!com.sankuai.shangou.stone.util.a.b(queryParameterNames)) {
                    HashMap hashMap = new HashMap();
                    for (String str : queryParameterNames) {
                        hashMap.put(str, data.getQueryParameter(str));
                    }
                    this.i.j = hashMap;
                }
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "00baa45c69ec9fff30c3aa186a244713", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "00baa45c69ec9fff30c3aa186a244713");
        } else {
            a(R.layout.wm_sc_shopcart_bridge_vessel);
            this.g = (ViewGroup) b(R.id.fl_shopcart_container);
            this.g.setVisibility(8);
            n().getSupportFragmentManager().beginTransaction().replace(R.id.fl_mrn_container, this.i).commitAllowingStateLoss();
        }
        com.meituan.android.bus.a.a().a(this);
        com.sankuai.waimai.store.order.a.e().a(this);
        com.sankuai.waimai.store.manager.user.a.a().b((com.sankuai.waimai.store.i.user.a) this);
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "126bcc3d19740bcd47e2880f15f17cae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "126bcc3d19740bcd47e2880f15f17cae");
            return;
        }
        super.c();
        com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.c.a().b();
        com.meituan.android.bus.a.a().b(this);
        com.sankuai.waimai.store.order.a.e().b(this);
        com.sankuai.waimai.store.manager.user.a.a().a((com.sankuai.waimai.store.i.user.a) this);
        com.sankuai.waimai.store.base.net.c.a(p());
        f.a().a(this.c.hashCode());
        if (this.h != null) {
            this.h.a();
        }
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.a
    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94db889d97c1a1517ea53703f14e0282", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94db889d97c1a1517ea53703f14e0282");
            return;
        }
        super.a(i, i2, intent);
        if (i == 55 && i2 == -1 && this.h != null) {
            this.h.c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r8v6 */
    @Subscribe
    public void onMRNLoadShopCartSuccess(e eVar) {
        boolean z;
        e eVar2;
        int rootViewTag;
        ViewGroup viewGroup;
        int i;
        int i2;
        ?? r8;
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85346a3dd4d579d951055660e8311728", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85346a3dd4d579d951055660e8311728");
        } else if (eVar == null || eVar.a == null) {
        } else {
            if (t.a(this.f) || com.sankuai.waimai.store.order.a.e().b(this.f, eVar.f)) {
                this.f = eVar.f;
                this.e = eVar.a;
                com.sankuai.waimai.store.platform.domain.manager.poi.a aVar = eVar.a;
                boolean z2 = eVar.b;
                Object[] objArr2 = {aVar, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "16129981daacaecc80b9ae57f981cfaa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "16129981daacaecc80b9ae57f981cfaa");
                    eVar2 = eVar;
                } else {
                    boolean z3 = z2 && aVar.c();
                    if (this.h != null || q() == null) {
                        z = z3;
                    } else {
                        String d = d();
                        SCBaseActivity sCBaseActivity = this.c;
                        ReactContext q = q();
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ba08d6ab37de927fc781b6255ff0fa8e", RobustBitConfig.DEFAULT_VALUE)) {
                            rootViewTag = ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ba08d6ab37de927fc781b6255ff0fa8e")).intValue();
                        } else {
                            rootViewTag = this.i.b() != null ? this.i.b().getRootViewTag() : 0;
                        }
                        ViewGroup viewGroup2 = this.g;
                        Intent l = l();
                        Object[] objArr4 = {l};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        z = z3;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "82ea35a2d17ebaa7686433d4def4dd90", RobustBitConfig.DEFAULT_VALUE)) {
                            i = ((Integer) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "82ea35a2d17ebaa7686433d4def4dd90")).intValue();
                            viewGroup = viewGroup2;
                        } else {
                            if (l == null || l.getData() == null) {
                                viewGroup = viewGroup2;
                            } else {
                                Uri data = l.getData();
                                String queryParameter = data.getQueryParameter("mrn_biz");
                                String queryParameter2 = data.getQueryParameter("mrn_entry");
                                String queryParameter3 = data.getQueryParameter("mrn_component");
                                Object[] objArr5 = {queryParameter, queryParameter2, queryParameter3};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                viewGroup = viewGroup2;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "6ab5ed5ebf67f9d582b477df0aac8daf", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "6ab5ed5ebf67f9d582b477df0aac8daf");
                                } else {
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("biz", queryParameter);
                                    hashMap.put("entryName", queryParameter2);
                                    hashMap.put("componentName", queryParameter3);
                                    com.sankuai.waimai.store.util.monitor.c.b(new DrugMrnPageMonitor(), "", "闪购医药带购物车的mrn页面", hashMap);
                                }
                                if ("supermarket".equals(queryParameter) && "flashbuy-activities-collection".equals(queryParameter2) && "flashbuy-activities-collection".equals(queryParameter3)) {
                                    i = 7;
                                }
                            }
                            i = 3;
                        }
                        this.h = com.sankuai.waimai.store.shopping.cart.delegate.c.a(sCBaseActivity, q, rootViewTag, aVar, viewGroup, null, SCPageConfig.a(i, 55, d), d, p());
                        this.h.f();
                    }
                    if (this.h != null) {
                        this.h.b(z);
                    }
                    eVar2 = eVar;
                }
                if (eVar2.a.c()) {
                    if (eVar2.a.b.getState() == 3) {
                        i2 = 1;
                        r8 = 1;
                    } else {
                        i2 = 1;
                        r8 = 0;
                    }
                    Object[] objArr6 = new Object[i2];
                    objArr6[0] = Byte.valueOf((byte) r8);
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "88142d985659fe82b418e6d11a1da146", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "88142d985659fe82b418e6d11a1da146");
                        return;
                    }
                    WritableMap createMap = Arguments.createMap();
                    createMap.putBoolean("poiRest", r8);
                    if (q() != null) {
                        com.sankuai.waimai.store.mrn.shopcartbridge.a.a(q(), "RefreshPoiRest", createMap);
                    }
                }
            }
        }
    }

    @Subscribe
    public void onMRNLoadShopCartFail(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d15f1ceda9745b775c5bcbab1d03ac86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d15f1ceda9745b775c5bcbab1d03ac86");
        } else if (dVar == null || !com.sankuai.waimai.store.order.a.e().b(this.f, dVar.f) || this.h == null) {
        } else {
            this.h.b(false);
        }
    }

    @Subscribe
    public void onMRNIncreaseFoodSuccess(com.sankuai.waimai.store.mrn.shopcartbridge.event.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4034074e8a146092335e58c6d8d9bc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4034074e8a146092335e58c6d8d9bc7");
        } else if (cVar == null || t.a(cVar.a) || this.h == null || !com.sankuai.waimai.store.order.a.e().b(this.f, cVar.f)) {
        } else {
            f.a().a(com.sankuai.waimai.store.mrn.shopcartbridge.a.a(n().getWindow().getDecorView(), cVar.a), this.c.hashCode(), this.f);
            if (cVar.b) {
                this.h.a(cVar.c);
            }
        }
    }

    @Subscribe
    public void onMRNShowShopCartEvent(i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a92899a6a3f49034faf92f80a48257c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a92899a6a3f49034faf92f80a48257c");
        } else if (iVar != null && com.sankuai.waimai.store.order.a.e().b(this.f, iVar.f)) {
            if (this.e != null && this.e.c() && iVar.a) {
                if (this.h != null) {
                    this.h.b(true);
                }
            } else if (this.h != null) {
                this.h.b(false);
            }
        }
    }

    @Subscribe
    public void onMRNShowSpecPopEvent(j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e343f7f593ac4538bd812908e069fe0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e343f7f593ac4538bd812908e069fe0");
        } else if (jVar == null || jVar.b == null || jVar.a == null || this.h == null || n() == null || n().isFinishing() || !com.sankuai.waimai.store.order.a.e().b(this.f, jVar.f)) {
        } else {
            if (jVar.b.mrnExtension != null) {
                g.a(n(), jVar.b, jVar.a.b, jVar.b.mrnExtension.getIndex(), jVar.b.mrnExtension.getKeyword(), jVar.b.mrnExtension.getSearchLogId(), jVar.b.mrnExtension.getSearchGlobalId(), 0, jVar.b.mrnExtension.getStid());
                return;
            }
            g.a(n(), jVar.b, jVar.a.b, -1);
        }
    }

    private ReactContext q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "561c8ee44082afe4397378f7cee2a84d", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReactContext) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "561c8ee44082afe4397378f7cee2a84d");
        }
        try {
            if (this.i.l() != null) {
                return this.i.l().getCurrentReactContext();
            }
            ah.a(StoreException.MrnBridgeException, "getReactInstanceManager: null");
            return null;
        } catch (Exception e) {
            StoreException storeException = StoreException.MrnBridgeException;
            ah.a(storeException, "getReactInstanceCurrentReactContext: " + e.getMessage());
            return null;
        }
    }

    @Override // com.sankuai.waimai.store.base.vessel.a
    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecaf87dc5d187b92882dc17b7db31a47", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecaf87dc5d187b92882dc17b7db31a47") : b.a().a(this.i.q());
    }

    @Override // com.sankuai.waimai.store.i.user.a
    public final void a(a.EnumC1205a enumC1205a) {
        Object[] objArr = {enumC1205a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb87dfbd9d8a373d84f8249fe648d064", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb87dfbd9d8a373d84f8249fe648d064");
        } else if (enumC1205a == null) {
        } else {
            if ((enumC1205a != a.EnumC1205a.LOGIN && enumC1205a != a.EnumC1205a.LOGOUT) || o() || this.h == null) {
                return;
            }
            this.h.b();
        }
    }

    @Override // com.sankuai.waimai.store.i.user.a
    public final void a(a.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4412fc2099482dae6bd19f5f6fed8801", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4412fc2099482dae6bd19f5f6fed8801");
        } else if (o() || bVar != a.b.PHONE || com.sankuai.waimai.foundation.core.service.user.a.a != a.EnumC0947a.FROM_PRODUCT_LIST_PREORDER || this.h == null) {
        } else {
            this.h.c();
        }
    }

    @Override // com.sankuai.waimai.store.observers.a
    public final void ba_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "397ecc0690ed41acdd113ae94ec7ceca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "397ecc0690ed41acdd113ae94ec7ceca");
            return;
        }
        com.sankuai.waimai.store.mrn.shopcartbridge.a.a(q(), "RefreshGoodsList", Arguments.createMap());
        if (this.h != null) {
            this.h.h();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class SGShopCartRNFragment extends SGCommonRNFragment {
        public static ChangeQuickRedirect a;

        @Nullable
        public static SGCommonRNFragment a(Intent intent) {
            Object[] objArr = {intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "483fe230977d26ec808657f08db9f621", RobustBitConfig.DEFAULT_VALUE)) {
                return (SGCommonRNFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "483fe230977d26ec808657f08db9f621");
            }
            Bundle b = b(intent);
            if (b == null) {
                return null;
            }
            SGShopCartRNFragment sGShopCartRNFragment = new SGShopCartRNFragment();
            sGShopCartRNFragment.setArguments(b);
            return sGShopCartRNFragment;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends com.sankuai.waimai.store.base.vessel.impl.b {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.store.base.vessel.b
        @NonNull
        public final com.sankuai.waimai.store.base.vessel.a a(@NonNull SCBaseActivity sCBaseActivity) {
            Object[] objArr = {sCBaseActivity};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68c7b2739f3a1ab5012974989339afa0", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.base.vessel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68c7b2739f3a1ab5012974989339afa0") : new ShopCartBridgeVessel(sCBaseActivity);
        }
    }
}
