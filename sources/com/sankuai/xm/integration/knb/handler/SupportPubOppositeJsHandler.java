package com.sankuai.xm.integration.knb.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.bridge.base.util.a;
import com.sankuai.xm.im.bridge.business.proto.im.c;
import com.sankuai.xm.integration.knb.result.b;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class SupportPubOppositeJsHandler extends BaseIMJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "ECJlzUXzuYMFpgzLkGWljdSFeoTVpulQp8Tuh/ZE7s9rcfe5Xm2gHW6FuhCQ3drQdRwBiCfMKU6VzsVl0rd31w==";
    }

    @Override // com.sankuai.xm.integration.knb.handler.BaseIMJsHandler
    public void innerExe() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e774295012b62f951feba8c1757bc8f7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e774295012b62f951feba8c1757bc8f7");
            return;
        }
        JSONObject jSONObject = jsBean().argsJson;
        b bVar = new b(this);
        Object[] objArr2 = {jSONObject, bVar};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.bridge.business.proto.im.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "a7232d653659f66fbab00fb2936b56ec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "a7232d653659f66fbab00fb2936b56ec");
            return;
        }
        try {
            if (c.c(jSONObject) < 0) {
                bVar.a(10011, "channel param error");
                return;
            }
            boolean c = IMClient.a().c(c.c(jSONObject));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("isSupport", c);
            bVar.a(jSONObject2);
        } catch (Throwable th) {
            a.c("isSupportPubOpposite exception:" + th, new Object[0]);
            bVar.a(-1, "exception:" + th);
        }
    }
}
