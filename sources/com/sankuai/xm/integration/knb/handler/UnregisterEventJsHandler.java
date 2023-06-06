package com.sankuai.xm.integration.knb.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.utils.a;
import com.sankuai.xm.integration.knb.publish.c;
import com.sankuai.xm.integration.knb.publish.k;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class UnregisterEventJsHandler extends BaseIMJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "jCq+AxK7LVBs15Ya+YL1HS69OQs0VuVZ54J4MhcriAKnzFIyNmZWJtVHILLPK8StXNHUr6R41Uo2gSIw1dQJpw==";
    }

    @Override // com.sankuai.xm.integration.knb.handler.BaseIMJsHandler
    public void innerExe() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c5fd3bb60f0a8b5d6a965b61316f89a2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c5fd3bb60f0a8b5d6a965b61316f89a2");
            return;
        }
        String optString = jsBean().argsJson.optString("action", "");
        String optString2 = jsBean().argsJson.optString("idIMEvent", "");
        a.b("UnregisterEventJsHandler::innerExe event:" + optString + " id:" + optString2, new Object[0]);
        c a = k.a.a.a(optString, getChannel(), optString2);
        if (a != null) {
            a.b();
            k.a.a.c(a);
        } else {
            com.sankuai.xm.log.c.c("UnregisterEventJsHandler", "error info: event=%s id=%s channel=%d", optString, optString2, Short.valueOf(getChannel()));
        }
        jsCallback();
    }
}
