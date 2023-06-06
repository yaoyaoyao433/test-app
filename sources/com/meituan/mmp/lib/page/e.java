package com.meituan.mmp.lib.page;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.gson.JsonObject;
import com.meituan.mmp.lib.aa;
import com.meituan.mmp.lib.ae;
import com.meituan.mmp.lib.api.auth.AboutDialog;
import com.meituan.mmp.lib.api.input.f;
import com.meituan.mmp.lib.engine.AppPage;
import com.meituan.mmp.lib.engine.m;
import com.meituan.mmp.lib.page.coverview.CoverViewRootContainer;
import com.meituan.mmp.lib.page.view.CoverViewWrapper;
import com.meituan.mmp.lib.page.view.CustomNavigationBar;
import com.meituan.mmp.lib.page.view.g;
import com.meituan.mmp.lib.page.view.j;
import com.meituan.mmp.lib.service.IServiceEngine;
import com.meituan.mmp.lib.service.b;
import com.meituan.mmp.lib.trace.b;
import com.meituan.mmp.lib.trace.h;
import com.meituan.mmp.lib.utils.az;
import com.meituan.mmp.lib.utils.bb;
import com.meituan.mmp.lib.utils.bf;
import com.meituan.mmp.lib.utils.i;
import com.meituan.mmp.lib.utils.p;
import com.meituan.mmp.lib.utils.v;
import com.meituan.mmp.lib.utils.y;
import com.meituan.mmp.lib.w;
import com.meituan.mmp.lib.widget.f;
import com.meituan.mmp.lib.z;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.mmp.main.ab;
import com.meituan.msi.view.ToastView;
import com.meituan.mtwebkit.MTWebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class e extends RelativeLayout implements com.meituan.mmp.lib.api.input.e, f, com.meituan.mmp.lib.api.web.a, CustomNavigationBar.a, g.a, j.a {
    private static int H;
    private static final Handler O = new Handler(Looper.getMainLooper());
    public static ChangeQuickRedirect a;
    private HashMap<String, g> A;
    private HashMap<String, String> B;
    private HashMap<String, g> C;
    private g[] D;
    private List<com.meituan.mmp.lib.model.a> E;
    private int F;
    private int G;
    private com.meituan.mmp.lib.api.input.c I;
    private boolean J;
    private final boolean K;
    private com.meituan.mmp.lib.resume.b[] L;
    private int M;
    private long N;
    private a P;
    private HashMap<String, Object> Q;
    private int R;
    final com.meituan.mmp.lib.interfaces.d b;
    public boolean c;
    public j d;
    public g e;
    public final ArrayList<AppPage> f;
    public boolean g;
    public final ConcurrentHashMap<String, com.meituan.mmp.lib.api.input.textarea.c> h;
    public long i;
    public long j;
    public final boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public com.meituan.mmp.lib.page.coverview.b p;
    public com.meituan.mmp.lib.api.input.textarea.f q;
    public boolean r;
    private final m s;
    private final com.meituan.mmp.lib.config.a t;
    private final com.meituan.mmp.lib.a u;
    private final Context v;
    private String w;
    private FrameLayout x;
    private final g y;
    private final com.meituan.mmp.lib.resume.a z;

    public static /* synthetic */ void a(e eVar, g gVar, aa aaVar) {
        Object[] objArr = {gVar, aaVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "ff81cfde829ffb468a2a26642666abde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "ff81cfde829ffb468a2a26642666abde");
            return;
        }
        Object[] objArr2 = {aaVar};
        ChangeQuickRedirect changeQuickRedirect2 = g.a;
        if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "82a701c86672db48fb5c93d5b216c1a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "82a701c86672db48fb5c93d5b216c1a9");
        } else {
            gVar.e.a(aaVar);
        }
        String substring = Uri.parse("mmp://www.meituan.com/" + aaVar.b).getPath().substring(1);
        if (!substring.endsWith(".html")) {
            substring = substring + ".html";
        }
        String substring2 = substring.substring(0, substring.length() - 5);
        com.meituan.mmp.lib.trace.b.b("Page", "Page file path :" + substring);
        gVar.a(substring2);
        boolean k = eVar.t.k(substring2);
        gVar.setRefreshEnable(k);
        com.meituan.mmp.lib.widget.f refreshLayout = gVar.getRefreshLayout();
        if (refreshLayout != null) {
            refreshLayout.setEnabled(k);
        }
    }

    public final void setAppLaunchReporter(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "454102efc3fe6eed68651d8998065c9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "454102efc3fe6eed68651d8998065c9b");
            return;
        }
        AppPage appPage = this.y.getAppPage();
        Object[] objArr2 = {hVar};
        ChangeQuickRedirect changeQuickRedirect2 = AppPage.a;
        if (PatchProxy.isSupport(objArr2, appPage, changeQuickRedirect2, false, "331dff4e628fa6f33ff02bc754f3931e", RobustBitConfig.DEFAULT_VALUE)) {
            AppPage appPage2 = (AppPage) PatchProxy.accessDispatch(objArr2, appPage, changeQuickRedirect2, false, "331dff4e628fa6f33ff02bc754f3931e");
        } else {
            appPage.h.g = hVar;
        }
    }

    public final void setPreloadReporter(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5df13c9fd2748e2350a58816b6c5d3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5df13c9fd2748e2350a58816b6c5d3b");
        } else {
            this.y.getAppPage().a(hVar);
        }
    }

    public final ToastView getToastView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e95337a3c9bc47a8fe3af555b5296b2", RobustBitConfig.DEFAULT_VALUE) ? (ToastView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e95337a3c9bc47a8fe3af555b5296b2") : this.e.getToastView();
    }

    private void r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef016dc2a2cef96ad73500d2b5f4b423", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef016dc2a2cef96ad73500d2b5f4b423");
        } else if (this.p != null) {
        } else {
            this.p = new com.meituan.mmp.lib.page.coverview.b() { // from class: com.meituan.mmp.lib.page.e.1
                public static ChangeQuickRedirect a;
                public CoverViewRootContainer b = null;

                private CoverViewRootContainer d() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4bbc701dc379c07302c637a6e7e1860c", RobustBitConfig.DEFAULT_VALUE)) {
                        return (CoverViewRootContainer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4bbc701dc379c07302c637a6e7e1860c");
                    }
                    com.meituan.mmp.lib.widget.f swipeRefreshLayout = e.this.getSwipeRefreshLayout();
                    if (swipeRefreshLayout != null) {
                        return swipeRefreshLayout.getCoverViewContainer();
                    }
                    return null;
                }

                private CoverViewRootContainer e() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "44eea3362a820e5d80a4fd42896d249c", RobustBitConfig.DEFAULT_VALUE)) {
                        return (CoverViewRootContainer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "44eea3362a820e5d80a4fd42896d249c");
                    }
                    com.meituan.mmp.lib.widget.f swipeRefreshLayout = e.this.getSwipeRefreshLayout();
                    if (swipeRefreshLayout != null) {
                        return swipeRefreshLayout.getUnderCoverViewContainer();
                    }
                    return null;
                }

                @Override // com.meituan.mmp.lib.page.coverview.b
                public final boolean a() {
                    boolean z = false;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "15514400347fd80270597f9d549962b6", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "15514400347fd80270597f9d549962b6")).booleanValue();
                    }
                    CoverViewRootContainer d = d();
                    if (d != null) {
                        if (e.this.m) {
                            CoverViewRootContainer e = e();
                            this.b = e;
                            if (e != null) {
                                z = this.b.b();
                            }
                        }
                        if (z) {
                            return true;
                        }
                        return d.b();
                    }
                    return false;
                }

                @Override // com.meituan.mmp.lib.page.coverview.b
                public final void a(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f1403aff275721ef60dbe56409f66122", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f1403aff275721ef60dbe56409f66122");
                        return;
                    }
                    CoverViewRootContainer d = d();
                    if (d != null) {
                        d.b(i);
                    }
                    if (e.this.m) {
                        CoverViewRootContainer e = e();
                        this.b = e;
                        if (e != null) {
                            this.b.b(i);
                        }
                    }
                }

                @Override // com.meituan.mmp.lib.page.coverview.b
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0177be2f2c11a051da9b584fe9dd5ee7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0177be2f2c11a051da9b584fe9dd5ee7");
                        return;
                    }
                    CoverViewRootContainer d = d();
                    if (d != null) {
                        d.c();
                    }
                    if (e.this.m) {
                        CoverViewRootContainer e = e();
                        this.b = e;
                        if (e != null) {
                            this.b.c();
                        }
                    }
                }

                @Override // com.meituan.mmp.lib.page.coverview.b
                public final void a(String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c57cb41cd0cb5a3ad82c9c45f842fce1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c57cb41cd0cb5a3ad82c9c45f842fce1");
                        return;
                    }
                    CoverViewRootContainer d = d();
                    if (d != null) {
                        d.c(str);
                    }
                    if (e.this.m) {
                        CoverViewRootContainer e = e();
                        this.b = e;
                        if (e != null) {
                            this.b.c(str);
                        }
                    }
                }

                @Override // com.meituan.mmp.lib.page.coverview.b
                public final b c() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ac32ba905293bb7cf76f47fdb4e9b0b4", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ac32ba905293bb7cf76f47fdb4e9b0b4") : d();
                }
            };
        }
    }

    public final j getTabBar() {
        return this.d;
    }

    private g b(String str, String str2) {
        int i;
        com.meituan.mmp.lib.resume.b bVar;
        int i2;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd7253504391dd43929891f11772fdff", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd7253504391dd43929891f11772fdff");
        }
        Object[] objArr2 = {str2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        g gVar = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9636688d36a1a51575eacbf73e692040", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9636688d36a1a51575eacbf73e692040") : this.A.get(com.meituan.mmp.lib.config.a.p(str2));
        if (gVar == null) {
            Object[] objArr3 = {str};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "74f8c336fb6489308c29814020594370", RobustBitConfig.DEFAULT_VALUE)) {
                i = ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "74f8c336fb6489308c29814020594370")).intValue();
            } else {
                if (this.E != null) {
                    String p = com.meituan.mmp.lib.config.a.p(str);
                    for (int i3 = 0; i3 < this.E.size(); i3++) {
                        if (TextUtils.equals(this.E.get(i3).f, p)) {
                            i = i3;
                            break;
                        }
                    }
                }
                i = -1;
            }
            Context context = getContext();
            Object[] objArr4 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9c610ed331c5036cc6f9b5ff9301e812", RobustBitConfig.DEFAULT_VALUE)) {
                i2 = ((Integer) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9c610ed331c5036cc6f9b5ff9301e812")).intValue();
            } else if (this.L == null || i >= this.L.length || (bVar = this.L[i]) == null) {
                i2 = -1;
            } else {
                i2 = bVar.d;
                if (this.L[i].c) {
                    this.L[i] = null;
                }
            }
            gVar = a(context, str2, i2);
            if (i != -1) {
                this.D[i] = gVar;
            }
        }
        return gVar;
    }

    private g a(Context context, String str, int i) {
        Object[] objArr = {context, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82922fbb6dd6d3a58183dc875498a363", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82922fbb6dd6d3a58183dc875498a363");
        }
        ab.a("createPageViewWrapper: " + str);
        g gVar = new g(context);
        gVar.k = i;
        gVar.m = this;
        gVar.setTag(str);
        a(str, a(str), gVar);
        this.A.put(str, gVar);
        this.x.addView(gVar, new FrameLayout.LayoutParams(-1, -1));
        ab.a();
        return gVar;
    }

    @NonNull
    public final AppPage a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c1ccf135f73d602e36e022fb8c0d47c", RobustBitConfig.DEFAULT_VALUE)) {
            return (AppPage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c1ccf135f73d602e36e022fb8c0d47c");
        }
        AppPage a2 = this.s.i.a(this.v, str).a(this.b);
        a2.f();
        com.meituan.mmp.lib.devtools.g z = this.u.z();
        if (z != null && z.a()) {
            a2.a(z);
        }
        this.f.add(a2);
        return a2;
    }

    private void a(String str, @NonNull AppPage appPage, g gVar) {
        Object[] objArr = {str, appPage, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "503b2e88a6028527cb548ebafd9a6fa8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "503b2e88a6028527cb548ebafd9a6fa8");
            return;
        }
        gVar.a(this.s, appPage, str, this.k, this.K, new f.a() { // from class: com.meituan.mmp.lib.page.e.11
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mmp.lib.widget.f.a
            public final boolean a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "731ff77e499bb568fd128826ab9fe837", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "731ff77e499bb568fd128826ab9fe837")).booleanValue() : e.this.n();
            }
        });
        com.meituan.mmp.lib.widget.f refreshLayout = gVar.getRefreshLayout();
        boolean k = this.t.k(str);
        gVar.setRefreshEnable(k);
        refreshLayout.setEnabled(k);
        refreshLayout.setBackgroundTextStyle(this.t.f(str));
        refreshLayout.setOnRefreshListener(new f.b() { // from class: com.meituan.mmp.lib.page.e.12
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mmp.lib.widget.f.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "daba4f97fb8c6775bde813e5f4fabb14", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "daba4f97fb8c6775bde813e5f4fabb14");
                    return;
                }
                com.meituan.mmp.lib.trace.b.b("Page", "start onPullDownRefresh");
                e.this.b("onPullDownRefresh", "{}", e.this.getViewId());
            }
        });
        gVar.setNavigationBarButtonClickListener(this);
        if (!this.K) {
            gVar.setSwipeListener(this);
        }
        if (this.k) {
            String e = this.t.e(str);
            if (!TextUtils.isEmpty(e)) {
                gVar.setWidgetBackgroundColor(i.a(e, -1));
                return;
            } else {
                gVar.setBackgroundColor(this.t.d(str));
                return;
            }
        }
        gVar.setBackgroundColor(this.t.d(str));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ef0d597c8999e3cedf0af81ba0671ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ef0d597c8999e3cedf0af81ba0671ea");
            return;
        }
        super.onAttachedToWindow();
        r();
        com.meituan.mmp.lib.trace.b.a("Page", "onAttachedToWindow() view@", Integer.valueOf(getViewId()));
        com.meituan.mmp.lib.a aVar = this.u;
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "50a9d9eede610748194f2d5d989eac76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "50a9d9eede610748194f2d5d989eac76");
        } else {
            aVar.G.add(this);
        }
        this.u.D();
        int i = H;
        Object[] objArr3 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.mmp.lib.api.input.textarea.f.a;
        this.q = PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "cfb85e7095dee4b9939744035e0a1019", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.mmp.lib.api.input.textarea.f) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "cfb85e7095dee4b9939744035e0a1019") : new com.meituan.mmp.lib.api.input.textarea.f(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f07c75b38c75901953111c920654c82d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f07c75b38c75901953111c920654c82d");
            return;
        }
        super.onDetachedFromWindow();
        com.meituan.mmp.lib.trace.b.b("Page", String.format("view@%s onDetachedFromWindow()", Integer.valueOf(getViewId())));
        y.a(this.v, getWindowToken(), 2);
        if (this.e != null && this.e.j != null) {
            s();
        }
        com.meituan.mmp.lib.a aVar = this.u;
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "a765ffd958339d88b52efdcb4aeb5905", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "a765ffd958339d88b52efdcb4aeb5905");
        } else {
            aVar.G.remove(this);
        }
        g();
        if (this.q != null) {
            com.meituan.mmp.lib.api.input.textarea.f fVar = this.q;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.mmp.lib.api.input.textarea.f.a;
            if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "83d5cfa18297f6e2995cd9b5007a359a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "83d5cfa18297f6e2995cd9b5007a359a");
            } else {
                fVar.c.clear();
                fVar.d.clear();
                fVar.e = false;
            }
        }
        int childCount = this.x.getChildCount();
        for (int i = 0; i < childCount; i++) {
            g gVar = (g) this.x.getChildAt(i);
            gVar.removeAllViews();
            gVar.setTag(null);
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = g.a;
            if (PatchProxy.isSupport(objArr4, gVar, changeQuickRedirect4, false, "5d17bd0de68137a8a3f9ab332fca0849", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, gVar, changeQuickRedirect4, false, "5d17bd0de68137a8a3f9ab332fca0849");
            } else if (gVar.e != null && gVar.d != null) {
                com.meituan.mmp.lib.widget.f fVar2 = gVar.d;
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = com.meituan.mmp.lib.widget.f.a;
                if (PatchProxy.isSupport(objArr5, fVar2, changeQuickRedirect5, false, "46b4adf6e96c754ab1b8eef525f69a67", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, fVar2, changeQuickRedirect5, false, "46b4adf6e96c754ab1b8eef525f69a67");
                } else if (fVar2.d != null && fVar2.c != null) {
                    fVar2.d.removeView(fVar2.c);
                }
                gVar.l = gVar.e.j();
                gVar.e.k();
            }
        }
        this.x.removeAllViews();
        removeAllViews();
        if (this.e == null || this.e.j == null) {
            return;
        }
        View view = this.e.j.get();
        this.e.j.clear();
        if (view != null) {
            if (view instanceof WebView) {
                ((WebView) view).destroy();
            } else if (view instanceof MTWebView) {
                ((MTWebView) view).destroy();
            }
        }
    }

    @Override // com.meituan.mmp.lib.api.input.f
    public final void a(int i, int i2) {
        com.meituan.mmp.lib.api.input.c a2;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "798bc429af1ff49a86a2874afe10f769", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "798bc429af1ff49a86a2874afe10f769");
            return;
        }
        if (this.J) {
            if (i > 0) {
                this.g = true;
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0589f51fe16e10e1c646227e9eb3ebab", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0589f51fe16e10e1c646227e9eb3ebab");
                } else {
                    H = System.identityHashCode(this);
                    this.F = i;
                    com.meituan.mmp.lib.widget.f swipeRefreshLayout = getSwipeRefreshLayout();
                    if (swipeRefreshLayout != null) {
                        CoverViewRootContainer coverViewContainer = swipeRefreshLayout.getCoverViewContainer();
                        Object[] objArr3 = {(byte) 1, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = CoverViewRootContainer.a;
                        if (PatchProxy.isSupport(objArr3, coverViewContainer, changeQuickRedirect3, false, "2f15afdb05677941c523bf6dff453c60", RobustBitConfig.DEFAULT_VALUE)) {
                            a2 = (com.meituan.mmp.lib.api.input.c) PatchProxy.accessDispatch(objArr3, coverViewContainer, changeQuickRedirect3, false, "2f15afdb05677941c523bf6dff453c60");
                        } else {
                            com.meituan.mmp.lib.api.input.c a3 = coverViewContainer.c.a(true, i);
                            a2 = (a3 == null || a3.c == -1) ? coverViewContainer.d.a(true, i) : a3;
                        }
                        if (a2.c != -1) {
                            JSONObject jSONObject = new JSONObject();
                            JSONObject jSONObject2 = new JSONObject();
                            try {
                                jSONObject.put("inputId", a2.d);
                                jSONObject2.put("inputId", a2.d);
                                float f = i;
                                jSONObject.put("height", p.b(f));
                                jSONObject2.put("height", p.b(f));
                                jSONObject.put("value", a2.e);
                            } catch (JSONException unused) {
                            }
                            this.b.a("onKeyboardShow", jSONObject, getViewId());
                            this.b.a("onKeyboardHeightChange", jSONObject, getViewId());
                            this.I = a2;
                            a(a2.d, i);
                        } else if (this.e.j != null && this.e.j.get() != null) {
                            View view = this.e.j.get();
                            if (view instanceof WebView) {
                                ((WebView) view).evaluateJavascript("var fs = (\ndocument.hasFocus() &&\ndocument.activeElement !== document.body &&\ndocument.activeElement !== document.documentElement &&\ndocument.activeElement\n) || null;\nif(fs==null){\n__mmp__plugin_webview.onInputFocusDispatcher(-1,0,0);\n}else{\nvar rect=fs.getBoundingClientRect();\n__mmp__plugin_webview.onInputFocusDispatcher(1,rect.bottom,rect.top);\n}", null);
                            } else if (view instanceof MTWebView) {
                                ((MTWebView) view).evaluateJavascript("var fs = (\ndocument.hasFocus() &&\ndocument.activeElement !== document.body &&\ndocument.activeElement !== document.documentElement &&\ndocument.activeElement\n) || null;\nif(fs==null){\n__mmp__plugin_webview.onInputFocusDispatcher(-1,0,0);\n}else{\nvar rect=fs.getBoundingClientRect();\n__mmp__plugin_webview.onInputFocusDispatcher(1,rect.bottom,rect.top);\n}", null);
                            }
                        }
                        i(a2.d);
                    }
                }
            } else {
                this.g = false;
                s();
            }
        }
        if (i <= 0) {
            t();
        }
    }

    public static String getSystemModel() {
        return Build.MODEL;
    }

    private void s() {
        final View view;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8cafeda3e0c9b696709092c3f735418", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8cafeda3e0c9b696709092c3f735418");
        } else if (System.identityHashCode(this) == H) {
            this.F = 0;
            if (this.I != null) {
                com.meituan.mmp.lib.widget.f swipeRefreshLayout = getSwipeRefreshLayout();
                if (swipeRefreshLayout == null) {
                    return;
                }
                View findFocus = swipeRefreshLayout.getCoverViewContainer().findFocus();
                if (findFocus instanceof com.meituan.mmp.lib.api.input.d) {
                    com.meituan.mmp.lib.api.input.d dVar = (com.meituan.mmp.lib.api.input.d) findFocus;
                    this.I.a = dVar.getCursor();
                    this.I.e = dVar.getValue();
                    dVar.d();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("inputId", dVar.I_());
                        jSONObject.put("height", p.b(0.0f));
                    } catch (JSONException unused) {
                    }
                    this.b.a("onKeyboardHeightChange", jSONObject, getViewId());
                } else {
                    this.I = null;
                    d(0);
                    return;
                }
            } else if (this.e.j != null && (view = this.e.j.get()) != null) {
                View childAt = ((FrameLayout) ((Activity) this.v).findViewById(16908290)).getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                if (layoutParams.height != -1) {
                    layoutParams.height = -1;
                    this.G = 0;
                    childAt.requestLayout();
                    view.post(new Runnable() { // from class: com.meituan.mmp.lib.page.e.13
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dc50b6f3193013b1f5ab82aa2c58e03f", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dc50b6f3193013b1f5ab82aa2c58e03f");
                                return;
                            }
                            view.scrollBy(0, -1);
                            view.scrollBy(0, 1);
                        }
                    });
                }
            }
            this.I = null;
            this.b.a("hideKeyboard", (JSONObject) null, getViewId());
            d(0);
            u();
        }
    }

    public final int getPageAreaHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5344040446837e501b668ee5c3b80349", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5344040446837e501b668ee5c3b80349")).intValue();
        }
        if (this.e == null || !this.e.isLaidOut()) {
            return 0;
        }
        return this.e.getHeight();
    }

    public final int getCurrentWebViewHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e160a212606a3cd6d19f5b6463a36f3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e160a212606a3cd6d19f5b6463a36f3")).intValue();
        }
        if (this.e == null || !this.e.isLaidOut()) {
            return 0;
        }
        return this.e.getWebViewHeight();
    }

    @Override // com.meituan.mmp.lib.api.input.e
    public final void a(int i, boolean z, View view) {
        Object[] objArr = {1, Byte.valueOf(z ? (byte) 1 : (byte) 0), view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc937177a9045613ceb94b5d15d95c66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc937177a9045613ceb94b5d15d95c66");
            return;
        }
        com.meituan.mmp.lib.api.input.d dVar = (com.meituan.mmp.lib.api.input.d) view;
        if (z || (dVar instanceof com.meituan.mmp.lib.api.input.textarea.d)) {
            return;
        }
        dVar.d();
    }

    @Override // com.meituan.mmp.lib.page.view.CustomNavigationBar.a
    public final void a() {
        View view;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f2ff1a93a842d917117b4a08d581442", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f2ff1a93a842d917117b4a08d581442");
            return;
        }
        int b = this.s.q != null ? this.s.q.b() : 0;
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.e != null && this.e.j != null && (view = this.e.j.get()) != null) {
                String str = null;
                if (view instanceof WebView) {
                    str = ((WebView) view).getUrl();
                } else if (view instanceof MTWebView) {
                    str = ((MTWebView) view).getUrl();
                }
                jSONObject.put("webViewUrl", str);
            }
            jSONObject.put("from", "menu");
            jSONObject.put("withShareTicket", this.n);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.b.a("onShare", jSONObject.toString(), b);
    }

    @Override // com.meituan.mmp.lib.page.view.CustomNavigationBar.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "844e088a0e397ac95ab4971a9008c6d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "844e088a0e397ac95ab4971a9008c6d9");
            return;
        }
        t();
        g();
        ((Activity) this.v).onBackPressed();
    }

    @Override // com.meituan.mmp.lib.page.view.CustomNavigationBar.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c746f6bea466fc689a90710ae59f6373", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c746f6bea466fc689a90710ae59f6373");
            return;
        }
        this.u.w();
        g();
        this.u.o();
        post(new Runnable() { // from class: com.meituan.mmp.lib.page.e.14
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "317f2d754daad0647440104e9a5b4adf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "317f2d754daad0647440104e9a5b4adf");
                } else {
                    com.meituan.mmp.lib.pip.e.a(e.this.t.c());
                }
            }
        });
        com.meituan.mmp.lib.trace.b.b("Page", "Page clickClose");
    }

    @Override // com.meituan.mmp.lib.page.view.CustomNavigationBar.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65266e9954bf3a81ded2af73cd33f0df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65266e9954bf3a81ded2af73cd33f0df");
            return;
        }
        AboutDialog aboutDialog = new AboutDialog(getContext(), this.t);
        aboutDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.meituan.mmp.lib.page.e.15
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                Object[] objArr2 = {dialogInterface};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a5ac856e58baf4f25a50ec9b279d2ecc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a5ac856e58baf4f25a50ec9b279d2ecc");
                } else {
                    e.this.b.a("onAppEnterForeground", (String) null, 0);
                }
            }
        });
        this.b.a("onAppEnterBackground", "{\"mode\":\"hang\"}", 0);
        aboutDialog.show();
    }

    @Override // com.meituan.mmp.lib.page.view.CustomNavigationBar.a
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bdc26859a583796b5bca5c8fb6f9f18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bdc26859a583796b5bca5c8fb6f9f18");
            return;
        }
        if (this.b != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.N <= ViewConfiguration.getDoubleTapTimeout()) {
                this.b.a("onUserTapBackToTop", (JSONObject) null, getViewId());
            }
            this.N = elapsedRealtime;
        }
        if (MMPEnvHelper.getEnvInfo().isProdEnv()) {
            return;
        }
        int i = this.M + 1;
        this.M = i;
        if (i > 4) {
            this.M = 0;
            bb.a("小程序版本号:" + this.t.g() + "\n 基础库版本号：" + this.t.l.mmpSdk.d, 0);
        }
    }

    public final boolean b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "057e32cddf18aecd71cbb1f6ce1b2ec6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "057e32cddf18aecd71cbb1f6ce1b2ec6")).booleanValue();
        }
        int childCount = this.x.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            g gVar = (g) this.x.getChildAt(i3);
            if (gVar.getViewId() == i2) {
                gVar.setBackgroundColor(i);
                return true;
            }
        }
        com.meituan.mmp.lib.trace.b.d("Page", "setPageBackgroundColor failed, page(id:" + i2 + ") not found!");
        return false;
    }

    public final boolean a(boolean z, int i) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1bd257bcdd3565747157afb3c9be70b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1bd257bcdd3565747157afb3c9be70b")).booleanValue();
        }
        int childCount = this.x.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            g gVar = (g) this.x.getChildAt(i2);
            if (gVar.getViewId() == i) {
                gVar.getRefreshLayout().setBackgroundTextStyle(z);
                return true;
            }
        }
        com.meituan.mmp.lib.trace.b.d("Page", "setBackgroundTextStyle failed, page(id:" + i + ") not found!");
        return false;
    }

    private void c(aa aaVar) {
        Object[] objArr = {aaVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63b5541a7423cabf3d103a58acf85ef2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63b5541a7423cabf3d103a58acf85ef2");
        } else {
            a(aaVar, f(aaVar.a()));
        }
    }

    private g f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb6873aa9eaaac35b0ca8c8af517a8fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb6873aa9eaaac35b0ca8c8af517a8fa");
        }
        String p = com.meituan.mmp.lib.config.a.p(str);
        g gVar = this.C.get(p);
        if (gVar != null) {
            return gVar;
        }
        String a2 = this.t.a(str);
        if (a2 == null) {
            a2 = str;
        } else {
            com.meituan.mmp.lib.trace.b.a("getPageViewWrapperWithOriginUrl", a2, " from:", str);
            this.B.put(a2, str);
        }
        g b = b(str, a2);
        this.C.put(p, b);
        return b;
    }

    @Override // com.meituan.mmp.lib.page.view.j.a
    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc5d313c75e13a6c0f34d104cb1ac359", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc5d313c75e13a6c0f34d104cb1ac359");
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long currentTimeMillis = System.currentTimeMillis();
        c(str);
        if (this.e != this.y) {
            a(str, elapsedRealtime, false, currentTimeMillis);
        }
    }

    @Override // com.meituan.mmp.lib.page.view.j.a
    public final boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67c9b2a2921f957caa9c0c65e6c39fb3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67c9b2a2921f957caa9c0c65e6c39fb3")).booleanValue();
        }
        g gVar = this.e;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = g.a;
        return PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "9d494878e9b34f5b1f2c9cef2ebd4704", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "9d494878e9b34f5b1f2c9cef2ebd4704")).booleanValue() : gVar.h != null && gVar.h.a();
    }

    private void a(String str, long j, boolean z, long j2) {
        Object[] objArr = {str, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24035eee5e7ee65f99d447bd0ea1cf28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24035eee5e7ee65f99d447bd0ea1cf28");
        } else if (this.e == null) {
        } else {
            Iterator<AppPage> it = this.f.iterator();
            while (it.hasNext()) {
                AppPage next = it.next();
                if (next != null && next == this.e.getAppPage()) {
                    if (!next.m()) {
                        z.a(j(str));
                    }
                    next.a(str, j, j2, z, this.k);
                    return;
                }
            }
        }
    }

    private boolean a(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a14bd4c46b018eae931424e6804ef66", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a14bd4c46b018eae931424e6804ef66")).booleanValue();
        }
        if (this.P != null) {
            O.removeCallbacks(this.P);
        }
        this.P = new a(gVar, this.Q);
        h hVar = this.s.e;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = h.a;
        if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "4b9053684e2dc3f3c0839bf0c8ac24ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "4b9053684e2dc3f3c0839bf0c8ac24ba");
        } else {
            hVar.g.clear();
            hVar.h = true;
        }
        return O.postDelayed(this.P, com.meituan.mmp.lib.config.b.d() * 1000);
    }

    public void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21903fee88035808a83d3f86bf8b969f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21903fee88035808a83d3f86bf8b969f");
            return;
        }
        Iterator<AppPage> it = this.f.iterator();
        while (it.hasNext()) {
            AppPage next = it.next();
            if (next != null) {
                next.o();
            }
        }
        z.b(p());
    }

    public final void a(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9a0636059df381f380d21a68095ec30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9a0636059df381f380d21a68095ec30");
        } else if (this.b != null) {
            com.meituan.mmp.lib.interfaces.d dVar = this.b;
            aa aaVar = new aa(str2, str);
            aaVar.g = this.c;
            dVar.a(aaVar, i, -1, "");
        }
    }

    public final void b(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6415b007df5a2b3d229a756afebc9b9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6415b007df5a2b3d229a756afebc9b9e");
        } else if (this.b != null) {
            this.b.a(str, str2, i);
        }
    }

    @Override // com.meituan.mmp.lib.page.view.j.a
    public final void a(final String str, final String str2, final String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3318dff7e8fe76f81d20727a5835a90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3318dff7e8fe76f81d20727a5835a90");
        } else {
            com.meituan.mmp.lib.executor.a.b(new Runnable() { // from class: com.meituan.mmp.lib.page.e.16
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "374271cb01b5550c5d2304a75f4bb3c6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "374271cb01b5550c5d2304a75f4bb3c6");
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("pagePath", str);
                        jSONObject.put("index", str2);
                        jSONObject.put("text", str3);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    e.this.b("onTabItemTap", jSONObject.toString(), e.this.getViewId());
                }
            });
        }
    }

    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7596e7a8bc85eb1a5b909c34e39aff7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7596e7a8bc85eb1a5b909c34e39aff7");
            return;
        }
        g f = f(str);
        aa aaVar = new aa((String) f.getTag(), str, "switchTab");
        aaVar.g = this.c;
        a(aaVar, f);
    }

    private void a(final aa aaVar, final g gVar) {
        Object[] objArr = {aaVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c119e8c53a3f47dabcca35f894aa6e04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c119e8c53a3f47dabcca35f894aa6e04");
            return;
        }
        Trace.beginSection("switchTab");
        String a2 = aaVar.a();
        String p = com.meituan.mmp.lib.config.a.p(a2);
        if (this.d != null) {
            this.d.a(p);
            this.d.setVisibility(0);
        }
        g(this.w);
        boolean z = this.e != gVar;
        if (z) {
            b(3);
            this.s.e.c(this.w, String.valueOf(this.e.getViewId()));
            this.e.setVisibility(8);
            this.e.g();
        }
        gVar.setVisibility(0);
        gVar.e();
        this.w = aaVar.b;
        this.e = gVar;
        if (TextUtils.isEmpty(gVar.getContentUrl())) {
            gVar.a();
            b(aaVar);
            if (h(a2)) {
                com.meituan.mmp.lib.executor.a.b(new com.meituan.mmp.lib.executor.b() { // from class: com.meituan.mmp.lib.page.e.17
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8d4d546748e27e0ce96be97bb46e6c93", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8d4d546748e27e0ce96be97bb46e6c93");
                            return;
                        }
                        AppPage appPage = gVar.getAppPage();
                        aa aaVar2 = new aa(aaVar);
                        aaVar2.c = "reload";
                        aaVar2.g = true;
                        Object[] objArr3 = {aaVar2};
                        ChangeQuickRedirect changeQuickRedirect3 = AppPage.a;
                        if (PatchProxy.isSupport(objArr3, appPage, changeQuickRedirect3, false, "3349a3f6255cbe5d75ada1054facfbed", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, appPage, changeQuickRedirect3, false, "3349a3f6255cbe5d75ada1054facfbed");
                        } else {
                            appPage.a(aaVar2, appPage.h.p);
                        }
                    }
                });
            }
        } else {
            com.meituan.mmp.lib.executor.a.b(new Runnable() { // from class: com.meituan.mmp.lib.page.e.18
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e9e676ab98072f87971d8b006463059", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e9e676ab98072f87971d8b006463059");
                        return;
                    }
                    e eVar = e.this;
                    aa aaVar2 = aaVar;
                    int viewId = gVar.getViewId();
                    Object[] objArr3 = {aaVar2, Integer.valueOf(viewId)};
                    ChangeQuickRedirect changeQuickRedirect3 = e.a;
                    if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "23af54de27118607ea7ea1ac509d18c2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "23af54de27118607ea7ea1ac509d18c2");
                    } else if (eVar.b != null) {
                        com.meituan.mmp.lib.trace.b.b("Page", String.format("onAppRoute, openType=%s pagePath=%s viewId=%s", aaVar2.c, aaVar2.b, Integer.valueOf(viewId)));
                        eVar.b.a(aaVar2, viewId, -1, "");
                    }
                }
            });
        }
        Trace.endSection();
        if (z) {
            j();
            this.s.e.b(this.w, String.valueOf(this.e.getViewId()));
        }
        Trace.endSection();
    }

    private void g(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e027ae3d9e245aeebb6543fd5dce026", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e027ae3d9e245aeebb6543fd5dce026");
        } else if (TextUtils.isEmpty(str)) {
            b.a.c("Page", "getAndCacheJSMemoryUsage lastUrl is null");
        } else if (!com.meituan.mmp.lib.config.b.u()) {
            b.a.c("Page", "GetV8JSMemUsage config is close");
        } else if (this.s == null || this.s.h == null) {
        } else {
            IServiceEngine iServiceEngine = this.s.h.c;
            final String str2 = this.s.b;
            if (iServiceEngine instanceof com.meituan.mmp.lib.service.c) {
                final com.meituan.mmp.lib.service.c cVar = (com.meituan.mmp.lib.service.c) iServiceEngine;
                cVar.a(new b.a() { // from class: com.meituan.mmp.lib.page.e.2
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.mmp.lib.service.b.a
                    public final void a(long j) {
                        Object[] objArr2 = {new Long(j)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0f8e1b580bc02f07238be88c72605b06", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0f8e1b580bc02f07238be88c72605b06");
                            return;
                        }
                        e eVar = e.this;
                        com.meituan.mmp.lib.service.c cVar2 = cVar;
                        String str3 = str2;
                        String str4 = str;
                        Object[] objArr3 = {new Long(j), cVar2, str3, str4};
                        ChangeQuickRedirect changeQuickRedirect3 = e.a;
                        if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "82c2606126e84222001ac3d246716fce", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "82c2606126e84222001ac3d246716fce");
                        } else {
                            com.meituan.mmp.lib.p.a(str3, str4, j - cVar2.b);
                            cVar2.b = j;
                        }
                        e eVar2 = e.this;
                        com.meituan.mmp.lib.service.c cVar3 = cVar;
                        Object[] objArr4 = {new Long(j), cVar3};
                        ChangeQuickRedirect changeQuickRedirect4 = e.a;
                        if (PatchProxy.isSupport(objArr4, eVar2, changeQuickRedirect4, false, "6e47190b89aacb3c9cf4a3ac50941eac", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, eVar2, changeQuickRedirect4, false, "6e47190b89aacb3c9cf4a3ac50941eac");
                            return;
                        }
                        com.meituan.mmp.lib.p.a(j);
                        cVar3.d();
                    }
                });
            }
        }
    }

    private boolean h(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c086bc777a88e4fb650c435de360780a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c086bc777a88e4fb650c435de360780a")).booleanValue();
        }
        if (this.L == null || str == null) {
            return false;
        }
        for (int i = 0; i < this.L.length; i++) {
            com.meituan.mmp.lib.resume.b bVar = this.L[i];
            if (bVar != null && TextUtils.equals(com.meituan.mmp.lib.config.a.p(str), com.meituan.mmp.lib.config.a.p(bVar.a))) {
                this.L[i] = null;
                return true;
            }
        }
        return false;
    }

    public final AppPage a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf45fed5404d5fe30e2f674ee80197d9", RobustBitConfig.DEFAULT_VALUE)) {
            return (AppPage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf45fed5404d5fe30e2f674ee80197d9");
        }
        Iterator<AppPage> it = this.f.iterator();
        while (it.hasNext()) {
            AppPage next = it.next();
            if (i == next.j()) {
                return next;
            }
        }
        return null;
    }

    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e85aed79169e2560d72a37c7794dad4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e85aed79169e2560d72a37c7794dad4");
        } else {
            b(true);
        }
    }

    private void b(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec1818805ab2dbaed6adb2e6c66f5dcc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec1818805ab2dbaed6adb2e6c66f5dcc");
            return;
        }
        this.e.e();
        this.J = true;
        j();
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14a350a7a70d7251ee3caba1e3cd3525", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14a350a7a70d7251ee3caba1e3cd3525");
            return;
        }
        this.J = false;
        b(z ? 1 : 2);
        this.e.g();
        if (this.g) {
            this.g = false;
            s();
            com.meituan.mmp.lib.api.input.textarea.d.f();
        }
    }

    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f35b6374253be4a2288d41eded44212", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f35b6374253be4a2288d41eded44212");
        } else {
            this.e.d();
        }
    }

    public final void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccda9bd6a90ef2d6d3e98ed730c49b92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccda9bd6a90ef2d6d3e98ed730c49b92");
        } else if (this.p != null) {
            this.p.a(str);
        } else {
            com.meituan.mmp.lib.trace.b.d("pageLifecycleInterceptor not found!");
        }
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c35cea08942072116f0dc112e5b34d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c35cea08942072116f0dc112e5b34d9");
        } else if (this.r) {
        } else {
            this.r = true;
            if (com.meituan.mmp.lib.config.b.T()) {
                com.meituan.mmp.lib.preformance.b.b(this.t, getPagePath(), this.e, this.u, (Activity) this.v);
            }
            if (this.p != null) {
                this.p.a(i);
            } else {
                com.meituan.mmp.lib.trace.b.d("pageLifecycleInterceptor not found!");
            }
            w.a().b.b(this.t.c(), this.w, getWindowToken());
            if (this.s.l != null) {
                this.s.l.a(getViewId());
            }
        }
    }

    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e991434e6c299a43d022dac139ceac17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e991434e6c299a43d022dac139ceac17");
            return;
        }
        this.Q = this.e.f();
        if (this.r) {
            this.r = false;
            if (com.meituan.mmp.lib.config.b.T()) {
                com.meituan.mmp.lib.preformance.b.a(this.t, getPagePath(), this.e, this.u, (Activity) this.v);
            } else {
                a(this.e);
            }
            if (this.p != null) {
                this.p.b();
            } else {
                com.meituan.mmp.lib.trace.b.d("pageLifecycleInterceptor not found!");
            }
            w.a().b.a(this.t.c(), this.w, getWindowToken());
            if (this.s.l != null) {
                this.s.l.b(getViewId());
            }
        }
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b20e0ab3f7395131a440b90abc343986", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b20e0ab3f7395131a440b90abc343986");
            return;
        }
        com.meituan.mmp.lib.trace.b.b("Page", String.format("view@%s onPageNotFound(%s)", Integer.valueOf(getViewId()), str));
        a(str2, str, getViewId());
    }

    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98d638ebdd447e3ff1dda8e5cc5394e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98d638ebdd447e3ff1dda8e5cc5394e3");
        } else {
            com.meituan.mmp.lib.executor.a.b(new Runnable() { // from class: com.meituan.mmp.lib.page.e.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c78e1ce08ddbf770eab75f0fdd30665d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c78e1ce08ddbf770eab75f0fdd30665d");
                    } else {
                        e.this.a(e.this.k ? "widgetDestory" : "navigateBackUtil", e.this.e.getContentUrl(), e.this.getViewId());
                    }
                }
            });
        }
    }

    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4ca75a74b00674596c2b8930ec1df38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4ca75a74b00674596c2b8930ec1df38");
            return;
        }
        com.meituan.mmp.lib.trace.b.b("Page", String.format("onNavigateBack view@%s", Integer.valueOf(getViewId())));
        if (!this.t.c(this.w)) {
            q();
        }
        com.meituan.mmp.lib.executor.a.b(new Runnable() { // from class: com.meituan.mmp.lib.page.e.4
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b859e57667a95cda6d9076e187bb738a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b859e57667a95cda6d9076e187bb738a");
                } else {
                    e.this.a("navigateBack", e.this.e.getContentUrl(), e.this.getViewId());
                }
            }
        });
    }

    public final void b(final aa aaVar) {
        Object[] objArr = {aaVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d4c302457d1113e66f1aeb6418ab117", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d4c302457d1113e66f1aeb6418ab117");
            return;
        }
        final g gVar = this.e;
        com.meituan.mmp.lib.trace.a.a(aaVar.b, this.t.c(), aaVar.c);
        com.meituan.mmp.lib.trace.b.b("Page", String.format("loadUrl(%s, %s) view@%s", aaVar.b, aaVar.c, Integer.valueOf(getViewId())));
        if (TextUtils.isEmpty(aaVar.b) || gVar == null) {
            return;
        }
        gVar.setContentUrl(aaVar.b);
        gVar.setOpenType(aaVar.c);
        ab.c("loadContent waitingRun");
        Runnable runnable = new Runnable() { // from class: com.meituan.mmp.lib.page.e.5
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "82398657c46b3397e5f3e46b283957d0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "82398657c46b3397e5f3e46b283957d0");
                    return;
                }
                ab.d("loadUrl waitingRun");
                if (e.this.k) {
                    aaVar.e = v.a("widgetSize", v.a("width", Integer.valueOf(p.c(gVar.getWidth())), "height", Integer.valueOf(p.c(gVar.getHeight()))));
                }
                e.a(e.this, gVar, aaVar);
            }
        };
        if (this.l) {
            com.meituan.mmp.lib.executor.a.e(runnable);
        } else {
            com.meituan.mmp.lib.executor.a.b(runnable);
        }
    }

    public final com.meituan.mmp.lib.widget.f getSwipeRefreshLayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dd44c14ac46744d6c849d1e914a797f", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.mmp.lib.widget.f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dd44c14ac46744d6c849d1e914a797f") : this.e.getRefreshLayout();
    }

    public final void setNavigationBarTitle(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c027c3634e51ddaf3620eff48b44d469", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c027c3634e51ddaf3620eff48b44d469");
            return;
        }
        com.meituan.mmp.lib.trace.b.b("Page", String.format("setNavigationBarTitle view@%s", Integer.valueOf(getViewId())));
        this.e.setNavigationBarTitle(str);
    }

    public final void a(boolean z, JSONObject jSONObject) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2780e018a26c96776f0c94388a6568c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2780e018a26c96776f0c94388a6568c8");
        } else {
            this.e.a(z, jSONObject, this.t);
        }
    }

    public final void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e4552d2bdc7848474c5f5cdd3d77600", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e4552d2bdc7848474c5f5cdd3d77600");
        } else {
            this.e.b();
        }
    }

    public final int getViewId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6dc8e3358e2aea51f59b3209702f6609", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6dc8e3358e2aea51f59b3209702f6609")).intValue();
        }
        if (this.e != null) {
            return this.e.getViewId();
        }
        return 0;
    }

    public final com.meituan.mmp.lib.resume.a getPageInfoArray() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a0db06b21f83e5bbc8d66073e6d6a4f", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.mmp.lib.resume.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a0db06b21f83e5bbc8d66073e6d6a4f");
        }
        com.meituan.mmp.lib.resume.a aVar = new com.meituan.mmp.lib.resume.a();
        aVar.c = getViewId();
        aVar.a = getPagePath();
        aVar.b = getOriginPagePath();
        aVar.d = getViewIdArrays();
        aVar.e = this.c;
        return aVar;
    }

    private String getOriginPagePath() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc200c16093fd861b9fe748a34d9a785", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc200c16093fd861b9fe748a34d9a785");
        }
        String routePath = getRoutePath();
        if (routePath == null) {
            return null;
        }
        return this.B.get(routePath);
    }

    private com.meituan.mmp.lib.resume.b[] getViewIdArrays() {
        com.meituan.mmp.lib.resume.b[] bVarArr;
        g gVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62830646f8d700a34ca052adf6b1465f", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.mmp.lib.resume.b[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62830646f8d700a34ca052adf6b1465f");
        }
        if (getTabBar() == null) {
            com.meituan.mmp.lib.resume.b bVar = new com.meituan.mmp.lib.resume.b();
            bVarArr = new com.meituan.mmp.lib.resume.b[]{bVar};
            bVar.d = this.e != null ? this.e.getViewId() : 0;
            bVar.a = getPagePath();
        } else {
            bVarArr = this.L != null ? this.L : new com.meituan.mmp.lib.resume.b[this.E.size()];
            while (r0 < bVarArr.length) {
                com.meituan.mmp.lib.resume.b bVar2 = bVarArr[r0];
                if (bVar2 == null) {
                    bVar2 = new com.meituan.mmp.lib.resume.b();
                }
                if ((bVar2.d == -1 || bVar2.a == null) && (gVar = this.D[r0]) != null) {
                    bVar2.d = gVar.getViewId();
                    bVar2.a = gVar.getContentUrl();
                    bVar2.b = getOriginPagePath();
                }
                if (bVar2.d == getViewId()) {
                    bVar2.c = true;
                }
                bVarArr[r0] = bVar2;
                r0++;
            }
        }
        return bVarArr;
    }

    @Override // com.meituan.mmp.lib.page.view.g.a
    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2b720fe240e305bbdd419fde54cfbf4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2b720fe240e305bbdd419fde54cfbf4");
        } else {
            scrollBy(-((int) f), 0);
        }
    }

    @Override // com.meituan.mmp.lib.page.view.g.a
    public final void b(float f) {
        LayoutTransition layoutTransition;
        LayoutTransition layoutTransition2;
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b18a527015d3fb60d26fe7fa438fbf5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b18a527015d3fb60d26fe7fa438fbf5");
            return;
        }
        if (f >= getWidth() / 2) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "54f44175adf4bad953314ce4d059d9b7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "54f44175adf4bad953314ce4d059d9b7");
            } else {
                ViewParent parent = getParent();
                if (parent != null && (parent instanceof FrameLayout) && (layoutTransition = ((FrameLayout) parent).getLayoutTransition()) != null) {
                    layoutTransition.disableTransitionType(2);
                    layoutTransition.disableTransitionType(3);
                    layoutTransition.disableTransitionType(0);
                    layoutTransition.disableTransitionType(1);
                    layoutTransition.disableTransitionType(4);
                }
            }
            ((Activity) this.v).onBackPressed();
            if (!this.o) {
                return;
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "362fd819b84b7b9b5f05b5f6bbdd4c8a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "362fd819b84b7b9b5f05b5f6bbdd4c8a");
            } else {
                ViewParent parent2 = getParent();
                if (parent2 != null && (parent2 instanceof FrameLayout) && (layoutTransition2 = ((FrameLayout) parent2).getLayoutTransition()) != null) {
                    layoutTransition2.enableTransitionType(2);
                    layoutTransition2.enableTransitionType(3);
                    layoutTransition2.enableTransitionType(0);
                    layoutTransition2.enableTransitionType(1);
                    layoutTransition2.enableTransitionType(4);
                }
            }
        }
        scrollTo(0, 0);
    }

    public final boolean a(int i, JSONObject jSONObject) {
        CoverViewRootContainer a2;
        Object[] objArr = {Integer.valueOf(i), jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "919e64a6306572b39a6232a7f08b2c86", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "919e64a6306572b39a6232a7f08b2c86")).booleanValue();
        }
        com.meituan.mmp.lib.widget.f swipeRefreshLayout = getSwipeRefreshLayout();
        if (swipeRefreshLayout != null && jSONObject.has("position")) {
            synchronized (swipeRefreshLayout) {
                CoverViewWrapper a3 = ae.a(swipeRefreshLayout.getCoverViewContainer(), i);
                if (a3 != null) {
                    swipeRefreshLayout.getCoverViewContainer().a(a3, jSONObject);
                    return true;
                }
                CoverViewWrapper a4 = ae.a(swipeRefreshLayout.getUnderCoverViewContainer(), i);
                if (a4 != null) {
                    swipeRefreshLayout.getUnderCoverViewContainer().a(a4, jSONObject);
                    return true;
                }
                CoverViewWrapper a5 = swipeRefreshLayout.a(i, -1);
                if (a5 == null || (a2 = swipeRefreshLayout.a(i)) == null) {
                    return false;
                }
                a2.a(a5, jSONObject);
                return true;
            }
        }
        return false;
    }

    public final boolean a(int i, JsonObject jsonObject) {
        CoverViewRootContainer a2;
        Object[] objArr = {Integer.valueOf(i), jsonObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45ed4d30201acf2eb66dcb5fda92b0fe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45ed4d30201acf2eb66dcb5fda92b0fe")).booleanValue();
        }
        com.meituan.mmp.lib.widget.f swipeRefreshLayout = getSwipeRefreshLayout();
        if (swipeRefreshLayout != null && jsonObject.has("position")) {
            synchronized (swipeRefreshLayout) {
                CoverViewWrapper a3 = ae.a(swipeRefreshLayout.getCoverViewContainer(), i);
                if (a3 != null) {
                    swipeRefreshLayout.getCoverViewContainer().a(a3, jsonObject);
                    return true;
                }
                CoverViewWrapper a4 = ae.a(swipeRefreshLayout.getUnderCoverViewContainer(), i);
                if (a4 != null) {
                    swipeRefreshLayout.getUnderCoverViewContainer().a(a4, jsonObject);
                    return true;
                }
                CoverViewWrapper a5 = swipeRefreshLayout.a(i, -1);
                if (a5 == null || (a2 = swipeRefreshLayout.a(i)) == null) {
                    return false;
                }
                a2.a(a5, jsonObject);
                return true;
            }
        }
        return false;
    }

    public final CoverViewWrapper c(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6db91b7158518154d573ab400d4544f8", RobustBitConfig.DEFAULT_VALUE)) {
            return (CoverViewWrapper) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6db91b7158518154d573ab400d4544f8");
        }
        com.meituan.mmp.lib.widget.f swipeRefreshLayout = getSwipeRefreshLayout();
        if (swipeRefreshLayout == null) {
            return null;
        }
        synchronized (swipeRefreshLayout) {
            CoverViewWrapper a2 = ae.a(swipeRefreshLayout.getCoverViewContainer(), i);
            if (a2 == null) {
                a2 = ae.a(swipeRefreshLayout.getUnderCoverViewContainer(), i);
            }
            if (a2 == null) {
                return swipeRefreshLayout.a(i, i2);
            }
            return a2;
        }
    }

    public final boolean n() {
        View view;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38c6b15bda6474048cbef97b9fccad65", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38c6b15bda6474048cbef97b9fccad65")).booleanValue();
        }
        if (this.e.j == null || (view = this.e.j.get()) == null) {
            return false;
        }
        return view.isAttachedToWindow();
    }

    public final boolean a(View view, JSONObject jSONObject) {
        Object[] objArr = {view, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94fd4055d334cb965d07fb089eb74108", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94fd4055d334cb965d07fb089eb74108")).booleanValue();
        }
        if (view instanceof com.meituan.mmp.lib.api.input.a) {
            ((com.meituan.mmp.lib.api.input.a) view).a(this);
        }
        if (view instanceof com.meituan.mmp.lib.api.input.d) {
            ((com.meituan.mmp.lib.api.input.d) view).a(this);
        } else if (view instanceof com.meituan.mmp.lib.api.web.h) {
            View webView = ((com.meituan.mmp.lib.api.web.h) view).getWebView();
            if (webView instanceof WebView) {
                this.e.j = new WeakReference<>((WebView) webView);
            } else if (webView instanceof MTWebView) {
                this.e.j = new WeakReference<>((MTWebView) webView);
            }
        }
        com.meituan.mmp.lib.widget.f swipeRefreshLayout = getSwipeRefreshLayout();
        if (swipeRefreshLayout == null) {
            return false;
        }
        if (jSONObject.has("mtSinkMode") && jSONObject.optBoolean("mtSinkMode")) {
            this.m = true;
            swipeRefreshLayout.a(true);
            return swipeRefreshLayout.getUnderCoverViewContainer().a(view, jSONObject);
        }
        String b = swipeRefreshLayout.b(jSONObject.optString("parentId"));
        if (jSONObject.has("markerId") || b != null) {
            Object[] objArr2 = {jSONObject, b, swipeRefreshLayout, view};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c9c5ab35c8dfda276a81064ad41d24c4", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c9c5ab35c8dfda276a81064ad41d24c4")).booleanValue();
            }
            String str = "";
            if (jSONObject.has("markerId")) {
                str = jSONObject.optString("markerId");
                jSONObject.remove("parentId");
            }
            if (b == null) {
                b = jSONObject.optString("mapId") + CommonConstant.Symbol.UNDERLINE + str;
            }
            ConcurrentHashMap<String, List<String>> markerViewIdsMap = swipeRefreshLayout.getMarkerViewIdsMap();
            List<String> list = markerViewIdsMap.get(b);
            if (list != null) {
                list.add(jSONObject.optString("viewId"));
                markerViewIdsMap.put(b, list);
            } else if (!TextUtils.isEmpty(jSONObject.optString("markerId"))) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(jSONObject.optString("viewId"));
                markerViewIdsMap.put(b, arrayList);
            }
            if (view instanceof com.meituan.mmp.lib.api.coverview.e) {
                ((com.meituan.mmp.lib.api.coverview.e) view).setIsCustomCallOutView(true);
            }
            return swipeRefreshLayout.a(b).a(view, jSONObject);
        }
        return swipeRefreshLayout.getCoverViewContainer().a(view, jSONObject);
    }

    public final String getPagePath() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f98f82bb5f567b197bd895005c47452f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f98f82bb5f567b197bd895005c47452f") : this.e.getContentUrl();
    }

    public final String getRoutePath() {
        return this.w;
    }

    public final void a(int i, int i2, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ace8f91754c7714f3d44f68764a5675", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ace8f91754c7714f3d44f68764a5675");
        } else if (i != 0) {
            d(i > i2 ? i2 : i);
            if (!z || i <= i2) {
                return;
            }
            this.e.a(i - i2);
        }
    }

    public final void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "006277e67b165d6ed749f5a8ab81a195", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "006277e67b165d6ed749f5a8ab81a195");
        } else {
            this.e.a(i);
        }
    }

    public final int getPan() {
        return this.R;
    }

    public final void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ca31855d66732908e41ce2f995141b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ca31855d66732908e41ce2f995141b3");
            return;
        }
        com.meituan.mmp.lib.widget.f swipeRefreshLayout = getSwipeRefreshLayout();
        if (swipeRefreshLayout == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) swipeRefreshLayout.getLayoutParams();
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
        b.a.a("Keyboard", "adjustPan " + this.R + " -> " + marginLayoutParams.bottomMargin);
        this.R = marginLayoutParams.bottomMargin;
        swipeRefreshLayout.setLayoutParams(marginLayoutParams);
    }

    private void a(String str, final int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2276ac021b3aa57b700f1d2e5d904741", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2276ac021b3aa57b700f1d2e5d904741");
            return;
        }
        for (final com.meituan.mmp.lib.api.input.textarea.c cVar : this.h.values()) {
            if (cVar.a(str)) {
                post(new Runnable() { // from class: com.meituan.mmp.lib.page.e.6
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1f1ad3b44f1d763e2c4729b052fde4a9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1f1ad3b44f1d763e2c4729b052fde4a9");
                        } else {
                            cVar.c(i);
                        }
                    }
                });
            }
        }
    }

    private void t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0dec7cf8f56cc83cb47f86c07095e90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0dec7cf8f56cc83cb47f86c07095e90");
            return;
        }
        for (final com.meituan.mmp.lib.api.input.textarea.c cVar : this.h.values()) {
            post(new Runnable() { // from class: com.meituan.mmp.lib.page.e.7
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a9a9014a3170de26ef941544c5d29557", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a9a9014a3170de26ef941544c5d29557");
                    } else {
                        cVar.G_();
                    }
                }
            });
        }
    }

    public final int getCurrentWebViewPageHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cafc9be21df1411de562fe1ffcab507c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cafc9be21df1411de562fe1ffcab507c")).intValue() : this.e.getWebPageHeight();
    }

    public final int getWebScrollY() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dc2659e0167999e66e3980a0805e085", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dc2659e0167999e66e3980a0805e085")).intValue() : this.e.getWebScrollY();
    }

    public final int getNavigationBarHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17a8491bd73ad99a03757ad87637de03", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17a8491bd73ad99a03757ad87637de03")).intValue() : this.e.getNavigationBarHeight();
    }

    public final Rect getMenuRect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61a162497f5235f8d6c35236ebb9c8a4", RobustBitConfig.DEFAULT_VALUE) ? (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61a162497f5235f8d6c35236ebb9c8a4") : this.e.getMenuRect();
    }

    public final int getKeyboardHeight() {
        return this.F;
    }

    public final int getX5SwipeRefreshLayoutHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "103e3c72b64f12cde745df823ab403fa", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "103e3c72b64f12cde745df823ab403fa")).intValue() : getSwipeRefreshLayout().getHeight();
    }

    private void i(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fd296d3b1e6e29571b958eb4856e0f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fd296d3b1e6e29571b958eb4856e0f6");
            return;
        }
        for (final com.meituan.mmp.lib.api.input.textarea.c cVar : this.h.values()) {
            if (!cVar.a(str)) {
                post(new Runnable() { // from class: com.meituan.mmp.lib.page.e.8
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "32e94714de5ce44cfe9cf64d1592687e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "32e94714de5ce44cfe9cf64d1592687e");
                        } else {
                            cVar.b();
                        }
                    }
                });
            }
        }
    }

    private void u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2efe4402f72d1dc0646f9cb3dd58820", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2efe4402f72d1dc0646f9cb3dd58820");
            return;
        }
        for (final com.meituan.mmp.lib.api.input.textarea.c cVar : this.h.values()) {
            post(new Runnable() { // from class: com.meituan.mmp.lib.page.e.9
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7cf1d40101f5ad4a6dcd93b38952080d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7cf1d40101f5ad4a6dcd93b38952080d");
                    } else {
                        cVar.H_();
                    }
                }
            });
        }
    }

    public final com.meituan.mmp.lib.api.input.textarea.f getTextAreaOriginPositionManager() {
        return this.q;
    }

    public final void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c3017aebdad9fdf171dd27dde448830", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c3017aebdad9fdf171dd27dde448830");
        } else if (this.e != null) {
            this.e.c();
        }
    }

    @Override // com.meituan.mmp.lib.api.web.a
    public final void a(int i, float f, float f2) {
        final int i2 = 0;
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7eac6cb5bd6dbe75f4b3b2a67a247078", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7eac6cb5bd6dbe75f4b3b2a67a247078");
        } else if (i != 1) {
        } else {
            final View view = this.e.j.get();
            if (view == null) {
                com.meituan.mmp.lib.trace.b.e("webview not ready");
                return;
            }
            int c = p.c(f);
            int height = view.getHeight() - this.F;
            if (height > c) {
                return;
            }
            final int i3 = c - height;
            View childAt = ((FrameLayout) ((Activity) this.v).findViewById(16908290)).getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height2 = childAt.getHeight();
            int a2 = az.a(this.v);
            if (!az.a()) {
                i2 = a2;
            } else if (az.c(this.v)) {
                i2 = az.d(this.v);
            }
            this.G = this.F;
            layoutParams.height = ((height2 + this.G) - this.F) + i2;
            childAt.requestLayout();
            if (i3 > i2) {
                view.postDelayed(new Runnable() { // from class: com.meituan.mmp.lib.page.e.10
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "488b42b7ffdbd479ab047d005f7a72a5", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "488b42b7ffdbd479ab047d005f7a72a5");
                            return;
                        }
                        view.scrollBy(0, i3 - i2);
                        view.invalidate();
                    }
                }, 100L);
            }
        }
    }

    public final z.a p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86872af0a0dec044ae3e86eeaa5a6ab9", RobustBitConfig.DEFAULT_VALUE) ? (z.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86872af0a0dec044ae3e86eeaa5a6ab9") : j(getPagePath());
    }

    private z.a j(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5d74c971b6f3d4cdfd6942d5f443abe", RobustBitConfig.DEFAULT_VALUE) ? (z.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5d74c971b6f3d4cdfd6942d5f443abe") : new z.a(this.t.c(), this.t.g(), str, this.u.y().c(), this.v.hashCode(), hashCode());
    }

    public final void setEnableInterceptBackAction(boolean z) {
        this.o = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public static ChangeQuickRedirect a;
        private WeakReference<g> c;
        private HashMap<String, Object> d;

        public a(g gVar, HashMap<String, Object> hashMap) {
            Object[] objArr = {e.this, gVar, hashMap};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b0e67d39f3edf170e253e0c72f179dc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b0e67d39f3edf170e253e0c72f179dc");
                return;
            }
            this.c = new WeakReference<>(gVar);
            this.d = hashMap;
            if (e.this.e == null || e.this.e.getAppPage() == null) {
                return;
            }
            AppPage appPage = e.this.e.getAppPage();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = AppPage.a;
            if (PatchProxy.isSupport(objArr2, appPage, changeQuickRedirect2, false, "2628c4fec5061a0f48b66f590aa78add", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, appPage, changeQuickRedirect2, false, "2628c4fec5061a0f48b66f590aa78add");
            } else {
                appPage.h.i.a("mmp.stability.count.white.screen.user.perspective");
            }
        }

        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v34 */
        /* JADX WARN: Type inference failed for: r1v4, types: [boolean, byte] */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v2, types: [boolean, byte] */
        /* JADX WARN: Type inference failed for: r4v20 */
        @Override // java.lang.Runnable
        public final void run() {
            g gVar;
            View view;
            ?? r4;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ffea02b8c2f190d55d45f5c02a12580", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ffea02b8c2f190d55d45f5c02a12580");
            } else if (this.c == null || (gVar = this.c.get()) == null) {
            } else {
                ?? r1 = (e.this.J && gVar == e.this.e) ? 1 : 0;
                if (gVar.j == null || (view = gVar.j.get()) == null || !view.isAttachedToWindow()) {
                    view = gVar;
                    r4 = 0;
                } else {
                    r4 = 1;
                }
                if (view.isAttachedToWindow() && view.isShown()) {
                    String str = "";
                    if (view != null) {
                        if (view instanceof WebView) {
                            str = ((WebView) view).getUrl();
                        } else if (view instanceof MTWebView) {
                            str = ((MTWebView) view).getUrl();
                        }
                    }
                    AppPage appPage = gVar.getAppPage();
                    HashMap<String, Object> hashMap = this.d;
                    Object[] objArr2 = {view, Byte.valueOf((byte) r1), Byte.valueOf((byte) r4), str, hashMap};
                    ChangeQuickRedirect changeQuickRedirect2 = AppPage.a;
                    View view2 = view;
                    if (PatchProxy.isSupport(objArr2, appPage, changeQuickRedirect2, false, "0c73475a341811d26f1438cf42c1fd6a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, appPage, changeQuickRedirect2, false, "0c73475a341811d26f1438cf42c1fd6a");
                    } else {
                        HashMap<String, Object> hashMap2 = new HashMap<>();
                        hashMap2.put("firstRender", Boolean.valueOf(appPage.h.s));
                        hashMap2.put("isWebView", Boolean.valueOf((boolean) r4));
                        hashMap2.put("innerUrl", str);
                        hashMap2.put("isVisible", Boolean.valueOf((boolean) r1));
                        hashMap2.put("lastStatusEvent", appPage.k);
                        if (hashMap != null) {
                            hashMap2.put("isRendererGoneReload", Boolean.TRUE);
                            hashMap2.putAll(hashMap);
                        }
                        if (!appPage.h.s) {
                            hashMap2.put("pageStack", appPage.c.e.d());
                            hashMap2.put("pageNavigation", appPage.c.e.e());
                            hashMap2.put("jsErrors", appPage.c.e.f());
                            appPage.h.i.a("mmp.stability.count.white.screen.user.perspective", hashMap2);
                            appPage.h.i.a("mmp.stability.count.white.screen.first.render", (Map<String, Object>) hashMap2);
                        } else if (r1 != 0) {
                            if (appPage.n) {
                                com.meituan.mmp.lib.trace.b.a("AppPage", "checkWhiteScreen cancel check when page recycling", appPage.h.c);
                            } else if (com.meituan.mmp.lib.config.b.a(com.meituan.mmp.lib.config.a.p(appPage.h.c))) {
                                appPage.h.i.a("mmp.page.duration.white.screen.detection");
                                boolean a2 = bf.a(r4 != 0 ? view2 : appPage.f, false);
                                if (a2) {
                                    hashMap2.put("pageStack", appPage.c.e.d());
                                    hashMap2.put("pageNavigation", appPage.c.e.e());
                                    hashMap2.put("jsErrors", appPage.c.e.f());
                                    appPage.h.i.a("mmp.stability.count.white.screen.user.perspective", hashMap2);
                                }
                                hashMap2.put("isWhiteScreen", Boolean.valueOf(a2));
                                appPage.h.i.a("mmp.page.duration.white.screen.detection", hashMap2);
                            } else {
                                com.meituan.mmp.lib.trace.b.a("AppPage", "checkWhiteScreen no need check", appPage.h.c);
                            }
                        } else {
                            com.meituan.mmp.lib.trace.b.a("AppPage", "checkWhiteScreen invisible", appPage.h.c);
                        }
                    }
                } else {
                    com.meituan.mmp.lib.trace.b.b("Page", "detectView is not show");
                }
                h hVar = e.this.s.e;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = h.a;
                if (PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect3, false, "f6ee5fca59a3eae25b0bf25348825ee5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect3, false, "f6ee5fca59a3eae25b0bf25348825ee5");
                    return;
                }
                hVar.h = false;
                hVar.g.clear();
            }
        }
    }

    public final void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "911da38bf278567816981193774ba869", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "911da38bf278567816981193774ba869");
        } else if (this.e == null) {
        } else {
            this.e.b(this.w);
        }
    }

    public final com.meituan.mmp.lib.page.view.b getWebView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a96dd7359c0fb580809bc458b5b0603a", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.mmp.lib.page.view.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a96dd7359c0fb580809bc458b5b0603a");
        }
        if (this.e == null) {
            return null;
        }
        return this.e.getWebView();
    }

    public e(m mVar, com.meituan.mmp.lib.a aVar, com.meituan.mmp.lib.interfaces.d dVar, aa aaVar, @Nullable com.meituan.mmp.lib.resume.a aVar2, boolean z, boolean z2, boolean z3) {
        super(aVar.f);
        Object[] objArr = {mVar, aVar, dVar, aaVar, aVar2, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69af27a3a7ffa5abb5b8ce3a75dd0d2c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69af27a3a7ffa5abb5b8ce3a75dd0d2c");
            return;
        }
        this.f = new ArrayList<>();
        this.A = new HashMap<>();
        this.B = new HashMap<>();
        this.C = new HashMap<>();
        this.g = false;
        this.h = new ConcurrentHashMap<>();
        this.J = false;
        this.M = 0;
        this.r = true;
        mVar.e.b.b("create.native.view");
        ab.a("new Page: " + aaVar.b + " originUrl:" + aaVar.f);
        this.i = SystemClock.elapsedRealtime();
        this.j = System.currentTimeMillis();
        this.s = mVar;
        this.c = aaVar.g;
        this.t = this.s.d;
        this.u = aVar;
        this.v = aVar.f;
        this.b = dVar;
        this.k = z;
        this.K = z2;
        this.z = aVar2;
        Context context = this.v;
        Object[] objArr2 = {context, aaVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c9b6138a37a0a08349ffc00391b957af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c9b6138a37a0a08349ffc00391b957af");
        } else {
            inflate(context, R.layout.hera_page, this);
            this.x = (FrameLayout) findViewById(R.id.web_layout);
            if (this.c) {
                LinearLayout linearLayout = (LinearLayout) findViewById(R.id.top_layout);
                LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.bottom_layout);
                Object[] objArr3 = {context, linearLayout, linearLayout2, aaVar, aVar2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e5c5ba49d8292db7190fd055b70b2a1f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e5c5ba49d8292db7190fd055b70b2a1f");
                } else {
                    if (aVar2 != null) {
                        this.L = aVar2.d;
                    }
                    com.meituan.mmp.lib.config.a aVar3 = this.t;
                    if (aVar3.f != null ? aVar3.f.a : false) {
                        this.d = null;
                    } else {
                        this.d = new j(context, this.t);
                        this.d.setOnSwitchTabListener(this);
                        if (this.t.k()) {
                            linearLayout2.setVisibility(8);
                            linearLayout.addView(this.d, new RelativeLayout.LayoutParams(-1, -2));
                            ((RelativeLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = p.a();
                        } else {
                            linearLayout2.setVisibility(0);
                            linearLayout2.addView(this.d, new RelativeLayout.LayoutParams(-1, -2));
                        }
                    }
                    this.E = this.t.l();
                    this.D = new g[this.E == null ? 0 : this.E.size()];
                    this.e = f(aaVar.a());
                    this.w = aaVar.b;
                }
            } else {
                Object[] objArr4 = {context, aaVar, aVar2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "eb40aed392ce38d2cd9174902209d361", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "eb40aed392ce38d2cd9174902209d361");
                } else {
                    this.d = null;
                    this.e = a(context, aaVar.b, aVar2 == null ? -1 : aVar2.c);
                    if (aaVar.f != null) {
                        this.B.put(aaVar.b, aaVar.f);
                    }
                }
            }
            r();
        }
        this.w = aaVar.b;
        this.y = this.e;
        a(aaVar.b, this.i, z3, this.j);
        this.h.clear();
        com.meituan.mmp.lib.config.a aVar4 = this.t;
        String str = this.w;
        Object[] objArr5 = {str};
        ChangeQuickRedirect changeQuickRedirect5 = com.meituan.mmp.lib.config.a.a;
        this.o = PatchProxy.isSupport(objArr5, aVar4, changeQuickRedirect5, false, "e80eda174dd88cf3646722679d1228d8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr5, aVar4, changeQuickRedirect5, false, "e80eda174dd88cf3646722679d1228d8")).booleanValue() : "true".equalsIgnoreCase(aVar4.a(str, "enableBeforeUnload"));
        mVar.e.b.a("create.native.view");
        ab.a();
    }

    public final void a(aa aaVar) {
        Object[] objArr = {aaVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ad0899800b2e808c93a7db31c4b5a23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ad0899800b2e808c93a7db31c4b5a23");
        } else if (this.c) {
            c(aaVar);
        } else {
            b(aaVar);
        }
    }

    public final void e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cafcabd7b5d1482619cdeb72f67985ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cafcabd7b5d1482619cdeb72f67985ff");
        } else if (this.c) {
            aa aaVar = new aa(str, "reload");
            aaVar.g = this.c;
            c(aaVar);
        } else {
            Object[] objArr2 = {str, "reload"};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f9460a948dc77a4dae0cdefbdfebbd20", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f9460a948dc77a4dae0cdefbdfebbd20");
                return;
            }
            aa aaVar2 = new aa(str, "reload");
            aaVar2.g = this.c;
            b(aaVar2);
        }
    }
}
