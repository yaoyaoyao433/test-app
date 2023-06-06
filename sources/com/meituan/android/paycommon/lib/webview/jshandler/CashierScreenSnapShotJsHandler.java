package com.meituan.android.paycommon.lib.webview.jshandler;

import android.app.Activity;
import com.dianping.titans.js.JsHost;
import com.meituan.android.paybase.moduleinterface.FinanceJsHandler;
import com.meituan.android.paybase.utils.f;
import com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class CashierScreenSnapShotJsHandler extends PayBaseJSHandler implements FinanceJsHandler {
    private static final String NAME = "pay.cashierSnapShot";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler
    public String getBridgeName() {
        return NAME;
    }

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public String getMethodName() {
        return NAME;
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "cZYQDDDPZ48aD1fBWJKCQxjbNEOQfJ8HlBODo3nZCbLJLPeKWDpqF80ejHG8dqtSztoTWfAhRUBrTd+xT4WYGQ==";
    }

    @Override // com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler, com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d58d4ef8a5be1ecd506cf9d5a95956f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d58d4ef8a5be1ecd506cf9d5a95956f");
            return;
        }
        super.exec();
        JsHost jsHost = jsHost();
        if (jsHost == null) {
            jsCallbackPayError();
            return;
        }
        Activity activity = jsHost.getActivity();
        if (activity == null || activity.isFinishing()) {
            jsCallbackPayError();
        } else {
            activity.runOnUiThread(a.a(this, activity));
        }
    }

    public static /* synthetic */ void lambda$null$2(CashierScreenSnapShotJsHandler cashierScreenSnapShotJsHandler, boolean z) {
        Object[] objArr = {cashierScreenSnapShotJsHandler, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2a5564a7d9d0ea2dac07e5c5e334ad6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2a5564a7d9d0ea2dac07e5c5e334ad6b");
        } else {
            cashierScreenSnapShotJsHandler.jsCallback();
        }
    }

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public Class<?> getHandlerClass() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c78b7173ff643f8d32bb9e1b5ea875b2", RobustBitConfig.DEFAULT_VALUE) ? (Class) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c78b7173ff643f8d32bb9e1b5ea875b2") : getClass();
    }

    public static /* synthetic */ void lambda$exec$3(CashierScreenSnapShotJsHandler cashierScreenSnapShotJsHandler, Activity activity) {
        Object[] objArr = {cashierScreenSnapShotJsHandler, activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9ce8ad96f4c8ba48d4a03416da952577", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9ce8ad96f4c8ba48d4a03416da952577");
            return;
        }
        Object[] objArr2 = {cashierScreenSnapShotJsHandler};
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        f.a(activity, PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "7b662bb81a019eba062a0063eb55552c", RobustBitConfig.DEFAULT_VALUE) ? (f.InterfaceC0337f) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "7b662bb81a019eba062a0063eb55552c") : new b(cashierScreenSnapShotJsHandler));
    }
}
