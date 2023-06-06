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
public class EHShowSkeletonJsHandler extends EHBaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.eh.component.web.bridge.EHBaseJsHandler
    public void innerExec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2cd79809912d9bb7bef1c59b82e8c2cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2cd79809912d9bb7bef1c59b82e8c2cb");
            return;
        }
        d.b("eh.showSkeleton 调起");
        if (this.cContext != null) {
            if (!this.cContext.a("skeleton")) {
                jsCallbackError(RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_DESTROY, "not config skeleton! ");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", jsBean().argsJson.optString("url"));
                a.C0556a c0556a = new a.C0556a();
                c0556a.b = "onKNBJSCall";
                c0556a.c = "showSkeleton";
                c0556a.d = jSONObject;
                com.sankuai.eh.component.web.plugins.core.b.a(c0556a.a(), this.cContext);
                return;
            } catch (Exception e) {
                jsCallbackError(RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_DESTROY, e.getMessage());
                return;
            }
        }
        com.sankuai.ehcore.module.core.a a = com.sankuai.ehcore.bridge.knb.a.a(this);
        if (a != null) {
            com.sankuai.ehcore.bridge.a.b(jsBean().argsJson.optString("url"), a, new com.sankuai.ehcore.bridge.b() { // from class: com.sankuai.eh.component.web.bridge.EHShowSkeletonJsHandler.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.ehcore.bridge.b
                public final void a(JSONObject jSONObject2) {
                    Object[] objArr2 = {jSONObject2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "aa384037d8aa278f1708097f8c8734ef", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "aa384037d8aa278f1708097f8c8734ef");
                    } else {
                        EHShowSkeletonJsHandler.this.jsCallback(jSONObject2);
                    }
                }

                @Override // com.sankuai.ehcore.bridge.b
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "33cab8102399b90285ba49849c6b1155", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "33cab8102399b90285ba49849c6b1155");
                    } else {
                        EHShowSkeletonJsHandler.this.jsCallbackError(RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_DESTROY, str);
                    }
                }
            });
        } else {
            jsCallbackError(RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_DESTROY, "no eh environment!");
        }
    }
}
