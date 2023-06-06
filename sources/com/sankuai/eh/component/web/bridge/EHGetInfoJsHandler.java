package com.sankuai.eh.component.web.bridge;

import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.tools.d;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class EHGetInfoJsHandler extends EHBaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.eh.component.web.bridge.EHBaseJsHandler
    public void innerExec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "999fcb540001795cfa1d54cc20e98194", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "999fcb540001795cfa1d54cc20e98194");
            return;
        }
        d.b("eh.getInfo 桥调起");
        if (this.cContext == null) {
            com.sankuai.ehcore.module.core.a a = com.sankuai.ehcore.bridge.knb.a.a(this);
            if (a != null) {
                com.sankuai.ehcore.bridge.a.a(a, new com.sankuai.ehcore.bridge.b() { // from class: com.sankuai.eh.component.web.bridge.EHGetInfoJsHandler.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.ehcore.bridge.b
                    public final void a(JSONObject jSONObject) {
                        Object[] objArr2 = {jSONObject};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8107938be75cce7080b8956e3b09d999", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8107938be75cce7080b8956e3b09d999");
                        } else {
                            EHGetInfoJsHandler.this.jsCallback(jSONObject);
                        }
                    }

                    @Override // com.sankuai.ehcore.bridge.b
                    public final void a(int i, String str) {
                        Object[] objArr2 = {Integer.valueOf(i), str};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ab0a926835e7fd874426bd2e448d535c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ab0a926835e7fd874426bd2e448d535c");
                        } else {
                            EHGetInfoJsHandler.this.jsCallbackError(RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_DESTROY, str);
                        }
                    }
                });
            } else {
                jsCallbackError(RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_DESTROY, "no eh environment!");
            }
        }
    }
}
