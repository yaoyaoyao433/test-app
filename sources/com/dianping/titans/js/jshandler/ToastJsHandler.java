package com.dianping.titans.js.jshandler;

import com.dianping.titans.js.JsHost;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.util.UIUtil;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ToastJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public int jsHandlerType() {
        return 1;
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "19922a64688d50a425881bc094a1226a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "19922a64688d50a425881bc094a1226a");
            return;
        }
        String optString = jsBean().argsJson.optString("content");
        int optInt = jsBean().argsJson.optInt("duration");
        JsHost jsHost = jsHost();
        if (jsHost != null) {
            if (optInt == 1) {
                UIUtil.showLongToast(jsHost.getActivity(), optString);
            } else {
                UIUtil.showShortToast(jsHost.getActivity(), optString);
            }
        }
        jsCallback();
    }
}
