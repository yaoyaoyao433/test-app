package com.meituan.android.paycommon.lib.webview.jshandler;

import android.util.Log;
import com.meituan.android.paybase.moduleinterface.FinanceJsHandler;
import com.meituan.android.paybase.utils.ab;
import com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ScreenshotControlJsHandler extends PayBaseJSHandler implements FinanceJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public String getMethodName() {
        return "pay.screenshotControl";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "RBAiT5LMVzb7HfPK/OGUqctxlSBnGYziNie8/s3rjY5UKEWUZvOe0saEm79XkzB8ijdeKL+u0laimcWiBVwrLA==";
    }

    @Override // com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler, com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b62e5198a32792bdf9264e077d11f716", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b62e5198a32792bdf9264e077d11f716");
            return;
        }
        String optString = jsBean().argsJson.optString("enableScreenshot");
        if ("true".equals(optString)) {
            enableScreenshot();
        } else if ("false".equals(optString)) {
            disableScreenshot();
        }
    }

    private void disableScreenshot() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c5094db829fd7744ac5d7350e54e1f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c5094db829fd7744ac5d7350e54e1f1");
            return;
        }
        try {
            ab.b(jsHost().getActivity());
            jsCallback();
        } catch (Exception e) {
            jsCallbackError(0, Log.getStackTraceString(e));
        }
    }

    private void enableScreenshot() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b2d25bba95662f2262a5acca0dd458b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b2d25bba95662f2262a5acca0dd458b");
            return;
        }
        try {
            ab.a(jsHost().getActivity());
            jsCallback();
        } catch (Exception e) {
            jsCallbackError(0, Log.getStackTraceString(e));
        }
    }

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public Class<?> getHandlerClass() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0d3ead08c198daf053e9a19d9655034", RobustBitConfig.DEFAULT_VALUE) ? (Class) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0d3ead08c198daf053e9a19d9655034") : getClass();
    }
}
