package com.meituan.android.neohybrid.base.jshandler;

import android.support.constraint.R;
import android.text.TextUtils;
import android.webkit.WebView;
import com.dianping.titans.js.JsBean;
import com.dianping.titans.js.JsHost;
import com.meituan.android.neohybrid.core.a;
import com.meituan.android.neohybrid.neo.report.c;
import com.meituan.android.neohybrid.neo.report.d;
import com.meituan.android.neohybrid.util.g;
import com.meituan.android.paybase.utils.ae;
import com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.bean.KNBJsErrorInfo;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class NeoWrapperJsHandler extends PayBaseJSHandler {
    public static ChangeQuickRedirect changeQuickRedirect;
    private NeoWrapperJsHandler calledJsHandler;
    private JsBean jsBean;
    private JSONObject jsParamJson;

    public abstract String getName();

    public a getNeoCompat() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57cd28c85115deacab3739d247f07629", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57cd28c85115deacab3739d247f07629");
        }
        WebView webView = jsHost().getWebView();
        if (webView != null) {
            return (a) webView.getTag(R.id.neo_compat);
        }
        return null;
    }

    @Override // com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler, com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void jsCallback(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6822507d1487f9ba782326650b377f2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6822507d1487f9ba782326650b377f2e");
            return;
        }
        JSONObject reportNeoKnbNativeEnd = reportNeoKnbNativeEnd(jSONObject);
        if (this.calledJsHandler != null) {
            this.jsParamJson = reportNeoKnbNativeEnd;
        } else {
            super.jsCallback(reportNeoKnbNativeEnd);
        }
    }

    @Override // com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler, com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void jsCallback() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3816eb83b4e7e705fd90ab9a2ff6b0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3816eb83b4e7e705fd90ab9a2ff6b0b");
        } else {
            jsCallback(new JSONObject());
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void jsCallbackError(KNBJsErrorInfo kNBJsErrorInfo) {
        Object[] objArr = {kNBJsErrorInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e5e9214dc26e6e5705a209d3bf44738", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e5e9214dc26e6e5705a209d3bf44738");
        } else {
            jsCallbackError(kNBJsErrorInfo.getErrorCode(), kNBJsErrorInfo.getErrorMsg());
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void jsCallbackError(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2456c82eed7bd96e3280a530946a605a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2456c82eed7bd96e3280a530946a605a");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", "fail");
            jSONObject.put("errorCode", i);
            jSONObject.put("errMsg", str);
        } catch (JSONException e) {
            c.a("NeoWrapperJsHandler", e.getMessage());
        }
        jsCallback(jSONObject);
    }

    public static JSONObject execNewJsHandler(NeoWrapperJsHandler neoWrapperJsHandler, Class<? extends NeoWrapperJsHandler> cls, JSONObject jSONObject) {
        NeoWrapperJsHandler neoWrapperJsHandler2;
        Object[] objArr = {neoWrapperJsHandler, cls, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c091a0280f36ade9216b136f6b66e53d", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c091a0280f36ade9216b136f6b66e53d");
        }
        if (neoWrapperJsHandler == null || cls == null || jSONObject == null || (neoWrapperJsHandler2 = (NeoWrapperJsHandler) g.d(cls)) == null) {
            return null;
        }
        neoWrapperJsHandler2.calledJsHandler = neoWrapperJsHandler;
        JsBean jsBean = new JsBean();
        jsBean.argsJson = jSONObject;
        neoWrapperJsHandler2.jsBean = jsBean;
        neoWrapperJsHandler2.exec();
        return neoWrapperJsHandler2.jsParamJson;
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public JsBean jsBean() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db41d1fc5b53cdf9f1e062e338413c2b", RobustBitConfig.DEFAULT_VALUE) ? (JsBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db41d1fc5b53cdf9f1e062e338413c2b") : this.calledJsHandler == null ? super.jsBean() : this.jsBean;
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public JsHost jsHost() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a171b9d36f1d4e58e89caedf36dbe48f", RobustBitConfig.DEFAULT_VALUE) ? (JsHost) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a171b9d36f1d4e58e89caedf36dbe48f") : this.calledJsHandler == null ? super.jsHost() : this.calledJsHandler.jsHost();
    }

    @Override // com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler, com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "238b7c0ebee7a529c1fda2c9c2162339", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "238b7c0ebee7a529c1fda2c9c2162339");
            return;
        }
        reportNeoKnbNativeStart();
        a neoCompat = getNeoCompat();
        if (neoCompat != null) {
            neoCompat.a(getName(), jsBean().argsJson);
        }
    }

    public void reportNeoKnbNativeStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad1686af1acb9da022ad0b76969b9b13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad1686af1acb9da022ad0b76969b9b13");
            return;
        }
        JSONObject optJSONObject = jsBean().argsJson.optJSONObject("statData");
        if (TextUtils.isEmpty(getName()) || optJSONObject == null || TextUtils.isEmpty(jsHost().getUrl())) {
            return;
        }
        this.nativeStartTimeStamp = System.currentTimeMillis();
        long optLong = this.nativeStartTimeStamp - optJSONObject.optLong("web_start_time_stamp");
        this.payBridgeUniqueId = optJSONObject.optString("pay_bridge_unique_id");
        HashMap<String, Object> a = com.meituan.android.paybase.webview.jshandler.a.a(getName(), com.meituan.android.paybase.webview.jshandler.a.a(jsHost().getUrl()), optLong, this.payBridgeUniqueId);
        d.a(getNeoCompat(), "b_pay_common_bridge_native_start_sc", ae.b, a);
        d.c(getNeoCompat(), "paybiz_common_bridge_native_start", a);
    }

    public JSONObject reportNeoKnbNativeEnd(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de6293067e1e2fd4b127f5db1d43b0e7", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de6293067e1e2fd4b127f5db1d43b0e7");
        }
        if (TextUtils.isEmpty(getName()) || this.nativeStartTimeStamp == 0 || TextUtils.isEmpty(this.payBridgeUniqueId) || TextUtils.isEmpty(jsHost().getUrl())) {
            return jSONObject;
        }
        long currentTimeMillis = System.currentTimeMillis();
        HashMap<String, Object> a = com.meituan.android.paybase.webview.jshandler.a.a(getName(), com.meituan.android.paybase.webview.jshandler.a.a(jsHost().getUrl()), currentTimeMillis - this.nativeStartTimeStamp, this.payBridgeUniqueId);
        d.a(getNeoCompat(), "b_pay_common_bridge_native_end_sc", ae.b, a);
        d.c(getNeoCompat(), "paybiz_common_bridge_native_end", a);
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("pay_bridge_unique_id", this.payBridgeUniqueId);
            jSONObject2.put("native_end_time_stamp", currentTimeMillis);
            jSONObject.put("statData", jSONObject2);
        } catch (JSONException e) {
            com.meituan.android.paybase.common.analyse.cat.a.a("NeoWrapperJsHandler_reportNeoKnbNativeEnd_error", e.getMessage());
        }
        return jSONObject;
    }
}
