package com.meituan.android.legwork.common.jarvis;

import com.meituan.android.legwork.utils.x;
import com.meituan.android.legwork.utils.z;
import com.meituan.banma.jarvis.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements com.meituan.banma.jarvis.a {
    public static ChangeQuickRedirect a;
    private final a b;

    private b(a aVar) {
        this.b = aVar;
    }

    public static com.meituan.banma.jarvis.a a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "442d0cc5049fe1a1b238e00382b4a9f4", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.banma.jarvis.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "442d0cc5049fe1a1b238e00382b4a9f4") : new b(aVar);
    }

    @Override // com.meituan.banma.jarvis.a
    public final void a(Map map) {
        boolean z;
        boolean z2;
        String str;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4d37cca1b5bfb07e667fa4e727a50f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4d37cca1b5bfb07e667fa4e727a50f5");
            return;
        }
        final a aVar = this.b;
        Object[] objArr2 = {aVar, map};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5554c24662845dff68de329036928eb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5554c24662845dff68de329036928eb0");
            return;
        }
        JarvisConfigChangeReceiver.a();
        if (map != null) {
            Object[] objArr3 = {map};
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "b9f868eacae112e85a140e8c0ea3b0aa", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "b9f868eacae112e85a140e8c0ea3b0aa");
            } else {
                try {
                    final long a2 = z.a("jarvis_polling_time_seconds", 180L);
                    Object obj = map.get("syncPollingTime");
                    if (!(obj instanceof Number) || a2 == ((Number) obj).longValue()) {
                        z = false;
                        z2 = false;
                    } else {
                        a2 = ((Number) obj).longValue();
                        z.b("jarvis_polling_time_seconds", a2);
                        z = true;
                        z2 = true;
                    }
                    final int b = z.b("jarvis_file_cache_time_hours", 3);
                    Object obj2 = map.get("fileCacheTime");
                    if ((obj2 instanceof Number) && b != ((Number) obj2).intValue()) {
                        b = ((Number) obj2).intValue();
                        z.a("jarvis_file_cache_time_hours", b);
                        z = true;
                    }
                    if (z) {
                        c.a().a(new com.meituan.banma.jarvis.env.b() { // from class: com.meituan.android.legwork.common.jarvis.a.3
                            @Override // com.meituan.banma.jarvis.env.b
                            public final long a() {
                                return a2;
                            }

                            @Override // com.meituan.banma.jarvis.env.b
                            public final int b() {
                                return b;
                            }
                        });
                    }
                    if (z2) {
                        aVar.c();
                    }
                    x.c("LegworkJarvisManager.resetConfigEnv", "pollingTime: " + a2 + " cacheTime: " + b);
                } catch (Exception e) {
                    x.e("LegworkJarvisManager", "resetConfigEnv exception " + e);
                    x.a(e);
                }
            }
            try {
                str = new JSONObject(map).toString();
            } catch (Exception e2) {
                x.e("LegworkJarvisManager", "transform map to string exception " + e2);
                str = "";
            }
            x.c("LegworkJarvisManager.init JarvisCallback", "configData is " + str);
        }
    }
}
