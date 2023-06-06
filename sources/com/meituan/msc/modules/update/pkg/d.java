package com.meituan.msc.modules.update.pkg;

import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.dio.easy.DioFile;
import com.meituan.met.mercury.load.bean.ResourceNameVersion;
import com.meituan.met.mercury.load.core.DDResource;
import com.meituan.msc.common.utils.ad;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.engine.MSCHornRollbackConfig;
import com.meituan.msc.modules.engine.q;
import com.meituan.msc.modules.preload.PackageDebugHelper;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msc.modules.update.MSCHornBasePackageReloadConfig;
import com.meituan.msc.modules.update.PackageLoadReporter;
import com.meituan.msc.modules.update.PackagePreLoadReporter;
import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import com.meituan.msc.modules.update.k;
import com.meituan.msc.modules.update.pkg.a;
import com.meituan.msc.util.perf.PerfEventRecorder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.vivo.push.PushClientConstants;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class d {
    public static ChangeQuickRedirect a;
    public static final AtomicInteger c = new AtomicInteger(0);
    public static final CopyOnWriteArrayList<com.meituan.android.mercury.msc.adaptor.callback.b> d = new CopyOnWriteArrayList<>();
    private static volatile d e;
    public String b;
    private long f;

    public static /* synthetic */ void a(d dVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "ac44869b5418cbda46630d1fe12dc9d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "ac44869b5418cbda46630d1fe12dc9d2");
            return;
        }
        SharedPreferences sharedPreferences = MSCEnvHelper.getSharedPreferences("msc_version");
        g.d("bundle", "cacheMSCAARVersion", sharedPreferences.getString("aar_version", null), "1.18.23.2");
        sharedPreferences.edit().putString("aar_version", "1.18.23.2").apply();
    }

    public static /* synthetic */ void a(d dVar, DDResource dDResource) {
        Object[] objArr = {dDResource};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "9892c6619556c72cfd119b04c955fef0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "9892c6619556c72cfd119b04c955fef0");
            return;
        }
        a.C0476a.C0477a c0477a = new a.C0476a.C0477a();
        PackageDebugHelper packageDebugHelper = PackageDebugHelper.b;
        c0477a.b = PackageDebugHelper.a();
        c0477a.c = dDResource.getName();
        c0477a.d = dDResource.getVersion();
        a.b = c0477a.a();
    }

    public static /* synthetic */ void a(d dVar, b bVar, PerfEventRecorder perfEventRecorder, String str, Exception exc) {
        Object[] objArr = {bVar, perfEventRecorder, str, exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "40bec7490457a49c142a3c4f4d50d342", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "40bec7490457a49c142a3c4f4d50d342");
            return;
        }
        g.a("bundle", str);
        bVar.a(str, exc);
        ad adVar = new ad();
        adVar.put("status", "fail");
        perfEventRecorder.b("fetch_base_package", adVar);
    }

    public static /* synthetic */ void a(d dVar, Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "f6b24056e3bedfa5db578ae38ae070c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "f6b24056e3bedfa5db578ae38ae070c8");
            return;
        }
        PackagePreLoadReporter b = PackagePreLoadReporter.b();
        k.a aVar = new k.a();
        aVar.g = PackageInfoWrapper.PACKAGE_TYPE_STR_BASE;
        aVar.d = "backgrounddownload";
        b.a(aVar.a(), exc);
    }

    public static /* synthetic */ void a(d dVar, String str, String str2, com.meituan.android.mercury.msc.adaptor.core.e eVar) {
        Object[] objArr = {str, str2, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "35b060930ab49a5d0c9a2b413ce9b673", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "35b060930ab49a5d0c9a2b413ce9b673");
            return;
        }
        g.b("bundle", eVar, "doFetchBasePackageFailed", str2);
        Iterator<com.meituan.android.mercury.msc.adaptor.callback.b> it = d.iterator();
        while (it.hasNext()) {
            it.next().a(eVar);
        }
        d.clear();
    }

    public static /* synthetic */ boolean a(d dVar, String str, DDResource dDResource) {
        Object[] objArr = {str, dDResource};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "300597869c37b90c9b16605048337c7e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "300597869c37b90c9b16605048337c7e")).booleanValue();
        }
        boolean c2 = new DioFile(dDResource.getLocalPath()).c();
        boolean isLocalCacheValid = c2 ? dDResource.isLocalCacheValid() : false;
        if (!c2 || !isLocalCacheValid) {
            PackageLoadReporter.a b = PackageLoadReporter.a.b();
            String name = dDResource.getName();
            Object[] objArr2 = {str, name, Byte.valueOf(c2 ? (byte) 1 : (byte) 0), (byte) 0};
            ChangeQuickRedirect changeQuickRedirect2 = PackageLoadReporter.a.d;
            if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "0d924ecfdd1caf5d6643a20505977d68", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "0d924ecfdd1caf5d6643a20505977d68");
            } else {
                b.b("msc.package.invalid").a(0.0d).a("pkgType", str).a(PushClientConstants.TAG_PKG_NAME, name).a("fileExist", Boolean.valueOf(c2)).a("isMd5Same", Boolean.FALSE).b();
            }
        }
        return (c2 && isLocalCacheValid) ? false : true;
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcfa7789ad70678c20017365597aa0b1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcfa7789ad70678c20017365597aa0b1");
        } else {
            this.b = "check not start";
        }
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f700b93ad5fc9f9ecc4e07b2d9c9f6f8", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f700b93ad5fc9f9ecc4e07b2d9c9f6f8");
        }
        if (e == null) {
            synchronized (d.class) {
                if (e == null) {
                    e = new d();
                }
            }
        }
        return e;
    }

    public com.meituan.android.mercury.msc.adaptor.callback.b a(final com.meituan.android.mercury.msc.adaptor.callback.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edb82f8d3ca8d9dafd8947a8973a573f", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.mercury.msc.adaptor.callback.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edb82f8d3ca8d9dafd8947a8973a573f");
        }
        if (MSCHornRollbackConfig.d().c().isRollbackDeleteDDDCacheChange) {
            g.d("bundle", "createRetryDownloadBasePackageCallback rollbackDeleteDDDCacheChange");
            return bVar;
        }
        return new com.meituan.android.mercury.msc.adaptor.callback.b() { // from class: com.meituan.msc.modules.update.pkg.d.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mercury.msc.adaptor.callback.b
            public final void a(@Nullable DDResource dDResource) {
                Object[] objArr2 = {dDResource};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fea224f9824061676e1be598ee3ed144", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fea224f9824061676e1be598ee3ed144");
                } else if (dDResource == null) {
                    bVar.a((DDResource) null);
                } else if (d.a(d.this, PackageInfoWrapper.PACKAGE_TYPE_STR_BASE, dDResource)) {
                    q.a(dDResource);
                    g.d("bundle", "fetchLatestBasePackage after delete cache");
                    com.meituan.android.mercury.msc.adaptor.core.b.a("mscsdk_base", false, bVar);
                } else {
                    bVar.a(dDResource);
                }
            }

            @Override // com.meituan.android.mercury.msc.adaptor.callback.b
            public final void a(com.meituan.android.mercury.msc.adaptor.core.e eVar) {
                Object[] objArr2 = {eVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e531ac1ca48edc2f95d7a472837ebf0e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e531ac1ca48edc2f95d7a472837ebf0e");
                } else {
                    bVar.a(eVar);
                }
            }
        };
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6011159854f753521e5c41b0ce61d3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6011159854f753521e5c41b0ce61d3a");
        } else {
            MSCEnvHelper.getSharedPreferences("msc_version").edit().remove("aar_version").apply();
        }
    }

    public static AtomicInteger a(String str) {
        return c;
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a93ffef707b3888cbba0fe65b315a553", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a93ffef707b3888cbba0fe65b315a553");
        } else if (d()) {
            this.b = "not out of time interval";
            g.d("bundle", "base package check update not out of time interval");
        } else {
            g.d("bundle", "forceCheckUpdateLatestBasePackage");
            a((String) null, a(new com.meituan.android.mercury.msc.adaptor.callback.b() { // from class: com.meituan.msc.modules.update.pkg.d.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.mercury.msc.adaptor.callback.b
                public final void a(@Nullable DDResource dDResource) {
                    Object[] objArr2 = {dDResource};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ef2744f026044320705fd0cdf4f1bd31", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ef2744f026044320705fd0cdf4f1bd31");
                        return;
                    }
                    d.this.f = System.currentTimeMillis();
                    if (dDResource == null) {
                        d.this.b = "resource is null";
                        g.b("bundle", null, "forceCheckUpdateLatestBasePackage failed,resource is null");
                        d.a(d.this, new IllegalStateException("resource is null"));
                        return;
                    }
                    if (dDResource.isFromNet()) {
                        d.this.b = "check update success,new resource";
                    } else {
                        d.this.b = "check update success,cache";
                    }
                    g.d("bundle", "forceCheckUpdateLatestBasePackage success:", dDResource);
                    d.a(d.this, dDResource);
                    PackagePreLoadReporter b = PackagePreLoadReporter.b();
                    k.a aVar = new k.a();
                    aVar.e = dDResource.isFromNet() ? "network" : PackageLoadReporter.LoadType.LOCAL;
                    aVar.f = dDResource.getName();
                    aVar.g = PackageInfoWrapper.PACKAGE_TYPE_STR_BASE;
                    aVar.d = "backgrounddownload";
                    b.a(aVar.a());
                }

                @Override // com.meituan.android.mercury.msc.adaptor.callback.b
                public final void a(com.meituan.android.mercury.msc.adaptor.core.e eVar) {
                    Object[] objArr2 = {eVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9f4836171d73e699b92b60f6631d9185", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9f4836171d73e699b92b60f6631d9185");
                        return;
                    }
                    g.b("bundle", eVar, "forceCheckUpdateLatestBasePackage failed");
                    d dVar = d.this;
                    StringBuilder sb = new StringBuilder("check update failed:");
                    sb.append(eVar != null ? eVar.getMessage() : "");
                    dVar.b = sb.toString();
                    d.a(d.this, eVar);
                }
            }));
        }
    }

    private boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0218bd918d945acd4a981a80ea47a800", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0218bd918d945acd4a981a80ea47a800")).booleanValue() : System.currentTimeMillis() - this.f <= com.meituan.msc.common.config.b.A();
    }

    public void a(String str, com.meituan.android.mercury.msc.adaptor.callback.b bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18437497f3bf349223880a4ae14077f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18437497f3bf349223880a4ae14077f1");
            return;
        }
        String a2 = PackageDebugHelper.b.a(str);
        if (c.get() == 0) {
            c.compareAndSet(0, 1);
            d.add(bVar);
            c(a2);
            return;
        }
        d.add(bVar);
    }

    private void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "645c750465dbb86ecf9e8c982e89c9d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "645c750465dbb86ecf9e8c982e89c9d9");
            return;
        }
        g.d("bundle", "doFetchBasePackage", str);
        com.meituan.android.mercury.msc.adaptor.core.b.a("mscsdk_base", false, d(str));
    }

    private com.meituan.android.mercury.msc.adaptor.callback.b d(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a483aafe4ef6644aa01380d382923b5", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.mercury.msc.adaptor.callback.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a483aafe4ef6644aa01380d382923b5") : new com.meituan.android.mercury.msc.adaptor.callback.b() { // from class: com.meituan.msc.modules.update.pkg.d.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mercury.msc.adaptor.callback.b
            public final void a(@Nullable DDResource dDResource) {
                Object[] objArr2 = {dDResource};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c5ac65ec9ffe23c71308f031e893b1b8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c5ac65ec9ffe23c71308f031e893b1b8");
                    return;
                }
                d.a(str).set(0);
                if (dDResource == null) {
                    g.d("bundle", "doFetchBasePackage failed,ddResource is null");
                    d.a(d.this, str, "doFetchBasePackage failed,ddResource is null", null);
                    return;
                }
                g.d("bundle", "doFetchBasePackage success:", dDResource);
                if (!MSCHornBasePackageReloadConfig.e().c(dDResource.getVersion())) {
                    d.a(d.this);
                }
                Iterator<com.meituan.android.mercury.msc.adaptor.callback.b> it = d.b(str).iterator();
                while (it.hasNext()) {
                    it.next().a(dDResource);
                }
                d.b(str).clear();
            }

            @Override // com.meituan.android.mercury.msc.adaptor.callback.b
            public final void a(com.meituan.android.mercury.msc.adaptor.core.e eVar) {
                Object[] objArr2 = {eVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6fe1857bc9010bcbb09654f5a34d054f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6fe1857bc9010bcbb09654f5a34d054f");
                    return;
                }
                d.a(str).set(0);
                StringBuilder sb = new StringBuilder("fetchLatestBasePackage failed:");
                sb.append(eVar == null ? "" : eVar.toString());
                String sb2 = sb.toString();
                g.d("bundle", sb2);
                d.a(d.this, str, sb2, eVar);
            }
        };
    }

    public static CopyOnWriteArrayList<com.meituan.android.mercury.msc.adaptor.callback.b> b(String str) {
        return d;
    }

    public final void a(final PerfEventRecorder perfEventRecorder, @NonNull final PackageInfoWrapper packageInfoWrapper, final b<PackageInfoWrapper> bVar) {
        Object[] objArr = {perfEventRecorder, packageInfoWrapper, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46d9b78cc9dbee049dae40d5e7491edd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46d9b78cc9dbee049dae40d5e7491edd");
            return;
        }
        final ad adVar = new ad();
        adVar.put("md5", packageInfoWrapper.getMd5());
        if (perfEventRecorder != null) {
            perfEventRecorder.a("fetch_biz_package", (ConcurrentHashMap<String, Object>) adVar);
        }
        final b<PackageInfoWrapper> bVar2 = new b<PackageInfoWrapper>() { // from class: com.meituan.msc.modules.update.pkg.d.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.modules.update.pkg.b
            public final /* synthetic */ void a(@NonNull PackageInfoWrapper packageInfoWrapper2) {
                PackageInfoWrapper packageInfoWrapper3 = packageInfoWrapper2;
                Object[] objArr2 = {packageInfoWrapper3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "40037793a49775ae403810b6ad751ed7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "40037793a49775ae403810b6ad751ed7");
                    return;
                }
                bVar.a(packageInfoWrapper3);
                adVar.put("status", "ok");
                if (perfEventRecorder != null) {
                    perfEventRecorder.b(r5, adVar);
                }
            }

            @Override // com.meituan.msc.modules.update.pkg.b
            public final void a(String str, Exception exc) {
                Object[] objArr2 = {str, exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "26c431d8d2ca1cfdfb6552e5adb04ef2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "26c431d8d2ca1cfdfb6552e5adb04ef2");
                    return;
                }
                bVar.a(str, exc);
                adVar.put("status", "fail");
                if (perfEventRecorder != null) {
                    perfEventRecorder.b(r5, adVar);
                }
            }
        };
        g.d("bundle", "fetchPackageWithInfo:" + packageInfoWrapper);
        final long currentTimeMillis = System.currentTimeMillis();
        com.meituan.android.mercury.msc.adaptor.core.b.a(packageInfoWrapper.getPackageInfo(), a(packageInfoWrapper, new com.meituan.android.mercury.msc.adaptor.callback.b() { // from class: com.meituan.msc.modules.update.pkg.d.6
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mercury.msc.adaptor.callback.b
            public final void a(@Nullable DDResource dDResource) {
                Object[] objArr2 = {dDResource};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "61283cc1aef40c0185ec28730b45d6c5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "61283cc1aef40c0185ec28730b45d6c5");
                } else if (dDResource == null) {
                    g.a("bundle", "fetchPackageWithInfo failed,ddResource is null");
                    bVar2.a("fetchPackageWithInfo failed,ddResource is null", new com.meituan.msc.common.exception.a());
                } else {
                    packageInfoWrapper.setDDResource(dDResource);
                    packageInfoWrapper.setDownloadTimeInMs(currentTimeMillis, System.currentTimeMillis());
                    g.d("bundle", String.format("fetchPackageWithInfo success,pckType:%s,isFromNet:%s,md5:%s", packageInfoWrapper.getPkgTypeString(), Boolean.valueOf(packageInfoWrapper.isFromNet()), packageInfoWrapper.getMd5()));
                    bVar2.a(packageInfoWrapper);
                }
            }

            @Override // com.meituan.android.mercury.msc.adaptor.callback.b
            public final void a(com.meituan.android.mercury.msc.adaptor.core.e eVar) {
                Object[] objArr2 = {eVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "027668bee562b04d6b98212a8334b428", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "027668bee562b04d6b98212a8334b428");
                    return;
                }
                g.b("bundle", eVar, "fetchPackageWithInfo failed");
                bVar2.a("fetchPackageWithInfo failed", eVar);
            }
        }));
    }

    private com.meituan.android.mercury.msc.adaptor.callback.b a(final PackageInfoWrapper packageInfoWrapper, final com.meituan.android.mercury.msc.adaptor.callback.b bVar) {
        Object[] objArr = {packageInfoWrapper, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e451569484c4075c4c878515f96cd0a3", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.mercury.msc.adaptor.callback.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e451569484c4075c4c878515f96cd0a3");
        }
        if (MSCHornRollbackConfig.d().c().isRollbackDeleteDDDCacheChange) {
            g.d("bundle", "createRetryDownloadBizPackageCallback rollbackDeleteDDDCacheChange");
            return bVar;
        }
        return new com.meituan.android.mercury.msc.adaptor.callback.b() { // from class: com.meituan.msc.modules.update.pkg.d.7
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mercury.msc.adaptor.callback.b
            public final void a(@Nullable DDResource dDResource) {
                Object[] objArr2 = {dDResource};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "539392cc5700aeb1b935335c6b3b52bf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "539392cc5700aeb1b935335c6b3b52bf");
                } else if (dDResource == null) {
                    bVar.a((DDResource) null);
                } else if (d.a(d.this, packageInfoWrapper.getPkgTypeString(), dDResource)) {
                    d.this.a(dDResource);
                    com.meituan.android.mercury.msc.adaptor.core.b.a(packageInfoWrapper.getPackageInfo(), bVar);
                } else {
                    bVar.a(dDResource);
                }
            }

            @Override // com.meituan.android.mercury.msc.adaptor.callback.b
            public final void a(com.meituan.android.mercury.msc.adaptor.core.e eVar) {
                Object[] objArr2 = {eVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "52548e5a4c7c5c9709a094796ec3c1bf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "52548e5a4c7c5c9709a094796ec3c1bf");
                } else {
                    bVar.a(eVar);
                }
            }
        };
    }

    public final void a(DDResource dDResource) {
        Object[] objArr = {dDResource};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c1e01a83e35fe504391c06e6d1285f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c1e01a83e35fe504391c06e6d1285f0");
        } else if (MSCHornRollbackConfig.d().c().isRollbackDeleteDDDCacheChange) {
            g.d("bundle", "rollbackDeleteDDDCacheChange", dDResource);
        } else if (dDResource == null) {
            g.d("bundle", "deleteBasePackageCache null");
        } else {
            g.d("bundle", "deleteBasePackageCache", dDResource);
            ResourceNameVersion.Builder builder = new ResourceNameVersion.Builder();
            builder.name(dDResource.getName());
            builder.version(dDResource.getVersion());
            com.meituan.met.mercury.load.core.g.a(dDResource.getBusiness()).a(Collections.singletonList(builder.build()));
        }
    }
}
