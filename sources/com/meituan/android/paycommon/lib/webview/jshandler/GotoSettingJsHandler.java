package com.meituan.android.paycommon.lib.webview.jshandler;

import android.app.Activity;
import android.content.Intent;
import com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class GotoSettingJsHandler extends PayBaseJSHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler, com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76778b73776f7c12a09513781834d9f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76778b73776f7c12a09513781834d9f3");
            return;
        }
        Activity activity = jsHost().getActivity();
        if (activity != null) {
            activity.startActivity(new Intent("android.settings.SETTINGS"));
            jsCallback();
            return;
        }
        jsCallbackError(11, "未知错误");
    }
}
