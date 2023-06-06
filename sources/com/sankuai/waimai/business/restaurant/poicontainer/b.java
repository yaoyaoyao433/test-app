package com.sankuai.waimai.business.restaurant.poicontainer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.dialog.RooAlertDialog;
import com.sankuai.waimai.business.order.api.model.Order;
import com.sankuai.waimai.business.restaurant.base.log.a;
import com.sankuai.waimai.business.restaurant.base.manager.order.g;
import com.sankuai.waimai.business.restaurant.base.manager.order.k;
import com.sankuai.waimai.business.restaurant.base.repository.model.h;
import com.sankuai.waimai.business.restaurant.base.repository.model.i;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.business.restaurant.framework.backpress.OnBackPressedDispatcher;
import com.sankuai.waimai.business.restaurant.framework.g;
import com.sankuai.waimai.business.restaurant.framework.j;
import com.sankuai.waimai.business.restaurant.poicontainer.machpro.nested.MPNestedContainerComponent;
import com.sankuai.waimai.business.restaurant.poicontainer.machpro.nested.MPNestedScrollViewComponent;
import com.sankuai.waimai.business.restaurant.poicontainer.machpro.shopcart.MPRestaurantShopCartComponent;
import com.sankuai.waimai.business.restaurant.poicontainer.machpro.smartentrance.MPRestaurantSmartEntranceComponent;
import com.sankuai.waimai.business.restaurant.poicontainer.machpro.video.MPRestaurantHeaderVideoComponent;
import com.sankuai.waimai.business.restaurant.poicontainer.pga.RestaurantSchemeParams;
import com.sankuai.waimai.business.restaurant.poicontainer.pga.d;
import com.sankuai.waimai.business.restaurant.poicontainer.utils.e;
import com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.machpro.WMRestaurantExpandCouponComponent;
import com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.soldout.a;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.foundation.core.service.user.b;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.utils.af;
import com.sankuai.waimai.foundation.utils.f;
import com.sankuai.waimai.landing.a;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.abtest.ABTestManager;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
import com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager;
import com.sankuai.waimai.platform.globalcart.poimix.a;
import com.sankuai.waimai.platform.monitor.DovePageMonitor;
import com.sankuai.waimai.platform.preload.f;
import com.sankuai.waimai.platform.restaurant.dialog.BaseDialogWithCloseIcon;
import com.sankuai.waimai.platform.restaurant.dialog.ShopCartAbnormalDialog;
import com.sankuai.waimai.platform.utils.listid.ListIDHelper;
import com.sankuai.waimai.platform.widget.emptylayout.d;
import com.sankuai.waimai.restaurant.shopcart.ui.l;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends g<d, com.sankuai.waimai.business.restaurant.poicontainer.pga.c, com.sankuai.waimai.business.restaurant.poicontainer.pga.b> implements com.meituan.android.cube.core.eventhandler.protocol.a, com.meituan.android.cube.core.eventhandler.protocol.b, com.sankuai.waimai.foundation.core.service.user.b, com.sankuai.waimai.foundation.location.v2.listener.c {
    private static boolean A = false;
    public static ChangeQuickRedirect r;
    public static HashMap<String, Boolean> t = new HashMap<>();
    private boolean B;
    private int C;
    private boolean D;
    private boolean E;
    private boolean F;
    private com.sankuai.waimai.restaurant.shopcart.config.a G;
    private final com.sankuai.waimai.foundation.core.service.screenshot.observer.b H;
    private boolean I;
    private final BroadcastReceiver J;
    private boolean K;
    private com.sankuai.waimai.business.restaurant.poicontainer.pga.logic.b L;
    private com.sankuai.waimai.business.restaurant.poicontainer.pga.logic.a M;
    private boolean N;
    private boolean O;
    private com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.b P;
    private l Q;
    private j R;
    public com.sankuai.waimai.business.restaurant.poicontainer.pga.baseblock.a u;
    private ABStrategy v;
    private String w;
    @NonNull
    private g.a x;
    @NonNull
    private WMRestaurantActivity y;
    private com.sankuai.waimai.business.restaurant.poicontainer.machpro.poitip.a z;

    public static /* synthetic */ void a(b bVar, final com.sankuai.waimai.platform.modular.network.error.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "e2ed6ab07d7a2f691e3fc3198ea14334", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "e2ed6ab07d7a2f691e3fc3198ea14334");
            return;
        }
        DovePageMonitor.a(bVar.l(), (int) IjkMediaPlayer.FFP_PROP_INT64_SELECTED_VIDEO_STREAM);
        if (!com.sankuai.waimai.platform.domain.manager.user.a.i().a() && (aVar.b() == 410 || aVar.b() == 411)) {
            if (!f.a(bVar.y)) {
                bVar.y.finish();
            }
        } else {
            com.sankuai.waimai.platform.utils.l.b(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.b.21
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "998911e5dc7980d8de998ada4e657b86", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "998911e5dc7980d8de998ada4e657b86");
                    } else {
                        ((d) b.this.g).a(aVar.getMessage(), "", aVar);
                    }
                }
            }, bVar.w);
        }
        bVar.a(com.sankuai.waimai.landing.state.b.PAGE_DATA_FAILED, aVar == null ? 0 : aVar.b());
        if (bVar.I) {
            bVar.I = false;
        }
        bVar.N = false;
        bVar.y.n();
    }

    public static /* synthetic */ void b(b bVar, h hVar) {
        Poi poi;
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "faf95883004068b86ebb9c943bf66382", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "faf95883004068b86ebb9c943bf66382");
            return;
        }
        try {
            com.sankuai.waimai.business.restaurant.base.config.d dVar = hVar.a;
            bVar.M = (com.sankuai.waimai.business.restaurant.poicontainer.pga.logic.a) com.sankuai.waimai.business.restaurant.base.util.d.a().fromJson((JsonElement) dVar.a, (Class<Object>) com.sankuai.waimai.business.restaurant.poicontainer.pga.logic.a.class);
            try {
                A = bVar.M.l == 1;
                t.put(bVar.M.h.getPoiIDStr(), Boolean.valueOf(bVar.M.h.isInDeliveryRange));
                if (!bVar.M.h.isInDeliveryRange) {
                    ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) bVar.n).s = false;
                }
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
            }
            e eVar = bVar.y.d;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = e.a;
            if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "b4110126e14a1cd91fedcc50f5ae9086", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "b4110126e14a1cd91fedcc50f5ae9086");
            } else {
                eVar.a("data_process_success");
            }
            d dVar2 = (d) bVar.g;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = d.d;
            if (PatchProxy.isSupport(objArr3, dVar2, changeQuickRedirect3, false, "599d197068f1b2e6e50ac4e43b544d8c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, dVar2, changeQuickRedirect3, false, "599d197068f1b2e6e50ac4e43b544d8c");
            } else {
                dVar2.e.i();
            }
            ((d) bVar.g).f();
            com.sankuai.waimai.business.restaurant.poicontainer.pga.logic.a aVar = bVar.M;
            Object[] objArr4 = {aVar};
            ChangeQuickRedirect changeQuickRedirect4 = r;
            if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "61ffd8b3df988ba3dc687007c41cdab3", RobustBitConfig.DEFAULT_VALUE)) {
                Poi poi2 = (Poi) PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "61ffd8b3df988ba3dc687007c41cdab3");
            } else if (aVar != null && (poi = aVar.h) != null) {
                poi.isSelfDelivery = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) bVar.n).q.mIsSelfDelivery;
                String poiIDStr = poi.getPoiIDStr();
                com.sankuai.waimai.business.restaurant.base.manager.order.g gVar = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) bVar.n).p;
                if (!gVar.f().equals(poiIDStr)) {
                    GlobalCartManager.getInstance().addNewPoiId(gVar.f(), poiIDStr);
                    com.sankuai.waimai.platform.domain.core.poi.b.a(poi.getId(), poi.getPoiIDStr());
                    a.C1052a.a("poi_food", gVar.f(), poiIDStr);
                }
            }
            if (!bVar.B) {
                bVar.c(true);
            }
            bVar.B = true;
            bVar.c(dVar);
            if (bVar.I) {
                bVar.I = false;
            }
        } catch (Exception e2) {
            com.sankuai.waimai.foundation.utils.log.a.a(e2);
        }
    }

    public static /* synthetic */ boolean b(b bVar, boolean z) {
        bVar.K = false;
        return false;
    }

    public static /* synthetic */ boolean o(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "75748b966bdc8e9aa1cc858a1f65fc00", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "75748b966bdc8e9aa1cc858a1f65fc00")).booleanValue();
        }
        com.sankuai.waimai.business.restaurant.base.manager.order.g gVar = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) bVar.n).p;
        String f = gVar.f();
        String generatePageInfoKey = AppUtil.generatePageInfoKey(bVar.l());
        int s = gVar.s();
        Object[] objArr2 = {generatePageInfoKey, f, Integer.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.restaurant.poicontainer.helper.l.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b358e46782c44caafd5799c22a1c37a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b358e46782c44caafd5799c22a1c37a0");
        } else {
            JudasManualManager.a("b_2lUbF", "c_CijEL", generatePageInfoKey).a("poi_id", f).a(KernelConfig.KEY_CONTAINER_TYPE, s).a();
        }
        return false;
    }

    public static /* synthetic */ void r(b bVar) {
        Map<Long, GoodsSpu> a;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "bd513fbbe7ac24df5dd943c0c881d0d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "bd513fbbe7ac24df5dd943c0c881d0d8");
            return;
        }
        com.sankuai.waimai.business.restaurant.base.manager.order.g O = bVar.O();
        if (O.o() == 3 || O.a()) {
            com.sankuai.waimai.foundation.utils.log.a.b("order", "clear order in rest menu page", new Object[0]);
            ((d) bVar.g).f();
            bVar.S();
            return;
        }
        List<GoodsSpu> list = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) bVar.F()).K.n.a().b;
        if (!bVar.I) {
            com.sankuai.waimai.business.restaurant.composeorder.a.a().a(((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) bVar.F()).K.n.a().b, O.f());
        }
        com.sankuai.waimai.business.restaurant.base.shopcart.b n = k.a().n(O.f());
        int e = n.e();
        int templateType = O.g.getTemplateType();
        if (O.H && O.w()) {
            templateType = 0;
        }
        Object[] objArr2 = {Integer.valueOf(templateType), list, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.restaurant.base.shopcart.b.d;
        if (PatchProxy.isSupport(objArr2, n, changeQuickRedirect2, false, "1f8754b944c9354c915d0b2bd453c2fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, n, changeQuickRedirect2, false, "1f8754b944c9354c915d0b2bd453c2fd");
        } else if (list != null && !list.isEmpty() && (a = n.a(list)) != null) {
            n.a(templateType, a, true);
        }
        int e2 = n.e();
        int i = O.C;
        if (i == com.sankuai.waimai.business.restaurant.base.manager.order.g.D || i == com.sankuai.waimai.business.restaurant.base.manager.order.g.F) {
            int i2 = e - e2;
            if (i2 == e) {
                O.C = com.sankuai.waimai.business.restaurant.base.manager.order.g.E;
            } else if (i2 > 0) {
                O.C = com.sankuai.waimai.business.restaurant.base.manager.order.g.F;
            }
        }
        bVar.Q();
    }

    public static /* synthetic */ void s(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "182e3f686aafcfeb366c419914f9dea0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "182e3f686aafcfeb366c419914f9dea0");
            return;
        }
        com.sankuai.waimai.platform.utils.l.b(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.b.23
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "039bec9387ca631aa749949f95922442", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "039bec9387ca631aa749949f95922442");
                    return;
                }
                d dVar = (d) b.this.g;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = d.d;
                if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "1d5d82cecc53d1919202a6196c1ab076", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "1d5d82cecc53d1919202a6196c1ab076");
                } else {
                    dVar.e.g();
                }
            }
        }, bVar.w);
        bVar.N = false;
        bVar.y.n();
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e53f1448e7f4383079cfad1e5c1ab00", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.business.restaurant.poicontainer.pga.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e53f1448e7f4383079cfad1e5c1ab00") : new com.sankuai.waimai.business.restaurant.poicontainer.pga.c(l(), new com.sankuai.waimai.business.restaurant.base.manager.order.g());
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ com.meituan.android.cube.pga.view.a z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ef9e0f3e37506479459c05ab4b5a2d3", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ef9e0f3e37506479459c05ab4b5a2d3") : new d(((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).b());
    }

    public b(com.sankuai.waimai.business.restaurant.poicontainer.pga.b bVar) {
        super(bVar);
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15444b6eb8a7a2c787b7f88fe1fbdc16", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15444b6eb8a7a2c787b7f88fe1fbdc16");
            return;
        }
        this.v = ABTestManager.getInstance(com.meituan.android.singleton.b.a).getStrategy("time_limit_interfaces_group", null);
        this.B = false;
        this.C = -1;
        this.D = true;
        this.F = false;
        this.H = new com.sankuai.waimai.foundation.core.service.screenshot.observer.b() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.foundation.core.service.screenshot.observer.b, com.sankuai.waimai.foundation.core.service.screenshot.observer.a
            public final void a(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "35246eabc482a78f4c8f33b25901b6fa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "35246eabc482a78f4c8f33b25901b6fa");
                    return;
                }
                com.sankuai.waimai.business.restaurant.base.log.c.a();
                if (TextUtils.equals(str, b.this.y.getClass().getName()) && b.this.C == b.this.x.c()) {
                    JudasManualManager.a a2 = JudasManualManager.a("b_fq46u68k").a("c_CijEL");
                    a2.b = AppUtil.generatePageInfoKey(b.this.l());
                    a2.a("poi_id", ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) b.this.n).p.f()).a();
                }
            }
        };
        this.I = false;
        this.J = new BroadcastReceiver() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.RestaurantRootBlock$2
            public static ChangeQuickRedirect a;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                Object[] objArr2 = {context, intent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "49c085d4b51ee3504ec0c609c5660f02", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "49c085d4b51ee3504ec0c609c5660f02");
                    return;
                }
                com.sankuai.waimai.business.restaurant.poicontainer.machpro.a.a("MachPro_TAG_RestaurantRootBlock_onReceive");
                b.this.b(false);
            }
        };
        this.N = true;
        this.O = true;
        this.R = new j() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.b.25
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.restaurant.framework.j, com.sankuai.waimai.foundation.core.service.poi.b
            public final void a(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3b843452ee06ce1b9675fbda58bc0772", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3b843452ee06ce1b9675fbda58bc0772");
                } else if (str == null || !str.equals(((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) b.this.n).p.f())) {
                } else {
                    com.sankuai.waimai.business.restaurant.poicontainer.machpro.a.a("MachPro_TAG_RestaurantRootBlock_poiId:" + str);
                    b.this.b(false);
                }
            }
        };
        com.sankuai.waimai.business.restaurant.poicontainer.machpro.a.a("MachPro_TAG_RestaurantRootBlock_create");
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6233b43171f29d390977813fc2c88387", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6233b43171f29d390977813fc2c88387");
        } else {
            super.t();
        }
    }

    /* JADX WARN: Type inference failed for: r3v25, types: [android.support.v4.app.FragmentActivity, android.arch.lifecycle.f] */
    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Uri.Builder builder;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0729fc95a11fea0c526a06ade0cb9923", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0729fc95a11fea0c526a06ade0cb9923");
            return;
        }
        super.s();
        com.sankuai.waimai.business.restaurant.poicontainer.machpro.a.a("MachPro_TAG_RestaurantRootBlock_configBlock");
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).n();
        this.y = (WMRestaurantActivity) l();
        this.w = this.y.w();
        this.x = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).p.a(this.y);
        this.G = com.sankuai.waimai.restaurant.shopcart.config.a.a(1, 22);
        Intent intent = this.y.getIntent();
        Object[] objArr2 = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = r;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aaaa37cc44d621fe781e4a62b49180c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aaaa37cc44d621fe781e4a62b49180c0");
        } else if (intent != null) {
            Uri data = intent.getData();
            if (data != null) {
                String queryParameter = data.getQueryParameter(FoodDetailNetWorkPreLoader.URI_POI_STR);
                if (TextUtils.isEmpty(queryParameter)) {
                    queryParameter = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).q.mPoiIdStr;
                }
                if (TextUtils.isEmpty(queryParameter)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).q.mPoiId);
                    queryParameter = sb.toString();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).p.s());
                String sb3 = sb2.toString();
                builder = data.buildUpon();
                builder.appendQueryParameter("poi_id", queryParameter).appendQueryParameter(KernelConfig.KEY_CONTAINER_TYPE, sb3);
            } else {
                builder = new Uri.Builder();
                String str = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).q.mPoiIdStr;
                if (!TextUtils.isEmpty(str)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).q.mPoiId);
                    str = sb4.toString();
                }
                Uri.Builder appendQueryParameter = builder.appendQueryParameter("poi_id", str);
                StringBuilder sb5 = new StringBuilder();
                sb5.append(((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).p.s());
                appendQueryParameter.appendQueryParameter(KernelConfig.KEY_CONTAINER_TYPE, sb5.toString());
            }
            StringBuilder sb6 = new StringBuilder();
            sb6.append(((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).q.mBusinessType);
            builder.appendQueryParameter("business_type", sb6.toString());
            String str2 = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).q.miniStoreFrom;
            if (!TextUtils.isEmpty(str2) && str2.equals("mini_program_stores")) {
                builder.appendQueryParameter("mini_go_app", "mini_program_stores");
            }
            com.sankuai.waimai.platform.domain.core.channel.a aVar = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).q.mChannelLabelMessage;
            if (aVar != null) {
                builder.appendQueryParameter("ys", aVar.b).appendQueryParameter("ys_id", aVar.c).appendQueryParameter("activity_id", aVar.d).appendQueryParameter("restaurant_id", aVar.g);
            }
            intent.setData(builder.build());
        }
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).p.a(this.y);
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).u.b = new com.meituan.android.cube.pga.action.d<com.sankuai.waimai.business.restaurant.base.manager.order.g>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.b.22
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ com.sankuai.waimai.business.restaurant.base.manager.order.g a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "eb76b787ad530d2e7a7c73f38b96c8ef", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.business.restaurant.base.manager.order.g) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "eb76b787ad530d2e7a7c73f38b96c8ef") : ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) b.this.n).p;
            }
        };
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).G.c.b = new com.meituan.android.cube.pga.action.d<View>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.b.27
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ View a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3898a4ca46963b2687d8b3a4b7462567", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3898a4ca46963b2687d8b3a4b7462567") : b.this.u();
            }
        };
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).D.b = new com.meituan.android.cube.pga.action.d<RestaurantSchemeParams>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.b.28
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ RestaurantSchemeParams a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c4787dc757312f70793c70659e7369d1", RobustBitConfig.DEFAULT_VALUE) ? (RestaurantSchemeParams) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c4787dc757312f70793c70659e7369d1") : ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) b.this.n).q;
            }
        };
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).I.l.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.b.29
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9c1ef425d1c05d59b4d31c9360c1c017", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9c1ef425d1c05d59b4d31c9360c1c017") : Integer.valueOf(((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) b.this.n).u);
            }
        };
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).I.m.a(new com.meituan.android.cube.pga.action.b<Integer>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.b.30
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Integer num) {
                Integer num2 = num;
                Object[] objArr3 = {num2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7c6499e4e1478bdaf1a45f5a909b0ad5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7c6499e4e1478bdaf1a45f5a909b0ad5");
                } else {
                    ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) b.this.n).u = num2.intValue();
                }
            }
        });
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).I.a.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.b.31
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr3 = {bool2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "989d8afe4481c79723ae9a541ac4a222", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "989d8afe4481c79723ae9a541ac4a222");
                    return;
                }
                com.sankuai.waimai.business.restaurant.poicontainer.machpro.a.a("MachPro_TAG_RestaurantRootBlock_reloadPoiFoodData");
                b.this.b(bool2.booleanValue());
            }
        });
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).I.f.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.b.32
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr3 = {bool2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1c3135e018ce89c10701121e474f3f6e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1c3135e018ce89c10701121e474f3f6e");
                } else {
                    ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) b.this.n).t = bool2.booleanValue();
                }
            }
        });
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).I.e.b = new com.meituan.android.cube.pga.action.d<Boolean>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.b.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ Boolean a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ed81d4ea04d0f81b9a80ad1ded54acc1", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ed81d4ea04d0f81b9a80ad1ded54acc1") : Boolean.valueOf(((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) b.this.n).t);
            }
        };
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).I.h.b = new com.meituan.android.cube.pga.action.d<Long>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.b.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ Long a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2fbd9a3c786ee18d0ebba6c87aa30ae0", RobustBitConfig.DEFAULT_VALUE) ? (Long) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2fbd9a3c786ee18d0ebba6c87aa30ae0") : Long.valueOf(((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) b.this.n).q.mChosenSpuId);
            }
        };
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).I.d.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.b.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr3 = {bool2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4b63045a596b8049857c6f6f9648297d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4b63045a596b8049857c6f6f9648297d");
                } else {
                    ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) b.this.n).s = bool2.booleanValue();
                }
            }
        });
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).I.i.b = new com.meituan.android.cube.pga.action.d<Boolean>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.b.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ Boolean a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9697fede443225d8289dbc9e43943925", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9697fede443225d8289dbc9e43943925") : Boolean.valueOf(b.this.F);
            }
        };
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).K.v.a(new com.meituan.android.cube.pga.action.b<Integer>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.b.6
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Integer num) {
                Integer num2 = num;
                Object[] objArr3 = {num2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3934392da9a4a662b55f0faf16f4b0ee", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3934392da9a4a662b55f0faf16f4b0ee");
                } else {
                    b.this.C = num2.intValue();
                }
            }
        });
        final OnBackPressedDispatcher a = ((com.sankuai.waimai.business.restaurant.framework.backpress.b) l()).a();
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).I.j.b = new com.meituan.android.cube.pga.action.d<OnBackPressedDispatcher>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.b.7
            @Override // com.meituan.android.cube.pga.action.d
            public final /* bridge */ /* synthetic */ OnBackPressedDispatcher a() {
                return a;
            }
        };
        a.a(l(), new com.sankuai.waimai.business.restaurant.framework.backpress.a() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.b.8
            public static ChangeQuickRedirect b;

            @Override // com.sankuai.waimai.business.restaurant.framework.backpress.a
            public final boolean b() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = b;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "84003e88bcc223573c97fe76af21067b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "84003e88bcc223573c97fe76af21067b")).booleanValue() : b.o(b.this);
            }
        });
        this.L = new com.sankuai.waimai.business.restaurant.poicontainer.pga.logic.b((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F());
        this.L.a((com.meituan.android.cube.pga.action.c) new com.meituan.android.cube.pga.action.c<com.sankuai.waimai.business.restaurant.base.config.a, com.sankuai.waimai.business.restaurant.poicontainer.pga.logic.a>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.b.9
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.c
            public final /* synthetic */ com.sankuai.waimai.business.restaurant.poicontainer.pga.logic.a a(com.sankuai.waimai.business.restaurant.base.config.a aVar2) {
                Object[] objArr3 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "90954743df519ddfedc04ed8bdb4634c", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.business.restaurant.poicontainer.pga.logic.a) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "90954743df519ddfedc04ed8bdb4634c") : b.this.M;
            }
        });
        b((com.meituan.android.cube.pga.block.b) this.L);
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).E.a.b = new com.meituan.android.cube.pga.action.d<View>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.b.10
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ View a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "37ef260d1bd4836cacf25eee960fe91c", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "37ef260d1bd4836cacf25eee960fe91c") : b.this.i().findViewById(R.id.layout_shop_action_bar_container);
            }
        };
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).F.a.b = new com.meituan.android.cube.pga.action.d<com.sankuai.waimai.restaurant.shopcart.config.a>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.b.11
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ com.sankuai.waimai.restaurant.shopcart.config.a a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c2960face8e0ba7b3322b6a09934cfd6", RobustBitConfig.DEFAULT_VALUE)) {
                    return (com.sankuai.waimai.restaurant.shopcart.config.a) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c2960face8e0ba7b3322b6a09934cfd6");
                }
                b.this.G.e = true;
                return b.this.G;
            }
        };
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).I.g.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.b.12
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr3 = {bool2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cfacdce0d810ec41b2a9d7e36338e946", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cfacdce0d810ec41b2a9d7e36338e946");
                } else {
                    b.this.N = bool2.booleanValue();
                }
            }
        });
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).I.k.a(new com.meituan.android.cube.pga.action.b<Void>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.b.13
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Void r11) {
                Object[] objArr3 = {r11};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e8a5aabb47530ce6aee9b8bb15f2af16", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e8a5aabb47530ce6aee9b8bb15f2af16");
                } else {
                    b.r(b.this);
                }
            }
        });
        k.a().a(((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).q.mPoiIdStr, ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).p);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = r;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5f211d5bc9411c1f85a0f38746bf95e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5f211d5bc9411c1f85a0f38746bf95e3");
        } else {
            com.sankuai.waimai.business.restaurant.poicontainer.share.a aVar2 = new com.sankuai.waimai.business.restaurant.poicontainer.share.a((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F());
            aVar2.a((com.meituan.android.cube.pga.action.c) new com.meituan.android.cube.pga.action.c<com.sankuai.waimai.business.restaurant.base.config.a, com.sankuai.waimai.business.restaurant.poicontainer.share.d>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.b.16
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.c
                public final /* synthetic */ com.sankuai.waimai.business.restaurant.poicontainer.share.d a(com.sankuai.waimai.business.restaurant.base.config.a aVar3) {
                    Object[] objArr4 = {aVar3};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ad44bc103f61aaa15a4451d7656a18e6", RobustBitConfig.DEFAULT_VALUE)) {
                        return (com.sankuai.waimai.business.restaurant.poicontainer.share.d) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ad44bc103f61aaa15a4451d7656a18e6");
                    }
                    com.sankuai.waimai.business.restaurant.poicontainer.share.d dVar = new com.sankuai.waimai.business.restaurant.poicontainer.share.d();
                    dVar.a = b.this.M.h.shareTip;
                    return dVar;
                }
            });
            b((com.meituan.android.cube.pga.block.b) aVar2);
        }
        this.y.d.b();
        this.y.d.a();
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = r;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "002a89b238b71b9cd5ea6f6502212f13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "002a89b238b71b9cd5ea6f6502212f13");
        } else {
            if (this.P != null) {
                b((com.meituan.android.cube.pga.block.a) this.P);
                com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.b bVar = this.P;
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.b.t;
                if (PatchProxy.isSupport(objArr5, bVar, changeQuickRedirect5, false, "b93c7544fff944759c77c7e913700551", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, bVar, changeQuickRedirect5, false, "b93c7544fff944759c77c7e913700551");
                } else if (bVar.u != null) {
                    bVar.u.a();
                }
            }
            this.P = new com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.b((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F());
            a(this.P, R.id.layout_coupon_float_layout);
        }
        a((h) null);
        e(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b87e8f3ef139011b635fc0323cc5411", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b87e8f3ef139011b635fc0323cc5411");
        } else if (this.u != null) {
        } else {
            if (com.sankuai.waimai.restaurant.shopcart.utils.e.a() && this.Q == null) {
                this.Q = new l((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F());
                a(this.Q, R.id.layout_coupon_float_layout);
            }
            JsonObject jsonObject = hVar != null ? hVar.a.a : null;
            try {
                this.u = new com.sankuai.waimai.business.restaurant.poicontainer.pga.baseblock.a((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F(), jsonObject);
                this.u.a((com.meituan.android.cube.pga.action.c) new com.meituan.android.cube.pga.action.c<com.sankuai.waimai.business.restaurant.base.config.d, com.sankuai.waimai.business.restaurant.base.config.a>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.b.14
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.cube.pga.action.c
                    public final /* synthetic */ com.sankuai.waimai.business.restaurant.base.config.a a(com.sankuai.waimai.business.restaurant.base.config.d dVar) {
                        com.sankuai.waimai.business.restaurant.base.config.d dVar2 = dVar;
                        Object[] objArr2 = {dVar2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "59ec28ab5c7883a583c3d8943746cb6e", RobustBitConfig.DEFAULT_VALUE)) {
                            return (com.sankuai.waimai.business.restaurant.base.config.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "59ec28ab5c7883a583c3d8943746cb6e");
                        }
                        com.sankuai.waimai.business.restaurant.base.config.a aVar = new com.sankuai.waimai.business.restaurant.base.config.a();
                        aVar.c = dVar2.d;
                        aVar.b = dVar2.b;
                        aVar.a = dVar2.a;
                        return aVar;
                    }
                });
                a(this.u, R.id.wm_restaurant_shop_container);
                if (com.sankuai.waimai.restaurant.shopcart.utils.e.a()) {
                    return;
                }
                a(jsonObject);
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
            }
        }
    }

    private void a(JsonObject jsonObject) {
        Object[] objArr = {jsonObject};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb0ef96b1a683ac4bc7e228a28715dc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb0ef96b1a683ac4bc7e228a28715dc7");
            return;
        }
        if (this.z == null) {
            this.z = new com.sankuai.waimai.business.restaurant.poicontainer.machpro.poitip.a((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F());
            this.z.a((com.meituan.android.cube.pga.action.c) new com.meituan.android.cube.pga.action.c<com.sankuai.waimai.business.restaurant.base.config.d, JsonObject>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.b.15
                @Override // com.meituan.android.cube.pga.action.c
                public final /* bridge */ /* synthetic */ JsonObject a(com.sankuai.waimai.business.restaurant.base.config.d dVar) {
                    return dVar.a;
                }
            });
            b((com.meituan.android.cube.pga.block.b) this.z);
        }
        if (jsonObject != null) {
            this.z.c(jsonObject);
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final void a(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3221cabb729afdfa13bb3b2a88f8a785", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3221cabb729afdfa13bb3b2a88f8a785");
            return;
        }
        super.a(bundle);
        com.sankuai.waimai.business.restaurant.poicontainer.machpro.a.a("MachPro_TAG_RestaurantRootBlock_onCreate");
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = r;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6d66a7b18ecf91eb055a11ab042f79a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6d66a7b18ecf91eb055a11ab042f79a5");
        } else {
            LocalBroadcastManager.getInstance(l()).registerReceiver(this.J, new IntentFilter("wm_coupon_package_buy_success"));
            com.sankuai.waimai.platform.domain.manager.poi.a.a().a(this.R);
            com.sankuai.waimai.platform.domain.manager.user.a.i().a(this);
            com.sankuai.waimai.foundation.core.service.screenshot.a.a().a(this.H);
            com.sankuai.waimai.foundation.location.v2.g.a().a(this, "Restaurant-LocateService");
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.restaurant.poicontainer.machpro.a.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "1df4e138f45b02393e16a69854254da4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "1df4e138f45b02393e16a69854254da4");
            return;
        }
        com.sankuai.waimai.machpro.f.a().b("wm-nested-container", MPNestedContainerComponent.class);
        com.sankuai.waimai.machpro.f.a().b("wm-nested-scrollview", MPNestedScrollViewComponent.class);
        com.sankuai.waimai.machpro.f.a().b("wm-decorated-video", MPRestaurantHeaderVideoComponent.class);
        com.sankuai.waimai.machpro.f.a().b("wm-restaurant-shop-cart", MPRestaurantShopCartComponent.class);
        com.sankuai.waimai.machpro.f.a().b("wm-restaurant-smart-entrance", MPRestaurantSmartEntranceComponent.class);
        com.sankuai.waimai.machpro.f.a().b("wm-restaurant-reviews", com.sankuai.waimai.business.restaurant.poicontainer.machpro.comments.a.class);
        com.sankuai.waimai.machpro.f.a().b("wm-restaurant-poi-detail", com.sankuai.waimai.business.restaurant.poicontainer.machpro.poidetail.a.class);
        com.sankuai.waimai.machpro.f.a().b("wm-restaurant-fold-coupon", com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.machpro.b.class);
        com.sankuai.waimai.machpro.f.a().b("wm-restaurant-expand-coupon", WMRestaurantExpandCouponComponent.class);
        com.sankuai.waimai.machpro.f.a().b("wm-restaurant-vip-card", com.sankuai.waimai.business.restaurant.poicontainer.machpro.vipcard.a.class);
        IRestaurantInit iRestaurantInit = (IRestaurantInit) com.sankuai.waimai.router.a.a(IRestaurantInit.class, "restaurant_init");
        if (iRestaurantInit != null) {
            iRestaurantInit.initRestaurant();
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final void aX_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51e25df284b65f21d2010b721a3dce49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51e25df284b65f21d2010b721a3dce49");
            return;
        }
        super.aX_();
        com.sankuai.waimai.business.restaurant.poicontainer.machpro.a.a("MachPro_TAG_RestaurantRootBlock_onResume");
        if (this.G != null) {
            this.G.e = true;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("PoiAddressChanged", "mIsPoiAddressChanged is " + this.E, new Object[0]);
        if (this.E) {
            d(false);
        }
        this.E = false;
        if (this.B) {
            c(true);
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final void bc_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01d783f07fddf1a986ef9f9bb3237e4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01d783f07fddf1a986ef9f9bb3237e4c");
            return;
        }
        super.bc_();
        com.sankuai.waimai.business.restaurant.poicontainer.machpro.a.a("onPause");
        if (this.G != null) {
            this.G.e = false;
        }
        c(false);
    }

    @Override // com.meituan.android.cube.core.f
    public final void aR_() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28d97192e6e715993e93d630377e7344", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28d97192e6e715993e93d630377e7344");
            return;
        }
        super.aR_();
        com.sankuai.waimai.business.restaurant.poicontainer.machpro.a.a("MachPro_TAG_RestaurantRootBlock_onStart");
        this.D = true;
        if (!com.sankuai.waimai.platform.domain.manager.user.a.i().a()) {
            com.sankuai.waimai.foundation.core.service.user.a.a = a.EnumC0947a.NONE;
        }
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).p.i = R();
        com.sankuai.waimai.business.restaurant.composeorder.a.b = R();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = r;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "65ab04f21fc15571de155bd1b9c44bf7", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "65ab04f21fc15571de155bd1b9c44bf7")).booleanValue();
        } else if (this.y instanceof WMRestaurantActivity) {
            z = this.y.aC_();
        }
        com.sankuai.waimai.business.restaurant.composeorder.a.c = z;
    }

    @Override // com.meituan.android.cube.core.f
    public final void bD_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69ba2bf5a8f9dbe3880a54fac237dad6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69ba2bf5a8f9dbe3880a54fac237dad6");
            return;
        }
        super.bD_();
        com.sankuai.waimai.business.restaurant.poicontainer.machpro.a.a("onStop");
        this.D = false;
        d dVar = (d) this.g;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d.d;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "2dd3477eec6f1280640f00122214a3a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "2dd3477eec6f1280640f00122214a3a8");
        } else if (dVar.g != null) {
            dVar.g.a();
        }
        if (k.a().g(((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).p.f())) {
            ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).p.h = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).p.f();
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.framework.g, com.meituan.android.cube.core.f
    public final void bE_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7403ab3265013f223a76578dcc8ba6c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7403ab3265013f223a76578dcc8ba6c1");
            return;
        }
        super.bE_();
        com.sankuai.waimai.business.restaurant.poicontainer.machpro.a.a("MachPro_TAG_RestaurantRootBlock_onDestroy");
        com.sankuai.waimai.business.restaurant.base.repository.b.c(this.w);
        com.sankuai.waimai.business.restaurant.base.shopcart.calculator.h a = com.sankuai.waimai.business.restaurant.base.shopcart.calculator.h.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.restaurant.base.shopcart.calculator.h.a;
        if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect2, false, "444ecf9d77b385367bbea03ef2a8a32d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect2, false, "444ecf9d77b385367bbea03ef2a8a32d");
        } else {
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a("NetPriceCalculator");
            a.e = false;
        }
        com.sankuai.waimai.platform.domain.manager.poi.a.a().b(this.R);
        com.sankuai.waimai.platform.domain.manager.user.a.i().b(this);
        com.sankuai.waimai.foundation.core.service.screenshot.a.a().b(this.H);
        com.sankuai.waimai.foundation.location.v2.g.a().b(this, "Restaurant-LocateService");
        d dVar = (d) this.g;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = d.d;
        if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "3facb8d553a8d8e9e2bcd1ac1e8ef52c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "3facb8d553a8d8e9e2bcd1ac1e8ef52c");
        } else {
            dVar.e.e();
            com.sankuai.waimai.platform.widget.emptylayout.d dVar2 = dVar.e;
            d.a aVar = dVar.f;
            Object[] objArr4 = {aVar};
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.platform.widget.emptylayout.d.c;
            if (PatchProxy.isSupport(objArr4, dVar2, changeQuickRedirect4, false, "d82d7958b386d76543f371f27583725d", RobustBitConfig.DEFAULT_VALUE)) {
                ((Boolean) PatchProxy.accessDispatch(objArr4, dVar2, changeQuickRedirect4, false, "d82d7958b386d76543f371f27583725d")).booleanValue();
            } else {
                dVar2.t.remove(aVar);
            }
        }
        k.a().n(((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).p.f()).b();
        LocalBroadcastManager.getInstance(this.y).unregisterReceiver(this.J);
    }

    @Override // com.meituan.android.cube.core.eventhandler.protocol.b
    public final void a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53196307b97f7d07089ca655b40c95d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53196307b97f7d07089ca655b40c95d5");
            return;
        }
        com.sankuai.waimai.business.restaurant.poicontainer.machpro.a.a("MachPro_TAG_RestaurantRootBlock_onNewIntent");
        com.sankuai.waimai.foundation.utils.log.a.b("Restaurant", "RestaurantDelegateImpl#onNewIntent", new Object[0]);
        this.y.setIntent(intent);
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).I.c.a((com.meituan.android.cube.pga.common.b<Void>) null);
        b(intent);
        com.sankuai.waimai.business.restaurant.base.manager.order.g h = k.a().h(com.sankuai.waimai.platform.utils.f.a(intent, FoodDetailNetWorkPreLoader.URI_POI_STR));
        if (h != null && h.y != null && h.y.contains("jsdShippingFeeFree")) {
            h.y = null;
        }
        if (O() == null || O().y == null || !O().y.contains("jsdShippingFeeFree")) {
            return;
        }
        O().y = null;
    }

    private void b(Intent intent) {
        boolean z = true;
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b84e7dcb5cd526ff7f2f1886e46d0999", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b84e7dcb5cd526ff7f2f1886e46d0999");
            return;
        }
        com.sankuai.waimai.business.restaurant.poicontainer.machpro.a.a("MachPro_TAG_RestaurantRootBlock_handleNewIntent");
        intent.putExtra("is_NotificationWindow_show", false);
        String str = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).q.mPoiIdStr;
        long j = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).q.mPoiId;
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).n();
        if ((TextUtils.isEmpty(str) || !str.equals(((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).q.mPoiIdStr)) && (j <= 0 || j == ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).q.mPoiId)) {
            z = false;
        }
        b(z);
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.d) this.g).a(((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).q.mChannelLabelMessage);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.meituan.android.cube.core.eventhandler.protocol.a
    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ae5af09ec6f41f29ed62c662a520bf3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ae5af09ec6f41f29ed62c662a520bf3");
            return;
        }
        com.sankuai.waimai.business.restaurant.poicontainer.machpro.a.a("MachPro_TAG_RestaurantRootBlock_onActivityResult");
        com.sankuai.waimai.foundation.utils.log.a.b("Restaurant", "RestaurantDelegateImpl#onActivityResult", new Object[0]);
        if (intent != null) {
            this.y.setIntent(intent);
        }
        if (i == 22) {
            if (i2 == -1) {
                ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).F.h.a((com.meituan.android.cube.pga.common.b<Object>) null);
            }
        } else if (i == 103) {
            Q();
        } else if (i != 1201) {
            switch (i) {
                case 100:
                    if (i2 == -1 && intent != null && com.sankuai.waimai.platform.utils.f.a(intent, "need_finish", false) && !this.y.isFinishing() && !this.y.isDestroyed()) {
                        this.y.finish();
                        return;
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
            if (com.sankuai.waimai.foundation.router.a.a(intent, "showBulletin", "showBulletin", false) && this.B) {
                ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).H.c.a((com.meituan.android.cube.pga.common.b<Boolean>) Boolean.TRUE);
            } else {
                b(intent);
            }
        } else {
            com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.helper.a.a(this.y, ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).p, i2);
        }
    }

    public final void M() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16b72620c23d23d30663ccee450b3d74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16b72620c23d23d30663ccee450b3d74");
            return;
        }
        com.sankuai.waimai.business.restaurant.base.log.a d = com.sankuai.waimai.business.restaurant.base.log.a.d();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.restaurant.base.log.a.a;
        if (PatchProxy.isSupport(objArr2, d, changeQuickRedirect2, false, "c5d0164a6080a007dfd5e03185c402eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, d, changeQuickRedirect2, false, "c5d0164a6080a007dfd5e03185c402eb");
        } else if (d.b > 0) {
            if (d.d > 0 && d.c > 0) {
                com.sankuai.waimai.platform.capacity.log.c.a().a(a.c.a(d.b()), "restaurant/calculate/food/cancel/delay", SystemClock.elapsedRealtime());
            }
            com.sankuai.waimai.platform.capacity.log.c.a().a(a.C0818a.a(d.f), "restaurant/calculate/food/cancel/calculateFail", SystemClock.elapsedRealtime());
            com.sankuai.waimai.platform.capacity.log.c.a().a(a.b.a(d.e), "restaurant/calculate/food/cancel/calculateLast", SystemClock.elapsedRealtime());
            d.c();
        }
        if (this.n != 0) {
            String f = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).p.f();
            if (com.sankuai.waimai.business.restaurant.composeorder.a.b) {
                com.sankuai.waimai.business.restaurant.composeorder.a.a().a(((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).K.n.a().b, f);
                k.a().f(f);
                k.a().p(f);
            }
            if (((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).q.mIsNeedCartSync) {
                GlobalCartManager.getInstance().exit();
                ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).q.mIsNeedCartSync = false;
            }
        }
    }

    private void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c150b02b688aec60c818e1bb63a7fc05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c150b02b688aec60c818e1bb63a7fc05");
            return;
        }
        Intent intent = this.y.getIntent();
        JudasManualManager.MPTBuilder a = JudasManualManager.a("c_CijEL", !z ? 1 : 0, l());
        Uri data = l().getIntent().getData();
        if (!com.sankuai.waimai.foundation.core.a.d()) {
            l().getIntent().setData(((WMRestaurantActivity) l()).a(data));
        }
        Map<String, Object> a2 = com.sankuai.waimai.business.restaurant.poicontainer.utils.c.a(l());
        l().getIntent().setData(data);
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : a2.entrySet()) {
            if (entry != null && !"custom".equals(entry.getKey())) {
                a.b(entry.getKey(), entry.getValue().toString());
            }
        }
        hashMap.putAll((Map) a2.get("custom"));
        String b = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(l(), "unpl", "");
        if (!TextUtils.isEmpty(b)) {
            a.a("unpl", b);
        }
        long j = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) G()).q.mChosenSpuId;
        if (j > 0) {
            a.a("spuid", j);
        }
        hashMap.put("dp_source", com.sankuai.waimai.platform.utils.f.b(intent, "dp_source", "dp_source"));
        a.a(hashMap);
        if (this.M != null && this.M.p != null) {
            a.a(this.M.p);
        }
        a.b();
    }

    private void d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf676a2fd8789e6d3615e7aa6aef770e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf676a2fd8789e6d3615e7aa6aef770e");
            return;
        }
        com.sankuai.waimai.business.restaurant.poicontainer.machpro.a.a("MachPro_TAG_RestaurantRootBlock_loadData:" + z);
        e(z);
    }

    private void e(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13e15b6f1eaefe167a918d66f17d1d20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13e15b6f1eaefe167a918d66f17d1d20");
        } else if (this.K) {
        } else {
            this.K = true;
            com.sankuai.waimai.business.im.api.msgcenter.a.a().refreshMsgCenterUnReadCount();
            com.sankuai.waimai.platform.preload.e.a().a(l(), new com.sankuai.waimai.platform.preload.c<h>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.b.17
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.preload.c
                public final void a(com.sankuai.waimai.platform.preload.f<h> fVar) {
                    Object[] objArr2 = {fVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "496aa7ee3185a46d6a51796069db074d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "496aa7ee3185a46d6a51796069db074d");
                    } else if (f.a(b.this.l())) {
                    } else {
                        switch (AnonymousClass26.a[fVar.b.ordinal()]) {
                            case 1:
                                b.b(b.this, false);
                                h hVar = fVar.c;
                                if (hVar.d != null) {
                                    com.sankuai.waimai.platform.modular.network.error.a aVar = null;
                                    DovePageMonitor.a(b.this.l(), (int) IjkMediaPlayer.FFP_PROP_INT64_SELECTED_VIDEO_STREAM);
                                    if (hVar.d instanceof com.sankuai.waimai.platform.modular.network.error.a) {
                                        if (((com.sankuai.waimai.platform.modular.network.error.a) hVar.d).d() instanceof TimeoutException) {
                                            com.sankuai.waimai.business.restaurant.poicontainer.machpro.a.a("MachPro_TAG_RestaurantRootBlock_getPreloadResult SUCCESS handleTimeoutResponse");
                                            b.s(b.this);
                                        } else {
                                            com.sankuai.waimai.business.restaurant.poicontainer.machpro.a.a("MachPro_TAG_RestaurantRootBlock_getPreloadResult SUCCESS error 1");
                                            aVar = (com.sankuai.waimai.platform.modular.network.error.a) hVar.d;
                                            b.a(b.this, aVar);
                                        }
                                    } else {
                                        com.sankuai.waimai.business.restaurant.poicontainer.machpro.a.a("MachPro_TAG_RestaurantRootBlock_getPreloadResult SUCCESS error 2");
                                        aVar = new com.sankuai.waimai.platform.modular.network.error.a(hVar.d);
                                        b.a(b.this, aVar);
                                    }
                                    if (aVar != null) {
                                        if (((com.sankuai.waimai.platform.domain.manager.user.a.i().a() || aVar.b() != 410) && aVar.b() != 411) || f.a(b.this.y)) {
                                            return;
                                        }
                                        b.this.y.finish();
                                        return;
                                    }
                                    return;
                                }
                                com.sankuai.waimai.business.restaurant.poicontainer.machpro.a.a("MachPro_TAG_RestaurantRootBlock_getPreloadResult SUCCESS normal");
                                e eVar = b.this.y.d;
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = e.a;
                                if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "bef691908f5769304f5b247e3912d503", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "bef691908f5769304f5b247e3912d503");
                                } else {
                                    eVar.a("request_api_data_success");
                                }
                                if (hVar.c != null) {
                                    ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) b.this.n).a(hVar.c);
                                    ListIDHelper.a.a.a("restaurant", "restaurant_page_blcok", ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) b.this.n).g());
                                }
                                if (b.this.u == null) {
                                    b.this.a(hVar);
                                } else {
                                    b.this.u.a(hVar.a.a);
                                }
                                b.b(b.this, hVar);
                                return;
                            case 2:
                                com.sankuai.waimai.business.restaurant.poicontainer.machpro.a.a("MachPro_TAG_RestaurantRootBlock_getPreloadResult LOADING");
                                return;
                            case 3:
                                com.sankuai.waimai.business.restaurant.poicontainer.machpro.a.a("MachPro_TAG_RestaurantRootBlock_getPreloadResult UNKNOWN");
                                b.this.a(true);
                                return;
                            default:
                                return;
                        }
                    }
                }
            });
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.restaurant.poicontainer.b$26  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass26 {
        public static final /* synthetic */ int[] a = new int[f.a.valuesCustom().length];

        static {
            try {
                a[f.a.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[f.a.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[f.a.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void a(com.sankuai.waimai.landing.state.b bVar, int i) {
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64a2243b169773e3608108d032f0cd36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64a2243b169773e3608108d032f0cd36");
        } else if (bVar == null || this.n == 0 || ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).q == null) {
        } else {
            String str = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).q.adSlotId;
            String str2 = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).q.adChannelId;
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            com.sankuai.waimai.landing.a aVar = new com.sankuai.waimai.landing.a();
            aVar.b = str;
            aVar.c = str2;
            aVar.e = a.EnumC0984a.Native;
            if (bVar == com.sankuai.waimai.landing.state.b.PAGE_DATA_SUCCESS || bVar == com.sankuai.waimai.landing.state.b.PAGE_DATA_FAILED) {
                aVar.d = "/poi/food";
            }
            if (bVar == com.sankuai.waimai.landing.state.b.PAGE_DATA_FAILED) {
                aVar.f = i;
            }
            com.sankuai.waimai.landing.b.a().a(bVar, aVar);
        }
    }

    public static boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9753b393c8790238fd9a312d593949d3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9753b393c8790238fd9a312d593949d3")).booleanValue() : t.get(str) == null || t.get(str).booleanValue();
    }

    public final void a(boolean z) {
        String str;
        Set<Long> set;
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdf06930536b0faf5040ba8749b7b082", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdf06930536b0faf5040ba8749b7b082");
            return;
        }
        long j = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).q.mPoiId;
        String str2 = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).q.mPoiIdStr;
        com.sankuai.waimai.business.restaurant.base.log.c.a("Load poi/food start, poiId=%d %s", Long.valueOf(j), str2);
        Intent intent = this.y.getIntent();
        Uri data = intent.getData();
        if (data != null) {
            af.b(data, "linkIdentifierInfo", null);
        }
        String a = TextUtils.isEmpty("") ? com.sankuai.waimai.platform.utils.f.a(intent, "linkIdentifierInfo") : "";
        com.sankuai.waimai.business.restaurant.base.repository.a a2 = com.sankuai.waimai.business.restaurant.base.repository.b.a(this.w);
        String str3 = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).q.mGroupChatShare;
        long j2 = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).q.postSpuId;
        i iVar = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).q.mSearchParams;
        String str4 = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).q.mRecommendProduct;
        int i = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).q.extraSourcePageType;
        String b = com.sankuai.waimai.business.restaurant.poicontainer.dynamic.framework.g.c().b();
        String str5 = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).q.mAllowanceAllianceScenes;
        String str6 = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).q.content_info;
        String str7 = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).q.mAdActivityFlag;
        String str8 = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).p.m ? "1" : "0";
        String str9 = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).q.requestMark;
        if (intent != null) {
            str = str9;
            set = RestaurantSchemeParams.getPreRequestItemIdSet(intent.getExtras(), intent.getData());
        } else {
            str = str9;
            set = null;
        }
        a2.a(str3, j, str2, j2, iVar, str4, i, b, str5, str6, str7, "0", str8, str, set, ((WMRestaurantActivity) l()).i(), ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).q.showHealthFood, ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).q.healthFoodQueryWord, ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).q.resourceId, ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).q.clickId, ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).q.previewItemStr, a, new com.sankuai.waimai.business.restaurant.base.repository.net.c<h>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.b.18
            public static ChangeQuickRedirect b;

            @Override // com.sankuai.waimai.business.restaurant.base.repository.net.c, com.sankuai.waimai.business.restaurant.base.repository.net.b
            public final /* synthetic */ void a(Object obj) {
                h hVar = (h) obj;
                Object[] objArr2 = {hVar};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1cdad690a56ec29e542048f3ab21c99f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1cdad690a56ec29e542048f3ab21c99f");
                    return;
                }
                com.sankuai.waimai.business.restaurant.poicontainer.machpro.a.a("MachPro_TAG_RestaurantRootBlock_loadRestMenu onSuccess");
                if (b.this.u == null) {
                    b.this.a(hVar);
                } else {
                    b.this.u.a(hVar.a.a);
                }
                b.b(b.this, hVar);
            }

            @Override // com.sankuai.waimai.business.restaurant.base.repository.net.c, com.sankuai.waimai.business.restaurant.base.repository.net.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "15fe4676c45ecfacddee5960ed84ce0d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "15fe4676c45ecfacddee5960ed84ce0d");
                } else {
                    com.sankuai.waimai.business.restaurant.poicontainer.machpro.a.a("MachPro_TAG_RestaurantRootBlock_loadRestMenu onStart");
                }
            }

            @Override // com.sankuai.waimai.business.restaurant.base.repository.net.c, com.sankuai.waimai.business.restaurant.base.repository.net.b
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5287ce16ef58e9c3f03a62e93d732a83", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5287ce16ef58e9c3f03a62e93d732a83");
                    return;
                }
                com.sankuai.waimai.business.restaurant.poicontainer.machpro.a.a("MachPro_TAG_RestaurantRootBlock_loadRestMenu onTerminate");
                super.b();
                b.b(b.this, false);
            }

            @Override // com.sankuai.waimai.business.restaurant.base.repository.net.c, com.sankuai.waimai.business.restaurant.base.repository.net.b
            public final void a(com.sankuai.waimai.platform.modular.network.error.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6bbcd98bf7e16838bdca22ad3e366b43", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6bbcd98bf7e16838bdca22ad3e366b43");
                    return;
                }
                StringBuilder sb = new StringBuilder("MachPro_TAG_RestaurantRootBlock_loadRestMenu onFailure:");
                sb.append(aVar != null ? aVar.b() : 0);
                com.sankuai.waimai.business.restaurant.poicontainer.machpro.a.a(sb.toString());
                DovePageMonitor.a(b.this.l(), (int) IjkMediaPlayer.FFP_PROP_INT64_SELECTED_VIDEO_STREAM);
                if (b.this.u != null) {
                    int b2 = aVar != null ? aVar.b() : 1;
                    String message = aVar != null ? aVar.getMessage() : "";
                    com.sankuai.waimai.business.restaurant.poicontainer.pga.baseblock.a aVar2 = b.this.u;
                    Object[] objArr3 = {Integer.valueOf(b2), message};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.restaurant.poicontainer.pga.baseblock.a.r;
                    if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "cbcacec654946a996d2fef9f57e941c6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "cbcacec654946a996d2fef9f57e941c6");
                    } else if (aVar2.t != null) {
                        aVar2.t.a(b2, message);
                    }
                }
            }
        });
    }

    private void Q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "080903cac0b2035c5b4de757231abd20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "080903cac0b2035c5b4de757231abd20");
        } else {
            k.a().c(((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).p.f(), new com.sankuai.waimai.business.restaurant.base.shopcart.e() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.b.19
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c2bd3ba9269352a104a6ddad9be62367", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c2bd3ba9269352a104a6ddad9be62367");
                    }
                }

                @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "86f1903366538880afeaeb983035f1a3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "86f1903366538880afeaeb983035f1a3");
                        return;
                    }
                    ((com.sankuai.waimai.business.restaurant.poicontainer.pga.d) b.this.g).f();
                    b.this.S();
                    String f = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) b.this.n).p.f();
                    k.a().p(f);
                    k.a().b(f);
                }

                @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                public final void a(com.sankuai.waimai.platform.domain.manager.exceptions.a aVar) {
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d8233e88918f50ccdb288a7695e273bc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d8233e88918f50ccdb288a7695e273bc");
                        return;
                    }
                    com.sankuai.waimai.foundation.utils.log.a.e("Calculator", "onFailure" + aVar.toString(), new Object[0]);
                    ((com.sankuai.waimai.business.restaurant.poicontainer.pga.d) b.this.g).f();
                    b.this.N = false;
                    b.this.S();
                    String f = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) b.this.n).p.f();
                    k.a().p(f);
                    k.a().b(f);
                }
            });
        }
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "885317a3267222f8d689df21bfdb3ca4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "885317a3267222f8d689df21bfdb3ca4");
            return;
        }
        com.sankuai.waimai.business.restaurant.poicontainer.machpro.a.a("MachPro_TAG_RestaurantRootBlock_reloadData" + z);
        this.O = false;
        this.I = true;
        this.N = true;
        com.sankuai.waimai.foundation.utils.log.a.b("Restaurant", "RestaurantDelegateImpl#reloadData", new Object[0]);
        d(z);
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).I.b.a((com.meituan.android.cube.pga.common.b<Void>) null);
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04709ecf0bc8bef85c6fb8e8faca974f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04709ecf0bc8bef85c6fb8e8faca974f");
            return;
        }
        super.I();
        com.sankuai.waimai.ai.uat.b.a().a(((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).p.g);
        com.sankuai.waimai.business.restaurant.poicontainer.pga.d dVar = (com.sankuai.waimai.business.restaurant.poicontainer.pga.d) this.g;
        String str = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).q.errorMsg;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.restaurant.poicontainer.pga.d.d;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "56a4567647d42f2fc12caf28bd3dcf91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "56a4567647d42f2fc12caf28bd3dcf91");
        } else if (!TextUtils.isEmpty(str)) {
            new RooAlertDialog.a(new ContextThemeWrapper(dVar.e(), 2131558962)).a(com.meituan.android.singleton.b.a.getString(R.string.takeout_dialog_title_tips)).b(str).a(com.meituan.android.singleton.b.a.getString(R.string.wm_restaurant_i_know), (DialogInterface.OnClickListener) null).b();
        }
        if (((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).q.showPoiBulletin) {
            com.sankuai.waimai.platform.utils.l.b(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.b.20
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "69627f9d5a2a586ad5531820736fd987", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "69627f9d5a2a586ad5531820736fd987");
                    } else {
                        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) b.this.F()).H.c.a((com.meituan.android.cube.pga.common.b<Boolean>) Boolean.TRUE);
                    }
                }
            }, this.w);
        }
        MetricsSpeedMeterTask s = this.y.s();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = r;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "eddc18a6214e201e53d981162e15baf9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "eddc18a6214e201e53d981162e15baf9");
        } else if (((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).r && !TextUtils.isEmpty(((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).q.unFoodListArray)) {
            try {
                ArrayList<com.sankuai.waimai.platform.domain.core.goods.d> a = Order.c.a(new JSONArray(((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).q.unFoodListArray));
                if (!com.sankuai.waimai.foundation.utils.b.b(a)) {
                    final com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.soldout.a aVar = new com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.soldout.a(this.y, new a.InterfaceC0855a() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.b.24
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.soldout.a.InterfaceC0855a
                        public final void a() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "92c0762bfbea53076528d717f0fe2001", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "92c0762bfbea53076528d717f0fe2001");
                                return;
                            }
                            ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) b.this.n).r = false;
                            b.this.S();
                        }
                    });
                    String generatePageInfoKey = AppUtil.generatePageInfoKey(this.y);
                    String f = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).p.f();
                    Object[] objArr4 = {generatePageInfoKey, f, a};
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.soldout.a.a;
                    if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "1779e48b1d902caca07855aad6e4db63", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "1779e48b1d902caca07855aad6e4db63");
                    } else {
                        ShopCartAbnormalDialog shopCartAbnormalDialog = new ShopCartAbnormalDialog(aVar.c);
                        shopCartAbnormalDialog.d = a;
                        shopCartAbnormalDialog.c = "以下商品无法购买，已为您删除";
                        aVar.b = shopCartAbnormalDialog.a("继续加购", new BaseDialogWithCloseIcon.a() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.soldout.a.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.platform.restaurant.dialog.BaseDialogWithCloseIcon.a
                            public final void a(View view) {
                                Object[] objArr5 = {view};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "0037bc5d2ba60171fbe1ce99e814d5bc", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "0037bc5d2ba60171fbe1ce99e814d5bc");
                                } else if (aVar.b == null || !aVar.b.isShowing()) {
                                } else {
                                    aVar.b.dismiss();
                                }
                            }
                        });
                        aVar.b.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.soldout.a.2
                            public static ChangeQuickRedirect a;

                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                Object[] objArr5 = {dialogInterface};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "897e9ec71583e624710ab9d401488b68", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "897e9ec71583e624710ab9d401488b68");
                                } else if (aVar.b == null || !aVar.b.isShowing()) {
                                } else {
                                    aVar.d.a();
                                    aVar.b = null;
                                }
                            }
                        });
                        aVar.b.show();
                        com.sankuai.waimai.business.restaurant.poicontainer.helper.l.a(generatePageInfoKey, f);
                    }
                }
                ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).r = false;
            } catch (JSONException e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
            }
        }
        if (com.sankuai.waimai.foundation.core.service.user.a.a == a.EnumC0947a.FROM_COLLECT) {
            ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).E.h.a((com.meituan.android.cube.pga.common.b) null);
        }
        if (this.L != null && this.L.G() != null && this.L.G().e() != null) {
            if (this.L.G().e().b) {
                s.recordStep("custom_activity_dynamic_data_ready");
            } else {
                s.recordStep("custom_activity_native_data_ready");
            }
        }
        com.sankuai.meituan.takeoutnew.util.aop.h.a(s.recordStep("activity_data_ready"));
        e eVar = this.y.d;
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = e.a;
        if (PatchProxy.isSupport(objArr5, eVar, changeQuickRedirect5, false, "fd7c9897c82c283e2b4580b566736a02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, eVar, changeQuickRedirect5, false, "fd7c9897c82c283e2b4580b566736a02");
        } else {
            eVar.a("native_total");
        }
        this.y.d.d();
        if (this.v != null) {
            com.sankuai.waimai.platform.capacity.log.c.a().a(3000, "waimai_page_" + this.v.expName + "_WMRestaurantActivity", SystemClock.elapsedRealtime());
        }
        if (this.I) {
            this.I = false;
        }
        a(com.sankuai.waimai.landing.state.b.PAGE_SHOWN, 0);
    }

    private boolean R() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c88a264be5200e241176c85b69f9c92", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c88a264be5200e241176c85b69f9c92")).booleanValue();
        }
        if (this.y instanceof WMRestaurantActivity) {
            return this.y.i();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1aaeb10e67f4398dd08a458280bf36e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1aaeb10e67f4398dd08a458280bf36e6");
            return;
        }
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).F.f.a((com.meituan.android.cube.pga.common.b<Object>) null);
        com.sankuai.waimai.business.restaurant.poicontainer.pga.c cVar = (com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n;
        if (cVar.r ? false : cVar.s) {
            ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).s = false;
            ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).F.e.a((com.meituan.android.cube.pga.common.b<Object>) null);
        }
        if (this.N) {
            com.sankuai.waimai.business.restaurant.base.log.c.a(this.O ? 1000 : 1001);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.user.b
    public final void onChanged(b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee42d0ec787729737adbfe3347861d47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee42d0ec787729737adbfe3347861d47");
            return;
        }
        if (aVar != b.a.LOGIN || !com.sankuai.waimai.platform.domain.manager.user.a.i().a()) {
            ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).E.e.a((com.meituan.android.cube.pga.common.b<Boolean>) Boolean.FALSE);
        } else {
            a.EnumC0947a enumC0947a = com.sankuai.waimai.foundation.core.service.user.a.a;
            if (enumC0947a == a.EnumC0947a.FROM_COLLECT || enumC0947a == a.EnumC0947a.FROM_PRODUCT_LIST_PREORDER) {
                com.sankuai.waimai.business.restaurant.poicontainer.machpro.a.a("MachPro_TAG_RestaurantRootBlock_onChanged:" + enumC0947a);
                b(false);
            }
            if (this.D) {
                ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).F.i.a((com.meituan.android.cube.pga.common.b<Object>) null);
            }
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a((Context) this.y, "poi_coupon_need_login", false);
        }
        k.a().n(((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).p.f()).b();
    }

    @Override // com.sankuai.waimai.foundation.core.service.user.b
    public final void onAccountInfoUpdate(b.EnumC0948b enumC0948b) {
        Object[] objArr = {enumC0948b};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "509a7899e6a73f9bb8fbc52f9d05297b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "509a7899e6a73f9bb8fbc52f9d05297b");
            return;
        }
        if (enumC0948b == b.EnumC0948b.PHONE && com.sankuai.waimai.foundation.core.service.user.a.a == a.EnumC0947a.FROM_PRODUCT_LIST_PREORDER) {
            ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).F.h.a((com.meituan.android.cube.pga.common.b<Object>) null);
        }
        k.a().n(((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).p.f()).b();
    }

    @Override // com.sankuai.waimai.foundation.location.v2.listener.c
    public final void onPoiChange(@Nullable WmAddress wmAddress, boolean z) {
        Object[] objArr = {wmAddress, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5611c39035e4eb7a38a0873d3e053876", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5611c39035e4eb7a38a0873d3e053876");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("PoiAddressChanged", "onPoiChange", new Object[0]);
        this.F = true;
        if (this.D) {
            d(false);
        } else {
            this.E = true;
        }
    }

    public final boolean N() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d527b49d624d09e6f640b497c8387137", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d527b49d624d09e6f640b497c8387137")).booleanValue() : !TextUtils.isEmpty(((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).q.miniStoreFrom) && ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).q.miniStoreFrom.equals("mini_program_stores");
    }

    public final com.sankuai.waimai.business.restaurant.base.manager.order.g O() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63917f867aa336b98f3ef0e8b1de8f8f", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.business.restaurant.base.manager.order.g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63917f867aa336b98f3ef0e8b1de8f8f") : ((com.sankuai.waimai.business.restaurant.poicontainer.pga.c) this.n).p;
    }

    public static boolean P() {
        return A;
    }
}
