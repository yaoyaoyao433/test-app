package com.meituan.mmp.lib.engine;

import android.content.Context;
import android.content.Intent;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.mmp.lib.MMPWidgetFragment;
import com.meituan.mmp.lib.api.AbsApi;
import com.meituan.mmp.lib.engine.f;
import com.meituan.mmp.lib.mp.b;
import com.meituan.mmp.lib.mp.ipc.IPCInvoke;
import com.meituan.mmp.lib.mp.ipc.OnRemoteProcess;
import com.meituan.mmp.lib.trace.b;
import com.meituan.mmp.lib.update.MMPAppProp;
import com.meituan.mmp.lib.update.MMPPackageInfo;
import com.meituan.mmp.lib.update.PackageManageUtil;
import com.meituan.mmp.lib.utils.an;
import com.meituan.mmp.lib.utils.bb;
import com.meituan.mmp.lib.web.IX5Provider;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.mmp.main.ab;
import com.meituan.msi.bean.DefaultValue;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends f {
    private static volatile boolean D;
    public static ChangeQuickRedirect a;
    private static final InterfaceC0412b z = (InterfaceC0412b) IPCInvoke.a(c.class, com.meituan.mmp.lib.mp.a.MAIN);
    private final List<Runnable> A;
    private final com.meituan.mmp.lib.web.f B;
    private volatile boolean C;
    protected m b;
    protected final Map<MMPPackageInfo, Boolean> c;
    public int d;
    public final com.meituan.mmp.lib.engine.c e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.meituan.mmp.lib.engine.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0412b {
        void a();

        void a(String str, int i, int i2);

        boolean a(String str, int i, int i2, com.meituan.mmp.lib.mp.a aVar, com.meituan.mmp.lib.engine.c cVar);
    }

    public static /* synthetic */ n a(b bVar, final MMPAppProp mMPAppProp, MMPPackageInfo mMPPackageInfo, final String str) {
        Object[] objArr = {mMPAppProp, mMPPackageInfo, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "c19ca18aa1eb6992dea18044e0880ab8", RobustBitConfig.DEFAULT_VALUE)) {
            return (n) PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "c19ca18aa1eb6992dea18044e0880ab8");
        }
        bVar.l.a("mmp.launch.duration.load.service");
        if (mMPPackageInfo != null) {
            bVar.l.a(mMPPackageInfo.d() ? "mmp.launch.duration.load.service.foundation" : "mmp.launch.duration.load.service.business", mMPPackageInfo.g);
        }
        return new n() { // from class: com.meituan.mmp.lib.engine.b.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mmp.lib.engine.n
            public final void a(MMPPackageInfo mMPPackageInfo2, boolean z2) {
                boolean z3 = false;
                Object[] objArr2 = {mMPPackageInfo2, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e206cff778c33844da4e5fc47f87fc7f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e206cff778c33844da4e5fc47f87fc7f");
                    return;
                }
                com.meituan.mmp.lib.trace.b.b("AppLoader", "loadServicePackage " + mMPPackageInfo2.g + " of type " + str + " finished " + mMPAppProp);
                Boolean bool = b.this.c.get(mMPPackageInfo2);
                if (bool == null) {
                    b.this.c.put(mMPPackageInfo2, Boolean.valueOf(z2));
                } else {
                    b.this.c.put(mMPPackageInfo2, Boolean.valueOf((z2 || bool.booleanValue()) ? true : true));
                }
                b.this.q.a(mMPPackageInfo2, z2);
                if (z2) {
                    b.this.l.a(mMPPackageInfo2.d() ? "mmp.launch.duration.load.service.foundation" : "mmp.launch.duration.load.service.business", mMPPackageInfo2.g, t.a(mMPPackageInfo2));
                    if (mMPPackageInfo2.d()) {
                        com.meituan.mmp.lib.w.a().c.a(b.this.h);
                    } else if (mMPPackageInfo2.e()) {
                        com.meituan.mmp.lib.w.a().c.b(b.this.h);
                    }
                }
            }

            @Override // com.meituan.mmp.lib.engine.n
            public final void a(MMPPackageInfo mMPPackageInfo2, Exception exc) {
                Object[] objArr2 = {mMPPackageInfo2, exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "664cf0df5e1e7d78f79eb26d0a8a44b5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "664cf0df5e1e7d78f79eb26d0a8a44b5");
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(exc != null ? exc.getMessage() : null);
                sb.append(StringUtil.SPACE);
                sb.append(mMPAppProp);
                com.meituan.mmp.lib.trace.b.d("AppLoader", sb.toString());
                com.meituan.mmp.lib.engine.c cVar = b.this.q;
                StringBuilder sb2 = new StringBuilder("loadServiceFailed, ");
                sb2.append(mMPPackageInfo2);
                cVar.a(sb2.toString() != null ? mMPPackageInfo2.toString() : "", exc);
                b.this.l.a(mMPPackageInfo2.d() ? "mmp.launch.duration.load.service.foundation" : "mmp.launch.duration.load.service.business", mMPPackageInfo2.g, t.a(mMPPackageInfo2, exc != null ? exc.getMessage() : null));
                Object[] objArr3 = new Object[3];
                objArr3[0] = mMPPackageInfo2.g;
                objArr3[1] = mMPPackageInfo2.d;
                objArr3[2] = exc != null ? exc.getMessage() : null;
                bb.b("加载包出现异常，包名%s，版本号%s。%s", objArr3);
            }
        };
    }

    public static /* synthetic */ void a(b bVar, MMPPackageInfo mMPPackageInfo, n nVar) {
        Object[] objArr = {mMPPackageInfo, nVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "18ee9139273ece16df2db038632e5842", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "18ee9139273ece16df2db038632e5842");
            return;
        }
        ab.a("AppEngine.loadServicePackage");
        bVar.l.b.b("service.load.file");
        bVar.b.h.a(mMPPackageInfo, nVar);
        ab.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x011b, code lost:
        if (com.meituan.mmp.lib.engine.MMPHornPreloadConfig.a().d.enablePreloadPageInSubProcess == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.meituan.mmp.lib.engine.b r19, java.lang.Runnable r20) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.engine.b.a(com.meituan.mmp.lib.engine.b, java.lang.Runnable):void");
    }

    public static /* synthetic */ boolean a(boolean z2) {
        D = false;
        return false;
    }

    public b(Context context, m mVar) {
        super(context, mVar.d, mVar.e);
        Object[] objArr = {context, mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83ca8e4cf8f2228fdf9c2abaaa357235", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83ca8e4cf8f2228fdf9c2abaaa357235");
            return;
        }
        this.c = new ConcurrentHashMap();
        this.A = new ArrayList();
        this.B = new com.meituan.mmp.lib.web.f() { // from class: com.meituan.mmp.lib.engine.b.6
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mmp.lib.web.f
            public final void a(Exception exc) {
                Object[] objArr2 = {exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4bd7271bb5d8e36b1ffd59dfebe902b2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4bd7271bb5d8e36b1ffd59dfebe902b2");
                } else {
                    b.this.q.a("onEngineInitFailed", exc);
                }
            }
        };
        this.d = 0;
        this.e = new g() { // from class: com.meituan.mmp.lib.engine.b.8
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mmp.lib.engine.g, com.meituan.mmp.lib.engine.c
            public final void a(final MMPAppProp mMPAppProp) {
                Object[] objArr2 = {mMPAppProp};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e2fcecefb1474bec34b2c41143b2b3c5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e2fcecefb1474bec34b2c41143b2b3c5");
                } else {
                    b.this.a(new Runnable() { // from class: com.meituan.mmp.lib.engine.b.8.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e4601b41a59702abf18dee8b76cf7f87", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e4601b41a59702abf18dee8b76cf7f87");
                                return;
                            }
                            com.meituan.mmp.lib.trace.b.b("AppLoader", "event from remote: onAppPropUpdated");
                            b.this.q.a(mMPAppProp);
                        }
                    });
                }
            }

            @Override // com.meituan.mmp.lib.engine.g, com.meituan.mmp.lib.engine.c
            public final void a(final MMPPackageInfo mMPPackageInfo) {
                Object[] objArr2 = {mMPPackageInfo};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aa09a2d8a80bfb0049c081d00cfd2a50", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aa09a2d8a80bfb0049c081d00cfd2a50");
                } else {
                    b.this.a(new Runnable() { // from class: com.meituan.mmp.lib.engine.b.8.2
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "040faecd830b0580f359de41f6b4c6bb", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "040faecd830b0580f359de41f6b4c6bb");
                                return;
                            }
                            com.meituan.mmp.lib.trace.b.b("AppLoader", "event from remote: onPackagePrepared");
                            b.this.q.a(mMPPackageInfo);
                        }
                    });
                }
            }

            @Override // com.meituan.mmp.lib.engine.g, com.meituan.mmp.lib.engine.c
            public final void a(final List<MMPPackageInfo> list) {
                Object[] objArr2 = {list};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6b82a997c794f21a0d5cd8906bd13985", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6b82a997c794f21a0d5cd8906bd13985");
                } else {
                    b.this.a(new Runnable() { // from class: com.meituan.mmp.lib.engine.b.8.3
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8d3353ad22c617e441005a10ba2297b2", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8d3353ad22c617e441005a10ba2297b2");
                                return;
                            }
                            com.meituan.mmp.lib.trace.b.b("AppLoader", "event from remote: onAllPackagePrepared");
                            b.this.q.a(list);
                        }
                    });
                }
            }

            @Override // com.meituan.mmp.lib.engine.g, com.meituan.mmp.lib.engine.c
            public final void a(final String str, final Exception exc) {
                Object[] objArr2 = {str, exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "645592818fad009b8ae83b0242827803", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "645592818fad009b8ae83b0242827803");
                    return;
                }
                if (b.this.o.a(f.b.PRELOAD_FOR_LAUNCH)) {
                    b.this.l.a("mmp.launch.point.failed", (Map<String, Object>) com.meituan.mmp.lib.utils.v.a("errorType", str, "mmp.appVersion", b.this.i.g(), "preloadForLaunch", Boolean.valueOf(b.this.s), "error", exc != null ? exc.getMessage() : null));
                }
                b.this.a(new Runnable() { // from class: com.meituan.mmp.lib.engine.b.8.4
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a010a46fb55a9db303a93618c11dabff", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a010a46fb55a9db303a93618c11dabff");
                            return;
                        }
                        com.meituan.mmp.lib.trace.b.b("AppLoader", "event from remote: onFailed");
                        com.meituan.mmp.lib.engine.c cVar = b.this.q;
                        cVar.a("onFailedFromRemote, " + str, exc);
                    }
                });
            }
        };
        this.b = mVar;
        com.meituan.mmp.lib.t.a(mVar.b, this);
    }

    public final m a() {
        return this.b;
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a27ac78db879d3d7ecc30ee9d087311", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a27ac78db879d3d7ecc30ee9d087311");
        } else if (k()) {
            com.meituan.mmp.lib.trace.b.d("AppLoader", "startPage on a already started engine: " + this.p);
        } else {
            com.meituan.mmp.lib.trace.b.b("AppLoader", "engine startPage：" + this.h);
            this.o = f.b.LAUNCHED;
            z.a();
            a(false, str);
        }
    }

    @Override // com.meituan.mmp.lib.engine.f
    public final synchronized void a(final boolean z2, final String str) {
        Object[] objArr = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57310ffc9456c387ef9fe906916ab2e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57310ffc9456c387ef9fe906916ab2e0");
        } else if (!this.p.a()) {
            com.meituan.mmp.lib.trace.b.b("AppLoader", "startLoad on a unusable engine: " + this.p);
        } else {
            if (this.p.a(f.c.LOAD_STARTED)) {
                if (this.o.a(f.b.PRELOAD_FOR_LAUNCH)) {
                    p();
                }
            } else {
                IX5Provider a2 = com.meituan.mmp.lib.web.j.a();
                if (a2 != null) {
                    final com.meituan.mmp.lib.web.c a3 = a2.a();
                    a3.a();
                    a(new Runnable() { // from class: com.meituan.mmp.lib.engine.b.2
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "957139c2b8810d21ed6c6f77f1edd9a1", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "957139c2b8810d21ed6c6f77f1edd9a1");
                            } else {
                                a3.b();
                            }
                        }
                    });
                }
                if (!D && !this.C) {
                    super.a(z2, str);
                }
                a(new Runnable() { // from class: com.meituan.mmp.lib.engine.b.3
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f71e4ce031eb8b4aeab4b1907a3289c8", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f71e4ce031eb8b4aeab4b1907a3289c8");
                        } else if (!b.this.C) {
                            b.super.a(z2, str);
                        } else {
                            b.this.a(f.c.LOAD_STARTED);
                        }
                    }
                });
            }
        }
    }

    @Override // com.meituan.mmp.lib.engine.f
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b0bfd2a453eecf46932339a16d7ec36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b0bfd2a453eecf46932339a16d7ec36");
        } else {
            this.b.f.g();
        }
    }

    @Override // com.meituan.mmp.lib.engine.f
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28d652c53645c8a79f4e5b1d25273b35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28d652c53645c8a79f4e5b1d25273b35");
        } else if (!this.p.b(f.c.DESTROYED)) {
            com.meituan.mmp.lib.trace.b.c("AppLoader", "already destroyed: " + this.h);
        } else {
            super.c();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0a115119ce175ee891d918fdcc6cec5b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0a115119ce175ee891d918fdcc6cec5b");
            } else if (com.meituan.mmp.lib.mp.a.f() || this.d == 0) {
            } else {
                z.a(this.h, this.d, g());
            }
        }
    }

    @Override // com.meituan.mmp.lib.engine.f
    public final void a(com.meituan.mmp.lib.engine.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdf9fe5b6858fafe9d4215165903784d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdf9fe5b6858fafe9d4215165903784d");
            return;
        }
        super.a(cVar);
        if (this.b.v) {
            cVar.a();
        }
        for (Map.Entry<MMPPackageInfo, Boolean> entry : this.c.entrySet()) {
            cVar.a(entry.getKey(), entry.getValue().booleanValue());
        }
    }

    @Override // com.meituan.mmp.lib.engine.f
    public final com.meituan.mmp.lib.engine.c d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d466f6a3974bc27ed60196a067afd3a6", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.mmp.lib.engine.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d466f6a3974bc27ed60196a067afd3a6") : new d();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    class d extends f.a {
        public static ChangeQuickRedirect a;

        private d() {
            super();
            Object[] objArr = {b.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9789b733e76467c74b93c85971c09143", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9789b733e76467c74b93c85971c09143");
            }
        }

        @Override // com.meituan.mmp.lib.engine.f.a, com.meituan.mmp.lib.engine.c
        public final void a(final MMPAppProp mMPAppProp) {
            Object[] objArr = {mMPAppProp};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48f2839bbea999b62361fc5e5bbb32ab", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48f2839bbea999b62361fc5e5bbb32ab");
                return;
            }
            if (mMPAppProp.loadType == 1 || mMPAppProp.loadType == 2) {
                com.meituan.mmp.lib.w.a().e.a("native_checkupdate_end");
            }
            super.a(mMPAppProp);
            if (mMPAppProp.isOutdated()) {
                b.a(b.this, new Runnable() { // from class: com.meituan.mmp.lib.engine.b.d.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dcd95ee256851dda28407f5f855020fd", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dcd95ee256851dda28407f5f855020fd");
                        } else if (b.this.o == f.b.LAUNCHED) {
                        } else {
                            if (MMPHornPreloadConfig.h() && PackageManageUtil.a(b.this.i.l)) {
                                com.meituan.mmp.lib.trace.b.b("AppLoader", "framework package exist locally, preload it into webview, " + mMPAppProp.appid + StringUtil.SPACE + mMPAppProp.mmpSdk.g);
                                com.meituan.mmp.lib.trace.h hVar = b.this.o == f.b.PRELOAD ? b.this.l : null;
                                b.this.l.a("pagePreloadStarted", Boolean.TRUE);
                                b.this.b.i.a(b.this.g, mMPAppProp.mmpSdk, hVar, new e("onPackagePrepared"));
                            }
                            com.meituan.mmp.lib.trace.b.b("AppLoader", "try init first webView when checking update");
                            b.this.b.j.b(b.this.g);
                        }
                    }
                });
            }
        }

        @Override // com.meituan.mmp.lib.engine.f.a, com.meituan.mmp.lib.engine.c
        public final void a(final MMPPackageInfo mMPPackageInfo) {
            Object[] objArr = {mMPPackageInfo};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "227e22dc5ea3affb9e1752a404e1d253", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "227e22dc5ea3affb9e1752a404e1d253");
                return;
            }
            final MMPAppProp mMPAppProp = b.this.i.l;
            mMPAppProp.updatePackage(mMPPackageInfo);
            if (b.this.o.a(f.b.PRELOAD_FOR_LAUNCH) && mMPPackageInfo.d()) {
                com.meituan.mmp.lib.utils.o.a(mMPPackageInfo.g(b.this.g));
            }
            b.a(b.this, mMPPackageInfo, b.a(b.this, mMPAppProp, mMPPackageInfo, b.this.o.a(f.b.PRELOAD_FOR_LAUNCH) ? "loadServiceOnLaunch" : "preloadService"));
            if (mMPAppProp.mmpSdk.q && !com.meituan.mmp.lib.config.b.k() && (mMPPackageInfo.d() || mMPPackageInfo.e())) {
                b.a.a("AppLoader", "tryPreloadPagePackage:" + mMPAppProp.appid + StringUtil.SPACE + mMPPackageInfo.g);
                final com.meituan.mmp.lib.trace.h hVar = b.this.o == f.b.PRELOAD ? b.this.l : null;
                b.a(b.this, new Runnable() { // from class: com.meituan.mmp.lib.engine.b.d.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8e3e6ebb96433d838c84b0d72fc158dc", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8e3e6ebb96433d838c84b0d72fc158dc");
                            return;
                        }
                        b.a.a("AppLoader", "preloadPagePackage run:" + mMPAppProp.appid + StringUtil.SPACE + mMPPackageInfo.g);
                        b.this.l.a("pagePreloadStarted", Boolean.TRUE);
                        b.this.b.i.a(b.this.g, mMPPackageInfo, hVar, new e("onPackagePrepared"));
                    }
                });
            }
            super.a(mMPPackageInfo);
        }

        @Override // com.meituan.mmp.lib.engine.f.a, com.meituan.mmp.lib.engine.c
        public final void a(List<MMPPackageInfo> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "151669de9d3d05ad0e2450775a9ef7e7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "151669de9d3d05ad0e2450775a9ef7e7");
                return;
            }
            ab.a("AppEngine.onAllPackagePrepared");
            MMPAppProp mMPAppProp = b.this.i.l;
            try {
                b.this.i.d(b.this.g);
                if (b.this.b.l != null) {
                    com.meituan.mmp.lib.api.h hVar = b.this.b.l;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.api.h.a;
                    if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "302a8b64ef3d78846e49958452671804", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "302a8b64ef3d78846e49958452671804");
                    } else if (hVar.e != null) {
                        com.meituan.mmp.lib.msi.o oVar = hVar.e;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.mmp.lib.msi.o.a;
                        if (PatchProxy.isSupport(objArr3, oVar, changeQuickRedirect3, false, "a50e97060d81ec412f079a4dfdcf9b16", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, oVar, changeQuickRedirect3, false, "a50e97060d81ec412f079a4dfdcf9b16");
                        } else {
                            HashMap hashMap = new HashMap();
                            hashMap.put(DefaultValue.DEFAULT_VALUE_REQUEST_TIMEOUT, Integer.valueOf(oVar.f.j()));
                            hashMap.put(DefaultValue.DEFAULT_VALUE_UPLOAD_TIMEOUT, Integer.valueOf(oVar.f.j("uploadFile")));
                            hashMap.put(DefaultValue.DEFAULT_VALUE_DOWNLOAD_TIMEOUT, Integer.valueOf(oVar.f.j("downloadFile")));
                            oVar.c.a(hashMap);
                        }
                    }
                }
                if (mMPAppProp.loadType == 3) {
                    if (b.this.v) {
                        com.meituan.mmp.lib.engine.e eVar = b.this.b.h;
                        Object[] objArr4 = {b.this.g};
                        ChangeQuickRedirect changeQuickRedirect4 = com.meituan.mmp.lib.engine.e.a;
                        if (PatchProxy.isSupport(objArr4, eVar, changeQuickRedirect4, false, "4820ded73ef397b178b91031e8b88579", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, eVar, changeQuickRedirect4, false, "4820ded73ef397b178b91031e8b88579");
                        } else if (!com.meituan.mmp.lib.utils.h.a((List) eVar.e)) {
                            eVar.e.clear();
                            eVar.f.clear();
                            eVar.c.relaunch();
                        }
                        b.this.b.i.a();
                    }
                    b.this.b.h.a(mMPAppProp.mmpSdk, b.a(b.this, mMPAppProp, mMPAppProp.mmpSdk, "preloadService"));
                }
                b.this.b.i.d = true;
                super.a(list);
                if (b.this.p.a()) {
                    b.this.p();
                    final com.meituan.mmp.lib.trace.h hVar2 = b.this.o == f.b.PRELOAD ? b.this.l : null;
                    b.a(b.this, new Runnable() { // from class: com.meituan.mmp.lib.engine.b.d.3
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean z = false;
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "695ba1a9f8833b8e7e4feba2c3c1432b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "695ba1a9f8833b8e7e4feba2c3c1432b");
                            } else if (b.this.o.a(f.b.LAUNCHED) || !b.this.p.a()) {
                                com.meituan.mmp.lib.trace.b.b("AppLoader", "already launched/destroyed, cancel page preload");
                            } else {
                                MMPHornPreloadConfig a2 = MMPHornPreloadConfig.a();
                                String str = b.this.h;
                                Object[] objArr6 = {str};
                                ChangeQuickRedirect changeQuickRedirect6 = MMPHornPreloadConfig.a;
                                if (PatchProxy.isSupport(objArr6, a2, changeQuickRedirect6, false, "7167d614e7956a5314ec42548f4f056d", RobustBitConfig.DEFAULT_VALUE)) {
                                    z = ((Boolean) PatchProxy.accessDispatch(objArr6, a2, changeQuickRedirect6, false, "7167d614e7956a5314ec42548f4f056d")).booleanValue();
                                } else if (a2.d.preloadPageToHome && !a2.b(str)) {
                                    z = true;
                                }
                                if (z) {
                                    b.a.a("AppLoader", "page preload home " + b.this.h);
                                    b.this.l.b.d("page.load.to.dom.ready");
                                    b.this.l.a("preloadHomePageStarted", Boolean.TRUE);
                                    b.this.b.i.a(b.this.g, hVar2);
                                    com.meituan.mmp.lib.executor.a.d(new Runnable() { // from class: com.meituan.mmp.lib.engine.b.d.3.1
                                        public static ChangeQuickRedirect a;

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Object[] objArr7 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect7 = a;
                                            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "0c84dd36069ce8903138383ca78a3f15", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "0c84dd36069ce8903138383ca78a3f15");
                                            } else if (b.this.o.a(f.b.LAUNCHED) || !b.this.p.a()) {
                                                com.meituan.mmp.lib.trace.b.b("AppLoader", "already launched/destroyed, cancel default resource preload");
                                            } else {
                                                b.a.a("AppLoader", "page preload packages after preload home " + b.this.h);
                                                b.this.b.i.a(b.this.g, hVar2, new e("onAllPackagePrepared"));
                                            }
                                        }
                                    }, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
                                    return;
                                }
                                b.a.a("AppLoader", "page preload packages " + b.this.h);
                                b.this.l.b.d("page.load.to.page.ready");
                                b.this.b.i.a(b.this.g, hVar2, new e("onAllPackagePrepared"));
                            }
                        }
                    });
                    an a2 = an.a();
                    com.meituan.mmp.lib.config.a aVar = b.this.i;
                    Object[] objArr5 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect5 = an.a;
                    if (PatchProxy.isSupport(objArr5, a2, changeQuickRedirect5, false, "9de969e44c0cc27e40e7d4d97f38baa8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, a2, changeQuickRedirect5, false, "9de969e44c0cc27e40e7d4d97f38baa8");
                    } else {
                        a2.b = aVar.j(SocialConstants.TYPE_REQUEST);
                        a2.c = aVar.j("connectSocket");
                        a2.d = aVar.j("uploadFile");
                        a2.e = aVar.j("downloadFile");
                    }
                    t.a(b.this.l, mMPAppProp, list);
                    ab.a();
                    return;
                }
                ab.a();
            } catch (Exception e) {
                b.this.q.a("applyConfigError", e);
            }
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7a2ede049900f57bcfe426636465b3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7a2ede049900f57bcfe426636465b3b");
        } else if (this.o.a(f.b.PRELOAD_FOR_LAUNCH)) {
            com.meituan.mmp.lib.trace.b.a("AppLoader", "markPreloadPageStart", this.o, this.h);
        } else {
            this.o = f.b.PRELOAD_WEBVIEW;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "efd92e24a07bbe12adaced1085152040", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "efd92e24a07bbe12adaced1085152040");
            } else if (com.meituan.mmp.lib.mp.a.f()) {
                com.meituan.mmp.lib.trace.b.a("AppLoader", "cacheLastPreloadPageAtMainProcessAppId", this.h);
                o.b = this.h;
            }
            String str = this.h;
            com.meituan.mmp.lib.trace.a.a(str, "preloadPage-" + i);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class e implements v {
        public static ChangeQuickRedirect a;
        private final String c;

        @Override // android.webkit.ValueCallback
        public final /* synthetic */ void onReceiveValue(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f62c511839431c3051b3c2174f6b7baf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f62c511839431c3051b3c2174f6b7baf");
                return;
            }
            com.meituan.mmp.lib.trace.b.b("AppLoader", "load page package success: " + this.c);
        }

        public e(String str) {
            Object[] objArr = {b.this, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8181af48790220bb2bb01fa612cc493", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8181af48790220bb2bb01fa612cc493");
            } else {
                this.c = str;
            }
        }

        @Override // com.meituan.mmp.lib.engine.v
        public final void a(Exception exc) {
            Object[] objArr = {exc};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbaa92170b0dad28813d20167edc2cee", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbaa92170b0dad28813d20167edc2cee");
                return;
            }
            b.this.q.a("preloadPageFailed", exc);
            com.meituan.mmp.lib.trace.b.b("AppLoader", "load page package failed, will destroy engine: " + this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b525738b1bcbdb1d9604e2ab4c1c441a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b525738b1bcbdb1d9604e2ab4c1c441a");
        } else {
            a(new Runnable() { // from class: com.meituan.mmp.lib.engine.b.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ae284e9721ba059fa7591983eeba6f68", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ae284e9721ba059fa7591983eeba6f68");
                    } else if (b.this.k() && b.this.p.a(f.c.ALL_PACKAGE_PREPARED)) {
                        MMPAppProp mMPAppProp = b.this.i.l;
                        b.a(b.this, mMPAppProp.mainPackage, b.a(b.this, mMPAppProp, mMPAppProp.mainPackage, "ensureLoadLaunchService"));
                        b.a(b.this, mMPAppProp.mmpSdk, b.a(b.this, mMPAppProp, mMPAppProp.mmpSdk, "ensureLoadLaunchService"));
                        for (MMPPackageInfo mMPPackageInfo : b.this.u) {
                            if (mMPPackageInfo != null) {
                                b.a(b.this, mMPPackageInfo, b.a(b.this, mMPAppProp, mMPPackageInfo, "ensureLoadLaunchService"));
                            }
                        }
                    }
                }
            });
        }
    }

    public final void a(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57f6d1b68ea6e5bb3b4c7d1a43bb4676", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57f6d1b68ea6e5bb3b4c7d1a43bb4676");
        } else {
            this.q.a("onEngineInitFailed", exc);
        }
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67c258efe8e1407e2ab2beee16bd908b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67c258efe8e1407e2ab2beee16bd908b");
        } else if (com.meituan.mmp.lib.mp.a.f() && i == g()) {
            com.meituan.mmp.lib.trace.b.c("AppLoader", "attaching to this engine itself");
        } else {
            this.d = i;
            D = true;
            a(new Runnable() { // from class: com.meituan.mmp.lib.engine.b.7
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "525ffee4a91b7959b8640b1abbddf5d2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "525ffee4a91b7959b8640b1abbddf5d2");
                        return;
                    }
                    b.this.C = b.z.a(b.this.h, b.this.d, b.this.g(), com.meituan.mmp.lib.mp.a.e(), b.this.e);
                    b.a(false);
                    com.meituan.mmp.lib.trace.b.b("AppLoader", "attachToRemoteEngine: " + b.this.C + ", " + b.this.h);
                }
            });
        }
    }

    /* compiled from: ProGuard */
    @OnRemoteProcess
    /* loaded from: classes3.dex */
    static class c implements InterfaceC0412b {
        public static ChangeQuickRedirect a;

        @Override // com.meituan.mmp.lib.engine.b.InterfaceC0412b
        public final boolean a(String str, int i, final int i2, com.meituan.mmp.lib.mp.a aVar, com.meituan.mmp.lib.engine.c cVar) {
            Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), aVar, cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56d634e56d370973aa40ebdf490afb8d", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56d634e56d370973aa40ebdf490afb8d")).booleanValue();
            }
            final h a2 = j.a(i, str, false);
            if (a2 == null) {
                com.meituan.mmp.lib.trace.b.c("AppLoader", "mainProcessEngine " + str + " - " + i + " not found");
                return false;
            }
            a2.d(cVar);
            Object[] objArr2 = {Integer.valueOf(i2), aVar};
            ChangeQuickRedirect changeQuickRedirect2 = h.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "e5c5484123c7007485edda4e2829dccd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "e5c5484123c7007485edda4e2829dccd");
                return true;
            }
            b.a aVar2 = new b.a() { // from class: com.meituan.mmp.lib.engine.h.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.mmp.lib.mp.b.a
                public final void a(com.meituan.mmp.lib.mp.a aVar3) {
                    Object[] objArr3 = {aVar3};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ff5ddec2104f23c282888cdc4094ca9a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ff5ddec2104f23c282888cdc4094ca9a");
                    } else {
                        h.this.a(i2);
                    }
                }
            };
            com.meituan.mmp.lib.mp.b.a(aVar, aVar2);
            a2.b.put(Integer.valueOf(i2), aVar2);
            com.meituan.mmp.lib.trace.b.b("DownloadOnlyAppLoader", "app engine bound, engine retain count: " + a2.b.size());
            return true;
        }

        @Override // com.meituan.mmp.lib.engine.b.InterfaceC0412b
        public final void a(String str, int i, int i2) {
            Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb7937ea54977541a65d88cea56703b2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb7937ea54977541a65d88cea56703b2");
                return;
            }
            h a2 = j.a(i, str, false);
            if (a2 != null) {
                a2.a(i2);
                return;
            }
            com.meituan.mmp.lib.trace.b.c("AppLoader", "remoteEngine " + str + " - " + i + " not found");
        }

        @Override // com.meituan.mmp.lib.engine.b.InterfaceC0412b
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1122f7097031c5e5b2c31f68c517180e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1122f7097031c5e5b2c31f68c517180e");
            } else {
                com.meituan.mmp.lib.r.a();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a {
        public static ChangeQuickRedirect a;

        public a() {
        }

        public final void a(IApiCallback iApiCallback) {
            Object[] objArr = {iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "844b47e360f3866f08aa66b7ee78cf0b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "844b47e360f3866f08aa66b7ee78cf0b");
                return;
            }
            com.meituan.mmp.lib.api.update.a m = b.this.m();
            if (!m.b) {
                iApiCallback.onFail(AbsApi.codeJson(-1, "update is not ready"));
            } else if (m.c) {
                iApiCallback.onFail(AbsApi.codeJson(-1, "update failed"));
            } else if (b.this.b.f.d() > 1) {
                iApiCallback.onFail(AbsApi.codeJson(-1, "applyUpdate failed: invoke this api ,activity should be only one"));
            } else {
                com.meituan.mmp.lib.a aVar = b.this.b.f.c;
                if (aVar == null || aVar.f.isFinishing()) {
                    iApiCallback.onFail(AbsApi.codeJson(-1, "applyUpdate failed"));
                    return;
                }
                b.this.b.e.b("mmp.api.updatemanager.apply.update", (Map<String, Object>) null);
                Intent d = aVar.d();
                if (!aVar.a()) {
                    d.putExtra("disableReuseAny", true);
                    d.putExtra("startByApplyUpdate", true);
                    d.removeExtra("reuseEngineId");
                    aVar.f.finish();
                    aVar.a(d);
                    com.meituan.mmp.lib.trace.b.b("AppLoader", String.format("UpdateManager page applyUpdate, appId: %s, ", b.this.f()));
                } else {
                    b.this.w = true;
                    ((MMPWidgetFragment) aVar.e).k();
                    com.meituan.mmp.lib.trace.b.b("AppLoader", String.format("UpdateManager widget applyUpdate, appId: %s, ", b.this.f()));
                }
                iApiCallback.onSuccess(null);
            }
        }
    }
}
