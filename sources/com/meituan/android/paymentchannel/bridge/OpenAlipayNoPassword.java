package com.meituan.android.paymentchannel.bridge;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.common.analyse.cat.a;
import com.meituan.android.paybase.moduleinterface.FinanceJsHandler;
import com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class OpenAlipayNoPassword extends PayBaseJSHandler implements FinanceJsHandler {
    private static final String ACTION = "paybiz_pay_open_alipaynopassword";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public String getMethodName() {
        return "pay.openAlipayNoPassword";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "EY8m7ceW5DIl2SgP/efpQtQh9Lf3swfuqtl7KdoerqP/+Fvx90fJoVWoU97Yji3OZopeLa99OEd/MHidoR6GUA==";
    }

    @Override // com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler, com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c88f5ce6532cfc3778a5a2c044391b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c88f5ce6532cfc3778a5a2c044391b6");
            return;
        }
        Activity activity = jsHost().getActivity();
        if (activity != null && jsBean() != null && jsBean().argsJson != null) {
            String optString = jsBean().argsJson.optString("alipayGuideURLString");
            if (TextUtils.isEmpty(optString)) {
                a.a(ACTION, -9753);
                String string = activity.getString(R.string.paymentchannel__alipay_no_password_sign_url_invalid);
                jsCallbackPayError(string);
                analyseOpenFailMis(optString, string);
                return;
            } else if (com.meituan.android.paymentchannel.utils.a.b(activity)) {
                try {
                    activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(optString)));
                    jsCallback();
                    com.meituan.android.paybase.common.analyse.a.a("pay_hyyn6xs6", (Map<String, Object>) null);
                    a.a(ACTION, 200);
                    return;
                } catch (Exception unused) {
                    a.a(ACTION, -9753);
                    String string2 = activity.getString(R.string.paymentchannel__alipay_no_password_sign_open_fail);
                    jsCallbackPayError(string2);
                    analyseOpenFailMis(optString, string2);
                    return;
                }
            } else {
                a.a(ACTION, -9753);
                String string3 = activity.getString(R.string.paymentchannel__alipay_no_password_sign_no_install);
                jsCallbackPayError(string3);
                analyseOpenFailMis(optString, string3);
                return;
            }
        }
        a.a(ACTION, -9753);
        jsCallbackPayError("发生异常请稍后重试");
        analyseOpenFailMis("", "发生异常请稍后重试");
    }

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public Class<?> getHandlerClass() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f3f0d227505b86d178ffa4f49e41540", RobustBitConfig.DEFAULT_VALUE) ? (Class) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f3f0d227505b86d178ffa4f49e41540") : getClass();
    }

    private void analyseOpenFailMis(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d09ebc40155d060369764f9766c0c51b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d09ebc40155d060369764f9766c0c51b");
        } else {
            com.meituan.android.paybase.common.analyse.a.a("pay_rm7ffs1r", new a.c().a("url", str).a("message", str2).b);
        }
    }
}
