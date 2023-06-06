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
public class JoinSessionJsHandler extends BaseIMJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "lYQ0gmPCw6hRVAPWYAymlK8NJQdX1ChQM6HEVcEIzXsF26mmPKbOZVN6dNc4UEUhaEidp0t1dAgt1uyYSJ6g+Q==";
    }

    @Override // com.sankuai.xm.integration.knb.handler.BaseIMJsHandler
    @Trace(action = "send", name = "start_knb", traceName = "sync_read")
    public void innerExe() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb6d1791a5b7efa69536687850e46111", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb6d1791a5b7efa69536687850e46111");
            return;
        }
        try {
            j.a(i.begin, "start_knb", "sync_read", 0L, "send", new Object[0]);
            JSONObject jSONObject = jsBean().argsJson;
            b bVar = new b(this);
            Object[] objArr2 = {jSONObject, bVar};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.bridge.business.proto.im.b.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "1fecbf1c0b6f356aee879c49f15dcb31", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "1fecbf1c0b6f356aee879c49f15dcb31");
            } else {
                IMClient.a().a(c.d(jSONObject));
                bVar.a(new JSONObject());
            }
            j.a((Object) null);
        } catch (Throwable th) {
            j.a(th);
            throw th;
        }
    }
}
