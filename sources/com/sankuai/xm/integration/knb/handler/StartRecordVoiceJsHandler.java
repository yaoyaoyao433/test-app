package com.sankuai.xm.integration.knb.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.voicemail.c;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.bridge.base.util.a;
import com.sankuai.xm.integration.knb.result.b;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class StartRecordVoiceJsHandler extends BaseIMJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "Sc+IGYC0TivpUDjb1doIqiILqHDPWY72rhzA9PLsn2UfnCYrzlYQwZ2eBoSP09+jjjCoZBVndGuYkr6g0JWPUg==";
    }

    @Override // com.sankuai.xm.integration.knb.handler.BaseIMJsHandler
    public void innerExe() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79a17a1736901440630722fa48e42f23", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79a17a1736901440630722fa48e42f23");
            return;
        }
        JSONObject jSONObject = jsBean().argsJson;
        b bVar = new b(this);
        c cVar = (c) createCallback(c.class, "dxsdk.audioRecord");
        Object[] objArr2 = {jSONObject, bVar, cVar};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.bridge.business.proto.im.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "2f20e14fd483dc09e04a1d36333bb3c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "2f20e14fd483dc09e04a1d36333bb3c8");
            return;
        }
        try {
            a.a("StartRecordVoiceJsHandler::innerExe", new Object[0]);
            int a = IMClient.a().a(cVar);
            if (a != 0) {
                bVar.a(a, "");
            } else {
                bVar.a(new JSONObject());
            }
        } catch (Throwable th) {
            a.c("startAudioRecord exception:" + th, new Object[0]);
            bVar.a(-1, "exception:" + th);
        }
    }
}
