package com.sankuai.eh.component.web.bridge;

import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.web.plugins.api.a;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class EHPrefetchApiJsHandler extends EHBaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.eh.component.web.bridge.EHBaseJsHandler
    public void innerExec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc9d03749ed99edec1bb4df006fa3d6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc9d03749ed99edec1bb4df006fa3d6f");
            return;
        }
        com.sankuai.eh.plugins.apiPrefetch.a.a("js_all");
        if (this.cContext != null) {
            com.sankuai.eh.plugins.apiPrefetch.a.a("js_ehc");
            if (!this.cContext.a("api_fetch")) {
                com.sankuai.eh.plugins.apiPrefetch.a.a("js_ehc_no_api");
                jsCallbackError(RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_DESTROY, "not config api fetch!");
                return;
            }
            try {
                com.sankuai.eh.plugins.apiPrefetch.a.a("js_ehc_api");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", jsBean().argsJson.optString("url"));
                c cVar = new c() { // from class: com.sankuai.eh.component.web.bridge.EHPrefetchApiJsHandler.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.eh.component.web.bridge.c
                    public final void a(JSONObject jSONObject2) {
                        Object[] objArr2 = {jSONObject2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "00a8f8fec2cef450b7b6b40ffb3ddfe9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "00a8f8fec2cef450b7b6b40ffb3ddfe9");
                        } else {
                            EHPrefetchApiJsHandler.this.jsCallback(jSONObject2);
                        }
                    }

                    @Override // com.sankuai.eh.component.web.bridge.c
                    public final void a(int i, String str) {
                        Object[] objArr2 = {Integer.valueOf((int) RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_REQUEST_ID), str};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1fef8850c4b9c1fa8f102254a4feb902", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1fef8850c4b9c1fa8f102254a4feb902");
                        } else {
                            EHPrefetchApiJsHandler.this.jsCallbackError(RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_REQUEST_ID, str);
                        }
                    }
                };
                a.C0556a c0556a = new a.C0556a();
                c0556a.b = "onKNBJSCall";
                c0556a.c = "api_fetch";
                c0556a.d = jSONObject;
                c0556a.e = cVar;
                com.sankuai.eh.component.web.plugins.core.b.a(c0556a.a(), this.cContext);
                return;
            } catch (Exception e) {
                com.sankuai.eh.plugins.apiPrefetch.a.a("js_ehc_api_exception");
                jsCallbackError(RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_DESTROY, e.getMessage());
                return;
            }
        }
        com.sankuai.eh.plugins.apiPrefetch.a.a("js_eh");
        com.sankuai.ehcore.module.core.a a = com.sankuai.ehcore.bridge.knb.a.a(this);
        if (a != null) {
            com.sankuai.eh.plugins.apiPrefetch.a.a("js_eh_api");
            com.sankuai.ehcore.bridge.a.a(jsBean().argsJson.optString("url"), a, new com.sankuai.ehcore.bridge.b() { // from class: com.sankuai.eh.component.web.bridge.EHPrefetchApiJsHandler.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.ehcore.bridge.b
                public final void a(JSONObject jSONObject2) {
                    Object[] objArr2 = {jSONObject2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6046ac0723dc870dabda4b4715d0cd0d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6046ac0723dc870dabda4b4715d0cd0d");
                    } else {
                        EHPrefetchApiJsHandler.this.jsCallback(jSONObject2);
                    }
                }

                @Override // com.sankuai.ehcore.bridge.b
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ff687124c88e09cbc11c0c61fee32a46", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ff687124c88e09cbc11c0c61fee32a46");
                    } else {
                        EHPrefetchApiJsHandler.this.jsCallbackError(RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_DESTROY, str);
                    }
                }
            });
            return;
        }
        com.sankuai.eh.plugins.apiPrefetch.a.a("js_eh_no_api");
        jsCallbackError(RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_DESTROY, "no eh environment!");
    }
}
