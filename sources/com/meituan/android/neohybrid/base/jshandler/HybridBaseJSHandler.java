package com.meituan.android.neohybrid.base.jshandler;

import android.text.TextUtils;
import com.meituan.android.neohybrid.neo.report.a;
import com.meituan.android.neohybrid.neo.report.b;
import com.meituan.android.neohybrid.neo.report.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class HybridBaseJSHandler extends NeoWrapperJsHandler {
    protected static final String ACTION = "action";
    private static final String ALL_IN_RESPONSE = "response";
    private static final String CALLBACK_EXCEPTION = "未知错误";
    public static final int CODE_CANCEL = 12;
    public static final int CODE_ERROR = 11;
    private static final String KEY_CODE = "code";
    private static final String KEY_MESSAGE = "message";
    private static final String KEY_RESULT = "result";
    protected static final String KEY_STATUS = "status";
    private static final String KEY_TIMESTAMP = "timestamp";
    protected static final String STATUS_FAIL = "fail";
    protected static final String STATUS_SUCCESS = "success";
    public static ChangeQuickRedirect changeQuickRedirect;
    protected long bridgeEndTime;
    protected long bridgeStartTime;

    @Override // com.meituan.android.neohybrid.base.jshandler.NeoWrapperJsHandler, com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler, com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3d944de8ba7d2ac3700fc48e7f39ca7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3d944de8ba7d2ac3700fc48e7f39ca7");
            return;
        }
        super.exec();
        JSONObject jSONObject = jsBean().argsJson;
        HashMap<String, Object> hashMap = a.c("bridge_name", getName()).b;
        if (jSONObject != null) {
            this.bridgeStartTime = System.currentTimeMillis();
            hashMap.put("bridge_time", Long.valueOf(this.bridgeStartTime - jSONObject.optLong("timestamp")));
        }
        d.a(getNeoCompat(), "b_pay_neo_bridge_native_start_sc", (Map<String, Object>) hashMap);
        d.c(getNeoCompat(), "neo_bridge_native_start", hashMap);
    }

    public void jsCallbackHybridError(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5bea18be263ed671a3658031ee6fd98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5bea18be263ed671a3658031ee6fd98");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", "fail");
            jSONObject.put("errorMsg", str);
            jSONObject.put("errorCode", 11);
            jSONObject.put("timestamp", System.currentTimeMillis());
        } catch (JSONException e) {
            b.a(e, "HybridBaseJSHandler_jsCallbackHybridError", (Map<String, Object>) null);
        }
        jsCallback(jSONObject);
        HashMap<String, Object> hashMap = a.c("bridge_name", getName()).b;
        this.bridgeEndTime = System.currentTimeMillis();
        hashMap.put("status", "fail");
        hashMap.put("bridge_time", Long.valueOf(this.bridgeEndTime - this.bridgeStartTime));
        d.a(getNeoCompat(), "b_pay_neo_bridge_native_end_sc", (Map<String, Object>) hashMap);
        d.c(getNeoCompat(), "neo_bridge_native_end", hashMap);
    }

    public void jsCallbackHybridSuccess(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38208274681aeebb9de71c729dd2aac1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38208274681aeebb9de71c729dd2aac1");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", "success");
            jSONObject.put("result", obj);
            jSONObject.put("timestamp", System.currentTimeMillis());
        } catch (JSONException unused) {
            jsCallbackHybridError("error format: \"result\" or \"status\"");
        }
        jsCallback(jSONObject);
        HashMap<String, Object> hashMap = a.c("bridge_name", getName()).b;
        this.bridgeEndTime = System.currentTimeMillis();
        hashMap.put("bridge_time", Long.valueOf(this.bridgeEndTime - this.bridgeStartTime));
        d.a(getNeoCompat(), "b_pay_neo_bridge_native_end_sc", (Map<String, Object>) hashMap);
        d.c(getNeoCompat(), "neo_bridge_native_end", hashMap);
    }

    public void jsCallbackHybrid(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e45e915f50660ac70cfbe7f54d9dd44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e45e915f50660ac70cfbe7f54d9dd44");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (obj != null) {
                jSONObject.put(ALL_IN_RESPONSE, obj);
            }
            jsCallback(jSONObject);
            HashMap<String, Object> hashMap = a.c("bridge_name", getName()).b;
            this.bridgeEndTime = System.currentTimeMillis();
            hashMap.put("bridge_time", Long.valueOf(this.bridgeEndTime - this.bridgeStartTime));
            d.a(getNeoCompat(), "b_pay_neo_bridge_native_end_sc", (Map<String, Object>) hashMap);
            d.c(getNeoCompat(), "neo_bridge_native_end", hashMap);
        } catch (Exception unused) {
            jsCallbackHybridException();
        }
    }

    public void jsCallbackHybridErrorNew(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67d513c7879513803453f805309f2826", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67d513c7879513803453f805309f2826");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("message", str);
            }
            jSONObject.put("timestamp", System.currentTimeMillis());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("status", "fail");
            jSONObject2.put(ALL_IN_RESPONSE, jSONObject);
            jsCallback(jSONObject2);
            HashMap<String, Object> hashMap = a.c("bridge_name", getName()).b;
            this.bridgeEndTime = System.currentTimeMillis();
            hashMap.put("status", "fail");
            hashMap.put("bridge_time", Long.valueOf(this.bridgeEndTime - this.bridgeStartTime));
            d.a(getNeoCompat(), "b_pay_neo_bridge_native_end_sc", (Map<String, Object>) hashMap);
            d.c(getNeoCompat(), "neo_bridge_native_end", hashMap);
        } catch (Exception unused) {
            jsCallbackHybridException();
        }
    }

    private void jsCallbackHybridException() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f07a410f4672d3e69bc615e1e1ea34d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f07a410f4672d3e69bc615e1e1ea34d");
        } else {
            jsCallbackHybridError(CALLBACK_EXCEPTION);
        }
    }
}
