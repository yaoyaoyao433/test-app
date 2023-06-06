package com.reactnativecommunity.webview;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.DownloadManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Environment;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.NotificationCompat;
import android.support.v4.util.Pair;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.JavascriptInterface;
import android.webkit.PermissionRequest;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.facebook.react.views.scroll.i;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.recce.props.gens.OverScrollMode;
import com.meituan.android.recce.props.gens.ShowsHorizontalScrollIndicator;
import com.meituan.android.recce.props.gens.ShowsVerticalScrollIndicator;
import com.meituan.mtwebkit.MTURLUtil;
import com.meituan.robust.common.StringUtil;
import com.reactnativecommunity.webview.RNCWebViewModule;
import com.reactnativecommunity.webview.events.d;
import com.reactnativecommunity.webview.events.e;
import com.reactnativecommunity.webview.events.f;
import com.reactnativecommunity.webview.events.g;
import com.reactnativecommunity.webview.events.h;
import com.sankuai.titans.protocol.bean.TitansConstants;
import com.sankuai.titans.proxy.util.Constants;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@ReactModule(name = "RNCWebView")
/* loaded from: classes3.dex */
public class RNCWebViewManager extends SimpleViewManager<WebView> {
    protected static final String BLANK_URL = "about:blank";
    public static final int COMMAND_CLEAR_CACHE = 1001;
    public static final int COMMAND_CLEAR_FORM_DATA = 1000;
    public static final int COMMAND_CLEAR_HISTORY = 1002;
    public static final int COMMAND_FOCUS = 8;
    public static final int COMMAND_GO_BACK = 1;
    public static final int COMMAND_GO_FORWARD = 2;
    public static final int COMMAND_INJECT_JAVASCRIPT = 6;
    public static final int COMMAND_LOAD_URL = 7;
    public static final int COMMAND_POST_MESSAGE = 5;
    public static final int COMMAND_RELOAD = 3;
    public static final int COMMAND_STOP_LOADING = 4;
    protected static final String HTML_ENCODING = "UTF-8";
    protected static final String HTML_MIME_TYPE = "text/html";
    protected static final String HTTP_METHOD_POST = "POST";
    protected static final String JAVASCRIPT_INTERFACE = "ReactNativeWebView";
    public static final String KEY_CIPS = "RNCWebViewManager";
    protected static final String REACT_CLASS = "RNCWebView";
    protected static final int SHOULD_OVERRIDE_URL_LOADING_TIMEOUT = 250;
    private static final String TAG = "RNCWebViewManager";
    protected boolean mAllowsFullscreenVideo;
    @Nullable
    protected String mUserAgent;
    @Nullable
    protected String mUserAgentWithApplicationName;
    protected a mWebChromeClient;
    protected com.reactnativecommunity.webview.b mWebViewConfig;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCWebView";
    }

    public RNCWebViewManager() {
        this.mWebChromeClient = null;
        this.mAllowsFullscreenVideo = false;
        this.mUserAgent = null;
        this.mUserAgentWithApplicationName = null;
        this.mWebViewConfig = new com.reactnativecommunity.webview.b() { // from class: com.reactnativecommunity.webview.RNCWebViewManager.1
        };
    }

    public RNCWebViewManager(com.reactnativecommunity.webview.b bVar) {
        this.mWebChromeClient = null;
        this.mAllowsFullscreenVideo = false;
        this.mUserAgent = null;
        this.mUserAgentWithApplicationName = null;
        this.mWebViewConfig = bVar;
    }

    protected static void dispatchEvent(WebView webView, com.facebook.react.uimanager.events.b bVar) {
        ((UIManagerModule) ((ReactContext) webView.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().a(bVar);
    }

    protected b createRNCWebViewInstance(ao aoVar) {
        return new b(aoVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    @TargetApi(21)
    public WebView createViewInstance(final ao aoVar) {
        final b createRNCWebViewInstance = createRNCWebViewInstance(aoVar);
        setupWebChromeClient(aoVar, createRNCWebViewInstance);
        aoVar.addLifecycleEventListener(createRNCWebViewInstance);
        WebSettings settings = createRNCWebViewInstance.getSettings();
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        if (Build.VERSION.SDK_INT >= 16) {
            settings.setAllowFileAccessFromFileURLs(false);
            setAllowUniversalAccessFromFileURLs(createRNCWebViewInstance, false);
        }
        setMixedContentMode(createRNCWebViewInstance, "never");
        createRNCWebViewInstance.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        createRNCWebViewInstance.setDownloadListener(new DownloadListener() { // from class: com.reactnativecommunity.webview.RNCWebViewManager.2
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                createRNCWebViewInstance.setIgnoreErrFailedForThisURL(str);
                RNCWebViewModule module = RNCWebViewManager.getModule(aoVar);
                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
                String guessFileName = URLUtil.guessFileName(str, str3, str4);
                String str5 = "Downloading " + guessFileName;
                try {
                    URL url = new URL(str);
                    request.addRequestHeader("Cookie", CookieManager.getInstance().getCookie(url.getProtocol() + "://" + url.getHost()));
                } catch (MalformedURLException e) {
                    System.out.println("Error getting cookie for DownloadManager: " + e.toString());
                    e.printStackTrace();
                }
                request.addRequestHeader("User-Agent", str2);
                request.setTitle(guessFileName);
                request.setDescription(str5);
                request.allowScanningByMediaScanner();
                request.setNotificationVisibility(1);
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                module.setDownloadRequest(request);
                if (module.grantFileDownloaderPermissions()) {
                    module.downloadFile();
                }
            }
        });
        return createRNCWebViewInstance;
    }

    @ReactProp(name = "javaScriptEnabled")
    public void setJavaScriptEnabled(WebView webView, boolean z) {
        webView.getSettings().setJavaScriptEnabled(z);
    }

    @ReactProp(name = ShowsHorizontalScrollIndicator.LOWER_CASE_NAME)
    public void setShowsHorizontalScrollIndicator(WebView webView, boolean z) {
        webView.setHorizontalScrollBarEnabled(z);
    }

    @ReactProp(name = ShowsVerticalScrollIndicator.LOWER_CASE_NAME)
    public void setShowsVerticalScrollIndicator(WebView webView, boolean z) {
        webView.setVerticalScrollBarEnabled(z);
    }

    @ReactProp(name = "cacheEnabled")
    public void setCacheEnabled(WebView webView, boolean z) {
        if (z) {
            Context context = webView.getContext();
            if (context != null) {
                webView.getSettings().setAppCachePath(q.a(context, "RNCWebViewManager", "cache", u.b).getAbsolutePath());
                webView.getSettings().setCacheMode(-1);
                webView.getSettings().setAppCacheEnabled(true);
                return;
            }
            return;
        }
        webView.getSettings().setCacheMode(2);
        webView.getSettings().setAppCacheEnabled(false);
    }

    @ReactProp(name = "cacheMode")
    public void setCacheMode(WebView webView, String str) {
        char c2;
        Integer num;
        int hashCode = str.hashCode();
        if (hashCode == -2059164003) {
            if (str.equals("LOAD_NO_CACHE")) {
                c2 = 2;
            }
            c2 = 65535;
        } else if (hashCode == -1215135800) {
            if (str.equals("LOAD_DEFAULT")) {
                c2 = 3;
            }
            c2 = 65535;
        } else if (hashCode != -873877826) {
            if (hashCode == 1548620642 && str.equals("LOAD_CACHE_ONLY")) {
                c2 = 0;
            }
            c2 = 65535;
        } else {
            if (str.equals("LOAD_CACHE_ELSE_NETWORK")) {
                c2 = 1;
            }
            c2 = 65535;
        }
        switch (c2) {
            case 0:
                num = 3;
                break;
            case 1:
                num = 1;
                break;
            case 2:
                num = 2;
                break;
            default:
                num = -1;
                break;
        }
        webView.getSettings().setCacheMode(num.intValue());
    }

    @ReactProp(name = "androidHardwareAccelerationDisabled")
    public void setHardwareAccelerationDisabled(WebView webView, boolean z) {
        if (z) {
            webView.setLayerType(1, null);
        }
    }

    @ReactProp(name = "androidLayerType")
    public void setLayerType(WebView webView, String str) {
        char c2;
        int hashCode = str.hashCode();
        int i = 1;
        if (hashCode != 116909544) {
            if (hashCode == 1319330215 && str.equals("software")) {
                c2 = 1;
            }
            c2 = 65535;
        } else {
            if (str.equals("hardware")) {
                c2 = 0;
            }
            c2 = 65535;
        }
        switch (c2) {
            case 0:
                i = 2;
                break;
            case 1:
                break;
            default:
                i = 0;
                break;
        }
        webView.setLayerType(i, null);
    }

    @ReactProp(name = OverScrollMode.LOWER_CASE_NAME)
    public void setOverScrollMode(WebView webView, String str) {
        char c2;
        Integer num;
        int hashCode = str.hashCode();
        if (hashCode == -1414557169) {
            if (str.equals("always")) {
                c2 = 2;
            }
            c2 = 65535;
        } else if (hashCode != 104712844) {
            if (hashCode == 951530617 && str.equals("content")) {
                c2 = 1;
            }
            c2 = 65535;
        } else {
            if (str.equals("never")) {
                c2 = 0;
            }
            c2 = 65535;
        }
        switch (c2) {
            case 0:
                num = 2;
                break;
            case 1:
                num = 1;
                break;
            default:
                num = 0;
                break;
        }
        webView.setOverScrollMode(num.intValue());
    }

    @ReactProp(name = "thirdPartyCookiesEnabled")
    public void setThirdPartyCookiesEnabled(WebView webView, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(webView, z);
        }
    }

    @ReactProp(name = "textZoom")
    public void setTextZoom(WebView webView, int i) {
        webView.getSettings().setTextZoom(i);
    }

    @ReactProp(name = "scalesPageToFit")
    public void setScalesPageToFit(WebView webView, boolean z) {
        webView.getSettings().setLoadWithOverviewMode(z);
        webView.getSettings().setUseWideViewPort(z);
    }

    @ReactProp(name = "domStorageEnabled")
    public void setDomStorageEnabled(WebView webView, boolean z) {
        webView.getSettings().setDomStorageEnabled(z);
    }

    @ReactProp(name = "userAgent")
    public void setUserAgent(WebView webView, @Nullable String str) {
        if (str != null) {
            this.mUserAgent = str;
        } else {
            this.mUserAgent = null;
        }
        setUserAgentString(webView);
    }

    @ReactProp(name = "applicationNameForUserAgent")
    public void setApplicationNameForUserAgent(WebView webView, @Nullable String str) {
        if (str != null) {
            if (Build.VERSION.SDK_INT >= 17) {
                String defaultUserAgent = WebSettings.getDefaultUserAgent(webView.getContext());
                this.mUserAgentWithApplicationName = defaultUserAgent + StringUtil.SPACE + str;
            }
        } else {
            this.mUserAgentWithApplicationName = null;
        }
        setUserAgentString(webView);
    }

    protected void setUserAgentString(WebView webView) {
        if (this.mUserAgent != null) {
            webView.getSettings().setUserAgentString(this.mUserAgent);
        } else if (this.mUserAgentWithApplicationName != null) {
            webView.getSettings().setUserAgentString(this.mUserAgentWithApplicationName);
        } else if (Build.VERSION.SDK_INT >= 17) {
            webView.getSettings().setUserAgentString(WebSettings.getDefaultUserAgent(webView.getContext()));
        }
    }

    @ReactProp(name = "mediaPlaybackRequiresUserAction")
    @TargetApi(17)
    public void setMediaPlaybackRequiresUserAction(WebView webView, boolean z) {
        webView.getSettings().setMediaPlaybackRequiresUserGesture(z);
    }

    @ReactProp(name = "javaScriptCanOpenWindowsAutomatically")
    public void setJavaScriptCanOpenWindowsAutomatically(WebView webView, boolean z) {
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(z);
    }

    @ReactProp(name = "allowFileAccessFromFileURLs")
    public void setAllowFileAccessFromFileURLs(WebView webView, boolean z) {
        webView.getSettings().setAllowFileAccessFromFileURLs(z);
    }

    @ReactProp(name = "allowUniversalAccessFromFileURLs")
    public void setAllowUniversalAccessFromFileURLs(WebView webView, boolean z) {
        webView.getSettings().setAllowUniversalAccessFromFileURLs(z);
    }

    @ReactProp(name = "saveFormDataDisabled")
    public void setSaveFormDataDisabled(WebView webView, boolean z) {
        webView.getSettings().setSaveFormData(!z);
    }

    @ReactProp(name = "injectedJavaScript")
    public void setInjectedJavaScript(WebView webView, @Nullable String str) {
        ((b) webView).setInjectedJavaScript(str);
    }

    @ReactProp(name = "injectedJavaScriptBeforeContentLoaded")
    public void setInjectedJavaScriptBeforeContentLoaded(WebView webView, @Nullable String str) {
        ((b) webView).setInjectedJavaScriptBeforeContentLoaded(str);
    }

    @ReactProp(name = "injectedJavaScriptForMainFrameOnly")
    public void setInjectedJavaScriptForMainFrameOnly(WebView webView, boolean z) {
        ((b) webView).setInjectedJavaScriptForMainFrameOnly(z);
    }

    @ReactProp(name = "injectedJavaScriptBeforeContentLoadedForMainFrameOnly")
    public void setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(WebView webView, boolean z) {
        ((b) webView).setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(z);
    }

    @ReactProp(name = "messagingEnabled")
    public void setMessagingEnabled(WebView webView, boolean z) {
        ((b) webView).setMessagingEnabled(z);
    }

    @ReactProp(name = "messagingModuleName")
    public void setMessagingModuleName(WebView webView, String str) {
        ((b) webView).setMessagingModuleName(str);
    }

    @ReactProp(name = "incognito")
    public void setIncognito(WebView webView, boolean z) {
        if (z) {
            if (Build.VERSION.SDK_INT >= 21) {
                CookieManager.getInstance().removeAllCookies(null);
            } else {
                CookieManager.getInstance().removeAllCookie();
            }
            webView.getSettings().setCacheMode(2);
            webView.getSettings().setAppCacheEnabled(false);
            webView.clearHistory();
            webView.clearCache(true);
            webView.clearFormData();
            webView.getSettings().setSavePassword(false);
            webView.getSettings().setSaveFormData(false);
        }
    }

    @ReactProp(name = "source")
    public void setSource(WebView webView, @Nullable ReadableMap readableMap) {
        if (readableMap != null) {
            if (readableMap.hasKey(Constants.KEY_CONTENT_TYPE_HTML)) {
                webView.loadDataWithBaseURL(readableMap.hasKey("baseUrl") ? readableMap.getString("baseUrl") : "", readableMap.getString(Constants.KEY_CONTENT_TYPE_HTML), "text/html", "UTF-8", null);
                return;
            } else if (readableMap.hasKey(com.meituan.metrics.common.Constants.TRAFFIC_URI)) {
                String string = readableMap.getString(com.meituan.metrics.common.Constants.TRAFFIC_URI);
                String url = webView.getUrl();
                if (url == null || !url.equals(string)) {
                    if (readableMap.hasKey("method") && readableMap.getString("method").equalsIgnoreCase("POST")) {
                        byte[] bArr = null;
                        if (readableMap.hasKey("body")) {
                            String string2 = readableMap.getString("body");
                            try {
                                bArr = string2.getBytes("UTF-8");
                            } catch (UnsupportedEncodingException unused) {
                                bArr = string2.getBytes();
                            }
                        }
                        if (bArr == null) {
                            bArr = new byte[0];
                        }
                        webView.postUrl(string, bArr);
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    if (readableMap.hasKey("headers")) {
                        ReadableMap map = readableMap.getMap("headers");
                        ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
                        while (keySetIterator.hasNextKey()) {
                            String nextKey = keySetIterator.nextKey();
                            if ("user-agent".equals(nextKey.toLowerCase(Locale.ENGLISH))) {
                                if (webView.getSettings() != null) {
                                    webView.getSettings().setUserAgentString(map.getString(nextKey));
                                }
                            } else {
                                hashMap.put(nextKey, map.getString(nextKey));
                            }
                        }
                    }
                    webView.loadUrl(transformDioUrl(string), hashMap);
                    return;
                }
                return;
            }
        }
        webView.loadUrl(BLANK_URL);
    }

    private String transformDioUrl(String str) {
        return (str != null && str.startsWith(MTURLUtil.FILE_BASE) && com.meituan.android.mrn.util.b.a(str)) ? str.replaceFirst("file://", "dio://") : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isDioFileUri(Uri uri) {
        if (uri != null && "dio".equals(uri.getScheme())) {
            return com.meituan.android.mrn.util.b.a(uri.getPath());
        }
        return false;
    }

    @ReactProp(name = "onContentSizeChange")
    public void setOnContentSizeChange(WebView webView, boolean z) {
        ((b) webView).setSendContentSizeChangeEvents(z);
    }

    @ReactProp(name = "mixedContentMode")
    public void setMixedContentMode(WebView webView, @Nullable String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            if (str == null || "never".equals(str)) {
                webView.getSettings().setMixedContentMode(1);
            } else if ("always".equals(str)) {
                webView.getSettings().setMixedContentMode(0);
            } else if ("compatibility".equals(str)) {
                webView.getSettings().setMixedContentMode(2);
            }
        }
    }

    @ReactProp(name = "urlPrefixesForDefaultIntent")
    public void setUrlPrefixesForDefaultIntent(WebView webView, @Nullable ReadableArray readableArray) {
        c rNCWebViewClient = ((b) webView).getRNCWebViewClient();
        if (rNCWebViewClient == null || readableArray == null) {
            return;
        }
        rNCWebViewClient.a(readableArray);
    }

    @ReactProp(name = "allowsFullscreenVideo")
    public void setAllowsFullscreenVideo(WebView webView, @Nullable Boolean bool) {
        this.mAllowsFullscreenVideo = bool != null && bool.booleanValue();
        setupWebChromeClient((ReactContext) webView.getContext(), webView);
    }

    @ReactProp(name = "allowFileAccess")
    public void setAllowFileAccess(WebView webView, @Nullable Boolean bool) {
        webView.getSettings().setAllowFileAccess(bool != null && bool.booleanValue());
    }

    @ReactProp(name = "geolocationEnabled")
    public void setGeolocationEnabled(WebView webView, @Nullable Boolean bool) {
        webView.getSettings().setGeolocationEnabled(bool != null && bool.booleanValue());
    }

    @ReactProp(name = "onScroll")
    public void setOnScroll(WebView webView, boolean z) {
        ((b) webView).setHasScrollEvent(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(ao aoVar, WebView webView) {
        webView.setWebViewClient(new c());
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.put("topLoadingProgress", com.facebook.react.common.c.a("registrationName", "onLoadingProgress"));
        exportedCustomDirectEventTypeConstants.put("topShouldStartLoadWithRequest", com.facebook.react.common.c.a("registrationName", "onShouldStartLoadWithRequest"));
        exportedCustomDirectEventTypeConstants.put(i.a(i.SCROLL), com.facebook.react.common.c.a("registrationName", "onScroll"));
        exportedCustomDirectEventTypeConstants.put("topHttpError", com.facebook.react.common.c.a("registrationName", "onHttpError"));
        exportedCustomDirectEventTypeConstants.put("topRenderProcessGone", com.facebook.react.common.c.a("registrationName", "onRenderProcessGone"));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Integer> getCommandsMap() {
        return com.facebook.react.common.c.b().a("goBack", 1).a("goForward", 2).a("reload", 3).a("stopLoading", 4).a("postMessage", 5).a("injectJavaScript", 6).a("loadUrl", 7).a("requestFocus", 8).a("clearFormData", 1000).a("clearCache", 1001).a("clearHistory", 1002).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(WebView webView, int i, @Nullable ReadableArray readableArray) {
        boolean z = false;
        switch (i) {
            case 1:
                webView.goBack();
                return;
            case 2:
                webView.goForward();
                return;
            case 3:
                webView.reload();
                return;
            case 4:
                webView.stopLoading();
                return;
            case 5:
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("data", readableArray.getString(0));
                    ((b) webView).a("(function () {var event;var data = " + jSONObject.toString() + ";try {event = new MessageEvent('message', data);} catch (e) {event = document.createEvent('MessageEvent');event.initMessageEvent('message', true, true, data.data, data.origin, data.lastEventId, data.source);}document.dispatchEvent(event);})();");
                    return;
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
            case 6:
                ((b) webView).a(readableArray.getString(0));
                return;
            case 7:
                if (readableArray == null) {
                    throw new RuntimeException("Arguments for loading an url are null!");
                }
                ((b) webView).k.a = false;
                webView.loadUrl(readableArray.getString(0));
                return;
            case 8:
                webView.requestFocus();
                return;
            default:
                switch (i) {
                    case 1000:
                        webView.clearFormData();
                        return;
                    case 1001:
                        if (readableArray != null && readableArray.getBoolean(0)) {
                            z = true;
                        }
                        webView.clearCache(z);
                        return;
                    case 1002:
                        webView.clearHistory();
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(WebView webView) {
        super.onDropViewInstance((RNCWebViewManager) webView);
        b bVar = (b) webView;
        ((ao) webView.getContext()).removeLifecycleEventListener(bVar);
        bVar.c();
        this.mWebChromeClient = null;
    }

    public static RNCWebViewModule getModule(ReactContext reactContext) {
        return (RNCWebViewModule) reactContext.getNativeModule(RNCWebViewModule.class);
    }

    protected void setupWebChromeClient(ReactContext reactContext, WebView webView) {
        if (this.mAllowsFullscreenVideo) {
            final int requestedOrientation = reactContext.getCurrentActivity().getRequestedOrientation();
            this.mWebChromeClient = new a(reactContext, webView) { // from class: com.reactnativecommunity.webview.RNCWebViewManager.3
                @Override // android.webkit.WebChromeClient
                public final Bitmap getDefaultVideoPoster() {
                    return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                }

                @Override // android.webkit.WebChromeClient
                public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
                    if (this.f != null) {
                        customViewCallback.onCustomViewHidden();
                        return;
                    }
                    this.f = view;
                    this.g = customViewCallback;
                    this.d.getCurrentActivity().setRequestedOrientation(-1);
                    if (Build.VERSION.SDK_INT >= 19) {
                        this.f.setSystemUiVisibility(7942);
                        this.d.getCurrentActivity().getWindow().setFlags(512, 512);
                    }
                    this.f.setBackgroundColor(-16777216);
                    a().addView(this.f, c);
                    this.e.setVisibility(8);
                    this.d.addLifecycleEventListener(this);
                }

                @Override // android.webkit.WebChromeClient
                public final void onHideCustomView() {
                    if (this.f == null) {
                        return;
                    }
                    this.f.setVisibility(8);
                    a().removeView(this.f);
                    this.g.onCustomViewHidden();
                    this.f = null;
                    this.g = null;
                    this.e.setVisibility(0);
                    if (Build.VERSION.SDK_INT >= 19) {
                        this.d.getCurrentActivity().getWindow().clearFlags(512);
                    }
                    this.d.getCurrentActivity().setRequestedOrientation(requestedOrientation);
                    this.d.removeLifecycleEventListener(this);
                }
            };
            webView.setWebChromeClient(this.mWebChromeClient);
            return;
        }
        if (this.mWebChromeClient != null) {
            this.mWebChromeClient.onHideCustomView();
        }
        this.mWebChromeClient = new a(reactContext, webView) { // from class: com.reactnativecommunity.webview.RNCWebViewManager.4
            @Override // android.webkit.WebChromeClient
            public final Bitmap getDefaultVideoPoster() {
                return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            }
        };
        webView.setWebChromeClient(this.mWebChromeClient);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class c extends WebViewClient {
        static final /* synthetic */ boolean e = !RNCWebViewManager.class.desiredAssertionStatus();
        @Nullable
        protected ReadableArray b;
        protected boolean a = false;
        protected b.a c = null;
        @Nullable
        protected String d = null;

        protected c() {
        }

        public final void a(@Nullable String str) {
            this.d = str;
        }

        @Override // android.webkit.WebViewClient
        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            if (str == null) {
                return null;
            }
            Uri parse = Uri.parse(str);
            if (RNCWebViewManager.isDioFileUri(parse)) {
                try {
                    return new WebResourceResponse("text/html", "UTF-8", com.meituan.android.mrn.util.b.b(parse).b());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            return super.shouldInterceptRequest(webView, str);
        }

        @Override // android.webkit.WebViewClient
        @RequiresApi(api = 21)
        public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            if (webResourceRequest == null) {
                return null;
            }
            Uri url = webResourceRequest.getUrl();
            if (RNCWebViewManager.isDioFileUri(url)) {
                try {
                    return new WebResourceResponse("text/html", "UTF-8", com.meituan.android.mrn.util.b.b(url).b());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (this.a) {
                return;
            }
            ((b) webView).a();
            b(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            this.a = false;
            ((b) webView).b();
            RNCWebViewManager.dispatchEvent(webView, new e(webView.getId(), a(webView, str)));
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            b bVar = (b) webView;
            boolean z = ((ReactContext) webView.getContext()).getJavaScriptContextHolder().get() == 0;
            if (!TextUtils.isEmpty(bVar.f) && !z && bVar.h != null) {
                Pair<Integer, AtomicReference<RNCWebViewModule.b.a>> a = RNCWebViewModule.shouldOverrideUrlLoadingLock.a();
                int intValue = a.first.intValue();
                AtomicReference<RNCWebViewModule.b.a> atomicReference = a.second;
                WritableMap a2 = a(webView, str);
                a2.putInt("lockIdentifier", intValue);
                bVar.a("onShouldStartLoadWithRequest", a2);
                try {
                    if (!e && atomicReference == null) {
                        throw new AssertionError();
                    }
                    synchronized (atomicReference) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        while (atomicReference.get() == RNCWebViewModule.b.a.UNDECIDED) {
                            if (SystemClock.elapsedRealtime() - elapsedRealtime > 250) {
                                com.facebook.common.logging.a.c("RNCWebViewManager", "Did not receive response to shouldOverrideUrlLoading in time, defaulting to allow loading.");
                                RNCWebViewModule.shouldOverrideUrlLoadingLock.b(Integer.valueOf(intValue));
                                return false;
                            }
                            atomicReference.wait(250L);
                        }
                        boolean z2 = atomicReference.get() == RNCWebViewModule.b.a.SHOULD_OVERRIDE;
                        RNCWebViewModule.shouldOverrideUrlLoadingLock.b(Integer.valueOf(intValue));
                        return z2;
                    }
                } catch (InterruptedException e2) {
                    com.facebook.common.logging.a.d("RNCWebViewManager", "shouldOverrideUrlLoading was interrupted while waiting for result.", e2);
                    RNCWebViewModule.shouldOverrideUrlLoadingLock.b(Integer.valueOf(intValue));
                    return false;
                }
            }
            com.facebook.common.logging.a.c("RNCWebViewManager", "Couldn't use blocking synchronous call for onShouldStartLoadWithRequest due to debugging or missing Catalyst instance, falling back to old event-and-load.");
            this.c.a = true;
            RNCWebViewManager.dispatchEvent(webView, new h(webView.getId(), a(webView, str)));
            return true;
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(24)
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            String str;
            sslErrorHandler.cancel();
            int primaryError = sslError.getPrimaryError();
            String url = sslError.getUrl();
            switch (primaryError) {
                case 0:
                    str = "The certificate is not yet valid";
                    break;
                case 1:
                    str = "The certificate has expired";
                    break;
                case 2:
                    str = "Hostname mismatch";
                    break;
                case 3:
                    str = "The certificate authority is not trusted";
                    break;
                case 4:
                    str = "The date of the certificate is invalid";
                    break;
                case 5:
                    str = "A generic error occurred";
                    break;
                default:
                    str = "Unknown SSL Error";
                    break;
            }
            onReceivedError(webView, primaryError, "SSL error: " + str, url);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            if (this.d == null || !str2.equals(this.d) || i != -1 || !str.equals("net::ERR_FAILED")) {
                super.onReceivedError(webView, i, str, str2);
                this.a = true;
                b(webView, str2);
                WritableMap a = a(webView, str2);
                a.putDouble("code", i);
                a.putString("description", str);
                RNCWebViewManager.dispatchEvent(webView, new com.reactnativecommunity.webview.events.b(webView.getId(), a));
                return;
            }
            this.d = null;
        }

        @Override // android.webkit.WebViewClient
        @RequiresApi(api = 23)
        public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (webResourceRequest.isForMainFrame()) {
                WritableMap a = a(webView, webResourceRequest.getUrl().toString());
                a.putInt("statusCode", webResourceResponse.getStatusCode());
                a.putString("description", webResourceResponse.getReasonPhrase());
                RNCWebViewManager.dispatchEvent(webView, new com.reactnativecommunity.webview.events.a(webView.getId(), a));
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (Build.VERSION.SDK_INT < 26) {
                return false;
            }
            super.onRenderProcessGone(webView, renderProcessGoneDetail);
            if (renderProcessGoneDetail.didCrash()) {
                Log.e("RNCWebViewManager", "The WebView rendering process crashed.");
            }
            if (webView == null) {
                return true;
            }
            WritableMap a = a(webView, webView.getUrl());
            a.putBoolean("didCrash", renderProcessGoneDetail.didCrash());
            RNCWebViewManager.dispatchEvent(webView, new g(webView.getId(), a));
            return true;
        }

        private void b(WebView webView, String str) {
            RNCWebViewManager.dispatchEvent(webView, new com.reactnativecommunity.webview.events.c(webView.getId(), a(webView, str)));
        }

        protected final WritableMap a(WebView webView, String str) {
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("target", webView.getId());
            createMap.putString("url", str);
            createMap.putBoolean("loading", (this.a || webView.getProgress() == 100) ? false : true);
            createMap.putString("title", webView.getTitle());
            createMap.putBoolean("canGoBack", webView.canGoBack());
            createMap.putBoolean("canGoForward", webView.canGoForward());
            return createMap;
        }

        public final void a(ReadableArray readableArray) {
            this.b = readableArray;
        }

        public final void a(b.a aVar) {
            this.c = aVar;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends WebChromeClient implements LifecycleEventListener {
        protected static final FrameLayout.LayoutParams c = new FrameLayout.LayoutParams(-1, -1, 17);
        protected ReactContext d;
        protected View e;
        protected View f;
        protected WebChromeClient.CustomViewCallback g;
        protected b.a h = null;

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            return true;
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
        }

        public a(ReactContext reactContext, WebView webView) {
            this.d = reactContext;
            this.e = webView;
        }

        @Override // android.webkit.WebChromeClient
        @TargetApi(21)
        public void onPermissionRequest(PermissionRequest permissionRequest) {
            String[] resources = permissionRequest.getResources();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < resources.length; i++) {
                if (resources[i].equals(com.tencent.smtt.export.external.interfaces.PermissionRequest.RESOURCE_AUDIO_CAPTURE)) {
                    arrayList.add(PermissionGuard.PERMISSION_MICROPHONE);
                } else if (resources[i].equals(com.tencent.smtt.export.external.interfaces.PermissionRequest.RESOURCE_VIDEO_CAPTURE)) {
                    arrayList.add(PermissionGuard.PERMISSION_CAMERA);
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (com.meituan.android.mrn.privacy.a.b(this.d, (String) arrayList.get(i2), "pt-23e07695bb456d64")) {
                    if (((String) arrayList.get(i2)).equals(PermissionGuard.PERMISSION_MICROPHONE)) {
                        arrayList2.add(com.tencent.smtt.export.external.interfaces.PermissionRequest.RESOURCE_AUDIO_CAPTURE);
                    } else if (((String) arrayList.get(i2)).equals(PermissionGuard.PERMISSION_CAMERA)) {
                        arrayList2.add(com.tencent.smtt.export.external.interfaces.PermissionRequest.RESOURCE_VIDEO_CAPTURE);
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                permissionRequest.deny();
            } else {
                permissionRequest.grant((String[]) arrayList2.toArray(new String[arrayList2.size()]));
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            super.onProgressChanged(webView, i);
            String url = webView.getUrl();
            if (this.h.a) {
                return;
            }
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("target", webView.getId());
            createMap.putString("title", webView.getTitle());
            createMap.putString("url", url);
            createMap.putBoolean("canGoBack", webView.canGoBack());
            createMap.putBoolean("canGoForward", webView.canGoForward());
            createMap.putDouble(NotificationCompat.CATEGORY_PROGRESS, i / 100.0f);
            RNCWebViewManager.dispatchEvent(webView, new d(webView.getId(), createMap));
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            callback.invoke(str, true, false);
        }

        @Override // android.webkit.WebChromeClient
        @TargetApi(21)
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            return RNCWebViewManager.getModule(this.d).startPhotoPickerIntent(valueCallback, fileChooserParams.getAcceptTypes(), fileChooserParams.getMode() == 1);
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
            if (Build.VERSION.SDK_INT < 19 || this.f == null || this.f.getSystemUiVisibility() == 7942) {
                return;
            }
            this.f.setSystemUiVisibility(7942);
        }

        protected final ViewGroup a() {
            return (ViewGroup) this.d.getCurrentActivity().findViewById(16908290);
        }

        public final void a(b.a aVar) {
            this.h = aVar;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b extends WebView implements LifecycleEventListener {
        @Nullable
        protected String a;
        @Nullable
        protected String b;
        protected boolean c;
        protected boolean d;
        protected boolean e;
        @Nullable
        protected String f;
        @Nullable
        protected c g;
        @Nullable
        protected CatalystInstance h;
        protected boolean i;
        protected boolean j;
        protected a k;
        WebChromeClient l;
        private com.facebook.react.views.scroll.b m;

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public final void onHostPause() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public final void onHostResume() {
        }

        public b(ao aoVar) {
            super(aoVar);
            this.c = true;
            this.d = true;
            this.e = false;
            this.i = false;
            this.j = false;
            ReactContext reactContext = (ReactContext) getContext();
            if (reactContext != null) {
                this.h = reactContext.getCatalystInstance();
            }
            this.k = new a();
        }

        public final void setIgnoreErrFailedForThisURL(String str) {
            this.g.a(str);
        }

        public final void setSendContentSizeChangeEvents(boolean z) {
            this.i = z;
        }

        public final void setHasScrollEvent(boolean z) {
            this.j = z;
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public final void onHostDestroy() {
            c();
        }

        @Override // android.webkit.WebView, android.view.View
        protected final void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            if (this.i) {
                RNCWebViewManager.dispatchEvent(this, new com.facebook.react.uimanager.events.a(getId(), i, i2));
            }
        }

        @Override // android.webkit.WebView
        public final void setWebViewClient(WebViewClient webViewClient) {
            super.setWebViewClient(webViewClient);
            if (webViewClient instanceof c) {
                this.g = (c) webViewClient;
                this.g.a(this.k);
            }
        }

        @Override // android.webkit.WebView
        public final void setWebChromeClient(WebChromeClient webChromeClient) {
            this.l = webChromeClient;
            super.setWebChromeClient(webChromeClient);
            if (webChromeClient instanceof a) {
                ((a) webChromeClient).a(this.k);
            }
        }

        @Nullable
        public final c getRNCWebViewClient() {
            return this.g;
        }

        public final void setInjectedJavaScript(@Nullable String str) {
            this.a = str;
        }

        public final void setInjectedJavaScriptBeforeContentLoaded(@Nullable String str) {
            this.b = str;
        }

        public final void setInjectedJavaScriptForMainFrameOnly(boolean z) {
            this.c = z;
        }

        public final void setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(boolean z) {
            this.d = z;
        }

        @SuppressLint({"AddJavascriptInterface"})
        public final void setMessagingEnabled(boolean z) {
            if (this.e == z) {
                return;
            }
            this.e = z;
            if (z) {
                addJavascriptInterface(new C0535b(this), RNCWebViewManager.JAVASCRIPT_INTERFACE);
            } else {
                removeJavascriptInterface(RNCWebViewManager.JAVASCRIPT_INTERFACE);
            }
        }

        public final void setMessagingModuleName(String str) {
            this.f = str;
        }

        protected final void a(String str) {
            if (Build.VERSION.SDK_INT >= 19) {
                evaluateJavascript(str, null);
                return;
            }
            try {
                loadUrl(TitansConstants.JAVASCRIPT_PREFIX + URLEncoder.encode(str, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        }

        public final void a() {
            if (!getSettings().getJavaScriptEnabled() || this.a == null || TextUtils.isEmpty(this.a)) {
                return;
            }
            a("(function() {\n" + this.a + ";\n})();");
        }

        public final void b() {
            if (!getSettings().getJavaScriptEnabled() || this.b == null || TextUtils.isEmpty(this.b)) {
                return;
            }
            a("(function() {\n" + this.b + ";\n})();");
        }

        public final void b(final String str) {
            getContext();
            if (this.g != null) {
                post(new Runnable() { // from class: com.reactnativecommunity.webview.RNCWebViewManager.b.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (b.this.g == null) {
                            return;
                        }
                        WritableMap a2 = b.this.g.a(this, this.getUrl());
                        a2.putString("data", str);
                        if (b.this.h != null && !TextUtils.isEmpty(b.this.f)) {
                            this.a("onMessage", a2);
                        } else {
                            RNCWebViewManager.dispatchEvent(this, new f(this.getId(), a2));
                        }
                    }
                });
                return;
            }
            WritableMap createMap = Arguments.createMap();
            createMap.putString("data", str);
            if (this.h != null && !TextUtils.isEmpty(this.f)) {
                a("onMessage", createMap);
            } else {
                RNCWebViewManager.dispatchEvent(this, new f(getId(), createMap));
            }
        }

        protected final void a(String str, WritableMap writableMap) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putMap("nativeEvent", writableMap);
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            writableNativeArray.pushMap((WritableMap) writableNativeMap);
            this.h.callFunction(this.f, str, writableNativeArray);
        }

        @Override // android.webkit.WebView, android.view.View
        protected final void onScrollChanged(int i, int i2, int i3, int i4) {
            super.onScrollChanged(i, i2, i3, i4);
            if (this.j) {
                if (this.m == null) {
                    this.m = new com.facebook.react.views.scroll.b();
                }
                if (this.m.a(i, i2)) {
                    RNCWebViewManager.dispatchEvent(this, com.facebook.react.views.scroll.h.a(getId(), i.SCROLL, i, i2, this.m.a, this.m.b, computeHorizontalScrollRange(), computeVerticalScrollRange(), getWidth(), getHeight()));
                }
            }
        }

        protected final void c() {
            setWebViewClient(null);
            destroy();
        }

        @Override // android.webkit.WebView
        public final void destroy() {
            if (this.l != null) {
                this.l.onHideCustomView();
            }
            super.destroy();
        }

        /* compiled from: ProGuard */
        /* renamed from: com.reactnativecommunity.webview.RNCWebViewManager$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0535b {
            b a;

            C0535b(b bVar) {
                this.a = bVar;
            }

            @JavascriptInterface
            public final void postMessage(String str) {
                this.a.b(str);
            }
        }

        /* compiled from: ProGuard */
        /* loaded from: classes3.dex */
        public static class a {
            boolean a = false;

            protected a() {
            }
        }
    }
}
