package com.meituan.android.cashier.oneclick.jshandler;

import android.app.Activity;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.meituan.android.cashier.oneclick.callback.a;
import com.meituan.android.neohybrid.base.jshandler.NeoBaseJsHandler;
import com.meituan.android.neohybrid.util.gson.b;
import com.meituan.android.paybase.moduleinterface.FinanceJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class OpenOneClickPayJsHandler extends NeoBaseJsHandler<JsonObject> implements a, FinanceJsHandler {
    private static final String ABANDON_OPEN_CLICK_PAY = "abandonOpenClickPay";
    private static final String ADJUST_PAY_TYPE_LIST_ACTION = "adjustPayTypeList";
    private static final String OPEN_ONE_CLICK_PAY = "openOneClickPay";
    private static final String START_ONE_CLICK_PAY = "startOneClickPay";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public String getMethodName() {
        return "pay.openOneClickPay";
    }

    @Override // com.meituan.android.neohybrid.base.jshandler.NeoWrapperJsHandler
    public String getName() {
        return "pay.openOneClickPay";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "om8kt19p9DgHs8Qa+sLHNj+oGgiurui9H9YoJYL2bLqXHacPZPjZlwItyRXcfmjVQOCZl0TuNCjoEROQ2/Z23Q==";
    }

    @Override // com.meituan.android.neohybrid.base.jshandler.NeoFormatDataJsHandler
    public void onExecute(String str, JsonObject jsonObject) {
        Object[] objArr = {str, jsonObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "427f5fc4fdbcc041fc5507c0b5bd3c46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "427f5fc4fdbcc041fc5507c0b5bd3c46");
            return;
        }
        Activity activity = jsHost().getActivity();
        try {
            JSONObject jSONObject = new JSONObject(b.a().toJson((JsonElement) jsonObject));
            com.meituan.android.cashier.oneclick.presenter.a.a().a(activity).a(this).e(jSONObject);
            if (OPEN_ONE_CLICK_PAY.equals(str)) {
                com.meituan.android.cashier.oneclick.presenter.a.a().a(jSONObject);
            } else if (ABANDON_OPEN_CLICK_PAY.equals(str)) {
                com.meituan.android.cashier.oneclick.presenter.a.a().c(jSONObject);
            } else if (START_ONE_CLICK_PAY.equals(str)) {
                com.meituan.android.cashier.oneclick.presenter.a.a().d(jSONObject);
            } else if (ADJUST_PAY_TYPE_LIST_ACTION.equals(str)) {
                com.meituan.android.cashier.oneclick.presenter.a.a().b(jSONObject);
            } else {
                com.meituan.android.cashier.oneclick.presenter.a.a().c(jSONObject);
            }
        } catch (JSONException e) {
            executeFail(1000, "js参数异常");
            com.meituan.android.paybase.common.analyse.a.a(e, "OpenOneClickPayJsHandler_onExecute", (Map<String, Object>) null);
        }
    }

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public Class<?> getHandlerClass() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24cef897ffe20ba0db275304847c0cb9", RobustBitConfig.DEFAULT_VALUE) ? (Class) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24cef897ffe20ba0db275304847c0cb9") : getClass();
    }

    @Override // com.meituan.android.cashier.oneclick.callback.a
    public void executeSuccess(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef975ede810169848e4c1cdba0257735", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef975ede810169848e4c1cdba0257735");
        } else {
            formatJsCallbackSucc(str);
        }
    }

    @Override // com.meituan.android.cashier.oneclick.callback.a
    public void executeFail(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2041690bbce8b14a681dddf8e1e87a56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2041690bbce8b14a681dddf8e1e87a56");
        } else {
            formatJsCallbackError(i, str);
        }
    }
}
