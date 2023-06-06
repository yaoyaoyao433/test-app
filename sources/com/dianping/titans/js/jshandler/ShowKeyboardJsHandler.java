package com.dianping.titans.js.jshandler;

import android.app.Activity;
import android.view.inputmethod.InputMethodManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ShowKeyboardJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public int jsHandlerType() {
        return 1;
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3284c99fd9b7b8f0153de601975f10da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3284c99fd9b7b8f0153de601975f10da");
            return;
        }
        Activity activity = jsHost().getActivity();
        if (activity == null) {
            jsCallbackError(-1, "activity is null");
            return;
        }
        try {
            ((InputMethodManager) activity.getSystemService("input_method")).showSoftInput(activity.getCurrentFocus(), 1);
            jsCallback();
        } catch (Throwable unused) {
            jsCallbackError(-500, "show keyboard failed");
        }
    }
}
