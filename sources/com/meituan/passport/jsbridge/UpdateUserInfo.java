package com.meituan.passport.jsbridge;

import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.passport.aq;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class UpdateUserInfo extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "fFsP4/k1WbETDT+JP+5JbAZpabiGtRgNfOGDzXH9tjJfqsFFIvhMivsWDZLZ2dfBTuurTifK9f3sWIGyVTqrBA==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f1fa1350f84b6cb88a2698f6dda475b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f1fa1350f84b6cb88a2698f6dda475b7");
        } else if (jsHost() == null || jsHost().getActivity() == null) {
        } else {
            aq.a(jsHost().getContext()).a(jsHost().getActivity());
            jsCallback();
        }
    }
}
