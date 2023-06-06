package com.meituan.android.mrn.container;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import com.facebook.react.MRNRootView;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactBridge;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.LifecycleState;
import com.meituan.android.common.unionid.oneid.monitor.MonitorManager;
import com.meituan.android.mrn.config.ab;
import com.meituan.android.mrn.config.q;
import com.meituan.android.mrn.config.t;
import com.meituan.android.mrn.container.d;
import com.meituan.android.mrn.container.e;
import com.meituan.android.mrn.engine.MRNBundleManager;
import com.meituan.android.mrn.engine.e;
import com.meituan.android.mrn.engine.k;
import com.meituan.android.mrn.engine.m;
import com.meituan.android.mrn.engine.n;
import com.meituan.android.mrn.engine.o;
import com.meituan.android.mrn.engine.r;
import com.meituan.android.mrn.engine.s;
import com.meituan.android.mrn.engine.z;
import com.meituan.android.mrn.event.listeners.a;
import com.meituan.android.mrn.event.listeners.b;
import com.meituan.android.mrn.event.listeners.c;
import com.meituan.android.mrn.event.listeners.d;
import com.meituan.android.mrn.module.MRNExceptionsManagerModule;
import com.meituan.android.mrn.monitor.h;
import com.meituan.android.mrn.monitor.i;
import com.meituan.android.mrn.utils.a;
import com.meituan.android.mrn.utils.ai;
import com.meituan.android.mrn.utils.p;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.open.SocialConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class g extends com.meituan.android.mrn.container.c implements MRNRootView.a, ReactRootView.b {
    public static ChangeQuickRedirect c;
    private int A;
    private boolean B;
    private com.meituan.android.mrn.container.d C;
    private e D;
    private volatile LifecycleState E;
    private b F;
    private q G;
    private com.meituan.android.mrn.engine.e H;
    private Runnable I;
    private com.meituan.android.mrn.engine.e J;
    private a.InterfaceC0294a K;
    private volatile boolean L;
    private volatile boolean M;
    private volatile boolean N;
    com.facebook.react.devsupport.c d;
    ReactRootView e;
    k f;
    ReactInstanceManager g;
    volatile boolean h;
    boolean i;
    boolean j;
    s k;
    f l;
    public i m;
    public com.meituan.android.mrn.monitor.fsp.b n;
    com.meituan.android.mrn.containerplugin.a o;
    private Application p;
    private WeakReference<com.meituan.android.mrn.container.b> q;
    private Handler r;
    private com.meituan.android.mrn.router.d s;
    private boolean t;
    private volatile boolean u;
    private com.meituan.android.mrn.monitor.response.a v;
    @Deprecated
    private List<Object> w;
    private com.meituan.android.mrn.config.f x;
    private Runnable y;
    private String z;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface b {
        void a(ReactInstanceManager reactInstanceManager);
    }

    public static /* synthetic */ void a(g gVar, ReactInstanceManager reactInstanceManager) {
        Object[] objArr = {reactInstanceManager};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "37875238e4d4f7b8b15b011dbf9de632", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "37875238e4d4f7b8b15b011dbf9de632");
            return;
        }
        p.a("[MRNSceneCompatDelegate@initWhenReactContextReady]", "MRNSceneCompatDelegate：initWhenReactContextReady ");
        if (reactInstanceManager == null || reactInstanceManager.getCurrentReactContext() == null) {
            return;
        }
        if (gVar.F != null) {
            gVar.F.a(reactInstanceManager);
        }
        gVar.r();
        ReactContext currentReactContext = reactInstanceManager.getCurrentReactContext();
        gVar.k = new s(currentReactContext, gVar.n(), gVar.e);
        if (gVar.l != null) {
            f fVar = gVar.l;
            Object[] objArr2 = {currentReactContext};
            ChangeQuickRedirect changeQuickRedirect2 = f.a;
            if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "2cef684c14483109a2a3d4740fe208f0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "2cef684c14483109a2a3d4740fe208f0");
            } else {
                fVar.a(0);
                if (fVar.q != null && fVar.q.c != null) {
                    com.meituan.android.mrn.monitor.c cVar = fVar.q.c;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.mrn.monitor.c.a;
                    if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "b590b2d6ca91f8f8ff57bf8d42f5cbfa", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "b590b2d6ca91f8f8ff57bf8d42f5cbfa");
                    } else {
                        cVar.b.jSEngineDidInitTime = System.currentTimeMillis();
                        if (cVar.d != null) {
                            cVar.d.recordStep("jSEngineDidInit");
                        }
                    }
                }
                if (fVar.p != null) {
                    com.meituan.hotel.android.hplus.diagnoseTool.b.b();
                    fVar.p.e();
                }
                fVar.l = new h(com.facebook.react.modules.core.a.a(), currentReactContext, fVar.n, fVar.o);
                fVar.j = 1;
                fVar.k = System.currentTimeMillis();
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = f.a;
                if (PatchProxy.isSupport(objArr4, fVar, changeQuickRedirect4, false, "f349eee704ffa47d4cc6adc6db90afa9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, fVar, changeQuickRedirect4, false, "f349eee704ffa47d4cc6adc6db90afa9");
                } else {
                    fVar.c().b("MRNCreateBridgeTime", (float) (fVar.c > 0 ? System.currentTimeMillis() - fVar.c : 0L));
                    fVar.s.recordStep("mrn_create_context");
                }
                fVar.d = System.currentTimeMillis();
            }
        }
        if (gVar.n != null) {
            gVar.n.a(reactInstanceManager.getCurrentReactContext());
        }
        if (gVar.v != null) {
            gVar.v.a(reactInstanceManager.getCurrentReactContext());
        }
    }

    public static /* synthetic */ void a(g gVar, k kVar) {
        ReactContext currentReactContext;
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "f9102e6d78a8353f601a36167447bb63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "f9102e6d78a8353f601a36167447bb63");
            return;
        }
        gVar.f = kVar;
        gVar.g = gVar.f.b;
        n.a().b = gVar.f;
        gVar.f.s = gVar.t();
        if (gVar.f != null) {
            gVar.f.r = gVar.m;
        }
        if (gVar.f.c > 0) {
            gVar.f.d = 2;
        }
        gVar.l.m = gVar.f;
        gVar.n.d = kVar;
        if (gVar.v != null) {
            com.meituan.android.mrn.monitor.response.a aVar = gVar.v;
            Object[] objArr2 = {kVar};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.mrn.monitor.response.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "943937d53f6b50715be039c216da76c9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "943937d53f6b50715be039c216da76c9");
            } else if (kVar != null) {
                aVar.b = new WeakReference<>(kVar);
            }
        }
        gVar.l.a(gVar.f);
        if (gVar.f != null) {
            k kVar2 = gVar.f;
            Activity b2 = gVar.b();
            Object[] objArr3 = {b2};
            ChangeQuickRedirect changeQuickRedirect3 = k.a;
            if (PatchProxy.isSupport(objArr3, kVar2, changeQuickRedirect3, false, "5e7096df7ce0bbf8a72e75ecf93f4318", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, kVar2, changeQuickRedirect3, false, "5e7096df7ce0bbf8a72e75ecf93f4318");
            } else {
                ReactInstanceManager reactInstanceManager = kVar2.b;
                if (reactInstanceManager != null && (currentReactContext = reactInstanceManager.getCurrentReactContext()) != null) {
                    currentReactContext.setCurrentActivity(b2);
                }
            }
        }
        p.a("[MRNSceneCompatDelegate@onSceneFetchInstanceReady]", gVar.f);
        gVar.f.c();
        k kVar3 = gVar.f;
        com.meituan.android.mrn.container.b i = gVar.i();
        Object[] objArr4 = {i};
        ChangeQuickRedirect changeQuickRedirect4 = k.a;
        if (PatchProxy.isSupport(objArr4, kVar3, changeQuickRedirect4, false, "28f46154c1bcb9baa7814e9fe45fea22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, kVar3, changeQuickRedirect4, false, "28f46154c1bcb9baa7814e9fe45fea22");
        } else if (i != null) {
            kVar3.n.put(i, null);
        }
        if (gVar.j) {
            gVar.D();
        }
    }

    public static /* synthetic */ boolean a(g gVar, boolean z) {
        gVar.h = false;
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:13|(1:15)(2:60|(1:62)(14:63|17|(1:19)(2:44|(3:46|(1:48)(3:50|(1:52)(1:59)|(2:54|(1:56)(1:57))(1:58))|49))|20|21|22|(1:26)|28|29|30|(1:32)(1:38)|(1:34)|36|37))|16|17|(0)(0)|20|21|22|(2:24|26)|28|29|30|(0)(0)|(0)|36|37) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01b6, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01b7, code lost:
        com.meituan.android.mrn.utils.p.a("[MRNSceneCompatDelegate@startApplication]", "create rootTag error", r0.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a6 A[Catch: JSONException -> 0x01b6, TryCatch #1 {JSONException -> 0x01b6, blocks: (B:48:0x0190, B:53:0x01ac, B:51:0x01a6), top: B:65:0x0190 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ac A[Catch: JSONException -> 0x01b6, TRY_LEAVE, TryCatch #1 {JSONException -> 0x01b6, blocks: (B:48:0x0190, B:53:0x01ac, B:51:0x01a6), top: B:65:0x0190 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void b(com.meituan.android.mrn.container.g r19, com.meituan.android.mrn.engine.e r20) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.mrn.container.g.b(com.meituan.android.mrn.container.g, com.meituan.android.mrn.engine.e):void");
    }

    public static /* synthetic */ boolean b(g gVar, boolean z) {
        gVar.L = true;
        return true;
    }

    public static /* synthetic */ void k(g gVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "31d8f79f03c4741aa0915565a7efcbfd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "31d8f79f03c4741aa0915565a7efcbfd");
            return;
        }
        Object[] objArr2 = {(byte) 1, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "170e597e48ba5a4995f16c788fda340c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "170e597e48ba5a4995f16c788fda340c");
            return;
        }
        p.a("[MRNSceneCompatDelegate@reLoad]", "MRNSceneCompatDelegate：reLoad");
        if (gVar.i() == null || gVar.e == null || gVar.g == null) {
            gVar.a(q.RENDER_ERROR);
            return;
        }
        gVar.l.d(true);
        gVar.l.d();
        gVar.i().i();
        gVar.l();
        gVar.M();
        gVar.O();
        gVar.a(true, true);
    }

    public final ab d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "122420446ca7e11d900f0ce2cac6ae1c", RobustBitConfig.DEFAULT_VALUE) ? (ab) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "122420446ca7e11d900f0ce2cac6ae1c") : q.a(this.G);
    }

    public final int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51109bd8de4ceadf02432047a9c1051a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51109bd8de4ceadf02432047a9c1051a")).intValue();
        }
        if (this.e == null) {
            return -1;
        }
        return this.e.getRootViewTag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <O extends com.meituan.android.mrn.event.d> O a(O o) {
        Object[] objArr = {o};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2820f32bfe5dd1fe368af9e39c9a7469", RobustBitConfig.DEFAULT_VALUE)) {
            return (O) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2820f32bfe5dd1fe368af9e39c9a7469");
        }
        if (o == null) {
            return null;
        }
        o.a(i());
        o.a(this.g != null ? this.g.getCurrentReactContext() : null);
        o.a(o());
        o.a(p());
        if (this.e != null) {
            o.a(this.e.getRootViewTag());
        }
        if (o instanceof b.C0287b) {
            ((b.C0287b) o).a(b());
        }
        return o;
    }

    private <O extends com.meituan.android.mrn.event.h> O a(O o) {
        Object[] objArr = {o};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e8649c3e280985aa1a411da5bdeb30a", RobustBitConfig.DEFAULT_VALUE)) {
            return (O) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e8649c3e280985aa1a411da5bdeb30a");
        }
        if (this.e != null) {
            o.a(this.e.getRootViewTag());
        }
        o.a(this.g != null ? this.g.getCurrentReactContext() : null);
        return o;
    }

    @Deprecated
    public g(Activity activity, com.meituan.android.mrn.container.b bVar) {
        Object[] objArr = {activity, bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a4f308dbd99c689ae86542cc680d37b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a4f308dbd99c689ae86542cc680d37b");
            return;
        }
        this.j = false;
        this.t = false;
        this.u = false;
        this.m = new i();
        this.n = new com.meituan.android.mrn.monitor.fsp.b();
        this.o = new com.meituan.android.mrn.containerplugin.a();
        this.E = LifecycleState.BEFORE_CREATE;
        this.I = new Runnable() { // from class: com.meituan.android.mrn.container.g.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "efe7a5bab257466f50d6fae5377aa431", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "efe7a5bab257466f50d6fae5377aa431");
                } else {
                    g.this.l();
                }
            }
        };
        this.K = new a.InterfaceC0294a() { // from class: com.meituan.android.mrn.container.g.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mrn.utils.a.InterfaceC0294a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b541971c491697f81fbedd90a61144a9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b541971c491697f81fbedd90a61144a9");
                    return;
                }
                p.a("[MRNSceneCompatDelegate@onForeground]", "app进入前台");
                if (g.this.l != null) {
                    g.this.l.f = false;
                }
                if (g.this.f == null || g.this.f.b == null) {
                    return;
                }
                n.a(g.this.f, "AppEnterForeground", g.this.K());
            }

            @Override // com.meituan.android.mrn.utils.a.InterfaceC0294a
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b6d0660cd83cd016ce8d3c0e3f90b222", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b6d0660cd83cd016ce8d3c0e3f90b222");
                    return;
                }
                p.a("[MRNSceneCompatDelegate@onBackground]", "app进入后台");
                if (g.this.l != null) {
                    f fVar = g.this.l;
                    fVar.f = true;
                    fVar.e = true;
                }
                if (g.this.f == null || g.this.f.b == null) {
                    return;
                }
                n.a(g.this.f, "AppEnterBackground", g.this.K());
            }
        };
        this.L = false;
        p.a("[MRNSceneCompatDelegate@MRNSceneCompatDelegate]", activity);
        com.facebook.infer.annotation.a.a(activity);
        com.facebook.infer.annotation.a.a(bVar);
        com.facebook.infer.annotation.a.a(bVar.b());
        com.meituan.android.mrn.config.p.a();
        a(activity);
        this.p = activity.getApplication();
        Object[] objArr2 = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2ae60164bcf6db654bc7b9ea20fdb6cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2ae60164bcf6db654bc7b9ea20fdb6cb");
        } else {
            this.q = new WeakReference<>(bVar);
        }
        this.r = new Handler(Looper.getMainLooper());
        this.e = bVar.b();
        this.e.setEventListener(this);
        this.e.setFmpListener(this.n);
        if (this.e instanceof MRNRootView) {
            ((MRNRootView) this.e).setViewAddedCallback(this);
        }
        this.d = new com.facebook.react.devsupport.c();
        this.h = true;
        com.meituan.android.mrn.utils.a.a().a(this.K);
        if (r.b()) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = c;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3c85c770651a1575f23dd7b752f6627e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3c85c770651a1575f23dd7b752f6627e");
        } else {
            p.a("[MRNSceneCompatDelegate@initMRNLauncher]", "MRNSceneCompatDelegate：initMRNLauncher");
            if (this.p != null) {
                com.meituan.android.mrn.config.c.a();
                z.b(this.p);
            }
        }
        p.a("MRNSceneCompatDelegate@MRNSceneCompatDelegate", "冷启动，cost", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
    }

    public final void a(com.meituan.android.mrn.component.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14039b3f0b9bfee2b4354b114388d865", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14039b3f0b9bfee2b4354b114388d865");
        } else {
            this.m.a(bVar);
        }
    }

    @Deprecated
    public final void a(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0867d2c8a6f28b5317dc890ea3384f8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0867d2c8a6f28b5317dc890ea3384f8e");
            return;
        }
        p.a("[MRNSceneCompatDelegate@onCreate]", "");
        this.u = false;
        this.B = false;
        this.G = null;
        this.L = false;
        this.M = false;
        this.h = true;
        n.a(this.p);
        com.meituan.android.mrn.event.c.b.a(com.meituan.android.mrn.event.listeners.b.c, (b.c<b.d>) a((g) new b.d()));
        B();
        this.n.a(this.e, o(), n());
        this.v = new com.meituan.android.mrn.monitor.response.a(this.e, H(), o(), n());
        this.l = new f(this.p, H(), o(), n(), K(), this.m);
        this.l.t = I();
        this.l.a(this.s);
        com.meituan.android.mrn.router.d p = p();
        this.m.a(m(), this.e, o(), n(), (p == null || p.b == null) ? null : p.b.toString());
        if (com.meituan.android.mrn.config.horn.g.b.a(o())) {
            this.m.a(m());
        }
        this.x = com.meituan.android.mrn.config.r.a(o(), H());
        if ((this.x != null && this.x.a(o()) > 0) || (!TextUtils.isEmpty(this.z) && this.A > 0)) {
            this.y = new Runnable() { // from class: com.meituan.android.mrn.container.g.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2054393671a36dffddfc44fe32af0e98", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2054393671a36dffddfc44fe32af0e98");
                    } else {
                        g.this.a(q.WHITE_SCREEN_ERROR);
                    }
                }
            };
            ai.a(this.y, (TextUtils.isEmpty(this.z) || this.A <= 0) ? this.x.a(o()) : this.A);
        }
        i().i();
        if (TextUtils.isEmpty(o())) {
            this.G = q.BUNDLE_INCOMPLETE;
            i().e();
        } else if (!ReactBridge.isInitialized()) {
            p.a("[MRNSceneCompatDelegate@onCreate]", "ReactBridge init fail");
            a(q.LOAD_SO_FAILED);
        } else if (L()) {
            a((com.meituan.android.mrn.engine.e) null, false);
        } else {
            MRNBundleManager.createInstance(this.p).executeWhenBaseInitialized(new Runnable() { // from class: com.meituan.android.mrn.container.g.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f2bc7de1feff0a8ef189d6fb33e0e0b3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f2bc7de1feff0a8ef189d6fb33e0e0b3");
                    } else {
                        g.this.a(g.this.q(), false);
                    }
                }
            });
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class c extends d.b {
        public static ChangeQuickRedirect a;
        private WeakReference<g> b;
        private boolean c;

        public c(g gVar, boolean z) {
            Object[] objArr = {gVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5dded288625c02d55f0eded1c75441e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5dded288625c02d55f0eded1c75441e");
                return;
            }
            this.b = new WeakReference<>(gVar);
            this.c = z;
        }

        private g a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62243ebe7537b29a576912757454ebd4", RobustBitConfig.DEFAULT_VALUE)) {
                return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62243ebe7537b29a576912757454ebd4");
            }
            if (this.b == null) {
                return null;
            }
            return this.b.get();
        }

        @Override // com.meituan.android.mrn.container.d.b
        public final void a(com.meituan.android.mrn.engine.e eVar, int i) {
            Object[] objArr = {eVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3475fa8a6af9a710ff3dddf1b92c174d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3475fa8a6af9a710ff3dddf1b92c174d");
                return;
            }
            g a2 = a();
            if (a2 == null) {
                return;
            }
            p.a("[MRNSceneCompatDelegate@onFetchBundleSuc]", new Object[0]);
            if (a2.u) {
                p.a("[MRNSceneCompatDelegate@onFetchBundleSuc]", "page is isDestroy");
                return;
            }
            a2.l.g = i;
            a2.l.v = i == 1 ? "net" : NetLogConstants.Details.CACHED;
            a2.n.e = i == 1 ? "net" : NetLogConstants.Details.CACHED;
            a2.l.a(a2.m(), eVar);
            a2.H = eVar;
            MRNBundleManager.sharedInstance().lockBundle(eVar);
            a.C0286a c0286a = (a.C0286a) a2.a((g) new a.C0286a());
            c0286a.a(eVar);
            c0286a.a(i == 1);
            c0286a.b(false);
            com.meituan.android.mrn.event.c.b.a(com.meituan.android.mrn.event.listeners.a.a, (a.c<a.C0286a>) c0286a);
            a2.a(eVar, this.c);
        }

        @Override // com.meituan.android.mrn.container.d.b
        public final void a(q qVar, Throwable th, String str) {
            Object[] objArr = {qVar, null, null};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc4cc6182ce0d069c0b896248d1d133b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc4cc6182ce0d069c0b896248d1d133b");
                return;
            }
            g a2 = a();
            if (a2 == null) {
                return;
            }
            p.a("[MRNSceneCompatDelegate@onFetchBundleFail]", null, Boolean.valueOf(a2.u));
            if (a2.u) {
                return;
            }
            a2.l.g = 1;
            a2.l.v = "net";
            a2.n.e = "net";
            a2.a(qVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z, boolean z2) {
        String str;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2e1c5c7721134e06e091caa1b8c91ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2e1c5c7721134e06e091caa1b8c91ba");
            return;
        }
        String I = I();
        if (z) {
            str = "netFirst";
        } else {
            str = !TextUtils.isEmpty(I) ? SocialConstants.PARAM_SPECIFIED : "cacheFirst";
        }
        this.l.w = str;
        this.n.f = str;
        this.C = new com.meituan.android.mrn.container.d(o(), I, new c(this, z2));
        this.C.a(z);
    }

    private boolean A() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "162283f55e6f68e88b853b722cd0d455", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "162283f55e6f68e88b853b722cd0d455")).booleanValue();
        }
        if (com.meituan.android.mrn.debug.a.a()) {
            com.meituan.android.mrn.debug.interfaces.b.a();
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class d extends e.a {
        public static ChangeQuickRedirect a;
        com.meituan.android.mrn.engine.e b;
        private WeakReference<g> c;

        public d(g gVar, com.meituan.android.mrn.engine.e eVar) {
            Object[] objArr = {gVar, eVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c22cdeccda8ec9358d2437926868b3e5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c22cdeccda8ec9358d2437926868b3e5");
                return;
            }
            this.c = new WeakReference<>(gVar);
            this.b = eVar;
        }

        public final g a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "642161902476bca72fd4694f53c4a57f", RobustBitConfig.DEFAULT_VALUE)) {
                return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "642161902476bca72fd4694f53c4a57f");
            }
            if (this.c == null) {
                return null;
            }
            return this.c.get();
        }

        @Override // com.meituan.android.mrn.container.e.a
        public final void a(k kVar, q qVar) {
            Object[] objArr = {kVar, qVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c2cb478d12d8c5ebbf32e4a4c594e16", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c2cb478d12d8c5ebbf32e4a4c594e16");
                return;
            }
            g a2 = a();
            if (a2 == null) {
                return;
            }
            p.a("[MRNSceneCompatDelegate@onFetchInstanceReady]", kVar);
            if (kVar == null) {
                if (qVar == null) {
                    qVar = q.ERROR_CREATE_MRN_INSTANCE;
                }
                a2.a(qVar);
                return;
            }
            g.a(a2, kVar);
        }

        @Override // com.meituan.android.mrn.container.e.a
        public final void a(ReactContext reactContext, q qVar) {
            Object[] objArr = {reactContext, qVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f18d357c2883941e0c32930124686333", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f18d357c2883941e0c32930124686333");
                return;
            }
            g a2 = a();
            if (a2 == null) {
                return;
            }
            p.a("[MRNSceneCompatDelegate@onFetchContextReady]", "isDestroy:" + a2.u + CommonConstant.Symbol.COMMA + qVar);
            if (a2.u) {
                return;
            }
            if (reactContext == null) {
                if (qVar == null) {
                    qVar = q.ERROR_CREATE_MRN_INSTANCE;
                }
                a2.a(qVar);
                return;
            }
            ai.a(new Runnable() { // from class: com.meituan.android.mrn.container.g.d.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fa61da5e7a1d6122268f166a3a614a88", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fa61da5e7a1d6122268f166a3a614a88");
                        return;
                    }
                    g a3 = d.this.a();
                    if (a3 == null || a3.f == null) {
                        return;
                    }
                    g.a(a3, a3.f.b);
                    a3.i();
                    com.facebook.common.logging.a.a("MRNSceneCompatDelegate", "delegate onCreate startReactApplication");
                    g.b(a3, d.this.b);
                }
            });
        }

        @Override // com.meituan.android.mrn.container.e.a
        public final void a(ReactContext reactContext) {
            Object[] objArr = {reactContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0071d9325bbd9e39e6cdfd21dda7b6b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0071d9325bbd9e39e6cdfd21dda7b6b");
                return;
            }
            g a2 = a();
            if (a2 == null) {
                return;
            }
            p.a("[MRNSceneCompatDelegate@onReFetchContextReady]", "isDestroy:" + a2.u);
            if (a2.u) {
                return;
            }
            ai.a(new Runnable() { // from class: com.meituan.android.mrn.container.g.d.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e7068d182be81c7d85806c806a70ba61", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e7068d182be81c7d85806c806a70ba61");
                        return;
                    }
                    g a3 = d.this.a();
                    if (a3 == null || a3.f == null) {
                        return;
                    }
                    a3.f.f = com.meituan.android.mrn.engine.p.USED;
                    a3.r();
                    a3.l.a(0);
                    g.b(a3, d.this.b);
                }
            });
        }

        @Override // com.meituan.android.mrn.container.e.a
        public final void b(ReactContext reactContext) {
            Object[] objArr = {reactContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "717cfc03d806fd328aad6823ae7c9645", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "717cfc03d806fd328aad6823ae7c9645");
                return;
            }
            g a2 = a();
            if (a2 == null) {
                return;
            }
            p.a("[MRNSceneCompatDelegate@onFetchDebugServerContextReady]", "isDestroy:" + a2.u);
            if (a2.u) {
                return;
            }
            a2.n.a(reactContext);
            if (a2.v != null) {
                a2.v.a(reactContext);
            }
            ai.a(new Runnable() { // from class: com.meituan.android.mrn.container.g.d.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0b9823ac8f24c5c351cdc02273c1cc4c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0b9823ac8f24c5c351cdc02273c1cc4c");
                        return;
                    }
                    g a3 = d.this.a();
                    if (a3 == null) {
                        return;
                    }
                    a3.r();
                    if (a3.g == null || !a3.h) {
                        return;
                    }
                    a3.e.startReactApplication(a3.g, a3.n(), a3.t());
                    g.a(a3, false);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.meituan.android.mrn.engine.e eVar, boolean z) {
        Object[] objArr = {eVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf5c907b9d1fa96faa560a8fc6fd47d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf5c907b9d1fa96faa560a8fc6fd47d3");
            return;
        }
        this.J = eVar;
        this.D = new e(this.p, eVar == null ? o() : eVar.c, eVar == null ? null : eVar.f, I(), i().d(), L(), true, A(), new d(this, eVar));
        this.D.c = G();
        if (z && this.g != null && this.g.hasStartedCreatingInitialContext()) {
            this.D.a(this.g);
        } else {
            this.D.a();
        }
    }

    private void B() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "931757e09d57bc965e302558f8cc7966", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "931757e09d57bc965e302558f8cc7966");
            return;
        }
        Uri uri = null;
        if (p() == null || p().b == null) {
            if (K() != null) {
                p.a("[MRNSceneCompatDelegate@initParamFromUri]", String.format("mrn_emit_params=%s", K().toString()));
            }
        } else {
            uri = p().b;
            p.a("[MRNSceneCompatDelegate@initParamFromUri]", String.format("mrnurl=%s", uri.toString()));
        }
        if (uri == null || TextUtils.isEmpty(uri.getQuery())) {
            return;
        }
        String[] split = uri.getQuery().split("mrn_backup_url=");
        if (split.length == 2) {
            this.z = split[1];
        }
        String queryParameter = uri.getQueryParameter("mrn_over_time");
        if (TextUtils.isEmpty(queryParameter)) {
            return;
        }
        try {
            this.A = Integer.valueOf(queryParameter).intValue();
        } catch (Throwable th) {
            p.a("[MRNSceneCompatDelegate@initParamFromUri]", "overtime parse error:" + th.getMessage());
        }
    }

    @Deprecated
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9f7ac87e91cf644688e7a1bf2c31191", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9f7ac87e91cf644688e7a1bf2c31191");
            return;
        }
        this.j = true;
        p.a("[MRNSceneCompatDelegate@onResume]", new Object[0]);
        D();
        if (!this.i) {
            u();
        }
        if (this.l != null) {
            this.l.a(m());
        }
    }

    private void C() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8b8fd5efea919eec8c20c14a8b17763", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8b8fd5efea919eec8c20c14a8b17763");
            return;
        }
        if (com.meituan.android.mrn.debug.a.a()) {
            com.meituan.android.mrn.debug.interfaces.b.a();
            com.meituan.android.mrn.debug.interfaces.b.a();
        }
        n.a().b = this.f;
        if (this.k != null) {
            s sVar = this.k;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = s.a;
            if (PatchProxy.isSupport(objArr2, sVar, changeQuickRedirect2, false, "9ddfe46af63d684f92f8ce2f7a01495b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, sVar, changeQuickRedirect2, false, "9ddfe46af63d684f92f8ce2f7a01495b");
            } else {
                WritableMap createMap = Arguments.createMap();
                createMap.putString("lifecycle", "ON_HOST_RESUME");
                sVar.a(createMap);
            }
        }
        n.a(this.f, "containerViewDidAppear", K());
        com.meituan.android.mrn.event.g.b.a(com.meituan.android.mrn.event.listeners.d.a, (d.c<d.a>) a((g) new d.a()));
        com.meituan.android.mrn.event.c.b.a(com.meituan.android.mrn.event.listeners.b.d, (b.c<b.a>) a((g) new b.a()));
    }

    public final void b(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01ec612a6a5a97da670e2900b90b21f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01ec612a6a5a97da670e2900b90b21f9");
            return;
        }
        Activity b2 = b();
        if (this.g != null) {
            this.g.onActivityResult(b2, i, i2, intent);
            if (this.g.getCurrentReactContext() != null && this.g.getCurrentReactContext().getCurrentActivity() == null) {
                this.g.getCurrentReactContext().setCurrentActivity(b2);
            }
        }
        if (this.k != null) {
            this.k.a(i, i2, intent);
        }
        com.meituan.android.mrn.services.b.a(b2, i, i2, intent);
        com.meituan.android.mrn.event.c.b.a(com.meituan.android.mrn.event.listeners.c.a, (c.b<c.C0288c>) ((c.C0288c) a((g) new c.C0288c())).b(i).c(i2).a(intent).a(b2));
        com.meituan.android.mrn.services.c.a(b2, i, i2, intent);
        a(i, i2, intent);
        if (this.w == null || this.w.isEmpty()) {
            return;
        }
        Iterator<Object> it = this.w.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void D() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f151de105aefa43f68789f38d39d3c8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f151de105aefa43f68789f38d39d3c8c");
        } else if (this.g != null) {
            this.g.onHostResume(b(), i().j());
        }
    }

    private void E() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e370fb5381c64acbdb031ce1326a9797", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e370fb5381c64acbdb031ce1326a9797");
            return;
        }
        Activity b2 = b();
        if (this.g == null || b2 == null) {
            return;
        }
        try {
            this.g.onHostPause(b2);
        } catch (Throwable unused) {
        }
    }

    @Deprecated
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69b3bd5e13e1bad2bed7021d6684a1f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69b3bd5e13e1bad2bed7021d6684a1f8");
            return;
        }
        this.j = false;
        p.a("[MRNSceneCompatDelegate@onPause]", "");
        if (!this.i) {
            v();
        }
        if (this.m != null) {
            this.m.b(m());
        }
        if (this.l != null) {
            this.l.a();
        }
        E();
    }

    private void F() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bc3f0d7b75701204964ff64359b2b53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bc3f0d7b75701204964ff64359b2b53");
            return;
        }
        if (com.meituan.android.mrn.debug.a.a()) {
            com.meituan.android.mrn.debug.interfaces.b.a();
        }
        if (this.k != null) {
            s sVar = this.k;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = s.a;
            if (PatchProxy.isSupport(objArr2, sVar, changeQuickRedirect2, false, "b35afb3c745f6a7f21b785d1f5da7e8f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, sVar, changeQuickRedirect2, false, "b35afb3c745f6a7f21b785d1f5da7e8f");
            } else {
                WritableMap createMap = Arguments.createMap();
                createMap.putString("lifecycle", "ON_HOST_PAUSE");
                sVar.a(createMap);
            }
        }
        n.a(this.f, "containerViewDidDisappear", K());
        com.meituan.android.mrn.event.g.b.a(com.meituan.android.mrn.event.listeners.d.b, (d.c<d.C0289d>) a((g) new d.C0289d()));
        com.meituan.android.mrn.event.c.b.a(com.meituan.android.mrn.event.listeners.b.e, (b.c<b.e>) a((g) new b.e()));
    }

    public final void h() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "046cc3646774bbfecd410c721a984ba3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "046cc3646774bbfecd410c721a984ba3");
            return;
        }
        p.a("[MRNSceneCompatDelegate@onStop]", "MRNSceneCompatDelegate：onStop");
        if (this.k != null) {
            this.k.a();
        }
        if (this.e != null && (this.e instanceof MRNRootView) && this.e.getChildCount() == 0) {
            z = true;
        }
        if (this.l != null) {
            this.l.a(z);
        }
    }

    public final com.meituan.android.mrn.container.b i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "069989d453900c2b2a9dd059e5f03dc6", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.mrn.container.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "069989d453900c2b2a9dd059e5f03dc6");
        }
        if (this.q == null) {
            return null;
        }
        return this.q.get();
    }

    @Deprecated
    public final void j() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b9442a29ffa6bcf1f1ee55a6501554e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b9442a29ffa6bcf1f1ee55a6501554e");
            return;
        }
        com.meituan.android.mrn.monitor.e.a(this.f);
        this.u = true;
        p.a("[MRNSceneCompatDelegate@onDestroy]", "MRNSceneCompatDelegate：onDestroy");
        N();
        l();
        try {
            com.facebook.react.modules.image.a.a(this.p);
        } catch (Exception unused) {
        }
        if (this.y != null) {
            ai.b(this.y);
        }
        if (this.w != null) {
            this.w.clear();
        }
        if (this.e != null && (this.e instanceof MRNRootView) && this.e.getChildCount() == 0) {
            z = true;
        }
        if (this.l != null) {
            this.l.b(z);
        }
        if (this.n != null) {
            this.n.d(2);
        }
        com.meituan.android.mrn.utils.a.a().b(this.K);
    }

    public final boolean k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14f4cd659543991a8287bdde38396295", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14f4cd659543991a8287bdde38396295")).booleanValue();
        }
        if (this.k != null) {
            this.k.b();
        }
        if (this.f == null || this.f.b == null || ((this.f.i == null && !com.meituan.android.mrn.debug.a.a()) || this.f.f == com.meituan.android.mrn.engine.p.ERROR)) {
            return false;
        }
        this.f.b.onBackPressed();
        return true;
    }

    private String G() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "746cbad9f38ad5a0d0b498541c450416", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "746cbad9f38ad5a0d0b498541c450416");
        }
        com.meituan.android.mrn.router.d p = p();
        if (p == null || TextUtils.isEmpty(p.k)) {
            com.meituan.android.mrn.debug.interfaces.b.a();
            o();
            if (TextUtils.isEmpty(null)) {
                com.meituan.android.mrn.debug.interfaces.b.a();
            }
            return null;
        }
        return p.k;
    }

    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14ca2b733f987a94c2fa5f743f250020", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14ca2b733f987a94c2fa5f743f250020");
            return;
        }
        p.a("[MRNSceneCompatDelegate@unmountReactApplication]", "MRNSceneCompatDelegate：mUnmountReactApplicationAction");
        if (this.e == null || this.h) {
            return;
        }
        this.e.unmountReactApplication();
        this.h = true;
    }

    public final Activity m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b9dc4cac3d25b96e5a149fea26b5ba6", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b9dc4cac3d25b96e5a149fea26b5ba6") : b();
    }

    public final String n() {
        String c2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e266c6637e76699146a0ab18acde0d9a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e266c6637e76699146a0ab18acde0d9a");
        }
        com.meituan.android.mrn.container.b i = i();
        if (com.meituan.android.mrn.debug.a.a()) {
            com.meituan.android.mrn.debug.interfaces.b.a();
            if (p() == null || TextUtils.isEmpty(p().e)) {
                c2 = i.c();
            } else {
                c2 = p().e;
            }
            if (TextUtils.isEmpty(c2)) {
                return null;
            }
            return c2;
        } else if (p() == null || TextUtils.isEmpty(p().e)) {
            return i.c();
        } else {
            return p().e;
        }
    }

    public final String o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee76ab1d6c8ba7d7bd485872b096ac31", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee76ab1d6c8ba7d7bd485872b096ac31");
        }
        if (p() == null || !p().a()) {
            return i().a();
        }
        return p().i;
    }

    private String H() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7bb5473d29873056fb09ecac6e5b00a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7bb5473d29873056fb09ecac6e5b00a");
        }
        String str = (p() == null || !p().a()) ? null : p().c;
        if (TextUtils.isEmpty(str)) {
            String o = o();
            if (!TextUtils.isEmpty(o)) {
                String[] split = o.split(CommonConstant.Symbol.UNDERLINE);
                if (split.length == 3) {
                    return split[1];
                }
            }
            return null;
        }
        return str;
    }

    public final com.meituan.android.mrn.router.d p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ddbf83f69dec3144d00ce7120d85876", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.mrn.router.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ddbf83f69dec3144d00ce7120d85876") : b((Uri) null);
    }

    @Deprecated
    public final void a(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e8ea034f55fc29a383ae9f441541e8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e8ea034f55fc29a383ae9f441541e8e");
        } else if (uri == null) {
        } else {
            this.s = new com.meituan.android.mrn.router.d(uri);
        }
    }

    private com.meituan.android.mrn.router.d b(Uri uri) {
        String str;
        Object[] objArr = {null};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b1a9867cffd2271457fea02a32865cc", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.mrn.router.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b1a9867cffd2271457fea02a32865cc");
        }
        if (this.s == null) {
            if (m() != null && m().getIntent() != null && m().getIntent().getData() != null) {
                this.s = new com.meituan.android.mrn.router.d(m().getIntent().getData());
            }
            if (this.s == null) {
                if (m() == null) {
                    str = "PlainActivity为空";
                } else {
                    str = m().getIntent() == null ? "Intent为空" : "getData()为空";
                }
                p.a("[MRNSceneCompatDelegate@getMRNURL]", "mURL 为空", str);
            }
        }
        return this.s;
    }

    private String I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cad4cd12b16c6dcefab3b26fd573eee7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cad4cd12b16c6dcefab3b26fd573eee7");
        }
        String f = this.s == null ? null : this.s.f();
        String minVersionByBundleName = MRNBundleManager.createInstance(b()).getMinVersionByBundleName(o());
        com.facebook.common.logging.a.b("[MRNSceneCompatDelegate@getMinVersion]", f + " : " + minVersionByBundleName);
        if (TextUtils.isEmpty(f) && TextUtils.isEmpty(minVersionByBundleName)) {
            return null;
        }
        return (TextUtils.isEmpty(f) || TextUtils.isEmpty(minVersionByBundleName)) ? TextUtils.isEmpty(f) ? minVersionByBundleName : f : com.meituan.android.mrn.utils.e.a(f, minVersionByBundleName) < 0 ? minVersionByBundleName : f;
    }

    public final boolean q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "523f81cdc9b8f7de7b1e240a5c9aef37", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "523f81cdc9b8f7de7b1e240a5c9aef37")).booleanValue() : this.s != null && this.s.e();
    }

    public final boolean r() {
        MRNExceptionsManagerModule mRNExceptionsManagerModule;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7679f44b41ccfe31ec26bc5740238ce5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7679f44b41ccfe31ec26bc5740238ce5")).booleanValue();
        }
        try {
            if (this.g != null && this.g.getCurrentReactContext() != null && (mRNExceptionsManagerModule = (MRNExceptionsManagerModule) this.g.getCurrentReactContext().getNativeModule(MRNExceptionsManagerModule.class)) != null) {
                mRNExceptionsManagerModule.addJSCallExceptionInterceptor(i(), new a());
            }
        } catch (Exception e) {
            com.facebook.common.logging.a.d("MRNSceneCompatDelegate", e.getMessage(), e);
        }
        return false;
    }

    private boolean J() {
        MRNExceptionsManagerModule mRNExceptionsManagerModule;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7037e5dc212b550746c9136eb862b1f8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7037e5dc212b550746c9136eb862b1f8")).booleanValue();
        }
        try {
            if (this.g != null && this.g.getCurrentReactContext() != null && (mRNExceptionsManagerModule = (MRNExceptionsManagerModule) this.g.getCurrentReactContext().getNativeModule(MRNExceptionsManagerModule.class)) != null) {
                mRNExceptionsManagerModule.removeJSCallExceptionInterceptor(i());
            }
        } catch (Exception e) {
            com.facebook.common.logging.a.d("MRNSceneCompatDelegate", e.getMessage(), e);
        }
        return false;
    }

    public final h s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1461f16b7b81c4dfe5ab4b8aeab37b26", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1461f16b7b81c4dfe5ab4b8aeab37b26");
        }
        if (this.l != null) {
            return this.l.l;
        }
        return null;
    }

    public final Bundle t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69971624c9263cd5c083327ecb53cd9e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69971624c9263cd5c083327ecb53cd9e");
        }
        Bundle h = i().h();
        if (h == null) {
            h = new Bundle();
        }
        if (!h.containsKey("mrn_page_create_time")) {
            h.putString("mrn_page_create_time", String.valueOf(this.l == null ? 0L : this.l.b));
        }
        if (this.e != null && !h.containsKey("rootTag")) {
            h.putInt("rootTag", this.e.getRootViewTag());
        }
        h.putLong("timeStamp", System.currentTimeMillis());
        if (this.f != null) {
            h.putInt("mrn_fetch_bridge_type", this.f.d);
        }
        Bundle bundle = new Bundle();
        bundle.putString("env", com.meituan.android.mrn.debug.a.d());
        if (this.l != null) {
            bundle.putInt(MonitorManager.RETRYCOUNT, this.l.f());
            bundle.putInt("is_remote", this.l.g);
            bundle.putInt("local_bundle", this.l.h);
        }
        if (this.f != null) {
            bundle.putInt("fetch_bridge_type", this.f.d);
        }
        if (!h.containsKey("mrn_env_params")) {
            h.putBundle("mrn_env_params", bundle);
        }
        return h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WritableMap K() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9b36b7002cf032eccfbf04a1baa4e3f", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9b36b7002cf032eccfbf04a1baa4e3f");
        }
        Bundle t = t();
        if (t == null) {
            t = new Bundle();
        }
        return Arguments.fromBundle(t);
    }

    private boolean L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c594db92e50398639880d36af10ce1d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c594db92e50398639880d36af10ce1d")).booleanValue();
        }
        if (com.meituan.android.mrn.debug.a.a()) {
            if (this.t) {
                return true;
            }
            com.meituan.android.mrn.router.d p = p();
            if (p == null || (!p.j && TextUtils.isEmpty(p.k))) {
                o();
                com.meituan.android.mrn.debug.interfaces.b.a();
                com.meituan.android.mrn.debug.interfaces.b.a();
                return !TextUtils.isEmpty(null);
            }
            return true;
        }
        return false;
    }

    @Override // com.facebook.react.ReactRootView.b
    public final void a(ReactRootView reactRootView) {
        Object[] objArr = {reactRootView};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d88700aee26ba054c47d0c33db7cc93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d88700aee26ba054c47d0c33db7cc93");
            return;
        }
        p.a("[MRNSceneCompatDelegate@onAttachedToReactInstance]", "MRNSceneCompatDelegate：onAttachedToReactInstance");
        if (i() == null || (this.e instanceof MRNRootView)) {
            return;
        }
        if (this.y != null) {
            ai.b(this.y);
        }
        i().f();
        if (this.l != null) {
            this.l.b();
        }
    }

    @Override // com.facebook.react.MRNRootView.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bca882699a8922d886a3e0fe7948e06d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bca882699a8922d886a3e0fe7948e06d");
            return;
        }
        p.a("[MRNSceneCompatDelegate@onViewAdded]", "MRNSceneCompatDelegate：onViewAdded");
        if (!this.N) {
            this.N = true;
            com.meituan.android.mrn.codecache.c a2 = com.meituan.android.mrn.codecache.c.a();
            com.meituan.android.mrn.engine.e eVar = this.J;
            com.meituan.android.mrn.codecache.b bVar = com.meituan.android.mrn.codecache.b.b;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.mrn.codecache.b.a;
            a2.a(eVar, PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "6a6ae54bca9304bc3a0a0bd36cde33f5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "6a6ae54bca9304bc3a0a0bd36cde33f5")).intValue() : ((Integer) t.b.a("CodeCache.executeDelayTimesPage")).intValue());
        }
        if (i() != null) {
            if (this.y != null) {
                ai.b(this.y);
            }
            i().f();
            if (this.l != null) {
                this.l.b();
            }
        }
        this.M = true;
        if (this.f != null) {
            this.f.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class a implements MRNExceptionsManagerModule.a {
        public static ChangeQuickRedirect a;

        private a() {
            Object[] objArr = {g.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79c41aee015621f790673afc19837ee6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79c41aee015621f790673afc19837ee6");
            }
        }

        @Override // com.meituan.android.mrn.module.MRNExceptionsManagerModule.a
        public final boolean a(final String str, ReadableArray readableArray) {
            boolean z = false;
            Object[] objArr = {str, readableArray};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "283921d55b64f2f25cee4a2f77d3c423", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "283921d55b64f2f25cee4a2f77d3c423")).booleanValue();
            }
            p.a("[DelegateJSCallExceptionHandler@handleException]", "MRNSceneCompatDelegate：handleException");
            if (!g.this.M && !g.this.L) {
                z = true;
            }
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.meituan.android.mrn.container.g.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "83dc70cd0f024d64647938a0911987cd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "83dc70cd0f024d64647938a0911987cd");
                    } else if (g.this.e == null || g.this.e.getChildCount() > 0) {
                        p.a("[DelegateJSCallExceptionHandler@run]", "MRNSceneCompatDelegate：mrnJSErrorShowError " + str);
                        g.this.a(q.RUNTIME_JS_ERROR);
                    } else if (g.this.L) {
                        p.a("[DelegateJSCallExceptionHandler@run]", "MRNSceneCompatDelegate：mrnJSErrorLoad " + str);
                        g.this.a(q.RENDER_ERROR);
                    } else {
                        g.b(g.this, true);
                        if (g.this.l != null) {
                            f fVar = g.this.l;
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = f.a;
                            if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "64f215a03411c7f5250775261ef3a9fa", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "64f215a03411c7f5250775261ef3a9fa");
                            } else {
                                fVar.b(q.RENDER_ERROR.Z);
                            }
                        }
                        g.k(g.this);
                    }
                }
            });
            return z;
        }
    }

    private void M() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52e8435a7f1c882291fdb7b3e45ce29c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52e8435a7f1c882291fdb7b3e45ce29c");
            return;
        }
        p.a("[MRNSceneCompatDelegate@deleteBundle]", "MRNSceneCompatDelegate:开始删包");
        com.meituan.android.mrn.engine.e bundle = MRNBundleManager.sharedInstance().getBundle(o());
        if (bundle != null) {
            a(bundle);
            MRNBundleManager.sharedInstance().removeBundleForce(bundle);
            p.a("[MRNSceneCompatDelegate@deleteBundle]", "MRNSceneCompatDelegate:删主包完成 " + bundle.c);
        }
    }

    private void a(com.meituan.android.mrn.engine.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a9290ae64028c05349fb05d0190d89f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a9290ae64028c05349fb05d0190d89f");
        } else if (eVar != null) {
            HashMap hashMap = new HashMap();
            for (k kVar : o.a().b()) {
                if (this.f != kVar && kVar != null && kVar.f == com.meituan.android.mrn.engine.p.USED && kVar.i != null && kVar.i.n != null) {
                    for (e.a aVar : kVar.i.n) {
                        Set set = (Set) hashMap.get(aVar.b);
                        if (set == null) {
                            set = new HashSet();
                            hashMap.put(aVar.b, set);
                        }
                        set.add(aVar.c);
                    }
                }
            }
            if (eVar.n == null || eVar.n.size() <= 0) {
                return;
            }
            for (e.a aVar2 : eVar.n) {
                com.meituan.android.mrn.engine.e bundle = MRNBundleManager.sharedInstance().getBundle(aVar2.b, aVar2.c);
                if (bundle != null) {
                    Set set2 = (Set) hashMap.get(aVar2.b);
                    if (set2 == null || !set2.contains(bundle.f)) {
                        MRNBundleManager.sharedInstance().removeBundleForce(bundle);
                        p.a("[MRNSceneCompatDelegate@deleteBundleDependency]", "MRNSceneCompatDelegate:删子包完成 " + bundle.c);
                    } else {
                        p.a("[MRNSceneCompatDelegate@deleteBundleDependency]", "MRNSceneCompatDelegate:有其他页面使用 " + bundle.c);
                        bundle.p = true;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(q qVar) {
        Object[] objArr = {qVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8b1557afca1b8d56e77a6f102d70094", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8b1557afca1b8d56e77a6f102d70094");
            return;
        }
        if (this.l != null) {
            this.l.u = b(qVar);
            this.l.a(qVar);
        }
        if (qVar == null || i() == null || this.B) {
            return;
        }
        if (qVar == q.RENDER_ERROR || qVar == q.RUNTIME_JS_ERROR) {
            this.n.d(1);
        }
        this.B = true;
        p.a("[MRNSceneCompatDelegate@handleError]", "MRNSceneCompatDelegate:handleError " + qVar.Z);
        if (this.y != null) {
            ai.b(this.y);
        }
        if (qVar == q.RUNTIME_JS_ERROR) {
            c(qVar);
        } else if (!TextUtils.isEmpty(this.z) && m() != null) {
            this.z = com.meituan.android.mrn.router.f.b(this.z);
            p.a("[MRNSceneCompatDelegate@handleError]", "进入兜底页面, backupUrl:" + this.z);
            try {
                m().startActivity(a(this.z));
                m().finish();
            } catch (Throwable th) {
                th.printStackTrace();
                c(qVar);
                new IllegalArgumentException(String.format("The mrn_backup_url params \"%s\" is invalid in bundle \"%s\"", this.z, o()), th);
            }
        } else {
            if (this.x != null) {
                Object[] objArr2 = new Object[1];
                StringBuilder sb = new StringBuilder("MRNSceneCompatDelegate:handleError 进入native业务兜底");
                sb.append(qVar.Z);
                sb.append(StringUtil.SPACE);
                sb.append(i() == null);
                objArr2[0] = sb.toString();
                p.a("[MRNSceneCompatDelegate@handleError]", objArr2);
                if (this.x.a(i(), qVar) || qVar == q.WHITE_SCREEN_ERROR) {
                    return;
                }
            }
            c(qVar);
        }
    }

    private Intent a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe0c7ab34b4cd6cb5b52928ffce8905f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe0c7ab34b4cd6cb5b52928ffce8905f");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        if (p() != null && p().b != null) {
            Uri uri = p().b;
            for (String str2 : uri.getQueryParameterNames()) {
                if (!TextUtils.equals(str2, "mrn_backup_url")) {
                    buildUpon.appendQueryParameter(str2, uri.getQueryParameter(str2));
                }
            }
        }
        Intent intent = new Intent("android.intent.action.VIEW", buildUpon.build());
        com.meituan.android.mrn.container.b i = i();
        if (i instanceof Activity) {
            Activity activity = (Activity) i;
            if (activity.getIntent() != null && activity.getIntent().getExtras() != null) {
                intent.putExtras(activity.getIntent().getExtras());
            }
        } else if (i instanceof Fragment) {
            Fragment fragment = (Fragment) i;
            if (fragment.getArguments() != null) {
                intent.putExtras(fragment.getArguments());
            }
        }
        return intent;
    }

    private boolean b(q qVar) {
        Object[] objArr = {qVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f75aaef94131ec68e3dbe579b6488c1c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f75aaef94131ec68e3dbe579b6488c1c")).booleanValue();
        }
        return (!TextUtils.isEmpty(this.z) && m() != null) || (this.x != null && !this.x.a(i(), qVar) && qVar != q.WHITE_SCREEN_ERROR);
    }

    private void c(q qVar) {
        Object[] objArr = {qVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d57d3037f3565453b5b51c246497e63f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d57d3037f3565453b5b51c246497e63f");
            return;
        }
        this.G = qVar;
        i().e();
        com.meituan.android.mrn.utils.s.a(this.f);
    }

    public final void a(b bVar) {
        this.F = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30e9aaaf1337abfba896dff99a49f926", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30e9aaaf1337abfba896dff99a49f926");
            return;
        }
        if (this.E == LifecycleState.BEFORE_RESUME || this.E == LifecycleState.BEFORE_CREATE) {
            C();
        }
        this.E = LifecycleState.RESUMED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9eaacd3e92d2b650338a3cc3b22dd43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9eaacd3e92d2b650338a3cc3b22dd43");
            return;
        }
        if (this.E == LifecycleState.BEFORE_CREATE) {
            C();
            F();
        } else if (this.E == LifecycleState.RESUMED) {
            F();
        }
        this.E = LifecycleState.BEFORE_RESUME;
    }

    private synchronized void N() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5613ad9e3df980059eaf57f9d00f894", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5613ad9e3df980059eaf57f9d00f894");
            return;
        }
        if (this.E == LifecycleState.RESUMED) {
            if (!this.i) {
                F();
            }
            this.E = LifecycleState.BEFORE_RESUME;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "06f11d5cd354ed92daceb113c312d317", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "06f11d5cd354ed92daceb113c312d317");
        } else {
            com.meituan.android.mrn.event.c.b.a(com.meituan.android.mrn.event.listeners.b.f, (b.c<b.f>) a((g) new b.f()));
            com.meituan.android.mrn.event.g.b.a(com.meituan.android.mrn.event.listeners.d.c, (d.c<d.e>) a((g) new d.e()));
            if (com.meituan.android.mrn.debug.a.a()) {
                com.meituan.android.mrn.debug.interfaces.b.a();
            }
            if (this.g != null) {
                this.g.onHostDestroy(b());
            }
            if (this.k != null) {
                s sVar = this.k;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = s.a;
                if (PatchProxy.isSupport(objArr3, sVar, changeQuickRedirect3, false, "a94736b564226c70cfcdc08ae9f715a8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, sVar, changeQuickRedirect3, false, "a94736b564226c70cfcdc08ae9f715a8");
                } else {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putString("lifecycle", "ON_HOST_DESTROY");
                    sVar.a(createMap);
                }
            }
            if (this.f != null) {
                this.f.g();
                k kVar = this.f;
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = k.a;
                if (PatchProxy.isSupport(objArr4, kVar, changeQuickRedirect4, false, "5bd2cc81df728ac3225b5ffacc29862a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, kVar, changeQuickRedirect4, false, "5bd2cc81df728ac3225b5ffacc29862a");
                } else {
                    p.a("[MRNInstance@clearInstanceEventListener]", kVar.k);
                    synchronized (kVar.h) {
                        kVar.h.clear();
                    }
                }
                k kVar2 = this.f;
                com.meituan.android.mrn.container.b i = i();
                Object[] objArr5 = {i};
                ChangeQuickRedirect changeQuickRedirect5 = k.a;
                if (PatchProxy.isSupport(objArr5, kVar2, changeQuickRedirect5, false, "190a8d24cba2f60817e711236f53f7f5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, kVar2, changeQuickRedirect5, false, "190a8d24cba2f60817e711236f53f7f5");
                } else if (i != null) {
                    kVar2.n.remove(i);
                }
                if (this.f.o) {
                    this.f.e();
                } else {
                    m.a(this.f);
                    m.a(this.f, n(), 3);
                    this.f.d();
                }
                n.a(this.f, "containerViewDidReleased", K());
            }
            J();
            if (this.H != null) {
                MRNBundleManager.sharedInstance().unlockBundle(this.H);
                this.H = null;
            }
            this.g = null;
            this.f = null;
        }
        this.E = LifecycleState.BEFORE_CREATE;
    }

    @Deprecated
    public final void w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a7e29b70badc2156f8ee9c13f1e27e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a7e29b70badc2156f8ee9c13f1e27e3");
            return;
        }
        j();
        M();
        O();
        a((Bundle) null);
        f();
    }

    private void O() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a9a52d5f7e705d0d6e0668042868d0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a9a52d5f7e705d0d6e0668042868d0b");
            return;
        }
        View g = i().g();
        if (g != null) {
            g.setVisibility(8);
        }
    }

    public final q x() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cf6785597a6bf88dfcd8ef794abf352", RobustBitConfig.DEFAULT_VALUE)) {
            return (q) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cf6785597a6bf88dfcd8ef794abf352");
        }
        if (this.G == null) {
            if (this.f != null) {
                this.G = this.f.a((q) null);
                if (this.G == null) {
                    this.G = q.LOAD_MAIN_BUNDLE_FAILED;
                }
            } else {
                this.G = q.ERROR_CREATE_MRN_INSTANCE;
            }
            if (this.l != null) {
                this.l.r = this.G.Z;
            }
        }
        return this.G;
    }

    public final <O extends com.meituan.android.mrn.containerplugin.plugincore.b> O a(O o) {
        Object[] objArr = {o};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ab44d11a4773b4639cd4e4a3091c932", RobustBitConfig.DEFAULT_VALUE)) {
            return (O) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ab44d11a4773b4639cd4e4a3091c932");
        }
        com.meituan.android.mrn.containerplugin.plugincore.b a2 = o.a(i()).a(m());
        a2.b = o();
        a2.c = n();
        a2.d = p();
        return o;
    }

    public final String y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8b810bcc0cf0e04e8fa7bc9e919c922", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8b810bcc0cf0e04e8fa7bc9e919c922") : o();
    }

    public final Map<String, Object> z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "040825f6782b27412d4efbede6a4cb75", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "040825f6782b27412d4efbede6a4cb75");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("biz", H());
        hashMap.put("entry_name", (p() == null || p().d == null) ? "" : p().d);
        hashMap.put("component_name", n());
        hashMap.put("bundle_version", (this.J == null || this.J.f == null) ? "" : this.J.f);
        return hashMap;
    }
}
