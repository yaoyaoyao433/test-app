package com.dianping.titans.js.jshandler;

import android.text.TextUtils;
import com.dianping.titans.js.JsHost;
import com.dianping.titans.js.KNBJsHost;
import com.dianping.titans.widget.LineTitleLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class RemoveTitleBarElementJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51437bfe6be5b2a4c065d939bdf9265f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51437bfe6be5b2a4c065d939bdf9265f");
            return;
        }
        try {
            String optString = jsBean().argsJson.optString("name");
            if (TextUtils.isEmpty(optString)) {
                jsCallbackErrorMsg("no name");
                return;
            }
            JsHost jsHost = jsHost();
            if (!(jsHost instanceof KNBJsHost)) {
                jsCallbackErrorMsg("knb only");
                return;
            }
            LineTitleLayout dynamicTitleBar = ((KNBJsHost) jsHost).getDynamicTitleBar();
            if (dynamicTitleBar == null) {
                jsCallbackErrorMsg("no dynamic title bar");
                return;
            }
            dynamicTitleBar.removeView(optString);
            jsCallback();
        } catch (Throwable th) {
            jsCallbackErrorMsg(th.getMessage());
        }
    }
}
