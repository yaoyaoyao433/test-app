package com.sankuai.waimai.business.page.home.head.banner;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.arch.lifecycle.d;
import android.arch.lifecycle.k;
import android.arch.lifecycle.l;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.android.common.statistics.utils.JsonUtil;
import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.arch.PageFragment;
import com.sankuai.waimai.business.page.home.HomePageViewModel;
import com.sankuai.waimai.business.page.home.head.banner.mach.AcrossBannerMachViewModel;
import com.sankuai.waimai.business.page.home.head.promotion.PromotionBgViewModel;
import com.sankuai.waimai.business.page.home.model.v10.HomeNewHeadResponse;
import com.sankuai.waimai.business.page.home.utils.q;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.log.judas.e;
import com.sankuai.waimai.mach.manager.cache.CacheException;
import com.sankuai.waimai.mach.manager.monitor.MonitorManager;
import com.sankuai.waimai.platform.domain.core.ad.Ad;
import com.sankuai.waimai.platform.widget.pager.SimplePageIndicator;
import com.tencent.open.apireq.BaseResp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* compiled from: ProGuard */
@DynamicBinder(modelType = HomeNewHeadResponse.class, nativeId = {"wm_home_head_banner"}, viewModel = d.class)
/* loaded from: classes4.dex */
public class a extends com.sankuai.waimai.business.page.common.arch.a<b> {
    public static ChangeQuickRedirect v = null;
    private static boolean x = false;
    private static int y;
    private final Activity A;
    private HomePageViewModel B;
    private FrameLayout C;
    private ViewPager D;
    private SimplePageIndicator E;
    private View F;
    private boolean G;
    private c H;
    private String I;
    private String J;
    private int K;
    private long L;
    private AtomicBoolean M;
    private long N;
    private final q O;
    private BannerViewModel P;
    private View Q;
    private View R;
    private TextView S;
    private Rect T;
    private final ViewPager.OnPageChangeListener U;
    private final com.sankuai.waimai.business.page.home.judas.a V;
    List<Ad> w;
    private final Set<Ad> z;

