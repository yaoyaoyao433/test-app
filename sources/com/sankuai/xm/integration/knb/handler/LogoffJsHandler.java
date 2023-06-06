package com.sankuai.xm.integration.knb.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.bridge.base.util.a;
import com.sankuai.xm.integration.knb.result.b;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class LogoffJsHandler extends BaseIMJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "bucVg7D0rUzHagMBvKIUYkPszbqYbpDvJBuUaxUqRVGDnsk5xnyi2s8qdc58p4B4FwUzf14IapD1u5yjIKAwDA==";
    }

    @Override // com.sankuai.xm.integration.knb.handler.BaseIMJsHandler
    public void innerExe() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95b787cc82b5f46a77f909a1e39eeb91", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95b787cc82b5f46a77f909a1e39eeb91");
            return;
        }
        JSONObject jSONObject = jsBean().argsJson;
        b bVar = new b(this);
        Object[] objArr2 = {jSONObject, bVar};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.bridge.business.proto.im.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "ad2cbd2a3e3098487a8e38c099891db2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "ad2cbd2a3e3098487a8e38c099891db2");
            return;
        }
        try {
            a.a("LogoffJsHandler::innerExe", new Object[0]);
            IMClient.a().u();
            bVar.a(new JSONObject());
        } catch (Throwable th) {
            a.c("logout exception:" + th, new Object[0]);
            bVar.a(-1, "exception:" + th);
        }
    }
}
