package com.meituan.android.quickpass.uptsm.web;

import android.text.TextUtils;
import android.util.Log;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.android.quickpass.uptsm.common.utils.h;
import com.meituan.android.quickpass.uptsm.constant.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class TSMBaseJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77f500323bce2ef1913efd15ba57911f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77f500323bce2ef1913efd15ba57911f");
        } else {
            b.b = jsHost().getContext().getApplicationContext();
        }
    }

    public void jsCallBack(int i, int i2, String str, JSONObject jSONObject) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "464bcaa29634fd2ed915e001e6b41f39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "464bcaa29634fd2ed915e001e6b41f39");
            return;
        }
        h.b("TSMBaseJsHandler.jsCallBack:\tmethod:" + i + "\tcode:" + i2 + "\tmsg:" + str + "\tjson:" + jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("method", i);
            jSONObject2.put("status", "success");
            jSONObject2.put("code", i2);
            if (!TextUtils.isEmpty(str)) {
                jSONObject2.put("msg", str);
            }
            if (jSONObject != null) {
                jSONObject2.put("data", jSONObject);
            }
        } catch (JSONException e) {
            h.b(Log.getStackTraceString(e));
        }
        jsCallback(jSONObject2);
    }

    public void jsCallBackError(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a6f06a1b6616b7b1fa3b573b2ecad16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a6f06a1b6616b7b1fa3b573b2ecad16");
        } else {
            jsCallBackError(i, (String) null, str);
        }
    }

    public void jsCallBackError(int i, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53a27e69d0830d68412f5e76ff10f118", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53a27e69d0830d68412f5e76ff10f118");
            return;
        }
        h.b("TSMBaseJsHandler.jsCallBackError:\tcode:" + i + "\terrorCode:" + str + "\terrorMsg:" + str2);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", "fail");
            jSONObject.put("code", i);
            if (str != null) {
                jSONObject.put("errorCode", str);
            }
            jSONObject.put("msg", str2);
        } catch (JSONException e) {
            h.b(Log.getStackTraceString(e));
        }
        jsCallback(jSONObject);
    }

    public void jsCallBackError(int i, String str, JSONObject jSONObject) {
        Object[] objArr = {Integer.valueOf(i), str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a86a2e1c752d721ae983829057dbe6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a86a2e1c752d721ae983829057dbe6c");
            return;
        }
        h.b("TSMBaseJsHandler.jsCallBackError:\tcode:" + i + "\terrorCode:" + str + "\terrorMsg:" + jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("status", "fail");
            jSONObject2.put("code", i);
            if (str != null) {
                jSONObject2.put("errorCode", str);
            }
            jSONObject2.put("msg", jSONObject);
        } catch (JSONException e) {
            h.b(Log.getStackTraceString(e));
        }
        jsCallback(jSONObject2);
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    @Deprecated
    public void jsCallback() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "367202208b3f09f968f7829b21386e8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "367202208b3f09f968f7829b21386e8b");
        } else {
            super.jsCallback();
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    @Deprecated
    public void jsCallback(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e373c498d4e2555ea715aab809a4a88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e373c498d4e2555ea715aab809a4a88");
        } else {
            super.jsCallback(str);
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    @Deprecated
    public void jsCallback(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "55e040e51a5be8fa68b00f53769ec528", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "55e040e51a5be8fa68b00f53769ec528");
        } else {
            super.jsCallback(jSONObject);
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    @Deprecated
    public void jsCallbackError(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65d6d37a8a0220372fcc3f46724bb1c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65d6d37a8a0220372fcc3f46724bb1c7");
        } else {
            super.jsCallbackError(i, str);
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    @Deprecated
    public void jsCallbackErrorMsg(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3de3a35bd10f7e82e00980cf38c32660", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3de3a35bd10f7e82e00980cf38c32660");
        } else {
            super.jsCallbackErrorMsg(str);
        }
    }
}
