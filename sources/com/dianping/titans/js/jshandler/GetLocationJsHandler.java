package com.dianping.titans.js.jshandler;

import com.dianping.titans.js.BridgeManager;
import com.dianping.titans.js.DelegatedJsHandler;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.bean.KNBJsErrorInfo;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class GetLocationJsHandler extends DelegatedJsHandler<JSONObject, JsBridgeResult> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getApiVersion() {
        return "1.2.0";
    }

    @Override // com.dianping.titans.js.DelegatedJsHandler, com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public int jsHandlerType() {
        return 1;
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c709a52109fc3ea7d87509316791851", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c709a52109fc3ea7d87509316791851");
        } else if (BridgeManager.getJSBPerformer() == null) {
            jsCallbackError(KNBJsErrorInfo.Error_7_Api_Not_Support.getErrorCode(), "jsbPerformer not init");
        } else {
            BridgeManager.getJSBPerformer().getLocation(jsBean().argsJson, this);
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public boolean isApiSupported() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2237d3642f50921c8290d61d49b6b589", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2237d3642f50921c8290d61d49b6b589")).booleanValue() : BridgeManager.getJSBPerformer() != null;
    }
}
