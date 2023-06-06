package com.meituan.mmp.lib.engine;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.mmp.lib.config.RouteMappingModule;
import com.meituan.mmp.lib.trace.b;
import com.meituan.mmp.lib.update.MMPAppProp;
import com.meituan.mmp.lib.update.MMPPackageInfo;
import com.meituan.mmp.lib.update.MMPUpdateConfig;
import com.meituan.mmp.lib.update.PackageManageUtil;
import com.meituan.mmp.lib.utils.ay;
import com.meituan.mmp.lib.utils.bb;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class f {
    public static ChangeQuickRedirect f;
    private String a;
    protected final Context g;
    protected final String h;
    @NonNull
    public final com.meituan.mmp.lib.config.a i;
    protected boolean j;
    String k;
    protected com.meituan.mmp.lib.trace.h l;
    protected HandlerThread m;
    protected Handler n;
    protected volatile b o;
    protected volatile c p;
    protected final com.meituan.mmp.lib.engine.c q;
    protected final List<com.meituan.mmp.lib.engine.c> r;
    protected boolean s;
    protected final Set<MMPPackageInfo> t;
    protected final Set<MMPPackageInfo> u;
    protected volatile boolean v;
    public volatile boolean w;
    protected com.meituan.mmp.lib.update.i x;
    protected final com.meituan.mmp.lib.update.i y;

    public abstract void b();

    public f(Context context, com.meituan.mmp.lib.config.a aVar, com.meituan.mmp.lib.trace.h hVar) {
        Object[] objArr = {context, aVar, hVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbf30626b1b0cc90ffb3bda026d7a3fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbf30626b1b0cc90ffb3bda026d7a3fb");
            return;
        }
        this.o = b.INITIAL;
        this.p = c.INITIAL;
        this.q = d();
        this.r = new CopyOnWriteArrayList();
        this.t = new CopyOnWriteArraySet();
        this.u = new CopyOnWriteArraySet();
        this.w = false;
        this.x = new com.meituan.mmp.lib.api.update.a();
        this.y = new com.meituan.mmp.lib.update.i() { // from class: com.meituan.mmp.lib.engine.f.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mmp.lib.update.i
            public final void a(final MMPAppProp mMPAppProp) {
                Object[] objArr2 = {mMPAppProp};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d6a2aa1d08cefa9864202d5de54845c0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d6a2aa1d08cefa9864202d5de54845c0");
                } else {
                    f.this.a(new Runnable() { // from class: com.meituan.mmp.lib.engine.f.2.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1990e519cad52e322faa731dc3c15cad", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1990e519cad52e322faa731dc3c15cad");
                                return;
                            }
                            if (!com.meituan.mmp.lib.config.b.h() && mMPAppProp.isFusionModeEnabled()) {
                                mMPAppProp.externalConfig.fusion = false;
                            }
                            com.meituan.mmp.lib.trace.b.a("onAppPropUpdate isFusionMode", Boolean.valueOf(mMPAppProp.isFusionModeEnabled()));
                            f.this.i().a("isFusion", Boolean.valueOf(mMPAppProp.isFusionModeEnabled()));
                            f.this.q.a(mMPAppProp);
                        }
                    });
                }
            }

            @Override // com.meituan.mmp.lib.update.i
            public final void a(MMPAppProp mMPAppProp, final MMPPackageInfo mMPPackageInfo) {
                Object[] objArr2 = {mMPAppProp, mMPPackageInfo};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5bc50ddf6ed6d9b405d440e008e99b37", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5bc50ddf6ed6d9b405d440e008e99b37");
                } else {
                    f.this.a(new Runnable() { // from class: com.meituan.mmp.lib.engine.f.2.2
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "97e09ea1c77965f116a9c17a39b37d9e", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "97e09ea1c77965f116a9c17a39b37d9e");
                            } else {
                                f.this.q.a(mMPPackageInfo);
                            }
                        }
                    });
                }
            }

            @Override // com.meituan.mmp.lib.update.i
            public final void a(MMPAppProp mMPAppProp, final List<MMPPackageInfo> list) {
                Object[] objArr2 = {mMPAppProp, list};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "46af133fe9b94c81e545f25ffa837a50", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "46af133fe9b94c81e545f25ffa837a50");
                } else {
                    f.this.a(new Runnable() { // from class: com.meituan.mmp.lib.engine.f.2.3
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "eb0c35d7e0af273c23ebae7589824ff9", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "eb0c35d7e0af273c23ebae7589824ff9");
                            } else {
                                f.this.q.a(list);
                            }
                        }
                    });
                }
            }

            @Override // com.meituan.mmp.lib.update.i
            public final void a(MMPAppProp mMPAppProp, final String str, final Exception exc) {
                Object[] objArr2 = {mMPAppProp, str, exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a26c02f9fd827c1e664276c6e2f3ab81", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a26c02f9fd827c1e664276c6e2f3ab81");
                } else {
                    f.this.a(new Runnable() { // from class: com.meituan.mmp.lib.engine.f.2.4
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4b19c3cef2dff2d4fc1081c50b3d3a3a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4b19c3cef2dff2d4fc1081c50b3d3a3a");
                                return;
                            }
                            com.meituan.mmp.lib.engine.c cVar = f.this.q;
                            cVar.a("foregroundUpdateFail, " + str, exc);
                        }
                    });
                }
            }
        };
        this.g = context.getApplicationContext();
        this.i = aVar;
        this.h = aVar.c();
        this.l = hVar;
        this.m = new HandlerThread("MMP-AppEngine");
        this.m.start();
        this.n = new Handler(this.m.getLooper());
    }

    public final void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0a01711b42a24da8b342076d951c341", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0a01711b42a24da8b342076d951c341");
        } else if (this.p == c.DESTROYED) {
        } else {
            if (Thread.currentThread() == this.m) {
                runnable.run();
            } else {
                this.n.post(runnable);
            }
        }
    }

    public final String f() {
        return this.h;
    }

    public final int g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "674e263db21468d2d51f5c129c066b06", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "674e263db21468d2d51f5c129c066b06")).intValue() : hashCode();
    }

    public final void b(boolean z) {
        this.j = true;
    }

    public final boolean h() {
        return this.j;
    }

    public final com.meituan.mmp.lib.trace.h i() {
        return this.l;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum b {
        INITIAL,
        PRELOAD,
        PRELOAD_WEBVIEW,
        PRELOAD_FOR_LAUNCH,
        LAUNCHED;
        
        public static ChangeQuickRedirect a;

        b() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f7ff3abc8bc3840345d3aeb1c3f4324", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f7ff3abc8bc3840345d3aeb1c3f4324");
            }
        }

        public static b valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dbf88c92a454a8054e11a51588e97883", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dbf88c92a454a8054e11a51588e97883") : (b) Enum.valueOf(b.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "17ee007d2e358d30d8246c59fa77a535", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "17ee007d2e358d30d8246c59fa77a535") : (b[]) values().clone();
        }

        public final boolean a(b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26a936524f9648af3dc6eae88929ed28", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26a936524f9648af3dc6eae88929ed28")).booleanValue() : compareTo(bVar) >= 0;
        }
    }

    public final b j() {
        return this.o;
    }

    public final boolean k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da49c5316d3fa80471be4a55d10f9081", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da49c5316d3fa80471be4a55d10f9081")).booleanValue() : this.o.a(b.LAUNCHED);
    }

    public final void b(String str) {
        Object[] objArr = {null};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a57695944a3aeb4dd468d29c95931d65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a57695944a3aeb4dd468d29c95931d65");
            return;
        }
        com.meituan.mmp.lib.trace.b.b("BaseAppLoader", "engine preload：" + this.h);
        com.meituan.mmp.lib.trace.h hVar = this.l;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.trace.h.a;
        if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "b9370c3757b2adaf0e259b7650991d17", RobustBitConfig.DEFAULT_VALUE)) {
            com.meituan.mmp.lib.trace.h hVar2 = (com.meituan.mmp.lib.trace.h) PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "b9370c3757b2adaf0e259b7650991d17");
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Object[] objArr3 = {new Long(elapsedRealtime)};
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.mmp.lib.trace.h.a;
            if (PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect3, false, "2189e6db6f9a56625a4f6fb40a3b004e", RobustBitConfig.DEFAULT_VALUE)) {
                com.meituan.mmp.lib.trace.h hVar3 = (com.meituan.mmp.lib.trace.h) PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect3, false, "2189e6db6f9a56625a4f6fb40a3b004e");
            } else {
                hVar.k = elapsedRealtime;
            }
        }
        this.l.a(JsBridgeResult.ARG_KEY_LOCATION_MODE, (Object) LaunchMode.LAUNCH_MODE_PRELOAD);
        if (!this.o.a(b.PRELOAD)) {
            this.o = b.PRELOAD;
        }
        a(true, null);
    }

    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "399425a50989785b2cace1750fd22894", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "399425a50989785b2cace1750fd22894");
            return;
        }
        com.meituan.mmp.lib.trace.b.b("BaseAppLoader", "engine preloadForLaunch：" + this.h);
        com.meituan.mmp.lib.trace.h hVar = this.l;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.trace.h.a;
        if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "551e2270d52d49d75b2b2646c0a7d322", RobustBitConfig.DEFAULT_VALUE)) {
            com.meituan.mmp.lib.trace.h hVar2 = (com.meituan.mmp.lib.trace.h) PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "551e2270d52d49d75b2b2646c0a7d322");
        } else {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.mmp.lib.trace.h.a;
            if (PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect3, false, "e9c94488e18048c684ef620d681e8b40", RobustBitConfig.DEFAULT_VALUE)) {
                com.meituan.mmp.lib.trace.h hVar3 = (com.meituan.mmp.lib.trace.h) PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect3, false, "e9c94488e18048c684ef620d681e8b40");
            } else {
                hVar.b(System.currentTimeMillis());
            }
            hVar.a(SystemClock.elapsedRealtime());
        }
        if (!this.o.a(b.PRELOAD_FOR_LAUNCH)) {
            this.o = b.PRELOAD_FOR_LAUNCH;
            this.s = true;
        }
        a(true, str);
    }

    public synchronized void a(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27863a6488bce2f0bbabac8e6067d879", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27863a6488bce2f0bbabac8e6067d879");
        } else if (this.p.a(c.LOAD_STARTED)) {
        } else {
            this.p = c.LOAD_STARTED;
            this.l.b.b("prepare.package");
            this.l.b.b("prepare.app.prop");
            if (this.a != null) {
                com.meituan.mmp.lib.update.k a2 = com.meituan.mmp.lib.update.k.a();
                MMPUpdateConfig mMPUpdateConfig = new MMPUpdateConfig();
                mMPUpdateConfig.b = this.h;
                mMPUpdateConfig.l = com.meituan.mmp.lib.config.a.p(str);
                mMPUpdateConfig.g = this.j;
                mMPUpdateConfig.d = this.a;
                a2.a(mMPUpdateConfig, this.y, new com.meituan.mmp.lib.update.a(this.l));
                return;
            }
            w wVar = this.l != null ? new w(this.l) : null;
            com.meituan.mmp.lib.update.k a3 = com.meituan.mmp.lib.update.k.a();
            boolean z2 = !this.j;
            MMPUpdateConfig mMPUpdateConfig2 = new MMPUpdateConfig();
            mMPUpdateConfig2.b = this.h;
            mMPUpdateConfig2.l = com.meituan.mmp.lib.config.a.p(str);
            mMPUpdateConfig2.e = this.k;
            a3.a(z2, z, mMPUpdateConfig2, this.y, this.x, wVar);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum c {
        DESTROYED,
        FAILED,
        INITIAL,
        LOAD_STARTED,
        APP_PROP_UPDATED,
        ALL_PACKAGE_PREPARED;
        
        public static ChangeQuickRedirect a;

        c() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39c6b1cb4e51eb5b81b41978380dcad1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39c6b1cb4e51eb5b81b41978380dcad1");
            }
        }

        public static c valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d36c642be69ff424c12134f96b0e6fae", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d36c642be69ff424c12134f96b0e6fae") : (c) Enum.valueOf(c.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f3a1549da8194f8ec5a069c1514567a0", RobustBitConfig.DEFAULT_VALUE) ? (c[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f3a1549da8194f8ec5a069c1514567a0") : (c[]) values().clone();
        }

        public final boolean a(c cVar) {
            Object[] objArr = {cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75b8b6c0a67853ea21b1372139fa36fb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75b8b6c0a67853ea21b1372139fa36fb")).booleanValue() : compareTo(cVar) >= 0;
        }

        public final boolean b(c cVar) {
            Object[] objArr = {cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c69bc0730d7dfc620a67343db8d4f617", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c69bc0730d7dfc620a67343db8d4f617")).booleanValue() : compareTo(cVar) > 0;
        }

        public final boolean a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4557f0cc286aebd9cd7a0bbe2921bf0d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4557f0cc286aebd9cd7a0bbe2921bf0d")).booleanValue() : a(INITIAL);
        }
    }

    public final c l() {
        return this.p;
    }

    public final void a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "585dae3a7e75679d990aa295e913cefe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "585dae3a7e75679d990aa295e913cefe");
        } else if (!this.p.a() || this.p.a(cVar)) {
        } else {
            this.p = cVar;
        }
    }

    public final void b(com.meituan.mmp.lib.engine.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ce0d0c73ad3e1971554c2596841c03e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ce0d0c73ad3e1971554c2596841c03e");
        } else {
            this.r.add(cVar);
        }
    }

    public final void c(com.meituan.mmp.lib.engine.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bb63ef9e640a1369d76cc8203cdc34d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bb63ef9e640a1369d76cc8203cdc34d");
        } else {
            this.r.remove(cVar);
        }
    }

    public final void d(final com.meituan.mmp.lib.engine.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7fca7ab8a8cb2df5ef36013ce384451", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7fca7ab8a8cb2df5ef36013ce384451");
        } else if (cVar == null) {
        } else {
            a(new Runnable() { // from class: com.meituan.mmp.lib.engine.f.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2484a4d2579d7275c1fac84442e1194e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2484a4d2579d7275c1fac84442e1194e");
                        return;
                    }
                    f.this.a(cVar);
                    f.this.r.add(cVar);
                }
            });
        }
    }

    public void a(com.meituan.mmp.lib.engine.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4052b612f247f1a5517192f5e9b4f30b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4052b612f247f1a5517192f5e9b4f30b");
        } else if (this.p == c.DESTROYED) {
            cVar.a("appEngineDestroyed", (Exception) null);
        } else if (this.p == c.FAILED) {
            cVar.a("alreadyFailed", (Exception) null);
        } else {
            if (this.p.a(c.APP_PROP_UPDATED)) {
                cVar.a(this.i.l);
            }
            for (MMPPackageInfo mMPPackageInfo : this.t) {
                cVar.a(mMPPackageInfo);
            }
            if (this.p.a(c.ALL_PACKAGE_PREPARED)) {
                cVar.a(new ArrayList(this.u));
            }
        }
    }

    public final com.meituan.mmp.lib.api.update.a m() {
        return (com.meituan.mmp.lib.api.update.a) this.x;
    }

    public com.meituan.mmp.lib.engine.c d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f5dd78e240882219a22d168b08bf768", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.mmp.lib.engine.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f5dd78e240882219a22d168b08bf768") : new a();
    }

    /* compiled from: ProGuard */
    @WorkerThread
    /* loaded from: classes3.dex */
    public class a implements com.meituan.mmp.lib.engine.c {
        public static ChangeQuickRedirect c;

        public a() {
            Object[] objArr = {f.this};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d50acbbab50d9dabb298201e8ff1d424", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d50acbbab50d9dabb298201e8ff1d424");
            }
        }

        @Override // com.meituan.mmp.lib.engine.c
        public final void a(String str, Exception exc) {
            Object[] objArr = {str, exc};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc0274a5611b0997fc845cdfa0f209a7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc0274a5611b0997fc845cdfa0f209a7");
                return;
            }
            com.meituan.mmp.lib.trace.b.d("BaseAppLoader", str);
            com.meituan.mmp.lib.trace.b.a("BaseAppLoader", exc);
            StringBuilder sb = new StringBuilder("加载失败 ");
            sb.append(str);
            sb.append(StringUtil.SPACE);
            sb.append(exc != null ? exc.toString() : "");
            bb.b(sb.toString(), new Object[0]);
            f.this.p = c.FAILED;
            for (com.meituan.mmp.lib.engine.c cVar : f.this.r) {
                cVar.a(str, exc);
            }
            f.this.b();
        }

        @Override // com.meituan.mmp.lib.engine.c
        public void a(MMPAppProp mMPAppProp) {
            Object[] objArr = {mMPAppProp};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86b99ab11aebb9eade8064a81e95f24c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86b99ab11aebb9eade8064a81e95f24c");
                return;
            }
            if (mMPAppProp.loadType == 3 && f.this.i.l != mMPAppProp) {
                f.this.v = true;
            }
            f.this.i.l = mMPAppProp;
            com.meituan.mmp.lib.config.a aVar = f.this.i;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.config.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "d6da959a7bb9e51a11f07a9ff5d3ac5d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "d6da959a7bb9e51a11f07a9ff5d3ac5d");
            } else {
                aVar.i = RouteMappingModule.a(RouteMappingModule.a(aVar.c(), aVar.g()));
            }
            f.this.a(c.APP_PROP_UPDATED);
            for (com.meituan.mmp.lib.engine.c cVar : f.this.r) {
                cVar.a(mMPAppProp);
            }
            f.this.l.b.a("prepare.app.prop");
        }

        @Override // com.meituan.mmp.lib.engine.c
        public void a(MMPPackageInfo mMPPackageInfo) {
            Object[] objArr = {mMPPackageInfo};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00d66e611af60e0f7b88b54c5cc65904", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00d66e611af60e0f7b88b54c5cc65904");
                return;
            }
            f.this.t.add(mMPPackageInfo);
            if (mMPPackageInfo.f()) {
                f.this.u.add(mMPPackageInfo);
            }
            for (com.meituan.mmp.lib.engine.c cVar : f.this.r) {
                cVar.a(mMPPackageInfo);
            }
        }

        @Override // com.meituan.mmp.lib.engine.c
        public void a(List<MMPPackageInfo> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7384c4dc858e65724c19d9587522855d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7384c4dc858e65724c19d9587522855d");
                return;
            }
            if (f.this.v) {
                f.this.i.e = null;
            }
            try {
                f.this.i.d(f.this.g);
                f.this.l.c("mmp.launch.point.prepare.engine.files");
                f.this.a(c.ALL_PACKAGE_PREPARED);
                if (list != null) {
                    f.this.t.addAll(list);
                    f.this.u.addAll(list);
                }
                for (com.meituan.mmp.lib.engine.c cVar : f.this.r) {
                    cVar.a(list);
                }
                f.this.l.b.a("prepare.package");
            } catch (Exception e) {
                f.this.q.a("applyConfigError", e);
            }
        }

        @Override // com.meituan.mmp.lib.engine.c
        public final void a(MMPPackageInfo mMPPackageInfo, boolean z) {
            Object[] objArr = {mMPPackageInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c5199774fc5d75e36d567f8ded22236", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c5199774fc5d75e36d567f8ded22236");
                return;
            }
            for (com.meituan.mmp.lib.engine.c cVar : f.this.r) {
                cVar.a(mMPPackageInfo, z);
            }
        }

        @Override // com.meituan.mmp.lib.engine.c
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae3574289ade956047040bc42d8a05e4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae3574289ade956047040bc42d8a05e4");
                return;
            }
            for (com.meituan.mmp.lib.engine.c cVar : f.this.r) {
                cVar.a();
            }
        }
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93d7971166ed5efee41b17885b1c47d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93d7971166ed5efee41b17885b1c47d3");
        } else if (!this.p.b(c.DESTROYED)) {
            com.meituan.mmp.lib.trace.b.c("BaseAppLoader", "already destroyed: " + this.h);
        } else {
            this.p = c.DESTROYED;
            b.a.a("BaseAppLoader", "engine destroy: " + this.h);
            this.n.removeCallbacksAndMessages(null);
            this.m.quitSafely();
            if (com.meituan.mmp.lib.mp.a.f()) {
                PackageManageUtil.a(this.i.l, true);
                com.meituan.mmp.lib.executor.a.a(new Runnable() { // from class: com.meituan.mmp.lib.engine.f.3
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        File[] listFiles;
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "558f07b75d8a85edef652fbc88944eb2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "558f07b75d8a85edef652fbc88944eb2");
                            return;
                        }
                        Context context = f.this.g;
                        String str = f.this.h;
                        Object[] objArr3 = {context, str};
                        ChangeQuickRedirect changeQuickRedirect3 = ay.a;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "e17ec62050ea566791c9a818db196ebe", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "e17ec62050ea566791c9a818db196ebe");
                        } else {
                            com.meituan.mmp.lib.utils.s.a(ay.c(context, str).getAbsolutePath());
                        }
                        Context context2 = f.this.g;
                        String str2 = f.this.h;
                        Object[] objArr4 = {context2, str2};
                        ChangeQuickRedirect changeQuickRedirect4 = ay.a;
                        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "49adf26a17dad335b70a28e7e367a53c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "49adf26a17dad335b70a28e7e367a53c");
                        } else if (!com.meituan.mmp.lib.t.b(str2) && (listFiles = ay.d(context2, str2).listFiles()) != null) {
                            for (File file : listFiles) {
                                if (file.getName().startsWith("tmp_")) {
                                    file.delete();
                                }
                            }
                        }
                    }
                });
            }
        }
    }

    public final boolean n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0be1490a729cf04e420f636d1011c945", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0be1490a729cf04e420f636d1011c945")).booleanValue() : !this.u.isEmpty();
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fb6a0678fd5bf5e944e9b6834fb6023", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fb6a0678fd5bf5e944e9b6834fb6023");
        }
        return "AppEngine{" + this.h + " @" + g() + CommonConstant.Symbol.BIG_BRACKET_RIGHT;
    }

    public final boolean o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c0f78ac59d80a2b433e9de49818a2c5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c0f78ac59d80a2b433e9de49818a2c5")).booleanValue() : this.p.a(c.ALL_PACKAGE_PREPARED);
    }
}
