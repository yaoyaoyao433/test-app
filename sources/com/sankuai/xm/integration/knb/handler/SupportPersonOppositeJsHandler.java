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
public class SupportPersonOppositeJsHandler extends BaseIMJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "bubC+TvHiKaMjah3//1a6uD/uaCmGeK/2PIYiF/B38bxo3ns5bYUE0fEb9tAX/rcPXw1gr+74tbicXjOAqQbMA==";
    }

    @Override // com.sankuai.xm.integration.knb.handler.BaseIMJsHandler
    public void innerExe() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c16f4813a33f9f1c17339c1e818da32", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c16f4813a33f9f1c17339c1e818da32");
            return;
        }
        JSONObject jSONObject = jsBean().argsJson;
        b bVar = new b(this);
        Object[] objArr2 = {jSONObject, bVar};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.bridge.business.proto.im.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "15dcfd7ef8a4d631d3d342d6b94df16e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "15dcfd7ef8a4d631d3d342d6b94df16e");
            return;
        }
        try {
            if (c.c(jSONObject) < 0) {
                bVar.a(10011, "channel param error");
                return;
            }
            boolean b = IMClient.a().b(c.c(jSONObject));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("isSupport", b);
            bVar.a(jSONObject2);
        } catch (Throwable th) {
            a.c("isSupportPersonOpposite exception:" + th, new Object[0]);
            bVar.a(-1, "exception:" + th);
        }
    }
}
