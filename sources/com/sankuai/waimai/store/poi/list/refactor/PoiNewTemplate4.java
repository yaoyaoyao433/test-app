package com.sankuai.waimai.store.poi.list.refactor;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.arch.lifecycle.q;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.android.bus.annotation.ThreadMode;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.cube.core.h;
import com.meituan.metrics.common.Constants;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.monitor.a;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.sankuai.waimai.router.core.e;
import com.sankuai.waimai.store.assembler.component.AssemblerView;
import com.sankuai.waimai.store.assembler.component.PageEventHandler;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.config.SCConfigPath;
import com.sankuai.waimai.store.config.j;
import com.sankuai.waimai.store.event.f;
import com.sankuai.waimai.store.i.user.a;
import com.sankuai.waimai.store.k;
import com.sankuai.waimai.store.newwidgets.NetInfoLoadView;
import com.sankuai.waimai.store.newwidgets.list.o;
import com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper;
import com.sankuai.waimai.store.newwidgets.twolevel.SGTwoLevelPullToRefreshView;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.poi.list.newp.PoiVerticalityHomeActivity;
import com.sankuai.waimai.store.poi.list.newp.contract.d;
import com.sankuai.waimai.store.poi.list.refactor.bean.PoiLocationAddress;
import com.sankuai.waimai.store.poi.list.refactor.bean.PoiRequestError;
import com.sankuai.waimai.store.poi.list.refactor.bean.PoiResult;
import com.sankuai.waimai.store.poi.list.refactor.event.g;
import com.sankuai.waimai.store.poi.list.util.NewGusetBuyMachBridge;
import com.sankuai.waimai.store.poi.list.util.f;
import com.sankuai.waimai.store.repository.model.BaseTile;
import com.sankuai.waimai.store.repository.model.BaseTileNew;
import com.sankuai.waimai.store.repository.model.PoiChannelBackgroundConfig;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.repository.model.PrimaryFilterCondList;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.util.SGLocationUtils;
import com.sankuai.waimai.store.util.ab;
import com.sankuai.waimai.store.util.ae;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.util.am;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.util.monitor.b;
import com.sankuai.waimai.store.util.monitor.monitor.SGBlankPageMetric;
import com.sankuai.waimai.store.util.monitor.monitor.SGBounceRate;
import com.sankuai.waimai.store.util.monitor.monitor.SGChannelPageLoad;
import com.sankuai.waimai.store.util.monitor.monitor.SGListExposeLossRate;
import com.sankuai.waimai.store.util.monitor.monitor.SGModuleBeforeRenderLossRate;
import com.sankuai.waimai.store.util.monitor.monitor.SGSecondOpeningLossRate;
import com.sankuai.waimai.store.util.monitor.monitor.SGTwoLevelGuideIMonitor;
import com.sankuai.waimai.store.util.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PoiNewTemplate4 extends k implements com.sankuai.waimai.store.i.locate.b, com.sankuai.waimai.store.i.user.a, d.a, PoiPageLifecycleObserver {
    public static ChangeQuickRedirect i;
    private int A;
    private boolean B;
    private String C;
    private boolean D;
    private SGRefreshHeaderHelper E;
    private com.sankuai.waimai.store.widgets.twolevel.a F;
    private com.sankuai.waimai.store.widgets.twolevel.b G;
    private boolean H;
    private com.sankuai.waimai.store.widgets.twolevel.c I;
    private boolean J;
    private com.sankuai.waimai.store.widgets.topfloatview.b K;
    private double L;
    private double M;
    protected NetInfoLoadView j;
    protected PoiPageViewModel k;
    protected PageEventHandler l;
    protected com.sankuai.waimai.store.param.a m;
    protected final com.sankuai.waimai.store.poi.list.newp.contract.c n;
    protected boolean o;
    protected WMLocation p;
    protected WMLocation q;
    protected String r;
    public com.sankuai.waimai.store.manager.sequence.c s;
    public PoiVerticalityDataResponse.SecondFloor t;
    private SGTwoLevelPullToRefreshView u;
    private AssemblerView v;
    private com.sankuai.waimai.store.manager.marketing.a w;
    private SGMRNNotifyChannelReceiver x;
    private b y;
    private PoiPageLifecycleManager z;

    public void s() {
    }

    public void u() {
    }

    public void z() {
    }

    public static /* synthetic */ void a(PoiNewTemplate4 poiNewTemplate4, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, poiNewTemplate4, changeQuickRedirect, false, "50d5a681e4b2bcc4b49631ad8d225989", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, poiNewTemplate4, changeQuickRedirect, false, "50d5a681e4b2bcc4b49631ad8d225989");
        } else if (o.i()) {
            try {
                com.sankuai.waimai.store.util.monitor.b.a().a(SGTwoLevelGuideIMonitor.SGTwoLevelMonitor).a(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, str).a(false).a();
            } catch (Throwable unused) {
            }
        }
    }

    public static /* synthetic */ boolean a(PoiNewTemplate4 poiNewTemplate4, boolean z) {
        poiNewTemplate4.H = true;
        return true;
    }

    public static /* synthetic */ void i(PoiNewTemplate4 poiNewTemplate4) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, poiNewTemplate4, changeQuickRedirect, false, "f3335c0214a583cf777188c8f8e41fd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, poiNewTemplate4, changeQuickRedirect, false, "f3335c0214a583cf777188c8f8e41fd0");
            return;
        }
        poiNewTemplate4.J = true;
        if (poiNewTemplate4.s != null) {
            poiNewTemplate4.s.h = false;
        }
        if (poiNewTemplate4.I != null) {
            poiNewTemplate4.a(poiNewTemplate4.I);
        }
    }

    public PoiNewTemplate4(@NonNull Fragment fragment, @NonNull com.sankuai.waimai.store.param.a aVar) {
        super(fragment);
        Object[] objArr = {fragment, aVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "170acffd454805795102dbc5181fbdd7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "170acffd454805795102dbc5181fbdd7");
            return;
        }
        this.o = true;
        this.A = -1;
        this.B = true;
        this.D = true;
        this.H = false;
        this.J = false;
        this.L = 0.0d;
        this.M = 0.0d;
        this.m = aVar;
        this.n = new com.sankuai.waimai.store.poi.list.newp.presenter.b(this, aVar);
    }

    @Override // com.meituan.android.cube.core.f
    /* renamed from: r */
    public final SCBaseActivity l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9edd34fb33831a41f13d4a99c7352c7a", RobustBitConfig.DEFAULT_VALUE) ? (SCBaseActivity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9edd34fb33831a41f13d4a99c7352c7a") : (SCBaseActivity) super.l();
    }

    @Override // com.meituan.android.cube.core.f
    public final View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "205d29b31bec905ee0b5a7eb2c9743f6", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "205d29b31bec905ee0b5a7eb2c9743f6");
        }
        try {
            return z.a(l(), R.layout.wm_sc_poi_vertical_template_new, viewGroup, false);
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0286  */
    @Override // com.meituan.android.cube.core.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a_(@android.support.annotation.NonNull android.view.View r19) {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.poi.list.refactor.PoiNewTemplate4.a_(android.view.View):void");
    }

    private void a(final com.sankuai.waimai.store.widgets.twolevel.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20dba0cd3a2e195e184d823941fd27b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20dba0cd3a2e195e184d823941fd27b4");
        } else {
            al.a(new Runnable() { // from class: com.sankuai.waimai.store.poi.list.refactor.PoiNewTemplate4.19
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "11743c91c0205f995037a192148bf068", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "11743c91c0205f995037a192148bf068");
                    } else if (PoiNewTemplate4.this.F == null || PoiNewTemplate4.this.v == null || PoiNewTemplate4.this.v.getScrollRootView() == null || ((h) PoiNewTemplate4.this).g == null || ((h) PoiNewTemplate4.this).g.getActivity() == null || com.sankuai.waimai.store.util.b.a(((h) PoiNewTemplate4.this).g.getActivity()) || ((h) PoiNewTemplate4.this).g.isDetached() || !((h) PoiNewTemplate4.this).g.isAdded()) {
                    } else {
                        if (PoiNewTemplate4.this.M()) {
                            if (PoiNewTemplate4.this.v.getScrollRootView().canScrollVertically(-1)) {
                                PoiNewTemplate4.a(PoiNewTemplate4.this, "ScrollNoTop");
                                return;
                            } else if (cVar != null && cVar.a != null && cVar.b != null) {
                                PoiNewTemplate4.this.F.a(new SGRefreshHeaderHelper.c() { // from class: com.sankuai.waimai.store.poi.list.refactor.PoiNewTemplate4.19.1
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.c
                                    public final void a() {
                                        Object[] objArr3 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect3 = a;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2a6add5ddf01a19bfe618f2dd8fbe9dc", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2a6add5ddf01a19bfe618f2dd8fbe9dc");
                                        } else if (PoiNewTemplate4.this.G == null || PoiNewTemplate4.this.t == null || PoiNewTemplate4.this.m() == null) {
                                        } else {
                                            PoiVerticalityDataResponse.SecondFloor secondFloor = PoiNewTemplate4.this.t;
                                            Context m = PoiNewTemplate4.this.m();
                                            Object[] objArr4 = {secondFloor, m};
                                            ChangeQuickRedirect changeQuickRedirect4 = f.a;
                                            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "6f16ba0e1045f2cf978bba83997a4c4a", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "6f16ba0e1045f2cf978bba83997a4c4a");
                                            } else if (m != null) {
                                                ab b = ab.b();
                                                int b2 = b.b(m, secondFloor.keyForActivity + secondFloor.keyForDay, 0);
                                                ab b3 = ab.b();
                                                Context a2 = com.sankuai.waimai.store.util.b.a();
                                                b3.a(a2, secondFloor.keyForActivity + secondFloor.keyForDay, b2 + 1);
                                                ab.b().a(com.sankuai.waimai.store.util.b.a(), secondFloor.keyForActivity, ab.b().b(m, secondFloor.keyForActivity, 0) + 1);
                                            }
                                            com.sankuai.waimai.store.widgets.twolevel.b bVar = PoiNewTemplate4.this.G;
                                            PoiVerticalityDataResponse.SecondFloor secondFloor2 = PoiNewTemplate4.this.t;
                                            Object[] objArr5 = {secondFloor2};
                                            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.store.widgets.twolevel.b.a;
                                            if (PatchProxy.isSupport(objArr5, bVar, changeQuickRedirect5, false, "1ef03232b5e3730dd44788f833fb0bf1", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr5, bVar, changeQuickRedirect5, false, "1ef03232b5e3730dd44788f833fb0bf1");
                                            } else {
                                                bVar.a("b_waimai_j745m8wy_mv", bVar.c, bVar.b, bVar.a(secondFloor2));
                                            }
                                        }
                                    }
                                });
                                return;
                            } else {
                                PoiNewTemplate4.a(PoiNewTemplate4.this, "SourceError");
                                return;
                            }
                        }
                        PoiNewTemplate4.a(PoiNewTemplate4.this, "ConfigError");
                    }
                }
            }, 1500, b());
        }
    }

    private boolean I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d9a5bf08c3292495dfbfa478b3e6ac2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d9a5bf08c3292495dfbfa478b3e6ac2")).booleanValue();
        }
        if (this.E == null || this.F == null || this.u == null || !this.u.j) {
            return false;
        }
        try {
            if (this.E.r == 5) {
                if (this.E != null) {
                    this.E.b();
                }
                if (this.F != null) {
                    com.sankuai.waimai.store.widgets.twolevel.a aVar = this.F;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.widgets.twolevel.a.a;
                    if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "573211cd3eed49da3b44bab9258020c3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "573211cd3eed49da3b44bab9258020c3");
                    } else if (aVar.o != null) {
                        aVar.o.cancel();
                        aVar.o = null;
                    }
                }
                if (((h) this).g != null && ((h) this).g.getActivity() != null && !com.sankuai.waimai.store.util.b.a(((h) this).g.getActivity())) {
                    FragmentActivity activity = ((h) this).g.getActivity();
                    if (activity instanceof PoiVerticalityHomeActivity) {
                        ((PoiVerticalityHomeActivity) activity).a(true);
                    }
                    return true;
                }
                return false;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b508fae4a0d9caadf8f6be9a09c9177", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b508fae4a0d9caadf8f6be9a09c9177");
        } else {
            l().s().recordStep("page_api_start");
        }
    }

    public final void v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b09e2004dc0e10248e9f40882e53cafb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b09e2004dc0e10248e9f40882e53cafb");
        } else if (this.m.y) {
            if (j.h().a(SCConfigPath.PAGE_HOME_MARKETING_REQUEST, true)) {
                b(1);
            }
        } else if (j.h().a(SCConfigPath.PAGE_CHANNEL_MARKETING_REQUEST, true)) {
            b(2);
        }
    }

    public void w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10db7630bba67f5a2f14530a887163d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10db7630bba67f5a2f14530a887163d7");
        } else {
            D();
        }
    }

    private void b(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "811de9702d1528651156c3a632fc78fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "811de9702d1528651156c3a632fc78fe");
            return;
        }
        if (this.w == null) {
            this.w = new com.sankuai.waimai.store.manager.marketing.a(l(), i(), i2);
            this.w.g = new com.sankuai.waimai.store.manager.marketing.parser.inner.mach.c() { // from class: com.sankuai.waimai.store.poi.list.refactor.PoiNewTemplate4.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.manager.marketing.parser.inner.mach.c
                public final void a(com.sankuai.waimai.store.mach.event.a aVar, String str, @NonNull Map<String, Object> map) {
                    Object[] objArr2 = {aVar, str, map};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5a2085cd20d7e41e3bb382eb39fad8fa", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5a2085cd20d7e41e3bb382eb39fad8fa");
                    } else if ("checkRefreshNewUserRegion".equals(str)) {
                        Object obj = map.get("needRefreshNewUserRegion");
                        if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
                            PoiNewTemplate4.this.l.a((PageEventHandler) new g());
                        }
                    } else if ("subscribe_batch_food_add_shoppingcart_button_clicked".equals(str)) {
                        com.sankuai.waimai.store.goods.subscribe.a.a(PoiNewTemplate4.this.l(), aVar, map);
                    } else if ("scroll_to_feed".equals(str)) {
                        PoiNewTemplate4.this.l.a((PageEventHandler) new com.sankuai.waimai.store.poi.list.newp.block.rxevent.j(false));
                    } else if (!"user_coupon_refrsh".equals(str)) {
                        if (!"submit_order_direct".equals(str) || p.a(map)) {
                            return;
                        }
                        NewGusetBuyMachBridge.a(new JSONObject(map), PoiNewTemplate4.this.l());
                    } else if (p.a(map)) {
                    } else {
                        JSONObject jSONObject = new JSONObject(map);
                        if (p.a(jSONObject)) {
                            return;
                        }
                        com.sankuai.waimai.store.manager.coupon.c.a().a((Poi.PoiCouponItem) i.a(jSONObject.toString(), Poi.PoiCouponItem.class));
                    }
                }
            };
        }
        a(i2, false);
    }

    private void a(int i2, boolean z) {
        Object[] objArr = {Integer.valueOf(i2), (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c19d28df1e561567449e099133e6147", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c19d28df1e561567449e099133e6147");
        } else if (this.w != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("page_type", String.valueOf(i2));
            hashMap.put("category_type", String.valueOf(this.m.c));
            hashMap.put("second_category_type", String.valueOf(this.m.f));
            this.w.a(hashMap, b());
            this.w.i = new com.sankuai.waimai.store.manager.marketing.action.c() { // from class: com.sankuai.waimai.store.poi.list.refactor.PoiNewTemplate4.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.manager.marketing.action.c
                public final void a(com.sankuai.waimai.store.manager.sequence.c cVar) {
                    Object[] objArr2 = {cVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "78db19167cc311605402bd80e67510ab", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "78db19167cc311605402bd80e67510ab");
                        return;
                    }
                    PoiNewTemplate4.this.s = cVar;
                    PoiNewTemplate4.this.M();
                }

                @Override // com.sankuai.waimai.store.manager.marketing.action.c
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "49cf974d27be0889be11d05eca901a08", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "49cf974d27be0889be11d05eca901a08");
                    } else {
                        PoiNewTemplate4.i(PoiNewTemplate4.this);
                    }
                }

                @Override // com.sankuai.waimai.store.manager.marketing.action.c
                public final void b(com.sankuai.waimai.store.manager.sequence.c cVar) {
                    Object[] objArr2 = {cVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5038d9f39eddb7966b6aa09c4bb381bc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5038d9f39eddb7966b6aa09c4bb381bc");
                    } else if (cVar == null || !cVar.i) {
                    } else {
                        PoiNewTemplate4.i(PoiNewTemplate4.this);
                    }
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean J() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2eaf1002cbc0ec141c327abb18f6f5b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2eaf1002cbc0ec141c327abb18f6f5b")).booleanValue() : (this.w == null || this.w.g()) ? false : true;
    }

    public final boolean x() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e3700333e5dc11d11b40fc477c89872", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e3700333e5dc11d11b40fc477c89872")).booleanValue() : J() || K() || I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean K() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4769d69c3b1387edf888971d5a5fbdfc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4769d69c3b1387edf888971d5a5fbdfc")).booleanValue();
        }
        if (TextUtils.isEmpty(this.C) || a(com.sankuai.waimai.store.util.b.b(), this.C) || l() == null) {
            return false;
        }
        com.sankuai.waimai.store.router.d.a().a(l(), this.C);
        l().overridePendingTransition(R.anim.wm_common_slide_in_from_left, R.anim.wm_sc_slide_out_to_right);
        l().finish();
        return true;
    }

    private static boolean a(List<Activity> list, @NonNull String str) {
        Object[] objArr = {list, str};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9cfc24227a94f8e5c4fb3517ea403a6a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9cfc24227a94f8e5c4fb3517ea403a6a")).booleanValue();
        }
        String path = Uri.parse(str).getPath();
        int c = com.sankuai.shangou.stone.util.a.c(list);
        for (int i2 = 0; i2 < c; i2++) {
            if (TextUtils.equals(a((Activity) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i2)), path)) {
                return true;
            }
        }
        return false;
    }

    private static String a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d273ae942fb1c503f24ec6fc1b8f7797", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d273ae942fb1c503f24ec6fc1b8f7797") : (activity == null || activity.getIntent() == null || activity.getIntent().getData() == null) ? "" : activity.getIntent().getData().getPath();
    }

    @Override // com.sankuai.waimai.store.k
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05b74599483882d29a4d5c66dc403db2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05b74599483882d29a4d5c66dc403db2");
            return;
        }
        super.a(z);
        if (this.w != null) {
            if (z) {
                this.w.h();
            } else {
                this.w.i();
            }
        }
    }

    public final void y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2675bce24655446f3f5ec66dbba68dc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2675bce24655446f3f5ec66dbba68dc0");
            return;
        }
        this.m.g = 0L;
        this.m.i = null;
        this.m.j = null;
        this.m.h = null;
        this.m.K = 0;
        this.n.a();
    }

    @Subscribe
    public void onBindMemberCardSuccess(com.sankuai.waimai.store.event.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df4ff8f548ca631dc9e626b7fadbfd15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df4ff8f548ca631dc9e626b7fadbfd15");
        } else {
            D();
        }
    }

    @Subscribe
    public void onPoiListCouponStatusChangedEvent(com.sankuai.waimai.store.poilist.event.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0755f43d439676201469ff3c0b7667f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0755f43d439676201469ff3c0b7667f9");
        } else if (bVar == null || this.m.y) {
        } else {
            C();
        }
    }

    @Subscribe
    public void onStoreyRefreshEvent(com.sankuai.waimai.store.poi.list.newp.event.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e58607504c8be83388b0c048bab8aac2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e58607504c8be83388b0c048bab8aac2");
        } else if (cVar != null) {
            C();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMachDialogCouponReceiveSuccess(com.sankuai.waimai.store.event.i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7aedd8bf353c3da14e3b1e62f056c23d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7aedd8bf353c3da14e3b1e62f056c23d");
        } else if (iVar == null || this.m.y) {
        } else {
            C();
            String str = null;
            if (iVar.b != null && iVar.b.get("couponStatus") != null) {
                String.valueOf(iVar.b.get("couponStatus"));
                str = String.valueOf(iVar.b.get("behavior"));
            }
            "no_update_dialog".equals(str);
        }
    }

    @Subscribe
    public void onMachKingkongCategoryChangeEventReceive(com.sankuai.waimai.store.poi.list.refactor.event.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f20b5fb0c7dff75500aa2ee4d63eb8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f20b5fb0c7dff75500aa2ee4d63eb8c");
        } else if (fVar == null || fVar.a == 0) {
        } else {
            b(true);
            if (this.K != null) {
                this.K.a(1, fVar.a);
            }
            this.m.c = fVar.a;
            this.m.f = "0";
            y();
            this.n.b(0);
        }
    }

    @Subscribe
    public void onChangeTopFloatBlockVisible(com.sankuai.waimai.store.widgets.filterbar.event.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f95bfe8cc2cb05578d2a83a4b7f034ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f95bfe8cc2cb05578d2a83a4b7f034ad");
        } else if (aVar == null || this.K == null || !this.m.bl) {
        } else {
            if (this.m.bj) {
                this.K.a(0);
            } else if (aVar.a) {
                com.sankuai.waimai.store.widgets.topfloatview.b bVar = this.K;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.widgets.topfloatview.b.a;
                if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "4c21a6b41c3bca57af64f340662c4b08", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "4c21a6b41c3bca57af64f340662c4b08");
                } else if (bVar.b == null || bVar.b.getVisibility() == 0) {
                } else {
                    ObjectAnimator.ofFloat(bVar.b, "alpha", 0.0f, 1.0f).setDuration(100L).start();
                    u.a(bVar.b);
                }
            } else {
                this.K.a(8);
            }
        }
    }

    @Subscribe
    public void onCategoryChangeEvent(com.sankuai.waimai.store.widgets.topfloatview.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e87ed927d03ee626cbafd8e15f91cdbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e87ed927d03ee626cbafd8e15f91cdbf");
        } else if (aVar == null || this.K == null || !this.m.bl) {
        } else {
            this.K.a(2, aVar.a);
        }
    }

    @Override // com.sankuai.waimai.store.i.user.a
    public final void a(a.EnumC1205a enumC1205a) {
        Object[] objArr = {enumC1205a};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26145b5e618f5420f7c0e9b975479168", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26145b5e618f5420f7c0e9b975479168");
        } else if (enumC1205a != null) {
            if ((enumC1205a == a.EnumC1205a.LOGIN || enumC1205a == a.EnumC1205a.LOGOUT) && !com.sankuai.waimai.store.util.b.a(l())) {
                D();
            }
        }
    }

    @Override // com.sankuai.waimai.store.i.user.a
    public final void a(a.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d42550a357c9708c3a82cb33f23d2b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d42550a357c9708c3a82cb33f23d2b4");
        } else {
            D();
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.contract.d.b
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f1fd03dbe696f9224d6c260030d6874", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f1fd03dbe696f9224d6c260030d6874") : o();
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.contract.d.b
    public final void a(String str, boolean z, boolean z2, com.sankuai.waimai.store.repository.net.b bVar) {
        String str2;
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), bVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5ceab4a97f868da65044821ebc80e0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5ceab4a97f868da65044821ebc80e0d");
            return;
        }
        this.j.e();
        l().s().recordStep(this.m.y ? "home_page_time_end_request_fail" : "channel_page_time_end_request_fail");
        if (!TextUtils.isEmpty(str)) {
            str2 = str;
        } else if (z2) {
            str2 = l().getString(R.string.wm_sc_common_home_net_error_info);
        } else if (!this.m.l()) {
            str2 = l().getString(R.string.wm_sc_common_poi_list_empty_tip);
        } else if (this.m.h()) {
            str2 = l().getString(R.string.wm_sc_common_poi_list_spu_empty_tip);
        } else {
            str2 = l().getString(R.string.wm_sc_common_poi_list_feed_empty_tip);
        }
        if (this.u.b()) {
            am.a((Activity) l(), str2);
        } else if (bVar != null && bVar.h) {
            this.j.a(str2, "", O(), true, true, R.drawable.wm_sc_home_filter_empty, "", "", "重新加载");
            this.j.setBackgroundColor(Color.parseColor("#F5F5F5"));
        }
        this.k.g.b((android.arch.lifecycle.k<PoiRequestError>) new PoiRequestError(str2, z, z2));
        this.u.a();
        if (N()) {
            if (com.sankuai.waimai.store.poi.list.util.b.a().b()) {
                l().s().recordStep("activity_data_ready_with_opt_locating");
            } else {
                l().s().recordStep(this.m.ai ? "activity_data_ready_with_locating" : "activity_data_ready_no_locating");
                if (this.m.ai) {
                    com.sankuai.waimai.store.manager.judas.b.b(l(), "b_waimai_1v0wqray_mv").a("duration", 0).a();
                }
            }
            com.sankuai.meituan.takeoutnew.util.aop.h.a(l().s().recordStep("activity_data_ready"));
        }
        if (this.m.y || !z) {
            return;
        }
        com.sankuai.waimai.store.util.monitor.c.a(SGChannelPageLoad.RequestAPIError, "", "");
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.contract.d.a
    public final void a(PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Object[] objArr = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9689c4ea3b978a21d9b249fca9376373", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9689c4ea3b978a21d9b249fca9376373");
            return;
        }
        if (this.m.n == 0) {
            com.sankuai.waimai.store.fsp.a.a().a(l(), "sg_perf_api_end");
            if (poiVerticalityDataResponse.apiExtra != null && !TextUtils.isEmpty(poiVerticalityDataResponse.apiExtra.stids)) {
                HashMap hashMap = new HashMap();
                hashMap.put("list_stids", poiVerticalityDataResponse.apiExtra.stids);
                com.sankuai.waimai.store.fsp.a.a().a(l(), hashMap);
            }
        }
        this.m.bk = !p.a(poiVerticalityDataResponse, poiVerticalityDataResponse.newUserCouponInfo);
        this.C = poiVerticalityDataResponse.returnPageScheme;
        if (this.k.b.a() != null && this.m != null) {
            if (!TextUtils.isEmpty(poiVerticalityDataResponse.getStids())) {
                if (!TextUtils.isEmpty(this.m.V)) {
                    com.sankuai.waimai.store.param.a aVar = this.m;
                    aVar.V = this.m.T + ";" + poiVerticalityDataResponse.getStids();
                } else {
                    this.m.V = poiVerticalityDataResponse.getStids();
                }
            }
            this.m.M = poiVerticalityDataResponse.poiType;
            PoiVerticalityDataResponse.SubNaviInfo subNaviInfo = poiVerticalityDataResponse.subNaviInfo;
            if (subNaviInfo != null) {
                this.m.O = com.sankuai.shangou.stone.util.a.a((List) subNaviInfo.categoryInfos) > 1;
                this.m.P = com.sankuai.shangou.stone.util.a.a((List) subNaviInfo.categoryInfos);
                this.m.R = subNaviInfo.subNavStyle;
            }
            if (poiVerticalityDataResponse != null && poiVerticalityDataResponse.spuQuickFilter != null) {
                this.m.bg = poiVerticalityDataResponse.spuQuickFilter.filterStyle;
                this.m.bf = poiVerticalityDataResponse.spuQuickFilter.hasValuedFilterData();
            }
            this.k.c.b((android.arch.lifecycle.k<PoiVerticalityDataResponse>) poiVerticalityDataResponse);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = i;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3f8264e906d168fbc786585df29b90e9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3f8264e906d168fbc786585df29b90e9");
            } else if (this.D && this.v != null && this.m.f()) {
                this.D = false;
                this.v.post(new Runnable() { // from class: com.sankuai.waimai.store.poi.list.refactor.PoiNewTemplate4.5
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d05835d19399dc9cc31c433f23acf79d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d05835d19399dc9cc31c433f23acf79d");
                            return;
                        }
                        AssemblerView assemblerView = PoiNewTemplate4.this.v;
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = AssemblerView.a;
                        if (PatchProxy.isSupport(objArr4, assemblerView, changeQuickRedirect4, false, "ed153fa59462bbc6ed992505f368b35b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, assemblerView, changeQuickRedirect4, false, "ed153fa59462bbc6ed992505f368b35b");
                        } else if (assemblerView.b != null) {
                            assemblerView.b.scrollTo(0, 1);
                        }
                    }
                });
            }
            if (this.m.y && this.m.ag > 0) {
                ae.a("HomeOpen", "step 7. list response.");
            }
            if (!this.m.au) {
                this.m.au = true;
                if (this.m.av != null) {
                    this.m.av.recordStep("list_data_ready");
                }
                if (this.m.aw != null) {
                    this.m.aw.recordStep("list_data_ready");
                }
                if (this.m.ax != null) {
                    this.m.ax.recordStep("list_data_ready");
                }
            }
        }
        if (this.v != null && this.m != null) {
            this.v.setIsFlowerType(this.m.f());
            this.v.setInDataParam(this.m);
        }
        boolean a = j.h().a("supermarket_channel_anchor_opt", false);
        if (this.m.aW >= 0 && a) {
            this.l.a((PageEventHandler) new com.sankuai.waimai.store.poi.list.refactor.event.h());
        }
        Object[] objArr3 = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect3 = i;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7b2025cd8f79fc378fdec0fec025ca44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7b2025cd8f79fc378fdec0fec025ca44");
        } else if (this.m.bl) {
            P();
            if (poiVerticalityDataResponse != null && poiVerticalityDataResponse.subNaviInfo != null && com.sankuai.shangou.stone.util.a.c(poiVerticalityDataResponse.subNaviInfo.categoryInfos) > 1) {
                com.sankuai.waimai.store.widgets.topfloatview.b bVar = this.K;
                PoiVerticalityDataResponse.SubNaviInfo subNaviInfo2 = poiVerticalityDataResponse.subNaviInfo;
                Object[] objArr4 = {subNaviInfo2};
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.widgets.topfloatview.b.a;
                if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "1dba069c6ec3891f7ced5a03c8fb870c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "1dba069c6ec3891f7ced5a03c8fb870c");
                } else {
                    u.a(bVar.d);
                    bVar.h = subNaviInfo2.categoryInfos;
                    if (bVar.f != null) {
                        com.sankuai.waimai.store.widgets.topfloatview.c cVar = bVar.f;
                        Object[] objArr5 = {subNaviInfo2};
                        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.store.widgets.topfloatview.c.a;
                        if (PatchProxy.isSupport(objArr5, cVar, changeQuickRedirect5, false, "78ff5c9764fd8a71c33268a2525eea77", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, cVar, changeQuickRedirect5, false, "78ff5c9764fd8a71c33268a2525eea77");
                        } else {
                            if (subNaviInfo2 != null) {
                                cVar.f = subNaviInfo2.categoryInfos;
                            } else {
                                cVar.f = new ArrayList();
                            }
                            cVar.notifyDataSetChanged();
                        }
                    }
                }
            } else {
                com.sankuai.waimai.store.widgets.topfloatview.b bVar2 = this.K;
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.store.widgets.topfloatview.b.a;
                if (PatchProxy.isSupport(objArr6, bVar2, changeQuickRedirect6, false, "a7411852a50ed433f454b96812cbbea0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, bVar2, changeQuickRedirect6, false, "a7411852a50ed433f454b96812cbbea0");
                } else {
                    u.c(bVar2.d);
                }
            }
            if (this.m.bj) {
                new Handler().postDelayed(new Runnable() { // from class: com.sankuai.waimai.store.poi.list.refactor.PoiNewTemplate4.11
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr7 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect7 = a;
                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "2fd513ddb5bfaec1b56adcf289d7eb45", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "2fd513ddb5bfaec1b56adcf289d7eb45");
                            return;
                        }
                        try {
                            PoiNewTemplate4.this.l.a((PageEventHandler) new com.sankuai.waimai.store.poi.list.newp.block.rxevent.j());
                            com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.widgets.filterbar.event.a(true, true, PoiNewTemplate4.this.m()));
                            PoiNewTemplate4.this.m.bj = false;
                            PoiNewTemplate4.this.K.b(8);
                        } catch (Exception e) {
                            com.sankuai.waimai.store.base.log.a.a(e);
                        }
                    }
                }, 25L);
            }
        }
        b(500, false);
    }

    private void b(int i2, boolean z) {
        Object[] objArr = {Integer.valueOf(i2), (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "329f0ddc0d0635b0989d3ce09682c71a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "329f0ddc0d0635b0989d3ce09682c71a");
        } else {
            new Handler().postDelayed(new Runnable() { // from class: com.sankuai.waimai.store.poi.list.refactor.PoiNewTemplate4.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5206e6bf1db26de14538863c3d262585", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5206e6bf1db26de14538863c3d262585");
                        return;
                    }
                    try {
                        PoiNewTemplate4.this.b(r2);
                    } catch (Exception e) {
                        com.sankuai.waimai.store.base.log.a.a(e);
                    }
                }
            }, i2);
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.contract.d.a
    public final void a(com.sankuai.waimai.store.widgets.twolevel.c cVar, boolean z) {
        boolean z2;
        int dimensionPixelSize;
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dda3a704cff91ca7ff4db32446494d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dda3a704cff91ca7ff4db32446494d5");
            return;
        }
        if (cVar != null) {
            try {
                if (cVar.b != null) {
                    this.k.a(cVar);
                    if (this.u != null) {
                        this.u.setHeaderPullRefreshEnable(false);
                    }
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = i;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0dbb4964ab45d1606fc894b7c7f33eff", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0dbb4964ab45d1606fc894b7c7f33eff");
                    } else {
                        if (this.F == null) {
                            this.F = new com.sankuai.waimai.store.widgets.twolevel.a(((h) this).g);
                        }
                        if (this.E == null) {
                            this.E = new SGRefreshHeaderHelper();
                        }
                        if (this.G == null) {
                            if (this.m != null) {
                                this.G = new com.sankuai.waimai.store.widgets.twolevel.b(AppUtil.generatePageInfoKey(this), this.m.G, this.m.T);
                            } else {
                                this.G = new com.sankuai.waimai.store.widgets.twolevel.b(AppUtil.generatePageInfoKey(this), "c_waimai_w6xdt3ip", "");
                            }
                        }
                        this.F.a(i(), this.k);
                        this.F.t = this.G;
                        if (this.v != null) {
                            this.E.v = this.v.getScrollRootView();
                        }
                        SGTwoLevelPullToRefreshView sGTwoLevelPullToRefreshView = this.u;
                        sGTwoLevelPullToRefreshView.h = this.E;
                        sGTwoLevelPullToRefreshView.j = true;
                        this.F.c = this.E;
                        final com.sankuai.waimai.store.widgets.twolevel.a aVar = this.F;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.widgets.twolevel.a.a;
                        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "6af53a361fc11c28f5704589d43b7054", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "6af53a361fc11c28f5704589d43b7054");
                        } else if (aVar.b != null && aVar.b.getView() != null && aVar.b.getActivity() != null && !aVar.b.getActivity().isFinishing()) {
                            FragmentActivity activity = aVar.b.getActivity();
                            Object[] objArr4 = {activity};
                            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.foundation.utils.g.a;
                            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "d08c1fa981ed520b255e6995ab1a0ea0", RobustBitConfig.DEFAULT_VALUE)) {
                                dimensionPixelSize = ((Integer) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "d08c1fa981ed520b255e6995ab1a0ea0")).intValue();
                            } else {
                                Object[] objArr5 = {activity};
                                ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.foundation.utils.g.a;
                                if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "1cb6e400cd71d50e59e2750c38c762b0", RobustBitConfig.DEFAULT_VALUE)) {
                                    z2 = ((Boolean) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "1cb6e400cd71d50e59e2750c38c762b0")).booleanValue();
                                } else {
                                    Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                                    Point point = new Point();
                                    Point point2 = new Point();
                                    defaultDisplay.getSize(point);
                                    defaultDisplay.getRealSize(point2);
                                    z2 = point2.y != point.y;
                                }
                                if (z2) {
                                    Resources resources = activity.getResources();
                                    dimensionPixelSize = resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
                                } else {
                                    dimensionPixelSize = 0;
                                }
                            }
                            aVar.h = dimensionPixelSize;
                            aVar.n.setVisibility(8);
                            aVar.n.setOnClickListener(null);
                            aVar.n.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.widgets.twolevel.a.1
                                public static ChangeQuickRedirect a;

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    Object[] objArr6 = {view};
                                    ChangeQuickRedirect changeQuickRedirect6 = a;
                                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "e78f58fde7772d68b25a3195dcc56c44", 4611686018427387906L)) {
                                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "e78f58fde7772d68b25a3195dcc56c44");
                                        return;
                                    }
                                    a.a(aVar);
                                    if (aVar.t == null || aVar.x == null) {
                                        return;
                                    }
                                    b bVar = aVar.t;
                                    PoiVerticalityDataResponse.SecondFloor secondFloor = aVar.x;
                                    Object[] objArr7 = {secondFloor};
                                    ChangeQuickRedirect changeQuickRedirect7 = b.a;
                                    if (PatchProxy.isSupport(objArr7, bVar, changeQuickRedirect7, false, "5d5a690fd651bc01cf28756c31973c3a", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr7, bVar, changeQuickRedirect7, false, "5d5a690fd651bc01cf28756c31973c3a");
                                    } else {
                                        bVar.b("b_waimai_sj5422c5_mc", bVar.c, bVar.b, bVar.a(secondFloor));
                                    }
                                }
                            });
                            aVar.a();
                            aVar.d = 1;
                            aVar.e = com.sankuai.waimai.foundation.utils.g.b(com.meituan.android.singleton.b.a);
                            aVar.i = !com.sankuai.waimai.platform.capacity.immersed.a.a((Activity) aVar.b.getActivity()) ? aVar.f : 0;
                            ViewGroup.LayoutParams layoutParams = aVar.j.getLayoutParams();
                            if (layoutParams == null) {
                                layoutParams = new ViewGroup.LayoutParams(-1, -2);
                            }
                            aVar.B = (com.sankuai.waimai.foundation.utils.g.b(com.meituan.android.singleton.b.a) - aVar.h) + aVar.i;
                            layoutParams.height = aVar.B + aVar.h;
                            layoutParams.width = aVar.g;
                            aVar.j.setLayoutParams(layoutParams);
                            aVar.a(0, 0.0f, 0);
                            Object[] objArr6 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.store.widgets.twolevel.a.a;
                            if (PatchProxy.isSupport(objArr6, aVar, changeQuickRedirect6, false, "a76453eb465acff270e0696ce3dd716b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, aVar, changeQuickRedirect6, false, "a76453eb465acff270e0696ce3dd716b");
                            } else if (aVar.c != null) {
                                aVar.c.j = (com.sankuai.waimai.foundation.utils.g.b(com.meituan.android.singleton.b.a) - aVar.h) + aVar.i;
                                aVar.c.k = aVar.f;
                                aVar.c.w = aVar.p;
                                SGRefreshHeaderHelper sGRefreshHeaderHelper = aVar.c;
                                int i2 = aVar.d;
                                Object[] objArr7 = {Integer.valueOf(i2)};
                                ChangeQuickRedirect changeQuickRedirect7 = SGRefreshHeaderHelper.a;
                                if (PatchProxy.isSupport(objArr7, sGRefreshHeaderHelper, changeQuickRedirect7, false, "84302f9708cd0fc0b14f33b871709cfc", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr7, sGRefreshHeaderHelper, changeQuickRedirect7, false, "84302f9708cd0fc0b14f33b871709cfc");
                                } else {
                                    sGRefreshHeaderHelper.i = i2;
                                    int i3 = sGRefreshHeaderHelper.k;
                                    if (SGRefreshHeaderHelper.b > i3) {
                                        sGRefreshHeaderHelper.f = SGRefreshHeaderHelper.b - i3;
                                        sGRefreshHeaderHelper.g = SGRefreshHeaderHelper.c - i3;
                                        if (i2 == 1) {
                                            sGRefreshHeaderHelper.h = SGRefreshHeaderHelper.d - i3;
                                        } else {
                                            sGRefreshHeaderHelper.h = SGRefreshHeaderHelper.c - i3;
                                        }
                                        sGRefreshHeaderHelper.l = SGRefreshHeaderHelper.e - sGRefreshHeaderHelper.k;
                                    } else {
                                        sGRefreshHeaderHelper.f = com.sankuai.shangou.stone.util.h.a(com.meituan.android.singleton.b.a, 60.0f);
                                        sGRefreshHeaderHelper.g = com.sankuai.shangou.stone.util.h.a(com.meituan.android.singleton.b.a, 140.0f);
                                        if (i2 == 1) {
                                            sGRefreshHeaderHelper.h = com.sankuai.shangou.stone.util.h.a(com.meituan.android.singleton.b.a, 620.0f);
                                        } else {
                                            sGRefreshHeaderHelper.h = sGRefreshHeaderHelper.g;
                                        }
                                    }
                                }
                                aVar.c.a(aVar.C);
                                if (aVar.q != null) {
                                    aVar.c.a(aVar.q.getOnSGTwoLevelListener());
                                }
                                aVar.c.B = aVar.D;
                                aVar.c.A = aVar.E;
                            }
                            u.a((View) aVar.k, 0);
                        }
                        this.E.a(new SGRefreshHeaderHelper.b() { // from class: com.sankuai.waimai.store.poi.list.refactor.PoiNewTemplate4.18
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.b
                            public final void a() {
                            }

                            @Override // com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.b
                            public final void b() {
                                Object[] objArr8 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect8 = a;
                                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "8aa65241e6be7dc788432dd2c03c62b9", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "8aa65241e6be7dc788432dd2c03c62b9");
                                } else {
                                    PoiNewTemplate4.this.u.setY(0.0f);
                                }
                            }

                            @Override // com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.b
                            public final void c() {
                                Object[] objArr8 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect8 = a;
                                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "54366557952d0d03838ff90de41cec39", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "54366557952d0d03838ff90de41cec39");
                                } else if (PoiNewTemplate4.this.t == null || t.a(PoiNewTemplate4.this.t.activityUrl) || ((h) PoiNewTemplate4.this).g == null || ((h) PoiNewTemplate4.this).g.getActivity() == null || com.sankuai.waimai.store.util.b.a(((h) PoiNewTemplate4.this).g.getActivity())) {
                                } else {
                                    d.a a2 = com.sankuai.waimai.store.router.d.a();
                                    e eVar = new e() { // from class: com.sankuai.waimai.store.poi.list.refactor.PoiNewTemplate4.18.1
                                        public static ChangeQuickRedirect a;

                                        @Override // com.sankuai.waimai.router.core.e
                                        public final void a(@NonNull com.sankuai.waimai.router.core.j jVar) {
                                            Object[] objArr9 = {jVar};
                                            ChangeQuickRedirect changeQuickRedirect9 = a;
                                            if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "3809432b42cb1523775a5e783dcbe7d4", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "3809432b42cb1523775a5e783dcbe7d4");
                                            } else {
                                                PoiNewTemplate4.a(PoiNewTemplate4.this, true);
                                            }
                                        }

                                        @Override // com.sankuai.waimai.router.core.e
                                        public final void a(@NonNull com.sankuai.waimai.router.core.j jVar, int i4) {
                                            Object[] objArr9 = {jVar, Integer.valueOf(i4)};
                                            ChangeQuickRedirect changeQuickRedirect9 = a;
                                            if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "30bdf4ebe838f091224a01436a0d32de", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "30bdf4ebe838f091224a01436a0d32de");
                                                return;
                                            }
                                            if (PoiNewTemplate4.this.E != null) {
                                                PoiNewTemplate4.this.E.b();
                                            }
                                            if (((h) PoiNewTemplate4.this).g == null || ((h) PoiNewTemplate4.this).g.getActivity() == null || com.sankuai.waimai.store.util.b.a(((h) PoiNewTemplate4.this).g.getActivity())) {
                                                return;
                                            }
                                            FragmentActivity activity2 = ((h) PoiNewTemplate4.this).g.getActivity();
                                            if (activity2 instanceof PoiVerticalityHomeActivity) {
                                                ((PoiVerticalityHomeActivity) activity2).a(true);
                                            }
                                        }
                                    };
                                    Object[] objArr9 = {eVar};
                                    ChangeQuickRedirect changeQuickRedirect9 = d.a.a;
                                    if (PatchProxy.isSupport(objArr9, a2, changeQuickRedirect9, false, "1872cec8546587fd395cbc1944f30372", RobustBitConfig.DEFAULT_VALUE)) {
                                        a2 = (d.a) PatchProxy.accessDispatch(objArr9, a2, changeQuickRedirect9, false, "1872cec8546587fd395cbc1944f30372");
                                    } else {
                                        a2.a().put("com.sankuai.waimai.router.core.CompleteListener", eVar);
                                    }
                                    a2.a(PoiNewTemplate4.this.m(), PoiNewTemplate4.this.t.activityUrl);
                                    if (PoiNewTemplate4.this.G != null) {
                                        com.sankuai.waimai.store.widgets.twolevel.b bVar = PoiNewTemplate4.this.G;
                                        PoiVerticalityDataResponse.SecondFloor secondFloor = PoiNewTemplate4.this.t;
                                        Object[] objArr10 = {secondFloor};
                                        ChangeQuickRedirect changeQuickRedirect10 = com.sankuai.waimai.store.widgets.twolevel.b.a;
                                        if (PatchProxy.isSupport(objArr10, bVar, changeQuickRedirect10, false, "4edcb706f06a34b3d4483deaddf7afde", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr10, bVar, changeQuickRedirect10, false, "4edcb706f06a34b3d4483deaddf7afde");
                                        } else {
                                            bVar.b("b_waimai_7cxsekya_mc", bVar.c, bVar.b, bVar.a(secondFloor));
                                        }
                                    }
                                }
                            }

                            @Override // com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.b
                            public final void a(int i4) {
                                Object[] objArr8 = {Integer.valueOf(i4)};
                                ChangeQuickRedirect changeQuickRedirect8 = a;
                                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "5fb8db37f7f0752f62b1cacd52431c5c", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "5fb8db37f7f0752f62b1cacd52431c5c");
                                } else if (i4 != 4 || ((h) PoiNewTemplate4.this).g == null || ((h) PoiNewTemplate4.this).g.getActivity() == null || com.sankuai.waimai.store.util.b.a(((h) PoiNewTemplate4.this).g.getActivity())) {
                                } else {
                                    FragmentActivity activity2 = ((h) PoiNewTemplate4.this).g.getActivity();
                                    if (activity2 instanceof PoiVerticalityHomeActivity) {
                                        ((PoiVerticalityHomeActivity) activity2).a(false);
                                    }
                                }
                            }

                            @Override // com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.b
                            public final void d() {
                                Object[] objArr8 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect8 = a;
                                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "870b0bac1c1bcecb9da0eb7c9452da45", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "870b0bac1c1bcecb9da0eb7c9452da45");
                                } else {
                                    PoiNewTemplate4.this.u.c();
                                }
                            }

                            @Override // com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.b
                            public final void a(int i4, float f, int i5, int i6, boolean z3) {
                                Object[] objArr8 = {Integer.valueOf(i4), Float.valueOf(f), Integer.valueOf(i5), Integer.valueOf(i6), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
                                ChangeQuickRedirect changeQuickRedirect8 = a;
                                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "ad8fd6f1bcdd0d280116fb4430c6dbb4", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "ad8fd6f1bcdd0d280116fb4430c6dbb4");
                                } else {
                                    PoiNewTemplate4.this.u.setY(i4);
                                }
                            }
                        });
                    }
                    this.I = cVar;
                    if (z && this.J) {
                        a(cVar);
                        return;
                    }
                    return;
                }
            } catch (Throwable unused) {
                L();
                return;
            }
        }
        L();
    }

    private void L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af2b8fd41cbd41f092c3fe6821c3aa26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af2b8fd41cbd41f092c3fe6821c3aa26");
            return;
        }
        if (this.E != null) {
            this.E.b();
        }
        if (this.u != null) {
            this.u.setAllowTwoLevel(false);
            this.u.setHeaderPullRefreshEnable(true);
        }
    }

    private boolean b(PoiVerticalityDataResponse poiVerticalityDataResponse) {
        List<PoiVerticalityDataResponse.BannerPic> list;
        int c;
        Object[] objArr = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0260ed3fc25f15dfd4e317cc5e76c81", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0260ed3fc25f15dfd4e317cc5e76c81")).booleanValue();
        }
        PoiVerticalityDataResponse.Promotion backgroundPromotion = poiVerticalityDataResponse.getBackgroundPromotion();
        if (backgroundPromotion == null || (c = com.sankuai.shangou.stone.util.a.c((list = backgroundPromotion.bannerBackgroundPicList))) == 0) {
            return true;
        }
        for (int i2 = 0; i2 < c; i2++) {
            PoiVerticalityDataResponse.BannerPic bannerPic = list.get(i2);
            if (bannerPic != null && !TextUtils.isEmpty(bannerPic.topBarColor)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.contract.d.b
    public final void a(PoiVerticalityDataResponse poiVerticalityDataResponse, com.sankuai.waimai.store.param.a aVar, boolean z) {
        boolean z2;
        PoiVerticalityDataResponse.Promotion backgroundPromotion;
        boolean equals;
        boolean z3;
        boolean z4;
        BaseModuleDesc baseModuleDesc;
        Object[] objArr = {poiVerticalityDataResponse, aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e60efc7249207006525e3d23326684b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e60efc7249207006525e3d23326684b8");
            return;
        }
        if (aVar.n == 0) {
            com.sankuai.waimai.store.fsp.a.a().a(l(), "sg_perf_api_end");
            if (poiVerticalityDataResponse.apiExtra != null && !TextUtils.isEmpty(poiVerticalityDataResponse.apiExtra.stids)) {
                HashMap hashMap = new HashMap();
                hashMap.put("wp_stids", poiVerticalityDataResponse.apiExtra.stids);
                com.sankuai.waimai.store.fsp.a.a().a(l(), hashMap);
            }
        }
        if (aVar.y) {
            l().s().recordStep("home_page_time_end_request_success");
        } else {
            l().s().recordStep("channel_page_time_end_request_success");
        }
        e(poiVerticalityDataResponse);
        f(poiVerticalityDataResponse);
        this.u.a();
        this.C = poiVerticalityDataResponse.returnPageScheme;
        aVar.T = poiVerticalityDataResponse.getStids();
        aVar.a(m(), (poiVerticalityDataResponse.getNavigationBlock() == null || poiVerticalityDataResponse.getNavigationBlock().data == null || poiVerticalityDataResponse.getNavigationBlock().data.searchExtendInfo == null) ? "" : poiVerticalityDataResponse.getNavigationBlock().data.searchExtendInfo.a);
        aVar.ah = poiVerticalityDataResponse.showOCRCamera;
        if (poiVerticalityDataResponse.getNavigationBlock() != null && (baseModuleDesc = poiVerticalityDataResponse.getNavigationBlock().data) != null && baseModuleDesc.searchCarouselTextInfo != null && com.sankuai.shangou.stone.util.a.a((Collection<?>) baseModuleDesc.searchCarouselTextInfo.searchCarouselTextList)) {
            aVar.U = 1;
        }
        if (o.f()) {
            z2 = c(poiVerticalityDataResponse);
        } else {
            Object[] objArr2 = {poiVerticalityDataResponse};
            ChangeQuickRedirect changeQuickRedirect2 = i;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f8f4b234dd8bb01c860d9ce53beca0b8", RobustBitConfig.DEFAULT_VALUE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f8f4b234dd8bb01c860d9ce53beca0b8")).booleanValue();
            } else {
                z2 = (poiVerticalityDataResponse == null || (backgroundPromotion = poiVerticalityDataResponse.getBackgroundPromotion()) == null || (t.a(backgroundPromotion.bgPicUrl) && t.a(backgroundPromotion.bgColor))) ? false : true;
            }
        }
        aVar.aa = z2;
        aVar.aX = a(poiVerticalityDataResponse, 1);
        aVar.aY = a(poiVerticalityDataResponse, 2);
        Object[] objArr3 = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect3 = i;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c0173bc62fcc9faab537951826189b2f", RobustBitConfig.DEFAULT_VALUE)) {
            equals = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c0173bc62fcc9faab537951826189b2f")).booleanValue();
        } else {
            String str = "0";
            PoiVerticalityDataResponse.Promotion backgroundPromotion2 = poiVerticalityDataResponse.getBackgroundPromotion();
            if (backgroundPromotion2 != null) {
                str = String.valueOf(backgroundPromotion2.titleColorStyle);
            } else if (poiVerticalityDataResponse.getNavigationBlock() != null && poiVerticalityDataResponse.getNavigationBlock().propsData != null) {
                str = poiVerticalityDataResponse.getNavigationBlock().propsData.titleColorStyle;
            }
            equals = str.equals("0");
        }
        aVar.Y = equals;
        aVar.Z = b(poiVerticalityDataResponse);
        Object[] objArr4 = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect4 = i;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "87fc31117fd158cb8e95fbec1aafbd97", RobustBitConfig.DEFAULT_VALUE)) {
            z3 = ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "87fc31117fd158cb8e95fbec1aafbd97")).booleanValue();
        } else {
            z3 = (poiVerticalityDataResponse == null || poiVerticalityDataResponse.pageConfig == null || poiVerticalityDataResponse.pageConfig.propsData == null || poiVerticalityDataResponse.pageConfig.propsData.extra == null || t.a(poiVerticalityDataResponse.pageConfig.propsData.extra.newUserAcrossBg)) ? false : true;
        }
        aVar.ba = z3;
        Object[] objArr5 = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect5 = i;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "3362a730a5c5333b1d35051a67c5160e", RobustBitConfig.DEFAULT_VALUE)) {
            z4 = ((Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "3362a730a5c5333b1d35051a67c5160e")).booleanValue();
        } else {
            z4 = (poiVerticalityDataResponse == null || poiVerticalityDataResponse.pageConfig == null || poiVerticalityDataResponse.pageConfig.propsData == null || poiVerticalityDataResponse.pageConfig.propsData.extra == null || !poiVerticalityDataResponse.pageConfig.propsData.extra.isMixStyleForHeadBg) ? false : true;
        }
        aVar.ab = z4;
        PoiChannelBackgroundConfig backgroundConfig = poiVerticalityDataResponse.getBackgroundConfig();
        if (backgroundConfig != null) {
            String str2 = backgroundConfig.channelPageBottomColor;
            aVar.E = str2;
            if (!TextUtils.equals(str2, aVar.E)) {
                com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.widgets.filterbar.event.a(aVar.X, aVar.W, l()));
            }
            this.u.setBackgroundColor(com.sankuai.shangou.stone.util.d.a(aVar.E, -657930));
        }
        if (poiVerticalityDataResponse.blocks != null && poiVerticalityDataResponse.blocks.navigationBlock != null && poiVerticalityDataResponse.blocks.navigationBlock.data != null) {
            aVar.v = poiVerticalityDataResponse.blocks.navigationBlock.data.searchText;
        }
        Object[] objArr6 = {poiVerticalityDataResponse, aVar};
        ChangeQuickRedirect changeQuickRedirect6 = i;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "2b94b0367773b2bc581be2bab63dc460", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "2b94b0367773b2bc581be2bab63dc460");
        } else if (N()) {
            if (this.w != null) {
                this.w.f();
                this.w.a(true);
            }
            this.m.L = poiVerticalityDataResponse.showPrimaryFilterTitle;
            if (poiVerticalityDataResponse.getNavigationBlock() != null) {
                this.m.N = poiVerticalityDataResponse.getNavigationBlock().propsData != null ? poiVerticalityDataResponse.getNavigationBlock().propsData.channelCode : 0;
            }
            l().s().recordStep(this.m.ai ? "activity_data_ready_with_locating" : "activity_data_ready_no_locating");
            if (this.m.y) {
                l().s().recordStep(this.m.ai ? "home_page_have_no_location_request" : "home_page_have_mt_location_only_request");
            } else {
                l().s().recordStep(this.m.ai ? "channel_page_have_no_location_request" : "channel_page_have_mt_location_only_request");
            }
            if (this.m.ai) {
                com.sankuai.waimai.store.manager.judas.b.b(l(), "b_waimai_1v0wqray_mv").a("duration", 0).a();
            }
            l().s().recordStep("activity_data_ready_tile");
            if (aVar.y) {
                l().s().recordStep("home_page_time_data_parse");
            } else {
                l().s().recordStep("channel_page_time_data_parse");
            }
            com.sankuai.meituan.takeoutnew.util.aop.h.a(l().s().recordStep("activity_data_ready"));
            if (!this.m.at) {
                this.m.at = true;
                if (this.m.av != null) {
                    this.m.av.recordStep("activity_data_ready");
                }
                if (this.m.aw != null) {
                    this.m.aw.recordStep("activity_data_ready");
                }
                if (this.m.ax != null) {
                    this.m.ax.recordStep("activity_data_ready");
                }
            }
            this.o = false;
            this.m.H = true;
        }
        Object[] objArr7 = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect7 = i;
        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "6b98da9aae6360c624cfb136fe3b4674", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "6b98da9aae6360c624cfb136fe3b4674");
        } else if (poiVerticalityDataResponse != null && this.m.y && this.m.B) {
            com.meituan.android.bus.a.a().c(new f.a(poiVerticalityDataResponse));
        }
        PoiResult a = this.k.b.a();
        if (a == null) {
            a = new PoiResult();
        }
        a.response = poiVerticalityDataResponse;
        a.isFirstLoaded = N();
        this.k.b.b((android.arch.lifecycle.k<PoiResult>) a);
        if (poiVerticalityDataResponse.blocks == null || com.sankuai.shangou.stone.util.a.b(poiVerticalityDataResponse.blocks.secondloor)) {
            L();
        } else if (!p.a(poiVerticalityDataResponse.blocks.secondloor.get(0)) && !p.a(poiVerticalityDataResponse.blocks.secondloor.get(0).data) && !p.a(poiVerticalityDataResponse.blocks.secondloor.get(0).data.jsonData)) {
            if (this.t != null && this.t.activityId.equals(poiVerticalityDataResponse.blocks.secondloor.get(0).data.jsonData.activityId)) {
                if (this.u != null) {
                    this.u.setAllowTwoLevel(true);
                }
            } else {
                this.t = poiVerticalityDataResponse.blocks.secondloor.get(0).data.jsonData;
                M();
                this.n.a(this.t, poiVerticalityDataResponse.blocks.secondloor.get(0).propsData, this.k, N());
            }
        }
        Object[] objArr8 = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect8 = i;
        if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "d8561eb409d54fe9de3f8cd8e466f098", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "d8561eb409d54fe9de3f8cd8e466f098");
        } else if (poiVerticalityDataResponse != null) {
            this.j.e();
        }
        com.sankuai.waimai.store.expose.v2.b.a().f(l());
        if (aVar.ag > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.m.ag;
            ae.a("HomeOpen", "step 6.1 home success, duration = " + elapsedRealtime);
            com.sankuai.waimai.store.manager.judas.b.b(l(), "b_waimai_sg_472ca63s_mv").a("duration", Long.valueOf(elapsedRealtime)).a();
            this.m.ag = -1L;
        }
        d(poiVerticalityDataResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean M() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83031ceeb78d0a67371c5ddc68da18ab", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83031ceeb78d0a67371c5ddc68da18ab")).booleanValue();
        }
        if (this.t != null) {
            return com.sankuai.waimai.store.poi.list.util.f.a(this.t, l(), this.s);
        }
        return false;
    }

    private boolean c(PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Object[] objArr = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6e3ba97ad9ccb8fd41597649d5ab9b8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6e3ba97ad9ccb8fd41597649d5ab9b8")).booleanValue();
        }
        if (poiVerticalityDataResponse == null) {
            return false;
        }
        try {
            PoiVerticalityDataResponse.Promotion backgroundPromotion = poiVerticalityDataResponse.getBackgroundPromotion();
            return (backgroundPromotion != null ? backgroundPromotion.picOrColor : 0) == 1;
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean a(PoiVerticalityDataResponse poiVerticalityDataResponse, int i2) {
        int i3;
        PoiVerticalityDataResponse.AcrossBannerBg acrossBannerBg;
        Object[] objArr = {poiVerticalityDataResponse, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd4c9744f6906e5aab687b402535cf96", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd4c9744f6906e5aab687b402535cf96")).booleanValue();
        }
        if (poiVerticalityDataResponse == null) {
            return false;
        }
        try {
            PoiVerticalityDataResponse.Promotion backgroundPromotion = poiVerticalityDataResponse.getBackgroundPromotion();
            if (backgroundPromotion != null) {
                i3 = backgroundPromotion.promotionType;
                if (i3 == 2 && (acrossBannerBg = backgroundPromotion.acrossBackground) != null) {
                    this.m.aZ = acrossBannerBg.atmosphereType;
                }
            } else {
                i3 = 0;
            }
            return i3 == i2;
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean A() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b677ae76ab9ee20797087ce7f051e4a5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b677ae76ab9ee20797087ce7f051e4a5")).booleanValue() : this.n.c();
    }

    private boolean N() {
        return this.o || this.m.n == 0;
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.contract.d.b
    public final void a(com.sankuai.waimai.store.param.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c78ac0b007835264b361609de8976e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c78ac0b007835264b361609de8976e6");
        } else if (this.u.b()) {
        } else {
            this.j.b();
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.contract.d.b
    public final void a(com.sankuai.waimai.store.param.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ca53693c69eda72c1d250345af50a6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ca53693c69eda72c1d250345af50a6e");
            return;
        }
        ((PageEventHandler) q.a((FragmentActivity) l()).a(PageEventHandler.class)).a((PageEventHandler) new com.sankuai.waimai.store.poi.list.refactor.event.c(aVar));
        this.k.f.b((android.arch.lifecycle.k<Boolean>) Boolean.TRUE);
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.contract.d.b
    public final long c() {
        return this.m.g;
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.contract.d.b
    public final String d() {
        return this.m.i;
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.contract.d.b
    public final String f() {
        return this.m.j;
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.contract.d.b
    public final String g() {
        return this.m.h;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class SGMRNNotifyChannelReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect a;

        public SGMRNNotifyChannelReceiver() {
            Object[] objArr = {PoiNewTemplate4.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d54b2b000a4c2c30bf59b26a86864ea", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d54b2b000a4c2c30bf59b26a86864ea");
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5e54add7026170ee2eba0a8560549c2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5e54add7026170ee2eba0a8560549c2");
            } else if (intent != null && "WMSMMRNCreateInquirySuccessNotification".equals(intent.getAction())) {
                ad.a(new Runnable() { // from class: com.sankuai.waimai.store.poi.list.refactor.PoiNewTemplate4.SGMRNNotifyChannelReceiver.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "81000b9d72145455dfd0a34b0a1b130a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "81000b9d72145455dfd0a34b0a1b130a");
                        } else {
                            PoiNewTemplate4.this.C();
                        }
                    }
                }, 500L);
            }
        }
    }

    public final void B() {
        if (this.m != null) {
            this.m.f = "0";
        }
    }

    public void C() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1894d01b03d5dd787e29dab4a9626dad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1894d01b03d5dd787e29dab4a9626dad");
        } else if (this.B) {
            this.A = -1;
            this.n.a(1);
        } else {
            this.A = 1;
        }
    }

    public final void D() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "593ce76817dcc2defbde22af648a0291", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "593ce76817dcc2defbde22af648a0291");
            return;
        }
        com.sankuai.waimai.store.fsp.a.a().a(l(), "sg_perf_api_start");
        if (this.B) {
            this.A = -1;
            if (this.m.y) {
                l().s().recordStep("home_page_time_start_request");
            } else {
                l().s().recordStep("channel_page_time_start_request");
            }
            this.n.a(0);
            return;
        }
        this.A = 0;
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.PoiPageLifecycleObserver
    public final void f(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13a8a973f3d49e6d07000b578bf5e823", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13a8a973f3d49e6d07000b578bf5e823");
        } else if (i2 != 1) {
            if (i2 == 4) {
                G();
            } else if (i2 == 0) {
                E();
            } else if (i2 == 3) {
                F();
            }
        } else {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = i;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dd5f6ef8da06f138cf20fdf49a949307", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dd5f6ef8da06f138cf20fdf49a949307");
                return;
            }
            if (this.A != -1) {
                this.n.a(this.A);
                this.A = -1;
            }
            if (this.H && this.E != null) {
                this.E.b();
                this.H = false;
            }
            this.L = System.currentTimeMillis();
        }
    }

    public void E() {
        this.B = true;
    }

    public void F() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ef236ef57cfd2b26b803cb4d6e8ac7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ef236ef57cfd2b26b803cb4d6e8ac7a");
            return;
        }
        this.B = false;
        if (m() != null) {
            this.M += (System.currentTimeMillis() - this.L) / 1000.0d;
        }
    }

    public void G() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7986a1438e4370caf3357326736f9b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7986a1438e4370caf3357326736f9b9");
            return;
        }
        com.sankuai.waimai.store.manager.user.a.a().a((com.sankuai.waimai.store.i.user.a) this);
        com.sankuai.waimai.store.locate.a.b(this);
        com.meituan.android.bus.a.a().b(this);
        if (this.w != null) {
            this.w.j();
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = i;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "de8c07cf7fce8d507d70f3a48c02145e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "de8c07cf7fce8d507d70f3a48c02145e");
        } else {
            SCBaseActivity l = l();
            if (l != null && this.x != null) {
                l.unregisterReceiver(this.x);
                this.x = null;
            }
        }
        if (this.F != null) {
            this.F.b();
        }
    }

    public final void H() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47f44acd0dcf087ea4da27e943d6e2bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47f44acd0dcf087ea4da27e943d6e2bf");
            return;
        }
        if (this.u.b() || this.u.d()) {
            this.u.a();
        }
        this.j.e();
    }

    public static void a(Context context, final Map<String, String> map) {
        Object[] objArr = {context, map};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0caf89263d29dacf8efa65daec0fb769", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0caf89263d29dacf8efa65daec0fb769");
        } else if (context == null) {
        } else {
            com.sankuai.waimai.monitor.a a = com.sankuai.waimai.monitor.a.a(context, 8888);
            a.InterfaceC1031a interfaceC1031a = new a.InterfaceC1031a() { // from class: com.sankuai.waimai.store.poi.list.refactor.PoiNewTemplate4.6
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.monitor.a.InterfaceC1031a
                public final String a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cb6e491564a6fd85117c91526baa9310", RobustBitConfig.DEFAULT_VALUE)) {
                        return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cb6e491564a6fd85117c91526baa9310");
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("cityName", PoiNewTemplate4.a(com.sankuai.waimai.foundation.location.v2.g.a().k()));
                    hashMap.put(GearsLocator.ADDRESS, com.sankuai.waimai.store.locate.a.d());
                    if (map != null) {
                        hashMap.putAll(map);
                    }
                    return i.a(hashMap);
                }
            };
            Object[] objArr2 = {interfaceC1031a};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.monitor.a.a;
            if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect2, false, "bec41d3f69a6f915f54ffc2c430d34f7", RobustBitConfig.DEFAULT_VALUE)) {
                a = (com.sankuai.waimai.monitor.a) PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect2, false, "bec41d3f69a6f915f54ffc2c430d34f7");
            } else {
                a.b.setReportListener(interfaceC1031a);
            }
            a.a();
        }
    }

    public static String a(@NonNull WmAddress wmAddress) {
        Object[] objArr = {wmAddress};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6718458a933be585734b96094ca0ea53", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6718458a933be585734b96094ca0ea53");
        }
        if (wmAddress != null) {
            if (wmAddress.getMeitaunCity() != null) {
                return wmAddress.getMeitaunCity().getCityName();
            }
            return wmAddress.getMafCity() != null ? wmAddress.getMafCity().getCityName() : "";
        }
        return "";
    }

    @Override // com.meituan.android.cube.core.h
    public void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19fb1bb4e476a08850338bdd88dff461", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19fb1bb4e476a08850338bdd88dff461");
            return;
        }
        super.q();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = i;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5e2045cf67499b2fffdc9134b87d30af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5e2045cf67499b2fffdc9134b87d30af");
        } else if (o.i() && this.m != null && !TextUtils.isEmpty(this.m.bt)) {
            HashMap hashMap = new HashMap();
            hashMap.put("category_type", Long.valueOf(this.m.c));
            if (!TextUtils.isEmpty(this.m.f)) {
                hashMap.put("second_category_type", this.m.f);
            }
            String a = i.a(hashMap);
            if ("Success".equals(this.m.bt)) {
                b.a a2 = com.sankuai.waimai.store.util.monitor.b.a().a(SGBlankPageMetric.Success).a(a).c("WMSMTileChannelViewController").a("appVersion", com.sankuai.waimai.foundation.core.common.a.a().e()).a("empty_type", "Success");
                StringBuilder sb = new StringBuilder();
                sb.append(this.m.c);
                a2.a("empty_cate_code", sb.toString()).a(true).a();
            } else {
                b.a a3 = com.sankuai.waimai.store.util.monitor.b.a().a(SGBlankPageMetric.BlankDataError).a(a).c("WMSMTileChannelViewController").a("appVersion", com.sankuai.waimai.foundation.core.common.a.a().e()).a("empty_type", "BlankDataError");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.m.c);
                a3.a("empty_cate_code", sb2.toString()).a(false).a();
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = i;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fec262776804c5b9cb89078e00672bbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fec262776804c5b9cb89078e00672bbb");
        } else if (o.j() && m() != null && this.m != null) {
            com.sankuai.waimai.store.util.monitor.b.a().a(SGSecondOpeningLossRate.SGSecondOpeningLossRate).a("appVersion", com.sankuai.waimai.foundation.core.common.a.a().e()).a("cate_code", String.valueOf(this.m.c)).a(NetLogConstants.Tags.NETWORK_TYPE, com.sankuai.waimai.foundation.utils.p.b(m())).a("device_type", Build.MODEL).a(this.m.bo).a();
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = i;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "df08ca0386eee2a589b1b4c3511f639d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "df08ca0386eee2a589b1b4c3511f639d");
        } else if (o.j() && m() != null && N() && this.m != null) {
            if (this.m.bu + this.m.bw >= (this.m.O ? 5 : 6)) {
                if (this.m.bv + this.m.bx < (this.m.O ? 5 : 6)) {
                    this.m.bp = true;
                }
            } else if (this.m.bv + this.m.bx < (this.m.bu + this.m.bw) * 0.9d) {
                this.m.bp = true;
            }
            b.a a4 = com.sankuai.waimai.store.util.monitor.b.a().a(SGBounceRate.SGBounceRate).a("appVersion", com.sankuai.waimai.foundation.core.common.a.a().e()).a("cate_code", String.valueOf(this.m.c)).a("outcast", String.valueOf(t.a(this.m.m)));
            a4.a("api_status", "TILE-" + String.valueOf(this.m.bq) + " LIST-" + String.valueOf(this.m.br)).a(MetricsSpeedMeterTask.STARTUP_IF_FIRST, String.valueOf(this.m.bs)).a("stay_time", String.valueOf(Math.floor(this.M))).a(this.m.bp).a(this.m.bp ? "SGBounceRateTrue" : "SGBounceRateFalse").a();
        }
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = i;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "947338655f9b3a513a7a09553ea30839", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "947338655f9b3a513a7a09553ea30839");
        } else if (o.j() && this.m != null) {
            com.sankuai.waimai.store.util.monitor.b.a().a(SGListExposeLossRate.SGListExposeLossRate).a("appVersion", com.sankuai.waimai.foundation.core.common.a.a().e()).a("cate_code", String.valueOf(this.m.c)).a(!this.m.bz).a();
        }
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = i;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "8aa61ce146ddfa824824064f4ed3e9a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "8aa61ce146ddfa824824064f4ed3e9a4");
        } else if (o.j() && this.m != null && this.m.bA) {
            com.sankuai.waimai.store.util.monitor.b.a().a(SGModuleBeforeRenderLossRate.SGModuleBeforeRenderLossRate).a("appVersion", com.sankuai.waimai.foundation.core.common.a.a().e()).a("cate_code", String.valueOf(this.m.c)).a("status", String.valueOf(this.m.bB)).a(this.m.bB != 3).a();
        }
    }

    private String O() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e5168d23fddc32e9136c04d1d7f955e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e5168d23fddc32e9136c04d1d7f955e");
        }
        if (o.l()) {
            try {
                ErrorCode errorCode = new ErrorCode(ErrorCode.ERROR_TYPE_B, "1000014", "41SD");
                String replace = com.sankuai.waimai.store.diting.a.a(errorCode, m().getApplicationContext()).b("28616").b.buildErrorCodeStr().replace('(', Constants.SPACE).replace(')', Constants.SPACE);
                com.sankuai.waimai.store.diting.a.a(errorCode);
                return replace;
            } catch (Exception e) {
                e.printStackTrace();
                return "";
            }
        }
        return "";
    }

    private void P() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4b405ff45d64d685b9b575781735f7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4b405ff45d64d685b9b575781735f7d");
            return;
        }
        if (this.K == null) {
            this.K = new com.sankuai.waimai.store.widgets.topfloatview.b(l(), m(), this.m);
            this.K.a(i());
            this.K.j = new com.sankuai.waimai.store.widgets.topfloatview.d() { // from class: com.sankuai.waimai.store.poi.list.refactor.PoiNewTemplate4.7
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.widgets.topfloatview.d
                public final void a(View view, int i2, long j, Map<String, Object> map) {
                    Object[] objArr2 = {view, Integer.valueOf(i2), new Long(j), null};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e3af55d6b3c13b6a9782ed09d83d99b6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e3af55d6b3c13b6a9782ed09d83d99b6");
                    } else {
                        PoiNewTemplate4.this.l.a((PageEventHandler) new com.sankuai.waimai.store.poi.list.newp.block.rxevent.k(i2, false));
                    }
                }
            };
            this.K.i = new com.sankuai.waimai.store.widgets.topfloatview.d() { // from class: com.sankuai.waimai.store.poi.list.refactor.PoiNewTemplate4.8
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.widgets.topfloatview.d
                public final void a(View view, int i2, long j, Map<String, Object> map) {
                    Object[] objArr2 = {view, Integer.valueOf(i2), new Long(j), null};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "caa3c44df0003cb79a8d82f8a34c2a03", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "caa3c44df0003cb79a8d82f8a34c2a03");
                    } else if (j == 0 || PoiNewTemplate4.this.K == null) {
                    } else {
                        PoiNewTemplate4.this.m.bj = true;
                        PoiNewTemplate4.this.m.c = j;
                        PoiNewTemplate4.this.m.f = "0";
                        PoiNewTemplate4.this.y();
                        PoiNewTemplate4.this.n.b(0);
                        com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.poi.list.newp.block.rxevent.g(j));
                        PoiNewTemplate4.this.K.b(0);
                        new Handler().postDelayed(new Runnable() { // from class: com.sankuai.waimai.store.poi.list.refactor.PoiNewTemplate4.8.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cb68516011420a74b88cbb21fe001fe3", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cb68516011420a74b88cbb21fe001fe3");
                                    return;
                                }
                                try {
                                    if (PoiNewTemplate4.this.K != null) {
                                        PoiNewTemplate4.this.K.b(8);
                                    }
                                } catch (Exception e) {
                                    com.sankuai.waimai.store.base.log.a.a(e);
                                }
                            }
                        }, MetricsAnrManager.ANR_THRESHOLD);
                    }
                }
            };
        }
        if (this.m.bj) {
            this.K.a(0);
        }
    }

    private void d(PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Object[] objArr = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c742c3c494335051e0b24b54b133cbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c742c3c494335051e0b24b54b133cbb");
        } else if (e(poiVerticalityDataResponse)) {
            P();
            Object[] objArr2 = {poiVerticalityDataResponse};
            ChangeQuickRedirect changeQuickRedirect2 = i;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "815bec02e2d40d258f1906fb077e9260", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "815bec02e2d40d258f1906fb077e9260");
            } else {
                P();
                if (poiVerticalityDataResponse != null && poiVerticalityDataResponse.getBackgroundConfig() != null) {
                    com.sankuai.waimai.store.widgets.topfloatview.b bVar = this.K;
                    PoiChannelBackgroundConfig backgroundConfig = poiVerticalityDataResponse.getBackgroundConfig();
                    Object[] objArr3 = {backgroundConfig};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.widgets.topfloatview.b.a;
                    if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "8df16244b4dff0ad64ba150edd5fdaa0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "8df16244b4dff0ad64ba150edd5fdaa0");
                    } else if (bVar.f != null) {
                        bVar.f.j = backgroundConfig;
                    }
                }
            }
            if (poiVerticalityDataResponse == null || poiVerticalityDataResponse.blocks == null || poiVerticalityDataResponse.blocks.bannerBlock == null) {
                return;
            }
            for (int i2 = 0; i2 < poiVerticalityDataResponse.blocks.bannerBlock.size(); i2++) {
                BaseTileNew baseTileNew = (BaseTileNew) com.sankuai.shangou.stone.util.a.a((List<Object>) poiVerticalityDataResponse.blocks.bannerBlock, i2);
                if (baseTileNew != null && "sm_type_channel_double_row_kingkong".equals(baseTileNew.sType) && baseTileNew.data != 0) {
                    String str = "#38C617";
                    if (baseTileNew.propsData != 0) {
                        try {
                            str = String.valueOf(com.sankuai.waimai.mach.utils.b.a(i.a(baseTileNew.propsData)).get("kingkongSelectedBgColor"));
                        } catch (Exception unused) {
                        }
                    }
                    BaseModuleDesc baseModuleDesc = (BaseModuleDesc) baseTileNew.data;
                    if (baseModuleDesc.jsonData == null || baseModuleDesc.jsonData.get("primary_filter_condlist") == null) {
                        return;
                    }
                    List<PrimaryFilterCondList> list = (List) i.a(i.a(baseModuleDesc.jsonData.get("primary_filter_condlist")), new TypeToken<List<PrimaryFilterCondList>>() { // from class: com.sankuai.waimai.store.poi.list.refactor.PoiNewTemplate4.9
                    }.getType());
                    if (com.sankuai.shangou.stone.util.a.b(list)) {
                        return;
                    }
                    com.sankuai.waimai.store.widgets.topfloatview.b bVar2 = this.K;
                    Object[] objArr4 = {list};
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.widgets.topfloatview.b.a;
                    if (PatchProxy.isSupport(objArr4, bVar2, changeQuickRedirect4, false, "040344699c44c6f576b3bd9e2d62837a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, bVar2, changeQuickRedirect4, false, "040344699c44c6f576b3bd9e2d62837a");
                    } else {
                        u.a(bVar2.c);
                        bVar2.g = list;
                        if (bVar2.e != null) {
                            com.sankuai.waimai.store.widgets.topfloatview.c cVar = bVar2.e;
                            Object[] objArr5 = {list};
                            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.store.widgets.topfloatview.c.a;
                            if (PatchProxy.isSupport(objArr5, cVar, changeQuickRedirect5, false, "34416e8444a0902ef8720c81d9df50b7", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, cVar, changeQuickRedirect5, false, "34416e8444a0902ef8720c81d9df50b7");
                            } else {
                                if (list != null) {
                                    cVar.e = list;
                                    List<PrimaryFilterCondList> list2 = cVar.e;
                                    Object[] objArr6 = {list2};
                                    ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.store.widgets.topfloatview.c.a;
                                    if (PatchProxy.isSupport(objArr6, cVar, changeQuickRedirect6, false, "7b307e991ddfc2f9454003755a440340", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, cVar, changeQuickRedirect6, false, "7b307e991ddfc2f9454003755a440340");
                                    } else if (!com.sankuai.shangou.stone.util.a.b(list2)) {
                                        for (int i3 = 0; i3 < com.sankuai.shangou.stone.util.a.c(list2); i3++) {
                                            PrimaryFilterCondList primaryFilterCondList = (PrimaryFilterCondList) com.sankuai.shangou.stone.util.a.a((List<Object>) list2, i3);
                                            if (primaryFilterCondList != null && cVar.l != null && primaryFilterCondList.graySwitch != 1 && primaryFilterCondList.bubble != null) {
                                                cVar.l.put(Long.valueOf(primaryFilterCondList.code), Boolean.TRUE);
                                            }
                                        }
                                    }
                                    cVar.a(1, cVar.k == null ? 0L : cVar.k.c);
                                } else {
                                    cVar.e = new ArrayList();
                                }
                                cVar.notifyDataSetChanged();
                            }
                        }
                    }
                    com.sankuai.waimai.store.widgets.topfloatview.b bVar3 = this.K;
                    Object[] objArr7 = {str};
                    ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.store.widgets.topfloatview.b.a;
                    if (PatchProxy.isSupport(objArr7, bVar3, changeQuickRedirect7, false, "7f604917ef46a35c9a4d58d1b27d5e86", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, bVar3, changeQuickRedirect7, false, "7f604917ef46a35c9a4d58d1b27d5e86");
                    } else if (bVar3.e != null) {
                        bVar3.e.i = str;
                    }
                    this.m.bn = com.sankuai.shangou.stone.util.a.c(list) <= 5;
                    return;
                }
            }
        }
    }

    private boolean e(PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Object[] objArr = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3125079d91af55166ac4351193f69c65", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3125079d91af55166ac4351193f69c65")).booleanValue();
        }
        if (poiVerticalityDataResponse != null && poiVerticalityDataResponse.blocks != null && poiVerticalityDataResponse.blocks.floatBlock != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= poiVerticalityDataResponse.blocks.floatBlock.size()) {
                    break;
                }
                BaseTile baseTile = (BaseTile) com.sankuai.shangou.stone.util.a.a((List<Object>) poiVerticalityDataResponse.blocks.floatBlock, i2);
                if (baseTile == null || !"sm_type_home_channel_kingkong".equals(baseTile.sType) || baseTile.data == 0) {
                    i2++;
                } else {
                    PoiVerticalityDataResponse.FloatingData floatingData = (PoiVerticalityDataResponse.FloatingData) baseTile.data;
                    if (floatingData.jsonData != null && floatingData.jsonData.get("primary_filter_condlist") != null) {
                        this.m.bl = true;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void f(PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Object[] objArr = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bab5964ae4c446e217882acd31adc165", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bab5964ae4c446e217882acd31adc165");
        } else if (poiVerticalityDataResponse != null && poiVerticalityDataResponse.blocks != null && poiVerticalityDataResponse.blocks.bannerBlock != null) {
            for (int i2 = 0; i2 < poiVerticalityDataResponse.blocks.bannerBlock.size(); i2++) {
                BaseTileNew baseTileNew = (BaseTileNew) com.sankuai.shangou.stone.util.a.a((List<Object>) poiVerticalityDataResponse.blocks.bannerBlock, i2);
                if (baseTileNew != null && "sm_type_channel_double_row_kingkong".equals(baseTileNew.sType) && baseTileNew.data != 0 && baseTileNew.propsData != 0) {
                    BaseModuleDesc baseModuleDesc = (BaseModuleDesc) baseTileNew.data;
                    if (baseModuleDesc.jsonData != null && baseModuleDesc.jsonData.get("primary_filter_condlist") != null) {
                        this.m.aU = true;
                        BaseTileNew.KingKongProps kingKongProps = (BaseTileNew.KingKongProps) i.a(i.a(baseTileNew.propsData), new TypeToken<BaseTileNew.KingKongProps>() { // from class: com.sankuai.waimai.store.poi.list.refactor.PoiNewTemplate4.10
                        }.getType());
                        if (kingKongProps != null && "qualityGoods".equals(kingKongProps.kingkongSlot)) {
                            this.m.bm = true;
                            return;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8377aa76c1a569943542105422b3d063", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8377aa76c1a569943542105422b3d063");
        } else if (this.m.bm && this.m.ab) {
            this.l.a((PageEventHandler) new com.sankuai.waimai.store.poi.list.newp.block.rxevent.b(z));
            this.u.setForbidScroll(z);
        }
    }

    @Override // com.sankuai.waimai.store.i.locate.b
    public final void a(WMLocation wMLocation, String str, boolean z) {
        Object[] objArr = {wMLocation, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1986f53b5000eaff03056ba3e8996ffb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1986f53b5000eaff03056ba3e8996ffb");
        } else if (SGLocationUtils.a(this.p, this.r)) {
            this.k.h.b((android.arch.lifecycle.k<PoiLocationAddress>) new PoiLocationAddress(com.sankuai.waimai.store.locate.a.d(), true));
            this.l.a((PageEventHandler) new com.sankuai.waimai.store.poi.list.newp.block.rxevent.j(true));
            this.m.f = "0";
            this.p = wMLocation;
            this.r = str;
            y();
            D();
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.contract.d.a
    public final Activity a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5aa29845696556fa728f6d43f614f4b0", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5aa29845696556fa728f6d43f614f4b0") : (SCBaseActivity) super.l();
    }
}
