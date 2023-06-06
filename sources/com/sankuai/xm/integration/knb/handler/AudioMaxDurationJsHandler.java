package com.sankuai.xm.integration.knb.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.bridge.base.util.a;
import com.sankuai.xm.integration.knb.result.b;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class AudioMaxDurationJsHandler extends BaseIMJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "ZwP4UBuPxZxaKeqIoZRUfCJZbv9oSotADPUocsN/d4fL/+64sUgu209HY2xVTT/7ydWRO4Zp8zR80piyQ7INTg==";
    }

    @Override // com.sankuai.xm.integration.knb.handler.BaseIMJsHandler
    public void innerExe() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7db793c689275d94465e5b9cf91f33f4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7db793c689275d94465e5b9cf91f33f4");
            return;
        }
        JSONObject jSONObject = jsBean().argsJson;
        b bVar = new b(this);
        Object[] objArr2 = {jSONObject, bVar};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.bridge.business.proto.im.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "490d3c3833d86f8bc3fe0d98e297ac69", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "490d3c3833d86f8bc3fe0d98e297ac69");
            return;
        }
        try {
            int optInt = jSONObject.optInt("duration", 0);
            if (optInt <= 0) {
                bVar.a(10011, "duration param error");
                return;
            }
            IMClient.a().c(optInt);
            bVar.a(new JSONObject());
        } catch (Throwable th) {
            a.c("recordDuration exception:" + th, new Object[0]);
            bVar.a(-1, "exception:" + th);
        }
    }
}
