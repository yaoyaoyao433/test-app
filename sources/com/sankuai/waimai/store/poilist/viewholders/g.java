package com.sankuai.waimai.store.poilist.viewholders;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.FrameLayout;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.store.config.SCConfigPath;
import com.sankuai.waimai.store.config.j;
import com.sankuai.waimai.store.newwidgets.list.o;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.util.monitor.monitor.SGModuleRenderLossRate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g extends a {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.store.poilist.mach.d b;
    public com.sankuai.waimai.mach.recycler.c c;
    public com.sankuai.waimai.store.param.a d;
    public com.sankuai.waimai.store.mach.page.event.b e;

    public g(@NonNull View view) {
        super(view);
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "401e474bf1e195007d47da2ef1ac97c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "401e474bf1e195007d47da2ef1ac97c3");
        }
    }

    public final void a(@NonNull com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc> fVar, int i) {
        Object[] objArr = {fVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7232823fe92cc42160ce25939978b851", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7232823fe92cc42160ce25939978b851");
            return;
        }
        final com.sankuai.waimai.mach.recycler.c cVar = fVar.b;
        if (this.b == null || cVar == null) {
            return;
        }
        com.sankuai.waimai.mach.recycler.b b = this.b.b();
        b.a(cVar);
        com.sankuai.waimai.mach.recycler.c a2 = b.a(cVar.a());
        cVar.l().addRenderListener(new com.sankuai.waimai.mach.g() { // from class: com.sankuai.waimai.store.poilist.viewholders.g.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.g
            public final void a(int i2) {
            }

            @Override // com.sankuai.waimai.mach.g
            public final void a(com.sankuai.waimai.mach.node.a aVar) {
            }

            @Override // com.sankuai.waimai.mach.g
            public final void a(String str, String str2) {
            }

            @Override // com.sankuai.waimai.mach.g
            public final void a(Throwable th) {
            }

            @Override // com.sankuai.waimai.mach.g
            public final void b() {
            }

            @Override // com.sankuai.waimai.mach.g
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ffad6138990a74ecd0c61bf7fbe3002d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ffad6138990a74ecd0c61bf7fbe3002d");
                    return;
                }
                if (g.this.d != null && g.this.g() != null && ((g.this.g() instanceof com.sankuai.waimai.store.poi.list.newp.adapter.c) || (g.this.g() instanceof com.sankuai.waimai.store.poi.list.newp.adapter.b))) {
                    g.this.d.by++;
                    if (g.this.d.b == 0) {
                        g.this.d.bx++;
                    }
                }
                g.this.a(cVar.a() == null ? "" : cVar.a(), true);
            }

            @Override // com.sankuai.waimai.mach.g
            public final void a(int i2, Throwable th) {
                Object[] objArr2 = {Integer.valueOf(i2), th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4fa38abf7d4829e80091b791bcaf6d8c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4fa38abf7d4829e80091b791bcaf6d8c");
                } else {
                    g.this.a(cVar.a() == null ? "" : cVar.a(), false);
                }
            }
        });
        b.a((FrameLayout) this.itemView, cVar, a2);
        this.c = cVar;
        if (this.e == null) {
            this.e = new com.sankuai.waimai.store.mach.page.event.b(this.itemView.getContext());
        }
        this.c.l().registerJsEventCallback(this.e);
        if (i == 0) {
            try {
                if (this.d == null || !this.d.aU || this.d.bm || this.d.O || this.d.bf || this.itemView == null || this.itemView.getContext() == null || g() == null || !(g() instanceof com.sankuai.waimai.store.poi.list.newp.adapter.b)) {
                    return;
                }
                u.c(this.itemView, 0, 0, 0, com.sankuai.shangou.stone.util.h.a(this.itemView.getContext(), 4.0f));
            } catch (Exception unused) {
            }
        }
    }

    public final void a(com.sankuai.waimai.store.repository.model.f fVar) {
        long j;
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bc9468d05ded2dea1df49fc1c5aafe1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bc9468d05ded2dea1df49fc1c5aafe1");
            return;
        }
        String str = "";
        if (fVar != null) {
            if (fVar.a() != null) {
                j = fVar.a().id;
                str = fVar.a().poiIdStr;
            } else if (fVar.i != null && fVar.i.moduleDesc != null && fVar.i.moduleDesc.jsonData != null) {
                j = com.sankuai.waimai.store.poi.list.util.c.a(fVar.i.moduleDesc.jsonData);
                if (j <= 0) {
                    j = com.sankuai.waimai.store.poi.list.util.c.c(fVar.i.moduleDesc.jsonData);
                }
                str = com.sankuai.waimai.store.poi.list.util.c.b(fVar.i.moduleDesc.jsonData);
                if (t.a(str)) {
                    str = com.sankuai.waimai.store.poi.list.util.c.d(fVar.i.moduleDesc.jsonData);
                }
            }
            if ((j > 0 && t.a(str)) || this.c == null || this.c.l() == null) {
                return;
            }
            int a2 = com.sankuai.waimai.store.manager.globalcart.a.a().a(str);
            HashMap hashMap = new HashMap();
            hashMap.put("poi_id", Long.valueOf(j));
            hashMap.put(FoodDetailNetWorkPreLoader.URI_POI_STR, str);
            hashMap.put("order_num", Integer.valueOf(a2));
            this.c.l().sendJsEvent("sg_order_num_changed", hashMap);
        }
        j = 0;
        if (j > 0) {
        }
        int a22 = com.sankuai.waimai.store.manager.globalcart.a.a().a(str);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("poi_id", Long.valueOf(j));
        hashMap2.put(FoodDetailNetWorkPreLoader.URI_POI_STR, str);
        hashMap2.put("order_num", Integer.valueOf(a22));
        this.c.l().sendJsEvent("sg_order_num_changed", hashMap2);
    }

    public static int a(BaseModuleDesc baseModuleDesc) {
        Object[] objArr = {baseModuleDesc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "86ccda0eee3ad8cebcb610e544edc364", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "86ccda0eee3ad8cebcb610e544edc364")).intValue();
        }
        if (baseModuleDesc != null) {
            try {
                if (baseModuleDesc.jsonData != null) {
                    Object obj = baseModuleDesc.jsonData.get("subscribe");
                    if (obj instanceof Integer) {
                        return ((Integer) obj).intValue();
                    }
                    if (obj instanceof Double) {
                        return ((Double) obj).intValue();
                    }
                }
            } catch (Exception e) {
                com.dianping.judas.util.a.a(e);
                return 0;
            }
        }
        return 0;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50effa16c031afcfdbaa2b4a52f56349", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50effa16c031afcfdbaa2b4a52f56349");
            return;
        }
        if (this.b != null && this.b.b() != null) {
            this.b.b().b(this.c);
        }
        if (this.c == null || this.c.l() == null) {
            return;
        }
        this.c.l().unregisterJsEventCallback();
    }

    public final void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e075e169e366b4cebc2e3f70dc74bbee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e075e169e366b4cebc2e3f70dc74bbee");
        } else if (o.j() && !t.a(str)) {
            ArrayList arrayList = (ArrayList) j.h().a(SCConfigPath.EXPOSE_TARGET_MODULE, new TypeToken<List<Map<String, String>>>() { // from class: com.sankuai.waimai.store.poilist.viewholders.g.2
            }.getType(), new ArrayList());
            if (com.sankuai.shangou.stone.util.a.b(arrayList)) {
                return;
            }
            for (int i = 0; i < arrayList.size(); i++) {
                Map map = (Map) com.sankuai.shangou.stone.util.a.a((List<Object>) arrayList, i);
                if (map.get("templateID") != null && ((String) map.get("templateID")).equals(str)) {
                    com.sankuai.waimai.store.util.monitor.b.a().a(SGModuleRenderLossRate.SGModuleRenderLossRate).a("appVersion", com.sankuai.waimai.foundation.core.common.a.a().e()).a("cate_code", this.d == null ? "-999999" : String.valueOf(this.d.c)).a("module_name", str).a(!z ? 1 : 0).a();
                }
            }
        }
    }
}
