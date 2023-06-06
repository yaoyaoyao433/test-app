package com.sankuai.xm.integration.knb.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.trace.annotation.Trace;
import com.sankuai.xm.base.trace.i;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.bridge.business.proto.im.c;
import com.sankuai.xm.integration.knb.result.b;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class SendPubOppositeJsHandler extends BaseIMJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "ntRgrI7rfjpGvPJFDQaCf36tuYouBg/jl5sTgPG6zTh9zU/OhjIvlj8YRUfKcmrIRHL12j7GOSXox3f0tgZn4g==";
    }

    @Override // com.sankuai.xm.integration.knb.handler.BaseIMJsHandler
    @Trace(action = "send", name = "start_knb", traceName = "opposite_msg")
    public void innerExe() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4aee0b119840906455a21ecf070c339", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4aee0b119840906455a21ecf070c339");
            return;
        }
        try {
            j.a(i.begin, "start_knb", "opposite_msg", 0L, "send", new Object[0]);
            JSONObject jSONObject = jsBean().argsJson;
            b bVar = new b(this);
            Object[] objArr2 = {jSONObject, bVar};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.bridge.business.proto.im.b.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "0fa70ed9d7f664cee5c128aae35a04d8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "0fa70ed9d7f664cee5c128aae35a04d8");
            } else {
                long optLong = jSONObject.optLong("time", 0L);
                if (optLong <= 0) {
                    bVar.a(10011, "time param error");
                } else {
                    IMClient.a().a(c.d(jSONObject), optLong);
                    bVar.a(new JSONObject());
                }
            }
            j.a((Object) null);
        } catch (Throwable th) {
            j.a(th);
            throw th;
        }
    }
}
