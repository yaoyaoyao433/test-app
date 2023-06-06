package com.sankuai.eh.component.web.bridge;

import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.tools.d;
import com.sankuai.eh.component.web.plugins.api.a;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class EHTransCompleteJsHandler extends EHBaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.eh.component.web.bridge.EHBaseJsHandler
    public void innerExec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b851b38b27f83d01aa126823038e0ee3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b851b38b27f83d01aa126823038e0ee3");
            return;
        }
        d.b("eh.transComplete调起...");
        if (this.cContext != null) {
            if (!this.cContext.a("trans")) {
                jsCallbackError(RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_DESTROY, "not config eh trans!");
                return;
            }
            c cVar = new c() { // from class: com.sankuai.eh.component.web.bridge.EHTransCompleteJsHandler.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.eh.component.web.bridge.c
                public final void a(JSONObject jSONObject) {
                    Object[] objArr2 = {jSONObject};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6ac882842c25dc1776f1708fc632de8f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6ac882842c25dc1776f1708fc632de8f");
                    } else {
                        EHTransCompleteJsHandler.this.jsCallback(jSONObject);
                    }
                }

                @Override // com.sankuai.eh.component.web.bridge.c
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf((int) RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_REQUEST_ID), str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8c3738c776e6926a8d560a94c58305b7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8c3738c776e6926a8d560a94c58305b7");
                    } else {
                        EHTransCompleteJsHandler.this.jsCallbackError(RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_REQUEST_ID, str);
                    }
                }
            };
            a.C0556a c0556a = new a.C0556a();
            c0556a.b = "onKNBJSCall";
            c0556a.c = "transComplete";
            c0556a.d = jsBean().argsJson;
            c0556a.e = cVar;
            com.sankuai.eh.component.web.plugins.core.b.a(c0556a.a(), this.cContext);
        }
    }
}
