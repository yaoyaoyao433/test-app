package com.sankuai.waimai.store.drug.goods.list.delegate.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.entity.EventInfo;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.constants.ShopConstants;
import com.sankuai.waimai.store.drug.goods.list.controller.DrugShopStatusViewModel;
import com.sankuai.waimai.store.drug.goods.list.utils.MultiFoodsHandler;
import com.sankuai.waimai.store.drug.newwidgets.DrugNetInfoLoadView;
import com.sankuai.waimai.store.drug.newwidgets.FloatingWindowLayout;
import com.sankuai.waimai.store.drug.util.PoiListIconAnim;
import com.sankuai.waimai.store.entity.RestRecommendPoi;
import com.sankuai.waimai.store.i.user.a;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.SpuProductsResponse;
import com.sankuai.waimai.store.platform.domain.core.im.DrugImEntranceEntity;
import com.sankuai.waimai.store.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.domain.core.shop.GetMenuResponse;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.repository.model.GoodDetailResponse;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
import com.sankuai.waimai.store.util.SGLocationUtils;
import com.sankuai.waimai.store.util.aa;
import com.sankuai.waimai.store.util.ab;
import com.sankuai.waimai.store.util.ak;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.util.am;
import com.sankuai.waimai.store.util.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class c implements com.sankuai.waimai.store.drug.goods.list.delegate.b, com.sankuai.waimai.store.drug.goods.list.delegate.c {
    public static ChangeQuickRedirect a;
    protected DrugNetInfoLoadView A;
    public com.sankuai.waimai.store.shopping.cart.delegate.b B;
    public FloatingWindowLayout C;
    com.sankuai.shangou.stone.whiteboard.e D;
    long E;
    protected boolean F;
    protected long G;
    protected long H;
    protected long I;
    FrameLayout J;
    private boolean K;
    private com.sankuai.waimai.store.drug.goods.list.viewblocks.controller.b L;
    private View M;
    private com.sankuai.waimai.store.drug.consultation.a N;
    private Set<Long> O;
    private com.sankuai.waimai.store.i.poi.a P;
    protected long b;
    protected String c;
    protected long d;
    protected long e;
    int f;
    protected int g;
    protected String h;
    public String i;
    public Map<String, Object> j;
    protected com.sankuai.waimai.store.manager.marketing.a k;
    protected String l;
    protected String m;
    protected String n;
    protected String o;
    protected String p;
    protected String q;
    protected int r;
    public boolean s;
    public boolean t;
    public boolean u;
    protected boolean v;
    boolean w;
    @NonNull
    public com.sankuai.waimai.store.platform.domain.manager.poi.a x;
    @NonNull
    public SCBaseActivity y;
    public com.sankuai.waimai.store.drug.goods.list.viewblocks.base.a z;

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.c
    public final void a(long j) {
    }

    @Override // com.sankuai.waimai.store.base.a
    public void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fc199b7129a80889bfb5558cf16d17d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fc199b7129a80889bfb5558cf16d17d");
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.c
    public boolean n() {
        return false;
    }

    public String r() {
        return "";
    }

    public RestMenuResponse s() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.sankuai.waimai.store.drug.goods.list.delegate.impl.c r26, com.sankuai.waimai.store.repository.model.RestMenuResponse r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.drug.goods.list.delegate.impl.c.a(com.sankuai.waimai.store.drug.goods.list.delegate.impl.c, com.sankuai.waimai.store.repository.model.RestMenuResponse, java.lang.String):void");
    }

    public c(@NonNull SCBaseActivity sCBaseActivity, int i) {
        Object[] objArr = {sCBaseActivity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18ecf5faeb4c20bb317009735817d9d5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18ecf5faeb4c20bb317009735817d9d5");
            return;
        }
        this.b = -1L;
        this.c = "";
        this.d = -1L;
        this.e = -1L;
        this.g = 0;
        this.j = new HashMap();
        this.s = false;
        this.t = false;
        this.v = false;
        this.w = false;
        this.K = true;
        this.D = new com.sankuai.shangou.stone.whiteboard.e();
        this.O = new HashSet();
        this.I = 0L;
        this.P = new com.sankuai.waimai.store.i.poi.a() { // from class: com.sankuai.waimai.store.drug.goods.list.delegate.impl.c.6
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.i.poi.a
            public final void a(String str, List<com.sankuai.waimai.platform.domain.core.order.a> list) {
                Object[] objArr2 = {str, list};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "64137c91ed7a574675406823ad5c81e4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "64137c91ed7a574675406823ad5c81e4");
                } else {
                    com.sankuai.waimai.store.order.a.e().d(c.this.x.d(), list);
                }
            }

            @Override // com.sankuai.waimai.store.i.poi.a
            public final void c_(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d7b9d9005d38b3022171793d72e66883", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d7b9d9005d38b3022171793d72e66883");
                } else if (com.sankuai.waimai.store.platform.domain.manager.poi.a.a(str, c.this.x.d())) {
                    c.this.a(false);
                }
            }
        };
        this.y = sCBaseActivity;
        this.f = i;
        this.x = new com.sankuai.waimai.store.platform.domain.manager.poi.a();
    }

    @Override // com.sankuai.waimai.store.base.a
    public void a(FragmentActivity fragmentActivity, Bundle bundle) {
        Object[] objArr = {fragmentActivity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05eb20f8a0438ef22a3ac9f278db4980", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05eb20f8a0438ef22a3ac9f278db4980");
            return;
        }
        this.E = SystemClock.elapsedRealtime();
        this.C = (FloatingWindowLayout) this.y.findViewById(R.id.restaurant_common_layout);
        this.M = fragmentActivity.findViewById(R.id.market_back_item);
        this.L = new com.sankuai.waimai.store.drug.goods.list.viewblocks.controller.b(this);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "20574bfc5be746acfd8671ba20ddbcb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "20574bfc5be746acfd8671ba20ddbcb5");
        } else {
            if (com.sankuai.shangou.stone.util.k.b(this.y)) {
                u.d(this.M, 0, u.a(this.y), 0, 0);
            }
            this.M.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.goods.list.delegate.impl.c.7
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "746ab1cd7fec0983da713a371339395a", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "746ab1cd7fec0983da713a371339395a");
                    } else {
                        c.this.y.onBackPressed();
                    }
                }
            });
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "803385c6bc688ed7120336229c9de39e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "803385c6bc688ed7120336229c9de39e");
        } else {
            this.A = (DrugNetInfoLoadView) this.y.findViewById(R.id.market_net_info);
            this.A.setReloadClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.goods.list.delegate.impl.c.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr4 = {view};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "79581e36d77fe0a127c9a725265c8f65", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "79581e36d77fe0a127c9a725265c8f65");
                    } else {
                        c.this.a(true);
                    }
                }
            });
        }
        Object[] objArr4 = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ede36ef0715d16a0f151622e74c0f77b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ede36ef0715d16a0f151622e74c0f77b");
        } else {
            View findViewById = fragmentActivity.findViewById(R.id.tv_drug_poi_new_debug_tag);
            if (com.sankuai.waimai.store.config.k.b()) {
                u.c(findViewById);
            } else {
                u.a(findViewById);
            }
        }
        com.sankuai.waimai.store.manager.poi.a.a().a(this.P);
        com.sankuai.waimai.store.manager.user.a.a().b((com.sankuai.waimai.store.i.user.a) this);
        com.sankuai.waimai.store.order.a.e().a(this);
        d(this.y.getIntent());
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "4f40ea92f3ba6eb0545d33b45ddd2846", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "4f40ea92f3ba6eb0545d33b45ddd2846");
        } else {
            this.y.s().recordStep("page_api_start");
        }
        DrugShopStatusViewModel drugShopStatusViewModel = (DrugShopStatusViewModel) android.arch.lifecycle.q.a((FragmentActivity) this.y).a(DrugShopStatusViewModel.class);
        android.arch.lifecycle.k<com.sankuai.waimai.store.drug.goods.list.model.b> kVar = drugShopStatusViewModel.c;
        SCBaseActivity sCBaseActivity = this.y;
        Object[] objArr6 = {this};
        ChangeQuickRedirect changeQuickRedirect6 = d.a;
        kVar.a(sCBaseActivity, PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "d1f54c2763355e2eab632e03bcb1f9a2", RobustBitConfig.DEFAULT_VALUE) ? (android.arch.lifecycle.l) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "d1f54c2763355e2eab632e03bcb1f9a2") : new d(this));
        android.arch.lifecycle.k<Boolean> kVar2 = drugShopStatusViewModel.e;
        SCBaseActivity sCBaseActivity2 = this.y;
        Object[] objArr7 = {this};
        ChangeQuickRedirect changeQuickRedirect7 = e.a;
        kVar2.a(sCBaseActivity2, PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "90d229a34cdb942db56a84729cc0d661", RobustBitConfig.DEFAULT_VALUE) ? (android.arch.lifecycle.l) PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "90d229a34cdb942db56a84729cc0d661") : new e(this));
        android.arch.lifecycle.k<com.sankuai.waimai.store.drug.goods.list.model.c> kVar3 = drugShopStatusViewModel.f;
        SCBaseActivity sCBaseActivity3 = this.y;
        Object[] objArr8 = {this};
        ChangeQuickRedirect changeQuickRedirect8 = f.a;
        kVar3.a(sCBaseActivity3, PatchProxy.isSupport(objArr8, null, changeQuickRedirect8, true, "aacfbcd4cc27167ac69c353494eec9f1", RobustBitConfig.DEFAULT_VALUE) ? (android.arch.lifecycle.l) PatchProxy.accessDispatch(objArr8, null, changeQuickRedirect8, true, "aacfbcd4cc27167ac69c353494eec9f1") : new f(this));
    }

    public static /* synthetic */ void a(c cVar, com.sankuai.waimai.store.drug.goods.list.model.b bVar) {
        Object[] objArr = {cVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7bbb733bc8c23bddf612af3b9dc44f8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7bbb733bc8c23bddf612af3b9dc44f8e");
        } else if (bVar != null) {
            cVar.a(bVar.a);
        }
    }

    public void p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0027ef15f1def028b8250ab809ad104", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0027ef15f1def028b8250ab809ad104");
        } else {
            a(true, this.b, this.e);
        }
    }

    public void a(@NonNull RestMenuResponse restMenuResponse) {
        com.sankuai.waimai.store.shopping.cart.delegate.b gVar;
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f1e01f42c0a46d702cb5f84b03b4a09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f1e01f42c0a46d702cb5f84b03b4a09");
            return;
        }
        com.sankuai.waimai.store.shopping.cart.cache.b.a(restMenuResponse);
        View findViewById = this.y.findViewById(R.id.shop_cart_view);
        if (this.B == null) {
            SCBaseActivity sCBaseActivity = this.y;
            com.sankuai.waimai.store.platform.domain.manager.poi.a aVar = this.x;
            SCPageConfig a2 = SCPageConfig.a(9, 22, b());
            String b = b();
            String w = this.y.w();
            Object[] objArr2 = {sCBaseActivity, aVar, Integer.valueOf((int) R.id.mrn_shopcart_layout), findViewById, a2, b, w, null, null};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.drug.f.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "680d215c8c6508027708eb99da18730c", RobustBitConfig.DEFAULT_VALUE)) {
                gVar = (com.sankuai.waimai.store.shopping.cart.delegate.b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "680d215c8c6508027708eb99da18730c");
            } else {
                if (findViewById instanceof ViewGroup) {
                    LayoutInflater.from(findViewById.getContext()).inflate(R.layout.wm_drug_shopcart_whole, (ViewGroup) findViewById, true);
                }
                gVar = new com.sankuai.waimai.drug.g(sCBaseActivity, aVar, R.id.mrn_shopcart_layout, findViewById.findViewById(R.id.layout_bottom), a2, b, w, null, null);
            }
            this.B = gVar;
        }
        if (this.B != null) {
            this.B.f();
        }
        Object[] objArr3 = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6d2a64cdbe8e50aa2af194db360920ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6d2a64cdbe8e50aa2af194db360920ce");
            return;
        }
        com.sankuai.waimai.store.shopping.cart.cache.b.a(restMenuResponse);
        if (!restMenuResponse.getPoi().isHideShoppingCar) {
            if (this.x.r() == 3) {
                A();
            } else {
                v();
            }
        } else if (this.B != null) {
            this.B.b(false);
        }
    }

    public final void a(int i, long j, String str) {
        Object[] objArr = {Integer.valueOf(i), new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab61d51bd366de888266bae8cd47d225", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab61d51bd366de888266bae8cd47d225");
        } else if (j <= 0) {
        } else {
            if (this.k == null) {
                this.k = new com.sankuai.waimai.store.manager.marketing.a(this.y, this.y.findViewById(16908290), i);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("page_type", String.valueOf(i));
            hashMap.put("wm_poi_id", String.valueOf(j));
            hashMap.put(FoodDetailNetWorkPreLoader.URI_POI_STR, str);
            this.k.a(hashMap, this.y.w());
            this.k.f();
            this.k.a(true);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.a
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f39c4cdf8f76a8cf1c156f337390ab71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f39c4cdf8f76a8cf1c156f337390ab71");
        } else if (!this.K) {
            this.w = true;
        } else {
            a(z, this.b, this.e);
        }
    }

    public void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef817a43726b7c9a1452ee020dfdd686", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef817a43726b7c9a1452ee020dfdd686");
            return;
        }
        com.sankuai.waimai.store.drug.base.net.c.a(this.y.w()).a(this.b, this.c, 1, "", (com.sankuai.waimai.store.base.net.j<GetMenuResponse>) new com.sankuai.waimai.store.base.net.k<GetMenuResponse>() { // from class: com.sankuai.waimai.store.drug.goods.list.delegate.impl.c.8
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final /* synthetic */ void a(Object obj) {
                ArrayList<GetMenuResponse.MenuInfo> arrayList;
                GetMenuResponse getMenuResponse = (GetMenuResponse) obj;
                Object[] objArr2 = {getMenuResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c2fc3434559f1d2cbd8dbb6cbd2979cb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c2fc3434559f1d2cbd8dbb6cbd2979cb");
                    return;
                }
                if (!com.sankuai.waimai.imbase.manager.b.a().b() && getMenuResponse != null && (arrayList = getMenuResponse.menuInfoArrayList) != null && !arrayList.isEmpty()) {
                    Iterator<GetMenuResponse.MenuInfo> it = arrayList.iterator();
                    while (it.hasNext()) {
                        GetMenuResponse.MenuInfo next = it.next();
                        if (next != null && next.b == 3) {
                            it.remove();
                            if (!com.sankuai.waimai.imbase.manager.b.a().c()) {
                                com.sankuai.waimai.imbase.manager.b.a().a("supermarket-inconsistent_pop_menu_im_switch");
                            }
                        }
                    }
                }
                c.this.D.b("restaurant_menu_data", (String) getMenuResponse);
                com.sankuai.waimai.store.drug.goods.list.interfaces.a aVar = (com.sankuai.waimai.store.drug.goods.list.interfaces.a) c.this.D.c("restaurant_menu_service", (Class<Object>) com.sankuai.waimai.store.drug.goods.list.interfaces.a.class);
                if (aVar != null) {
                    aVar.a();
                }
            }
        });
        com.sankuai.waimai.store.drug.base.net.b.a(this.y.w()).a(this.b, this.x.h(), 30, -1L, new com.sankuai.waimai.store.base.net.k<DrugImEntranceEntity>() { // from class: com.sankuai.waimai.store.drug.goods.list.delegate.impl.c.9
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final /* synthetic */ void a(Object obj) {
                DrugImEntranceEntity drugImEntranceEntity = (DrugImEntranceEntity) obj;
                Object[] objArr2 = {drugImEntranceEntity};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2e5b70a60d03b5f1194585ea0709079a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2e5b70a60d03b5f1194585ea0709079a");
                    return;
                }
                c.this.D.b("drug_entry_data", (String) drugImEntranceEntity);
                if (c.this.s) {
                    c.this.w();
                }
            }
        });
    }

    private boolean y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1daf2cec794d2f6eb5b6e20edbc0518f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1daf2cec794d2f6eb5b6e20edbc0518f")).booleanValue() : this.e > 0;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.a, com.sankuai.waimai.store.drug.goods.list.delegate.c
    @NonNull
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a d() {
        return this.x;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.c
    @NonNull
    public final SCBaseActivity k() {
        return this.y;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.c
    public final String l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3447c9884b51660bcf74adae7edcbf2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3447c9884b51660bcf74adae7edcbf2") : this.y.w();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.c
    public final com.sankuai.shangou.stone.whiteboard.e m() {
        return this.D;
    }

    @Override // com.sankuai.waimai.store.base.a
    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be757c8b1fb304f66646c3a8660e70d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be757c8b1fb304f66646c3a8660e70d9");
            return;
        }
        this.K = true;
        if (this.k != null) {
            this.k.h();
        }
    }

    @Override // com.sankuai.waimai.store.base.a
    public void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a48ecac663fc2b3e96de1106e3fb00a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a48ecac663fc2b3e96de1106e3fb00a7");
            return;
        }
        if (this.w) {
            a(true);
        }
        q();
    }

    @Override // com.sankuai.waimai.store.base.a
    public void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "267d2a5c27766ccb89c29a9455ef89e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "267d2a5c27766ccb89c29a9455ef89e5");
            return;
        }
        this.K = false;
        if (com.sankuai.waimai.store.order.a.e().i(this.x.d())) {
            this.x.g();
        }
        if (this.k != null) {
            this.k.i();
        }
    }

    @Override // com.sankuai.waimai.store.base.a
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c49e9efd285bd0cf52c66d69f2c3f31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c49e9efd285bd0cf52c66d69f2c3f31");
            return;
        }
        if (this.f == 1 && u()) {
            com.sankuai.waimai.store.drug.goods.list.utils.a.a(t(), this.s);
        }
        com.sankuai.waimai.store.base.net.c.a(this.y.w());
        com.sankuai.waimai.store.manager.poi.a.a().b(this.P);
        com.sankuai.waimai.store.manager.user.a.a().a((com.sankuai.waimai.store.i.user.a) this);
        com.sankuai.waimai.store.order.a.e().b(this);
        com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.c.a().b();
        com.sankuai.waimai.store.drug.goods.list.viewblocks.controller.b bVar = this.L;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.drug.goods.list.viewblocks.controller.b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "36f34d11e6aa850236b861f661724dc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "36f34d11e6aa850236b861f661724dc5");
        } else {
            com.sankuai.waimai.store.drug.goods.list.viewblocks.controller.a.b(bVar.c);
        }
        if (this.k != null) {
            this.k.j();
        }
        if (this.N != null) {
            com.sankuai.waimai.store.drug.consultation.a aVar = this.N;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.drug.consultation.a.a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "b29cf380ba110bf80e302567e32cb55a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "b29cf380ba110bf80e302567e32cb55a");
            } else if (aVar.f != null) {
                aVar.f.c();
            }
        }
        if (this.B != null) {
            this.B.a();
        }
    }

    @Override // com.sankuai.waimai.store.base.a
    public final void b(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d89c60802332254e08bb3100fd75da1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d89c60802332254e08bb3100fd75da1");
        } else if (bundle != null) {
            bundle.putParcelable("android:support:fragments", null);
        }
    }

    @Override // com.sankuai.waimai.store.base.a
    public final void b(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca8af4042daedec0c3b346f1d7262798", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca8af4042daedec0c3b346f1d7262798");
            return;
        }
        this.y.setIntent(intent);
        a(intent);
    }

    public void a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67d3c6dba4bcb72f8b7e87e836ca7d91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67d3c6dba4bcb72f8b7e87e836ca7d91");
            return;
        }
        intent.putExtra("is_NotificationWindow_show", false);
        Object[] objArr2 = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        a(PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ddc42fb34d66ddbd08acd6383f744823", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ddc42fb34d66ddbd08acd6383f744823")).booleanValue() : d(intent));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.sankuai.waimai.store.base.a
    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da8b97751960996775a0468b050616f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da8b97751960996775a0468b050616f4");
            return;
        }
        if (intent != null) {
            this.y.setIntent(intent);
        }
        if (i == 22) {
            if (i2 != -1 || this.B == null) {
                return;
            }
            this.B.c();
        } else if (i == 103) {
            v();
        } else {
            switch (i) {
                case 100:
                    if (i2 == -1 && intent != null) {
                        boolean a2 = com.sankuai.waimai.platform.utils.f.a(intent, "need_finish", false);
                        if (com.sankuai.waimai.store.config.d.h().a("store/poi_need_finish", true) && a2 && !this.y.isFinishing() && !this.y.isDestroyed()) {
                            this.y.finish();
                            return;
                        }
                    }
                    break;
                case 101:
                    break;
                default:
                    return;
            }
            if (i2 != -1 || intent == null) {
                return;
            }
            a(intent);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.a
    public boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b139cde8ad9fdabcf88ac535076f7213", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b139cde8ad9fdabcf88ac535076f7213")).booleanValue();
        }
        if (this.z == null || !this.z.h()) {
            SCBaseActivity sCBaseActivity = this.y;
            String d = this.x.d();
            int v = this.x.v();
            Object[] objArr2 = {sCBaseActivity, d, Integer.valueOf(v)};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.drug.goods.list.helper.c.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "90b0578073cd0b47670a9ac2b4ea8334", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "90b0578073cd0b47670a9ac2b4ea8334");
            } else {
                EventInfo eventInfo = new EventInfo();
                HashMap hashMap = new HashMap();
                hashMap.put("poi_id", d);
                hashMap.put(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(v));
                eventInfo.val_lab = hashMap;
                eventInfo.nm = EventName.MGE;
                eventInfo.val_bid = "b_2lUbF";
                eventInfo.event_type = "click";
                Statistics.getChannel("waimai").writeEvent(AppUtil.generatePageInfoKey(sCBaseActivity), eventInfo);
            }
            return (this.k == null || this.k.g()) ? false : true;
        }
        return true;
    }

    public void a(@NonNull RestMenuResponse restMenuResponse, @Nullable RestRecommendPoi restRecommendPoi) {
        Object[] objArr = {restMenuResponse, restRecommendPoi};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce5bc040dd3847378921d41368c336bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce5bc040dd3847378921d41368c336bf");
            return;
        }
        this.s = true;
        if (n()) {
            this.e = -1L;
        }
        this.x.a(restMenuResponse.getPoi(), 1);
        this.x.c = restMenuResponse.needPurchaseRecommend;
        this.x.d = this.f;
        this.x.j = restMenuResponse.mPriceOptAB;
        com.sankuai.waimai.store.drug.goods.list.utils.a.a(this.x);
        com.sankuai.waimai.store.order.a.e().a(x(), restMenuResponse.getPoi());
        restMenuResponse.setChosenSpu(this.e, this.v);
        Object[] objArr2 = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1c00c592f6300dd3861f693bb3a0e233", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1c00c592f6300dd3861f693bb3a0e233");
        } else {
            int a2 = com.sankuai.shangou.stone.util.a.a((List) restMenuResponse.mGoodPoiCategoryList);
            int i = 0;
            while (true) {
                if (i >= a2) {
                    break;
                }
                GoodsPoiCategory goodsPoiCategory = (GoodsPoiCategory) com.sankuai.shangou.stone.util.a.a((List<Object>) restMenuResponse.mGoodPoiCategoryList, i);
                if (goodsPoiCategory == null || goodsPoiCategory.type != 10) {
                    i++;
                } else {
                    a(goodsPoiCategory.spus);
                    if (!com.sankuai.shangou.stone.util.a.b(goodsPoiCategory.childGoodPoiCategory)) {
                        int a3 = com.sankuai.shangou.stone.util.a.a((List) goodsPoiCategory.childGoodPoiCategory);
                        for (int i2 = 0; i2 < a3; i2++) {
                            GoodsPoiCategory goodsPoiCategory2 = (GoodsPoiCategory) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsPoiCategory.childGoodPoiCategory, i2);
                            if (goodsPoiCategory2 != null) {
                                a(goodsPoiCategory2.spus);
                                if (goodsPoiCategory2.searchRecommendCollocateCard != null) {
                                    a(goodsPoiCategory2.searchRecommendCollocateCard.spus);
                                }
                            }
                        }
                    }
                }
            }
        }
        a(restMenuResponse);
        com.sankuai.waimai.store.drug.goods.list.viewblocks.controller.b bVar = this.L;
        Object[] objArr3 = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.drug.goods.list.viewblocks.controller.b.a;
        if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "feeb6e3ea98421033df5ce140522651e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "feeb6e3ea98421033df5ce140522651e");
        } else if (restMenuResponse != null && restMenuResponse.getPoi() != null) {
            bVar.b = restMenuResponse.getPoi().getShareTip();
        }
        w();
        c(this.y.getIntent());
    }

    public final void b(@NonNull RestMenuResponse restMenuResponse) {
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55ce9316713b1f4da72cae94a0b46fd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55ce9316713b1f4da72cae94a0b46fd9");
        } else if (this.z == null) {
        } else {
            this.z.a(restMenuResponse);
            this.z.a(this.N == null ? null : this.N.l);
        }
    }

    private void a(List<GoodsSpu> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9146c7677ac40cd4fcb96c31961e6a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9146c7677ac40cd4fcb96c31961e6a9");
            return;
        }
        int a2 = com.sankuai.shangou.stone.util.a.a((List) list);
        for (int i = 0; i < a2; i++) {
            GoodsSpu goodsSpu = (GoodsSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i);
            if (goodsSpu != null) {
                if (goodsSpu.id == this.e) {
                    goodsSpu.spuSearchType = 0;
                } else if (this.O.contains(Long.valueOf(goodsSpu.id))) {
                    goodsSpu.spuSearchType = 1;
                } else {
                    goodsSpu.spuSearchType = 2;
                }
            }
        }
    }

    private void a(final boolean z, long j, long j2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1917bea0186a0cd4fbd144d36c834e2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1917bea0186a0cd4fbd144d36c834e2e");
            return;
        }
        com.sankuai.waimai.store.drug.goods.list.utils.a.c(this.x);
        final RestMenuResponse s = s();
        if (s != null) {
            this.A.a();
            this.y.getWindow().getDecorView().post(new Runnable() { // from class: com.sankuai.waimai.store.drug.goods.list.delegate.impl.c.11
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "17ad3d8e4780a6ba0a7a90e444943d60", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "17ad3d8e4780a6ba0a7a90e444943d60");
                        return;
                    }
                    c.a(c.this, s, c.this.x());
                    if (c.this.s) {
                        c.this.A.c();
                    }
                }
            });
            return;
        }
        if (this.f == 1) {
            this.I++;
            if (this.I == 1 && u()) {
                com.sankuai.waimai.store.drug.goods.list.utils.a.c();
            }
        }
        com.sankuai.waimai.store.drug.goods.list.utils.b.a(r(), this.f, this.y.w(), this.b, this.c, j2, this.d, this.i, new com.sankuai.waimai.store.base.net.k<RestMenuResponse>() { // from class: com.sankuai.waimai.store.drug.goods.list.delegate.impl.c.12
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final /* synthetic */ void a(Object obj) {
                RestMenuResponse restMenuResponse = (RestMenuResponse) obj;
                Object[] objArr2 = {restMenuResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "800c3c3578ab2a174d46e49384ece123", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "800c3c3578ab2a174d46e49384ece123");
                    return;
                }
                c cVar = c.this;
                Object[] objArr3 = {restMenuResponse};
                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "6ee51dff8c04ae1f6737e669f54f34e2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "6ee51dff8c04ae1f6737e669f54f34e2");
                } else if (restMenuResponse != null && restMenuResponse.getPoi() != null && !cVar.t) {
                    cVar.t = true;
                    cVar.y.s().recordStep(restMenuResponse.getPoi().isFlashShow == 1 ? "activity_data_ready_sm_with_flash" : "activity_data_ready_sm_without_flash");
                    cVar.y.s().recordStep("activity_data_ready_supermarket");
                    com.sankuai.waimai.store.manager.judas.b.b(cVar.y, "b_waimai_sg_472ca63s_mv").a("duration", Long.valueOf(SystemClock.elapsedRealtime() - cVar.E)).a();
                }
                c.this.y.s().recordStep("activity_data_ready");
                c.a(c.this, restMenuResponse, c.this.x());
                com.sankuai.meituan.takeoutnew.util.aop.h.a(c.this.y.s().recordStep("activity_render_ready"));
                if (c.this.f == 1 && c.this.I == 1) {
                    com.sankuai.waimai.store.drug.goods.list.utils.a.a(restMenuResponse, c.this.u());
                }
            }

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8171aabc8c22c274360f96b45e431312", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8171aabc8c22c274360f96b45e431312");
                } else {
                    c.this.b(z);
                }
            }

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e4584e4ae85bb5df3502bb2df278173a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e4584e4ae85bb5df3502bb2df278173a");
                    return;
                }
                super.b();
                if (z) {
                    if (c.this.s) {
                        al.a(new Runnable() { // from class: com.sankuai.waimai.store.drug.goods.list.delegate.impl.c.12.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "81c0a80a9c49ce8b5ff20250306632dd", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "81c0a80a9c49ce8b5ff20250306632dd");
                                    return;
                                }
                                c.this.w = false;
                                c.this.A.c();
                            }
                        }, c.this.w ? 100 : 0, c.this.y.w());
                        return;
                    }
                    return;
                }
                c.this.y.v();
            }

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "89805c56fb2b4df5cb4a19fffbe97e32", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "89805c56fb2b4df5cb4a19fffbe97e32");
                    return;
                }
                super.a(bVar);
                com.sankuai.waimai.store.drug.goods.list.utils.a.a(c.this.x, bVar.c);
                c.this.a(bVar.b, com.sankuai.waimai.store.drug.util.a.a(bVar), bVar.a());
                if (c.this.f == 1 && c.this.I == 1) {
                    com.sankuai.waimai.store.drug.goods.list.utils.a.a(bVar.c, bVar.b, c.this.u());
                    if (c.this.u()) {
                        com.sankuai.waimai.store.drug.goods.list.utils.a.a("net_error", bVar.getMessage(), c.this.t());
                    }
                }
            }
        });
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c2f35b1fd3850206a8755236eb39a81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c2f35b1fd3850206a8755236eb39a81");
            return;
        }
        if (this.B != null) {
            this.B.e();
        }
        if (z) {
            this.A.a();
        } else {
            this.y.u();
        }
    }

    public void c(RestMenuResponse restMenuResponse) {
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "770b477863d3b48dc4320515ae357e95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "770b477863d3b48dc4320515ae357e95");
            return;
        }
        Intent intent = this.y.getIntent();
        String w = this.y.w();
        final long j = this.b;
        final String str = this.c;
        final com.sankuai.waimai.store.base.net.k<SpuProductsResponse> kVar = new com.sankuai.waimai.store.base.net.k<SpuProductsResponse>() { // from class: com.sankuai.waimai.store.drug.goods.list.delegate.impl.c.13
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final /* synthetic */ void a(Object obj) {
                Object[] objArr2 = {(SpuProductsResponse) obj};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "edeacfebc53bfe88ae709aa3b38fbb59", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "edeacfebc53bfe88ae709aa3b38fbb59");
                } else {
                    c.this.v();
                }
            }
        };
        Object[] objArr2 = {intent, w, new Long(j), str, kVar};
        ChangeQuickRedirect changeQuickRedirect2 = MultiFoodsHandler.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2b9d5c6d4b013e01e303f0b7f76ba3fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2b9d5c6d4b013e01e303f0b7f76ba3fb");
        } else if (MultiFoodsHandler.a(intent)) {
            ArrayList arrayList = new ArrayList();
            final HashMap hashMap = new HashMap();
            MultiFoodsHandler.a(intent, arrayList, hashMap);
            com.sankuai.waimai.store.base.net.j<SpuProductsResponse> jVar = new com.sankuai.waimai.store.base.net.j<SpuProductsResponse>() { // from class: com.sankuai.waimai.store.drug.goods.list.utils.MultiFoodsHandler.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(SpuProductsResponse spuProductsResponse) {
                    Iterator<GoodsSpu> it;
                    GoodsSpu goodsSpu;
                    GoodsSku m20clone;
                    SpuProductsResponse spuProductsResponse2 = spuProductsResponse;
                    Object[] objArr3 = {spuProductsResponse2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "36fa1a332199a2ba316ea5461d554852", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "36fa1a332199a2ba316ea5461d554852");
                        return;
                    }
                    if (spuProductsResponse2 != null) {
                        try {
                            com.sankuai.waimai.store.order.a.e().a(com.sankuai.waimai.store.platform.domain.manager.poi.a.b(str, j), (com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b) null);
                            HashMap hashMap2 = hashMap;
                            String b = com.sankuai.waimai.store.platform.domain.manager.poi.a.b(str, j);
                            Object[] objArr4 = {spuProductsResponse2, hashMap2, b};
                            ChangeQuickRedirect changeQuickRedirect4 = MultiFoodsHandler.a;
                            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "bf1887bb76327471d560a206c6e71139", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "bf1887bb76327471d560a206c6e71139");
                            } else {
                                List<GoodsSpu> list = spuProductsResponse2.productSpuList;
                                if (!com.sankuai.shangou.stone.util.a.b(list)) {
                                    Iterator<GoodsSpu> it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        GoodsSpu next = it2.next();
                                        if (next != null) {
                                            List<GoodsSku> list2 = next.skus;
                                            ArrayList arrayList2 = new ArrayList();
                                            next.skus = arrayList2;
                                            if (list2 != null) {
                                                for (GoodsSku goodsSku : list2) {
                                                    if (goodsSku != null && hashMap2.containsKey(Long.valueOf(goodsSku.id))) {
                                                        List<SimpleGoodsSku> list3 = (List) hashMap2.get(Long.valueOf(goodsSku.id));
                                                        if (!com.sankuai.shangou.stone.util.a.b(list3)) {
                                                            for (SimpleGoodsSku simpleGoodsSku : list3) {
                                                                if (list3 != null) {
                                                                    it = it2;
                                                                    goodsSpu = next;
                                                                    if (next.id == simpleGoodsSku.id && (m20clone = goodsSku.m20clone()) != null) {
                                                                        m20clone.count = simpleGoodsSku.count;
                                                                        if (!com.sankuai.shangou.stone.util.a.b(simpleGoodsSku.attrs)) {
                                                                            m20clone.attrs = simpleGoodsSku.attrs;
                                                                        }
                                                                        arrayList2.add(m20clone);
                                                                    }
                                                                } else {
                                                                    it = it2;
                                                                    goodsSpu = next;
                                                                }
                                                                it2 = it;
                                                                next = goodsSpu;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    com.sankuai.waimai.store.order.a.e().f(b, OrderedFood.fromOrderAgain(new JSONArray(i.a(list))));
                                }
                            }
                        } catch (JSONException e) {
                            com.sankuai.shangou.stone.util.log.a.a(e);
                        }
                    }
                    j.this.a((j) spuProductsResponse2);
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final void a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "81f3c2398f65bcdac3629938e0551d70", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "81f3c2398f65bcdac3629938e0551d70");
                    } else {
                        j.this.a();
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                    Object[] objArr3 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5f59660813b4d697d73e79f4382f7a65", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5f59660813b4d697d73e79f4382f7a65");
                    } else {
                        j.this.a(bVar);
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final void b() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0d25e186220147183be31c3284b82020", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0d25e186220147183be31c3284b82020");
                    } else {
                        j.this.b();
                    }
                }
            };
            Object[] objArr3 = {w, new Long(j), str, arrayList, jVar};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.drug.goods.list.utils.b.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "7546c5399c168e4599b2bf8161e60e86", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "7546c5399c168e4599b2bf8161e60e86");
            } else {
                com.sankuai.waimai.store.drug.base.net.b.a(w).a(String.valueOf(j), str, arrayList, jVar);
            }
        }
        if (this.F) {
            if (com.sankuai.waimai.store.manager.user.a.a().b()) {
                z();
            } else {
                com.sankuai.waimai.store.manager.user.a.a(this.y, new Runnable() { // from class: com.sankuai.waimai.store.drug.goods.list.delegate.impl.c.14
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "5bfae37fd4bf92d4fd660ca81f152ca6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "5bfae37fd4bf92d4fd660ca81f152ca6");
                        } else {
                            c.this.z();
                        }
                    }
                });
            }
        }
        if (restMenuResponse.moduleList == null || restMenuResponse.moduleList.isEmpty()) {
            com.sankuai.waimai.store.drug.goods.list.utils.a.a(u(), this.f, this.I, "data_error", "module_list_null", t());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e29a24a7d2155f985900aeebe63a0f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e29a24a7d2155f985900aeebe63a0f0");
        } else {
            com.sankuai.waimai.store.drug.goods.list.utils.b.a(this.b, this.c, -1L, this.G, this.H, -1, (String) null, new com.sankuai.waimai.store.base.net.k<Poi.PoiCouponItem>() { // from class: com.sankuai.waimai.store.drug.goods.list.delegate.impl.c.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(Object obj) {
                    Poi.PoiCouponItem poiCouponItem = (Poi.PoiCouponItem) obj;
                    Object[] objArr2 = {poiCouponItem};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "18e90b8ea6756b09612d74e4d3b414be", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "18e90b8ea6756b09612d74e4d3b414be");
                    } else if (com.sankuai.shangou.stone.util.p.a(poiCouponItem)) {
                    } else {
                        com.sankuai.waimai.store.manager.coupon.b.a().a(poiCouponItem);
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "416c82df83a411f4574f7b33e1bc4167", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "416c82df83a411f4574f7b33e1bc4167");
                    } else {
                        super.a(bVar);
                    }
                }
            }, this.y.w());
        }
    }

    public void a(String str, String str2, boolean z) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1835e21067e0c9c31df22c51bf6e510a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1835e21067e0c9c31df22c51bf6e510a");
            return;
        }
        this.w = false;
        this.y.v();
        if (this.A == null) {
            this.y.b_(str);
        } else if (z) {
            this.A.a(str, str2);
        } else {
            this.A.b(str, str2);
        }
    }

    private boolean d(@NonNull Intent intent) {
        boolean a2;
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebe607113c812335c7b00f8cc686fe0d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebe607113c812335c7b00f8cc686fe0d")).booleanValue();
        }
        long j = this.b;
        String str = this.c;
        this.b = com.sankuai.waimai.store.drug.goods.list.utils.e.a(intent, "restaurant_id", "poiId", j);
        this.c = com.sankuai.waimai.store.drug.goods.list.utils.e.a(intent, FoodDetailNetWorkPreLoader.URI_POI_STR, FoodDetailNetWorkPreLoader.URI_POI_STR, str);
        if (this.b == -1) {
            this.b = com.sankuai.waimai.store.drug.goods.list.utils.e.a(intent, "wm_poi_id", "poiId", j);
        }
        if (this.b == -1) {
            this.b = com.sankuai.waimai.store.drug.goods.list.utils.e.a(intent, "poi_id", "poiId", j);
        }
        String a3 = aa.a(intent, "order_again");
        if (!TextUtils.isEmpty(a3)) {
            try {
                com.sankuai.waimai.store.order.a.e().e(x(), OrderedFood.fromOrderAgain(new JSONArray(a3)));
            } catch (JSONException e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
            }
        }
        this.g = com.sankuai.waimai.store.drug.goods.list.utils.e.a(intent, "source_type", "source_type", 0);
        this.h = com.sankuai.waimai.store.router.d.a(intent, "g_source", "g_source", "-999");
        this.m = com.sankuai.waimai.store.router.d.a(intent, "dp_source", "dp_source", "");
        this.n = com.sankuai.waimai.store.router.d.a(intent, "med_source_channel", "med_source_channel", "");
        this.i = com.sankuai.waimai.store.drug.goods.list.utils.e.a(intent, "extra", "extra", "");
        this.e = com.sankuai.waimai.store.drug.goods.list.utils.e.a(intent, "spu_id", "foodId", -1L);
        this.d = com.sankuai.waimai.store.router.d.a(intent, "tag_id", -1L);
        this.v = com.sankuai.waimai.store.drug.goods.list.utils.e.a(intent, "need_add", "need_add", 0) == 1;
        Object[] objArr2 = {intent, "isopenshopcart", "isopenshopcart", (byte) 0};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.drug.goods.list.utils.e.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "90a115dd43835425814f73cf48b7310e", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "90a115dd43835425814f73cf48b7310e")).booleanValue();
        } else if (intent == null) {
            a2 = false;
        } else if (com.sankuai.waimai.store.drug.goods.list.utils.e.a(intent, "isopenshopcart")) {
            a2 = com.sankuai.waimai.store.router.d.a(intent, "isopenshopcart", false);
        } else {
            a2 = aa.a(intent, "isopenshopcart", false);
        }
        this.u = a2;
        this.l = com.sankuai.waimai.store.router.d.a(intent, "source_page_id", "source_page_id", "-999");
        this.o = com.sankuai.waimai.store.router.d.a(intent, "source_event_id", "source_event_id", "-999");
        this.p = com.sankuai.waimai.store.router.d.a(intent, "source_attribute", "source_attribute", "-999");
        this.q = com.sankuai.waimai.store.router.d.a(intent, "source_ext", "source_ext", "-999");
        this.r = com.sankuai.waimai.store.router.d.a(intent, "page_from_type", "page_from_type", -1);
        this.x.a(this.b);
        this.x.a(this.c);
        c(intent);
        Object[] objArr3 = {intent};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ee77e6c7387f28d8889f7b0ad83f79d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ee77e6c7387f28d8889f7b0ad83f79d3");
        } else {
            this.O.clear();
            String a4 = aa.a(intent, "search_spu_recommend_combo_ids");
            if (!TextUtils.isEmpty(a4)) {
                try {
                    Long[] lArr = (Long[]) com.sankuai.waimai.store.util.i.a(a4, new TypeToken<Long[]>() { // from class: com.sankuai.waimai.store.drug.goods.list.delegate.impl.c.3
                    }.getType());
                    if (lArr != null) {
                        this.O.addAll(Arrays.asList(lArr));
                    }
                } catch (Exception e2) {
                    com.sankuai.waimai.store.base.log.a.a(e2.getMessage());
                }
            }
        }
        this.F = com.sankuai.waimai.store.router.d.a(intent, "auto_receive", "auto_receive", -1) == 1;
        if (this.F) {
            this.G = com.sankuai.waimai.store.drug.goods.list.utils.e.a(intent, "coupon_id", "coupon_id", -1L);
            this.H = com.sankuai.waimai.store.drug.goods.list.utils.e.a(intent, "activity_id", "activity_id", -1L);
        }
        return com.sankuai.waimai.store.platform.domain.manager.poi.a.a(str, this.c, j, this.b);
    }

    public void c(Intent intent) {
        Uri.Builder builder;
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7adfbb269e90d7bc0e325aa0c75b52c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7adfbb269e90d7bc0e325aa0c75b52c0");
        } else if (intent != null) {
            Uri data = intent.getData();
            if (data != null) {
                String queryParameter = data.getQueryParameter("poiId");
                if (TextUtils.isEmpty(queryParameter)) {
                    queryParameter = Long.toString(this.b);
                }
                StringBuilder sb = new StringBuilder();
                sb.append(this.x.v());
                String sb2 = sb.toString();
                builder = data.buildUpon();
                builder.appendQueryParameter("poi_id", queryParameter).appendQueryParameter(FoodDetailNetWorkPreLoader.URI_POI_STR, this.c).appendQueryParameter(KernelConfig.KEY_CONTAINER_TYPE, sb2);
            } else {
                builder = new Uri.Builder();
                Uri.Builder appendQueryParameter = builder.appendQueryParameter("poi_id", Long.toString(this.b)).appendQueryParameter(FoodDetailNetWorkPreLoader.URI_POI_STR, this.c);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.x.v());
                appendQueryParameter.appendQueryParameter(KernelConfig.KEY_CONTAINER_TYPE, sb3.toString());
            }
            this.j.put(Constants.Environment.KEY_PUSHID, com.sankuai.waimai.store.router.d.a(intent, Constants.Environment.KEY_PUSHID, ""));
            this.j.put("mt_aurl", builder.build());
            String a2 = aa.a(intent, "gSource", "");
            if (!t.a(a2)) {
                this.j.put("g_source", a2);
            }
            if (!t.a(this.m)) {
                this.j.put("dp_source", this.m);
            }
            if (!t.a(this.n)) {
                this.j.put("med_source_channel", this.n);
            }
            this.j.put(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(this.x.v()));
            intent.setData(builder.build());
            WMLocation b = com.sankuai.waimai.store.locate.a.b();
            double latitude = b != null ? b.getLatitude() : 0.0d;
            double longitude = b != null ? b.getLongitude() : 0.0d;
            if (com.sankuai.shangou.stone.util.i.a(Double.valueOf(latitude), Double.valueOf(0.0d)) || com.sankuai.shangou.stone.util.i.a(Double.valueOf(longitude), Double.valueOf(0.0d))) {
                return;
            }
            SGLocationUtils.TransformData a3 = SGLocationUtils.a(longitude, latitude);
            if (a3 != null) {
                this.j.put("ji", a3.ji);
                this.j.put("jf", a3.jf);
                this.j.put("wi", a3.wi);
                this.j.put("wf", a3.wf);
            }
            com.sankuai.waimai.store.manager.judas.a.a(this.j);
        }
    }

    @Override // com.sankuai.waimai.store.i.user.a
    public final void a(a.EnumC1205a enumC1205a) {
        Object[] objArr = {enumC1205a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a664c746c09d1c19917c13852257b5ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a664c746c09d1c19917c13852257b5ec");
        } else if (enumC1205a == a.EnumC1205a.LOGIN && com.sankuai.waimai.store.manager.user.a.a().b()) {
            if (this.K && this.B != null) {
                this.B.b();
            }
            ab.b().a((Context) this.y, "poi_coupon_need_login", false);
            a(true);
        }
    }

    @Override // com.sankuai.waimai.store.i.user.a
    public final void a(a.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f94926b3cb02b55bd2f580453340a8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f94926b3cb02b55bd2f580453340a8f");
        } else if (bVar == a.b.PHONE && com.sankuai.waimai.foundation.core.service.user.a.a == a.EnumC0947a.FROM_PRODUCT_LIST_PREORDER && this.B != null) {
            this.B.c();
        }
    }

    @Override // com.sankuai.waimai.store.observers.a
    public final void ba_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10467e1bdaf8606903aba28264641ff3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10467e1bdaf8606903aba28264641ff3");
        } else if (this.B != null) {
            this.B.h();
        }
    }

    void v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6541e48365bea8542eecb9970b2bf51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6541e48365bea8542eecb9970b2bf51");
        } else if (com.sankuai.waimai.store.order.a.e().k(this.x.d()).j() <= 0) {
            com.sankuai.waimai.store.order.a.e().k(this.x.d()).x = null;
            if (this.B != null) {
                this.B.b(true);
            }
        } else {
            com.sankuai.waimai.store.order.a.e().c(this.x.d(), new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b() { // from class: com.sankuai.waimai.store.drug.goods.list.delegate.impl.c.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d6791f82a91dc0606dc5a1759c15493c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d6791f82a91dc0606dc5a1759c15493c");
                    }
                }

                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b33f38b65b6678aa2b7565f01859715e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b33f38b65b6678aa2b7565f01859715e");
                    } else {
                        c.this.A();
                    }
                }

                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                public final void a(com.sankuai.waimai.store.exceptions.a aVar) {
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d51030c5594ba9b6686cb371b1f18133", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d51030c5594ba9b6686cb371b1f18133");
                    } else {
                        c.this.A();
                    }
                }

                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                public final String b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ce54eaa9bb2f6d5a63fe2de143f2f456", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ce54eaa9bb2f6d5a63fe2de143f2f456") : c.this.y.w();
                }
            });
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.base.a
    public final void a(Context context, View view, String str, GoodsSpu goodsSpu) {
        Object[] objArr = {context, view, str, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "894bec7d2b2244a4aeca449ceb31ce6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "894bec7d2b2244a4aeca449ceb31ce6f");
        } else {
            a(context, view, str, goodsSpu, null);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.base.a
    public final void a(Context context, final View view, String str, final GoodsSpu goodsSpu, final GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {context, view, str, goodsSpu, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa516e6abacae1c6b4c1f32c3dcc4db6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa516e6abacae1c6b4c1f32c3dcc4db6");
        } else if (context == null || goodsSpu == null) {
        } else {
            com.sankuai.waimai.store.order.a.e().a(str, goodsSpu, (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.getSkuList(), 0), (GoodsAttr[]) null, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b() { // from class: com.sankuai.waimai.store.drug.goods.list.delegate.impl.c.5
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4603b081fc09130e3288e28d7e8f13f0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4603b081fc09130e3288e28d7e8f13f0");
                    }
                }

                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                public final com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.f a(com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.f fVar) {
                    Object[] objArr2 = {fVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2c9f99cfde1d33309121b8c479ad5c31", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.f) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2c9f99cfde1d33309121b8c479ad5c31") : new com.sankuai.waimai.store.drug.order.a(c.this.y, fVar, c.this.b()).a();
                }

                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b1c80cfa843fdc8d5ad794621d2d30ad", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b1c80cfa843fdc8d5ad794621d2d30ad");
                        return;
                    }
                    if (view != null) {
                        c cVar = c.this;
                        View view2 = view;
                        Object[] objArr3 = {view2};
                        ChangeQuickRedirect changeQuickRedirect3 = c.a;
                        if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "23b25ef26b5c3193e7c77081389daa45", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "23b25ef26b5c3193e7c77081389daa45");
                        } else {
                            com.sankuai.waimai.store.shopping.cart.f.a().a(view2, cVar.y.hashCode(), cVar.x.d());
                        }
                    }
                    c.this.B.a(goodsSpu);
                    c cVar2 = c.this;
                    GoodsSpu goodsSpu2 = goodsSpu;
                    GoodsPoiCategory goodsPoiCategory2 = goodsPoiCategory;
                    Object[] objArr4 = {goodsSpu2, goodsPoiCategory2};
                    ChangeQuickRedirect changeQuickRedirect4 = c.a;
                    if (PatchProxy.isSupport(objArr4, cVar2, changeQuickRedirect4, false, "c10871f83715c9bface9e92eea60c75c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, cVar2, changeQuickRedirect4, false, "c10871f83715c9bface9e92eea60c75c");
                    } else if (cVar2.x == null || !cVar2.x.c) {
                    } else {
                        com.meituan.android.bus.a.a().c(new a(cVar2.x, goodsSpu2, goodsPoiCategory2));
                    }
                }

                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                public final void a(com.sankuai.waimai.store.exceptions.a aVar) {
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "317a16964eeb244cc647f315a8a1566e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "317a16964eeb244cc647f315a8a1566e");
                    } else if (TextUtils.isEmpty(aVar.getMessage())) {
                    } else {
                        am.a((Activity) c.this.y, aVar.getMessage());
                    }
                }

                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                public final String b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "62391937469ddd683cde8f5f01c0b6b4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "62391937469ddd683cde8f5f01c0b6b4") : c.this.y.w();
                }
            });
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public final com.sankuai.waimai.store.platform.domain.manager.poi.a a;
        public final GoodsSpu b;
        public final GoodsPoiCategory c;

        public a(com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, GoodsSpu goodsSpu, GoodsPoiCategory goodsPoiCategory) {
            this.b = goodsSpu;
            this.c = goodsPoiCategory;
            this.a = aVar;
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.base.a
    public final void a(Activity activity, GoodsSpu goodsSpu, Map map) {
        Object[] objArr = {activity, goodsSpu, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "addf65c4a6591e2e758d2ea2b917a5d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "addf65c4a6591e2e758d2ea2b917a5d9");
        } else if (activity == null || goodsSpu == null) {
        } else {
            int v = this.x.v();
            Poi poi = this.x.b;
            Object[] objArr2 = {activity, Integer.valueOf(v), goodsSpu, poi, map};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.drug.util.d.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e7c3b9db7ddb7b86065dbaada990faf1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e7c3b9db7ddb7b86065dbaada990faf1");
                return;
            }
            HashMap hashMap = map == null ? new HashMap() : map;
            hashMap.put(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(v));
            com.sankuai.waimai.store.drug.util.d.a(activity, goodsSpu, poi, "", (GoodDetailResponse.BuyNowInfo) null, hashMap, 0);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.base.a
    public final void a(GoodsSpu goodsSpu, long j, String str, String str2) {
        String str3;
        Object[] objArr = {goodsSpu, new Long(j), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff930c7e277f277995edfca3aab9c5f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff930c7e277f277995edfca3aab9c5f6");
            return;
        }
        SCBaseActivity sCBaseActivity = this.y;
        Object[] objArr2 = {sCBaseActivity, new Long(j), str, goodsSpu, str2};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.drug.util.d.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "bd98562e3628b263f45198c51b2761ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "bd98562e3628b263f45198c51b2761ce");
        } else if (com.sankuai.waimai.store.util.b.a(sCBaseActivity) || goodsSpu == null) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("poi_id", String.valueOf(j));
                jSONObject.put(FoodDetailNetWorkPreLoader.URI_POI_STR, str);
                jSONObject.put("preview_order_call_back_info", str2 == null ? "" : str2);
                str3 = jSONObject.toString();
            } catch (Exception e) {
                com.sankuai.waimai.store.base.log.a.a(e);
                str3 = "";
            }
            com.sankuai.waimai.store.router.d.a(sCBaseActivity, com.sankuai.waimai.store.router.h.s + "?mrn_biz=supermarket&mrn_entry=flashbuy-cycle-buy&mrn_component=flashbuy-cycle-buy-sheet&page_height=0.8&spu_id=" + goodsSpu.getId() + "&sku_id=" + goodsSpu.getCycleSkuId() + "&wm_poi_id=" + j + "&poi_id_str=" + str + "&spu_tag=" + goodsSpu.physicalTag + "&cid=" + sCBaseActivity.b() + "&extra=" + str3);
        }
    }

    public void w() {
        com.sankuai.waimai.store.im.entrance.drug.a bVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3466e5887457d6d23f9566ba5cadc502", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3466e5887457d6d23f9566ba5cadc502");
            return;
        }
        if (this.N == null) {
            this.N = new com.sankuai.waimai.store.drug.consultation.a(this.y, l(), b(), "");
            com.sankuai.waimai.store.drug.consultation.a aVar = this.N;
            ViewGroup viewGroup = (ViewGroup) this.y.findViewById(R.id.drug_consultation_entry);
            if (viewGroup != null) {
                aVar.j = viewGroup;
            }
        }
        DrugImEntranceEntity drugImEntranceEntity = (DrugImEntranceEntity) this.D.a("drug_entry_data", (Class<Object>) DrugImEntranceEntity.class);
        final com.sankuai.waimai.store.drug.consultation.a aVar2 = this.N;
        long j = this.b;
        String str = this.c;
        Object[] objArr2 = {drugImEntranceEntity, 30, new Long(j), str, ""};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.drug.consultation.a.a;
        if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "d72188e418213eceded30c3ef503cb94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "d72188e418213eceded30c3ef503cb94");
            return;
        }
        aVar2.k = drugImEntranceEntity;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.drug.consultation.a.a;
        if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "86f96e525d65be2781ce611a34aab7db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "86f96e525d65be2781ce611a34aab7db");
        } else {
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.drug.consultation.a.a;
            if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "01baa6247db6c9702349e8bdfae430bd", RobustBitConfig.DEFAULT_VALUE)) {
                bVar = (com.sankuai.waimai.store.im.entrance.drug.a) PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "01baa6247db6c9702349e8bdfae430bd");
            } else {
                com.sankuai.waimai.store.im.base.j jVar = new com.sankuai.waimai.store.im.base.j() { // from class: com.sankuai.waimai.store.drug.consultation.a.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.im.base.j
                    public final void a(Object obj, int i, Map<String, Object> map) {
                        Object[] objArr5 = {obj, 0, map};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "25c926bac1dd880bec8f136fca1e6f52", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "25c926bac1dd880bec8f136fca1e6f52");
                        } else {
                            com.sankuai.waimai.store.manager.judas.b.b(aVar2.c, ShopConstants.ImSource.a).b(map).a();
                        }
                    }

                    @Override // com.sankuai.waimai.store.im.base.j
                    public final void a(Map<String, Object> map) {
                        Object[] objArr5 = {map};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "ec6b29009eb59d5d19113cc147a02375", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "ec6b29009eb59d5d19113cc147a02375");
                        } else {
                            com.sankuai.waimai.store.manager.judas.b.a(aVar2.c, ShopConstants.ImSource.b).b(map).a();
                        }
                    }
                };
                if (aVar2.k != null && aVar2.k.type == 1) {
                    bVar = new com.sankuai.waimai.store.drug.consultation.c(aVar2.b, aVar2.e, aVar2.c, aVar2.d, jVar);
                } else {
                    bVar = new com.sankuai.waimai.store.im.entrance.drug.view.b(aVar2.b, aVar2.e, aVar2.c, aVar2.d, jVar);
                }
            }
            aVar2.f = bVar;
            aVar2.f.d();
            aVar2.f.a((ViewGroup) aVar2.j);
            if (aVar2.f.b() != null) {
                aVar2.g = new PoiListIconAnim(aVar2.f.b(), aVar2.b, aVar2.b.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_48));
            } else {
                aVar2.g = new PoiListIconAnim(aVar2.j, aVar2.b, aVar2.b.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_48));
            }
        }
        if (aVar2.f != null) {
            aVar2.i = aVar2.f.a(drugImEntranceEntity, 30, j, str, "");
            int a2 = aVar2.f.a();
            if (a2 != 0) {
                aVar2.g.e = a2;
            }
        }
    }

    public final String x() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "025ff489a1f9a8ce7730704b4c8ed163", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "025ff489a1f9a8ce7730704b4c8ed163") : com.sankuai.waimai.store.platform.domain.manager.poi.a.b(this.c, this.b);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.c
    public final com.sankuai.waimai.store.shopping.cart.delegate.b o() {
        return this.B;
    }

    int t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3de39f303c26e24ed0d398fdc3789f79", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3de39f303c26e24ed0d398fdc3789f79")).intValue();
        }
        if (this.y != null) {
            return this.y.hashCode();
        }
        return hashCode();
    }

    public final boolean u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c16f0dc7026ee60ec160d21d00a01165", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c16f0dc7026ee60ec160d21d00a01165")).booleanValue() : this.y.getIntent() == null || !com.sankuai.waimai.platform.utils.f.a(this.y.getIntent(), "from_sg", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "705236e66aa0b42d9606469cca9dbd42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "705236e66aa0b42d9606469cca9dbd42");
            return;
        }
        if (!this.x.z() && !y() && aa.a(this.y.getIntent(), "isopenshopcart", false) && !this.x.b.isHideShoppingCar) {
            z = true;
        }
        if (this.B != null) {
            this.B.b(true);
            this.B.a(z);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.base.a
    public final void a(GoodsSpu goodsSpu, Poi poi) {
        int i;
        Object[] objArr = {goodsSpu, poi};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1213e179b0f375673b6aba49f6441a0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1213e179b0f375673b6aba49f6441a0b");
        } else if (goodsSpu == null || poi == null) {
        } else {
            SCBaseActivity sCBaseActivity = this.y;
            long longPoiId = poi.getLongPoiId();
            Object[] objArr2 = {sCBaseActivity, new Long(longPoiId), goodsSpu};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.drug.util.d.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ae7061acbcdc3ab721106aeaa79cd59f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ae7061acbcdc3ab721106aeaa79cd59f");
            } else if (com.sankuai.waimai.store.util.b.a(sCBaseActivity)) {
            } else {
                String a2 = com.sankuai.waimai.store.router.a.a(com.sankuai.waimai.store.router.h.s, "sgc", "flashbuy-full-pre-sale", "flashbuy-full-pre-sale");
                HashMap hashMap = new HashMap();
                hashMap.put("cid", com.sankuai.waimai.store.manager.judas.b.a((Context) sCBaseActivity));
                hashMap.put("wm_poi_id", String.valueOf(longPoiId));
                if (goodsSpu != null) {
                    if (ak.a(goodsSpu)) {
                        i = com.sankuai.shangou.stone.util.a.c(goodsSpu.spuAttrsList);
                    } else {
                        Map<String, List<GoodsAttr>> attrList = goodsSpu.getAttrList();
                        i = com.sankuai.shangou.stone.util.a.c(goodsSpu.getSkuList()) > 1 ? 1 : 0;
                        if (attrList != null && attrList.size() > 0) {
                            i += attrList.size();
                        }
                    }
                    hashMap.put("spu_id", String.valueOf(goodsSpu.getId()));
                    hashMap.put("attr_info_length", String.valueOf(i));
                } else {
                    i = 0;
                }
                Object[] objArr3 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.drug.util.d.a;
                hashMap.put("page_height", String.valueOf(PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "be123eedb44cde8579eff4ac276a25b4", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "be123eedb44cde8579eff4ac276a25b4")).floatValue() : i <= 0 ? 0.4f : i < 3 ? 0.6f : 0.8f));
                com.sankuai.waimai.store.router.d.a(sCBaseActivity, com.sankuai.waimai.store.router.a.a(a2, com.sankuai.waimai.store.router.a.a(hashMap)));
            }
        }
    }
}
