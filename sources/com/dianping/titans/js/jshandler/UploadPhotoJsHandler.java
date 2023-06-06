package com.dianping.titans.js.jshandler;

import com.dianping.titans.js.BridgeManager;
import com.dianping.titans.js.DelegatedJsHandler;
import com.dianping.titansmodel.apimodel.g;
import com.dianping.titansmodel.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.bean.KNBJsErrorInfo;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class UploadPhotoJsHandler extends DelegatedJsHandler<g, i> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.DelegatedJsHandler, com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public int jsHandlerType() {
        return 1;
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c348bdb9e3d39f8c0cea3c82a4a4f72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c348bdb9e3d39f8c0cea3c82a4a4f72");
        } else if (BridgeManager.getJSBPerformer() == null) {
            jsCallbackError(KNBJsErrorInfo.Error_7_Api_Not_Support.getErrorCode(), "jsbPerformer not init");
        } else {
            BridgeManager.getJSBPerformer().uploadPhoto(args(), this);
        }
    }
}
