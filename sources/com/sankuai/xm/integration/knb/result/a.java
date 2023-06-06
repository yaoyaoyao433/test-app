package com.sankuai.xm.integration.knb.result;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.integration.knb.publish.c;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a implements com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.a {
    public static ChangeQuickRedirect a;
    private c b;

    public a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cee442a9c150e8bb73d8c384460ee311", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cee442a9c150e8bb73d8c384460ee311");
        } else {
            this.b = cVar;
        }
    }

    @Override // com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.a
    public final void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e68f910220e9dc758f36de4d0570a2e0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e68f910220e9dc758f36de4d0570a2e0");
            return;
        }
        try {
            this.b.c(jSONObject.toString());
        } catch (Throwable th) {
            com.sankuai.xm.im.bridge.base.util.a.c("ProtoEventResultImpl::publish exception:" + th, new Object[0]);
        }
    }
}
