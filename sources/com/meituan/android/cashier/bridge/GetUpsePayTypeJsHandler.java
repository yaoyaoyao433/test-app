package com.meituan.android.cashier.bridge;

import android.content.Context;
import com.meituan.android.paybase.moduleinterface.FinanceJsHandler;
import com.meituan.android.paymentchannel.utils.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class GetUpsePayTypeJsHandler extends HybridBusinessJsHandler implements FinanceJsHandler {
    private static final String ACTION_GET_CURRENT_TYPE = "get_current_type";
    private static final String ACTION_GET_SAVED_TYPE = "get_saved_type";
    private static final String ARG_ACTION = "action";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public String getMethodName() {
        return "pay.getUpsePayType";
    }

    @Override // com.meituan.android.neohybrid.base.jshandler.NeoWrapperJsHandler
    public String getName() {
        return "pay.getUpsePayType";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "ICiKe/qe+/en9iyJIbU7587eJVB1eJzDtf0ySwZ4lbwQtauarEDOZVk5PWy9/wqADKG14aaee/uRMBwWDLbw2A==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public int jsHandlerType() {
        return 1;
    }

    @Override // com.meituan.android.neohybrid.base.jshandler.NeoWrapperJsHandler, com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler, com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0114e3e2c3c604042154d6abdd8909e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0114e3e2c3c604042154d6abdd8909e");
            return;
        }
        super.exec();
        if (jsBean() != null && jsBean().argsJson != null && jsHost() != null && jsHost().getContext() != null) {
            String optString = jsBean().argsJson.optString("action");
            Context context = jsHost().getContext();
            if (ACTION_GET_SAVED_TYPE.equals(optString)) {
                String b = b.b(context);
                startToGetSEPayInfo();
                jsCallbackResult(b, false);
                return;
            } else if (ACTION_GET_CURRENT_TYPE.equals(optString)) {
                jsCallbackResult(b.e(), true);
                return;
            } else {
                jsCallbackPayError();
                return;
            }
        }
        jsCallbackPayError();
    }

    private void startToGetSEPayInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ea77e63a497c9a9d31b7cb33b7b934d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ea77e63a497c9a9d31b7cb33b7b934d");
        } else if (b.d()) {
            b.a(com.meituan.android.paybase.config.a.d().a());
        }
    }

    private void jsCallbackResult(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "178799565aa8bbfb6fd24a44434b06d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "178799565aa8bbfb6fd24a44434b06d7");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", "success");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("upsepay_type", str);
            if (z) {
                jSONObject2.put("upsepay_status", !b.c() ? 1 : 0);
            }
            jSONObject.put("data", jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        jsCallback(jSONObject);
    }

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public Class<?> getHandlerClass() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "266bdf2f6e214f356376f8ecb6ecbea4", RobustBitConfig.DEFAULT_VALUE) ? (Class) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "266bdf2f6e214f356376f8ecb6ecbea4") : getClass();
    }
}
