package com.meituan.msc.modules.engine;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.msc.common.remote.RemoteService;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.jse.bridge.JavaScriptModule;
import com.meituan.msc.jse.bridge.NativeModuleCallExceptionHandler;
import com.meituan.msc.lib.interfaces.IFileModule;
import com.meituan.msc.modules.container.y;
import com.meituan.msc.modules.msi.MSIManagerModule;
import com.meituan.msc.uimanager.as;
import com.meituan.msc.uimanager.av;
import com.meituan.msc.util.perf.PerfEventRecorder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h {
    public static ChangeQuickRedirect a;
    public String A;
    public volatile boolean B;
    public volatile boolean C;
    public JSONObject D;
    public boolean E;
    public r F;
    public final com.meituan.msc.modules.reporter.preformance.c G;
    public s H;
    public boolean I;
    public volatile boolean J;
    public final Handler K;
    private final com.meituan.msc.modules.manager.g L;
    @Nullable
    private com.meituan.msc.modules.devtools.b M;
    private final a N;
    private final com.meituan.msc.modules.page.render.webview.g O;
    public final String b;
    public final int c;
    @Nullable
    public e d;
    public final com.meituan.msc.modules.manager.l e;
    public final com.meituan.msc.modules.apploader.e f;
    public final m g;
    public volatile com.meituan.msc.modules.engine.requestPrefetch.f h;
    public volatile r i;
    public int j;
    public int k;
    public com.meituan.msc.modules.page.render.webview.o l;
    public MSIManagerModule m;
    public com.meituan.msc.modules.reporter.d n;
    public PerfEventRecorder o;
    public final j p;
    public final com.meituan.msc.modules.exception.c q;
    public final com.meituan.msc.modules.update.f r;
    public final com.meituan.msc.modules.update.a s;
    public av t;
    public long u;
    public boolean v;
    public boolean w;
    public volatile boolean x;
    public String y;
    public String z;

    public h() {
        List arrayList;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0df65343612adb2c0cbd9c87ee16f442", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0df65343612adb2c0cbd9c87ee16f442");
            return;
        }
        this.b = "MSCRuntime" + Integer.toHexString(hashCode());
        this.i = r.NEW;
        this.j = 0;
        this.k = 0;
        this.u = 0L;
        this.x = false;
        this.K = new Handler(Looper.getMainLooper());
        this.O = new com.meituan.msc.modules.page.render.webview.g() { // from class: com.meituan.msc.modules.engine.h.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.modules.page.render.webview.g
            public final void a(final Exception exc) {
                Object[] objArr2 = {exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8a6f44aa1dc82e9209f1458353be5b31", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8a6f44aa1dc82e9209f1458353be5b31");
                } else {
                    com.meituan.msc.common.executor.a.b(new Runnable() { // from class: com.meituan.msc.modules.engine.h.5.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "87769a9382320311676bcab96a312d7c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "87769a9382320311676bcab96a312d7c");
                                return;
                            }
                            com.meituan.msc.modules.apploader.e eVar = h.this.f;
                            Exception exc2 = exc;
                            Object[] objArr4 = {exc2};
                            ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msc.modules.apploader.e.a;
                            if (PatchProxy.isSupport(objArr4, eVar, changeQuickRedirect4, false, "c96f1c2963ae481c186792f5e63df600", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, eVar, changeQuickRedirect4, false, "c96f1c2963ae481c186792f5e63df600");
                            } else {
                                eVar.a(new com.meituan.msc.modules.apploader.events.a(1001, "创建引擎失败", exc2));
                            }
                        }
                    });
                }
            }
        };
        this.o = new PerfEventRecorder();
        this.o.a("init_runtime");
        RemoteService.a(MSCEnvHelper.getContext());
        this.L = new com.meituan.msc.modules.manager.g();
        this.e = new com.meituan.msc.modules.manager.l(this);
        this.e.a(com.meituan.msc.modules.exception.b.class, com.meituan.msc.modules.exception.a.class);
        this.q = new com.meituan.msc.modules.exception.c(this);
        this.e.a(com.meituan.msc.modules.container.m.class, com.meituan.msc.modules.container.q.class);
        this.r = new com.meituan.msc.modules.update.f();
        this.s = new com.meituan.msc.modules.update.a();
        this.e.a(this.r, new Class[0]);
        this.e.a(this.s, new Class[0]);
        this.e.a(new com.meituan.msc.modules.viewmanager.g(), com.meituan.msc.modules.viewmanager.g.class);
        this.e.a(com.meituan.msc.modules.navigation.c.class, com.meituan.msc.modules.navigation.a.class);
        this.e.a(com.meituan.msc.modules.env.a.class, new Class[0]);
        this.e.a(y.class, com.meituan.msc.modules.container.s.class);
        this.e.a(com.meituan.msc.modules.core.c.class, IFileModule.class);
        this.n = new com.meituan.msc.modules.reporter.d();
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = j.d;
        this.p = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "18f36c6c358542c167522bc16e71c48f", RobustBitConfig.DEFAULT_VALUE) ? (j) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "18f36c6c358542c167522bc16e71c48f") : new j(com.meituan.msc.modules.reporter.a.a(this), this);
        this.e.a(new com.meituan.msc.modules.update.l(), com.meituan.msc.modules.update.c.class);
        this.f = new com.meituan.msc.modules.apploader.e(MSCEnvHelper.getContext());
        this.e.a(this.f, com.meituan.msc.modules.apploader.a.class);
        this.c = this.f.f();
        this.l = new com.meituan.msc.modules.page.render.webview.o(this);
        this.e.a(com.meituan.msc.modules.api.report.a.class, new Class[0]);
        this.N = new a(this.O);
        this.e.a(this.N, a.class, com.meituan.msc.common.framework.interfaces.a.class);
        this.e.a(new k(this.O), k.class, com.meituan.msc.common.framework.interfaces.a.class);
        this.e.a(new com.meituan.msc.modules.api.legacy.timing.d(), com.meituan.msc.modules.api.legacy.timing.d.class);
        this.e.a(new com.meituan.msc.modules.api.legacy.timing.c(), com.meituan.msc.modules.api.legacy.timing.c.class);
        this.e.a(new com.meituan.msc.modules.api.legacy.appstate.a(), com.meituan.msc.modules.api.legacy.appstate.a.class);
        this.m = new MSIManagerModule();
        this.e.a(this.m, com.meituan.msc.modules.msi.a.class, com.meituan.msc.modules.api.msi.permission.a.class);
        this.e.a(com.meituan.msc.modules.api.report.b.class, new Class[0]);
        this.e.a(com.meituan.msc.modules.api.widget.a.class, new Class[0]);
        this.g = new m();
        this.g.c = this.O;
        this.e.a(this.g, c.class);
        this.e.a(com.meituan.msc.modules.statusbar.a.class, new Class[0]);
        this.e.a(com.meituan.msc.modules.debug.a.class, new Class[0]);
        this.e.a(new com.meituan.msc.modules.core.b(new com.meituan.msc.jse.modules.core.b() { // from class: com.meituan.msc.modules.engine.h.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.jse.modules.core.b
            public final void a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "af21a73d4879807faeb7e310c28f29fe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "af21a73d4879807faeb7e310c28f29fe");
                    return;
                }
                try {
                    if (h.this.b() == null || h.this.b().c() == null) {
                        return;
                    }
                    h.this.b().c().finish();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }), com.meituan.msc.modules.core.a.class);
        this.e.a(com.meituan.msc.modules.sound.a.class, new Class[0]);
        this.e.a(com.meituan.msc.modules.image.a.class, new Class[0]);
        this.e.a(com.meituan.msc.modules.websocket.a.class, new Class[0]);
        this.e.a(com.meituan.msc.modules.core.d.class, new Class[0]);
        this.e.a(com.meituan.msc.modules.api.f.class, new Class[0]);
        this.e.a(com.meituan.msc.modules.api.network.a.class, new Class[0]);
        a("pageFirstRender", new com.meituan.msc.modules.manager.q() { // from class: com.meituan.msc.modules.engine.h.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.modules.manager.q
            public final void a(com.meituan.msc.modules.manager.f fVar) {
                Object[] objArr3 = {fVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "31bd463ab27179354bc11beb1008e933", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "31bd463ab27179354bc11beb1008e933");
                    return;
                }
                com.meituan.msc.modules.reporter.g.d(h.this.b, "onPageFirstRender received ");
                h.this.w = true;
                h.this.a(this);
            }
        });
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6ff923fdb7f46e49b94211c757be8d1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6ff923fdb7f46e49b94211c757be8d1c");
        } else {
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7c547221ae647313dcc1ecaaad2df6b3", RobustBitConfig.DEFAULT_VALUE)) {
                arrayList = (List) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7c547221ae647313dcc1ecaaad2df6b3");
            } else {
                arrayList = new ArrayList();
                arrayList.add(new com.meituan.msc.modules.page.render.rn.d((IFileModule) c(IFileModule.class)));
            }
            List<as> a2 = av.a(arrayList);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new com.meituan.msc.mmpviews.msiviews.d());
            a2.addAll(av.a(arrayList2));
            this.t = new av(a2);
        }
        this.e.a(new com.meituan.msc.modules.viewmanager.i(this.t), com.meituan.msc.modules.viewmanager.i.class);
        this.e.a(com.meituan.msc.modules.mainthread.a.class, new Class[0]);
        this.e.a(com.meituan.msc.modules.manager.s.class, new Class[0]);
        com.meituan.msc.modules.reporter.g.c(this.b, "runtime created");
        this.o.b("init_runtime");
        this.G = new com.meituan.msc.modules.reporter.preformance.c(this);
    }

    public final e a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a00053d05dbcf10403c3d5dd783c30b", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a00053d05dbcf10403c3d5dd783c30b");
        }
        this.d = new e(str, this);
        this.e.a(this.d);
        this.r.g = str;
        if (this.h == null) {
            this.h = new com.meituan.msc.modules.engine.requestPrefetch.f(this);
        }
        return this.d;
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93721bd864456195b88e50d7e37a4002", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93721bd864456195b88e50d7e37a4002");
        }
        if (this.d != null) {
            return this.d.b;
        }
        return null;
    }

    public final com.meituan.msc.modules.container.q b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c70803410ba2e0060ba0bcc9bea36aa9", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msc.modules.container.q) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c70803410ba2e0060ba0bcc9bea36aa9") : (com.meituan.msc.modules.container.q) c(com.meituan.msc.modules.container.q.class);
    }

    public final com.meituan.msc.modules.page.e c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7de147e4ef404ddc43b99bd0a506bcfe", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.modules.page.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7de147e4ef404ddc43b99bd0a506bcfe");
        }
        com.meituan.msc.modules.container.q b = b();
        if (b != null) {
            return b.g();
        }
        return null;
    }

    public final IFileModule d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6cf9eac21d7a15e06f5893a5739d930", RobustBitConfig.DEFAULT_VALUE) ? (IFileModule) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6cf9eac21d7a15e06f5893a5739d930") : (IFileModule) c(IFileModule.class);
    }

    @NonNull
    public final com.meituan.msc.modules.engine.requestPrefetch.f e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50b702ac25180d50a6ec601b83e46ca6", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.modules.engine.requestPrefetch.f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50b702ac25180d50a6ec601b83e46ca6");
        }
        if (this.h == null) {
            this.h = new com.meituan.msc.modules.engine.requestPrefetch.f(this);
        }
        return this.h;
    }

    public final com.meituan.msc.modules.engine.requestPrefetch.f f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "054ae3b325072b01340d8fac48929628", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.modules.engine.requestPrefetch.f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "054ae3b325072b01340d8fac48929628");
        }
        if (this.h != null && this.h.a()) {
            this.h.c();
        }
        if (this.h == null) {
            this.h = new com.meituan.msc.modules.engine.requestPrefetch.f(this);
        }
        return this.h;
    }

    @NonNull
    public final <T extends JavaScriptModule> T a(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ca0f61836cb7def6b586f0087aa7676", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ca0f61836cb7def6b586f0087aa7676") : (T) a(cls, i());
    }

    public final <T extends JavaScriptModule> T a(Class<T> cls, NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
        Object[] objArr = {cls, nativeModuleCallExceptionHandler};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a347abfd07b99e96d7064a2646b59b33", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a347abfd07b99e96d7064a2646b59b33");
        }
        T t = (T) b(cls);
        return t != null ? t : (T) d.a(cls, nativeModuleCallExceptionHandler);
    }

    @Nullable
    public final <T extends JavaScriptModule> T b(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99358fe5fad8bbe7ab9adc2ede4b2b0c", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99358fe5fad8bbe7ab9adc2ede4b2b0c");
        }
        if (this.v) {
            com.meituan.msc.modules.reporter.g.b("getJSModule '" + cls.getName() + "' after destroyed");
            return null;
        } else if (this.N == null) {
            com.meituan.msc.modules.reporter.g.e("getJSModule '" + cls.getName() + "'while service is null");
            return null;
        } else {
            return (T) this.N.a(cls);
        }
    }

    public final <T> T c(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1af017e46854af637ea41ad5d3d97cdf", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1af017e46854af637ea41ad5d3d97cdf");
        }
        T t = (T) this.e.a(cls);
        return t != null ? t : (T) f.a(cls, i());
    }

    public final <T> T d(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9432136b6921f140347ad5c480d42e27", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9432136b6921f140347ad5c480d42e27") : (T) this.e.a(cls);
    }

    public final com.meituan.msc.modules.manager.k b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9b509e555a8c73be691ec3fc6cd6b19", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msc.modules.manager.k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9b509e555a8c73be691ec3fc6cd6b19") : this.e.a(str);
    }

    public final Object a(String str, String str2, JSONArray jSONArray, com.meituan.msc.modules.manager.a aVar) {
        Object[] objArr = {str, str2, jSONArray, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7c81b9aa4ea241e519d7ecaad7d1f6b", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7c81b9aa4ea241e519d7ecaad7d1f6b") : this.e.a(str, str2, jSONArray, aVar);
    }

    public final void a(com.meituan.msc.modules.manager.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6652198cf7dfa1ae7371842711580bb1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6652198cf7dfa1ae7371842711580bb1");
        } else {
            this.L.a(fVar);
        }
    }

    public final void a(String str, com.meituan.msc.modules.manager.q qVar) {
        Object[] objArr = {str, qVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62e245ee4d007103c1f8ee727f508e2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62e245ee4d007103c1f8ee727f508e2c");
        } else {
            this.L.a(str, qVar);
        }
    }

    public final void a(com.meituan.msc.modules.manager.q qVar) {
        Object[] objArr = {qVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c003bbac2cffe165274819826409fb72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c003bbac2cffe165274819826409fb72");
        } else {
            this.L.a(qVar);
        }
    }

    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1eee308b7beae89eb4adeabd6ba2896", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1eee308b7beae89eb4adeabd6ba2896");
        } else {
            this.L.a(str);
        }
    }

    public final void a(String str, Context context, boolean z) {
        Object[] objArr = {str, context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5165bfcf1aa7a50593ceae24396db86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5165bfcf1aa7a50593ceae24396db86");
        } else if (TextUtils.isEmpty(str) || com.meituan.msc.modules.devtools.a.a() == null) {
        } else {
            this.M = com.meituan.msc.modules.devtools.a.a().a(context, this, str, z);
            this.e.a((com.meituan.msc.modules.manager.k) this.M, com.meituan.msc.modules.devtools.b.class);
        }
    }

    public final void a(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1c615198e4e7158c083d8fc337ada28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1c615198e4e7158c083d8fc337ada28");
        } else {
            b(z, str, null);
        }
    }

    private void b(final boolean z, final String str, @Nullable final com.meituan.msc.common.framework.a<Void> aVar) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df089dac58e9f913ac1fb6bfc72d16a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df089dac58e9f913ac1fb6bfc72d16a0");
        } else if (this.v) {
        } else {
            this.K.post(new Runnable() { // from class: com.meituan.msc.modules.engine.h.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7c3e6703a2ef908cd066a39a71e33e58", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7c3e6703a2ef908cd066a39a71e33e58");
                    } else {
                        h.this.a(z, str, aVar);
                    }
                }
            });
        }
    }

    public void b(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f41c0a45f2b027928ebabfe023c17b25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f41c0a45f2b027928ebabfe023c17b25");
        } else {
            a(z, str, (com.meituan.msc.common.framework.a<Void>) null);
        }
    }

    void a(boolean z, String str, @Nullable com.meituan.msc.common.framework.a<Void> aVar) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a84aa8d76a4e44da456276229f4fffd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a84aa8d76a4e44da456276229f4fffd4");
            return;
        }
        this.K.removeCallbacksAndMessages(null);
        if (this.v) {
            com.meituan.msc.modules.reporter.g.e(this.b, "runtime already destroyed");
            return;
        }
        this.v = true;
        this.o.a();
        this.l.b();
        com.meituan.msc.common.framework.c.a().d.clear();
        RemoteService.a();
        if (this.d != null) {
            com.meituan.msc.modules.page.reload.c.a().b(this.d.b);
            if (this.f != null) {
                com.meituan.msc.common.framework.d.b(this.d.b, this.f);
            }
            q.a(this.d);
            if (this.f != null && this.f.h != null) {
                this.f.h.a(this, z);
            }
        }
        if (this.f != null && !this.f.g) {
            this.p.a("reason", str).a(this.f.n() ? "msc.biz.preload.usage.rate" : "msc.base.preload.usage.rate").a(0.0d).c();
        }
        this.L.a();
        this.e.a();
        com.meituan.msc.modules.reporter.g.b(this.b, "destroy runtime:", this);
        if (aVar != null) {
            aVar.a(null);
        }
    }

    public final void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1d14c92e4b1d205cd5461a86ddd50ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1d14c92e4b1d205cd5461a86ddd50ee");
        } else {
            a(str, (com.meituan.msc.common.framework.a<Void>) null);
        }
    }

    public final void a(String str, @Nullable com.meituan.msc.common.framework.a<Void> aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "066ec9ccff32c32023a70e95ef64cd70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "066ec9ccff32c32023a70e95ef64cd70");
        } else if (!g()) {
            if (this.i == r.BASE_PRELOAD) {
                com.meituan.msc.modules.preload.e a2 = com.meituan.msc.modules.preload.e.a();
                a2.b = "destroy runtime," + str;
            }
            com.meituan.msc.modules.reporter.g.d(this.b, "destroyEngineIfNoCountWithCallback", this);
            b(false, str, aVar);
        } else {
            com.meituan.msc.modules.reporter.g.d(this.b, "hasContainerAttached is true");
        }
    }

    public final boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fe97976143a6b06546c776417f050a8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fe97976143a6b06546c776417f050a8")).booleanValue() : b() != null && b().i() > 0;
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f05e4bc7accfce3cf46eef8413f9074e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f05e4bc7accfce3cf46eef8413f9074e");
        } else {
            this.j += i;
        }
    }

    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "177354d52a97b14541d705d850a9e34e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "177354d52a97b14541d705d850a9e34e");
        } else {
            this.k++;
        }
    }

    private com.meituan.msc.modules.exception.c i() {
        if (this.v) {
            return null;
        }
        return this.q;
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8041d7d3c041d6b3194eab0b24b62f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8041d7d3c041d6b3194eab0b24b62f0");
        } else {
            this.u = j;
        }
    }
}
