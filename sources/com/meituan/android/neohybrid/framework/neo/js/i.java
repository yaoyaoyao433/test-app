package com.meituan.android.neohybrid.framework.neo.js;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.support.constraint.R;
import android.text.TextUtils;
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
/* loaded from: classes2.dex */
public final class i extends TitansWebChromeClient {
    public static ChangeQuickRedirect a;
    private WebChromeListener b;

    public i(JsHost jsHost) {
        super(jsHost);
        Object[] objArr = {jsHost};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c75d432f9f22e67bbc2f340d7d8c30f4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c75d432f9f22e67bbc2f340d7d8c30f4");
        }
    }

    @Override // com.dianping.titans.client.TitansWebChromeClient, android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        Object[] objArr = {webView, str, str2, str3, jsPromptResult};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4fafb8d58c84be9e78a74005ad046fd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4fafb8d58c84be9e78a74005ad046fd")).booleanValue();
        }
        if (str2.startsWith(TitansConstants.JS_SCHEMA)) {
            return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }
        return a(webView, str, str2, str3, jsPromptResult);
    }

    @Override // com.dianping.titans.client.TitansWebChromeClient, android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        Object[] objArr = {webView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1176187a754bd2021fbad46e20cd4ad9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1176187a754bd2021fbad46e20cd4ad9");
            return;
        }
        String url = webView.getUrl();
        if (TextUtils.isEmpty(url) || !url.contains(str) || str.length() <= 20) {
            this.jsHost.onWebViewTitleReceived(str);
        }
    }

    private boolean a(WebView webView, String str, String str2, String str3, final JsPromptResult jsPromptResult) {
        boolean z;
        Object[] objArr = {webView, str, str2, str3, jsPromptResult};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b95cc10f221df10595859dc81c3e7ac", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b95cc10f221df10595859dc81c3e7ac")).booleanValue();
        }
        Object[] objArr2 = {webView, str, str2, str3, jsPromptResult};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f6b19df21723e0b8bbf9254dae5133f0", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f6b19df21723e0b8bbf9254dae5133f0")).booleanValue();
        } else {
            z = this.b != null && this.b.handleJsPrompt(webView, str, str2, str3, jsPromptResult);
        }
        if (z) {
            jsPromptResult.confirm();
            return true;
        }
        try {
            if (this.jsHost.isActivated()) {
                final EditText editText = new EditText(webView.getContext());
                editText.setText(str3);
                new AlertDialog.Builder(this.jsHost.getActivity()).setTitle(R.string.dialog_title_tips).setMessage(str2).setView(editText).setPositiveButton(17039370, new DialogInterface.OnClickListener() { // from class: com.meituan.android.neohybrid.framework.neo.js.i.2
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        Object[] objArr3 = {dialogInterface, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c376a4a822aaf513fb7b3ddea648462a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c376a4a822aaf513fb7b3ddea648462a");
                        } else {
                            jsPromptResult.confirm(editText.getText().toString());
                        }
                    }
                }).setNeutralButton(17039360, new DialogInterface.OnClickListener() { // from class: com.meituan.android.neohybrid.framework.neo.js.i.1
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        Object[] objArr3 = {dialogInterface, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "36833ce1b2224b2c3eb67a2eb600a4dc", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "36833ce1b2224b2c3eb67a2eb600a4dc");
                        } else {
                            jsPromptResult.cancel();
                        }
                    }
                }).setCancelable(false).show();
            }
        } catch (Throwable unused) {
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Object[] objArr = {webView, valueCallback, fileChooserParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3188d0a89f6dc8f93ada094008b9959b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3188d0a89f6dc8f93ada094008b9959b")).booleanValue();
        }
        if (this.b != null) {
            return this.b.onShowFileChooser(valueCallback, fileChooserParams);
        }
        return false;
    }

    @Override // com.dianping.titans.client.TitansWebChromeClient, android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        Object[] objArr = {consoleMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aca4de165a897a4634570526bd13e688", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aca4de165a897a4634570526bd13e688")).booleanValue();
        }
        if (this.b == null || !this.b.onConsoleMessage(consoleMessage)) {
            return super.onConsoleMessage(consoleMessage);
        }
        return true;
    }
}
