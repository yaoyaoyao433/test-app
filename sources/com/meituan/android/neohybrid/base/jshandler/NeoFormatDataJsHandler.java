package com.meituan.android.neohybrid.base.jshandler;

import android.text.TextUtils;
import com.meituan.android.neohybrid.neo.report.a;
import com.meituan.android.neohybrid.util.gson.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class NeoFormatDataJsHandler<T> extends NeoWrapperJsHandler {
    private static final String KEY_ACTION = "action";
    private static final String KEY_DATA = "data";
    private static final String KEY_ERROR = "error";
    private static final String KEY_ERROR_CODE = "error_code";
    private static final String KEY_ERROR_MESSAGE = "error_message";
    private static final String RESPONSE = "response";
    private static final String RESPONSE_STATUS = "status";
    private static final String RESPONSE_STATUS_FAIL = "fail";
    private static final String RESPONSE_STATUS_SUCC = "success";
    private static final String RESPONSE_TIMESTAMP = "timestamp";
    public static ChangeQuickRedirect changeQuickRedirect;

    public abstract void onExecute(String str, T t);

    public void onExecuteEnd(JSONObject jSONObject) {
    }

    public void onExecuteFail(int i, String str) {
    }

    public void onExecuteStart(JSONObject jSONObject) {
    }

    @Override // com.meituan.android.neohybrid.base.jshandler.NeoWrapperJsHandler, com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler, com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3238b3cd840d69ecedf5783c2f4a5be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3238b3cd840d69ecedf5783c2f4a5be");
            return;
        }
        super.exec();
        try {
            JSONObject jSONObject = jsBean().argsJson;
            onExecuteStart(jSONObject);
            if (jSONObject == null) {
                formatJsCallbackError(1000, "请求data错误");
                return;
            }
            String optString = jSONObject.optString("action");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            onExecute(optString, optJSONObject != null ? transform(optJSONObject) : null);
        } catch (Exception e) {
            formatExceptionCallback(e);
        }
    }

    public Type getType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a368dd7601877ecc4a13190eedbf7b5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Type) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a368dd7601877ecc4a13190eedbf7b5");
        }
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
            if (actualTypeArguments.length == 1) {
                return actualTypeArguments[0];
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.CharSequence, T, java.lang.String] */
    private T transform(JSONObject jSONObject) {
        Type type;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9279b45a5fb376121fa2d3d5733948ee", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9279b45a5fb376121fa2d3d5733948ee");
        }
        if (jSONObject == 0 || (type = getType()) == null) {
            return null;
        }
        if (JSONObject.class.equals(type)) {
            return jSONObject;
        }
        ?? r12 = (T) jSONObject.toString();
        if (String.class.equals(type)) {
            return r12;
        }
        if (TextUtils.isEmpty(r12)) {
            return null;
        }
        try {
            return (T) b.a().fromJson((String) r12, type);
        } catch (Exception unused) {
            return null;
        }
    }

    private void formatJsCallback(Map<String, Object> map, boolean z) {
        Object[] objArr = {map, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99d35cadcd2e2ef456f0026b33b3ea82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99d35cadcd2e2ef456f0026b33b3ea82");
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        try {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.put("status", z ? RESPONSE_STATUS_SUCC : RESPONSE_STATUS_FAIL);
            jSONObject.put("timestamp", System.currentTimeMillis());
            JSONObject put = new JSONObject().put(RESPONSE, jSONObject);
            onExecuteEnd(jSONObject);
            jsCallback(put);
        } catch (Exception unused) {
            formatExceptionCallback();
        }
    }

    public void formatJsCallbackSucc() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c2cb835f66df3236a923c85981594d1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c2cb835f66df3236a923c85981594d1d");
        } else {
            formatJsCallbackSucc(null);
        }
    }

    public void formatJsCallbackSucc(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5fca435345e21e94065634ace525064e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5fca435345e21e94065634ace525064e");
        } else {
            formatJsCallback(obj != null ? a.c("data", obj).b : null, true);
        }
    }

    private void formatJsCallbackFail(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90e216a3e3990de935040dadbb87a4b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90e216a3e3990de935040dadbb87a4b8");
        } else if (obj != null) {
            formatJsCallback(a.c("error", obj).b, false);
        } else {
            formatJsCallback(null, false);
        }
    }

    public void formatJsCallbackError(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "893a8a69e511fdcdc9cfc73507cdb4ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "893a8a69e511fdcdc9cfc73507cdb4ae");
        } else {
            formatJsCallbackFail(a.c("error_code", Integer.valueOf(i)).a(KEY_ERROR_MESSAGE, str).b);
        }
    }

    public void formatJsCallbackActionError() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e52679d9a44279fef759cb186b9bf258", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e52679d9a44279fef759cb186b9bf258");
        } else {
            formatJsCallbackError(1001, "请求action错误");
        }
    }

    public void formatJsCallbackDataError() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a2b24661678fb751cadb7af6b11f5f90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a2b24661678fb751cadb7af6b11f5f90");
        } else {
            formatJsCallbackError(1000, "请求data错误");
        }
    }

    public void formatJsCallbackParamError(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9760964d44bc557642fc3396cd75d2c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9760964d44bc557642fc3396cd75d2c9");
        } else {
            formatJsCallbackError(i, str);
        }
    }

    public void formatExceptionCallback() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9597a2e512cef23c54146503dffe4676", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9597a2e512cef23c54146503dffe4676");
        } else {
            formatExceptionCallback(null);
        }
    }

    public void formatExceptionCallback(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28c3018471d2b2fb63066b76bd6ca36d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28c3018471d2b2fb63066b76bd6ca36d");
            return;
        }
        String message = exc == null ? "未知异常" : exc.getMessage();
        onExecuteFail(2000, message);
        jsCallbackError(2000, message);
    }
}
