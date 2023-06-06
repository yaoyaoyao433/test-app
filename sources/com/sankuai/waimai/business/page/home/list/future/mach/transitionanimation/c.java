package com.sankuai.waimai.business.page.home.list.future.mach.transitionanimation;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.d;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.sankuai.waimai.mach.component.base.a<FrameLayout> implements com.sankuai.waimai.mach.lifecycle.c {
    public static ChangeQuickRedirect a;
    long b;
    float c;
    float d;
    float e;
    float f;
    int g;
    int h;
    View i;
    View j;
    boolean k;
    private FrameLayout r;
    private List<View> s;
    private a t;
    private long u;
    private b v;
    private Handler w;
    private Runnable x;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15f744c0c69698bb113a0568b652a216", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15f744c0c69698bb113a0568b652a216");
            return;
        }
        this.u = 3600L;
        this.b = 400L;
        this.c = 1.0f;
        this.d = 0.0f;
        this.e = 1.0f;
        this.f = 0.9f;
        this.g = 2;
        this.h = 0;
        this.k = false;
    }

    public static /* synthetic */ void a(c cVar, String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "77177a29059a47fe776e7f039706bfa7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "77177a29059a47fe776e7f039706bfa7");
            return;
        }
        try {
            cVar.a(str, cVar.a(i));
            cVar.a(str, cVar.a(i + 1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ void a(FrameLayout frameLayout) {
        FrameLayout frameLayout2 = frameLayout;
        Object[] objArr = {frameLayout2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2fcda30d518c4e8c16ea7a341acf8a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2fcda30d518c4e8c16ea7a341acf8a4");
            return;
        }
        super.a((c) frameLayout2);
        com.sankuai.waimai.foundation.utils.log.a.b("TransitionAnimationComponent", "onViewCreated", new Object[0]);
        if (frameLayout2 != null) {
            frameLayout2.post(new Runnable() { // from class: com.sankuai.waimai.business.page.home.list.future.mach.transitionanimation.c.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    View g;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9f85160055c806f808a753758c1f95ec", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9f85160055c806f808a753758c1f95ec");
                    } else if (c.this.n != null) {
                        List<com.sankuai.waimai.mach.node.a> b = c.this.n.b();
                        if (d.a(b)) {
                            return;
                        }
                        for (int i = 0; i < b.size(); i++) {
                            com.sankuai.waimai.mach.node.a aVar = b.get(i);
                            if (aVar != null && (g = aVar.g()) != null) {
                                com.sankuai.waimai.foundation.utils.log.a.b("TransitionAnimationComponent", "nodeView: " + g, new Object[0]);
                                c.this.f().add(g);
                                if (i > c.this.g - 1) {
                                    g.setVisibility(8);
                                    c.this.g().a(g, 0.0f, 0.0f, 0L).start();
                                    c.this.g().b(g, 1.0f, 0.9f, 0L).start();
                                    c.this.g().c(g, 1.0f, 0.9f, 0L).start();
                                }
                            }
                        }
                        if (c.this.f().size() > 0) {
                            c.this.k = false;
                            c.this.e();
                            c.a(c.this, "expose", c.this.h);
                        }
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ FrameLayout b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e42db773235641f81b716dcf14e75391", RobustBitConfig.DEFAULT_VALUE)) {
            return (FrameLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e42db773235641f81b716dcf14e75391");
        }
        com.sankuai.waimai.foundation.utils.log.a.b("TransitionAnimationComponent", "TransitionAnimationLayout", new Object[0]);
        this.r = new FrameLayout(context);
        return this.r;
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d88aa80b23a8e5763aff770e90c801ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d88aa80b23a8e5763aff770e90c801ca");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("TransitionAnimationComponent", "onBind", new Object[0]);
        this.v = new b(this.m, k());
        this.h = this.v.j;
        this.g = this.v.i;
        this.u = this.v.k;
        this.b = this.v.l;
    }

    private JSONObject a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f53263579e580e8747d5a6b60b4adac7", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f53263579e580e8747d5a6b60b4adac7");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("show_index", i);
            return jSONObject;
        } catch (Exception e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    private void a(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef87230fd1b9fb1b600118f16807ac6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef87230fd1b9fb1b600118f16807ac6b");
        } else if (this.v == null || this.v.g == null || this.m == null) {
        } else {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            linkedList.add(jSONObject);
            this.m.asyncCallJSMethod(this.v.g.b, linkedList);
        }
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50b65c87d6ab0a30271a4aba992ecc4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50b65c87d6ab0a30271a4aba992ecc4e");
        } else if (this.w == null || this.x == null) {
        } else {
            this.w.removeCallbacks(this.x);
            this.k = false;
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92dd14bac0ac6ed6f08ecc715bb8503e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92dd14bac0ac6ed6f08ecc715bb8503e");
            return;
        }
        if (this.w == null) {
            this.w = new Handler(Looper.getMainLooper());
        }
        if (this.x == null) {
            this.x = new Runnable() { // from class: com.sankuai.waimai.business.page.home.list.future.mach.transitionanimation.c.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    int i;
                    int i2;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "845e6c40355215216d0b5ff5f04da4d6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "845e6c40355215216d0b5ff5f04da4d6");
                        return;
                    }
                    final c cVar = c.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = c.a;
                    if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "f176b9ac9a7d40d3dacea71017445f72", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "f176b9ac9a7d40d3dacea71017445f72");
                        return;
                    }
                    int size = cVar.f().size();
                    if (size > 0) {
                        int i3 = cVar.h;
                        int i4 = cVar.h + cVar.g >= cVar.f().size() ? 0 : cVar.h + cVar.g;
                        if (i3 >= size || (i = i3 + 1) >= size || i4 >= size || (i2 = i4 + 1) >= size) {
                            return;
                        }
                        com.sankuai.waimai.foundation.utils.log.a.b("TransitionAnimationComponent", "viewSize: " + cVar.f().size() + "  ,position:  " + i3 + "  ,nextPosition: " + i4, new Object[0]);
                        View view = cVar.f().get(i3);
                        View view2 = cVar.f().get(i);
                        cVar.i = cVar.f().get(i4);
                        cVar.j = cVar.f().get(i2);
                        if (view == null || view2 == null || cVar.i == null || cVar.j == null) {
                            return;
                        }
                        cVar.i.setVisibility(0);
                        cVar.j.setVisibility(0);
                        ObjectAnimator a2 = cVar.g().a(view, cVar.c, cVar.d, cVar.b);
                        ObjectAnimator b = cVar.g().b(view, cVar.e, cVar.f, cVar.b);
                        ObjectAnimator c = cVar.g().c(view, cVar.e, cVar.f, cVar.b);
                        ObjectAnimator a3 = cVar.g().a(view2, cVar.c, cVar.d, cVar.b);
                        ObjectAnimator b2 = cVar.g().b(view2, cVar.e, cVar.f, cVar.b);
                        ObjectAnimator c2 = cVar.g().c(view2, cVar.e, cVar.f, cVar.b);
                        ObjectAnimator a4 = cVar.g().a(cVar.i, cVar.d, cVar.c, cVar.b);
                        ObjectAnimator b3 = cVar.g().b(cVar.i, cVar.f, cVar.e, cVar.b);
                        ObjectAnimator c3 = cVar.g().c(cVar.i, cVar.f, cVar.e, cVar.b);
                        ObjectAnimator a5 = cVar.g().a(cVar.j, cVar.d, cVar.c, cVar.b);
                        ObjectAnimator b4 = cVar.g().b(cVar.j, cVar.f, cVar.e, cVar.b);
                        ObjectAnimator c4 = cVar.g().c(cVar.j, cVar.f, cVar.e, cVar.b);
                        a g = cVar.g();
                        long j = cVar.b;
                        ObjectAnimator[] objectAnimatorArr = {a2, b, c, a3, b2, c2, a4, b3, c3, a5, b4, c4};
                        Object[] objArr4 = {new Long(j), objectAnimatorArr};
                        ChangeQuickRedirect changeQuickRedirect4 = a.a;
                        if (PatchProxy.isSupport(objArr4, g, changeQuickRedirect4, false, "127bca1e10bd0ffe984433e9f9ce3ad4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, g, changeQuickRedirect4, false, "127bca1e10bd0ffe984433e9f9ce3ad4");
                        } else if (j >= 0) {
                            try {
                                g.a(true).setDuration(j).playTogether(objectAnimatorArr);
                                g.a(false).start();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        if (d.a(cVar.g().a(false).getListeners())) {
                            cVar.g().a(false).addListener(new Animator.AnimatorListener() { // from class: com.sankuai.waimai.business.page.home.list.future.mach.transitionanimation.c.2
                                public static ChangeQuickRedirect a;

                                @Override // android.animation.Animator.AnimatorListener
                                public final void onAnimationCancel(Animator animator) {
                                }

                                @Override // android.animation.Animator.AnimatorListener
                                public final void onAnimationRepeat(Animator animator) {
                                }

                                @Override // android.animation.Animator.AnimatorListener
                                public final void onAnimationStart(Animator animator) {
                                }

                                @Override // android.animation.Animator.AnimatorListener
                                public final void onAnimationEnd(Animator animator) {
                                    Object[] objArr5 = {animator};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "a7aa24464267435a06dc2033fa2dd563", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "a7aa24464267435a06dc2033fa2dd563");
                                        return;
                                    }
                                    for (int i5 = 0; i5 < c.this.f().size(); i5++) {
                                        View view3 = c.this.f().get(i5);
                                        if (view3 != null && !view3.equals(c.this.i) && !view3.equals(c.this.j)) {
                                            view3.setVisibility(8);
                                        }
                                    }
                                    c.this.h += c.this.g;
                                    if (c.this.h >= c.this.f().size()) {
                                        c.this.h = 0;
                                    }
                                    c.a(c.this, "expose", c.this.h);
                                    c.this.k = false;
                                    c.this.e();
                                }
                            });
                        }
                    }
                }
            };
        }
        com.sankuai.waimai.foundation.utils.log.a.b("TransitionAnimationComponent", "loopAnimator", new Object[0]);
        if (this.w == null || this.x == null || this.k) {
            return;
        }
        this.w.removeCallbacks(this.x);
        this.w.postDelayed(this.x, this.u);
        this.k = true;
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "243957ba519da8b7bc4ec0b54739d4e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "243957ba519da8b7bc4ec0b54739d4e8");
            return;
        }
        super.b();
        if (this.t != null) {
            a aVar = this.t;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "e83a8c9811e858edcceeef9243d32b28", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "e83a8c9811e858edcceeef9243d32b28");
            } else if (aVar.b != null) {
                aVar.b.cancel();
            }
        }
        h();
    }

    List<View> f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cae4345dae0c24f3aaab938f265cbd9b", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cae4345dae0c24f3aaab938f265cbd9b");
        }
        if (this.s == null) {
            this.s = new ArrayList();
        }
        return this.s;
    }

    a g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7b40c81b84bed9219efbdae78f48811", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7b40c81b84bed9219efbdae78f48811");
        }
        if (this.t == null) {
            this.t = new a();
        }
        return this.t;
    }

    @Override // com.sankuai.waimai.mach.lifecycle.c
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15ed4b8d56a2778d1fc3b95f0d460f75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15ed4b8d56a2778d1fc3b95f0d460f75");
            return;
        }
        if (z) {
            e();
        } else {
            h();
        }
        com.sankuai.waimai.foundation.utils.log.a.b("TransitionAnimationComponent", "onPageVisibilityChanged: " + z, new Object[0]);
    }

    @Override // com.sankuai.waimai.mach.lifecycle.c
    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5d3a2920e9906f60d9f02af378fd559", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5d3a2920e9906f60d9f02af378fd559");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("TransitionAnimationComponent", "onContainerVisibilityChanged: " + z, new Object[0]);
    }
}
