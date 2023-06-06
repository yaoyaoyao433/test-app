package com.meituan.mmp.lib.api.web;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Keep;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.meituan.mmp.lib.api.AbsApi;
import com.meituan.mmp.lib.api.InternalApi;
import com.meituan.mmp.lib.api.ServiceApi;
import com.meituan.mmp.lib.api.j;
import com.meituan.mmp.lib.model.Event;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class WebJSBridge {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final String[] service_apis = {"getLocation", "scanCode"};
    private final com.meituan.mmp.lib.api.h apisManager;
    private final JSONObject data;
    public Handler handler;
    private final com.meituan.mmp.lib.interfaces.c mListener;
    private final b webNative2JsBridge;

    public WebJSBridge(com.meituan.mmp.lib.api.h hVar, b bVar, JSONObject jSONObject, com.meituan.mmp.lib.interfaces.c cVar) {
        Object[] objArr = {hVar, bVar, jSONObject, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "253cb123b5b29f39965872d7bb9d2cd6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "253cb123b5b29f39965872d7bb9d2cd6");
            return;
        }
        this.handler = new Handler(Looper.getMainLooper());
        this.apisManager = hVar;
        this.webNative2JsBridge = bVar;
        this.data = jSONObject;
        this.mListener = cVar;
    }

    @JavascriptInterface
    public void _sendMessage(final String str) {
        this.handler.post(new Runnable() { // from class: com.meituan.mmp.lib.api.web.WebJSBridge.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "deecc985ab0b25bc9233fe56def27873", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "deecc985ab0b25bc9233fe56def27873");
                } else {
                    WebJSBridge.this._sendMessage_main(str);
                }
            }
        });
    }

    public void _sendMessage_main(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = new JSONObject(jSONArray.getString(i));
                String optString = jSONObject.optString("func");
                String optString2 = jSONObject.optString("__callback_id");
                JSONObject optJSONObject = jSONObject.optJSONObject("params");
                String optString3 = optJSONObject != null ? optJSONObject.optString("name") : null;
                if (optJSONObject != null && "invokeMiniProgramAPI".equals(optString)) {
                    if ("postMessage".equals(optString3)) {
                        int optInt = this.data.optInt("__mmp__viewId", 0);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("id", this.data.optString("htmlId"));
                        Object opt = optJSONObject.opt("arg");
                        if (opt == null) {
                            jSONObject2.put("data", "");
                        } else {
                            jSONObject2.put("data", opt);
                        }
                        if (this.mListener != null) {
                            this.mListener.a("onWebViewPostMessage", jSONObject2, optInt);
                            return;
                        }
                        return;
                    }
                    Event event = new Event(optString3, optJSONObject.optString("arg", ""), optString2);
                    if (validApi(event)) {
                        this.apisManager.a(event, new com.meituan.mmp.lib.interfaces.a() { // from class: com.meituan.mmp.lib.api.web.WebJSBridge.2
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.mmp.lib.interfaces.a
                            public final void a(String str2) {
                            }

                            @Override // com.meituan.mmp.lib.interfaces.a
                            public final void a(String str2, String str3, String str4) {
                                Object[] objArr = {str2, str3, str4};
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e92b979bb42168a8f0a0e19c94c47d3", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e92b979bb42168a8f0a0e19c94c47d3");
                                } else {
                                    WebJSBridge.this.callbackForWx(str3, str4);
                                }
                            }
                        });
                    } else {
                        JSONObject codeJson = AbsApi.codeJson(-1, "not supported");
                        if (!TextUtils.isEmpty(optString3)) {
                            optString = optString3;
                        }
                        callbackForWx(optString2, j.a(codeJson, optString, "fail"));
                    }
                } else {
                    JSONObject codeJson2 = AbsApi.codeJson(-1, "not supported");
                    if (!TextUtils.isEmpty(optString3)) {
                        optString = optString3;
                    }
                    callbackForWx(optString2, j.a(codeJson2, optString, "fail"));
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
            com.meituan.mmp.lib.trace.b.a("WebJSBrigde _sendMessage_main", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callbackForWx(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52a349ba56950243096523c1c8af16ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52a349ba56950243096523c1c8af16ef");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("__msg_type", "callback");
            jSONObject.put("__callback_id", str);
            jSONObject.put("__params", new JSONObject(str2));
            if (this.webNative2JsBridge != null) {
                b bVar = this.webNative2JsBridge;
                bVar.a("javascript:WeixinJSBridge._handleMessageFromWeixin(" + jSONObject.toString() + CommonConstant.Symbol.BRACKET_RIGHT);
            }
        } catch (JSONException e) {
            com.meituan.mmp.lib.trace.b.a("WebJSBrigde callbackForWx", e);
        }
    }

    public static void dispatcherEvent(String str, String str2, b bVar) {
        Object[] objArr = {str, str2, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5c59d7e583faa2ee3b145cc61793638b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5c59d7e583faa2ee3b145cc61793638b");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("__msg_type", "event");
            jSONObject.put("__event_id", str);
            jSONObject.put("__params", new JSONObject(str2));
            if (bVar != null) {
                bVar.a("javascript:WeixinJSBridge._handleMessageFromWeixin(" + jSONObject.toString() + CommonConstant.Symbol.BRACKET_RIGHT);
            }
        } catch (JSONException e) {
            com.meituan.mmp.lib.trace.b.a("WebJSBrigde dispatcherEvent", e);
        }
    }

    private boolean validApi(Event event) {
        InternalApi a;
        Object[] objArr = {event};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "567bec44396c910326d3e375dc4770f4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "567bec44396c910326d3e375dc4770f4")).booleanValue();
        }
        String str = event.b;
        if ("custom_invoke_UI".equals(str)) {
            try {
                str = event.a().getString("name");
            } catch (JSONException e) {
                com.meituan.mmp.lib.trace.b.a("WebJSBrigde", e);
                return false;
            }
        }
        InternalApi internalApi = null;
        if (this.apisManager != null) {
            com.meituan.mmp.lib.api.h hVar = this.apisManager;
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.mmp.lib.api.h.a;
            if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect3, false, "82317814354ff7349a76ab71bb1af74d", RobustBitConfig.DEFAULT_VALUE)) {
                a = (InternalApi) PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect3, false, "82317814354ff7349a76ab71bb1af74d");
            } else if (hVar.f != null) {
                a = hVar.f.a(str);
            }
            internalApi = a;
        }
        if (internalApi instanceof ServiceApi) {
            if (service_apis != null && service_apis.length > 0) {
                for (String str2 : service_apis) {
                    if (str2.equals(str)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
}
