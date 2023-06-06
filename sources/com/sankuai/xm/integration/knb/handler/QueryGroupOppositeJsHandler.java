package com.sankuai.xm.integration.knb.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.bridge.base.util.a;
import com.sankuai.xm.im.bridge.business.proto.im.c;
import com.sankuai.xm.integration.knb.result.b;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class QueryGroupOppositeJsHandler extends BaseIMJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "P4WqqkKPCWMzBKjGEFXM1aQbC2cajO4qW3J+w1Fn7SN6C1/d96avvgGHCnYMHSMSxSGiAvNElD+XtwPZf0S0sg==";
    }

    @Override // com.sankuai.xm.integration.knb.handler.BaseIMJsHandler
    public void innerExe() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ef6a548dcad850cd3858a9c627a195e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ef6a548dcad850cd3858a9c627a195e");
            return;
        }
        JSONObject jSONObject = jsBean().argsJson;
        b bVar = new b(this);
        Object[] objArr2 = {jSONObject, bVar};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.bridge.business.proto.im.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "904056e426e80e479cc64e706ecfaae4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "904056e426e80e479cc64e706ecfaae4");
            return;
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("messages");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                IMClient.a().b(c.d(jSONObject), c.a(optJSONArray));
                bVar.a(new JSONObject());
                return;
            }
            bVar.a(10011, "messages param error");
        } catch (Throwable th) {
            a.c("queryGroupOpposite exception:" + th, new Object[0]);
            bVar.a(-1, "exception:" + th);
        }
    }
}
