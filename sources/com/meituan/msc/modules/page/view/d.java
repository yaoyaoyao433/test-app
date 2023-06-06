package com.meituan.msc.modules.page.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.common.weaver.interfaces.ffp.FFPTags;
import com.meituan.msc.common.utils.au;
import com.meituan.msc.common.utils.n;
import com.meituan.msc.common.utils.r;
import com.meituan.msc.common.utils.t;
import com.meituan.msc.modules.engine.MSCHornRollbackConfig;
import com.meituan.msc.modules.engine.h;
import com.meituan.msc.modules.page.l;
import com.meituan.msc.modules.page.render.d;
import com.meituan.msc.modules.page.render.webview.i;
import com.meituan.msc.modules.page.render.webview.j;
import com.meituan.msc.modules.page.render.webview.m;
import com.meituan.msc.modules.page.view.CustomNavigationBar;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msi.view.ToastView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.RequestCreator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d extends FrameLayout implements FFPTags, i {
    public static ChangeQuickRedirect a = null;
    @Deprecated
    public static boolean b = false;
    private int A;
    private a B;
    private boolean C;
    private int D;
    private HashMap<String, Object> E;
    private View F;
    private int G;
    private int H;
    public boolean c;
    public boolean d;
    @Nullable
    public b e;
    @Nullable
    public View f;
    public com.meituan.msc.modules.page.widget.d g;
    public com.meituan.msc.modules.page.render.d h;
    public h i;
    public boolean j;
    public boolean k;
    public ToastView l;
    public WeakReference<View> m;
    public boolean n;
    public int o;
    public l p;
    public boolean q;
    public String r;
    public Runnable s;
    public c t;
    public List<com.meituan.msi.page.d> u;
    private boolean v;
    private float w;
    private String x;
    private String y;
    private int z;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(float f);

        void b(float f);
    }

    public static /* synthetic */ void a(d dVar, View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "0c7c01580756fd039e2fc3d6005e66dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "0c7c01580756fd039e2fc3d6005e66dd");
        } else if (dVar.getContext() instanceof Activity) {
            FrameLayout frameLayout = new FrameLayout(dVar.getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            frameLayout.addView(view, layoutParams);
            frameLayout.setBackgroundColor(-16777216);
            ((ViewGroup) ((Activity) dVar.getContext()).getWindow().getDecorView()).addView(frameLayout, layoutParams);
            dVar.F = frameLayout;
            n.a(false, dVar.getContext());
        }
    }

    public static /* synthetic */ void a(d dVar, m mVar) {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "b126fcba0d41267542a6f85f6fbbdefb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "b126fcba0d41267542a6f85f6fbbdefb");
        } else if (dVar.F == null || !(dVar.getContext() instanceof Activity)) {
        } else {
            n.a(true, dVar.getContext());
            ((ViewGroup) ((Activity) dVar.getContext()).getWindow().getDecorView()).removeView(dVar.F);
            dVar.F = null;
            mVar.a();
        }
    }

    public static /* synthetic */ boolean a(d dVar, boolean z) {
        dVar.C = true;
        return true;
    }

    public d(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19a8384638d947807b8c7b89b0ea9a7a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19a8384638d947807b8c7b89b0ea9a7a");
            return;
        }
        this.v = false;
        this.d = false;
        this.z = -16777216;
        this.A = -1;
        this.D = -1;
        this.t = new c();
        this.u = new ArrayList();
    }

    public void setupAppPage(com.meituan.msc.modules.page.render.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a435dd5008e0c82607e0f9c3f0c7bdb4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a435dd5008e0c82607e0f9c3f0c7bdb4");
            return;
        }
        this.E = null;
        this.h = dVar;
        if (this.h instanceof com.meituan.msc.modules.page.render.webview.e) {
            final com.meituan.msc.modules.page.render.webview.e eVar = (com.meituan.msc.modules.page.render.webview.e) this.h;
            com.meituan.msc.common.executor.a.b(new Runnable() { // from class: com.meituan.msc.modules.page.view.d.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "48d7b41c191c123f17ae823de5bb0761", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "48d7b41c191c123f17ae823de5bb0761");
                    } else if (eVar.B() != null) {
                        eVar.B().setOnRenderProcessGoneListener(d.this);
                    } else {
                        g.d("PageViewWrapper", "setOnRenderProcessGoneListener failed");
                    }
                }
            });
            String str = eVar.C;
            if (str != null) {
                this.g.setRegionData(str);
            }
        }
        dVar.j = this.o;
        dVar.k.c = new d.a() { // from class: com.meituan.msc.modules.page.view.d.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.modules.page.render.d.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d23f4da4ae3c3937f924de45d980d204", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d23f4da4ae3c3937f924de45d980d204");
                    return;
                }
                d.a(d.this, true);
                d.super.setBackgroundColor(d.this.A);
            }

            @Override // com.meituan.msc.modules.page.render.d.a
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ece34f6628a5aa841c785828fa6ad9d0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ece34f6628a5aa841c785828fa6ad9d0");
                } else {
                    com.meituan.msc.common.executor.a.b(new Runnable() { // from class: com.meituan.msc.modules.page.view.d.3.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b61e03682c7f30e0a354d81b2ac9a382", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b61e03682c7f30e0a354d81b2ac9a382");
                            } else if (d.this.i.r == null) {
                            } else {
                                if (d.this.s != null) {
                                    d.this.s.run();
                                }
                                com.meituan.msc.common.framework.c.a().b.a(d.this.i.r.j(), d.this.getContentUrl(), d.this);
                            }
                        }
                    });
                }
            }

            @Override // com.meituan.msc.modules.page.render.d.a
            public final void a(String str2) {
                Object[] objArr2 = {str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b4fdc3ac0f53eed6e6405f2d28c2b3ac", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b4fdc3ac0f53eed6e6405f2d28c2b3ac");
                } else if (TextUtils.isEmpty(str2)) {
                    g.a("PageViewWrapper", "onSinkModeHotZone params is empty");
                } else if (d.this.getRefreshLayout() == null) {
                    g.a("PageViewWrapper", "getRefreshLayout is null");
                } else {
                    d.this.getRefreshLayout().setRegionData(str2);
                }
            }
        };
        this.g.setContentView(dVar.o());
    }

    public final int getViewId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f85be39d800cace4cfa7aeefb5d27be", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f85be39d800cace4cfa7aeefb5d27be")).intValue();
        }
        if (this.D != -1) {
            return this.D;
        }
        if (this.h == null) {
            return -1;
        }
        return this.h.j();
    }

    public final void setContentUrl(String str) {
        this.x = str;
    }

    public final void setOpenType(String str) {
        this.y = str;
    }

    public final String getContentUrl() {
        return this.x;
    }

    public final String getOpenType() {
        return this.y;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26fa2a92085c246b6886b1a0c145e0ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26fa2a92085c246b6886b1a0c145e0ef");
            return;
        }
        this.t.cancel();
        if (this.h == null || this.g == null) {
            return;
        }
        this.g.b();
        this.D = this.h.j();
        this.h.e();
    }

    public final com.meituan.msc.modules.page.render.d getRenderer() {
        return this.h;
    }

    public final int getRendererViewHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d8faeae39e8396321720d58609de615", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d8faeae39e8396321720d58609de615")).intValue() : this.h.o().b().getHeight();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "734f6334b0dd4750c93ff62e5b0cf7c3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "734f6334b0dd4750c93ff62e5b0cf7c3")).booleanValue();
        }
        switch (motionEvent.getAction()) {
            case 0:
                this.v = false;
                if (motionEvent.getRawX() > 50.0f || this.B == null) {
                    this.v = false;
                    break;
                } else {
                    ViewParent parent = getParent().getParent();
                    if (parent instanceof com.meituan.msc.modules.page.widget.e) {
                        parent.requestDisallowInterceptTouchEvent(true);
                        ((com.meituan.msc.modules.page.widget.e) parent).setEnabled(false);
                    }
                    this.v = true;
                    this.w = motionEvent.getRawX();
                    return true;
                }
                break;
            case 1:
            case 3:
                if (this.v) {
                    this.B.b(motionEvent.getRawX());
                    return true;
                }
                ViewParent parent2 = getParent().getParent();
                if (parent2 != null && (parent2 instanceof com.meituan.msc.modules.page.widget.e)) {
                    parent2.requestDisallowInterceptTouchEvent(false);
                    ((com.meituan.msc.modules.page.widget.e) parent2).setEnabled(this.c);
                    break;
                }
                break;
            case 2:
                if (this.v) {
                    this.B.a(motionEvent.getRawX() - this.w);
                    this.w = motionEvent.getRawX();
                    return true;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setSwipeListener(a aVar) {
        this.B = aVar;
    }

    public final void setRefreshEnable(boolean z) {
        this.c = z;
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95241d668e83c0ae78dc63babd05e870", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95241d668e83c0ae78dc63babd05e870");
        } else if (this.j) {
        } else {
            String c = this.i.r.c(str);
            String b2 = this.i.r.b(str);
            setNavigationBarTextColor(com.meituan.msc.common.utils.g.a(c));
            setNavigationBarIconColor(com.meituan.msc.common.utils.g.a(c));
            setNavigationBarBackgroundColor(com.meituan.msc.common.utils.g.a(b2));
            setNavigationBarTitle(this.i.r.d(str));
        }
    }

    public final void setNavigationBarTitle(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42dfc95d4e5c98083efa479436763d4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42dfc95d4e5c98083efa479436763d4a");
        } else if (this.k) {
        } else {
            if (this.e == null) {
                b();
            }
            if (this.e != null) {
                this.e.setNavigationBarTitle(str);
            }
        }
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a182c8ba30045de1ff644dfe8e4905d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a182c8ba30045de1ff644dfe8e4905d");
            return;
        }
        int fixedHeight = CustomNavigationBar.getFixedHeight();
        this.e = new b(getContext(), this.q, this.i, this.k, this.r);
        int c = n.c();
        if (this.k) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, fixedHeight);
            layoutParams.topMargin = c;
            addView(this.e, layoutParams);
        } else {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, fixedHeight);
            layoutParams2.topMargin = c;
            addView(this.e, layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
            layoutParams3.topMargin = c + fixedHeight;
            ViewGroup viewGroup = (ViewGroup) this.g.getParent();
            viewGroup.setLayoutParams(layoutParams3);
            viewGroup.requestLayout();
        }
        if (this.j) {
            this.e.setVisibility(4);
        }
    }

    public final void setNavigationBarTextColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b125e93b200643a36baf7b2671672ee4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b125e93b200643a36baf7b2671672ee4");
        } else if (this.k) {
        } else {
            if (this.e == null) {
                b();
            }
            if (this.e != null) {
                this.e.setNavigationBarTextColor(i);
            }
            this.z = i;
            i();
        }
    }

    public final void setNavigationBarIconColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4dc1130e72f8da7945d2c64d7790ebbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4dc1130e72f8da7945d2c64d7790ebbb");
            return;
        }
        if (this.e == null) {
            b();
        }
        if (this.e != null) {
            this.e.setNavigationBarIconColor(i);
        }
    }

    public final void setNavigationBarButtonClickListener(CustomNavigationBar.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fd5578928431f9b6a45f2e12567c3fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fd5578928431f9b6a45f2e12567c3fe");
            return;
        }
        if (this.e == null) {
            b();
        }
        if (this.e != null) {
            this.e.setNavigationBarButtonClickListener(aVar);
        }
    }

    public final void setNavigationBarBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce26c5bd060de46d2f6d8a6f3897ea5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce26c5bd060de46d2f6d8a6f3897ea5e");
        } else if (this.k) {
        } else {
            if (this.e != null) {
                this.e.setBackgroundColor(i);
            }
            if (this.f != null) {
                this.f.setBackgroundColor(i);
            }
        }
    }

    public final int getNavigationBarHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6513c11f94622c12612bc0b19b741c6e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6513c11f94622c12612bc0b19b741c6e")).intValue();
        }
        if (this.e != null) {
            return this.e.getHeight();
        }
        return 0;
    }

    public final Rect getMenuRect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86f2c59bf01e51b165044d1f04e2edb4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86f2c59bf01e51b165044d1f04e2edb4");
        }
        if (this.e != null) {
            return this.e.getMenuRect();
        }
        return new Rect();
    }

    @Override // com.meituan.msc.modules.page.render.webview.i
    public final void a(HashMap<String, Object> hashMap) {
        com.meituan.msc.modules.reporter.a f;
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35c2e47e10c27b4e768c3b9329547843", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35c2e47e10c27b4e768c3b9329547843");
        } else if (j()) {
            g.b("PageViewWrapper", "already received render process gone, duplicated callback");
        } else {
            this.E = hashMap;
            if (this.h instanceof com.meituan.msc.modules.page.render.webview.e) {
                ((com.meituan.msc.modules.page.render.webview.e) this.h).A = true;
            }
            this.E.put("reloadType", this.d ? "immediate" : "onNextShow");
            Object[] objArr2 = {hashMap};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "968c0e88c67f405007b81d900ec9ad72", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "968c0e88c67f405007b81d900ec9ad72");
            } else if (MSCHornRollbackConfig.d().c().disableNotifyRenderProcessGone) {
                g.d("PageViewWrapper", "disableNotifyRenderProcessGone");
            } else {
                List<com.meituan.msc.common.lib.a> a2 = com.sankuai.meituan.serviceloader.b.a(com.meituan.msc.common.lib.a.class, this.i.a());
                if (a2 == null || a2.isEmpty()) {
                    g.d("PageViewWrapper", "notifyRenderProcessGone callbacks empty");
                } else {
                    for (com.meituan.msc.common.lib.a aVar : a2) {
                        if (aVar == null) {
                            g.d("PageViewWrapper", "notifyRenderProcessGone callback is null");
                        } else {
                            Map<String, Object> hashMap2 = new HashMap<>();
                            if (this.h.f() != null && (f = this.h.f().f()) != null) {
                                hashMap2 = f.a();
                                Object[] objArr3 = {hashMap2, hashMap};
                                ChangeQuickRedirect changeQuickRedirect3 = t.a;
                                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "0a08ec89d65a72c8551a075ff38df8bb", RobustBitConfig.DEFAULT_VALUE)) {
                                    hashMap2 = (Map) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "0a08ec89d65a72c8551a075ff38df8bb");
                                } else {
                                    if (hashMap2 == null) {
                                        hashMap2 = new HashMap<>();
                                    }
                                    if (hashMap != null) {
                                        hashMap2.putAll(hashMap);
                                    }
                                }
                            }
                            g.d("PageViewWrapper", "notifyRenderProcessGone", hashMap2);
                            com.meituan.msc.common.lib.c cVar = com.meituan.msc.common.lib.c.MSC;
                        }
                    }
                }
            }
            if (this.d && !this.i.v) {
                c();
            }
            if (this.h != null) {
                this.h.f().a("msc.render.process.gone.handled").a(this.E).c();
            }
        }
    }

    public final ToastView getToastView() {
        return this.l;
    }

    public final com.meituan.msc.modules.page.widget.d getRefreshLayout() {
        return this.g;
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01037916beda885d90b1339cbd0b00b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01037916beda885d90b1339cbd0b00b0");
            return;
        }
        this.A = i;
        if (this.C) {
            super.setBackgroundColor(this.A);
        }
    }

    public final void setBackgroundTextStyle(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62bf2305c6abefaa372e3b51c987b52a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62bf2305c6abefaa372e3b51c987b52a");
        } else if (getRefreshLayout() != null) {
            getRefreshLayout().setBackgroundTextStyle(z);
        }
    }

    public final HashMap<String, Object> c() {
        HashMap<String, Object> hashMap;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45bf5c86078d3193934b3844beccecee", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45bf5c86078d3193934b3844beccecee");
        }
        if (this.E != null) {
            hashMap = new HashMap<>();
            hashMap.putAll(this.E);
        } else {
            hashMap = null;
        }
        if (j()) {
            this.o = getRenderer().j();
            k();
            this.p.e();
            setupAppPage(this.p.a(this.x, false, this.p.a(this.r)));
            if (this.h != null) {
                this.h.f().a("msc.render.process.gone.reload.page").a(hashMap).c();
            }
            d();
            String str = this.x;
            this.x = null;
            this.p.setHasLoaded(false);
            this.p.a(this.h, str);
        }
        return hashMap;
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee8380b619f0139868e2065edeb57f22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee8380b619f0139868e2065edeb57f22");
        } else if (this.d) {
        } else {
            g();
            this.d = true;
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1de83691803180a7cd68db1423e7eb5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1de83691803180a7cd68db1423e7eb5f");
        } else if (this.d) {
            h();
            this.d = false;
        }
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e90184ff73a7761a817c15fc582a4fe9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e90184ff73a7761a817c15fc582a4fe9");
            return;
        }
        i();
        this.h.l();
        if (this.h.o() instanceof com.meituan.msc.modules.page.render.webview.d) {
            a((com.meituan.msc.modules.page.render.webview.d) this.h.o());
        }
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e0ac237e5a05122617a7c6c19497477", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e0ac237e5a05122617a7c6c19497477");
        } else if (this.h != null) {
            this.h.q();
        }
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d9bf42e94f6ddf091c2cd3ddab0eef8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d9bf42e94f6ddf091c2cd3ddab0eef8");
            return;
        }
        Context context = getContext();
        if (context instanceof Activity) {
            au.a((Activity) context, this.z == -16777216);
        }
    }

    private void a(com.meituan.msc.modules.page.render.webview.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1e19994ee715cfd4c13f4887e0e9415", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1e19994ee715cfd4c13f4887e0e9415");
        } else {
            cVar.setOnFullScreenListener(new j() { // from class: com.meituan.msc.modules.page.view.d.5
                public static ChangeQuickRedirect a;
                public m b;

                @Override // com.meituan.msc.modules.page.render.webview.j
                public final void a(View view, m mVar) {
                    Object[] objArr2 = {view, mVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5ea0beb14e1a0ef2a86ec3a4f4fd814a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5ea0beb14e1a0ef2a86ec3a4f4fd814a");
                    } else if (d.this.F != null) {
                        mVar.a();
                    } else {
                        this.b = mVar;
                        d.a(d.this, view);
                    }
                }

                @Override // com.meituan.msc.modules.page.render.webview.j
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "59c9a8654c44147bbb16d3a74cd88557", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "59c9a8654c44147bbb16d3a74cd88557");
                    } else {
                        d.a(d.this, this.b);
                    }
                }
            });
        }
    }

    public final void b(String str) {
        View view;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f43500cb704e64b17b62e309b0a15555", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f43500cb704e64b17b62e309b0a15555");
            return;
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.page_not_found_view);
        if (this.g != null) {
            this.g.setVisibility(8);
        }
        a(str);
        if (linearLayout != null || (view = (LinearLayout) inflate(getContext(), R.layout.msc_page_not_found, null)) == null) {
            return;
        }
        int c = n.c();
        int fixedHeight = CustomNavigationBar.getFixedHeight();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = c + fixedHeight;
        addView(view, layoutParams);
        ImageView imageView = (ImageView) findViewById(R.id.page_not_found_img);
        RequestCreator a2 = r.a(getContext(), this.i.r.l(), this.i.d());
        if (a2 != null) {
            a2.a(imageView);
        }
        ((TextView) findViewById(R.id.page_not_found_msg)).setText(String.format(getContext().getString(R.string.msc_page_not_found_message), this.i.r.k()));
    }

    private boolean j() {
        return this.E != null;
    }

    private void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3f5dc9ac18de81a13920d7fa9ea3795", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3f5dc9ac18de81a13920d7fa9ea3795");
            return;
        }
        e();
        ((com.meituan.msc.modules.engine.c) this.i.c(com.meituan.msc.modules.engine.c.class)).b(this.h);
        ((com.meituan.msc.modules.engine.c) this.i.c(com.meituan.msc.modules.engine.c.class)).b();
    }

    public final void a(int i, int i2, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bff7597a4bfc490aeb08e0e7f9c7b080", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bff7597a4bfc490aeb08e0e7f9c7b080");
        } else if (i != 0) {
            a(i > i2 ? i2 : i);
            if (!z || i <= i2) {
                return;
            }
            this.t.a(this, i - i2);
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3308a702a690a2a833ff09b863a443e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3308a702a690a2a833ff09b863a443e7");
            return;
        }
        com.meituan.msc.modules.page.widget.d refreshLayout = getRefreshLayout();
        if (refreshLayout == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) refreshLayout.getLayoutParams();
        if (marginLayoutParams.bottomMargin == i) {
            return;
        }
        if (i == 0) {
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.topMargin = 0;
        } else {
            marginLayoutParams.bottomMargin += i;
            marginLayoutParams.topMargin += -i;
        }
        g.b("Keyboard", "adjustPan ", Integer.valueOf(this.G), " -> ", Integer.valueOf(marginLayoutParams.bottomMargin));
        this.G = marginLayoutParams.bottomMargin;
        refreshLayout.setLayoutParams(marginLayoutParams);
    }

    public final int getPan() {
        return this.G;
    }

    public final int getKeyboardHeight() {
        return this.H;
    }

    public final void setKeyboardHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81e6a88f5b6168f7af351f581c3e7ca0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81e6a88f5b6168f7af351f581c3e7ca0");
            return;
        }
        this.H = i;
        for (com.meituan.msi.page.d dVar : this.u) {
            dVar.a(i);
        }
    }

    public final int getContentHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fc7ee2af3b719f6b77fa97344b3cb98", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fc7ee2af3b719f6b77fa97344b3cb98")).intValue() : getRenderer().o().getContentHeight();
    }

    public final boolean f() {
        View view;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec15f3df78d1d6793e4df9acf9c957fa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec15f3df78d1d6793e4df9acf9c957fa")).booleanValue();
        }
        if (this.m == null || (view = this.m.get()) == null) {
            return false;
        }
        return view.isAttachedToWindow();
    }

    @Nullable
    public final View getWebViewComponent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60b07798be9290b9e247417d260a166d", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60b07798be9290b9e247417d260a166d");
        }
        if (this.m == null) {
            return null;
        }
        return this.m.get();
    }

    @Override // com.meituan.android.common.weaver.interfaces.ffp.FFPTags
    @NonNull
    public final Map<String, Object> ffpTags() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ceef6f25422d1cb953e9838ab2c602f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ceef6f25422d1cb953e9838ab2c602f");
        }
        b = true;
        if (this.h == null || this.h.k == null || this.h.k.j == null) {
            return Collections.emptyMap();
        }
        Map<String, Object> e = this.h.k.j.e();
        return e == null ? Collections.emptyMap() : e;
    }

    public final int getWebScrollY() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4777310b98b7aad63ba6400cda4555db", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4777310b98b7aad63ba6400cda4555db")).intValue() : this.t.a(this);
    }
}
