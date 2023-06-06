package com.sankuai.waimai.drug.mrn;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.drug.g;
import com.sankuai.waimai.drug.h;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.base.SGCommonRNFragment;
import com.sankuai.waimai.store.i.user.a;
import com.sankuai.waimai.store.mrn.shopcartbridge.event.d;
import com.sankuai.waimai.store.mrn.shopcartbridge.event.e;
import com.sankuai.waimai.store.mrn.shopcartbridge.event.i;
import com.sankuai.waimai.store.mrn.shopcartbridge.event.j;
import com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.c;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
import com.sankuai.waimai.store.shopping.cart.f;
import com.sankuai.waimai.store.util.ah;
import com.sankuai.waimai.store.util.monitor.monitor.DrugMrnPageMonitor;
import com.sankuai.waimai.store.util.monitor.monitor.StoreException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class DrugCartBridgeVessel extends com.sankuai.waimai.store.base.vessel.impl.a implements com.sankuai.waimai.store.i.user.a, com.sankuai.waimai.store.observers.a {
    public static ChangeQuickRedirect a;
    private boolean d;
    private com.sankuai.waimai.store.platform.domain.manager.poi.a e;
    private String f;
    private String g;
    private ViewGroup h;
    private h i;
    private SGCommonRNFragment j;
    private final String k;
    private final String l;
    private final String m;
    private boolean n;

    @Override // com.sankuai.waimai.store.base.vessel.a
    public final boolean b() {
        return false;
    }

    public DrugCartBridgeVessel(@NonNull SCBaseActivity sCBaseActivity) {
        super(sCBaseActivity);
        Object[] objArr = {sCBaseActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "233ef68bec5d1462070341f7a87a8dbd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "233ef68bec5d1462070341f7a87a8dbd");
            return;
        }
        this.d = false;
        this.k = "supermarket";
        this.l = "flashbuy-activities-collection";
        this.m = "flashbuy-activities-collection";
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.vessel.a
    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11b48a247fe3184dbdb7c4f8a08cc541", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11b48a247fe3184dbdb7c4f8a08cc541");
            return;
        }
        super.a(bundle);
        this.j = DrugShopCartRNFragment.a(l());
        if (this.j == null) {
            m();
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "10f24e46e8619ff1948aa66f2160f7f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "10f24e46e8619ff1948aa66f2160f7f1");
        } else {
            Uri data = l().getData();
            if (data != null && this.j != null) {
                Set<String> queryParameterNames = data.getQueryParameterNames();
                if (!com.sankuai.shangou.stone.util.a.b(queryParameterNames)) {
                    HashMap hashMap = new HashMap();
                    for (String str : queryParameterNames) {
                        hashMap.put(str, data.getQueryParameter(str));
                    }
                    String str2 = (String) hashMap.get("always_hide_collect");
                    Object[] objArr3 = {str2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    this.n = PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d68a94406dd6c01b1a29bf260da42606", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d68a94406dd6c01b1a29bf260da42606")).booleanValue() : "1".equals(str2);
                    this.j.j = hashMap;
                }
            }
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "44548e54b879509e3604ce63cce24844", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "44548e54b879509e3604ce63cce24844");
        } else {
            a(R.layout.wm_drug_shopcart_bridge_vessel);
            this.h = (ViewGroup) b(R.id.fl_shopcart_container);
            this.h.setVisibility(8);
            n().getSupportFragmentManager().beginTransaction().replace(R.id.fl_mrn_container, this.j).commitAllowingStateLoss();
        }
        com.meituan.android.bus.a.a().a(this);
        com.sankuai.waimai.store.order.a.e().a(this);
        com.sankuai.waimai.store.manager.user.a.a().b((com.sankuai.waimai.store.i.user.a) this);
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13efe54f27d38b8ebb869d9f0287e939", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13efe54f27d38b8ebb869d9f0287e939");
            return;
        }
        super.c();
        c.a().b();
        com.meituan.android.bus.a.a().b(this);
        com.sankuai.waimai.store.order.a.e().b(this);
        com.sankuai.waimai.store.manager.user.a.a().a((com.sankuai.waimai.store.i.user.a) this);
        com.sankuai.waimai.store.base.net.c.a(p());
        f.a().a(this.c.hashCode());
        if (this.i != null) {
            this.i.a();
        }
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.a
    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "531503538d77bcd4dd4e0539711ac31f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "531503538d77bcd4dd4e0539711ac31f");
            return;
        }
        super.a(i, i2, intent);
        if (i == 55 && i2 == -1 && this.i != null) {
            this.i.c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r8v5 */
    @Subscribe
    public void onMRNLoadShopCartSuccess(e eVar) {
        boolean z;
        boolean z2;
        e eVar2;
        SCBaseActivity sCBaseActivity;
        int i;
        int i2;
        ?? r8;
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6881155ca3bbf76903fbe3d9fd2af44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6881155ca3bbf76903fbe3d9fd2af44");
        } else if (eVar == null || eVar.a == null) {
        } else {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c9d0e9af3860fe847284a6982a18bcc6", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c9d0e9af3860fe847284a6982a18bcc6")).booleanValue();
            } else {
                z = t.a(this.f) && t.a(this.g);
            }
            if (z || eVar.a(this.f, this.g)) {
                this.f = eVar.f;
                this.g = eVar.g;
                this.e = eVar.a;
                com.sankuai.waimai.store.platform.domain.manager.poi.a aVar = eVar.a;
                boolean z3 = eVar.b;
                Object[] objArr3 = {aVar, Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e4d3c7a9ced0bae7035bc57d0f9f93a2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e4d3c7a9ced0bae7035bc57d0f9f93a2");
                    eVar2 = eVar;
                } else {
                    boolean z4 = z3 && aVar.c();
                    if (this.i != null || q() == null) {
                        z2 = z4;
                    } else {
                        String d = d();
                        SCBaseActivity sCBaseActivity2 = this.c;
                        ViewGroup viewGroup = this.h;
                        Intent l = l();
                        Object[] objArr4 = {l};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2ceedd569fb3d2e0ee7b3615f531cd3f", RobustBitConfig.DEFAULT_VALUE)) {
                            i = ((Integer) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2ceedd569fb3d2e0ee7b3615f531cd3f")).intValue();
                            z2 = z4;
                            sCBaseActivity = sCBaseActivity2;
                        } else {
                            if (l == null || l.getData() == null) {
                                z2 = z4;
                                sCBaseActivity = sCBaseActivity2;
                            } else {
                                Uri data = l.getData();
                                String queryParameter = data.getQueryParameter("mrn_biz");
                                String queryParameter2 = data.getQueryParameter("mrn_entry");
                                String queryParameter3 = data.getQueryParameter("mrn_component");
                                Object[] objArr5 = {queryParameter, queryParameter2, queryParameter3};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                z2 = z4;
                                sCBaseActivity = sCBaseActivity2;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "5126a98887a1bc60eaefd086ef428706", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "5126a98887a1bc60eaefd086ef428706");
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
                        this.i = new g(sCBaseActivity, aVar, -1, viewGroup, SCPageConfig.a(i, 55, d), d, p(), null, null, this.n);
                        this.i.g();
                    }
                    if (this.i != null) {
                        this.i.b(z2);
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
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "39db75d3763e1dc3ef60e6d414035429", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "39db75d3763e1dc3ef60e6d414035429");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "060263c699adc1ee59338200516f4841", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "060263c699adc1ee59338200516f4841");
        } else if (dVar == null || !dVar.a(this.f, this.g) || this.i == null) {
        } else {
            this.i.b(false);
        }
    }

    @Subscribe
    public void onMRNIncreaseFoodSuccess(com.sankuai.waimai.store.mrn.shopcartbridge.event.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d31094b73a652ed7013176fd5068082a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d31094b73a652ed7013176fd5068082a");
        } else if (cVar == null || t.a(cVar.a) || this.i == null || !cVar.a(this.f, this.g)) {
        } else {
            f.a().a(com.sankuai.waimai.store.mrn.shopcartbridge.a.a(n().getWindow().getDecorView(), cVar.a), this.c.hashCode(), TextUtils.isEmpty(this.g) ? this.f : this.g);
            if (cVar.b) {
                this.i.a(cVar.c);
            }
        }
    }

    @Subscribe
    public void onMRNShowShopCartEvent(i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ebc74d13631d952cc289e45d6188687", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ebc74d13631d952cc289e45d6188687");
        } else if (iVar != null && iVar.a(this.f, this.g)) {
            if (this.e != null && this.e.c() && iVar.a) {
                if (this.i != null) {
                    this.i.b(true);
                }
            } else if (this.i != null) {
                this.i.b(false);
            }
        }
    }

    @Subscribe
    public void onMRNShowSpecPopEvent(j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1e39bee6a75f73e070644fa9721e429", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1e39bee6a75f73e070644fa9721e429");
        } else if (jVar == null || jVar.b == null || jVar.a == null || this.i == null || n() == null || n().isFinishing() || !jVar.a(this.f, this.g)) {
        } else {
            if (jVar.b.mrnExtension != null) {
                com.sankuai.waimai.store.drug.util.d.a(n(), jVar.b, jVar.a.b, jVar.b.mrnExtension.getIndex(), jVar.b.mrnExtension.getKeyword(), jVar.b.mrnExtension.getSearchLogId(), jVar.b.mrnExtension.getSearchGlobalId(), 0, jVar.b.mrnExtension.getStid());
                return;
            }
            com.sankuai.waimai.store.drug.util.d.a(n(), jVar.b, jVar.a.b, -1);
        }
    }

    private ReactContext q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c070a49c0ad48cab5ac42ba4d5c31b4a", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReactContext) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c070a49c0ad48cab5ac42ba4d5c31b4a");
        }
        try {
            if (this.j.l() != null) {
                return this.j.l().getCurrentReactContext();
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96ab6219f7a451b3cb1a4969de9515e8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96ab6219f7a451b3cb1a4969de9515e8") : com.sankuai.waimai.store.mrn.shopcartbridge.b.a().a(this.j.q());
    }

    @Override // com.sankuai.waimai.store.i.user.a
    public final void a(a.EnumC1205a enumC1205a) {
        Object[] objArr = {enumC1205a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ae9eafacc41fa6d2a78969ac0ff97ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ae9eafacc41fa6d2a78969ac0ff97ba");
        } else if (enumC1205a == null) {
        } else {
            if ((enumC1205a != a.EnumC1205a.LOGIN && enumC1205a != a.EnumC1205a.LOGOUT) || o() || this.i == null) {
                return;
            }
            this.i.b();
        }
    }

    @Override // com.sankuai.waimai.store.i.user.a
    public final void a(a.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af6a9b08f3a78c726b74eaa53e93990b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af6a9b08f3a78c726b74eaa53e93990b");
        } else if (o() || bVar != a.b.PHONE || com.sankuai.waimai.foundation.core.service.user.a.a != a.EnumC0947a.FROM_PRODUCT_LIST_PREORDER || this.i == null) {
        } else {
            this.i.c();
        }
    }

    @Override // com.sankuai.waimai.store.observers.a
    public final void ba_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afd33754b598542371768874abf970f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afd33754b598542371768874abf970f7");
            return;
        }
        com.sankuai.waimai.store.mrn.shopcartbridge.a.a(q(), "RefreshGoodsList", Arguments.createMap());
        if (this.i != null) {
            this.i.h();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class DrugShopCartRNFragment extends SGCommonRNFragment {
        public static ChangeQuickRedirect a;

        @Nullable
        public static SGCommonRNFragment a(Intent intent) {
            Object[] objArr = {intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f39c9916b552817013a414a54c9aa600", RobustBitConfig.DEFAULT_VALUE)) {
                return (SGCommonRNFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f39c9916b552817013a414a54c9aa600");
            }
            Bundle b = b(intent);
            if (b == null) {
                return null;
            }
            DrugShopCartRNFragment drugShopCartRNFragment = new DrugShopCartRNFragment();
            drugShopCartRNFragment.setArguments(b);
            return drugShopCartRNFragment;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends com.sankuai.waimai.store.base.vessel.impl.b {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.store.base.vessel.b
        @NonNull
        public final com.sankuai.waimai.store.base.vessel.a a(@NonNull SCBaseActivity sCBaseActivity) {
            Object[] objArr = {sCBaseActivity};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43dd08d9d2affafc78e9e0b13335082a", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.base.vessel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43dd08d9d2affafc78e9e0b13335082a") : new DrugCartBridgeVessel(sCBaseActivity);
        }

        @Override // com.sankuai.waimai.store.base.vessel.impl.b, com.sankuai.waimai.store.base.vessel.b
        public final void b(@NonNull SCBaseActivity sCBaseActivity) {
            Object[] objArr = {sCBaseActivity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6128be657fe45a9b6ddb308b213505a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6128be657fe45a9b6ddb308b213505a");
                return;
            }
            super.b(sCBaseActivity);
            DrugCartBridgeVessel.a(sCBaseActivity);
        }
    }

    public static void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d7e033df0d2b2f7618a6c47f216fc962", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d7e033df0d2b2f7618a6c47f216fc962");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1134e8a218d6b0f8589b62520460acf4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1134e8a218d6b0f8589b62520460acf4")).booleanValue() : com.sankuai.waimai.store.config.d.h().a("good_detail/isAndroidActivityTranslucent", true)) {
            try {
                Activity.class.getDeclaredMethod("getActivityOptions", new Class[0]).setAccessible(true);
                Method declaredMethod = Activity.class.getDeclaredMethod("convertFromTranslucent", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(activity, new Object[0]);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
