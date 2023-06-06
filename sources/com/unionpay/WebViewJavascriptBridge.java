package com.unionpay;

import android.app.Activity;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.titans.protocol.bean.TitansConstants;
import com.unionpay.tsmservice.data.Constant;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class WebViewJavascriptBridge implements Serializable {
    ac _messageHandler;
    Map _messageHandlers = new HashMap();
    Map _responseCallbacks = new HashMap();
    long _uniqueId = 0;
    Activity mContext;
    WebView mWebView;

    public WebViewJavascriptBridge(Activity activity, WebView webView, ac acVar) {
        this.mContext = activity;
        this.mWebView = webView;
        this._messageHandler = acVar;
        WebSettings settings = this.mWebView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setAllowFileAccess(false);
        this.mWebView.addJavascriptInterface(this, "_WebViewJavascriptBridge");
        this.mWebView.setWebViewClient(new ab(this, (byte) 0));
        this.mWebView.setWebChromeClient(new aa(this, (byte) 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _callbackJs(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("responseId", str);
        hashMap.put(Constant.KEY_RESPONSE_DATA, str2);
        _dispatchMessage(hashMap);
    }

    private void _dispatchMessage(Map map) {
        String jSONObject = new JSONObject(map).toString();
        com.unionpay.utils.j.a("test", "sending:".concat(String.valueOf(jSONObject)));
        this.mContext.runOnUiThread(new y(this, String.format("javascript:WebViewJavascriptBridge._handleMessageFromJava('%s');", doubleEscapeString(jSONObject))));
    }

    private void _sendData(String str, ad adVar, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("data", str);
        if (adVar != null) {
            StringBuilder sb = new StringBuilder("java_cb_");
            long j = this._uniqueId + 1;
            this._uniqueId = j;
            sb.append(j);
            String sb2 = sb.toString();
            this._responseCallbacks.put(sb2, adVar);
            hashMap.put("callbackId", sb2);
        }
        if (str2 != null) {
            hashMap.put("handlerName", str2);
        }
        _dispatchMessage(hashMap);
    }

    public static String convertStreamToString(InputStream inputStream) {
        String str;
        str = "";
        try {
            Scanner useDelimiter = new Scanner(inputStream, "UTF-8").useDelimiter("\\A");
            str = useDelimiter.hasNext() ? useDelimiter.next() : "";
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    private String doubleEscapeString(String str) {
        return str.replace(CommonConstant.Symbol.SLASH_RIGHT, "\\\\").replace(CommonConstant.Symbol.DOUBLE_QUOTES, "\\\"").replace(CommonConstant.Symbol.SINGLE_QUOTES, "\\'").replace("\n", "\\n").replace("\r", "\\r").replace("\f", "\\f");
    }

    private void loadWebViewJavascriptBridgeJs(WebView webView) {
        webView.loadUrl(TitansConstants.JAVASCRIPT_PREFIX.concat(String.valueOf(convertStreamToString(getClass().getResourceAsStream("res/webviewjavascriptbridge.js")))));
    }

    @JavascriptInterface
    public void _handleMessageFromJs(String str, String str2, String str3, String str4, String str5) {
        ac acVar;
        if (str2 != null) {
            ((ad) this._responseCallbacks.get(str2)).a(str3);
            this._responseCallbacks.remove(str2);
            return;
        }
        z zVar = str4 != null ? new z(this, str4) : null;
        if (str5 != null) {
            acVar = (ac) this._messageHandlers.get(str5);
            if (acVar == null) {
                com.unionpay.utils.j.b("test", "WVJB Warning: No handler for ".concat(String.valueOf(str5)));
                return;
            }
        } else {
            acVar = this._messageHandler;
        }
        try {
            this.mContext.runOnUiThread(new x(this, acVar, str, zVar));
        } catch (Exception e) {
            com.unionpay.utils.j.b("test", "WebViewJavascriptBridge: WARNING: java handler threw. " + e.getMessage());
        }
    }

    public void callHandler(String str) {
        callHandler(str, null, null);
    }

    public void callHandler(String str, String str2) {
        callHandler(str, str2, null);
    }

    public void callHandler(String str, String str2, ad adVar) {
        _sendData(str2, adVar, str);
    }

    public void registerHandler(String str, ac acVar) {
        this._messageHandlers.put(str, acVar);
    }

    public void send(String str) {
        send(str, null);
    }

    public void send(String str, ad adVar) {
        _sendData(str, adVar, null);
    }
}
