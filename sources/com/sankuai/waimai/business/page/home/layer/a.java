package com.sankuai.waimai.business.page.home.layer;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.arch.lifecycle.d;
import android.arch.lifecycle.q;
import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.arch.PageFragment;
import com.sankuai.waimai.business.page.common.view.listfloat.IntelligentEntranceBlock;
import com.sankuai.waimai.business.page.common.view.listfloat.c;
import com.sankuai.waimai.business.page.common.view.listfloat.d;
import com.sankuai.waimai.business.page.common.view.listfloat.f;
import com.sankuai.waimai.business.page.common.view.listfloat.g;
import com.sankuai.waimai.business.page.home.HomePageViewModel;
import com.sankuai.waimai.business.page.home.actionbar.HomeActionBarViewModel;
import com.sankuai.waimai.business.page.home.list.poi.HomePoiViewModel;
import com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager;
import com.sankuai.waimai.platform.shop.channellabel.ChannelLabelController;
import com.sankuai.waimai.router.method.Func0;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public final Activity b;
    public PageFragment c;
    public final HomePageViewModel d;
    public HomeActionBarViewModel e;
    public HomePoiViewModel f;
    public com.sankuai.waimai.business.page.home.layer.fault.a g;
    @Nullable
    public c h;
    public g i;
    public d j;
    public IntelligentEntranceBlock k;
    public View l;
    public View m;
    public boolean n;
    public com.sankuai.waimai.business.page.home.expose.b o;
    public boolean p;
    public com.sankuai.waimai.business.page.home.head.market.a q;
    public com.sankuai.waimai.business.page.home.interfacer.b r;
    public com.sankuai.waimai.platform.domain.core.channel.a s;
    public ViewStub t;
    public ChannelLabelController u;
    @Nullable
    private final Func0<Object> v;

    public a(PageFragment pageFragment, HomePageViewModel homePageViewModel) {
        Object[] objArr = {pageFragment, homePageViewModel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57870b3eb97b2697fe886e5f15741933", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57870b3eb97b2697fe886e5f15741933");
            return;
        }
        this.m = null;
        this.n = true;
        this.v = (Func0) com.sankuai.waimai.router.a.a(Func0.class, "splash_ad_clicked_status");
        this.r = new com.sankuai.waimai.business.page.home.interfacer.b() { // from class: com.sankuai.waimai.business.page.home.layer.a.6
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.page.home.interfacer.b
            public final void b(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "19fc766f6198855aa480d0f0deb6f85f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "19fc766f6198855aa480d0f0deb6f85f");
                    return;
                }
                if (i == 1) {
                    a.this.e.c = true;
                }
                if (i == 0) {
                    if (a.this.h != null) {
                        a.this.h.c();
                    }
                    if (a.this.k != null) {
                        IntelligentEntranceBlock intelligentEntranceBlock = a.this.k;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = IntelligentEntranceBlock.a;
                        if (PatchProxy.isSupport(objArr3, intelligentEntranceBlock, changeQuickRedirect3, false, "57b06e69d4a1e474879b98e3569601d3", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, intelligentEntranceBlock, changeQuickRedirect3, false, "57b06e69d4a1e474879b98e3569601d3");
                        } else {
                            intelligentEntranceBlock.g.b();
                        }
                    }
                    if (a.this.q != null) {
                        a.this.q.Q();
                    }
                    if (a.this.i != null) {
                        g gVar = a.this.i;
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.page.common.view.listfloat.b.a;
                        if (PatchProxy.isSupport(objArr4, gVar, changeQuickRedirect4, false, "760578a3a620b3d473e3619af1d12579", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, gVar, changeQuickRedirect4, false, "760578a3a620b3d473e3619af1d12579");
                            return;
                        }
                        f fVar = gVar.e;
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = f.a;
                        if (PatchProxy.isSupport(objArr5, fVar, changeQuickRedirect5, false, "80d562d1bf931a43561e823d9f5dacbe", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, fVar, changeQuickRedirect5, false, "80d562d1bf931a43561e823d9f5dacbe");
                        } else if (fVar.f != null) {
                            fVar.f.postDelayed(fVar.g, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
                        }
                    }
                } else if (i == 1) {
                    if (a.this.h != null) {
                        a.this.h.b();
                    }
                    if (a.this.k != null) {
                        IntelligentEntranceBlock intelligentEntranceBlock2 = a.this.k;
                        Object[] objArr6 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect6 = IntelligentEntranceBlock.a;
                        if (PatchProxy.isSupport(objArr6, intelligentEntranceBlock2, changeQuickRedirect6, false, "d9327fcf0230e9708e6ec8dbc6688389", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, intelligentEntranceBlock2, changeQuickRedirect6, false, "d9327fcf0230e9708e6ec8dbc6688389");
                        } else {
                            intelligentEntranceBlock2.g.a();
                        }
                    }
                    if (a.this.q != null) {
                        a.this.q.P();
                    }
                    if (a.this.i != null) {
                        g gVar2 = a.this.i;
                        Object[] objArr7 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.business.page.common.view.listfloat.b.a;
                        if (PatchProxy.isSupport(objArr7, gVar2, changeQuickRedirect7, false, "b980a364eb04c8c3fdb4089bc38b4db4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, gVar2, changeQuickRedirect7, false, "b980a364eb04c8c3fdb4089bc38b4db4");
                        } else {
                            f fVar2 = gVar2.e;
                            Object[] objArr8 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect8 = f.a;
                            if (PatchProxy.isSupport(objArr8, fVar2, changeQuickRedirect8, false, "3f1b8b78f8f7d1d55acbf30988f9e0b4", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr8, fVar2, changeQuickRedirect8, false, "3f1b8b78f8f7d1d55acbf30988f9e0b4");
                            } else if (fVar2.b != null && fVar2.d != null && !fVar2.b.isFinishing()) {
                                if (fVar2.f != null) {
                                    fVar2.f.removeCallbacks(fVar2.g);
                                }
                                if (!fVar2.c) {
                                    fVar2.d.animate().translationX(fVar2.e).alpha(0.5f).start();
                                    fVar2.c = true;
                                }
                            }
                        }
                    }
                    boolean b = com.sankuai.waimai.platform.capacity.persistent.sp.a.b((Context) a.this.b, "global_shop_cart_multi_order_show", false);
                    if (a.this.j == null || b || !a.this.p) {
                        return;
                    }
                    final d dVar = a.this.j;
                    Object[] objArr9 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect9 = d.a;
                    if (PatchProxy.isSupport(objArr9, dVar, changeQuickRedirect9, false, "878fb954b9de0138bade57ef21b1f468", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr9, dVar, changeQuickRedirect9, false, "878fb954b9de0138bade57ef21b1f468");
                        return;
                    }
                    if ((GlobalCartManager.getInstance().getGlobalCartPoiIds() >= 2) && com.sankuai.waimai.platform.capacity.abtest.c.a()) {
                        dVar.e.setVisibility(8);
                        dVar.d.setVisibility(0);
                        com.sankuai.waimai.platform.capacity.persistent.sp.a.a((Context) dVar.c, "global_shop_cart_multi_order_show", true);
                        final TextView textView = dVar.f;
                        Object[] objArr10 = {textView, 400L};
                        ChangeQuickRedirect changeQuickRedirect10 = d.a;
                        if (PatchProxy.isSupport(objArr10, dVar, changeQuickRedirect10, false, "0b14647fdaf9f2cfafcf319ad635aa5b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr10, dVar, changeQuickRedirect10, false, "0b14647fdaf9f2cfafcf319ad635aa5b");
                            return;
                        } else if (textView != null) {
                            ValueAnimator ofInt = ValueAnimator.ofInt(0, dVar.a(textView));
                            ofInt.setDuration(400L);
                            ofInt.addListener(new Animator.AnimatorListener() { // from class: com.sankuai.waimai.business.page.common.view.listfloat.d.1
                                public static ChangeQuickRedirect a;

                                @Override // android.animation.Animator.AnimatorListener
                                public final void onAnimationCancel(Animator animator) {
                                }

                                @Override // android.animation.Animator.AnimatorListener
                                public final void onAnimationRepeat(Animator animator) {
                                }

                                @Override // android.animation.Animator.AnimatorListener
                                public final void onAnimationStart(Animator animator) {
                                    Object[] objArr11 = {animator};
                                    ChangeQuickRedirect changeQuickRedirect11 = a;
                                    if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "8c674fcb136fb4b9fd4cd095867d7674", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "8c674fcb136fb4b9fd4cd095867d7674");
                                    } else {
                                        textView.setVisibility(0);
                                    }
                                }

                                @Override // android.animation.Animator.AnimatorListener
                                public final void onAnimationEnd(Animator animator) {
                                    Object[] objArr11 = {animator};
                                    ChangeQuickRedirect changeQuickRedirect11 = a;
                                    if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "7e2236ef19566b7b904ea0356e56ab38", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "7e2236ef19566b7b904ea0356e56ab38");
                                    } else {
                                        dVar.f.postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.page.common.view.listfloat.d.1.1
                                            public static ChangeQuickRedirect a;

                                            {
                                                AnonymousClass1.this = this;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                Object[] objArr12 = new Object[0];
                                                ChangeQuickRedirect changeQuickRedirect12 = a;
                                                if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "d8cdde73dd972b318a759acc3f159fa8", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "d8cdde73dd972b318a759acc3f159fa8");
                                                    return;
                                                }
                                                final d dVar2 = dVar;
                                                TextView textView2 = dVar.f;
                                                Object[] objArr13 = {textView2, new Long(400L)};
                                                ChangeQuickRedirect changeQuickRedirect13 = d.a;
                                                if (PatchProxy.isSupport(objArr13, dVar2, changeQuickRedirect13, false, "4a0a6a5c30342dd0ed0afca672beeb9e", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr13, dVar2, changeQuickRedirect13, false, "4a0a6a5c30342dd0ed0afca672beeb9e");
                                                } else if (textView2 != null) {
                                                    ValueAnimator ofInt2 = ValueAnimator.ofInt(dVar2.a(textView2), 0);
                                                    ofInt2.setDuration(400L);
                                                    ofInt2.addListener(new Animator.AnimatorListener() { // from class: com.sankuai.waimai.business.page.common.view.listfloat.d.2
                                                        public static ChangeQuickRedirect a;

                                                        @Override // android.animation.Animator.AnimatorListener
                                                        public final void onAnimationCancel(Animator animator2) {
                                                        }

                                                        @Override // android.animation.Animator.AnimatorListener
                                                        public final void onAnimationRepeat(Animator animator2) {
                                                        }

                                                        @Override // android.animation.Animator.AnimatorListener
                                                        public final void onAnimationStart(Animator animator2) {
                                                        }

                                                        @Override // android.animation.Animator.AnimatorListener
                                                        public final void onAnimationEnd(Animator animator2) {
                                                            Object[] objArr14 = {animator2};
                                                            ChangeQuickRedirect changeQuickRedirect14 = a;
                                                            if (PatchProxy.isSupport(objArr14, this, changeQuickRedirect14, false, "fa7f672e7adf7ff2984127d92477f03f", RobustBitConfig.DEFAULT_VALUE)) {
                                                                PatchProxy.accessDispatch(objArr14, this, changeQuickRedirect14, false, "fa7f672e7adf7ff2984127d92477f03f");
                                                                return;
                                                            }
                                                            dVar2.d.setVisibility(8);
                                                            dVar2.e.setVisibility(0);
                                                        }
                                                    });
                                                    ofInt2.addUpdateListener(new a(textView2));
                                                    ofInt2.start();
                                                }
                                            }
                                        }, 2100L);
                                    }
                                }
                            });
                            ofInt.addUpdateListener(new d.a(textView));
                            ofInt.start();
                            return;
                        } else {
                            return;
                        }
                    }
                    dVar.d.setVisibility(8);
                    dVar.e.setVisibility(0);
                }
            }
        };
        this.b = pageFragment.F;
        this.c = pageFragment;
        this.d = homePageViewModel;
        this.e = (HomeActionBarViewModel) q.a(this.c).a(HomeActionBarViewModel.class);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.page.home.layer.a$9  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass9 {
        public static final /* synthetic */ int[] a = new int[d.a.values().length];

        static {
            try {
                a[d.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[d.a.ON_STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[d.a.ON_DESTROY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[d.a.ON_ANY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b03d5b388c523ed90a6cf0bed7bc9bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b03d5b388c523ed90a6cf0bed7bc9bd");
        } else {
            b(z);
        }
    }

    private void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4452d588bb8373e103fe9a998c738a9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4452d588bb8373e103fe9a998c738a9e");
        } else if (this.l == null) {
        } else {
            if (z) {
                this.l.setVisibility(0);
            } else {
                this.l.setVisibility(8);
            }
            if (!com.sankuai.waimai.foundation.core.a.d() || this.d == null) {
                return;
            }
            this.d.j(z);
        }
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b72af440dd910a4d0771fbdea98a9377", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b72af440dd910a4d0771fbdea98a9377");
        } else if (this.u != null) {
            this.u.a(this.s, 0);
        }
    }

    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2383a92a8636a555c3d1ffdc0f33e183", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2383a92a8636a555c3d1ffdc0f33e183")).intValue() : this.e.c();
    }
}
