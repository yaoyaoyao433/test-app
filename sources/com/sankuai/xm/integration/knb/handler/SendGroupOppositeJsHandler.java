package com.sankuai.xm.integration.knb.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.trace.annotation.Trace;
import com.sankuai.xm.base.trace.i;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.bridge.business.proto.im.c;
import com.sankuai.xm.integration.knb.result.b;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class SendGroupOppositeJsHandler extends BaseIMJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "RQk00MWvikkXHQnNc7nULs7YPPb92aFrqAgzwpBCvODcU7J3HsW9wiJ7pu8bBA9dsXdsNLQ6wl0jTJtjwW7flA==";
    }

    @Override // com.sankuai.xm.integration.knb.handler.BaseIMJsHandler
    @Trace(action = "send", name = "start_knb", traceName = "opposite_msg")
    public void innerExe() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8fee877bd8d083dc3fd3507d70d5190", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8fee877bd8d083dc3fd3507d70d5190");
            return;
        }
        try {
            j.a(i.begin, "start_knb", "opposite_msg", 0L, "send", new Object[0]);
            JSONObject jSONObject = jsBean().argsJson;
            b bVar = new b(this);
            Object[] objArr2 = {jSONObject, bVar};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.bridge.business.proto.im.b.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "c9510ef96e7d29174925bff8103bd94f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "c9510ef96e7d29174925bff8103bd94f");
            } else {
                JSONArray optJSONArray = jSONObject.optJSONArray("messages");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    IMClient.a().c(c.d(jSONObject), c.a(optJSONArray));
                    bVar.a(new JSONObject());
                }
                bVar.a(10011, "messages param error");
            }
            j.a((Object) null);
        } catch (Throwable th) {
            j.a(th);
            throw th;
        }
    }
}
