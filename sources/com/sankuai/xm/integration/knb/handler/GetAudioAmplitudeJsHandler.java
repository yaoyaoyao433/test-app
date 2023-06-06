package com.sankuai.xm.integration.knb.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.bridge.base.util.a;
import com.sankuai.xm.integration.knb.result.b;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class GetAudioAmplitudeJsHandler extends BaseIMJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "Tv2u/rs11+kbp65KWlC80mee9UvCYoKqHgOmHAQJFOzguqP7bGxjwRU1I194QDu6P2Dx7VRT8Kp5+dAPC/IBfQ==";
    }

    @Override // com.sankuai.xm.integration.knb.handler.BaseIMJsHandler
    public void innerExe() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "616c8947af0dea01ce1848829cf6423e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "616c8947af0dea01ce1848829cf6423e");
            return;
        }
        JSONObject jSONObject = jsBean().argsJson;
        b bVar = new b(this);
        Object[] objArr2 = {jSONObject, bVar};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.bridge.business.proto.im.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "43c9d071d49b83f17da699af7103e9e2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "43c9d071d49b83f17da699af7103e9e2");
            return;
        }
        try {
            int y = (int) IMClient.a().y();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("amplitude", y);
            bVar.a(jSONObject2);
        } catch (Throwable th) {
            a.c("recordAmplitude exception:" + th, new Object[0]);
            bVar.a(-1, "exception:" + th);
        }
    }
}
