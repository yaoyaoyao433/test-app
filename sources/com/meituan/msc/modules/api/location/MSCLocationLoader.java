package com.meituan.msc.modules.api.location;

import android.app.Activity;
import android.content.Context;
import android.os.Process;
import android.support.annotation.NonNull;
import android.support.v4.content.Loader;
import com.meituan.android.common.locate.LoadConfig;
import com.meituan.android.common.locate.LocationLoaderFactory;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.loader.LoadConfigImpl;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.locate.g;
import com.meituan.android.singleton.f;
import com.meituan.msc.common.utils.ac;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.api.map.b;
import com.meituan.msi.provider.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MSCLocationLoader implements MSCLocationLoaderCreator, b {
    public static ChangeQuickRedirect a = null;
    public static String b = "gps";
    public static String c = "wifi";
    public static String d = "network";
    public static String e = "unknown";
    private Loader<MtLocation> f;
    private volatile com.meituan.msc.modules.api.map.a g;
    private a h;
    private String i;

    public MSCLocationLoader() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90284e6d083d948a07b389751d785097", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90284e6d083d948a07b389751d785097");
            return;
        }
        this.f = null;
        this.g = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0210  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r18, @android.support.annotation.Nullable com.meituan.android.common.locate.MtLocation r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.modules.api.location.MSCLocationLoader.a(int, com.meituan.android.common.locate.MtLocation, java.lang.String):void");
    }

    @Override // com.meituan.msc.modules.api.map.b
    public final void a(com.meituan.msc.modules.api.map.a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc5451a2c44a237f723b61f8404eed89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc5451a2c44a237f723b61f8404eed89");
            return;
        }
        this.i = str;
        this.g = aVar;
        if (this.f.isStarted()) {
            return;
        }
        this.f.startLoading();
    }

    @Override // com.meituan.msc.modules.api.map.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5bdae512a0e1d55627ba1e5beebeb0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5bdae512a0e1d55627ba1e5beebeb0e");
            return;
        }
        this.g = null;
        if (this.f != null) {
            this.f.stopLoading();
            this.f = null;
        }
        if (this.h == null || this.h.a == null) {
            return;
        }
        this.h.a.c();
    }

    @Override // com.meituan.msc.modules.api.location.MSCLocationLoaderCreator
    @NonNull
    public final b a(@NonNull Activity activity, @NonNull final c cVar) {
        Loader<MtLocation> a2;
        Object[] objArr = {activity, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23c74d11d1ee1a8a142e95ed8a20d10c", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23c74d11d1ee1a8a142e95ed8a20d10c");
        }
        MSCLocationLoader mSCLocationLoader = new MSCLocationLoader();
        Object[] objArr2 = {activity, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, mSCLocationLoader, changeQuickRedirect2, false, "e6584f50b1696ed99ecff6fbdc72a94b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mSCLocationLoader, changeQuickRedirect2, false, "e6584f50b1696ed99ecff6fbdc72a94b");
        } else {
            LoadConfigImpl loadConfigImpl = new LoadConfigImpl();
            loadConfigImpl.set(LoadConfig.LOCATION_TIMEOUT, "15000");
            loadConfigImpl.set(LoadConfig.IS_GEARS_RESULT_NEED_BEARING_FORCE, "TRUE");
            loadConfigImpl.set(LoadConfig.IS_GEARS_RESULT_NEED_BEARING_WHEN_GPS_LOSING, "TRUE");
            loadConfigImpl.set(LoadConfig.DELIVER_INTERVAL, "1000");
            loadConfigImpl.set("business_id", cVar.b);
            Object[] objArr3 = {activity, cVar, loadConfigImpl};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, mSCLocationLoader, changeQuickRedirect3, false, "b9039662ff49abe8ae4311de2d0217d7", RobustBitConfig.DEFAULT_VALUE)) {
                a2 = (Loader) PatchProxy.accessDispatch(objArr3, mSCLocationLoader, changeQuickRedirect3, false, "b9039662ff49abe8ae4311de2d0217d7");
            } else {
                switch (cVar.a) {
                    case normal:
                        g a3 = g.a(activity, cVar.b, f.a());
                        if (a3 != null) {
                            a2 = a3.a(activity, LocationLoaderFactory.LoadStrategy.normal, loadConfigImpl);
                            break;
                        } else {
                            com.meituan.msc.modules.reporter.g.a("MTLocationLoader", "normal MtLocationLoaderWrapper is null");
                            a2 = null;
                            break;
                        }
                    case instant_forground:
                        g a4 = g.a(activity, cVar.b, f.a());
                        if (a4 != null) {
                            a2 = a4.a(activity, LocationLoaderFactory.LoadStrategy.instant, loadConfigImpl);
                            break;
                        } else {
                            com.meituan.msc.modules.reporter.g.a("MTLocationLoader", "instant_forground MtLocationLoaderWrapper is null");
                            a2 = null;
                            break;
                        }
                    case instant_background:
                        mSCLocationLoader.h = new a();
                        a2 = g.a(mSCLocationLoader.h, cVar.b, f.a()).a(activity, LocationLoaderFactory.LoadStrategy.instant, loadConfigImpl);
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + cVar.a);
                }
            }
            mSCLocationLoader.f = a2;
            if (mSCLocationLoader.f == null) {
                com.meituan.msc.modules.reporter.g.a("MTLocationLoader", "locationLoader is null, token:" + cVar.b);
            } else {
                mSCLocationLoader.f.registerListener(Process.myPid(), new Loader.OnLoadCompleteListener<MtLocation>() { // from class: com.meituan.msc.modules.api.location.MSCLocationLoader.1
                    public static ChangeQuickRedirect a;

                    @Override // android.support.v4.content.Loader.OnLoadCompleteListener
                    public /* synthetic */ void onLoadComplete(Loader<MtLocation> loader, MtLocation mtLocation) {
                        boolean z;
                        MtLocation mtLocation2 = mtLocation;
                        Object[] objArr4 = {loader, mtLocation2};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e542551d711eb2600ac4d59cd006da22", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e542551d711eb2600ac4d59cd006da22");
                        } else if (mtLocation2 == null) {
                            MSCLocationLoader.this.a(5, null, "location info not found");
                        } else if (mtLocation2.getStatusCode() == 0) {
                            if (com.sankuai.meituan.dev.customLocation.a.a()) {
                                MSCLocationLoader.this.a(0, new MtLocation(com.meituan.android.privacy.locate.f.a().a(cVar.b)), null);
                            } else {
                                MSCLocationLoader.this.a(0, mtLocation2, null);
                            }
                        } else {
                            Context applicationContext = MSCEnvHelper.getEnvInfo().getApplicationContext();
                            String str = cVar.b;
                            Object[] objArr5 = {applicationContext, str};
                            ChangeQuickRedirect changeQuickRedirect5 = ac.a;
                            if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "e1ac7d4e58d42f2502966928312a3817", RobustBitConfig.DEFAULT_VALUE)) {
                                z = ((Boolean) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "e1ac7d4e58d42f2502966928312a3817")).booleanValue();
                            } else {
                                z = com.meituan.msi.privacy.permission.a.a(applicationContext, "Locate.once", str) || com.meituan.msi.privacy.permission.a.a(applicationContext, PermissionGuard.PERMISSION_LOCATION_CONTINUOUS, str);
                            }
                            MSCLocationLoader.this.a(mtLocation2.getStatusCode(), null, z ? "" : "auth denied");
                        }
                    }
                });
            }
        }
        return mSCLocationLoader;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a implements com.meituan.android.privacy.locate.lifecycle.b {
        public com.meituan.android.privacy.locate.lifecycle.c a;

        @Override // com.meituan.android.privacy.locate.lifecycle.b
        public final void a(@NonNull com.meituan.android.privacy.locate.lifecycle.c cVar) {
            this.a = cVar;
        }
    }
}
