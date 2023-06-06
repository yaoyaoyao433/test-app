package com.dianping.titans.js.jshandler;

import android.content.Intent;
import com.dianping.titans.js.BridgeManager;
import com.dianping.titans.js.DelegatedJsHandler;
import com.dianping.titans.utils.JavaScriptComposer;
import com.dianping.titansmodel.apimodel.f;
import com.dianping.titansmodel.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.bean.KNBJsErrorInfo;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ShareJsHandler extends DelegatedJsHandler<f, h> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.DelegatedJsHandler, com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public int jsHandlerType() {
        return 1;
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a58050be07050eebbc73bb6d69842ca3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a58050be07050eebbc73bb6d69842ca3");
        } else if (BridgeManager.getJSBPerformer() == null) {
            jsCallbackError(KNBJsErrorInfo.Error_7_Api_Not_Support.getErrorCode(), "jsbPerformer not init");
        } else {
            BridgeManager.getJSBPerformer().share(args(), this);
        }
    }

    @Override // com.dianping.titans.js.DelegatedJsHandler, com.dianping.titans.js.IJSHandlerDelegate
    public void actionCallback(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f08c2936b7f38e15affc365070fbaa0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f08c2936b7f38e15affc365070fbaa0b");
        } else if (hVar == null) {
        } else {
            hVar.status = "action";
            hVar.result = "next";
            jsHost().loadJs(JavaScriptComposer.makeCustomeEvent("knb-share", hVar.writeToJSON()));
        }
    }

    @Override // com.dianping.titans.js.DelegatedJsHandler, com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "111b57d8b12af50ecbdcc2b57ccad29c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "111b57d8b12af50ecbdcc2b57ccad29c");
            return;
        }
        super.onActivityResult(i, i2, intent);
        if ((i == 10103 || i == 1) && BridgeManager.getJSBPerformer() != null) {
            BridgeManager.getJSBPerformer().onActivityResult(jsBean().method, i, i2, intent, this);
        }
    }
}
