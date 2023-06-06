package com.sankuai.waimai.business.knb.handlers;

import android.content.Intent;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.platform.capacity.pay.a;
import com.sankuai.waimai.platform.utils.f;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PayForWMVIPHandler extends TakeoutBaseJsHandler {
    private static final int REQUEST_CODE_START_PAY = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mNativeToastStr;
    private long mPayHandlerResultCode;
    private String mRedirectUrl;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "UsM6Ew6pEBztM0ufq0fCuUj1ioqdxwl9anlfDwAhR0wHVjAQ7gyMXzsc73omVS8gv6+IxlS/47/pv6emT4Gciw==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c9b675e449443a10ef51e625cb461aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c9b675e449443a10ef51e625cb461aa");
        } else if (validateArgs()) {
            JSONObject jSONObject = jsBean().argsJson;
            String optString = jSONObject.optString("pay_trade_no");
            String optString2 = jSONObject.optString("pay_token");
            this.mRedirectUrl = jSONObject.optString("redirect_url");
            this.mNativeToastStr = jSONObject.optString("native_toast");
            this.mPayHandlerResultCode = jSONObject.optLong("code");
            a.a(jsHost().getActivity(), 1, optString, optString2);
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "401188e827606b16ad7172347b0c77e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "401188e827606b16ad7172347b0c77e3");
        } else if (i == 1) {
            if (i2 == -1) {
                if (intent != null && f.a(intent, "result", -1) == 1) {
                    payStatusCallback("success");
                    if (!TextUtils.isEmpty(this.mNativeToastStr)) {
                        ae.a(jsHost().getContext(), this.mNativeToastStr);
                    }
                    if (this.mPayHandlerResultCode == 0) {
                        jsHost().finish();
                        return;
                    } else {
                        jsHost().loadUrl(this.mRedirectUrl);
                        return;
                    }
                }
                payStatusCallback("fail");
                return;
            }
            payStatusCallback("cancel");
        }
    }

    private void payStatusCallback(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "151c4c5da8df297610a350afe88428ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "151c4c5da8df297610a350afe88428ed");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", str);
        } catch (JSONException e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
        jsCallback(jSONObject);
    }
}
