package com.sankuai.waimai.store.mrn.shopcartbridge;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.store.i.user.a;
import com.sankuai.waimai.store.mrn.shopcartbridge.event.d;
import com.sankuai.waimai.store.mrn.shopcartbridge.event.e;
import com.sankuai.waimai.store.mrn.shopcartbridge.event.g;
import com.sankuai.waimai.store.mrn.shopcartbridge.event.h;
import com.sankuai.waimai.store.mrn.shopcartbridge.event.i;
import com.sankuai.waimai.store.mrn.shopcartbridge.event.j;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
import com.sankuai.waimai.store.shopping.cart.f;
import com.sankuai.waimai.store.util.ah;
import com.sankuai.waimai.store.util.am;
import com.sankuai.waimai.store.util.monitor.monitor.StoreException;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ShopCartViewDelegate extends FrameLayout implements com.sankuai.waimai.store.i.user.a, com.sankuai.waimai.store.observers.a {
    public static ChangeQuickRedirect a;
    public ReactContext b;
    ViewGroup c;
    ViewGroup d;
    public String e;
    public int f;
    private boolean g;
    private com.sankuai.waimai.store.platform.domain.manager.poi.a h;
    private String i;
    private String j;
    private int k;
    private com.sankuai.waimai.store.shopping.cart.delegate.c l;
    private boolean m;
    private boolean n;
    private String o;

    public ShopCartViewDelegate(@NonNull ReactContext reactContext) {
        super(reactContext.getApplicationContext());
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8e8b04ba8734d64868b247bcb505ef4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8e8b04ba8734d64868b247bcb505ef4");
            return;
        }
        this.g = false;
        this.m = false;
        this.n = false;
        this.b = reactContext;
        this.f = getActivity() != null ? getActivity().hashCode() : -1;
        com.meituan.android.bus.a.a().a(this);
        com.sankuai.waimai.store.order.a.e().a(this);
        com.sankuai.waimai.store.manager.user.a.a().b((com.sankuai.waimai.store.i.user.a) this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r8v3 */
    @Subscribe
    public void onMRNLoadShopCartSuccess(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c2f985dc075d47ee8457c9612f34d07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c2f985dc075d47ee8457c9612f34d07");
            return;
        }
        if (getActivity() != null) {
            SMMRNShopCartModule.successEventMap.remove(getActivity().hashCode());
        }
        if (eVar == null || eVar.a == null) {
            return;
        }
        if (t.a(this.i) || com.sankuai.waimai.store.order.a.e().b(this.i, eVar.f)) {
            this.i = eVar.f;
            this.h = eVar.a;
            com.sankuai.waimai.store.platform.domain.manager.poi.a aVar = eVar.a;
            boolean z = eVar.b;
            Object[] objArr2 = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aa18cc34db676c3d7229cd55ba8557ae", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aa18cc34db676c3d7229cd55ba8557ae");
            } else {
                boolean z2 = z && aVar.c();
                if (this.l == null && this.c != null) {
                    String cid = getCid();
                    if (!a()) {
                        this.l = com.sankuai.waimai.store.shopping.cart.delegate.c.a(getActivity(), this.b, this.k, aVar, this.c, this.d, SCPageConfig.a(6, 55, cid), cid, a(getActivity()));
                        this.l.a(this.e, this.o);
                        this.l.b(z2);
                        this.l.a(new com.sankuai.waimai.store.shopping.cart.ui.e() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.ShopCartViewDelegate.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.store.shopping.cart.ui.e
                            public final void a(boolean z3, boolean z4) {
                                Object[] objArr3 = {Byte.valueOf(z3 ? (byte) 1 : (byte) 0), Byte.valueOf(z4 ? (byte) 1 : (byte) 0)};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "92ff4743b34fd49f6d1a1fcb438ea372", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "92ff4743b34fd49f6d1a1fcb438ea372");
                                    return;
                                }
                                if (z3 && !ShopCartViewDelegate.this.m) {
                                    if (z4) {
                                        ShopCartViewDelegate.this.findViewById(R.id.layout_shop_cart).setBackgroundResource(R.color.wm_sg_color_FAFAFA);
                                    } else {
                                        ShopCartViewDelegate.this.findViewById(R.id.black_gap_view).setBackgroundResource(R.color.wm_sg_color_FAFAFA);
                                    }
                                }
                                ShopCartViewDelegate.this.m = z3;
                                ShopCartViewDelegate.this.n = z4;
                                WritableMap createMap = Arguments.createMap();
                                createMap.putBoolean("status", z3);
                                createMap.putBoolean("shoppingListOpened", z4);
                                if (ShopCartViewDelegate.this.getReactInstanceCurrentReactContext() != null) {
                                    a.a(ShopCartViewDelegate.this.getReactInstanceCurrentReactContext(), "GoodsListStatusChange", createMap);
                                }
                            }
                        });
                    }
                }
            }
            if (eVar.a.c()) {
                ?? r8 = eVar.a.b.getState() == 3 ? 1 : 0;
                Object[] objArr3 = {Byte.valueOf((byte) r8)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b53e4013626128bcaaff4deef376acd6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b53e4013626128bcaaff4deef376acd6");
                    return;
                }
                WritableMap createMap = Arguments.createMap();
                createMap.putBoolean("poiRest", r8);
                if (getReactInstanceCurrentReactContext() != null) {
                    a.a(getReactInstanceCurrentReactContext(), "RefreshPoiRest", createMap);
                }
            }
        }
    }

    @Subscribe
    public void onMRNLoadShopCartFail(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "649b79bd80ad91e8930a552ecff32114", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "649b79bd80ad91e8930a552ecff32114");
        } else if (dVar == null || !com.sankuai.waimai.store.order.a.e().b(this.i, dVar.f) || this.l == null) {
        } else {
            this.l.b(false);
        }
    }

    @Subscribe
    public void onMRNIncreaseFoodSuccess(com.sankuai.waimai.store.mrn.shopcartbridge.event.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46a407b834465fe879cd3f8328529d5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46a407b834465fe879cd3f8328529d5b");
        } else if (cVar == null || t.a(cVar.a) || this.l == null || a() || !com.sankuai.waimai.store.order.a.e().b(this.i, cVar.f)) {
        } else {
            f.a().a(a.a(getActivity().getWindow().getDecorView(), cVar.a), getActivity().hashCode(), this.i);
            if (!cVar.b || this.l == null) {
                return;
            }
            this.l.a(cVar.c);
        }
    }

    @Subscribe
    public void onMRNShowShopCartEvent(i iVar) {
        boolean z = true;
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8c401c21b9c2d303093735c82ec27c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8c401c21b9c2d303093735c82ec27c9");
        } else if (iVar == null || !com.sankuai.waimai.store.order.a.e().b(this.i, iVar.f) || this.l == null) {
        } else {
            this.l.b((this.h != null && this.h.c() && iVar.a) ? false : false);
        }
    }

    @Subscribe
    public void onMRNShowShopCarPopEvent(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cba8583b8cd678c893a955a609cb3283", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cba8583b8cd678c893a955a609cb3283");
            return;
        }
        am.a(getActivity(), "请在购物车内修改数量");
        if (hVar == null || this.l == null || a() || getActivity() == null || hVar.a != getActivity().hashCode()) {
            return;
        }
        this.l.b(true);
        this.l.a(true);
    }

    @Subscribe
    public void onMRNShowAggretionShopCarPopEvent(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38f1792cc8b739702e9d4f22b11c87d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38f1792cc8b739702e9d4f22b11c87d0");
            return;
        }
        am.a(getActivity(), "请在购物车内修改数量");
        if (gVar == null || this.l == null || a() || getActivity() == null || gVar.a != getActivity().hashCode()) {
            return;
        }
        this.l.b(true);
        com.sankuai.waimai.store.shopping.cart.delegate.c cVar = this.l;
        Object[] objArr2 = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.shopping.cart.delegate.c.i;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "6173d181bcde8f9a62937980ffb73ed0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "6173d181bcde8f9a62937980ffb73ed0");
        } else if (!cVar.k() || cVar.k == null) {
        } else {
            cVar.k.a("mrn_show_shopcart_list", com.sankuai.waimai.store.mrn.d.a());
        }
    }

    @Subscribe
    public void onMRNPoiSubscribeEvent(com.sankuai.waimai.store.mrn.shopcartbridge.event.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee5ddd3f3d072332146a05644fe18a1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee5ddd3f3d072332146a05644fe18a1b");
            return;
        }
        com.sankuai.waimai.store.platform.domain.manager.poi.a l = com.sankuai.waimai.store.order.a.e().l(fVar.a);
        if (l == null || this.l == null) {
            return;
        }
        l.b.subscribe = fVar.b;
        com.sankuai.waimai.store.platform.domain.core.shopcart.b k = com.sankuai.waimai.store.order.a.e().k(fVar.a);
        if (k != null && k.z != null) {
            k.z.put("subscribe", Integer.valueOf(fVar.b));
        }
        this.l.h();
    }

    @Subscribe
    public void onMRNShowSpecPopEvent(j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a53da7dda0e3c4baf791ba9a1720081c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a53da7dda0e3c4baf791ba9a1720081c");
        } else if (jVar == null || jVar.b == null || jVar.a == null || this.l == null || a() || !com.sankuai.waimai.store.order.a.e().b(this.i, jVar.f)) {
        } else {
            if (jVar.b.mrnExtension != null) {
                com.sankuai.waimai.store.router.g.a(getActivity(), jVar.b, jVar.a.b, jVar.b.mrnExtension.getIndex(), jVar.b.mrnExtension.getKeyword(), jVar.b.mrnExtension.getSearchLogId(), jVar.b.mrnExtension.getSearchGlobalId(), 0, jVar.b.mrnExtension.getStid());
                return;
            }
            com.sankuai.waimai.store.router.g.a(getActivity(), jVar.b, jVar.a.b, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ReactContext getReactInstanceCurrentReactContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8a44b8e3e1463f0bb2a44563a0bd47a", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReactContext) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8a44b8e3e1463f0bb2a44563a0bd47a");
        }
        try {
            if (this.b != null) {
                return this.b;
            }
            ah.a(StoreException.MrnBridgeException, "getReactInstanceManager: null");
            return null;
        } catch (Exception e) {
            StoreException storeException = StoreException.MrnBridgeException;
            ah.a(storeException, "getReactInstanceCurrentReactContext: " + e.getMessage());
            return null;
        }
    }

    @Override // com.sankuai.waimai.store.i.user.a
    public final void a(a.EnumC1205a enumC1205a) {
        Object[] objArr = {enumC1205a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6235717e2f274c9d4312e296bf53506d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6235717e2f274c9d4312e296bf53506d");
        } else if (enumC1205a == null) {
        } else {
            if ((enumC1205a != a.EnumC1205a.LOGIN && enumC1205a != a.EnumC1205a.LOGOUT) || a() || this.l == null) {
                return;
            }
            this.l.b();
        }
    }

    @Override // com.sankuai.waimai.store.i.user.a
    public final void a(a.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1765a1a5abe685c9bf27acf5adbe07c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1765a1a5abe685c9bf27acf5adbe07c8");
        } else if (a() || bVar != a.b.PHONE || com.sankuai.waimai.foundation.core.service.user.a.a != a.EnumC0947a.FROM_PRODUCT_LIST_PREORDER || this.l == null) {
        } else {
            this.l.c();
        }
    }

    @Override // com.sankuai.waimai.store.observers.a
    public final void ba_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1015bba703cbc6f287a50e301ba48c65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1015bba703cbc6f287a50e301ba48c65");
            return;
        }
        if (this.l != null) {
            this.l.h();
            boolean d = this.l.d();
            if (this.g != d) {
                Object[] objArr2 = {Byte.valueOf(d ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "18d3a73593684c716d61dfe985e6f48c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "18d3a73593684c716d61dfe985e6f48c");
                } else {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putBoolean("hasTip", d);
                    a.a(getReactInstanceCurrentReactContext(), "AdjustContentInset", createMap);
                }
                this.g = d;
            }
        }
        a.a(getReactInstanceCurrentReactContext(), "RefreshGoodsList", Arguments.createMap());
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db5b87fdaf657f8d8be66395df400412", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db5b87fdaf657f8d8be66395df400412")).booleanValue() : com.sankuai.waimai.store.util.b.a(getActivity());
    }

    public String getCid() {
        return this.j;
    }

    public void setCid(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b0209659f391c2ccb53462e40ec13ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b0209659f391c2ccb53462e40ec13ca");
        } else if (a()) {
        } else {
            this.j = str;
            com.sankuai.waimai.store.manager.judas.b.a(getActivity().hashCode(), str);
        }
    }

    public void setRootTag(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9df99d18d2ea973d6c4ec02c758718f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9df99d18d2ea973d6c4ec02c758718f6");
            return;
        }
        this.k = i;
        if (this.l != null) {
            this.l.j = i;
        }
    }

    public void setLocalBusinessExtra(String str) {
        this.e = str;
    }

    public void setMrnMinVersion(String str) {
        this.o = str;
    }

    public Activity getActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b578144f9d8064d41bc34109b858a8e2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b578144f9d8064d41bc34109b858a8e2");
        }
        Activity currentActivity = this.b.getCurrentActivity();
        return (currentActivity == null && (this.b.getBaseContext() instanceof Activity)) ? (Activity) this.b.getBaseContext() : currentActivity;
    }

    public static String a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "58bf493cc353680edfd5cea04cbce607", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "58bf493cc353680edfd5cea04cbce607");
        }
        if (activity != null) {
            return activity.getClass().getSimpleName() + activity.hashCode();
        }
        return "MRN_SHOP_CART";
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "475bdf04676c336b6151a8293c02278a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "475bdf04676c336b6151a8293c02278a");
            return;
        }
        super.onDetachedFromWindow();
        if (getActivity() != null) {
            int hashCode = getActivity().hashCode();
            SMMRNShopCartModule.successEventMap.remove(hashCode);
            com.sankuai.waimai.store.manager.judas.b.a(hashCode);
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ab6bb7f0fa40b082c51a9c84a8358c28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ab6bb7f0fa40b082c51a9c84a8358c28");
            return;
        }
        com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.c.a().b();
        com.meituan.android.bus.a.a().b(this);
        com.sankuai.waimai.store.order.a.e().b(this);
        com.sankuai.waimai.store.manager.user.a.a().a((com.sankuai.waimai.store.i.user.a) this);
        com.sankuai.waimai.store.base.net.c.a(a(getActivity()));
        f.a().a(this.f);
        if (this.l != null) {
            this.l.a();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "644cbc8e215182cf5049022a66c44c6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "644cbc8e215182cf5049022a66c44c6b");
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (this.m) {
            if (this.n) {
                findViewById(R.id.layout_shop_cart).setBackgroundResource(R.color.wm_sc_black8);
            } else {
                findViewById(R.id.black_gap_view).setBackgroundResource(R.color.wm_sc_black_cc);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b8afb649804bb134f46d4b36c967b47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b8afb649804bb134f46d4b36c967b47");
            return;
        }
        super.requestLayout();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b43328bdc84d7439c37d7f160b719cfb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b43328bdc84d7439c37d7f160b719cfb");
        } else if (getWidth() <= 0 || getHeight() <= 0) {
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
            layout(getPaddingLeft() + getLeft(), getPaddingTop() + getTop(), getPaddingLeft() + getLeft() + getWidth(), getPaddingTop() + getTop() + getHeight());
        }
    }
}
