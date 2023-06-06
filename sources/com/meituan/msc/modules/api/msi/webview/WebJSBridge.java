package com.meituan.msc.modules.api.msi.webview;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Keep;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.meituan.msc.modules.api.AbsApi;
import com.meituan.msc.modules.api.msi.webview.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class WebJSBridge {
    public static final String MSC_WEB_JS_BRIDGE = "WebJSBridge";
    public static ChangeQuickRedirect changeQuickRedirect;
    public Handler handler;
    private final a.C0456a mApiInvokeListener;
    public String mHtmlId;
    public int mPageId;
    private final e mWebNativeToJsBridge;

    public WebJSBridge(a.C0456a c0456a, e eVar, String str, int i) {
        Object[] objArr = {c0456a, eVar, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8457d99882a1b4cb4cf5ecf6f99c75be", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8457d99882a1b4cb4cf5ecf6f99c75be");
            return;
        }
        this.handler = new Handler(Looper.getMainLooper());
        this.mApiInvokeListener = c0456a;
        this.mWebNativeToJsBridge = eVar;
        this.mHtmlId = str;
        this.mPageId = i;
    }

    @JavascriptInterface
    public void _sendMessage(final String str) {
        this.handler.post(new Runnable() { // from class: com.meituan.msc.modules.api.msi.webview.WebJSBridge.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b458d78b7c78c423a0833c0f1d1a5a2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b458d78b7c78c423a0833c0f1d1a5a2");
                } else {
                    WebJSBridge.this._sendMessage_main(str);
                }
            }
        });
    }

    public void _sendMessage_main(String str) {
        int i = 1;
        char c = 0;
        try {
            ArrayList arrayList = (ArrayList) new Gson().fromJson(str, new TypeToken<ArrayList<String>>() { // from class: com.meituan.msc.modules.api.msi.webview.WebJSBridge.2
            }.getType());
            if (arrayList == null) {
                com.meituan.msc.modules.reporter.g.d(MSC_WEB_JS_BRIDGE, "arrayList is null");
                return;
            }
            int i2 = 0;
            while (i2 < arrayList.size()) {
                String str2 = (String) arrayList.get(i2);
                if (TextUtils.isEmpty(str2)) {
                    Object[] objArr = new Object[i];
                    objArr[c] = "eventStr is null!";
                    com.meituan.msc.modules.reporter.g.d(MSC_WEB_JS_BRIDGE, objArr);
                } else {
                    WebJSMessageEvent webJSMessageEvent = (WebJSMessageEvent) new Gson().fromJson(str2, (Class<Object>) WebJSMessageEvent.class);
                    if (webJSMessageEvent == null) {
                        Object[] objArr2 = new Object[i];
                        objArr2[c] = "messageEvent is null!";
                        com.meituan.msc.modules.reporter.g.d(MSC_WEB_JS_BRIDGE, objArr2);
                    } else {
                        String str3 = webJSMessageEvent.func;
                        final String str4 = webJSMessageEvent.callbackId;
                        String str5 = webJSMessageEvent.name;
                        if ("invokeMiniProgramAPI".equals(str3)) {
                            if ("postMessage".equals(str5)) {
                                if (this.mWebNativeToJsBridge != null) {
                                    OnWebViewPostMessageEvent onWebViewPostMessageEvent = new OnWebViewPostMessageEvent();
                                    Object obj = webJSMessageEvent.args;
                                    if (obj == null) {
                                        onWebViewPostMessageEvent.data = "";
                                    } else {
                                        onWebViewPostMessageEvent.data = obj;
                                    }
                                    onWebViewPostMessageEvent.pageId = this.mPageId;
                                    onWebViewPostMessageEvent.id = this.mHtmlId;
                                    this.mWebNativeToJsBridge.a("onWebViewPostMessage", onWebViewPostMessageEvent, this.mPageId, this.mHtmlId);
                                    return;
                                }
                                Object[] objArr3 = new Object[i];
                                objArr3[c] = "mWebNativeToJsBridge is null!";
                                com.meituan.msc.modules.reporter.g.d(MSC_WEB_JS_BRIDGE, objArr3);
                                return;
                            }
                            a.C0456a c0456a = this.mApiInvokeListener;
                            com.meituan.msi.api.c<String> cVar = new com.meituan.msi.api.c<String>() { // from class: com.meituan.msc.modules.api.msi.webview.WebJSBridge.3
                                public static ChangeQuickRedirect a;

                                @Override // com.meituan.msi.api.c
                                public final /* synthetic */ void a(String str6) {
                                    String str7 = str6;
                                    Object[] objArr4 = {str7};
                                    ChangeQuickRedirect changeQuickRedirect2 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect2, false, "16bbac8298291ca79336dd47476db888", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect2, false, "16bbac8298291ca79336dd47476db888");
                                    } else {
                                        WebJSBridge.this.callbackForWx(str4, str7);
                                    }
                                }

                                @Override // com.meituan.msi.api.c
                                public final /* synthetic */ void b(String str6) {
                                    String str7 = str6;
                                    Object[] objArr4 = {str7};
                                    ChangeQuickRedirect changeQuickRedirect2 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect2, false, "fba5b417ccd3fed6c5b7b3192b5fae4d", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect2, false, "fba5b417ccd3fed6c5b7b3192b5fae4d");
                                    } else {
                                        WebJSBridge.this.callbackForWx(str4, str7);
                                    }
                                }
                            };
                            Object[] objArr4 = new Object[2];
                            objArr4[c] = str2;
                            objArr4[i] = cVar;
                            ChangeQuickRedirect changeQuickRedirect2 = a.C0456a.a;
                            if (PatchProxy.isSupport(objArr4, c0456a, changeQuickRedirect2, false, "e67027cb36d2adf41b591534111496c5", RobustBitConfig.DEFAULT_VALUE)) {
                                String str6 = (String) PatchProxy.accessDispatch(objArr4, c0456a, changeQuickRedirect2, false, "e67027cb36d2adf41b591534111496c5");
                            } else {
                                a.this.a(str2, cVar);
                            }
                        } else {
                            JSONObject codeJson = AbsApi.codeJson(-1, "not supported");
                            if (!TextUtils.isEmpty(str5)) {
                                str3 = str5;
                            }
                            callbackForWx(str4, com.meituan.msc.modules.api.d.a(codeJson, str3, "fail"));
                        }
                    }
                }
                i2++;
                i = 1;
                c = 0;
            }
        } catch (JsonSyntaxException e) {
            com.meituan.msc.modules.reporter.g.d(MSC_WEB_JS_BRIDGE, e.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callbackForWx(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "58fd9c68a882ae30be671b8d924019ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "58fd9c68a882ae30be671b8d924019ec");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("__msg_type", "callback");
            jSONObject.put("__callback_id", str);
            jSONObject.put("__params", new JSONObject(str2));
            if (this.mWebNativeToJsBridge != null) {
                e eVar = this.mWebNativeToJsBridge;
                eVar.a("javascript:WeixinJSBridge._handleMessageFromWeixin(" + jSONObject.toString() + CommonConstant.Symbol.BRACKET_RIGHT);
            }
        } catch (JSONException e) {
            com.meituan.msc.modules.reporter.g.a("WebJSBridge callbackForWx", e);
        }
    }

    public static void dispatchEvent(String str, String str2, e eVar) {
        Object[] objArr = {str, str2, eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c716ef67ea44cba8d2278ba85c693fff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c716ef67ea44cba8d2278ba85c693fff");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("__msg_type", "event");
            jSONObject.put("__event_id", str);
            jSONObject.put("__params", new JSONObject(str2));
            if (eVar != null) {
                eVar.a("javascript:WeixinJSBridge._handleMessageFromWeixin(" + jSONObject.toString() + CommonConstant.Symbol.BRACKET_RIGHT);
            }
        } catch (JSONException e) {
            com.meituan.msc.modules.reporter.g.a("WebJSBridge dispatcherEvent", e);
        }
    }
}
