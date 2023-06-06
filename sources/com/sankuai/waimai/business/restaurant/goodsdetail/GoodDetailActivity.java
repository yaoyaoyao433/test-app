package com.sankuai.waimai.business.restaurant.goodsdetail;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.manager.order.g;
import com.sankuai.waimai.business.restaurant.base.manager.order.k;
import com.sankuai.waimai.business.restaurant.base.repository.model.RequiredTagInfo;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.business.restaurant.goodsdetail.GoodDetailHelper;
import com.sankuai.waimai.business.restaurant.goodsdetail.fragments.GoodsDetailRNFragment;
import com.sankuai.waimai.business.restaurant.goodsdetail.module.a;
import com.sankuai.waimai.business.restaurant.goodsdetail.module.d;
import com.sankuai.waimai.business.restaurant.poicontainer.WMRestaurantActivity;
import com.sankuai.waimai.business.restaurant.poicontainer.helper.PoiGoodsHelper;
import com.sankuai.waimai.business.restaurant.rn.bridge.b;
import com.sankuai.waimai.business.restaurant.rn.bridge.c;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.core.service.user.b;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
import com.sankuai.waimai.platform.domain.core.poi.PoiShoppingCartAndPoi;
import com.sankuai.waimai.platform.domain.manager.observers.OrderGoodObserver;
import com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager;
import com.sankuai.waimai.platform.globalcart.poimix.a;
import com.sankuai.waimai.platform.utils.f;
import com.sankuai.waimai.restaurant.shopcart.ui.ab;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class GoodDetailActivity extends BaseActivity implements d, b, c, com.sankuai.waimai.foundation.core.service.user.b, com.sankuai.waimai.foundation.location.v2.listener.c, OrderGoodObserver {
    private static List<String> F = null;
    public static ChangeQuickRedirect a = null;
    public static String b = "good_detail_items";
    public static ArrayList<GoodsSpu> e = new ArrayList<>();
    private Poi D;
    private a E;
    public int c;
    public GoodsSpu d;
    public com.sankuai.waimai.restaurant.shopcart.config.a f;
    protected ab g;
    protected com.sankuai.waimai.platform.widget.emptylayout.d h;
    public final g i;
    public GoodsDetailRNFragment j;
    public boolean k;
    private int l;
    private boolean m;
    private int n;
    private int o;
    private int p;
    private boolean q;
    private boolean r;
    private String s;
    private String t;
    private boolean u;
    private g v;

    @Override // com.sankuai.waimai.business.restaurant.rn.bridge.c
    public final void a(boolean z) {
    }

    @Override // com.sankuai.waimai.business.restaurant.rn.bridge.c
    public final boolean f() {
        return false;
    }

    @Override // com.sankuai.waimai.business.restaurant.rn.bridge.c
    public final boolean g() {
        return false;
    }

    public GoodDetailActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b7755cec92d05bac1b96efde93fd15c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b7755cec92d05bac1b96efde93fd15c");
            return;
        }
        this.q = false;
        this.c = -1;
        this.d = null;
        this.i = new g();
    }

    static {
        ArrayList arrayList = new ArrayList();
        F = arrayList;
        arrayList.add("preview_order_callback_info");
    }

    private static void a(Activity activity, Intent intent) {
        Object[] objArr = {activity, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "21b280b8cb08e086fa71d5836fd45b4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "21b280b8cb08e086fa71d5836fd45b4d");
        } else if (activity.getIntent() != null) {
            for (String str : F) {
                if (activity.getIntent().hasExtra(str)) {
                    intent.putExtra(str, f.a(activity.getIntent(), str));
                }
            }
        }
    }

    public static void a(Activity activity, GoodsSpu goodsSpu, g gVar, String str) {
        boolean b2;
        Object[] objArr = {activity, goodsSpu, gVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b604c3ea35bf9aed588887f8e5ec7a2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b604c3ea35bf9aed588887f8e5ec7a2c");
            return;
        }
        Object[] objArr2 = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8c8db95c2c37b0835f5f8e9ddd9f9cdc", RobustBitConfig.DEFAULT_VALUE)) {
            b2 = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8c8db95c2c37b0835f5f8e9ddd9f9cdc")).booleanValue();
        } else {
            b2 = com.sankuai.waimai.platform.privacy.a.a().b();
            if (b2) {
                com.sankuai.waimai.platform.privacy.a.a().a(activity);
            }
        }
        if (b2) {
            return;
        }
        Intent intent = new Intent(activity, GoodDetailActivity.class);
        intent.putExtra(b, goodsSpu);
        intent.putExtra(FoodDetailNetWorkPreLoader.INTENT_POI, gVar.g);
        intent.putExtra(FoodDetailNetWorkPreLoader.INTENT_IS_SELFDELIVERY_SHOP, gVar.k);
        intent.putExtra("intent_traffic_from", gVar.l);
        intent.putExtra("intent_business_type", gVar.o);
        intent.putExtra("intent_is_cross_order", gVar.m);
        intent.putExtra("linkIdentifierInfo", gVar.y);
        intent.putExtra(FoodDetailNetWorkPreLoader.INTENT_REFERER_SOURCE, 1);
        intent.putExtra("is_from_restaurant", activity instanceof WMRestaurantActivity);
        intent.putExtra("ref_list_id", str);
        intent.putExtra(FoodDetailNetWorkPreLoader.INTENT_SAFE_PRE_LOAD, 1);
        intent.putExtra("separate_pack", gVar.d);
        intent.putExtra("change_shop_buy", gVar.c ? 1 : 0);
        intent.putExtra("shop_type", gVar.z);
        intent.putExtra("origin_brand_id", gVar.A());
        intent.putExtra("preview_order_callback_info", com.sankuai.waimai.business.restaurant.poicontainer.utils.g.a(activity.getIntent(), "preview_order_callback_info", "preview_order_callback_info", ""));
        a(activity, intent);
        e.clear();
        com.sankuai.waimai.foundation.router.a.a(activity, com.sankuai.waimai.foundation.router.interfaces.c.i, intent.getExtras());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a9a63a0066dcf6baf2049ed9cd8d6f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a9a63a0066dcf6baf2049ed9cd8d6f2");
        } else if (!n()) {
            o();
            if (this.c >= 0) {
                this.d = e.get(this.c);
            }
        } else {
            this.c = 0;
            if (e == null || e.size() <= 0) {
                return;
            }
            this.d = e.get(0);
        }
    }

    private boolean n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61a0f109fa8c1c80b62551532e060703", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61a0f109fa8c1c80b62551532e060703")).booleanValue();
        }
        if (com.sankuai.waimai.foundation.router.a.a(getIntent())) {
            long a2 = com.sankuai.waimai.foundation.router.a.a(getIntent(), "spuid", -1L);
            long a3 = com.sankuai.waimai.foundation.router.a.a(getIntent(), FoodDetailNetWorkPreLoader.URI_SKU, -1L);
            String a4 = com.sankuai.waimai.foundation.router.a.a(getIntent(), "activitytag", "");
            String a5 = com.sankuai.waimai.foundation.router.a.a(getIntent(), "sputag", "");
            GoodsSpu goodsSpu = new GoodsSpu();
            goodsSpu.id = a2;
            if (goodsSpu.getSkuList() == null) {
                ArrayList arrayList = new ArrayList();
                GoodsSku goodsSku = new GoodsSku();
                goodsSku.id = a3;
                arrayList.add(goodsSku);
                goodsSpu.setSkuList(arrayList);
            }
            if (!TextUtils.isEmpty(a4)) {
                goodsSpu.setActivityTag(a4);
            }
            if (!TextUtils.isEmpty(a5)) {
                goodsSpu.setTag(a5);
            }
            e.clear();
            e.add(goodsSpu);
            return true;
        }
        GoodsSpu goodsSpu2 = (GoodsSpu) f.a(getIntent(), b, (Serializable) null);
        if (goodsSpu2 != null) {
            e.clear();
            e.add(goodsSpu2);
            return true;
        }
        return false;
    }

    private void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0251ad80098a90d1e182a3c44c868b34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0251ad80098a90d1e182a3c44c868b34");
        } else if (this.c < 0 || this.c >= e.size()) {
            GoodsSpu goodsSpu = com.sankuai.waimai.platform.domain.manager.goods.a.a().c;
            for (int i = 0; i < e.size(); i++) {
                if (PoiGoodsHelper.a(e.get(i), goodsSpu)) {
                    this.c = i;
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final long j, final String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25a88101aac508d0d952450f2ef297aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25a88101aac508d0d952450f2ef297aa");
            return;
        }
        if (this.h != null) {
            this.h.d();
        }
        s().recordStep("poi_data_api_start");
        com.sankuai.waimai.business.restaurant.base.repository.b.b(w()).a(j, str, this.i.m, this.i.y, new com.sankuai.waimai.business.restaurant.base.repository.net.c<PoiShoppingCartAndPoi>() { // from class: com.sankuai.waimai.business.restaurant.goodsdetail.GoodDetailActivity.1
            public static ChangeQuickRedirect b;

            @Override // com.sankuai.waimai.business.restaurant.base.repository.net.c, com.sankuai.waimai.business.restaurant.base.repository.net.b
            public final /* synthetic */ void a(Object obj) {
                com.sankuai.waimai.business.restaurant.base.shopcart.b n;
                PoiShoppingCartAndPoi poiShoppingCartAndPoi = (PoiShoppingCartAndPoi) obj;
                Object[] objArr2 = {poiShoppingCartAndPoi};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e776f80b74ba7aa3f9962ce804fe6a2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e776f80b74ba7aa3f9962ce804fe6a2");
                    return;
                }
                GoodDetailActivity.this.s().recordStep("poi_data_api_end");
                if (poiShoppingCartAndPoi.poi != null) {
                    String poiIDStr = poiShoppingCartAndPoi.poi.getPoiIDStr();
                    if (!str.equals(poiIDStr)) {
                        GlobalCartManager.getInstance().addNewPoiId(str, poiIDStr);
                        a.C1052a.a("poi_cart_info", str, poiIDStr);
                        com.sankuai.waimai.platform.domain.core.poi.b.a(poiShoppingCartAndPoi.poi.getId(), poiIDStr);
                    }
                    if (poiShoppingCartAndPoi.poiShoppingCart != null && (n = k.a().n(poiIDStr)) != null && n.n == null && poiShoppingCartAndPoi.poiShoppingCart.hasRequiredTag) {
                        RequiredTagInfo requiredTagInfo = new RequiredTagInfo();
                        requiredTagInfo.hasRequiredTag = true;
                        n.n = requiredTagInfo;
                    }
                }
                if (GoodDetailActivity.this.h != null) {
                    GoodDetailActivity.this.h.h();
                }
                GoodDetailActivity.this.i.a(poiShoppingCartAndPoi.poi, 1);
                GoodDetailActivity.this.i.a(poiShoppingCartAndPoi.functionControl);
                GoodDetailActivity.this.i.z = poiShoppingCartAndPoi.shopType;
                GoodDetailActivity.this.g.n();
                k.a().a(GoodDetailActivity.this.i.f(), GoodDetailActivity.this.i);
                if (!com.sankuai.waimai.foundation.utils.f.a(GoodDetailActivity.this.bB_()) && poiShoppingCartAndPoi != null && poiShoppingCartAndPoi.poi != null && poiShoppingCartAndPoi.poi.poiType == 1) {
                    g.a(GoodDetailActivity.this.bB_(), String.valueOf(poiShoppingCartAndPoi.poi.id), poiShoppingCartAndPoi.poi.getPoiIDStr(), com.sankuai.waimai.foundation.router.a.a(GoodDetailActivity.this.getIntent(), "spuid", ""), com.sankuai.waimai.foundation.router.a.a(GoodDetailActivity.this.getIntent(), FoodDetailNetWorkPreLoader.URI_SKU, ""));
                    GoodDetailActivity.this.bB_().finish();
                } else if (com.sankuai.waimai.foundation.utils.f.a(GoodDetailActivity.this)) {
                } else {
                    GoodDetailActivity.this.m();
                }
            }

            @Override // com.sankuai.waimai.business.restaurant.base.repository.net.c, com.sankuai.waimai.business.restaurant.base.repository.net.b
            public final void a(com.sankuai.waimai.platform.modular.network.error.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b0685b56defe451c7c1f3f214c039a09", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b0685b56defe451c7c1f3f214c039a09");
                    return;
                }
                if (GoodDetailActivity.this.h != null) {
                    GoodDetailActivity.this.h.c(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.goodsdetail.GoodDetailActivity.1.1
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr3 = {view};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0894b2c22dc2b91210ba8ba630df705e", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0894b2c22dc2b91210ba8ba630df705e");
                            } else {
                                GoodDetailActivity.this.a(j, str);
                            }
                        }
                    });
                    GoodDetailActivity.this.h.g();
                }
                GoodDetailActivity.this.s().disable();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x029e  */
    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(@android.support.annotation.Nullable android.os.Bundle r17) {
        /*
            Method dump skipped, instructions count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.restaurant.goodsdetail.GoodDetailActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "985e58ba1d8a6b269ebcac7fcb0200ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "985e58ba1d8a6b269ebcac7fcb0200ef");
            return;
        }
        super.onStart();
        this.u = true;
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2deea562ce4f8926d7004f6ebc7ee990", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2deea562ce4f8926d7004f6ebc7ee990");
            return;
        }
        this.u = false;
        super.onStop();
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c35c5fc12c94a1b1da39d83126a02ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c35c5fc12c94a1b1da39d83126a02ac");
            return;
        }
        super.onResume();
        if (this.f != null) {
            this.f.e = true;
        }
        if (this.g != null) {
            this.g.c();
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1365cf8aa9a096a7438cd664528acb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1365cf8aa9a096a7438cd664528acb9");
            return;
        }
        super.onPause();
        if (this.f != null) {
            this.f.e = false;
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65b4c78494dafa2279cf3c5d9845f6ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65b4c78494dafa2279cf3c5d9845f6ff");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        super.onActivityResult(i, i2, intent);
        if (i == 33 && i2 == -1) {
            this.g.p();
        }
        com.meituan.android.privacy.aop.a.b();
    }

    @Override // android.app.Activity
    public void finish() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe5e515b7f2646f289dbea8b7e00263e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe5e515b7f2646f289dbea8b7e00263e");
            return;
        }
        super.finish();
        if (this.i == null || this.i.z()) {
            overridePendingTransition(0, R.anim.wm_goods_detail_activity_translate_out);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2347d5c7fb45d10aa8f51ecfbf44baf6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2347d5c7fb45d10aa8f51ecfbf44baf6");
            return;
        }
        super.onDestroy();
        k.a().b(this);
        com.sankuai.waimai.platform.domain.manager.user.a.i().b((com.sankuai.waimai.foundation.core.service.user.b) this);
        com.sankuai.waimai.foundation.location.v2.g.a().b(this, "Restaurant-LocateService");
        if (this.g != null) {
            this.g.d();
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.user.b
    public void onChanged(b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a00f76a487802531b4d2af9e128fc2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a00f76a487802531b4d2af9e128fc2b");
            return;
        }
        if (aVar == b.a.LOGIN && bB_() != null && this.u && GoodDetailHelper.a() != GoodDetailHelper.a.FAVORITE_PRODUCT) {
            this.g.q();
        }
        if (this.i != null) {
            k.a().n(this.i.f()).b();
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.user.b
    public void onAccountInfoUpdate(b.EnumC0948b enumC0948b) {
        Object[] objArr = {enumC0948b};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48c77326d85810640975f101007bd243", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48c77326d85810640975f101007bd243");
            return;
        }
        if (this.u) {
            this.g.p();
        }
        if (this.i != null) {
            k.a().n(this.i.f()).b();
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.rn.bridge.c
    public final g b() {
        return this.i;
    }

    @Override // com.sankuai.waimai.business.restaurant.rn.bridge.c
    public final ab d() {
        return this.g;
    }

    @Override // com.sankuai.waimai.business.restaurant.rn.bridge.c
    public final Poi h() {
        return this.D;
    }

    @Override // com.sankuai.waimai.business.restaurant.rn.bridge.c
    public final g i() {
        return this.v;
    }

    @Override // com.sankuai.waimai.platform.domain.manager.observers.OrderGoodObserver
    public final void aF_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "075f58f609f2f7f48a30775988ba49e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "075f58f609f2f7f48a30775988ba49e6");
            return;
        }
        WritableMap createMap = Arguments.createMap();
        if (p() != null) {
            com.sankuai.waimai.business.restaurant.rn.bridge.a.a(p(), "RefreshGoodsList", createMap);
        }
    }

    private ReactContext p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad6db38999ce4552b56344028aad08e7", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReactContext) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad6db38999ce4552b56344028aad08e7");
        }
        if (this.j == null || this.j.l() == null) {
            return null;
        }
        return this.j.l().getCurrentReactContext();
    }

    @Override // com.sankuai.waimai.business.restaurant.goodsdetail.module.d
    public final com.sankuai.waimai.business.restaurant.goodsdetail.module.a j() {
        return this.E;
    }

    @Override // com.sankuai.waimai.business.restaurant.rn.bridge.b
    public final String k() {
        return this.t;
    }

    @Override // com.sankuai.waimai.business.restaurant.rn.bridge.b
    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a022d9defbc77e8d70882395836fe62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a022d9defbc77e8d70882395836fe62");
        } else if (this.g != null) {
            this.g.m();
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9b3c9218f6f9634ec72d11d92a3303f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9b3c9218f6f9634ec72d11d92a3303f");
        } else if (this.g == null || !this.g.s()) {
            if (this.j == null || !this.j.k()) {
                super.onBackPressed();
            }
        }
    }

    @Override // com.sankuai.waimai.foundation.location.v2.listener.c
    public void onPoiChange(@Nullable WmAddress wmAddress, boolean z) {
        Object[] objArr = {wmAddress, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0499a2fd1a28ecc1d74cd097ab5aa30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0499a2fd1a28ecc1d74cd097ab5aa30");
        } else {
            finish();
        }
    }
}
