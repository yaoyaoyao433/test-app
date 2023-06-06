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
public class SupportGroupOppositeJsHandler extends BaseIMJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "h768vvjRXcrpWEcbZECI2o7Ky+Ei4U5O3BsW6EOgD6F0s0z2s9UEloz6lQTiCyAXnPwmOp0Wh9Bdl5KG3KrwVw==";
    }

    @Override // com.sankuai.xm.integration.knb.handler.BaseIMJsHandler
    public void innerExe() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8caa76ba7719b7d9a269011a2c0344fc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8caa76ba7719b7d9a269011a2c0344fc");
            return;
        }
        JSONObject jSONObject = jsBean().argsJson;
        b bVar = new b(this);
        Object[] objArr2 = {jSONObject, bVar};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.bridge.business.proto.im.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "2a6f6faf706d923a876a8d4619f6a2b4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "2a6f6faf706d923a876a8d4619f6a2b4");
            return;
        }
        try {
            if (c.c(jSONObject) < 0) {
                bVar.a(10011, "channel param error");
                return;
            }
            boolean d = IMClient.a().d(c.c(jSONObject));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("isSupport", d);
            bVar.a(jSONObject2);
        } catch (Throwable th) {
            a.c("isSupportGroupOpposite exception:" + th, new Object[0]);
            bVar.a(-1, "exception:" + th);
        }
    }
}
