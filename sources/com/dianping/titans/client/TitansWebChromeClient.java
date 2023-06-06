package com.dianping.titans.client;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.support.constraint.R;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import com.dianping.titans.js.JsHandlerFactory;
import com.dianping.titans.js.JsHost;
import com.dianping.titans.js.KNBJsHost;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.dianping.titans.js.jshandler.JsHandler;
import com.dianping.titans.js.jshandler.JsHandlerReportImpl;
import com.dianping.titans.js.jshandler.JsHandlerReportStrategy;
import com.dianping.titans.js.jshandler.JsHandlerVerifyImpl;
import com.dianping.titans.js.jshandler.JsHandlerVerifyStrategy;
import com.dianping.titans.ui.ITitleBar;
import com.dianping.titans.utils.TitansReporter;
import com.dianping.titans.utils.ViewUtils;
import com.dianping.titans.widget.LineTitleLayout;
import com.meituan.msi.metrics.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBConfig;
import com.sankuai.meituan.android.knb.KNBWebManager;
import com.sankuai.meituan.android.knb.listener.OnProgressChangeListener;
import com.sankuai.meituan.android.knb.util.UIUtil;
import com.sankuai.titans.protocol.bean.TitansConstants;
import java.util.Collections;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class TitansWebChromeClient extends WebChromeClient {
    private static final String KNB_NO_ROTATE = "KNBNoRotate";
    private static final String TAG = "TitansWebChromeClient";
    public static ChangeQuickRedirect changeQuickRedirect;
    private JsHandlerReportStrategy jsHandlerReportStrategy;
    private JsHandlerVerifyStrategy jsHandlerVerifyStrategy;
    protected JsHost jsHost;
    public View mCustomView;
    private WebChromeClient.CustomViewCallback mCustomViewCallback;
    private OnProgressChangeListener onProgressChangeListener;
    private boolean shouldShowActionbar;

    public TitansWebChromeClient(JsHost jsHost) {
        Object[] objArr = {jsHost};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed5e701fcb72498ff0720269113f5ca1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed5e701fcb72498ff0720269113f5ca1");
            return;
        }
        this.shouldShowActionbar = false;
        this.jsHost = jsHost;
        this.jsHandlerReportStrategy = new JsHandlerReportImpl(KNBConfig.getStringListConfig(KNBConfig.CONFIG_REPORT_QUERY, Collections.EMPTY_LIST));
        this.jsHandlerVerifyStrategy = new JsHandlerVerifyImpl(KNBConfig.getStringListConfig(KNBConfig.CONFIG_BRIDGE_GREEN, Collections.emptyList()), KNBConfig.getStringListConfig(KNBConfig.CONFIG_ACCESS_WHITE, KNBConfig.DEFAULT_WHITE_LIST), KNBWebManager.getEnvironment().getKNBAppId(), KNBWebManager.showDebugUrl());
    }

    public void setOnProgressChangeListener(OnProgressChangeListener onProgressChangeListener) {
        this.onProgressChangeListener = onProgressChangeListener;
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        Object[] objArr = {webView, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f73babb8bc769d0ce5f89b3102950b50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f73babb8bc769d0ce5f89b3102950b50");
            return;
        }
        String url = webView.getUrl();
        if (TextUtils.isEmpty(url) || !url.contains(str) || str.length() <= 20) {
            this.jsHost.onWebViewTitleReceived(str);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        Object[] objArr = {webView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48b9ecfa3ff3b08e4ce1faaaf8cabd68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48b9ecfa3ff3b08e4ce1faaaf8cabd68");
            return;
        }
        super.onProgressChanged(webView, i);
        LineTitleLayout dynamicTitleBar = this.jsHost instanceof KNBJsHost ? ((KNBJsHost) this.jsHost).getDynamicTitleBar() : null;
        if (dynamicTitleBar != null) {
            dynamicTitleBar.setProgress(i);
            if (i >= 100) {
                dynamicTitleBar.setProgressVisible(false);
            }
        } else {
            ITitleBar titleBarHost = this.jsHost.getTitleBarHost();
            if (titleBarHost != null) {
                titleBarHost.setProgress(i);
            }
        }
        if (this.onProgressChangeListener != null) {
            this.onProgressChangeListener.onProgressChanged(i);
        }
    }

    @Override // android.webkit.WebChromeClient
    public View getVideoLoadingProgressView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b97daacc44a4608c8956269d8b77b0cf", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b97daacc44a4608c8956269d8b77b0cf") : LayoutInflater.from(this.jsHost.getContext()).inflate(R.layout.knb_loading_item, (ViewGroup) null);
    }

    private void handleNoRotate(Activity activity, String str, boolean z) {
        Object[] objArr = {activity, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b5a7c65454ebea18acec87756b81785", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b5a7c65454ebea18acec87756b81785");
        } else if (str == null || "1".equals(Uri.parse(str).getQueryParameter(KNB_NO_ROTATE))) {
        } else {
            if (z) {
                activity.setRequestedOrientation(0);
            } else {
                activity.setRequestedOrientation(1);
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        Object[] objArr = {view, customViewCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c4789937a017a32659db5a7f4c6cf01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c4789937a017a32659db5a7f4c6cf01");
        } else if (this.mCustomView != null) {
            customViewCallback.onCustomViewHidden();
        } else {
            this.mCustomView = view;
            this.mCustomViewCallback = customViewCallback;
            ViewUtils.hideView(this.jsHost.getLayWeb(), true);
            if (this.jsHost.getLayVideo() != null) {
                if (this.jsHost.getLayVideo().getChildCount() > 0) {
                    this.jsHost.getLayVideo().removeAllViews();
                }
                this.jsHost.getLayVideo().addView(this.mCustomView);
            }
            ViewUtils.showView(this.jsHost.getLayVideo());
            Activity activity = this.jsHost.getActivity();
            if (activity == null) {
                return;
            }
            if (activity instanceof AppCompatActivity) {
                AppCompatActivity appCompatActivity = (AppCompatActivity) activity;
                if (appCompatActivity.getSupportActionBar() != null && appCompatActivity.getSupportActionBar().d()) {
                    this.shouldShowActionbar = true;
                    appCompatActivity.getSupportActionBar().c();
                    handleNoRotate(activity, this.jsHost.getUrl(), true);
                    activity.getWindow().setFlags(1024, 1024);
                }
            }
            this.shouldShowActionbar = false;
            handleNoRotate(activity, this.jsHost.getUrl(), true);
            activity.getWindow().setFlags(1024, 1024);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cfc0d8baa04fa49876db6a34c2ff3284", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cfc0d8baa04fa49876db6a34c2ff3284");
            return;
        }
        ViewUtils.showView(this.jsHost.getLayWeb());
        if (this.mCustomView == null) {
            return;
        }
        this.mCustomView = null;
        ViewUtils.hideView(this.jsHost.getLayVideo(), true);
        this.mCustomViewCallback.onCustomViewHidden();
        Activity activity = this.jsHost.getActivity();
        if (activity == null) {
            return;
        }
        if ((activity instanceof AppCompatActivity) && this.shouldShowActionbar) {
            ((AppCompatActivity) activity).getSupportActionBar().b();
        }
        handleNoRotate(activity, this.jsHost.getUrl(), false);
        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
        attributes.flags &= -1025;
        activity.getWindow().setAttributes(attributes);
    }

    @Override // android.webkit.WebChromeClient
    public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        Object[] objArr = {str, str2, new Long(j), new Long(j2), new Long(j3), quotaUpdater};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eabc5f1387b43282df0c86eba8b483a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eabc5f1387b43282df0c86eba8b483a3");
            return;
        }
        if (this.jsHost.isDebug()) {
            UIUtil.showShortToast(this.jsHost.getActivity(), "onExceededDatabaseQuota");
        }
        quotaUpdater.updateQuota(2 * j2);
    }

    @Override // android.webkit.WebChromeClient
    public void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
        Object[] objArr = {new Long(j), new Long(j2), quotaUpdater};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "011705047d37afdfc410bfc7c7e0e275", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "011705047d37afdfc410bfc7c7e0e275");
            return;
        }
        if (this.jsHost.isDebug()) {
            UIUtil.showShortToast(this.jsHost.getActivity(), "onReachedMaxAppCacheSize");
        }
        quotaUpdater.updateQuota(j * 2);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, final JsResult jsResult) {
        Object[] objArr = {webView, str, str2, jsResult};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "784e2770387f6646e2daf159d4b1029b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "784e2770387f6646e2daf159d4b1029b")).booleanValue();
        }
        if (!this.jsHost.isActivated()) {
            jsResult.cancel();
            return true;
        }
        Activity activity = this.jsHost.getActivity();
        if (activity == null) {
            return true;
        }
        Context applicationContext = activity.getApplicationContext();
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(applicationContext.getString(R.string.knb_reminder)).setMessage(str2).setPositiveButton(applicationContext.getString(R.string.knb_sure), new DialogInterface.OnClickListener() { // from class: com.dianping.titans.client.TitansWebChromeClient.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e33c2b62ca06eb38f2452561b279f75e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e33c2b62ca06eb38f2452561b279f75e");
                } else {
                    jsResult.confirm();
                }
            }
        });
        builder.setCancelable(false);
        try {
            builder.show();
        } catch (Exception unused) {
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d A[SYNTHETIC] */
    @Override // android.webkit.WebChromeClient
    @android.support.annotation.RequiresApi(21)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPermissionRequest(final android.webkit.PermissionRequest r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.dianping.titans.client.TitansWebChromeClient.changeQuickRedirect
            java.lang.String r11 = "83faca35fd53e884717907afbcfee792"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            return
        L1b:
            com.dianping.titans.js.JsHost r1 = r12.jsHost
            boolean r1 = r1.isActivated()
            if (r1 != 0) goto L27
            super.onPermissionRequest(r13)
            return
        L27:
            com.dianping.titans.js.JsHost r1 = r12.jsHost
            android.app.Activity r1 = r1.getActivity()
            if (r1 != 0) goto L33
            super.onPermissionRequest(r13)
            return
        L33:
            java.lang.String[] r2 = r13.getResources()
            if (r2 == 0) goto Lb5
            int r2 = r2.length
            if (r2 != 0) goto L3e
            goto Lb5
        L3e:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String[] r4 = r13.getResources()
            int r5 = r4.length
            r6 = 0
        L4e:
            if (r6 >= r5) goto La0
            r7 = r4[r6]
            if (r7 == 0) goto L9d
            r8 = -1
            int r10 = r7.hashCode()
            r11 = -1660821873(0xffffffff9d01de8f, float:-1.7188068E-21)
            if (r10 == r11) goto L7d
            r11 = 968612586(0x39bbdaea, float:3.5830523E-4)
            if (r10 == r11) goto L73
            r11 = 1233677653(0x49886d55, float:1117610.6)
            if (r10 == r11) goto L69
            goto L87
        L69:
            java.lang.String r10 = "android.webkit.resource.MIDI_SYSEX"
            boolean r7 = r7.equals(r10)
            if (r7 == 0) goto L87
            r7 = 2
            goto L88
        L73:
            java.lang.String r10 = "android.webkit.resource.AUDIO_CAPTURE"
            boolean r7 = r7.equals(r10)
            if (r7 == 0) goto L87
            r7 = 1
            goto L88
        L7d:
            java.lang.String r10 = "android.webkit.resource.VIDEO_CAPTURE"
            boolean r7 = r7.equals(r10)
            if (r7 == 0) goto L87
            r7 = 0
            goto L88
        L87:
            r7 = -1
        L88:
            switch(r7) {
                case 0: goto L98;
                case 1: goto L92;
                case 2: goto L8c;
                default: goto L8b;
            }
        L8b:
            goto L9d
        L8c:
            java.lang.String r7 = "android.permission.BIND_MIDI_DEVICE_SERVICE"
            r3.add(r7)
            goto L9d
        L92:
            java.lang.String r7 = "Microphone"
            r2.add(r7)
            goto L9d
        L98:
            java.lang.String r7 = "Camera"
            r2.add(r7)
        L9d:
            int r6 = r6 + 1
            goto L4e
        La0:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Laa
            super.onPermissionRequest(r13)
            return
        Laa:
            java.lang.String r0 = "pt-572df3720da87bef"
            com.dianping.titans.client.TitansWebChromeClient$2 r4 = new com.dianping.titans.client.TitansWebChromeClient$2
            r4.<init>()
            com.sankuai.titans.result.TitansPermissionUtil.requestPermissions(r1, r2, r0, r4)
            return
        Lb5:
            super.onPermissionRequest(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.titans.client.TitansWebChromeClient.onPermissionRequest(android.webkit.PermissionRequest):void");
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, final JsResult jsResult) {
        Object[] objArr = {webView, str, str2, jsResult};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c8e18eb12e3d8d193f7e2612daa7027f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c8e18eb12e3d8d193f7e2612daa7027f")).booleanValue();
        }
        if (!this.jsHost.isActivated()) {
            jsResult.cancel();
            return true;
        }
        Activity activity = this.jsHost.getActivity();
        if (activity == null) {
            return true;
        }
        Context applicationContext = activity.getApplicationContext();
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(applicationContext.getString(R.string.knb_reminder)).setMessage(str2).setPositiveButton(applicationContext.getString(R.string.knb_sure), new DialogInterface.OnClickListener() { // from class: com.dianping.titans.client.TitansWebChromeClient.4
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "33380c6b4a5697ebea8789da49d4cd2a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "33380c6b4a5697ebea8789da49d4cd2a");
                } else {
                    jsResult.confirm();
                }
            }
        }).setNegativeButton(applicationContext.getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: com.dianping.titans.client.TitansWebChromeClient.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "005e398d3b2117fd0422d84eadf245f4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "005e398d3b2117fd0422d84eadf245f4");
                } else {
                    jsResult.cancel();
                }
            }
        });
        builder.setCancelable(false);
        try {
            builder.show();
        } catch (Exception unused) {
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(final String str, final GeolocationPermissions.Callback callback) {
        Activity activity;
        Object[] objArr = {str, callback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a050bb2f52a5d11af8e47abcb934da4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a050bb2f52a5d11af8e47abcb934da4");
        } else if (this.jsHost.isActivated() && (activity = this.jsHost.getActivity()) != null) {
            Context applicationContext = activity.getApplicationContext();
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setTitle(applicationContext.getString(R.string.knb_reminder));
            builder.setMessage(String.format(applicationContext.getString(R.string.knb_whether_access_location), str));
            builder.setPositiveButton(applicationContext.getString(R.string.knb_allow), new DialogInterface.OnClickListener() { // from class: com.dianping.titans.client.TitansWebChromeClient.5
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a0310acb499aba973238a7c66d969865", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a0310acb499aba973238a7c66d969865");
                    } else {
                        callback.invoke(str, true, false);
                    }
                }
            });
            builder.setNegativeButton(applicationContext.getString(R.string.knb_not_allow), new DialogInterface.OnClickListener() { // from class: com.dianping.titans.client.TitansWebChromeClient.6
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "30ae5b762bad9d9e84d04eb6d240de4b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "30ae5b762bad9d9e84d04eb6d240de4b");
                    } else {
                        callback.invoke(str, false, false);
                    }
                }
            });
            builder.setCancelable(true);
            try {
                builder.show();
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        Object[] objArr = {webView, str, str2, str3, jsPromptResult};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d20b6f70b55f016a43c8eb7c9382fc13", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d20b6f70b55f016a43c8eb7c9382fc13")).booleanValue();
        }
        if (str2.startsWith(TitansConstants.JS_SCHEMA)) {
            TitansReporter.reportException("on_js_prompt", webView.getOriginalUrl(), new Exception("使用了onJsPrompt的方式调用桥"));
            JsHandler createJsHandler = JsHandlerFactory.createJsHandler(this.jsHost, str2);
            if (createJsHandler != null) {
                if (createJsHandler.jsBean().argsJson == null) {
                    if (!TextUtils.isEmpty(createJsHandler.jsBean().callbackId) && (createJsHandler instanceof BaseJsHandler)) {
                        ((BaseJsHandler) createJsHandler).jsCallbackErrorMsg("argsJson is null in " + str2 + " at " + str);
                        jsPromptResult.cancel();
                        return true;
                    }
                    createJsHandler.jsBean().argsJson = new JSONObject();
                }
                createJsHandler.setJsHandlerVerifyStrategy(this.jsHandlerVerifyStrategy);
                createJsHandler.setJsHandlerReportStrategy(this.jsHandlerReportStrategy);
                createJsHandler.doExec();
                this.jsHost.putJsHandler(createJsHandler);
                jsPromptResult.cancel();
                b.a aVar = new b.a();
                aVar.b = b.EnumC0496b.TITANS;
                aVar.c = "titans";
                aVar.d = createJsHandler.jsBean().method;
                b.a(aVar.a(false));
                return true;
            }
        }
        return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        Object[] objArr = {consoleMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7fbe784bc7836068b496ee10cd3bff07", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7fbe784bc7836068b496ee10cd3bff07")).booleanValue() : super.onConsoleMessage(consoleMessage);
    }
}
