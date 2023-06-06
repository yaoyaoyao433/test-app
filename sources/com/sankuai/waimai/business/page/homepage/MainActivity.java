package com.sankuai.waimai.business.page.homepage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.android.common.kitefly.KiteFlyConstants;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.common.weaver.interfaces.Weaver;
import com.meituan.android.mrn.engine.u;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
import com.meituan.metrics.Metrics;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.sankuai.waimai.business.knb.VIPCardKNBFragment;
import com.sankuai.waimai.business.order.api.orderlist.IOrderListProvider;
import com.sankuai.waimai.business.page.common.arch.PageActivity;
import com.sankuai.waimai.business.page.home.HomePageFragment;
import com.sankuai.waimai.business.page.home.HomePageViewModel;
import com.sankuai.waimai.business.page.home.WMHomePageFragment;
import com.sankuai.waimai.business.page.home.gray.HomeGrayManager;
import com.sankuai.waimai.business.page.home.helper.ResourceHelper;
import com.sankuai.waimai.business.page.home.interfacer.c;
import com.sankuai.waimai.business.page.home.model.DynamicTabInfo;
import com.sankuai.waimai.business.page.home.model.DynamicTabListInfoResponse;
import com.sankuai.waimai.business.page.home.model.HomeSecondFloorResponse;
import com.sankuai.waimai.business.page.home.model.h;
import com.sankuai.waimai.business.page.home.preload.PreloadDataModel;
import com.sankuai.waimai.business.page.home.utils.j;
import com.sankuai.waimai.business.page.home.utils.k;
import com.sankuai.waimai.business.page.home.utils.m;
import com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper;
import com.sankuai.waimai.business.page.home.widget.twolevel.SecondFloorViewModel;
import com.sankuai.waimai.business.page.home.widget.twolevel.strategy.b;
import com.sankuai.waimai.business.page.homepage.bubble.d;
import com.sankuai.waimai.business.page.homepage.bubble.e;
import com.sankuai.waimai.business.page.homepage.bubble.g;
import com.sankuai.waimai.business.page.homepage.controller.BaseBottomStatusMainController;
import com.sankuai.waimai.business.page.homepage.controller.NewBottomStatusMainController;
import com.sankuai.waimai.business.page.homepage.view.TitleIndicator;
import com.sankuai.waimai.business.page.homepage.view.d;
import com.sankuai.waimai.business.page.homepage.view.tab.TabInfo;
import com.sankuai.waimai.business.page.mine.MineMPFragment;
import com.sankuai.waimai.business.page.mine.MineRNFagment;
import com.sankuai.waimai.business.page.mine.WaimaiMineService;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.foundation.core.service.user.b;
import com.sankuai.waimai.foundation.core.utils.f;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.imbase.utils.ImSP;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.lottie.LottieResItem;
import com.sankuai.waimai.platform.capacity.abtest.ABTestManager;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import com.sankuai.waimai.platform.domain.manager.home.TabLoadManager;
import com.sankuai.waimai.platform.domain.manager.ugc.IContentFeedListProvider;
import com.sankuai.waimai.platform.popup.WMBasePopup;
import com.sankuai.waimai.platform.popup.e;
import com.sankuai.waimai.platform.utils.l;
import com.sankuai.waimai.platform.utils.listid.ListIDHelper;
import com.sankuai.waimai.platform.utils.p;
import com.sankuai.waimai.platform.widget.filterbar.view.model.SliderSelectData;
import com.sankuai.waimai.popup.WMSharePasswordPopup;
import com.sankuai.waimai.popup.WMStartUpPopup;
import com.sankuai.waimai.popup.intelligent.IntelligentGuidePopup;
import com.sankuai.waimai.popup.ugc.WMUGCFeedGuidePopup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@SuppressLint({"LogUsage"})
/* loaded from: classes4.dex */
public class MainActivity extends PageActivity implements ViewPager.OnPageChangeListener, WMHomePageFragment.a, c, e, com.sankuai.waimai.foundation.core.service.user.b, com.sankuai.waimai.platform.domain.manager.home.a, com.sankuai.waimai.platform.machpro.video.a, com.sankuai.waimai.platform.monitor.a, e.a, IntelligentGuidePopup.a, WMUGCFeedGuidePopup.a {
    private static WeakReference<MainActivity> D = null;
    public static ChangeQuickRedirect c = null;
    public static boolean i = true;
    private int E;
    private ResourceHelper F;
    @Nullable
    private com.sankuai.waimai.business.page.homepage.controller.a G;
    private NewBottomStatusMainController H;
    private FrameLayout I;
    private final SparseArray<Fragment> J;
    private boolean K;
    private Handler L;
    private long M;
    private long N;
    private ArrayList<String> O;
    private ArrayList<SliderSelectData> P;
    private com.sankuai.waimai.platform.domain.core.channel.a Q;
    private IntentFilter R;
    private boolean S;
    private boolean T;
    private boolean U;
    private TabInfo V;
    private TabInfo W;
    private boolean X;
    private final CountDownLatch Y;
    private com.sankuai.waimai.business.page.home.interfacer.a Z;
    private BroadcastReceiver aa;
    private int ab;
    ImageView d;
    public TitleIndicator e;
    public com.sankuai.waimai.business.page.homepage.view.tab.a f;
    public LinearLayout g;
    public g.a h;
    boolean j;
    boolean k;
    public boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private Intent r;
    private boolean s;
    private boolean t;
    private ObjectAnimator u;
    private ValueAnimator v;

    private static boolean e(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c98b9532e2dcc601e423c6af7793461b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c98b9532e2dcc601e423c6af7793461b")).booleanValue() : i2 == 0 || i2 == 1 || i2 == 3 || i2 == 4 || i2 == 2;
    }

    @Override // com.sankuai.waimai.foundation.core.service.user.b
    public void onAccountInfoUpdate(b.EnumC0948b enumC0948b) {
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i2) {
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i2, float f, int i3) {
    }

