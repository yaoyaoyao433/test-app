package com.dianping.titans.js.jshandler;

import android.text.TextUtils;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.sniffer.Sniffer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.knbbridge.ShowLogJsHandler;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SendSnifferLogJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1ae22b00921ad055e605a68c11be319", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1ae22b00921ad055e605a68c11be319");
            return;
        }
        JSONObject jSONObject = jsBean().argsJson;
        if (jSONObject == null) {
            jsCallbackErrorMsg("no args");
            return;
        }
        String optString = jSONObject.optString("channel");
        if (TextUtils.isEmpty(optString)) {
            jsCallbackErrorMsg("no channel");
            return;
        }
        String optString2 = jSONObject.optString("type");
        if (TextUtils.isEmpty(optString2)) {
            jsCallbackErrorMsg("no type");
            return;
        }
        int optInt = jSONObject.optInt("status", 0);
        String optString3 = jSONObject.optString(ShowLogJsHandler.PARAM_NAME_MODULE, "webview");
        if (optInt == 0) {
            Sniffer.normal(optString, optString3, optString2);
        } else {
            Sniffer.smell(optString, optString3, optString2, "", jSONObject.optString(GearsLocator.DETAIL));
        }
        jsCallback();
    }
}
