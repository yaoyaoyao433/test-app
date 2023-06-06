package com.sankuai.waimai.mmp;

import android.app.Activity;
import android.os.Process;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.Loader;
import com.meituan.android.common.locate.LoadConfig;
import com.meituan.android.common.locate.LocationLoaderFactory;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.loader.LoadConfigImpl;
import com.meituan.mmp.lib.utils.ad;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c implements com.meituan.mmp.lib.api.location.b, com.meituan.mmp.lib.map.c {
    public static ChangeQuickRedirect a;
    private Loader<MtLocation> b;
    private volatile com.meituan.mmp.lib.map.b c;
    private a d;
    private String e;

    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0213  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.sankuai.waimai.mmp.c r17, int r18, com.meituan.android.common.locate.MtLocation r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.mmp.c.a(com.sankuai.waimai.mmp.c, int, com.meituan.android.common.locate.MtLocation, java.lang.String):void");
    }

    public c(Activity activity, @NonNull com.meituan.msi.provider.c cVar) {
        Object[] objArr = {activity, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97dd0fc7c4afc5cc40efa31e0afd7f0c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97dd0fc7c4afc5cc40efa31e0afd7f0c");
            return;
        }
        this.b = null;
        this.c = null;
        b(activity, cVar);
    }

    private void b(@NonNull Activity activity, @NonNull final com.meituan.msi.provider.c cVar) {
        Object[] objArr = {activity, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "591ac7c3596e8342e8b64809d4431c84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "591ac7c3596e8342e8b64809d4431c84");
            return;
        }
        LoadConfigImpl loadConfigImpl = new LoadConfigImpl();
        loadConfigImpl.set(LoadConfig.LOCATION_TIMEOUT, "15000");
        loadConfigImpl.set(LoadConfig.IS_GEARS_RESULT_NEED_BEARING_FORCE, "TRUE");
        loadConfigImpl.set(LoadConfig.IS_GEARS_RESULT_NEED_BEARING_WHEN_GPS_LOSING, "TRUE");
        loadConfigImpl.set(LoadConfig.DELIVER_INTERVAL, "1000");
        loadConfigImpl.set("business_id", cVar.b);
        this.b = a(activity, cVar, loadConfigImpl);
        if (this.b == null) {
            com.meituan.mmp.lib.trace.b.d("MTLocationLoader", "locationLoader is null, token:" + cVar.b);
            return;
        }
        this.b.registerListener(Process.myPid(), new Loader.OnLoadCompleteListener<MtLocation>() { // from class: com.sankuai.waimai.mmp.WMMMPLocationLoader$1
            public static ChangeQuickRedirect a;

            @Override // android.support.v4.content.Loader.OnLoadCompleteListener
            public /* synthetic */ void onLoadComplete(Loader<MtLocation> loader, MtLocation mtLocation) {
                MtLocation mtLocation2 = mtLocation;
                Object[] objArr2 = {loader, mtLocation2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "36e173a16ebaaabc9070fa5e7993fa29", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "36e173a16ebaaabc9070fa5e7993fa29");
                } else if (mtLocation2 == null) {
                    c.a(c.this, 5, null, "location info not found");
                } else if (mtLocation2.getStatusCode() == 0) {
                    if (com.sankuai.meituan.dev.customLocation.a.a()) {
                        c.a(c.this, 0, new MtLocation(com.meituan.android.privacy.locate.f.a().a(cVar.b)), null);
                    } else {
                        c.a(c.this, 0, mtLocation2, null);
                    }
                } else {
                    c.a(c.this, mtLocation2.getStatusCode(), null, ad.a(MMPEnvHelper.getEnvInfo().getApplicationContext(), cVar.b) ? "" : "auth denied");
                }
            }
        });
    }

    @Nullable
    private Loader<MtLocation> a(Activity activity, com.meituan.msi.provider.c cVar, LoadConfigImpl loadConfigImpl) {
        Object[] objArr = {activity, cVar, loadConfigImpl};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33510b19b3b5de2bc122f83c2558acc8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Loader) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33510b19b3b5de2bc122f83c2558acc8");
        }
        switch (cVar.a) {
            case normal:
                com.meituan.android.privacy.locate.g a2 = com.meituan.android.privacy.locate.g.a(activity, cVar.b, com.meituan.android.singleton.f.a());
                if (a2 != null) {
                    return a2.a(activity, LocationLoaderFactory.LoadStrategy.normal, loadConfigImpl);
                }
                com.meituan.mmp.lib.trace.b.d("MTLocationLoader", "normal MtLocationLoaderWrapper is null");
                return null;
            case instant_forground:
                com.meituan.android.privacy.locate.g a3 = com.meituan.android.privacy.locate.g.a(activity, cVar.b, com.meituan.android.singleton.f.a());
                if (a3 != null) {
                    return a3.a(activity, LocationLoaderFactory.LoadStrategy.instant, loadConfigImpl);
                }
                com.meituan.mmp.lib.trace.b.d("MTLocationLoader", "instant_forground MtLocationLoaderWrapper is null");
                return null;
            case instant_background:
                this.d = new a();
                return com.meituan.android.privacy.locate.g.a(this.d, cVar.b, com.meituan.android.singleton.f.a()).a(activity, LocationLoaderFactory.LoadStrategy.instant, loadConfigImpl);
            default:
                throw new IllegalStateException("Unexpected value: " + cVar.a);
        }
    }

    @Override // com.meituan.mmp.lib.map.c
    public final void a(com.meituan.mmp.lib.map.b bVar, String str) {
        Object[] objArr = {bVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53fdbce43ad8dd7432d1002cc5cd3698", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53fdbce43ad8dd7432d1002cc5cd3698");
            return;
        }
        this.e = str;
        this.c = bVar;
        if (this.b.isStarted()) {
            return;
        }
        this.b.startLoading();
    }

    @Override // com.meituan.mmp.lib.map.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3da08c88715b1a449c889dc509c8afa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3da08c88715b1a449c889dc509c8afa");
            return;
        }
        this.c = null;
        if (this.b != null) {
            this.b.stopLoading();
            this.b = null;
        }
    }

    @Override // com.meituan.mmp.lib.api.location.b
    @NonNull
    public final com.meituan.mmp.lib.map.c a(@NonNull Activity activity, @NonNull com.meituan.msi.provider.c cVar) {
        Object[] objArr = {activity, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae324b6d2d15401a2bbd10336387c952", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.mmp.lib.map.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae324b6d2d15401a2bbd10336387c952");
        }
        c cVar2 = new c(activity, cVar);
        cVar2.b(activity, cVar);
        return cVar2;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements com.meituan.android.privacy.locate.lifecycle.b {
        public com.meituan.android.privacy.locate.lifecycle.c a;

        @Override // com.meituan.android.privacy.locate.lifecycle.b
        public final void a(@NonNull com.meituan.android.privacy.locate.lifecycle.c cVar) {
            this.a = cVar;
        }
    }
}
