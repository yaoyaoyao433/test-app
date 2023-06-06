package com.sankuai.waimai.business.page.home.head.promotion;

import android.annotation.SuppressLint;
import android.arch.lifecycle.d;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.meituan.android.common.unionid.oneid.oaid.RouteSelector;
import com.meituan.android.mtplayer.video.MTVideoPlayerView;
import com.meituan.android.mtplayer.video.VideoPlayerParam;
import com.meituan.android.mtplayer.video.callback.IPlayerStateCallback;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.arch.PageFragment;
import com.sankuai.waimai.business.page.home.HomePageViewModel;
import com.sankuai.waimai.business.page.home.gray.HomeGrayManager;
import com.sankuai.waimai.business.page.home.helper.ResourceHelper;
import com.sankuai.waimai.business.page.home.model.h;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.platform.capacity.log.c;
import com.sankuai.waimai.platform.capacity.log.i;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.business.page.common.arch.a {
    private static final int K = g.a(b.a, 40.0f);
    public static ChangeQuickRedirect v;
    private MTVideoPlayerView A;
    private Handler B;
    private HomePageViewModel C;
    private PromotionBgViewModel D;
    private ViewGroup E;
    private ViewGroup F;
    private int G;
    private int H;
    private int I;
    private Bitmap J;
    private boolean L;
    private boolean M;
    private String N;
    private boolean O;
    private View w;
    private FrameLayout x;
    private ImageView y;
    private ImageView z;

    public static /* synthetic */ void a(a aVar, h hVar) throws Exception {
        boolean z;
        boolean z2 = true;
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "8c4520a7d7260b8122c2de47a3e296e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "8c4520a7d7260b8122c2de47a3e296e4");
            return;
        }
        PromotionBgViewModel promotionBgViewModel = (PromotionBgViewModel) q.a(aVar.s).a(PromotionBgViewModel.class);
        if ((promotionBgViewModel.i == PromotionBgViewModel.d && promotionBgViewModel.l) && "block_area_title_picture".equals(hVar.f)) {
            Object[] objArr2 = {promotionBgViewModel};
            ChangeQuickRedirect changeQuickRedirect2 = v;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "9667f8b9a1ca8ea7d7fae1c91d8c7ee9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "9667f8b9a1ca8ea7d7fae1c91d8c7ee9");
            } else if (promotionBgViewModel.e()) {
            } else {
                aVar.D.a(false);
                aVar.E.setVisibility(8);
            }
        } else if (aVar.G == -1 && aVar.H == -1) {
            throw new Exception("更新时序必须在测试之后进行");
        } else {
            aVar.b("[handleResourceUpdate]+ resource.key:" + hVar.f);
            if (promotionBgViewModel.b() && ("banner_buttom_pic".equals(hVar.f) || "banner_bottom_video".equals(hVar.f))) {
                aVar.Q();
                if (!promotionBgViewModel.c()) {
                    aVar.b("[handleResourceUpdate]+ shouldShowPromotionBg = false");
                    return;
                }
            }
            if (aVar.L && promotionBgViewModel.e()) {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = PromotionBgViewModel.a;
                if (PatchProxy.isSupport(objArr3, promotionBgViewModel, changeQuickRedirect3, false, "a779a9b6688342d2c781a18f3c577805", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, promotionBgViewModel, changeQuickRedirect3, false, "a779a9b6688342d2c781a18f3c577805")).booleanValue();
                } else {
                    z = promotionBgViewModel.b.getShowBitmapWithoutTime("area_bottom_picture") != null;
                }
                if (!z || aVar.M) {
                    return;
                }
                int i = aVar.H;
                boolean c = promotionBgViewModel.c();
                Object[] objArr4 = {Integer.valueOf(i), Byte.valueOf(c ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect4 = v;
                if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "f998a3e78588e44fa7680606475787f4", RobustBitConfig.DEFAULT_VALUE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "f998a3e78588e44fa7680606475787f4")).booleanValue();
                } else {
                    aVar.b("[showPromotionBg] shouldShowPromotionBg:" + c);
                    if (!c || i == -1) {
                        aVar.z.setVisibility(8);
                    } else {
                        c.a().a(1001, "promotion/show", 0L);
                        Object[] objArr5 = {Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect5 = v;
                        if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "344c047d19ffd22501d98851fba15df8", RobustBitConfig.DEFAULT_VALUE)) {
                            z2 = ((Boolean) PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "344c047d19ffd22501d98851fba15df8")).booleanValue();
                        } else {
                            Bitmap showBitmapWithoutTime = new ResourceHelper(aVar.t).getShowBitmapWithoutTime("area_bottom_picture");
                            if (showBitmapWithoutTime != null) {
                                aVar.z.setImageBitmap(showBitmapWithoutTime);
                                aVar.z.setVisibility(0);
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) aVar.z.getLayoutParams();
                                layoutParams.height = i;
                                aVar.z.setLayoutParams(layoutParams);
                            }
                        }
                    }
                    z2 = false;
                }
                aVar.M = z2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [com.meituan.android.cube.pga.viewmodel.a] */
    public static /* synthetic */ void a(a aVar, List list) {
        boolean z;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "aa58412ad2e756f3a781a328cfe30db9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "aa58412ad2e756f3a781a328cfe30db9");
            return;
        }
        aVar.b("[handlePromotionBg]]");
        if (list != null) {
            aVar.L = false;
            aVar.M = false;
            boolean b = aVar.D.b();
            PromotionBgViewModel promotionBgViewModel = aVar.D;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = PromotionBgViewModel.a;
            if (PatchProxy.isSupport(objArr2, promotionBgViewModel, changeQuickRedirect2, false, "ef13bd76e9f76c885cc28bcdb21858b0", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, promotionBgViewModel, changeQuickRedirect2, false, "ef13bd76e9f76c885cc28bcdb21858b0")).booleanValue();
            } else {
                z = promotionBgViewModel.l && (promotionBgViewModel.i == PromotionBgViewModel.d || promotionBgViewModel.i == PromotionBgViewModel.c);
            }
            boolean z2 = b || z || aVar.D.c();
            aVar.E.setVisibility(z2 ? 0 : 8);
            if (!z2) {
                aVar.D.a(false);
                return;
            }
            aVar.z.setVisibility(8);
            com.sankuai.waimai.business.page.home.helper.b.a();
            if (b) {
                Object[] objArr3 = {list};
                ChangeQuickRedirect changeQuickRedirect3 = v;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "e4b4594ebf0c49d985cfbc60c4a36643", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "e4b4594ebf0c49d985cfbc60c4a36643");
                    return;
                }
                aVar.b("[processHomePromotionHeaderBg]]");
                if (aVar.D.m) {
                    for (int i = 0; i < list.size(); i++) {
                        final com.meituan.android.cube.pga.block.a aVar2 = (com.meituan.android.cube.pga.block.a) list.get(i);
                        if (aVar2 != null && aVar2.G() != 0 && (aVar2 instanceof com.sankuai.waimai.platform.dynamic.g) && "wm_home_head_promotion_card".equals(aVar2.G().k())) {
                            ((com.sankuai.waimai.platform.dynamic.g) aVar2).a(new com.sankuai.waimai.platform.dynamic.h() { // from class: com.sankuai.waimai.business.page.home.head.promotion.a.7
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.platform.dynamic.h
                                public final void a(int i2, int i3) {
                                    Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(i3)};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "bec3ff80abd2d346a76d8ce386296250", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "bec3ff80abd2d346a76d8ce386296250");
                                        return;
                                    }
                                    ((com.sankuai.waimai.platform.dynamic.g) aVar2).b((com.sankuai.waimai.platform.dynamic.h) this);
                                    if (i3 <= 0) {
                                        a.this.D.a(false);
                                        a.this.y.setVisibility(8);
                                        a.this.A.setVisibility(8);
                                        return;
                                    }
                                    a.this.Q();
                                }

                                @Override // com.sankuai.waimai.platform.dynamic.h
                                public final void a() {
                                    Object[] objArr4 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3e913dd9c7582d6011daba47b4cfc1ac", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3e913dd9c7582d6011daba47b4cfc1ac");
                                        return;
                                    }
                                    a.this.A.setVisibility(8);
                                    a.this.y.setVisibility(8);
                                    ((com.sankuai.waimai.platform.dynamic.g) aVar2).b((com.sankuai.waimai.platform.dynamic.h) this);
                                    a.this.D.a(false);
                                }
                            });
                        }
                    }
                    return;
                }
                aVar.Q();
            }
        }
    }

    public static /* synthetic */ void k(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "3c1f33977f3ff05d0b805ede6f98a284", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "3c1f33977f3ff05d0b805ede6f98a284");
            return;
        }
        boolean e = aVar.A.e();
        aVar.b("[realUpdateVideoPlayerState] wasPlaying:" + e);
        if (e) {
            aVar.A.f();
        }
        aVar.A.c();
    }

    public a(PageFragment pageFragment) {
        super(pageFragment);
        Object[] objArr = {pageFragment};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "189c725ec3a0c9050e40e6943db4d463", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "189c725ec3a0c9050e40e6943db4d463");
            return;
        }
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.L = false;
        this.M = false;
        this.D = (PromotionBgViewModel) q.a(this.s).a(PromotionBgViewModel.class);
    }

    @Override // com.sankuai.waimai.business.page.common.arch.a, com.meituan.android.cube.pga.block.a
    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9167840879511d6ae00c073fe526d8c", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9167840879511d6ae00c073fe526d8c");
        }
        this.F = viewGroup;
        this.E = (ViewGroup) viewGroup.findViewById(R.id.promotion_background_layout);
        HomeGrayManager.a().a(this.E, 4, 1, "", 0);
        this.x = (FrameLayout) this.E.findViewById(R.id.promotion_bg_part1);
        this.y = (ImageView) this.E.findViewById(R.id.promotion_part1_image);
        this.A = (MTVideoPlayerView) this.E.findViewById(R.id.promotion_part1_video);
        this.z = (ImageView) this.E.findViewById(R.id.promotion_bg_part2);
        this.w = this.E.findViewById(R.id.promotion_gray_layer);
        this.B = new HandlerC0772a();
        this.A.setLooping(true);
        this.A.setDisplayMode(5);
        this.A.a(0.0f, 0.0f);
        com.sankuai.waimai.foundation.core.a.e();
        this.A.setPlayStateCallback(new IPlayerStateCallback() { // from class: com.sankuai.waimai.business.page.home.head.promotion.a.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mtplayer.video.callback.IPlayerStateCallback
            public final void a(int i, int i2, int i3) {
            }

            @Override // com.meituan.android.mtplayer.video.callback.IPlayerStateCallback
            public final void a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b8a300033b25b6e06859a3160dcef9cc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b8a300033b25b6e06859a3160dcef9cc");
                } else if (i != 3) {
                    if (i == -1) {
                        a aVar = a.this;
                        aVar.b("onPlayStateChanged --- state:" + i);
                        a.this.A.setAlpha(0.0f);
                    }
                } else {
                    a aVar2 = a.this;
                    aVar2.b("onPlayStateChanged --- state:" + i);
                    if (a.this.A.getVisibility() == 0) {
                        a.this.y.setVisibility(8);
                    }
                    if (a.this.A.getAlpha() != 1.0f) {
                        a.this.A.setAlpha(1.0f);
                    }
                }
            }
        });
        a(this.s);
        return this.E;
    }

    @Override // com.sankuai.waimai.business.page.common.arch.a
    public final void a(PageFragment pageFragment) {
        Object[] objArr = {pageFragment};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af39eb504dfd98f7754b6a493468ff5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af39eb504dfd98f7754b6a493468ff5f");
            return;
        }
        this.D.o.a(this.s, new l<Integer>() { // from class: com.sankuai.waimai.business.page.home.head.promotion.a.2
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Integer num) {
                Integer num2 = num;
                Object[] objArr2 = {num2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a01ce5258253e4574597bfc3bea08f93", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a01ce5258253e4574597bfc3bea08f93");
                } else if (num2 == null || num2.intValue() == a.this.I) {
                } else {
                    a.this.I = num2.intValue();
                    a.this.R();
                    a aVar = a.this;
                    aVar.b("[getMajorBlokcTopDistance] mPromotionBgViewModel y: " + a.this.I + "  ，mPart1Height： " + a.this.G);
                }
            }
        });
        this.D.g.a(this.s, new l<List<com.meituan.android.cube.pga.block.a>>() { // from class: com.sankuai.waimai.business.page.home.head.promotion.a.3
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable List<com.meituan.android.cube.pga.block.a> list) {
                final List<com.meituan.android.cube.pga.block.a> list2 = list;
                Object[] objArr2 = {list2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "064d7426b30dd81682917dfa43c3e2e8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "064d7426b30dd81682917dfa43c3e2e8");
                    return;
                }
                a.this.b("[initViewModel] - [onChanged]");
                com.sankuai.meituan.mtimageloader.utils.c.a(a.this.F, new Runnable() { // from class: com.sankuai.waimai.business.page.home.head.promotion.a.3.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b73782fc542c142e50b423d72c006ede", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b73782fc542c142e50b423d72c006ede");
                            return;
                        }
                        try {
                            a.a(a.this, list2);
                        } catch (Exception e) {
                            i.d(new com.sankuai.waimai.business.page.common.log.a().a("promotion_bg_execption").b("promotion_handle_promotion").c(e.getMessage()).b());
                        }
                    }
                }, null);
            }
        });
        this.D.n = new l<h>() { // from class: com.sankuai.waimai.business.page.home.head.promotion.a.4
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable h hVar) {
                final h hVar2 = hVar;
                Object[] objArr2 = {hVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "11ec876006fec5e6f0436ac604a83adb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "11ec876006fec5e6f0436ac604a83adb");
                } else {
                    a.this.B.post(new Runnable() { // from class: com.sankuai.waimai.business.page.home.head.promotion.a.4.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2e964ae21aff9a6b22433c27489127bf", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2e964ae21aff9a6b22433c27489127bf");
                                return;
                            }
                            try {
                                a aVar = a.this;
                                aVar.b("[setNetResourceResponseCB]+ resource:" + hVar2.a());
                                a.a(a.this, hVar2);
                            } catch (Exception e) {
                                com.sankuai.waimai.foundation.utils.log.a.e("PromotionBgBlock", e.getMessage(), new Object[0]);
                                i.d(new com.sankuai.waimai.business.page.common.log.a().a("promotion_bg_execption").b("promotion_handle_network_update").c(e.getMessage()).b());
                            }
                        }
                    });
                }
            }
        };
        this.C = (HomePageViewModel) q.a(pageFragment).a(HomePageViewModel.class);
        this.C.i.a(pageFragment, new l<Integer>() { // from class: com.sankuai.waimai.business.page.home.head.promotion.a.5
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Integer num) {
                Integer num2 = num;
                Object[] objArr2 = {num2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1ffdba5908c1c6ed03f93c57b81585a8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1ffdba5908c1c6ed03f93c57b81585a8");
                } else {
                    a.this.E.scrollTo(0, num2.intValue());
                }
            }
        });
        this.C.f.a(new l<d.a>() { // from class: com.sankuai.waimai.business.page.home.head.promotion.a.6
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable d.a aVar) {
                d.a aVar2 = aVar;
                Object[] objArr2 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "86b33b217e442c7f3b55c08f386fd099", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "86b33b217e442c7f3b55c08f386fd099");
                } else if (aVar2 != null) {
                    switch (AnonymousClass8.a[aVar2.ordinal()]) {
                        case 1:
                            a.this.bc_();
                            return;
                        case 2:
                            a.this.aX_();
                            return;
                        default:
                            return;
                    }
                }
            }
        });
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.page.home.head.promotion.a$8  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass8 {
        public static final /* synthetic */ int[] a = new int[d.a.values().length];

        static {
            try {
                a[d.a.ON_PAUSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.a.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b311d5996ce9c320e1c0199c15b0a0c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b311d5996ce9c320e1c0199c15b0a0c1");
            return;
        }
        b("[calculateHomePromotionSize]]");
        this.G = (g.a(this.t) * 810) / 750;
        if (this.D.d()) {
            c(this.G);
        }
        this.L = b(this.G);
        this.D.a(this.s.getActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34caa70c8eb51e35fea7d551d71e5526", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34caa70c8eb51e35fea7d551d71e5526");
        } else if (this.w == null) {
        } else {
            int i = this.I + K;
            if (this.I > 0 && this.G > 0 && this.G > i) {
                ViewGroup.LayoutParams layoutParams = this.w.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = this.G - i;
                    this.w.setLayoutParams(layoutParams);
                }
                this.w.setVisibility(0);
                return;
            }
            this.w.setVisibility(8);
        }
    }

    private boolean b(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        VideoPlayerParam videoPlayerParam;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c05943d05f9f8786996255d8a626b84", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c05943d05f9f8786996255d8a626b84")).booleanValue();
        }
        b("[showHeaderBg] height：" + i);
        if (i < 0) {
            S();
            return false;
        }
        c.a().a(1001, "promotion/show", 0L);
        try {
            if (this.D.d()) {
                b("[showHeaderBg] - [hasBannerImageBg()]");
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = v;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "af83ee510c89c1ad6a373bec64b2664b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "af83ee510c89c1ad6a373bec64b2664b");
                } else {
                    b("[showPart1Image]");
                    this.A.setVisibility(8);
                    this.y.setVisibility(0);
                    this.y.setImageBitmap(this.J);
                    T();
                }
                z = true;
            } else {
                this.y.setVisibility(8);
                z = false;
            }
            boolean a = com.sankuai.waimai.irmo.utils.b.a().a(1005, "wm_homepage_promotion_video");
            PromotionBgViewModel promotionBgViewModel = this.D;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = PromotionBgViewModel.a;
            if (PatchProxy.isSupport(objArr3, promotionBgViewModel, changeQuickRedirect3, false, "14f4553ddfbb337bee25a5475aed518d", RobustBitConfig.DEFAULT_VALUE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, promotionBgViewModel, changeQuickRedirect3, false, "14f4553ddfbb337bee25a5475aed518d")).booleanValue();
            } else {
                z2 = !TextUtils.isEmpty(promotionBgViewModel.b.getBannerBottomVideoPath());
            }
            if (z2) {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = v;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8eaa4c44daf2bc9c63074a3cdcf8e309", RobustBitConfig.DEFAULT_VALUE)) {
                    z3 = ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8eaa4c44daf2bc9c63074a3cdcf8e309")).booleanValue();
                } else {
                    String str = Build.VERSION.RELEASE;
                    String str2 = Build.BRAND;
                    z3 = !TextUtils.isEmpty(str) && (str.equals("6.0") || str.equals("6.0.1")) && !TextUtils.isEmpty(str2) && str2.equalsIgnoreCase(RouteSelector.ROM_OPPO);
                }
                if (!z3 && !a) {
                    b("[showHeaderBg] - [hasBannerVideoBg()]");
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = v;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "9631b9c52521e9a612c2f6d8aa09804e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "9631b9c52521e9a612c2f6d8aa09804e");
                    } else {
                        b("[showPart1Video]");
                        this.y.setVisibility(8);
                        this.A.setVisibility(0);
                        T();
                        MTVideoPlayerView mTVideoPlayerView = this.A;
                        Object[] objArr6 = {mTVideoPlayerView};
                        ChangeQuickRedirect changeQuickRedirect6 = v;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "86560808265c66ca4ceb4d5ef5b82885", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "86560808265c66ca4ceb4d5ef5b82885");
                        } else {
                            Object[] objArr7 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect7 = v;
                            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "4a551de36a76baed1dd85125acf0b762", RobustBitConfig.DEFAULT_VALUE)) {
                                videoPlayerParam = (VideoPlayerParam) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "4a551de36a76baed1dd85125acf0b762");
                            } else {
                                String bannerBottomVideoPath = new ResourceHelper(this.t).getBannerBottomVideoPath();
                                b("getVideoPlayerParam filePath:" + bannerBottomVideoPath);
                                videoPlayerParam = TextUtils.isEmpty(bannerBottomVideoPath) ? null : new VideoPlayerParam(bannerBottomVideoPath);
                            }
                            String b = videoPlayerParam.b();
                            if (!TextUtils.isEmpty(b) && b.equals(this.N) && mTVideoPlayerView.e()) {
                                b("[setVideoUrl]  video url is same.");
                            } else {
                                mTVideoPlayerView.setDataSource(videoPlayerParam);
                                Object[] objArr8 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect8 = v;
                                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "7a2aad7e32b5d26cf883081787318d3d", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "7a2aad7e32b5d26cf883081787318d3d");
                                } else {
                                    this.B.removeMessages(0);
                                    this.B.sendEmptyMessageDelayed(0, 50L);
                                }
                                this.N = b;
                            }
                        }
                    }
                    z = true;
                }
            }
            if (!z) {
                b("[showHeaderBg] - [hidePromotionBg]");
                S();
                return false;
            }
            this.D.a(true);
            return true;
        } catch (Exception unused) {
            S();
            return false;
        }
    }

    private void S() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48e64347804029155940c7c728e55797", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48e64347804029155940c7c728e55797");
            return;
        }
        b("[hidePromotionBg]");
        this.y.setVisibility(8);
        this.A.setVisibility(8);
        this.D.a(false);
    }

    private void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6f258dcc4934825914f82bf8b1f6b96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6f258dcc4934825914f82bf8b1f6b96");
            return;
        }
        this.J = new ResourceHelper(this.t).getShowBitmapWithoutTime("banner_buttom_pic");
        this.G = a(this.J, i);
    }

    private int a(Bitmap bitmap, int i) {
        Object[] objArr = {bitmap, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cb4036bda25ce14f08d559220732835", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cb4036bda25ce14f08d559220732835")).intValue();
        }
        if (bitmap == null) {
            return i;
        }
        int height = (int) (bitmap.getHeight() * (g.a(this.t) / bitmap.getWidth()));
        b("[calculatePart1ImageHeight] height：" + height);
        return height;
    }

    private void T() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2dae360307ca756be977ba2c32b56e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2dae360307ca756be977ba2c32b56e5");
            return;
        }
        R();
        b("[setPart1Params] mPart1Height : " + this.G);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.x.getLayoutParams();
        layoutParams.height = this.G;
        this.x.setLayoutParams(layoutParams);
    }

    /* compiled from: ProGuard */
    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.sankuai.waimai.business.page.home.head.promotion.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class HandlerC0772a extends Handler {
        public static ChangeQuickRedirect a;

        private HandlerC0772a() {
            Object[] objArr = {a.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80afece8c4097b2f624d2234908d642b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80afece8c4097b2f624d2234908d642b");
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ff497ec10f7b0e64ff5b2f2a6f23511", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ff497ec10f7b0e64ff5b2f2a6f23511");
            } else if (message.what == 0) {
                a.k(a.this);
            }
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final void bE_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd246bcc88ad96fb2ae6dba782eda798", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd246bcc88ad96fb2ae6dba782eda798");
            return;
        }
        super.bE_();
        P();
    }

    public final void P() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5273f25f28bc10e43ba6d52386a22512", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5273f25f28bc10e43ba6d52386a22512");
            return;
        }
        b("[onDestroy]");
        if (this.A != null) {
            this.A.f();
            this.A.g();
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final void bc_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bfa3b99836565bc461781ad85a070aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bfa3b99836565bc461781ad85a070aa");
            return;
        }
        super.bc_();
        b("[onPause]");
        if (this.A.e()) {
            b("[onPause] video pause");
            this.A.d();
            this.O = true;
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final void aX_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acedd5bd10570ee8764fdd6a791c6baa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acedd5bd10570ee8764fdd6a791c6baa");
            return;
        }
        b("[onResume]");
        super.aX_();
        if (this.O) {
            b("[onResume] video start");
            this.A.c();
            this.O = false;
        }
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10ac832b789934aa4c30837f4642d490", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10ac832b789934aa4c30837f4642d490");
        } else {
            com.sankuai.waimai.foundation.utils.log.a.c("Promotion-TAG", str, new Object[0]);
        }
    }
}
