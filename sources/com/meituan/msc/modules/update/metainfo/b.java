package com.meituan.msc.modules.update.metainfo;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.msc.modules.engine.h;
import com.meituan.msc.modules.manager.s;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msc.modules.update.PackageLoadReporter;
import com.meituan.msc.modules.update.bean.AppMetaInfoWrapper;
import com.meituan.msc.modules.update.bean.CheckUpdateParams;
import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import com.meituan.msc.modules.update.f;
import com.meituan.msc.modules.update.k;
import com.meituan.msc.modules.update.pkg.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static b c;
    volatile long b;

    public static /* synthetic */ void a(b bVar, final h hVar) {
        boolean z;
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "eb8ce01537e561aa4d0862f21e478413", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "eb8ce01537e561aa4d0862f21e478413");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "646bb3232b9c3462f0060873209dc7c3", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "646bb3232b9c3462f0060873209dc7c3")).booleanValue();
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            g.b("BackgroundCheckUpdateManager", "isCheckUpdateOutOfTimeInterval:", Long.valueOf(currentTimeMillis));
            z = currentTimeMillis - bVar.b > com.meituan.msc.common.config.b.B();
        }
        if (!z) {
            g.d("BackgroundCheckUpdateManager", "checkUpdate not out of time interval");
            return;
        }
        g.d("BackgroundCheckUpdateManager", "background checkUpdate");
        final PackageLoadReporter a2 = PackageLoadReporter.a(hVar);
        CheckUpdateParams checkUpdateParams = new CheckUpdateParams(hVar.a(), 1);
        final s sVar = (s) hVar.c(s.class);
        a.a().a(checkUpdateParams, new c<AppMetaInfoWrapper>() { // from class: com.meituan.msc.modules.update.metainfo.b.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.modules.update.metainfo.c
            public final /* synthetic */ void a(@NonNull AppMetaInfoWrapper appMetaInfoWrapper) {
                boolean z2;
                AppMetaInfoWrapper appMetaInfoWrapper2 = appMetaInfoWrapper;
                Object[] objArr3 = {appMetaInfoWrapper2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "014c3401018d430b8b115fd30a51a330", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "014c3401018d430b8b115fd30a51a330");
                    return;
                }
                f fVar = hVar.r;
                if (fVar == null) {
                    g.d("BackgroundCheckUpdateManager", "msc app exit:", appMetaInfoWrapper2.getAppId());
                    return;
                }
                a2.a(1, "network", PackageLoadReporter.Source.PREFETCH);
                Object[] objArr4 = {appMetaInfoWrapper2};
                ChangeQuickRedirect changeQuickRedirect4 = f.a;
                if (PatchProxy.isSupport(objArr4, fVar, changeQuickRedirect4, false, "29eb0a13f3f3658a08f679ba671d0d97", RobustBitConfig.DEFAULT_VALUE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(objArr4, fVar, changeQuickRedirect4, false, "29eb0a13f3f3658a08f679ba671d0d97")).booleanValue();
                } else {
                    AppMetaInfoWrapper appMetaInfoWrapper3 = fVar.h;
                    Object[] objArr5 = {appMetaInfoWrapper3, appMetaInfoWrapper2};
                    ChangeQuickRedirect changeQuickRedirect5 = com.meituan.msc.modules.update.h.a;
                    if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "738afe25b8d8e4a1ee499e694ef7ede9", RobustBitConfig.DEFAULT_VALUE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "738afe25b8d8e4a1ee499e694ef7ede9")).booleanValue();
                    } else {
                        z2 = appMetaInfoWrapper3 != null && appMetaInfoWrapper2 != null && TextUtils.equals(appMetaInfoWrapper3.getBuildId(), appMetaInfoWrapper2.getBuildId()) && TextUtils.equals(appMetaInfoWrapper3.getPublishId(), appMetaInfoWrapper2.getPublishId()) && TextUtils.equals(appMetaInfoWrapper3.getMainPkgMd5(), appMetaInfoWrapper2.getMainPkgMd5());
                    }
                }
                if (z2) {
                    g.d("BackgroundCheckUpdateManager", "background checkUpdate is same version");
                    sVar.a(s.a.STATUS_APP_NOT_HAS_UPDATE);
                    return;
                }
                sVar.a(s.a.STATUS_APP_HAS_UPDATE);
                ArrayList<PackageInfoWrapper> arrayList = new ArrayList();
                arrayList.add(appMetaInfoWrapper2.createMainPackageWrapper());
                for (final PackageInfoWrapper packageInfoWrapper : arrayList) {
                    g.d("BackgroundCheckUpdateManager", "background loadPackageWithInfo:", packageInfoWrapper);
                    d.a().a(hVar.o, packageInfoWrapper, new com.meituan.msc.modules.update.pkg.b<PackageInfoWrapper>() { // from class: com.meituan.msc.modules.update.metainfo.b.2.1
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.msc.modules.update.pkg.b
                        public final /* synthetic */ void a(@NonNull PackageInfoWrapper packageInfoWrapper2) {
                            PackageInfoWrapper packageInfoWrapper3 = packageInfoWrapper2;
                            Object[] objArr6 = {packageInfoWrapper3};
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "d7b7779341ea5685968046c629e57951", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "d7b7779341ea5685968046c629e57951");
                                return;
                            }
                            PackageLoadReporter packageLoadReporter = a2;
                            k.a aVar = new k.a();
                            aVar.e = packageInfoWrapper3.isFromNet() ? "network" : PackageLoadReporter.LoadType.LOCAL;
                            aVar.f = packageInfoWrapper.getPackageName();
                            aVar.g = packageInfoWrapper.getPkgTypeString();
                            aVar.d = "backgrounddownload";
                            packageLoadReporter.a(aVar.a());
                            packageInfoWrapper3.isSourceReady = true;
                            sVar.a(s.a.STATUS_APP_DOWNLOAD_SUCCESS);
                        }

                        @Override // com.meituan.msc.modules.update.pkg.b
                        public final void a(String str, Exception exc) {
                            Object[] objArr6 = {str, exc};
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "fcd542ad9a609c62a682c8bf7240b4d9", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "fcd542ad9a609c62a682c8bf7240b4d9");
                                return;
                            }
                            g.a("BackgroundCheckUpdateManager", exc, "background checkUpdate", str);
                            PackageLoadReporter packageLoadReporter = a2;
                            k.a aVar = new k.a();
                            aVar.f = packageInfoWrapper.getPackageName();
                            aVar.g = packageInfoWrapper.getPkgTypeString();
                            aVar.d = "backgrounddownload";
                            packageLoadReporter.a(aVar.a(), exc);
                            sVar.a(s.a.STATUS_APP_DOWNLOAD_FAIL);
                        }
                    });
                }
            }

            @Override // com.meituan.msc.modules.update.metainfo.c
            public final void a(String str, Exception exc) {
                Object[] objArr3 = {str, exc};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "44cdb0f6e3e842d6591517531a45ad00", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "44cdb0f6e3e842d6591517531a45ad00");
                    return;
                }
                g.a("BackgroundCheckUpdateManager", exc, "background checkUpdate", str);
                sVar.a(s.a.STATUS_APP_NOT_HAS_UPDATE);
                a2.a(0, (String) null, PackageLoadReporter.Source.PREFETCH, exc);
            }
        });
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf0d3f12655c7c5e6ac1f4f079d2c2dc", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf0d3f12655c7c5e6ac1f4f079d2c2dc");
        }
        if (c == null) {
            synchronized (b.class) {
                if (c == null) {
                    c = new b();
                }
            }
        }
        return c;
    }
}
