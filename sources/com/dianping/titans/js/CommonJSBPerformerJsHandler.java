package com.dianping.titans.js;

import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.dianping.titansadapter.IJSBPerformer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class CommonJSBPerformerJsHandler extends DelegatedJsHandler<JSONObject, JsBridgeResult> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public abstract int getPerformerId();

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public boolean isApiSupported() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a6d6bd4473ced7fb16a9ecdcbf92fa3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a6d6bd4473ced7fb16a9ecdcbf92fa3")).booleanValue();
        }
        IJSBPerformer jSBPerformer = BridgeManager.getJSBPerformer();
        if (jSBPerformer == null) {
            return false;
        }
        return jSBPerformer.isPerformerApiSupported(getPerformerId());
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d88999286ebdd477bff4f611299640c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d88999286ebdd477bff4f611299640c4");
            return;
        }
        IJSBPerformer jSBPerformer = BridgeManager.getJSBPerformer();
        if (jSBPerformer == null) {
            jsCallbackError(-1, "null performer");
            return;
        }
        int performerId = getPerformerId();
        if (!jSBPerformer.isPerformerApiSupported(performerId)) {
            jsCallbackError(BaseJsHandler.ERROR_CODE_METHOD_NOT_IMPLEMENTED, BaseJsHandler.ERROR_MSG_METHOD_NOT_IMPLEMENTED);
        } else {
            jSBPerformer.onPerform(performerId, jsBean().argsJson, this);
        }
    }

    @Override // com.dianping.titans.js.DelegatedJsHandler, com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public int jsHandlerType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9068e2ec32a7be70d3cbaec755e0202c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9068e2ec32a7be70d3cbaec755e0202c")).intValue();
        }
        if (BridgeManager.getJSBPerformer() == null || !BridgeManager.getJSBPerformer().isCommonSupported(getPerformerId())) {
            return super.jsHandlerType();
        }
        return 1;
    }
}
