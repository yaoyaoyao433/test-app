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
public class StopRecordVoiceJsHandler extends BaseIMJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "fHzZhR7xWqsREPjv9kTrzSF0LFTYchDWQMbRzIlcON0sb4iHnjOaISuLKBy7qhLtfdyWG5HhTjiPdmi259Spmw==";
    }

    @Override // com.sankuai.xm.integration.knb.handler.BaseIMJsHandler
    public void innerExe() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66468c365339f7c068eba3df1e8e5dc5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66468c365339f7c068eba3df1e8e5dc5");
            return;
        }
        JSONObject jSONObject = jsBean().argsJson;
        b bVar = new b(this);
        c cVar = (c) createCallback(c.class, "dxsdk.audioRecord");
        Object[] objArr2 = {jSONObject, bVar, cVar};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.bridge.business.proto.im.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "c0ae253acb6c00059a814d031e1e533c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "c0ae253acb6c00059a814d031e1e533c");
            return;
        }
        try {
            a.a("StopRecordVoiceJsHandler::innerExe", new Object[0]);
            if (jSONObject.optBoolean("isCancel", false)) {
                IMClient.a().w();
                cVar.a(0L, 0L, null);
            } else {
                IMClient.a().v();
            }
            bVar.a(new JSONObject());
        } catch (Throwable th) {
            bVar.a(-1, "exception:" + th);
        }
    }
}
