package com.dianping.titans.js.jshandler;

import com.dianping.titans.js.BridgeManager;
import com.dianping.titans.js.DelegatedJsHandler;
import com.dianping.titansmodel.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.bean.KNBJsErrorInfo;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class StopLocatingJsHandler extends DelegatedJsHandler<JSONObject, g> {
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9665073da8bb4ed9aacbf5d54971edd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9665073da8bb4ed9aacbf5d54971edd");
        } else if (BridgeManager.getJSBPerformer() == null) {
            jsCallbackError(KNBJsErrorInfo.Error_7_Api_Not_Support.getErrorCode(), "jsbPerformer not init");
        } else {
            BridgeManager.getJSBPerformer().stopLocating();
            successCallback(new g());
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public boolean isApiSupported() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b90af8c031e86f0916a8ad5d40b532c1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b90af8c031e86f0916a8ad5d40b532c1")).booleanValue() : BridgeManager.getJSBPerformer() != null;
    }
}
