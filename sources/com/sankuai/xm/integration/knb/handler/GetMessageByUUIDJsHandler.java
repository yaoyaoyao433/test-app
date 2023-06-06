package com.sankuai.xm.integration.knb.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.bridge.business.proto.im.b;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class GetMessageByUUIDJsHandler extends BaseIMJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "AL1L/o+37uwxOvWQm5+qtmjE6wE0B+rfsNwZSBRl8dJ8CYML3fL6sYYQKV+Sl3878L8XDcmENEK0D1gAgYu+2A==";
    }

    @Override // com.sankuai.xm.integration.knb.handler.BaseIMJsHandler
    public void innerExe() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f3563779e9c7ff848c5942b53f1c115", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f3563779e9c7ff848c5942b53f1c115");
        } else {
            b.a(jsBean().argsJson, new com.sankuai.xm.integration.knb.result.b(this));
        }
    }
}