    @Override // com.sankuai.waimai.business.page.common.arch.a
    public final /* synthetic */ void d(b bVar) {
        b bVar2 = bVar;
        Object[] objArr = {bVar2};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bffffb5efc1bac977a2c6300571f22c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bffffb5efc1bac977a2c6300571f22c");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = v;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c2912a211ebb2bc3ed578b3adcc575aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c2912a211ebb2bc3ed578b3adcc575aa");
        } else {
            this.L = 0L;
            this.K = 0;
            this.J = "2";
            this.I = "2";
        }
        a(bVar2.b, false);
        final Ad.d dVar = bVar2.c;
        Object[] objArr3 = {dVar};
        ChangeQuickRedirect changeQuickRedirect3 = v;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d27a6e57b2f7196356e3c92116e418ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d27a6e57b2f7196356e3c92116e418ce");
        } else if (com.sankuai.waimai.foundation.core.a.d()) {
            if (dVar != null && !TextUtils.isEmpty(dVar.a) && !TextUtils.isEmpty(dVar.b)) {
                this.S.setText(dVar.a);
                this.S.setVisibility(0);
                this.S.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.head.banner.a.6
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr4 = {view};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c6890444531f989a879f69097a1b0128", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c6890444531f989a879f69097a1b0128");
                        } else if (TextUtils.isEmpty(dVar.b)) {
                        } else {
                            com.sankuai.waimai.foundation.router.a.a().a(a.this.A, Uri.parse(dVar.b).buildUpon().build());
                        }
                    }
                });
            } else {
                this.S.setVisibility(8);
            }
            this.F.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.sankuai.waimai.business.page.home.head.banner.a.7
                public static ChangeQuickRedirect a;

                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "69d631471808889a495f016a9ded949b", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "69d631471808889a495f016a9ded949b")).booleanValue();
                    }
                    a.this.F.getViewTreeObserver().removeOnPreDrawListener(this);
                    a.a(a.this, a.this.R, dVar);
                    boolean z = ((PromotionBgViewModel) android.arch.lifecycle.q.a(a.this.s).a(PromotionBgViewModel.class)).k;
                    if (a.this.R.getParent() instanceof ViewGroup) {
                        ((ViewGroup) a.this.R.getParent()).removeView(a.this.R);
                    }
                    if (!z) {
                        a.this.C.removeAllViews();
                        a.this.C.addView(a.this.R);
                    } else {
                        AcrossBannerMachViewModel acrossBannerMachViewModel = (AcrossBannerMachViewModel) android.arch.lifecycle.q.a(a.this.s).a(AcrossBannerMachViewModel.class);
                        View view = a.this.R;
                        Object[] objArr5 = {view};
                        ChangeQuickRedirect changeQuickRedirect5 = AcrossBannerMachViewModel.a;
                        if (PatchProxy.isSupport(objArr5, acrossBannerMachViewModel, changeQuickRedirect5, false, "272ab07933d1e3772225b96c05622c7b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, acrossBannerMachViewModel, changeQuickRedirect5, false, "272ab07933d1e3772225b96c05622c7b");
                        } else {
                            acrossBannerMachViewModel.b.b((k<View>) view);
                        }
                    }
                    return true;
                }
            });
        }
    }

    public static /* synthetic */ void a(a aVar, View view, Ad.d dVar) {
        Object[] objArr = {view, dVar};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "ab8fe793de208766ee1555e8227aa213", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "ab8fe793de208766ee1555e8227aa213");
        } else if (dVar == null || TextUtils.isEmpty(dVar.a) || TextUtils.isEmpty(dVar.b)) {
            view.setVisibility(8);
        } else if (aVar.F.getVisibility() != 0) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
            JudasManualManager.b("b_waimai_vyigyiat_mv").a("c_m84bv26").a(aVar.s).a();
        }
    }

    public static /* synthetic */ void a(a aVar, boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "764028fcdd1f13766a10e369f74b0e2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "764028fcdd1f13766a10e369f74b0e2b");
            return;
        }
        c cVar = aVar.H;
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "08086480de08ca46f52114bd9ec314b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "08086480de08ca46f52114bd9ec314b9");
        } else if (z) {
        } else {
            cVar.a();
        }
    }

    public static /* synthetic */ void b(a aVar, boolean z) {
        boolean z2 = true;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "2477766db11014fcc214ca0b12949c9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "2477766db11014fcc214ca0b12949c9c");
            return;
        }
        c cVar = aVar.H;
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "1a4632977c68f30320938e571f26b70f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "1a4632977c68f30320938e571f26b70f");
            return;
        }
        if ((((cVar.h == null || !(cVar.h instanceof Activity)) ? false : com.sankuai.waimai.foundation.core.lifecycle.b.a().a(cVar.h.hashCode())) || z) ? false : false) {
            cVar.a();
        }
    }

    public static /* synthetic */ void g(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "e6c3a2a7ac3bcc14335a4b06041d3d5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "e6c3a2a7ac3bcc14335a4b06041d3d5c");
            return;
        }
        c cVar = aVar.H;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "1397194efbf93b0be262716a2631e5c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "1397194efbf93b0be262716a2631e5c6");
            return;
        }
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(cVar.c);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = c.a;
        if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "eaec56b0083d3b65fe5d1d3f34017204", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "eaec56b0083d3b65fe5d1d3f34017204");
        } else if (cVar.f != null) {
            cVar.f.unsubscribe();
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = c.a;
        if (PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "926b18a5d1abf0a0ed8cfdc770916f5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "926b18a5d1abf0a0ed8cfdc770916f5d");
        } else if (cVar.g != null) {
            cVar.g.unsubscribe();
        }
    }

    public static void a(boolean z, int i) {
        x = z;
        y = i;
    }

    public a(com.meituan.android.cube.pga.type.a aVar) {
        this((PageFragment) aVar.h());
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7694609c85a656e194ed45813f77ef7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7694609c85a656e194ed45813f77ef7");
        }
    }

    private a(PageFragment pageFragment) {
        super(pageFragment);
        Object[] objArr = {pageFragment};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fed2c70247b983e506fddf0ca4caebde", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fed2c70247b983e506fddf0ca4caebde");
            return;
        }
        this.z = new HashSet();
        this.w = new ArrayList();
        this.G = false;
        this.I = "2";
        this.J = "2";
        this.M = new AtomicBoolean(false);
        this.O = new q(MetricsAnrManager.ANR_THRESHOLD, new Handler(), new Runnable() { // from class: com.sankuai.waimai.business.page.home.head.banner.a.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                int count;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ecc00cfb2f1381772d22294655f8d7c7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ecc00cfb2f1381772d22294655f8d7c7");
                } else if (a.this.D == null || a.this.D.getAdapter() == null || (count = a.this.D.getAdapter().getCount()) <= 1) {
                } else {
                    a.this.D.setCurrentItem(a.this.D.getCurrentItem() != count - 1 ? a.this.D.getCurrentItem() + 1 : 0);
                    a.this.I = "2";
                }
            }
        });
        this.U = new ViewPager.OnPageChangeListener() { // from class: com.sankuai.waimai.business.page.home.head.banner.BannerBlock$8
            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
            }
        };
        this.V = new com.sankuai.waimai.business.page.home.judas.a(2, new e() { // from class: com.sankuai.waimai.business.page.home.head.banner.a.8
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.log.judas.e
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "457f13f49a1b74836931bc4505912184", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "457f13f49a1b74836931bc4505912184");
                    return;
                }
                Object[] objArr3 = {"b_mRSdi"};
                ChangeQuickRedirect changeQuickRedirect3 = JudasManualManager.a;
                (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "415d18cd8616655b016e740f1036e8d9", RobustBitConfig.DEFAULT_VALUE) ? (JudasManualManager.a) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "415d18cd8616655b016e740f1036e8d9") : new JudasManualManager.a(EventName.MGE, Constants.EventType.SLIDE, "b_mRSdi")).a("c_m84bv26").a(a.this.s).a();
                com.sankuai.waimai.foundation.utils.log.a.b("BannerBlock", "report slile to judas", new Object[0]);
            }
        });
        this.A = pageFragment.getActivity();
        this.B = (HomePageViewModel) android.arch.lifecycle.q.a(pageFragment).a(HomePageViewModel.class);
        this.P = (BannerViewModel) android.arch.lifecycle.q.a(pageFragment).a(BannerViewModel.class);
        this.H = new c(this);
    }

    @Override // com.meituan.android.cube.core.f
    public final Context m() {
        return this.A;
    }

    @Override // com.sankuai.waimai.business.page.common.arch.a, com.meituan.android.cube.pga.block.a
    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cebfa9278f9eb63522c7333cd549b2e", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cebfa9278f9eb63522c7333cd549b2e");
        }
        this.Q = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_page_home_banner_layout, viewGroup, false);
        this.C = (FrameLayout) this.Q.findViewById(R.id.qualification_layout_banner);
        this.R = LayoutInflater.from(this.A).inflate(R.layout.wm_page_home_head_qualification_layout, (ViewGroup) null, false);
        this.S = (TextView) this.R.findViewById(R.id.ad_qualification_rule);
        this.F = this.Q.findViewById(R.id.layout_banner);
        this.D = (ViewPager) this.Q.findViewById(R.id.pager_banner);
        this.E = (SimplePageIndicator) this.Q.findViewById(R.id.indicator_banner);
        this.E.setShowMode(3);
        this.D.addOnPageChangeListener(this.E);
        this.D.addOnPageChangeListener(this.U);
        this.D.setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.waimai.business.page.home.head.banner.a.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Object[] objArr2 = {view, motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "53496ddde1d4887d4fe2e0ae34b7e04f", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "53496ddde1d4887d4fe2e0ae34b7e04f")).booleanValue();
                }
                if (motionEvent.getAction() == 2) {
                    a.this.R();
                    a.this.I = "1";
                } else if (motionEvent.getAction() == 1) {
                    a.this.Q();
                }
                a.this.V.onTouch(view, motionEvent);
                return false;
            }
        });
        a(this.s);
        return this.Q;
    }

    @Override // com.sankuai.waimai.business.page.common.arch.a, com.meituan.android.cube.pga.block.a, com.meituan.android.cube.core.f
    public final View i() {
        return this.Q;
    }

    @Override // com.sankuai.waimai.business.page.common.arch.a
    public final void a(PageFragment pageFragment) {
        Object[] objArr = {pageFragment};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74bbdf94a843fed41b7a8f9500763ea6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74bbdf94a843fed41b7a8f9500763ea6");
            return;
        }
        this.B.d.a(new l<Boolean>() { // from class: com.sankuai.waimai.business.page.home.head.banner.a.3
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr2 = {bool2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cf438150e11f2683a3a8fbd2e3b4b316", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cf438150e11f2683a3a8fbd2e3b4b316");
                } else if (bool2 == null || !bool2.booleanValue()) {
                    a.this.R();
                } else if (a.this.Q == null || !a.this.Q.isAttachedToWindow()) {
                } else {
                    a.this.Q();
                }
            }
        });
        this.B.e.a(new l<Boolean>() { // from class: com.sankuai.waimai.business.page.home.head.banner.a.4
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr2 = {bool2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cbbdb31b033839e88e72f865b3ebb9dc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cbbdb31b033839e88e72f865b3ebb9dc");
                } else if (bool2 != null) {
                    a.a(a.this, bool2.booleanValue());
                }
            }
        });
        this.B.f.a(new l<d.a>() { // from class: com.sankuai.waimai.business.page.home.head.banner.a.5
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable d.a aVar) {
                d.a aVar2 = aVar;
                Object[] objArr2 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f82eb8874687d19b7fafafbfb2e78580", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f82eb8874687d19b7fafafbfb2e78580");
                } else if (aVar2 != null) {
                    if (d.a.ON_START == aVar2 && a.this.B.e.a() != null) {
                        a.b(a.this, a.this.B.e.a().booleanValue());
                    }
                    if (d.a.ON_DESTROY == aVar2) {
                        a.g(a.this);
                    }
                }
            }
        });
        this.N = this.B.R;
    }

    @Override // com.sankuai.waimai.business.page.common.arch.a
    public final void b(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fc1fd200974bfccf5128e198ee48707", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fc1fd200974bfccf5128e198ee48707");
            return;
        }
        super.b(rect);
        this.T = rect;
        if (rect == null || this.D == null) {
            return;
        }
        if (this.D.getWindowVisibility() == 0 && Rect.intersects(rect, ah.a(this.D))) {
            if (this.G) {
                return;
            }
            this.G = true;
            Q();
        } else if (this.G) {
            this.G = false;
            R();
        }
    }

    public final boolean a(Ad ad) {
        Ad.a adExtra;
        Object[] objArr = {ad};
        ChangeQuickRedirect changeQuickRedirect = v;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "849bb3abe8676371bc95f41305679e39", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "849bb3abe8676371bc95f41305679e39")).booleanValue() : ad != null && ad.getProviderType() == 1 && (adExtra = ad.getAdExtra()) != null && adExtra.a > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5bc78d2e8043158428080556a861abe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5bc78d2e8043158428080556a861abe");
            return;
        }
        long j = 0;
        if (x && this.N > 0 && this.M.compareAndSet(false, true)) {
            long currentTimeMillis = this.N - System.currentTimeMillis();
            int i = BaseResp.CODE_ERROR_PARAMS;
            if (y != 0) {
                i = y;
            }
            long j2 = i;
            if (currentTimeMillis < j2) {
                currentTimeMillis = j2;
            }
            if (currentTimeMillis <= 0) {
                j = currentTimeMillis;
            }
        }
        this.O.a(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf9023657791db37cc0e6d10aaf47578", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf9023657791db37cc0e6d10aaf47578");
        } else {
            this.O.cancel();
        }
    }

    public final boolean a(ArrayList<Ad> arrayList, boolean z) {
        Object[] objArr = {arrayList, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6842246a5711bea5b96be5bfe80cb360", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6842246a5711bea5b96be5bfe80cb360")).booleanValue();
        }
        if (arrayList != null && arrayList.size() > 0) {
            this.w = arrayList;
            if (!z) {
                this.z.clear();
            }
            if (arrayList.size() == 1) {
                this.U.onPageSelected(arrayList.size() * 100);
            } else {
                this.D.setCurrentItem(arrayList.size() * 100);
            }
            this.E.a(arrayList.size(), this.D.getCurrentItem());
            if (arrayList.size() > 1) {
                Q();
            } else {
                R();
            }
            this.F.setVisibility(0);
            a(z);
            return true;
        }
        R();
        this.F.setVisibility(8);
        return false;
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0cde0e65f77428aeca7622e93f6c93d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0cde0e65f77428aeca7622e93f6c93d");
        } else {
            this.H.a(z);
        }
    }

    public final void P() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3df59453bb74d040648e9465084cf2f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3df59453bb74d040648e9465084cf2f2");
            return;
        }
        ArrayList arrayList = new ArrayList(this.w);
        if (arrayList.size() == 1) {
            this.U.onPageSelected(arrayList.size() * 100);
        } else {
            this.D.setCurrentItem(arrayList.size() * 100);
        }
        this.E.a(arrayList.size(), this.D.getCurrentItem());
        if (arrayList.size() > 1) {
            Q();
        } else {
            R();
        }
    }

    public final boolean b(Ad ad) {
        Object[] objArr = {ad};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "424a11a81074ef2b3406847c12040198", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "424a11a81074ef2b3406847c12040198")).booleanValue();
        }
        if (ad == null) {
            return false;
        }
        if (ad.getMachAdSign() < 0) {
            if (ad.templateType == 1 && !TextUtils.isEmpty(ad.templateJson)) {
                com.sankuai.waimai.mach.manager.a a = com.sankuai.waimai.mach.manager.a.a();
                String str = ad.templateId;
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.mach.manager.a.a;
                if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect2, false, "51890dcdaacd8e66ea7cf996f659656a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect2, false, "51890dcdaacd8e66ea7cf996f659656a")).booleanValue() : a.b.c(str)) {
                    ad.setMachAdSign(1);
                } else {
                    ad.setMachAdSign(0);
                    Object[] objArr3 = {ad};
                    ChangeQuickRedirect changeQuickRedirect3 = v;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bab7b6d7d9adcddfcd0c01a5d0eaef83", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bab7b6d7d9adcddfcd0c01a5d0eaef83");
                    } else {
                        try {
                            new MonitorManager().loadBundleFailure("", "homeBanner", "waimai", ad.templateId, JsonUtil.jsonObjectToMap(new JSONObject(ad.templateJson)), new CacheException(17807), 0);
                        } catch (Exception e) {
                            com.sankuai.waimai.foundation.utils.log.a.e("MachAdBanner", e.toString(), new Object[0]);
                        }
                    }
                }
            } else {
                ad.setMachAdSign(0);
            }
        }
        return ad.getMachAdSign() == 1;
    }
}
