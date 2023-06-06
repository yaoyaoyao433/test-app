package com.meituan.msc.modules.update.metainfo;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.mercury.msc.adaptor.bean.MSCAppMetaInfo;
import com.meituan.android.mercury.msc.adaptor.bean.MSCMetaInfo;
import com.meituan.met.mercury.load.bean.MSCAppIdPublishId;
import com.meituan.msc.common.utils.ad;
import com.meituan.msc.common.utils.ay;
import com.meituan.msc.common.utils.f;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.container.o;
import com.meituan.msc.modules.engine.MSCHornRollbackConfig;
import com.meituan.msc.modules.engine.l;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msc.modules.update.PackageLoadReporter;
import com.meituan.msc.modules.update.PackagePreLoadReporter;
import com.meituan.msc.modules.update.bean.AppMetaInfoWrapper;
import com.meituan.msc.modules.update.bean.CheckUpdateParams;
import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import com.meituan.msc.modules.update.k;
import com.meituan.msc.modules.update.pkg.d;
import com.meituan.msc.modules.update.pkg.e;
import com.meituan.msc.util.perf.PerfEventRecorder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a {
    public static ChangeQuickRedirect a = null;
    public static String e = "batch update not start";
    public static volatile boolean f;
    private static volatile a g;
    public Map<CheckUpdateParams, com.meituan.msc.common.support.java.util.concurrent.a<AppMetaInfoWrapper>> b;
    public final CopyOnWriteArrayList<InterfaceC0475a> c;
    public final ad<String, String> d;
    private long h;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.msc.modules.update.metainfo.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0475a {
        void a(List<MSCAppIdPublishId> list);
    }

    public static /* synthetic */ void a(a aVar, MSCMetaInfo mSCMetaInfo) {
        Object[] objArr = {mSCMetaInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "95b5680149e90d0451a8311366669115", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "95b5680149e90d0451a8311366669115");
            return;
        }
        List<MSCAppIdPublishId> mscAppVersionsToDelete = mSCMetaInfo.getMscAppVersionsToDelete();
        if (mscAppVersionsToDelete == null || mscAppVersionsToDelete.isEmpty()) {
            g.a("bundle", "checkUpdateWithRecentlyUsedList appVersionsToDelete is empty");
            return;
        }
        Iterator<InterfaceC0475a> it = aVar.c.iterator();
        while (it.hasNext()) {
            InterfaceC0475a next = it.next();
            g.b("bundle", "sendAppVersionsOfflineEventTo:", next);
            next.a(mscAppVersionsToDelete);
        }
    }

    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v5 */
    public static /* synthetic */ void a(a aVar, MSCMetaInfo mSCMetaInfo, final PackagePreLoadReporter packagePreLoadReporter) {
        char c = 2;
        int i = 1;
        Object[] objArr = {mSCMetaInfo, packagePreLoadReporter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "3ec6ee964243a10746b70bd10fbd408d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "3ec6ee964243a10746b70bd10fbd408d");
            return;
        }
        List<MSCAppMetaInfo> mscApps = mSCMetaInfo.getMscApps();
        if (mscApps == null || mscApps.isEmpty()) {
            g.d("bundle", "batchCheckUpdate mscApps is empty");
            return;
        }
        for (MSCAppMetaInfo mSCAppMetaInfo : mscApps) {
            if (mSCAppMetaInfo != null) {
                if (o.b.a()) {
                    f = i;
                    e = "pre download cancel,has page launching";
                    Object[] objArr2 = new Object[i];
                    objArr2[0] = e;
                    g.d("bundle", objArr2);
                    return;
                }
                final String appId = mSCAppMetaInfo.getAppId();
                final String version = mSCAppMetaInfo.getVersion();
                final PackageInfoWrapper createMainPackageWrapper = new AppMetaInfoWrapper(mSCAppMetaInfo).createMainPackageWrapper();
                Object[] objArr3 = new Object[4];
                objArr3[0] = appId;
                objArr3[i] = version;
                objArr3[c] = createMainPackageWrapper;
                objArr3[3] = packagePreLoadReporter;
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect2, false, "a88ed2a3cf19cd49fca93f5b15fd8af7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect2, false, "a88ed2a3cf19cd49fca93f5b15fd8af7");
                } else {
                    g.d(null, "[MSC][PreDownload]start:", createMainPackageWrapper.getMd5());
                    d.a().a((PerfEventRecorder) null, createMainPackageWrapper, new com.meituan.msc.modules.update.pkg.b<PackageInfoWrapper>() { // from class: com.meituan.msc.modules.update.metainfo.a.6
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.msc.modules.update.pkg.b
                        public final /* synthetic */ void a(@NonNull PackageInfoWrapper packageInfoWrapper) {
                            PackageInfoWrapper packageInfoWrapper2 = packageInfoWrapper;
                            Object[] objArr4 = {packageInfoWrapper2};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect3, false, "5119e8fd6489f9cb15e7ea025495d4a8", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect3, false, "5119e8fd6489f9cb15e7ea025495d4a8");
                                return;
                            }
                            g.d(null, "[MSC][PreDownload]end:", createMainPackageWrapper.getMd5());
                            com.meituan.msc.modules.service.codecache.c.a().a(appId, version, packageInfoWrapper2);
                            e.a(appId, packageInfoWrapper2);
                            PackagePreLoadReporter packagePreLoadReporter2 = packagePreLoadReporter;
                            k.a aVar2 = new k.a();
                            aVar2.b = appId;
                            aVar2.c = version;
                            aVar2.f = packageInfoWrapper2.getPackageName();
                            aVar2.d = "predownload";
                            aVar2.e = packageInfoWrapper2.isFromNet() ? "network" : PackageLoadReporter.LoadType.LOCAL;
                            aVar2.g = createMainPackageWrapper.getPkgTypeString();
                            packagePreLoadReporter2.a(aVar2.a());
                        }

                        @Override // com.meituan.msc.modules.update.pkg.b
                        public final void a(String str, Exception exc) {
                            Object[] objArr4 = {str, exc};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect3, false, "86b155dc08b427e3946e83ade0193f89", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect3, false, "86b155dc08b427e3946e83ade0193f89");
                                return;
                            }
                            g.a("bundle", String.format("preDownLoadPackage failed,%s,%s,%s", appId, createMainPackageWrapper.toString(), str));
                            PackagePreLoadReporter packagePreLoadReporter2 = packagePreLoadReporter;
                            k.a aVar2 = new k.a();
                            aVar2.b = appId;
                            aVar2.c = version;
                            aVar2.d = "predownload";
                            aVar2.g = createMainPackageWrapper.getPkgTypeString();
                            packagePreLoadReporter2.a(aVar2.a(), exc);
                        }
                    });
                }
                c = 2;
                i = 1;
            }
        }
    }

    public static /* synthetic */ void a(a aVar, MSCMetaInfo mSCMetaInfo, c cVar) {
        Object[] objArr = {mSCMetaInfo, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "e8e20e555a43226021f8c7c3871f451b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "e8e20e555a43226021f8c7c3871f451b");
        } else if (mSCMetaInfo == null) {
            g.a("bundle", "checkUpdate metaInfo is null");
            cVar.a("checkUpdate metaInfo is null", null);
        } else {
            List<MSCAppMetaInfo> mscApps = mSCMetaInfo.getMscApps();
            if (mscApps != null && !mscApps.isEmpty()) {
                AppMetaInfoWrapper appMetaInfoWrapper = new AppMetaInfoWrapper(mscApps.get(0));
                if (appMetaInfoWrapper.isFromCache()) {
                    g.d("bundle", "getMetaInfoSuccess from cache");
                } else {
                    b a2 = b.a();
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = b.a;
                    if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "c560eca001680d57dbfdedc308a6968d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "c560eca001680d57dbfdedc308a6968d");
                    } else {
                        a2.b = System.currentTimeMillis();
                        g.b("BackgroundCheckUpdateManager", "recordLastCheckUpdateTimestamp:", Long.valueOf(a2.b));
                    }
                }
                g.d("bundle", "checkUpdate success:", mSCMetaInfo);
                Object[] objArr3 = {cVar, appMetaInfoWrapper};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "ea06cab26ae6ccb1b62bad73dd130a84", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "ea06cab26ae6ccb1b62bad73dd130a84");
                    return;
                } else {
                    cVar.a(appMetaInfoWrapper);
                    return;
                }
            }
            g.a("bundle", "checkUpdate mscApps is empty");
            cVar.a("checkUpdate mscApps is empty", new com.meituan.msc.common.exception.a("checkUpdate mscApps is empty"));
        }
    }

    public static /* synthetic */ void a(a aVar, com.meituan.android.mercury.msc.adaptor.core.e eVar, c cVar) {
        Object[] objArr = {eVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "e5bf13dbd8455dff9071e2031b475679", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "e5bf13dbd8455dff9071e2031b475679");
            return;
        }
        g.b("bundle", eVar, "getMetaInfoFailed");
        cVar.a("checkUpdate failed", eVar);
    }

    public static /* synthetic */ boolean a(a aVar, AppMetaInfoWrapper appMetaInfoWrapper) {
        Object[] objArr = {appMetaInfoWrapper};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "8999f05c6042be02e1a254bd135f4557", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "8999f05c6042be02e1a254bd135f4557")).booleanValue();
        }
        String str = aVar.d.get(appMetaInfoWrapper.getAppId());
        return TextUtils.isEmpty(str) || ay.a(appMetaInfoWrapper.getVersion(), str) >= 0;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "371db6f50df20dbac53e5cd81e5e7b01", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "371db6f50df20dbac53e5cd81e5e7b01");
            return;
        }
        this.b = new ConcurrentHashMap();
        this.c = new CopyOnWriteArrayList<>();
        this.d = new ad<>();
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f1a96908396f3a1e3d822dc4296eb5be", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f1a96908396f3a1e3d822dc4296eb5be");
        }
        if (g == null) {
            synchronized (a.class) {
                if (g == null) {
                    g = new a();
                }
            }
        }
        return g;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2afdf928f29960fbde061e283c70663a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2afdf928f29960fbde061e283c70663a");
        } else if (c()) {
            e = "batch update failed,not out of time interval";
            g.d("bundle", e);
        } else {
            f = false;
            this.h = System.currentTimeMillis();
            List<String> a2 = l.a();
            g.d("bundle", "batchCheckUpdate:", f.a((Collection) a2));
            final PackagePreLoadReporter b = PackagePreLoadReporter.b();
            a(a2, new com.meituan.android.mercury.msc.adaptor.callback.a() { // from class: com.meituan.msc.modules.update.metainfo.a.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.mercury.msc.adaptor.callback.a
                public final void a(@Nullable MSCMetaInfo mSCMetaInfo) {
                    Object[] objArr2 = {mSCMetaInfo};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1108bc497497eae24cc98185b67c61de", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1108bc497497eae24cc98185b67c61de");
                    } else if (mSCMetaInfo == null) {
                        g.a("bundle", "batchCheckUpdate metaInfo is null");
                        b.a((com.meituan.android.mercury.msc.adaptor.core.e) null);
                    } else {
                        PackagePreLoadReporter packagePreLoadReporter = b;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = PackagePreLoadReporter.d;
                        if (PatchProxy.isSupport(objArr3, packagePreLoadReporter, changeQuickRedirect3, false, "876e3057d075daca2e3f476c7f5936a5", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, packagePreLoadReporter, changeQuickRedirect3, false, "876e3057d075daca2e3f476c7f5936a5");
                        } else {
                            packagePreLoadReporter.a(1, (com.meituan.android.mercury.msc.adaptor.core.e) null);
                        }
                        a.e = "batch update succeed";
                        a.a(a.this, mSCMetaInfo, b);
                        a.a(a.this, mSCMetaInfo);
                    }
                }

                @Override // com.meituan.android.mercury.msc.adaptor.callback.a
                public final void a(com.meituan.android.mercury.msc.adaptor.core.e eVar) {
                    Object[] objArr2 = {eVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "72c2704bf1fbad2f366585686d750cea", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "72c2704bf1fbad2f366585686d750cea");
                        return;
                    }
                    b.a(eVar);
                    g.a("bundle", eVar);
                    StringBuilder sb = new StringBuilder("batch update failed:");
                    sb.append(eVar != null ? eVar.getMessage() : "");
                    a.e = sb.toString();
                }
            });
        }
    }

    private void a(List<String> list, com.meituan.android.mercury.msc.adaptor.callback.a aVar) {
        Object[] objArr = {list, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6916ba586203d1cadf41b6ce74d9782c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6916ba586203d1cadf41b6ce74d9782c");
        } else {
            com.meituan.android.mercury.msc.adaptor.core.b.a(list, aVar);
        }
    }

    private boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebfecc7efaf98c71eb262eef46c82823", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebfecc7efaf98c71eb262eef46c82823")).booleanValue() : System.currentTimeMillis() - this.h <= com.meituan.msc.common.config.b.z();
    }

    public final void a(@NonNull final CheckUpdateParams checkUpdateParams, @NonNull final c<AppMetaInfoWrapper> cVar) {
        Object[] objArr = {checkUpdateParams, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c127255d70ff8ec59a8047b32a2a5bee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c127255d70ff8ec59a8047b32a2a5bee");
            return;
        }
        com.meituan.msc.common.support.java.util.concurrent.a<AppMetaInfoWrapper> aVar = this.b.get(checkUpdateParams);
        if (aVar != null) {
            aVar.a(new com.meituan.msc.common.support.java.util.function.c<AppMetaInfoWrapper>() { // from class: com.meituan.msc.modules.update.metainfo.a.9
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.common.support.java.util.function.c
                public final /* synthetic */ void a(AppMetaInfoWrapper appMetaInfoWrapper) {
                    AppMetaInfoWrapper appMetaInfoWrapper2 = appMetaInfoWrapper;
                    Object[] objArr2 = {appMetaInfoWrapper2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c272bd72520cad9ed26b2d19bd9d5b5c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c272bd72520cad9ed26b2d19bd9d5b5c");
                        return;
                    }
                    cVar.a(appMetaInfoWrapper2);
                    a.this.b.remove(checkUpdateParams);
                }
            }).c((com.meituan.msc.common.support.java.util.function.d<Throwable, ? extends Void>) new com.meituan.msc.common.support.java.util.function.d<Throwable, Void>() { // from class: com.meituan.msc.modules.update.metainfo.a.8
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.common.support.java.util.function.d
                public final /* synthetic */ Void a(Throwable th) {
                    Throwable th2 = th;
                    Object[] objArr2 = {th2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d77db3395f19ca9efa6b113641862588", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Void) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d77db3395f19ca9efa6b113641862588");
                    }
                    cVar.a(th2.getMessage(), new Exception(th2));
                    a.this.b.remove(checkUpdateParams);
                    return null;
                }
            });
            return;
        }
        g.d("bundle", "checkupdate for " + checkUpdateParams.appId + " from " + checkUpdateParams.checkUpdateUrl + " type: " + checkUpdateParams.getType());
        b(checkUpdateParams, new c<AppMetaInfoWrapper>() { // from class: com.meituan.msc.modules.update.metainfo.a.10
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.modules.update.metainfo.c
            public final /* synthetic */ void a(@NonNull AppMetaInfoWrapper appMetaInfoWrapper) {
                AppMetaInfoWrapper appMetaInfoWrapper2 = appMetaInfoWrapper;
                Object[] objArr2 = {appMetaInfoWrapper2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "094c7ad49612275c650a603abe27bde6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "094c7ad49612275c650a603abe27bde6");
                } else {
                    cVar.a(appMetaInfoWrapper2);
                }
            }

            @Override // com.meituan.msc.modules.update.metainfo.c
            public final void a(String str, Exception exc) {
                Object[] objArr2 = {str, exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a2753e4be60c1e9d892a37bd658f4436", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a2753e4be60c1e9d892a37bd658f4436");
                } else {
                    cVar.a(str, exc);
                }
            }
        });
    }

    public void b(@NonNull CheckUpdateParams checkUpdateParams, c<AppMetaInfoWrapper> cVar) {
        Object[] objArr = {checkUpdateParams, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6db426b25281b556823d46774baf6e58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6db426b25281b556823d46774baf6e58");
            return;
        }
        g.b("bundle", "checkUpdate:", checkUpdateParams);
        String str = checkUpdateParams.appId;
        switch (checkUpdateParams.getType()) {
            case 1:
                c(str, checkUpdateParams.checkUpdateUrl, cVar);
                return;
            case 2:
                a(str, cVar);
                return;
            case 3:
                a(str, checkUpdateParams.checkUpdateUrl, cVar);
                return;
            case 4:
                if (MSCHornRollbackConfig.d().c().isRollbackPageNotFoundStrategy1) {
                    cVar = c(checkUpdateParams, cVar);
                }
                b(str, checkUpdateParams.checkUpdateUrl, cVar);
                return;
            default:
                g.a("bundle", "error type:" + checkUpdateParams.getType());
                return;
        }
    }

    private c<AppMetaInfoWrapper> c(final CheckUpdateParams checkUpdateParams, final c<AppMetaInfoWrapper> cVar) {
        Object[] objArr = {checkUpdateParams, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0f9adb4dccdeda0f292a38a10df015c", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0f9adb4dccdeda0f292a38a10df015c") : MSCHornRollbackConfig.e() ? new c<AppMetaInfoWrapper>() { // from class: com.meituan.msc.modules.update.metainfo.a.11
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.modules.update.metainfo.c
            public final /* synthetic */ void a(@NonNull AppMetaInfoWrapper appMetaInfoWrapper) {
                final AppMetaInfoWrapper appMetaInfoWrapper2 = appMetaInfoWrapper;
                Object[] objArr2 = {appMetaInfoWrapper2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e7ecd4e79499b502b5cda9eb43f42b8d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e7ecd4e79499b502b5cda9eb43f42b8d");
                } else if (!appMetaInfoWrapper2.isFromCache()) {
                    cVar.a(appMetaInfoWrapper2);
                } else if (a.a(a.this, appMetaInfoWrapper2)) {
                    cVar.a(appMetaInfoWrapper2);
                } else {
                    Object[] objArr3 = {appMetaInfoWrapper2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "85f708bff78640a4a20e8b1126701625", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "85f708bff78640a4a20e8b1126701625");
                        return;
                    }
                    g.d("bundle", "retryCheckUpdateByNetwork", checkUpdateParams.toString());
                    a.this.c(checkUpdateParams.appId, checkUpdateParams.checkUpdateUrl, new c<AppMetaInfoWrapper>() { // from class: com.meituan.msc.modules.update.metainfo.a.11.1
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.msc.modules.update.metainfo.c
                        public final /* synthetic */ void a(@NonNull AppMetaInfoWrapper appMetaInfoWrapper3) {
                            AppMetaInfoWrapper appMetaInfoWrapper4 = appMetaInfoWrapper3;
                            Object[] objArr4 = {appMetaInfoWrapper4};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "bb8861596ec6a469aa103be1253a2d28", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "bb8861596ec6a469aa103be1253a2d28");
                                return;
                            }
                            appMetaInfoWrapper4.isFetchedByMinVersionLimit = true;
                            cVar.a(appMetaInfoWrapper4);
                        }

                        @Override // com.meituan.msc.modules.update.metainfo.c
                        public final void a(String str, Exception exc) {
                            Object[] objArr4 = {str, exc};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "03af93cf17bc1a9930867f49b3cf1b0b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "03af93cf17bc1a9930867f49b3cf1b0b");
                            } else {
                                cVar.a(appMetaInfoWrapper2);
                            }
                        }
                    });
                }
            }

            @Override // com.meituan.msc.modules.update.metainfo.c
            public final void a(String str, Exception exc) {
                Object[] objArr2 = {str, exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e7de24f978304ad1efd4eb27a10d303f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e7de24f978304ad1efd4eb27a10d303f");
                } else {
                    cVar.a(str, exc);
                }
            }
        } : cVar;
    }

    private void a(final String str, String str2, final c<AppMetaInfoWrapper> cVar) {
        Object[] objArr = {str, str2, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f1902fa554d2a3393e9cca3c49c5ae6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f1902fa554d2a3393e9cca3c49c5ae6");
            return;
        }
        g.d("bundle", "getMetaInfoFromNetworkOrCache checkUpdateWithAppId:" + str);
        com.meituan.android.mercury.msc.adaptor.core.b.a(str, str2, new com.meituan.android.mercury.msc.adaptor.callback.a() { // from class: com.meituan.msc.modules.update.metainfo.a.12
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mercury.msc.adaptor.callback.a
            public final void a(@Nullable MSCMetaInfo mSCMetaInfo) {
                Object[] objArr2 = {mSCMetaInfo};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "319df0ab2f883e1feea21248e5ca1d03", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "319df0ab2f883e1feea21248e5ca1d03");
                } else {
                    a.a(a.this, mSCMetaInfo, cVar);
                }
            }

            @Override // com.meituan.android.mercury.msc.adaptor.callback.a
            public final void a(com.meituan.android.mercury.msc.adaptor.core.e eVar) {
                Object[] objArr2 = {eVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b257ee9cef70876a31aa0c7af9226eb6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b257ee9cef70876a31aa0c7af9226eb6");
                    return;
                }
                g.b("bundle", eVar, "getMetaInfoFromNetworkOrCache onFailed");
                g.d("bundle", eVar, "getMetaInfoFromNetworkOrCache getCacheMetaWithAppId:", str);
                com.meituan.android.mercury.msc.adaptor.core.b.a(str, new com.meituan.android.mercury.msc.adaptor.callback.a() { // from class: com.meituan.msc.modules.update.metainfo.a.12.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.mercury.msc.adaptor.callback.a
                    public final void a(@Nullable MSCMetaInfo mSCMetaInfo) {
                        Object[] objArr3 = {mSCMetaInfo};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "48c88eb0e42db8ad168c817d409f229c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "48c88eb0e42db8ad168c817d409f229c");
                        } else {
                            a.a(a.this, mSCMetaInfo, cVar);
                        }
                    }

                    @Override // com.meituan.android.mercury.msc.adaptor.callback.a
                    public final void a(com.meituan.android.mercury.msc.adaptor.core.e eVar2) {
                        Object[] objArr3 = {eVar2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c0b180935b3cdd12ebcf0e502f6c0ee4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c0b180935b3cdd12ebcf0e502f6c0ee4");
                        } else {
                            a.a(a.this, eVar2, cVar);
                        }
                    }
                });
            }
        });
    }

    private void b(String str, String str2, final c<AppMetaInfoWrapper> cVar) {
        Object[] objArr = {str, str2, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "470bcf937bff6354a4dbc60221494784", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "470bcf937bff6354a4dbc60221494784");
            return;
        }
        long a2 = a(str);
        g.d("bundle", "getMetaInfoFromCacheOrNetwork getMetaWithAppId:" + str + ",cacheTimeOut:" + a2);
        com.meituan.android.mercury.msc.adaptor.core.b.a(str, a2, str2, new com.meituan.android.mercury.msc.adaptor.callback.a() { // from class: com.meituan.msc.modules.update.metainfo.a.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mercury.msc.adaptor.callback.a
            public final void a(@Nullable MSCMetaInfo mSCMetaInfo) {
                Object[] objArr2 = {mSCMetaInfo};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "af14e96a52f5104be00a2dd16bbc3cef", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "af14e96a52f5104be00a2dd16bbc3cef");
                } else {
                    a.a(a.this, mSCMetaInfo, cVar);
                }
            }

            @Override // com.meituan.android.mercury.msc.adaptor.callback.a
            public final void a(com.meituan.android.mercury.msc.adaptor.core.e eVar) {
                Object[] objArr2 = {eVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7cc533f1977310b5ceefe183d6b0086c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7cc533f1977310b5ceefe183d6b0086c");
                } else {
                    a.a(a.this, eVar, cVar);
                }
            }
        });
    }

    private void a(String str, final c<AppMetaInfoWrapper> cVar) {
        Object[] objArr = {str, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a53c87e20f2f1b57c14fc0f4a45f87a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a53c87e20f2f1b57c14fc0f4a45f87a");
            return;
        }
        g.d("bundle", "getMetaInfoFromCache getCacheMetaWithAppId:", str);
        com.meituan.android.mercury.msc.adaptor.core.b.a(str, new com.meituan.android.mercury.msc.adaptor.callback.a() { // from class: com.meituan.msc.modules.update.metainfo.a.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mercury.msc.adaptor.callback.a
            public final void a(@Nullable MSCMetaInfo mSCMetaInfo) {
                Object[] objArr2 = {mSCMetaInfo};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "80d9b2cb9231689d6742bc47454e7a46", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "80d9b2cb9231689d6742bc47454e7a46");
                } else {
                    a.a(a.this, mSCMetaInfo, cVar);
                }
            }

            @Override // com.meituan.android.mercury.msc.adaptor.callback.a
            public final void a(com.meituan.android.mercury.msc.adaptor.core.e eVar) {
                Object[] objArr2 = {eVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7cb5b009d1433613dc22cf911f7c1947", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7cb5b009d1433613dc22cf911f7c1947");
                } else {
                    a.a(a.this, eVar, cVar);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, String str2, final c<AppMetaInfoWrapper> cVar) {
        Object[] objArr = {str, str2, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32030dac955710e6e7801b8f7092ceff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32030dac955710e6e7801b8f7092ceff");
            return;
        }
        g.d("bundle", "fetchMetaInfoByNetwork checkUpdateWithAppId:", str, ",metaInfoTestUrl:", str2);
        com.meituan.android.mercury.msc.adaptor.core.b.a(str, str2, new com.meituan.android.mercury.msc.adaptor.callback.a() { // from class: com.meituan.msc.modules.update.metainfo.a.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mercury.msc.adaptor.callback.a
            public final void a(@Nullable MSCMetaInfo mSCMetaInfo) {
                Object[] objArr2 = {mSCMetaInfo};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e394b290bfdca4eb4ad48b566fb1459d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e394b290bfdca4eb4ad48b566fb1459d");
                } else {
                    a.a(a.this, mSCMetaInfo, cVar);
                }
            }

            @Override // com.meituan.android.mercury.msc.adaptor.callback.a
            public final void a(com.meituan.android.mercury.msc.adaptor.core.e eVar) {
                Object[] objArr2 = {eVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8ddc2dd4f960a37752dcf26e5d6dfcc9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8ddc2dd4f960a37752dcf26e5d6dfcc9");
                } else {
                    a.a(a.this, eVar, cVar);
                }
            }
        });
    }

    private long a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30642efbebc3555b107c6530c303d5b7", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30642efbebc3555b107c6530c303d5b7")).longValue() : new com.meituan.msc.common.config.c(MSCEnvHelper.getContext()).b(str);
    }
}
