package com.sankuai.titans.base;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.widget.EditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.bean.TitansConstants;
import com.sankuai.titans.protocol.utils.AppUtils;
import com.sankuai.titans.protocol.utils.JsPromptResult;
import com.sankuai.titans.protocol.utils.JsResult;
import com.sankuai.titans.protocol.webcompat.IWebChromeClient;
import com.sankuai.titans.protocol.webcompat.IWebView;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WebChromeClient implements IWebChromeClient {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Activity activity;
    private final WebChromeClientListener webChromeClientListener;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface WebChromeClientListener {
        View getVideoLoadingProgressView();

        boolean isCustomViewShowing();

        boolean onConsoleMessage(ConsoleMessage consoleMessage);

        void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback);

        void onHideCustomView();

        void onJsPrompt(String str);

        @RequiresApi(api = 21)
        void onPermissionRequest(PermissionRequest permissionRequest);

        void onProgressChanged(IWebView iWebView, int i);

        void onReceivedTitle(IWebView iWebView, String str);

        void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback);

        @RequiresApi(api = 21)
        boolean onShowFileChooser(IWebView iWebView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams);

        @Deprecated
        void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2);
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebChromeClient
    @Nullable
    public Bitmap getDefaultVideoPoster() {
        return null;
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebChromeClient
    public void getVisitedHistory(ValueCallback<String[]> valueCallback) {
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebChromeClient
    public void onCloseWindow(IWebView iWebView) {
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebChromeClient
    public void onConsoleMessage(String str, int i, String str2) {
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebChromeClient
    public boolean onCreateWindow(IWebView iWebView, boolean z, boolean z2, Message message) {
        return false;
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebChromeClient
    public void onGeolocationPermissionsHidePrompt() {
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebChromeClient
    public boolean onJsBeforeUnload(IWebView iWebView, String str, String str2, JsResult jsResult) {
        return false;
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebChromeClient
    public boolean onJsTimeout() {
        return false;
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebChromeClient
    public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebChromeClient
    public void onReceivedIcon(IWebView iWebView, Bitmap bitmap) {
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebChromeClient
    public void onReceivedTouchIconUrl(IWebView iWebView, String str, boolean z) {
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebChromeClient
    public void onRequestFocus(IWebView iWebView) {
    }

    public WebChromeClient(@NonNull Activity activity, @NonNull WebChromeClientListener webChromeClientListener) {
        Object[] objArr = {activity, webChromeClientListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad03bc4dd6c5cd811c8567d8c79661ce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad03bc4dd6c5cd811c8567d8c79661ce");
            return;
        }
        this.webChromeClientListener = webChromeClientListener;
        this.activity = activity;
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebChromeClient
    public void onProgressChanged(IWebView iWebView, int i) {
        Object[] objArr = {iWebView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5f4ade16d3ae9415eba5c03dc268937", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5f4ade16d3ae9415eba5c03dc268937");
        } else {
            this.webChromeClientListener.onProgressChanged(iWebView, i);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebChromeClient
    public void onReceivedTitle(IWebView iWebView, String str) {
        Object[] objArr = {iWebView, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0178cb4b0c934cf5a56b1b78e949628e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0178cb4b0c934cf5a56b1b78e949628e");
            return;
        }
        String url = iWebView.getUrl();
        if (TextUtils.isEmpty(url) || !url.contains(str) || str.length() <= 20) {
            this.webChromeClientListener.onReceivedTitle(iWebView, str);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        Object[] objArr = {view, customViewCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac90450fd80d58f79a4d0d31779b9149", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac90450fd80d58f79a4d0d31779b9149");
        } else {
            this.webChromeClientListener.onShowCustomView(view, customViewCallback);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebChromeClient
    public void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        Object[] objArr = {view, Integer.valueOf(i), customViewCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3bcfb1240929137ce9cb24fa5efbd3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3bcfb1240929137ce9cb24fa5efbd3e");
        } else {
            System.out.println("");
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebChromeClient
    public void onHideCustomView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d227f603bc76453b2d94b7aa1a64f94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d227f603bc76453b2d94b7aa1a64f94");
        } else {
            this.webChromeClientListener.onHideCustomView();
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebChromeClient
    public boolean onJsAlert(IWebView iWebView, String str, String str2, final JsResult jsResult) {
        Object[] objArr = {iWebView, str, str2, jsResult};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b89e8609c92b08bec02b05a885203e53", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b89e8609c92b08bec02b05a885203e53")).booleanValue();
        }
        if (!AppUtils.isActivityAlive(this.activity)) {
            jsResult.cancel();
            return true;
        }
        Context applicationContext = this.activity.getApplicationContext();
        AlertDialog.Builder builder = new AlertDialog.Builder(this.activity);
        builder.setTitle(applicationContext.getString(R.string.titans_reminder)).setMessage(str2).setPositiveButton(applicationContext.getString(R.string.titans_sure), new DialogInterface.OnClickListener() { // from class: com.sankuai.titans.base.WebChromeClient.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a8ca0759786a2a284a99b9699be4031c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a8ca0759786a2a284a99b9699be4031c");
                } else {
                    jsResult.confirm();
                }
            }
        });
        builder.setCancelable(false);
        try {
            builder.show();
        } catch (Exception e) {
            Titans.serviceManager().getStatisticsService().reportClassError("WebChromeClient", "onJsAlert", e);
        }
        return true;
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebChromeClient
    public boolean onJsConfirm(IWebView iWebView, String str, String str2, final JsResult jsResult) {
        Object[] objArr = {iWebView, str, str2, jsResult};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "302baf34fb051a4e384377b2a9e99f73", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "302baf34fb051a4e384377b2a9e99f73")).booleanValue();
        }
        if (!AppUtils.isActivityAlive(this.activity)) {
            jsResult.cancel();
            return true;
        }
        Context applicationContext = this.activity.getApplicationContext();
        AlertDialog.Builder builder = new AlertDialog.Builder(this.activity);
        builder.setTitle(applicationContext.getString(R.string.titans_reminder)).setMessage(str2).setPositiveButton(applicationContext.getString(R.string.titans_sure), new DialogInterface.OnClickListener() { // from class: com.sankuai.titans.base.WebChromeClient.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d832b558f16b3081bc49d7bd86c1d9e7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d832b558f16b3081bc49d7bd86c1d9e7");
                } else {
                    jsResult.confirm();
                }
            }
        }).setNegativeButton(applicationContext.getString(R.string.titans_cancel), new DialogInterface.OnClickListener() { // from class: com.sankuai.titans.base.WebChromeClient.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "625f3fed83556a90a2134b7ef1c0fce3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "625f3fed83556a90a2134b7ef1c0fce3");
                } else {
                    jsResult.cancel();
                }
            }
        }).setCancelable(false);
        try {
            builder.show();
        } catch (Exception e) {
            Titans.serviceManager().getStatisticsService().reportClassError("WebChromeClient", "onJsConfirm", e);
        }
        return true;
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebChromeClient
    public boolean onJsPrompt(IWebView iWebView, String str, String str2, String str3, final JsPromptResult jsPromptResult) {
        Object[] objArr = {iWebView, str, str2, str3, jsPromptResult};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "998fbaec3c68be113f019b148bca1f7d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "998fbaec3c68be113f019b148bca1f7d")).booleanValue();
        }
        if (str2.startsWith(TitansConstants.JS_SCHEMA)) {
            this.webChromeClientListener.onJsPrompt(str2);
            jsPromptResult.cancel();
            return true;
        } else if (!AppUtils.isActivityAlive(this.activity)) {
            jsPromptResult.cancel();
            return true;
        } else {
            final EditText editText = new EditText(this.activity);
            editText.setText(str3);
            try {
                new AlertDialog.Builder(this.activity).setTitle(R.string.titans_dialog_title_tips).setMessage(str2).setView(editText).setPositiveButton(17039370, new DialogInterface.OnClickListener() { // from class: com.sankuai.titans.base.WebChromeClient.5
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d494a76052ce2600b9af05ea80607f4a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d494a76052ce2600b9af05ea80607f4a");
                        } else {
                            jsPromptResult.confirm(editText.getText().toString());
                        }
                    }
                }).setNeutralButton(17039360, new DialogInterface.OnClickListener() { // from class: com.sankuai.titans.base.WebChromeClient.4
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "73d7c52527a4baa8e2a4fbe36ad24c28", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "73d7c52527a4baa8e2a4fbe36ad24c28");
                        } else {
                            jsPromptResult.cancel();
                        }
                    }
                }).setCancelable(false).show();
            } catch (Throwable th) {
                Titans.serviceManager().getStatisticsService().reportClassError("WebChromeClient", "onJsPrompt", th);
            }
            return true;
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebChromeClient
    @Deprecated
    public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        Object[] objArr = {str, str2, new Long(j), new Long(j2), new Long(j3), quotaUpdater};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "97aa3690a880fbc4e0e763fdadd19054", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "97aa3690a880fbc4e0e763fdadd19054");
        } else {
            quotaUpdater.updateQuota(j2 * 2);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebChromeClient
    @Deprecated
    public void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
        Object[] objArr = {new Long(j), new Long(j2), quotaUpdater};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "690df60ad117de7ab43e068582701a1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "690df60ad117de7ab43e068582701a1f");
        } else {
            quotaUpdater.updateQuota(j * 2);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        Object[] objArr = {str, callback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b93445b546ac4a14f178ec83dcb2b4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b93445b546ac4a14f178ec83dcb2b4d");
        } else {
            this.webChromeClientListener.onGeolocationPermissionsShowPrompt(str, callback);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebChromeClient
    @RequiresApi(api = 21)
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        Object[] objArr = {permissionRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "25ca84800e46edbc5d386543f0f39f9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "25ca84800e46edbc5d386543f0f39f9b");
        } else {
            this.webChromeClientListener.onPermissionRequest(permissionRequest);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        Object[] objArr = {consoleMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b47efe4de885f64bcf63d7bdde5a7a06", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b47efe4de885f64bcf63d7bdde5a7a06")).booleanValue() : this.webChromeClientListener.onConsoleMessage(consoleMessage);
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebChromeClient
    @Nullable
    public View getVideoLoadingProgressView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aace93bc1dfd67e9b83673d4ba30aa79", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aace93bc1dfd67e9b83673d4ba30aa79") : this.webChromeClientListener.getVideoLoadingProgressView();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebChromeClient
    @Deprecated
    public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        Object[] objArr = {valueCallback, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "482b465139ef83b91a4fcaf89b2468d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "482b465139ef83b91a4fcaf89b2468d7");
        } else {
            this.webChromeClientListener.openFileChooser(valueCallback, str, str2);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebChromeClient
    @RequiresApi(api = 21)
    public boolean onShowFileChooser(IWebView iWebView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Object[] objArr = {iWebView, valueCallback, fileChooserParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b888e4cf105431b2a3c9314cbb4c3e6f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b888e4cf105431b2a3c9314cbb4c3e6f")).booleanValue() : this.webChromeClientListener.onShowFileChooser(iWebView, valueCallback, fileChooserParams);
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebChromeClient
    public boolean isCustomViewShowing() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a5ee8178dfebd4d69b507ea5c7dc7d2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a5ee8178dfebd4d69b507ea5c7dc7d2")).booleanValue() : this.webChromeClientListener.isCustomViewShowing();
    }
}
