package com.sankuai.titans.base;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Instrumentation;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.privacy.aop.a;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.serviceloader.b;
import com.sankuai.titans.base.WebChromeClient;
import com.sankuai.titans.base.WebViewClient;
import com.sankuai.titans.base.titlebar.BaseTitleBar;
import com.sankuai.titans.base.titlebar.DynamicTitleParser;
import com.sankuai.titans.base.titlebar.LineTitleLayout;
import com.sankuai.titans.base.titlebar.OnInflateTitleBarListener;
import com.sankuai.titans.base.titlebar.TitansTitleBarUISettings;
import com.sankuai.titans.base.titlebar.ZIndexFrameLayout;
import com.sankuai.titans.base.utils.FragmentAccessTimingUtil;
import com.sankuai.titans.base.utils.InjectJs;
import com.sankuai.titans.base.utils.JsCustomEvent;
import com.sankuai.titans.base.utils.PerformanceAnalysis;
import com.sankuai.titans.base.utils.ProcessUtils;
import com.sankuai.titans.base.utils.ShowFileChooserUtils;
import com.sankuai.titans.base.utils.TitansTimingReport;
import com.sankuai.titans.base.utils.UIBridgeUtil;
import com.sankuai.titans.base.utils.UIKit;
import com.sankuai.titans.debug.adapter.TitansDebugManager;
import com.sankuai.titans.debug.adapter.dialog.ITitansDebugDialog;
import com.sankuai.titans.debug.adapter.dialog.ITitansDebugDialogConfig;
import com.sankuai.titans.protocol.adaptor.IAppTitansInfo;
import com.sankuai.titans.protocol.adaptor.IAppTitansInit;
import com.sankuai.titans.protocol.adaptor.IFileAccess;
import com.sankuai.titans.protocol.adaptor.ITitansAppAdaptor;
import com.sankuai.titans.protocol.bean.TitansConstants;
import com.sankuai.titans.protocol.jsbridge.JsHandlerResultInfo;
import com.sankuai.titans.protocol.lifecycle.ITitansPlugin;
import com.sankuai.titans.protocol.lifecycle.WebUrlLoadParam;
import com.sankuai.titans.protocol.lifecycle.annotation.TitansPlugin;
import com.sankuai.titans.protocol.services.IContainerAdapter;
import com.sankuai.titans.protocol.services.IContainerProvider;
import com.sankuai.titans.protocol.services.IStatisticsService;
import com.sankuai.titans.protocol.services.IThreadPoolService;
import com.sankuai.titans.protocol.services.IToastService;
import com.sankuai.titans.protocol.services.statisticInfo.AccessTimingInfo;
import com.sankuai.titans.protocol.services.statisticInfo.LifeCycleType;
import com.sankuai.titans.protocol.services.statisticInfo.PluginErrorInfo;
import com.sankuai.titans.protocol.utils.AppUtils;
import com.sankuai.titans.protocol.utils.CacheDirUtil;
import com.sankuai.titans.protocol.utils.HitTestResult;
import com.sankuai.titans.protocol.utils.OnWebEventListener;
import com.sankuai.titans.protocol.utils.SslErrorHandler;
import com.sankuai.titans.protocol.utils.UrlUtils;
import com.sankuai.titans.protocol.utils.WeakQuoteUtils;
import com.sankuai.titans.protocol.utils.WebResourceError;
import com.sankuai.titans.protocol.webcompat.IWebChromeClient;
import com.sankuai.titans.protocol.webcompat.IWebView;
import com.sankuai.titans.protocol.webcompat.elements.DynamicTitleBarElementEntity;
import com.sankuai.titans.protocol.webcompat.elements.DynamicTitleBarEntity;
import com.sankuai.titans.protocol.webcompat.elements.ILoadingViewTemplate;
import com.sankuai.titans.protocol.webcompat.elements.ITitleBar;
import com.sankuai.titans.protocol.webcompat.elements.ITitleBarActionCallback;
import com.sankuai.titans.protocol.webcompat.elements.ITitleBarUISettings;
import com.sankuai.titans.protocol.webcompat.elements.ITitleContent;
import com.sankuai.titans.protocol.webcompat.elements.OnTitleBarEventListener;
import com.sankuai.titans.protocol.webcompat.jshost.IUIManager;
import com.sankuai.titans.protocol.webcompat.jshost.OnActivityFinishListener;
import com.sankuai.titans.protocol.webcompat.jshost.OnWindowHiddenListener;
import com.sankuai.titans.result.IRequestPermissionCallback;
import com.sankuai.titans.result.TitansPermissionUtil;
import com.sankuai.waimai.platform.utils.f;
import java.io.File;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TitansFragment extends Fragment {
    private static final String ACTION_BACK = "back";
    private static final String ACTION_CLOSE = "close";
    private static final String ACTION_CUSTOM = "custom";
    private static final String ACTION_RELOAD = "reload";
    private static final String ACTION_TYPE_BACK = "H5_Back";
    private static final String ACTION_TYPE_CUSTOM_BACK = "H5_Custom_Back";
    private static final String ACTION_TYPE_SEARCH = "H5_Search";
    private static final String ACTION_TYPE_SHARE = "H5_Share";
    private static final String BASE_ERROR_URL = "https://static.meituan.net/bs/mbs-pages/master/error.html";
    private static final String ERROR_TYPE_HTTP_ERROR = "httpError";
    private static final String ERROR_TYPE_SSL_ERROR = "sslError";
    private static final String EXTRA_CONTAINER_ADAPTER_KEY = "__extra_container_adapter_key__";
    private static final String EXTRA_CONTAINER_ADAPTER_SCHEME_KEY = "__extra_container_adapter_scheme_key__";
    private static final String EXTRA_CONTAINER_EXTRA_ALL_KEY = "__extra_container_extra_all_key__";
    private static final long LOADING_VIEW_ANIMATION_DURATION = 300;
    private static final long LOADING_VIEW_MAX_TIME = 5000;
    private static final String SET_RESULT_KEY = "resultData";
    private static final Set<String> basicUA;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static int isTitansInitialized;
    private final IActivityStatus activityStatus;
    private boolean autoProcessUrl;
    private BaseJsBridgeActions baseJsBridgeActions;
    private TextView debugBar;
    private final Runnable dismissLoadingViewTask;
    private LineTitleLayout dynamicTitleBar;
    private ViewGroup errorLayout;
    private boolean hasContainerAdapter;
    private boolean hasLoaded;
    private boolean hasWebException;
    private LongClickImageSaver imageSaver;
    private OnInflateTitleBarListener inflateTitleBarListener;
    private boolean isFromBackground;
    private boolean isPausedOnLoadUrl;
    private JsHost jsHost;
    private ViewGroup loadingViewContainer;
    private ViewGroup loadingViewContainerFullscreen;
    private ILoadingViewTemplate loadingViewTemplate;
    private AccessTimingInfo mContainerAccessTimingInfo;
    private IContainerAdapter mContainerAdapter;
    private String mContainerAdapterKey;
    private TitansContainerContext mContainerContext;
    private ContainerObservable mContainerObservable;
    private String mDefaultWebUa;
    private WebChromeClient.FileChooserParams mFileChooserParams;
    private boolean mIsFirstPageStarted;
    private AccessTimingInfo mPageAccessTimingInfo;
    private long mPageStartedTime;
    private View mRootView;
    private List<ITitansPlugin> mTitansPlugins;
    private String mTitle;
    private final View.OnClickListener mTitleOnClickListener;
    private ValueCallback<Uri[]> mUploadCallbackAboveLollipop;
    private ValueCallback<Uri> mUploadMessage;
    private boolean mUrlHasLoaded;
    private TitansWebPageContext mWebPageContext;
    private WebPageObservable mWebPageObservable;
    private ViewGroup mainLayout;
    private Bundle originalArguments;
    private long pausingTime;
    private Runnable registeredOnBackPressedListener;
    private final DynamicTitleParser.ResourceProvider resourceProvider;
    private boolean retainContainerOnDestroy;
    private View shadowView;
    private long startPauseTime;
    private IStatisticsService statisticsService;
    private boolean supportImmersiveMode;
    private TitansBundle titansBundle;
    private TitansTimingReport titansTimingReport;
    private ITitleBarUISettings titansUISettings;
    private ITitleBar titleBar;
    private ViewGroup titleBarContainer;
    private ViewGroup videoLayout;
    private WebView webView;

    public TitansFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a821b8c4f65786cca9ecd5962f80cad2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a821b8c4f65786cca9ecd5962f80cad2");
            return;
        }
        this.autoProcessUrl = true;
        this.supportImmersiveMode = true;
        this.mUrlHasLoaded = false;
        this.isPausedOnLoadUrl = false;
        this.activityStatus = new ActivityStatus();
        this.isFromBackground = false;
        this.hasLoaded = false;
        this.mIsFirstPageStarted = false;
        this.hasContainerAdapter = true;
        this.hasWebException = false;
        this.resourceProvider = new DynamicTitleParser.ResourceProvider() { // from class: com.sankuai.titans.base.TitansFragment.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.sankuai.titans.base.titlebar.DynamicTitleParser.ResourceProvider
            public Drawable getDrawable(String str) {
                Resources resources;
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1c91ffa214860be811640b496c7991ef", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Drawable) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1c91ffa214860be811640b496c7991ef");
                }
                FragmentActivity activity = TitansFragment.this.getActivity();
                if (AppUtils.isActivityAlive(activity) && (resources = activity.getResources()) != null) {
                    if ("H5_Share".equals(str)) {
                        return resources.getDrawable(TitansFragment.this.titansUISettings.getTitleBarShareIconId());
                    }
                    if ("H5_Back".equals(str)) {
                        return resources.getDrawable(TitansFragment.this.titansUISettings.getTitleBarBackIconId());
                    }
                    if ("H5_Search".equals(str)) {
                        return resources.getDrawable(TitansFragment.this.titansUISettings.getTitleBarSearchIconId());
                    }
                    if ("H5_Custom_Back".equals(str)) {
                        return resources.getDrawable(TitansFragment.this.titansUISettings.getTitleBarCustomBackIconId());
                    }
                    return null;
                }
                return null;
            }
        };
        this.startPauseTime = 0L;
        this.pausingTime = 0L;
        this.mTitleOnClickListener = new View.OnClickListener() { // from class: com.sankuai.titans.base.TitansFragment.8
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d9a821f0fd5705f9470f6d6278d3b978", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d9a821f0fd5705f9470f6d6278d3b978");
                } else if (view instanceof ImageView) {
                    TitansFragment.this.webViewLoadJs(InjectJs.makeCustomEvent("KNB:titleClicked", "image title has been clicked"), null);
                }
            }
        };
        this.dismissLoadingViewTask = new Runnable() { // from class: com.sankuai.titans.base.TitansFragment.10
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                View loadingView;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5ae9cad82fd165c3b5369f7472877908", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5ae9cad82fd165c3b5369f7472877908");
                    return;
                }
                final ILoadingViewTemplate loadingViewTemplate = TitansFragment.this.getLoadingViewTemplate();
                if (loadingViewTemplate == null || (loadingView = loadingViewTemplate.getLoadingView(false, null)) == null) {
                    return;
                }
                TitansFragment.this.setLoadingViewTemplate(null);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setInterpolator(new LinearInterpolator());
                alphaAnimation.setDuration(TitansFragment.LOADING_VIEW_ANIMATION_DURATION);
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.sankuai.titans.base.TitansFragment.10.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        Object[] objArr3 = {animation};
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "1d9657bb4d78906d08a4b88fe6148b53", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "1d9657bb4d78906d08a4b88fe6148b53");
                            return;
                        }
                        TitansFragment.this.loadingViewContainer.removeAllViews();
                        TitansFragment.this.loadingViewContainerFullscreen.removeAllViews();
                        loadingViewTemplate.onDismiss();
                    }
                });
                loadingView.startAnimation(alphaAnimation);
            }
        };
    }

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        basicUA = linkedHashSet;
        linkedHashSet.add("TitansX/20.14.1");
        basicUA.add("KNB/1.2.0");
        Set<String> set = basicUA;
        set.add("android/" + Build.VERSION.RELEASE);
    }

    public static TitansFragment newInstance(Bundle bundle, IContainerAdapter iContainerAdapter) {
        Object[] objArr = {bundle, iContainerAdapter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2d4ffed9534be72f779c6c06b4d46e9e", RobustBitConfig.DEFAULT_VALUE)) {
            return (TitansFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2d4ffed9534be72f779c6c06b4d46e9e");
        }
        if (bundle == null || iContainerAdapter == null) {
            throw new RuntimeException("arguments or containerAdapter must not be null!");
        }
        if (TextUtils.isEmpty(bundle.getString(iContainerAdapter.h5UrlParameterName()))) {
            throw new RuntimeException("url must not be null!");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new RuntimeException("TitansFragment must init in main thread " + iContainerAdapter.scheme());
        }
        TitansFragment titansFragment = new TitansFragment();
        bundle.putString(EXTRA_CONTAINER_ADAPTER_KEY, ContainerAdapterManager.getInstance().createAndAddContainerAdapter(iContainerAdapter));
        bundle.putString(EXTRA_CONTAINER_ADAPTER_SCHEME_KEY, iContainerAdapter.scheme());
        titansFragment.setArguments(bundle);
        return titansFragment;
    }

    public boolean isAutoProcessUrl() {
        return this.autoProcessUrl;
    }

    public void setAutoProcessUrl(boolean z) {
        this.autoProcessUrl = z;
    }

    public boolean isSupportImmersiveMode() {
        return this.supportImmersiveMode;
    }

    public void setContainerAdapter(IContainerAdapter iContainerAdapter) {
        this.mContainerAdapter = iContainerAdapter;
    }

    public void setSupportImmersiveMode(boolean z) {
        this.supportImmersiveMode = z;
    }

    public boolean loadUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "17c144542f2fdacaf49d333650c19d41", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "17c144542f2fdacaf49d333650c19d41")).booleanValue() : innerLoadUrl(str, null);
    }

    public boolean loadUrl(String str, Map<String, String> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6c1a1aaff3a74e661c6c70bb42565d1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6c1a1aaff3a74e661c6c70bb42565d1")).booleanValue() : innerLoadUrl(str, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean innerLoadUrl(String str, Map<String, String> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56ce69ea0d01a5f2bf0452a39a3cf88a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56ce69ea0d01a5f2bf0452a39a3cf88a")).booleanValue();
        }
        if (this.webView == null || TextUtils.isEmpty(str) || !this.hasContainerAdapter) {
            return false;
        }
        if (str.startsWith(TitansConstants.JAVASCRIPT_PREFIX)) {
            webViewLoadJs(str, null);
        } else {
            if (this.titansTimingReport != null) {
                this.titansTimingReport.onLoadUrlStart();
            }
            final String refererUrl = this.titansBundle.getRefererUrl();
            final String refererSource = this.titansBundle.getRefererSource();
            this.mWebPageContext = new TitansWebPageContext(str, refererUrl, System.currentTimeMillis(), this.mContainerContext);
            this.jsHost.setPageContext(this.mWebPageContext);
            this.mWebPageObservable = FragmentObserveUtil.initPageObservable(this.mTitansPlugins, this.mWebPageContext, this.mContainerContext.getTitansContext().getServiceManager().getThreadPoolService());
            if (map == null) {
                map = new HashMap<>();
            }
            final WebUrlLoadParam webUrlLoadParam = new WebUrlLoadParam(map, new LinkedHashSet());
            webUrlLoadParam.setUrl(str);
            if (!TextUtils.isEmpty(refererUrl)) {
                webUrlLoadParam.setReferer(refererUrl);
            }
            FragmentObserveUtil.onWebUrlLoad(this.mWebPageObservable, webUrlLoadParam);
            writeUA(webUrlLoadParam.getAdditionalUA());
            if (!TextUtils.isEmpty(webUrlLoadParam.getUrl())) {
                str = webUrlLoadParam.getUrl();
            }
            final String str2 = str;
            this.mWebPageContext.setUrl(str2);
            this.mContainerContext.getTitansContext().getServiceManager().getThreadPoolService().executeOnUIThread(new Runnable() { // from class: com.sankuai.titans.base.TitansFragment.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "85022d995798b00da780f1ab28c4708e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "85022d995798b00da780f1ab28c4708e");
                        return;
                    }
                    FragmentAccessTimingUtil.containerEndPoint(TitansFragment.this.mContainerAccessTimingInfo, "ContainerCreate", str2, TitansFragment.isTitansInitialized);
                    TitansFragment.this.mPageAccessTimingInfo = FragmentAccessTimingUtil.initPageAccessTiming(str2, refererUrl, refererSource, TitansFragment.isTitansInitialized, TitansFragment.this.mContainerAdapter.scheme());
                    FragmentAccessTimingUtil.pageStartPoint(TitansFragment.this.mPageAccessTimingInfo);
                    if (TitansFragment.isTitansInitialized == 0) {
                        Titans.getAppAdaptor().onCookieChange(new TitansCookieChangeListener(TitansFragment.this.mContainerContext.getTitansContext().getAppInfo().titansAppId(), Titans.serviceManager().getCookieService()));
                        int unused = TitansFragment.isTitansInitialized = 1;
                        if (TitansFragment.this.titansTimingReport != null) {
                            TitansFragment.this.titansTimingReport.setFirstCreateContainer(true);
                        }
                    }
                    FragmentAccessTimingUtil.reportVisitInfo(TitansFragment.this.mPageAccessTimingInfo, "loadUrl");
                    if (TitansFragment.this.webView != null) {
                        PerformanceAnalysis.getInstance().onLoadUrl();
                        if (TitansFragment.this.titansTimingReport != null) {
                            TitansFragment.this.titansTimingReport.loadUrlOnCreate(str2);
                        }
                        TitansFragment.this.webView.loadUrl(str2, webUrlLoadParam.getAdditionalHeaders());
                    }
                }
            });
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void writeUA(Set<String> set) {
        String str;
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ddb9fb5781690d3560515c881c587c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ddb9fb5781690d3560515c881c587c3");
            return;
        }
        Context context = getContext();
        if (context == null) {
            return;
        }
        IAppTitansInfo appInfo = Titans.getAppAdaptor().getAppInfo();
        String appUa = appInfo.appUa();
        String appName = appInfo.appName();
        String str2 = "";
        String packageName = context.getPackageName();
        if (!TextUtils.isEmpty(packageName)) {
            try {
                str = context.getPackageManager().getPackageInfo(packageName, 0).versionName;
                str2 = str;
            } catch (Exception e) {
                this.statisticsService.reportClassError("TitansFragment", "writeUA", e);
                str = "";
            }
            if (!TextUtils.isEmpty(str)) {
                if (str.matches("[0-9]+")) {
                    str = str + ".0.0";
                } else if (str.matches("[0-9]+\\.[0-9]*")) {
                    str = str + ".0";
                }
                appName = appName + "/" + str;
            }
        }
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        WebSettings settings = this.webView.getSettings();
        linkedHashSet.add(this.mDefaultWebUa);
        linkedHashSet.addAll(basicUA);
        linkedHashSet.add(appUa);
        linkedHashSet.add("App/" + appInfo.titansAppId() + "/" + str2);
        linkedHashSet.add(appName);
        linkedHashSet.addAll(set);
        StringBuilder sb = new StringBuilder();
        for (String str3 : linkedHashSet) {
            sb.append(StringUtil.SPACE);
            sb.append(str3);
        }
        settings.setUserAgentString(sb.toString());
        this.mWebPageContext.setUA(sb.toString());
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52840a2b7cea20b08dce64a30b0a88d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52840a2b7cea20b08dce64a30b0a88d2");
            return;
        }
        super.onCreate(bundle);
        this.titansTimingReport = new TitansTimingReport();
        List a = b.a(IAppTitansInit.class, "");
        if (a != null && a.size() > 0) {
            ((IAppTitansInit) a.get(0)).init(getActivity());
        }
        if (this.titansTimingReport != null) {
            this.titansTimingReport.globalInitCompleted();
        }
        Bundle arguments = getArguments();
        if (arguments == null && bundle != null) {
            arguments = bundle.getBundle(EXTRA_CONTAINER_EXTRA_ALL_KEY);
        }
        if (arguments != null && !TextUtils.isEmpty(arguments.getString(EXTRA_CONTAINER_ADAPTER_KEY, ""))) {
            this.mContainerAdapterKey = arguments.getString(EXTRA_CONTAINER_ADAPTER_KEY);
            this.mContainerAdapter = ContainerAdapterManager.getInstance().getContainerAdapter(this.mContainerAdapterKey);
            this.originalArguments = arguments;
            if (this.mContainerAdapter == null) {
                this.hasContainerAdapter = false;
                return;
            }
            this.titansBundle = new TitansBundle(this.mContainerAdapter.h5UrlParameterName(), arguments);
        } else if (getActivity() instanceof IContainerProvider) {
            this.mContainerAdapter = ((IContainerProvider) getActivity()).getIContainerAdapter();
            this.titansBundle = new TitansBundle(getActivity(), this.mContainerAdapter.h5UrlParameterName());
        } else {
            throw new RuntimeException("activity must implements IContainerProvider");
        }
        if (this.mContainerAdapter.getTitansUISettings() != null) {
            this.titansUISettings = this.mContainerAdapter.getTitansUISettings();
        } else {
            this.titansUISettings = new TitansTitleBarUISettings();
        }
        setLoadingViewTemplate(this.mContainerAdapter.getLoadingViewTemplate());
        this.baseJsBridgeActions = new BaseJsBridgeActions();
        this.jsHost = new JsHost(getActivity(), Titans.getTitansContext(), produceUIManager(), this.activityStatus, this.baseJsBridgeActions);
        this.mContainerContext = new TitansContainerContext(Titans.getTitansContext(), getActivity(), this.titansBundle.getExtrasBundle(), this.mContainerAdapter, this.jsHost);
        PerformanceAnalysis.getInstance().onContainerCreate();
        this.statisticsService = Titans.serviceManager().getStatisticsService();
        this.mContainerAccessTimingInfo = FragmentAccessTimingUtil.initContainerTiming(isTitansInitialized);
        FragmentAccessTimingUtil.containerStartPoint(this.mContainerAccessTimingInfo);
        this.mTitansPlugins = Titans.getPlugins(this.mContainerAdapter.scheme(), this.mContainerAdapter.getBusinessPlugin());
        this.mContainerObservable = FragmentObserveUtil.initContainerObservable(this.mTitansPlugins, this.mContainerContext);
        ITitansAppAdaptor appAdaptor = Titans.getAppAdaptor();
        if (Build.VERSION.SDK_INT >= 21 && appAdaptor.getAppInfo().usingSlowDraw()) {
            try {
                android.webkit.WebView.enableSlowWholeDocumentDraw();
            } catch (Throwable th) {
                this.statisticsService.reportClassError("TitansFragment", "onCreate#enableSlowWholeDocumentDraw", th);
            }
        }
        if (appAdaptor.getAppInfo().isDebugMode() && Build.VERSION.SDK_INT >= 19) {
            try {
                android.webkit.WebView.setWebContentsDebuggingEnabled(true);
            } catch (Exception e) {
                this.statisticsService.reportClassError("TitansFragment", "onCreate#setWebContentsDebuggingEnabled", e);
            }
        }
        initImmersiveStatusBar(this.titansBundle);
        this.imageSaver = new LongClickImageSaver(this.mContainerContext);
        if (this.titansTimingReport == null || this.titansBundle == null || this.mContainerAdapter == null) {
            return;
        }
        this.titansTimingReport.setOriginalUrl(this.titansBundle.getUrl());
    }

    private void initImmersiveStatusBar(TitansBundle titansBundle) {
        Object[] objArr = {titansBundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a2d155991722045ae2fa1c4303e4225", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a2d155991722045ae2fa1c4303e4225");
        } else if (isSupportImmersiveMode() && getActivity() != null && Build.VERSION.SDK_INT >= 21) {
            if ((titansBundle.hasFuture(2) || titansBundle.hasFuture(4)) && !titansBundle.hasTitleBar()) {
                Window window = getActivity().getWindow();
                window.clearFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor(0);
                View decorView = window.getDecorView();
                int systemUiVisibility = decorView.getSystemUiVisibility() | 1024;
                if (titansBundle.hasFuture(4)) {
                    systemUiVisibility = systemUiVisibility | 4096 | 2 | 4;
                    decorView.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.sankuai.titans.base.TitansFragment.3
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // android.view.View.OnSystemUiVisibilityChangeListener
                        public void onSystemUiVisibilityChange(int i) {
                            Object[] objArr2 = {Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "604237e635b287ee319803eab9154442", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "604237e635b287ee319803eab9154442");
                            } else if ((i & 2) != 0) {
                            } else {
                                FragmentActivity activity = TitansFragment.this.getActivity();
                                if (AppUtils.isActivityAlive(activity)) {
                                    activity.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.sankuai.titans.base.TitansFragment.3.1
                                        public static ChangeQuickRedirect changeQuickRedirect;

                                        @Override // java.lang.Runnable
                                        public void run() {
                                            Object[] objArr3 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "b2ccc22a59b7c2c96406d95d62446b69", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "b2ccc22a59b7c2c96406d95d62446b69");
                                                return;
                                            }
                                            FragmentActivity activity2 = TitansFragment.this.getActivity();
                                            if (AppUtils.isActivityAlive(activity2)) {
                                                View decorView2 = activity2.getWindow().getDecorView();
                                                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 4 | 2 | 4096);
                                            }
                                        }
                                    }, 16L);
                                }
                            }
                        }
                    });
                }
                decorView.setSystemUiVisibility(systemUiVisibility);
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06c868b2f3221ed45d6c40460a356d8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06c868b2f3221ed45d6c40460a356d8b");
            return;
        }
        a.e();
        super.onActivityResult(i, i2, intent);
        this.jsHost.onActivityResult(i, i2, intent);
        if (i == 110) {
            if (intent == null) {
                this.jsHost.setActivityResult(null);
                webViewLoadJs(InjectJs.makeCustomEvent(new JsCustomEvent("KNB:onOpenPageResult", null)), null);
            } else {
                String a = f.a(intent, "resultData");
                OpenPageResult openPageResult = new OpenPageResult();
                openPageResult.resultCode = i2;
                openPageResult.resultData = a;
                this.jsHost.setActivityResult(openPageResult);
                webViewLoadJs(InjectJs.makeCustomEvent(new JsCustomEvent("KNB:onOpenPageResult", openPageResult)), null);
            }
        } else if (i == 111) {
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.mUploadCallbackAboveLollipop != null) {
                    ShowFileChooserUtils.handleActivityResult(this.mUploadCallbackAboveLollipop, i2, intent);
                }
                this.mUploadCallbackAboveLollipop = null;
            } else if (this.mUploadMessage != null) {
                this.mUploadMessage.onReceiveValue((intent == null || i2 != -1) ? null : intent.getData());
                this.mUploadMessage = null;
            }
        }
        a.f();
    }

    @Override // android.support.v4.app.Fragment
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a5051181dfdb5f14eab755d636896e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a5051181dfdb5f14eab755d636896e0");
        } else if (com.sankuai.meituan.takeoutnew.util.aop.f.a(this, i, strArr, iArr).b) {
            super.onRequestPermissionsResult(i, strArr, iArr);
            this.jsHost.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
        boolean z = true;
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "695c747381f1c16e5d7c671199bfd812", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "695c747381f1c16e5d7c671199bfd812");
        }
        this.mRootView = layoutInflater.inflate(R.layout.titans_fragment, viewGroup, false);
        if (!this.hasContainerAdapter) {
            return this.mRootView;
        }
        this.mainLayout = (ViewGroup) this.mRootView.findViewById(R.id.titans_main_layout);
        ViewGroup viewGroup2 = (ViewGroup) this.mRootView.findViewById(R.id.titans_webview_container);
        this.shadowView = this.mRootView.findViewById(R.id.titans_shadow_view);
        this.titleBarContainer = (ViewGroup) this.mRootView.findViewById(R.id.titans_titlebar_container);
        this.loadingViewContainer = (ViewGroup) this.mRootView.findViewById(R.id.titans_loading_view_container);
        this.loadingViewContainerFullscreen = (ViewGroup) this.mRootView.findViewById(R.id.titans_loading_view_container_fullscreen);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, this.mRootView.getContext().getResources().getDimensionPixelSize(this.titansUISettings.getTitleBarHeight()));
        this.webView = produceWebView(getActivity());
        if (this.webView == null) {
            this.hasWebException = true;
            return this.mRootView;
        }
        this.hasWebException = false;
        LocalBroadcastManager.getInstance(getContext()).sendBroadcast(new Intent("ACTION_WEBVIEW_INIT"));
        this.webView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.sankuai.titans.base.TitansFragment.4
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                HitTestResult hitTestResult;
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2e8be6f0b00b9a88166e4601f9983d18", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2e8be6f0b00b9a88166e4601f9983d18")).booleanValue();
                }
                FragmentActivity activity = TitansFragment.this.getActivity();
                if (AppUtils.isActivityAlive(activity) && (hitTestResult = TitansFragment.this.webView.getHitTestResult()) != null) {
                    int type = hitTestResult.getType();
                    if (type == 5 || type == 8) {
                        final String extra = hitTestResult.getExtra();
                        new AlertDialog.Builder(activity).setItems(new String[]{activity.getString(R.string.titans_save_picture_to_album), activity.getString(R.string.titans_cancel)}, new DialogInterface.OnClickListener() { // from class: com.sankuai.titans.base.TitansFragment.4.1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Object[] objArr3 = {dialogInterface, Integer.valueOf(i)};
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "430964654e88976e59b5cd0d818c7c9d", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "430964654e88976e59b5cd0d818c7c9d");
                                } else if (i == 0) {
                                    TitansFragment.this.imageSaver.saveImage(extra);
                                } else if (i == 1) {
                                    dialogInterface.cancel();
                                }
                            }
                        }).show();
                        return true;
                    }
                    return false;
                }
                return false;
            }
        });
        this.mDefaultWebUa = this.webView.getSettings().getUserAgentString();
        viewGroup2.addView(this.webView, new ViewGroup.LayoutParams(-1, -1));
        if (!this.titansBundle.hasDynamicTitleBar() || !inflateDynamicTitleBar(Titans.getAppAdaptor().getDynamicTitleBar())) {
            this.titleBar = getDefaultTitleBar();
            this.titleBarContainer.addView(this.titleBar.get(), 0, layoutParams);
            z = (this.mContainerAdapter.showTitleBar() && this.titansBundle.hasTitleBar()) ? false : false;
            this.titleBar.initialized(makeTitleBarInitializedEntity(), Titans.serviceManager(), this.titansUISettings, z);
            if (this.shadowView != null) {
                this.shadowView.setVisibility(z ? 0 : 8);
            }
        }
        initDebugUrlTv(Titans.getAppAdaptor().getAppInfo().isDebugMode());
        initLoadingView();
        return this.mRootView;
    }

    public void setTitleBarVisibility(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40cd629a9634b3d9992125777d0238af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40cd629a9634b3d9992125777d0238af");
        } else if (this.jsHost == null || this.jsHost.getUiManager() == null) {
        } else {
            this.jsHost.getUiManager().setNavigationBarHidden(z, new ITitleBarActionCallback() { // from class: com.sankuai.titans.base.TitansFragment.5
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarActionCallback
                public void onFail(int i, String str) {
                }

                @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarActionCallback
                public void onSuccess() {
                }
            });
        }
    }

    private void showContainerErrorView(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a66f0ed51f0fb21cba609d96b0f4af0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a66f0ed51f0fb21cba609d96b0f4af0e");
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.mRootView.findViewById(R.id.titans_error_layout);
        View inflate = LayoutInflater.from(this.mRootView.getContext()).inflate(R.layout.titans_container_error_layout, (ViewGroup) frameLayout, true);
        ((TextView) inflate.findViewById(R.id.container_main_message)).setText(str);
        ((TextView) inflate.findViewById(R.id.container_sub_message)).setText(str2);
        ((Button) inflate.findViewById(R.id.container_button)).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.titans.base.TitansFragment.6
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e7a3e54d55199caddf795eef80bfbc68", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e7a3e54d55199caddf795eef80bfbc68");
                } else {
                    TitansFragment.this.jsHost.getUiManager().onActivityFinish();
                }
            }
        });
        frameLayout.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ViewGroup getInnerVideoLayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "efebc4420f1a20d4424d41ba321471b7", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewGroup) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "efebc4420f1a20d4424d41ba321471b7");
        }
        if (this.videoLayout == null) {
            this.videoLayout = (ViewGroup) this.mRootView.findViewById(R.id.titans_video_layout);
        }
        return this.videoLayout;
    }

    private IUIManager produceUIManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "873ae3bfca2325078a2e32a72e938483", RobustBitConfig.DEFAULT_VALUE) ? (IUIManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "873ae3bfca2325078a2e32a72e938483") : new IUIManager() { // from class: com.sankuai.titans.base.TitansFragment.7
            private static final int ERR_ILLEGAL_URL = 2;
            private static final int ERR_IMG_OBTAIN = -400;
            private static final int ERR_INTERNAL = -1;
            private static final int ERR_TITLE_STATE = 3;
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.sankuai.titans.protocol.webcompat.jshost.IUIManager
            public void dismissLoadingView() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "267e38d04263574aeb85ae238279d2e8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "267e38d04263574aeb85ae238279d2e8");
                } else {
                    TitansFragment.this.mContainerContext.getTitansContext().getServiceManager().getThreadPoolService().executeOnUIThread(TitansFragment.this.dismissLoadingViewTask);
                }
            }

            @Override // com.sankuai.titans.protocol.webcompat.jshost.IUIManager
            public void setNavigationBarHidden(final boolean z, final ITitleBarActionCallback iTitleBarActionCallback) {
                final int height;
                int i = 0;
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), iTitleBarActionCallback};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d7c046c6efe25b290f42fafbd5f58582", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d7c046c6efe25b290f42fafbd5f58582");
                } else if (TitansFragment.this.mainLayout != null && TitansFragment.this.getInnerDynamicTitleBar() == null && TitansFragment.this.titleBar != null) {
                    final View view = TitansFragment.this.titleBar.get();
                    if ((z && view.getVisibility() == 0) || (!z && view.getVisibility() != 0)) {
                        iTitleBarActionCallback.onSuccess();
                        return;
                    }
                    final int height2 = view.getHeight();
                    if (z) {
                        ViewGroup.LayoutParams layoutParams = TitansFragment.this.mainLayout.getLayoutParams();
                        int height3 = TitansFragment.this.mainLayout.getHeight() + height2;
                        layoutParams.height = height3;
                        TitansFragment.this.mainLayout.setLayoutParams(layoutParams);
                        TitansFragment.this.mainLayout.setY(-height2);
                        view.setVisibility(0);
                        height = height3;
                    } else {
                        i = -height2;
                        height = TitansFragment.this.mainLayout.getHeight();
                    }
                    TitansFragment.this.mainLayout.animate().setDuration(250L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.titans.base.TitansFragment.7.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            Object[] objArr3 = {valueAnimator};
                            ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "4346a0e082d7dca407cfb9a7fc893a9b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "4346a0e082d7dca407cfb9a7fc893a9b");
                                return;
                            }
                            ViewGroup.LayoutParams layoutParams2 = TitansFragment.this.mainLayout.getLayoutParams();
                            int round = Math.round(valueAnimator.getAnimatedFraction() * height2);
                            if (z) {
                                layoutParams2.height = height - round;
                            } else {
                                layoutParams2.height = height + round;
                            }
                            if (valueAnimator.getAnimatedFraction() == 1.0f) {
                                layoutParams2.height = -1;
                                if (!z) {
                                    view.setVisibility(8);
                                }
                                TitansFragment.this.mainLayout.setY(0.0f);
                                iTitleBarActionCallback.onSuccess();
                            }
                            TitansFragment.this.mainLayout.setLayoutParams(layoutParams2);
                        }
                    }).translationY(i).start();
                } else {
                    iTitleBarActionCallback.onFail(-1, "layout is null or baseTitleBar is not a titleBarView");
                }
            }

            @Override // com.sankuai.titans.protocol.webcompat.jshost.IUIManager
            public void setDynamicTitleBar(DynamicTitleBarEntity dynamicTitleBarEntity, ITitleBarActionCallback iTitleBarActionCallback) {
                boolean z = true;
                Object[] objArr2 = {dynamicTitleBarEntity, iTitleBarActionCallback};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "41961f6a0f15b5d7bc7615feb4218dd8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "41961f6a0f15b5d7bc7615feb4218dd8");
                    return;
                }
                LineTitleLayout innerDynamicTitleBar = TitansFragment.this.getInnerDynamicTitleBar();
                if (innerDynamicTitleBar != null) {
                    Pair<LineTitleLayout, ZIndexFrameLayout.LayoutParams> parse = DynamicTitleParser.parse(TitansFragment.this.getActivity(), innerDynamicTitleBar, dynamicTitleBarEntity, TitansFragment.this.resourceProvider);
                    if (parse == null || parse.first == null) {
                        iTitleBarActionCallback.onFail(-1, "parse error");
                        return;
                    }
                    if (innerDynamicTitleBar == parse.first && innerDynamicTitleBar.getParent() != null) {
                        innerDynamicTitleBar.setLayoutParams((ViewGroup.LayoutParams) parse.second);
                    } else {
                        z = TitansFragment.this.setInnerDynamicTitleBar((LineTitleLayout) parse.first, (ZIndexFrameLayout.LayoutParams) parse.second);
                    }
                    if (z) {
                        iTitleBarActionCallback.onSuccess();
                        return;
                    } else {
                        iTitleBarActionCallback.onFail(-1, "set error");
                        return;
                    }
                }
                iTitleBarActionCallback.onFail(-1, "no dynamic title bar");
            }

            @Override // com.sankuai.titans.protocol.webcompat.jshost.IUIManager
            public void setDynamicTitleBarElementAction(String str, String str2, ITitleBarActionCallback iTitleBarActionCallback) {
                Object[] objArr2 = {str, str2, iTitleBarActionCallback};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8837a9f77c94affe457ca1a1d7b67baa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8837a9f77c94affe457ca1a1d7b67baa");
                    return;
                }
                LineTitleLayout innerDynamicTitleBar = TitansFragment.this.getInnerDynamicTitleBar();
                if (innerDynamicTitleBar != null) {
                    innerDynamicTitleBar.setElementAction(str, str2);
                    iTitleBarActionCallback.onSuccess();
                    return;
                }
                iTitleBarActionCallback.onFail(-1, "no dynamic title bar");
            }

            @Override // com.sankuai.titans.protocol.webcompat.jshost.IUIManager
            public void replaceDynamicTitleBarElement(String str, DynamicTitleBarElementEntity dynamicTitleBarElementEntity, ITitleBarActionCallback iTitleBarActionCallback) {
                Object[] objArr2 = {str, dynamicTitleBarElementEntity, iTitleBarActionCallback};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c0da16b3fd951fe96ef8d5538dacbbe1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c0da16b3fd951fe96ef8d5538dacbbe1");
                    return;
                }
                LineTitleLayout innerDynamicTitleBar = TitansFragment.this.getInnerDynamicTitleBar();
                if (innerDynamicTitleBar != null) {
                    innerDynamicTitleBar.replaceElement(str, dynamicTitleBarElementEntity, TitansFragment.this.resourceProvider, iTitleBarActionCallback);
                } else {
                    iTitleBarActionCallback.onFail(-1, "no dynamic title bar");
                }
            }

            @Override // com.sankuai.titans.protocol.webcompat.jshost.IUIManager
            public void addDynamicTitleBarElement(String str, DynamicTitleBarElementEntity dynamicTitleBarElementEntity, ITitleBarActionCallback iTitleBarActionCallback) {
                Object[] objArr2 = {str, dynamicTitleBarElementEntity, iTitleBarActionCallback};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "df7d7ad8c775a32ee5e41095bd418096", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "df7d7ad8c775a32ee5e41095bd418096");
                    return;
                }
                LineTitleLayout innerDynamicTitleBar = TitansFragment.this.getInnerDynamicTitleBar();
                if (innerDynamicTitleBar != null) {
                    innerDynamicTitleBar.addElement(str, dynamicTitleBarElementEntity, TitansFragment.this.resourceProvider, iTitleBarActionCallback);
                } else {
                    iTitleBarActionCallback.onFail(-1, "no dynamic title bar");
                }
            }

            @Override // com.sankuai.titans.protocol.webcompat.jshost.IUIManager
            public void removeDynamicTitleBarElement(String str, ITitleBarActionCallback iTitleBarActionCallback) {
                Object[] objArr2 = {str, iTitleBarActionCallback};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a18c1bfe7ff9b5abd89bdd973428d9ac", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a18c1bfe7ff9b5abd89bdd973428d9ac");
                    return;
                }
                LineTitleLayout innerDynamicTitleBar = TitansFragment.this.getInnerDynamicTitleBar();
                if (innerDynamicTitleBar == null) {
                    iTitleBarActionCallback.onFail(-1, "no dynamic title bar");
                    return;
                }
                innerDynamicTitleBar.removeView(str);
                iTitleBarActionCallback.onSuccess();
            }

            @Override // com.sankuai.titans.protocol.webcompat.jshost.IUIManager
            public void setImgTitle(final String str, final ITitleBarActionCallback iTitleBarActionCallback) {
                ITitleContent titleContent;
                Object[] objArr2 = {str, iTitleBarActionCallback};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ad0419478634eb1f8333a472080b48cc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ad0419478634eb1f8333a472080b48cc");
                } else if (!TextUtils.isEmpty(str)) {
                    if (TitansFragment.this.getInnerDynamicTitleBar() == null && TitansFragment.this.titleBar != null && (titleContent = TitansFragment.this.titleBar.getTitleContent()) != null && !titleContent.isDetachedFromWindow()) {
                        IThreadPoolService threadPoolService = TitansFragment.this.mContainerContext.getTitansContext().getServiceManager().getThreadPoolService();
                        final WeakReference weakReference = new WeakReference(titleContent);
                        threadPoolService.executeOnThreadPool("", new Runnable() { // from class: com.sankuai.titans.base.TitansFragment.7.2
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // java.lang.Runnable
                            public void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "3f312fe0a0fb2189cfd0be1b74c756d2", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "3f312fe0a0fb2189cfd0be1b74c756d2");
                                    return;
                                }
                                final ITitleContent iTitleContent = (ITitleContent) weakReference.get();
                                if (iTitleContent == null || iTitleContent.isDetachedFromWindow()) {
                                    iTitleBarActionCallback.onFail(3, "no title bar/content");
                                    return;
                                }
                                ITitleContent.IImageTitleInterceptor imageTitleInterceptor = iTitleContent.getImageTitleInterceptor();
                                Bitmap onDownloadTitleImg = imageTitleInterceptor != null ? imageTitleInterceptor.onDownloadTitleImg(str) : null;
                                if (onDownloadTitleImg != null) {
                                    iTitleContent.setTitleImage(UIKit.createBitmap(TitansFragment.this.getActivity(), onDownloadTitleImg, true));
                                    iTitleBarActionCallback.onSuccess();
                                    return;
                                }
                                try {
                                    onDownloadTitleImg = UIKit.downloadBitmap(str, 5000);
                                } catch (Exception e) {
                                    Titans.serviceManager().getStatisticsService().reportClassError("TitansFragment", "setImgTitle", e);
                                }
                                if (onDownloadTitleImg == null) {
                                    iTitleBarActionCallback.onFail(-400, "get image failed");
                                } else if (iTitleContent == null || iTitleContent.isDetachedFromWindow()) {
                                    iTitleBarActionCallback.onFail(3, "no title bar/content");
                                } else {
                                    final Bitmap createBitmap = UIKit.createBitmap(TitansFragment.this.getActivity(), onDownloadTitleImg, true);
                                    iTitleContent.runOnUiThread(new Runnable() { // from class: com.sankuai.titans.base.TitansFragment.7.2.1
                                        public static ChangeQuickRedirect changeQuickRedirect;

                                        @Override // java.lang.Runnable
                                        public void run() {
                                            Object[] objArr4 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect5 = changeQuickRedirect;
                                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "e5f9fe9a70ff57bf4074fd9c85c997d8", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "e5f9fe9a70ff57bf4074fd9c85c997d8");
                                                return;
                                            }
                                            try {
                                                if (iTitleContent.isDetachedFromWindow()) {
                                                    iTitleBarActionCallback.onFail(3, "no title bar/content");
                                                    return;
                                                }
                                                iTitleContent.setTitleImage(createBitmap);
                                                iTitleBarActionCallback.onSuccess();
                                            } catch (Throwable unused) {
                                                iTitleBarActionCallback.onFail(-1, "internal error");
                                            }
                                        }
                                    });
                                }
                            }
                        });
                        return;
                    }
                    iTitleBarActionCallback.onFail(3, "no title bar/content");
                } else {
                    iTitleBarActionCallback.onFail(2, "illegal url");
                }
            }

            @Override // com.sankuai.titans.protocol.webcompat.jshost.IUIManager
            public void setTitle(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3826e19e26e714a6fa0e3dddd7a59bca", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3826e19e26e714a6fa0e3dddd7a59bca");
                    return;
                }
                TitansFragment.this.mTitle = str;
                TitansFragment.this.setTitleImpl(str);
            }

            @Override // com.sankuai.titans.protocol.webcompat.jshost.IUIManager
            public String getTitle() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ba23dda9a642480e1efd9761a0791c80", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ba23dda9a642480e1efd9761a0791c80") : TitansFragment.this.mTitle;
            }

            @Override // com.sankuai.titans.protocol.webcompat.jshost.IUIManager
            public ITitleBar getTitleBar() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7223d40a925c1844d82e95947f3c9400", RobustBitConfig.DEFAULT_VALUE) ? (ITitleBar) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7223d40a925c1844d82e95947f3c9400") : TitansFragment.this.titleBar;
            }

            @Override // com.sankuai.titans.protocol.webcompat.jshost.IUIManager
            public ITitleBarUISettings getTitleBarUISettings() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b5755441f6becbfa856bb5983614951e", RobustBitConfig.DEFAULT_VALUE) ? (ITitleBarUISettings) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b5755441f6becbfa856bb5983614951e") : TitansFragment.this.titansUISettings;
            }

            @Override // com.sankuai.titans.protocol.webcompat.jshost.IUIManager
            public TextView getDebugBar() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1a56a3e408e05e11588f4920de7be620", RobustBitConfig.DEFAULT_VALUE) ? (TextView) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1a56a3e408e05e11588f4920de7be620") : TitansFragment.this.getInnerDebugBar();
            }

            @Override // com.sankuai.titans.protocol.webcompat.jshost.IUIManager
            public void setNavigationBar(String str, String str2, boolean z, ITitleBarActionCallback iTitleBarActionCallback) {
                Object[] objArr2 = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), iTitleBarActionCallback};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0abf5c6c1f60ec5f1e27b714361dbbf8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0abf5c6c1f60ec5f1e27b714361dbbf8");
                } else if (TitansFragment.this.titleBar == null) {
                    iTitleBarActionCallback.onFail(8, "not support");
                } else {
                    try {
                        int rGBAColor = UIKit.getRGBAColor(str2);
                        int rGBAColor2 = UIKit.getRGBAColor(str);
                        if (!z || Build.VERSION.SDK_INT < 21) {
                            TitansFragment.this.titleBar.setBackgroundColor(rGBAColor);
                        } else {
                            ObjectAnimator.ofArgb(new BackGroundColorHolder(TitansFragment.this.titleBar), "color", TitansFragment.this.titleBar.getBackgroundColor(), rGBAColor).setDuration(500L).start();
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("color", rGBAColor2);
                        TitansFragment.this.titleBar.getTitleContent().setTitleContentParams(jSONObject);
                        iTitleBarActionCallback.onSuccess();
                    } catch (Throwable th) {
                        iTitleBarActionCallback.onFail(8, th.getMessage());
                    }
                }
            }

            @Override // com.sankuai.titans.protocol.webcompat.jshost.IUIManager
            public void setStatusBarStyle(Window window, int i, String str, ITitleBarActionCallback iTitleBarActionCallback) {
                Object[] objArr2 = {window, Integer.valueOf(i), str, iTitleBarActionCallback};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fb0d307c278dda2d458999b84854b2f4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fb0d307c278dda2d458999b84854b2f4");
                    return;
                }
                try {
                    UIBridgeUtil.setStatusBar(window, i, UIKit.getRGBAColor(str));
                    iTitleBarActionCallback.onSuccess();
                } catch (Throwable th) {
                    iTitleBarActionCallback.onFail(JsHandlerResultInfo.Error_UNKNOWN.code(), Log.getStackTraceString(th));
                }
            }

            @Override // com.sankuai.titans.protocol.webcompat.jshost.IUIManager
            public void setBackGroundColor(String str, ITitleBarActionCallback iTitleBarActionCallback) {
                Object[] objArr2 = {str, iTitleBarActionCallback};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d986c571eb01d8d2de8fdc1130e35b01", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d986c571eb01d8d2de8fdc1130e35b01");
                } else if (TitansFragment.this.webView == null) {
                } else {
                    try {
                        TitansFragment.this.webView.setBackgroundColor(UIKit.getRGBAColor(str));
                        iTitleBarActionCallback.onSuccess();
                    } catch (Throwable th) {
                        iTitleBarActionCallback.onFail(JsHandlerResultInfo.Error_UNKNOWN.code(), Log.getStackTraceString(th));
                    }
                }
            }

            @Override // com.sankuai.titans.protocol.webcompat.jshost.IUIManager
            public int getBackGroundColor() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "45d0fb8059b8ce9d476872615a6776f9", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "45d0fb8059b8ce9d476872615a6776f9")).intValue();
                }
                if (TitansFragment.this.webView == null || TitansFragment.this.webView.getBackground() == null || !(TitansFragment.this.webView.getBackground() instanceof ColorDrawable)) {
                    return 0;
                }
                return ((ColorDrawable) TitansFragment.this.webView.getBackground()).getColor();
            }

            @Override // com.sankuai.titans.protocol.webcompat.jshost.IUIManager
            public void setBackGroundDrawable(Drawable drawable) {
                Object[] objArr2 = {drawable};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "65fac4ad7f2ea234c003553af21fc748", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "65fac4ad7f2ea234c003553af21fc748");
                } else if (TitansFragment.this.webView == null || drawable == null) {
                } else {
                    TitansFragment.this.webView.setBackground(drawable);
                }
            }

            @Override // com.sankuai.titans.protocol.webcompat.jshost.IUIManager
            public Drawable getBackGroundDrawable() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "df7b2cbba4f76ecc2046399ef35873e4", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Drawable) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "df7b2cbba4f76ecc2046399ef35873e4");
                }
                if (TitansFragment.this.webView == null) {
                    return null;
                }
                return TitansFragment.this.webView.getBackground();
            }

            @Override // com.sankuai.titans.protocol.webcompat.jshost.IUIManager
            public void setTitleContent(ITitleContent iTitleContent, ITitleBarActionCallback iTitleBarActionCallback) {
                Object[] objArr2 = {iTitleContent, iTitleBarActionCallback};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "292056565a8a68eea936327538f4bf5a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "292056565a8a68eea936327538f4bf5a");
                    return;
                }
                if (TitansFragment.this.getInnerDynamicTitleBar() != null || TitansFragment.this.titleBar == null || TitansFragment.this.titleBar.getTitleContent() == null) {
                    iTitleBarActionCallback.onFail(JsHandlerResultInfo.Error_5_ContextError.code(), JsHandlerResultInfo.Error_5_ContextError.msg());
                }
                TitansFragment.this.titleBar.setTitleContent(iTitleContent);
                iTitleBarActionCallback.onSuccess();
            }

            @Override // com.sankuai.titans.protocol.webcompat.jshost.IUIManager
            public void setTitleContentParams(JSONObject jSONObject) {
                Object[] objArr2 = {jSONObject};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0e5f21710b770c32c29a7f7a06c41747", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0e5f21710b770c32c29a7f7a06c41747");
                } else if (TitansFragment.this.getInnerDynamicTitleBar() != null || getTitleBar() == null || getTitleBar().getTitleContent() == null) {
                } else {
                    getTitleBar().getTitleContent().setTitleContentParams(jSONObject);
                }
            }

            @Override // com.sankuai.titans.protocol.webcompat.jshost.IUIManager
            public void setOnTitleBarEventListener(OnTitleBarEventListener onTitleBarEventListener) {
                Object[] objArr2 = {onTitleBarEventListener};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ac45e29a33fc8f79bb081dcb3fb2e11b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ac45e29a33fc8f79bb081dcb3fb2e11b");
                } else if (TitansFragment.this.getInnerDynamicTitleBar() != null || getTitleBar() == null || getTitleBar().getTitleContent() == null) {
                } else {
                    getTitleBar().getTitleContent().setOnTitleBarEventListener(onTitleBarEventListener);
                }
            }

            @Override // com.sankuai.titans.protocol.webcompat.jshost.IUIManager
            public void setBackPressedListener(Runnable runnable) {
                Object[] objArr2 = {runnable};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5677ab50699e0ff6cc65912fbf0d6492", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5677ab50699e0ff6cc65912fbf0d6492");
                } else {
                    TitansFragment.this.registeredOnBackPressedListener = runnable;
                }
            }

            @Override // com.sankuai.titans.protocol.webcompat.jshost.IUIManager
            public void onWindowHidden() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d2650df66753c5926cb7274356ee7ff9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d2650df66753c5926cb7274356ee7ff9");
                    return;
                }
                OnWindowHiddenListener windowHiddenListener = TitansFragment.this.mContainerAdapter.getWindowHiddenListener();
                if (windowHiddenListener != null) {
                    windowHiddenListener.onHidden();
                }
            }

            @Override // com.sankuai.titans.protocol.webcompat.jshost.IUIManager
            public void onActivityFinish() {
                FragmentActivity activity;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f0293e0a7c56ce32746a108839ea4821", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f0293e0a7c56ce32746a108839ea4821");
                    return;
                }
                OnActivityFinishListener activityFinishListener = TitansFragment.this.mContainerAdapter.getActivityFinishListener();
                if ((activityFinishListener == null || !activityFinishListener.onActivityFinish()) && (activity = TitansFragment.this.getActivity()) != null) {
                    activity.finish();
                }
            }

            @Override // com.sankuai.titans.protocol.webcompat.jshost.IUIManager
            public IWebView getWebView() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "aec0fedb601dcc6b713ec0f059bb11db", RobustBitConfig.DEFAULT_VALUE) ? (IWebView) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "aec0fedb601dcc6b713ec0f059bb11db") : TitansFragment.this.webView;
            }

            @Override // com.sankuai.titans.protocol.webcompat.jshost.IUIManager
            public Bitmap getCaptureWebView() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c3b8ea28dadeecf984daee257b7789ae", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Bitmap) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c3b8ea28dadeecf984daee257b7789ae");
                }
                if (TitansFragment.this.webView == null) {
                    return null;
                }
                Bitmap createBitmap = Bitmap.createBitmap(TitansFragment.this.webView.getWidth(), (int) (TitansFragment.this.webView.getContentHeight() * TitansFragment.this.webView.getScale()), Bitmap.Config.ARGB_8888);
                TitansFragment.this.webView.draw(new Canvas(createBitmap));
                return createBitmap;
            }

            @Override // com.sankuai.titans.protocol.webcompat.jshost.IUIManager
            public String getWebViewKernel() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "12334dc645a5bd63fa9710b0effda74e", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "12334dc645a5bd63fa9710b0effda74e");
                }
                if (TitansFragment.this.webView == null) {
                    return null;
                }
                return TitansFragment.this.webView.getKernel();
            }

            @Override // com.sankuai.titans.protocol.webcompat.jshost.IUIManager
            public void setActionModeCallback(ActionMode.Callback callback) {
                Object[] objArr2 = {callback};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d9f24bba93e82015d656868e1035c24d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d9f24bba93e82015d656868e1035c24d");
                } else if (TitansFragment.this.webView != null) {
                    TitansFragment.this.webView.setActionModeCallback(callback);
                }
            }

            @Override // com.sankuai.titans.protocol.webcompat.jshost.IUIManager
            public void registerWebEventListener(OnWebEventListener onWebEventListener) {
                Object[] objArr2 = {onWebEventListener};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "34771822ebe9d1dfc7c8835fe7c6e1d1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "34771822ebe9d1dfc7c8835fe7c6e1d1");
                } else if (TitansFragment.this.webView != null) {
                    TitansFragment.this.webView.registerWebEventListener(onWebEventListener);
                }
            }

            @Override // com.sankuai.titans.protocol.webcompat.jshost.IUIManager
            public void unregisterWebEventListener(OnWebEventListener onWebEventListener) {
                Object[] objArr2 = {onWebEventListener};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fcb10bfaf054964b303ef87edf137c7c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fcb10bfaf054964b303ef87edf137c7c");
                } else if (TitansFragment.this.webView != null) {
                    TitansFragment.this.webView.unregisterWebEventListener(onWebEventListener);
                }
            }

            @Override // com.sankuai.titans.protocol.webcompat.jshost.IUIManager
            public void showErrorView(int i, String str, String str2) {
                Object[] objArr2 = {Integer.valueOf(i), str, str2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e5b8af3cf4cf76b1e9dc4ecb1e9dd991", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e5b8af3cf4cf76b1e9dc4ecb1e9dd991");
                } else {
                    TitansFragment.this.showInnerErrorView(i, str, str2);
                }
            }

            @Override // com.sankuai.titans.protocol.webcompat.jshost.IUIManager
            public void loadUrl(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b610cd3efaf730b16c34a7aa55f30dc6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b610cd3efaf730b16c34a7aa55f30dc6");
                } else {
                    TitansFragment.this.innerLoadUrl(str, null);
                }
            }

            @Override // com.sankuai.titans.protocol.webcompat.jshost.IUIManager
            public void loadUrl(String str, Map<String, String> map) {
                Object[] objArr2 = {str, map};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "35710ab5fbb0d5e086ddc918cf8ebe5e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "35710ab5fbb0d5e086ddc918cf8ebe5e");
                } else {
                    TitansFragment.this.innerLoadUrl(str, map);
                }
            }

            @Override // com.sankuai.titans.protocol.webcompat.jshost.IUIManager
            public void loadJs(String str, ValueCallback<?> valueCallback) {
                Object[] objArr2 = {str, valueCallback};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8d74c5d4470931582d09180ba535aaa9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8d74c5d4470931582d09180ba535aaa9");
                } else {
                    TitansFragment.this.webViewLoadJs(str, valueCallback);
                }
            }
        };
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class BackGroundColorHolder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public ITitleBar bar;

        public BackGroundColorHolder(ITitleBar iTitleBar) {
            Object[] objArr = {iTitleBar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4809c646c671fc0fd0706b93e7f5acfb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4809c646c671fc0fd0706b93e7f5acfb");
            } else {
                this.bar = iTitleBar;
            }
        }

        public void setColor(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3732dce641d3053f95fa21ab99dc31a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3732dce641d3053f95fa21ab99dc31a");
            } else if (this.bar != null) {
                this.bar.setBackgroundColor(i);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.sankuai.titans.base.WebView produceWebView(android.app.Activity r13) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.titans.base.TitansFragment.produceWebView(android.app.Activity):com.sankuai.titans.base.WebView");
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62cb349d75bc4040cf49127be3171c63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62cb349d75bc4040cf49127be3171c63");
        } else if (!this.hasContainerAdapter) {
            showContainerErrorView(getString(R.string.titans_container_error_title), getString(R.string.titans_container_error_msg));
        } else if (this.hasWebException) {
            showContainerErrorView(getString(R.string.titans_web_error_title), getString(R.string.titans_web_error_msg));
        } else {
            FragmentObserveUtil.onContainerCreated(this.mContainerObservable);
            onPageReady();
            if (this.mUrlHasLoaded || this.webView == null || this.webView.restoreState(this.titansBundle.getExtrasBundle()) != null) {
                return;
            }
            if (!this.activityStatus.isPause()) {
                loadUrlOnCreate();
            } else {
                this.isPausedOnLoadUrl = true;
            }
        }
    }

    private void loadUrlOnCreate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd6da6c28be558068c480679f622dc9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd6da6c28be558068c480679f622dc9a");
        } else if (this.mUrlHasLoaded) {
        } else {
            loadUrl(this.titansBundle.getUrl());
            this.isPausedOnLoadUrl = false;
            this.mUrlHasLoaded = true;
        }
    }

    private void onPageReady() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b5760b302aa286fa564a03d8596997b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b5760b302aa286fa564a03d8596997b");
        } else if (this.webView == null) {
        } else {
            this.webView.setDownloadListener(new TitansDownloadListener(this.jsHost));
            IAppTitansInfo appInfo = Titans.getTitansContext().getAppInfo();
            setupWebSettings(getActivity(), this.webView.getSettings(), appInfo.getFileAccess(), appInfo.geolocationEnable());
            this.webView.setAcceptThirdPartyCookies(this.mContainerAdapter.acceptThirdPartyCookies());
            CookieUtils.writeCookie(Titans.getAppAdaptor().getServiceManager().getCookieService(), appInfo.titansAppId());
            if (this.titansTimingReport != null) {
                this.titansTimingReport.onWebViewEnvInitEnd();
            }
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void setupWebSettings(Context context, WebSettings webSettings, IFileAccess iFileAccess, boolean z) {
        Object[] objArr = {context, webSettings, iFileAccess, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec8f0defc45d91100bd7614f5dd2d138", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec8f0defc45d91100bd7614f5dd2d138");
            return;
        }
        webSettings.setTextZoom(100);
        webSettings.setDefaultFontSize(16);
        webSettings.setBuiltInZoomControls(false);
        webSettings.setSupportZoom(false);
        webSettings.setSaveFormData(false);
        webSettings.setUseWideViewPort(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setLoadsImagesAutomatically(true);
        webSettings.setJavaScriptEnabled(true);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setDatabaseEnabled(true);
        try {
            webSettings.setAppCacheEnabled(true);
            webSettings.setAppCachePath(CacheDirUtil.getCacheDirAbsolutePath(context) + File.separator + "webview");
        } catch (Exception e) {
            this.statisticsService.reportClassError("TitansFragment", "setupWebSettings", e);
        }
        webSettings.setCacheMode(-1);
        webSettings.setGeolocationEnabled(z);
        try {
            webSettings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Exception e2) {
            this.statisticsService.reportClassError("TitansFragment", "setupWebSettings", e2);
        }
        webSettings.setAllowFileAccess(iFileAccess.isFileAccessAllowed());
        webSettings.setAllowFileAccessFromFileURLs(iFileAccess.isFileAccessFromFileUrlsAllowed());
        webSettings.setAllowUniversalAccessFromFileURLs(iFileAccess.isUniversalAccessFromFileURLSAllowed());
        if (Build.VERSION.SDK_INT >= 21) {
            webSettings.setMixedContentMode(0);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b2831cdbf3c8fc46b89d2b77ad37c76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b2831cdbf3c8fc46b89d2b77ad37c76");
        } else if (!this.hasContainerAdapter) {
            super.onStart();
        } else {
            FragmentObserveUtil.onContainerStart(this.mContainerObservable);
            super.onStart();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d0c228ffdda117f5af6f761c526fddf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d0c228ffdda117f5af6f761c526fddf");
        } else if (!this.hasContainerAdapter) {
            super.onResume();
        } else {
            if (this.startPauseTime != 0) {
                this.pausingTime = (this.pausingTime + System.currentTimeMillis()) - this.startPauseTime;
                this.startPauseTime = 0L;
            }
            FragmentObserveUtil.onContainerResume(this.mContainerObservable);
            super.onResume();
            this.activityStatus.setPause(false);
            this.hasLoaded = false;
            if (this.webView != null) {
                this.webView.onResume();
            }
            if (this.isFromBackground) {
                this.baseJsBridgeActions.publish("foreground");
                this.isFromBackground = false;
            } else {
                appear();
            }
            this.baseJsBridgeActions.onResume();
            if (this.isPausedOnLoadUrl) {
                loadUrlOnCreate();
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e8b6fdcce6312dcfe4e44e0af58e7e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e8b6fdcce6312dcfe4e44e0af58e7e7");
            return;
        }
        super.onSaveInstanceState(bundle);
        if (!TextUtils.isEmpty(this.mContainerAdapterKey)) {
            this.retainContainerOnDestroy = true;
            bundle.putString(EXTRA_CONTAINER_ADAPTER_KEY, this.mContainerAdapterKey);
            try {
                bundle.putBundle(EXTRA_CONTAINER_EXTRA_ALL_KEY, this.originalArguments);
            } catch (Exception e) {
                Titans.serviceManager().getStatisticsService().reportClassError("TitansFragment", "onSaveInstanceState", e);
            }
        }
        if (this.webView == null) {
            return;
        }
        this.webView.saveState(bundle);
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a74bc1a0c7d16c5a7685e922dee6bbc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a74bc1a0c7d16c5a7685e922dee6bbc3");
        } else if (!this.hasContainerAdapter) {
            super.onPause();
        } else {
            this.startPauseTime = System.currentTimeMillis();
            FragmentObserveUtil.onContainerPause(this.mContainerObservable);
            this.activityStatus.setPause(true);
            this.baseJsBridgeActions.onPause();
            if (this.webView != null) {
                this.webView.onPause();
            }
            if (this.activityStatus.isHasStartActivity()) {
                disappear();
                this.hasLoaded = true;
            }
            this.activityStatus.setHasStartActivity(false);
            super.onPause();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "74b8be45175ae36eb592a18da3bebc96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "74b8be45175ae36eb592a18da3bebc96");
        } else if (!this.hasContainerAdapter) {
            super.onStop();
        } else {
            FragmentObserveUtil.onContainerStop(this.mContainerObservable);
            this.baseJsBridgeActions.onStop();
            if (this.hasLoaded) {
                super.onStop();
                return;
            }
            this.hasLoaded = true;
            this.isFromBackground = ProcessUtils.isBackground(this.jsHost.getContext());
            if (this.isFromBackground) {
                this.baseJsBridgeActions.publish("background");
            } else {
                disappear();
            }
            super.onStop();
        }
    }

    private void appear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1abf002c1ac635148cda9ffee8e7820c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1abf002c1ac635148cda9ffee8e7820c");
            return;
        }
        this.activityStatus.setAppear(true);
        webViewLoadJs("javascript:window.DPApp && window.DPApp.onAppear && window.DPApp.onAppear();" + InjectJs.makeCustomEvent("KNB:appear", "web view did appear"), null);
    }

    private void disappear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e895bc497d95b8a175b4acd89f11954d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e895bc497d95b8a175b4acd89f11954d");
            return;
        }
        this.activityStatus.setAppear(false);
        webViewLoadJs("javascript:window.DPApp && window.DPApp.onDisappear && window.DPApp.onDisappear();" + InjectJs.makeCustomEvent("KNB:disappear", "web view will disappear"), null);
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eba2a8f55ae3fae1a4d3182514466a87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eba2a8f55ae3fae1a4d3182514466a87");
        } else if (!this.hasContainerAdapter) {
            super.onDestroy();
        } else {
            if (this.titansTimingReport != null) {
                this.titansTimingReport.onDestroy();
            }
            FragmentObserveUtil.onContainerDestroy(this.mContainerObservable);
            this.jsHost.getTitansContext().getJsHostCenter().unSubscribeAll(this.jsHost);
            this.baseJsBridgeActions.onDestroy();
            if (this.webView != null) {
                this.webView.removeAllViews();
                this.webView.destroy();
            }
            this.jsHost.onDestroy();
            FragmentAccessTimingUtil.pageEndPoint(this.mPageAccessTimingInfo, "PageAppear", this.pausingTime);
            WeakQuoteUtils.clearCache();
            releaseContainerAdapter();
            super.onDestroy();
        }
    }

    private void releaseContainerAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0cd7b79265fa02e5bb196c044a3a1a5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0cd7b79265fa02e5bb196c044a3a1a5f");
        } else if (this.retainContainerOnDestroy || TextUtils.isEmpty(this.mContainerAdapterKey)) {
        } else {
            ContainerAdapterManager.getInstance().remove(this.mContainerAdapterKey);
        }
    }

    public boolean onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "350477fffae4b8714429d136718efa5a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "350477fffae4b8714429d136718efa5a")).booleanValue();
        }
        IWebChromeClient webChromeClient = this.webView != null ? this.webView.getWebChromeClient() : null;
        if (webChromeClient != null && webChromeClient.isCustomViewShowing()) {
            webChromeClient.onHideCustomView();
            return true;
        } else if (goBack()) {
            if (getInnerDynamicTitleBar() == null && this.titleBar != null) {
                this.titleBar.setTitleBarBtnCloseShow(true);
            }
            return true;
        } else if (this.registeredOnBackPressedListener != null) {
            this.registeredOnBackPressedListener.run();
            return true;
        } else {
            return false;
        }
    }

    private boolean goBack() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c5d849b5c08da10774a880db8d91213", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c5d849b5c08da10774a880db8d91213")).booleanValue();
        }
        if (this.webView == null || !this.webView.canGoBack()) {
            return false;
        }
        FragmentAccessTimingUtil.pageEndPoint(this.mPageAccessTimingInfo, "PageAppear", this.pausingTime);
        this.pausingTime = 0L;
        WebBackForwardList copyBackForwardList = this.webView.copyBackForwardList();
        if (copyBackForwardList != null && copyBackForwardList.getCurrentIndex() > 0) {
            String url = copyBackForwardList.getItemAtIndex(copyBackForwardList.getCurrentIndex() - 1).getUrl();
            if (!TextUtils.isEmpty(url)) {
                String ua = this.mWebPageContext != null ? this.mWebPageContext.getUA() : "";
                TitansWebPageContext titansWebPageContext = new TitansWebPageContext(url, this.mWebPageContext != null ? this.mWebPageContext.getUrl() : "", System.currentTimeMillis(), this.mContainerContext);
                titansWebPageContext.setUrl(url);
                titansWebPageContext.setUA(ua);
                this.mWebPageContext = titansWebPageContext;
                this.jsHost.setPageContext(titansWebPageContext);
                this.mPageAccessTimingInfo = FragmentAccessTimingUtil.initPageAccessTiming(url, null, null, isTitansInitialized, this.mContainerAdapter.scheme());
                FragmentAccessTimingUtil.pageStartPoint(this.mPageAccessTimingInfo);
                FragmentAccessTimingUtil.reportVisitInfo(this.mPageAccessTimingInfo, "goBack");
                if (this.titansTimingReport != null) {
                    this.titansTimingReport.loadUrl(url);
                }
            }
        }
        this.webView.goBack();
        return true;
    }

    private ITitleBar getDefaultTitleBar() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e929a3014e07a1177b60b1a2e7cb78fe", RobustBitConfig.DEFAULT_VALUE)) {
            return (ITitleBar) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e929a3014e07a1177b60b1a2e7cb78fe");
        }
        if (this.titleBar == null) {
            ITitleBar titleBar = this.mContainerAdapter.getTitleBar(getActivity());
            if (titleBar != null) {
                this.titleBar = titleBar;
            } else {
                ITitleBar titleBar2 = Titans.getAppAdaptor().getTitleBar(getActivity());
                if (titleBar2 != null) {
                    this.titleBar = titleBar2;
                } else {
                    this.titleBar = new BaseTitleBar(this.mRootView.getContext());
                }
            }
        }
        return this.titleBar;
    }

    private boolean inflateDynamicTitleBar(DynamicTitleBarEntity dynamicTitleBarEntity) {
        Pair<LineTitleLayout, ZIndexFrameLayout.LayoutParams> parse;
        Object[] objArr = {dynamicTitleBarEntity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46d4799a876051b8338e68efd09d13de", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46d4799a876051b8338e68efd09d13de")).booleanValue();
        }
        if (dynamicTitleBarEntity == null) {
            return false;
        }
        try {
            if (this.inflateTitleBarListener != null) {
                parse = this.inflateTitleBarListener.onInflateDynamicTitleBar(this.jsHost.getActivity(), dynamicTitleBarEntity, this.resourceProvider);
            } else {
                parse = DynamicTitleParser.parse(this.jsHost.getContext(), dynamicTitleBarEntity, this.resourceProvider);
            }
            if (parse != null && parse.first != null) {
                return setInnerDynamicTitleBar((LineTitleLayout) parse.first, (ZIndexFrameLayout.LayoutParams) parse.second);
            }
            return false;
        } catch (Throwable th) {
            this.statisticsService.reportClassError("TitansFragment", "inflateDynamicTitleBar", th);
            return false;
        }
    }

    private void initDebugUrlTv(boolean z) {
        TitansPlugin titansPlugin;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75f0dc6490e465de1d81e928e082750f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75f0dc6490e465de1d81e928e082750f");
            return;
        }
        TextView innerDebugBar = getInnerDebugBar();
        if (innerDebugBar == null) {
            return;
        }
        ITitansDebugDialog titansDebugDialog = TitansDebugManager.getTitansDebugDialog();
        if (titansDebugDialog == null || !this.mContainerAdapter.showDebugBar() || !z) {
            innerDebugBar.setVisibility(8);
            return;
        }
        innerDebugBar.setVisibility(0);
        ArrayList arrayList = new ArrayList();
        if (this.mTitansPlugins != null) {
            for (ITitansPlugin iTitansPlugin : this.mTitansPlugins) {
                if (iTitansPlugin != null && (titansPlugin = (TitansPlugin) iTitansPlugin.getClass().getAnnotation(TitansPlugin.class)) != null) {
                    try {
                        View debugItem = iTitansPlugin.getDebugItem(getActivity());
                        if (debugItem != null) {
                            arrayList.add(debugItem);
                        }
                    } catch (Exception e) {
                        Titans.serviceManager().getStatisticsService().reportErrorInfo(new PluginErrorInfo(LifeCycleType.WebPage, "getDebugItem", titansPlugin.name(), titansPlugin.version(), (String) null, e));
                    }
                }
            }
        }
        innerDebugBar.setOnClickListener(new AnonymousClass9(titansDebugDialog, innerDebugBar, arrayList));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.titans.base.TitansFragment$9  reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass9 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final /* synthetic */ List val$debugItem;
        public final /* synthetic */ TextView val$mTvUrl;
        public final /* synthetic */ ITitansDebugDialog val$titansDebugDialog;

        public AnonymousClass9(ITitansDebugDialog iTitansDebugDialog, TextView textView, List list) {
            this.val$titansDebugDialog = iTitansDebugDialog;
            this.val$mTvUrl = textView;
            this.val$debugItem = list;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d498db65b6bbd673fecc4db0491b114", 4611686018427387906L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d498db65b6bbd673fecc4db0491b114");
            } else {
                this.val$titansDebugDialog.showDebugDialog(new ITitansDebugDialogConfig() { // from class: com.sankuai.titans.base.TitansFragment.9.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.sankuai.titans.debug.adapter.dialog.ITitansDebugDialogConfig
                    public Activity getActivity() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f0bc271d5dfb6ff8a9ba2cfc9d041104", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f0bc271d5dfb6ff8a9ba2cfc9d041104") : TitansFragment.this.getActivity();
                    }

                    @Override // com.sankuai.titans.debug.adapter.dialog.ITitansDebugDialogConfig
                    public View.OnClickListener getRefreshClickListener() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5e56da8124867ccbba38188a6aa3ee81", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5e56da8124867ccbba38188a6aa3ee81") : new View.OnClickListener() { // from class: com.sankuai.titans.base.TitansFragment.9.1.1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // android.view.View.OnClickListener
                            public void onClick(View view2) {
                                Object[] objArr3 = {view2};
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "7ea6492d734ef35a527002197f38a71b", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "7ea6492d734ef35a527002197f38a71b");
                                } else if (TitansFragment.this.webView == null || TitansFragment.this.webView.getUrl() == null) {
                                } else {
                                    TitansFragment.this.webView.reload();
                                }
                            }
                        };
                    }

                    @Override // com.sankuai.titans.debug.adapter.dialog.ITitansDebugDialogConfig
                    public View.OnClickListener getHiddenClickListener() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9d6f6982bc3c1ebc6f721b9f4e3816cd", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9d6f6982bc3c1ebc6f721b9f4e3816cd") : new View.OnClickListener() { // from class: com.sankuai.titans.base.TitansFragment.9.1.2
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // android.view.View.OnClickListener
                            public void onClick(View view2) {
                                Object[] objArr3 = {view2};
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "eb0f88d73427be16c23233ca5cdc1e78", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "eb0f88d73427be16c23233ca5cdc1e78");
                                } else {
                                    AnonymousClass9.this.val$mTvUrl.setVisibility(8);
                                }
                            }
                        };
                    }

                    @Override // com.sankuai.titans.debug.adapter.dialog.ITitansDebugDialogConfig
                    public String getUA() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "15287be841a379dfdf14c9c8ffe9ed51", RobustBitConfig.DEFAULT_VALUE)) {
                            return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "15287be841a379dfdf14c9c8ffe9ed51");
                        }
                        if (TitansFragment.this.webView != null) {
                            return TitansFragment.this.webView.getSettings().getUserAgentString();
                        }
                        return null;
                    }

                    @Override // com.sankuai.titans.debug.adapter.dialog.ITitansDebugDialogConfig
                    public List<View> getDebugItems() {
                        return AnonymousClass9.this.val$debugItem;
                    }

                    @Override // com.sankuai.titans.debug.adapter.dialog.ITitansDebugDialogConfig
                    public String getScheme() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "92112f74d4b3bcf23f7fc16831fcc640", RobustBitConfig.DEFAULT_VALUE)) {
                            return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "92112f74d4b3bcf23f7fc16831fcc640");
                        }
                        if (TitansFragment.this.mContainerAdapter != null) {
                            return TitansFragment.this.mContainerAdapter.scheme();
                        }
                        return null;
                    }

                    @Override // com.sankuai.titans.debug.adapter.dialog.ITitansDebugDialogConfig
                    public String getUrl() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b083af691c5840e7f08b3e13f9e3054d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b083af691c5840e7f08b3e13f9e3054d") : AnonymousClass9.this.val$mTvUrl.getText().toString();
                    }
                });
            }
        }
    }

    private void initLoadingView() {
        View loadingView;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59b0a51792beac6896f352e27e354854", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59b0a51792beac6896f352e27e354854");
            return;
        }
        ILoadingViewTemplate loadingViewTemplate = getLoadingViewTemplate();
        if (loadingViewTemplate == null || (loadingView = loadingViewTemplate.getLoadingView(true, LayoutInflater.from(this.jsHost.getContext()))) == null) {
            return;
        }
        if (loadingView.getParent() != null) {
            ((ViewGroup) loadingView.getParent()).removeView(loadingView);
        }
        boolean isFullscreen = loadingViewTemplate.isFullscreen();
        this.loadingViewContainerFullscreen.setVisibility(isFullscreen ? 0 : 8);
        this.loadingViewContainer.setVisibility(isFullscreen ? 8 : 0);
        if (isFullscreen) {
            this.loadingViewContainerFullscreen.addView(loadingView, new ViewGroup.LayoutParams(-1, -1));
        } else {
            this.loadingViewContainer.addView(loadingView, new ViewGroup.LayoutParams(-1, -1));
        }
        long showDuration = getLoadingViewTemplate().getShowDuration();
        if (showDuration <= 0) {
            showDuration = 5000;
        }
        this.mContainerContext.getTitansContext().getServiceManager().getThreadPoolService().executeOnUIThread(this.dismissLoadingViewTask, showDuration);
    }

    public void setOnInflateTitleBarListener(OnInflateTitleBarListener onInflateTitleBarListener) {
        this.inflateTitleBarListener = onInflateTitleBarListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ITitleBar.TitleBarInitializedEntity makeTitleBarInitializedEntity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b871d436e61d2cf0f05ae4b338509e4", RobustBitConfig.DEFAULT_VALUE)) {
            return (ITitleBar.TitleBarInitializedEntity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b871d436e61d2cf0f05ae4b338509e4");
        }
        ITitleBar.TitleBarInitializedEntity titleBarInitializedEntity = new ITitleBar.TitleBarInitializedEntity();
        titleBarInitializedEntity.setTitle(this.mTitle);
        titleBarInitializedEntity.setThirdParty(this.titansBundle.isThirdParty());
        titleBarInitializedEntity.setTitleBarBgColor(this.titansBundle.getTitleBarBgColor());
        titleBarInitializedEntity.setProgressBarColor(this.titansBundle.getProgressBarColor());
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.sankuai.titans.base.TitansFragment.11
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d389d729e3b5d75079130cc31c006b4a", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d389d729e3b5d75079130cc31c006b4a");
                } else if (TitansFragment.this.registeredOnBackPressedListener != null) {
                    TitansFragment.this.registeredOnBackPressedListener.run();
                } else {
                    TitansFragment.this.performBackPressed();
                }
            }
        };
        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: com.sankuai.titans.base.TitansFragment.12
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2760e9b2a3edf0f5b1cc4b208d8040aa", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2760e9b2a3edf0f5b1cc4b208d8040aa");
                } else {
                    TitansFragment.this.jsHost.getUiManager().onActivityFinish();
                }
            }
        };
        if (this.titansBundle.isThirdParty()) {
            onClickListener = onClickListener2;
        }
        titleBarInitializedEntity.setLlClickListener(onClickListener);
        titleBarInitializedEntity.setLrClickListener(onClickListener2);
        titleBarInitializedEntity.setTitleOnClickListener(this.mTitleOnClickListener);
        return titleBarInitializedEntity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoadingViewTemplate(ILoadingViewTemplate iLoadingViewTemplate) {
        this.loadingViewTemplate = iLoadingViewTemplate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ILoadingViewTemplate getLoadingViewTemplate() {
        return this.loadingViewTemplate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showInnerErrorView(int i, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7f9d905d37cfbbddb054f6b544e396f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7f9d905d37cfbbddb054f6b544e396f");
        } else if (TextUtils.equals(this.jsHost.getHostState().currentDownloadUrl, str2)) {
            setProgressBarVisible(false);
        } else {
            ViewGroup errorLayout = getErrorLayout();
            if (errorLayout == null) {
                return;
            }
            onShowErrorLayout(errorLayout, i, str, str2);
            UIKit.showView(errorLayout);
            UIKit.hideView(this.webView, false);
            setProgressBarVisible(false);
            boolean isShowTitleBarOnReceivedError = this.mContainerAdapter.isShowTitleBarOnReceivedError();
            if (this.dynamicTitleBar != null) {
                this.dynamicTitleBar.setVisibility(isShowTitleBarOnReceivedError ? 0 : 8);
            } else if (this.titleBar != null) {
                this.titleBar.get().setVisibility(isShowTitleBarOnReceivedError ? 0 : 8);
            }
        }
    }

    public void onWebViewTitleReceived(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b51b93ba62bd04e16c7a262b8c5ced32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b51b93ba62bd04e16c7a262b8c5ced32");
        } else if (str == null) {
        } else {
            setTitleImpl(str);
        }
    }

    public void setProgress(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d303f9396ec2e2b0dbf3139b9559bb16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d303f9396ec2e2b0dbf3139b9559bb16");
            return;
        }
        LineTitleLayout innerDynamicTitleBar = getInnerDynamicTitleBar();
        if (innerDynamicTitleBar != null) {
            innerDynamicTitleBar.setProgress(i);
            if (i >= 100) {
                innerDynamicTitleBar.showProgress(false);
            }
        } else if (this.titleBar == null) {
        } else {
            this.titleBar.setProgress(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProgressBarVisible(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e8ed8b7f4dab8da52f9bb25a4677348", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e8ed8b7f4dab8da52f9bb25a4677348");
        } else if (this.dynamicTitleBar != null) {
            this.dynamicTitleBar.showProgress(z);
        } else if (this.titleBar != null) {
            this.titleBar.showProgressBar(z);
        }
    }

    private void onShowErrorLayout(ViewGroup viewGroup, int i, String str, String str2) {
        boolean z = true;
        Object[] objArr = {viewGroup, Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b43e75506e40e4c2b4c176efc9e6975e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b43e75506e40e4c2b4c176efc9e6975e");
        } else if (viewGroup == null) {
        } else {
            int i2 = R.string.titans_service_unavailable;
            try {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) viewGroup.getContext().getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    if (activeNetworkInfo.isConnected()) {
                        z = false;
                    }
                }
            } catch (Exception e) {
                this.statisticsService.reportClassError("TitansFragment", "onShowErrorLayout", e);
            }
            if (z) {
                i2 = R.string.titans_default_error_message;
            }
            TextView textView = (TextView) viewGroup.findViewById(R.id.main_message);
            if (textView != null) {
                textView.setText(i2);
            }
        }
    }

    private ViewGroup getErrorLayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9aa71397a2e32ddec1e4e979d0c5b29", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewGroup) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9aa71397a2e32ddec1e4e979d0c5b29");
        }
        if (this.errorLayout == null) {
            this.errorLayout = initErrorLayout();
        }
        return this.errorLayout;
    }

    private ViewGroup initErrorLayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5880fbed2dace37be4a884bbbc9e9e43", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewGroup) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5880fbed2dace37be4a884bbbc9e9e43");
        }
        FrameLayout frameLayout = (FrameLayout) this.mRootView.findViewById(R.id.titans_error_layout);
        LayoutInflater.from(this.mRootView.getContext()).inflate(this.mContainerAdapter.getNetworkErrorLayoutId() == -1 ? R.layout.titans_network_error_layout : this.mContainerAdapter.getNetworkErrorLayoutId(), (ViewGroup) frameLayout, true).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.titans.base.TitansFragment.13
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f0c9f56d39cf9af2702ef9dc5818f66c", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f0c9f56d39cf9af2702ef9dc5818f66c");
                    return;
                }
                if (TitansFragment.this.webView != null) {
                    TitansFragment.this.webView.reload();
                }
                TitansFragment.this.hideErrorLayout();
            }
        });
        return frameLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideErrorLayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14c525597ce12db898768abc8a91bfbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14c525597ce12db898768abc8a91bfbb");
        } else if (this.errorLayout == null) {
        } else {
            UIKit.hideView(this.errorLayout, true);
            UIKit.showView(this.webView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleImpl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "73799f2ab121c252a264def342b73f46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "73799f2ab121c252a264def342b73f46");
            return;
        }
        LineTitleLayout innerDynamicTitleBar = getInnerDynamicTitleBar();
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        if (innerDynamicTitleBar != null) {
            View primaryView = innerDynamicTitleBar.getPrimaryView();
            if (primaryView instanceof TextView) {
                ((TextView) primaryView).setText(str);
            }
        } else if (this.titleBar == null || this.titleBar.getTitleContent() == null) {
        } else {
            this.titleBar.getTitleContent().setTitleText(str);
        }
    }

    private void setupDynamicTitleBar(LineTitleLayout lineTitleLayout) {
        Object[] objArr = {lineTitleLayout};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65b722fbde55625c5ae4a60e68730a28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65b722fbde55625c5ae4a60e68730a28");
        } else if (lineTitleLayout != null) {
            String[] strArr = {"back", ACTION_CLOSE, ACTION_RELOAD, "custom"};
            LineTitleLayout.OnElementClickListener onElementClickListener = new LineTitleLayout.OnElementClickListener() { // from class: com.sankuai.titans.base.TitansFragment.14
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
                    if (r15.equals(com.sankuai.titans.base.TitansFragment.ACTION_RELOAD) != false) goto L17;
                 */
                @Override // com.sankuai.titans.base.titlebar.LineTitleLayout.OnElementClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public boolean onClick(android.view.View r14, java.lang.String r15) {
                    /*
                        r13 = this;
                        r0 = 2
                        java.lang.Object[] r8 = new java.lang.Object[r0]
                        r9 = 0
                        r8[r9] = r14
                        r10 = 1
                        r8[r10] = r15
                        com.meituan.robust.ChangeQuickRedirect r11 = com.sankuai.titans.base.TitansFragment.AnonymousClass14.changeQuickRedirect
                        java.lang.String r12 = "041ae0803a71e52037054f50ec721f49"
                        r4 = 0
                        r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                        r1 = r8
                        r2 = r13
                        r3 = r11
                        r5 = r12
                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                        if (r1 == 0) goto L25
                        java.lang.Object r14 = com.meituan.robust.PatchProxy.accessDispatch(r8, r13, r11, r9, r12)
                        java.lang.Boolean r14 = (java.lang.Boolean) r14
                        boolean r14 = r14.booleanValue()
                        return r14
                    L25:
                        r1 = -1
                        int r2 = r15.hashCode()
                        r3 = -1349088399(0xffffffffaf968b71, float:-2.738392E-10)
                        if (r2 == r3) goto L5d
                        r3 = -934641255(0xffffffffc84a8199, float:-207366.39)
                        if (r2 == r3) goto L53
                        r0 = 3015911(0x2e04e7, float:4.226191E-39)
                        if (r2 == r0) goto L49
                        r0 = 94756344(0x5a5ddf8, float:1.5598064E-35)
                        if (r2 == r0) goto L3f
                        goto L67
                    L3f:
                        java.lang.String r0 = "close"
                        boolean r15 = r15.equals(r0)
                        if (r15 == 0) goto L67
                        r0 = 1
                        goto L68
                    L49:
                        java.lang.String r0 = "back"
                        boolean r15 = r15.equals(r0)
                        if (r15 == 0) goto L67
                        r0 = 0
                        goto L68
                    L53:
                        java.lang.String r2 = "reload"
                        boolean r15 = r15.equals(r2)
                        if (r15 == 0) goto L67
                        goto L68
                    L5d:
                        java.lang.String r0 = "custom"
                        boolean r15 = r15.equals(r0)
                        if (r15 == 0) goto L67
                        r0 = 3
                        goto L68
                    L67:
                        r0 = -1
                    L68:
                        switch(r0) {
                            case 0: goto Lbc;
                            case 1: goto Lae;
                            case 2: goto L9c;
                            case 3: goto L6c;
                            default: goto L6b;
                        }
                    L6b:
                        return r9
                    L6c:
                        org.json.JSONObject r15 = new org.json.JSONObject
                        r15.<init>()
                        java.lang.String r0 = "name"
                        android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()     // Catch: org.json.JSONException -> L80
                        com.sankuai.titans.base.titlebar.LineTitleLayoutParams r14 = (com.sankuai.titans.base.titlebar.LineTitleLayoutParams) r14     // Catch: org.json.JSONException -> L80
                        java.lang.String r14 = r14.name     // Catch: org.json.JSONException -> L80
                        r15.put(r0, r14)     // Catch: org.json.JSONException -> L80
                        goto L8f
                    L80:
                        r14 = move-exception
                        com.sankuai.titans.base.TitansFragment r0 = com.sankuai.titans.base.TitansFragment.this
                        com.sankuai.titans.protocol.services.IStatisticsService r0 = com.sankuai.titans.base.TitansFragment.access$2800(r0)
                        java.lang.String r1 = "TitansFragment"
                        java.lang.String r2 = "setupDynamicTitleBar"
                        r0.reportClassError(r1, r2, r14)
                    L8f:
                        com.sankuai.titans.base.TitansFragment r14 = com.sankuai.titans.base.TitansFragment.this
                        java.lang.String r0 = "KNB:titleBarClicked"
                        java.lang.String r15 = com.sankuai.titans.base.utils.InjectJs.makeCustomEvent(r0, r15)
                        r0 = 0
                        r14.webViewLoadJs(r15, r0)
                        return r10
                    L9c:
                        com.sankuai.titans.base.TitansFragment r14 = com.sankuai.titans.base.TitansFragment.this
                        com.sankuai.titans.base.WebView r14 = com.sankuai.titans.base.TitansFragment.access$700(r14)
                        if (r14 == 0) goto Lad
                        com.sankuai.titans.base.TitansFragment r14 = com.sankuai.titans.base.TitansFragment.this
                        com.sankuai.titans.base.WebView r14 = com.sankuai.titans.base.TitansFragment.access$700(r14)
                        r14.reload()
                    Lad:
                        return r10
                    Lae:
                        com.sankuai.titans.base.TitansFragment r14 = com.sankuai.titans.base.TitansFragment.this
                        com.sankuai.titans.base.JsHost r14 = com.sankuai.titans.base.TitansFragment.access$900(r14)
                        com.sankuai.titans.protocol.webcompat.jshost.IUIManager r14 = r14.getUiManager()
                        r14.onActivityFinish()
                        return r10
                    Lbc:
                        com.sankuai.titans.base.TitansFragment r14 = com.sankuai.titans.base.TitansFragment.this
                        com.sankuai.titans.base.TitansFragment.access$2600(r14)
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sankuai.titans.base.TitansFragment.AnonymousClass14.onClick(android.view.View, java.lang.String):boolean");
                }
            };
            for (int i = 0; i < 4; i++) {
                String str = strArr[i];
                if (lineTitleLayout.getOnElementClickListener(str) == null) {
                    lineTitleLayout.setOnElementClickListener(str, onElementClickListener);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void performBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b74dbbc6a874b8a04abee8b0b7738cba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b74dbbc6a874b8a04abee8b0b7738cba");
        } else {
            Titans.serviceManager().getThreadPoolService().executeOnThreadPool("performBackPress", new Runnable() { // from class: com.sankuai.titans.base.TitansFragment.15
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c9c49f7b6a5e7b71f33856f9e0bc34da", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c9c49f7b6a5e7b71f33856f9e0bc34da");
                        return;
                    }
                    try {
                        new Instrumentation().sendKeyDownUpSync(4);
                    } catch (Throwable th) {
                        TitansFragment.this.statisticsService.reportClassError("TitansFragment", "performBackPressed", th);
                    }
                }
            });
        }
    }

    public void webViewLoadJs(final String str, final ValueCallback<?> valueCallback) {
        Object[] objArr = {str, valueCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46d343ce78c8dfa7c637f7b40839c1e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46d343ce78c8dfa7c637f7b40839c1e8");
        } else if (!AppUtils.isActivityAlive(getActivity()) || this.webView == null || TextUtils.isEmpty(str) || !str.startsWith(TitansConstants.JAVASCRIPT_PREFIX)) {
        } else {
            Runnable runnable = new Runnable() { // from class: com.sankuai.titans.base.TitansFragment.16
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7c78f928ecb5af7c6df45dea45846477", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7c78f928ecb5af7c6df45dea45846477");
                        return;
                    }
                    try {
                        if (!AppUtils.isActivityAlive(TitansFragment.this.getActivity()) || TitansFragment.this.webView == null) {
                            return;
                        }
                        TitansFragment.this.webView.evaluateJavascript(str.substring(11), valueCallback);
                    } catch (Throwable th) {
                        if (TitansFragment.this.webView != null) {
                            TitansFragment.this.webView.loadUrl(str);
                        }
                        TitansFragment.this.statisticsService.reportClassError("TitansFragment", "webViewLoadJs", th);
                    }
                }
            };
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                Titans.serviceManager().getThreadPoolService().executeOnUIThread(runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TextView getInnerDebugBar() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "43af86a11a5a3a5434cd330f81eaa8e9", RobustBitConfig.DEFAULT_VALUE)) {
            return (TextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "43af86a11a5a3a5434cd330f81eaa8e9");
        }
        if (this.debugBar == null) {
            this.debugBar = (TextView) this.mRootView.findViewById(R.id.titans_debug_bar);
        }
        return this.debugBar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public LineTitleLayout getInnerDynamicTitleBar() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e3dbc8110751d353a3044ffc2084068", RobustBitConfig.DEFAULT_VALUE)) {
            return (LineTitleLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e3dbc8110751d353a3044ffc2084068");
        }
        if (this.titansBundle.hasDynamicTitleBar()) {
            return this.dynamicTitleBar;
        }
        return null;
    }

    public boolean setInnerDynamicTitleBar(LineTitleLayout lineTitleLayout, ZIndexFrameLayout.LayoutParams layoutParams) {
        Object[] objArr = {lineTitleLayout, layoutParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0df563155934a20ea5485d68eb3a2187", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0df563155934a20ea5485d68eb3a2187")).booleanValue();
        }
        if (!this.titansBundle.hasDynamicTitleBar() || lineTitleLayout == null) {
            return false;
        }
        LineTitleLayout innerDynamicTitleBar = getInnerDynamicTitleBar();
        if (innerDynamicTitleBar != null) {
            this.titleBarContainer.removeView(innerDynamicTitleBar);
        }
        if (this.shadowView != null) {
            this.shadowView.setVisibility(8);
        }
        this.dynamicTitleBar = lineTitleLayout;
        this.titleBarContainer.removeAllViews();
        this.titleBarContainer.addView(lineTitleLayout, layoutParams);
        setupDynamicTitleBar(lineTitleLayout);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class TitansWebChromeClientListener implements WebChromeClient.WebChromeClientListener {
        private static final String KNB_NO_ROTATE = "KNBNoRotate";
        public static ChangeQuickRedirect changeQuickRedirect;
        private final Activity activity;
        private final Context context;
        private View mCustomView;
        private WebChromeClient.CustomViewCallback mCustomViewCallback;

        public TitansWebChromeClientListener(Context context, Activity activity) {
            Object[] objArr = {TitansFragment.this, context, activity};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8410aa41373f602a88fa82c46e8e44a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8410aa41373f602a88fa82c46e8e44a");
                return;
            }
            this.context = context;
            this.activity = activity;
        }

        @Override // com.sankuai.titans.base.WebChromeClient.WebChromeClientListener
        public void onProgressChanged(IWebView iWebView, int i) {
            Object[] objArr = {iWebView, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89d2f541fbf479d55c8552c2890081e9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89d2f541fbf479d55c8552c2890081e9");
                return;
            }
            TitansFragment.this.setProgress(i);
            if (i == 100) {
                FragmentAccessTimingUtil.reportVisitInfo(TitansFragment.this.mPageAccessTimingInfo, "onProgressComplete");
            }
        }

        @Override // com.sankuai.titans.base.WebChromeClient.WebChromeClientListener
        public void onReceivedTitle(IWebView iWebView, String str) {
            Object[] objArr = {iWebView, str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "18ee018c4f90be34924bda7c5451317e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "18ee018c4f90be34924bda7c5451317e");
            } else {
                TitansFragment.this.onWebViewTitleReceived(str);
            }
        }

        @Override // com.sankuai.titans.base.WebChromeClient.WebChromeClientListener
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            Object[] objArr = {view, customViewCallback};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51f58c03e49c9e12d30a6b42e6372366", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51f58c03e49c9e12d30a6b42e6372366");
            } else if (AppUtils.isActivityAlive(this.activity)) {
                if (this.mCustomView != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                this.mCustomView = view;
                this.mCustomViewCallback = customViewCallback;
                UIKit.hideView(TitansFragment.this.mainLayout, true);
                TitansFragment.this.videoLayout = TitansFragment.this.getInnerVideoLayout();
                if (TitansFragment.this.videoLayout.getChildCount() > 0) {
                    TitansFragment.this.videoLayout.removeAllViews();
                }
                TitansFragment.this.videoLayout.addView(this.mCustomView);
                UIKit.showView(TitansFragment.this.videoLayout);
                handleNoRotate(this.activity, TitansFragment.this.jsHost.getPageContext().getOriginalUrl(), true);
                this.activity.getWindow().setFlags(1024, 1024);
            }
        }

        @Override // com.sankuai.titans.base.WebChromeClient.WebChromeClientListener
        public void onHideCustomView() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b2ae7203a624b8dbd5fbcbb7913bbf6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b2ae7203a624b8dbd5fbcbb7913bbf6");
                return;
            }
            UIKit.showView(TitansFragment.this.mainLayout);
            if (this.mCustomView == null) {
                return;
            }
            this.mCustomView = null;
            UIKit.hideView(TitansFragment.this.videoLayout, true);
            this.mCustomViewCallback.onCustomViewHidden();
            if (AppUtils.isActivityAlive(this.activity)) {
                handleNoRotate(this.activity, TitansFragment.this.jsHost.getPageContext().getOriginalUrl(), false);
                WindowManager.LayoutParams attributes = this.activity.getWindow().getAttributes();
                attributes.flags &= -1025;
                this.activity.getWindow().setAttributes(attributes);
            }
        }

        @Override // com.sankuai.titans.base.WebChromeClient.WebChromeClientListener
        public boolean isCustomViewShowing() {
            return this.mCustomView != null;
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0091 A[SYNTHETIC] */
        @Override // com.sankuai.titans.base.WebChromeClient.WebChromeClientListener
        @android.support.annotation.RequiresApi(api = 21)
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
                com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.titans.base.TitansFragment.TitansWebChromeClientListener.changeQuickRedirect
                java.lang.String r11 = "a2e3e74e16fa94d09025d0c1207bc11d"
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
                android.app.Activity r1 = r12.activity
                boolean r1 = com.sankuai.titans.protocol.utils.AppUtils.isActivityAlive(r1)
                if (r1 != 0) goto L27
                r13.deny()
                return
            L27:
                java.lang.String[] r1 = r13.getResources()
                if (r1 == 0) goto Lac
                int r1 = r1.length
                if (r1 != 0) goto L32
                goto Lac
            L32:
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.lang.String[] r3 = r13.getResources()
                int r4 = r3.length
                r5 = 0
            L42:
                if (r5 >= r4) goto L94
                r6 = r3[r5]
                if (r6 == 0) goto L91
                r7 = -1
                int r8 = r6.hashCode()
                r10 = -1660821873(0xffffffff9d01de8f, float:-1.7188068E-21)
                if (r8 == r10) goto L71
                r10 = 968612586(0x39bbdaea, float:3.5830523E-4)
                if (r8 == r10) goto L67
                r10 = 1233677653(0x49886d55, float:1117610.6)
                if (r8 == r10) goto L5d
                goto L7b
            L5d:
                java.lang.String r8 = "android.webkit.resource.MIDI_SYSEX"
                boolean r6 = r6.equals(r8)
                if (r6 == 0) goto L7b
                r6 = 2
                goto L7c
            L67:
                java.lang.String r8 = "android.webkit.resource.AUDIO_CAPTURE"
                boolean r6 = r6.equals(r8)
                if (r6 == 0) goto L7b
                r6 = 1
                goto L7c
            L71:
                java.lang.String r8 = "android.webkit.resource.VIDEO_CAPTURE"
                boolean r6 = r6.equals(r8)
                if (r6 == 0) goto L7b
                r6 = 0
                goto L7c
            L7b:
                r6 = -1
            L7c:
                switch(r6) {
                    case 0: goto L8c;
                    case 1: goto L86;
                    case 2: goto L80;
                    default: goto L7f;
                }
            L7f:
                goto L91
            L80:
                java.lang.String r6 = "android.permission.BIND_MIDI_DEVICE_SERVICE"
                r2.add(r6)
                goto L91
            L86:
                java.lang.String r6 = "Microphone"
                r1.add(r6)
                goto L91
            L8c:
                java.lang.String r6 = "Camera"
                r1.add(r6)
            L91:
                int r5 = r5 + 1
                goto L42
            L94:
                boolean r0 = r1.isEmpty()
                if (r0 == 0) goto L9e
                r13.deny()
                return
            L9e:
                android.app.Activity r0 = r12.activity
                java.lang.String r3 = "pt-572df3720da87bef"
                com.sankuai.titans.base.TitansFragment$TitansWebChromeClientListener$1 r4 = new com.sankuai.titans.base.TitansFragment$TitansWebChromeClientListener$1
                r4.<init>()
                com.sankuai.titans.result.TitansPermissionUtil.requestPermissions(r0, r1, r3, r4)
                return
            Lac:
                r13.deny()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.titans.base.TitansFragment.TitansWebChromeClientListener.onPermissionRequest(android.webkit.PermissionRequest):void");
        }

        @Override // com.sankuai.titans.base.WebChromeClient.WebChromeClientListener
        public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
            Object[] objArr = {valueCallback, str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed0e56582e6914393a4a21a8009dcea5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed0e56582e6914393a4a21a8009dcea5");
            } else if (AppUtils.isActivityAlive(this.activity) && !FragmentObserveUtil.openFileChooser(TitansFragment.this.mWebPageObservable, valueCallback, str, str2)) {
                TitansFragment.this.mUploadMessage = valueCallback;
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.addCategory("android.intent.category.OPENABLE");
                if (TextUtils.isEmpty(str)) {
                    intent.setType("*/*");
                } else {
                    intent.setType(str);
                }
                this.activity.startActivityForResult(Intent.createChooser(intent, this.context.getString(R.string.titans_image_chooser)), 111);
            }
        }

        @Override // com.sankuai.titans.base.WebChromeClient.WebChromeClientListener
        @Nullable
        public View getVideoLoadingProgressView() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ac6259bc5f181eaf4b1b2b806414354", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ac6259bc5f181eaf4b1b2b806414354") : LayoutInflater.from(this.context).inflate(R.layout.titans_loading_item, (ViewGroup) null);
        }

        @Override // com.sankuai.titans.base.WebChromeClient.WebChromeClientListener
        public void onGeolocationPermissionsShowPrompt(final String str, final GeolocationPermissions.Callback callback) {
            Object[] objArr = {str, callback};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "633d4e27d67751304f98af4b3f3bca68", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "633d4e27d67751304f98af4b3f3bca68");
            } else if (AppUtils.isActivityAlive(this.activity)) {
                Context applicationContext = this.activity.getApplicationContext();
                AlertDialog.Builder builder = new AlertDialog.Builder(this.activity);
                builder.setTitle(applicationContext.getString(R.string.titans_reminder));
                builder.setMessage(String.format(applicationContext.getString(R.string.titans_whether_access_location), str));
                builder.setPositiveButton(applicationContext.getString(R.string.titans_allow), new DialogInterface.OnClickListener() { // from class: com.sankuai.titans.base.TitansFragment.TitansWebChromeClientListener.2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "834f933b9aedef83189363de60da7e73", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "834f933b9aedef83189363de60da7e73");
                        } else {
                            callback.invoke(str, true, false);
                        }
                    }
                });
                builder.setNegativeButton(applicationContext.getString(R.string.titans_not_allow), new DialogInterface.OnClickListener() { // from class: com.sankuai.titans.base.TitansFragment.TitansWebChromeClientListener.3
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "62b1323d68cd98567a79763c4a208a00", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "62b1323d68cd98567a79763c4a208a00");
                        } else {
                            callback.invoke(str, false, false);
                        }
                    }
                });
                builder.setCancelable(true);
                try {
                    builder.show();
                } catch (Exception e) {
                    TitansFragment.this.statisticsService.reportClassError("TitansFragment", "onGeolocationPermissionsShowPrompt", e);
                }
            }
        }

        @Override // com.sankuai.titans.base.WebChromeClient.WebChromeClientListener
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            Object[] objArr = {consoleMessage};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b42c346a2ba6ea302d9898d99535441", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b42c346a2ba6ea302d9898d99535441")).booleanValue() : FragmentObserveUtil.onConsoleMessage(TitansFragment.this.mWebPageObservable, consoleMessage);
        }

        @Override // com.sankuai.titans.base.WebChromeClient.WebChromeClientListener
        public void onJsPrompt(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1ce34b7e8c4979147bcc669d1a6d6b4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1ce34b7e8c4979147bcc669d1a6d6b4");
                return;
            }
            String url = TitansFragment.this.mWebPageContext != null ? TitansFragment.this.mWebPageContext.getUrl() : "unknown";
            HashMap hashMap = new HashMap();
            hashMap.put("case", "使用JSPrompt方式调桥");
            hashMap.put("url", url);
            hashMap.put(DeviceInfo.TM, Long.valueOf(System.currentTimeMillis()));
            Titans.getAppAdaptor().getServiceManager().getStatisticsService().reportGeneralInfo(hashMap);
            if (Titans.getAppAdaptor().getAppInfo().isDebugMode()) {
                IToastService toastService = Titans.getAppAdaptor().getServiceManager().getToastService();
                Activity activity = TitansFragment.this.mWebPageContext.getContainerContext().getActivity();
                toastService.showLongToast(activity, "该页面存在使用JSPrompt方式调用桥的情况，请尽快排查，桥调用：" + str);
            }
            KNBInterface.createJsHandler(TitansFragment.this.jsHost, Titans.getAppAdaptor().getServiceManager().getJsBridgeVerificationService(), str);
        }

        @Override // com.sankuai.titans.base.WebChromeClient.WebChromeClientListener
        @RequiresApi(api = 21)
        public boolean onShowFileChooser(IWebView iWebView, final ValueCallback<Uri[]> valueCallback, final WebChromeClient.FileChooserParams fileChooserParams) {
            Object[] objArr = {iWebView, valueCallback, fileChooserParams};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4cb9fa883f69b6f2c9b8b978b758b243", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4cb9fa883f69b6f2c9b8b978b758b243")).booleanValue();
            }
            if (AppUtils.isActivityAlive(this.activity)) {
                if (FragmentObserveUtil.onShowFileChooser(TitansFragment.this.mWebPageObservable, iWebView, valueCallback, fileChooserParams)) {
                    return true;
                }
                TitansFragment.this.mUploadCallbackAboveLollipop = valueCallback;
                TitansFragment.this.mFileChooserParams = fileChooserParams;
                ArrayList arrayList = new ArrayList();
                arrayList.add(PermissionGuard.PERMISSION_CAMERA);
                arrayList.add(PermissionGuard.PERMISSION_STORAGE);
                TitansPermissionUtil.requestPermissions(this.activity, arrayList, "pt-ff6806d93a784560", new IRequestPermissionCallback() { // from class: com.sankuai.titans.base.TitansFragment.TitansWebChromeClientListener.4
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.sankuai.titans.result.IRequestPermissionCallback
                    public void onResult(boolean z, int i) {
                        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1e98394e68d632d091024451c27e5dfc", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1e98394e68d632d091024451c27e5dfc");
                        } else if (z) {
                            try {
                                ShowFileChooserUtils.showFileChooserImplNew(TitansWebChromeClientListener.this.activity, fileChooserParams);
                            } catch (Exception e) {
                                TitansFragment.this.statisticsService.reportClassError("TitansFragment", "onShowFileChooser@LOLLIPOP", e);
                            }
                        } else {
                            valueCallback.onReceiveValue(null);
                        }
                    }
                });
                return true;
            }
            return false;
        }

        @SuppressLint({"SourceLockedOrientationActivity"})
        private void handleNoRotate(Activity activity, String str, boolean z) {
            Object[] objArr = {activity, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e6c2b867b4ad3815572d8226d0155561", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e6c2b867b4ad3815572d8226d0155561");
            } else if (str == null || "1".equals(Uri.parse(str).getQueryParameter(KNB_NO_ROTATE))) {
            } else {
                if (z) {
                    activity.setRequestedOrientation(0);
                } else {
                    activity.setRequestedOrientation(1);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class TitansWebViewClientListener implements WebViewClient.WebViewClientListener {
        private static final String FAVICON = "/favicon.ico";
        public static ChangeQuickRedirect changeQuickRedirect;

        public TitansWebViewClientListener() {
            Object[] objArr = {TitansFragment.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "adaec1a340999a0c9d7d9fe0f14f3ea1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "adaec1a340999a0c9d7d9fe0f14f3ea1");
            }
        }

        @Override // com.sankuai.titans.base.WebViewClient.WebViewClientListener
        public long obtainPageStartedTime() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52ab1cc54bf53a3f375fe5d1a64cfa9a", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52ab1cc54bf53a3f375fe5d1a64cfa9a")).longValue() : TitansFragment.this.mPageStartedTime;
        }

        /* JADX WARN: Code restructure failed: missing block: B:51:0x01e3, code lost:
            if (android.text.TextUtils.equals(r1 + r2, "m.dianping.com/synthesis/shortlink") != false) goto L59;
         */
        /* JADX WARN: Removed duplicated region for block: B:55:0x01ea  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0246  */
        @Override // com.sankuai.titans.base.WebViewClient.WebViewClientListener
        @java.lang.Deprecated
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean shouldOverrideUrlLoading(final com.sankuai.titans.protocol.webcompat.IWebView r13, java.lang.String r14) {
            /*
                Method dump skipped, instructions count: 614
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.titans.base.TitansFragment.TitansWebViewClientListener.shouldOverrideUrlLoading(com.sankuai.titans.protocol.webcompat.IWebView, java.lang.String):boolean");
        }

        @Override // com.sankuai.titans.base.WebViewClient.WebViewClientListener
        public void onPageStarted(IWebView iWebView, String str, Bitmap bitmap) {
            boolean z = true;
            Object[] objArr = {iWebView, str, bitmap};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "83451781b3bb1368c873ce173b108937", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "83451781b3bb1368c873ce173b108937");
                return;
            }
            if (TitansFragment.this.titansTimingReport != null) {
                TitansFragment.this.titansTimingReport.onPageStart(str);
            }
            FragmentAccessTimingUtil.reportVisitInfo(TitansFragment.this.mPageAccessTimingInfo, "onPageStarted");
            if (Titans.serviceManager().getJsBridgeVerificationService() != null) {
                Titans.serviceManager().getJsBridgeVerificationService().init(Titans.getTitansContext().getAppInfo(), Titans.getTitansContext().getApplicationContext(), str);
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put(SnifferDBHelper.COLUMN_LOG, "getJsBridgeVerificationService returns null");
                Titans.serviceManager().getStatisticsService().reportClassError("TitansFragment", "onPageStarted", null, hashMap);
            }
            TitansFragment.this.mPageStartedTime = System.currentTimeMillis();
            TitansFragment.this.jsHost.getBridgeManager().removeAllJsHandler();
            TitansFragment.this.getInnerDebugBar().setText(str);
            if (TitansFragment.this.mWebPageContext == null || TextUtils.isEmpty(TitansFragment.this.mWebPageContext.getOriginalUrl()) || !TitansFragment.this.mWebPageContext.getOriginalUrl().equals(str)) {
                TitansFragment.this.mWebPageContext = new TitansWebPageContext(str, null, TitansFragment.this.mPageStartedTime, TitansFragment.this.mContainerContext);
            }
            if (!TitansFragment.this.mIsFirstPageStarted) {
                TitansFragment.this.mIsFirstPageStarted = true;
            } else if (TitansFragment.this.getInnerDynamicTitleBar() == null && TitansFragment.this.titleBar != null) {
                ViewGroup.LayoutParams layoutParams = TitansFragment.this.mainLayout.getLayoutParams();
                if (layoutParams.height != -1) {
                    ViewPropertyAnimator animate = TitansFragment.this.mainLayout.animate();
                    if (animate != null) {
                        animate.cancel();
                    }
                    layoutParams.height = -1;
                    TitansFragment.this.mainLayout.setY(0.0f);
                    TitansFragment.this.mainLayout.setLayoutParams(layoutParams);
                }
                TitansFragment.this.titleBar.initialized(TitansFragment.this.makeTitleBarInitializedEntity(), Titans.serviceManager(), TitansFragment.this.titansUISettings, (TitansFragment.this.mContainerAdapter.showTitleBar() && TitansFragment.this.titansBundle.hasTitleBar()) ? false : false);
            }
            FragmentObserveUtil.onWebPageStarted(TitansFragment.this.mWebPageObservable, str, bitmap);
        }

        @Override // com.sankuai.titans.base.WebViewClient.WebViewClientListener
        public void onPageFinished(IWebView iWebView, String str) {
            Object[] objArr = {iWebView, str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f8028363aa2bd705ac3cebdc8f41d16d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f8028363aa2bd705ac3cebdc8f41d16d");
                return;
            }
            if (TitansFragment.this.titansTimingReport != null) {
                TitansFragment.this.titansTimingReport.onPageFinish(str);
            }
            FragmentObserveUtil.onWebPageFinish(TitansFragment.this.mWebPageObservable);
            FragmentAccessTimingUtil.reportVisitInfo(TitansFragment.this.mPageAccessTimingInfo, "onPageFinished");
            TitansFragment.this.webViewLoadJs(InjectJs.makeCustomEvent(new JsCustomEvent("titans-timestamp", PerformanceAnalysis.getInstance().getTimeStamp())), null);
            TitansFragment.this.mContainerAccessTimingInfo = null;
        }

        @Override // com.sankuai.titans.base.WebViewClient.WebViewClientListener
        public WebResourceResponse shouldInterceptRequest(IWebView iWebView, String str) {
            Object[] objArr = {iWebView, str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d08123732dfaa2c28f4739badfb0dce", RobustBitConfig.DEFAULT_VALUE)) {
                return (WebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d08123732dfaa2c28f4739badfb0dce");
            }
            if (str.toLowerCase().endsWith(FAVICON)) {
                try {
                    return new WebResourceResponse("image/png", null, null);
                } catch (Exception unused) {
                }
            }
            WebResourceResponse onWebShouldInterceptRequest = FragmentObserveUtil.onWebShouldInterceptRequest(TitansFragment.this.mWebPageObservable, str);
            if (onWebShouldInterceptRequest != null) {
                FragmentObserveUtil.onReceivedWebResourceResponse(TitansFragment.this.mWebPageObservable, str);
            }
            return onWebShouldInterceptRequest;
        }

        @Override // com.sankuai.titans.base.WebViewClient.WebViewClientListener
        @RequiresApi(api = 21)
        public WebResourceResponse shouldInterceptRequest(IWebView iWebView, WebResourceRequest webResourceRequest) {
            Object[] objArr = {iWebView, webResourceRequest};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "29ad4704371d3ea6708aad1bd29f53d8", RobustBitConfig.DEFAULT_VALUE)) {
                return (WebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "29ad4704371d3ea6708aad1bd29f53d8");
            }
            if (!webResourceRequest.isForMainFrame()) {
                String path = webResourceRequest.getUrl().getPath();
                if (!TextUtils.isEmpty(path) && path.endsWith(FAVICON)) {
                    try {
                        return new WebResourceResponse("image/png", null, 200, "", null, null);
                    } catch (Exception unused) {
                    }
                }
            }
            WebResourceResponse onWebShouldInterceptRequest = FragmentObserveUtil.onWebShouldInterceptRequest(TitansFragment.this.mWebPageObservable, webResourceRequest);
            if (onWebShouldInterceptRequest != null) {
                FragmentObserveUtil.onReceivedWebResourceResponse(TitansFragment.this.mWebPageObservable, webResourceRequest.getUrl().toString());
            }
            return onWebShouldInterceptRequest;
        }

        @Override // com.sankuai.titans.base.WebViewClient.WebViewClientListener
        @RequiresApi(api = 23)
        @Deprecated
        public void onReceivedError(IWebView iWebView, int i, String str, String str2) {
            Object[] objArr = {iWebView, Integer.valueOf(i), str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "480ca918eb81ef67d1d8ac22c1abf126", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "480ca918eb81ef67d1d8ac22c1abf126");
                return;
            }
            TitansFragment.this.showInnerErrorView(i, str, str2);
            FragmentObserveUtil.onWebReceivedError(TitansFragment.this.mWebPageObservable, i, str, str2);
            TitansFragment.this.setProgressBarVisible(false);
        }

        @Override // com.sankuai.titans.base.WebViewClient.WebViewClientListener
        @RequiresApi(api = 23)
        public void onReceivedError(IWebView iWebView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            Object[] objArr = {iWebView, webResourceRequest, webResourceError};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4655fb4ab8dde0205fbc5b848b2fcef7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4655fb4ab8dde0205fbc5b848b2fcef7");
                return;
            }
            if (webResourceRequest.isForMainFrame()) {
                TitansFragment.this.showInnerErrorView(webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
            }
            FragmentObserveUtil.onWebReceivedError(TitansFragment.this.mWebPageObservable, webResourceRequest, webResourceError);
            TitansFragment.this.setProgressBarVisible(false);
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0102  */
        @Override // com.sankuai.titans.base.WebViewClient.WebViewClientListener
        @android.support.annotation.RequiresApi(api = 23)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onReceivedHttpError(com.sankuai.titans.protocol.webcompat.IWebView r19, android.webkit.WebResourceRequest r20, android.webkit.WebResourceResponse r21) {
            /*
                Method dump skipped, instructions count: 333
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.titans.base.TitansFragment.TitansWebViewClientListener.onReceivedHttpError(com.sankuai.titans.protocol.webcompat.IWebView, android.webkit.WebResourceRequest, android.webkit.WebResourceResponse):void");
        }

        @Override // com.sankuai.titans.base.WebViewClient.WebViewClientListener
        public void onReceivedSslError(IWebView iWebView, SslErrorHandler sslErrorHandler, SslError sslError) {
            String str;
            String str2;
            Object[] objArr = {iWebView, sslErrorHandler, sslError};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a363e7140c8bb213a453d4c6cb5b0a21", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a363e7140c8bb213a453d4c6cb5b0a21");
            } else if (FragmentObserveUtil.onWebReceivedSslError(TitansFragment.this.mWebPageObservable, sslErrorHandler, sslError)) {
                sslErrorHandler.proceed();
            } else {
                sslErrorHandler.cancel();
                String url = TitansFragment.this.mWebPageContext != null ? TitansFragment.this.mWebPageContext.getUrl() : "";
                if (TextUtils.isEmpty(url) || !url.equals(sslError.getUrl()) || url.contains("https://static.meituan.net/bs/mbs-pages/master/error.html")) {
                    return;
                }
                Locale locale = Locale.getDefault();
                String language = locale.getLanguage();
                String script = Build.VERSION.SDK_INT >= 21 ? locale.getScript() : "";
                String country = locale.getCountry();
                try {
                    str = String.format("错误码：%1$s<br>页面：%2$s<br>资源：%3$s", Integer.valueOf(sslError.getPrimaryError()), UrlUtils.clearQueryAndFragment(url), UrlUtils.clearQueryAndFragment(sslError.getUrl()));
                    try {
                        str2 = String.format("url：%1$s\nresource：%2$s\ncode：%3$s\ndetail=%4$s", url, sslError.getUrl(), Integer.valueOf(sslError.getPrimaryError()), sslError.toString());
                    } catch (Throwable th) {
                        th = th;
                        TitansFragment.this.statisticsService.reportClassError("TitansFragment", "onReceivedSslError", th);
                        str2 = "";
                        TitansFragment.this.loadUrl(String.format("%1$s&type=%2$s&summary=%3$s&info=%4$s&", "https://static.meituan.net/bs/mbs-pages/master/error.html?language=" + language + "&script=" + script + "&country=" + country, "sslError", URLEncoder.encode(str), URLEncoder.encode(str2)));
                    }
                } catch (Throwable th2) {
                    th = th2;
                    str = "";
                }
                TitansFragment.this.loadUrl(String.format("%1$s&type=%2$s&summary=%3$s&info=%4$s&", "https://static.meituan.net/bs/mbs-pages/master/error.html?language=" + language + "&script=" + script + "&country=" + country, "sslError", URLEncoder.encode(str), URLEncoder.encode(str2)));
            }
        }

        @Override // com.sankuai.titans.base.WebViewClient.WebViewClientListener
        public void doUpdateVisitedHistory(IWebView iWebView, String str, boolean z) {
            Object[] objArr = {iWebView, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2fdd0805cbde39dbc02a9ce63ba91932", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2fdd0805cbde39dbc02a9ce63ba91932");
            } else {
                FragmentObserveUtil.onWebDoUpdateVisitedHistory(TitansFragment.this.mWebPageObservable, iWebView, str, z);
            }
        }
    }
}
