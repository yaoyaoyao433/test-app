package com.sankuai.xm.integration.knb.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.bridge.business.proto.im.b;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class CleanSessionsJsHandler extends BaseIMJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "I2mh6nohpiM2CxAcCswUU6k3Y0xfdndGT2sQ6flzQP209dJz2MhA5UBdxyNnnR8hmRwH+aDgWOA7PaAc2pOeRg==";
    }

    @Override // com.sankuai.xm.integration.knb.handler.BaseIMJsHandler
    public void innerExe() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0541293b09524d0f9cb1f9c407f8e282", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0541293b09524d0f9cb1f9c407f8e282");
        } else {
            b.b(jsBean().argsJson, new com.sankuai.xm.integration.knb.result.b(this));
        }
    }
}
