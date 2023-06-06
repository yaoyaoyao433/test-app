package com.sankuai.waimai.store.poi.list.newp.home;

import android.app.Activity;
import android.arch.lifecycle.q;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.android.common.aidata.ai.bundle.cache.CacheException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.poi.list.newp.home.model.BaseContainerViewModel;
import com.sankuai.waimai.store.util.monitor.monitor.SGHomePriceMetric;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g extends com.sankuai.waimai.store.poilist.mach.a<BaseModuleDesc> implements com.sankuai.waimai.store.mach.event.a {
    public static ChangeQuickRedirect a;
    private static final int j = Runtime.getRuntime().availableProcessors();
    int b;
    protected Mach c;
    public com.sankuai.waimai.store.poi.list.newp.home.model.a d;
    public Mach.d e;
    private com.sankuai.waimai.store.param.a k;
    private String l;
    private Handler m;

    @Override // com.sankuai.waimai.store.poilist.mach.a
    public final String a(String str, String str2) {
        return "闪购Poi可复用mach模版";
    }

    @Override // com.sankuai.waimai.store.poilist.mach.a
    public final /* bridge */ /* synthetic */ void a(BaseModuleDesc baseModuleDesc, com.sankuai.waimai.mach.recycler.c cVar) {
    }

    public static /* synthetic */ void c(g gVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "46993895a267a8fe3cc9f0bf7416fb3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "46993895a267a8fe3cc9f0bf7416fb3a");
        } else {
            com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.poi.list.newp.home.event.a());
        }
    }

    @Override // com.sankuai.waimai.store.poilist.mach.a
    public final /* bridge */ /* synthetic */ String a(BaseModuleDesc baseModuleDesc) {
        return baseModuleDesc.templateId;
    }

    public g(@NonNull BaseActivity baseActivity, @NonNull com.sankuai.waimai.store.param.a aVar, com.sankuai.waimai.store.poi.list.newp.home.model.a aVar2) {
        this(baseActivity, aVar, new com.sankuai.waimai.mach.recycler.b("supermarket"), aVar2);
        Object[] objArr = {baseActivity, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c408e5fbaec287ea7aa56e015876ea2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c408e5fbaec287ea7aa56e015876ea2");
        }
    }

    private g(@NonNull BaseActivity baseActivity, @NonNull com.sankuai.waimai.store.param.a aVar, com.sankuai.waimai.mach.recycler.b bVar, com.sankuai.waimai.store.poi.list.newp.home.model.a aVar2) {
        super(baseActivity, new com.sankuai.waimai.store.poilist.mach.e(baseActivity, aVar2.f), "supermarket", bVar);
        Object[] objArr = {baseActivity, aVar, bVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "880e06d4817a5ed6ebb380f9ea96f631", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "880e06d4817a5ed6ebb380f9ea96f631");
            return;
        }
        this.m = new Handler(Looper.getMainLooper());
        this.e = new Mach.d() { // from class: com.sankuai.waimai.store.poi.list.newp.home.g.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.Mach.d
            public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
                Object[] objArr2 = {str, map};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b5558fd70c812f469f1018ae44fbeb09", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b5558fd70c812f469f1018ae44fbeb09");
                    return;
                }
                com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.convenient.detail.a(g.this, str, map, g.this.g == null ? "default" : g.this.g.w()));
                if ("Module_Price_Abnormal".equals(str) && map != null) {
                    com.sankuai.waimai.store.util.monitor.b.a().a(SGHomePriceMetric.SGHomePriceMetric).a(TextUtils.isEmpty(String.valueOf(map.get("error_log"))) ? "" : String.valueOf(map.get("error_log"))).c(g.this.d.r).a("template_id", String.valueOf(map.get("template_id"))).a();
                }
                if ("supermarket_convenient_home_survey_cancel".equals(str)) {
                    g.c(g.this);
                }
            }
        };
        this.k = aVar;
        this.d = aVar2;
        int a2 = com.sankuai.shangou.stone.util.h.a((Context) baseActivity);
        this.b = this.d != null ? a2 / this.d.g : a2;
    }

    @Override // com.sankuai.waimai.store.poilist.mach.a
    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ab418ba31dcc699db27ad96b4a13909", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ab418ba31dcc699db27ad96b4a13909");
        }
        return String.format(TextUtils.isEmpty(this.l) ? "sm_mach_poi_recycle_mach_%s" : this.l, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.sankuai.waimai.store.poilist.mach.a
    public Map<String, Object> a(int i, @NonNull BaseModuleDesc baseModuleDesc) {
        Object[] objArr = {Integer.valueOf(i), baseModuleDesc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "514d6c93e6e0e1520ce632e2ea6205cf", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "514d6c93e6e0e1520ce632e2ea6205cf");
        }
        HashMap hashMap = new HashMap(baseModuleDesc.jsonData);
        if (this.g != null && !this.g.isDestroyed()) {
            Map<String, Object> a2 = ((BaseContainerViewModel) q.a((FragmentActivity) this.g).a(BaseContainerViewModel.class)).c.a();
            if (a2 != null) {
                a2.put("index", Integer.valueOf(baseModuleDesc.index));
                a2.put(BaseModuleDesc.USE_POI_ID_STR, Boolean.valueOf(com.sankuai.waimai.store.platform.domain.manager.poi.a.w()));
            }
            hashMap.put(BaseModuleDesc.MACH_BIZ_CUSTOM_DATA_KEY, a2);
        }
        return hashMap;
    }

    @Override // com.sankuai.waimai.store.poilist.mach.a
    public final String b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fc7e47bf5bdc7a3c1211b0b335eb526", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fc7e47bf5bdc7a3c1211b0b335eb526");
        }
        return str2 + ":可复用mach模版预渲染失败！";
    }

    @Nullable
    public final com.sankuai.waimai.mach.recycler.c a(int i, BaseModuleDesc baseModuleDesc, String str, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), baseModuleDesc, str, Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57113b322f220455af15795679b5f9e1", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.recycler.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57113b322f220455af15795679b5f9e1");
        }
        if (baseModuleDesc != null) {
            baseModuleDesc.index = i3 + i;
        }
        Map<String, Object> a2 = a(i, baseModuleDesc);
        String str2 = baseModuleDesc.templateId;
        String a3 = a(str);
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        com.sankuai.waimai.store.util.mach.b bVar = new com.sankuai.waimai.store.util.mach.b(str2, getClass().getSimpleName());
        com.sankuai.waimai.mach.recycler.h a4 = this.i.a(str2, str2, a3, 3000);
        if (a4 != null) {
            if (this.g.isDestroyed()) {
                return null;
            }
            com.sankuai.waimai.store.mach.c cVar = new com.sankuai.waimai.store.mach.c(this.g, this.g.w());
            ArrayList arrayList = new ArrayList();
            arrayList.add(new com.sankuai.waimai.store.mach.clickhandler.a());
            cVar.a(arrayList);
            com.sankuai.waimai.mach.recycler.c cVar2 = new com.sankuai.waimai.mach.recycler.c(str2, a4, cVar.a(this.h), a3, "supermarket");
            this.c = cVar2.k();
            if (this.c != null) {
                this.c.registerJsEventCallback(this.e);
            }
            this.i.a(this.g, cVar2, i2, 0, a2, a3);
            if (cVar2.b() == null) {
                bVar.a(CacheException.LOAD_BUNDLE_SUCCESS_RENDER_FAILURE, "", str2, a2.toString(), new Exception(b(str2, a3)));
                return null;
            }
            return cVar2;
        }
        bVar.a(str2, "闪购Poi可复用mach模版", new com.sankuai.waimai.mach.manager.cache.CacheException(17807));
        return null;
    }

    @Override // com.sankuai.waimai.store.mach.event.a
    public final Activity a() {
        return this.g;
    }

    @Override // com.sankuai.waimai.store.mach.event.a
    public final void b(@NonNull @NotNull String str, @Nullable @org.jetbrains.annotations.Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fd46c1e691a5b3f5f6201f357bb26f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fd46c1e691a5b3f5f6201f357bb26f3");
        } else if (this.c != null) {
            this.c.sendJsEvent(str, map);
        }
    }
}
