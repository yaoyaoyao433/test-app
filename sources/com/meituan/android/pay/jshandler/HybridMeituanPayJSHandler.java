package com.meituan.android.pay.jshandler;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.android.pay.common.analyse.a;
import com.meituan.android.pay.process.b;
import com.meituan.android.pay.process.g;
import com.meituan.android.pay.utils.k;
import com.meituan.android.paybase.moduleinterface.FinanceJsHandler;
import com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HybridMeituanPayJSHandler extends PayBaseJSHandler implements b, FinanceJsHandler {
    private static final int CODE_ERROR_DATA = -405;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public String getMethodName() {
        return "pay.hybridMtpCashierTransferProcess";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "XuU00GD8JetFuSCBjB01ER/rVM3TGQ9TyBQi6STBlRb0XtZpAU5Hs2CUgR/3KcDKx0ekbvdmco8FDWCUw/BBBQ==";
    }

    @Override // com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler, com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ce9acdf2d160d9bb310cadfcee7146b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ce9acdf2d160d9bb310cadfcee7146b");
            return;
        }
        Activity activity = jsHost().getActivity();
        if (activity != null) {
            JSONObject jSONObject = jsBean().argsJson;
            String str = jsBean().args;
            if (jSONObject == null || TextUtils.isEmpty(str)) {
                jsCallbackError(CODE_ERROR_DATA, "数据有误");
                return;
            }
            a.b = "4";
            k.a().b = this;
            g.a((FragmentActivity) activity, jSONObject, "preposed-mtcashier");
            return;
        }
        jsCallbackError(11, "activity为空");
    }

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public Class<?> getHandlerClass() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f47fda1dd10c0ce2f4fcef02d9809cd", RobustBitConfig.DEFAULT_VALUE) ? (Class) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f47fda1dd10c0ce2f4fcef02d9809cd") : getClass();
    }

    @Override // com.meituan.android.pay.process.b
    public void callBackData(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e266178c020c58a38f0d710c9fe24627", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e266178c020c58a38f0d710c9fe24627");
        } else if (obj instanceof JSONObject) {
            jsCallback((JSONObject) obj);
        } else {
            jsCallbackError(CODE_ERROR_DATA, "数据有误");
        }
    }
}
