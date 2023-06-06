package com.sankuai.xm.integration.knb.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.bridge.base.util.a;
import com.sankuai.xm.integration.knb.result.b;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class LoginByPassportJsHandler extends BaseIMJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "LbKZj6DGiTXFsMFZr8QIYoHu1X1AylcLgzPdgE3sFd9h/mFMivQf2HwlfxXhcwBSuAqIbjvIE6MC+TSOKg0BZQ==";
    }

    @Override // com.sankuai.xm.integration.knb.handler.BaseIMJsHandler
    public void innerExe() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c37b8fb507c7f516ae15460d6fd4f8cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c37b8fb507c7f516ae15460d6fd4f8cb");
            return;
        }
        JSONObject jSONObject = jsBean().argsJson;
        b bVar = new b(this);
        Object[] objArr2 = {jSONObject, bVar};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.bridge.business.proto.im.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "bcd1ea30ff1e0b0012b05af3a1c8150c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "bcd1ea30ff1e0b0012b05af3a1c8150c");
            return;
        }
        try {
            String optString = jSONObject.optString("passport", "");
            if (ac.a(optString)) {
                bVar.a(10011, "passport param error");
                return;
            }
            String optString2 = jSONObject.optString("token", "");
            if (ac.a(optString2)) {
                bVar.a(10011, "token param error");
                return;
            }
            a.a("LoginByPassportJsHandler::innerExe passport:" + optString, new Object[0]);
            IMClient.a().a(optString, optString2);
            bVar.a(new JSONObject());
        } catch (Throwable th) {
            a.c("loginPassport exception:" + th, new Object[0]);
            bVar.a(-1, "exception:" + th);
        }
    }
}
