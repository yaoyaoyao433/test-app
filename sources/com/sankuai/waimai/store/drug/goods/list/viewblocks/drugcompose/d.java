package com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NumberUtils;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.store.drug.coupon.MemberCouponEntry;
import com.sankuai.waimai.store.drug.goods.list.helper.a;
import com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.DrugPoiTabMRNFragment;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.util.monitor.monitor.SGStoreContentRender;
import com.sankuai.waimai.store.util.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends com.sankuai.waimai.store.base.b implements com.meituan.android.cube.core.pager.a, a.InterfaceC1147a, m {
    public static ChangeQuickRedirect a;
    FragmentManager b;
    DrugPoiTabMRNFragment c;
    com.facebook.react.views.scroll.e d;
    final int e;
    ViewTreeObserver.OnScrollChangedListener f;
    com.sankuai.waimai.store.drug.goods.list.helper.b g;
    List<RecyclerView.k> h;
    private String i;
    private com.sankuai.waimai.store.drug.goods.list.helper.a j;
    private com.sankuai.waimai.store.drug.goods.list.delegate.d k;

    public d(com.sankuai.waimai.store.drug.goods.list.delegate.d dVar, @NonNull Context context, DrugPoiTabMRNFragment drugPoiTabMRNFragment, FragmentManager fragmentManager, RestMenuResponse.b bVar, int i) {
        super(context);
        Object[] objArr = {dVar, context, drugPoiTabMRNFragment, fragmentManager, bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c08f194c72c52a67cae9e265deeb4102", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c08f194c72c52a67cae9e265deeb4102");
            return;
        }
        this.b = fragmentManager;
        this.c = drugPoiTabMRNFragment;
        this.i = bVar == null ? "" : bVar.b;
        this.e = i;
        this.k = dVar;
        this.g = new com.sankuai.waimai.store.drug.goods.list.helper.b();
        if (bVar == null || bVar.c != 1) {
            return;
        }
        this.j = new com.sankuai.waimai.store.drug.goods.list.helper.a();
        final com.sankuai.waimai.store.drug.goods.list.helper.a aVar = this.j;
        Object[] objArr2 = {dVar, this};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.drug.goods.list.helper.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "b19db1e030e93652df6d49d96581d65d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "b19db1e030e93652df6d49d96581d65d");
            return;
        }
        aVar.d = dVar.k();
        aVar.g = dVar.l();
        aVar.b = dVar.d();
        aVar.e = this;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.drug.goods.list.helper.a.a;
        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "c51e00704f48fee53f9d81995089d3b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "c51e00704f48fee53f9d81995089d3b7");
        } else {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("medicine:show_coupon_panel_view");
            intentFilter.addAction("medicine:show_member_coupon_alert_view");
            intentFilter.addAction("medicine:coupon_list_item_did_change");
            intentFilter.addAction("medicine:new_user_coupon_did_change");
            aVar.c = new BroadcastReceiver() { // from class: com.sankuai.waimai.store.drug.goods.list.helper.MrnPoiCouponHelper$1
                public static ChangeQuickRedirect a;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent) {
                    Poi.PoiCouponItem poiCouponItem;
                    Poi.PoiCouponEntity poiCoupon;
                    Object[] objArr4 = {context2, intent};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "036e9fddf3a176261ae50c73db852cb3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "036e9fddf3a176261ae50c73db852cb3");
                        return;
                    }
                    String action = intent.getAction();
                    Bundle extras = intent.getExtras();
                    if (extras == null || a.this.d == null || !a.this.d.x()) {
                        return;
                    }
                    String string = extras.getString("data");
                    if (TextUtils.isEmpty(string)) {
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        if (com.sankuai.waimai.store.platform.domain.manager.poi.a.a(jSONObject.optString(FoodDetailNetWorkPreLoader.URI_POI_STR), a.this.b.h(), NumberUtils.parseLong(jSONObject.optString("poiId"), -1L), a.this.b.g())) {
                            if ("medicine:show_coupon_panel_view".equals(action)) {
                                String optString = jSONObject.optString("selectedTab");
                                if (!"0".equals(optString) && !TextUtils.isEmpty(optString)) {
                                    if ("1".equals(optString)) {
                                        com.sankuai.waimai.store.drug.coupons.b.a(a.this.d, a.this.b, 0);
                                        return;
                                    }
                                    return;
                                }
                                com.sankuai.waimai.store.drug.coupons.b.a(a.this.d, a.this.b);
                            } else if ("medicine:show_member_coupon_alert_view".equals(action)) {
                                String optString2 = jSONObject.optString("couponListItem");
                                a.this.f.a(a.this.b.g(), a.this.b.h(), a.this.g, (Dialog) null, 1, TextUtils.isEmpty(optString2) ? null : (Poi.PoiCouponItem) i.a(optString2, Poi.PoiCouponItem.class));
                            } else if ("medicine:coupon_list_item_did_change".equals(action)) {
                                Poi.PoiCouponItem poiCouponItem2 = (Poi.PoiCouponItem) i.a(jSONObject.optString("couponListItem"), Poi.PoiCouponItem.class);
                                if (poiCouponItem2 != null && (poiCoupon = a.this.b.b.getPoiCoupon()) != null && !com.sankuai.shangou.stone.util.a.b(poiCoupon.getPoiCouponItems())) {
                                    Iterator<Poi.PoiCouponItem> it = a.this.b.b.getPoiCoupon().getPoiCouponItems().iterator();
                                    while (it.hasNext()) {
                                        Poi.PoiCouponItem next = it.next();
                                        if (next != null && next.mCouponId == poiCouponItem2.mCouponId) {
                                            next.copyValueFrom(poiCouponItem2);
                                            com.sankuai.waimai.store.manager.coupon.c.a().a(next);
                                            return;
                                        }
                                    }
                                }
                            } else if ("medicine:new_user_coupon_did_change".equals(action)) {
                                a aVar2 = a.this;
                                Object[] objArr5 = {jSONObject};
                                ChangeQuickRedirect changeQuickRedirect5 = a.a;
                                if (PatchProxy.isSupport(objArr5, aVar2, changeQuickRedirect5, false, "df81a3f45e62c8e02a3ed7023d7184af", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, aVar2, changeQuickRedirect5, false, "df81a3f45e62c8e02a3ed7023d7184af");
                                    return;
                                }
                                Poi.PoiCouponItem poiCouponItem3 = (Poi.PoiCouponItem) i.a(jSONObject.optString("couponListItem"), Poi.PoiCouponItem.class);
                                if (poiCouponItem3 == null || aVar2.b.b == null || aVar2.b.b.getNewUserRegion() == null || (poiCouponItem = aVar2.b.b.getNewUserRegion().newUserCoupon) == null) {
                                    return;
                                }
                                poiCouponItem.mCouponStatus = poiCouponItem3.mCouponStatus;
                                poiCouponItem.mCouponValue = poiCouponItem3.mCouponValue;
                                poiCouponItem.exchangeCouponPrefix = poiCouponItem3.exchangeCouponPrefix;
                                poiCouponItem.mCouponButtonText = poiCouponItem3.mCouponButtonText;
                                com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.poilist.event.b(String.valueOf(poiCouponItem.mCouponId), String.valueOf(poiCouponItem.mCouponStatus)));
                                if (TextUtils.isEmpty(poiCouponItem.mSchemeUrl)) {
                                    return;
                                }
                                com.sankuai.waimai.store.router.d.a(aVar2.d, poiCouponItem.mSchemeUrl + "&poi_id=" + aVar2.b.g() + "&poi_id_str=" + aVar2.b.h() + "&coupon_value=" + poiCouponItem.mCouponValue + "&condition_text=" + poiCouponItem.mCouponConditionText);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            };
            aVar.d.registerReceiver(aVar.c, intentFilter);
        }
        aVar.f = new com.sankuai.waimai.store.drug.coupon.d(new MemberCouponEntry(aVar.d));
        com.sankuai.waimai.store.manager.coupon.c.a().a(aVar);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "261b259a807c2ae30a902d84804f6d8f", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "261b259a807c2ae30a902d84804f6d8f");
        }
        View inflate = layoutInflater.inflate(R.layout.wm_drug_shop_content_fragment_tab_mrn_container, viewGroup, false);
        inflate.setId(this.e);
        return inflate;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42237c6634d7abf893af08bb9f6b71a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42237c6634d7abf893af08bb9f6b71a1");
            return;
        }
        super.onViewCreated();
        DrugPoiTabMRNFragment drugPoiTabMRNFragment = this.c;
        DrugPoiTabMRNFragment.a aVar = new DrugPoiTabMRNFragment.a() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.d.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.DrugPoiTabMRNFragment.a
            public final void a(@NonNull com.facebook.react.views.scroll.e eVar) {
                Object[] objArr2 = {eVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0401a788b4a14b27675650d41d1017e2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0401a788b4a14b27675650d41d1017e2");
                    return;
                }
                d.this.d = eVar;
                final d dVar = d.this;
                com.facebook.react.views.scroll.e eVar2 = d.this.d;
                Object[] objArr3 = {eVar2};
                ChangeQuickRedirect changeQuickRedirect3 = d.a;
                if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "82f48c278fc1f152fc96a88595db203e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "82f48c278fc1f152fc96a88595db203e");
                } else if (eVar2 != null) {
                    dVar.f = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.d.2
                        public static ChangeQuickRedirect a;

                        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                        public final void onScrollChanged() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4f808e25ae4219063aeb636071122eac", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4f808e25ae4219063aeb636071122eac");
                                return;
                            }
                            com.sankuai.waimai.store.drug.goods.list.helper.b bVar = d.this.g;
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.store.drug.goods.list.helper.b.a;
                            if (PatchProxy.isSupport(objArr5, bVar, changeQuickRedirect5, false, "6bd1cbf5c6f937ca4ffc26e791fc897b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, bVar, changeQuickRedirect5, false, "6bd1cbf5c6f937ca4ffc26e791fc897b");
                            } else if (com.sankuai.shangou.stone.util.a.b(bVar.c)) {
                            } else {
                                int max = Math.max(bVar.b.getScrollY(), 0);
                                if (bVar.e) {
                                    if (max != bVar.d) {
                                        bVar.a(1);
                                    }
                                } else {
                                    if (max != bVar.d) {
                                        bVar.a(2);
                                    }
                                    bVar.g.removeMessages(0);
                                    bVar.g.sendEmptyMessageDelayed(0, 5L);
                                }
                                bVar.d = max;
                            }
                        }
                    };
                    com.sankuai.waimai.store.drug.goods.list.helper.b bVar = dVar.g;
                    List<RecyclerView.k> list = dVar.h;
                    Object[] objArr4 = {eVar2, list};
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.drug.goods.list.helper.b.a;
                    if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "fcad75971b909324969a9667a6711eee", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "fcad75971b909324969a9667a6711eee");
                    } else {
                        bVar.b = eVar2;
                        bVar.c = list;
                        bVar.f = new RecyclerView(eVar2.getContext());
                    }
                    eVar2.getViewTreeObserver().addOnScrollChangedListener(dVar.f);
                }
            }
        };
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = DrugPoiTabMRNFragment.a;
        if (PatchProxy.isSupport(objArr2, drugPoiTabMRNFragment, changeQuickRedirect2, false, "63fdaea7ed973f424cd0dea387e703f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, drugPoiTabMRNFragment, changeQuickRedirect2, false, "63fdaea7ed973f424cd0dea387e703f7");
        } else {
            drugPoiTabMRNFragment.m = aVar;
            if (drugPoiTabMRNFragment.m != null && drugPoiTabMRNFragment.k != null) {
                drugPoiTabMRNFragment.m.a(drugPoiTabMRNFragment.k);
            }
        }
        this.c.n = this.g;
    }

    @Override // com.meituan.android.cube.core.pager.a
    public final void a(boolean z) {
        boolean z2;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "722be23831edb4bb347fbb51ac6bc834", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "722be23831edb4bb347fbb51ac6bc834");
            return;
        }
        DrugPoiTabMRNFragment drugPoiTabMRNFragment = this.c;
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = DrugPoiTabMRNFragment.a;
        if (PatchProxy.isSupport(objArr2, drugPoiTabMRNFragment, changeQuickRedirect2, false, "02550fed7f1e528dde1f15d51e03eae6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, drugPoiTabMRNFragment, changeQuickRedirect2, false, "02550fed7f1e528dde1f15d51e03eae6");
        } else {
            if (z) {
                if (drugPoiTabMRNFragment.k == null) {
                    drugPoiTabMRNFragment.x();
                } else {
                    drugPoiTabMRNFragment.v();
                }
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = DrugPoiTabMRNFragment.a;
                if (PatchProxy.isSupport(objArr3, drugPoiTabMRNFragment, changeQuickRedirect3, false, "b7d94391a74deb21ce4bbc2fb6d889bc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, drugPoiTabMRNFragment, changeQuickRedirect3, false, "b7d94391a74deb21ce4bbc2fb6d889bc");
                } else if (drugPoiTabMRNFragment.k != null && drugPoiTabMRNFragment.b != null && drugPoiTabMRNFragment.b.e() != null) {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = DrugPoiTabMRNFragment.a;
                    if (PatchProxy.isSupport(objArr4, drugPoiTabMRNFragment, changeQuickRedirect4, false, "891886cb3280b5327f9250653e543c5d", RobustBitConfig.DEFAULT_VALUE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(objArr4, drugPoiTabMRNFragment, changeQuickRedirect4, false, "891886cb3280b5327f9250653e543c5d")).booleanValue();
                    } else {
                        z2 = (drugPoiTabMRNFragment.b == null || drugPoiTabMRNFragment.b.d() == null || drugPoiTabMRNFragment.b.d().b == null || !w.f(drugPoiTabMRNFragment.b.d().b) || drugPoiTabMRNFragment.b.d().b.brandStory == null) ? false : true;
                    }
                    if (z2 || drugPoiTabMRNFragment.p) {
                        drugPoiTabMRNFragment.b.e().setForbidScroll(drugPoiTabMRNFragment.b.e().canScrollVertically(-1) && drugPoiTabMRNFragment.w());
                    } else {
                        drugPoiTabMRNFragment.b.e().setForbidScroll(drugPoiTabMRNFragment.w());
                    }
                }
            } else {
                drugPoiTabMRNFragment.u();
            }
            Object[] objArr5 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect5 = DrugPoiTabMRNFragment.a;
            if (PatchProxy.isSupport(objArr5, drugPoiTabMRNFragment, changeQuickRedirect5, false, "5ac057422ba27ac356023fe668b3c317", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, drugPoiTabMRNFragment, changeQuickRedirect5, false, "5ac057422ba27ac356023fe668b3c317");
            } else {
                WritableMap createMap = Arguments.createMap();
                createMap.putBoolean("cur_view_visible", z);
                if (drugPoiTabMRNFragment.o != null) {
                    createMap.putString("cur_tab_info", com.sankuai.waimai.store.util.i.a(drugPoiTabMRNFragment.o));
                }
                ReactContext t = drugPoiTabMRNFragment.t();
                if (t != null) {
                    com.sankuai.waimai.store.mrn.shopcartbridge.a.a(t, "PoiTabVisibleChange", createMap);
                }
            }
        }
        if (this.c.isAdded()) {
            return;
        }
        try {
            getView().post(new Runnable() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.d.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "0bdd830b74ea444afbbb1fbb8c7d72e3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "0bdd830b74ea444afbbb1fbb8c7d72e3");
                    } else {
                        d.this.b.beginTransaction().replace(d.this.e, d.this.c).commitAllowingStateLoss();
                    }
                }
            });
        } catch (Exception e) {
            View findViewById = this.k.k().findViewById(this.e);
            View findViewById2 = getView() != null ? getView().findViewById(this.e) : null;
            SGStoreContentRender sGStoreContentRender = SGStoreContentRender.FoodComposeContainerLoad;
            StringBuilder sb = new StringBuilder("parentView:");
            sb.append(findViewById == null);
            sb.append("getView():");
            sb.append(getView() == null);
            sb.append("layoutView:");
            sb.append(findViewById2 == null);
            String sb2 = sb.toString();
            com.sankuai.waimai.store.util.monitor.c.a(sGStoreContentRender, sb2, "监控onVisibilityChanged时机问题：" + e.getMessage());
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.m
    public final void a(RecyclerView.k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec731359d6d999960181184620ed8237", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec731359d6d999960181184620ed8237");
            return;
        }
        if (this.h == null) {
            this.h = new ArrayList();
        }
        this.h.add(kVar);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27a1419790032ca60dd3d856eb2f7116", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27a1419790032ca60dd3d856eb2f7116");
            return;
        }
        super.onDestroy();
        if (this.d != null && this.f != null) {
            this.d.getViewTreeObserver().removeOnScrollChangedListener(this.f);
        }
        if (this.g != null) {
            com.sankuai.waimai.store.drug.goods.list.helper.b bVar = this.g;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.drug.goods.list.helper.b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "48f0240e0e5bde7ddcd5619bf8b2c440", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "48f0240e0e5bde7ddcd5619bf8b2c440");
            } else {
                bVar.g.removeCallbacksAndMessages(null);
            }
        }
        if (this.j != null) {
            com.sankuai.waimai.store.drug.goods.list.helper.a aVar = this.j;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.drug.goods.list.helper.a.a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "27d01e23c2791cf0d78d9a0645e48fb5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "27d01e23c2791cf0d78d9a0645e48fb5");
                return;
            }
            aVar.d.unregisterReceiver(aVar.c);
            com.sankuai.waimai.store.manager.coupon.c.a().b(aVar);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.helper.a.InterfaceC1147a
    public final ReactContext a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ed730e3c0efe15d0c222e1280c6a58e", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReactContext) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ed730e3c0efe15d0c222e1280c6a58e");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1f00c706a9efa1c3ccbf3f96d938aa79", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReactContext) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1f00c706a9efa1c3ccbf3f96d938aa79");
        }
        if (this.c == null || this.c.t() == null) {
            return null;
        }
        return this.c.t();
    }
}
