package com.sankuai.xm.integration.knb.result;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.bridge.business.proto.im.c;
import com.sankuai.xm.integration.knb.handler.BaseIMJsHandler;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b implements com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.b {
    public static ChangeQuickRedirect a;
    private BaseIMJsHandler b;

    public b(BaseIMJsHandler baseIMJsHandler) {
        Object[] objArr = {baseIMJsHandler};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "651096248176f24a5592d86a2d28e770", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "651096248176f24a5592d86a2d28e770");
        } else {
            this.b = baseIMJsHandler;
        }
    }

    @Override // com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.b
    public final void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "634e7f9443f6062adbb8c787c73e8e5c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "634e7f9443f6062adbb8c787c73e8e5c");
        } else {
            this.b.jsCallback(jSONObject);
        }
    }

    @Override // com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.b
    public final void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "825c86dbd57f0bdd232ce99989c653ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "825c86dbd57f0bdd232ce99989c653ee");
            return;
        }
        BaseIMJsHandler baseIMJsHandler = this.b;
        int a2 = c.a(i);
        baseIMJsHandler.jsCallbackError(a2, str + " errorCode:" + i);
    }
}
