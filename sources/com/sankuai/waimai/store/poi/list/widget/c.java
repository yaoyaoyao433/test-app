package com.sankuai.waimai.store.poi.list.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.meituan.mtimageloader.utils.BitmapTransformation;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.newwidgets.indicator.TabInfo;
import com.sankuai.waimai.store.util.ab;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.view.banner.roundview.UniversalImageView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public LottieAnimationView b;
    ImageView c;
    LottieAnimationView d;
    LottieAnimationView e;
    public LinearLayout f;
    a g;
    LinearLayout h;
    private com.sankuai.waimai.store.param.a i;
    private SCBaseActivity j;
    private boolean k;
    private String l;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(LottieAnimationView lottieAnimationView, TabInfo tabInfo);

        e d(String str);

        void e(int i);

        void m();
    }

    private int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3f3fb7adcd7f87e24133224f624bb46", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3f3fb7adcd7f87e24133224f624bb46")).intValue();
        }
        if (i == 0 || i < -1) {
            return 0;
        }
        if (i == -1) {
            return -1;
        }
        if (i > 0) {
            return i - 1;
        }
        return 0;
    }

    public static /* synthetic */ void a(c cVar, ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "99b44ba4db3eac41c9b5c6662993ff9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "99b44ba4db3eac41c9b5c6662993ff9a");
        } else if (cVar.h != null) {
            viewGroup.removeView(cVar.h);
        }
    }

    public c(com.sankuai.waimai.store.param.a aVar, String str, a aVar2, SCBaseActivity sCBaseActivity) {
        Object[] objArr = {aVar, str, aVar2, sCBaseActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f67aaab01015b855821e18355be2783", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f67aaab01015b855821e18355be2783");
            return;
        }
        this.d = null;
        this.e = null;
        this.k = false;
        this.l = str;
        this.i = aVar;
        this.g = aVar2;
        this.j = sCBaseActivity;
    }

    private void a(LottieAnimationView lottieAnimationView) {
        ViewGroup a2;
        int[] a3;
        Object[] objArr = {lottieAnimationView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b2941a136319234fffad85d422ebff7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b2941a136319234fffad85d422ebff7");
        } else if (this.j == null || (a2 = a(this.j)) == null || (a3 = a((View) lottieAnimationView)) == null || a3.length < 2) {
        } else {
            SCBaseActivity sCBaseActivity = this.j;
            Object[] objArr2 = {sCBaseActivity};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "952a3598a58b3b339930b503b8d5da00", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "952a3598a58b3b339930b503b8d5da00");
            } else {
                this.f = new LinearLayout(sCBaseActivity);
                this.f.setVisibility(8);
                this.f.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            SCBaseActivity sCBaseActivity2 = this.j;
            Object[] objArr3 = {sCBaseActivity2};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b3f1d78c6634245941fffeca9ff624e7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b3f1d78c6634245941fffeca9ff624e7");
            } else {
                this.d = new LottieAnimationView(sCBaseActivity2);
                this.d.setVisibility(8);
                this.d.setLayoutParams(new FrameLayout.LayoutParams(h.a(sCBaseActivity2, 60.0f), h.a(sCBaseActivity2, 45.0f)));
            }
            int[] iArr = {a3[0] + (lottieAnimationView.getMeasuredWidth() / 2), a3[1] + lottieAnimationView.getMeasuredHeight()};
            this.d.setTranslationX(iArr[0] - (h.a(this.j, 60.0f) / 2));
            this.d.setTranslationY(iArr[1] - h.a(this.j, 45.0f));
            a2.addView(this.f);
            a2.addView(this.d);
            this.k = true;
        }
    }

    private void a(final LottieAnimationView lottieAnimationView, final TabInfo tabInfo) {
        Object[] objArr = {lottieAnimationView, tabInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "997c36614b8c9e7f8f9571c6754955a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "997c36614b8c9e7f8f9571c6754955a5");
            return;
        }
        final ViewGroup a2 = a(this.j);
        if (a2 == null) {
            return;
        }
        TextView textView = (TextView) ((LinearLayout) lottieAnimationView.getParent()).findViewById(R.id.tv_text);
        int a3 = a(tabInfo.n);
        if (a3 == 0) {
            return;
        }
        this.d.setRepeatCount(a3);
        this.d.a(new AnimatorListenerAdapter() { // from class: com.sankuai.waimai.store.poi.list.widget.c.1
            public static ChangeQuickRedirect a;

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator, boolean z) {
                Object[] objArr2 = {animator, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "49d9c5b5f18b2cf801354c84e52869bc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "49d9c5b5f18b2cf801354c84e52869bc");
                    return;
                }
                lottieAnimationView.setVisibility(4);
                c.this.d.setVisibility(0);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                Object[] objArr2 = {animator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9045737cf32457d970aab346cc0682c8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9045737cf32457d970aab346cc0682c8");
                    return;
                }
                c.this.d.clearAnimation();
                a2.removeView(c.this.d);
                lottieAnimationView.setVisibility(0);
                tabInfo.D = false;
                c.this.g.m();
            }
        });
        e d = this.g.d(tabInfo.m);
        if (d == null) {
            return;
        }
        this.d.setComposition(d);
        this.d.a();
        this.d.setOnClickListener(new b(a2, lottieAnimationView, tabInfo));
        textView.setOnClickListener(new b(a2, lottieAnimationView, tabInfo));
        a(tabInfo, this.d, this.j, "b_waimai_sg_2an6x402_mv");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect a;
        public ViewGroup b;
        public LottieAnimationView c;
        public TabInfo d;

        public b(ViewGroup viewGroup, LottieAnimationView lottieAnimationView, TabInfo tabInfo) {
            Object[] objArr = {c.this, viewGroup, lottieAnimationView, tabInfo};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93d1d3bdcdd0d1bc3178932c379b0f23", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93d1d3bdcdd0d1bc3178932c379b0f23");
                return;
            }
            this.b = viewGroup;
            this.c = lottieAnimationView;
            this.d = tabInfo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91898a79ba5feebb58253a377b2d1cff", 4611686018427387906L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91898a79ba5feebb58253a377b2d1cff");
                return;
            }
            if (c.this.f != null) {
                this.b.removeView(c.this.f);
            }
            if (c.this.d != null) {
                c.this.d.e();
                c.this.d.clearAnimation();
                this.b.removeView(c.this.d);
            }
            this.c.setVisibility(0);
            this.d.D = false;
            c.this.g.a(this.c, this.d);
            c.this.g.e(1);
            c.this.a(this.d, "b_waimai_sg_2an6x402_mc");
        }
    }

    public final void a(TabInfo tabInfo) {
        Object[] objArr = {tabInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9641c3b80f5bdc6935836541425694d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9641c3b80f5bdc6935836541425694d");
        } else if (tabInfo == null || !b(tabInfo) || this.b == null) {
        } else {
            if (!this.k) {
                a(this.b);
            }
            if (tabInfo.l) {
                a(this.b, tabInfo);
            }
            if ((!tabInfo.r && !tabInfo.s) || tabInfo.l || tabInfo.o || a(this.j, tabInfo.z)) {
                return;
            }
            b(this.j, tabInfo);
        }
    }

    private static boolean b(TabInfo tabInfo) {
        return tabInfo != null && tabInfo.c == 4;
    }

    private void b(final SCBaseActivity sCBaseActivity, final TabInfo tabInfo) {
        final ViewGroup a2;
        e d;
        Object[] objArr = {sCBaseActivity, tabInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6597bbd3d69a73ba35bb50241d8ae58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6597bbd3d69a73ba35bb50241d8ae58");
        } else if (p.a(sCBaseActivity, tabInfo) || (a2 = a(this.j)) == null) {
        } else {
            int[] iArr = {h.a(this.j, 40.0f), h.a(sCBaseActivity, 40.0f)};
            LinearLayout linearLayout = (LinearLayout) this.b.getParent();
            int[] a3 = a((View) linearLayout);
            if (a3 == null || a3.length < 2) {
                return;
            }
            int[] iArr2 = {a3[0] + (linearLayout.getMeasuredWidth() / 2), a3[1] + (linearLayout.getMeasuredHeight() / 2)};
            a(false);
            if (tabInfo.v == 1) {
                this.e = a(iArr2, iArr, sCBaseActivity);
                if (this.e == null || (d = this.g.d(tabInfo.m)) == null) {
                    return;
                }
                this.e.setComposition(d);
                int a4 = a(tabInfo.w);
                if (a4 == 0) {
                    return;
                }
                this.e.setRepeatCount(a4);
                this.e.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.poi.list.widget.c.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "57dcf530c8c023291555d5bac6802310", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "57dcf530c8c023291555d5bac6802310");
                            return;
                        }
                        c.a(c.this, a2);
                        c.this.a(a2);
                        c.this.a(true);
                        tabInfo.D = false;
                        c.this.a(sCBaseActivity, tabInfo);
                        ab.b().a(sCBaseActivity, "sceneActivityConfigID", tabInfo.z);
                        c.this.a(tabInfo, "b_waimai_sg_nirjitq1_mc");
                    }
                });
                this.e.a(new AnimatorListenerAdapter() { // from class: com.sankuai.waimai.store.poi.list.widget.c.3
                    public static ChangeQuickRedirect a;

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        Object[] objArr2 = {animator};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "96e95b3bce0dcc766857b9deb653b30c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "96e95b3bce0dcc766857b9deb653b30c");
                            return;
                        }
                        c.this.a(a2);
                        c.this.a(true);
                        tabInfo.D = false;
                        c.this.g.m();
                    }
                });
                this.e.a();
                a2.addView(this.e);
                a(sCBaseActivity, this.e, tabInfo, a2);
                a(tabInfo, this.e, sCBaseActivity, "b_waimai_sg_nirjitq1_mv");
                return;
            }
            this.c = b(iArr2, iArr, sCBaseActivity);
            if (this.c == null) {
                return;
            }
            b.C0608b b2 = m.b(tabInfo.u, ImageQualityUtil.a());
            b2.j = tabInfo.C;
            b2.a(new BitmapTransformation[0]).a(this.c);
            this.c.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.poi.list.widget.c.4
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "32676124ae823579de61af18ba79685a", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "32676124ae823579de61af18ba79685a");
                        return;
                    }
                    c.a(c.this, a2);
                    a2.removeView(c.this.c);
                    tabInfo.D = false;
                    c.this.a(true);
                    c.this.a(sCBaseActivity, tabInfo);
                    c.this.a(tabInfo, "b_waimai_sg_nirjitq1_mc");
                    ab.b().a(sCBaseActivity, "sceneActivityConfigID", tabInfo.z);
                }
            });
            a2.addView(this.c);
            a(sCBaseActivity, this.c, tabInfo, a2);
            a(tabInfo, this.c, sCBaseActivity, "b_waimai_sg_nirjitq1_mv");
        }
    }

    private LottieAnimationView a(int[] iArr, int[] iArr2, SCBaseActivity sCBaseActivity) {
        Object[] objArr = {iArr, iArr2, sCBaseActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32c4fedf27581fe0f8ec9f0f6884e5b2", RobustBitConfig.DEFAULT_VALUE)) {
            return (LottieAnimationView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32c4fedf27581fe0f8ec9f0f6884e5b2");
        }
        if (sCBaseActivity == null) {
            return null;
        }
        LottieAnimationView lottieAnimationView = new LottieAnimationView(sCBaseActivity);
        lottieAnimationView.setLayoutParams(new ViewGroup.LayoutParams(iArr2[0], iArr2[1]));
        lottieAnimationView.setTranslationX(iArr[0] - (iArr2[0] / 2));
        lottieAnimationView.setTranslationY(iArr[1] - (iArr2[1] / 2));
        return lottieAnimationView;
    }

    private UniversalImageView b(int[] iArr, int[] iArr2, SCBaseActivity sCBaseActivity) {
        Object[] objArr = {iArr, iArr2, sCBaseActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0462f826fc3a73f62a6f950dfe211c75", RobustBitConfig.DEFAULT_VALUE)) {
            return (UniversalImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0462f826fc3a73f62a6f950dfe211c75");
        }
        if (sCBaseActivity == null) {
            return null;
        }
        UniversalImageView universalImageView = new UniversalImageView(sCBaseActivity);
        universalImageView.setCornerRadius(iArr2[0] / 2);
        universalImageView.setLayoutParams(new ViewGroup.LayoutParams(iArr2[0], iArr2[1]));
        universalImageView.setTranslationX(iArr[0] - (iArr2[0] / 2));
        universalImageView.setTranslationY(iArr[1] - (iArr2[1] / 2));
        return universalImageView;
    }

    private void a(@NonNull final SCBaseActivity sCBaseActivity, @NonNull View view, @NonNull final TabInfo tabInfo, @NonNull final ViewGroup viewGroup) {
        Object[] objArr = {sCBaseActivity, view, tabInfo, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01853967a8b53592299140fa6298a159", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01853967a8b53592299140fa6298a159");
            return;
        }
        this.h = (LinearLayout) LayoutInflater.from(sCBaseActivity).inflate(R.layout.wm_sc_home_tab_pop_bubble_of_text, viewGroup, false);
        u.a((TextView) this.h.findViewById(R.id.bubble_text), tabInfo.t);
        int[] a2 = a(view);
        this.h.measure(-2, -2);
        this.h.setTranslationX((a2[0] - h.a(sCBaseActivity, 36.0f)) + (h.a(sCBaseActivity, 20.0f) / 2));
        this.h.setTranslationY((a2[1] - this.h.getMeasuredHeight()) + h.a(sCBaseActivity, 3.0f));
        this.h.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.poi.list.widget.c.5
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d5c41cda5e3f27d6fdecd3f94f828589", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d5c41cda5e3f27d6fdecd3f94f828589");
                    return;
                }
                c cVar = c.this;
                SCBaseActivity sCBaseActivity2 = sCBaseActivity;
                TabInfo tabInfo2 = tabInfo;
                ViewGroup viewGroup2 = viewGroup;
                Object[] objArr3 = {sCBaseActivity2, tabInfo2, viewGroup2};
                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "aac9a79f36d190fa498342a5e79e67de", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "aac9a79f36d190fa498342a5e79e67de");
                    return;
                }
                if (cVar.h != null) {
                    viewGroup2.removeView(cVar.h);
                }
                if (cVar.e != null) {
                    cVar.a(viewGroup2);
                    viewGroup2.removeView(cVar.e);
                    cVar.a(true);
                    cVar.a(sCBaseActivity2, tabInfo2);
                } else if (cVar.c != null) {
                    viewGroup2.removeView(cVar.c);
                    cVar.a(true);
                    cVar.a(sCBaseActivity2, tabInfo2);
                }
                ab.b().a(sCBaseActivity2, "sceneActivityConfigID", tabInfo2.z);
                cVar.a(tabInfo2, "b_waimai_sg_jg78tfkm_mc");
            }
        });
        al.a(new Runnable() { // from class: com.sankuai.waimai.store.poi.list.widget.c.6
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a255df6aecfd2806e0d4a8ac4477f930", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a255df6aecfd2806e0d4a8ac4477f930");
                } else if (c.this.h != null) {
                    c.a(c.this, viewGroup);
                }
            }
        }, tabInfo.w * 1000, this.l);
        viewGroup.addView(this.h);
        a(tabInfo, this.h, sCBaseActivity, "b_waimai_sg_jg78tfkm_mv");
    }

    void a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01a61b63cf721b803202f208de3d332c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01a61b63cf721b803202f208de3d332c");
        } else if (this.e == null) {
        } else {
            this.e.e();
            this.e.clearAnimation();
            viewGroup.removeView(this.e);
        }
    }

    void a(SCBaseActivity sCBaseActivity, TabInfo tabInfo) {
        Object[] objArr = {sCBaseActivity, tabInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebbe068a86c3b8831c08524729619176", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebbe068a86c3b8831c08524729619176");
        } else if (p.a(sCBaseActivity, tabInfo)) {
        } else {
            this.g.a(this.b, tabInfo);
            this.g.e(1);
        }
    }

    void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d61fc2ebd146d1609bb33b1eec50e9c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d61fc2ebd146d1609bb33b1eec50e9c8");
        } else if (z) {
            this.b.setVisibility(0);
            ((TextView) ((LinearLayout) this.b.getParent()).findViewById(R.id.tv_text)).setVisibility(0);
        } else {
            this.b.setVisibility(4);
            ((TextView) ((LinearLayout) this.b.getParent()).findViewById(R.id.tv_text)).setVisibility(4);
        }
    }

    public static ViewGroup a(@NonNull SCBaseActivity sCBaseActivity) {
        Object[] objArr = {sCBaseActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "205c3cdc32f5f37e54f7523af51d292d", RobustBitConfig.DEFAULT_VALUE) ? (ViewGroup) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "205c3cdc32f5f37e54f7523af51d292d") : (ViewGroup) sCBaseActivity.f();
    }

    private int[] a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57e38dc02d48a2a47b8539d3642fb043", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57e38dc02d48a2a47b8539d3642fb043");
        }
        if (view == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    private void a(TabInfo tabInfo, View view, SCBaseActivity sCBaseActivity, String str) {
        Object[] objArr = {tabInfo, view, sCBaseActivity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fed592904f2574872bcbbd236d4e5bcc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fed592904f2574872bcbbd236d4e5bcc");
        } else if (tabInfo == null || view == null) {
        } else {
            com.sankuai.waimai.store.expose.v2.entity.b bVar = new com.sankuai.waimai.store.expose.v2.entity.b(str, view) { // from class: com.sankuai.waimai.store.poi.list.widget.c.7
                @Override // com.sankuai.waimai.store.expose.v2.entity.b
                public final String a() {
                    return null;
                }
            };
            bVar.a("tab_code", Integer.valueOf(tabInfo.c));
            bVar.a("tab_name", tabInfo.d);
            bVar.a("stid", this.i.T);
            if (view.getContext() instanceof com.sankuai.waimai.store.expose.v2.a) {
                com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) view.getContext(), bVar);
            }
        }
    }

    void a(TabInfo tabInfo, String str) {
        Object[] objArr = {tabInfo, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15c1019d485ecbfc974f3be31b7e7726", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15c1019d485ecbfc974f3be31b7e7726");
        } else if (tabInfo == null) {
        } else {
            com.sankuai.waimai.store.manager.judas.b.a(this.i.G, str).a("tab_code", Integer.valueOf(tabInfo.c)).a("tab_name", tabInfo.d).a("stid", this.i.T).a();
        }
    }

    public static boolean a(@Nullable Context context, @Nullable String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "58aebc3d1b3945924eb09619662ba134", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "58aebc3d1b3945924eb09619662ba134")).booleanValue();
        }
        if (context != null) {
            return TextUtils.equals(ab.b().b(context, "sceneActivityConfigID", ""), str);
        }
        return false;
    }
}
