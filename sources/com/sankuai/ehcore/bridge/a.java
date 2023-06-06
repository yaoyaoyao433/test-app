package com.sankuai.ehcore.bridge;

import android.os.Handler;
import android.text.TextUtils;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.msc.modules.update.PackageLoadReporter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.tools.d;
import com.sankuai.eh.plugins.apiPrefetch.a;
import com.sankuai.ehcore.horn.e;
import com.sankuai.waimai.store.repository.model.ConfigInfo;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static Handler b = new Handler();

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.ehcore.bridge.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0569a<T> {
        void a(T t);
    }

    public static void a(com.sankuai.ehcore.module.core.a aVar, InterfaceC0569a<Void> interfaceC0569a) {
        Object[] objArr = {aVar, interfaceC0569a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d0f70d174b1d5952b487cf834d9b030e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d0f70d174b1d5952b487cf834d9b030e");
            return;
        }
        try {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.ehcore.module.core.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "0e65b99d4c2a142ef4de29d03ef4d99d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "0e65b99d4c2a142ef4de29d03ef4d99d");
            } else {
                if (!aVar.h.f) {
                    com.sankuai.ehcore.module.loader.a.a().a(aVar.h.i, aVar.h.a().get(PackageLoadReporter.Source.PREFETCH), 1);
                }
                aVar.h.f = true;
                aVar.a(false);
            }
            interfaceC0569a.a(null);
        } catch (Exception e) {
            d.a(e);
        }
    }

    public static void a(String str, com.sankuai.ehcore.module.core.a aVar, final b bVar) {
        Object[] objArr = {str, aVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "19815bec28f20c2aa5ed5a8c046dd7e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "19815bec28f20c2aa5ed5a8c046dd7e2");
            return;
        }
        com.sankuai.eh.plugins.apiPrefetch.a d = aVar.d();
        if (d != null) {
            d.a(str, new a.d() { // from class: com.sankuai.ehcore.bridge.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.eh.plugins.apiPrefetch.a.d
                public final void a(JSONObject jSONObject) {
                    Object[] objArr2 = {jSONObject};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ad73a91e4ac86247c220542ecb731bdc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ad73a91e4ac86247c220542ecb731bdc");
                    } else {
                        b.this.a(jSONObject);
                    }
                }

                @Override // com.sankuai.eh.plugins.apiPrefetch.a.d
                public final void a(String str2) {
                    Object[] objArr2 = {str2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "856e2dacc04c0ceb39360e768931dc21", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "856e2dacc04c0ceb39360e768931dc21");
                    } else {
                        b.this.a(RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_REQUEST_ID, str2);
                    }
                }
            });
        } else {
            bVar.a(RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_REQUEST_ID, "prefetch not init");
        }
    }

    public static void a(com.sankuai.ehcore.module.core.a aVar, b bVar) {
        Object[] objArr = {aVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5aa20d3362d678c3ddcee3b2e0d46716", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5aa20d3362d678c3ddcee3b2e0d46716");
            return;
        }
        try {
            com.sankuai.ehcore.tools.b e = aVar.e();
            JSONObject jSONObject = new JSONObject();
            String str = e.g;
            jSONObject.put("ehVersion", "EH/8.1.0");
            jSONObject.put("pattern", e.i);
            jSONObject.put("from", e.h);
            jSONObject.put("showSkeleton", !"false".equals(str));
            jSONObject.put("skeletonKey", str);
            Object[] objArr2 = {ConfigInfo.MODULE_BLOCK};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.ehcore.tools.b.a;
            jSONObject.put(ConfigInfo.MODULE_BLOCK, PatchProxy.isSupport(objArr2, e, changeQuickRedirect2, false, "44663348dc356ba4c8a735c8e1a8e06d", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr2, e, changeQuickRedirect2, false, "44663348dc356ba4c8a735c8e1a8e06d") : e.v.get(ConfigInfo.MODULE_BLOCK));
            bVar.a(jSONObject);
        } catch (Exception e2) {
            bVar.a(RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_DESTROY, e2.getMessage());
        }
    }

    public static void b(String str, com.sankuai.ehcore.module.core.a aVar, b bVar) {
        JsonElement a2;
        Object[] objArr = {str, aVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9de0434a15a78504c8ef49cea09c805e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9de0434a15a78504c8ef49cea09c805e");
            return;
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.ehcore.module.core.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "84db9117a700a144122528759f9b5950", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "84db9117a700a144122528759f9b5950");
        } else if (e.i() || (a2 = e.a(str)) == null) {
        } else {
            aVar.a(a2);
        }
    }

    public static void a(BaseJsHandler baseJsHandler, com.sankuai.ehcore.module.core.a aVar, b bVar) {
        Object[] objArr = {baseJsHandler, aVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3b0668298aca619c14f610c9dd0a5cae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3b0668298aca619c14f610c9dd0a5cae");
        } else if ("debug".equals(baseJsHandler.jsBean().argsJson.optString("method"))) {
            com.sankuai.ehcore.debug.a.a(baseJsHandler.jsBean().argsJson, baseJsHandler);
            bVar.a(new JSONObject());
        } else if (!TextUtils.isEmpty(com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(com.sankuai.eh.component.service.utils.b.a(baseJsHandler.jsBean().args), "event"), ""))) {
            com.sankuai.ehcore.util.a.a("eh_report", new d.b().a("name", "eh.report").a("mark", "jsBridge").a((Map) com.sankuai.eh.component.service.utils.b.a(baseJsHandler.jsBean().args, new TypeToken<Map<String, Object>>() { // from class: com.sankuai.ehcore.bridge.a.2
            }.getType())).b);
            bVar.a(new JSONObject());
        } else {
            bVar.a(RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_DESTROY, "no valid params");
        }
    }
}
