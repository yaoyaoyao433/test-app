package com.sankuai.waimai.business.restaurant.poicontainer;

import android.app.Activity;
import android.arch.lifecycle.d;
import android.arch.lifecycle.g;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.mtplayer.video.h;
import com.meituan.android.mtplayer.video.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ai.WmRestaurantActivityLifeObserver;
import com.sankuai.waimai.business.order.api.again.AgainManager;
import com.sankuai.waimai.business.restaurant.base.manager.order.k;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.business.restaurant.framework.backpress.OnBackPressedDispatcher;
import com.sankuai.waimai.business.restaurant.poicontainer.utils.e;
import com.sankuai.waimai.foundation.utils.af;
import com.sankuai.waimai.landing.a;
import com.sankuai.waimai.platform.cube.BasePGAActivity;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
import com.sankuai.waimai.platform.utils.f;
import com.sankuai.waimai.platform.utils.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMRestaurantActivity extends BasePGAActivity implements com.sankuai.waimai.business.restaurant.framework.backpress.b, com.sankuai.waimai.business.restaurant.rn.bridge.b, com.sankuai.waimai.platform.machpro.video.a {
    public static ChangeQuickRedirect a;
    public b b;
    public com.sankuai.waimai.ai.uat.a c;
    public final e d;
    public com.sankuai.waimai.business.restaurant.poicontainer.pga.b e;
    private boolean f;
    private g g;
    private boolean h;
    private h i;
    private final OnBackPressedDispatcher j;
    private Uri k;

    @Override // com.sankuai.waimai.platform.cube.BaseCubeActivity
    public final void m() {
    }

    public WMRestaurantActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4db0a99cb8f094c28494ef0f0e83461b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4db0a99cb8f094c28494ef0f0e83461b");
            return;
        }
        this.f = false;
        this.h = false;
        this.d = new e();
        this.e = new com.sankuai.waimai.business.restaurant.poicontainer.pga.b(this);
        this.j = new OnBackPressedDispatcher(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.WMRestaurantActivity.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "29b63d05c2f47fcef128da18c748d375", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "29b63d05c2f47fcef128da18c748d375");
                    return;
                }
                if (WMRestaurantActivity.this.f || (WMRestaurantActivity.this.b != null && WMRestaurantActivity.this.b.N())) {
                    com.sankuai.waimai.foundation.router.a.a(WMRestaurantActivity.this, com.sankuai.waimai.foundation.router.interfaces.c.B);
                }
                WMRestaurantActivity.super.onBackPressed();
            }
        });
    }

    @Override // com.sankuai.waimai.platform.cube.BaseCubeActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String a2;
        String a3;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fcc74bad892f5e5b7d226c45f1ca210", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fcc74bad892f5e5b7d226c45f1ca210");
            return;
        }
        if (bundle != null) {
            com.sankuai.waimai.business.restaurant.poicontainer.machpro.a.a("MachPro_TAG_WMRestaurantActivity_savedInstanceState remove fragments");
            bundle.remove("android:support:fragments");
        }
        com.sankuai.waimai.business.restaurant.poicontainer.machpro.a.a("MachPro_TAG_WMRestaurantActivity_onCreate");
        e eVar = this.d;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "918dba8d5e19bf7b3adc3fd25e99207f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "918dba8d5e19bf7b3adc3fd25e99207f");
        } else {
            eVar.a("page_init");
        }
        this.g = new g(this);
        getLifecycle().a(new WmRestaurantActivityLifeObserver(this));
        this.g.a(d.a.ON_CREATE);
        super.onCreate(bundle);
        com.sankuai.waimai.business.restaurant.composeorder.a.b = i();
        com.sankuai.waimai.business.restaurant.composeorder.a.c = aC_();
        com.sankuai.waimai.mach.manager.load.c.a("waimai", "waimai-restaurant");
        this.f = getIntent() != null && f.a(getIntent(), "need_return_to_home_when_back", false);
        if (i() && !aC_()) {
            if (getIntent() == null) {
                return;
            }
            String a4 = f.a(getIntent(), "multi_person_cart_id");
            String a5 = f.a(getIntent(), "multi_person_cart_identity_id");
            boolean a6 = f.a(getIntent(), "multi_person_is_from_rn", false);
            com.sankuai.waimai.business.restaurant.composeorder.a.a().d = (ArrayList) f.c(getIntent(), "multi_person_cart");
            com.sankuai.waimai.business.restaurant.composeorder.a.a().g = a6;
            com.sankuai.waimai.business.restaurant.composeorder.a.a().e = a4;
            com.sankuai.waimai.business.restaurant.composeorder.a.a().f = a5;
        }
        Statistics.disableAutoPV(AppUtil.generatePageInfoKey(this));
        Statistics.disableAutoPD(AppUtil.generatePageInfoKey(this));
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "437f592d00c0b429145176e48731ed64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "437f592d00c0b429145176e48731ed64");
            return;
        }
        if (this.b == null || this.b.G() == 0 || ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.b.G()).q == null) {
            a2 = com.sankuai.waimai.business.restaurant.poicontainer.utils.g.a(getIntent(), "ad_slot", "ad_slot", "");
            a3 = com.sankuai.waimai.business.restaurant.poicontainer.utils.g.a(getIntent(), "ad_channel", "ad_channel", "");
            if (!TextUtils.isEmpty(a2) && !TextUtils.isEmpty(a3)) {
                com.sankuai.waimai.landing.report.b.a(a2, a3, "page_create_not_ready");
            }
        } else {
            a2 = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.b.G()).q.adSlotId;
            a3 = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.b.G()).q.adChannelId;
        }
        if (TextUtils.isEmpty(a2) || TextUtils.isEmpty(a3)) {
            return;
        }
        com.sankuai.waimai.landing.a aVar = new com.sankuai.waimai.landing.a();
        aVar.b = a2;
        aVar.c = a3;
        aVar.e = a.EnumC0984a.Native;
        com.sankuai.waimai.landing.b.a().a(com.sankuai.waimai.landing.state.b.PAGE_CREATED, aVar);
        this.h = true;
    }

    @Override // com.sankuai.waimai.platform.cube.BaseCubeActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        com.sankuai.waimai.business.restaurant.base.manager.order.g O;
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6e334f27535e2c7dbd5d1299cc69ed9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6e334f27535e2c7dbd5d1299cc69ed9");
            return;
        }
        super.onNewIntent(intent);
        if (TextUtils.isEmpty(this.C) || !this.C.contains("jsdShippingFeeFree")) {
            return;
        }
        this.C = null;
        com.sankuai.waimai.business.restaurant.base.manager.order.g h = k.a().h(f.a(intent, FoodDetailNetWorkPreLoader.URI_POI_STR));
        if (h != null) {
            h.y = null;
        }
        if (this.b == null || (O = this.b.O()) == null) {
            return;
        }
        O.y = null;
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.app.Activity
    public void onRestart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6501c02e75a01a0a4ecb5fe864d34ea3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6501c02e75a01a0a4ecb5fe864d34ea3");
            return;
        }
        super.onRestart();
        com.sankuai.waimai.business.restaurant.poicontainer.machpro.a.a("MachPro_TAG_WMRestaurantActivity_onRestart");
    }

    @Override // com.sankuai.waimai.platform.cube.BaseCubeActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82f2c2fae6b4a1dbdc28c0f1d7d6f559", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82f2c2fae6b4a1dbdc28c0f1d7d6f559");
            return;
        }
        super.onStart();
        com.sankuai.waimai.business.restaurant.poicontainer.machpro.a.a("MachPro_TAG_WMRestaurantActivity_onStart");
        com.sankuai.waimai.business.restaurant.composeorder.a.b = i();
        com.sankuai.waimai.business.restaurant.composeorder.a.c = aC_();
        this.g.a(d.a.ON_START);
    }

    @Override // com.sankuai.waimai.platform.cube.BasePGAActivity
    public final com.meituan.android.cube.pga.core.a f() {
        return this.e;
    }

    @Override // com.sankuai.waimai.platform.cube.BaseCubeActivity
    public final com.meituan.android.cube.core.f g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41285bbc23e1dd67c6a0527706f23a95", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.core.f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41285bbc23e1dd67c6a0527706f23a95");
        }
        this.b = new b(this.e);
        return this.b;
    }

    @Override // com.sankuai.waimai.business.restaurant.framework.backpress.b
    @NonNull
    public final OnBackPressedDispatcher a() {
        return this.j;
    }

    @Override // com.sankuai.waimai.platform.cube.BaseCubeActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44ea46e41eb66e41e9fe1ff706fbd0b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44ea46e41eb66e41e9fe1ff706fbd0b3");
            return;
        }
        super.onResume();
        com.sankuai.waimai.business.restaurant.poicontainer.machpro.a.a("MachPro_TAG_WMRestaurantActivity_onResume");
        this.g.a(d.a.ON_RESUME);
    }

    @Override // com.sankuai.waimai.platform.cube.BaseCubeActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be7a7d4087555ed9b01dfb046d45cd53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be7a7d4087555ed9b01dfb046d45cd53");
            return;
        }
        super.onPause();
        com.sankuai.waimai.business.restaurant.poicontainer.machpro.a.a("MachPro_TAG_WMRestaurantActivity_onPause");
        this.g.a(d.a.ON_PAUSE);
    }

    @Override // com.sankuai.waimai.platform.cube.BaseCubeActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4eeb570567faae743d06ac65d1c9e17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4eeb570567faae743d06ac65d1c9e17");
            return;
        }
        super.onStop();
        com.sankuai.waimai.business.restaurant.poicontainer.machpro.a.a("MachPro_TAG_WMRestaurantActivity_onStop");
        this.g.a(d.a.ON_STOP);
    }

    @Override // com.sankuai.waimai.platform.cube.BaseCubeActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        String a2;
        String a3;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77a6411752532c0ce82580276ebb4da6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77a6411752532c0ce82580276ebb4da6");
            return;
        }
        super.onDestroy();
        com.sankuai.waimai.business.restaurant.poicontainer.machpro.a.a("MachPro_TAG_WMRestaurantActivity_onDestroy");
        if (i()) {
            com.sankuai.waimai.business.restaurant.composeorder.a.b = false;
            com.sankuai.waimai.business.restaurant.composeorder.a.c = false;
        }
        this.g.a(d.a.ON_DESTROY);
        if (!this.h) {
            if (this.b == null || this.b.G() == 0 || ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.b.G()).q == null) {
                a2 = com.sankuai.waimai.business.restaurant.poicontainer.utils.g.a(getIntent(), "ad_slot", "ad_slot", "");
                a3 = com.sankuai.waimai.business.restaurant.poicontainer.utils.g.a(getIntent(), "ad_channel", "ad_channel", "");
            } else {
                a2 = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.b.G()).q.adSlotId;
                a3 = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.b.G()).q.adChannelId;
            }
            if (!TextUtils.isEmpty(a2) && !TextUtils.isEmpty(a3)) {
                com.sankuai.waimai.landing.report.b.a(a2, a3, "page_finish_not_create");
            }
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4697d95b0d3540586a30d2fc29279d16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4697d95b0d3540586a30d2fc29279d16");
        } else if (this.i != null) {
            this.i.a();
            this.i = null;
        }
    }

    @Override // com.sankuai.waimai.platform.cube.BaseCubeActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "330c984bc859ae00dbd02b2a671b895e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "330c984bc859ae00dbd02b2a671b895e");
            return;
        }
        com.sankuai.waimai.business.restaurant.poicontainer.machpro.a.a("MachPro_TAG_WMRestaurantActivity_onSaveInstanceState start");
        super.onSaveInstanceState(bundle);
        com.sankuai.waimai.business.restaurant.poicontainer.machpro.a.a("MachPro_TAG_WMRestaurantActivity_onSaveInstanceState mid");
        if (bundle != null) {
            bundle.putParcelable("android:support:fragments", null);
        }
        j.a(bundle);
        com.sankuai.waimai.business.restaurant.poicontainer.machpro.a.a("MachPro_TAG_WMRestaurantActivity_onSaveInstanceState end");
    }

    public final Poi h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89f935b56707c66b3ce42802fb3918df", RobustBitConfig.DEFAULT_VALUE) ? (Poi) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89f935b56707c66b3ce42802fb3918df") : this.b.O().g;
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, com.sankuai.waimai.foundation.core.base.activity.c
    public final Map<String, String> Z_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77dadb7f03a2c1d1f5aa13acf30acd8b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77dadb7f03a2c1d1f5aa13acf30acd8b");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("page_id", "waimai_restaurant");
        Poi h = h();
        if (h != null) {
            hashMap.put("poi_id", h.getPoiIDStr());
        }
        return hashMap;
    }

    public final boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3159b11e28c10e089f78fdfe5fd3dff", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3159b11e28c10e089f78fdfe5fd3dff")).booleanValue();
        }
        boolean z = getIntent() != null && f.a(getIntent(), "is_restrict_restaurant", false);
        com.sankuai.waimai.foundation.utils.log.a.b("MultiPerson", " isRestriceShop= " + z, new Object[0]);
        return z;
    }

    public static boolean a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "71fd705c708643c5afd15ac20c07f322", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "71fd705c708643c5afd15ac20c07f322")).booleanValue();
        }
        boolean z = activity instanceof WMRestaurantActivity;
        return (!z && com.sankuai.waimai.business.restaurant.composeorder.a.b) || (z && ((WMRestaurantActivity) activity).i());
    }

    public final boolean aC_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a1d83833ba9e0733d9be3eddc01264a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a1d83833ba9e0733d9be3eddc01264a")).booleanValue() : getIntent() != null && f.a(getIntent(), "NO_OBTAIN_MULTI_PERSON_DATA", false);
    }

    private void a(Intent intent, Uri uri) {
        Object[] objArr = {intent, uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7dd2031c707c71ac24f439b32ae7e564", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7dd2031c707c71ac24f439b32ae7e564");
        } else if (intent != null) {
            String a2 = f.a(intent, "poiName", "");
            long a3 = f.a(intent, "poiId", -1L);
            long a4 = f.a(intent, "foodId", -1L);
            int a5 = f.a(intent, "need_add", 0);
            String a6 = f.a(intent, "mtPoiId", "");
            String a7 = f.a(intent, "yy_log", "");
            String a8 = f.a(intent, "ct_poi", "");
            String a9 = f.a(intent, "extra_stid", "");
            String a10 = f.a(intent, "gSource", "");
            HashMap hashMap = new HashMap();
            hashMap.put(AgainManager.EXTRA_POI_NAME, a2);
            hashMap.put("poi_id", a3 == -1 ? null : String.valueOf(a3));
            hashMap.put("mt_poi_id", a6);
            hashMap.put("spu_id", a4 == -1 ? null : String.valueOf(a4));
            hashMap.put("add_to_shopcart", String.valueOf(a5));
            hashMap.put("yy_log", a7);
            hashMap.put("ct_poi", a8);
            hashMap.put("stid", a9);
            hashMap.put("g_source", a10);
            if (uri != null) {
                this.k = af.a(uri, hashMap).buildUpon().scheme(com.sankuai.waimai.foundation.router.interfaces.d.d(getApplicationContext())).authority(com.sankuai.waimai.foundation.router.interfaces.d.e(getApplicationContext())).path("/takeout/foods").build();
            } else {
                this.k = af.a(new Uri.Builder().scheme(com.sankuai.waimai.foundation.router.interfaces.d.d(getApplicationContext())).authority(com.sankuai.waimai.foundation.router.interfaces.d.e(getApplicationContext())).path("/takeout/foods").build(), hashMap);
            }
        } else {
            this.k = null;
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity
    public final Uri a(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "664f16b1f7d0735af09045f8dc197975", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "664f16b1f7d0735af09045f8dc197975");
        }
        if (this.k == null) {
            a(getIntent(), uri);
        }
        return this.k;
    }

    @Override // android.arch.lifecycle.f
    public d getLifecycle() {
        return this.g;
    }

    @Override // com.sankuai.waimai.business.restaurant.rn.bridge.b
    public final String k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3051ac08add4029518a967137a89c4ef", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3051ac08add4029518a967137a89c4ef") : h() == null ? "" : h().poiIDStr;
    }

    @Override // android.app.Activity
    public void finish() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4debca7a13311608306b925b6371014f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4debca7a13311608306b925b6371014f");
            return;
        }
        ((b) j()).M();
        super.finish();
    }

    @Override // com.sankuai.waimai.business.restaurant.rn.bridge.b
    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8131e095a8e53c5432a46963ae28032", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8131e095a8e53c5432a46963ae28032");
        } else {
            this.e.F.d.a((com.meituan.android.cube.pga.common.b<Object>) null);
        }
    }

    public final void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "644238943ba33625d179c277fd0ac627", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "644238943ba33625d179c277fd0ac627");
            return;
        }
        this.z.disable();
        e eVar = this.d;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "0c8f61398ec66920c43263bed53ebe5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "0c8f61398ec66920c43263bed53ebe5d");
            return;
        }
        eVar.a();
        eVar.b();
        eVar.c();
    }

    @Override // com.sankuai.waimai.platform.machpro.video.a
    public final h b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "058c517b9dbada79b9833c8d8915883c", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "058c517b9dbada79b9833c8d8915883c");
        }
        if (this.i == null) {
            this.i = new h();
        }
        return this.i;
    }

    @Override // com.sankuai.waimai.platform.machpro.video.a
    public final l d() {
        return l.TYPE_XPLAYER;
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7714693db1178680ffa72524088211d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7714693db1178680ffa72524088211d9");
            return;
        }
        OnBackPressedDispatcher onBackPressedDispatcher = this.j;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = OnBackPressedDispatcher.a;
        if (PatchProxy.isSupport(objArr2, onBackPressedDispatcher, changeQuickRedirect2, false, "ad5d3391f07348c5337f7879e42a8f92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, onBackPressedDispatcher, changeQuickRedirect2, false, "ad5d3391f07348c5337f7879e42a8f92");
            return;
        }
        Iterator<com.sankuai.waimai.business.restaurant.framework.backpress.a> descendingIterator = onBackPressedDispatcher.c.descendingIterator();
        while (descendingIterator.hasNext()) {
            if (descendingIterator.next().b()) {
                return;
            }
        }
        if (onBackPressedDispatcher.b != null) {
            onBackPressedDispatcher.b.run();
        }
    }
}
