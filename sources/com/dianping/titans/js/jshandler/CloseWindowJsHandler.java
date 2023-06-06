package com.dianping.titans.js.jshandler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class CloseWindowJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7615e20c0e0114bd5e0ba2e07c5e0cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7615e20c0e0114bd5e0ba2e07c5e0cf");
            return;
        }
        if (jsBean().argsJson.optInt("isCloseViewOnly") == 1) {
            jsHost().hiddenWindow();
        } else {
            jsHost().finish();
        }
        if (this.jsHandlerReportStrategy != null) {
            this.jsHandlerReportStrategy.report(this, new JSONObject());
        }
    }
}
