package com.dianping.titans.js.jshandler;

import android.text.TextUtils;
import com.dianping.titans.js.JsHandlerFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class CheckVersionJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a85ce050558f9e21ff70f90caaa69d85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a85ce050558f9e21ff70f90caaa69d85");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONArray jSONArray = jsBean().argsJson.getJSONArray("apis");
            if (jSONArray != null && jSONArray.length() > 0) {
                JSONObject jSONObject3 = new JSONObject();
                for (int i = 0; i < jSONArray.length(); i++) {
                    String string = jSONArray.getString(i);
                    String registerJsHandlerName = JsHandlerFactory.getRegisterJsHandlerName(string);
                    if (!TextUtils.isEmpty(registerJsHandlerName) && !Object.class.getName().equals(registerJsHandlerName)) {
                        try {
                            BaseJsHandler baseJsHandler = (BaseJsHandler) jsHost().getContext().getClassLoader().loadClass(registerJsHandlerName).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                            jSONObject3.put(string, baseJsHandler.isApiSupported() ? baseJsHandler.getApiVersion() : "0");
                        } catch (Exception unused) {
                            jSONObject3.put(string, "0");
                        }
                    } else {
                        jSONObject3.put(string, "0");
                    }
                }
                jSONObject2.put("infos", jSONObject3);
            }
            jSONObject.put("data", jSONObject2);
            if (jSONObject.getJSONObject("data") != null) {
                if (jSONObject.getJSONObject("data").has("infos")) {
                    jsCallback(jSONObject);
                    return;
                } else {
                    jsCallbackErrorMsg("apis is null.");
                    return;
                }
            }
            jsCallbackErrorMsg("parse data failed.");
        } catch (JSONException unused2) {
        }
    }
}
