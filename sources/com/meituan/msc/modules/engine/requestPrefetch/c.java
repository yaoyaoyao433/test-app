package com.meituan.msc.modules.engine.requestPrefetch;

import android.app.Activity;
import android.text.TextUtils;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.engine.requestPrefetch.PrefetchConfig;
import com.meituan.msc.modules.engine.requestPrefetch.f;
import com.meituan.msc.util.perf.PerfTrace;
import com.meituan.msi.provider.c;
import com.meituan.msi.util.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static boolean a(PrefetchConfig.LocationConfig locationConfig) {
        return locationConfig != null && locationConfig.enable;
    }

    public final void a(Activity activity, f.a aVar, d dVar, final g gVar) {
        Object[] objArr = {activity, aVar, dVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f30bbf2b08f1caaf0cc3b8fc12d6ea07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f30bbf2b08f1caaf0cc3b8fc12d6ea07");
            return;
        }
        PerfTrace.begin("request_prefetch_locate");
        com.meituan.msc.modules.reporter.g.b("getLocation starting");
        gVar.d = dVar;
        gVar.e = aVar;
        if (activity == null) {
            com.meituan.msc.modules.reporter.g.d("RequestPrefetchManager", "location failed, ", "activity is null");
            gVar.run();
            return;
        }
        PrefetchConfig.LocationConfig locationConfig = dVar.b.locationConfig;
        final String str = locationConfig.sceneToken;
        if (!k.a(MSCEnvHelper.getContext(), str)) {
            com.meituan.msc.modules.reporter.g.d("RequestPrefetchManager", "location failed, ", "auth denied before request location");
            gVar.run();
            return;
        }
        String str2 = locationConfig.type;
        if (TextUtils.isEmpty(str2)) {
            str2 = "wgs84";
        }
        com.meituan.msi.provider.c cVar = new com.meituan.msi.provider.c();
        cVar.b = str;
        cVar.a = c.a.normal;
        final com.meituan.msc.modules.api.map.b a2 = MSCEnvHelper.getILocationLoaderProvider().a(activity, cVar);
        if (a2 == null) {
            com.meituan.msc.modules.reporter.g.d("RequestPrefetchManager", "location failed, ", "location failed, mini program is not in the foreground");
            gVar.run();
            return;
        }
        a2.a(new com.meituan.msc.modules.api.map.a() { // from class: com.meituan.msc.modules.engine.requestPrefetch.c.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.modules.api.map.a
            public final void a(int i, com.meituan.msi.api.location.a aVar2, String str3) {
                Object[] objArr2 = {Integer.valueOf(i), aVar2, str3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "30a45a3de559f0bf1bdff36e495c4604", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "30a45a3de559f0bf1bdff36e495c4604");
                    return;
                }
                a2.a();
                if (i == 0) {
                    if (aVar2 == null) {
                        gVar.run();
                        return;
                    }
                    b bVar = new b();
                    bVar.b = aVar2.h;
                    bVar.a = aVar2.g;
                    gVar.b = bVar;
                    gVar.run();
                    return;
                }
                if (!k.a(MSCEnvHelper.getContext(), str)) {
                    str3 = "auth denied after request location";
                }
                com.meituan.msc.modules.reporter.g.d("RequestPrefetchManager", "location failed, " + i + ", " + str3);
                gVar.run();
            }
        }, str2);
    }
}