    public MainActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "923c0dbe92ac2d09521e12b8c0bf543a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "923c0dbe92ac2d09521e12b8c0bf543a");
            return;
        }
        this.m = false;
        this.p = false;
        this.E = 0;
        this.J = new SparseArray<>(4);
        this.K = false;
        this.L = new Handler(new Handler.Callback() { // from class: com.sankuai.waimai.business.page.homepage.MainActivity.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean z = false;
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "42c6705a2c35c9dd882703c83cebfaf7", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "42c6705a2c35c9dd882703c83cebfaf7")).booleanValue();
                }
                switch (message.what) {
                    case 1:
                        MainActivity.a(MainActivity.this, false);
                        break;
                    case 2:
                        WMHomePageFragment h = MainActivity.this.h();
                        if (h != null) {
                            h.b((message.arg1 == 1 || message.arg2 == 1) ? true : true);
                            h.a(MainActivity.this.H);
                            break;
                        }
                        break;
                    case 3:
                        Activity activity = MainActivity.D != null ? (Activity) MainActivity.D.get() : null;
                        if (activity != null && !activity.isFinishing()) {
                            LocalBroadcastManager.getInstance(activity).sendBroadcast(new Intent("com.sankuai.waimai.business.page.action.showWeather"));
                            break;
                        }
                        break;
                    default:
                        return false;
                }
                return true;
            }
        });
        this.M = 0L;
        this.S = false;
        this.T = false;
        this.j = false;
        this.k = false;
        this.U = false;
        this.V = null;
        this.W = null;
        this.Y = new CountDownLatch(1);
        this.Z = new com.sankuai.waimai.business.page.home.interfacer.a() { // from class: com.sankuai.waimai.business.page.homepage.MainActivity.7
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.page.home.interfacer.a
            public final void a(int i2, boolean z) {
                Object[] objArr2 = {Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1037eaca1780467cab2953c44026c429", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1037eaca1780467cab2953c44026c429");
                } else {
                    MainActivity.this.b(i2, z);
                }
            }

            @Override // com.sankuai.waimai.business.page.home.interfacer.a
            public final int a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fa470fb79c0e8dec8bcc2ddc6d9ccf58", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fa470fb79c0e8dec8bcc2ddc6d9ccf58")).intValue() : MainActivity.this.ab;
            }

            @Override // com.sankuai.waimai.business.page.home.interfacer.a
            public final int b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7e90d05c41823d01bb91e4dce4b5e838", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7e90d05c41823d01bb91e4dce4b5e838")).intValue() : MainActivity.this.E;
            }
        };
        this.aa = new BroadcastReceiver() { // from class: com.sankuai.waimai.business.page.homepage.MainActivity.6
            public static ChangeQuickRedirect a;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                Object[] objArr2 = {context, intent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "62ba74e7d1f9e556bbd3c8ac95f544b2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "62ba74e7d1f9e556bbd3c8ac95f544b2");
                } else if (MainActivity.this.E != 2 || intent == null || intent.getExtras() == null) {
                } else {
                    String string = intent.getExtras().getString("data");
                    if (TextUtils.isEmpty(string)) {
                        return;
                    }
                    try {
                        int optInt = new JSONObject(string).optInt("style", -1);
                        if (optInt != -1) {
                            MainActivity.this.a(true, optInt == 0);
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        this.ab = -1;
    }

    public static /* synthetic */ boolean a(MainActivity mainActivity, boolean z) {
        mainActivity.K = false;
        return false;
    }

    public static /* synthetic */ void b(MainActivity mainActivity, boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, mainActivity, changeQuickRedirect, false, "53b3e65707b1b637d75df9117bafce7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mainActivity, changeQuickRedirect, false, "53b3e65707b1b637d75df9117bafce7f");
            return;
        }
        JudasManualManager.a a2 = JudasManualManager.a("b_waimai_lm4hj7kq_mc", "c_m84bv26", AppUtil.generatePageInfoKey(mainActivity.e));
        a2.a("status", 2).a("rank_list_id", ListIDHelper.a.a.a("page", k.d)).a("source_id", mainActivity.k ? "PickMe" : "EatWhat").a("ref_list_id", "");
        if (z) {
            a2.a("qipao", 1).a("qipao_id", com.sankuai.waimai.business.page.homepage.bubble.b.a().b());
        } else {
            a2.a("qipao", 2);
        }
        a2.a();
    }

    public static /* synthetic */ void h(MainActivity mainActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, mainActivity, changeQuickRedirect, false, "7d4b13620ec28c0be051a7a769670b97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mainActivity, changeQuickRedirect, false, "7d4b13620ec28c0be051a7a769670b97");
        } else if (mainActivity.T) {
            JudasManualManager.a("b_waimai_23w4c3m0_mc", "c_vt3zp1ef", AppUtil.generatePageInfoKey(mainActivity)).a("vip_tab_exp", mainActivity.U ? "sq" : KiteFlyConstants.VIP_NAME).a();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class a implements com.sankuai.waimai.business.page.homepage.listener.b {
        public static ChangeQuickRedirect a;
        private LinearLayout b;

        @Override // com.sankuai.waimai.business.page.homepage.listener.b
        public final void a(LinearLayout linearLayout) {
            this.b = linearLayout;
        }

        @Override // com.sankuai.waimai.business.page.homepage.listener.b
        public final void a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1d7648db83e59c1ce7baab324a84c51", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1d7648db83e59c1ce7baab324a84c51");
            } else if (this.b != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams();
                marginLayoutParams.bottomMargin = com.sankuai.waimai.foundation.utils.g.a(this.b.getContext(), i);
                this.b.setLayoutParams(marginLayoutParams);
                this.b.requestLayout();
            }
        }
    }

    public static void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3ba89dbb7281c04aeac68af9239a2eae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3ba89dbb7281c04aeac68af9239a2eae");
            return;
        }
        MainActivity mainActivity = D != null ? D.get() : null;
        HomePageProvider homePageProvider = (HomePageProvider) com.sankuai.waimai.router.a.a(HomePageProvider.class, "wm_main");
        if (homePageProvider != null) {
            homePageProvider.exitApp(mainActivity);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b21a523f850627d3e6bf9cdc85a8267f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b21a523f850627d3e6bf9cdc85a8267f");
            return;
        }
        super.onWindowFocusChanged(z);
        if (!z || this.G == null) {
            return;
        }
        com.sankuai.waimai.business.page.homepage.controller.a aVar = this.G;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.page.homepage.controller.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "77652ae174784e1aec09de505bb01953", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "77652ae174784e1aec09de505bb01953");
        } else {
            aVar.b();
        }
    }

    @Override // com.sankuai.waimai.business.page.common.arch.PageActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        SparseArray<TabInfo> sparseArray;
        f fVar;
        f.c cVar;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "644c15d1f7d6a119b18407a68beceb28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "644c15d1f7d6a119b18407a68beceb28");
            return;
        }
        com.sankuai.waimai.business.page.common.abtest.a.j();
        if (TimeUtil.elapsedTimeMillis() - TimeUtil.processStartElapsedTimeMillis() > 30000) {
            j.cancel("main_page_start_delayed");
        } else {
            j.a("Home+");
        }
        m.a().a("Home+");
        if (bundle != null) {
            this.n = bundle.getBoolean("mHasPostSkyFallMark", false);
            this.o = bundle.getBoolean("mNeedPostSkyFallRequest", false);
            this.q = bundle.getBoolean("pre_loading_discard_sky_fall_mark");
            this.t = bundle.getBoolean(WMStartUpPopup.SPLASH_AD_INTENT, false);
            this.s = bundle.getBoolean("check_popups_after_ad", false);
        }
        if (!this.t) {
            this.r = (Intent) getIntent().getParcelableExtra(WMStartUpPopup.SPLASH_AD_INTENT);
        }
        if (bundle == null && this.r != null) {
            ABStrategy strategy = ABTestManager.getInstance().getStrategy("tianjiang_loading_android", null);
            if (strategy != null && "preloading".equalsIgnoreCase(strategy.expName)) {
                this.q = true;
                this.n = false;
                this.o = false;
            } else {
                this.n = true;
                this.o = true;
                this.q = false;
            }
        }
        if (this.r == null) {
            p();
        }
        HomePageProvider homePageProvider = (HomePageProvider) com.sankuai.waimai.router.a.a(HomePageProvider.class, "wm_main");
        if (homePageProvider != null) {
            homePageProvider.setIsExit(false);
        }
        super.onCreate(bundle);
        com.sankuai.waimai.business.page.home.preload.e.a(s());
        if (bundle != null) {
            this.E = bundle.getInt("mCurrentTab", 0);
            Object[] objArr2 = {bundle};
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "537cdbae0781b00293a6955855306f40", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "537cdbae0781b00293a6955855306f40");
            } else {
                String string = bundle.getString("contentFeedTabName", "");
                String string2 = bundle.getString("contentFeedTabLink", "");
                String string3 = bundle.getString("contentFeedTabNormalPicUrl", "");
                String string4 = bundle.getString("contentFeedTabSelectedPicUrl", "");
                this.j = bundle.getBoolean("showContentFeedTab", false);
                this.k = bundle.getBoolean("showPickMeTab", false);
                Class<Fragment> contentFeedListFragmentClass = ((IContentFeedListProvider) com.sankuai.waimai.router.a.a(IContentFeedListProvider.class, this.k ? IContentFeedListProvider.CONTENT_PICK_ME_KEY : IContentFeedListProvider.CONTENT_ROUTER_KEY)).getContentFeedListFragmentClass();
                if (contentFeedListFragmentClass == null) {
                    contentFeedListFragmentClass = Fragment.class;
                }
                TabInfo tabInfo = new TabInfo(1, string, 1, contentFeedListFragmentClass);
                tabInfo.d = string2;
                tabInfo.e = string3;
                tabInfo.f = string4;
                this.W = tabInfo;
            }
            Object[] objArr3 = {bundle};
            ChangeQuickRedirect changeQuickRedirect3 = c;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9f860fdde1c06b1b4f7f8a3a0d5316e8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9f860fdde1c06b1b4f7f8a3a0d5316e8");
            } else {
                String string5 = bundle.getString("vipCardTabName", "");
                String string6 = bundle.getString("vipCardTabLink", "");
                String string7 = bundle.getString("normalPicUrl", "");
                String string8 = bundle.getString("selectedPicUrl", "");
                this.T = bundle.getBoolean("isShowVipCardTab", false);
                TabInfo tabInfo2 = new TabInfo(2, string5, 2, com.sankuai.waimai.business.page.homepage.knb.a.a("wm_knb_vip_card").a());
                tabInfo2.d = string6;
                tabInfo2.e = string7;
                tabInfo2.f = string8;
                this.V = tabInfo2;
            }
        } else if (!y()) {
            b(getIntent());
        }
        getWindow().setBackgroundDrawableResource(R.color.wm_restaurant_common_background_page);
        a(true, true);
        com.sankuai.waimai.platform.popup.e a2 = com.sankuai.waimai.platform.popup.e.a();
        Object[] objArr4 = {this};
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.platform.popup.e.a;
        if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "74eb762b39ea26d4a574c53dc2e41ef1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "74eb762b39ea26d4a574c53dc2e41ef1");
        } else if (a2.f == null) {
            if (com.sankuai.waimai.foundation.core.a.d()) {
                a2.f = com.sankuai.waimai.platform.popup.a.a(this, Arrays.asList(com.sankuai.waimai.platform.popup.e.b));
            } else if (com.sankuai.waimai.foundation.core.a.e()) {
                a2.f = com.sankuai.waimai.platform.popup.a.a(this, Arrays.asList(com.sankuai.waimai.platform.popup.e.c));
                com.sankuai.waimai.router.a.a(WMBasePopup.class, "account_notice");
            } else {
                a2.f = com.sankuai.waimai.platform.popup.a.a(this, Arrays.asList(com.sankuai.waimai.platform.popup.e.d));
            }
        }
        com.sankuai.waimai.platform.popup.e.a().g = this;
        try {
            setContentView(R.layout.takeout_activity_main);
        } catch (Resources.NotFoundException e) {
            try {
                setContentView(R.layout.takeout_activity_main);
            } catch (Exception unused) {
                com.sankuai.waimai.foundation.utils.log.a.e(getClass().getSimpleName(), e.getMessage(), new Object[0]);
                finish();
                return;
            }
        }
        D = new WeakReference<>(this);
        this.e = (TitleIndicator) findViewById(R.id.pagerindicator);
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = c;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "ca5c65d1661b95562e91df86938f7a5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "ca5c65d1661b95562e91df86938f7a5c");
        } else {
            HomeGrayManager.a().a(this.e, 2, 4, "", 0);
            if (getWindow() != null) {
                HomeGrayManager.a().a(getWindow().getDecorView(), 1, 0, "", 0);
            }
        }
        this.I = (FrameLayout) findViewById(R.id.pager_container);
        this.f = new com.sankuai.waimai.business.page.homepage.view.tab.a(this.e);
        this.g = (LinearLayout) findViewById(R.id.floating_container);
        this.F = new ResourceHelper(this);
        this.H = new NewBottomStatusMainController(this, this.L, (ViewStub) findViewById(R.id.layout_order_status), (ViewStub) findViewById(R.id.layout_weather_status));
        this.G = new com.sankuai.waimai.business.page.homepage.controller.a(this, this.L, this.e, w(), this.H);
        d a3 = d.a();
        Object[] objArr6 = {this};
        ChangeQuickRedirect changeQuickRedirect6 = d.a;
        if (PatchProxy.isSupport(objArr6, a3, changeQuickRedirect6, false, "852ca726fefa70225e429d27153666db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, a3, changeQuickRedirect6, false, "852ca726fefa70225e429d27153666db");
        } else {
            if (a3.b == null) {
                a3.b = new ArrayList();
            }
            if (!a3.b()) {
                a3.b.add(this);
            }
        }
        com.sankuai.waimai.platform.domain.manager.user.a.i().a((com.sankuai.waimai.foundation.core.service.user.b) this);
        TabLoadManager a4 = TabLoadManager.a();
        Object[] objArr7 = {this};
        ChangeQuickRedirect changeQuickRedirect7 = TabLoadManager.a;
        if (PatchProxy.isSupport(objArr7, a4, changeQuickRedirect7, false, "e7bec2d0001e48f7f888a7d3ed67fc3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, a4, changeQuickRedirect7, false, "e7bec2d0001e48f7f888a7d3ed67fc3e");
        } else {
            if (a4.b == null) {
                a4.b = new ArrayList();
            }
            a4.b.add(this);
        }
        Object[] objArr8 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect8 = c;
        if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "c1a7bf300e688fb5476f619c3b6d3548", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "c1a7bf300e688fb5476f619c3b6d3548");
        } else {
            Object[] objArr9 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect9 = c;
            if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "81e066771f8283be93fb48b929bde3ed", RobustBitConfig.DEFAULT_VALUE)) {
                sparseArray = (SparseArray) PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "81e066771f8283be93fb48b929bde3ed");
            } else {
                sparseArray = new SparseArray<>();
                ABStrategy strategy2 = ABTestManager.getInstance().getStrategy("mine_machPro_change", null);
                Class<Fragment> orderListFragmentClass = ((IOrderListProvider) com.sankuai.waimai.router.a.a(IOrderListProvider.class, "wm_order")).getOrderListFragmentClass();
                Class<Fragment> contentFeedListFragmentClass2 = ((IContentFeedListProvider) com.sankuai.waimai.router.a.a(IContentFeedListProvider.class, IContentFeedListProvider.CONTENT_ROUTER_KEY)).getContentFeedListFragmentClass();
                sparseArray.put(0, new TabInfo(0, getString(R.string.title_section0), 0, WMHomePageFragment.class));
                String string9 = getString(R.string.title_section1);
                if (contentFeedListFragmentClass2 == null) {
                    contentFeedListFragmentClass2 = Fragment.class;
                }
                sparseArray.put(1, new TabInfo(1, string9, 1, contentFeedListFragmentClass2));
                sparseArray.put(2, this.V != null ? this.V : new TabInfo(2, getString(R.string.title_section2), 2, com.sankuai.waimai.business.page.homepage.knb.a.a("wm_knb_vip_card").a()));
                String string10 = getString(R.string.title_section3);
                if (orderListFragmentClass == null) {
                    orderListFragmentClass = Fragment.class;
                }
                sparseArray.put(3, new TabInfo(3, string10, 3, orderListFragmentClass));
                sparseArray.put(4, new TabInfo(4, getString(R.string.title_section4), 4, MineRNFagment.class));
                if (strategy2 != null && strategy2.expName.equals("A")) {
                    sparseArray.put(4, new TabInfo(4, getString(R.string.title_section4), 4, MineMPFragment.class));
                }
            }
            this.e.a(this.E, sparseArray);
            new ResourceHelper(this).getShowDrawable("bg_bottom_tab");
            this.e.setOnTabClickListener(new TitleIndicator.b() { // from class: com.sankuai.waimai.business.page.homepage.MainActivity.11
                public static ChangeQuickRedirect a;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v11 */
                /* JADX WARN: Type inference failed for: r2v12, types: [boolean, byte] */
                /* JADX WARN: Type inference failed for: r2v13 */
                @Override // com.sankuai.waimai.business.page.homepage.view.TitleIndicator.b
                public final void a(int i2) {
                    Object[] objArr10 = {Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect10 = a;
                    if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "56926d72f2950cf3fa7f75ef420d198f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "56926d72f2950cf3fa7f75ef420d198f");
                        return;
                    }
                    if (i2 == 1) {
                        MainActivity.b(MainActivity.this, g.a().b(1));
                        MainActivity mainActivity = MainActivity.this;
                        ?? r2 = MainActivity.this.ab == 1 ? 1 : 0;
                        Object[] objArr11 = {Byte.valueOf((byte) r2)};
                        ChangeQuickRedirect changeQuickRedirect11 = MainActivity.c;
                        if (PatchProxy.isSupport(objArr11, mainActivity, changeQuickRedirect11, false, "b33ef20e60dd0e4e334968bfc2b35416", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr11, mainActivity, changeQuickRedirect11, false, "b33ef20e60dd0e4e334968bfc2b35416");
                        } else if (mainActivity.j && !mainActivity.k) {
                            IContentFeedListProvider iContentFeedListProvider = (IContentFeedListProvider) com.sankuai.waimai.router.a.a(IContentFeedListProvider.class, IContentFeedListProvider.CONTENT_ROUTER_KEY);
                            iContentFeedListProvider.onTabClick(mainActivity.a(1, iContentFeedListProvider.getContentFeedListFragmentClass()), r2, mainActivity.bB_());
                        }
                    } else if (i2 == 2) {
                        MainActivity.h(MainActivity.this);
                    }
                    g a5 = g.a();
                    byte b2 = (i2 == 1 && MainActivity.this.k) ? (byte) 1 : (byte) 0;
                    Object[] objArr12 = {Integer.valueOf(i2), Byte.valueOf(b2)};
                    ChangeQuickRedirect changeQuickRedirect12 = g.a;
                    if (PatchProxy.isSupport(objArr12, a5, changeQuickRedirect12, false, "1dbe4c5ed3a4c57e64733f20d1587ed0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr12, a5, changeQuickRedirect12, false, "1dbe4c5ed3a4c57e64733f20d1587ed0");
                    } else if (a5.c(i2)) {
                        a5.a(i2);
                    } else if (a5.e()) {
                        if (i2 != 0 && a5.f != null && 1 == a5.a(a5.f)) {
                            a5.a(-1, 2);
                        }
                        if (b2 != 0) {
                            a5.b();
                        } else {
                            Object[] objArr13 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect13 = g.a;
                            if (PatchProxy.isSupport(objArr13, a5, changeQuickRedirect13, false, "3a8183ec9f971c5ff2c41d57571a122c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr13, a5, changeQuickRedirect13, false, "3a8183ec9f971c5ff2c41d57571a122c");
                            } else {
                                a5.d.a(0);
                            }
                        }
                    }
                    com.sankuai.waimai.business.page.home.actinfo.b.a(i2);
                    MainActivity.this.b(i2);
                }
            });
            TabInfo a5 = this.e.a(2);
            if (a5 != null) {
                this.e.a(a5.j, this.T ? 0 : 8);
            }
            TabInfo a6 = this.e.a(1);
            if (a6 != null) {
                this.e.a(a6.j, this.j ? 0 : 8);
            }
            z();
        }
        Object[] objArr10 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect10 = c;
        if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "9dbb224396609b79be5f5171e6035241", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "9dbb224396609b79be5f5171e6035241");
        } else {
            b bVar = new b(this.F);
            Object[] objArr11 = {bVar, Long.valueOf((long) MetricsAnrManager.ANR_THRESHOLD)};
            ChangeQuickRedirect changeQuickRedirect11 = BaseActivity.w;
            if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "394caa88e9fe46675c971d8cb3c7bab3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "394caa88e9fe46675c971d8cb3c7bab3");
            } else {
                com.sankuai.waimai.foundation.core.base.activity.d dVar = this.y;
                Object[] objArr12 = {bVar, new Long((long) MetricsAnrManager.ANR_THRESHOLD)};
                ChangeQuickRedirect changeQuickRedirect12 = com.sankuai.waimai.foundation.core.base.activity.d.a;
                if (PatchProxy.isSupport(objArr12, dVar, changeQuickRedirect12, false, "a44cbd3430af9a50df553f94b9a1cd3f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr12, dVar, changeQuickRedirect12, false, "a44cbd3430af9a50df553f94b9a1cd3f");
                } else {
                    dVar.b().add(new WeakReference<>(bVar));
                    Object[] objArr13 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect13 = com.sankuai.waimai.foundation.core.base.activity.d.a;
                    if (PatchProxy.isSupport(objArr13, dVar, changeQuickRedirect13, false, "62509aeb902db588ea5a7325529e23b2", RobustBitConfig.DEFAULT_VALUE)) {
                        fVar = (f) PatchProxy.accessDispatch(objArr13, dVar, changeQuickRedirect13, false, "62509aeb902db588ea5a7325529e23b2");
                    } else {
                        if (dVar.b == null) {
                            dVar.b = new f();
                        }
                        fVar = dVar.b;
                    }
                    Object[] objArr14 = {bVar, new Long((long) MetricsAnrManager.ANR_THRESHOLD)};
                    ChangeQuickRedirect changeQuickRedirect14 = f.a;
                    if (PatchProxy.isSupport(objArr14, fVar, changeQuickRedirect14, false, "3169f4ad1aa46b3ec18df8ebcfc8a70a", RobustBitConfig.DEFAULT_VALUE)) {
                        ((Boolean) PatchProxy.accessDispatch(objArr14, fVar, changeQuickRedirect14, false, "3169f4ad1aa46b3ec18df8ebcfc8a70a")).booleanValue();
                    } else {
                        f.b bVar2 = fVar.b;
                        Object[] objArr15 = {bVar};
                        ChangeQuickRedirect changeQuickRedirect15 = f.a;
                        if (PatchProxy.isSupport(objArr15, fVar, changeQuickRedirect15, false, "6e658d1704c2dc03d33338cb169c800c", RobustBitConfig.DEFAULT_VALUE)) {
                            cVar = (f.c) PatchProxy.accessDispatch(objArr15, fVar, changeQuickRedirect15, false, "6e658d1704c2dc03d33338cb169c800c");
                        } else {
                            f.a aVar = new f.a(fVar.c, bVar);
                            fVar.d.a(aVar);
                            cVar = aVar.e;
                        }
                        bVar2.postDelayed(cVar, MetricsAnrManager.ANR_THRESHOLD);
                    }
                }
            }
        }
        a(getIntent());
        Object[] objArr16 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect16 = c;
        if (PatchProxy.isSupport(objArr16, this, changeQuickRedirect16, false, "775fef6cb6c113f413ade40a12b8136b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr16, this, changeQuickRedirect16, false, "775fef6cb6c113f413ade40a12b8136b");
        } else {
            this.R = new IntentFilter();
            this.R.addAction("android.intent.action.SCREEN_OFF");
            this.R.addAction("android.intent.action.SCREEN_ON");
        }
        final ViewGroup viewGroup = (ViewGroup) findViewById(R.id.floating_container);
        this.h = new g.a() { // from class: com.sankuai.waimai.business.page.homepage.MainActivity.8
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.page.homepage.bubble.g.a
            public final void a(int i2, boolean z) {
                Object[] objArr17 = {Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect17 = a;
                if (PatchProxy.isSupport(objArr17, this, changeQuickRedirect17, false, "fbbada42a4d22dc1225f9ade73c5068a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr17, this, changeQuickRedirect17, false, "fbbada42a4d22dc1225f9ade73c5068a");
                } else if (viewGroup == null || !z) {
                } else {
                    viewGroup.setPadding(0, 0, 0, g.a().g());
                }
            }

            @Override // com.sankuai.waimai.business.page.homepage.bubble.g.a
            public final void b(int i2, boolean z) {
                Object[] objArr17 = {Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect17 = a;
                if (PatchProxy.isSupport(objArr17, this, changeQuickRedirect17, false, "8875cab4c2e62eac749fb1f21c475c1a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr17, this, changeQuickRedirect17, false, "8875cab4c2e62eac749fb1f21c475c1a");
                    return;
                }
                if (viewGroup != null && z) {
                    viewGroup.setPadding(0, 0, 0, 0);
                }
                if (i2 == 1 && com.sankuai.waimai.business.page.homepage.bubble.b.a().e && !MainActivity.this.k) {
                    IContentFeedListProvider iContentFeedListProvider = (IContentFeedListProvider) com.sankuai.waimai.router.a.a(IContentFeedListProvider.class, IContentFeedListProvider.CONTENT_ROUTER_KEY);
                    iContentFeedListProvider.onBubbleClicked(MainActivity.this.a(1, iContentFeedListProvider.getContentFeedListFragmentClass()));
                }
            }
        };
        g.a().a(this.h);
        LocalBroadcastManager.getInstance(this).registerReceiver(this.aa, new IntentFilter("waimai:waimai_vip_status_bar_style"));
        a aVar2 = new a();
        aVar2.a(this.g);
        com.sankuai.waimai.business.page.homepage.manager.a.b = aVar2;
        PreloadDataModel.get().isResetAppModel().a(new l<Integer>() { // from class: com.sankuai.waimai.business.page.homepage.MainActivity.9
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Integer num) {
                Integer num2 = num;
                Object[] objArr17 = {num2};
                ChangeQuickRedirect changeQuickRedirect17 = a;
                if (PatchProxy.isSupport(objArr17, this, changeQuickRedirect17, false, "e1bde9cf1975f5d7d07d0ef4ef64ab14", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr17, this, changeQuickRedirect17, false, "e1bde9cf1975f5d7d07d0ef4ef64ab14");
                } else if (num2 == null || num2.intValue() != 0 || MainActivity.this.m || MainActivity.this.r != null) {
                } else {
                    MainActivity.this.p();
                }
            }
        });
        Object[] objArr17 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect17 = c;
        if (PatchProxy.isSupport(objArr17, this, changeQuickRedirect17, false, "b5c611d27952c2036557abc5a6516078", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr17, this, changeQuickRedirect17, false, "b5c611d27952c2036557abc5a6516078");
        } else {
            int a7 = ImSP.a();
            if (a7 == 0) {
                a7 = MapConstant.LayerPropertyFlag_HeatmapRadius;
            }
            com.sankuai.waimai.imbase.push.b.a(1);
            ad.a(new Runnable() { // from class: com.sankuai.waimai.business.page.homepage.MainActivity.10
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr18 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect18 = a;
                    if (PatchProxy.isSupport(objArr18, this, changeQuickRedirect18, false, "fdfcc519e2fb20d5e671b71f021a5989", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr18, this, changeQuickRedirect18, false, "fdfcc519e2fb20d5e671b71f021a5989");
                    } else if (com.sankuai.waimai.imbase.push.b.a() != 3) {
                        com.sankuai.waimai.imbase.push.b.a(2);
                    }
                }
            }, a7);
        }
        Weaver.getExtension().addCustomTags(this.b, this, "wm_home_second_opening_rate_expname", com.sankuai.waimai.business.page.common.abtest.a.h());
    }

    @Override // com.sankuai.waimai.business.page.common.arch.PageActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f77e842cf327c7e7e22fe14c47d7ff3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f77e842cf327c7e7e22fe14c47d7ff3");
            return;
        }
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            bundle.putInt("mCurrentTab", this.E);
            bundle.putParcelable("android:support:fragments", null);
            Object[] objArr2 = {bundle};
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0bb897cfc49d65813136e6d24a6414c6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0bb897cfc49d65813136e6d24a6414c6");
            } else if (this.W != null) {
                bundle.putString("contentFeedTabName", this.W.c);
                bundle.putString("contentFeedTabLink", this.W.d);
                bundle.putString("contentFeedTabNormalPicUrl", this.W.e);
                bundle.putString("contentFeedTabSelectedPicUrl", this.W.f);
                bundle.putBoolean("showContentFeedTab", this.j);
                bundle.putBoolean("showPickMeTab", this.k);
            }
            Object[] objArr3 = {bundle};
            ChangeQuickRedirect changeQuickRedirect3 = c;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "081f8a31578041a898557e70ca3d665d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "081f8a31578041a898557e70ca3d665d");
            } else if (this.V != null) {
                bundle.putString("vipCardTabName", this.V.c);
                bundle.putString("vipCardTabLink", this.V.d);
                bundle.putString("normalPicUrl", this.V.e);
                bundle.putString("selectedPicUrl", this.V.f);
                bundle.putBoolean("isShowVipCardTab", this.T);
            }
            bundle.putBoolean("mHasPostSkyFallMark", this.n);
            bundle.putBoolean("mNeedPostSkyFallRequest", this.o);
            bundle.putBoolean("pre_loading_discard_sky_fall_mark", this.q);
            bundle.putBoolean(WMStartUpPopup.SPLASH_AD_INTENT, this.t);
            bundle.putBoolean("check_popups_after_ad", this.s);
        }
    }

    private void a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f84b73f09174e26df12687e255f2542", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f84b73f09174e26df12687e255f2542");
        } else if (intent != null && com.sankuai.waimai.foundation.router.a.a(intent)) {
            this.Q = com.sankuai.waimai.platform.domain.core.channel.a.a(com.sankuai.waimai.foundation.router.a.a(intent, "ch_ad_params", (String) null));
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b88d93275f6473bd33ae5cd0b24305e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b88d93275f6473bd33ae5cd0b24305e0");
            return;
        }
        try {
            super.onStart();
        } catch (Exception unused) {
        }
        if (this.H != null) {
            this.H.a();
            NewBottomStatusMainController newBottomStatusMainController = this.H;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = NewBottomStatusMainController.h;
            if (PatchProxy.isSupport(objArr2, newBottomStatusMainController, changeQuickRedirect2, false, "7f7a5abafc67c8c9118011c01b7de62b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, newBottomStatusMainController, changeQuickRedirect2, false, "7f7a5abafc67c8c9118011c01b7de62b");
                return;
            }
            com.sankuai.waimai.business.order.api.submit.c.a().registerOrderStatusObserver(newBottomStatusMainController);
            com.sankuai.waimai.imbase.manager.e.a().a(newBottomStatusMainController);
            com.sankuai.waimai.business.page.homepage.sharkpush.a a2 = com.sankuai.waimai.business.page.homepage.sharkpush.a.a();
            Object[] objArr3 = {newBottomStatusMainController};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.homepage.sharkpush.a.a;
            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "5df0636e676fa239838b385f4ddee3ba", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "5df0636e676fa239838b385f4ddee3ba");
                return;
            }
            if (a2.f == null) {
                a2.f = new ArrayList();
            }
            a2.f.add(newBottomStatusMainController);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "474667688a338548436a697a15ef33fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "474667688a338548436a697a15ef33fc");
            return;
        }
        super.onResume();
        aw_();
        this.l = true;
        if (this.X) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0de703a3c97df239b67d507b197dbd3b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0de703a3c97df239b67d507b197dbd3b");
            } else {
                WmAddress k = com.sankuai.waimai.foundation.location.v2.g.a().k();
                if (k != null && k.getWMLocation() != null && !k.getWMLocation().hasLocatedPermission && (TextUtils.isEmpty(k.getAddress()) || com.meituan.android.singleton.b.a.getString(R.string.wm_default_address_loading).equals(k.getAddress()))) {
                    k.setAddress(com.meituan.android.singleton.b.a.getString(R.string.wm_default_address));
                    com.sankuai.waimai.foundation.location.v2.g.a().a(k, com.sankuai.waimai.platform.domain.manager.location.v2.b.POI_FRAGMENT.toString(), false);
                    com.sankuai.waimai.platform.domain.manager.location.a.a(k);
                }
            }
            this.X = false;
        }
        Metrics.getInstance().setScrollCustom(this);
        WMSharePasswordPopup.reset();
        com.sankuai.waimai.platform.popup.e.a().b();
        j.a("main_page_resume_end");
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1c1b6098fc330f31af5074e893a2818", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1c1b6098fc330f31af5074e893a2818");
            return;
        }
        super.onPause();
        this.l = false;
    }

    @Override // com.sankuai.waimai.business.page.common.arch.PageActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9706e3a5b027b91375ef05e9f4a7581a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9706e3a5b027b91375ef05e9f4a7581a");
            return;
        }
        if (this.G != null) {
            com.sankuai.waimai.business.page.homepage.controller.a aVar = this.G;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.page.homepage.controller.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "05e12b68fc4b41d3ae2a757d786551a7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "05e12b68fc4b41d3ae2a757d786551a7");
            } else {
                aVar.c.removeCallbacks(aVar);
                aVar.c.removeCallbacks(aVar.f);
                aVar.d();
                aVar.e();
            }
        }
        if (this.H != null) {
            this.H.c();
            NewBottomStatusMainController newBottomStatusMainController = this.H;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = NewBottomStatusMainController.h;
            if (PatchProxy.isSupport(objArr3, newBottomStatusMainController, changeQuickRedirect3, false, "95931b7896f8ec8dc71109ff97437cdd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, newBottomStatusMainController, changeQuickRedirect3, false, "95931b7896f8ec8dc71109ff97437cdd");
            } else {
                com.sankuai.waimai.business.order.api.submit.c.a().unregisterOrderStatusObserver(newBottomStatusMainController);
                com.sankuai.waimai.imbase.manager.e.a().b(newBottomStatusMainController);
                com.sankuai.waimai.business.page.homepage.sharkpush.a a2 = com.sankuai.waimai.business.page.homepage.sharkpush.a.a();
                Object[] objArr4 = {newBottomStatusMainController};
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.page.homepage.sharkpush.a.a;
                if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "6a10edbec43bb6b528ea6bf472650e68", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "6a10edbec43bb6b528ea6bf472650e68");
                } else if (a2.f != null) {
                    a2.f.remove(newBottomStatusMainController);
                }
            }
        }
        super.onStop();
    }

    @Override // com.sankuai.waimai.business.page.common.arch.PageActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80e82dc5aa6393771f985c84ae1c7614", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80e82dc5aa6393771f985c84ae1c7614");
            return;
        }
        D = null;
        this.e = null;
        this.f = null;
        this.J.clear();
        if (WMStartUpPopup.getInstance() != null) {
            WMStartUpPopup.getInstance().unregisterActivityLifecycleCallbacks();
        }
        LocalBroadcastManager.getInstance(this).unregisterReceiver(this.aa);
        d a2 = d.a();
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "6307fcf3f99bbab8c19e03a8ff86d20d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "6307fcf3f99bbab8c19e03a8ff86d20d");
        } else if (a2.b != null && a2.b.contains(this)) {
            a2.b.remove(this);
        }
        com.sankuai.waimai.platform.domain.manager.user.a.i().b((com.sankuai.waimai.foundation.core.service.user.b) this);
        TabLoadManager a3 = TabLoadManager.a();
        Object[] objArr3 = {this};
        ChangeQuickRedirect changeQuickRedirect3 = TabLoadManager.a;
        if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "ca593835f958adbca276d81bdd02c423", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "ca593835f958adbca276d81bdd02c423");
        } else if (a3.b != null && a3.b.contains(this)) {
            a3.b.remove(this);
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = c;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2e42492af9a7a02357be8b7cd649b34f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2e42492af9a7a02357be8b7cd649b34f");
        } else {
            SharedPreferences sharedPreferences = getSharedPreferences("waimai_takeout", 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            for (String str : sharedPreferences.getAll().keySet()) {
                if (str != null && str.contains("remind_count")) {
                    edit.remove(str);
                }
            }
            edit.apply();
        }
        if (this.L != null) {
            this.L.removeCallbacksAndMessages(null);
        }
        com.sankuai.waimai.business.page.homepage.manager.a.b = null;
        if (this.h != null) {
            g.a().b(this.h);
            this.h = null;
        }
        g.a().c();
        if (com.sankuai.waimai.platform.popup.e.a() != null) {
            com.sankuai.waimai.platform.popup.e a4 = com.sankuai.waimai.platform.popup.e.a();
            if (a4.f != null) {
                a4.f = null;
            }
            com.sankuai.waimai.platform.popup.e.a().g = null;
        }
        com.sankuai.waimai.business.page.homepage.controller.c.a().b();
        if (this.H != null) {
            NewBottomStatusMainController newBottomStatusMainController = this.H;
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = BaseBottomStatusMainController.a;
            if (PatchProxy.isSupport(objArr5, newBottomStatusMainController, changeQuickRedirect5, false, "2f4f83580d231585e0d85100e872c50d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, newBottomStatusMainController, changeQuickRedirect5, false, "2f4f83580d231585e0d85100e872c50d");
            } else {
                com.sankuai.waimai.business.page.homepage.controller.c a5 = com.sankuai.waimai.business.page.homepage.controller.c.a();
                if (newBottomStatusMainController.g == a5.e) {
                    a5.e = null;
                }
            }
        }
        if (this.u != null) {
            this.u.cancel();
        }
        if (this.v != null) {
            this.v.cancel();
        }
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = c;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "5252061cd2bcfcce22e174c082959800", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "5252061cd2bcfcce22e174c082959800");
        } else if (this.j) {
            if (this.k) {
                IContentFeedListProvider iContentFeedListProvider = (IContentFeedListProvider) com.sankuai.waimai.router.a.a(IContentFeedListProvider.class, IContentFeedListProvider.CONTENT_PICK_ME_KEY);
                iContentFeedListProvider.onDestroy(this, a(1, iContentFeedListProvider.getContentFeedListFragmentClass()));
            } else {
                IContentFeedListProvider iContentFeedListProvider2 = (IContentFeedListProvider) com.sankuai.waimai.router.a.a(IContentFeedListProvider.class, IContentFeedListProvider.CONTENT_ROUTER_KEY);
                iContentFeedListProvider2.onDestroy(this, a(1, iContentFeedListProvider2.getContentFeedListFragmentClass()));
            }
        }
        super.onDestroy();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        TabInfo a2;
        Fragment fragment;
        Fragment fragment2;
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), intent};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ce9e03736265f3bdc011a5bcc9cb316", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ce9e03736265f3bdc011a5bcc9cb316");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        super.onActivityResult(i2, i3, intent);
        boolean z = true;
        Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(i3), intent};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f1b4f6cbfae89b36cc324e14e09797b8", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f1b4f6cbfae89b36cc324e14e09797b8")).booleanValue();
        } else if (this.E != 2 || (a2 = this.e.a(this.E)) == null || (fragment = a2.h) == null || this.E != 2) {
            z = false;
        } else {
            fragment.onActivityResult(i2, i3, intent);
        }
        if (z) {
            com.meituan.android.privacy.aop.a.b();
            return;
        }
        SparseArray<TabInfo> tabs = this.e.getTabs();
        for (int i4 = 0; i4 < tabs.size(); i4++) {
            TabInfo tabInfo = tabs.get(i4);
            if (tabInfo != null && (fragment2 = tabInfo.h) != null) {
                fragment2.onActivityResult(i2, i3, intent);
            }
        }
        com.meituan.android.privacy.aop.a.b();
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        Object[] objArr = {Integer.valueOf(i2), keyEvent};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f4b761e2b763a8fa5f15ee6e2d6f88c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f4b761e2b763a8fa5f15ee6e2d6f88c")).booleanValue();
        }
        if (i2 == 4 && keyEvent.getAction() == 0) {
            if (!this.K) {
                this.K = true;
                d(R.string.wm_page_press_again_to_exit);
                this.L.sendEmptyMessageDelayed(1, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
                try {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = c;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f8531b01134db97b49d296579bfe3b4e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f8531b01134db97b49d296579bfe3b4e");
                    } else {
                        new com.dianping.monitor.impl.m(com.sankuai.waimai.config.a.a().d(), com.meituan.android.singleton.b.a, com.sankuai.waimai.platform.b.A().c()).a("waimai_home_back_press", Collections.singletonList(Float.valueOf(1.0f))).a("platform", "android").a(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, com.sankuai.waimai.platform.b.A().i()).a();
                    }
                } catch (Throwable unused) {
                }
            } else {
                HomePageProvider homePageProvider = (HomePageProvider) com.sankuai.waimai.router.a.a(HomePageProvider.class, "wm_main");
                if (homePageProvider != null) {
                    homePageProvider.exitApp(this);
                }
                com.sankuai.waimai.business.page.home.againstcheating.a.b = "";
            }
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // com.sankuai.waimai.platform.domain.manager.home.a
    public final void a(int i2, boolean z) {
        Object[] objArr = {Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "130b30937d80d3a1681efa5ed530b129", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "130b30937d80d3a1681efa5ed530b129");
        } else if (e(i2)) {
            if (z) {
                if (i && g.a().d() && !g.a().b(this.E)) {
                    g.a().a(this, this.f);
                } else if (this.G != null) {
                    com.sankuai.waimai.business.page.homepage.controller.a aVar = this.G;
                    Object[] objArr2 = {Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.page.homepage.controller.a.a;
                    if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "37133571a8eaa8499c4011b00d3073cc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "37133571a8eaa8499c4011b00d3073cc");
                    } else {
                        aVar.b();
                    }
                }
                if (i2 == 0) {
                    com.sankuai.waimai.business.knb.api.a a2 = com.sankuai.waimai.business.knb.api.a.a();
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.knb.api.a.a;
                    if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "686b28db58d04841e6bb5fb8cd7d8db0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "686b28db58d04841e6bb5fb8cd7d8db0");
                    } else if (a2.b != null) {
                        a2.b.startPreload();
                    }
                }
                i = false;
            }
            if (i2 == 0) {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = c;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7280b321e5dedd34de103a98394e2b1e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7280b321e5dedd34de103a98394e2b1e");
                } else if (com.sankuai.waimai.platform.capacity.persistent.sp.a.b((Context) this, "enjoy_plan_red_new_consumed", false)) {
                } else {
                    com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((WaimaiMineService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) WaimaiMineService.class)).getFunctionList(), new b.AbstractC1042b<BaseResponse<com.sankuai.waimai.business.page.mine.model.b>>() { // from class: com.sankuai.waimai.business.page.homepage.MainActivity.2
                        public static ChangeQuickRedirect a;

                        @Override // rx.e
                        public final void onError(Throwable th) {
                        }

                        /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
                        @Override // rx.e
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final /* synthetic */ void onNext(java.lang.Object r13) {
                            /*
                                Method dump skipped, instructions count: 228
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.page.homepage.MainActivity.AnonymousClass2.onNext(java.lang.Object):void");
                        }
                    }, w());
                }
            }
        }
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e41a7bd356efebd70eaa11265ef75bc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e41a7bd356efebd70eaa11265ef75bc6");
            return;
        }
        WMSharePasswordPopup wMSharePasswordPopup = WMSharePasswordPopup.getInstance();
        if (wMSharePasswordPopup == null || !wMSharePasswordPopup.interceptStartActivity(this, intent)) {
            super.startActivity(intent);
        }
    }

    public final boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35bb4412732d9c8496490139a3ee76c0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35bb4412732d9c8496490139a3ee76c0")).booleanValue() : x() && !isFinishing() && e(this.E) && this.e.a(this.E) != null;
    }

    @SuppressLint({"WrongConstant"})
    private void b(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ec7a3de7b066f8e95733fcbd9cc19e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ec7a3de7b066f8e95733fcbd9cc19e0");
            return;
        }
        if (!com.sankuai.waimai.platform.utils.f.a(intent, "param_show_current_fragment", false)) {
            this.E = com.sankuai.waimai.platform.utils.f.a(intent, "fragment_id", 0);
        }
        if (e(this.E)) {
            return;
        }
        this.E = 0;
    }

    @Nullable
    public final WMHomePageFragment h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98180234f18caa8b6241d642de92aabe", RobustBitConfig.DEFAULT_VALUE) ? (WMHomePageFragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98180234f18caa8b6241d642de92aabe") : (WMHomePageFragment) a(0, WMHomePageFragment.class);
    }

    @Nullable
    public final <T extends Fragment> T a(int i2, Class<T> cls) {
        TabInfo a2;
        Object[] objArr = {Integer.valueOf(i2), cls};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0a3564a4881d07e52a5b70ab53ff6cb", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0a3564a4881d07e52a5b70ab53ff6cb");
        }
        if (this.e == null || (a2 = this.e.a(i2)) == null || !cls.isInstance(a2.h)) {
            return null;
        }
        return (T) a2.h;
    }

    private boolean y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "545b2c160ca47bd6e47a2c468bafb8d1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "545b2c160ca47bd6e47a2c468bafb8d1")).booleanValue();
        }
        Intent intent = getIntent();
        if (intent == null || intent.getData() == null) {
            return false;
        }
        String path = intent.getData().getPath();
        if (getString(R.string.scheme_path_orders).equals(path)) {
            this.E = 3;
            return true;
        } else if (getString(R.string.scheme_path_mine).equals(path)) {
            this.E = 4;
            return true;
        } else if (getString(R.string.scheme_path_pois).equals(path)) {
            this.E = 0;
            return true;
        } else {
            return false;
        }
    }

    private boolean b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c713947b273c4ae9d72708b734a63ef", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c713947b273c4ae9d72708b734a63ef")).booleanValue();
        }
        Intent intent = getIntent();
        if (intent == null || intent.getData() == null || !getString(R.string.scheme_path_content).equals(intent.getData().getPath())) {
            return false;
        }
        if (z) {
            this.E = 1;
        }
        return true;
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    @SuppressLint({"WrongConstant"})
    public void onNewIntent(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8d914a48b1ebbaff0d99dd52c055195", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8d914a48b1ebbaff0d99dd52c055195");
            return;
        }
        super.onNewIntent(intent);
        setIntent(intent);
        Intent intent2 = getIntent();
        if (intent2 != null) {
            intent2.putExtra(com.sankuai.waimai.popup.e.b, false);
        }
        if (intent2 != null && com.sankuai.waimai.platform.utils.f.a(intent2, "only_load_data_without_locate", false)) {
            WMHomePageFragment h = h();
            if (h != null) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = HomePageFragment.d;
                if (PatchProxy.isSupport(objArr2, h, changeQuickRedirect2, false, "2d731278ea818f67ca5df60a285e261d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, h, changeQuickRedirect2, false, "2d731278ea818f67ca5df60a285e261d");
                    return;
                } else {
                    h.i.a(5);
                    return;
                }
            }
            return;
        }
        WMHomePageFragment h2 = h();
        if (h2 != null) {
            h2.a(intent);
        }
        if (y() || b(this.j)) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = c;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c8e496591509f841b137564cbfc28e3d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c8e496591509f841b137564cbfc28e3d");
            } else {
                Intent intent3 = getIntent();
                if (intent3 != null && intent3.getData() != null) {
                    if (com.sankuai.waimai.foundation.router.a.a(intent3)) {
                        this.M = com.sankuai.waimai.foundation.router.a.a(intent3, "sorttype", 0L);
                        this.O = com.sankuai.waimai.business.page.home.helper.f.a(com.sankuai.waimai.foundation.router.a.a(intent3, "multifiltercodes", (String) null));
                        a(intent3);
                    } else {
                        this.M = com.sankuai.waimai.platform.utils.f.a(intent3, "sorttype", 0L);
                        this.O = com.sankuai.waimai.platform.utils.f.a(intent3, "multifiltercodes", (ArrayList<String>) null);
                        ArrayList<? extends Parcelable> b2 = com.sankuai.waimai.platform.utils.f.b(intent3, "sliderfiltercodes", (ArrayList<? extends Parcelable>) null);
                        this.P = new ArrayList<>();
                        if (b2 != null) {
                            Iterator<? extends Parcelable> it = b2.iterator();
                            while (it.hasNext()) {
                                Parcelable next = it.next();
                                if (next instanceof SliderSelectData) {
                                    this.P.add((SliderSelectData) next);
                                }
                            }
                        }
                    }
                    this.N = com.sankuai.waimai.platform.utils.f.a(intent3, "poi_id", -1L);
                }
            }
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = c;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9199538f3347ffd42390470caf8d6919", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9199538f3347ffd42390470caf8d6919");
            } else {
                SparseArray<TabInfo> tabs = this.e.getTabs();
                if (tabs != null && tabs.size() > 0) {
                    if (this.M != 0 || this.O != null) {
                        this.E = 0;
                        WMHomePageFragment h3 = h();
                        if (h3 != null) {
                            Object[] objArr5 = {new Long(this.M), this.O, this.P};
                            ChangeQuickRedirect changeQuickRedirect5 = HomePageFragment.d;
                            if (PatchProxy.isSupport(objArr5, h3, changeQuickRedirect5, false, "e224f67bf0f19f8f6de3456a2f801e80", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, h3, changeQuickRedirect5, false, "e224f67bf0f19f8f6de3456a2f801e80");
                            } else {
                                h3.i.a(1);
                            }
                        }
                    } else if (this.N > 0) {
                        this.E = 0;
                        WMHomePageFragment h4 = h();
                        if (h4 != null) {
                            Object[] objArr6 = {new Long(this.N)};
                            ChangeQuickRedirect changeQuickRedirect6 = HomePageFragment.d;
                            if (PatchProxy.isSupport(objArr6, h4, changeQuickRedirect6, false, "e5149dbcb14c65927ced17c70de0bb21", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, h4, changeQuickRedirect6, false, "e5149dbcb14c65927ced17c70de0bb21");
                            } else {
                                AddressItem a2 = com.sankuai.waimai.platform.domain.manager.location.a.a(h4.F);
                                if (a2 != null) {
                                    com.sankuai.waimai.foundation.location.g.a(a2.getDoubleLat(), a2.getDoubleLng(), a2.addrBrief);
                                    h4.j.a(a2.addrBrief);
                                }
                            }
                        }
                    }
                    WMHomePageFragment h5 = h();
                    if (h5 != null) {
                        h5.a(this.Q);
                    }
                }
            }
            if (this.E == 3) {
                A();
            } else if (this.E == 1) {
                c(false);
            }
            z();
            return;
        }
        b(intent);
        if (!e(this.E)) {
            this.E = 3;
        } else if (this.E == 3) {
            A();
        }
        z();
        if (com.sankuai.waimai.platform.utils.f.a(intent2, "intent_restart_app", 0) == 1) {
            Object[] objArr7 = {this};
            ChangeQuickRedirect changeQuickRedirect7 = c;
            if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "5eb66c126d4db7478f4324be29c41fad", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "5eb66c126d4db7478f4324be29c41fad");
                return;
            }
            RestartAppService.a(this, true, 500L);
            f();
        }
    }

    @SuppressLint({"WrongConstant"})
    private void z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ef9bf5d17c38175bfa68eba15a4b19e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ef9bf5d17c38175bfa68eba15a4b19e");
        } else if (e(this.E)) {
            b(this.E);
        }
    }

    private void A() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9137ecd88a5d68a24c5ec0d0d175af3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9137ecd88a5d68a24c5ec0d0d175af3a");
            return;
        }
        IOrderListProvider iOrderListProvider = (IOrderListProvider) com.sankuai.waimai.router.a.a(IOrderListProvider.class, "wm_order");
        iOrderListProvider.refreshViewByNewIntent(a(3, iOrderListProvider.getOrderListFragmentClass()), getIntent());
    }

    @Override // com.sankuai.waimai.business.page.home.interfacer.c
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7af11e38983a41905f9c75dd5df7247", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7af11e38983a41905f9c75dd5df7247");
        } else if (this.e == null || !(this.I.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.I.getLayoutParams();
            if (z) {
                this.e.getLayoutParams().height = com.sankuai.waimai.foundation.utils.g.a(com.meituan.android.singleton.b.a, 67.8f);
                marginLayoutParams.bottomMargin = com.sankuai.waimai.foundation.utils.g.a(com.meituan.android.singleton.b.a, 53.0f);
            } else {
                this.e.getLayoutParams().height = com.sankuai.waimai.foundation.utils.g.a(com.meituan.android.singleton.b.a, 69.8f);
                marginLayoutParams.bottomMargin = com.sankuai.waimai.foundation.utils.g.a(com.meituan.android.singleton.b.a, 55.0f);
            }
            this.e.a(z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v43 */
    @Override // com.sankuai.waimai.business.page.home.interfacer.c
    public final void a(DynamicTabListInfoResponse dynamicTabListInfoResponse) {
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        boolean z4;
        int i3;
        boolean z5;
        Intent intent;
        int i4;
        TabInfo tabInfo;
        int i5;
        char c2;
        TitleIndicator.a aVar;
        int i6 = 1;
        char c3 = 0;
        Object[] objArr = {dynamicTabListInfoResponse};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a9645f1aff7d6677b7db54d47f4eb6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a9645f1aff7d6677b7db54d47f4eb6a");
        } else if (dynamicTabListInfoResponse != null) {
            List<LottieResItem> list = dynamicTabListInfoResponse.mLottieResItemList;
            int i7 = dynamicTabListInfoResponse.resourceType;
            Object[] objArr2 = {list, Integer.valueOf(i7)};
            ChangeQuickRedirect changeQuickRedirect2 = c;
            long j = 1000;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "af4aec75912bdd7ae293ef44d591374d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "af4aec75912bdd7ae293ef44d591374d");
            } else {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (!com.sankuai.waimai.foundation.utils.d.a(list)) {
                    for (LottieResItem lottieResItem : list) {
                        Object[] objArr3 = new Object[i6];
                        objArr3[c3] = lottieResItem;
                        ChangeQuickRedirect changeQuickRedirect3 = c;
                        ArrayList arrayList3 = arrayList;
                        ArrayList arrayList4 = arrayList2;
                        long j2 = j;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ea7df2893ae49354db79f220ec530376", RobustBitConfig.DEFAULT_VALUE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ea7df2893ae49354db79f220ec530376")).booleanValue();
                        } else {
                            if (lottieResItem != null) {
                                long currentTimeMillis = System.currentTimeMillis() / j2;
                                if (currentTimeMillis > lottieResItem.stime && (currentTimeMillis < lottieResItem.etime || lottieResItem.etime < 0)) {
                                    z = true;
                                }
                            }
                            z = false;
                        }
                        if (z && i7 == 1) {
                            arrayList3.add(lottieResItem);
                            j = j2;
                            arrayList2 = arrayList4;
                            i6 = 1;
                            c3 = 0;
                            arrayList = arrayList3;
                        } else {
                            arrayList4.add(lottieResItem.key);
                            j = j2;
                            i6 = 1;
                            c3 = 0;
                            arrayList = arrayList3;
                            arrayList2 = arrayList4;
                        }
                    }
                }
                com.sankuai.waimai.lottie.d.a().a(arrayList, "dynamic-tabs-lottie");
                com.sankuai.waimai.lottie.d.a().a(arrayList2);
            }
            List<DynamicTabInfo> list2 = dynamicTabListInfoResponse.dynamicTabList;
            if (com.sankuai.waimai.foundation.core.a.d()) {
                z2 = false;
                i2 = 4;
            } else {
                z2 = false;
                i2 = 5;
            }
            this.k = z2;
            this.U = z2;
            if (com.sankuai.waimai.foundation.utils.b.a(list2)) {
                z3 = false;
                loop0: while (true) {
                    z4 = false;
                    for (DynamicTabInfo dynamicTabInfo : list2) {
                        if (dynamicTabInfo.id == 7) {
                            this.k = false;
                            Class<Fragment> contentFeedListFragmentClass = ((IContentFeedListProvider) com.sankuai.waimai.router.a.a(IContentFeedListProvider.class, IContentFeedListProvider.CONTENT_ROUTER_KEY)).getContentFeedListFragmentClass();
                            TabInfo tabInfo2 = new TabInfo(1, getString(R.string.title_section1), 1, contentFeedListFragmentClass != null ? contentFeedListFragmentClass : Fragment.class);
                            if (contentFeedListFragmentClass != null && this.J.get(1) != null && !this.J.get(1).getClass().isAssignableFrom(contentFeedListFragmentClass)) {
                                if (this.E == 1) {
                                    this.ab = -1;
                                    this.J.put(this.ab, this.J.get(1));
                                }
                                this.J.put(1, null);
                            } else {
                                tabInfo2.h = this.J.get(1);
                            }
                            this.e.a(1, tabInfo2);
                            a(dynamicTabInfo);
                            b(!this.S);
                            if (this.E == 1 && this.ab != this.E) {
                                z();
                            }
                            c(false);
                            try {
                                u.b(this, "rn_waimai_content-feed-list");
                            } catch (Throwable unused) {
                            }
                            z4 = true;
                        } else if (dynamicTabInfo.id == i2 || dynamicTabInfo.id == 9) {
                            this.U = dynamicTabInfo.id == 9;
                            this.e.setCoupon(this.U);
                            Object[] objArr4 = {dynamicTabInfo};
                            ChangeQuickRedirect changeQuickRedirect4 = c;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7b0a27e0c7ed743430d38f07a9ce3717", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7b0a27e0c7ed743430d38f07a9ce3717");
                            } else {
                                if (this.e != null) {
                                    i4 = 2;
                                    tabInfo = this.e.a(2);
                                } else {
                                    i4 = 2;
                                    tabInfo = null;
                                }
                                if (dynamicTabInfo.id == 9 && tabInfo != null && this.J.get(i4) != null) {
                                    FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
                                    beginTransaction.remove(this.J.get(i4));
                                    beginTransaction.commitAllowingStateLoss();
                                    this.J.put(i4, null);
                                    tabInfo.h = new VIPCardKNBFragment();
                                }
                                if (dynamicTabInfo != null && this.e != null && tabInfo != null && tabInfo.j < this.e.getTabCount()) {
                                    View childAt = this.e.getChildAt(tabInfo.j);
                                    String str = dynamicTabInfo.link;
                                    String str2 = dynamicTabInfo.name;
                                    boolean z6 = dynamicTabInfo.isShow;
                                    if (childAt != null) {
                                        if (z6 && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                                            this.e.a(2, dynamicTabInfo.normalPicUrl, dynamicTabInfo.selectedPicUrl, str2);
                                            tabInfo.d = str;
                                            tabInfo.c = str2;
                                            tabInfo.e = dynamicTabInfo.normalPicUrl != null ? dynamicTabInfo.normalPicUrl : "";
                                            tabInfo.f = dynamicTabInfo.selectedPicUrl != null ? dynamicTabInfo.selectedPicUrl : "";
                                            this.T = true;
                                            this.V = tabInfo;
                                            childAt.setVisibility(0);
                                            JudasManualManager.b("b_qnjzwaav").a("c_m84bv26").a(this.e).a();
                                            Object[] objArr5 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect5 = c;
                                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "eeebd9a3dcbf0f538b586f019da8fb8a", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "eeebd9a3dcbf0f538b586f019da8fb8a");
                                            } else {
                                                JudasManualManager.b("b_waimai_23w4c3m0_mv", "c_vt3zp1ef", AppUtil.generatePageInfoKey(this)).a("vip_tab_exp", this.U ? "sq" : KiteFlyConstants.VIP_NAME).a();
                                            }
                                        } else {
                                            this.T = false;
                                            this.V = null;
                                            childAt.setVisibility(8);
                                        }
                                    }
                                }
                            }
                            if (dynamicTabInfo.id == i2) {
                                Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag(String.valueOf(this.E));
                                i5 = 2;
                                if (this.E == 2) {
                                    a(this.E, findFragmentByTag, false);
                                }
                            } else {
                                i5 = 2;
                            }
                            if (dynamicTabInfo.id == 9 && this.E == i5) {
                                b(this.E);
                                c2 = 0;
                                a(this.E, this.e.a(i5).h, false);
                            } else {
                                c2 = 0;
                            }
                            TitleIndicator titleIndicator = this.e;
                            Object[] objArr6 = new Object[1];
                            objArr6[c2] = Integer.valueOf(i5);
                            ChangeQuickRedirect changeQuickRedirect6 = TitleIndicator.a;
                            if (PatchProxy.isSupport(objArr6, titleIndicator, changeQuickRedirect6, false, "0bda4fd54ce4576ab679168564078ab6", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, titleIndicator, changeQuickRedirect6, false, "0bda4fd54ce4576ab679168564078ab6");
                            } else if (2 < titleIndicator.c.size() && (aVar = titleIndicator.c.get(2)) != null) {
                                Object[] objArr7 = {2, aVar};
                                ChangeQuickRedirect changeQuickRedirect7 = TitleIndicator.a;
                                if (PatchProxy.isSupport(objArr7, titleIndicator, changeQuickRedirect7, false, "8fd02ee3eef909cc6aaa54a05b09c194", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr7, titleIndicator, changeQuickRedirect7, false, "8fd02ee3eef909cc6aaa54a05b09c194");
                                } else if (aVar != null && aVar.b != null) {
                                    LottieAnimationView lottieAnimationView = aVar.b;
                                    aVar.a.setVisibility(4);
                                    titleIndicator.a(lottieAnimationView, titleIndicator.c(2), 2 == titleIndicator.b, false, 2 == titleIndicator.b);
                                    z3 = true;
                                }
                            }
                            z3 = true;
                        } else if (dynamicTabInfo.id == 8) {
                            this.k = true;
                            ((IContentFeedListProvider) com.sankuai.waimai.router.a.a(IContentFeedListProvider.class, IContentFeedListProvider.CONTENT_PICK_ME_KEY)).onTabExpose(this, dynamicTabInfo.link);
                            Class<Fragment> contentFeedListFragmentClass2 = ((IContentFeedListProvider) com.sankuai.waimai.router.a.a(IContentFeedListProvider.class, IContentFeedListProvider.CONTENT_PICK_ME_KEY)).getContentFeedListFragmentClass();
                            TabInfo tabInfo3 = new TabInfo(1, getString(R.string.title_section1), 1, contentFeedListFragmentClass2 != null ? contentFeedListFragmentClass2 : Fragment.class);
                            if (contentFeedListFragmentClass2 != null && this.J.get(1) != null && !this.J.get(1).getClass().isAssignableFrom(contentFeedListFragmentClass2)) {
                                if (this.E == 1) {
                                    this.ab = -1;
                                    this.J.put(this.ab, this.J.get(1));
                                }
                                this.J.put(1, null);
                            } else {
                                tabInfo3.h = this.J.get(1);
                            }
                            this.e.a(1, tabInfo3);
                            a(dynamicTabInfo);
                            b(!this.S);
                            if (this.E == 1 && this.ab != this.E) {
                                z();
                            }
                            c(false);
                        }
                    }
                    break loop0;
                }
                if (this.H != null) {
                    this.H.a(this.k);
                }
            } else {
                z3 = false;
                z4 = false;
            }
            if (z3) {
                i3 = 0;
            } else {
                i3 = 0;
                this.T = false;
                f(2);
            }
            if (!z4 && !this.k) {
                this.j = i3;
                f(1);
                if (this.E == 1) {
                    this.E = i3;
                    z();
                }
                if (b((boolean) i3) && (intent = getIntent()) != null && !TextUtils.isEmpty(intent.getDataString())) {
                    intent.setDataAndType(Uri.parse(intent.getDataString().split("\\?")[i3]), intent.getType());
                }
            }
            Object[] objArr8 = new Object[i3];
            ChangeQuickRedirect changeQuickRedirect8 = c;
            if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "9c1c8d4621d664fd4efea73e695d6a37", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "9c1c8d4621d664fd4efea73e695d6a37");
            } else {
                g a2 = g.a();
                Object[] objArr9 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect9 = g.a;
                if (PatchProxy.isSupport(objArr9, a2, changeQuickRedirect9, false, "b9b863031fce1ef923a05a5f09a7219d", RobustBitConfig.DEFAULT_VALUE)) {
                    z5 = ((Boolean) PatchProxy.accessDispatch(objArr9, a2, changeQuickRedirect9, false, "b9b863031fce1ef923a05a5f09a7219d")).booleanValue();
                } else {
                    z5 = false;
                    if (a2.e() || a2.f()) {
                        z5 = true;
                    }
                }
                if (z5) {
                    this.e.post(new Runnable() { // from class: com.sankuai.waimai.business.page.homepage.MainActivity.12
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr10 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect10 = a;
                            if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "ab47c83e0cfa35ee2875c27ee5462dcf", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "ab47c83e0cfa35ee2875c27ee5462dcf");
                            } else if (MainActivity.this.isDestroyed() || MainActivity.this.isFinishing()) {
                            } else {
                                g a3 = g.a();
                                com.sankuai.waimai.business.page.homepage.view.tab.a aVar2 = MainActivity.this.f;
                                Object[] objArr11 = {aVar2};
                                ChangeQuickRedirect changeQuickRedirect11 = g.a;
                                if (PatchProxy.isSupport(objArr11, a3, changeQuickRedirect11, false, "e8839c72be5eeff3290f018079028626", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr11, a3, changeQuickRedirect11, false, "e8839c72be5eeff3290f018079028626");
                                    return;
                                }
                                com.sankuai.waimai.foundation.utils.log.a.b("TabBubble", "updateBubble", new Object[0]);
                                a3.a(aVar2, false);
                            }
                        }
                    });
                } else if (g.a().d()) {
                    this.e.postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.page.homepage.MainActivity.13
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean z7 = false;
                            Object[] objArr10 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect10 = a;
                            if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "aa76f215b41b28031d0762dcd1ede866", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "aa76f215b41b28031d0762dcd1ede866");
                            } else if ((MainActivity.this.G == null || !MainActivity.this.G.c()) && !g.a().b(MainActivity.this.E)) {
                                g a3 = g.a();
                                int i8 = MainActivity.this.E;
                                if (MainActivity.this.E == 1 && MainActivity.this.k) {
                                    z7 = true;
                                }
                                a3.a(i8, z7);
                                g.a().a(MainActivity.this, MainActivity.this.f);
                            }
                        }
                    }, 1000L);
                }
            }
            this.Y.countDown();
            this.S = true;
        }
    }

    private void a(DynamicTabInfo dynamicTabInfo) {
        Object[] objArr = {dynamicTabInfo};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0053b32bb5ea9625047ad4d22e8b178", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0053b32bb5ea9625047ad4d22e8b178");
            return;
        }
        TabInfo a2 = this.e != null ? this.e.a(1) : null;
        if (dynamicTabInfo == null || this.e == null || a2 == null || a2.j >= this.e.getTabCount()) {
            return;
        }
        View childAt = this.e.getChildAt(a2.j);
        String str = dynamicTabInfo.name;
        boolean z = dynamicTabInfo.isShow;
        if (childAt != null) {
            if (z && !TextUtils.isEmpty(str)) {
                this.e.a(1, dynamicTabInfo.normalPicUrl, dynamicTabInfo.selectedPicUrl, str);
                a2.c = str;
                a2.e = dynamicTabInfo.normalPicUrl != null ? dynamicTabInfo.normalPicUrl : "";
                a2.f = dynamicTabInfo.selectedPicUrl != null ? dynamicTabInfo.selectedPicUrl : "";
                this.j = true;
                this.W = a2;
                childAt.setVisibility(0);
                B();
                return;
            }
            this.j = false;
            this.W = null;
            childAt.setVisibility(8);
        }
    }

    private void B() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a317ec0303e371cbd28115dc63b4e4a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a317ec0303e371cbd28115dc63b4e4a8");
        } else {
            JudasManualManager.b("b_waimai_lm4hj7kq_mv", "c_m84bv26", AppUtil.generatePageInfoKey(this.e)).a("status", 2).a("rank_list_id", ListIDHelper.a.a.a("page", k.d)).a("ref_list_id", "").a("qipao", g.a().b(1) ? 1 : 2).a("qipao_id", com.sankuai.waimai.business.page.homepage.bubble.b.a().b()).a("source_id", this.k ? "PickMe" : "EatWhat").a();
        }
    }

    private void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7755b92c7d9a868d8adc70bbff740e45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7755b92c7d9a868d8adc70bbff740e45");
        } else if (this.j) {
            if (this.k) {
                IContentFeedListProvider iContentFeedListProvider = (IContentFeedListProvider) com.sankuai.waimai.router.a.a(IContentFeedListProvider.class, IContentFeedListProvider.CONTENT_PICK_ME_KEY);
                iContentFeedListProvider.reloadData(a(1, iContentFeedListProvider.getContentFeedListFragmentClass()), z);
                return;
            }
            IContentFeedListProvider iContentFeedListProvider2 = (IContentFeedListProvider) com.sankuai.waimai.router.a.a(IContentFeedListProvider.class, IContentFeedListProvider.CONTENT_ROUTER_KEY);
            iContentFeedListProvider2.reloadData(a(1, iContentFeedListProvider2.getContentFeedListFragmentClass()), z);
        }
    }

    private void d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a259bbe830b9a7050c6588fbdc541821", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a259bbe830b9a7050c6588fbdc541821");
        } else if (this.j && this.k) {
            ((IContentFeedListProvider) com.sankuai.waimai.router.a.a(IContentFeedListProvider.class, IContentFeedListProvider.CONTENT_PICK_ME_KEY)).onTabClick(a(1, ((IContentFeedListProvider) com.sankuai.waimai.router.a.a(IContentFeedListProvider.class, IContentFeedListProvider.CONTENT_PICK_ME_KEY)).getContentFeedListFragmentClass()), z, bB_());
        }
    }

    private void f(int i2) {
        Fragment fragment;
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ccb4f5578e886ff83d4dcc5330b9c19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ccb4f5578e886ff83d4dcc5330b9c19");
            return;
        }
        TabInfo a2 = this.e.a(i2);
        if (a2 != null) {
            this.e.a(a2.j, 8);
        }
        if (i2 != 1 || (fragment = this.J.get(i2)) == null) {
            return;
        }
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.remove(fragment);
        beginTransaction.commitAllowingStateLoss();
        this.J.delete(i2);
    }

    @Override // com.sankuai.waimai.business.page.home.interfacer.c
    public final void a(int i2) {
        Object[] objArr = {4};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3f19960b2b72d77e5be71f4ca6bbd78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3f19960b2b72d77e5be71f4ca6bbd78");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "48312cbb8cd30123fbc0c85d54ee5f2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "48312cbb8cd30123fbc0c85d54ee5f2e");
        } else if (this.e != null) {
            this.e.a(4, com.sankuai.waimai.platform.domain.manager.bubble.a.a().a(bB_(), 4));
        }
    }

    @Override // com.sankuai.waimai.popup.ugc.WMUGCFeedGuidePopup.a
    public final View i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc2f009313ccea18917327cb6aaa1da8", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc2f009313ccea18917327cb6aaa1da8") : this.e.b(1);
    }

    @Override // com.sankuai.waimai.popup.ugc.WMUGCFeedGuidePopup.a
    public final boolean j() {
        return this.l;
    }

    @Override // com.sankuai.waimai.popup.ugc.WMUGCFeedGuidePopup.a
    public final CountDownLatch k() {
        return this.Y;
    }

    @Override // com.sankuai.waimai.popup.ugc.WMUGCFeedGuidePopup.a
    public final int l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5b1243a1b1142ffc2c681cb654731a8", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5b1243a1b1142ffc2c681cb654731a8")).intValue() : com.sankuai.waimai.foundation.utils.g.a(this, 55.0f);
    }

    @Override // com.sankuai.waimai.popup.intelligent.IntelligentGuidePopup.a
    public final View m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35517eb20b2c3fc1cd185a5f75bf049c", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35517eb20b2c3fc1cd185a5f75bf049c");
        }
        WMHomePageFragment h = h();
        if (h == null || h.f() == null || h.f().k == null) {
            return null;
        }
        return h.f().k.f;
    }

    @Override // com.sankuai.waimai.popup.intelligent.IntelligentGuidePopup.a
    public final boolean n() {
        return this.l;
    }

    @Override // com.sankuai.waimai.popup.intelligent.IntelligentGuidePopup.a
    public final boolean o() {
        return this.E == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i2, boolean z) {
        Object[] objArr = {Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74c7a326454d2802f4e947f83907d0cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74c7a326454d2802f4e947f83907d0cf");
        } else if (i2 == 1) {
            this.e.a(0, false, z, getString(R.string.title_section0));
        } else if (i2 == 2) {
            this.e.a(0, true, z, getString(R.string.wm_page_back_to_top));
        }
    }

    public final void b(int i2) {
        boolean z = true;
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "820ed9e69eef8d7b97b43b5a1bc49216", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "820ed9e69eef8d7b97b43b5a1bc49216");
            return;
        }
        boolean z2 = this.ab == 1 && i2 != 1;
        boolean z3 = this.ab != 1 && i2 == 1;
        this.E = i2;
        g(this.E);
        if (this.H != null) {
            this.H.onPageSelected(this.E);
        }
        if (this.e != null) {
            com.dianping.networklog.c.a("curTab" + i2, 3);
            this.e.setCurrentTab(this.E);
        }
        if (this.E == 1 && g.a().c(1)) {
            g.a().c();
        }
        if (z2 || z3) {
            d(z3);
        }
        this.e.b((i2 == 1 && this.k) ? false : false);
    }

    private void g(int i2) {
        Fragment a2;
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29940421f22ba3bbed3f5552af607a86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29940421f22ba3bbed3f5552af607a86");
            return;
        }
        String valueOf = String.valueOf(i2);
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        if (this.J.get(i2) == null) {
            TabInfo a3 = this.e.a(i2);
            if (a3 != null) {
                if (i2 == 4) {
                    a2 = a3.b();
                } else {
                    a2 = a3.a();
                }
                a(a3, a2);
                this.J.put(i2, a2);
                beginTransaction.add(R.id.pager_container, a2, valueOf);
            }
        } else if (this.ab != i2 && i2 == 2) {
            a(i2, this.J.get(i2), false);
        }
        Fragment fragment = this.J.get(i2);
        if (i2 == 4) {
            Weaver.getExtension().clickJump2Fragment(this, fragment);
        }
        b(fragment);
        if (this.ab != i2) {
            if (this.J.get(this.ab) != null) {
                beginTransaction.hide(this.J.get(this.ab));
                if (this.ab == 2) {
                    a(true, true);
                }
            }
            this.ab = i2;
            beginTransaction.show(fragment);
            com.sankuai.waimai.touchmatrix.a a4 = com.sankuai.waimai.touchmatrix.a.a();
            com.sankuai.waimai.touchmatrix.event.a a5 = com.sankuai.waimai.touchmatrix.event.a.a(2);
            a5.c = "waimai";
            a4.a(a5);
            com.sankuai.waimai.touchmatrix.a a6 = com.sankuai.waimai.touchmatrix.a.a();
            com.sankuai.waimai.touchmatrix.event.a a7 = com.sankuai.waimai.touchmatrix.event.a.a(1);
            a7.c = "waimai";
            a6.a(a7);
        }
        beginTransaction.commitAllowingStateLoss();
    }

    private void a(Fragment fragment) {
        Object[] objArr = {fragment};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81027bfce6d76db085a2ff8bb1651922", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81027bfce6d76db085a2ff8bb1651922");
        } else if (fragment == null) {
        } else {
            if (this.k) {
                ((IContentFeedListProvider) com.sankuai.waimai.router.a.a(IContentFeedListProvider.class, IContentFeedListProvider.CONTENT_PICK_ME_KEY)).onContentFeedFragmentCreate(fragment, 2);
            } else {
                ((IContentFeedListProvider) com.sankuai.waimai.router.a.a(IContentFeedListProvider.class, IContentFeedListProvider.CONTENT_ROUTER_KEY)).onContentFeedFragmentCreate(fragment, 2);
            }
        }
    }

    private void b(Fragment fragment) {
        Object[] objArr = {fragment};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7ac03e6c8a7b75d7689f161d914d473", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7ac03e6c8a7b75d7689f161d914d473");
        } else if (fragment instanceof WMHomePageFragment) {
            WMHomePageFragment wMHomePageFragment = (WMHomePageFragment) fragment;
            if (wMHomePageFragment.z == null) {
                wMHomePageFragment.z = this.Z;
            }
            wMHomePageFragment.e();
        } else if (this.ab == 0) {
            b(1, true);
        }
    }

    private void a(int i2, Fragment fragment, boolean z) {
        TabInfo a2;
        Uri b2;
        Object[] objArr = {Integer.valueOf(i2), fragment, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd007f0d8e11dec484d1f86973ccb3c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd007f0d8e11dec484d1f86973ccb3c0");
        } else if (i2 != 2 || fragment == null || (a2 = this.e.a(2)) == null || a2.c == null || a2.d == null) {
        } else {
            com.sankuai.waimai.business.page.homepage.knb.a.a("wm_knb_vip_card").b(fragment, a2.c);
            String a3 = com.sankuai.waimai.business.page.homepage.knb.a.a("wm_knb_vip_card").a(getApplicationContext(), a2.d);
            if (a3 != null && (b2 = com.sankuai.waimai.platform.urlreplace.b.a().b(Uri.parse(a3))) != null) {
                a3 = b2.toString();
            }
            boolean b3 = com.sankuai.waimai.business.page.homepage.knb.a.a("wm_knb_vip_card").b(getApplicationContext(), a3);
            if (z) {
                if (UserCenter.getInstance(getApplicationContext()).isLogin() || b3) {
                    Bundle bundle = new Bundle();
                    bundle.putString("url", a3);
                    fragment.setArguments(bundle);
                }
            } else if (UserCenter.getInstance(getApplicationContext()).isLogin()) {
                com.sankuai.waimai.business.page.homepage.knb.a.a("wm_knb_vip_card").a(fragment, a3);
            }
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageSelected(int i2) {
        WMHomePageFragment h;
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b59dbd29697e6cafb231ab4e0b6fa291", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b59dbd29697e6cafb231ab4e0b6fa291");
            return;
        }
        this.E = i2;
        this.e.setCurrentTab(this.E);
        if (i2 == 0) {
            com.dianping.widget.view.a.a().a((Activity) this, "first_poi_id", true);
            com.dianping.widget.view.a.a().a(this, "first_poi_id");
            com.dianping.widget.view.a.a().a((Activity) this, "banner_viewpager_id", true);
            com.dianping.widget.view.a.a().a(this, "banner_viewpager_id");
        } else {
            com.dianping.widget.view.a.a().a((Activity) this, "banner_viewpager_id", false);
            com.dianping.widget.view.a.a().a((Activity) this, "first_poi_id", false);
        }
        if (i2 == 0 && (h = h()) != null) {
            h.a(this.H);
        }
        if (this.G != null) {
            com.sankuai.waimai.business.page.homepage.controller.a aVar = this.G;
            Object[] objArr2 = {Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.page.homepage.controller.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "ea0d6f7fb329db25fc802a53f8ce93b7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "ea0d6f7fb329db25fc802a53f8ce93b7");
            } else {
                aVar.b();
            }
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, com.sankuai.waimai.foundation.core.base.activity.c
    public final Map<String, String> Z_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31361b2303c06940111ad83ffffe525a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31361b2303c06940111ad83ffffe525a");
        }
        HashMap hashMap = new HashMap();
        String str = "";
        if (this.E == 0) {
            str = "waimai_homepage";
        } else if (this.E == 1) {
            str = "waimai_content";
        } else if (this.E == 2) {
            str = "waimai_membership";
        } else if (this.E == 3) {
            str = "waimai_order_list";
        } else if (this.E == 4) {
            str = "waimai_mine";
        }
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("page_id", str);
        }
        return hashMap;
    }

    @Override // com.sankuai.waimai.business.page.home.WMHomePageFragment.a
    public final com.sankuai.waimai.platform.domain.core.channel.a a() {
        return this.Q;
    }

    @Override // com.sankuai.waimai.foundation.core.service.user.b
    public void onChanged(b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2222721e3b1a4ed3ca7a46b8848cfaaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2222721e3b1a4ed3ca7a46b8848cfaaf");
            return;
        }
        if (aVar == b.a.LOGOUT) {
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a((Context) this, "enjoy_plan_red_new_consumed", false);
            if (this.H != null) {
                this.H.a("", (Uri) null);
            }
            if (g.a().c(2)) {
                g.a().c();
            }
        }
        if (this.E == 2) {
            a(this.E, getSupportFragmentManager().findFragmentByTag(String.valueOf(this.E)), false);
        }
        c(true);
    }

    @Override // com.sankuai.waimai.business.page.homepage.bubble.e
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ff809577e046e612b89069fc97a12d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ff809577e046e612b89069fc97a12d3");
        } else if (this.G == null || !g.a().d()) {
        } else {
            com.sankuai.waimai.business.page.homepage.controller.a aVar = this.G;
            int visibleTabCount = this.e.getVisibleTabCount();
            Object[] objArr2 = {str, Integer.valueOf(visibleTabCount)};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.page.homepage.controller.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "c8bd9bafd08003b018de528a779658d3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "c8bd9bafd08003b018de528a779658d3");
            } else if (TextUtils.isEmpty(str) || visibleTabCount == 0 || aVar.c() || aVar.b.isFinishing() || aVar.d == null || aVar.d.getChildCount() < 0) {
            } else {
                if (aVar.e == null) {
                    aVar.e = new com.sankuai.waimai.business.page.homepage.view.d(aVar.b);
                }
                com.sankuai.waimai.business.page.homepage.view.d dVar = aVar.e;
                Object[] objArr3 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.homepage.view.d.a;
                if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "19fe14ec393e221fba5ebda5e2846015", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "19fe14ec393e221fba5ebda5e2846015");
                } else {
                    dVar.c.setText(str);
                }
                aVar.e.update();
                int a2 = (com.sankuai.waimai.foundation.utils.g.a((Context) aVar.b) / (visibleTabCount * 2)) - com.sankuai.waimai.foundation.utils.g.a(aVar.b, 11.0f);
                com.sankuai.waimai.business.page.homepage.view.d dVar2 = aVar.e;
                ViewGroup viewGroup = aVar.d;
                d.a aVar2 = d.a.RIGHT;
                Object[] objArr4 = {viewGroup, aVar2, Integer.valueOf(a2)};
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.page.homepage.view.d.a;
                if (PatchProxy.isSupport(objArr4, dVar2, changeQuickRedirect4, false, "ea466cb4c5b03c396d47195fccb33b46", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, dVar2, changeQuickRedirect4, false, "ea466cb4c5b03c396d47195fccb33b46");
                } else {
                    int[] iArr = d.AnonymousClass1.a;
                    aVar2.ordinal();
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationInWindow(iArr2);
                    p.a(dVar2, viewGroup, 53, a2, (iArr2[1] - (dVar2.b.getResources().getDimensionPixelSize(R.dimen.takeout_popup_bubble_panel_height) / 3)) - 8);
                }
                com.sankuai.waimai.business.page.homepage.bubble.d a3 = com.sankuai.waimai.business.page.homepage.bubble.d.a();
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.business.page.homepage.bubble.d.a;
                if (PatchProxy.isSupport(objArr5, a3, changeQuickRedirect5, false, "1ab11b90f490aefa1c469630b845e6f1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, a3, changeQuickRedirect5, false, "1ab11b90f490aefa1c469630b845e6f1");
                } else {
                    com.sankuai.waimai.platform.capacity.persistent.sp.a.a(com.meituan.android.singleton.b.a, "key_sp_sky_bubble", true);
                }
                aVar.c.removeCallbacks(aVar.f);
                aVar.c.postDelayed(aVar.f, MetricsAnrManager.ANR_THRESHOLD);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class b extends l.c<Void> implements Runnable {
        public static ChangeQuickRedirect a;
        private final ResourceHelper b;
        private List<h> c;

        @Override // com.sankuai.waimai.platform.utils.l.c
        public final /* bridge */ /* synthetic */ void a(Void r1) {
        }

        public b(ResourceHelper resourceHelper) {
            Object[] objArr = {resourceHelper};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf0d47849f7f3b473ea790f19813521c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf0d47849f7f3b473ea790f19813521c");
            } else {
                this.b = resourceHelper;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.sankuai.waimai.platform.utils.l.c
        /* renamed from: b */
        public Void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed7b8ee71ef6caac7ac2be733a5db5cd", RobustBitConfig.DEFAULT_VALUE)) {
                return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed7b8ee71ef6caac7ac2be733a5db5cd");
            }
            try {
                this.b.downloadImages(this.c);
                return null;
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a2fe83bd6d5a7e328915a0d1bff4e8c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a2fe83bd6d5a7e328915a0d1bff4e8c");
                return;
            }
            this.c = this.b.getResourceList();
            if (com.sankuai.waimai.foundation.utils.d.a(this.c)) {
                return;
            }
            com.sankuai.waimai.platform.utils.l.a((l.c) this, b.class.getSimpleName());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7f07336c8e6790e7ea45ded878844c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7f07336c8e6790e7ea45ded878844c6");
            return;
        }
        this.m = true;
        com.sankuai.waimai.platform.utils.l.a(new Runnable() { // from class: com.sankuai.waimai.business.page.homepage.MainActivity.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                boolean z = false;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "80c24bcccab9b680a7ce27f86dc7e0ba", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "80c24bcccab9b680a7ce27f86dc7e0ba");
                } else if (!MainActivity.this.l) {
                    WMLocation i2 = com.sankuai.waimai.foundation.location.v2.g.a().i();
                    MainActivity.this.X = (i2 == null || com.sankuai.waimai.foundation.location.v2.g.a().b(i2)) ? true : true;
                } else if (com.sankuai.waimai.platform.model.c.a().c()) {
                } else {
                    com.sankuai.waimai.business.page.common.util.d.b(MainActivity.this);
                }
            }
        }, 1000, "PermissionCheckDialog");
    }

    @Override // com.sankuai.waimai.business.page.common.arch.PageActivity
    public final void av_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f035dbffba5b9d79f0c84a8a0206ff18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f035dbffba5b9d79f0c84a8a0206ff18");
            return;
        }
        if (this.e != null) {
            this.u = ObjectAnimator.ofFloat(this.e, RecceAnimUtils.TRANSLATION_Y, 0.0f, this.e.getHeight());
            this.u.addListener(new Animator.AnimatorListener() { // from class: com.sankuai.waimai.business.page.homepage.MainActivity.4
                public static ChangeQuickRedirect a;

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    Object[] objArr2 = {animator};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c08a03971888924779e0adf68ad85391", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c08a03971888924779e0adf68ad85391");
                        return;
                    }
                    com.sankuai.waimai.business.page.homepage.bubble.c cVar = g.a().d;
                    com.sankuai.waimai.business.page.homepage.bubble.f fVar = g.a().e;
                    if (cVar != null) {
                        cVar.a();
                    }
                    if (fVar != null) {
                        fVar.a();
                    }
                    if (MainActivity.this.G != null) {
                        com.sankuai.waimai.business.page.homepage.controller.a aVar = MainActivity.this.G;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.homepage.controller.a.a;
                        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "2bb899c8bace41fb647565dc38b09e4f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "2bb899c8bace41fb647565dc38b09e4f");
                        } else {
                            aVar.d();
                        }
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    Object[] objArr2 = {animator};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4bf57997d5d6849e570f50359af14cb6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4bf57997d5d6849e570f50359af14cb6");
                    } else if (MainActivity.this.e != null) {
                        MainActivity.this.e.setHidden(true);
                    }
                }
            });
            this.u.setDuration(RefreshHeaderHelper.p);
            this.u.start();
        }
        if (this.I != null) {
            ViewGroup.LayoutParams layoutParams = this.I.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.v = ValueAnimator.ofInt(marginLayoutParams.bottomMargin, 0).setDuration(RefreshHeaderHelper.p);
                this.v.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.business.page.homepage.MainActivity.5
                    public static ChangeQuickRedirect a;

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Object[] objArr2 = {valueAnimator};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9d54c932c1dd7c6add10ae60768ea870", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9d54c932c1dd7c6add10ae60768ea870");
                        } else if (MainActivity.this.I != null) {
                            marginLayoutParams.bottomMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                            MainActivity.this.I.setLayoutParams(marginLayoutParams);
                        }
                    }
                });
                this.v.start();
            }
        }
    }

    @Override // com.sankuai.waimai.business.page.common.arch.PageActivity
    public final void aw_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c7d33497d201b0068e1e0c31fa0d0ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c7d33497d201b0068e1e0c31fa0d0ca");
            return;
        }
        if (this.u != null && this.u.isRunning()) {
            this.u.cancel();
        }
        if (this.e != null && this.e.d) {
            this.e.setTranslationY(0.0f);
            g.a().a(this, this.f);
            if (this.G != null) {
                this.G.a();
            }
            this.e.setHidden(false);
        }
        if (this.I != null) {
            ViewGroup.LayoutParams layoutParams = this.I.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams.bottomMargin == 0) {
                    marginLayoutParams.bottomMargin = com.sankuai.waimai.foundation.utils.g.a(this, 55.0f);
                }
            }
            this.I.setLayoutParams(layoutParams);
        }
    }

    @Override // com.sankuai.waimai.platform.popup.e.a
    public final void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06d8ca90a313d297c19d59788f0ac015", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06d8ca90a313d297c19d59788f0ac015");
            return;
        }
        final WMHomePageFragment h = h();
        if (h != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = HomePageFragment.d;
            if (PatchProxy.isSupport(objArr2, h, changeQuickRedirect2, false, "0d0c3c435250514e0f751b8ca4d718aa", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, h, changeQuickRedirect2, false, "0d0c3c435250514e0f751b8ca4d718aa");
                return;
            }
            boolean z = com.sankuai.waimai.platform.accessibility.a.a().b() || h.v == 1;
            if (h.t == null || z) {
                return;
            }
            final com.sankuai.waimai.business.page.home.widget.twolevel.strategy.b bVar = h.t;
            final b.a aVar = new b.a() { // from class: com.sankuai.waimai.business.page.home.HomePageFragment.14
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.page.home.widget.twolevel.strategy.b.a
                public final void a(boolean z2) {
                    Object[] objArr3 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b26740392223558ee7f34e48f6ba6889", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b26740392223558ee7f34e48f6ba6889");
                    } else if (z2 && HomePageFragment.this.Y != null) {
                        final com.sankuai.waimai.business.page.home.widget.twolevel.c cVar = HomePageFragment.this.Y;
                        com.sankuai.waimai.business.page.home.widget.twolevel.b bVar2 = new com.sankuai.waimai.business.page.home.widget.twolevel.b() { // from class: com.sankuai.waimai.business.page.home.HomePageFragment.14.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.business.page.home.widget.twolevel.b
                            public final void a() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "16b39e87bc7baa71e8df383f93b2243b", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "16b39e87bc7baa71e8df383f93b2243b");
                                    return;
                                }
                                final com.sankuai.waimai.business.page.home.widget.twolevel.strategy.b bVar3 = HomePageFragment.this.t;
                                Object[] objArr5 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.business.page.home.widget.twolevel.strategy.b.a;
                                if (PatchProxy.isSupport(objArr5, bVar3, changeQuickRedirect5, false, "6a437703f11c620da863d5ab327308ef", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, bVar3, changeQuickRedirect5, false, "6a437703f11c620da863d5ab327308ef");
                                } else {
                                    com.sankuai.waimai.foundation.utils.log.a.b("SecondFloorGuideHelper", "shown", new Object[0]);
                                    com.sankuai.waimai.launcher.util.aop.b.a(com.sankuai.waimai.business.page.home.widget.twolevel.strategy.b.c, new Runnable() { // from class: com.sankuai.waimai.business.page.home.widget.twolevel.strategy.b.5
                                        public static ChangeQuickRedirect a;

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Object[] objArr6 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect6 = a;
                                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "6751d4ff238ea09ba742f910e7a8e9eb", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "6751d4ff238ea09ba742f910e7a8e9eb");
                                            } else if (b.this.b == null || b.this.b.get() == null || ((HomePageFragment) b.this.b.get()).isDetached() || !((HomePageFragment) b.this.b.get()).isAdded()) {
                                            } else {
                                                String a2 = b.this.a(((SecondFloorViewModel) q.a((Fragment) b.this.b.get()).a(SecondFloorViewModel.class)).b);
                                                SecondFloorGuideStrategy a3 = b.this.f.a(a2);
                                                if (a3 == null || a3.count <= 0) {
                                                    return;
                                                }
                                                while (a3.getShownList().size() >= a3.count) {
                                                    com.sankuai.waimai.foundation.utils.log.a.b("SecondFloorGuideHelper", "remove 0: " + a3.getShownList().size(), new Object[0]);
                                                    a3.getShownList().remove(0);
                                                }
                                                a3.getShownList().add(Long.valueOf(System.currentTimeMillis() / 1000));
                                                b.this.f.a(a2, a3);
                                            }
                                        }
                                    });
                                }
                                if (HomePageFragment.this.Z != null) {
                                    HomePageFragment.this.Z.a(HomePageFragment.this.u != null ? HomePageFragment.this.u.b : null, 1);
                                }
                            }
                        };
                        Object[] objArr4 = {bVar2};
                        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.page.home.widget.twolevel.c.a;
                        if (PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "b9d2f94c5a472de0fa455b64d9f7b0a2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "b9d2f94c5a472de0fa455b64d9f7b0a2");
                        } else if (cVar.k == null || cVar.p == null || cVar.s == null || com.sankuai.waimai.foundation.utils.f.a(cVar.s.getActivity()) || cVar.m == null) {
                        } else {
                            HomeSecondFloorResponse homeSecondFloorResponse = cVar.p.b;
                            if (homeSecondFloorResponse == null || !homeSecondFloorResponse.isGuideEnable() || homeSecondFloorResponse.guidePicSize.getWidth() == 0) {
                                com.sankuai.waimai.foundation.utils.log.a.b("SecondFloor__TASK", "触发引导动画, 数据无效 展示失败 数据: " + homeSecondFloorResponse, new Object[0]);
                                return;
                            }
                            cVar.a(homeSecondFloorResponse);
                            if (homeSecondFloorResponse.homeSecondFloorData.resource.moduleId == 3) {
                                Object[] objArr5 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.business.page.home.widget.twolevel.c.a;
                                if (PatchProxy.isSupport(objArr5, cVar, changeQuickRedirect5, false, "5c9856f5528773dd3f2f4c0a691c95d4", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, cVar, changeQuickRedirect5, false, "5c9856f5528773dd3f2f4c0a691c95d4");
                                } else {
                                    if (cVar.k != null) {
                                        cVar.k.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.widget.twolevel.c.7
                                            public static ChangeQuickRedirect a;

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                Object[] objArr6 = {view};
                                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "a885a5f34034f0146f49fac63a29cdfb", 4611686018427387906L)) {
                                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "a885a5f34034f0146f49fac63a29cdfb");
                                                    return;
                                                }
                                                com.sankuai.waimai.foundation.utils.log.a.b("SecondFloorBlock", "click SecondGuideImg", new Object[0]);
                                                c cVar2 = c.this;
                                                Object[] objArr7 = new Object[0];
                                                ChangeQuickRedirect changeQuickRedirect7 = c.a;
                                                if (PatchProxy.isSupport(objArr7, cVar2, changeQuickRedirect7, false, "e4178bb3231255a35a64519f38d733e8", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr7, cVar2, changeQuickRedirect7, false, "e4178bb3231255a35a64519f38d733e8");
                                                    return;
                                                }
                                                com.sankuai.waimai.foundation.utils.log.a.b("SecondFloorBlock", "triggerDelayOpenGuideAnimator", new Object[0]);
                                                cVar2.m.f();
                                            }
                                        });
                                    }
                                    if (cVar.l != null) {
                                        cVar.l.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.widget.twolevel.c.8
                                            public static ChangeQuickRedirect a;

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                Object[] objArr6 = {view};
                                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "4f38529c7740b5d578191e94a14ffea0", 4611686018427387906L)) {
                                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "4f38529c7740b5d578191e94a14ffea0");
                                                    return;
                                                }
                                                c cVar2 = c.this;
                                                Object[] objArr7 = new Object[0];
                                                ChangeQuickRedirect changeQuickRedirect7 = c.a;
                                                if (PatchProxy.isSupport(objArr7, cVar2, changeQuickRedirect7, false, "14ef62aac0377168a92be1abb9572136", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr7, cVar2, changeQuickRedirect7, false, "14ef62aac0377168a92be1abb9572136");
                                                } else {
                                                    String a2 = com.sankuai.waimai.business.page.home.widget.twolevel.report.a.a(cVar2.v);
                                                    RefreshHeaderHelper refreshHeaderHelper = cVar2.m;
                                                    Object[] objArr8 = {a2};
                                                    ChangeQuickRedirect changeQuickRedirect8 = RefreshHeaderHelper.a;
                                                    if (PatchProxy.isSupport(objArr8, refreshHeaderHelper, changeQuickRedirect8, false, "6ae9b388bf71a88df6f6aed753e2d5c5", RobustBitConfig.DEFAULT_VALUE)) {
                                                        PatchProxy.accessDispatch(objArr8, refreshHeaderHelper, changeQuickRedirect8, false, "6ae9b388bf71a88df6f6aed753e2d5c5");
                                                    } else if (refreshHeaderHelper.M != null) {
                                                        com.sankuai.waimai.business.page.home.widget.twolevel.report.a aVar2 = refreshHeaderHelper.M;
                                                        Object[] objArr9 = {a2};
                                                        ChangeQuickRedirect changeQuickRedirect9 = com.sankuai.waimai.business.page.home.widget.twolevel.report.a.a;
                                                        if (PatchProxy.isSupport(objArr9, aVar2, changeQuickRedirect9, false, "84375596ac38162868d3c6ff5b279539", RobustBitConfig.DEFAULT_VALUE)) {
                                                            PatchProxy.accessDispatch(objArr9, aVar2, changeQuickRedirect9, false, "84375596ac38162868d3c6ff5b279539");
                                                        } else {
                                                            JudasManualManager.a("b_waimai_k7o3blrp_mc", "c_m84bv26", aVar2.c).a("activity_id", a2).a();
                                                        }
                                                    }
                                                }
                                                c.this.a();
                                            }
                                        });
                                    }
                                }
                                final long guideTime = homeSecondFloorResponse.getGuideTime();
                                Object[] objArr6 = {new Long(guideTime), bVar2};
                                ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.business.page.home.widget.twolevel.c.a;
                                if (PatchProxy.isSupport(objArr6, cVar, changeQuickRedirect6, false, "09b204352c74b22548341b465c8d5489", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr6, cVar, changeQuickRedirect6, false, "09b204352c74b22548341b465c8d5489");
                                    return;
                                }
                                com.sankuai.waimai.foundation.utils.log.a.b("SecondFloorBlock", "triggerDelayOpenGuideAnimator", new Object[0]);
                                final RefreshHeaderHelper refreshHeaderHelper = cVar.m;
                                Object[] objArr7 = {bVar2, new Long(guideTime)};
                                ChangeQuickRedirect changeQuickRedirect7 = RefreshHeaderHelper.a;
                                if (PatchProxy.isSupport(objArr7, refreshHeaderHelper, changeQuickRedirect7, false, "6f192b4a633dffaf94045ab7504db565", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr7, refreshHeaderHelper, changeQuickRedirect7, false, "6f192b4a633dffaf94045ab7504db565");
                                    return;
                                } else if (refreshHeaderHelper.t != 0 || !refreshHeaderHelper.a() || refreshHeaderHelper.k || refreshHeaderHelper.m <= 0) {
                                    return;
                                } else {
                                    refreshHeaderHelper.J = new RefreshHeaderHelper.b(refreshHeaderHelper);
                                    refreshHeaderHelper.a(refreshHeaderHelper.L);
                                    refreshHeaderHelper.L = ValueAnimator.ofInt(0, refreshHeaderHelper.n).setDuration(RefreshHeaderHelper.q);
                                    refreshHeaderHelper.L.addUpdateListener(refreshHeaderHelper.P);
                                    refreshHeaderHelper.L.addListener(new com.sankuai.waimai.business.page.home.widget.twolevel.e() { // from class: com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.2
                                        public static ChangeQuickRedirect a;

                                        @Override // com.sankuai.waimai.business.page.home.widget.twolevel.e, android.animation.Animator.AnimatorListener
                                        public final void onAnimationStart(Animator animator) {
                                            Object[] objArr8 = {animator};
                                            ChangeQuickRedirect changeQuickRedirect8 = a;
                                            if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "f4cc0760bcb1bffd8ee2e31e8b0a1c52", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "f4cc0760bcb1bffd8ee2e31e8b0a1c52");
                                                return;
                                            }
                                            if (refreshHeaderHelper.I != null) {
                                                refreshHeaderHelper.I.b();
                                            }
                                            refreshHeaderHelper.T = true;
                                            refreshHeaderHelper.O = true;
                                            refreshHeaderHelper.t = 9;
                                            refreshHeaderHelper.b(refreshHeaderHelper.t);
                                            RefreshHeaderHelper refreshHeaderHelper2 = refreshHeaderHelper;
                                            long j = guideTime;
                                            Object[] objArr9 = {new Long(j)};
                                            ChangeQuickRedirect changeQuickRedirect9 = RefreshHeaderHelper.a;
                                            if (PatchProxy.isSupport(objArr9, refreshHeaderHelper2, changeQuickRedirect9, false, "752b984b62f7119412bf080bcb7bbbce", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr9, refreshHeaderHelper2, changeQuickRedirect9, false, "752b984b62f7119412bf080bcb7bbbce");
                                            } else if (refreshHeaderHelper2.J != null) {
                                                refreshHeaderHelper2.J.sendEmptyMessageDelayed(1, j);
                                            }
                                        }

                                        @Override // com.sankuai.waimai.business.page.home.widget.twolevel.e, android.animation.Animator.AnimatorListener
                                        public final void onAnimationEnd(Animator animator) {
                                            Object[] objArr8 = {animator};
                                            ChangeQuickRedirect changeQuickRedirect8 = a;
                                            if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "c8cede4b38068c6ddedc6bc6bf95dec0", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "c8cede4b38068c6ddedc6bc6bf95dec0");
                                            } else {
                                                refreshHeaderHelper.s = refreshHeaderHelper.n;
                                            }
                                        }
                                    });
                                    refreshHeaderHelper.x = new AnimatorSet();
                                    refreshHeaderHelper.x.play(refreshHeaderHelper.L);
                                    refreshHeaderHelper.x.start();
                                    com.sankuai.waimai.foundation.utils.log.a.b("SecondFloor__TASK", "执行引导动画", new Object[0]);
                                    bVar2.a();
                                    return;
                                }
                            }
                            Object[] objArr8 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.waimai.business.page.home.widget.twolevel.c.a;
                            if (PatchProxy.isSupport(objArr8, cVar, changeQuickRedirect8, false, "43f8b98db50e307d5f6b5607fcfec962", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr8, cVar, changeQuickRedirect8, false, "43f8b98db50e307d5f6b5607fcfec962");
                            } else {
                                if (cVar.k != null) {
                                    cVar.k.setOnClickListener(null);
                                }
                                if (cVar.l != null) {
                                    cVar.l.setOnClickListener(null);
                                }
                            }
                            long guideTime2 = homeSecondFloorResponse.getGuideTime();
                            Object[] objArr9 = {new Long(guideTime2), bVar2};
                            ChangeQuickRedirect changeQuickRedirect9 = com.sankuai.waimai.business.page.home.widget.twolevel.c.a;
                            if (PatchProxy.isSupport(objArr9, cVar, changeQuickRedirect9, false, "e1903f2c7858e9f29ebdde74ab7623d3", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr9, cVar, changeQuickRedirect9, false, "e1903f2c7858e9f29ebdde74ab7623d3");
                                return;
                            }
                            com.sankuai.waimai.foundation.utils.log.a.b("SecondFloorBlock", "triggerDelayCloseGuideAnimator", new Object[0]);
                            final RefreshHeaderHelper refreshHeaderHelper2 = cVar.m;
                            Object[] objArr10 = {bVar2, new Long(guideTime2)};
                            ChangeQuickRedirect changeQuickRedirect10 = RefreshHeaderHelper.a;
                            if (PatchProxy.isSupport(objArr10, refreshHeaderHelper2, changeQuickRedirect10, false, "cb9f72546161e7cc9387029ffd47a410", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr10, refreshHeaderHelper2, changeQuickRedirect10, false, "cb9f72546161e7cc9387029ffd47a410");
                            } else if (refreshHeaderHelper2.t != 0 || !refreshHeaderHelper2.a() || refreshHeaderHelper2.k || refreshHeaderHelper2.m <= 0) {
                            } else {
                                if (refreshHeaderHelper2.x != null && refreshHeaderHelper2.x.isRunning()) {
                                    refreshHeaderHelper2.x.cancel();
                                }
                                ValueAnimator duration = ValueAnimator.ofInt(0, refreshHeaderHelper2.m).setDuration(RefreshHeaderHelper.q);
                                ValueAnimator duration2 = ValueAnimator.ofInt(refreshHeaderHelper2.m, 0).setDuration(RefreshHeaderHelper.q);
                                duration.addUpdateListener(refreshHeaderHelper2.P);
                                duration2.addUpdateListener(refreshHeaderHelper2.P);
                                duration2.setStartDelay(guideTime2 - RefreshHeaderHelper.q);
                                duration.addListener(new com.sankuai.waimai.business.page.home.widget.twolevel.e() { // from class: com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.11
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.waimai.business.page.home.widget.twolevel.e, android.animation.Animator.AnimatorListener
                                    public final void onAnimationStart(Animator animator) {
                                        Object[] objArr11 = {animator};
                                        ChangeQuickRedirect changeQuickRedirect11 = a;
                                        if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "366e29ca63e2665167d29bfe20449dc6", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "366e29ca63e2665167d29bfe20449dc6");
                                            return;
                                        }
                                        if (refreshHeaderHelper2.I != null) {
                                            refreshHeaderHelper2.I.a();
                                        }
                                        refreshHeaderHelper2.T = true;
                                        refreshHeaderHelper2.t = 9;
                                        refreshHeaderHelper2.b(refreshHeaderHelper2.t);
                                    }
                                });
                                duration2.addListener(new com.sankuai.waimai.business.page.home.widget.twolevel.e() { // from class: com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.12
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.waimai.business.page.home.widget.twolevel.e, android.animation.Animator.AnimatorListener
                                    public final void onAnimationStart(Animator animator) {
                                        Object[] objArr11 = {animator};
                                        ChangeQuickRedirect changeQuickRedirect11 = a;
                                        if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "c74f44329723585c18080a923d2a31bf", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "c74f44329723585c18080a923d2a31bf");
                                        } else {
                                            refreshHeaderHelper2.T = false;
                                        }
                                    }

                                    @Override // com.sankuai.waimai.business.page.home.widget.twolevel.e, android.animation.Animator.AnimatorListener
                                    public final void onAnimationEnd(Animator animator) {
                                        Object[] objArr11 = {animator};
                                        ChangeQuickRedirect changeQuickRedirect11 = a;
                                        if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "a141be3e11a3f8a39f6ceb641939846f", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "a141be3e11a3f8a39f6ceb641939846f");
                                            return;
                                        }
                                        if (refreshHeaderHelper2.I != null) {
                                            refreshHeaderHelper2.I.c();
                                        }
                                        refreshHeaderHelper2.i();
                                    }

                                    @Override // com.sankuai.waimai.business.page.home.widget.twolevel.e, android.animation.Animator.AnimatorListener
                                    public final void onAnimationCancel(Animator animator) {
                                        Object[] objArr11 = {animator};
                                        ChangeQuickRedirect changeQuickRedirect11 = a;
                                        if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "98a0351bf1d3dfc553ae6078b058323d", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "98a0351bf1d3dfc553ae6078b058323d");
                                        } else {
                                            refreshHeaderHelper2.i();
                                        }
                                    }
                                });
                                refreshHeaderHelper2.x = new AnimatorSet();
                                refreshHeaderHelper2.x.play(duration2).after(duration);
                                refreshHeaderHelper2.x.start();
                                com.sankuai.waimai.foundation.utils.log.a.b("SecondFloor__TASK", "执行引导动画", new Object[0]);
                                bVar2.a();
                            }
                        }
                    }
                }
            };
            Object[] objArr3 = {aVar};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.home.widget.twolevel.strategy.b.a;
            if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "b05a1222d6d6dd4dfc67856c0d248125", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "b05a1222d6d6dd4dfc67856c0d248125");
                return;
            }
            com.sankuai.waimai.foundation.utils.log.a.b("SecondFloorGuideHelper", "checkAndShow", new Object[0]);
            if (bVar.b == null || bVar.b.get() == null || bVar.b.get().isDetached() || !bVar.b.get().isAdded() || com.sankuai.waimai.popup.f.a().e) {
                return;
            }
            com.sankuai.waimai.business.page.home.model.d a2 = ((HomePageViewModel) q.a(bVar.b.get()).a(HomePageViewModel.class)).c.a();
            if (a2 == null) {
                com.sankuai.waimai.foundation.utils.log.a.b("SecondFloorGuideHelper", "no show, wait next popup finish, in cold boot", new Object[0]);
            } else if (a2.b != 1) {
                com.sankuai.waimai.foundation.utils.log.a.b("SecondFloorGuideHelper", "no show, wait next popup finish.", new Object[0]);
            } else if (bVar.e) {
                com.sankuai.waimai.foundation.utils.log.a.b("SecondFloorGuideHelper", "no show", new Object[0]);
                bVar.e = false;
            } else {
                final SecondFloorViewModel secondFloorViewModel = (SecondFloorViewModel) q.a(bVar.b.get()).a(SecondFloorViewModel.class);
                final HomeSecondFloorResponse homeSecondFloorResponse = secondFloorViewModel.b;
                if (homeSecondFloorResponse == null) {
                    com.sankuai.waimai.foundation.utils.log.a.b("SecondFloorGuideHelper", "no api data, wait 1s...", new Object[0]);
                    ad.a(new Runnable() { // from class: com.sankuai.waimai.business.page.home.widget.twolevel.strategy.b.2
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e852d4cece3b22b9f1eecbc1ab65a343", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e852d4cece3b22b9f1eecbc1ab65a343");
                                return;
                            }
                            HomeSecondFloorResponse homeSecondFloorResponse2 = secondFloorViewModel.b;
                            if (homeSecondFloorResponse2 == null) {
                                com.sankuai.waimai.foundation.utils.log.a.b("SecondFloorGuideHelper", "end waiting, still no api data", new Object[0]);
                                return;
                            }
                            com.sankuai.waimai.foundation.utils.log.a.b("SecondFloorGuideHelper", "end waiting, got data", new Object[0]);
                            b.a(b.this, homeSecondFloorResponse2, aVar);
                        }
                    }, 1000L);
                    return;
                }
                ad.a(new Runnable() { // from class: com.sankuai.waimai.business.page.home.widget.twolevel.strategy.b.3
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d5f60e5be3bde8611241a43e76a3ed02", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d5f60e5be3bde8611241a43e76a3ed02");
                        } else {
                            b.a(b.this, homeSecondFloorResponse, aVar);
                        }
                    }
                }, 500L);
            }
        }
    }

    @Override // com.sankuai.waimai.platform.machpro.video.a
    public final com.meituan.android.mtplayer.video.h b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c16941c0e4b0a28133747ecf8f527ef6", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.mtplayer.video.h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c16941c0e4b0a28133747ecf8f527ef6");
        }
        IContentFeedListProvider iContentFeedListProvider = (IContentFeedListProvider) com.sankuai.waimai.router.a.a(IContentFeedListProvider.class, IContentFeedListProvider.CONTENT_PICK_ME_KEY);
        if (iContentFeedListProvider != null) {
            return iContentFeedListProvider.getMediaPlayerManager(a(1, iContentFeedListProvider.getContentFeedListFragmentClass()));
        }
        return null;
    }

    @Override // com.sankuai.waimai.platform.machpro.video.a
    public final com.meituan.android.mtplayer.video.l d() {
        return com.meituan.android.mtplayer.video.l.TYPE_XPLAYER;
    }

    private void a(TabInfo tabInfo, Fragment fragment) {
        Object[] objArr = {tabInfo, fragment};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aca9b856b08bda6577eacd89a68ffde6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aca9b856b08bda6577eacd89a68ffde6");
            return;
        }
        int i2 = tabInfo.b;
        if (i2 == 2) {
            a(tabInfo.b, fragment, true);
        } else if (i2 == 1) {
            a(fragment);
        }
    }
}
