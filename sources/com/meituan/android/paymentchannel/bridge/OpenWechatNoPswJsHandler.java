package com.meituan.android.paymentchannel.bridge;

import android.app.Activity;
import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.android.paybase.common.analyse.cat.a;
import com.meituan.android.paybase.dialog.e;
import com.meituan.android.paybase.moduleinterface.FinanceJsHandler;
import com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler;
import com.meituan.android.paymentchannel.utils.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.mm.opensdk.modelbiz.OpenWebview;
import com.tencent.mm.opensdk.modelbiz.WXOpenBusinessWebview;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class OpenWechatNoPswJsHandler extends PayBaseJSHandler implements FinanceJsHandler {
    private static final String ACTION = "paybiz_pay_open_weixinNoPassword";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public String getMethodName() {
        return "pay.openWeixinNoPassword";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler, com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        OpenWebview.Req req;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f285942643701e24902fad29a3c2879d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f285942643701e24902fad29a3c2879d");
            return;
        }
        Context context = jsHost().getContext();
        String optString = jsBean().argsJson.optString("preEntrustwebId");
        String optString2 = jsBean().argsJson.optString("weixinGuideURLString");
        if (!TextUtils.isEmpty(optString)) {
            WXOpenBusinessWebview.Req req2 = new WXOpenBusinessWebview.Req();
            req2.businessType = 12;
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("pre_entrustweb_id", optString);
            req2.queryInfo = hashMap;
            req = req2;
        } else {
            OpenWebview.Req req3 = new OpenWebview.Req();
            if (!TextUtils.isEmpty(optString2)) {
                req3.url = optString2;
                req = req3;
            } else {
                jsCallbackPayError("url is null");
                req = req3;
            }
        }
        IWXAPI a = d.a(context);
        if (a != null) {
            if (a.isWXAppInstalled()) {
                a.sendReq(req);
                if (!TextUtils.isEmpty(optString2) || !TextUtils.isEmpty(optString)) {
                    a.a(ACTION, 200);
                    return;
                }
            } else {
                a.a(ACTION, -9753);
                if (context instanceof Activity) {
                    e.a((Activity) context, (Object) context.getString(R.string.paymentchannel__wechat__not_installed));
                    return;
                }
                return;
            }
        }
        a.a(ACTION, -9753);
    }

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public Class<?> getHandlerClass() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81d3130b164448370573a51aef376309", RobustBitConfig.DEFAULT_VALUE) ? (Class) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81d3130b164448370573a51aef376309") : getClass();
    }
}
