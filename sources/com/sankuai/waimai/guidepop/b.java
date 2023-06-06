package com.sankuai.waimai.guidepop;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.meituan.android.common.ui.utils.UIUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.guidepop.GuidePopInfo;
import com.sankuai.waimai.guidepop.widget.GuideFrameLayout;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements ViewTreeObserver.OnGlobalLayoutListener, GuideFrameLayout.a {
    public static ChangeQuickRedirect a;
    public a b;
    public View c;
    private FrameLayout d;
    private com.sankuai.waimai.guidepop.a e;
    private boolean f;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.guidepop.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0954b {
        void a(b bVar);

        void a(b bVar, boolean z);
    }

    public b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b188b609416ae55a91eb6ffeaf75120", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b188b609416ae55a91eb6ffeaf75120");
            return;
        }
        this.f = false;
        this.b = aVar;
        this.e = new com.sankuai.waimai.guidepop.a(this);
    }

    public final boolean a() {
        boolean z;
        boolean z2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d01d8e071a7f0e3b106dd7bb3875778", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d01d8e071a7f0e3b106dd7bb3875778")).booleanValue();
        }
        com.sankuai.waimai.guidepop.utils.b.a("[GuidePopDialog-show] show dialog.");
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cabac781189d3ef5b542456ceee7e809", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cabac781189d3ef5b542456ceee7e809")).booleanValue();
        } else {
            z = (this.e.g == null || this.e.g.getParent() == null) ? false : true;
        }
        if (z) {
            com.sankuai.waimai.guidepop.utils.b.a("[GuidePopDialog-show] Dialog is showing.");
            return true;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8b64151b6ada743443cf0f84edaf247f", RobustBitConfig.DEFAULT_VALUE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8b64151b6ada743443cf0f84edaf247f")).booleanValue();
        } else {
            z2 = (this.b == null || this.b.b == null || this.b.b.get() == null || this.b.d == null || TextUtils.isEmpty(this.b.d.locationFlag) || TextUtils.isEmpty(this.b.d.locationArea) || TextUtils.isEmpty(this.b.d.mainPic)) ? false : true;
        }
        if (!z2) {
            com.sankuai.waimai.guidepop.utils.b.a("[GuidePopDialog-show] 参数检查不通过");
            return false;
        }
        Activity activity = this.b.b.get();
        if (activity == null || activity.isDestroyed()) {
            com.sankuai.waimai.guidepop.utils.b.a("[GuidePopDialog-show] 页面销毁了，activity：" + activity);
            return false;
        }
        this.d = (FrameLayout) activity.getWindow().getDecorView();
        this.c = com.sankuai.waimai.guidepop.utils.c.a(this.d, this.b.d.locationArea, this.b.d.locationFlag);
        if (this.c == null) {
            com.sankuai.waimai.guidepop.utils.b.a("[GuidePopDialog-show] view 未找到");
            com.sankuai.waimai.guidepop.utils.b.a("GuidePopAnchorNoFind", Float.valueOf(1.0f), this.b.d.locationArea, this.b.d.locationFlag);
            return false;
        }
        FrameLayout frameLayout = this.d;
        Object[] objArr4 = {frameLayout, this};
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.guidepop.utils.c.a;
        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "8d917eff8fa8a0c436fd341c7b123846", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "8d917eff8fa8a0c436fd341c7b123846");
        } else {
            com.sankuai.waimai.guidepop.utils.c.a((View) frameLayout, (ViewTreeObserver.OnGlobalLayoutListener) this, true);
        }
        this.e.p = this.d;
        this.e.o = this.c;
        com.sankuai.waimai.guidepop.a aVar = this.e;
        Object[] objArr5 = {activity};
        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.guidepop.a.a;
        if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "683c036c16982b40c9dec9ee20cfa6f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "683c036c16982b40c9dec9ee20cfa6f1");
        } else {
            aVar.b = UIUtil.dip2px(activity, 130.0f);
            aVar.c = UIUtil.dip2px(activity, 80.0f);
            aVar.d = UIUtil.dip2px(activity, 49.0f);
            aVar.e = UIUtil.dip2px(activity, 12.0f);
            aVar.g = (GuideFrameLayout) LayoutInflater.from(activity).inflate(R.layout.wm_guide_pop_dialog_common_layout, (ViewGroup) null);
            aVar.n = (ImageView) aVar.g.findViewById(R.id.iv_guide_dialog_cursor);
            aVar.i = (FrameLayout) aVar.g.findViewById(R.id.fl_guide_dialog_pic_layout);
            aVar.j = (ImageView) aVar.g.findViewById(R.id.iv_guide_dialog_big_pic);
            aVar.k = (ImageView) aVar.g.findViewById(R.id.iv_guide_dialog_small_pic);
            aVar.h = (ImageView) aVar.g.findViewById(R.id.iv_guide_dialog_circle_out);
            aVar.l = (ImageView) aVar.g.findViewById(R.id.iv_guide_dialog_close);
            aVar.m = (ImageView) aVar.g.findViewById(R.id.iv_guide_dialog_arrow);
            aVar.g.setCustomOnClickListener(aVar.f);
            aVar.l.setOnClickListener(aVar);
            aVar.j.setOnClickListener(aVar);
            aVar.g.setBackgroundColor(-1291845632);
            aVar.g.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        final com.sankuai.waimai.guidepop.a aVar2 = this.e;
        GuidePopInfo.GuidePopData guidePopData = this.b.d;
        Object[] objArr6 = {activity, guidePopData};
        ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.guidepop.a.a;
        if (PatchProxy.isSupport(objArr6, aVar2, changeQuickRedirect6, false, "b90b5d5948e6ab5529e90c5827a29214", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, aVar2, changeQuickRedirect6, false, "b90b5d5948e6ab5529e90c5827a29214");
        } else {
            aVar2.t = guidePopData;
            Object[] objArr7 = {activity};
            ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.guidepop.a.a;
            if (PatchProxy.isSupport(objArr7, aVar2, changeQuickRedirect7, false, "9d25688bc73adf9fd597be79c48bfc92", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr7, aVar2, changeQuickRedirect7, false, "9d25688bc73adf9fd597be79c48bfc92");
            } else if (activity != null && aVar2.t != null) {
                com.sankuai.waimai.guidepop.utils.c.a(activity, aVar2.h, aVar2.t.circlePic, new b.c() { // from class: com.sankuai.waimai.guidepop.a.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mtimageloader.config.b.c
                    public final void a() {
                        Object[] objArr8 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect8 = a;
                        if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "5fc9ce4a6bf3b218fc56722be8183768", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "5fc9ce4a6bf3b218fc56722be8183768");
                            return;
                        }
                        a.a(aVar2, true);
                        aVar2.b();
                    }

                    @Override // com.sankuai.meituan.mtimageloader.config.b.c
                    public final void b() {
                        Object[] objArr8 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect8 = a;
                        if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "e236c8acaf2301f54c9efa32fbc662b2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "e236c8acaf2301f54c9efa32fbc662b2");
                        } else {
                            a.a(aVar2, true);
                        }
                    }
                });
                com.sankuai.waimai.guidepop.utils.c.a(activity, aVar2.k, aVar2.t.subPic);
                com.sankuai.waimai.guidepop.utils.c.a(activity, aVar2.l, "https://p1.meituan.net/travelcube/1b7d08b2d89367ce295ba7167c5e26a42509.png");
                com.sankuai.waimai.guidepop.utils.c.a(activity, aVar2.j, aVar2.t.mainPic, new b.c() { // from class: com.sankuai.waimai.guidepop.a.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mtimageloader.config.b.c
                    public final void a() {
                    }

                    @Override // com.sankuai.meituan.mtimageloader.config.b.c
                    public final void b() {
                        Object[] objArr8 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect8 = a;
                        if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "a1693c58d13e49610c52068d11f9d8d7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "a1693c58d13e49610c52068d11f9d8d7");
                            return;
                        }
                        com.sankuai.waimai.guidepop.utils.b.a("[ContentViewHolder-loadImage-onFail] pic:" + aVar2.t.mainPic);
                        if (aVar2.f != null) {
                            aVar2.f.e();
                        }
                    }
                });
                com.sankuai.waimai.guidepop.utils.c.a(activity, aVar2.m, "https://p0.meituan.net/travelcube/f1f8d5e77818d9bd522cab7df0f2da10824.png");
                com.sankuai.waimai.guidepop.utils.c.a(activity, aVar2.n, "https://p0.meituan.net/travelcube/3b13eb2af87f45b360b40cc1de4a6d1a35046.png");
            }
        }
        View childAt = this.d.getChildAt(this.d.getChildCount() - 1);
        if (childAt instanceof GuideFrameLayout) {
            this.d.removeView(childAt);
        }
        this.d.addView(this.e.g);
        this.e.a();
        Object[] objArr8 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect8 = a;
        if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "933c1d7befbec4d8cdefbb60ecc87891", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "933c1d7befbec4d8cdefbb60ecc87891");
        } else {
            GuideFrameLayout guideFrameLayout = this.e.g;
            guideFrameLayout.setFocusableInTouchMode(true);
            guideFrameLayout.requestFocus();
            guideFrameLayout.setOnKeyListener(new View.OnKeyListener() { // from class: com.sankuai.waimai.guidepop.b.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                    Object[] objArr9 = {view, Integer.valueOf(i), keyEvent};
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "65ece7c7c2b3b59b066fb7ca657e90f5", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "65ece7c7c2b3b59b066fb7ca657e90f5")).booleanValue();
                    }
                    if (i == 4) {
                        b.this.d();
                        return true;
                    }
                    return false;
                }
            });
        }
        this.f = false;
        return true;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2868f58a528dbec2c5eba7ef64dff68e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2868f58a528dbec2c5eba7ef64dff68e");
        } else {
            this.e.a();
        }
    }

    @Override // com.sankuai.waimai.guidepop.widget.GuideFrameLayout.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "682005a89039581dd69f8bb57413d982", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "682005a89039581dd69f8bb57413d982");
            return;
        }
        e();
        if (this.b.c != null) {
            this.b.c.a(this);
        }
    }

    @Override // com.sankuai.waimai.guidepop.widget.GuideFrameLayout.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bedd759a3b46c12bab7ef4b601b0844", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bedd759a3b46c12bab7ef4b601b0844");
        } else {
            d();
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c131336d184e54beec1de558b0c3a2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c131336d184e54beec1de558b0c3a2d");
        } else if (this.f) {
        } else {
            this.f = true;
            this.e.m.setVisibility(8);
            f();
            this.e.a(new AnimatorListenerAdapter() { // from class: com.sankuai.waimai.guidepop.b.2
                public static ChangeQuickRedirect a;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    Object[] objArr2 = {animator};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0e3196fedb261570ddd99837f304e730", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0e3196fedb261570ddd99837f304e730");
                        return;
                    }
                    b.this.g();
                    if (b.this.b.c != null) {
                        b.this.b.c.a(b.this, true);
                    }
                }
            });
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbf8cab80bb0b83db860d86b29734df9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbf8cab80bb0b83db860d86b29734df9");
            return;
        }
        com.sankuai.waimai.guidepop.utils.b.a("[closeDialogNow] mIsClosed:" + this.f);
        if (this.f) {
            return;
        }
        this.f = true;
        f();
        g();
        if (this.b.c != null) {
            this.b.c.a(this, false);
        }
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f75b8d85875b4735a37c5d183f263b2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f75b8d85875b4735a37c5d183f263b2a");
            return;
        }
        com.sankuai.waimai.guidepop.utils.b.a("[removeViewTreeObserver]");
        com.sankuai.waimai.guidepop.utils.c.a(this.d, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e9f2f438ea6f93cae77c571679fbaf1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e9f2f438ea6f93cae77c571679fbaf1");
        } else if (this.d == null || this.e.g == null) {
        } else {
            this.d.removeView(this.e.g);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public WeakReference<Activity> b;
        public InterfaceC0954b c;
        public GuidePopInfo.GuidePopData d;
        public GuidePopInfo e;

        public a(@NotNull Activity activity, @NotNull GuidePopInfo guidePopInfo) {
            Object[] objArr = {activity, guidePopInfo};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0d69928b643c29bd69a639cdf21cc7e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0d69928b643c29bd69a639cdf21cc7e");
                return;
            }
            this.b = new WeakReference<>(activity);
            this.e = guidePopInfo;
            this.d = guidePopInfo.viewData;
        }

        public final b a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "141094530367dc4e238bab43ff001320", RobustBitConfig.DEFAULT_VALUE)) {
                return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "141094530367dc4e238bab43ff001320");
            }
            com.sankuai.waimai.guidepop.utils.b.a("Builder:" + toString());
            return new b(this);
        }

        @NotNull
        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e36a6f5382fa332678c63acb1ced0e1", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e36a6f5382fa332678c63acb1ced0e1");
            }
            return "Builder{weakRef=" + this.b + ", listener=" + this.c + ", guidePopData=" + this.d + '}';
        }
    }
}
