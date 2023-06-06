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
public class LoginByUidJsHandler extends BaseIMJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "A34eyEg8CCQYps976XTY3E6Ckv1dKg8armKSLMqEglArxH9Fg8fQhSNORy0HIsG0dP8ZuF85KkoieygJ8llGow==";
    }

    @Override // com.sankuai.xm.integration.knb.handler.BaseIMJsHandler
    public void innerExe() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1aef69fc1a6b085ac51b239ef0f103c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1aef69fc1a6b085ac51b239ef0f103c0");
            return;
        }
        JSONObject jSONObject = jsBean().argsJson;
        b bVar = new b(this);
        Object[] objArr2 = {jSONObject, bVar};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.bridge.business.proto.im.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "2e6ad3125bcc9f164d33550494eb0dd8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "2e6ad3125bcc9f164d33550494eb0dd8");
            return;
        }
        try {
            long optLong = jSONObject.optLong("uid", 0L);
            if (optLong <= 0) {
                bVar.a(10011, "uid param error");
                return;
            }
            String optString = jSONObject.optString("token", "");
            if (ac.a(optString)) {
                bVar.a(10011, "token param error");
                return;
            }
            a.a("LoginByUidJsHandler::innerExe passport:" + optLong, new Object[0]);
            IMClient.a().a(optLong, optString);
            bVar.a(new JSONObject());
        } catch (Throwable th) {
            a.c("loginUid exception:" + th, new Object[0]);
            bVar.a(-1, "exception:" + th);
        }
    }
}
