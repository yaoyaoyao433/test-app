package com.meituan.android.cashier.bridge;

import com.meituan.android.cashier.activity.MTCashierActivity;
import com.meituan.android.paybase.moduleinterface.FinanceJsHandler;
import com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CashierRepeatCountJSHandler extends PayBaseJSHandler implements FinanceJsHandler {
    private static final String NAME = "pay.cashierRepeatCount";
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
        return "oX722/40AglBzTyNLt2P0MN6CvHHJ6iTqe7a557i6SpenttslEyINK+zYT/D1yh9+Dskk6RdOyGknx0CNwK7Hg==";
    }

    @Override // com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler, com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f291d3711fcf2c0ff6ba0e62c299ebb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f291d3711fcf2c0ff6ba0e62c299ebb7");
            return;
        }
        super.exec();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("count", MTCashierActivity.h);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        jsCallback(jSONObject);
    }

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public Class<?> getHandlerClass() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a595e1ce34fd844b25d83cc7fe5be0a9", RobustBitConfig.DEFAULT_VALUE) ? (Class) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a595e1ce34fd844b25d83cc7fe5be0a9") : getClass();
    }
}
