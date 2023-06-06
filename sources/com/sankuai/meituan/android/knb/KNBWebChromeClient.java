package com.sankuai.meituan.android.knb;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.support.constraint.R;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.EditText;
import com.dianping.titans.client.TitansWebChromeClient;
import com.dianping.titans.js.JsHost;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.client.WebChromeListener;
import com.sankuai.titans.protocol.bean.TitansConstants;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class KNBWebChromeClient extends TitansWebChromeClient {
    public static ChangeQuickRedirect changeQuickRedirect;
    private WebChromeListener listener;
    private WebView webView;

    public KNBWebChromeClient(JsHost jsHost) {
        super(jsHost);
        Object[] objArr = {jsHost};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c433e6623dcbffbadae4ee2d8d0f65f1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c433e6623dcbffbadae4ee2d8d0f65f1");
        }
    }

    public KNBWebChromeClient(JsHost jsHost, WebChromeListener webChromeListener) {
        this(jsHost);
        Object[] objArr = {jsHost, webChromeListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75283814151031c33c3adc792dd7f074", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75283814151031c33c3adc792dd7f074");
        } else {
            this.listener = webChromeListener;
        }
    }

    @Override // com.dianping.titans.client.TitansWebChromeClient, android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        Object[] objArr = {webView, str, str2, str3, jsPromptResult};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa0f49139dd5918f55b22315e898acd6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa0f49139dd5918f55b22315e898acd6")).booleanValue();
        }
        if (str2.startsWith(TitansConstants.JS_SCHEMA)) {
            return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }
        return processMtnbMessage(webView, str, str2, str3, jsPromptResult);
    }

    private boolean processMtnbMessage(WebView webView, String str, String str2, String str3, final JsPromptResult jsPromptResult) {
        Object[] objArr = {webView, str, str2, str3, jsPromptResult};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b3901cc42ba63a82ce3a4587687f077", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b3901cc42ba63a82ce3a4587687f077")).booleanValue();
        }
        if (handleJsPrompt(webView, str, str2, str3, jsPromptResult)) {
            jsPromptResult.confirm();
            return true;
        }
        try {
            if (this.jsHost.isActivated()) {
                final EditText editText = new EditText(webView.getContext());
                editText.setText(str3);
                new AlertDialog.Builder(this.jsHost.getActivity()).setTitle(R.string.dialog_title_tips).setMessage(str2).setView(editText).setPositiveButton(17039370, new DialogInterface.OnClickListener() { // from class: com.sankuai.meituan.android.knb.KNBWebChromeClient.2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6a0503f7a2b08b7144791620d4b1ba5d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6a0503f7a2b08b7144791620d4b1ba5d");
                        } else {
                            jsPromptResult.confirm(editText.getText().toString());
                        }
                    }
                }).setNeutralButton(17039360, new DialogInterface.OnClickListener() { // from class: com.sankuai.meituan.android.knb.KNBWebChromeClient.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c4013c10d93ae64e73acadfb465860f9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c4013c10d93ae64e73acadfb465860f9");
                        } else {
                            jsPromptResult.cancel();
                        }
                    }
                }).setCancelable(false).show();
                return true;
            }
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Object[] objArr = {webView, valueCallback, fileChooserParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "751eb466c7f07b02dfb87b80f6d94c22", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "751eb466c7f07b02dfb87b80f6d94c22")).booleanValue();
        }
        if (this.listener != null) {
            return this.listener.onShowFileChooser(valueCallback, fileChooserParams);
        }
        return false;
    }

    @Override // com.dianping.titans.client.TitansWebChromeClient, android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        Object[] objArr = {consoleMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48643f5146236c238d9e41c1fe4086ae", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48643f5146236c238d9e41c1fe4086ae")).booleanValue();
        }
        if (this.listener == null || !this.listener.onConsoleMessage(consoleMessage)) {
            return super.onConsoleMessage(consoleMessage);
        }
        return true;
    }

    public boolean handleJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        Object[] objArr = {webView, str, str2, str3, jsPromptResult};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ec7982893157462dcd78198a8ba51ee", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ec7982893157462dcd78198a8ba51ee")).booleanValue() : this.listener != null && this.listener.handleJsPrompt(webView, str, str2, str3, jsPromptResult);
    }

    public void setWebChromeListener(WebChromeListener webChromeListener) {
        this.listener = webChromeListener;
    }

    public void setWebView(WebView webView) {
        this.webView = webView;
    }
}
