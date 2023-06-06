package com.sankuai.xm.integration.knb.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.bridge.base.util.a;
import com.sankuai.xm.integration.knb.result.b;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class GetMyUidJsHandler extends BaseIMJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "G/ks2OC4RiJbvnlG7QzAS0RjbkLcLMceIExesMKhrc2uNw6UVHyrUkN+ZTjq2KChCYgPjHYKrA3jMjtOXJhriw==";
    }

    @Override // com.sankuai.xm.integration.knb.handler.BaseIMJsHandler
    public void innerExe() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b43edfcd889d30ee92ff56333011d74", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b43edfcd889d30ee92ff56333011d74");
            return;
        }
        JSONObject jSONObject = jsBean().argsJson;
        b bVar = new b(this);
        Object[] objArr2 = {jSONObject, bVar};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.bridge.business.proto.im.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "a9ece15076c3c264b2cb92cb6274a61d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "a9ece15076c3c264b2cb92cb6274a61d");
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            StringBuilder sb = new StringBuilder();
            sb.append(IMClient.a().k());
            jSONObject2.put("uid", sb.toString());
            bVar.a(jSONObject2);
        } catch (Throwable th) {
            a.c("getMyDxUid exception:" + th, new Object[0]);
            bVar.a(-1, "exception:" + th);
        }
    }
}
