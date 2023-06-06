package com.meituan.android.cashier.common;

import android.text.TextUtils;
import com.meituan.android.cashier.bean.CashierRouterPreGuideHornConfig;
import com.meituan.android.paybase.moduleinterface.FinanceJsHandler;
import com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CashierAvailableJsHandler extends PayBaseJSHandler implements FinanceJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public String getMethodName() {
        return "pay.cashierAvailable";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "O3EjmqXfBDc6lIEMjjPs5x6fXhku/Oqbx+cH8ktmql71BRji8Jhn74Hni/EaAIueNGF8YgIGWMbHkh7cwsMbhw==";
    }

    @Override // com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler, com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a11c32a486cd10f4ef0d67e9975cfe23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a11c32a486cd10f4ef0d67e9975cfe23");
        } else if (jsBean() == null || jsBean().argsJson == null) {
            jsCallbackErrorMsg("jsBean == null");
        } else {
            try {
                JSONObject jSONObject = new JSONObject(jsBean().argsJson.optString("data"));
                String optString = jSONObject.optString("cashier_type");
                String optString2 = jSONObject.optString("merchant_no");
                if (TextUtils.isEmpty(optString)) {
                    jsCallbackErrorMsg("cashierType is null");
                } else if (TextUtils.isEmpty(optString2)) {
                    jsCallbackErrorMsg("merchantNo is null");
                } else {
                    List<CashierRouterPreGuideHornConfig> b = m.a().b();
                    if (com.meituan.android.paybase.utils.i.a((Collection) b)) {
                        callBack(false);
                        return;
                    }
                    for (CashierRouterPreGuideHornConfig cashierRouterPreGuideHornConfig : b) {
                        if (cashierRouterPreGuideHornConfig != null && TextUtils.equals(cashierRouterPreGuideHornConfig.getCashierType(), optString)) {
                            callBack(true);
                            return;
                        }
                    }
                    callBack(false);
                }
            } catch (Exception e) {
                jsCallbackErrorMsg(e.getMessage());
            }
        }
    }

    private void callBack(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af25f323e93d9c301663ffdbd70e8aaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af25f323e93d9c301663ffdbd70e8aaf");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("available", z);
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "CashierAvailableJsHandler_callBack", (Map<String, Object>) null);
        }
        jsCallback(jSONObject);
    }

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public Class<?> getHandlerClass() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59dba74431d531706883fc9f4c9f0437", RobustBitConfig.DEFAULT_VALUE) ? (Class) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59dba74431d531706883fc9f4c9f0437") : getClass();
    }
}
