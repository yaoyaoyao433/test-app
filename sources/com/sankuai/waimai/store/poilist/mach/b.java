package com.sankuai.waimai.store.poilist.mach;

import android.support.annotation.NonNull;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.store.expose.v2.entity.c;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class b extends com.sankuai.waimai.store.poilist.mach.a<BaseModuleDesc> {
    public static ChangeQuickRedirect c;
    public com.sankuai.waimai.mach.recycler.c d;
    public com.sankuai.waimai.store.platform.domain.manager.poi.a e;
    public a j;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(com.sankuai.waimai.mach.recycler.c cVar);
    }

    public abstract Mach.d a();

    @Override // com.sankuai.waimai.store.poilist.mach.a
    public final /* bridge */ /* synthetic */ void a(BaseModuleDesc baseModuleDesc, com.sankuai.waimai.mach.recycler.c cVar) {
    }

    @Override // com.sankuai.waimai.store.poilist.mach.a
    public final /* synthetic */ String a(BaseModuleDesc baseModuleDesc) {
        BaseModuleDesc baseModuleDesc2 = baseModuleDesc;
        Object[] objArr = {baseModuleDesc2};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b23cacf3e3e1976984f52cdeaa2e5a5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b23cacf3e3e1976984f52cdeaa2e5a5") : (baseModuleDesc2 == null || t.a(baseModuleDesc2.templateId)) ? "" : baseModuleDesc2.templateId;
    }

    @Override // com.sankuai.waimai.store.poilist.mach.a
    public final /* synthetic */ Map a(int i, BaseModuleDesc baseModuleDesc) {
        BaseModuleDesc baseModuleDesc2 = baseModuleDesc;
        Object[] objArr = {Integer.valueOf(i), baseModuleDesc2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eab83eaa3da478f12ed6d682b1d3f635", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eab83eaa3da478f12ed6d682b1d3f635");
        }
        if (baseModuleDesc2 == null || baseModuleDesc2.jsonData == null) {
            return null;
        }
        HashMap hashMap = new HashMap(baseModuleDesc2.jsonData);
        if (this.e != null) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("stid", this.e.b.abExpInfo);
            hashMap2.put("floor_index", Integer.valueOf(i));
            hashMap2.put("product_index", Integer.valueOf(i));
            hashMap2.put("poi_id", Long.valueOf(this.e.f()));
            hashMap2.put(FoodDetailNetWorkPreLoader.URI_POI_STR, this.e.h());
            hashMap2.put("poi_status", Integer.valueOf(this.e.b.getState()));
            hashMap2.put("buz_type", Integer.valueOf(this.e.b.getBuzType()));
            hashMap2.put(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(this.e.v()));
            hashMap2.put(BaseModuleDesc.USE_POI_ID_STR, Boolean.valueOf(com.sankuai.waimai.store.platform.domain.manager.poi.a.w()));
            hashMap.put(BaseModuleDesc.MACH_BIZ_CUSTOM_DATA_KEY, hashMap2);
        }
        return hashMap;
    }

    public b(@NonNull BaseActivity baseActivity, @NonNull com.sankuai.waimai.mach.d dVar, String str, com.sankuai.waimai.mach.recycler.b bVar, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        super(baseActivity, dVar, str, bVar);
        Object[] objArr = {baseActivity, dVar, str, bVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2b0db28a7b94f0b92f39c61d7d12da1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2b0db28a7b94f0b92f39c61d7d12da1");
            return;
        }
        this.d = null;
        this.e = aVar;
    }

    @Override // com.sankuai.waimai.store.poilist.mach.a
    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dcd4c62199dbab467c974755cae5541", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dcd4c62199dbab467c974755cae5541") : t.a(str) ? "" : str;
    }

    public final f<BaseModuleDesc> a(@NonNull BaseModuleDesc baseModuleDesc, int i) {
        Object[] objArr = {baseModuleDesc, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e95bffca04d9e0acea886fbaa97c37c1", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e95bffca04d9e0acea886fbaa97c37c1");
        }
        if (!t.a(baseModuleDesc.templateId)) {
            this.d = a(i, baseModuleDesc, baseModuleDesc.moduleId, 0);
        }
        if (this.d != null) {
            this.d.k().registerJsEventCallback(a());
        }
        return new f<>(baseModuleDesc, this.d);
    }

    public final void a(final com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebcc81819b0f70b7761977ea73f6035c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebcc81819b0f70b7761977ea73f6035c");
        } else if (aVar == null || aVar.g() == null) {
        } else {
            String str = null;
            if (aVar.h() != null && aVar.h().containsKey("expose-unique-key")) {
                str = String.valueOf(aVar.h().get("expose-unique-key"));
            }
            if (t.a(str)) {
                str = String.valueOf(System.identityHashCode(aVar));
            }
            com.sankuai.waimai.store.expose.v2.entity.a aVar2 = new com.sankuai.waimai.store.expose.v2.entity.a(aVar.g(), str);
            aVar2.a(new c.a() { // from class: com.sankuai.waimai.store.poilist.mach.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.expose.v2.entity.c.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "32180bcde70d5514be0f25ddddecd956", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "32180bcde70d5514be0f25ddddecd956");
                    } else {
                        aVar.f.triggerViewReport(aVar);
                    }
                }
            });
            if (this.g instanceof com.sankuai.waimai.store.expose.v2.a) {
                com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) this.g, aVar2);
            }
        }
    }

    public final void a(a aVar) {
        this.j = aVar;
    }
}
