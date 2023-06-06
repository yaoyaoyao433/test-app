package com.sankuai.waimai.business.page.common.bridge;

import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.homepage.manager.c;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class checkUpdate extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "h6H7sqeXmt3zCUYpVoyd6Ksa9bu+qx3wfmQhj6t6H91uD/+Fi6zS+UhrW5Xwhgp6eKuxLMsQRO0AnLl6QaYb2g==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c4d561e5e4c73a05ccf83490b568de2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c4d561e5e4c73a05ccf83490b568de2");
        } else {
            c.b();
        }
    }
}
