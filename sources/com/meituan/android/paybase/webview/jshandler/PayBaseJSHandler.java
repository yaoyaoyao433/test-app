package com.meituan.android.paybase.webview.jshandler;

import android.text.TextUtils;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.android.paybase.utils.ae;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class PayBaseJSHandler extends BaseJsHandler {
    public static final int CODE_CANCEL = 12;
    public static final int CODE_ERROR = 11;
    public static ChangeQuickRedirect changeQuickRedirect;
    public long nativeStartTimeStamp;
    public String payBridgeUniqueId;

    public void jsCallbackPayError(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ecba881abd12b08a6724273dbba7de9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ecba881abd12b08a6724273dbba7de9");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", "fail");
            jSONObject.put("errorMsg", str);
            jSONObject.put("errorCode", i);
        } catch (JSONException e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "PayBaseJSHandler_jsCallbackPayError", (Map<String, Object>) null);
        }
        jsCallback(jSONObject);
    }

    public void jsCallbackPayError(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7aa46e065febd464fda72a23311f66e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7aa46e065febd464fda72a23311f66e0");
        } else {
            jsCallbackPayError(str, 0);
        }
    }

    public void jsCallbackPayError(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6b5fccdd1b56f3f0a5207ae0dd351a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6b5fccdd1b56f3f0a5207ae0dd351a9");
        } else {
            jsCallbackPayError("", i);
        }
    }

    public void jsCallbackPayError() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06d1639dc1f89bf3227c24914950c766", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06d1639dc1f89bf3227c24914950c766");
        } else {
            jsCallbackPayError("", 0);
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1558e7a6e5e165799245070459d16687", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1558e7a6e5e165799245070459d16687");
        } else {
            reportKnbNativeStart();
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void jsCallback(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7fa3a2ccf41fe03c422702748462a6af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7fa3a2ccf41fe03c422702748462a6af");
        } else {
            super.jsCallback(reportKnbNativeEnd(jSONObject));
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void jsCallback() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be5b1e951afa8460957f79f1f28845bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be5b1e951afa8460957f79f1f28845bd");
        } else {
            jsCallback(new JSONObject());
        }
    }

    public String getBridgeName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2da4f5db219f5925df0e2007f18d919", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2da4f5db219f5925df0e2007f18d919") : getClass().getName();
    }

    public void reportKnbNativeStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "befeb62a32d79889c374a5fa20a91430", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "befeb62a32d79889c374a5fa20a91430");
            return;
        }
        JSONObject optJSONObject = jsBean().argsJson.optJSONObject("statData");
        if (TextUtils.equals(getBridgeName(), getClass().getName()) || optJSONObject == null || TextUtils.isEmpty(jsHost().getUrl())) {
            return;
        }
        this.nativeStartTimeStamp = System.currentTimeMillis();
        long optLong = this.nativeStartTimeStamp - optJSONObject.optLong("web_start_time_stamp");
        this.payBridgeUniqueId = optJSONObject.optString("pay_bridge_unique_id");
        HashMap<String, Object> a = a.a(getBridgeName(), a.a(jsHost().getUrl()), optLong, this.payBridgeUniqueId);
        ae.a(null, "b_pay_common_bridge_native_start_sc", a, ae.b, null, true);
        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_common_bridge_native_start", a, null, null);
    }

    public JSONObject reportKnbNativeEnd(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "031ad3d9bec521902ba6129fc04177ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "031ad3d9bec521902ba6129fc04177ff");
        }
        if (TextUtils.equals(getBridgeName(), getClass().getName()) || this.nativeStartTimeStamp == 0 || TextUtils.isEmpty(this.payBridgeUniqueId) || TextUtils.isEmpty(jsHost().getUrl())) {
            return jSONObject;
        }
        long currentTimeMillis = System.currentTimeMillis();
        HashMap<String, Object> a = a.a(getBridgeName(), a.a(jsHost().getUrl()), currentTimeMillis - this.nativeStartTimeStamp, this.payBridgeUniqueId);
        ae.a(null, "b_pay_common_bridge_native_end_sc", a, ae.b, null, true);
        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_common_bridge_native_end", a, null, null);
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("pay_bridge_unique_id", this.payBridgeUniqueId);
            jSONObject2.put("native_end_time_stamp", currentTimeMillis);
            jSONObject.put("statData", jSONObject2);
        } catch (JSONException e) {
            com.meituan.android.paybase.common.analyse.cat.a.a("PayBaseJSHandler_reportKnbBridgeNativeEnd_error", e.getMessage());
        }
        return jSONObject;
    }
}
