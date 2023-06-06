package com.sankuai.meituan.android.knb;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dianping.titans.js.KNBJsHost;
import com.dianping.titans.js.jshandler.JsHandler;
import com.dianping.titans.ui.NavigateBarHost;
import com.dianping.titans.ui.TitansUIManager;
import com.dianping.titans.widget.BaseTitleBar;
import com.dianping.titans.widget.TitansWebView;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.listener.OnAnalyzeParamsListener;
import com.sankuai.meituan.android.knb.listener.OnAppendUAListener;
import com.sankuai.meituan.android.knb.listener.OnCommonShareListener;
import com.sankuai.meituan.android.knb.listener.OnFavoriteListener;
import com.sankuai.meituan.android.knb.listener.OnFilterTouchListener;
import com.sankuai.meituan.android.knb.listener.OnFinishHandler;
import com.sankuai.meituan.android.knb.listener.OnFinishListener;
import com.sankuai.meituan.android.knb.listener.OnHiddenListener;
import com.sankuai.meituan.android.knb.listener.OnInflateTitleBarListener;
import com.sankuai.meituan.android.knb.listener.OnLoadingListener;
import com.sankuai.meituan.android.knb.listener.OnLoginListener;
import com.sankuai.meituan.android.knb.listener.OnMGERedirectUrlListener;
import com.sankuai.meituan.android.knb.listener.OnMessageReceiveListener;
import com.sankuai.meituan.android.knb.listener.OnProgressChangeListener;
import com.sankuai.meituan.android.knb.listener.OnWebChromeClientListener;
import com.sankuai.meituan.android.knb.listener.OnWebClientListener;
import com.sankuai.meituan.android.knb.listener.OnWebViewInitFailedListener;
import com.sankuai.meituan.android.knb.util.UIUtil;
import com.sankuai.meituan.android.knb.util.UriUtil;
import com.sankuai.titans.EventReporter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class KNBWebCompatDelegate implements KNBJsHost, NavigateBarHost {
    public static final short TRIPLE_SWITCHER_NONE = 0;
    public static final short TRIPLE_SWITCHER_OFF = 2;
    public static final short TRIPLE_SWITCHER_ON = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    protected boolean acceptThirdPartyCookies;
    protected boolean autoInflateTitleBar;
    protected boolean autoSetCookiesAfterViewCreated;
    protected WebChromeClient.FileChooserParams fileChooserParams;
    protected OnInflateTitleBarListener inflateTitleBarListener;
    public String innerURLKey;
    public short isAllowFileAccess;
    public short isAllowFileAccessFromFileURLs;
    public short isAllowUniversalAccessFromFileURLs;
    protected IKnbActivityHandler mActivityHandler;
    @Deprecated
    public OnAnalyzeParamsListener mAnalyzeParamsListener;
    protected Bundle mArguments;
    @Deprecated
    public OnCommonShareListener mCommonShareListener;
    protected Context mContext;
    protected TitansUIManager mDefaultTitansUIManager;
    @Deprecated
    public OnFavoriteListener mFavoriteListener;
    protected Map<String, String> mHeaders;
    protected boolean mIsBtnCloseDisable;
    protected boolean mIsBtnCloseShow;
    protected boolean mIsNoTitleBar;
    protected final Map<String, JsHandler> mJsHandlerMap;
    @Deprecated
    public View.OnClickListener mLLButtonClickListener;
    protected FrameLayout mLayMask;
    protected BaseTitleBar mLayTitle;
    protected FrameLayout mLayVideo;
    protected LinearLayout mLayWeb;
    @Deprecated
    public OnLoginListener mLoginListener;
    @Deprecated
    public OnMGERedirectUrlListener mMgeRedirectUrlListener;
    protected KNBWebChromeClient mNovaEfteWebChromeClient;
    protected KNBWebViewClient mNovaEftedWebViewClient;
    public OnAppendUAListener mOnAppendUAListener;
    @Deprecated
    public OnFilterTouchListener mOnFilterTouchListener;
    public OnHiddenListener mOnHiddenListener;
    public OnLoadingListener mOnLoadingListener;
    protected boolean mOnScroll;
    public OnWebChromeClientListener mOnWebChromeClientListener;
    public OnWebClientListener mOnWebClientListener;
    protected ArrayList<OnMessageReceiveListener> mReceiveListenerList;
    protected View mRootView;
    protected final Map<String, JsHandler> mSubscribeJsHandlerMap;
    protected TitansUIManager mTitansUIManager;
    protected String mTitle;
    protected ImageView mTitleShadow;
    protected TextView mTvUrl;
    protected ValueCallback<Uri[]> mUploadCallbackAboveL;
    protected ValueCallback<Uri> mUploadMessage;
    protected String mUrl;
    protected WebView mWebView;
    protected OnFinishHandler onFinishHandler;
    protected OnFinishListener onFinishListener;
    public OnProgressChangeListener onProgressChangeListener;
    public OnWebViewInitFailedListener onWebViewInitFailedListener;
    public String prefixURL;
    public boolean showTitleBarOnReceivedError;

    public void appear() {
    }

    public void disappear() {
    }

    public abstract Bitmap getCaptureWebview();

    public int getNavigatorLayoutId() {
        return R.layout.knb_web_navi_bar;
    }

    public int getWebLayoutId() {
        return R.layout.knb_web_webview;
    }

    public void handleUri(Uri uri) {
    }

    public abstract void onActivityHandlerSettled();

    public abstract void onActivityResult(int i, int i2, Intent intent);

    public abstract void onBackPressed();

    public abstract boolean onConsoleMessage(ConsoleMessage consoleMessage);

    public abstract void onCreate();

    public abstract View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public abstract void onCreated(Bundle bundle);

    public abstract void onDestroy();

    public abstract void onPause();

    public abstract void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr);

    public abstract void onResume();

    public void onSaveInstanceState(Bundle bundle) {
    }

    public abstract void onStart();

    public abstract void onStop();

    public abstract boolean onViewCreated(View view);

    public void reportOnPageFinished(String str) {
    }

    public void reportOnPageStarted(String str) {
    }

    public void reportOnReceivedError(String str) {
    }

    public abstract void setArguments(Bundle bundle);

    public abstract void setBackgroundColorForCurrentCompact(int i);

    public String wrapUrl(String str) {
        return str;
    }

    public KNBWebCompatDelegate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c717a172c0478bc94f34c8771cadda3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c717a172c0478bc94f34c8771cadda3");
            return;
        }
        this.mIsBtnCloseDisable = false;
        this.showTitleBarOnReceivedError = true;
        this.acceptThirdPartyCookies = true;
        this.autoSetCookiesAfterViewCreated = true;
        this.autoInflateTitleBar = true;
        this.innerURLKey = "url";
        this.mReceiveListenerList = new ArrayList<>();
        this.mJsHandlerMap = new ConcurrentHashMap();
        this.mSubscribeJsHandlerMap = new ConcurrentHashMap();
        this.isAllowUniversalAccessFromFileURLs = (short) 0;
        this.isAllowFileAccessFromFileURLs = (short) 0;
        this.isAllowFileAccess = (short) 0;
    }

    public void setOnFinishListener(OnFinishListener onFinishListener) {
        this.onFinishListener = onFinishListener;
    }

    public void setOnFinishHandler(OnFinishHandler onFinishHandler) {
        this.onFinishHandler = onFinishHandler;
    }

    public static KNBWebCompatDelegate create(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7ed915a0141ae5fec71d94784fc35b7b", RobustBitConfig.DEFAULT_VALUE)) {
            return (KNBWebCompatDelegate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7ed915a0141ae5fec71d94784fc35b7b");
        }
        return create(context, context instanceof Activity ? new KnbActivityHandler((Activity) context) : null, i);
    }

    public static KNBWebCompatDelegate create(Context context, IKnbActivityHandler iKnbActivityHandler, int i) {
        Object[] objArr = {context, iKnbActivityHandler, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f8d440dc7046d26fb17043673d7ddf1c", RobustBitConfig.DEFAULT_VALUE)) {
            return (KNBWebCompatDelegate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f8d440dc7046d26fb17043673d7ddf1c");
        }
        if (context == null) {
            return null;
        }
        switch (i) {
            case 0:
                return new KNBWebCompatDelegateImpl(context, iKnbActivityHandler);
            case 1:
            case 2:
                return new KNBWebCompatDelegateV2Impl(context, iKnbActivityHandler);
            case 3:
                return new KNBWebCompatDelegatePreloadImpl(context, iKnbActivityHandler);
            default:
                return new KNBWebCompatDelegateImpl(context, iKnbActivityHandler);
        }
    }

    public void setActivityHandler(IKnbActivityHandler iKnbActivityHandler) {
        Object[] objArr = {iKnbActivityHandler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05c00aa28b701649a09e9683f483b4c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05c00aa28b701649a09e9683f483b4c3");
        } else if (this.mActivityHandler == iKnbActivityHandler || iKnbActivityHandler == null) {
        } else {
            this.mActivityHandler = iKnbActivityHandler;
            onActivityHandlerSettled();
        }
    }

    public void setOnWebViewInitFailedListener(OnWebViewInitFailedListener onWebViewInitFailedListener) {
        this.onWebViewInitFailedListener = onWebViewInitFailedListener;
    }

    @Deprecated
    public void setOnFavoriteListener(OnFavoriteListener onFavoriteListener) {
        this.mFavoriteListener = onFavoriteListener;
    }

    @Deprecated
    public void setOnCommonShareListener(OnCommonShareListener onCommonShareListener) {
        this.mCommonShareListener = onCommonShareListener;
    }

    @Deprecated
    public void setOnMgeRedircetListener(OnMGERedirectUrlListener onMGERedirectUrlListener) {
        this.mMgeRedirectUrlListener = onMGERedirectUrlListener;
    }

    public void setOnAnalyzeParamsListener(OnAnalyzeParamsListener onAnalyzeParamsListener) {
        this.mAnalyzeParamsListener = onAnalyzeParamsListener;
    }

    public void setOnLoginListener(OnLoginListener onLoginListener) {
        this.mLoginListener = onLoginListener;
    }

    public void setOnHiddenListener(OnHiddenListener onHiddenListener) {
        this.mOnHiddenListener = onHiddenListener;
    }

    public void setOnWebViewClientListener(OnWebClientListener onWebClientListener) {
        this.mOnWebClientListener = onWebClientListener;
    }

    public void setOnWebChromeClientListener(OnWebChromeClientListener onWebChromeClientListener) {
        this.mOnWebChromeClientListener = onWebChromeClientListener;
    }

    public void setOnLoadingListener(OnLoadingListener onLoadingListener) {
        this.mOnLoadingListener = onLoadingListener;
    }

    public void setOnAppendUAListener(OnAppendUAListener onAppendUAListener) {
        this.mOnAppendUAListener = onAppendUAListener;
    }

    public void setOnProgressChangeListener(OnProgressChangeListener onProgressChangeListener) {
        this.onProgressChangeListener = onProgressChangeListener;
    }

    public void setHeaders(Map<String, String> map) {
        this.mHeaders = map;
    }

    @Deprecated
    public void setOnFilterTouchListener(OnFilterTouchListener onFilterTouchListener) {
        Object[] objArr = {onFilterTouchListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4e0c201d2cc808a4cccb521c973d864", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4e0c201d2cc808a4cccb521c973d864");
            return;
        }
        this.mOnFilterTouchListener = onFilterTouchListener;
        filterTouchEvent();
    }

    public void setAcceptThirdPartyCookies(boolean z) {
        this.acceptThirdPartyCookies = z;
    }

    @Override // com.dianping.titans.js.JsHost
    public String getVersionName() {
        PackageInfo packageInfo;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e67025166776aa01c6059381ea7603b8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e67025166776aa01c6059381ea7603b8");
        }
        if (this.mContext == null) {
            return "";
        }
        try {
            packageInfo = this.mContext.getPackageManager().getPackageInfo(this.mContext.getPackageName(), 0);
        } catch (Throwable unused) {
            packageInfo = null;
        }
        return packageInfo != null ? packageInfo.versionName : "";
    }

    @Override // com.dianping.titans.js.JsHost
    public boolean isBtnCloseShow() {
        return this.mIsBtnCloseShow;
    }

    @Override // com.dianping.titans.js.JsHost
    public TextView getTvUrl() {
        return this.mTvUrl;
    }

    @Override // com.dianping.titans.js.JsHost
    public String getTitleText() {
        return this.mTitle;
    }

    @Override // com.dianping.titans.js.JsHost
    public String getPackageName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be8c7671ea903eca9e78ff98b3c5d700", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be8c7671ea903eca9e78ff98b3c5d700") : this.mContext == null ? "" : this.mContext.getPackageName();
    }

    @Override // com.dianping.titans.js.JsHost
    public String getUrl() {
        return this.mUrl;
    }

    @Override // com.dianping.titans.js.JsHost
    public void setUrl(String str) {
        this.mUrl = str;
    }

    @Override // com.dianping.titans.js.JsHost
    public FrameLayout getLayVideo() {
        return this.mLayVideo;
    }

    @Override // com.dianping.titans.js.JsHost
    public LinearLayout getLayWeb() {
        return this.mLayWeb;
    }

    @Override // com.dianping.titans.js.JsHost
    public int getWebTimeout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c21705bdc3e5bebb6a6cc3297bf6d2b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c21705bdc3e5bebb6a6cc3297bf6d2b")).intValue() : KNBWebManager.getWebTimeout();
    }

    @Override // com.dianping.titans.js.JsHost
    public Activity getActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6120806283cdab0cf4a0e8ccecc495a0", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6120806283cdab0cf4a0e8ccecc495a0");
        }
        if (this.mActivityHandler != null) {
            return this.mActivityHandler.handleGetActivity();
        }
        return null;
    }

    @Override // com.dianping.titans.js.JsHost
    public boolean isInWhiteList(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cbd1a0155469b1a0f704b19e1bc5b1f2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cbd1a0155469b1a0f704b19e1bc5b1f2")).booleanValue() : UriUtil.hostEndWith(str, KNBConfig.getStringListConfig(KNBConfig.CONFIG_ACCESS_WHITE, KNBConfig.DEFAULT_WHITE_LIST));
    }

    @Override // com.dianping.titans.js.JsHost
    public boolean isActivated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fcaa46a8a0549d4e620e7134616100b5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fcaa46a8a0549d4e620e7134616100b5")).booleanValue() : UIUtil.isActivityLive(getActivity());
    }

    @Override // com.dianping.titans.js.JsHost
    public void hiddenWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "831b9ee81c6f85082ccfea1f683b317e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "831b9ee81c6f85082ccfea1f683b317e");
        } else if (this.mOnHiddenListener != null) {
            this.mOnHiddenListener.onHidden();
        }
    }

    public WebView getWebView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd2966c534ac91d7e4cb8f7f6dee2ce6", RobustBitConfig.DEFAULT_VALUE) ? (WebView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd2966c534ac91d7e4cb8f7f6dee2ce6") : (WebView) view.findViewById(R.id.layout_webview);
    }

    public long reportPageTTI() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5dfe18f715b61d9e32b47f9808e68d0d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5dfe18f715b61d9e32b47f9808e68d0d")).longValue();
        }
        if (this.mNovaEftedWebViewClient != null) {
            Uri parse = this.mUrl != null ? Uri.parse(this.mUrl) : null;
            EventReporter eventReporter = EventReporter.getInstance();
            long currentTimeMillis = System.currentTimeMillis();
            long obtainPageStartedTime = currentTimeMillis - this.mNovaEftedWebViewClient.obtainPageStartedTime();
            eventReporter.reportTiming("Page.TTI", parse, currentTimeMillis - this.mNovaEftedWebViewClient.obtainPageStartedTime());
            return obtainPageStartedTime;
        }
        return 0L;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void setupWebSettings(WebSettings webSettings) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        Object[] objArr = {webSettings};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b6fe8937411612307045b4113833223", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b6fe8937411612307045b4113833223");
            return;
        }
        webSettings.setTextZoom(100);
        webSettings.setDefaultFontSize(16);
        webSettings.setBuiltInZoomControls(false);
        webSettings.setSupportZoom(false);
        webSettings.setSaveFormData(false);
        if (this.isAllowFileAccess == 0) {
            z = KNBConfig.isAllowFileAccess;
        } else {
            z = this.isAllowFileAccess == 1;
        }
        webSettings.setAllowFileAccess(z);
        webSettings.setUseWideViewPort(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setLoadsImagesAutomatically(true);
        webSettings.setJavaScriptEnabled(true);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setDatabaseEnabled(true);
        try {
            webSettings.setAppCacheEnabled(true);
            webSettings.setAppCachePath(q.a(getContext(), "mtplatform_titans", "webview", u.b).getPath());
        } catch (Throwable unused) {
        }
        webSettings.setCacheMode(-1);
        webSettings.setGeolocationEnabled(KNBWebManager.getEnvironment().geolocationEnable());
        if (this.isAllowFileAccessFromFileURLs == 0) {
            z2 = KNBConfig.isAllowFileAccessFromFileURLs;
        } else {
            z2 = this.isAllowFileAccessFromFileURLs == 1;
        }
        webSettings.setAllowFileAccessFromFileURLs(z2);
        if (this.isAllowUniversalAccessFromFileURLs == 0) {
            z3 = KNBConfig.isAllowUniversalAccessFromFileURLs;
        } else if (this.isAllowUniversalAccessFromFileURLs != 1) {
            z3 = false;
        }
        webSettings.setAllowUniversalAccessFromFileURLs(z3);
        if (Build.VERSION.SDK_INT >= 21) {
            webSettings.setMixedContentMode(0);
        }
        try {
            webSettings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Exception unused2) {
        }
    }

    public String getUserToken() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81e784309e2bc879bc02528f4e6f3467", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81e784309e2bc879bc02528f4e6f3467") : KNBWebManager.getEnvironment() != null ? KNBWebManager.getEnvironment().getUserToken() : "";
    }

    public String getCityId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5710b1474ab0daca166446936dcdae0e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5710b1474ab0daca166446936dcdae0e") : KNBWebManager.getEnvironment() != null ? KNBWebManager.getEnvironment().getCityId() : "";
    }

    public String getCityName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba9c983d198a7dab2c6f0bca03b660ff", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba9c983d198a7dab2c6f0bca03b660ff") : KNBWebManager.getEnvironment() != null ? KNBWebManager.getEnvironment().getCityName() : "";
    }

    public String getLocateCityId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "606bc2f64155966ee4f64f85e8eb47b7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "606bc2f64155966ee4f64f85e8eb47b7") : KNBWebManager.getEnvironment() != null ? KNBWebManager.getEnvironment().getLocateCityId() : "";
    }

    public String getLocateCityName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1467a2e8ae3ec825bf6c94598ddaab6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1467a2e8ae3ec825bf6c94598ddaab6") : KNBWebManager.getEnvironment() != null ? KNBWebManager.getEnvironment().getLocateCityName() : "";
    }

    public String getLat() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1daffe10129d5f2b784b7b0708bbf56a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1daffe10129d5f2b784b7b0708bbf56a") : KNBWebManager.getEnvironment() != null ? KNBWebManager.getEnvironment().getLat() : "";
    }

    public String getLng() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f83638c57461128401485ae70ea4b2f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f83638c57461128401485ae70ea4b2f") : KNBWebManager.getEnvironment() != null ? KNBWebManager.getEnvironment().getLng() : "";
    }

    public String getUserId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b4e7abe9b87367523a97da933a09ce0a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b4e7abe9b87367523a97da933a09ce0a") : KNBWebManager.getEnvironment() != null ? KNBWebManager.getEnvironment().getUserId() : "";
    }

    public String getUUID() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec40b333d6665a9d73b0229f86b9634c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec40b333d6665a9d73b0229f86b9634c") : KNBWebManager.getEnvironment() != null ? KNBWebManager.getEnvironment().getUUID() : "";
    }

    public String getFingerprint() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2dc16a94a97776210fac654fcd1ecc69", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2dc16a94a97776210fac654fcd1ecc69") : KNBWebManager.getEnvironment() != null ? KNBWebManager.getEnvironment().getFingerprint() : "";
    }

    public String getDeviceId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49dd13d26a954cbbf6256f9e0ba7160f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49dd13d26a954cbbf6256f9e0ba7160f") : KNBWebManager.getEnvironment() != null ? KNBWebManager.getEnvironment().getDeviceId() : "";
    }

    private void filterTouchEvent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f68c3f53c8af296135c793b36283d7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f68c3f53c8af296135c793b36283d7c");
        } else if (this.mOnFilterTouchListener == null || !(this.mWebView instanceof TitansWebView)) {
        } else {
            ((TitansWebView) this.mWebView).setFilterTouch(this.mOnFilterTouchListener.onFilterWebViewMoveEvent());
        }
    }

    public void setIsBtnCloseDisable(boolean z) {
        this.mIsBtnCloseDisable = z;
    }

    @Override // com.dianping.titans.js.JsHost
    public boolean isShowTitlebarOnReceivedError() {
        return this.showTitleBarOnReceivedError;
    }

    public void setUploadMessage(ValueCallback<Uri> valueCallback) {
        this.mUploadMessage = valueCallback;
    }

    public void setUploadCallbackAboveL(ValueCallback<Uri[]> valueCallback) {
        this.mUploadCallbackAboveL = valueCallback;
    }

    public void setFileChooserParams(WebChromeClient.FileChooserParams fileChooserParams) {
        this.fileChooserParams = fileChooserParams;
    }

    @Override // com.dianping.titans.js.KNBJsHost
    public String getInnerURLKey() {
        return this.innerURLKey;
    }

    @Override // com.dianping.titans.js.KNBJsHost
    public String getPrefixURL() {
        return this.prefixURL;
    }

    public void registerOnMessageReceiveListener(OnMessageReceiveListener onMessageReceiveListener) {
        Object[] objArr = {onMessageReceiveListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4d7fcbb39e3c560b855480bb00f1250", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4d7fcbb39e3c560b855480bb00f1250");
        } else {
            this.mReceiveListenerList.add(onMessageReceiveListener);
        }
    }

    public void unregisterOnMessageReceiveListener(OnMessageReceiveListener onMessageReceiveListener) {
        Object[] objArr = {onMessageReceiveListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "baf5f69144161a11a4e552183a16eb95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "baf5f69144161a11a4e552183a16eb95");
        } else {
            this.mReceiveListenerList.remove(onMessageReceiveListener);
        }
    }

    @Override // com.dianping.titans.js.KNBJsHost
    public void onMessageReceive(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9fd90a1bfe61e5a0a844f0bea48d4249", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9fd90a1bfe61e5a0a844f0bea48d4249");
            return;
        }
        Iterator<OnMessageReceiveListener> it = this.mReceiveListenerList.iterator();
        while (it.hasNext()) {
            OnMessageReceiveListener next = it.next();
            if (TextUtils.equals(str, next.messageType())) {
                next.onMessageReceive(jSONObject);
            }
        }
    }
}
