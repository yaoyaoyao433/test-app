package com.sankuai.xm.integration.knb.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.bridge.base.util.a;
import com.sankuai.xm.integration.knb.result.b;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class IsLoginJsHandler extends BaseIMJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "t/85iNr1Wc6mFPt8gxSLnrGfSahYQJqVd4gof2mbqxhYRjQ95GDuO5/G2tlint4/kZx78xmOqMjpAMjfIuxZ7A==";
    }

    @Override // com.sankuai.xm.integration.knb.handler.BaseIMJsHandler
    public void innerExe() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05a7f345082c4c2c89b463d891e51b29", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05a7f345082c4c2c89b463d891e51b29");
            return;
        }
        JSONObject jSONObject = jsBean().argsJson;
        b bVar = new b(this);
        Object[] objArr2 = {jSONObject, bVar};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.bridge.business.proto.im.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "e1a0c5d9981e947a002528b77bd2a0df", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "e1a0c5d9981e947a002528b77bd2a0df");
            return;
        }
        try {
            boolean l = IMClient.a().h().l();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("isLogin", l);
            bVar.a(jSONObject2);
        } catch (Throwable th) {
            a.c("isDXSDKLogin exception:" + th, new Object[0]);
            bVar.a(-1, "exception:" + th);
        }
    }
}
