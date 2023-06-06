package com.meituan.android.pay.jshandler;

import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.moduleinterface.FinanceJsHandler;
import com.meituan.android.paybase.set.a;
import com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class GetPayCommonParamJSHandler extends PayBaseJSHandler implements FinanceJsHandler {
    private static final String PARAM_MEMBER_ID = "member_id";
    private static final String PARAM_ZONE_USER_ID = "zone_user_id";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public String getMethodName() {
        return "pay.getPayCommonParam";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "XaVcW+wfER72EQZCoJRJbPjWsD7Z4A3lrkZj3lWrLc7bEjmw3tEQGNIp/kxr8vD7ELx9nfzMWC8JOo8WPwJGMw==";
    }

    @Override // com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler, com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32f384aca69b5f35b5ad9cfcad9dd61f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32f384aca69b5f35b5ad9cfcad9dd61f");
        } else if (jsHost().getActivity() != null) {
            jsCallback(getParam());
        } else {
            jsCallbackError(11, "activity异常");
        }
    }

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public Class<?> getHandlerClass() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f2368efb26f6a9d6bfbb45da0d9dec6", RobustBitConfig.DEFAULT_VALUE) ? (Class) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f2368efb26f6a9d6bfbb45da0d9dec6") : getClass();
    }

    private JSONObject getParam() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ae44c684760ea169522833e2dfce733", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ae44c684760ea169522833e2dfce733");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PARAM_MEMBER_ID, a.a());
            jSONObject.put(PARAM_ZONE_USER_ID, com.meituan.android.paybase.config.a.d().s().a());
            com.meituan.android.paybase.common.analyse.a.a("b_pay_5y5irc49_mc", new a.c().a("params", jSONObject.toString()).b);
        } catch (JSONException e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "getParam", (Map<String, Object>) null);
        }
        return jSONObject;
    }
}
