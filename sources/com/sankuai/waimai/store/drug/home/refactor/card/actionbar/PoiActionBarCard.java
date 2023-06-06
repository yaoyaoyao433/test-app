package com.sankuai.waimai.store.drug.home.refactor.card.actionbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.arch.lifecycle.f;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.d;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.k;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.assembler.component.BaseCard;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.drug.home.refactor.PoiPageViewModel;
import com.sankuai.waimai.store.drug.home.refactor.bean.PoiLocationAddress;
import com.sankuai.waimai.store.drug.home.refactor.bean.PoiResult;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.search.model.SearchCarouselText;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.widgets.lottie.e;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PoiActionBarCard extends BaseCard implements l<PoiResult>, com.sankuai.waimai.store.assembler.component.a, com.sankuai.waimai.store.drug.home.callback.a {
    public static ChangeQuickRedirect h;
    private ImageView i;
    private FrameLayout j;
    private com.sankuai.waimai.store.param.a k;
    private com.sankuai.waimai.store.drug.home.refactor.card.actionbar.a l;
    private boolean m;
    private int n;
    private boolean o;
    private String p;
    private String q;
    private int r;
    private int s;
    private PoiPageViewModel t;
    private String u;
    private boolean v;
    private a w;

    public static /* synthetic */ boolean a(PoiActionBarCard poiActionBarCard, boolean z) {
        poiActionBarCard.v = true;
        return true;
    }

    public PoiActionBarCard(f fVar, FragmentActivity fragmentActivity) {
        super(fVar, fragmentActivity);
        Object[] objArr = {fVar, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c9e54ad2b794ac8ea822d171111e1a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c9e54ad2b794ac8ea822d171111e1a9");
            return;
        }
        this.m = true;
        this.n = -1;
        this.p = "";
        this.q = "";
        this.r = -999;
        this.s = 0;
        this.v = false;
        this.w = new a();
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    @NonNull
    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31d5356d212f0aa3d881e3c7d73a2bbb", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31d5356d212f0aa3d881e3c7d73a2bbb") : LayoutInflater.from(this.e).inflate(R.layout.wm_drug_home_channel_refator_action_bar_card, viewGroup);
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    public final void a(View view) {
        com.sankuai.waimai.store.drug.home.refactor.card.actionbar.a cVar;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60a8ba9045cf739d2d7562d1784c418c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60a8ba9045cf739d2d7562d1784c418c");
            return;
        }
        super.a(view);
        this.i = (ImageView) a(R.id.iv_top_background_new);
        a(R.id.iv_top_background).setVisibility(8);
        u.a(this.i);
        this.i.setTag(Integer.valueOf(h.a(this.e, 105.0f)));
        this.j = (FrameLayout) a(R.id.fl_action_bar_container);
        this.t = (PoiPageViewModel) q.a(this.e).a(PoiPageViewModel.class);
        this.k = this.t.d.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e3156249cff0685d70c8f3030bfeea5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e3156249cff0685d70c8f3030bfeea5");
        } else if (this.l == null) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = h;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "75a06ff1a35d5294eef975d9463b6c57", RobustBitConfig.DEFAULT_VALUE)) {
                cVar = (com.sankuai.waimai.store.drug.home.refactor.card.actionbar.a) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "75a06ff1a35d5294eef975d9463b6c57");
            } else {
                if (this.l != null) {
                    this.l.onDestroy();
                }
                cVar = new c(this.e, this.k, this);
            }
            this.l = cVar;
            this.l.createAndReplaceView(this.j);
        }
        this.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.home.refactor.card.actionbar.PoiActionBarCard.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr4 = {view2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4c3766656324fd46d9391575470413f8", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4c3766656324fd46d9391575470413f8");
                }
            }
        });
        this.t.e.a(this.d, new l<Boolean>() { // from class: com.sankuai.waimai.store.drug.home.refactor.card.actionbar.PoiActionBarCard.2
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Boolean bool) {
                Object[] objArr4 = {bool};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "732ba05a6625fa5afe9682d942289354", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "732ba05a6625fa5afe9682d942289354");
                } else {
                    PoiActionBarCard.this.l.a(String.valueOf(PoiActionBarCard.this.k.c));
                }
            }
        });
        this.t.f.a(this.d, new l<PoiLocationAddress>() { // from class: com.sankuai.waimai.store.drug.home.refactor.card.actionbar.PoiActionBarCard.3
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable PoiLocationAddress poiLocationAddress) {
                PoiLocationAddress poiLocationAddress2 = poiLocationAddress;
                Object[] objArr4 = {poiLocationAddress2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4c0662cd6a8e5799ac15407a46719698", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4c0662cd6a8e5799ac15407a46719698");
                } else if (poiLocationAddress2 != null) {
                    PoiActionBarCard.this.l.b(poiLocationAddress2.address);
                }
            }
        });
        this.t.b.a(this.d, this);
        a(com.sankuai.waimai.store.drug.home.refactor.card.background.a.class, new l<com.sankuai.waimai.store.drug.home.refactor.card.background.a>() { // from class: com.sankuai.waimai.store.drug.home.refactor.card.actionbar.PoiActionBarCard.4
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable com.sankuai.waimai.store.drug.home.refactor.card.background.a aVar) {
                com.sankuai.waimai.store.drug.home.refactor.card.background.a aVar2 = aVar;
                Object[] objArr4 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c3163de40540c245602acab561ab654b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c3163de40540c245602acab561ab654b");
                } else if (aVar2 != null) {
                    PoiActionBarCard.this.a(PoiActionBarCard.this.t.b.a());
                }
            }
        });
        a(com.sankuai.waimai.store.drug.home.newp.block.rxevent.a.class, new l<com.sankuai.waimai.store.drug.home.newp.block.rxevent.a>() { // from class: com.sankuai.waimai.store.drug.home.refactor.card.actionbar.PoiActionBarCard.5
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable com.sankuai.waimai.store.drug.home.newp.block.rxevent.a aVar) {
                com.sankuai.waimai.store.drug.home.newp.block.rxevent.a aVar2 = aVar;
                Object[] objArr4 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "5a7c843c5bd7dba0903ea0ee9542e901", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "5a7c843c5bd7dba0903ea0ee9542e901");
                } else if (aVar2 == null || !(PoiActionBarCard.this.l instanceof b)) {
                } else {
                    ((b) PoiActionBarCard.this.l).a(aVar2.a);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85a2c81b9e255f60a12ba6de06e28b7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85a2c81b9e255f60a12ba6de06e28b7d");
        } else if (!t.a(this.w.b)) {
            b.C0608b b = m.b(this.w.b);
            b.b = this.e;
            b.a(this.i);
        } else {
            this.i.setBackground(new com.sankuai.waimai.store.drug.home.widget.a(new int[]{d.a(this.w.c, -7859), d.a(this.w.d, -15539)}, 0, true));
        }
    }

    @Override // android.arch.lifecycle.l
    public final void a(@Nullable PoiResult poiResult) {
        Object[] objArr = {poiResult};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9abb905b1dc6bc41df30b3c19873bd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9abb905b1dc6bc41df30b3c19873bd0");
        } else if (poiResult != null) {
            try {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = h;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8714055df6f787893f31c4178c165651", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8714055df6f787893f31c4178c165651");
                } else if (this.o) {
                    this.o = false;
                    this.l.a(String.valueOf(this.k.c));
                }
                PoiLocationAddress a2 = this.t.f.a();
                if (a2 != null) {
                    this.l.b(a2.address);
                }
                PoiVerticalityDataResponse poiVerticalityDataResponse = poiResult.response;
                Object[] objArr3 = {poiVerticalityDataResponse};
                ChangeQuickRedirect changeQuickRedirect3 = h;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bde73f7aa5d183388b7513aea03d34a8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bde73f7aa5d183388b7513aea03d34a8");
                } else if (poiVerticalityDataResponse.drugBackgroundConfig != null) {
                    this.w.a = poiVerticalityDataResponse.drugBackgroundConfig.backgroundJson;
                    this.w.b = poiVerticalityDataResponse.drugBackgroundConfig.backgroundPic;
                    this.w.c = poiVerticalityDataResponse.drugBackgroundConfig.headBgColorFrm;
                    this.w.d = poiVerticalityDataResponse.drugBackgroundConfig.headBgColorTo;
                    this.w.e = poiVerticalityDataResponse.drugBackgroundConfig.titleJson;
                    this.w.f = poiVerticalityDataResponse.drugBackgroundConfig.titleUrl;
                } else if (poiVerticalityDataResponse.backgroundConfig != null) {
                    this.w.b = poiVerticalityDataResponse.backgroundConfig.headBgImageUrl;
                    this.w.c = poiVerticalityDataResponse.backgroundConfig.headBgColorFrm;
                    this.w.d = poiVerticalityDataResponse.backgroundConfig.headBgColorTo;
                    this.w.e = poiVerticalityDataResponse.backgroundConfig.topCartonTitleUrl;
                }
                if (this.k.aa) {
                    this.m = true;
                    u.c(this.i);
                } else {
                    u.a(this.i);
                    if (t.a(this.w.a)) {
                        c();
                    } else {
                        Object[] objArr4 = {poiResult.response};
                        ChangeQuickRedirect changeQuickRedirect4 = h;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9bfac17431b05f6d10ef604f41f18f36", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9bfac17431b05f6d10ef604f41f18f36");
                        } else if (this.i instanceof LottieAnimationView) {
                            if (!this.v) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(this.w.a);
                                new com.sankuai.waimai.store.drug.widgets.lottie.a(this.e).a(arrayList, e().w(), new e() { // from class: com.sankuai.waimai.store.drug.home.refactor.card.actionbar.PoiActionBarCard.6
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.waimai.store.widgets.lottie.e
                                    public final void a(@Nullable Map<String, com.airbnb.lottie.e> map) {
                                        Object[] objArr5 = {map};
                                        ChangeQuickRedirect changeQuickRedirect5 = a;
                                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "d5c04ae813acca130f776b2723e267a0", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "d5c04ae813acca130f776b2723e267a0");
                                        } else if (map == null || map.get(PoiActionBarCard.this.w.a) == null) {
                                            PoiActionBarCard.this.c();
                                        } else {
                                            ((LottieAnimationView) PoiActionBarCard.this.i).setComposition(map.get(PoiActionBarCard.this.w.a));
                                            PoiActionBarCard.this.i.post(new Runnable() { // from class: com.sankuai.waimai.store.drug.home.refactor.card.actionbar.PoiActionBarCard.6.1
                                                public static ChangeQuickRedirect a;

                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    Object[] objArr6 = new Object[0];
                                                    ChangeQuickRedirect changeQuickRedirect6 = a;
                                                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "0db1610efc8491f2be897bdfec286b34", RobustBitConfig.DEFAULT_VALUE)) {
                                                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "0db1610efc8491f2be897bdfec286b34");
                                                    } else if (PoiActionBarCard.this.v) {
                                                    } else {
                                                        ((LottieAnimationView) PoiActionBarCard.this.i).a();
                                                        PoiActionBarCard.a(PoiActionBarCard.this, true);
                                                    }
                                                }
                                            });
                                            ((LottieAnimationView) PoiActionBarCard.this.i).a(new AnimatorListenerAdapter() { // from class: com.sankuai.waimai.store.drug.home.refactor.card.actionbar.PoiActionBarCard.6.2
                                                public static ChangeQuickRedirect a;

                                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                                public final void onAnimationEnd(Animator animator) {
                                                    Object[] objArr6 = {animator};
                                                    ChangeQuickRedirect changeQuickRedirect6 = a;
                                                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "0ab8607555e37437c0df1007b5f7e4b5", RobustBitConfig.DEFAULT_VALUE)) {
                                                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "0ab8607555e37437c0df1007b5f7e4b5");
                                                        return;
                                                    }
                                                    ((LottieAnimationView) PoiActionBarCard.this.i).clearAnimation();
                                                    ((LottieAnimationView) PoiActionBarCard.this.i).c();
                                                }
                                            });
                                        }
                                    }
                                });
                            }
                        } else {
                            c();
                        }
                    }
                    if (this.m) {
                        d();
                        this.m = false;
                    }
                }
                if (this.n <= 0) {
                    this.l.getView().post(new Runnable() { // from class: com.sankuai.waimai.store.drug.home.refactor.card.actionbar.PoiActionBarCard.7
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i;
                            View findViewById;
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "c3f55f9267fd5cc083fdf556e2f13933", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "c3f55f9267fd5cc083fdf556e2f13933");
                                return;
                            }
                            PoiActionBarCard poiActionBarCard = PoiActionBarCard.this;
                            com.sankuai.waimai.store.drug.home.refactor.card.actionbar.a aVar = PoiActionBarCard.this.l;
                            Object[] objArr6 = {Float.valueOf(0.5f)};
                            ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.store.drug.home.refactor.card.actionbar.a.a;
                            if (PatchProxy.isSupport(objArr6, aVar, changeQuickRedirect6, false, "13d629ea9727e02095416b764346538b", RobustBitConfig.DEFAULT_VALUE)) {
                                i = ((Integer) PatchProxy.accessDispatch(objArr6, aVar, changeQuickRedirect6, false, "13d629ea9727e02095416b764346538b")).intValue();
                            } else if (aVar.mView == null || (findViewById = aVar.mView.findViewById(R.id.animate_action_search_outer)) == null) {
                                i = -1;
                            } else {
                                int[] iArr = new int[2];
                                findViewById.getLocationInWindow(iArr);
                                i = (int) (iArr[1] + (findViewById.getHeight() * 0.5f));
                            }
                            poiActionBarCard.n = i;
                            PoiActionBarCard.this.d();
                        }
                    });
                }
                if (poiResult.response.drugBackgroundConfig != null) {
                    int i = poiResult.response.drugBackgroundConfig.statusBarColorRule;
                    Object[] objArr5 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect5 = h;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "3d95b3137197cb4439e7aafe3edfda24", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "3d95b3137197cb4439e7aafe3edfda24");
                    } else {
                        k.c(e(), i == 1);
                    }
                }
                this.l.a(poiResult.response);
                if (this.l instanceof c) {
                    final c cVar = (c) this.l;
                    final a aVar = this.w;
                    Object[] objArr6 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect6 = c.G;
                    if (PatchProxy.isSupport(objArr6, cVar, changeQuickRedirect6, false, "a9ed77c2ebd5bc70c6e9f90499ce5db9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, cVar, changeQuickRedirect6, false, "a9ed77c2ebd5bc70c6e9f90499ce5db9");
                    } else if (aVar != null) {
                        final String str = aVar.e;
                        if (t.a(str)) {
                            cVar.a(aVar);
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(str);
                            new com.sankuai.waimai.store.drug.widgets.lottie.a(cVar.a()).a(arrayList2, cVar.a().w(), new e() { // from class: com.sankuai.waimai.store.drug.home.refactor.card.actionbar.c.7
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.store.widgets.lottie.e
                                public final void a(@Nullable Map<String, com.airbnb.lottie.e> map) {
                                    Object[] objArr7 = {map};
                                    ChangeQuickRedirect changeQuickRedirect7 = a;
                                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "ef692a80c06e186c84c88d9276c4aff2", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "ef692a80c06e186c84c88d9276c4aff2");
                                    } else if (map == null || map.get(str) == null) {
                                        c.this.a(aVar);
                                    } else {
                                        u.c(c.this.j);
                                        u.c(c.this.l);
                                        u.a(c.this.H);
                                        c.this.H.setComposition(map.get(str));
                                        c.this.H.setRepeatCount(0);
                                        c.this.H.post(new Runnable() { // from class: com.sankuai.waimai.store.drug.home.refactor.card.actionbar.c.7.1
                                            public static ChangeQuickRedirect a;

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                Object[] objArr8 = new Object[0];
                                                ChangeQuickRedirect changeQuickRedirect8 = a;
                                                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "a2db625a8614ef6dfce9ba9fe509a4ee", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "a2db625a8614ef6dfce9ba9fe509a4ee");
                                                } else if (c.this.I) {
                                                } else {
                                                    c.this.I = true;
                                                    c.this.H.a();
                                                }
                                            }
                                        });
                                        c.this.H.a(new AnimatorListenerAdapter() { // from class: com.sankuai.waimai.store.drug.home.refactor.card.actionbar.c.7.2
                                            public static ChangeQuickRedirect a;

                                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                            public final void onAnimationEnd(Animator animator) {
                                                Object[] objArr8 = {animator};
                                                ChangeQuickRedirect changeQuickRedirect8 = a;
                                                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "d0f1fba9c9e89ee66e42ebd262e26bc7", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "d0f1fba9c9e89ee66e42ebd262e26bc7");
                                                    return;
                                                }
                                                c.this.H.clearAnimation();
                                                c.this.H.c();
                                            }
                                        });
                                    }
                                }
                            });
                        }
                    }
                }
                this.u = poiResult.response.schemaForSearch;
            } catch (Exception e) {
                com.sankuai.waimai.store.base.log.a.a(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a2976b157ef7e87d423a015237574e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a2976b157ef7e87d423a015237574e3");
        } else if (this.n > 0) {
            ViewGroup.LayoutParams layoutParams = this.i.getLayoutParams();
            layoutParams.height = this.n;
            this.i.setLayoutParams(layoutParams);
            this.i.setTag(Integer.valueOf(this.n));
        }
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1474fe522173fba24749fe180621df62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1474fe522173fba24749fe180621df62");
            return;
        }
        super.onResume();
        if (!TextUtils.isEmpty(this.k.T)) {
            this.l.a(String.valueOf(this.k.c));
        } else {
            this.o = true;
        }
    }

    private SCBaseActivity e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c42b619c2f5851e000137c3fd2f6c9c0", RobustBitConfig.DEFAULT_VALUE)) {
            return (SCBaseActivity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c42b619c2f5851e000137c3fd2f6c9c0");
        }
        if (this.e instanceof SCBaseActivity) {
            return (SCBaseActivity) this.e;
        }
        throw new RuntimeException("Activity of cube block must be SCBaseActivity!");
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5370166732e3e33162a9847a4e5c37ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5370166732e3e33162a9847a4e5c37ba");
            return;
        }
        super.onDestroy();
        if (this.l != null) {
            this.l.onDestroy();
        }
        if (this.i instanceof LottieAnimationView) {
            if (((LottieAnimationView) this.i).d()) {
                ((LottieAnimationView) this.i).f();
            }
            this.i.clearAnimation();
            ((LottieAnimationView) this.i).c();
        }
    }

    @Override // com.sankuai.waimai.store.drug.home.callback.a
    public final void bd_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4a948ed76d4c08c52ad6b1f3aaa86ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4a948ed76d4c08c52ad6b1f3aaa86ea");
        } else {
            b((PoiActionBarCard) new com.sankuai.waimai.store.drug.home.refactor.event.a());
        }
    }

    @Override // com.sankuai.waimai.store.drug.home.callback.a
    public final void a(SearchCarouselText searchCarouselText) {
        Object[] objArr = {searchCarouselText};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f46f468e3799f0141c3255647eb28bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f46f468e3799f0141c3255647eb28bb");
            return;
        }
        c(searchCarouselText);
        com.sankuai.waimai.store.manager.judas.b.a(this.k.G, "b_aZbuD").a("cat_id", Long.valueOf(this.k.c)).a("cate_id", Long.valueOf(this.k.c)).a("stid", this.k.T).a("keyword", this.p).a("label_word", this.q).a("word_type", Integer.valueOf(this.r)).a("index", Integer.valueOf(this.s)).a("if_med_poi", 0).a("has_word", Integer.valueOf(this.k.U)).a();
        if (com.sankuai.waimai.store.manager.user.a.a().b()) {
            FragmentActivity fragmentActivity = this.e;
            com.sankuai.waimai.store.param.a aVar = this.k;
            String str = this.u;
            Object[] objArr2 = {fragmentActivity, aVar, null, searchCarouselText, str};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.drug.util.d.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2cebcd1ed8de79c588378816492b70a0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2cebcd1ed8de79c588378816492b70a0");
                return;
            } else {
                com.sankuai.waimai.store.drug.util.d.a(fragmentActivity, aVar, null, searchCarouselText, false, str);
                return;
            }
        }
        com.sankuai.waimai.store.manager.user.a.a((Context) this.e);
    }

    @Override // com.sankuai.waimai.store.drug.home.callback.a
    public final void b(SearchCarouselText searchCarouselText) {
        Object[] objArr = {searchCarouselText};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d940e0f4018caade058a89e09a86fa76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d940e0f4018caade058a89e09a86fa76");
            return;
        }
        c(searchCarouselText);
        com.sankuai.waimai.store.manager.judas.b.b(this.k.G, "b_waimai_sg_agg2smzp_mv").a("cat_id", Long.valueOf(this.k.c)).a("cate_id", Long.valueOf(this.k.c)).a("stid", this.k.T).a("keyword", this.p).a("label_word", this.q).a("word_type", Integer.valueOf(this.r)).a("index", Integer.valueOf(this.s)).a("if_med_poi", 0).a();
    }

    private void c(SearchCarouselText searchCarouselText) {
        Object[] objArr = {searchCarouselText};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bb707dd06b0115af46ffeb767b13a54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bb707dd06b0115af46ffeb767b13a54");
        } else if (searchCarouselText != null) {
            this.p = !t.a(searchCarouselText.query) ? searchCarouselText.query : "";
            this.q = !t.a(searchCarouselText.text) ? searchCarouselText.text : "";
            this.r = searchCarouselText.type;
            this.s = searchCarouselText.index;
        }
    }

    @Override // com.sankuai.waimai.store.drug.home.callback.a
    public final void be_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ad2db8c0e2aa597999d8a3f620e8d7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ad2db8c0e2aa597999d8a3f620e8d7d");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9289ec0817757ff7f4c3f713464819bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9289ec0817757ff7f4c3f713464819bc");
        } else {
            com.sankuai.waimai.store.manager.judas.b.a(this.k.G, "b_waimai_a90lzwad_mc").a("cat_id", Long.valueOf(this.k.c)).a("media_type", "0").a();
        }
        if (!com.sankuai.waimai.store.manager.user.a.a().b()) {
            com.sankuai.waimai.store.manager.user.a.a((Context) this.e);
            return;
        }
        this.t.o = true;
        com.sankuai.waimai.store.router.d.a(this.e, com.sankuai.waimai.store.router.c.j);
    }

    @Override // com.sankuai.waimai.store.assembler.component.a
    public final void a(int i, int i2, boolean z, boolean z2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8aea73da9761bfe1f71ac8cf13400384", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8aea73da9761bfe1f71ac8cf13400384");
        } else {
            this.l.a(i, this.i, null);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a {
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;

        public a() {
        }
    }
}
