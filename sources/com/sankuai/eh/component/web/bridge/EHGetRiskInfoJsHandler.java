package com.sankuai.eh.component.web.bridge;

import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.tools.d;
import com.sankuai.eh.component.service.utils.b;
import com.sankuai.eh.component.web.plugins.api.a;
import com.sankuai.eh.component.web.plugins.i;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class EHGetRiskInfoJsHandler extends EHBaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.eh.component.web.bridge.EHBaseJsHandler
    public void innerExec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "104f6c0752bec5302859699843ed0567", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "104f6c0752bec5302859699843ed0567");
        } else if (this.cContext != null) {
            if (!this.cContext.a("bridge")) {
                jsCallbackError(RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_DESTROY, "not config eh risk extension!");
                d.b("getRiskInfo.callback.fail", new d.b().a("plugin", "bridge").a("methodName", "getRiskInfo").a("callbackMessage", "not config eh risk extension").a(this.cContext.a()).b);
            } else if (!i.a(jsHost().getUrl())) {
                jsCallbackError(RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_DESTROY, "not config eh risk bridge!");
                d.b("getRiskInfo.callback.fail", new d.b().a("plugin", "bridge").a("methodName", "getRiskInfo").a("callbackMessage", "not config eh risk bridge").a(this.cContext.a()).b);
            } else {
                c cVar = new c() { // from class: com.sankuai.eh.component.web.bridge.EHGetRiskInfoJsHandler.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.eh.component.web.bridge.c
                    public final void a(JSONObject jSONObject) {
                        Object[] objArr2 = {jSONObject};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "708c1f316a3bd2e82bda0d1edee8f85a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "708c1f316a3bd2e82bda0d1edee8f85a");
                        } else {
                            EHGetRiskInfoJsHandler.this.jsCallback(jSONObject);
                        }
                    }

                    @Override // com.sankuai.eh.component.web.bridge.c
                    public final void a(int i, String str) {
                        Object[] objArr2 = {Integer.valueOf((int) RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_REQUEST_ID), str};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b000b6b1be16986175b6e90941ba1d81", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b000b6b1be16986175b6e90941ba1d81");
                        } else {
                            EHGetRiskInfoJsHandler.this.jsCallbackError(RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_REQUEST_ID, str);
                        }
                    }
                };
                a.C0556a c0556a = new a.C0556a();
                c0556a.b = "onKNBJSCall";
                c0556a.c = "getRiskInfo";
                c0556a.d = new b.C0551b().a("url", jsHost().getUrl()).b;
                c0556a.e = cVar;
                com.sankuai.eh.component.web.plugins.core.b.a(c0556a.a(), this.cContext);
            }
        } else {
            jsCallbackError(RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_DESTROY, "not eh container!");
        }
    }
}
