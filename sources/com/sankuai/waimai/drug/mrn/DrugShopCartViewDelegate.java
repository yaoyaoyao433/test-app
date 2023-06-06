package com.sankuai.waimai.drug.mrn;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
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
import com.sankuai.waimai.drug.g;
import com.sankuai.waimai.drug.h;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.store.i.user.a;
import com.sankuai.waimai.store.mrn.shopcartbridge.event.c;
import com.sankuai.waimai.store.mrn.shopcartbridge.event.d;
import com.sankuai.waimai.store.mrn.shopcartbridge.event.e;
import com.sankuai.waimai.store.mrn.shopcartbridge.event.i;
import com.sankuai.waimai.store.mrn.shopcartbridge.event.j;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
import com.sankuai.waimai.store.shopping.cart.f;
import com.sankuai.waimai.store.util.ah;
import com.sankuai.waimai.store.util.monitor.monitor.StoreException;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class DrugShopCartViewDelegate extends FrameLayout implements com.sankuai.waimai.store.i.user.a, com.sankuai.waimai.store.observers.a {
    public static ChangeQuickRedirect a;
    public ReactContext b;
    ViewGroup c;
    ViewGroup d;
    public int e;
    private boolean f;
    private com.sankuai.waimai.store.platform.domain.manager.poi.a g;
    private String h;
    private String i;
    private String j;
    private int k;
    private h l;
    private boolean m;
    private boolean n;

    public DrugShopCartViewDelegate(@NonNull ReactContext reactContext) {
        super(reactContext.getApplicationContext());
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b71a5159576d4473c98e56e8f3b7e11", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b71a5159576d4473c98e56e8f3b7e11");
            return;
        }
        this.f = false;
        this.m = false;
        this.n = false;
        this.b = reactContext;
        this.e = getActivity() != null ? getActivity().hashCode() : -1;
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
        boolean z;
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2103180149807b68030d7bf6036581d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2103180149807b68030d7bf6036581d4");
            return;
        }
        if (getActivity() != null) {
            DrugMRNShopCartModule.successEventMap.remove(getActivity().hashCode());
        }
        if (eVar == null || eVar.a == null) {
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ce000129e247d28b490a9d7a5d389b78", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ce000129e247d28b490a9d7a5d389b78")).booleanValue();
        } else {
            z = t.a(this.h) && t.a(this.i);
        }
        if (z || eVar.a(this.h, this.i)) {
            this.h = eVar.f;
            this.i = eVar.g;
            this.g = eVar.a;
            com.sankuai.waimai.store.platform.domain.manager.poi.a aVar = eVar.a;
            boolean z2 = eVar.b;
            Object[] objArr3 = {aVar, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "072e32dacebb10bc22311ad08f6b3628", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "072e32dacebb10bc22311ad08f6b3628");
            } else {
                boolean z3 = z2 && aVar.c();
                if (this.l == null && this.c != null) {
                    String cid = getCid();
                    if (!a()) {
                        this.l = new g(getActivity(), aVar, -1, this.c, SCPageConfig.a(6, 55, cid), cid, getVolleyTAG(), null, null);
                        this.l.g();
                        this.l.b(z3);
                        this.l.a(new com.sankuai.waimai.store.shopping.cart.ui.e() { // from class: com.sankuai.waimai.drug.mrn.DrugShopCartViewDelegate.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.store.shopping.cart.ui.e
                            public final void a(boolean z4, boolean z5) {
                                Object[] objArr4 = {Byte.valueOf(z4 ? (byte) 1 : (byte) 0), Byte.valueOf(z5 ? (byte) 1 : (byte) 0)};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6fa2868b99f4177bcff3a911cbea71d4", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6fa2868b99f4177bcff3a911cbea71d4");
                                    return;
                                }
                                if (z4 && !DrugShopCartViewDelegate.this.m) {
                                    if (z5) {
                                        DrugShopCartViewDelegate.this.findViewById(R.id.layout_shop_cart).setBackgroundResource(R.color.wm_sg_color_FAFAFA);
                                    } else {
                                        DrugShopCartViewDelegate.this.findViewById(R.id.black_gap_view).setBackgroundResource(R.color.wm_sg_color_FAFAFA);
                                    }
                                }
                                DrugShopCartViewDelegate.this.m = z4;
                                DrugShopCartViewDelegate.this.n = z5;
                                WritableMap createMap = Arguments.createMap();
                                createMap.putBoolean("status", z4);
                                createMap.putBoolean("shoppingListOpened", z5);
                                if (DrugShopCartViewDelegate.this.getReactInstanceCurrentReactContext() != null) {
                                    com.sankuai.waimai.store.mrn.shopcartbridge.a.a(DrugShopCartViewDelegate.this.getReactInstanceCurrentReactContext(), "GoodsListStatusChange", createMap);
                                }
                            }
                        });
                    }
                }
            }
            if (eVar.a.c()) {
                ?? r8 = eVar.a.b.getState() == 3 ? 1 : 0;
                Object[] objArr4 = {Byte.valueOf((byte) r8)};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "44add014061d218a1754aa0266c959d0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "44add014061d218a1754aa0266c959d0");
                    return;
                }
                WritableMap createMap = Arguments.createMap();
                createMap.putBoolean("poiRest", r8);
                if (getReactInstanceCurrentReactContext() != null) {
                    com.sankuai.waimai.store.mrn.shopcartbridge.a.a(getReactInstanceCurrentReactContext(), "RefreshPoiRest", createMap);
                }
            }
        }
    }

    @Subscribe
    public void onMRNLoadShopCartFail(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e8feae41bdaee66024bfa99f227146e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e8feae41bdaee66024bfa99f227146e");
        } else if (dVar != null && dVar.a(this.h, this.i)) {
            this.c.setVisibility(8);
        }
    }

    @Subscribe
    public void onMRNIncreaseFoodSuccess(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5d299f022184728fc6cbaf7475e2b8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5d299f022184728fc6cbaf7475e2b8b");
        } else if (cVar == null || t.a(cVar.a) || this.l == null || a() || !cVar.a(this.h, this.i)) {
        } else {
            f.a().a(com.sankuai.waimai.store.mrn.shopcartbridge.a.a(getActivity().getWindow().getDecorView(), cVar.a), getActivity().hashCode(), TextUtils.isEmpty(this.i) ? this.h : this.i);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adca390d4b922e4fe23018fa9bdf160e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adca390d4b922e4fe23018fa9bdf160e");
        } else if (iVar == null || !iVar.a(this.h, this.i) || this.l == null) {
        } else {
            this.l.b((this.g != null && this.g.c() && iVar.a) ? false : false);
        }
    }

    @Subscribe
    public void onMRNShowSpecPopEvent(j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b064558304f21fd5744d0af8be001858", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b064558304f21fd5744d0af8be001858");
        } else if (jVar == null || jVar.b == null || jVar.a == null || this.l == null || a() || !jVar.a(this.h, this.i)) {
        } else {
            if (jVar.b.mrnExtension != null) {
                com.sankuai.waimai.store.drug.util.d.a(getActivity(), jVar.b, jVar.a.b, jVar.b.mrnExtension.getIndex(), jVar.b.mrnExtension.getKeyword(), jVar.b.mrnExtension.getSearchLogId(), jVar.b.mrnExtension.getSearchGlobalId(), 0, jVar.b.mrnExtension.getStid());
                return;
            }
            com.sankuai.waimai.store.drug.util.d.a(getActivity(), jVar.b, jVar.a.b, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ReactContext getReactInstanceCurrentReactContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "295e4373a06a2d612342c791d0639429", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReactContext) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "295e4373a06a2d612342c791d0639429");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93335381afde301e821b7b8a9dc2c923", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93335381afde301e821b7b8a9dc2c923");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be230d594a8058fb2468ff804026e89a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be230d594a8058fb2468ff804026e89a");
        } else if (a() || bVar != a.b.PHONE || com.sankuai.waimai.foundation.core.service.user.a.a != a.EnumC0947a.FROM_PRODUCT_LIST_PREORDER || this.l == null) {
        } else {
            this.l.c();
        }
    }

    @Override // com.sankuai.waimai.store.observers.a
    public final void ba_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76cba2aac3e4e785fae6c7376aab0c48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76cba2aac3e4e785fae6c7376aab0c48");
            return;
        }
        if (this.l != null) {
            this.l.h();
            boolean d = this.l.d();
            if (this.f != d) {
                Object[] objArr2 = {Byte.valueOf(d ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ff3081a9c06055e8cb3d6fe6c8ad696a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ff3081a9c06055e8cb3d6fe6c8ad696a");
                } else {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putBoolean("hasTip", d);
                    com.sankuai.waimai.store.mrn.shopcartbridge.a.a(getReactInstanceCurrentReactContext(), "AdjustContentInset", createMap);
                }
                this.f = d;
            }
        }
        com.sankuai.waimai.store.mrn.shopcartbridge.a.a(getReactInstanceCurrentReactContext(), "RefreshGoodsList", Arguments.createMap());
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31b948dc7d7be348146a23288abd59d0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31b948dc7d7be348146a23288abd59d0")).booleanValue() : com.sankuai.waimai.store.util.b.a(getActivity());
    }

    public String getCid() {
        return this.j;
    }

    public void setCid(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6354d7b7c701d30de2c7511379a16e0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6354d7b7c701d30de2c7511379a16e0f");
        } else if (a()) {
        } else {
            this.j = str;
            com.sankuai.waimai.store.manager.judas.b.a(getActivity().hashCode(), str);
        }
    }

    public void setRootTag(int i) {
        this.k = i;
    }

    public Activity getActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcaa9eff506f123ed4be8cc484ac16de", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcaa9eff506f123ed4be8cc484ac16de");
        }
        Activity currentActivity = this.b.getCurrentActivity();
        return (currentActivity == null && (this.b.getBaseContext() instanceof Activity)) ? (Activity) this.b.getBaseContext() : currentActivity;
    }

    public String getVolleyTAG() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20e8bade6802f6e3b2d02baf0ec78ac2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20e8bade6802f6e3b2d02baf0ec78ac2");
        }
        return getClass().getSimpleName() + System.currentTimeMillis();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ec4365b148d0d45393f61caad545f68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ec4365b148d0d45393f61caad545f68");
            return;
        }
        super.onDetachedFromWindow();
        if (getActivity() != null) {
            int hashCode = getActivity().hashCode();
            DrugMRNShopCartModule.successEventMap.remove(hashCode);
            com.sankuai.waimai.store.manager.judas.b.a(hashCode);
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "46a3bb6f4315562db499b815b2900ae4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "46a3bb6f4315562db499b815b2900ae4");
            return;
        }
        com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.c.a().b();
        com.meituan.android.bus.a.a().b(this);
        com.sankuai.waimai.store.order.a.e().b(this);
        com.sankuai.waimai.store.manager.user.a.a().a((com.sankuai.waimai.store.i.user.a) this);
        com.sankuai.waimai.store.base.net.c.a(getVolleyTAG());
        f.a().a(this.e);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "368c73b8719bc245cfc115d72ae5ff84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "368c73b8719bc245cfc115d72ae5ff84");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93dac9bab431e2271e0543bd1e217e6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93dac9bab431e2271e0543bd1e217e6d");
            return;
        }
        super.requestLayout();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3361303dd8a86581717450b2cfbf9f09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3361303dd8a86581717450b2cfbf9f09");
        } else if (getWidth() <= 0 || getHeight() <= 0) {
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
            layout(getPaddingLeft() + getLeft(), getPaddingTop() + getTop(), getPaddingLeft() + getLeft() + getWidth(), getPaddingTop() + getTop() + getHeight());
        }
    }
}
