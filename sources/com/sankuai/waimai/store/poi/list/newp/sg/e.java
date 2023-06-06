package com.sankuai.waimai.store.poi.list.newp.sg;

import android.support.annotation.NonNull;
import com.google.gson.reflect.TypeToken;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.manager.load.a;
import com.sankuai.waimai.store.config.SCConfigPath;
import com.sankuai.waimai.store.config.j;
import com.sankuai.waimai.store.poi.list.newp.PoiVerticalityChannelActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class e {
    public static ChangeQuickRedirect a;
    private static e d;
    public Map<String, com.sankuai.waimai.store.mach.d> b;
    public Map<String, com.sankuai.waimai.mach.manager.cache.e> c;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92e0948af4eabc62a1617027d3443d97", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92e0948af4eabc62a1617027d3443d97");
            return;
        }
        this.b = new HashMap();
        this.c = new HashMap();
    }

    public static e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2e5911436646e66a71a634d83303cbab", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2e5911436646e66a71a634d83303cbab");
        }
        if (d == null) {
            synchronized (e.class) {
                if (d == null) {
                    d = new e();
                }
            }
        }
        return d;
    }

    public final void a(@NonNull PoiVerticalityChannelActivity poiVerticalityChannelActivity, String str) {
        ArrayList arrayList;
        char c = 2;
        char c2 = 1;
        Object[] objArr = {poiVerticalityChannelActivity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d1f32e8f96b83dfcc8f6e93f5544da3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d1f32e8f96b83dfcc8f6e93f5544da3");
            return;
        }
        boolean a2 = com.sankuai.waimai.store.manager.abtest.a.a(com.sankuai.waimai.store.pagingload.c.b).a();
        if (!j.h().a(SCConfigPath.PREFETCH_TILE_MACH_TEMPLATE, false) || a2 || (arrayList = (ArrayList) j.h().a(SCConfigPath.PRELOAD_LOADER_TILE_MACH_LIST, new TypeToken<List<Map<String, String>>>() { // from class: com.sankuai.waimai.store.poi.list.newp.sg.e.1
        }.getType(), new ArrayList())) == null || arrayList.size() == 0) {
            return;
        }
        if (this.b == null || this.b.size() <= 0) {
            int i = 0;
            while (i < arrayList.size()) {
                Map map = (Map) arrayList.get(i);
                if (map != null) {
                    final com.sankuai.waimai.store.poi.list.logreport.c cVar = new com.sankuai.waimai.store.poi.list.logreport.c(str);
                    final String str2 = (String) map.get("templateID");
                    String str3 = (String) map.get("moduleId");
                    com.sankuai.waimai.store.mach.d dVar = new com.sankuai.waimai.store.mach.d(poiVerticalityChannelActivity, poiVerticalityChannelActivity.w()) { // from class: com.sankuai.waimai.store.poi.list.newp.sg.e.2
                        @Override // com.sankuai.waimai.store.mach.d
                        public final com.sankuai.waimai.mach.d aZ_() {
                            return cVar;
                        }
                    };
                    this.b.put(str2, dVar);
                    Object[] objArr2 = new Object[3];
                    objArr2[0] = dVar;
                    objArr2[c2] = str3;
                    objArr2[c] = str2;
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c607b8004394d61b33f5b69a49934595", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c607b8004394d61b33f5b69a49934595");
                    } else {
                        dVar.a(String.format("sm_home_%s", str3));
                        a.C1015a c1015a = new a.C1015a();
                        c1015a.c = str2;
                        c1015a.b = str2;
                        c1015a.d = String.format("sm_home_%s", str3);
                        c1015a.e = "supermarket";
                        dVar.a(c1015a.a(MetricsAnrManager.ANR_THRESHOLD).a(), new com.sankuai.waimai.mach.container.c() { // from class: com.sankuai.waimai.store.poi.list.newp.sg.e.3
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.mach.container.c
                            public final void a(@NonNull com.sankuai.waimai.mach.manager.cache.e eVar) {
                                Object[] objArr3 = {eVar};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e7158e1dafaa227359942dca8d7df004", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e7158e1dafaa227359942dca8d7df004");
                                } else {
                                    e.this.c.put(str2, eVar);
                                }
                            }

                            @Override // com.sankuai.waimai.mach.container.c
                            public final void a(@NonNull com.sankuai.waimai.mach.manager.load.b bVar) {
                                Object[] objArr3 = {bVar};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fd6f0b0eb372d91913480c4d2666f992", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fd6f0b0eb372d91913480c4d2666f992");
                                } else {
                                    e.this.c.put(str2, null);
                                }
                            }
                        });
                        i++;
                        c = 2;
                        c2 = 1;
                    }
                }
                i++;
                c = 2;
                c2 = 1;
            }
        }
    }
}
