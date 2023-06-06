package com.dianping.titans.js.jshandler;

import com.dianping.titans.js.BridgeManager;
import com.dianping.titans.js.DelegatedJsHandler;
import com.dianping.titansmodel.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.bean.KNBJsErrorInfo;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class GetCityInfoJsHandler extends DelegatedJsHandler<JSONObject, c> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.DelegatedJsHandler, com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public int jsHandlerType() {
        return 1;
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f61d293a466e4f1a837912c82e6c3a66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f61d293a466e4f1a837912c82e6c3a66");
        } else if (BridgeManager.getJSBPerformer() == null) {
            jsCallbackError(KNBJsErrorInfo.Error_7_Api_Not_Support.getErrorCode(), "jsbPerformer not init");
        } else {
            BridgeManager.getJSBPerformer().getCityInfo(this);
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public boolean isApiSupported() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b574a4a0573e4a8ee28fcef97178f543", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b574a4a0573e4a8ee28fcef97178f543")).booleanValue() : BridgeManager.getJSBPerformer() != null;
    }
}
