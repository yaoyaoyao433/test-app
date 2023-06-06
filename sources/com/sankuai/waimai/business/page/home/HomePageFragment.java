package com.sankuai.waimai.business.page.home;

import android.app.Activity;
import android.arch.lifecycle.d;
import android.arch.lifecycle.k;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v4.util.Pair;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dianping.shield.entity.ExposeAction;
import com.google.gson.Gson;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.common.statistics.utils.JsonUtil;
import com.meituan.metrics.Metrics;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.mads.b;
import com.sankuai.waimai.ai.uat.context.a;
import com.sankuai.waimai.business.page.common.arch.PageActivity;
import com.sankuai.waimai.business.page.common.arch.PageFragment;
import com.sankuai.waimai.business.page.common.util.c;
import com.sankuai.waimai.business.page.common.view.listfloat.IntelligentEntranceBlock;
import com.sankuai.waimai.business.page.home.actionbar.HomeActionBarViewModel;
import com.sankuai.waimai.business.page.home.actionbar.market.HeaderFloatViewModel;
import com.sankuai.waimai.business.page.home.basal.HomePageNestedScrollRecyclerView;
import com.sankuai.waimai.business.page.home.basal.PreLoadLinearLayoutManager;
import com.sankuai.waimai.business.page.home.c;
import com.sankuai.waimai.business.page.home.expose.b;
import com.sankuai.waimai.business.page.home.factory.FuTiaoMatrixView;
import com.sankuai.waimai.business.page.home.gray.HomeGrayManager;
import com.sankuai.waimai.business.page.home.head.market.HomeSideBarViewModel;
import com.sankuai.waimai.business.page.home.layer.fault.FaultViewModel;
import com.sankuai.waimai.business.page.home.layer.remind.RemindViewModel;
import com.sankuai.waimai.business.page.home.list.future.FuturePagerAdapter;
import com.sankuai.waimai.business.page.home.list.future.modulelistheader.PersonalizedBean;
import com.sankuai.waimai.business.page.home.list.poi.HomePoiViewModel;
import com.sankuai.waimai.business.page.home.model.HomePagePoiListResponse;
import com.sankuai.waimai.business.page.home.model.HomeSecondFloorResponse;
import com.sankuai.waimai.business.page.home.model.MarketingWindow;
import com.sankuai.waimai.business.page.home.preload.PreloadDataModel;
import com.sankuai.waimai.business.page.home.preload.bean.NetBean;
import com.sankuai.waimai.business.page.home.preload.bean.RcmdNetBean;
import com.sankuai.waimai.business.page.home.utils.m;
import com.sankuai.waimai.business.page.home.utils.n;
import com.sankuai.waimai.business.page.home.widget.HomePullToRefreshView;
import com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper;
import com.sankuai.waimai.business.page.home.widget.twolevel.SecondFloorViewModel;
import com.sankuai.waimai.business.page.home.widget.twolevel.report.a;
import com.sankuai.waimai.business.page.homepage.bubble.g;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.core.service.user.b;
import com.sankuai.waimai.foundation.location.LocationCatReporter;
import com.sankuai.waimai.foundation.location.utils.c;
import com.sankuai.waimai.foundation.location.v2.City;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.guidepop.hign.WMGuidePopHighPopup;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.domain.manager.home.TabLoadManager;
import com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager;
import com.sankuai.waimai.platform.popup.e;
import com.sankuai.waimai.platform.shop.channellabel.ChannelLabelController;
import com.sankuai.waimai.platform.utils.listid.ListIDHelper;
import com.sankuai.waimai.platform.utils.sharedpreference.PlatformSPKeys;
import com.sankuai.waimai.platform.widget.emptylayout.d;
import com.sankuai.waimai.platform.widget.filterbar.view.controller.FilterBarViewController;
import com.sankuai.waimai.popup.WMSkyFallPopup;
import com.sankuai.waimai.popup.f;
import com.sankuai.waimai.pouch.viewmodel.PouchViewModel;
import com.sankuai.waimai.rocks.expose.f;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import com.sankuai.waimai.router.core.j;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class HomePageFragment extends PageFragment implements com.sankuai.waimai.business.page.home.interfacer.b, com.sankuai.waimai.foundation.core.service.user.b, com.sankuai.waimai.platform.model.b {
    private static boolean O = true;
    public static ChangeQuickRedirect d = null;
    public static boolean y = false;
    public boolean A;
    public Runnable B;
    public e C;
    private ViewGroup D;
    private ViewGroup I;
    private ViewGroup J;
    private ViewGroup K;
    private ViewGroup L;
    private View M;
    private g.a N;
    private boolean P;
    private com.sankuai.waimai.business.page.home.actionbar.b Q;
    private com.sankuai.waimai.business.page.home.actionbar.a R;
    private com.sankuai.waimai.business.page.home.actionbar.c S;
    private com.sankuai.waimai.business.page.home.head.theme.b T;
    private com.sankuai.waimai.business.page.home.basal.a U;
    private com.sankuai.waimai.business.page.home.factory.a V;
    private com.sankuai.waimai.business.page.home.layer.b W;
    private RefreshHeaderHelper X;
    private com.sankuai.waimai.business.page.home.widget.twolevel.c Y;
    private com.sankuai.waimai.business.page.home.widget.twolevel.report.a Z;
    private l<Boolean> aa;
    private boolean ab;
    private int ac;
    private boolean ad;
    private com.sankuai.waimai.business.page.home.list.future.modulelistheader.d ae;
    private com.sankuai.waimai.foundation.core.lifecycle.a af;
    private PouchViewModel ag;
    private int ah;
    private int ai;
    private ViewTreeObserver.OnGlobalLayoutListener aj;
    private com.sankuai.waimai.ai.uat.a ak;
    private g al;
    private int am;
    private FilterBarViewController.a an;
    public HomePageNestedScrollRecyclerView e;
    public HomePullToRefreshView f;
    public f g;
    public com.sankuai.waimai.business.page.home.c h;
    public com.sankuai.waimai.business.page.home.b i;
    public com.sankuai.waimai.business.page.home.d j;
    public com.sankuai.waimai.business.page.home.e k;
    public com.sankuai.waimai.business.page.home.a l;
    public HomePageViewModel m;
    public HomeActionBarViewModel n;
    public com.sankuai.waimai.business.page.home.expose.b o;
    protected com.sankuai.waimai.business.page.home.layer.a p;
    protected com.sankuai.waimai.business.page.home.head.promotion.a q;
    protected PreLoadLinearLayoutManager r;
    String s;
    public com.sankuai.waimai.business.page.home.widget.twolevel.strategy.b t;
    public SecondFloorViewModel u;
    public int v;
    public long w;
    public long x;
    public com.sankuai.waimai.business.page.home.interfacer.a z;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface PoiTabIconStatus {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface e {
        void a(int i);

        void a(Map<String, String> map, boolean z);

        void a(boolean z);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class h {
    }

    @Override // com.sankuai.waimai.foundation.core.service.user.b
    public void onAccountInfoUpdate(b.EnumC0948b enumC0948b) {
    }

    public static /* synthetic */ void a(HomePageFragment homePageFragment, int i, int i2, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, homePageFragment, changeQuickRedirect, false, "b128a5a6cb2a8d3c752002fbb6570ee7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, homePageFragment, changeQuickRedirect, false, "b128a5a6cb2a8d3c752002fbb6570ee7");
        } else if (homePageFragment.Z == null || homePageFragment.ac == i || homePageFragment.u == null || homePageFragment.u.b == null || !homePageFragment.u.b.isResourceReady()) {
        } else {
            HomeSecondFloorResponse homeSecondFloorResponse = homePageFragment.u.b;
            if (!homePageFragment.ad && i == 2 && z && i2 == 1) {
                homePageFragment.Z.a(homeSecondFloorResponse, 2);
                homePageFragment.ad = true;
                com.sankuai.waimai.foundation.utils.log.a.b("secondFloorEntranceExpose", "", new Object[0]);
            }
            homePageFragment.ac = i;
        }
    }

    public static /* synthetic */ void a(HomePageFragment homePageFragment, PersonalizedBean personalizedBean) {
        Object[] objArr = {personalizedBean};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, homePageFragment, changeQuickRedirect, false, "daf50da3f6ddb6a2516dbb51ef55900e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, homePageFragment, changeQuickRedirect, false, "daf50da3f6ddb6a2516dbb51ef55900e");
        } else if (personalizedBean == null || !com.sankuai.waimai.business.page.home.list.future.modulelistheader.e.a()) {
        } else {
            if (homePageFragment.ae == null) {
                homePageFragment.ae = new com.sankuai.waimai.business.page.home.list.future.modulelistheader.d();
                final com.sankuai.waimai.business.page.home.list.future.modulelistheader.d dVar = homePageFragment.ae;
                View findViewById = homePageFragment.D.findViewById(R.id.personized_bottom_tips);
                Object[] objArr2 = {findViewById};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.page.home.list.future.modulelistheader.d.a;
                if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "2930b75dea788a134b74c415791e0417", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "2930b75dea788a134b74c415791e0417");
                } else if (findViewById != null) {
                    dVar.b = (LinearLayout) findViewById.findViewById(R.id.personized_bottom_tips);
                    dVar.d = (TextView) findViewById.findViewById(R.id.tv_des);
                    dVar.c = (TextView) findViewById.findViewById(R.id.tv_feedback);
                    dVar.c.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.list.future.modulelistheader.d.1
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr3 = {view};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9b342b48d171ce6e7d75d0fca3022d80", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9b342b48d171ce6e7d75d0fca3022d80");
                                return;
                            }
                            if (view != null && dVar.e != null && !TextUtils.isEmpty(dVar.e.feedbackScheme)) {
                                com.sankuai.waimai.foundation.router.a.a(view.getContext(), Uri.parse(dVar.e.feedbackScheme).toString(), "问卷收集");
                                if (dVar.b != null) {
                                    dVar.b.setVisibility(8);
                                }
                            }
                            f.a("b_waimai_zg5d7if4_mc");
                        }
                    });
                    findViewById.findViewById(R.id.close).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.list.future.modulelistheader.d.2
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr3 = {view};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "47997a8c2983bc21466d28f88dd58513", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "47997a8c2983bc21466d28f88dd58513");
                                return;
                            }
                            dVar.a();
                            f.a("b_waimai_q20b1wio_mc");
                        }
                    });
                }
            }
            com.sankuai.waimai.business.page.home.list.future.modulelistheader.d dVar2 = homePageFragment.ae;
            Object[] objArr3 = {personalizedBean};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.home.list.future.modulelistheader.d.a;
            if (PatchProxy.isSupport(objArr3, dVar2, changeQuickRedirect3, false, "ee91de69c7c144bfab247a9c3ee4e242", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, dVar2, changeQuickRedirect3, false, "ee91de69c7c144bfab247a9c3ee4e242");
            } else if (personalizedBean != null) {
                dVar2.e = personalizedBean;
                if (dVar2.d != null) {
                    dVar2.d.setText(personalizedBean.feedbackTitle);
                }
                if (dVar2.c != null) {
                    dVar2.c.setText(personalizedBean.feedbackIconTitle);
                }
            }
            com.sankuai.waimai.business.page.home.list.future.modulelistheader.d dVar3 = homePageFragment.ae;
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.page.home.list.future.modulelistheader.d.a;
            if (PatchProxy.isSupport(objArr4, dVar3, changeQuickRedirect4, false, "b39387bc4e1462373a7ef23392ac4b95", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, dVar3, changeQuickRedirect4, false, "b39387bc4e1462373a7ef23392ac4b95");
            } else if (dVar3.b != null) {
                TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
                translateAnimation.setDuration(400L);
                dVar3.b.setVisibility(0);
                dVar3.b.startAnimation(translateAnimation);
            }
        }
    }

    public static /* synthetic */ boolean a(HomePageFragment homePageFragment, boolean z) {
        homePageFragment.ad = false;
        return false;
    }

    public static /* synthetic */ boolean b(HomePageFragment homePageFragment, boolean z) {
        homePageFragment.ab = true;
        return true;
    }

    public static /* synthetic */ void c(HomePageFragment homePageFragment) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, homePageFragment, changeQuickRedirect, false, "ebf983e4b1bf216bcdc39af68f7dd148", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, homePageFragment, changeQuickRedirect, false, "ebf983e4b1bf216bcdc39af68f7dd148");
        } else if (homePageFragment.ae == null || !homePageFragment.ae.b()) {
        } else {
            homePageFragment.ae.a();
        }
    }

    public static /* synthetic */ void c(HomePageFragment homePageFragment, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, homePageFragment, changeQuickRedirect, false, "68bddd997ba403b1722c6266f548cb6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, homePageFragment, changeQuickRedirect, false, "68bddd997ba403b1722c6266f548cb6e");
        } else if (homePageFragment.ah != i) {
            homePageFragment.ah = i;
            if (com.sankuai.waimai.foundation.utils.f.a(homePageFragment.F) || homePageFragment.z == null || homePageFragment.z.b() != 0) {
                return;
            }
            homePageFragment.z.a(homePageFragment.ah, false);
        }
    }

    public static /* synthetic */ boolean c(boolean z) {
        O = false;
        return false;
    }

    public static /* synthetic */ void d(HomePageFragment homePageFragment, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, homePageFragment, changeQuickRedirect, false, "30c1ee1d61a909974c28299672b9112a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, homePageFragment, changeQuickRedirect, false, "30c1ee1d61a909974c28299672b9112a");
        } else {
            com.sankuai.waimai.platform.capacity.network.rxsupport.a.a().a(new d(i));
        }
    }

    public static /* synthetic */ void i(HomePageFragment homePageFragment) {
        final HomeSecondFloorResponse homeSecondFloorResponse;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, homePageFragment, changeQuickRedirect, false, "31e61e8dc98e598c781550f34e29de55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, homePageFragment, changeQuickRedirect, false, "31e61e8dc98e598c781550f34e29de55");
        } else if (homePageFragment.u == null || (homeSecondFloorResponse = homePageFragment.u.b) == null) {
        } else {
            String str = null;
            if (homeSecondFloorResponse.homeSecondFloorData != null && homeSecondFloorResponse.homeSecondFloorData.resource != null && homeSecondFloorResponse.homeSecondFloorData.resource.view != null) {
                str = homeSecondFloorResponse.homeSecondFloorData.resource.view.schema;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (str.startsWith("http")) {
                str = Uri.parse(com.sankuai.waimai.foundation.router.interfaces.d.f(homePageFragment.getContext())).buildUpon().appendPath("takeout").appendPath("secondfloor").appendQueryParameter("type", "knb").appendQueryParameter("inner_url", str).build().toString();
            }
            com.sankuai.waimai.foundation.router.a.a().a(new com.sankuai.waimai.router.core.e() { // from class: com.sankuai.waimai.business.page.home.HomePageFragment.15
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.router.core.e
                public final void a(@NonNull j jVar) {
                    Object[] objArr2 = {jVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dd19d95b2ad76e461bb6148938c75690", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dd19d95b2ad76e461bb6148938c75690");
                    } else {
                        HomePageFragment.b(HomePageFragment.this, true);
                    }
                }

                @Override // com.sankuai.waimai.router.core.e
                public final void a(@NonNull j jVar, int i) {
                    Object[] objArr2 = {jVar, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "283a27972d0fc077ebfcd1d3005c0fcf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "283a27972d0fc077ebfcd1d3005c0fcf");
                        return;
                    }
                    if (HomePageFragment.this.X != null) {
                        HomePageFragment.this.X.b();
                    }
                    if (HomePageFragment.this.getActivity() instanceof PageActivity) {
                        ((PageActivity) HomePageFragment.this.getActivity()).aw_();
                    }
                }
            }).a(homePageFragment.getContext(), str);
            final com.sankuai.waimai.business.page.home.widget.twolevel.report.a aVar = homePageFragment.Z;
            Object[] objArr2 = {homeSecondFloorResponse};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.page.home.widget.twolevel.report.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "81cbd651cfd8e551ff0565a8fca5c4b0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "81cbd651cfd8e551ff0565a8fca5c4b0");
            } else if (homeSecondFloorResponse != null && aVar.b != null) {
                com.sankuai.waimai.foundation.utils.log.a.b("SecondFloorReporter", "to second floor.", new Object[0]);
                com.sankuai.waimai.launcher.util.aop.b.a(aVar.b, new Runnable() { // from class: com.sankuai.waimai.business.page.home.widget.twolevel.report.a.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = 0;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f834b40703a7aaf46946995c2e34e0f3", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f834b40703a7aaf46946995c2e34e0f3");
                            return;
                        }
                        String a2 = a.a(homeSecondFloorResponse);
                        Object a3 = a.a(aVar, homeSecondFloorResponse, "chargeInfo");
                        String str2 = a3 instanceof String ? (String) a3 : null;
                        Object a4 = a.a(aVar, homeSecondFloorResponse, "adType");
                        if (a4 instanceof Integer) {
                            i = ((Integer) a4).intValue();
                        } else if (a4 instanceof Double) {
                            i = ((Double) a4).intValue();
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("activity_id", a2);
                            jSONObject.put("entry_item_id", a.a(aVar, homeSecondFloorResponse));
                            jSONObject.put("module_id", a.b(aVar, homeSecondFloorResponse));
                            a.a(aVar, jSONObject, homeSecondFloorResponse);
                            if (i > 0) {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("adType", i);
                                jSONObject2.put("adChargeInfo", c.a(str2));
                                jSONObject.put("ad", jSONObject2);
                                com.sankuai.waimai.ad.monitor.b.a("b_waimai_wfuy44fp_mc", "LX", i, "home_second_floor", com.sankuai.waimai.foundation.core.common.a.a().e());
                            }
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                        Map<String, Object> jsonObjectToMap = JsonUtil.jsonObjectToMap(jSONObject);
                        JudasManualManager.a a5 = JudasManualManager.a("b_waimai_wfuy44fp_mc").a("c_m84bv26");
                        a5.b = aVar.c;
                        a5.b(jsonObjectToMap).a();
                        if (i > 0) {
                            com.sankuai.waimai.ad.monitor.b.a("b_waimai_wfuy44fp_mc", "SH", i, "home_second_floor", com.sankuai.waimai.foundation.core.common.a.a().e());
                            com.sankuai.waimai.ad.mads.a.a(i, new b.a("b_waimai_wfuy44fp_mc", str2 + "&activity_id=" + a2, 2));
                        }
                        Object a6 = a.a(aVar, homeSecondFloorResponse, "monitorClickUrl");
                        if (a6 instanceof String) {
                            com.sankuai.waimai.ad.mads.a.a((String) a6);
                        }
                    }
                });
            }
            homePageFragment.getActivity().overridePendingTransition(0, R.anim.faded_out_in_250ms);
        }
    }

    public final void b() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "162ea0c8c0b160f56b0b080878230ffc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "162ea0c8c0b160f56b0b080878230ffc");
        } else if (this.W != null) {
            WMLocation i = com.sankuai.waimai.foundation.location.v2.g.a().i();
            com.sankuai.waimai.business.page.home.layer.b bVar = this.W;
            if (i != null && !i.hasLocatedPermission && this.v == 0) {
                z = true;
            }
            bVar.a(z);
        }
    }

    public HomePageFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bacaaa46205a2765897ee634ee16ca6e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bacaaa46205a2765897ee634ee16ca6e");
            return;
        }
        this.i = new com.sankuai.waimai.business.page.home.b(this);
        this.j = new com.sankuai.waimai.business.page.home.d(this);
        this.k = new com.sankuai.waimai.business.page.home.e(this);
        this.l = new com.sankuai.waimai.business.page.home.a(this);
        this.v = com.sankuai.waimai.platform.model.c.a().b();
        this.ab = false;
        this.ac = 0;
        this.ah = 1;
        this.A = false;
        this.ai = 0;
        this.aj = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.sankuai.waimai.business.page.home.HomePageFragment.1
            public static ChangeQuickRedirect a;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aa26a9d559f5a94881243fad90d6abe0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aa26a9d559f5a94881243fad90d6abe0");
                    return;
                }
                int height = HomePageFragment.this.D.getHeight();
                if (height <= 0 || HomePageFragment.this.ai == height) {
                    return;
                }
                HomePageFragment.this.m.a(height);
                HomePageFragment.this.ai = height;
            }
        };
        this.am = -1;
        this.an = new FilterBarViewController.a() { // from class: com.sankuai.waimai.business.page.home.HomePageFragment.16
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.filterbar.view.controller.FilterBarViewController.a
            public final void a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dfb319654e77fa050d65ace5a0e70b9c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dfb319654e77fa050d65ace5a0e70b9c");
                } else {
                    HomePageFragment.this.I.setVisibility(4);
                }
            }

            @Override // com.sankuai.waimai.platform.widget.filterbar.view.controller.FilterBarViewController.a
            public final void b(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ac01df4e4dd7ae1b0801f08bc78ca3e4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ac01df4e4dd7ae1b0801f08bc78ca3e4");
                } else {
                    HomePageFragment.this.I.setVisibility(0);
                }
            }
        };
    }

    @Override // com.sankuai.waimai.business.page.common.arch.PageFragment, com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcc72b479bb2213c57cd47bcb402df42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcc72b479bb2213c57cd47bcb402df42");
            return;
        }
        super.onCreate(bundle);
        this.X = new RefreshHeaderHelper();
        this.u = (SecondFloorViewModel) q.a(this).a(SecondFloorViewModel.class);
        this.h = new com.sankuai.waimai.business.page.home.c(q(), this);
        this.m = (HomePageViewModel) q.a(this).a(HomePageViewModel.class);
        this.n = (HomeActionBarViewModel) q.a(this).a(HomeActionBarViewModel.class);
        this.m.K = this.h;
        this.m.L = this.k;
        com.sankuai.waimai.platform.utils.sharedpreference.a.a().a((com.sankuai.waimai.foundation.utils.e) PlatformSPKeys.KEY_SELECT_LOCATION_ADDRESS, "");
        this.m.P = AppUtil.generatePageInfoKey(this);
        this.m.a(this.an);
        com.sankuai.waimai.platform.model.a.a().a(this);
        com.sankuai.waimai.business.page.home.helper.c.a().a(16, this);
        k<Integer> kVar = this.m.h;
        k<Integer> kVar2 = ((HomePoiViewModel) q.a(this).a(HomePoiViewModel.class)).c;
        Object[] objArr2 = {kVar, kVar2};
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e828a2c24edb26a74bce5c6e94b0605a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e828a2c24edb26a74bce5c6e94b0605a");
        } else {
            l<Integer> lVar = new l<Integer>() { // from class: com.sankuai.waimai.business.page.home.HomePageFragment.25
                public static ChangeQuickRedirect a;
                public int b = 0;

                @Override // android.arch.lifecycle.l
                public final /* synthetic */ void a(@Nullable Integer num) {
                    Integer num2 = num;
                    Object[] objArr3 = {num2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1175eaee0ac8a203adb718c926b0e5af", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1175eaee0ac8a203adb718c926b0e5af");
                    } else if (num2 != null) {
                        if (this.b == 0 && num2.intValue() != 0) {
                            Metrics.getInstance().startCustomScrollFPS(HomePageFragment.this.getActivity());
                        } else if (this.b != 0 && num2.intValue() == 0) {
                            Metrics.getInstance().stopCustomScrollFPS(HomePageFragment.this.getActivity());
                        }
                        this.b = num2.intValue();
                    }
                }
            };
            kVar.a(this, lVar);
            kVar2.a(this, lVar);
        }
        this.T = new com.sankuai.waimai.business.page.home.head.theme.b(this);
        this.ak = com.sankuai.waimai.ai.uat.b.a().a(a.b.WMUATPageHome);
        this.al = new g();
        LocalBroadcastManager.getInstance(com.meituan.android.singleton.b.a).registerReceiver(this.al, new IntentFilter("rcmd_coupon_click_action"));
        ((FaultViewModel) q.a(this).a(FaultViewModel.class)).c.a(this, new l<Boolean>() { // from class: com.sankuai.waimai.business.page.home.HomePageFragment.12
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr3 = {bool2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "74f854c4fb20920dca302ae86cd1e334", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "74f854c4fb20920dca302ae86cd1e334");
                } else if (bool2 != null) {
                    HomePageFragment.this.a(bool2.booleanValue(), 1);
                }
            }
        });
        this.m.t.a(this, new l<Pair<Boolean, Integer>>() { // from class: com.sankuai.waimai.business.page.home.HomePageFragment.19
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Pair<Boolean, Integer> pair) {
                Pair<Boolean, Integer> pair2 = pair;
                Object[] objArr3 = {pair2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3d4788dec8398664c7c649e8021f5f5a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3d4788dec8398664c7c649e8021f5f5a");
                } else if (pair2 != null) {
                    com.sankuai.waimai.foundation.utils.log.a.b("WMUnionTransition", "y scroll by, smooth:%s,  value: %s", pair2.first, pair2.second);
                    if (HomePageFragment.this.e != null) {
                        if (pair2.first.booleanValue()) {
                            HomePageFragment.this.e.smoothScrollBy(0, pair2.second.intValue());
                        } else {
                            HomePageFragment.this.e.scrollBy(0, pair2.second.intValue());
                        }
                    }
                }
            }
        });
        this.m.u.a(this, new l<Void>() { // from class: com.sankuai.waimai.business.page.home.HomePageFragment.20
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(Void r11) {
                Object[] objArr3 = {r11};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0909810b7210fcd2d641637da6115348", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0909810b7210fcd2d641637da6115348");
                } else {
                    HomePageFragment.this.e.setSmoothNestedScrollState(0);
                }
            }
        });
        this.m.v.a(this, new l<PersonalizedBean>() { // from class: com.sankuai.waimai.business.page.home.HomePageFragment.21
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable PersonalizedBean personalizedBean) {
                PersonalizedBean personalizedBean2 = personalizedBean;
                Object[] objArr3 = {personalizedBean2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "58b461e9eda3adbe9460f378f1b6dc0f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "58b461e9eda3adbe9460f378f1b6dc0f");
                } else {
                    HomePageFragment.a(HomePageFragment.this, personalizedBean2);
                }
            }
        });
        this.m.w.a(this, new l<Void>() { // from class: com.sankuai.waimai.business.page.home.HomePageFragment.22
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Void r11) {
                Object[] objArr3 = {r11};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "052bb2358604e2e403d28b0cd24bdbcc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "052bb2358604e2e403d28b0cd24bdbcc");
                } else {
                    HomePageFragment.c(HomePageFragment.this);
                }
            }
        });
        this.m.y.a(this, new l<Boolean>() { // from class: com.sankuai.waimai.business.page.home.HomePageFragment.23
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr3 = {bool2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "47e3cdc4dec6c6bfd00c03470e3a7abe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "47e3cdc4dec6c6bfd00c03470e3a7abe");
                } else if (HomePageFragment.this.i == null || bool2 == null) {
                } else {
                    HomePageFragment.this.i.d = bool2.booleanValue();
                }
            }
        });
        if (this.n != null) {
            this.n.j.a(this, new l<Boolean>() { // from class: com.sankuai.waimai.business.page.home.HomePageFragment.24
                public static ChangeQuickRedirect a;

                @Override // android.arch.lifecycle.l
                public final /* synthetic */ void a(@Nullable Boolean bool) {
                    Object[] objArr3 = {bool};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fea3ee0c6232b5e4f5c9e677e18f86ff", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fea3ee0c6232b5e4f5c9e677e18f86ff");
                        return;
                    }
                    int height = HomePageFragment.this.D.getHeight();
                    if (height > 0) {
                        HomePageFragment.this.m.a(height);
                    }
                }
            });
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = d;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "945450646d72724ce3d0bbc247e96fd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "945450646d72724ce3d0bbc247e96fd1");
        } else {
            this.af = new com.sankuai.waimai.foundation.core.lifecycle.a() { // from class: com.sankuai.waimai.business.page.home.HomePageFragment.18
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.foundation.core.lifecycle.a
                public final void onAppToForeground(Activity activity) {
                    Object[] objArr4 = {activity};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "921eb19d91f7cfa22ea6d0d4de50bab9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "921eb19d91f7cfa22ea6d0d4de50bab9");
                    } else {
                        HomePageFragment.this.x = System.currentTimeMillis();
                    }
                }

                @Override // com.sankuai.waimai.foundation.core.lifecycle.a
                public final void onAppToBackground(Activity activity) {
                    Object[] objArr4 = {activity};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ddba29664ed72fdfe535ab274b1e4147", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ddba29664ed72fdfe535ab274b1e4147");
                    } else {
                        HomePageFragment.this.w = System.currentTimeMillis();
                    }
                }
            };
            com.sankuai.waimai.foundation.core.lifecycle.b.a().a(this.af);
        }
        this.ag = (PouchViewModel) q.a(getActivity()).a(PouchViewModel.class);
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        ViewGroup viewGroup2;
        com.sankuai.waimai.business.page.common.view.listfloat.g gVar;
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8e1788b26538f084df2e4e289d18487", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8e1788b26538f084df2e4e289d18487");
        }
        m.a().a("HomeViewInflate+");
        if (com.sankuai.waimai.business.page.common.abtest.a.b) {
            viewGroup2 = (ViewGroup) com.sankuai.waimai.business.page.home.utils.e.a().b;
            com.sankuai.waimai.business.page.home.utils.e.a().b();
            if (viewGroup2 == null) {
                com.sankuai.waimai.foundation.utils.log.a.e("WMHomePagePageRouteHand", "PageFragment View create", new Object[0]);
                viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.wm_page_home_fragment_layout, viewGroup, false);
            } else {
                com.sankuai.waimai.foundation.utils.log.a.e("WMHomePagePageRouteHand", "PageFragment View cache", new Object[0]);
            }
            com.sankuai.waimai.foundation.utils.log.a.e("WMHomePagePageRouteHand", "PageFragment View end", new Object[0]);
        } else {
            viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.wm_page_home_fragment_layout, viewGroup, false);
        }
        ViewGroup viewGroup3 = viewGroup2;
        m.a().a("HomeViewInflate-");
        HomeGrayManager.a().a(viewGroup3, 2, 0, "", 0);
        this.h.e = new a();
        Object[] objArr2 = {viewGroup3};
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f11aed1701502b814b2942ee23dd87c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f11aed1701502b814b2942ee23dd87c6");
        } else {
            final com.sankuai.waimai.business.page.home.e eVar = this.k;
            Object[] objArr3 = {viewGroup3};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.home.e.a;
            if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "14bdb64aa76003d50ce5db445fdc561b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "14bdb64aa76003d50ce5db445fdc561b");
            } else {
                eVar.e = viewGroup3;
                if (!com.sankuai.waimai.foundation.core.a.d()) {
                    ImageView imageView = (ImageView) viewGroup3.findViewById(R.id.progress_info);
                    ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                    layoutParams.width = com.sankuai.waimai.foundation.utils.g.a(com.meituan.android.singleton.b.a, 26.0f);
                    layoutParams.height = com.sankuai.waimai.foundation.utils.g.a(com.meituan.android.singleton.b.a, 26.0f);
                    imageView.setLayoutParams(layoutParams);
                }
                eVar.c = new com.sankuai.waimai.platform.widget.emptylayout.d(viewGroup3);
                com.sankuai.waimai.platform.widget.emptylayout.d dVar = eVar.c;
                com.sankuai.waimai.foundation.core.a.d();
                dVar.ag = false;
                eVar.c.a("c_m84bv26");
                eVar.c.b(R.string.wm_page_poiList_progressbar_loading);
                eVar.c.a(com.sankuai.waimai.platform.widget.emptylayout.d.m, R.string.wm_page_poiList_no_poi, 0, 0, (View.OnClickListener) null);
                eVar.c.c(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.e.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr4 = {view};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "5cf1ebcfcf7348d3811c4b35c82d9329", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "5cf1ebcfcf7348d3811c4b35c82d9329");
                            return;
                        }
                        if (view.getId() == R.id.btn_info_right) {
                            JudasManualManager.a("b_waimai_fgypm096_mc").a("c_m84bv26").a(eVar.b).a();
                        }
                        e.b(eVar);
                    }
                });
                eVar.c.a(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.e.7
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr4 = {view};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f6a9be1d707d85296c50e61d0b52b0e0", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f6a9be1d707d85296c50e61d0b52b0e0");
                            return;
                        }
                        JudasManualManager.a("b_waimai_aqzbjnge_mc").a("c_m84bv26").a(eVar.b).a();
                        i.d(new com.sankuai.waimai.business.page.common.log.a().a("waimai_locate_manually_service").b("0").b());
                        HomePageViewModel homePageViewModel = (HomePageViewModel) q.a(eVar.b).a(HomePageViewModel.class);
                        homePageViewModel.N = true;
                        homePageViewModel.O = true;
                        ((HomeActionBarViewModel) q.a(eVar.b).a(HomeActionBarViewModel.class)).a(eVar.b.F);
                    }
                }, new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.e.8
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr4 = {view};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9c25d608def23548449626077c352269", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9c25d608def23548449626077c352269");
                        } else {
                            eVar.a();
                        }
                    }
                });
            }
            this.D = (ViewGroup) viewGroup3.findViewById(R.id.wm_page_main_home);
            this.I = (ViewGroup) viewGroup3.findViewById(R.id.floating_container);
            this.e = (HomePageNestedScrollRecyclerView) viewGroup3.findViewById(R.id.nested_scroll_recycler_view);
            this.e.setFocusable(true);
            this.e.setFocusableInTouchMode(true);
            this.e.requestFocus();
            this.e.setOnNestedScrollListener(new b());
            this.f = (HomePullToRefreshView) viewGroup3.findViewById(R.id.pull_to_refresh_view);
            this.g = new f();
            this.f.a(this.g);
            this.J = (ViewGroup) this.D.findViewById(R.id.action_bar_background);
            this.K = (ViewGroup) this.D.findViewById(R.id.action_bar_background_elderly);
            this.L = (ViewGroup) this.D.findViewById(R.id.antion_bar_background_privicy);
            this.M = this.D.findViewById(R.id.fl_actionbar_bg_foreground);
            HomeGrayManager.a().a(this.K, 4, 1, "", 0);
            HomeGrayManager.a().a(this.M, 4, 1, "", 0);
            c(this.v);
            this.p = new com.sankuai.waimai.business.page.home.layer.a(this, this.m);
            final com.sankuai.waimai.business.page.home.layer.a aVar = this.p;
            Object[] objArr4 = {viewGroup3};
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.page.home.layer.a.a;
            if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "88ecc158bd483ed3815a1b237adde37f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "88ecc158bd483ed3815a1b237adde37f");
            } else {
                aVar.e.c = false;
                aVar.f = (HomePoiViewModel) q.a(aVar.c).a(HomePoiViewModel.class);
                aVar.m = viewGroup3;
                viewGroup3.findViewById(R.id.layout_to_top_img_poiList).setVisibility(8);
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.business.page.home.layer.a.a;
                if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "2b66aebef1279ed03ff1c1c5a3779e51", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "2b66aebef1279ed03ff1c1c5a3779e51");
                } else if (aVar.k == null) {
                    aVar.k = new IntelligentEntranceBlock(aVar.c.F, AppUtil.generatePageInfoKey(aVar.c));
                    IntelligentEntranceBlock intelligentEntranceBlock = aVar.k;
                    View view = aVar.m;
                    Object[] objArr6 = {view};
                    ChangeQuickRedirect changeQuickRedirect6 = IntelligentEntranceBlock.a;
                    if (PatchProxy.isSupport(objArr6, intelligentEntranceBlock, changeQuickRedirect6, false, "affb17074850f824738fbcb93c60d061", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, intelligentEntranceBlock, changeQuickRedirect6, false, "affb17074850f824738fbcb93c60d061");
                    } else {
                        intelligentEntranceBlock.c = view;
                        intelligentEntranceBlock.e = (RelativeLayout) intelligentEntranceBlock.c.findViewById(R.id.layer_intelligent_entrance);
                        intelligentEntranceBlock.f = (ImageView) intelligentEntranceBlock.c.findViewById(R.id.intelligent_entrance_icon);
                        Object[] objArr7 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect7 = IntelligentEntranceBlock.a;
                        if (PatchProxy.isSupport(objArr7, intelligentEntranceBlock, changeQuickRedirect7, false, "26454a8ea9a143c5cfa8484b0f43154d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, intelligentEntranceBlock, changeQuickRedirect7, false, "26454a8ea9a143c5cfa8484b0f43154d");
                        } else {
                            intelligentEntranceBlock.g = new com.sankuai.waimai.business.page.common.view.listfloat.e(intelligentEntranceBlock.e, intelligentEntranceBlock.b);
                        }
                    }
                }
                Object[] objArr8 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.waimai.business.page.home.layer.a.a;
                if (PatchProxy.isSupport(objArr8, aVar, changeQuickRedirect8, false, "0d2d157e404faad9b75916832e90556e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr8, aVar, changeQuickRedirect8, false, "0d2d157e404faad9b75916832e90556e");
                } else {
                    aVar.p = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(aVar.c.getContext(), "global_shopping_cart_entrance_switch", true);
                    if (aVar.p) {
                        aVar.m.findViewById(R.id.layout_global_cart).setVisibility(0);
                        if (aVar.h == null) {
                            aVar.h = new com.sankuai.waimai.business.page.common.view.listfloat.c(aVar.c.F);
                            aVar.h.a(aVar.m);
                            aVar.h.a(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.layer.a.8
                                public static ChangeQuickRedirect a;

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    Object[] objArr9 = {view2};
                                    ChangeQuickRedirect changeQuickRedirect9 = a;
                                    if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "dda1d7c73fb018988a6bb276b141d3fc", 4611686018427387906L)) {
                                        PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "dda1d7c73fb018988a6bb276b141d3fc");
                                    } else {
                                        aVar.h.a(AppUtil.generatePageInfoKey(aVar.c));
                                    }
                                }
                            });
                        }
                    } else {
                        aVar.m.findViewById(R.id.layout_global_cart).setVisibility(8);
                    }
                }
                Object[] objArr9 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect9 = com.sankuai.waimai.business.page.home.layer.a.a;
                if (PatchProxy.isSupport(objArr9, aVar, changeQuickRedirect9, false, "c89dab9e6a1e415c8c690cdd1f490526", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr9, aVar, changeQuickRedirect9, false, "c89dab9e6a1e415c8c690cdd1f490526");
                } else {
                    aVar.m.findViewById(R.id.quality_tag_container).setVisibility(com.sankuai.waimai.foundation.core.a.d() ? 0 : 8);
                    if (aVar.i == null) {
                        Activity activity = aVar.c.F;
                        final View view2 = aVar.m;
                        Object[] objArr10 = {activity, view2};
                        ChangeQuickRedirect changeQuickRedirect10 = com.sankuai.waimai.business.page.common.view.listfloat.h.a;
                        if (PatchProxy.isSupport(objArr10, null, changeQuickRedirect10, true, "11c155fa50c45c29e1154b26719d1cae", RobustBitConfig.DEFAULT_VALUE)) {
                            gVar = (com.sankuai.waimai.business.page.common.view.listfloat.g) PatchProxy.accessDispatch(objArr10, null, changeQuickRedirect10, true, "11c155fa50c45c29e1154b26719d1cae");
                        } else {
                            com.sankuai.waimai.business.page.common.view.listfloat.g gVar2 = new com.sankuai.waimai.business.page.common.view.listfloat.g(activity);
                            gVar2.a(view2);
                            gVar2.a(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.common.view.listfloat.h.1
                                public static ChangeQuickRedirect a;

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    Object[] objArr11 = {view3};
                                    ChangeQuickRedirect changeQuickRedirect11 = a;
                                    if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "78fb2a2192f7706a0a789c5b8a0177b4", 4611686018427387906L)) {
                                        PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "78fb2a2192f7706a0a789c5b8a0177b4");
                                    } else {
                                        com.sankuai.waimai.foundation.router.a.a(view2.getContext(), "https://rules-center.meituan.com/m?commonType=7&token=!");
                                    }
                                }
                            });
                            gVar = gVar2;
                        }
                        aVar.i = gVar;
                    }
                }
                aVar.j = new com.sankuai.waimai.business.page.common.view.listfloat.d(aVar.b);
                final com.sankuai.waimai.business.page.common.view.listfloat.d dVar2 = aVar.j;
                Object[] objArr11 = {viewGroup3};
                ChangeQuickRedirect changeQuickRedirect11 = com.sankuai.waimai.business.page.common.view.listfloat.d.a;
                if (PatchProxy.isSupport(objArr11, dVar2, changeQuickRedirect11, false, "f58295f59484cb14d272848d6b9ca715", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr11, dVar2, changeQuickRedirect11, false, "f58295f59484cb14d272848d6b9ca715");
                } else {
                    dVar2.b = viewGroup3;
                    dVar2.d = (LinearLayout) dVar2.b.findViewById(R.id.wm_page_main_globalcart_multi_order_layout);
                    dVar2.e = (RelativeLayout) dVar2.b.findViewById(R.id.layout_global_cart);
                    dVar2.f = (TextView) dVar2.b.findViewById(R.id.wm_page_main_globalcart_multi_order_guide_info);
                    Object[] objArr12 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect12 = com.sankuai.waimai.business.page.common.view.listfloat.d.a;
                    if (PatchProxy.isSupport(objArr12, dVar2, changeQuickRedirect12, false, "c87ded37d1bdf7a501d3383af242b384", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr12, dVar2, changeQuickRedirect12, false, "c87ded37d1bdf7a501d3383af242b384");
                    } else if (dVar2.d != null) {
                        dVar2.d.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.common.view.listfloat.d.3
                            public static ChangeQuickRedirect a;

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view3) {
                                Object[] objArr13 = {view3};
                                ChangeQuickRedirect changeQuickRedirect13 = a;
                                if (PatchProxy.isSupport(objArr13, this, changeQuickRedirect13, false, "e6b30e6b42c75c9233f4540cd6ddf642", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect13, false, "e6b30e6b42c75c9233f4540cd6ddf642");
                                } else {
                                    GlobalCartManager.toGlobalCartActivity(dVar2.c);
                                }
                            }
                        });
                    }
                }
                aVar.l = viewGroup3.findViewById(R.id.placeholder_for_bottom_status_view);
                aVar.t = (ViewStub) viewGroup3.findViewById(R.id.layout_channel_label);
                aVar.u = new ChannelLabelController(aVar.c.F, aVar.t);
                Intent intent = aVar.c.F.getIntent();
                Object[] objArr13 = {intent};
                ChangeQuickRedirect changeQuickRedirect13 = com.sankuai.waimai.business.page.home.layer.a.a;
                if (PatchProxy.isSupport(objArr13, aVar, changeQuickRedirect13, false, "3ba245f50a243e9514c820d3d22cae54", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr13, aVar, changeQuickRedirect13, false, "3ba245f50a243e9514c820d3d22cae54");
                } else if (com.sankuai.waimai.foundation.router.a.a(intent)) {
                    aVar.s = com.sankuai.waimai.platform.domain.core.channel.a.a(com.sankuai.waimai.foundation.router.a.a(intent, "ch_ad_params", ""));
                    aVar.a();
                }
                com.sankuai.waimai.business.page.home.helper.c.a().a(17, aVar.r);
                aVar.g = new com.sankuai.waimai.business.page.home.layer.fault.a(aVar.c, aVar.m);
                aVar.q = new com.sankuai.waimai.business.page.home.head.market.a(aVar.c);
                aVar.q.a(viewGroup3);
                Object[] objArr14 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect14 = com.sankuai.waimai.business.page.home.layer.a.a;
                if (PatchProxy.isSupport(objArr14, aVar, changeQuickRedirect14, false, "4d925687bcd073cec3d825d39679d556", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr14, aVar, changeQuickRedirect14, false, "4d925687bcd073cec3d825d39679d556");
                } else {
                    aVar.d.g.a(aVar.c, new l<Integer>() { // from class: com.sankuai.waimai.business.page.home.layer.a.1
                        public static ChangeQuickRedirect a;

                        @Override // android.arch.lifecycle.l
                        public final /* synthetic */ void a(@Nullable Integer num) {
                            Integer num2 = num;
                            Object[] objArr15 = {num2};
                            ChangeQuickRedirect changeQuickRedirect15 = a;
                            if (PatchProxy.isSupport(objArr15, this, changeQuickRedirect15, false, "a68537d80e3b51cf663c6be175bb0a7b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr15, this, changeQuickRedirect15, false, "a68537d80e3b51cf663c6be175bb0a7b");
                            } else if (num2 != null) {
                                com.sankuai.waimai.business.page.home.list.a.a().e = num2.intValue();
                                a aVar2 = aVar;
                                int intValue = num2.intValue();
                                Object[] objArr16 = {Integer.valueOf(intValue)};
                                ChangeQuickRedirect changeQuickRedirect16 = a.a;
                                if (PatchProxy.isSupport(objArr16, aVar2, changeQuickRedirect16, false, "b71363ed5d77ebf2eaec8f01f65991e6", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr16, aVar2, changeQuickRedirect16, false, "b71363ed5d77ebf2eaec8f01f65991e6");
                                    return;
                                }
                                int e2 = com.sankuai.waimai.platform.capacity.immersed.a.a(aVar2.c.F) ? com.sankuai.waimai.foundation.utils.g.e(aVar2.c.F) : 0;
                                int dimensionPixelSize = aVar2.c.getResources().getDimensionPixelSize(R.dimen.wm_page_home_tab_layout_height);
                                int a2 = com.sankuai.waimai.foundation.utils.g.a(aVar2.c.F, 1.0f);
                                HomePoiViewModel homePoiViewModel = aVar2.f;
                                int b2 = intValue - (((aVar2.b() + e2) + dimensionPixelSize) + a2);
                                Object[] objArr17 = {Integer.valueOf(b2)};
                                ChangeQuickRedirect changeQuickRedirect17 = HomePoiViewModel.a;
                                if (PatchProxy.isSupport(objArr17, homePoiViewModel, changeQuickRedirect17, false, "0fa044bdfd19bf5bad82b1a93c4f1063", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr17, homePoiViewModel, changeQuickRedirect17, false, "0fa044bdfd19bf5bad82b1a93c4f1063");
                                } else {
                                    homePoiViewModel.b.b((k<Integer>) Integer.valueOf(b2));
                                }
                            }
                        }
                    });
                    aVar.d.f.a(new l<d.a>() { // from class: com.sankuai.waimai.business.page.home.layer.a.2
                        public static ChangeQuickRedirect a;

                        @Override // android.arch.lifecycle.l
                        public final /* synthetic */ void a(@Nullable d.a aVar2) {
                            d.a aVar3 = aVar2;
                            Object[] objArr15 = {aVar3};
                            ChangeQuickRedirect changeQuickRedirect15 = a;
                            if (PatchProxy.isSupport(objArr15, this, changeQuickRedirect15, false, "47c7b36f1b0c99786a57264fe02dc745", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr15, this, changeQuickRedirect15, false, "47c7b36f1b0c99786a57264fe02dc745");
                            } else if (aVar3 != null) {
                                switch (AnonymousClass9.a[aVar3.ordinal()]) {
                                    case 1:
                                        return;
                                    case 2:
                                        a aVar4 = aVar;
                                        boolean isHidden = aVar.c.isHidden();
                                        Object[] objArr16 = {Byte.valueOf(isHidden ? (byte) 1 : (byte) 0)};
                                        ChangeQuickRedirect changeQuickRedirect16 = a.a;
                                        if (PatchProxy.isSupport(objArr16, aVar4, changeQuickRedirect16, false, "b4a74ec11eece49c9a789e4b2f9db1f3", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr16, aVar4, changeQuickRedirect16, false, "b4a74ec11eece49c9a789e4b2f9db1f3");
                                            return;
                                        }
                                        if (aVar4.h != null) {
                                            aVar4.h.b(AppUtil.generatePageInfoKey(aVar4.c));
                                        }
                                        if (aVar4.i != null) {
                                            com.sankuai.waimai.business.page.common.view.listfloat.g gVar3 = aVar4.i;
                                            Object[] objArr17 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect17 = com.sankuai.waimai.business.page.common.view.listfloat.g.f;
                                            if (PatchProxy.isSupport(objArr17, gVar3, changeQuickRedirect17, false, "0a28f9f9853f6227f0abc1ccbd1375a9", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr17, gVar3, changeQuickRedirect17, false, "0a28f9f9853f6227f0abc1ccbd1375a9");
                                            } else {
                                                Object[] objArr18 = new Object[0];
                                                ChangeQuickRedirect changeQuickRedirect18 = com.sankuai.waimai.business.page.common.view.listfloat.g.f;
                                                if (PatchProxy.isSupport(objArr18, gVar3, changeQuickRedirect18, false, "38a2e4ba9fd64a2e0bd56c4631874874", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr18, gVar3, changeQuickRedirect18, false, "38a2e4ba9fd64a2e0bd56c4631874874");
                                                } else {
                                                    gVar3.a();
                                                }
                                            }
                                        }
                                        if (aVar4.k != null) {
                                            IntelligentEntranceBlock intelligentEntranceBlock2 = aVar4.k;
                                            Object[] objArr19 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect19 = IntelligentEntranceBlock.a;
                                            if (PatchProxy.isSupport(objArr19, intelligentEntranceBlock2, changeQuickRedirect19, false, "38922a3bdca61b0a0b78390b8f34f0ae", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr19, intelligentEntranceBlock2, changeQuickRedirect19, false, "38922a3bdca61b0a0b78390b8f34f0ae");
                                            } else {
                                                com.meituan.android.bus.a.a().a(intelligentEntranceBlock2);
                                                Object[] objArr20 = new Object[0];
                                                ChangeQuickRedirect changeQuickRedirect20 = IntelligentEntranceBlock.a;
                                                if (PatchProxy.isSupport(objArr20, intelligentEntranceBlock2, changeQuickRedirect20, false, "b9fda1602ce4451c353b70f4e923cade", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr20, intelligentEntranceBlock2, changeQuickRedirect20, false, "b9fda1602ce4451c353b70f4e923cade");
                                                } else {
                                                    intelligentEntranceBlock2.d = (com.sankuai.waimai.business.page.common.list.model.c) com.sankuai.waimai.platform.capacity.persistent.sp.a.a((Context) intelligentEntranceBlock2.b, "zim-intelligent_floating_layer", (Class<Object>) com.sankuai.waimai.business.page.common.list.model.c.class);
                                                }
                                                intelligentEntranceBlock2.a();
                                            }
                                        }
                                        f a2 = f.a();
                                        Object[] objArr21 = {Byte.valueOf(isHidden ? (byte) 1 : (byte) 0)};
                                        ChangeQuickRedirect changeQuickRedirect21 = f.a;
                                        if (PatchProxy.isSupport(objArr21, a2, changeQuickRedirect21, false, "daa9bfe81ef87961b47e60f40aa14436", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr21, a2, changeQuickRedirect21, false, "daa9bfe81ef87961b47e60f40aa14436");
                                            return;
                                        } else if (isHidden) {
                                            return;
                                        } else {
                                            if (!com.sankuai.waimai.foundation.core.lifecycle.b.a().c) {
                                                a2.c = false;
                                            } else if (f.a().c) {
                                                WMSkyFallPopup wMSkyFallPopup = WMSkyFallPopup.getInstance();
                                                if (wMSkyFallPopup != null) {
                                                    wMSkyFallPopup.setState(5);
                                                }
                                                com.sankuai.waimai.foundation.utils.log.a.b("WMSkyFallPopup", "have gap reset pop", new Object[0]);
                                            }
                                            f.a().e = false;
                                            return;
                                        }
                                    case 3:
                                        a aVar5 = aVar;
                                        Object[] objArr22 = {Byte.valueOf(aVar.c.isHidden() ? (byte) 1 : (byte) 0)};
                                        ChangeQuickRedirect changeQuickRedirect22 = a.a;
                                        if (PatchProxy.isSupport(objArr22, aVar5, changeQuickRedirect22, false, "ae0c27d68180885a76b66f77e1b808f5", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr22, aVar5, changeQuickRedirect22, false, "ae0c27d68180885a76b66f77e1b808f5");
                                            return;
                                        } else if (aVar5.k != null) {
                                            IntelligentEntranceBlock intelligentEntranceBlock3 = aVar5.k;
                                            Object[] objArr23 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect23 = IntelligentEntranceBlock.a;
                                            if (PatchProxy.isSupport(objArr23, intelligentEntranceBlock3, changeQuickRedirect23, false, "a3fbfa1b8443b9e124c16ec588ab9b69", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr23, intelligentEntranceBlock3, changeQuickRedirect23, false, "a3fbfa1b8443b9e124c16ec588ab9b69");
                                                return;
                                            } else {
                                                com.meituan.android.bus.a.a().b(intelligentEntranceBlock3);
                                                return;
                                            }
                                        } else {
                                            return;
                                        }
                                    case 4:
                                        a aVar6 = aVar;
                                        Object[] objArr24 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect24 = a.a;
                                        if (PatchProxy.isSupport(objArr24, aVar6, changeQuickRedirect24, false, "263174009824c8f79acff7ce4d67e508", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr24, aVar6, changeQuickRedirect24, false, "263174009824c8f79acff7ce4d67e508");
                                            return;
                                        }
                                        f a3 = f.a();
                                        Object[] objArr25 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect25 = f.a;
                                        if (PatchProxy.isSupport(objArr25, a3, changeQuickRedirect25, false, "a5c85f1fca4477b1b2cdaa6646abc97d", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr25, a3, changeQuickRedirect25, false, "a5c85f1fca4477b1b2cdaa6646abc97d");
                                        } else {
                                            a3.c = false;
                                        }
                                        com.sankuai.waimai.business.page.home.helper.c.a().a(aVar6.r);
                                        if (WMSkyFallPopup.getInstance() != null) {
                                            WMSkyFallPopup.getInstance().closeDialog();
                                            return;
                                        }
                                        return;
                                    default:
                                        return;
                                }
                            }
                        }
                    });
                    aVar.d.d.a(new l<Boolean>() { // from class: com.sankuai.waimai.business.page.home.layer.a.3
                        public static ChangeQuickRedirect a;

                        @Override // android.arch.lifecycle.l
                        public final /* synthetic */ void a(@Nullable Boolean bool) {
                            Boolean bool2 = bool;
                            Object[] objArr15 = {bool2};
                            ChangeQuickRedirect changeQuickRedirect15 = a;
                            if (PatchProxy.isSupport(objArr15, this, changeQuickRedirect15, false, "809b784250e4d3f67378aa1f7bfc29a9", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr15, this, changeQuickRedirect15, false, "809b784250e4d3f67378aa1f7bfc29a9");
                            } else if (bool2 != null) {
                                final a aVar2 = aVar;
                                boolean booleanValue = bool2.booleanValue();
                                Object[] objArr16 = {Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)};
                                ChangeQuickRedirect changeQuickRedirect16 = a.a;
                                if (PatchProxy.isSupport(objArr16, aVar2, changeQuickRedirect16, false, "d0a6481de6784f1a7b13f5c12f6aa06a", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr16, aVar2, changeQuickRedirect16, false, "d0a6481de6784f1a7b13f5c12f6aa06a");
                                    return;
                                }
                                com.sankuai.waimai.foundation.utils.log.a.b("FutureMachReporter", "visible:   " + booleanValue + "  " + aVar2.d.T, new Object[0]);
                                if (booleanValue && aVar2.o != null) {
                                    if (aVar2.d == null || !aVar2.d.T) {
                                        aVar2.o.d();
                                        aVar2.o.c();
                                        new Handler().postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.page.home.layer.a.7
                                            public static ChangeQuickRedirect a;

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                Object[] objArr17 = new Object[0];
                                                ChangeQuickRedirect changeQuickRedirect17 = a;
                                                if (PatchProxy.isSupport(objArr17, this, changeQuickRedirect17, false, "4563272af1b81497823e3c2d049c93b4", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr17, this, changeQuickRedirect17, false, "4563272af1b81497823e3c2d049c93b4");
                                                } else if (aVar2.d != null && aVar2.d.T) {
                                                    aVar2.d.T = false;
                                                } else {
                                                    com.sankuai.waimai.business.page.home.expose.b bVar = aVar2.o;
                                                    f.a aVar3 = new f.a(f.b.EXPOSE);
                                                    aVar3.c = true;
                                                    bVar.a(aVar3.a());
                                                }
                                            }
                                        }, 200L);
                                    } else {
                                        aVar2.d.T = false;
                                    }
                                }
                                if (!booleanValue && aVar2.u != null) {
                                    aVar2.u.b();
                                }
                                if (WMSkyFallPopup.getInstance() != null) {
                                    WMSkyFallPopup.getInstance().setDialogCanShow(booleanValue);
                                }
                            }
                        }
                    });
                    aVar.d.n.a(aVar.c, new l<b.a>() { // from class: com.sankuai.waimai.business.page.home.layer.a.4
                        public static ChangeQuickRedirect a;

                        @Override // android.arch.lifecycle.l
                        public final /* synthetic */ void a(@Nullable b.a aVar2) {
                            b.a aVar3 = aVar2;
                            Object[] objArr15 = {aVar3};
                            ChangeQuickRedirect changeQuickRedirect15 = a;
                            if (PatchProxy.isSupport(objArr15, this, changeQuickRedirect15, false, "afd8700c401df3c973e7de176daa38a1", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr15, this, changeQuickRedirect15, false, "afd8700c401df3c973e7de176daa38a1");
                            } else if (aVar3 != null) {
                                a aVar4 = aVar;
                                Object[] objArr16 = {aVar3};
                                ChangeQuickRedirect changeQuickRedirect16 = a.a;
                                if (PatchProxy.isSupport(objArr16, aVar4, changeQuickRedirect16, false, "28f944374e02fea4e8789780515d4be6", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr16, aVar4, changeQuickRedirect16, false, "28f944374e02fea4e8789780515d4be6");
                                } else if (aVar3 == b.a.LOGOUT) {
                                    aVar4.a(false);
                                }
                            }
                        }
                    });
                    aVar.d.e.a(aVar.c, new l<Boolean>() { // from class: com.sankuai.waimai.business.page.home.layer.a.5
                        public static ChangeQuickRedirect a;

                        @Override // android.arch.lifecycle.l
                        public final /* synthetic */ void a(@Nullable Boolean bool) {
                            Boolean bool2 = bool;
                            Object[] objArr15 = {bool2};
                            ChangeQuickRedirect changeQuickRedirect15 = a;
                            if (PatchProxy.isSupport(objArr15, this, changeQuickRedirect15, false, "461b0410424c7d39cf67fba9ea66a213", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr15, this, changeQuickRedirect15, false, "461b0410424c7d39cf67fba9ea66a213");
                            } else if (bool2.booleanValue()) {
                                com.sankuai.waimai.popup.f.a().e = true;
                            } else if (com.sankuai.waimai.popup.f.a().c) {
                                WMSkyFallPopup wMSkyFallPopup = WMSkyFallPopup.getInstance();
                                if (wMSkyFallPopup != null) {
                                    wMSkyFallPopup.setState(5);
                                    com.sankuai.waimai.foundation.utils.log.a.b("WMSkyFallPopup", "have gap reset pop", new Object[0]);
                                }
                                e.a().b();
                            }
                        }
                    });
                }
            }
            this.h.d = new c();
            this.D.getViewTreeObserver().addOnGlobalLayoutListener(this.aj);
            this.r = new PreLoadLinearLayoutManager(getContext(), 1, false);
            this.e.setLayoutManager(this.r);
            this.U = new com.sankuai.waimai.business.page.home.basal.a(this, this.k, this.e);
            this.e.setAdapter(this.U);
            this.X.y = this.e;
            this.D.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.sankuai.waimai.business.page.home.HomePageFragment.4
                public static ChangeQuickRedirect a;

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    Object[] objArr15 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect15 = a;
                    if (PatchProxy.isSupport(objArr15, this, changeQuickRedirect15, false, "fdc8681d3bc63695c8a008d663daf31b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr15, this, changeQuickRedirect15, false, "fdc8681d3bc63695c8a008d663daf31b");
                    } else if (HomePageFragment.this.D.getBottom() > 0) {
                        Rect a2 = ah.a(HomePageFragment.this.D);
                        HomePageViewModel homePageViewModel = HomePageFragment.this.m;
                        Object[] objArr16 = {a2};
                        ChangeQuickRedirect changeQuickRedirect16 = HomePageViewModel.a;
                        if (PatchProxy.isSupport(objArr16, homePageViewModel, changeQuickRedirect16, false, "5b2b791ad2b7c679f8dc5a5b58c4f7e4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr16, homePageViewModel, changeQuickRedirect16, false, "5b2b791ad2b7c679f8dc5a5b58c4f7e4");
                        } else {
                            homePageViewModel.p.b((k<Rect>) a2);
                        }
                        HomePageFragment.this.D.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                }
            });
            this.q = new com.sankuai.waimai.business.page.home.head.promotion.a(this);
            this.q.a(viewGroup3);
        }
        com.sankuai.waimai.business.page.home.b bVar = this.i;
        Object[] objArr15 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect15 = com.sankuai.waimai.business.page.home.b.a;
        if (PatchProxy.isSupport(objArr15, bVar, changeQuickRedirect15, false, "942c5d25ca333d98c88cb42102c34917", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr15, bVar, changeQuickRedirect15, false, "942c5d25ca333d98c88cb42102c34917");
        } else {
            final com.sankuai.waimai.business.page.home.a aVar2 = bVar.b.l;
            Object[] objArr16 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect16 = com.sankuai.waimai.business.page.home.a.a;
            if (PatchProxy.isSupport(objArr16, aVar2, changeQuickRedirect16, false, "a1b0f109aeca423e40217cf04b1c7155", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr16, aVar2, changeQuickRedirect16, false, "a1b0f109aeca423e40217cf04b1c7155");
            } else {
                if ((PreloadDataModel.get().getLocation().c == com.sankuai.waimai.business.page.home.preload.d.b) || !com.sankuai.waimai.business.page.common.util.d.a(PreloadDataModel.get().getLocation().a())) {
                    aVar2.c.k.d();
                }
                aVar2.d = new l<WMLocation>() { // from class: com.sankuai.waimai.business.page.home.a.1
                    public static ChangeQuickRedirect a;

                    @Override // android.arch.lifecycle.l
                    public final /* synthetic */ void a(@Nullable WMLocation wMLocation) {
                        WMLocation wMLocation2 = wMLocation;
                        Object[] objArr17 = {wMLocation2};
                        ChangeQuickRedirect changeQuickRedirect17 = a;
                        if (PatchProxy.isSupport(objArr17, this, changeQuickRedirect17, false, "d1478ac981bb9453f217fa3d10b09f83", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr17, this, changeQuickRedirect17, false, "d1478ac981bb9453f217fa3d10b09f83");
                        } else if (com.sankuai.waimai.business.page.common.util.d.a(wMLocation2)) {
                            a.this.c.j.b(wMLocation2);
                        }
                    }
                };
                PreloadDataModel.get().getLocation().a(aVar2.d);
                aVar2.e = new l<WmAddress>() { // from class: com.sankuai.waimai.business.page.home.a.2
                    public static ChangeQuickRedirect a;

                    @Override // android.arch.lifecycle.l
                    public final /* synthetic */ void a(@Nullable WmAddress wmAddress) {
                        WmAddress wmAddress2 = wmAddress;
                        Object[] objArr17 = {wmAddress2};
                        ChangeQuickRedirect changeQuickRedirect17 = a;
                        if (PatchProxy.isSupport(objArr17, this, changeQuickRedirect17, false, "ee7c4a381b5d247cb7419a458d85eeaf", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr17, this, changeQuickRedirect17, false, "ee7c4a381b5d247cb7419a458d85eeaf");
                        } else {
                            a.a(a.this, wmAddress2);
                        }
                    }
                };
                PreloadDataModel.get().getAddress().a(aVar2.e);
                aVar2.f = new l<RcmdNetBean>() { // from class: com.sankuai.waimai.business.page.home.a.3
                    public static ChangeQuickRedirect a;

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // android.arch.lifecycle.l
                    public final /* synthetic */ void a(@Nullable RcmdNetBean rcmdNetBean) {
                        RcmdNetBean rcmdNetBean2 = rcmdNetBean;
                        Object[] objArr17 = {rcmdNetBean2};
                        ChangeQuickRedirect changeQuickRedirect17 = a;
                        if (PatchProxy.isSupport(objArr17, this, changeQuickRedirect17, false, "d83f3e1e3a0ac13038f4ab9a94d60ae9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr17, this, changeQuickRedirect17, false, "d83f3e1e3a0ac13038f4ab9a94d60ae9");
                            return;
                        }
                        if (a.this.c != null) {
                            HomePageFragment homePageFragment = a.this.c;
                            Object[] objArr18 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect18 = HomePageFragment.d;
                            if (PatchProxy.isSupport(objArr18, homePageFragment, changeQuickRedirect18, false, "3508e00fbf22feec735b6753b02a281a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr18, homePageFragment, changeQuickRedirect18, false, "3508e00fbf22feec735b6753b02a281a");
                            } else {
                                homePageFragment.g();
                                homePageFragment.d();
                            }
                        }
                        if (rcmdNetBean2 != null && rcmdNetBean2.getStatus() == 1) {
                            com.sankuai.waimai.business.page.home.utils.f.a();
                            a.this.c.h.a((BaseResponse<String>) (rcmdNetBean2.getResponse() != null ? rcmdNetBean2.getResponse() : null), rcmdNetBean2.getSourceTag());
                            a.this.c.b();
                            if (!TextUtils.isEmpty(rcmdNetBean2.getRankListId())) {
                                ListIDHelper.a.a.a("page", com.sankuai.waimai.business.page.home.utils.k.b, rcmdNetBean2.getRankListId());
                                ListIDHelper.a.a.a("page", com.sankuai.waimai.business.page.home.utils.k.a, rcmdNetBean2.getRankListId());
                            }
                            if (a.b) {
                                return;
                            }
                            a.b = true;
                            if (com.sankuai.waimai.platform.domain.manager.user.a.i().a()) {
                                com.sankuai.waimai.globalcart.biz.a.a().b();
                            }
                        } else if (rcmdNetBean2 == null || rcmdNetBean2.getStatus() == 2) {
                            a.this.c.h.a((Throwable) null, rcmdNetBean2 == null ? null : rcmdNetBean2.getThrowable());
                            com.sankuai.waimai.business.page.home.utils.f.a();
                        }
                    }
                };
                PreloadDataModel.get().getRcmdResponse().a(aVar2.f);
                aVar2.g = new l<NetBean>() { // from class: com.sankuai.waimai.business.page.home.a.4
                    public static ChangeQuickRedirect a;

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // android.arch.lifecycle.l
                    public final /* synthetic */ void a(@Nullable NetBean netBean) {
                        NetBean netBean2 = netBean;
                        Object[] objArr17 = {netBean2};
                        ChangeQuickRedirect changeQuickRedirect17 = a;
                        if (PatchProxy.isSupport(objArr17, this, changeQuickRedirect17, false, "cdf0bc49e20c38d355aa9b4cd0b4b2fb", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr17, this, changeQuickRedirect17, false, "cdf0bc49e20c38d355aa9b4cd0b4b2fb");
                            return;
                        }
                        if (netBean2 != null && netBean2.getStatus() == 1) {
                            com.sankuai.waimai.business.page.home.utils.f.a();
                            a.this.c.h.a((BaseResponse<com.sankuai.waimai.business.page.home.model.f>) (netBean2.getResponse() != null ? netBean2.getResponse() : null));
                        } else if (netBean2 == null || netBean2.getStatus() == 2) {
                            a.this.c.h.a(netBean2 == null ? null : netBean2.getThrowable(), (Throwable) null);
                            com.sankuai.waimai.business.page.home.utils.f.a();
                        }
                    }
                };
                PreloadDataModel.get().getHomeFutureTabsResponse().a(aVar2.g);
                aVar2.h = new l<Boolean>() { // from class: com.sankuai.waimai.business.page.home.a.5
                    public static ChangeQuickRedirect a;

                    @Override // android.arch.lifecycle.l
                    public final /* synthetic */ void a(@Nullable Boolean bool) {
                        Boolean bool2 = bool;
                        Object[] objArr17 = {bool2};
                        ChangeQuickRedirect changeQuickRedirect17 = a;
                        if (PatchProxy.isSupport(objArr17, this, changeQuickRedirect17, false, "1c1b13a12507f2278821b55a2e07674f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr17, this, changeQuickRedirect17, false, "1c1b13a12507f2278821b55a2e07674f");
                        } else if (bool2 == null || !bool2.booleanValue()) {
                        } else {
                            a.this.c.k.e();
                        }
                    }
                };
                PreloadDataModel.get().getLocationTimeoutState().a(aVar2.h);
                aVar2.i = new l<HomeSecondFloorResponse>() { // from class: com.sankuai.waimai.business.page.home.a.6
                    public static ChangeQuickRedirect a;

                    @Override // android.arch.lifecycle.l
                    public final /* synthetic */ void a(@Nullable HomeSecondFloorResponse homeSecondFloorResponse) {
                        HomeSecondFloorResponse homeSecondFloorResponse2 = homeSecondFloorResponse;
                        Object[] objArr17 = {homeSecondFloorResponse2};
                        ChangeQuickRedirect changeQuickRedirect17 = a;
                        if (PatchProxy.isSupport(objArr17, this, changeQuickRedirect17, false, "0599e70f5b1ce279fe18f709b855fd7e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr17, this, changeQuickRedirect17, false, "0599e70f5b1ce279fe18f709b855fd7e");
                            return;
                        }
                        com.sankuai.waimai.foundation.utils.log.a.b("SecondFloor__TASK", "AppBootHelper    接收到数据： " + homeSecondFloorResponse2, new Object[0]);
                        if (a.this.c == null || a.this.c.u == null) {
                            return;
                        }
                        a.this.c.u.a(homeSecondFloorResponse2);
                    }
                };
                com.sankuai.waimai.foundation.utils.log.a.b("SecondFloor__TASK", "AppBootHelper    添加二楼数据监听 ", new Object[0]);
                PreloadDataModel.get().getHomeSecondFloorResponse().a(aVar2.i);
                aVar2.j = new l<com.sankuai.waimai.business.page.home.model.e>() { // from class: com.sankuai.waimai.business.page.home.a.7
                    public static ChangeQuickRedirect a;

                    @Override // android.arch.lifecycle.l
                    public final /* synthetic */ void a(@Nullable com.sankuai.waimai.business.page.home.model.e eVar2) {
                        com.sankuai.waimai.business.page.home.model.e eVar3 = eVar2;
                        Object[] objArr17 = {eVar3};
                        ChangeQuickRedirect changeQuickRedirect17 = a;
                        if (PatchProxy.isSupport(objArr17, this, changeQuickRedirect17, false, "c937f3a90a98c3aba5209d2c38dda0b0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr17, this, changeQuickRedirect17, false, "c937f3a90a98c3aba5209d2c38dda0b0");
                        } else if (a.this.c != null) {
                            HeaderFloatViewModel headerFloatViewModel = (HeaderFloatViewModel) q.a(a.this.c).a(HeaderFloatViewModel.class);
                            Object[] objArr18 = {eVar3};
                            ChangeQuickRedirect changeQuickRedirect18 = HeaderFloatViewModel.a;
                            if (PatchProxy.isSupport(objArr18, headerFloatViewModel, changeQuickRedirect18, false, "97c284c2c6dc8fab9de31063523daade", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr18, headerFloatViewModel, changeQuickRedirect18, false, "97c284c2c6dc8fab9de31063523daade");
                                return;
                            }
                            headerFloatViewModel.e = eVar3;
                            headerFloatViewModel.b.b((k<com.sankuai.waimai.business.page.home.model.e>) eVar3);
                        }
                    }
                };
                PreloadDataModel.get().getHomeHeaderFloatResponse().a(aVar2.j);
                aVar2.k = new l<com.sankuai.waimai.business.page.home.model.e>() { // from class: com.sankuai.waimai.business.page.home.a.8
                    public static ChangeQuickRedirect a;

                    @Override // android.arch.lifecycle.l
                    public final /* synthetic */ void a(@Nullable com.sankuai.waimai.business.page.home.model.e eVar2) {
                        com.sankuai.waimai.business.page.home.model.e eVar3 = eVar2;
                        Object[] objArr17 = {eVar3};
                        ChangeQuickRedirect changeQuickRedirect17 = a;
                        if (PatchProxy.isSupport(objArr17, this, changeQuickRedirect17, false, "43aa00ed8d9300fb8b987e46845356b6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr17, this, changeQuickRedirect17, false, "43aa00ed8d9300fb8b987e46845356b6");
                        } else if (a.this.c != null) {
                            ((HomeSideBarViewModel) q.a(a.this.c).a(HomeSideBarViewModel.class)).a(eVar3);
                        }
                    }
                };
                PreloadDataModel.get().getHomeSideBarResponse().a(aVar2.k);
            }
            bVar.b.j.c = false;
        }
        this.N = new g.a() { // from class: com.sankuai.waimai.business.page.home.HomePageFragment.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.page.homepage.bubble.g.a
            public final void a(int i, boolean z) {
                Object[] objArr17 = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect17 = a;
                if (PatchProxy.isSupport(objArr17, this, changeQuickRedirect17, false, "d9ece61ee380e099cf13f65f0d5ff70c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr17, this, changeQuickRedirect17, false, "d9ece61ee380e099cf13f65f0d5ff70c");
                } else if (HomePageFragment.this.I == null || !z) {
                } else {
                    HomePageFragment.this.I.setPadding(0, 0, 0, com.sankuai.waimai.business.page.homepage.bubble.g.a().g());
                }
            }

            @Override // com.sankuai.waimai.business.page.homepage.bubble.g.a
            public final void b(int i, boolean z) {
                Object[] objArr17 = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect17 = a;
                if (PatchProxy.isSupport(objArr17, this, changeQuickRedirect17, false, "0c5e208e14e76e43f20f1727da93fbac", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr17, this, changeQuickRedirect17, false, "0c5e208e14e76e43f20f1727da93fbac");
                } else if (HomePageFragment.this.I != null) {
                    HomePageFragment.this.I.setPadding(0, 0, 0, 0);
                }
            }
        };
        com.sankuai.waimai.business.page.homepage.bubble.g.a().a(this.N);
        Object[] objArr17 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect17 = d;
        if (PatchProxy.isSupport(objArr17, this, changeQuickRedirect17, false, "a8cb97c2b0f3e09a5382a5c01a355c45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr17, this, changeQuickRedirect17, false, "a8cb97c2b0f3e09a5382a5c01a355c45");
        } else {
            City n = com.sankuai.waimai.foundation.location.v2.g.a().n();
            this.s = n == null ? "" : n.getCityCode();
        }
        c();
        FuTiaoMatrixView fuTiaoMatrixView = (FuTiaoMatrixView) viewGroup3.findViewById(R.id.matrix_mach_container);
        fuTiaoMatrixView.setIsHomePage(true);
        this.V = new com.sankuai.waimai.business.page.home.factory.a(fuTiaoMatrixView);
        this.W = new com.sankuai.waimai.business.page.home.layer.b(this, viewGroup3, new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.HomePageFragment.3
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                Object[] objArr18 = {view3};
                ChangeQuickRedirect changeQuickRedirect18 = a;
                if (PatchProxy.isSupport(objArr18, this, changeQuickRedirect18, false, "5b7dc914b89576aff570160598a3c24c", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr18, this, changeQuickRedirect18, false, "5b7dc914b89576aff570160598a3c24c");
                    return;
                }
                HomePageFragment.this.k.a();
                HomePageFragment.this.W.a(false);
            }
        });
        b();
        return viewGroup3;
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "982259cbd25dc32a5618430bc7a0c5be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "982259cbd25dc32a5618430bc7a0c5be");
            return;
        }
        super.onActivityCreated(bundle);
        com.sankuai.waimai.business.page.home.utils.j.a("Home-");
        y = a(getActivity());
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9ead5ce96314692e194ba52c91bfce7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9ead5ce96314692e194ba52c91bfce7");
            return;
        }
        super.onViewCreated(view, bundle);
        final com.sankuai.waimai.business.page.home.basal.a aVar = (com.sankuai.waimai.business.page.home.basal.a) this.e.getAdapter();
        this.o = new com.sankuai.waimai.business.page.home.expose.b() { // from class: com.sankuai.waimai.business.page.home.HomePageFragment.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.page.home.expose.b
            public final Rect ap_() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9dfe3d760248505ff2eed80185bec44b", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Rect) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9dfe3d760248505ff2eed80185bec44b");
                }
                if (this.g != null) {
                    return this.g;
                }
                this.g = new Rect(HomePageFragment.this.f.getLeft(), HomePageFragment.this.f.getTop() + this.f, HomePageFragment.this.f.getRight(), HomePageFragment.this.f.getBottom());
                return this.g;
            }
        };
        int e2 = (com.sankuai.waimai.platform.capacity.immersed.a.a(this.F) ? com.sankuai.waimai.foundation.utils.g.e(this.F) : 0) + this.p.b();
        this.o.b(e2);
        this.m.H = this.o;
        this.o.a((View) this.e);
        this.o.e = new b.a() { // from class: com.sankuai.waimai.business.page.home.HomePageFragment.6
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.page.home.expose.b.a
            public final void a(int i, Rect rect) {
                Object[] objArr2 = {Integer.valueOf(i), rect};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "48e94bf84cbb3e3507b963bcd6cca0d4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "48e94bf84cbb3e3507b963bcd6cca0d4");
                } else if (aVar == null) {
                } else {
                    com.meituan.android.cube.pga.block.a a2 = aVar.a(i);
                    if (a2 instanceof com.sankuai.waimai.business.page.common.arch.a) {
                        a2.a(rect);
                    } else if (a2 instanceof com.sankuai.waimai.platform.dynamic.g) {
                        a2.y();
                        HomePageFragment.this.o.b((com.sankuai.waimai.business.page.home.expose.b) Integer.valueOf(i));
                        HomePageFragment.this.T.a((com.sankuai.waimai.platform.dynamic.g) a2, rect);
                    }
                }
            }

            @Override // com.sankuai.waimai.business.page.home.expose.b.a
            public final void b(int i, Rect rect) {
                Object[] objArr2 = {Integer.valueOf(i), rect};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ccfc9377beda750c8b96882b05fc2618", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ccfc9377beda750c8b96882b05fc2618");
                    return;
                }
                com.meituan.android.cube.pga.block.a a2 = aVar.a(i);
                if (a2 instanceof com.sankuai.waimai.business.page.common.arch.a) {
                    ((com.sankuai.waimai.business.page.common.arch.a) a2).b(rect);
                } else if (a2 instanceof com.sankuai.waimai.platform.dynamic.g) {
                    com.sankuai.waimai.platform.dynamic.g gVar = (com.sankuai.waimai.platform.dynamic.g) a2;
                    Object[] objArr3 = {rect};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.platform.dynamic.g.r;
                    if (PatchProxy.isSupport(objArr3, gVar, changeQuickRedirect3, false, "ff36f6f769df136f338891c959bb5a31", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, gVar, changeQuickRedirect3, false, "ff36f6f769df136f338891c959bb5a31");
                    } else if (gVar.s != null) {
                        gVar.s.a(rect);
                        if (rect != null && gVar.t != null) {
                            if (gVar.t.getWindowVisibility() == 0 && Rect.intersects(rect, ah.a(gVar.t))) {
                                if (!gVar.v) {
                                    gVar.v = true;
                                    gVar.s.a(true);
                                    gVar.a(true);
                                }
                            } else if (gVar.v) {
                                gVar.v = false;
                                gVar.s.a(false);
                                gVar.a(false);
                            }
                        }
                    }
                    HomePageFragment.this.T.a(gVar, rect);
                }
            }
        };
        this.p.o = this.o;
        if (this.ag != null) {
            this.ag.g = e2;
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onAttach(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f5bb7f3b1364d9a9f7e052998fc6ccf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f5bb7f3b1364d9a9f7e052998fc6ccf");
            return;
        }
        super.onAttach(activity);
        com.sankuai.waimai.platform.domain.manager.user.a.i().a(this);
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdb3107f06a4902907eb62c5b1502679", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdb3107f06a4902907eb62c5b1502679");
            return;
        }
        super.onDetach();
        com.sankuai.waimai.platform.domain.manager.user.a.i().b(this);
    }

    @Override // com.sankuai.waimai.business.page.common.arch.PageFragment, com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb3f2f6103866bfc922b2f93284e5bb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb3f2f6103866bfc922b2f93284e5bb8");
            return;
        }
        super.onStart();
        this.m.a(d.a.ON_START);
    }

    @Override // com.sankuai.waimai.business.page.common.arch.PageFragment, com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "931323cdddf2eba02c0714a446aef3ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "931323cdddf2eba02c0714a446aef3ab");
            return;
        }
        super.onResume();
        this.m.b(com.sankuai.waimai.foundation.utils.g.a((Context) getActivity()));
        this.m.a(!isHidden());
        this.m.a(d.a.ON_RESUME);
        if (this.m.N && com.sankuai.waimai.foundation.location.v2.g.a().p() != null) {
            i.d(new com.sankuai.waimai.business.page.common.log.a().a("waimai_locate_manually_service").b("1").b());
            if (this.m.O) {
                LocationCatReporter.c(2000);
                com.sankuai.waimai.foundation.location.a.b(2);
                this.m.O = false;
            }
        }
        this.m.N = false;
        HomePageViewModel homePageViewModel = this.m;
        long currentTimeMillis = System.currentTimeMillis();
        Object[] objArr2 = {new Long(currentTimeMillis)};
        ChangeQuickRedirect changeQuickRedirect2 = HomePageViewModel.a;
        if (PatchProxy.isSupport(objArr2, homePageViewModel, changeQuickRedirect2, false, "8e086c24b140ac51e91debb4209f0b96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, homePageViewModel, changeQuickRedirect2, false, "8e086c24b140ac51e91debb4209f0b96");
        } else {
            homePageViewModel.R = currentTimeMillis;
        }
        if (!this.m.S) {
            com.sankuai.waimai.business.page.home.b bVar = this.i;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.home.b.a;
            if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "df7654d77d3d22f0270b4fdcc5a9fa75", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "df7654d77d3d22f0270b4fdcc5a9fa75");
            } else {
                if (bVar.c) {
                    long b2 = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(com.meituan.android.singleton.b.a.getApplicationContext(), "home_poi_list_last_refresh_time", System.currentTimeMillis());
                    if (com.sankuai.waimai.foundation.location.v2.g.a().k() != null) {
                        long lastRefreshTime = com.sankuai.waimai.foundation.location.v2.g.a().k().getLastRefreshTime();
                        bVar.f = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(com.meituan.android.singleton.b.a.getApplicationContext(), "refresh_homepage_location_interval", Long.MAX_VALUE);
                        bVar.g = com.sankuai.waimai.platform.capacity.persistent.sp.a.b((Context) bVar.b.getActivity(), "poi_list_refresh_duration", Long.MAX_VALUE);
                        if (bVar.d) {
                            bVar.g = bVar.e;
                        }
                        long currentTimeMillis2 = System.currentTimeMillis();
                        if (bVar.b.x - lastRefreshTime > bVar.f && com.sankuai.waimai.platform.model.c.a().b() != 3) {
                            bVar.b.j.a(bVar.b);
                        } else if (currentTimeMillis2 - b2 > bVar.g) {
                            bVar.a(1);
                        }
                    }
                }
                if (com.sankuai.waimai.foundation.core.a.d() && bVar.b.m != null && bVar.b.m.W) {
                    bVar.b.m.W = false;
                    if (com.sankuai.waimai.platform.capacity.persistent.sp.a.b(com.meituan.android.singleton.b.a, "smart_assistant_is_show_entrance", false)) {
                        HomePageViewModel homePageViewModel2 = bVar.b.m;
                        Object[] objArr4 = {(byte) 1};
                        ChangeQuickRedirect changeQuickRedirect4 = HomePageViewModel.a;
                        if (PatchProxy.isSupport(objArr4, homePageViewModel2, changeQuickRedirect4, false, "f56d1a9836a81d7d91f1f53a0d5de098", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, homePageViewModel2, changeQuickRedirect4, false, "f56d1a9836a81d7d91f1f53a0d5de098");
                        } else {
                            homePageViewModel2.A.b((k<Boolean>) Boolean.TRUE);
                        }
                    }
                }
            }
        } else {
            this.m.S = false;
        }
        com.sankuai.waimai.business.page.home.e eVar = this.k;
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.business.page.home.e.a;
        if (PatchProxy.isSupport(objArr5, eVar, changeQuickRedirect5, false, "ca6f43c51566902d58eb8761e84428f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, eVar, changeQuickRedirect5, false, "ca6f43c51566902d58eb8761e84428f0");
        } else {
            com.sankuai.waimai.platform.widget.emptylayout.d dVar = eVar.c;
            Object[] objArr6 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.platform.widget.emptylayout.d.c;
            if (PatchProxy.isSupport(objArr6, dVar, changeQuickRedirect6, false, "306b7315176d445e67b2e01a894b6120", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, dVar, changeQuickRedirect6, false, "306b7315176d445e67b2e01a894b6120");
            } else if (dVar.ag && ((dVar.s == d.b.DATA_ERROR || dVar.s == d.b.NET_ERROR) && dVar.aj)) {
                dVar.ah = SystemClock.elapsedRealtime();
            } else {
                dVar.aj = false;
                dVar.ah = 0L;
            }
        }
        com.sankuai.waimai.touchmatrix.rebuild.message.b.a().a(this.V);
        Object[] objArr7 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect7 = d;
        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "e839575f88af7b6391aa266d5f1a2e0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "e839575f88af7b6391aa266d5f1a2e0f");
        } else if (!this.ab || this.X == null) {
        } else {
            this.X.b();
            this.ab = false;
        }
    }

    @Override // android.support.v4.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        Object[] objArr = {configuration};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff09eb73369d161306034a297b1fde4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff09eb73369d161306034a297b1fde4c");
            return;
        }
        super.onConfigurationChanged(configuration);
        this.m.b(com.sankuai.waimai.foundation.utils.g.a((Context) getActivity()));
        if (configuration.screenWidthDp != this.am) {
            if (this.X != null) {
                RefreshHeaderHelper refreshHeaderHelper = this.X;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = RefreshHeaderHelper.a;
                if (PatchProxy.isSupport(objArr2, refreshHeaderHelper, changeQuickRedirect2, false, "29495c52e5a871a6637b1b2cfa4e9452", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, refreshHeaderHelper, changeQuickRedirect2, false, "29495c52e5a871a6637b1b2cfa4e9452");
                } else {
                    int a2 = com.sankuai.waimai.foundation.utils.g.a(com.meituan.android.singleton.b.a);
                    RefreshHeaderHelper.b = a2;
                    RefreshHeaderHelper.c = (a2 * 9) / 20;
                    RefreshHeaderHelper.d = (RefreshHeaderHelper.b * 13) / 20;
                    RefreshHeaderHelper.e = (RefreshHeaderHelper.b * 3) / 2;
                    RefreshHeaderHelper.f = RefreshHeaderHelper.b / 2;
                    refreshHeaderHelper.g = RefreshHeaderHelper.c;
                    refreshHeaderHelper.h = RefreshHeaderHelper.d;
                    refreshHeaderHelper.i = RefreshHeaderHelper.d;
                }
            }
            if (this.i != null) {
                this.i.a(0);
            }
        }
        this.am = configuration.screenWidthDp;
        y = a(getActivity());
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3104957ed998f56996ae245812ebce9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3104957ed998f56996ae245812ebce9c");
            return;
        }
        super.a(z);
        com.sankuai.waimai.foundation.utils.log.a.b("FutureMachReporter", "visible:" + z, new Object[0]);
        this.m.a(z);
        if (this.h != null) {
            this.h.j = z;
        }
        if (z) {
            if (this.C != null) {
                this.C.a(0);
            }
            if (this.A) {
                this.i.a();
            }
            if (this.Q != null) {
                com.sankuai.waimai.business.page.home.actionbar.b bVar = this.Q;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.page.home.actionbar.b.v;
                if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "883d2facb05ee65d3de918390661a899", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "883d2facb05ee65d3de918390661a899");
                } else if (bVar.w != null) {
                    bVar.w.a();
                }
            }
            if (this.R != null) {
                com.sankuai.waimai.business.page.home.actionbar.a aVar = this.R;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.home.actionbar.a.v;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "dd9db12d29b5796f35a6b87f93ca269f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "dd9db12d29b5796f35a6b87f93ca269f");
                } else if (aVar.w != null) {
                    aVar.w.a();
                }
            }
            if (this.k != null) {
                this.k.e();
            }
            com.sankuai.waimai.ai.uat.b.a().a(a.b.WMUATPageHome, this.ak);
            return;
        }
        if (this.k != null && !isVisible()) {
            this.k.g();
        }
        com.sankuai.waimai.ai.uat.b.a().b(a.b.WMUATPageHome, this.ak);
        if (this.C != null) {
            this.C.a(1);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dc79ba6bcb04060fd2d5511670845ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dc79ba6bcb04060fd2d5511670845ec");
            return;
        }
        super.onHiddenChanged(z);
        HomePageViewModel homePageViewModel = this.m;
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = HomePageViewModel.a;
        if (PatchProxy.isSupport(objArr2, homePageViewModel, changeQuickRedirect2, false, "cf459a98bae647194f10bc0f64b30b1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, homePageViewModel, changeQuickRedirect2, false, "cf459a98bae647194f10bc0f64b30b1f");
        } else {
            homePageViewModel.e.b((k<Boolean>) Boolean.valueOf(z));
        }
        if (z) {
            this.V.b.dismiss();
            i();
        }
    }

    @Override // com.sankuai.waimai.business.page.common.arch.PageFragment, android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1a738a662e7469fda5fd004a8387ef5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1a738a662e7469fda5fd004a8387ef5");
            return;
        }
        super.onPause();
        this.m.a(d.a.ON_PAUSE);
        this.V.b.dismiss();
        com.sankuai.waimai.touchmatrix.rebuild.message.b.a().a((com.sankuai.waimai.touchmatrix.show.f) null);
        i();
    }

    @Override // com.sankuai.waimai.business.page.common.arch.PageFragment, com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "679b13e66bfb2b6494d5c9cfe1a46258", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "679b13e66bfb2b6494d5c9cfe1a46258");
            return;
        }
        a("homepage_stopped");
        super.onStop();
        com.sankuai.waimai.business.page.home.e eVar = this.k;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.page.home.e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "9095e2015acb7b10d4eb81877ff448bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "9095e2015acb7b10d4eb81877ff448bc");
        } else {
            com.sankuai.waimai.platform.widget.emptylayout.d dVar = eVar.c;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.platform.widget.emptylayout.d.c;
            if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "5177d33d6080ddeeb6f479b1f74fc95e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "5177d33d6080ddeeb6f479b1f74fc95e");
            } else {
                if (dVar.y != null) {
                    dVar.y.b();
                }
                if (dVar.ag && ((dVar.s == d.b.DATA_ERROR || dVar.s == d.b.NET_ERROR) && dVar.aj)) {
                    dVar.ai = (SystemClock.elapsedRealtime() - dVar.ah) + dVar.ai;
                } else {
                    dVar.aj = false;
                    dVar.ai = 0L;
                }
                dVar.ah = 0L;
            }
        }
        this.m.a(d.a.ON_STOP);
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce8b3bf6aa56c173de62cb21fe8b19ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce8b3bf6aa56c173de62cb21fe8b19ca");
        } else if (this.Y != null) {
            this.Y.a();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroyView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0405167695f61db0f66bf91dee46df4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0405167695f61db0f66bf91dee46df4d");
            return;
        }
        if (this.N != null) {
            com.sankuai.waimai.business.page.homepage.bubble.g.a().b(this.N);
            this.N = null;
        }
        super.onDestroyView();
    }

    @Override // com.sankuai.waimai.business.page.common.arch.PageFragment, com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4bac0a650609dfc85fbaaf7ffacf406", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4bac0a650609dfc85fbaaf7ffacf406");
            return;
        }
        super.onDestroy();
        com.sankuai.waimai.business.page.home.utils.e.a().b();
        com.sankuai.waimai.business.page.home.list.future.complex.d.a().c();
        com.sankuai.waimai.business.page.home.list.future.complex.d.a().g = null;
        PreloadDataModel.get().release();
        if (this.q != null) {
            this.q.P();
        }
        if (this.Q != null) {
            com.sankuai.waimai.business.page.home.actionbar.b bVar = this.Q;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.page.home.actionbar.b.v;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "5be41801a43fb0a9d5de8a4e56ce8a52", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "5be41801a43fb0a9d5de8a4e56ce8a52");
            } else if (bVar.w != null) {
                bVar.w.b();
            }
            com.sankuai.waimai.business.page.home.actionbar.b bVar2 = this.Q;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.home.actionbar.b.v;
            if (PatchProxy.isSupport(objArr3, bVar2, changeQuickRedirect3, false, "84060083807b5cd8c413d70fac3e8bfc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, bVar2, changeQuickRedirect3, false, "84060083807b5cd8c413d70fac3e8bfc");
            } else if (bVar2.x != null) {
                com.sankuai.waimai.business.page.home.head.recommendwords.alita.a aVar = bVar2.x;
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.page.home.head.recommendwords.alita.a.a;
                if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "7336fdeb63a0748b246b5dd27e510061", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "7336fdeb63a0748b246b5dd27e510061");
                } else if (aVar.d != null) {
                    aVar.d.a();
                }
            }
        }
        if (this.R != null) {
            com.sankuai.waimai.business.page.home.actionbar.a aVar2 = this.R;
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.business.page.home.actionbar.a.v;
            if (PatchProxy.isSupport(objArr5, aVar2, changeQuickRedirect5, false, "334cf7b4f516b3a135e69e26e640e684", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, aVar2, changeQuickRedirect5, false, "334cf7b4f516b3a135e69e26e640e684");
            } else if (aVar2.w != null) {
                aVar2.w.b();
            }
        }
        if (this.U != null && this.U.a() != null) {
            com.sankuai.waimai.business.page.home.list.future.e a2 = this.U.a();
            Object[] objArr6 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.business.page.home.list.future.e.v;
            if (PatchProxy.isSupport(objArr6, a2, changeQuickRedirect6, false, "d0fe4a5db6e569e0ea54793c473bea09", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, a2, changeQuickRedirect6, false, "d0fe4a5db6e569e0ea54793c473bea09");
            } else if (a2.w != null) {
                FuturePagerAdapter futurePagerAdapter = a2.w;
                Object[] objArr7 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect7 = FuturePagerAdapter.a;
                if (PatchProxy.isSupport(objArr7, futurePagerAdapter, changeQuickRedirect7, false, "f6b99e7900efa51d4c35763ffa9bda5f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, futurePagerAdapter, changeQuickRedirect7, false, "f6b99e7900efa51d4c35763ffa9bda5f");
                } else if (futurePagerAdapter.f instanceof com.sankuai.waimai.business.page.home.list.future.h) {
                    ((com.sankuai.waimai.business.page.home.list.future.h) futurePagerAdapter.f).a(false);
                }
            }
        }
        HomePageViewModel homePageViewModel = this.m;
        Object[] objArr8 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect8 = HomePageViewModel.a;
        if (PatchProxy.isSupport(objArr8, homePageViewModel, changeQuickRedirect8, false, "6a16ce2d1367dd86b74ad8c53c33db92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr8, homePageViewModel, changeQuickRedirect8, false, "6a16ce2d1367dd86b74ad8c53c33db92");
        } else {
            homePageViewModel.G.clear();
        }
        this.m.a(d.a.ON_DESTROY);
        com.sankuai.waimai.business.page.home.a aVar3 = this.l;
        Object[] objArr9 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect9 = com.sankuai.waimai.business.page.home.a.a;
        if (PatchProxy.isSupport(objArr9, aVar3, changeQuickRedirect9, false, "62095d5327cd33190039cc47e06b5c8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr9, aVar3, changeQuickRedirect9, false, "62095d5327cd33190039cc47e06b5c8b");
        } else {
            if (aVar3.d != null) {
                PreloadDataModel.get().getLocation().b(aVar3.d);
            }
            if (aVar3.e != null) {
                PreloadDataModel.get().getAddress().b(aVar3.e);
            }
            if (aVar3.f != null) {
                PreloadDataModel.get().getRcmdResponse().b(aVar3.f);
            }
            if (aVar3.g != null) {
                PreloadDataModel.get().getHomeFutureTabsResponse().b(aVar3.g);
            }
            if (aVar3.h != null) {
                PreloadDataModel.get().getLocationTimeoutState().b(aVar3.h);
            }
            if (aVar3.i != null) {
                PreloadDataModel.get().getHomeSecondFloorResponse().b(aVar3.i);
            }
            if (aVar3.j != null) {
                PreloadDataModel.get().getHomeHeaderFloatResponse().b(aVar3.j);
            }
            if (aVar3.k != null) {
                PreloadDataModel.get().getHomeSideBarResponse().b(aVar3.k);
            }
        }
        com.sankuai.waimai.platform.model.a.a().b(this);
        if (this.B != null) {
            ad.b(this.B);
        }
        com.sankuai.waimai.business.page.home.d dVar = this.j;
        Object[] objArr10 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect10 = com.sankuai.waimai.business.page.home.d.a;
        if (PatchProxy.isSupport(objArr10, dVar, changeQuickRedirect10, false, "833503b761b48bd2992b6d827f83a60f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr10, dVar, changeQuickRedirect10, false, "833503b761b48bd2992b6d827f83a60f");
        } else {
            com.sankuai.waimai.foundation.location.v2.g.a().b((com.sankuai.waimai.foundation.location.v2.listener.a) dVar, com.sankuai.waimai.platform.domain.manager.location.v2.b.POI_FRAGMENT.toString());
            com.sankuai.waimai.foundation.location.v2.g.a().b((com.sankuai.waimai.foundation.location.v2.listener.c) dVar, com.sankuai.waimai.platform.domain.manager.location.v2.b.POI_FRAGMENT.toString());
            dVar.e = false;
        }
        com.sankuai.waimai.business.page.home.helper.c.a().a(this);
        if (this.D != null && this.D.getViewTreeObserver() != null) {
            try {
                this.D.getViewTreeObserver().removeOnGlobalLayoutListener(this.aj);
            } catch (Exception unused) {
            }
        }
        com.sankuai.waimai.ai.uat.b.a().c(a.b.WMUATPageHome, this.ak);
        if (this.al != null) {
            LocalBroadcastManager.getInstance(com.meituan.android.singleton.b.a).unregisterReceiver(this.al);
        }
        com.sankuai.waimai.business.page.home.e eVar = this.k;
        Object[] objArr11 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect11 = com.sankuai.waimai.business.page.home.e.a;
        if (PatchProxy.isSupport(objArr11, eVar, changeQuickRedirect11, false, "3cca8093e871bf30d548f1ed1f9e210a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr11, eVar, changeQuickRedirect11, false, "3cca8093e871bf30d548f1ed1f9e210a");
        } else {
            eVar.c.e();
        }
        if (this.aa != null) {
            PreloadDataModel.get().isSecondFloorApiError().b(this.aa);
        }
        if (this.Y != null) {
            com.sankuai.waimai.business.page.home.widget.twolevel.c cVar = this.Y;
            Object[] objArr12 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect12 = com.sankuai.waimai.business.page.home.widget.twolevel.c.a;
            if (PatchProxy.isSupport(objArr12, cVar, changeQuickRedirect12, false, "9b21bcc4e1fb26fe2e2b4b9e87421342", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr12, cVar, changeQuickRedirect12, false, "9b21bcc4e1fb26fe2e2b4b9e87421342");
            } else {
                if (cVar.m != null) {
                    RefreshHeaderHelper refreshHeaderHelper = cVar.m;
                    Object[] objArr13 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect13 = RefreshHeaderHelper.a;
                    if (PatchProxy.isSupport(objArr13, refreshHeaderHelper, changeQuickRedirect13, false, "578dfbdec3adaac7d8f5e5de0f2baa00", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr13, refreshHeaderHelper, changeQuickRedirect13, false, "578dfbdec3adaac7d8f5e5de0f2baa00");
                    } else {
                        if (refreshHeaderHelper.u != null) {
                            refreshHeaderHelper.u.cancel();
                        }
                        if (refreshHeaderHelper.v != null) {
                            refreshHeaderHelper.v.cancel();
                        }
                        if (refreshHeaderHelper.w != null) {
                            refreshHeaderHelper.w.cancel();
                        }
                        if (refreshHeaderHelper.x != null) {
                            refreshHeaderHelper.x.cancel();
                        }
                        refreshHeaderHelper.h();
                        refreshHeaderHelper.a(refreshHeaderHelper.K);
                        refreshHeaderHelper.a(refreshHeaderHelper.L);
                        refreshHeaderHelper.M = null;
                    }
                }
                if (cVar.p != null) {
                    cVar.p.a(null);
                }
                PreloadDataModel.get().setHomeSecondFloorResponse(null);
                if (cVar.d != null && cVar.d.animate() != null) {
                    cVar.d.animate().cancel();
                }
                if (cVar.g != null) {
                    cVar.g.cancel();
                    cVar.g = null;
                }
            }
        }
        Object[] objArr14 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect14 = d;
        if (PatchProxy.isSupport(objArr14, this, changeQuickRedirect14, false, "9d2edc1068dd26131223baef0a8dcc5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr14, this, changeQuickRedirect14, false, "9d2edc1068dd26131223baef0a8dcc5f");
        } else {
            com.sankuai.waimai.foundation.core.lifecycle.b a3 = com.sankuai.waimai.foundation.core.lifecycle.b.a();
            com.sankuai.waimai.foundation.core.lifecycle.a aVar4 = this.af;
            Object[] objArr15 = {aVar4};
            ChangeQuickRedirect changeQuickRedirect15 = com.sankuai.waimai.foundation.core.lifecycle.b.a;
            if (PatchProxy.isSupport(objArr15, a3, changeQuickRedirect15, false, "76cec03d836732ea32cbfa895fb72b50", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr15, a3, changeQuickRedirect15, false, "76cec03d836732ea32cbfa895fb72b50");
            } else if (aVar4 != null) {
                a3.b.remove(aVar4);
            }
        }
        HomeGrayManager a4 = HomeGrayManager.a();
        Object[] objArr16 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect16 = HomeGrayManager.a;
        if (PatchProxy.isSupport(objArr16, a4, changeQuickRedirect16, false, "180bedada267ae09484118205a5348ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr16, a4, changeQuickRedirect16, false, "180bedada267ae09484118205a5348ac");
        } else if (a4.i != null) {
            a4.i.clear();
        }
        m a5 = m.a();
        Object[] objArr17 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect17 = m.a;
        if (PatchProxy.isSupport(objArr17, a5, changeQuickRedirect17, false, "25ee24b13b84ee3db12f91bec9fe0055", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr17, a5, changeQuickRedirect17, false, "25ee24b13b84ee3db12f91bec9fe0055");
        } else {
            a5.c = false;
            a5.b = null;
        }
        com.sankuai.waimai.business.page.home.homecache.d a6 = com.sankuai.waimai.business.page.home.homecache.d.a();
        Object[] objArr18 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect18 = com.sankuai.waimai.business.page.home.homecache.d.a;
        if (PatchProxy.isSupport(objArr18, a6, changeQuickRedirect18, false, "623cb267375ad105d57a966316dfe568", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr18, a6, changeQuickRedirect18, false, "623cb267375ad105d57a966316dfe568");
            return;
        }
        a6.b = null;
        a6.c = null;
        if (a6.d != null) {
            com.sankuai.waimai.business.page.home.homecache.c cVar2 = a6.d;
            Object[] objArr19 = {(byte) 0};
            ChangeQuickRedirect changeQuickRedirect19 = com.sankuai.waimai.business.page.home.homecache.c.a;
            if (PatchProxy.isSupport(objArr19, cVar2, changeQuickRedirect19, false, "9bfee19cea8429cc78aad8d838c6777e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr19, cVar2, changeQuickRedirect19, false, "9bfee19cea8429cc78aad8d838c6777e");
            } else if (cVar2.b == null || cVar2.b.isShutdown()) {
            } else {
                cVar2.b.shutdown();
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0a0a5d72aead410fb61a46a34a6ae30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0a0a5d72aead410fb61a46a34a6ae30");
        } else {
            super.onSaveInstanceState(bundle);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.user.b
    public void onChanged(b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed510390cae30f5be580498ad7122e90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed510390cae30f5be580498ad7122e90");
            return;
        }
        HomePageViewModel homePageViewModel = this.m;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = HomePageViewModel.a;
        if (PatchProxy.isSupport(objArr2, homePageViewModel, changeQuickRedirect2, false, "b01651e6502940e67aecd7b57720eab8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, homePageViewModel, changeQuickRedirect2, false, "b01651e6502940e67aecd7b57720eab8");
        } else {
            homePageViewModel.n.b((k<b.a>) aVar);
        }
        if (aVar != b.a.LOGIN) {
            com.sankuai.waimai.business.page.home.head.Dynamiclayout.spuviewextend.a.a().b = false;
        }
        if (aVar != b.a.CANCEL) {
            if (this.H) {
                this.i.a();
            } else {
                this.A = true;
            }
        }
        if (aVar == b.a.LOGOUT || aVar == b.a.LOGIN) {
            c();
        }
    }

    public final void c() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f03108cfe4597751179d543cde55029", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f03108cfe4597751179d543cde55029");
            return;
        }
        if (this.v == 1 && com.sankuai.waimai.foundation.core.a.e()) {
            z = true;
        }
        if (z || this.h == null) {
            return;
        }
        this.h.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75a976865e55b8ef06d2b790c303ff6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75a976865e55b8ef06d2b790c303ff6e");
            return;
        }
        boolean z = i == 1 || i == 3;
        if (this.f != null) {
            this.f.setHeaderPullRefreshEnable(z);
        }
        if (this.X != null) {
            this.X.k = z;
        }
        if (i == 1) {
            if (this.R == null) {
                this.R = new com.sankuai.waimai.business.page.home.actionbar.a(this, q());
                this.R.a(this.D);
            }
            this.K.setVisibility(0);
            this.L.setVisibility(8);
            this.J.setVisibility(8);
            this.I.setVisibility(8);
            this.M.setVisibility(0);
            j();
        } else if (i == 3) {
            if (this.S == null) {
                this.S = new com.sankuai.waimai.business.page.home.actionbar.c(this);
                this.S.a(this.L);
            }
            if (this.Q == null) {
                this.Q = new com.sankuai.waimai.business.page.home.actionbar.b(this, q());
                this.Q.a(this.X);
                this.Q.a(this.D);
            }
            this.M.setVisibility(8);
            this.K.setVisibility(8);
            this.L.setVisibility(0);
            this.J.setVisibility(8);
            this.I.setVisibility(8);
            this.j.a();
            j();
        } else {
            if (this.Q == null) {
                this.Q = new com.sankuai.waimai.business.page.home.actionbar.b(this, q());
                this.Q.a(this.X);
                this.Q.a(this.D);
            }
            this.M.setVisibility(0);
            this.K.setVisibility(8);
            this.L.setVisibility(8);
            this.J.setVisibility(0);
            this.I.setVisibility(0);
            j();
        }
    }

    private void j() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0bc41c896433df99cbf1ffc036a74e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0bc41c896433df99cbf1ffc036a74e1");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("SecondFloorGuideHelper", "enter initSecondLevelView()", new Object[0]);
        if (this.v == 1) {
            com.sankuai.waimai.foundation.utils.log.a.b("SecondFloorGuideHelper", "app is elderly model", new Object[0]);
            if (this.t != null) {
                this.t.e = true;
            }
        } else if (this.Y == null) {
            this.Z = new com.sankuai.waimai.business.page.home.widget.twolevel.report.a(AppUtil.generatePageInfoKey(this));
            this.t = new com.sankuai.waimai.business.page.home.widget.twolevel.strategy.b(this);
            this.t.d = this.Z;
            this.Y = new com.sankuai.waimai.business.page.home.widget.twolevel.c(this);
            this.Y.m = this.X;
            this.f.setReFreshHeaderHelper(this.X);
            this.Y.a(this.D);
            this.X.M = this.Z;
            this.X.a(new RefreshHeaderHelper.a() { // from class: com.sankuai.waimai.business.page.home.HomePageFragment.7
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.a, com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.c
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6bc89011cf67e8dd00a34907cba7aae3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6bc89011cf67e8dd00a34907cba7aae3");
                        return;
                    }
                    super.a();
                    com.sankuai.waimai.business.page.home.widget.twolevel.report.a aVar = HomePageFragment.this.Z;
                    a.C0793a secondRecourceState = PreloadDataModel.get().getSecondRecourceState();
                    Object[] objArr3 = {secondRecourceState};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.home.widget.twolevel.report.a.a;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "c717b6122fe023721ff4815d16f818f9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "c717b6122fe023721ff4815d16f818f9");
                    } else if (secondRecourceState != null && secondRecourceState.a != -1 && secondRecourceState.b != -1 && (secondRecourceState.a != 0 || secondRecourceState.b != 0)) {
                        JudasManualManager.a a2 = JudasManualManager.b("b_waimai_or55o31i_mv").a("c_m84bv26");
                        a2.b = aVar.c;
                        a2.a("backgroud_failure_code", secondRecourceState.a).a("dynamic_failure_code", secondRecourceState.b).a();
                    }
                    if (HomePageFragment.this.W != null) {
                        com.sankuai.waimai.business.page.home.layer.b bVar = HomePageFragment.this.W;
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.page.home.layer.b.a;
                        if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "2d02c723d3badbea708319a1bd89d054", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "2d02c723d3badbea708319a1bd89d054");
                        } else if (bVar.c == null || bVar.b == null || bVar.c.getVisibility() != 0) {
                        } else {
                            bVar.c.setVisibility(8);
                            bVar.b.setVisibility(0);
                        }
                    }
                }

                @Override // com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.a, com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.c
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3f3ea6e33ba5c7b4c76db7f4d841a9c8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3f3ea6e33ba5c7b4c76db7f4d841a9c8");
                        return;
                    }
                    super.b();
                    if (HomePageFragment.this.g != null) {
                        HomePageFragment.this.g.a();
                    }
                }

                @Override // com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.a, com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.c
                public final void a(int i, float f2, int i2, int i3, boolean z2) {
                    Object[] objArr2 = {Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "38e59146afba1515ffcbb934d6216114", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "38e59146afba1515ffcbb934d6216114");
                        return;
                    }
                    super.a(i, f2, i2, i3, z2);
                    HomePageFragment.this.f.setY(i);
                    HomePageFragment.a(HomePageFragment.this, i2, i3, z2);
                }

                @Override // com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.a, com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.c
                public final void a(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aaa5413201b7e9681ad58cc9a359343d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aaa5413201b7e9681ad58cc9a359343d");
                        return;
                    }
                    super.a(i);
                    if (i == 4) {
                        FragmentActivity activity = HomePageFragment.this.getActivity();
                        if (activity instanceof PageActivity) {
                            ((PageActivity) activity).av_();
                        }
                    }
                    HomePageFragment.this.J.setClickable(i != 9);
                }

                @Override // com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.a, com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.c
                public final void c() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fc72ae9dbab1561b3b99a6365dd10850", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fc72ae9dbab1561b3b99a6365dd10850");
                        return;
                    }
                    super.c();
                    HomePageFragment.a(HomePageFragment.this, false);
                    HomePageFragment.this.f.setY(0.0f);
                }

                @Override // com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.a, com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.c
                public final void d() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f21e647f14020c29427be700ea4939d1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f21e647f14020c29427be700ea4939d1");
                        return;
                    }
                    super.d();
                    HomePageFragment.i(HomePageFragment.this);
                }
            });
            if ((com.sankuai.waimai.platform.accessibility.a.a().b() || this.v == 1) ? true : true) {
                return;
            }
            if (this.u != null) {
                this.u.c.a(this, new l<HomeSecondFloorResponse>() { // from class: com.sankuai.waimai.business.page.home.HomePageFragment.8
                    public static ChangeQuickRedirect a;

                    @Override // android.arch.lifecycle.l
                    public final /* synthetic */ void a(@Nullable HomeSecondFloorResponse homeSecondFloorResponse) {
                        Object[] objArr2 = {homeSecondFloorResponse};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "38ccbdbfa8d5f09d6047942b08df79f2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "38ccbdbfa8d5f09d6047942b08df79f2");
                        } else if (HomePageFragment.this.t != null) {
                            HomePageFragment.this.t.a();
                        }
                    }
                });
            }
            if (this.aa == null) {
                this.aa = new l<Boolean>() { // from class: com.sankuai.waimai.business.page.home.HomePageFragment.9
                    public static ChangeQuickRedirect a;

                    @Override // android.arch.lifecycle.l
                    public final /* synthetic */ void a(@Nullable Boolean bool) {
                        Boolean bool2 = bool;
                        Object[] objArr2 = {bool2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7b178e677ccd3cfa2e102ac1d4d0ad88", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7b178e677ccd3cfa2e102ac1d4d0ad88");
                        } else if (bool2 == null || !bool2.booleanValue() || HomePageFragment.this.t == null) {
                        } else {
                            HomePageFragment.this.t.a();
                        }
                    }
                };
                PreloadDataModel.get().isSecondFloorApiError().a(this.aa);
            }
        }
    }

    @Override // com.sankuai.waimai.platform.model.b
    public final void a(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "095c0f1d4282d602366813857869ad02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "095c0f1d4282d602366813857869ad02");
            return;
        }
        this.v = i;
        if (!ad.b()) {
            ad.c(new Runnable() { // from class: com.sankuai.waimai.business.page.home.HomePageFragment.10
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0a6769f4947b71fb69c9fd25eeffd374", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0a6769f4947b71fb69c9fd25eeffd374");
                    } else {
                        HomePageFragment.this.c(i);
                    }
                }
            });
        } else {
            c(i);
        }
        if (this.W != null) {
            this.W.a(false);
        }
        if (this.i != null) {
            this.i.a(1);
        }
        if (this.h != null) {
            this.h.a(this);
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f083ee0e0efd841de3c6b4cbb2aea7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f083ee0e0efd841de3c6b4cbb2aea7a");
        } else if (this.e == null) {
        } else {
            this.e.post(new Runnable() { // from class: com.sankuai.waimai.business.page.home.HomePageFragment.11
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d804c5e4358e04d06579d859778ddfdd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d804c5e4358e04d06579d859778ddfdd");
                        return;
                    }
                    HomePageFragment.this.e.fling(0, 0);
                    HomePageFragment.this.e.scrollToPosition(0);
                    HomePageFragment.this.m.e(true);
                }
            });
            k();
        }
    }

    private void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4491563481cd25e4e4f085c4fdbda317", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4491563481cd25e4e4f085c4fdbda317");
        } else {
            com.sankuai.waimai.platform.capacity.network.rxsupport.a.a().a(new h());
        }
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "baa547b5e583bdee73e29e2d93fb4954", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "baa547b5e583bdee73e29e2d93fb4954");
            return;
        }
        if (this.p != null) {
            this.p.a(z);
        }
        a(z, 2);
    }

    public final void a(boolean z, int i) {
        FuTiaoMatrixView fuTiaoMatrixView;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40742f43a573622b33b858ec62003b5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40742f43a573622b33b858ec62003b5c");
        } else if (this.V == null || (fuTiaoMatrixView = this.V.b) == null) {
        } else {
            if (z) {
                fuTiaoMatrixView.a(i);
            } else {
                fuTiaoMatrixView.b(i);
            }
        }
    }

    public final void a(com.sankuai.waimai.platform.domain.core.channel.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a1539d1f6c1f18ec79ef8ba127471e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a1539d1f6c1f18ec79ef8ba127471e9");
        } else if (this.p != null) {
            com.sankuai.waimai.business.page.home.layer.a aVar2 = this.p;
            Object[] objArr2 = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.page.home.layer.a.a;
            if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "1e9d52697bc3d45f000a9bf443c8f78c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "1e9d52697bc3d45f000a9bf443c8f78c");
                return;
            }
            aVar2.s = aVar;
            aVar2.a();
        }
    }

    @Override // com.sankuai.waimai.business.page.home.interfacer.b
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "218e2f4ecd23d6e23b9c0b18432b466c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "218e2f4ecd23d6e23b9c0b18432b466c");
            return;
        }
        HomePageViewModel homePageViewModel = this.m;
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = HomePageViewModel.a;
        if (PatchProxy.isSupport(objArr2, homePageViewModel, changeQuickRedirect2, false, "d76572c874663a885fe4887a6915a76a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, homePageViewModel, changeQuickRedirect2, false, "d76572c874663a885fe4887a6915a76a");
        } else {
            homePageViewModel.h.b((k<Integer>) Integer.valueOf(i));
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = d;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "babe0e2755583c06686ad5074a7b5296", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "babe0e2755583c06686ad5074a7b5296");
        } else if (this.ae == null || !this.ae.b()) {
        } else {
            new Handler().postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.page.home.HomePageFragment.17
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7f66bff2cadacafd2d3d0237b7bb1cea", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7f66bff2cadacafd2d3d0237b7bb1cea");
                    } else {
                        HomePageFragment.c(HomePageFragment.this);
                    }
                }
            }, MetricsAnrManager.ANR_THRESHOLD);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class a implements c.a<BaseResponse<com.sankuai.waimai.business.page.home.model.f>> {
        public static ChangeQuickRedirect a;

        public a() {
            Object[] objArr = {HomePageFragment.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61402d7b81b64dca4df9d110a3a8033d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61402d7b81b64dca4df9d110a3a8033d");
            }
        }

        @Override // com.sankuai.waimai.business.page.home.c.a
        public final /* synthetic */ void a(int i, BaseResponse<com.sankuai.waimai.business.page.home.model.f> baseResponse) {
            BaseResponse<com.sankuai.waimai.business.page.home.model.f> baseResponse2 = baseResponse;
            Object[] objArr = {Integer.valueOf(i), baseResponse2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08f4313bf2002959ae18257e2c17ce7f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08f4313bf2002959ae18257e2c17ce7f");
                return;
            }
            HomePageFragment.this.m.a(new com.sankuai.waimai.business.page.home.model.d(1, i, baseResponse2));
            if (HomePageFragment.this.k.c() == d.b.PROGRESS) {
                HomePageFragment.this.k.b();
            }
            HomePageFragment.this.g.b();
            if (baseResponse2.data != null && baseResponse2.data.moduleList != null) {
                com.sankuai.waimai.business.page.common.superexpose.c a2 = com.sankuai.waimai.business.page.common.superexpose.c.a();
                List<RocksServerModel> list = baseResponse2.data.moduleList;
                Object[] objArr2 = {list};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.page.common.superexpose.c.a;
                if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "fd884c70669197ec3dd8eb41115b5cf2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "fd884c70669197ec3dd8eb41115b5cf2");
                } else {
                    com.sankuai.waimai.ad.superexpose.a.b = list;
                }
            }
            if (HomePageFragment.this.p != null && baseResponse2.data != null && baseResponse2.data.jsonData != null) {
                HomePagePoiListResponse a3 = a(baseResponse2.data.jsonData);
                com.sankuai.waimai.business.page.home.layer.a aVar = HomePageFragment.this.p;
                Object[] objArr3 = {a3};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.home.layer.a.a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "8803d7a071ad5c9a8a2c4c2d3d0f2a83", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "8803d7a071ad5c9a8a2c4c2d3d0f2a83");
                } else if (a3 != null) {
                    if (aVar.g != null) {
                        FaultViewModel faultViewModel = (FaultViewModel) q.a((FragmentActivity) aVar.c.F).a(FaultViewModel.class);
                        Object[] objArr4 = {a3};
                        ChangeQuickRedirect changeQuickRedirect4 = FaultViewModel.a;
                        if (PatchProxy.isSupport(objArr4, faultViewModel, changeQuickRedirect4, false, "697d300951881a03a5cef63109faf276", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, faultViewModel, changeQuickRedirect4, false, "697d300951881a03a5cef63109faf276");
                        } else {
                            faultViewModel.b.b((k<HomePagePoiListResponse>) a3);
                        }
                    }
                    new com.sankuai.waimai.business.page.home.layer.remind.a(aVar.c.F, aVar.m);
                    RemindViewModel remindViewModel = (RemindViewModel) q.a((FragmentActivity) aVar.c.F).a(RemindViewModel.class);
                    boolean z = aVar.n;
                    Object[] objArr5 = {a3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect5 = RemindViewModel.a;
                    if (PatchProxy.isSupport(objArr5, remindViewModel, changeQuickRedirect5, false, "742fed916e282205dec4ceb68c404460", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, remindViewModel, changeQuickRedirect5, false, "742fed916e282205dec4ceb68c404460");
                    } else {
                        remindViewModel.b.b((k<android.util.Pair<HomePagePoiListResponse, Boolean>>) new android.util.Pair<>(a3, Boolean.valueOf(z)));
                    }
                    com.sankuai.waimai.foundation.utils.log.a.c("WMPopup", "set data over", new Object[0]);
                    WMSkyFallPopup.skyFallCouponResponseCache = a3;
                    if (WMSkyFallPopup.getInstance() != null && !aVar.n) {
                        WMSkyFallPopup.getInstance().setState(5);
                    }
                    if (com.sankuai.waimai.popup.f.a().c) {
                        WMSkyFallPopup wMSkyFallPopup = WMSkyFallPopup.getInstance();
                        if (wMSkyFallPopup != null) {
                            wMSkyFallPopup.setState(5);
                        }
                        com.sankuai.waimai.foundation.utils.log.a.b("WMSkyFallPopup", "have gap reset pop", new Object[0]);
                    }
                    MarketingWindow data = MarketingWindow.getData(a3.marketingWindow, 3);
                    if (data != null) {
                        WMGuidePopHighPopup.sMarketingContent = data.content;
                        if (!aVar.n) {
                            WMGuidePopHighPopup.reset();
                        }
                    }
                    com.sankuai.waimai.platform.popup.e.a().b();
                    aVar.n = false;
                }
            }
            TabLoadManager.a().a(0, true);
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a((Context) HomePageFragment.this.getActivity(), "home_poi_list_last_refresh_time", System.currentTimeMillis());
            HomePageFragment.this.i.c = true;
        }

        @Override // com.sankuai.waimai.business.page.home.c.a
        public final /* synthetic */ void a(int i, BaseResponse<com.sankuai.waimai.business.page.home.model.f> baseResponse, boolean z) {
            BaseResponse<com.sankuai.waimai.business.page.home.model.f> baseResponse2 = baseResponse;
            Object[] objArr = {Integer.valueOf(i), baseResponse2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86ff8ea9a20b4714c1757669373e4137", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86ff8ea9a20b4714c1757669373e4137");
                return;
            }
            HomePageFragment.this.m.a(new com.sankuai.waimai.business.page.home.model.d(3, i, baseResponse2));
            HomePageFragment.this.g.b();
            if (HomePageFragment.this.k.c() == d.b.PROGRESS) {
                HomePageFragment.this.k.b();
            }
            if (z || ((baseResponse2 != null && baseResponse2.code == 3) || (baseResponse2 != null && baseResponse2.code == 2))) {
                com.sankuai.waimai.business.page.home.e eVar = HomePageFragment.this.k;
                BaseResponse<String> a2 = HomePageFragment.this.m.b.a();
                Object[] objArr2 = {baseResponse2, a2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.page.home.e.a;
                if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "e526f1bf3abcfa715480b39f6d2f3fc9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "e526f1bf3abcfa715480b39f6d2f3fc9");
                } else {
                    String a3 = com.sankuai.waimai.business.page.home.log.c.a(z, baseResponse2, a2);
                    if (baseResponse2 != null && ((baseResponse2.code == 2 || baseResponse2.code == 3) && baseResponse2.data != null)) {
                        eVar.a(baseResponse2.code, baseResponse2.data.a, baseResponse2.data.b);
                        com.sankuai.waimai.platform.capacity.log.e a4 = com.sankuai.waimai.platform.capacity.log.f.a().a("/home/feeds/tabs");
                        Object[] objArr3 = {a3, baseResponse2, a2, a4};
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.home.log.b.a;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "79a95c25932c1c32adfa9af173963981", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "79a95c25932c1c32adfa9af173963981");
                        } else {
                            i.d(new com.sankuai.waimai.business.page.home.log.a().a("home_poi_list_first_empty").b(a3).c("代理美团外卖，携手共赢未来-兜底页面").d(com.sankuai.waimai.business.page.home.log.b.a(a3, baseResponse2, a2, a4, null)).b(true).b());
                        }
                    } else if (baseResponse2 == null || baseResponse2.code != 0 || baseResponse2.data == null || com.sankuai.waimai.foundation.utils.b.b(baseResponse2.data.moduleList) || eVar.b.h.c.a(baseResponse2)) {
                        String string = eVar.b.F.getString(R.string.wm_page_home_load_data_failed);
                        if (z && a2 != null && !TextUtils.isEmpty(a2.msg) && a2.code != 0) {
                            string = a2.msg;
                        } else if (baseResponse2 != null && !TextUtils.isEmpty(baseResponse2.msg)) {
                            string = baseResponse2.msg;
                        }
                        HomePageViewModel homePageViewModel = eVar.b.m;
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = HomePageViewModel.a;
                        if (PatchProxy.isSupport(objArr4, homePageViewModel, changeQuickRedirect4, false, "98803144cdd31b95ee850a8301abc7a8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr4, homePageViewModel, changeQuickRedirect4, false, "98803144cdd31b95ee850a8301abc7a8")).booleanValue() : homePageViewModel.M.booleanValue()) {
                            com.sankuai.waimai.platform.capacity.log.e a5 = com.sankuai.waimai.platform.capacity.log.f.a().a(z ? "/home/feeds/rcmdboard" : "/home/feeds/tabs");
                            eVar.c.a(string, a3, new com.sankuai.waimai.platform.widget.emptylayout.b(a5, true));
                            com.sankuai.waimai.business.page.home.log.b.a(a3, baseResponse2, a2, a5);
                        } else {
                            com.sankuai.waimai.platform.utils.m.a(eVar.b.F, string, (Throwable) new com.sankuai.waimai.platform.widget.emptylayout.a(a3, z ? "/home/feeds/rcmdboard" : "/home/feeds/tabs"));
                        }
                    }
                }
            }
            if (i == 3) {
                String str = "";
                if (z) {
                    if (HomePageFragment.this.m != null && HomePageFragment.this.m.b != null && HomePageFragment.this.m.b.a() != null) {
                        str = HomePageFragment.this.m.b.a().msg;
                    }
                } else {
                    str = baseResponse2.msg;
                }
                if (TextUtils.isEmpty(str)) {
                    str = HomePageFragment.this.F.getString(R.string.wm_page_home_load_data_failed);
                }
                HomePageFragment.this.d(str);
            }
            TabLoadManager.a().a(0, false);
        }

        @Override // com.sankuai.waimai.business.page.home.c.a
        public final void a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e0e67768906af52145e1e5f10d201d1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e0e67768906af52145e1e5f10d201d1");
            } else {
                HomePageFragment.this.m.a(new com.sankuai.waimai.business.page.home.model.d(0, i));
            }
        }

        private HomePagePoiListResponse a(Map<String, Object> map) {
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa065cf07f90eb7ecb6ea0b1e4873d1a", RobustBitConfig.DEFAULT_VALUE)) {
                return (HomePagePoiListResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa065cf07f90eb7ecb6ea0b1e4873d1a");
            }
            try {
                Gson gson = new Gson();
                return (HomePagePoiListResponse) gson.fromJson(gson.toJson(map), (Class<Object>) HomePagePoiListResponse.class);
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // com.sankuai.waimai.business.page.home.c.a
        public final void a(int i, Throwable th, Throwable th2) {
            Object[] objArr = {Integer.valueOf(i), th, th2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2158e87e0a51e52b0347b5ed282f32be", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2158e87e0a51e52b0347b5ed282f32be");
                return;
            }
            HomePageFragment.this.m.a(new com.sankuai.waimai.business.page.home.model.d(2, i, th));
            if (HomePageFragment.this.k.c() == d.b.PROGRESS) {
                HomePageFragment.this.k.b();
            }
            if (th2 != null) {
                com.sankuai.waimai.business.page.home.e eVar = HomePageFragment.this.k;
                Object[] objArr2 = {th, th2, (byte) 0};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.page.home.e.a;
                if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "8da4ee477d396b574d48432b6da485e1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "8da4ee477d396b574d48432b6da485e1");
                } else {
                    String a2 = com.sankuai.waimai.business.page.home.log.c.a(th, th2, false);
                    com.sankuai.waimai.platform.capacity.log.e a3 = com.sankuai.waimai.platform.capacity.log.f.a().a(th2 == null ? "/home/feeds/rcmdboard" : "/poi/homepage");
                    String string = com.meituan.android.singleton.b.a.getString(com.sankuai.waimai.platform.widget.emptylayout.d.g);
                    String a4 = com.sankuai.waimai.platform.utils.h.a(com.meituan.android.singleton.b.a, th2);
                    if (!TextUtils.isEmpty(a4)) {
                        string = a4;
                    }
                    com.sankuai.waimai.platform.widget.emptylayout.d dVar = eVar.c;
                    com.sankuai.waimai.platform.widget.emptylayout.b bVar = new com.sankuai.waimai.platform.widget.emptylayout.b(a3, true);
                    Object[] objArr3 = {string, bVar, "10324"};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.platform.widget.emptylayout.d.c;
                    if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "96a4185cdb2e14abd1f7eff2d48ef084", RobustBitConfig.DEFAULT_VALUE)) {
                        com.sankuai.waimai.platform.widget.emptylayout.d dVar2 = (com.sankuai.waimai.platform.widget.emptylayout.d) PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "96a4185cdb2e14abd1f7eff2d48ef084");
                    } else {
                        dVar.a(string, bVar.a, "10324");
                    }
                    com.sankuai.waimai.business.page.home.log.b.a(a2, null, null, a3);
                }
            }
            if (HomePageFragment.this.getContext() != null && i == 3) {
                HomePageFragment homePageFragment = HomePageFragment.this;
                homePageFragment.d(HomePageFragment.this.getString(R.string.wm_page_home_load_data_failed) + com.sankuai.waimai.business.page.home.log.c.a(th, th2, true));
            }
            TabLoadManager.a().a(0, false);
            HomePageFragment.this.g.b();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class f extends com.sankuai.waimai.platform.widget.pullrefresh.c {
        public static ChangeQuickRedirect a;
        private boolean c;

        public f() {
        }

        @Override // com.sankuai.waimai.platform.widget.pullrefresh.c
        public final void a(com.sankuai.waimai.platform.widget.pullrefresh.b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e695c10725c0a547d040f2dd45f2529", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e695c10725c0a547d040f2dd45f2529");
            } else {
                a();
            }
        }

        @Override // com.sankuai.waimai.platform.widget.pullrefresh.c, com.sankuai.waimai.platform.widget.pullrefresh.a
        public final void a(@NonNull com.sankuai.waimai.platform.widget.pullrefresh.b bVar, int i, int i2, int i3) {
            Object[] objArr = {bVar, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90db6270119785665212e602be8a9339", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90db6270119785665212e602be8a9339");
                return;
            }
            super.a(bVar, i, i2, i3);
            if (HomePageFragment.this.n != null) {
                HomeActionBarViewModel homeActionBarViewModel = HomePageFragment.this.n;
                Object[] objArr2 = {0, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = HomeActionBarViewModel.a;
                if (PatchProxy.isSupport(objArr2, homeActionBarViewModel, changeQuickRedirect2, false, "bd132d5b907067772dd4ef9137dd556b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, homeActionBarViewModel, changeQuickRedirect2, false, "bd132d5b907067772dd4ef9137dd556b");
                } else {
                    homeActionBarViewModel.e.b((k<Pair<Integer, Integer>>) new Pair<>(0, Integer.valueOf(i)));
                }
            }
        }

        @Override // com.sankuai.waimai.platform.widget.pullrefresh.c, com.sankuai.waimai.platform.widget.pullrefresh.a
        public final void a(@NonNull com.sankuai.waimai.platform.widget.pullrefresh.b bVar, int i, int i2) {
            Object[] objArr = {bVar, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db7519d8b2841177b68cf30e2cc7d0da", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db7519d8b2841177b68cf30e2cc7d0da");
                return;
            }
            super.a(bVar, i, i2);
            if (i == 5 || i == 4) {
                HomePageFragment.this.e.f = true;
            } else if (i == 3 || i == 1) {
                HomePageFragment.this.e.f = false;
            } else if (i == 0) {
                HomePageViewModel homePageViewModel = HomePageFragment.this.m;
                Object[] objArr2 = {(byte) 1};
                ChangeQuickRedirect changeQuickRedirect2 = HomePageViewModel.a;
                if (PatchProxy.isSupport(objArr2, homePageViewModel, changeQuickRedirect2, false, "bf83cfe020e4537e88a1f495fee877ca", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, homePageViewModel, changeQuickRedirect2, false, "bf83cfe020e4537e88a1f495fee877ca");
                } else {
                    homePageViewModel.l.b((k<Boolean>) Boolean.TRUE);
                }
            }
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "564b4f47fdfa3c80dc0ddeae88ef8c91", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "564b4f47fdfa3c80dc0ddeae88ef8c91");
            } else if (com.sankuai.waimai.foundation.location.v2.g.a().p() != null || com.sankuai.waimai.platform.model.c.a().c()) {
                n.a().b();
                this.c = true;
                HomePageFragment.this.h.a(3);
                HomePageFragment.this.m.h(true);
            }
        }

        void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac739d72a893600b1c3a28645b6dcc77", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac739d72a893600b1c3a28645b6dcc77");
            } else if (this.c) {
                n a2 = n.a();
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = n.a;
                if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "54c7c1e41c4f39fd4e41a2c4db1aa0d5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "54c7c1e41c4f39fd4e41a2c4db1aa0d5");
                } else if (a2.b != null) {
                    a2.b.recordStep("Refresh-");
                    com.sankuai.meituan.takeoutnew.util.aop.h.a(a2.b);
                    a2.b = null;
                }
                HomePageFragment.this.f.a();
                this.c = false;
            }
        }
    }

    public final com.sankuai.waimai.business.page.home.layer.a f() {
        return this.p;
    }

    public void a(Intent intent) {
        boolean a2;
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd31223a580aef05c23b4817a5b8a1bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd31223a580aef05c23b4817a5b8a1bd");
            return;
        }
        if (this.p != null) {
            com.sankuai.waimai.business.page.home.layer.a aVar = this.p;
            Object[] objArr2 = {intent};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.page.home.layer.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "beab2a36a94400fdbbf93cf9ed41eafa", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "beab2a36a94400fdbbf93cf9ed41eafa");
            } else if (WMSkyFallPopup.getInstance() != null) {
                if (intent != null) {
                    Object[] objArr3 = {intent};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.home.layer.a.a;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "ae154aef1f59a34c9c5960fc723c7b82", RobustBitConfig.DEFAULT_VALUE)) {
                        a2 = ((Boolean) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "ae154aef1f59a34c9c5960fc723c7b82")).booleanValue();
                    } else {
                        a2 = com.sankuai.waimai.platform.utils.f.a(intent, com.sankuai.waimai.popup.e.b, false);
                        if (intent != null) {
                            intent.putExtra(com.sankuai.waimai.popup.e.b, false);
                        }
                    }
                    WMSkyFallPopup.getInstance().setDialogCanShow(a2);
                }
                WMSkyFallPopup.getInstance().closeDialog();
            }
        }
        Object[] objArr4 = {intent};
        ChangeQuickRedirect changeQuickRedirect4 = d;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e97aa5e2e78804c21bae150a8eb75fab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e97aa5e2e78804c21bae150a8eb75fab");
        } else if (intent == null || intent.getExtras() == null || !intent.getExtras().containsKey("from") || !"coupon".equals(intent.getExtras().getString("from", "")) || this.m == null) {
        } else {
            this.m.S = true;
            l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23d55e995e1d86e259371760cfab7979", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23d55e995e1d86e259371760cfab7979");
        } else if (this.e.getAdapter() == null || this.e.getAdapter().getItemCount() <= 0) {
        } else {
            com.sankuai.waimai.business.page.home.basal.a aVar = (com.sankuai.waimai.business.page.home.basal.a) this.e.getAdapter();
            final int itemCount = aVar.getItemCount() - 1;
            List<com.meituan.android.cube.pga.block.a> list = aVar.c;
            if (itemCount >= (list != null ? list.size() : 0) || list == null || !(list.get(itemCount) instanceof com.sankuai.waimai.business.page.home.list.future.e)) {
                return;
            }
            this.e.post(new Runnable() { // from class: com.sankuai.waimai.business.page.home.HomePageFragment.13
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1c11d6d5ecd58d21903902c732e012b3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1c11d6d5ecd58d21903902c732e012b3");
                        return;
                    }
                    HomePageFragment.this.e.scrollToPosition(itemCount);
                    HomePageViewModel homePageViewModel = HomePageFragment.this.m;
                    Object[] objArr3 = {(byte) 1};
                    ChangeQuickRedirect changeQuickRedirect3 = HomePageViewModel.a;
                    if (PatchProxy.isSupport(objArr3, homePageViewModel, changeQuickRedirect3, false, "89d254292e5f0569cc62bb7ab5fda3e6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, homePageViewModel, changeQuickRedirect3, false, "89d254292e5f0569cc62bb7ab5fda3e6");
                    } else {
                        homePageViewModel.o.b((k<Boolean>) Boolean.TRUE);
                    }
                }
            });
        }
    }

    public final void a(FilterBarViewController.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85cea6b8991ac2758b164feff9ec8818", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85cea6b8991ac2758b164feff9ec8818");
        } else if (this.m != null) {
            this.m.a(aVar);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "941afe8a982595be45c4dbc939ea3461", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "941afe8a982595be45c4dbc939ea3461");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        super.onActivityResult(i, i2, intent);
        if (i == 1203) {
            if (!com.sankuai.waimai.foundation.location.utils.c.a(getContext()).equals(c.a.OPEN)) {
                i.d(new com.sankuai.waimai.business.page.common.log.a().a("waimai_location_open_gps_service").b("2").b());
            } else {
                this.j.d = true;
                this.j.a(this);
                i.d(new com.sankuai.waimai.business.page.common.log.a().a("waimai_location_open_gps_service").b("1").b());
                com.meituan.android.privacy.aop.a.f();
                return;
            }
        }
        com.meituan.android.privacy.aop.a.f();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class b implements com.sankuai.waimai.business.page.common.view.nested.d {
        public static ChangeQuickRedirect a;

        private b() {
            Object[] objArr = {HomePageFragment.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40705a7d0cafff8d383d4c88a289d918", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40705a7d0cafff8d383d4c88a289d918");
            }
        }

        @Override // com.sankuai.waimai.business.page.common.view.nested.d
        public final void a(View view, int i) {
            Object[] objArr = {view, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d44dd422de0768ff9c84783b6a497ad4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d44dd422de0768ff9c84783b6a497ad4");
                return;
            }
            if (HomePageFragment.this.o != null) {
                com.sankuai.waimai.business.page.home.expose.b bVar = HomePageFragment.this.o;
                Object[] objArr2 = {view, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.page.home.expose.b.c;
                if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "9f73b7ba335fee2c853ba133893ebb2f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "9f73b7ba335fee2c853ba133893ebb2f");
                } else if (bVar.d != null && bVar.e != null && i == 0) {
                    bVar.b();
                }
            }
            com.sankuai.waimai.business.page.home.helper.c a2 = com.sankuai.waimai.business.page.home.helper.c.a();
            Object[] objArr3 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.home.helper.c.a;
            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "d9ec3186b7740201c31d5e5cd165f25b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "d9ec3186b7740201c31d5e5cd165f25b");
                return;
            }
            if (a2.d) {
                com.sankuai.waimai.foundation.utils.log.a.e("HomePageSmoothScrollHelper", "parentScrollState:" + i, new Object[0]);
            }
            if (a2.b != i) {
                a2.b = i;
                a2.b();
            }
        }

        @Override // com.sankuai.waimai.business.page.common.view.nested.d
        public final void b(View view, int i) {
            Object[] objArr = {view, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b255a38338cb9d394fec76606c68365a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b255a38338cb9d394fec76606c68365a");
                return;
            }
            if (HomePageFragment.this.o != null) {
                HomePageFragment.this.o.a(view, i);
            }
            if (!HomePageFragment.this.e.canScrollVertically(1) && i != 0) {
                HomePageFragment.this.m.b(true);
            } else if (HomePageFragment.this.m.I) {
                HomePageFragment.this.m.b(false);
            }
            if (i != 0) {
                HomePageFragment.this.m.c(true);
            }
            com.sankuai.waimai.business.page.home.list.a.a().f = i;
            HomePageViewModel homePageViewModel = HomePageFragment.this.m;
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = HomePageViewModel.a;
            if (PatchProxy.isSupport(objArr2, homePageViewModel, changeQuickRedirect2, false, "d0d1a291e1ea5c6d13f7779ec9f295a0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, homePageViewModel, changeQuickRedirect2, false, "d0d1a291e1ea5c6d13f7779ec9f295a0");
            } else {
                homePageViewModel.i.b((k<Integer>) Integer.valueOf(i));
            }
            HomePageFragment.c(HomePageFragment.this, HomePageFragment.this.m.I ? 2 : 1);
            if (HomePageFragment.this.W != null && i > 10) {
                HomePageFragment.this.W.a();
            }
            if (HomePageFragment.this.ag != null) {
                HomePageFragment.this.ag.d().a((k<Void>) null);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class d {
        public int a;

        private d(int i) {
            this.a = i;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class c implements c.b<BaseResponse<String>> {
        public static ChangeQuickRedirect a;

        private c() {
            Object[] objArr = {HomePageFragment.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc2d0db1b88adf1c60acc3062d954e28", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc2d0db1b88adf1c60acc3062d954e28");
            }
        }

        @Override // com.sankuai.waimai.business.page.home.c.b
        public final /* synthetic */ void a(BaseResponse<String> baseResponse) {
            BaseResponse<String> baseResponse2 = baseResponse;
            Object[] objArr = {baseResponse2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4520e705edd94ff07d1ab700012a50cd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4520e705edd94ff07d1ab700012a50cd");
                return;
            }
            HomePageFragment.this.m.a(baseResponse2);
            HomePageFragment.d(HomePageFragment.this, 1);
            HomePageFragment.this.a("rcmd_data_error");
            com.sankuai.waimai.business.page.home.utils.i.a(true);
        }

        @Override // com.sankuai.waimai.business.page.home.c.b
        public final /* synthetic */ void b(BaseResponse<String> baseResponse) {
            BaseResponse<String> baseResponse2 = baseResponse;
            Object[] objArr = {baseResponse2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12a86f19a0651045c3d7db1bea62bd2f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12a86f19a0651045c3d7db1bea62bd2f");
                return;
            }
            try {
                Object[] objArr2 = {baseResponse2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1aae4f8fc56a8367cb04112f34f48e11", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1aae4f8fc56a8367cb04112f34f48e11");
                } else {
                    HomePageFragment.d(HomePageFragment.this, 3);
                    HomePageFragment.this.m.a(baseResponse2);
                    if (baseResponse2 != null && baseResponse2.data != null) {
                        PreloadDataModel.get().setLocationTimeoutState(false);
                        if (HomePageFragment.this.k.f) {
                            HomePageFragment.this.k.a((CharSequence) HomePageFragment.this.getString(R.string.wm_page_home_title_location_recommend_dialog_locate_finish));
                            new Handler().postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.page.home.HomePageFragment.c.1
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "040d70a9bc53edbf1a0353db484652a7", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "040d70a9bc53edbf1a0353db484652a7");
                                    } else {
                                        HomePageFragment.this.k.g();
                                    }
                                }
                            }, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
                        }
                        if (HomePageFragment.this.o != null) {
                            HomePageFragment.this.o.a(true);
                            ad.a(new Runnable() { // from class: com.sankuai.waimai.business.page.home.HomePageFragment.c.2
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9bf9aa5bef630ad51c4a0ab779016c92", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9bf9aa5bef630ad51c4a0ab779016c92");
                                    } else {
                                        HomePageFragment.this.o.b();
                                    }
                                }
                            }, 50L);
                        }
                        if (HomePageFragment.this.k.c() == d.b.PROGRESS) {
                            HomePageFragment.this.k.b();
                        }
                        int height = HomePageFragment.this.D.getHeight();
                        if (height > 0) {
                            HomePageFragment.this.m.a(height);
                        }
                    }
                    com.sankuai.waimai.business.page.home.e eVar = HomePageFragment.this.k;
                    Object[] objArr3 = {baseResponse2};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.home.e.a;
                    if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "9fa1e6574067febdb7ae965662991496", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "9fa1e6574067febdb7ae965662991496");
                    } else {
                        String a2 = com.sankuai.waimai.business.page.home.log.c.a(true, (BaseResponse) null, (BaseResponse) baseResponse2);
                        com.sankuai.waimai.platform.capacity.log.e a3 = com.sankuai.waimai.platform.capacity.log.f.a().a("/home/feeds/rcmdboard");
                        eVar.c.b(com.sankuai.waimai.platform.widget.emptylayout.d.m, com.meituan.android.singleton.b.a.getString(R.string.wm_page_poiList_no_poi), a2, (String) null, (View.OnClickListener) null);
                        eVar.c.f();
                        com.sankuai.waimai.business.page.home.log.b.a(a2, null, baseResponse2, a3);
                    }
                    HomePageFragment.this.a("rcmd_data_null");
                    com.sankuai.waimai.business.page.home.utils.i.a(true);
                }
                try {
                    HomePageFragment.this.g();
                } catch (Exception e) {
                    com.sankuai.waimai.foundation.utils.log.a.b(e);
                }
                try {
                    a();
                } catch (Exception e2) {
                    com.sankuai.waimai.foundation.utils.log.a.b(e2);
                }
            } catch (Throwable th) {
                try {
                    HomePageFragment.this.g();
                } catch (Exception e3) {
                    com.sankuai.waimai.foundation.utils.log.a.b(e3);
                }
                try {
                    a();
                } catch (Exception e4) {
                    com.sankuai.waimai.foundation.utils.log.a.b(e4);
                }
                throw th;
            }
        }

        @Override // com.sankuai.waimai.business.page.home.c.b
        public final void a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a178c595e330e4f849cf4227e54bf851", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a178c595e330e4f849cf4227e54bf851");
                return;
            }
            com.sankuai.waimai.business.page.home.e eVar = HomePageFragment.this.k;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.page.home.e.a;
            if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "2c7861f48025fd7290b8d2f12e5867b9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "2c7861f48025fd7290b8d2f12e5867b9");
            } else if (eVar.d != null) {
                eVar.d.setVisibility(8);
            }
            if (i == 0 || i == 1 || i == 2 || i == 6 || i == 4 || i == 5) {
                HomePageFragment.this.k.d();
            }
            HomePageFragment.d(HomePageFragment.this, 2);
        }

        @Override // com.sankuai.waimai.business.page.home.c.b
        public final void a(Throwable th) {
            Object[] objArr = {th};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3adfbcd5255e54845fe2ecefe317af08", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3adfbcd5255e54845fe2ecefe317af08");
                return;
            }
            HomePageFragment.d(HomePageFragment.this, 0);
            HomePageFragment.this.a("rcmd_net_error");
            com.sankuai.waimai.business.page.home.utils.i.a(true);
        }

        private void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7f965cf71f2481f4de27e21ebfcc85f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7f965cf71f2481f4de27e21ebfcc85f");
                return;
            }
            if (HomePageFragment.O) {
                HomePageFragment.c(false);
                com.sankuai.waimai.business.page.home.utils.a.a(AppUtil.generatePageInfoKey(this));
                com.sankuai.waimai.business.page.home.utils.j.a();
                new com.sankuai.waimai.business.page.home.utils.g(5, "home_page").a();
            }
            com.sankuai.waimai.business.page.home.utils.i.a(true);
        }
    }

    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a03233778cb75e583baf6e06aed91ae8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a03233778cb75e583baf6e06aed91ae8");
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity instanceof BaseActivity) {
            MetricsSpeedMeterTask s = ((BaseActivity) activity).s();
            s.recordStep(O ? "cold_start_ready" : "hot_start_ready");
            com.sankuai.meituan.takeoutnew.util.aop.h.a(s.recordStep("activity_data_ready"));
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47bfbf9b0c6812eebb97e67e36249ba4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47bfbf9b0c6812eebb97e67e36249ba4");
            return;
        }
        if (getActivity() instanceof BaseActivity) {
            ((BaseActivity) getActivity()).s().disable();
        }
        this.P = true;
        com.sankuai.waimai.business.page.home.utils.j.cancel(str);
        m.a().cancel();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class g extends BroadcastReceiver {
        public static ChangeQuickRedirect a;

        public g() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93999e07716801383377b753a4bd7337", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93999e07716801383377b753a4bd7337");
            } else if (!HomePageFragment.this.p() && com.sankuai.waimai.platform.utils.f.a(intent, "coupon_outer_type", -1) >= 0) {
                HomePageFragment.this.l();
            }
        }
    }

    private static boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9642508bdae4abb6b96140f7fead168d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9642508bdae4abb6b96140f7fead168d")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("hwMultiwindow-magic") || str.contains("hw-magic-windows") || str.contains("miui-magic-windows") || str.contains("oplus-magic-windows") || str.contains("multi-landscape");
    }

    public static boolean a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b5d29490bb7f25d24c440c681d077127", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b5d29490bb7f25d24c440c681d077127")).booleanValue() : b(b(activity));
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f308d7c8cbf71d6941157559ca96d39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f308d7c8cbf71d6941157559ca96d39");
        } else if (com.sankuai.waimai.foundation.utils.f.a(this.F) || this.z == null) {
        } else {
            if (this.z.a() == 0) {
                if (this.ah != 2) {
                    return;
                }
                d();
                this.ah = 1;
            }
            this.z.a(this.ah, true);
        }
    }

    private static String b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "11af0672a073773e13b3f43f990f3344", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "11af0672a073773e13b3f43f990f3344");
        }
        try {
            if (activity == null) {
                return com.meituan.android.singleton.b.a.getResources().getConfiguration().toString();
            }
            return activity.getResources().getConfiguration().toString();
        } catch (Exception unused) {
            return "";
        }
    }
}
