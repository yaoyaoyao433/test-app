package com.meituan.msc.modules.page.render.webview;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Trace;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import com.dianping.titans.utils.Constants;
import com.meituan.dio.easy.DioFile;
import com.meituan.msc.common.utils.am;
import com.meituan.msc.common.utils.az;
import com.meituan.msc.common.utils.r;
import com.meituan.msc.jse.bridge.LazyParseJSONArray;
import com.meituan.msc.modules.container.u;
import com.meituan.msc.modules.page.render.d;
import com.meituan.msc.modules.page.render.webview.WebViewMethods;
import com.meituan.msc.modules.page.render.webview.b;
import com.meituan.msc.modules.preload.MSCHornPreloadConfig;
import com.meituan.msc.modules.update.a;
import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import com.meituan.msc.util.perf.PerfTrace;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e extends b implements g {
    public static ChangeQuickRedirect y;
    public boolean A;
    @NonNull
    public a B;
    public volatile String C;
    g D;
    public final List<PackageInfoWrapper> E;
    boolean F;
    final q G;
    n H;
    private final Object I;
    private String J;
    private int K;
    private final Set<String> L;
    private final Set<String> M;
    private final Set<String> N;
    private final Queue<Runnable> O;
    final String z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends d.b {
        public boolean A;
        public d.c B;
        public boolean C;
        public String p;
        public PackageInfoWrapper q;
        public volatile String r;
        public volatile boolean s;
        public volatile boolean t;
        public boolean u;
        public volatile boolean v;
        public boolean w;
        public volatile boolean x;
        public volatile boolean y;
        public volatile String z;
    }

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "671c37cf2446d965ad5d8e0af0556ec7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "671c37cf2446d965ad5d8e0af0556ec7");
            return;
        }
        this.z = "MSCWebViewRenderer@" + Integer.toHexString(hashCode());
        this.I = new Object();
        this.B = (a) this.k;
        this.K = -1;
        this.E = new CopyOnWriteArrayList();
        this.L = new ConcurrentSkipListSet();
        this.M = new ConcurrentSkipListSet();
        this.N = new ConcurrentSkipListSet();
        q qVar = new q();
        qVar.c = this;
        this.G = qVar;
        this.O = new ConcurrentLinkedQueue();
    }

    @Override // com.meituan.msc.modules.page.render.d
    public final /* synthetic */ d.b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = y;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6fd205a60de589cf97f17db70a32c9e", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6fd205a60de589cf97f17db70a32c9e") : new a();
    }

    @Override // com.meituan.msc.modules.page.render.f
    public final com.meituan.msc.b n() {
        return com.meituan.msc.b.WEBVIEW;
    }

    @Override // com.meituan.msc.modules.page.render.d, com.meituan.msc.modules.page.render.f
    public final void a(Context context, com.meituan.msc.modules.engine.h hVar) {
        Object[] objArr = {context, hVar};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d31ff771334bcaef92dfb33d333744f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d31ff771334bcaef92dfb33d333744f2");
            return;
        }
        com.meituan.msc.modules.reporter.g.d(this.z, "init AppPage, viewId:", Integer.valueOf(j()));
        super.a(context, hVar);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = y;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "efb9cea0da24ab91f9d57acbb58ade10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "efb9cea0da24ab91f9d57acbb58ade10");
        }
        com.meituan.msc.common.executor.a.c(new Runnable() { // from class: com.meituan.msc.modules.page.render.webview.e.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ceac4aee114450a901ea8263e97b3533", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ceac4aee114450a901ea8263e97b3533");
                } else {
                    e.this.A();
                }
            }
        });
    }

    @Override // com.meituan.msc.modules.page.render.f
    public final com.meituan.msc.modules.page.render.h o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = y;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65be55fb9b7fb0e435c18503378c1c1b", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msc.modules.page.render.h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65be55fb9b7fb0e435c18503378c1c1b") : A();
    }

    @UiThread
    public final d A() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c450e9506e08b7fe2f560737497da5c", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c450e9506e08b7fe2f560737497da5c");
        }
        if (this.s == null) {
            E();
        }
        return this.s;
    }

    @Override // com.meituan.msc.modules.page.render.d
    public final Set<com.meituan.msc.modules.manager.k> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = y;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b17c410aa30fd9393cd781e0b58a843e", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b17c410aa30fd9393cd781e0b58a843e") : com.meituan.msc.common.utils.f.a(this.G);
    }

    private void E() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "090bf4004b37b06d17ad7999fd781e5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "090bf4004b37b06d17ad7999fd781e5f");
            return;
        }
        long currentTime = PerfTrace.currentTime();
        this.G.b(this.d);
        this.s = new d(this.c, this.d, 1);
        this.H = F();
        this.G.b = this.H;
        final com.meituan.msc.modules.manager.a aVar = new com.meituan.msc.modules.manager.a() { // from class: com.meituan.msc.modules.page.render.webview.e.6
            public static ChangeQuickRedirect b;

            @Override // com.meituan.msc.modules.manager.a
            public final void a(int i, Object obj) {
                Object[] objArr2 = {Integer.valueOf(i), obj};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "18b3129870f373c11bb1ee8b5eed2593", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "18b3129870f373c11bb1ee8b5eed2593");
                } else {
                    e.this.H.a(i, com.meituan.msc.modules.manager.e.a().a(obj));
                }
            }
        };
        this.s.a(new Object() { // from class: com.meituan.msc.modules.page.render.webview.e.7
            public static ChangeQuickRedirect a;

            @JavascriptInterface
            public final String invoke(String str, String str2, String str3) {
                Object a2;
                Object[] objArr2 = {str, str2, str3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3e7e668813aa65be58ea43979c4f5cae", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3e7e668813aa65be58ea43979c4f5cae");
                }
                if ("onFirstScript".equals(str2)) {
                    com.meituan.msc.modules.reporter.g.d(e.this.z, "onFirstScript");
                }
                if (!e.this.r() || ("WebView".equals(str) && "onFirstScript".equals(str2))) {
                    try {
                        q qVar = e.this.G;
                        LazyParseJSONArray lazyParseJSONArray = new LazyParseJSONArray(str3);
                        com.meituan.msc.modules.manager.a aVar2 = aVar;
                        Object[] objArr3 = {str, str2, lazyParseJSONArray, aVar2};
                        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.modules.manager.k.n;
                        if (PatchProxy.isSupport(objArr3, qVar, changeQuickRedirect3, false, "9b2ddfb83f2a87e3b515b739a944f706", RobustBitConfig.DEFAULT_VALUE)) {
                            a2 = PatchProxy.accessDispatch(objArr3, qVar, changeQuickRedirect3, false, "9b2ddfb83f2a87e3b515b739a944f706");
                        } else if (TextUtils.equals(qVar.J_(), str)) {
                            a2 = com.meituan.msc.modules.manager.l.a(qVar, str2, lazyParseJSONArray, aVar2);
                        } else if (qVar.p == null) {
                            throw new com.meituan.msc.modules.manager.p(String.format("error runtime null , called %s , %s ", str, str2));
                        } else {
                            a2 = qVar.p.a(str, str2, lazyParseJSONArray, aVar2);
                        }
                        return a2 == null ? "[]" : com.meituan.msc.modules.manager.e.b(a2).toString();
                    } catch (Exception e) {
                        e.this.d.q.handleException(e);
                        return com.meituan.msc.modules.manager.e.b(e.getMessage()).toString();
                    }
                }
                return com.meituan.msc.modules.manager.e.b(String.format("ignore invoke %s method %s for recycling", str, str2)).toString();
            }
        }, "NativeBridge");
        this.s.b = this;
        this.s.setOnPageFinishedListener(this);
        PerfTrace.duration("createMSCWebView", currentTime);
    }

    private n F() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = y;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c5208daa13685fa976908c539b565ac", RobustBitConfig.DEFAULT_VALUE) ? (n) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c5208daa13685fa976908c539b565ac") : new n(getPerfEventRecorder()) { // from class: com.meituan.msc.modules.page.render.webview.e.8
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.modules.page.render.webview.n
            public final void a(String str, String str2, String str3, boolean z) {
                Object[] objArr2 = {str, str2, str3, (byte) 1};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fc840ffd3c02effdbce649ffc3a68564", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fc840ffd3c02effdbce649ffc3a68564");
                } else {
                    e.this.c(String.format("javascript:WebViewBridge.invoke('%s','%s', %s)", str, str2, str3), null);
                }
            }

            @Override // com.meituan.msc.modules.page.render.webview.n
            public final void a(int i, JSONArray jSONArray) {
                Object[] objArr2 = {Integer.valueOf(i), jSONArray};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d19cb2877b9191fe4d87f352a41c3c95", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d19cb2877b9191fe4d87f352a41c3c95");
                } else {
                    a(String.format("javascript:WebViewBridge.callback('%s', %s)", Integer.valueOf(i), jSONArray), (ValueCallback<String>) null);
                }
            }

            @Override // com.meituan.msc.modules.page.render.webview.n
            public final void a(String str, @Nullable ValueCallback<String> valueCallback) {
                Object[] objArr2 = {str, valueCallback};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "db493e670ce9cde3fe6aa3cf1ba5fa5c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "db493e670ce9cde3fe6aa3cf1ba5fa5c");
                } else {
                    e.this.a(str, valueCallback);
                }
            }
        };
    }

    public final c B() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfefa6eb147e5dda84afe2b2b2ab88d5", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfefa6eb147e5dda84afe2b2b2ab88d5");
        }
        if (this.s == null) {
            return null;
        }
        return this.s.getIWebView();
    }

    @Override // com.meituan.msc.modules.page.render.j
    public final boolean s() {
        return this.B.a != null;
    }

    public final void C() {
        this.B.t = true;
    }

    @Override // com.meituan.msc.modules.page.render.d
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f16009f13d92dc3220a0a2bacb093af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f16009f13d92dc3220a0a2bacb093af");
            return;
        }
        super.a(str);
        b(new u(str, "appLaunch"));
    }

    private synchronized void a(boolean z) {
        this.B.s = true;
    }

    private synchronized boolean G() {
        return this.B.y;
    }

    private synchronized void b(boolean z) {
        this.B.y = false;
    }

    @Override // com.meituan.msc.modules.page.render.d
    @UiThread
    public final void b(u uVar) {
        Object[] objArr = {uVar};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d796cb6d0f20466dcc8018c89df97e22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d796cb6d0f20466dcc8018c89df97e22");
            return;
        }
        Trace.beginSection("AppPage.loadPage");
        a(uVar, false);
        b(false);
        Trace.endSection();
    }

    @Override // com.meituan.msc.modules.page.render.j
    @WorkerThread
    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da8579641eabe1ad1dd79354ca9740e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da8579641eabe1ad1dd79354ca9740e4");
            return;
        }
        synchronized (this) {
            if (this.B.s) {
                com.meituan.msc.modules.reporter.g.d(this.z, "canceled preloadPage because some page already loaded");
            } else if (this.B.t) {
                com.meituan.msc.modules.reporter.g.d(this.z, "canceled preloadPage because page is reserved for launch");
            } else {
                com.meituan.msc.modules.reporter.g.d(this.z, "preloadPage:", str);
                this.B.y = true;
                u uVar = new u(str, "appLaunch");
                Trace.beginSection("AppPage.preloadPage");
                a(uVar, true);
                Trace.endSection();
            }
        }
    }

    private void a(u uVar, boolean z) {
        Object[] objArr = {uVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c7c5b877ee5319243032144858bc299", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c7c5b877ee5319243032144858bc299");
            return;
        }
        super.a(uVar.a);
        a(true);
        this.B.v = z;
        this.B.a = uVar.a;
        this.B.p = uVar.b;
        String b = am.b(this.B.a);
        this.L.add(b);
        this.B.q = this.d.r.q(b);
        if (this.B.q == null) {
            throw new com.meituan.msc.modules.manager.p("mPackageInfo error" + this.d.v + this.d.r + this.d.r.h + this.d.r.h.mainPackageCached);
        }
        if (!z) {
            a("lastStatusEventWhenLaunch", this.J);
        }
        if (!G() || z) {
            a(new com.meituan.msc.modules.engine.o() { // from class: com.meituan.msc.modules.page.render.webview.e.9
                public static ChangeQuickRedirect a;

                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(String str) {
                    String str2 = str;
                    Object[] objArr2 = {str2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1aefb7af1017452d23e6791ea82782a7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1aefb7af1017452d23e6791ea82782a7");
                        return;
                    }
                    com.meituan.msc.modules.reporter.g.d(e.this.z, "loadBasicPackages onReceiveValue", str2);
                    e.this.D();
                }

                @Override // com.meituan.msc.modules.engine.o
                public final void a(Exception exc) {
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "04594566d4c7534aa84876e96f7290bb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "04594566d4c7534aa84876e96f7290bb");
                        return;
                    }
                    ((com.meituan.msc.modules.engine.c) e.this.d.c(com.meituan.msc.modules.engine.c.class)).b(e.this);
                    if (e.this.D != null) {
                        g gVar = e.this.D;
                        gVar.a(new com.meituan.msc.modules.apploader.events.a(MapConstant.LayerPropertyFlag_MarkerSpacing, "load basic packages failed " + e.this.B.a, exc));
                    }
                }
            });
        }
        H();
        if (z) {
            return;
        }
        b(this.B.r);
        f(this.B.r);
        this.B.r = null;
        a(uVar);
        synchronized (this.O) {
            M();
            this.B.u = true;
        }
        b(String.format("if (typeof __mpInfo === 'undefined') {var __mpInfo = {};}; __mpInfo.appId='%s'; __mpInfo.url='%s';", this.d.a(), this.B.a), null);
    }

    private void H() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51f93b97dc4fd3462cd84c30856eb5fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51f93b97dc4fd3462cd84c30856eb5fd");
        } else if (this.B.x) {
        } else {
            synchronized (this.I) {
                if (this.B.x) {
                    return;
                }
                this.B.C = true;
                if (this.B.z != null) {
                    this.B.r = k.a(this.B.z, this.d.r, this.B.a, j(), this.B.p);
                    this.B.z = null;
                } else {
                    this.B.r = k.a(this.d.r, this.B.a, j(), this.B.p);
                    com.meituan.msc.common.executor.a.c(new Runnable() { // from class: com.meituan.msc.modules.page.render.webview.e.10
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "71c3ea0741b172f604ca0e7dc30fbc75", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "71c3ea0741b172f604ca0e7dc30fbc75");
                            } else {
                                e.this.f(e.this.B.r);
                            }
                        }
                    });
                }
                a("useRenderCache", Boolean.valueOf(this.B.C));
                this.B.x = true;
            }
        }
    }

    @Override // com.meituan.msc.modules.page.render.j
    public final void a(@Nullable List<String> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c76c452c2f6b296cf21f911e68b5cf9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c76c452c2f6b296cf21f911e68b5cf9");
        } else if (!list.isEmpty()) {
            this.B.w = true;
            for (String str : list) {
                this.N.add(am.b(str));
            }
            for (final String str2 : this.N) {
                PackageInfoWrapper u = this.d.r.u(str2);
                if (u == null) {
                    u = this.d.r.E();
                }
                PackageInfoWrapper packageInfoWrapper = u;
                if (packageInfoWrapper != null) {
                    if (!packageInfoWrapper.isSourceReady) {
                        com.meituan.msc.modules.reporter.g.d(this.z, "need download subPackage", packageInfoWrapper.getPackageName(), " to preload resource:", str2);
                        Object[] objArr2 = {packageInfoWrapper, str2};
                        ChangeQuickRedirect changeQuickRedirect2 = y;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2c7c330c39ae9f49c50f6b834e8d8f7f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2c7c330c39ae9f49c50f6b834e8d8f7f");
                        } else {
                            com.meituan.msc.modules.update.pkg.d.a().a(this.d.o, packageInfoWrapper, new com.meituan.msc.modules.update.pkg.b<PackageInfoWrapper>() { // from class: com.meituan.msc.modules.page.render.webview.e.11
                                public static ChangeQuickRedirect a;

                                @Override // com.meituan.msc.modules.update.pkg.b
                                public final /* synthetic */ void a(@NonNull PackageInfoWrapper packageInfoWrapper2) {
                                    PackageInfoWrapper packageInfoWrapper3 = packageInfoWrapper2;
                                    Object[] objArr3 = {packageInfoWrapper3};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0bb732d368f45d63dd69451de8909a58", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0bb732d368f45d63dd69451de8909a58");
                                        return;
                                    }
                                    com.meituan.msc.modules.reporter.g.d(e.this.z, "subPackage download success, continue preload resource:", str2);
                                    e.this.I();
                                    e.this.d.G.a(packageInfoWrapper3);
                                }

                                @Override // com.meituan.msc.modules.update.pkg.b
                                public final void a(String str3, Exception exc) {
                                    Object[] objArr3 = {str3, exc};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b69100fb0d8657d96771aab5ce913c0f", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b69100fb0d8657d96771aab5ce913c0f");
                                    } else {
                                        com.meituan.msc.modules.reporter.g.d(e.this.z, "subPackage download failed, cancel resource preload: ", str2);
                                    }
                                }
                            });
                        }
                    } else {
                        I();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd08e5866bcc35670572f1bd5e9e301f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd08e5866bcc35670572f1bd5e9e301f");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it = this.N.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (this.M.contains(next)) {
                    it.remove();
                } else {
                    PackageInfoWrapper w = this.d.r.w(next);
                    if (w != null && w.isSourceReady) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("pagePath", next);
                        jSONObject2.put("packageName", w.getPackageName());
                        jSONArray.put(jSONObject2);
                        it.remove();
                        this.M.add(next);
                        com.meituan.msc.modules.reporter.g.d(this.z, "onPagePreload: ", next);
                    }
                    com.meituan.msc.modules.reporter.g.d(this.z, "package has not be loaded", next);
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject.put("pages", jSONArray);
                WebViewMethods.a(this.H, jSONObject);
            }
        } catch (JSONException e) {
            com.meituan.msc.modules.reporter.g.a(e);
        }
    }

    @Override // com.meituan.msc.modules.page.render.j
    public final Set<String> t() {
        return this.L;
    }

    @Override // com.meituan.msc.modules.page.render.j
    @NonNull
    public final Set<String> u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97967ed7d88cf3ddc03d035fd7cb78fc", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97967ed7d88cf3ddc03d035fd7cb78fc");
        }
        HashSet hashSet = new HashSet(this.M);
        hashSet.addAll(this.N);
        return hashSet;
    }

    public final void D() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cba561e1605f0f21fdc94488f07f311c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cba561e1605f0f21fdc94488f07f311c");
            return;
        }
        a(b.a.g);
        this.s.b(j());
        com.meituan.msc.modules.reporter.g.d(this.z, "onPageStart", this.B.a, this.B.q.getPackageName());
        n nVar = this.H;
        String str = this.B.a;
        String packageName = this.B.q.getPackageName();
        Object[] objArr2 = {nVar, str, packageName};
        ChangeQuickRedirect changeQuickRedirect2 = WebViewMethods.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "bdcd45127b266c688c72d3d1710c7101", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "bdcd45127b266c688c72d3d1710c7101");
        } else {
            ((WebViewMethods.WebViewPageListener) nVar.a(WebViewMethods.WebViewPageListener.class)).onPageStart(str, packageName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @UiThread
    public void f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a8603e283e35455f29576176b98488f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a8603e283e35455f29576176b98488f");
        } else if (this.B.A) {
            com.meituan.msc.modules.reporter.g.d(this.z, "page data was initialized before");
        } else if (TextUtils.isEmpty(str)) {
            com.meituan.msc.modules.reporter.g.d(this.z, "render cache data is empty, cancel sync");
        } else {
            this.B.C = true;
            com.meituan.msc.modules.reporter.g.d(this.z, "use initial data,", com.meituan.msc.common.utils.q.a(str));
            com.meituan.msc.common.framework.c.a().e.a("native_send_initial_data_to_page");
            A();
            WebViewMethods.a(this.H, str);
            this.B.A = true;
        }
    }

    private void b(@Nullable final com.meituan.msc.modules.engine.o oVar) {
        Object[] objArr = {oVar};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a1781a183088e5001d43e43fef18bb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a1781a183088e5001d43e43fef18bb6");
        } else if (this.v.a(b.a.d)) {
        } else {
            PerfTrace.instant("loadBasicPackagesByMerge");
            com.meituan.msc.modules.reporter.g.d(this.z, "loadBasicPackagesByMerge start");
            a(b.a.d);
            final String J = J();
            if (J == null && oVar != null) {
                oVar.a(new RuntimeException("load basic packages failed"));
            }
            com.meituan.msc.common.executor.a.c(new Runnable() { // from class: com.meituan.msc.modules.page.render.webview.e.12
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a320277b0b9a1c7c7b1316dabd2a5390", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a320277b0b9a1c7c7b1316dabd2a5390");
                        return;
                    }
                    com.meituan.msc.modules.reporter.g.d(e.this.z, "loadBasicPackagesByMerge runOnUiThread");
                    e.this.A();
                    e.this.s.a("file:///__framework/template.html", J, Constants.MIME_TYPE_HTML, "utf-8", null);
                    if (!e.this.B.t) {
                        e.this.s.q();
                    }
                    if (oVar != null) {
                        oVar.onReceiveValue("load basic packages successfully");
                    }
                }
            });
        }
    }

    private String J() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "399d71e40eae259ffc4633130f3576e3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "399d71e40eae259ffc4633130f3576e3");
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject();
            com.meituan.msc.modules.apploader.c.a(jSONObject);
            arrayList.add("__systemInfo=" + jSONObject.toString());
            if (s()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("pagePath", this.B.a);
                jSONObject2.put("packageName", this.B.q.getPackageName());
                arrayList.add("__startPageParam=" + jSONObject2.toString());
            }
            arrayList.add(String.format("if (typeof __mpInfo === 'undefined') {var __mpInfo = {};}; __mpInfo.appId='%s'; __mpInfo.url='%s';", this.d.a(), this.B.a));
        } catch (JSONException e) {
            com.meituan.msc.modules.reporter.g.a(e);
        }
        if (!this.E.contains(this.e.i)) {
            String a2 = a(this.e.i);
            if (a2 == null) {
                return null;
            }
            arrayList.add(a2);
        }
        PackageInfoWrapper E = this.e.E();
        if (!this.E.contains(E)) {
            String a3 = a(E);
            if (a3 == null) {
                return null;
            }
            arrayList.add(a3);
        }
        String str = this.z;
        com.meituan.msc.modules.reporter.g.d(str, "load blank template view@" + j());
        StringBuilder sb = new StringBuilder();
        sb.append("\n<!DOCTYPE html>\n<html lang=\"zh_CN\">\n<head>\n <meta charset=\"UTF-8\">\n <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, viewport-fit=cover\">\n <script>\n   window.__isPagePreloadMode = true\n </script>\n</head>\n<body>\n");
        for (int i = 0; i < arrayList.size(); i++) {
            sb.append("<script>\n");
            sb.append((String) arrayList.get(i));
            sb.append("\n</script>\n");
        }
        sb.append("\n</body>\n</html>");
        a("snapshotTemplate", "blankTemplate");
        arrayList.clear();
        return sb.toString();
    }

    private String a(PackageInfoWrapper packageInfoWrapper) {
        Object[] objArr = {packageInfoWrapper};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2eadb2afa2566527fbbf4b47c97fcf5b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2eadb2afa2566527fbbf4b47c97fcf5b");
        }
        if (packageInfoWrapper == null) {
            return null;
        }
        this.E.add(packageInfoWrapper);
        DioFile pageBootStrapFile = packageInfoWrapper.getPageBootStrapFile();
        if (pageBootStrapFile.c()) {
            try {
                return r.a(pageBootStrapFile);
            } catch (IOException e) {
                com.meituan.msc.modules.reporter.g.a(e);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String K() {
        String str;
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2d1283b3c402825555db3918acc41e4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2d1283b3c402825555db3918acc41e4");
        }
        com.meituan.msc.modules.reporter.g.d(this.z, "try getSnapshotTemplate()", Integer.valueOf(j()));
        com.meituan.msc.modules.update.f fVar = this.d.r;
        String str2 = this.B.a;
        Object[] objArr2 = {fVar, str2};
        ChangeQuickRedirect changeQuickRedirect2 = l.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "504e4163788871b05e3472754ae15a67", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "504e4163788871b05e3472754ae15a67");
        } else if (l.a(fVar, str2)) {
            Object[] objArr3 = {fVar, str2};
            ChangeQuickRedirect changeQuickRedirect3 = k.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "bddc416340be46242c49e6a9280fe9e0", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "bddc416340be46242c49e6a9280fe9e0");
            } else {
                String str3 = "";
                String c = k.c(fVar, str2);
                SharedPreferences a2 = k.a(fVar.j());
                if (a2.contains(c)) {
                    str3 = k.a(a2, c, "");
                } else {
                    com.meituan.msc.modules.reporter.g.b("RenderingCacheModule", "snapshot template cache not found for ", c);
                }
                com.meituan.msc.modules.reporter.g.b("RenderingCacheModule", "obtainSnapshotTemplate: return ", com.meituan.msc.common.utils.q.a(str3));
                str = str3;
            }
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            com.meituan.msc.modules.reporter.g.d(this.z, "load snapshot template view@" + j());
            a("snapshotTemplate", "runtimeTemplate");
            return str;
        }
        String str4 = this.B.a;
        Object[] objArr4 = {fVar, str4};
        ChangeQuickRedirect changeQuickRedirect4 = l.a;
        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "67f1381a702b87410001ffc8ca7ab1f6", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "67f1381a702b87410001ffc8ca7ab1f6")).booleanValue();
        } else if (l.a(fVar, str4) && com.meituan.msc.common.config.b.f()) {
            z = true;
        }
        if (z) {
            String a3 = l.a(this.B, j());
            if (TextUtils.isEmpty(a3)) {
                return a3;
            }
            a("snapshotTemplate", "compliedTemplate");
            return a3;
        }
        return null;
    }

    @Override // com.meituan.msc.modules.page.render.d
    public final void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b343bd5160736370254d59165c777a91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b343bd5160736370254d59165c777a91");
        } else if (this.H == null) {
        } else {
            n nVar = this.H;
            Object[] objArr2 = {nVar};
            ChangeQuickRedirect changeQuickRedirect2 = WebViewMethods.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2c55bd2cbe61b4bfdcfbd9bbb4e04cb3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2c55bd2cbe61b4bfdcfbd9bbb4e04cb3");
            } else {
                ((WebViewMethods.WebViewPageListener) nVar.a(WebViewMethods.WebViewPageListener.class)).onUserTapBackToTop();
            }
        }
    }

    @Override // com.meituan.msc.modules.page.render.j
    public final void a(@Nullable com.meituan.msc.modules.engine.o oVar) {
        Object[] objArr = {oVar};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cff9e0ee5e45421c62b57803e55492d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cff9e0ee5e45421c62b57803e55492d");
        } else if (this.e.v()) {
            PerfTrace.instant("loadBasicPackages");
            String str = this.z;
            com.meituan.msc.modules.reporter.g.d(str, "loadBasicPackages view@" + j() + this.e);
            String K = K();
            if (this.E.isEmpty() && MSCHornPreloadConfig.g() && K == null) {
                b(oVar);
            } else {
                a(oVar, K);
            }
        }
    }

    private void a(@Nullable final com.meituan.msc.modules.engine.o oVar, final String str) {
        Object[] objArr = {oVar, str};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cf6814be71441ea51ad95747c21b0af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cf6814be71441ea51ad95747c21b0af");
            return;
        }
        PerfTrace.instant("loadBasicPackagesByInject");
        a(this.e.i, new com.meituan.msc.modules.engine.o() { // from class: com.meituan.msc.modules.page.render.webview.e.13
            public static ChangeQuickRedirect a;

            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(String str2) {
                Object[] objArr2 = {str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7acaa108557157b96c83ef99d80411f6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7acaa108557157b96c83ef99d80411f6");
                } else {
                    e.this.a(e.this.e.E(), oVar, str);
                }
            }

            @Override // com.meituan.msc.modules.engine.o
            public final void a(Exception exc) {
                Object[] objArr2 = {exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9aa391157a1d3a95ae1299c02d323e5b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9aa391157a1d3a95ae1299c02d323e5b");
                } else if (oVar != null) {
                    oVar.a(exc);
                }
            }
        }, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final PackageInfoWrapper packageInfoWrapper, @Nullable final com.meituan.msc.modules.engine.o oVar, String str) {
        Object[] objArr = {packageInfoWrapper, oVar, str};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2d526ad9636c706a1d8b5e6061d9753", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2d526ad9636c706a1d8b5e6061d9753");
        } else if (packageInfoWrapper == null) {
            com.meituan.msc.modules.reporter.g.a("AppPage#loadPagePackage", "empty package");
        } else {
            g(str);
            if (!this.E.contains(packageInfoWrapper)) {
                com.meituan.msc.modules.reporter.g.d("AppPage#loadPagePackage view@" + j(), packageInfoWrapper);
                this.E.add(packageInfoWrapper);
                a(packageInfoWrapper, new com.meituan.msc.modules.engine.o() { // from class: com.meituan.msc.modules.page.render.webview.e.2
                    public static ChangeQuickRedirect a;

                    @Override // android.webkit.ValueCallback
                    public final /* synthetic */ void onReceiveValue(String str2) {
                        String str3 = str2;
                        Object[] objArr2 = {str3};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1b0aa3316289f419ae064f5c076d167e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1b0aa3316289f419ae064f5c076d167e");
                            return;
                        }
                        if (oVar != null) {
                            oVar.onReceiveValue(str3);
                        }
                        com.meituan.msc.modules.reporter.g.d("AppPage", "loadPackageSuccess view@", Integer.valueOf(e.this.j()), packageInfoWrapper);
                    }

                    @Override // com.meituan.msc.modules.engine.o
                    public final void a(Exception exc) {
                        Object[] objArr2 = {exc};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b219253445352900750aa71ea91469ee", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b219253445352900750aa71ea91469ee");
                            return;
                        }
                        if (oVar != null) {
                            oVar.a(exc);
                        }
                        com.meituan.msc.modules.reporter.g.a("AppPage#loadPackageFailed view@" + e.this.j(), exc);
                    }
                });
                return;
            }
            com.meituan.msc.modules.reporter.g.d("AppPage#loadPagePackage already exist view@" + j(), packageInfoWrapper);
            if (oVar != null) {
                oVar.onReceiveValue(null);
            }
        }
    }

    private boolean g(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a521264398ceebc4f90731992f2000c8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a521264398ceebc4f90731992f2000c8")).booleanValue();
        }
        synchronized (this) {
            if (this.v.a(b.a.d)) {
                return true;
            }
            a(b.a.d);
            if (str == null) {
                str = K();
            }
            if (str == null) {
                String str2 = this.z;
                com.meituan.msc.modules.reporter.g.d(str2, "load blank template view@" + j());
                str = "\n<!DOCTYPE html>\n<html lang=\"zh_CN\">\n<head>\n <meta charset=\"UTF-8\">\n <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, viewport-fit=cover\">\n <script>\n   window.__isPagePreloadMode = true\n </script>\n</head>\n<body>\n\n</body>\n</html>";
                a("snapshotTemplate", "blankTemplate");
            }
            com.meituan.msc.common.executor.a.c(new Runnable() { // from class: com.meituan.msc.modules.page.render.webview.e.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "acf0803777bbbe6509ca6f1ac93fbfd7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "acf0803777bbbe6509ca6f1ac93fbfd7");
                        return;
                    }
                    com.meituan.msc.modules.reporter.g.d(e.this.z, "loadTemplateIfNeed runOnUiThread");
                    e.this.A();
                    e.this.s.a("file:///__framework/template.html", str, Constants.MIME_TYPE_HTML, "utf-8", null);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        com.meituan.msc.modules.apploader.c.a(jSONObject);
                        d dVar = e.this.s;
                        dVar.a("__systemInfo=" + jSONObject.toString(), (ValueCallback<String>) null);
                    } catch (JSONException e) {
                        com.meituan.msc.modules.reporter.g.a(e);
                    }
                    if (!TextUtils.isEmpty(str) && TextUtils.equals(str, e.this.K())) {
                        e.this.F = true;
                    }
                    if (e.this.B.t) {
                        return;
                    }
                    e.this.s.q();
                }
            });
            return true;
        }
    }

    @Override // com.meituan.msc.modules.page.render.d, com.meituan.msc.modules.page.render.g
    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c572a35da6de7f2eb1ede8294cd925f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c572a35da6de7f2eb1ede8294cd925f");
            return;
        }
        super.l();
        this.B.l = true;
        A().l();
        z();
    }

    @Override // com.meituan.msc.modules.page.render.g
    public final void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be822f54a4818e1acdb3e51e94c48d5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be822f54a4818e1acdb3e51e94c48d5a");
            return;
        }
        this.B.l = false;
        A().q();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056 A[RETURN] */
    @Override // com.meituan.msc.modules.page.render.webview.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean x() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.msc.modules.page.render.webview.e.y
            java.lang.String r10 = "a60e290f7c0fc21a07117aa4d39d79cb"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1f
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L1f:
            com.meituan.msc.modules.page.render.webview.e$a r1 = r11.B
            boolean r1 = r1.l
            r2 = 1
            if (r1 != 0) goto L44
            com.meituan.msc.modules.page.render.webview.e$a r1 = r11.B
            boolean r1 = r1.v
            if (r1 != 0) goto L32
            com.meituan.msc.modules.page.render.webview.e$a r1 = r11.B
            boolean r1 = r1.w
            if (r1 == 0) goto L3a
        L32:
            com.meituan.msc.modules.page.render.webview.e$a r1 = r11.B
            boolean r1 = r1.m
            if (r1 != 0) goto L3a
            r1 = 1
            goto L3b
        L3a:
            r1 = 0
        L3b:
            if (r1 != 0) goto L44
            boolean r1 = r11.n
            if (r1 == 0) goto L42
            goto L44
        L42:
            r1 = 0
            goto L45
        L44:
            r1 = 1
        L45:
            boolean r3 = com.meituan.msc.common.config.b.I()
            if (r3 == 0) goto L56
            if (r1 != 0) goto L55
            com.meituan.msc.modules.page.render.webview.e$a r1 = r11.B
            boolean r1 = r1.m
            if (r1 != 0) goto L54
            goto L55
        L54:
            return r0
        L55:
            return r2
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.modules.page.render.webview.e.x():boolean");
    }

    public final void e(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "436e11bd7549d6d085a367678627a742", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "436e11bd7549d6d085a367678627a742");
            return;
        }
        this.B.A = true;
        final com.meituan.msc.modules.update.f fVar = this.e;
        final String str2 = this.B.a;
        Object[] objArr2 = {fVar, str2, str};
        ChangeQuickRedirect changeQuickRedirect2 = k.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "88c5a94e3a15760ebe85cdc9145677d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "88c5a94e3a15760ebe85cdc9145677d9");
        } else if (fVar.j(str2) == a.EnumC0474a.NONE || !com.meituan.msc.common.config.b.d()) {
        } else {
            com.meituan.msc.modules.reporter.g.b("RenderingCacheModule", "saving initialData");
            com.meituan.msc.common.executor.a.b.submit(new Runnable() { // from class: com.meituan.msc.modules.page.render.webview.k.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f3cdbdb4ca890e8630e5ce4b3aa0708b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f3cdbdb4ca890e8630e5ce4b3aa0708b");
                        return;
                    }
                    k.a(com.meituan.msc.modules.update.f.this, str2, (String) null);
                    k.b(com.meituan.msc.modules.update.f.this, str2, str);
                    k.a(com.meituan.msc.modules.update.f.this);
                }
            });
        }
    }

    private boolean L() {
        return this.B.d != null;
    }

    private void a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54c3c5266e8ab6d0d977ed46af900e2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54c3c5266e8ab6d0d977ed46af900e2a");
            return;
        }
        if (L()) {
            this.B.d.a(str, obj);
        }
        if (this.B.j != null) {
            this.B.j.a(str, obj);
        }
    }

    @Override // com.meituan.msc.modules.page.render.d
    public final void a(final HashMap<String, Object> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31298b49e38be84274240c41b8f9bdcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31298b49e38be84274240c41b8f9bdcd");
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.meituan.msc.modules.page.render.webview.e.4
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8829971c0008430dd36c292a3067599b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8829971c0008430dd36c292a3067599b");
                } else {
                    e.super.a(hashMap);
                }
            }
        };
        Object[] objArr2 = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = y;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7164155f86f6bb7bd6643f94525d7906", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7164155f86f6bb7bd6643f94525d7906");
            return;
        }
        synchronized (this.O) {
            if (this.B.u) {
                runnable.run();
            } else {
                this.O.add(runnable);
            }
        }
    }

    private void M() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c44321a7e71fab709e835810b8fb71a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c44321a7e71fab709e835810b8fb71a");
            return;
        }
        while (true) {
            Runnable poll = this.O.poll();
            if (poll == null) {
                return;
            }
            poll.run();
        }
    }

    @Override // com.meituan.msc.modules.page.render.d
    public final int j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = y;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35b130abe6c1efa1a4a2ce538f6ba0f7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35b130abe6c1efa1a4a2ce538f6ba0f7")).intValue() : this.K != -1 ? this.K : hashCode() + this.o;
    }

    @Override // com.meituan.msc.modules.page.render.webview.b, com.meituan.msc.modules.page.render.j
    public final boolean w() {
        d.b bVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d940236d5326e76ace068de4a0cce06f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d940236d5326e76ace068de4a0cce06f")).booleanValue();
        }
        if (!this.v.a(b.a.e)) {
            String str = this.z;
            com.meituan.msc.modules.reporter.g.e(str, "cannot recycle AppPage in state " + this.v);
            return false;
        }
        int j = j();
        String str2 = this.z;
        com.meituan.msc.modules.reporter.g.d(str2, "recycle AppPage that was @" + j + ", " + this.B.a);
        this.s.a("__startPageParam=undefined", (ValueCallback<String>) null);
        this.s.q();
        this.s.setOnRenderProcessGoneListener(null);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.page.render.d.a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "85fe48046f429a90eecc8f0d5187cbc9", RobustBitConfig.DEFAULT_VALUE)) {
            bVar = (d.b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "85fe48046f429a90eecc8f0d5187cbc9");
        } else {
            this.k = a();
            bVar = this.k;
        }
        this.B = (a) bVar;
        this.B.j = com.meituan.msc.modules.page.render.a.a(this.d, this.f, this, null, null, false, null);
        this.K = -1;
        this.C = null;
        super.w();
        n nVar = this.H;
        Object[] objArr3 = {nVar};
        ChangeQuickRedirect changeQuickRedirect3 = WebViewMethods.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "d5e33d945efcb7baac9dd140c37af13b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "d5e33d945efcb7baac9dd140c37af13b");
        } else {
            ((WebViewMethods.WebViewPageListener) nVar.a(WebViewMethods.WebViewPageListener.class)).onPageRecycle();
        }
        this.n = false;
        this.v = b.a.e;
        I();
        String str3 = this.z;
        com.meituan.msc.modules.reporter.g.d(str3, "AppPage recycled, @" + j + " -> @" + j());
        return true;
    }

    @Override // com.meituan.msc.modules.page.render.d, com.meituan.msc.modules.page.render.g
    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca90fc8d2b5774345030206f86cd904a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca90fc8d2b5774345030206f86cd904a");
            return;
        }
        super.k();
        if (this.s != null) {
            this.s.k();
        }
    }

    @Override // com.meituan.msc.modules.page.render.d
    public final boolean a(boolean z, View view, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), view, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c0662957fd6616ed61d17adb6cc6169", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c0662957fd6616ed61d17adb6cc6169")).booleanValue();
        }
        if (!z) {
            view = this.s;
        }
        return az.a(view, false, this.B.a);
    }

    @Override // com.meituan.msc.modules.page.render.d
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4df06ef410b86afab417fbee6ce68d63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4df06ef410b86afab417fbee6ce68d63");
            return;
        }
        super.g();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = y;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fe06648cd29a8fa3fd4997c09b679c96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fe06648cd29a8fa3fd4997c09b679c96");
        } else {
            this.r.post(new Runnable() { // from class: com.meituan.msc.modules.page.render.webview.e.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e66ff304394163ddef79f11fa91e2618", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e66ff304394163ddef79f11fa91e2618");
                        return;
                    }
                    e eVar = e.this;
                    Object[] objArr4 = new Object[2];
                    objArr4[0] = e.this.B.d != null ? Long.valueOf(e.this.B.d.e) : com.meituan.android.common.statistics.Constants.UNDEFINED;
                    objArr4[1] = e.this.B.j != null ? Long.valueOf(e.this.B.j.j) : com.meituan.android.common.statistics.Constants.UNDEFINED;
                    eVar.c(String.format("__appLaunchStartTime = %s;__pageNavigationStartTime = %s;", objArr4), null);
                }
            });
        }
    }

    @Override // com.meituan.msc.modules.page.render.d
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a083faf09dcc7438b98e05a2aa5eb87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a083faf09dcc7438b98e05a2aa5eb87");
            return;
        }
        Object[] objArr2 = {"cancel"};
        ChangeQuickRedirect changeQuickRedirect2 = y;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6751320ba8202f2cf65b44ead1a74f76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6751320ba8202f2cf65b44ead1a74f76");
        } else {
            this.J = "cancel";
            a("lastStatusEvent", this.J);
        }
        Object[] objArr3 = {"cancel", null};
        ChangeQuickRedirect changeQuickRedirect3 = y;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "240d707c0b0035790300448bb73ecd16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "240d707c0b0035790300448bb73ecd16");
        } else if (this.B.B == null) {
            a("cancel", (HashMap<String, Object>) null);
            i();
        }
        super.h();
    }

    @Override // com.meituan.msc.modules.page.render.webview.g
    public final void a(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "355702b37ef0006079f3a4314dd85eeb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "355702b37ef0006079f3a4314dd85eeb");
        } else if (this.D != null) {
            this.D.a(exc);
        }
    }

    @Override // com.meituan.msc.modules.page.render.j
    public final boolean v() {
        return this.F;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5df6d6aa57f09a47e9b90cbbf2978b1c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5df6d6aa57f09a47e9b90cbbf2978b1c");
        }
        return "MSCWebViewRenderer{@" + Integer.toHexString(hashCode()) + ", appId: " + this.e.j() + ", path: " + this.k.a + CommonConstant.Symbol.BIG_BRACKET_RIGHT;
    }

    @Override // com.meituan.msc.modules.page.render.j
    public final /* bridge */ /* synthetic */ com.meituan.msc.modules.page.render.j a(g gVar) {
        this.D = gVar;
        return this;
    }
}
