package com.sankuai.xm.integration.knb.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.bridge.base.util.a;
import com.sankuai.xm.integration.knb.result.b;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class StopPlayVoiceJsHandler extends BaseIMJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "JSDwSzCXZoag+Jq41jwh703YsYD9pwqon5nYiasF16ZHm3skBLnXc21QsqML1oiwMvM8Ib+WrjuyEdCxgPLDyg==";
    }

    @Override // com.sankuai.xm.integration.knb.handler.BaseIMJsHandler
    public void innerExe() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f67681ff098f18b76b28fdb16fe72466", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f67681ff098f18b76b28fdb16fe72466");
            return;
        }
        JSONObject jSONObject = jsBean().argsJson;
        b bVar = new b(this);
        Object[] objArr2 = {jSONObject, bVar};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.bridge.business.proto.im.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "a18ad58e08c42fcc41b9dea8b269a09f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "a18ad58e08c42fcc41b9dea8b269a09f");
            return;
        }
        try {
            a.a("StopPlayVoiceJsHandler::innerExe", new Object[0]);
            IMClient.a().x();
            bVar.a(new JSONObject());
        } catch (Throwable th) {
            a.c("stopPlayVoice exception:" + th, new Object[0]);
            bVar.a(-1, "exception:" + th);
        }
    }
}
