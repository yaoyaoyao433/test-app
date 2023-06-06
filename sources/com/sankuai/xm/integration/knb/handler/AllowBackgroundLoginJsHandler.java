package com.sankuai.xm.integration.knb.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.bridge.base.util.a;
import com.sankuai.xm.integration.knb.result.b;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class AllowBackgroundLoginJsHandler extends BaseIMJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "Zp/5xbD0dQ+Zy2jFXkT9rlWSUGxSqyoZHlZ+rjIjfKl4F/Q8OTlbDNjpaUv5gEz4T9KyUbm8KKoKe66GK9hUbQ==";
    }

    @Override // com.sankuai.xm.integration.knb.handler.BaseIMJsHandler
    public void innerExe() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3b8306deff3a109f6a4a5c52da024af", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3b8306deff3a109f6a4a5c52da024af");
            return;
        }
        JSONObject jSONObject = jsBean().argsJson;
        b bVar = new b(this);
        Object[] objArr2 = {jSONObject, bVar};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.bridge.business.proto.im.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "d138717212eb3f14e9157ac61f9844fa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "d138717212eb3f14e9157ac61f9844fa");
            return;
        }
        try {
            IMClient.a().h().a(jSONObject.optBoolean("allow", false));
            bVar.a(new JSONObject());
        } catch (Throwable th) {
            a.c("setAllowBackgroundLogin exception:" + th, new Object[0]);
            bVar.a(-1, "exception:" + th);
        }
    }
}
