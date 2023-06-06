package com.meituan.msc.modules.update;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.msc.modules.container.v;
import com.meituan.msc.modules.engine.MSCHornRollbackConfig;
import com.meituan.msc.modules.engine.q;
import com.meituan.msc.modules.manager.ModuleName;
import com.meituan.msc.modules.update.PackageLoadReporter;
import com.meituan.msc.modules.update.bean.AppMetaInfoWrapper;
import com.meituan.msc.modules.update.bean.CheckUpdateParams;
import com.meituan.msc.modules.update.bean.LaunchPageParams;
import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import com.meituan.msc.modules.update.k;
import com.meituan.msc.util.perf.PerfEventRecorder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
@ModuleName(name = "PackageLoader")
/* loaded from: classes3.dex */
public final class l extends com.meituan.msc.modules.manager.k implements c {
    public static ChangeQuickRedirect a;
    private volatile PackageLoadReporter b;

    public static /* synthetic */ PackageLoadReporter a(l lVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, lVar, changeQuickRedirect, false, "7bad043a0015df55588c9248736fbce5", RobustBitConfig.DEFAULT_VALUE)) {
            return (PackageLoadReporter) PatchProxy.accessDispatch(objArr, lVar, changeQuickRedirect, false, "7bad043a0015df55588c9248736fbce5");
        }
        if (lVar.b == null) {
            lVar.b = PackageLoadReporter.a(lVar.U_());
        }
        return lVar.b;
    }

    public static /* synthetic */ void a(l lVar, AppMetaInfoWrapper appMetaInfoWrapper, LaunchPageParams launchPageParams) {
        Object[] objArr = {appMetaInfoWrapper, launchPageParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, lVar, changeQuickRedirect, false, "8b412b21f3df1dba46fba62ce63ded9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, lVar, changeQuickRedirect, false, "8b412b21f3df1dba46fba62ce63ded9d");
        } else if (MSCHornRollbackConfig.d().c().isRollbackPageNotFoundStrategy1 || appMetaInfoWrapper.isFromCache()) {
        } else {
            v.d(launchPageParams.appId);
        }
    }

    public static /* synthetic */ void a(l lVar, LaunchPageParams launchPageParams, final com.meituan.msc.common.support.java.util.concurrent.a aVar) {
        Object[] objArr = {launchPageParams, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, lVar, changeQuickRedirect, false, "4adef211d98070da86fe3fc989a91424", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, lVar, changeQuickRedirect, false, "4adef211d98070da86fe3fc989a91424");
        } else {
            com.meituan.msc.modules.update.metainfo.a.a().a(new CheckUpdateParams(launchPageParams.appId, 2), new com.meituan.msc.modules.update.metainfo.c<AppMetaInfoWrapper>() { // from class: com.meituan.msc.modules.update.l.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.modules.update.metainfo.c
                public final /* synthetic */ void a(@NonNull AppMetaInfoWrapper appMetaInfoWrapper) {
                    f fVar;
                    AppMetaInfoWrapper appMetaInfoWrapper2 = appMetaInfoWrapper;
                    Object[] objArr2 = {appMetaInfoWrapper2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "67cb857ed41cca8999cd1c4df6e56980", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "67cb857ed41cca8999cd1c4df6e56980");
                        return;
                    }
                    l.a(l.this).a(1, PackageLoadReporter.LoadType.LOCAL, PackageLoadReporter.Source.LAUNCH);
                    com.meituan.msc.modules.engine.h U_ = l.this.U_();
                    if (U_ == null || (fVar = U_.r) == null) {
                        return;
                    }
                    fVar.b(appMetaInfoWrapper2);
                    aVar.d((com.meituan.msc.common.support.java.util.concurrent.a) appMetaInfoWrapper2);
                }

                @Override // com.meituan.msc.modules.update.metainfo.c
                public final void a(String str, Exception exc) {
                    Object[] objArr2 = {str, exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8f8518fa0ae9823c5a0fb66053e4b76b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8f8518fa0ae9823c5a0fb66053e4b76b");
                        return;
                    }
                    l.a(l.this).a(0, PackageLoadReporter.LoadType.LOCAL, PackageLoadReporter.Source.LAUNCH, exc);
                    aVar.b((Throwable) exc);
                }
            });
        }
    }

    public static /* synthetic */ void a(l lVar, PackageInfoWrapper packageInfoWrapper, List list, i iVar) {
        boolean z;
        Object[] objArr = {packageInfoWrapper, list, iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, lVar, changeQuickRedirect, false, "3626ea99fb170514c19964d7eb1bc150", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, lVar, changeQuickRedirect, false, "3626ea99fb170514c19964d7eb1bc150");
            return;
        }
        packageInfoWrapper.isSourceReady = true;
        com.meituan.msc.modules.reporter.g.d("PageLoadModule", "onPackageLoaded:", packageInfoWrapper);
        iVar.a(packageInfoWrapper);
        Object[] objArr2 = {list};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.update.pkg.c.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5f04a0ae2d15c2fb5bc02e1d45d941b5", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5f04a0ae2d15c2fb5bc02e1d45d941b5")).booleanValue();
        } else {
            if (!com.meituan.msc.common.utils.f.a(list)) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((PackageInfoWrapper) it.next()).isSourceReady) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
        }
        if (z) {
            com.meituan.msc.modules.reporter.g.d("PageLoadModule", "onAllPackageLoaded");
            iVar.a(list);
        }
    }

    @Override // com.meituan.msc.modules.update.c
    public final com.meituan.msc.common.support.java.util.concurrent.a<AppMetaInfoWrapper> a(final LaunchPageParams launchPageParams) {
        Object[] objArr = {launchPageParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d38cab5bf9deed93fceb00b548530be", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.common.support.java.util.concurrent.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d38cab5bf9deed93fceb00b548530be");
        }
        final com.meituan.msc.common.support.java.util.concurrent.a<AppMetaInfoWrapper> aVar = new com.meituan.msc.common.support.java.util.concurrent.a<>();
        CheckUpdateParams checkUpdateParams = new CheckUpdateParams(launchPageParams.appId, launchPageParams.needForceUpdate ? 1 : 4);
        if (!TextUtils.isEmpty(launchPageParams.checkUpdateUrl)) {
            checkUpdateParams.checkUpdateUrl = launchPageParams.checkUpdateUrl;
        }
        com.meituan.msc.modules.update.metainfo.a.a().a(checkUpdateParams, new com.meituan.msc.modules.update.metainfo.c<AppMetaInfoWrapper>() { // from class: com.meituan.msc.modules.update.l.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.modules.update.metainfo.c
            public final /* synthetic */ void a(@NonNull AppMetaInfoWrapper appMetaInfoWrapper) {
                AppMetaInfoWrapper appMetaInfoWrapper2 = appMetaInfoWrapper;
                Object[] objArr2 = {appMetaInfoWrapper2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "03f22fdd71058ad29bcd94ea1ec39815", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "03f22fdd71058ad29bcd94ea1ec39815");
                    return;
                }
                l.a(l.this).a(1, appMetaInfoWrapper2.isFromCache() ? PackageLoadReporter.LoadType.LOCAL : "network", PackageLoadReporter.Source.LAUNCH);
                com.meituan.msc.modules.engine.h U_ = l.this.U_();
                if (U_ != null) {
                    if (U_.d == null || !TextUtils.equals(appMetaInfoWrapper2.getAppId(), launchPageParams.appId)) {
                        aVar.b((Throwable) new com.meituan.msc.modules.apploader.events.a(1003, "小程序appId错误"));
                        return;
                    }
                    U_.r.b(appMetaInfoWrapper2);
                    l.a(l.this, appMetaInfoWrapper2, launchPageParams);
                    aVar.d((com.meituan.msc.common.support.java.util.concurrent.a) appMetaInfoWrapper2);
                }
            }

            @Override // com.meituan.msc.modules.update.metainfo.c
            public final void a(String str, Exception exc) {
                Object[] objArr2 = {str, exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1dda171a8a1e6b877924f458320fbf29", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1dda171a8a1e6b877924f458320fbf29");
                    return;
                }
                l.a(l.this).a(0, (String) null, PackageLoadReporter.Source.LAUNCH, exc);
                if (!launchPageParams.needForceUpdate) {
                    l.a(l.this, launchPageParams, aVar);
                } else {
                    aVar.b((Throwable) new com.meituan.msc.modules.apploader.events.a(2005, str));
                }
            }
        });
        return aVar;
    }

    @Override // com.meituan.msc.modules.update.c
    public final void a(String str, i iVar) {
        ArrayList<PackageInfoWrapper> arrayList;
        Object[] objArr = {str, iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58b132e803ce8551dbec098616ea6fc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58b132e803ce8551dbec098616ea6fc9");
            return;
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bd9aaa8c0f0e3bf354e94948d7e5a450", RobustBitConfig.DEFAULT_VALUE)) {
            arrayList = (ArrayList) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bd9aaa8c0f0e3bf354e94948d7e5a450");
        } else {
            arrayList = new ArrayList<>();
            f fVar = U_().r;
            if (MSCHornRollbackConfig.d().c().isRollbackKeepAliveMd5CheckOptimizeChange || !fVar.v(str)) {
                PackageInfoWrapper u = fVar.u(str);
                if (u != null) {
                    arrayList.add(fVar.z());
                    arrayList.add(u);
                } else {
                    arrayList.add(fVar.z());
                }
            }
        }
        a(arrayList, iVar);
    }

    private void a(final ArrayList<PackageInfoWrapper> arrayList, final i iVar) {
        int i = 2;
        char c = 1;
        Object[] objArr = {arrayList, iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "862a73952a777b394eea5a60f66623cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "862a73952a777b394eea5a60f66623cb");
            return;
        }
        PerfEventRecorder perfEventRecorder = U_().o;
        if (com.meituan.msc.common.utils.f.a((List) arrayList)) {
            iVar.a(arrayList);
            return;
        }
        Iterator<PackageInfoWrapper> it = arrayList.iterator();
        while (it.hasNext()) {
            final PackageInfoWrapper next = it.next();
            Object[] objArr2 = new Object[i];
            objArr2[0] = "loadAndInjectPackages:";
            objArr2[c] = next;
            com.meituan.msc.modules.reporter.g.d("PageLoadModule", objArr2);
            Object[] objArr3 = new Object[4];
            objArr3[0] = perfEventRecorder;
            objArr3[c] = arrayList;
            objArr3[i] = iVar;
            objArr3[3] = next;
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "7179ee4785ce5f80d2df2c37efa9c6f2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "7179ee4785ce5f80d2df2c37efa9c6f2");
            } else {
                com.meituan.msc.modules.update.pkg.d.a().a(perfEventRecorder, next, new com.meituan.msc.modules.update.pkg.b<PackageInfoWrapper>() { // from class: com.meituan.msc.modules.update.l.5
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.msc.modules.update.pkg.b
                    public final /* synthetic */ void a(@NonNull PackageInfoWrapper packageInfoWrapper) {
                        f fVar;
                        PackageInfoWrapper packageInfoWrapper2 = packageInfoWrapper;
                        Object[] objArr4 = {packageInfoWrapper2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect3, false, "96b5e959268d5c2d2b03ef69d8af3202", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect3, false, "96b5e959268d5c2d2b03ef69d8af3202");
                            return;
                        }
                        PackageLoadReporter a2 = l.a(l.this);
                        k.a aVar = new k.a();
                        aVar.e = packageInfoWrapper2.isFromNet() ? "network" : PackageLoadReporter.LoadType.LOCAL;
                        aVar.f = next.getPackageName();
                        aVar.g = next.getPkgTypeString();
                        aVar.d = q.c(l.this.U_());
                        a2.a(aVar.a());
                        com.meituan.msc.modules.engine.h U_ = l.this.U_();
                        if (U_ == null || (fVar = U_.r) == null) {
                            return;
                        }
                        Object[] objArr5 = {packageInfoWrapper2};
                        ChangeQuickRedirect changeQuickRedirect4 = f.a;
                        if (PatchProxy.isSupport(objArr5, fVar, changeQuickRedirect4, false, "c80dbae1763187e76df5738d906c6657", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, fVar, changeQuickRedirect4, false, "c80dbae1763187e76df5738d906c6657");
                        } else {
                            AppMetaInfoWrapper appMetaInfoWrapper = fVar.h;
                            fVar.a(appMetaInfoWrapper);
                            appMetaInfoWrapper.cachePackageWrapper(packageInfoWrapper2);
                        }
                        l.a(l.this, next, arrayList, iVar);
                        U_.G.a(packageInfoWrapper2);
                    }

                    @Override // com.meituan.msc.modules.update.pkg.b
                    public final void a(String str, Exception exc) {
                        Object[] objArr4 = {str, exc};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect3, false, "f54d3490231cf66ed17166c6c0ced396", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect3, false, "f54d3490231cf66ed17166c6c0ced396");
                            return;
                        }
                        PackageLoadReporter a2 = l.a(l.this);
                        k.a aVar = new k.a();
                        aVar.f = next.getPackageName();
                        aVar.g = next.getPkgTypeString();
                        aVar.d = q.c(l.this.U_());
                        a2.a(aVar.a(), exc);
                        iVar.a(str, exc);
                    }
                });
            }
            i = 2;
            c = 1;
        }
    }

    @Override // com.meituan.msc.modules.update.c
    public final void a(final List<PackageInfoWrapper> list, final j jVar) {
        Object[] objArr = {list, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0591036bb5dee914adb4ad170e7816e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0591036bb5dee914adb4ad170e7816e1");
            return;
        }
        j jVar2 = new j() { // from class: com.meituan.msc.modules.update.l.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.modules.update.j
            public final void a(PackageInfoWrapper packageInfoWrapper, boolean z) {
                Object[] objArr2 = {packageInfoWrapper, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7b6c3ea7fcd51137f89e56dd55092aeb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7b6c3ea7fcd51137f89e56dd55092aeb");
                    return;
                }
                for (PackageInfoWrapper packageInfoWrapper2 : list) {
                    if (!packageInfoWrapper2.isMainPackage()) {
                        l.this.a(packageInfoWrapper2, list, jVar);
                    }
                }
            }

            @Override // com.meituan.msc.modules.update.j
            public final void a(PackageInfoWrapper packageInfoWrapper, String str, Exception exc) {
                Object[] objArr2 = {packageInfoWrapper, str, exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fe5f2146d1e6f7d0e9c2b4c8b2bb980d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fe5f2146d1e6f7d0e9c2b4c8b2bb980d");
                } else {
                    jVar.a(packageInfoWrapper, str, exc);
                }
            }

            @Override // com.meituan.msc.modules.update.j
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e5557e2f5aafb6a72ad2857ccfa38ddd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e5557e2f5aafb6a72ad2857ccfa38ddd");
                } else {
                    jVar.a();
                }
            }
        };
        Object[] objArr2 = {list, jVar2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "676728863bd9a055f8459e2c91876fdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "676728863bd9a055f8459e2c91876fdf");
            return;
        }
        if (com.meituan.msc.common.utils.f.a((List) list)) {
            jVar2.a();
        }
        for (PackageInfoWrapper packageInfoWrapper : list) {
            if (packageInfoWrapper.isMainPackage()) {
                a(packageInfoWrapper, list, jVar2);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NonNull final PackageInfoWrapper packageInfoWrapper, final List<PackageInfoWrapper> list, @NonNull final j jVar) {
        Object[] objArr = {packageInfoWrapper, list, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae786acf9d0b2f34d65fff4024cd0355", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae786acf9d0b2f34d65fff4024cd0355");
        } else {
            ((com.meituan.msc.modules.engine.a) U_().c(com.meituan.msc.modules.engine.a.class)).a(packageInfoWrapper, new com.meituan.msc.modules.engine.g() { // from class: com.meituan.msc.modules.update.l.4
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.modules.engine.g
                public final void a(@NonNull PackageInfoWrapper packageInfoWrapper2, boolean z) {
                    Object[] objArr2 = {packageInfoWrapper2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "08b191fe2553c9be5358eb881a3ab1c3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "08b191fe2553c9be5358eb881a3ab1c3");
                        return;
                    }
                    com.meituan.msc.modules.reporter.g.b("PageLoadModule", "onPackageInjectSuccess:", packageInfoWrapper2);
                    packageInfoWrapper.isPackageInjected = true;
                    PackageLoadReporter a2 = l.a(l.this);
                    String pkgTypeString = packageInfoWrapper.getPkgTypeString();
                    Object[] objArr3 = {1, pkgTypeString};
                    ChangeQuickRedirect changeQuickRedirect3 = PackageLoadReporter.d;
                    if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "d130ab0dbe10406e41c016dcf00aca9b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "d130ab0dbe10406e41c016dcf00aca9b");
                    } else {
                        a2.a(1, pkgTypeString, -1, "");
                    }
                    jVar.a(packageInfoWrapper2, z);
                    if (com.meituan.msc.modules.update.pkg.c.a(list)) {
                        jVar.a();
                    }
                }

                @Override // com.meituan.msc.modules.engine.g
                public final void a(@NonNull PackageInfoWrapper packageInfoWrapper2, Exception exc) {
                    int a2;
                    String message;
                    Object[] objArr2 = {packageInfoWrapper2, exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "26f2c708b072f7fb63201b700b8bde67", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "26f2c708b072f7fb63201b700b8bde67");
                        return;
                    }
                    String str = "onPackageLoadFailed:" + packageInfoWrapper2.toString();
                    com.meituan.msc.modules.reporter.g.b("PageLoadModule", exc, str);
                    PackageLoadReporter a3 = l.a(l.this);
                    String pkgTypeString = packageInfoWrapper.getPkgTypeString();
                    Object[] objArr3 = {exc};
                    ChangeQuickRedirect changeQuickRedirect3 = g.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "f50f00a223f4f8abc586b20c111a3018", RobustBitConfig.DEFAULT_VALUE)) {
                        a2 = ((Integer) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "f50f00a223f4f8abc586b20c111a3018")).intValue();
                    } else {
                        a2 = exc instanceof com.meituan.android.mercury.msc.adaptor.core.e ? ((com.meituan.android.mercury.msc.adaptor.core.e) exc).a() : -1;
                    }
                    Object[] objArr4 = {exc};
                    ChangeQuickRedirect changeQuickRedirect4 = g.a;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "984ef69a3598e599a9b5acb4f7d90904", RobustBitConfig.DEFAULT_VALUE)) {
                        message = (String) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "984ef69a3598e599a9b5acb4f7d90904");
                    } else {
                        message = exc == null ? "" : exc.getMessage();
                    }
                    a3.a(0, pkgTypeString, a2, message);
                    jVar.a(packageInfoWrapper2, str, exc);
                }
            });
        }
    }
}
