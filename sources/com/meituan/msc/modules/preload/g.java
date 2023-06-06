package com.meituan.msc.modules.preload;

import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.text.TextUtils;
import com.meituan.msc.common.config.MSCMultiProcessConfig;
import com.meituan.msc.common.process.ipc.IPCInvoke;
import com.meituan.msc.common.utils.o;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.engine.h;
import com.meituan.msc.modules.engine.p;
import com.meituan.msc.modules.engine.q;
import com.meituan.msc.modules.preload.PreloadResultData;
import com.meituan.msc.modules.preload.RuntimePreloadReporter;
import com.meituan.msc.modules.preload.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g {
    public static ChangeQuickRedirect a;
    public static final g b = new g();
    public static final Set<String> d = Collections.synchronizedSet(new LinkedHashSet());
    public final com.meituan.msc.modules.preload.executor.b c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(String str, String str2, boolean z, com.meituan.msc.common.framework.a<PreloadResultData> aVar);
    }

    public static /* synthetic */ void a(g gVar, h hVar, long j, long j2) {
        Object[] objArr = {hVar, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "657e7b924f7017665e89436d71a17527", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "657e7b924f7017665e89436d71a17527");
        } else if (hVar == null) {
            com.meituan.msc.modules.reporter.g.d("PreloadTasksManager", "reportBasePreloadData runtime is null");
        } else {
            hVar.p.a(j).b(System.currentTimeMillis()).f(hVar.a());
            if (!gVar.a(hVar)) {
                com.meituan.msc.modules.reporter.g.d("PreloadTasksManager", "cancel reportBasePreloadData");
                return;
            }
            RuntimePreloadReporter.b a2 = RuntimePreloadReporter.b.a(hVar);
            Object[] objArr2 = {hVar, "basePreload"};
            ChangeQuickRedirect changeQuickRedirect2 = RuntimePreloadReporter.b.d;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "e19ea2fae40fcd947792fb80fef2b38b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "e19ea2fae40fcd947792fb80fef2b38b");
            } else {
                a2.a(hVar, null, "basePreload");
            }
            RuntimePreloadReporter.a b2 = RuntimePreloadReporter.a.b();
            Object[] objArr3 = {hVar, new Long(j2), "basePreload"};
            ChangeQuickRedirect changeQuickRedirect3 = RuntimePreloadReporter.a.d;
            if (PatchProxy.isSupport(objArr3, b2, changeQuickRedirect3, false, "1e08e43e9f03f571cf1c4e51a53f7249", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, b2, changeQuickRedirect3, false, "1e08e43e9f03f571cf1c4e51a53f7249");
            } else {
                b2.a(hVar, j2, "", "basePreload");
            }
        }
    }

    public static /* synthetic */ void a(g gVar, h hVar, String str, long j) {
        Object[] objArr = {hVar, str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "15c347b9d40253052cbfd6d65428eb0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "15c347b9d40253052cbfd6d65428eb0e");
        } else if (hVar == null) {
            com.meituan.msc.modules.reporter.g.d("PreloadTasksManager", "reportBizPreloadData runtime is null");
        } else {
            hVar.p.a(j).b(System.currentTimeMillis()).f(hVar.a());
            if (!gVar.a(hVar)) {
                com.meituan.msc.modules.reporter.g.d("PreloadTasksManager", "cancel reportBizPreloadData");
                return;
            }
            RuntimePreloadReporter.b.a(hVar).a(hVar, str, "bizPreload");
            RuntimePreloadReporter.a.b().a(hVar, j, str, "bizPreload");
        }
    }

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "552e1027ff43f4689918fc497c645900", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "552e1027ff43f4689918fc497c645900");
        } else {
            this.c = new com.meituan.msc.modules.preload.executor.b(com.sankuai.android.jarvis.c.b("MSCPreloadTaskExecutor", 2));
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e6909cc065ba6d0148bfd0f1a2df1c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e6909cc065ba6d0148bfd0f1a2df1c5");
        } else if (MSCHornPreloadConfig.j()) {
            e();
        } else {
            com.meituan.msc.modules.reporter.g.d("PreloadBiz", "enableBizPreload is off");
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41657effa07a0c76ad4ca0fca5850dc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41657effa07a0c76ad4ca0fca5850dc0");
        } else if (MSCHornPreloadConfig.i()) {
            a("PreloadBase", 0L).c((com.meituan.msc.common.support.java.util.function.d<Throwable, ? extends h>) new com.meituan.msc.common.support.java.util.function.d<Throwable, h>() { // from class: com.meituan.msc.modules.preload.g.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.common.support.java.util.function.d
                public final /* synthetic */ h a(Throwable th) {
                    Throwable th2 = th;
                    Object[] objArr2 = {th2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d9fa98f4c76c3f1fad90a6e29b924484", RobustBitConfig.DEFAULT_VALUE)) {
                        return (h) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d9fa98f4c76c3f1fad90a6e29b924484");
                    }
                    e a2 = e.a();
                    StringBuilder sb = new StringBuilder("enable preloadBase error:");
                    sb.append(th2 != null ? th2.toString() : "");
                    a2.b = sb.toString();
                    return null;
                }
            });
        } else {
            e.a().b = "enable preloadBase is off";
            com.meituan.msc.modules.reporter.g.d("PreloadBase", "enableBasePreload is off");
        }
    }

    private com.meituan.msc.common.support.java.util.concurrent.a<h> a(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b34ba6f34456b1027743459e5dc1004", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.common.support.java.util.concurrent.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b34ba6f34456b1027743459e5dc1004");
        }
        if (d()) {
            e.a().b = "already exist preload base runtime";
            return com.meituan.msc.common.support.java.util.concurrent.a.c((Object) null);
        }
        RuntimePreloadReporter.a.b().f("basePreload");
        return a(str, j, PackageDebugHelper.b.a(null));
    }

    private com.meituan.msc.common.support.java.util.concurrent.a<h> a(String str, long j, String str2) {
        Object[] objArr = {str, new Long(j), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d7ebb5a9a81bf833064cd36d936a862", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.common.support.java.util.concurrent.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d7ebb5a9a81bf833064cd36d936a862");
        }
        com.meituan.msc.modules.reporter.g.d("PreloadTasksManager", "realPreloadBasePackage", str, Long.valueOf(j), str2);
        final long currentTimeMillis = System.currentTimeMillis();
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        com.meituan.msc.modules.preload.a aVar = new com.meituan.msc.modules.preload.a(str, str2);
        if (j > 0) {
            this.c.a(aVar, j);
        } else {
            this.c.b(aVar);
        }
        return aVar.b.a(new com.meituan.msc.common.support.java.util.function.b<h, Throwable, h>() { // from class: com.meituan.msc.modules.preload.g.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.common.support.java.util.function.b
            public final /* synthetic */ h a(h hVar, Throwable th) {
                h hVar2 = hVar;
                Object[] objArr2 = {hVar2, th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "524e7e8bcadd79b76d8ae1cdcd5c4d27", RobustBitConfig.DEFAULT_VALUE)) {
                    return (h) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "524e7e8bcadd79b76d8ae1cdcd5c4d27");
                }
                g.a(g.this, hVar2, currentTimeMillis, elapsedRealtime);
                return hVar2;
            }
        }).c((com.meituan.msc.common.support.java.util.function.d<Throwable, ? extends U>) new com.meituan.msc.common.support.java.util.function.d<Throwable, h>() { // from class: com.meituan.msc.modules.preload.g.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.common.support.java.util.function.d
            public final /* synthetic */ h a(Throwable th) {
                Throwable th2 = th;
                Object[] objArr2 = {th2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f617ccdfe68e8127368c2768f60e362e", RobustBitConfig.DEFAULT_VALUE)) {
                    return (h) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f617ccdfe68e8127368c2768f60e362e");
                }
                RuntimePreloadReporter.a b2 = RuntimePreloadReporter.a.b();
                Object[] objArr3 = {th2, "basePreload"};
                ChangeQuickRedirect changeQuickRedirect3 = RuntimePreloadReporter.a.d;
                if (PatchProxy.isSupport(objArr3, b2, changeQuickRedirect3, false, "53adbe15144617474cfdd9bd4bb0595a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, b2, changeQuickRedirect3, false, "53adbe15144617474cfdd9bd4bb0595a");
                } else {
                    b2.a(th2, (String) null, (String) null, "basePreload");
                }
                return null;
            }
        });
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "310ad309b226e7cd58f9bb4b6028b427", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "310ad309b226e7cd58f9bb4b6028b427")).booleanValue() : q.c() != null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final com.meituan.msc.common.support.java.util.concurrent.a<h> a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1b4fd41d96558b5ba6a70d4932271ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.common.support.java.util.concurrent.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1b4fd41d96558b5ba6a70d4932271ff");
        }
        e.a().c();
        if (!MSCHornPreloadConfig.i()) {
            e.a().b = "preload base is off";
            return null;
        }
        e.a().b = "preloadBasePackageAgain";
        return a("PreloadBase Again", j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7d4d473c430d81500ee3518f39a1654", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7d4d473c430d81500ee3518f39a1654")).booleanValue();
        }
        if (MSCEnvHelper.getContext() != null) {
            return !ProcessUtils.isMainProcess(MSCEnvHelper.getContext());
        }
        com.meituan.msc.modules.reporter.g.d("PreloadTasksManager", "isMainProcess context is null");
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void a(String str, String str2, boolean z, String str3, String str4, @Nullable com.meituan.msc.common.framework.a<h> aVar) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), str3, str4, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afcda85740b64b0e737d9f3e6e9cde50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afcda85740b64b0e737d9f3e6e9cde50");
        } else if (c() && !com.meituan.msc.common.process.a.STANDARD.c()) {
            com.meituan.msc.modules.reporter.g.d("PreloadBiz", "only main process and msc process trigger bizPreload");
        } else {
            e.a().c();
            RuntimePreloadReporter.a.b().a(str, str2, "bizPreload");
            if (!MSCHornPreloadConfig.j()) {
                String str5 = "enableBizPreload is off:" + str + ",targetPath:" + str2;
                com.meituan.msc.modules.reporter.g.d("PreloadBiz", str5);
                RuntimePreloadReporter.a.b().a(new IllegalStateException(str5), str, str2, "bizPreload");
                if (aVar != null) {
                    aVar.a(str5, null);
                    return;
                }
                return;
            }
            h a2 = q.a(str);
            if ((a2 != null || d.contains(str) || a(str, str2, aVar)) && aVar != null) {
                com.meituan.msc.modules.reporter.g.d("PreloadBiz", "runtime is exist:" + str + ",targetPath:" + str2);
                if (a2 != null) {
                    RuntimePreloadReporter.b.a(a2).a(a2, str2, "bizPreload");
                }
                aVar.a();
                return;
            }
            if (!(!com.meituan.msc.common.process.a.f()) && !MSCHornPreloadConfig.e(str)) {
                if (!MSCHornPreloadConfig.d(str)) {
                    String str6 = str + " is not in preloadAppWhiteList";
                    com.meituan.msc.modules.reporter.g.d("PreloadBiz", str6);
                    RuntimePreloadReporter.a.b().a(new IllegalArgumentException(str6), str, str2, "bizPreload");
                    if (aVar != null) {
                        aVar.a(str6, new IllegalArgumentException(str6));
                        return;
                    }
                    return;
                }
                if (d.size() >= MSCHornPreloadConfig.l()) {
                    a((String) d.toArray()[0], (com.meituan.msc.common.framework.a<Void>) null);
                } else {
                    com.meituan.msc.modules.reporter.g.d("PreloadBiz", "preload not over limit", str);
                }
                d.add(str);
            }
            a(str, str2, str3, str4, aVar, z);
        }
    }

    private boolean a(String str, String str2, com.meituan.msc.common.framework.a<h> aVar) {
        Object[] objArr = {str, str2, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1e3990d463bd179a4a00ff1719435d3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1e3990d463bd179a4a00ff1719435d3")).booleanValue() : d.a().a(new d.a(str, str2, aVar));
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa9d4cf59a9f26d7583db958f2ece1af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa9d4cf59a9f26d7583db958f2ece1af");
            return;
        }
        final String[] k = MSCHornPreloadConfig.k();
        if (k == null || k.length == 0) {
            com.meituan.msc.modules.reporter.g.d("PreloadBiz", "priorityAppList is empty");
            return;
        }
        com.meituan.msc.modules.container.a.b.a(new Runnable() { // from class: com.meituan.msc.modules.preload.g.6
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d25d0d553b72613e8dbd4a4f256854e0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d25d0d553b72613e8dbd4a4f256854e0");
                } else {
                    g.this.a(k);
                }
            }
        });
        a(k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e2c32277221dbd1207c1775272462fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e2c32277221dbd1207c1775272462fc");
            return;
        }
        com.meituan.msc.modules.reporter.g.d("PreloadBiz", "doPreloadAppByMSC");
        for (final String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                if (q.a(str) != null) {
                    com.meituan.msc.modules.reporter.g.d("PreloadBiz", str, " app runtime exist");
                } else {
                    com.meituan.msc.modules.reporter.g.d("PreloadBiz", "preloadAppPackageByMSC start:", str);
                    a(str, null, false, new com.meituan.msc.common.framework.a<PreloadResultData>() { // from class: com.meituan.msc.modules.preload.g.7
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.msc.common.framework.a
                        public final /* synthetic */ void a(PreloadResultData preloadResultData) {
                            PreloadResultData preloadResultData2 = preloadResultData;
                            Object[] objArr2 = {preloadResultData2};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bc68651c45c0b6251acafb14a13dc15d", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bc68651c45c0b6251acafb14a13dc15d");
                            } else {
                                com.meituan.msc.modules.reporter.g.d("PreloadBiz", "preloadAppPackageByMSC success:", preloadResultData2);
                            }
                        }

                        @Override // com.meituan.msc.common.framework.a
                        public final void a(String str2, Exception exc) {
                            Object[] objArr2 = {str2, exc};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f3e6bd5ca4d5df17a7f94238bf56fee4", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f3e6bd5ca4d5df17a7f94238bf56fee4");
                            } else {
                                com.meituan.msc.modules.reporter.g.b("PreloadBiz", exc, "preloadAppPackageByMSC failed:", str);
                            }
                        }

                        @Override // com.meituan.msc.common.framework.a
                        public final void a() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2bb6120c46e4c3aad82674db5e80ccc4", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2bb6120c46e4c3aad82674db5e80ccc4");
                            } else {
                                com.meituan.msc.modules.reporter.g.d("PreloadBiz", "preloadAppPackageByMSC cancel:", str);
                            }
                        }
                    }, false);
                }
            }
        }
    }

    private void a(final String str, final String str2, @Nullable String str3, String str4, @Nullable final com.meituan.msc.common.framework.a<h> aVar, boolean z) {
        Object[] objArr = {str, str2, str3, str4, aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbed28dc10098e04e49619e48061add4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbed28dc10098e04e49619e48061add4");
            return;
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        if (TextUtils.isEmpty(str)) {
            com.meituan.msc.modules.reporter.g.d("PreloadBiz", "appId is null or empty");
            RuntimePreloadReporter.a.b().a(new IllegalArgumentException("appId is null or empty"), str, str2, "bizPreload");
            if (aVar != null) {
                aVar.a("appId is null or empty", null);
                return;
            }
            return;
        }
        com.meituan.msc.modules.preload.b bVar = new com.meituan.msc.modules.preload.b(TextUtils.isEmpty(str4) ? PackageDebugHelper.b.a(null) : str4, str, str3, str2, z, aVar);
        this.c.b(bVar);
        bVar.b.a(new com.meituan.msc.common.support.java.util.function.b<h, Throwable, Object>() { // from class: com.meituan.msc.modules.preload.g.9
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.common.support.java.util.function.b
            public final /* synthetic */ Object a(h hVar, Throwable th) {
                h hVar2 = hVar;
                Object[] objArr2 = {hVar2, th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "180329e98ebbd748a2f2f81ef7ff6df5", RobustBitConfig.DEFAULT_VALUE)) {
                    return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "180329e98ebbd748a2f2f81ef7ff6df5");
                }
                g.a(g.this, hVar2, str2, elapsedRealtime);
                g.d.remove(str);
                if (hVar2 == null) {
                    com.meituan.msc.modules.reporter.g.d("PreloadTasksManager", "preloadBiz runtime is null");
                    return null;
                } else if (aVar != null) {
                    aVar.a(hVar2);
                    return null;
                } else {
                    return null;
                }
            }
        }).c((com.meituan.msc.common.support.java.util.function.d<Throwable, ? extends U>) new com.meituan.msc.common.support.java.util.function.d<Throwable, com.meituan.msc.modules.apploader.a>() { // from class: com.meituan.msc.modules.preload.g.8
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.common.support.java.util.function.d
            public final /* synthetic */ com.meituan.msc.modules.apploader.a a(Throwable th) {
                Throwable th2 = th;
                Object[] objArr2 = {th2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e9f5952b47646cca220fa1ebedf820ad", RobustBitConfig.DEFAULT_VALUE)) {
                    return (com.meituan.msc.modules.apploader.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e9f5952b47646cca220fa1ebedf820ad");
                }
                com.meituan.msc.modules.reporter.g.b("PreloadBiz", th2, "doPreloadAppPackage error", str, str2, o.b(th2));
                RuntimePreloadReporter.a.b().a(th2, str, str2, "bizPreload");
                g.d.remove(str);
                if (aVar != null) {
                    aVar.a(th2.getMessage(), new Exception(th2));
                    return null;
                }
                return null;
            }
        });
    }

    private boolean a(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3298d0d53388f2772fbb8dfa78a786a0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3298d0d53388f2772fbb8dfa78a786a0")).booleanValue();
        }
        com.meituan.msc.modules.apploader.a aVar = (com.meituan.msc.modules.apploader.a) hVar.c(com.meituan.msc.modules.apploader.a.class);
        return (aVar == null || aVar.c()) ? false : true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private void a(final String str, @Nullable com.meituan.msc.common.framework.a<Void> aVar) {
        Object[] objArr = {str, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d285a2358d9fc87e91128faa88577889", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d285a2358d9fc87e91128faa88577889");
            return;
        }
        MSCEnvHelper.ensureFullInited();
        if (!MSCHornPreloadConfig.d(str)) {
            com.meituan.msc.modules.reporter.g.d("PreloadBiz", str + " is not in preloadAppWhiteList");
            return;
        }
        com.meituan.msc.modules.reporter.g.d("PreloadBiz", "cleanPreloadApp start:", str);
        h b2 = q.b(str);
        if (b2 != null) {
            b2.a(p.a(p.CLEAN_PRELOAD_APP), new com.meituan.msc.common.framework.a<Void>() { // from class: com.meituan.msc.modules.preload.g.10
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.common.framework.a
                public final void a() {
                }

                @Override // com.meituan.msc.common.framework.a
                public final /* synthetic */ void a(Void r12) {
                    Object[] objArr2 = {r12};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e21a0409d15de4954c042213ca0b9cae", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e21a0409d15de4954c042213ca0b9cae");
                        return;
                    }
                    com.meituan.msc.modules.reporter.g.d("PreloadBiz", "cleanPreloadApp success:", str);
                    g.d.remove(str);
                    if (r3 != null) {
                        r3.a(null);
                    }
                }

                @Override // com.meituan.msc.common.framework.a
                public final void a(String str2, Exception exc) {
                    Object[] objArr2 = {str2, exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a900064a5e5c61a323f3cb2962bc1b7d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a900064a5e5c61a323f3cb2962bc1b7d");
                        return;
                    }
                    com.meituan.msc.modules.reporter.g.d("PreloadBiz", "cleanPreloadApp failed:", str);
                    if (r3 != null) {
                        r3.a("", new IllegalStateException());
                    }
                }
            });
        } else {
            com.meituan.msc.modules.reporter.g.d("PreloadBiz", "runtime not exist,cleanPreloadApp end:", str);
        }
    }

    private static void a(final String str, final String str2, final boolean z, final com.meituan.msc.common.framework.a<PreloadResultData> aVar, boolean z2) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "04388ca29a140af77afe6ebfd214dd54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "04388ca29a140af77afe6ebfd214dd54");
        } else if (com.meituan.msc.common.framework.d.b(str)) {
            com.meituan.msc.modules.reporter.g.d("PreloadBiz", "The same appId app has preloaded!");
            aVar.a();
        } else if (MSCMultiProcessConfig.d().c(str) && !com.meituan.msc.common.process.a.STANDARD.c()) {
            ((a) IPCInvoke.a(b.class, com.meituan.msc.common.process.a.STANDARD)).a(str, str2, true, aVar);
        } else {
            com.meituan.msc.common.framework.a<h> aVar2 = new com.meituan.msc.common.framework.a<h>() { // from class: com.meituan.msc.modules.preload.g.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.common.framework.a
                public final /* synthetic */ void a(h hVar) {
                    h hVar2 = hVar;
                    Object[] objArr2 = {hVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3e51d7a7b446671ca12d98ef99ce57d5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3e51d7a7b446671ca12d98ef99ce57d5");
                        return;
                    }
                    com.meituan.msc.modules.reporter.g.d("PreloadBiz", "preload success", hVar2);
                    if (com.meituan.msc.common.framework.a.this != null) {
                        PreloadResultData.a aVar3 = new PreloadResultData.a(hVar2.a(), str2, z);
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = PreloadResultData.a.a;
                        com.meituan.msc.common.framework.a.this.a(PatchProxy.isSupport(objArr3, aVar3, changeQuickRedirect3, false, "9c874f3c741e275b5cb170733cc0cec2", RobustBitConfig.DEFAULT_VALUE) ? (PreloadResultData) PatchProxy.accessDispatch(objArr3, aVar3, changeQuickRedirect3, false, "9c874f3c741e275b5cb170733cc0cec2") : new PreloadResultData(aVar3));
                    }
                }

                @Override // com.meituan.msc.common.framework.a
                public final void a(String str3, Exception exc) {
                    Object[] objArr2 = {str3, exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c6e4cfe6b57bfa8cc53c5de5f3e36db3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c6e4cfe6b57bfa8cc53c5de5f3e36db3");
                        return;
                    }
                    com.meituan.msc.modules.reporter.g.d("PreloadBiz", "preload fail", str, str2, Boolean.valueOf(z), "errMsg:", str3);
                    if (com.meituan.msc.common.framework.a.this != null) {
                        com.meituan.msc.common.framework.a.this.a(str3, exc);
                    }
                }

                @Override // com.meituan.msc.common.framework.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5377cdf3a4edeb0b962043d14f8bbe7b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5377cdf3a4edeb0b962043d14f8bbe7b");
                        return;
                    }
                    com.meituan.msc.modules.reporter.g.d("PreloadBiz", "preload cancel", str, str2, Boolean.valueOf(z));
                    if (com.meituan.msc.common.framework.a.this != null) {
                        com.meituan.msc.common.framework.a.this.a();
                    }
                }
            };
            if (z2) {
                b.a(str, str2, z, (String) null, (String) null, aVar2);
            } else {
                b.a(str, str2, (String) null, (String) null, aVar2, z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b implements a {
        public static ChangeQuickRedirect a;

        @Override // com.meituan.msc.modules.preload.g.a
        public final void a(String str, String str2, boolean z, com.meituan.msc.common.framework.a<PreloadResultData> aVar) {
            Object[] objArr = {str, str2, (byte) 1, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32ec62eeffdac7761bc0a920355899d6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32ec62eeffdac7761bc0a920355899d6");
            } else {
                g.a(str, str2, true, aVar);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void a(String str, String str2, boolean z, com.meituan.msc.common.framework.a<PreloadResultData> aVar) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f8ca52c54a43bb5b0f66b8ab86583855", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f8ca52c54a43bb5b0f66b8ab86583855");
        } else {
            a(str, str2, z, aVar, true);
        }
    }
}
