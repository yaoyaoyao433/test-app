package com.sankuai.meituan.android.knb;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dianping.networklog.c;
import com.dianping.titans.client.ImageTitleHelper;
import com.dianping.titans.js.JsBridgeResult;
import com.dianping.titans.js.JsHandlerFactory;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.dianping.titans.js.jshandler.CaptureJsHandler;
import com.dianping.titans.js.jshandler.JsHandler;
import com.dianping.titans.js.jshandler.JsHandlerReportImpl;
import com.dianping.titans.js.jshandler.SetTitleButtonJsHandler;
import com.dianping.titans.ui.ITitleContentV2;
import com.dianping.titans.ui.TitansUIManager;
import com.dianping.titans.utils.Constants;
import com.dianping.titans.utils.CookieUtil;
import com.dianping.titans.utils.ImageDownloadUtil;
import com.dianping.titans.utils.JavaScriptComposer;
import com.dianping.titans.utils.NetworkUtil;
import com.dianping.titans.utils.PerformanceAnalysis;
import com.dianping.titans.utils.TitansReporter;
import com.dianping.titans.utils.TitansTimingReport;
import com.dianping.titans.utils.ViewUtils;
import com.dianping.titans.widget.BaseTitleBar;
import com.dianping.titans.widget.DefaultTitleBar;
import com.dianping.titans.widget.DynamicTitleParser;
import com.dianping.titans.widget.LineTitleLayout;
import com.dianping.titans.widget.NavigateBar;
import com.dianping.titans.widget.TitansWebView;
import com.dianping.titans.widget.ZIndexFrameLayout;
import com.dianping.titansadapter.AbstractJSBPerformer;
import com.dianping.titansadapter.TitansWebManager;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.Utils;
import com.sankuai.meituan.android.knb.KNBWebManager;
import com.sankuai.meituan.android.knb.bean.KNBJsErrorInfo;
import com.sankuai.meituan.android.knb.bean.TitansReport;
import com.sankuai.meituan.android.knb.multiprocess.PublishReceiverManager;
import com.sankuai.meituan.android.knb.util.CrashUtil;
import com.sankuai.meituan.android.knb.util.EnvUtil;
import com.sankuai.meituan.android.knb.util.JsInjector;
import com.sankuai.meituan.android.knb.util.ProcessUtil;
import com.sankuai.meituan.android.knb.util.SensorHandler;
import com.sankuai.meituan.android.knb.util.ShowFileChooserUtils;
import com.sankuai.meituan.android.knb.util.UIUtil;
import com.sankuai.meituan.android.knb.util.UriUtil;
import com.sankuai.meituan.android.knb.util.UrlTokenUtils;
import com.sankuai.meituan.android.knb.util.WebUtil;
import com.sankuai.titans.EventReporter;
import com.sankuai.titans.adapter.base.TitansCrashReporter;
import com.sankuai.titans.debug.adapter.TitansDebugManager;
import com.sankuai.titans.debug.adapter.dialog.ITitansDebugDialog;
import com.sankuai.titans.debug.adapter.dialog.ITitansDebugDialogConfig;
import com.sankuai.titans.debug.adapter.old.IOldAppMockIntercept;
import com.sankuai.titans.debug.adapter.old.IOldJsInject;
import com.sankuai.titans.debug.adapter.old.IOldTitansDebug;
import com.sankuai.titans.offline.debug.adapter.IOfflineDebug;
import com.sankuai.titans.offline.debug.adapter.OfflineDebugManager;
import com.sankuai.titans.protocol.bean.TitansConstants;
import com.sankuai.titans.result.IRequestPermissionCallback;
import com.sankuai.titans.result.TitansPermissionUtil;
import com.sankuai.titans.result.privacy.PrivacyTitansManager;
import com.sankuai.waimai.launcher.util.image.a;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.sankuai.waimai.platform.utils.f;
import com.tencent.mapsdk.internal.y;
import com.tencent.smtt.sdk.TbsDownloadConfig;
import com.unionpay.tsmservice.data.Constant;
import java.io.UnsupportedEncodingException;
import java.net.HttpCookie;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class KNBWebCompatDelegateImpl extends KNBWebCompatDelegate {
    private static final String ACTION_BACK = "back";
    private static final String ACTION_CLOSE = "close";
    private static final String ACTION_CUSTOM = "custom";
    private static final String ACTION_NET_CHANGED = "android.net.conn.CONNECTIVITY_CHANGE";
    private static final String ACTION_RELOAD = "reload";
    public static final int FUTURE_TYPE_DYNAMIC_TITLE_BAR = 1;
    public static final int FUTURE_TYPE_HIDE_NAVIGATION = 4;
    public static final int FUTURE_TYPE_IMMERSIVE = 2;
    private static final String JS_GET_PIC = "function jsGetPic(id){\n var str = 'getCapturePic://' + document.getElementById(id).toDataURL();\n console.log(str);\n}";
    private static final String LOGAN_TAG_DONT_LOAD_URL_ON_PAUSE = "DontLoadUrlOnPause";
    private static final String TAG = "knb_delegate_impl";
    public static ChangeQuickRedirect changeQuickRedirect;
    private int backgroudColor;
    private Bundle cachedBundleOnPause;
    private CaptureJsHandler.BitmapCallbackListener callback;
    private LineTitleLayout dynamicTitleBar;
    private int future;
    private boolean hasCookiesSettled;
    private boolean hasDMObserved;
    private boolean hasLoaded;
    private boolean hasPublishForMultiProcess;
    private boolean hasStartActivity;
    private boolean isAppear;
    private boolean isFromBackground;
    private boolean isMaskInited;
    private boolean isPause;
    private boolean isPausedOnLoadUrl;
    private boolean isWebViewInitFailed;
    private long knbCompatAppearElapse;
    private long knbCompatAppearTime;
    private long knbCreateInitElapse;
    private long knbCreateInitTime;
    private String mCurrentDownloadUrl;
    private BaseTitleBar mDefaultTitleBar;
    private String mDownloadImgUrl;
    private final BroadcastReceiver mDownloadListener;
    private boolean mHasTitleSettled;
    private final ImageTitleHelper.ISetTitleListener mImgTitleSetListener;
    private boolean mIsFinished;
    private boolean mIsThirdParty;
    private final View.OnClickListener mOnBackListener;
    private final View.OnClickListener mOnFinishListener;
    private final ArrayList<Pair<Bitmap, Bitmap.CompressFormat>> mPendingSaveImg;
    private String mSendEventLastFrame;
    private boolean mSendEventPageTTIDone;
    private final View.OnClickListener mTitleOnClickListener;
    private ViewGroup.LayoutParams mTitleParams;
    private boolean mWebViewCanPause;
    private ZIndexFrameLayout multipleIndexContainer;
    protected boolean noQuery;
    private JSONObject result;
    private final BroadcastReceiver sNetChangedListener;
    private int schemeWebBgColor;
    private final SensorHandler.IShakeListener shakeListener;
    public TitansReport.Builder titansReportBuilder;
    protected final JSONObject webViewEnv;

    public void initUIManager() {
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebCompatDelegate
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce6cadf2b651eb7cb2777e0a0ac7f49f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce6cadf2b651eb7cb2777e0a0ac7f49f");
        }
    }

    @Override // com.dianping.titans.js.JsHost
    @Deprecated
    public String requestId() {
        return null;
    }

    @Override // com.dianping.titans.js.JsHost
    public void share() {
    }

    public KNBWebCompatDelegateImpl(Context context, IKnbActivityHandler iKnbActivityHandler) {
        Object[] objArr = {context, iKnbActivityHandler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d741ee53d062765115314889588d2df", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d741ee53d062765115314889588d2df");
            return;
        }
        this.mPendingSaveImg = new ArrayList<>();
        this.mIsThirdParty = false;
        this.mIsFinished = false;
        this.mSendEventPageTTIDone = false;
        this.backgroudColor = -1;
        this.isWebViewInitFailed = false;
        this.hasLoaded = false;
        this.hasStartActivity = false;
        this.hasPublishForMultiProcess = false;
        this.isAppear = true;
        this.mWebViewCanPause = true;
        this.mCurrentDownloadUrl = null;
        this.mDownloadImgUrl = null;
        this.isPause = false;
        this.cachedBundleOnPause = null;
        this.isPausedOnLoadUrl = false;
        this.schemeWebBgColor = -1;
        this.mTitleOnClickListener = new View.OnClickListener() { // from class: com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "dd2c02aee9f5a32c83174b04076361a5", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "dd2c02aee9f5a32c83174b04076361a5");
                } else if (view instanceof ImageView) {
                    KNBWebCompatDelegateImpl.this.loadJs(JavaScriptComposer.makeCustomeEvent("KNB:titleClicked", "image title has been clicked"));
                }
            }
        };
        this.mImgTitleSetListener = new ImageTitleHelper.ISetTitleListener() { // from class: com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.titans.client.ImageTitleHelper.ISetTitleListener
            public void onErr(ITitleContentV2 iTitleContentV2, String str, int i) {
                Object[] objArr2 = {iTitleContentV2, str, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7cfc489450667179e8ebc377e2689340", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7cfc489450667179e8ebc377e2689340");
                } else if (i == 0) {
                    if (KNBWebCompatDelegateImpl.this.mHasTitleSettled) {
                        return;
                    }
                    KNBWebCompatDelegateImpl.this.mHasTitleSettled = true;
                } else if (TextUtils.isEmpty(KNBWebCompatDelegateImpl.this.mTitle)) {
                } else {
                    KNBWebCompatDelegateImpl.this.setTitle(KNBWebCompatDelegateImpl.this.mTitle);
                }
            }
        };
        this.shakeListener = new SensorHandler.IShakeListener() { // from class: com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.sankuai.meituan.android.knb.util.SensorHandler.IShakeListener
            public void onShake() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "63b2a1a60ce6e2fa78f2f317d3630b54", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "63b2a1a60ce6e2fa78f2f317d3630b54");
                } else if (KNBWebCompatDelegateImpl.this.isAppear) {
                    KNBWebCompatDelegateImpl.this.loadJs(JavaScriptComposer.makeCustomeEvent("KNB:shaked", ""));
                }
            }
        };
        this.webViewEnv = new JSONObject();
        this.isFromBackground = false;
        this.mOnFinishListener = new View.OnClickListener() { // from class: com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl.13
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "534ee6a8e95f483bef554bb01a28d878", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "534ee6a8e95f483bef554bb01a28d878");
                } else {
                    KNBWebCompatDelegateImpl.this.finish();
                }
            }
        };
        this.mOnBackListener = new View.OnClickListener() { // from class: com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl.14
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e49381c5c549a2b1a2bce5291d5a75de", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e49381c5c549a2b1a2bce5291d5a75de");
                } else {
                    KNBWebCompatDelegateImpl.this.goBack();
                }
            }
        };
        this.isMaskInited = false;
        this.sNetChangedListener = new BroadcastReceiver() { // from class: com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl.19
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                Object[] objArr2 = {context2, intent};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7a28cb3519e9652f63342bda1e443e7a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7a28cb3519e9652f63342bda1e443e7a");
                } else if (TextUtils.equals(intent.getAction(), KNBWebCompatDelegateImpl.ACTION_NET_CHANGED)) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("networkType", NetworkUtil.getNetworkTypeString(context2, "pt-e855f47ed9ccf2a5"));
                    } catch (Exception e) {
                        if (KNBWebManager.isDebug()) {
                            e.printStackTrace();
                        }
                    }
                    KNBWebCompatDelegateImpl.this.loadJs(JavaScriptComposer.makeCustomeEvent("KNB:networkChanged", jSONObject));
                }
            }
        };
        this.mDownloadListener = new BroadcastReceiver() { // from class: com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl.20
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Removed duplicated region for block: B:36:0x008d A[Catch: Throwable -> 0x014b, TRY_ENTER, TryCatch #0 {Throwable -> 0x014b, blocks: (B:7:0x001f, B:10:0x002c, B:13:0x0037, B:16:0x0044, B:20:0x0059, B:28:0x0076, B:36:0x008d, B:37:0x0090, B:39:0x0096, B:40:0x00a0, B:42:0x00b3, B:47:0x0108, B:49:0x0114, B:51:0x011e, B:54:0x012d, B:56:0x0135, B:57:0x013a, B:43:0x00bd, B:45:0x00e0, B:46:0x00ea, B:64:0x0147, B:65:0x014a), top: B:71:0x001f }] */
            /* JADX WARN: Removed duplicated region for block: B:39:0x0096 A[Catch: Throwable -> 0x014b, TryCatch #0 {Throwable -> 0x014b, blocks: (B:7:0x001f, B:10:0x002c, B:13:0x0037, B:16:0x0044, B:20:0x0059, B:28:0x0076, B:36:0x008d, B:37:0x0090, B:39:0x0096, B:40:0x00a0, B:42:0x00b3, B:47:0x0108, B:49:0x0114, B:51:0x011e, B:54:0x012d, B:56:0x0135, B:57:0x013a, B:43:0x00bd, B:45:0x00e0, B:46:0x00ea, B:64:0x0147, B:65:0x014a), top: B:71:0x001f }] */
            /* JADX WARN: Removed duplicated region for block: B:42:0x00b3 A[Catch: Throwable -> 0x014b, TryCatch #0 {Throwable -> 0x014b, blocks: (B:7:0x001f, B:10:0x002c, B:13:0x0037, B:16:0x0044, B:20:0x0059, B:28:0x0076, B:36:0x008d, B:37:0x0090, B:39:0x0096, B:40:0x00a0, B:42:0x00b3, B:47:0x0108, B:49:0x0114, B:51:0x011e, B:54:0x012d, B:56:0x0135, B:57:0x013a, B:43:0x00bd, B:45:0x00e0, B:46:0x00ea, B:64:0x0147, B:65:0x014a), top: B:71:0x001f }] */
            /* JADX WARN: Removed duplicated region for block: B:43:0x00bd A[Catch: Throwable -> 0x014b, TryCatch #0 {Throwable -> 0x014b, blocks: (B:7:0x001f, B:10:0x002c, B:13:0x0037, B:16:0x0044, B:20:0x0059, B:28:0x0076, B:36:0x008d, B:37:0x0090, B:39:0x0096, B:40:0x00a0, B:42:0x00b3, B:47:0x0108, B:49:0x0114, B:51:0x011e, B:54:0x012d, B:56:0x0135, B:57:0x013a, B:43:0x00bd, B:45:0x00e0, B:46:0x00ea, B:64:0x0147, B:65:0x014a), top: B:71:0x001f }] */
            /* JADX WARN: Removed duplicated region for block: B:49:0x0114 A[Catch: Throwable -> 0x014b, TryCatch #0 {Throwable -> 0x014b, blocks: (B:7:0x001f, B:10:0x002c, B:13:0x0037, B:16:0x0044, B:20:0x0059, B:28:0x0076, B:36:0x008d, B:37:0x0090, B:39:0x0096, B:40:0x00a0, B:42:0x00b3, B:47:0x0108, B:49:0x0114, B:51:0x011e, B:54:0x012d, B:56:0x0135, B:57:0x013a, B:43:0x00bd, B:45:0x00e0, B:46:0x00ea, B:64:0x0147, B:65:0x014a), top: B:71:0x001f }] */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0135 A[Catch: Throwable -> 0x014b, TryCatch #0 {Throwable -> 0x014b, blocks: (B:7:0x001f, B:10:0x002c, B:13:0x0037, B:16:0x0044, B:20:0x0059, B:28:0x0076, B:36:0x008d, B:37:0x0090, B:39:0x0096, B:40:0x00a0, B:42:0x00b3, B:47:0x0108, B:49:0x0114, B:51:0x011e, B:54:0x012d, B:56:0x0135, B:57:0x013a, B:43:0x00bd, B:45:0x00e0, B:46:0x00ea, B:64:0x0147, B:65:0x014a), top: B:71:0x001f }] */
            @Override // android.content.BroadcastReceiver
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onReceive(android.content.Context r13, android.content.Intent r14) {
                /*
                    Method dump skipped, instructions count: 345
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl.AnonymousClass20.onReceive(android.content.Context, android.content.Intent):void");
            }
        };
        this.hasDMObserved = false;
        this.future = 0;
        this.mContext = context;
        this.mActivityHandler = iKnbActivityHandler;
        this.mDefaultTitansUIManager = new TitansUIManager();
        this.mTitleParams = new ViewGroup.LayoutParams(-1, context.getResources().getDimensionPixelSize(R.dimen.titlebar_height));
        this.titansReportBuilder = new TitansReport.Builder();
        TitansReporter.putTitansReportBuilder(this, this.titansReportBuilder);
        this.titansReportBuilder.setTitansVersion(BuildConfig.VERSION_NAME);
        this.titansReportBuilder.setH5EnvInitTime(System.currentTimeMillis());
    }

    @Override // com.dianping.titans.js.JsHost
    public void startActivity(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "532afa96c1dfc69818d6c08248ddc5ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "532afa96c1dfc69818d6c08248ddc5ff");
            return;
        }
        if (this.mActivityHandler != null) {
            this.mActivityHandler.handleStartActivity(intent);
        } else {
            if (!(this.mContext instanceof Activity)) {
                intent.addFlags(y.a);
            }
            this.mContext.startActivity(intent);
        }
        this.hasStartActivity = true;
    }

    @Override // com.dianping.titans.js.JsHost
    public void startActivityForResult(Intent intent, int i) {
        Object[] objArr = {intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6130c77f58206e8fe512f4322df7be0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6130c77f58206e8fe512f4322df7be0b");
        } else if (this.mActivityHandler != null) {
            this.mActivityHandler.handleStartActivityForResult(intent, i);
            this.hasStartActivity = true;
        } else {
            throw new RuntimeException("mActivityHandler is null");
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public void finish() {
        Handler handler;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0dc72b89de82e70b0bbe70b1cbe3840c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0dc72b89de82e70b0bbe70b1cbe3840c");
            return;
        }
        this.mIsFinished = true;
        if (this.mWebView != null && (handler = this.mWebView.getHandler()) != null) {
            handler.removeCallbacksAndMessages(null);
        }
        if (this.onFinishListener != null) {
            this.onFinishListener.onFinish();
        }
        if (this.mActivityHandler == null) {
            return;
        }
        if (this.onFinishHandler == null || !this.onFinishHandler.onFinish()) {
            this.mActivityHandler.handleFinish();
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public void loadJs(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1fd96997abafe97b939307a30276a293", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1fd96997abafe97b939307a30276a293");
        } else if (this.mIsFinished || this.mWebView == null) {
        } else {
            Runnable runnable = new Runnable() { // from class: com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl.4
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    String str2;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "11b3a2109f999db100c9e62c2187053b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "11b3a2109f999db100c9e62c2187053b");
                    } else if (KNBWebCompatDelegateImpl.this.mIsFinished || KNBWebCompatDelegateImpl.this.mWebView == null) {
                    } else {
                        if (str.startsWith(TitansConstants.JAVASCRIPT_PREFIX)) {
                            str2 = str.substring(TitansConstants.JAVASCRIPT_PREFIX.length());
                        } else {
                            str2 = str;
                        }
                        try {
                            KNBWebCompatDelegateImpl.this.mWebView.evaluateJavascript(str2, null);
                        } catch (Throwable unused) {
                            KNBWebCompatDelegateImpl.this.mWebView.loadUrl(str);
                        }
                    }
                }
            };
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public void post(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e0ca1c04e9054e375f1633e372473da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e0ca1c04e9054e375f1633e372473da");
        } else if (this.mWebView != null) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public Context getContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "98d4c49438dafe4598052ac6c157998b", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "98d4c49438dafe4598052ac6c157998b") : this.mWebView == null ? this.mContext : this.mWebView.getContext();
    }

    @Override // com.dianping.titans.js.JsHost
    public JsHandler getJsHandler(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59812fe032a76395a7241c348481a5ac", RobustBitConfig.DEFAULT_VALUE) ? (JsHandler) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59812fe032a76395a7241c348481a5ac") : this.mJsHandlerMap.get(str);
    }

    @Override // com.dianping.titans.js.JsHost
    public void putJsHandler(JsHandler jsHandler) {
        Object[] objArr = {jsHandler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "596e087a018519baae57c6382d99f175", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "596e087a018519baae57c6382d99f175");
        } else {
            this.mJsHandlerMap.put(jsHandler.jsBean().method, jsHandler);
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public void subscribe(String str, JsHandler jsHandler) {
        Object[] objArr = {str, jsHandler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1bae96981d6c5da31a14e2f5d12fd954", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1bae96981d6c5da31a14e2f5d12fd954");
            return;
        }
        this.mSubscribeJsHandlerMap.put(str, jsHandler);
        this.hasPublishForMultiProcess = PublishReceiverManager.registerReceiver(getContext());
    }

    @Override // com.dianping.titans.js.JsHost
    public void unsubscribe(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d022764fbc1cca49f5c5b10cda89259", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d022764fbc1cca49f5c5b10cda89259");
        } else {
            this.mSubscribeJsHandlerMap.remove(str);
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public void publish(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "918a6506f3eacbfe4b99dd7a51396f92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "918a6506f3eacbfe4b99dd7a51396f92");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", str);
        } catch (JSONException unused) {
        }
        publish(jSONObject);
    }

    @Override // com.dianping.titans.js.JsHost
    public void publish(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7267b3d115918206dd73d00894770de2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7267b3d115918206dd73d00894770de2");
            return;
        }
        try {
            jSONObject.put("status", "action");
        } catch (JSONException unused) {
        }
        JsHandler subscribeJsHandler = getSubscribeJsHandler(jSONObject.optString("action"));
        if (subscribeJsHandler != null) {
            subscribeJsHandler.jsCallback(jSONObject);
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public void resetJsHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f1e9f4279ff0bcf60ff0bb47c672c7b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f1e9f4279ff0bcf60ff0bb47c672c7b3");
        } else if (getContext() != null) {
            for (Map.Entry<String, JsHandler> entry : this.mJsHandlerMap.entrySet()) {
                if (!TextUtils.isEmpty(entry.getKey())) {
                    entry.getValue().onDestroy();
                }
            }
            this.mJsHandlerMap.clear();
            this.mSubscribeJsHandlerMap.clear();
            initTitleBar(true);
            resetBackgroudColor();
        }
    }

    private void resetBackgroudColor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7aca3ac72c2601cfe28ca000854663f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7aca3ac72c2601cfe28ca000854663f8");
        } else if (this.backgroudColor != -1) {
            setBackgroundColor(this.backgroudColor);
        } else if (getUIManager().getBackgroudColor() != -1) {
            setBackgroundColor(getUIManager().getBackgroudColor());
        } else if (this.schemeWebBgColor != -1) {
            setBackgroundColor(this.schemeWebBgColor);
        } else {
            setBackgroundColor(0);
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public void setBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cac371037b0de646fea8db55a0874bd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cac371037b0de646fea8db55a0874bd6");
        } else if (this.mWebView != null) {
            this.mWebView.setBackgroundColor(i);
        }
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebCompatDelegate
    public void setBackgroundColorForCurrentCompact(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "983e664dcfe48ca742eb3f98d4be624c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "983e664dcfe48ca742eb3f98d4be624c");
            return;
        }
        this.backgroudColor = i;
        setBackgroundColor(i);
    }

    @Override // com.dianping.titans.js.JsHost
    public void loadUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e1ab29668c82352215562808729fc1bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e1ab29668c82352215562808729fc1bb");
        } else {
            loadUrl(str, null);
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public void loadUrl(String str, Map<String, String> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d056dc89f77b1fd25dae34ebb6867ccc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d056dc89f77b1fd25dae34ebb6867ccc");
        } else {
            loadUrl(str, map, true);
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public void loadUrl(String str, Map<String, String> map, boolean z) {
        Object[] objArr = {str, map, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "94e798c9982b1444ed3c90c83ad5cb11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "94e798c9982b1444ed3c90c83ad5cb11");
            return;
        }
        this.titansReportBuilder.h5EnvWebViewEnd();
        long currentTimeMillis = System.currentTimeMillis();
        if (TextUtils.isEmpty(str) || this.mWebView == null) {
            return;
        }
        TitansTimingReport.getInstance().onLoadUrlStart();
        TitansCrashReporter.putUrlInMap(toString(), str);
        String fixURLHost = fixURLHost(str);
        if (KNBWebManager.isInBlackList(fixURLHost)) {
            Locale locale = Locale.getDefault();
            String language = locale.getLanguage();
            String script = Build.VERSION.SDK_INT >= 21 ? locale.getScript() : "";
            String country = locale.getCountry();
            recordTimeInLoadUrl(currentTimeMillis);
            WebView webView = this.mWebView;
            webView.loadUrl("https://static.meituan.net/bs/mbs-pages/master/error-url.html?language=" + language + "&script=" + script + "&country=" + country);
            return;
        }
        if (URLUtil.isHttpUrl(fixURLHost) || URLUtil.isHttpsUrl(fixURLHost)) {
            this.mUrl = fixURLHost;
        }
        CrashUtil.pushPage(fixURLHost);
        if (isInWhiteList(fixURLHost) || !z) {
            String wrapUrl = wrapUrl(fixURLHost);
            if (KNBWebManager.needRemoveToken(wrapUrl)) {
                wrapUrl = UrlTokenUtils.removeTokenInUrl(wrapUrl);
            }
            recordTimeInLoadUrl(currentTimeMillis);
            PerformanceAnalysis.getInstance().onLoadUrl();
            if (map != null) {
                this.mWebView.loadUrl(wrapUrl, map);
                return;
            } else {
                this.mWebView.loadUrl(wrapUrl);
                return;
            }
        }
        try {
            Uri.Builder buildUpon = Uri.parse(Constants.WEBSAFE_HOST + "/websafe").buildUpon();
            buildUpon.appendQueryParameter("url", fixURLHost);
            KNBWebManager.IEnvironment environment = KNBWebManager.getEnvironment();
            if (environment != null && !TextUtils.isEmpty(environment.getKNBAppId())) {
                buildUpon.appendQueryParameter("appId", environment.getKNBAppId());
            }
            PackageInfo currentVersion = Utils.getCurrentVersion(getContext().getApplicationContext());
            if (currentVersion != null) {
                buildUpon.appendQueryParameter("appVersion", currentVersion.versionName);
            }
            Locale locale2 = Locale.getDefault();
            buildUpon.appendQueryParameter("language", locale2.getLanguage());
            if (Build.VERSION.SDK_INT >= 21) {
                buildUpon.appendQueryParameter("script", locale2.getScript());
            }
            buildUpon.appendQueryParameter(GearsLocator.COUNTRY, locale2.getCountry());
            if (EnvUtil.self().debugTitans()) {
                buildUpon.appendQueryParameter("isKNBDebug", "true");
            }
            recordTimeInLoadUrl(currentTimeMillis);
            PerformanceAnalysis.getInstance().onLoadUrl();
            if (map != null) {
                this.mWebView.loadUrl(buildUpon.toString(), map);
            } else {
                this.mWebView.loadUrl(buildUpon.toString());
            }
        } catch (Exception unused) {
            finish();
        }
    }

    private void recordTimeInLoadUrl(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1d7d94480c3ac43b9b7ff1686c82fd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1d7d94480c3ac43b9b7ff1686c82fd7");
            return;
        }
        this.titansReportBuilder.setH5EnvPrepareTime(System.currentTimeMillis() - this.titansReportBuilder.getH5EnvInitTime());
        this.titansReportBuilder.setUrlPreProcessTime(System.currentTimeMillis() - j);
    }

    private String fixURLHost(String str) {
        String sb;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba4e054f1d5c5d28dca3b305fdc9b0ef", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba4e054f1d5c5d28dca3b305fdc9b0ef");
        }
        String replace = str.replace(CommonConstant.Symbol.SLASH_RIGHT, "/");
        Matcher matcher = Pattern.compile("//(([^/?#]+)@)?[a-z0-9A-Z\\-\\.]+").matcher(replace);
        if (matcher.find() && matcher.groupCount() > 1) {
            String group = matcher.group(2);
            if (!TextUtils.isEmpty(group)) {
                StringBuilder sb2 = new StringBuilder(replace.substring(0, matcher.start() + 2));
                int indexOf = group.indexOf(CommonConstant.Symbol.COLON);
                if (indexOf <= 0) {
                    sb = URLEncoder.encode(group);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    try {
                        sb3.append(URLEncoder.encode(group.substring(0, indexOf), "utf-8"));
                    } catch (UnsupportedEncodingException unused) {
                    }
                    sb3.append(CommonConstant.Symbol.COLON);
                    int i = indexOf + 1;
                    if (i < group.length()) {
                        try {
                            sb3.append(URLEncoder.encode(group.substring(i), "utf-8"));
                        } catch (UnsupportedEncodingException unused2) {
                        }
                    }
                    sb = sb3.toString();
                }
                sb2.append(sb);
                sb2.append(replace.substring(matcher.start() + 2 + group.length()));
                return sb2.toString();
            }
        }
        return replace;
    }

    @Override // com.dianping.titans.js.JsHost
    public boolean isOnScroll() {
        return this.mOnScroll;
    }

    @Override // com.dianping.titans.js.JsHost
    public void setOnScroll(boolean z) {
        this.mOnScroll = z;
    }

    @Override // com.dianping.titans.js.JsHost
    public BaseTitleBar getTitleBarHost() {
        return this.mLayTitle;
    }

    @Override // com.dianping.titans.js.JsHost
    public void replaceTitleBar(BaseTitleBar baseTitleBar) {
        Object[] objArr = {baseTitleBar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d6237cea0ae4c50ef8f0710900c82ba7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d6237cea0ae4c50ef8f0710900c82ba7");
        } else if (baseTitleBar != this.mLayTitle) {
            this.mLayWeb.removeView(this.mLayTitle);
            this.mLayTitle = baseTitleBar;
            this.mLayWeb.addView(this.mLayTitle, 0, this.mTitleParams);
            initTitleBar(false);
            for (JsHandler jsHandler : this.mJsHandlerMap.values()) {
                if (jsHandler instanceof SetTitleButtonJsHandler) {
                    ((SetTitleButtonJsHandler) jsHandler).setTitleButton();
                }
            }
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public TitansUIManager getUIManager() {
        if (this.mTitansUIManager != null) {
            return this.mTitansUIManager;
        }
        return this.mDefaultTitansUIManager;
    }

    @Override // com.dianping.titans.js.JsHost
    public void setUIManager(TitansUIManager titansUIManager) {
        this.mTitansUIManager = titansUIManager;
    }

    @Override // com.dianping.titans.ui.NavigateBarHost
    public void navigateRefresh() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0cab885235ae1fc5af1fd6acd4f5848f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0cab885235ae1fc5af1fd6acd4f5848f");
        } else if (this.mWebView != null) {
            this.mWebView.reload();
        }
    }

    @Override // com.dianping.titans.ui.NavigateBarHost
    public void navigateForward() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e09a8e2449b5a7d8da41f13a1a692a5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e09a8e2449b5a7d8da41f13a1a692a5a");
        } else if (this.mWebView == null || !this.mWebView.canGoForward()) {
        } else {
            this.mWebView.goForward();
        }
    }

    @Override // com.dianping.titans.ui.NavigateBarHost
    public void navigateBackward() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b0d4d9d3f9b55bb6cf3c538799336e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b0d4d9d3f9b55bb6cf3c538799336e9");
        } else if (this.mWebView == null || !this.mWebView.canGoBack()) {
        } else {
            this.mWebView.goBack();
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public boolean isDebug() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c44f7b968f8d74a2073505e1905ec2a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c44f7b968f8d74a2073505e1905ec2a")).booleanValue() : KNBWebManager.isDebug();
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebCompatDelegate
    public void handleUri(Uri uri) {
        boolean z = false;
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "715a5b73cfcc3893ace50ad66fb0dab9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "715a5b73cfcc3893ace50ad66fb0dab9");
        } else if (uri != null) {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            try {
                String scheme = uri.getScheme();
                String str = "";
                try {
                    str = getPackageName();
                } catch (Throwable unused) {
                }
                boolean isHierarchical = uri.isHierarchical();
                String queryParameter = isHierarchical ? uri.getQueryParameter("_knbopeninapp") : null;
                String queryParameter2 = isHierarchical ? uri.getQueryParameter("openInApp") : null;
                if (((Build.VERSION.SDK_INT < 25 || !(("imeituan".equals(scheme) && "com.sankuai.meituan".equals(str)) || "meituanpayment".equals(scheme))) && !(isHierarchical && ("1".equals(queryParameter) || "1".equals(queryParameter2)))) || TextUtils.isEmpty(str)) {
                    z = true;
                } else {
                    intent.setPackage(str);
                }
                if (z && uri.isHierarchical() && "1".equals(uri.getQueryParameter("_new_task"))) {
                    intent.addFlags(y.a);
                }
                boolean equals = "tel".equals(scheme);
                if (equals) {
                    intent.setAction("android.intent.action.DIAL");
                }
                intent.putExtra(com.sankuai.meituan.arbiter.hook.Utils.EXTRA_NEED_EXCEPTION, true);
                if (!UriUtil.useStartActivity(getContext(), uri) && !equals && !"geo".equals(scheme) && !"mailto".equals(scheme) && (!isHierarchical || !"1".equals(uri.getQueryParameter("noresult")))) {
                    startActivityForResult(intent, 110);
                    return;
                }
                startActivity(intent);
            } catch (Throwable th) {
                TitansReporter.reportException("KNBWebCompatDelegateImpl_handleUri", uri.toString(), th);
            }
        }
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebCompatDelegate
    public void onCreate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca28345e9ad56c928f8c2cee8dd38b8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca28345e9ad56c928f8c2cee8dd38b8f");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.knbCreateInitTime = currentTimeMillis;
        PerformanceAnalysis.getInstance().onKnbCreate();
        JsHandlerFactory.addJsHost(this);
        handleArguments();
        PerformanceAnalysis.getInstance().onKnbUrlReady(this.mUrl);
        TitansTimingReport.getInstance().setOriginalUrl(this.mUrl);
        if (Build.VERSION.SDK_INT >= 21 && KNBConfig.getBooleanConfig(KNBConfig.CONFIG_SWITCH_USING_SLOW_DRAW, false)) {
            try {
                WebView.enableSlowWholeDocumentDraw();
            } catch (Throwable unused) {
            }
        }
        if (KNBWebManager.showDebugUrl() && Build.VERSION.SDK_INT >= 19) {
            try {
                WebView.setWebContentsDebuggingEnabled(true);
            } catch (Exception unused2) {
            }
        }
        this.knbCreateInitElapse = System.currentTimeMillis() - currentTimeMillis;
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebCompatDelegate
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "605bbf7b4ff78f93134c128bf66f9f65", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "605bbf7b4ff78f93134c128bf66f9f65");
        }
        long currentTimeMillis = System.currentTimeMillis();
        EventReporter eventReporter = EventReporter.getInstance();
        Uri parse = this.mUrl != null ? Uri.parse(this.mUrl) : null;
        long currentTimeMillis2 = System.currentTimeMillis();
        EventReporter.EventInfo pickStartEvent = eventReporter.pickStartEvent("Entry.Open", parse);
        if (pickStartEvent != null) {
            eventReporter.reportTiming("Entry.Open", parse, System.currentTimeMillis() - pickStartEvent.getTime());
        }
        eventReporter.reportTiming("Entry.WillOpen", parse, 0L);
        this.mRootView = layoutInflater.inflate(R.layout.knb_fragment_titans_web, viewGroup, false);
        if (!onViewCreated(this.mRootView)) {
            View inflate = layoutInflater.inflate(R.layout.knb_webview_not_installed, viewGroup, false);
            View findViewById = inflate.findViewById(R.id.title);
            View findViewById2 = inflate.findViewById(R.id.divider);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.back);
            if (!this.showTitleBarOnReceivedError) {
                findViewById.setVisibility(8);
                findViewById2.setVisibility(8);
            } else {
                imageView.setImageResource(getUIManager().getBackIconId());
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl.5
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "733a76824f478fcd0325c632f5c3f2ba", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "733a76824f478fcd0325c632f5c3f2ba");
                        } else {
                            KNBWebCompatDelegateImpl.this.finish();
                        }
                    }
                });
            }
            this.titansReportBuilder.setH5EnvNativeLayoutTime(System.currentTimeMillis() - currentTimeMillis);
            return inflate;
        }
        this.knbCreateInitElapse += System.currentTimeMillis() - currentTimeMillis2;
        eventReporter.reportTiming("WebView.Create", parse, this.knbCreateInitElapse);
        this.titansReportBuilder.setH5EnvNativeLayoutTime(System.currentTimeMillis() - currentTimeMillis);
        return this.mRootView;
    }

    public void inflateWebView(ViewStub viewStub) throws Exception {
        Object[] objArr = {viewStub};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e156d1721b37de3e11b0d85e4fbb6253", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e156d1721b37de3e11b0d85e4fbb6253");
            return;
        }
        try {
            viewStub.setLayoutResource(getWebLayoutId());
            viewStub.inflate();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebCompatDelegate
    public boolean onViewCreated(View view) {
        View debugView;
        View debugView2;
        View debugView3;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77fb6245babc920563d27f7c9cea7644", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77fb6245babc920563d27f7c9cea7644")).booleanValue();
        }
        initUIManager();
        view.post(new Runnable() { // from class: com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl.6
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9a5c58ff3c3891a8915904601cabcb95", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9a5c58ff3c3891a8915904601cabcb95");
                    return;
                }
                SensorHandler.getInstance(KNBWebCompatDelegateImpl.this.mContext).registerShakeListener(KNBWebCompatDelegateImpl.this.shakeListener);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(KNBWebCompatDelegateImpl.ACTION_NET_CHANGED);
                KNBWebCompatDelegateImpl.this.mContext.registerReceiver(KNBWebCompatDelegateImpl.this.sNetChangedListener, intentFilter);
            }
        });
        this.mLayWeb = (LinearLayout) view.findViewById(R.id.lay_web_parent);
        this.multipleIndexContainer = (ZIndexFrameLayout) view.findViewById(R.id.mil_container);
        long currentTimeMillis = System.currentTimeMillis();
        TitansTimingReport.getInstance().onWebViewCreateStart();
        try {
            inflateWebView((ViewStub) view.findViewById(R.id.web_webview));
            this.mWebView = getWebView(view);
            TitansTimingReport.getInstance().onWebViewCreateEnd();
            LocalBroadcastManager.getInstance(this.mContext).sendBroadcast(new Intent("ACTION_WEBVIEW_INIT"));
            this.titansReportBuilder.setH5EnvWebViewPrepareTime(System.currentTimeMillis() - currentTimeMillis);
            this.titansReportBuilder.h5EnvWebViewStart();
            TitansTimingReport.getInstance().onWebViewEnvInitStart();
            initWebView();
            long currentTimeMillis2 = System.currentTimeMillis();
            if (this.autoInflateTitleBar) {
                inflateTitleBar();
            }
            if (this.mActivityHandler != null) {
                onActivityHandlerSettled();
            }
            this.mLayVideo = (FrameLayout) view.findViewById(R.id.video);
            this.mTvUrl = (TextView) view.findViewById(R.id.url);
            if (this.mTvUrl != null) {
                ITitansDebugDialog titansDebugDialog = TitansDebugManager.getTitansDebugDialog();
                boolean debugTitans = EnvUtil.self().debugTitans() ? EnvUtil.self().debugTitans() : KNBWebManager.showDebugUrl();
                Activity activity = getContext() instanceof Activity ? (Activity) getContext() : null;
                if (titansDebugDialog != null && debugTitans && activity != null) {
                    this.mTvUrl.setVisibility(0);
                    ArrayList arrayList = new ArrayList();
                    IOldTitansDebug oldTitansDebug = TitansDebugManager.getOldTitansDebug();
                    if (oldTitansDebug != null) {
                        IOldAppMockIntercept appMock = oldTitansDebug.getAppMock();
                        if (appMock != null && (debugView3 = appMock.getDebugView(activity)) != null) {
                            arrayList.add(debugView3);
                        }
                        IOldJsInject jsInject = oldTitansDebug.getJsInject();
                        if (jsInject != null && (debugView2 = jsInject.getDebugView(activity, JsInjector.getInstance().jsonArrayToList())) != null) {
                            arrayList.add(debugView2);
                        }
                    }
                    IOfflineDebug offlineDebug = OfflineDebugManager.getOfflineDebug();
                    if (offlineDebug != null && (debugView = offlineDebug.getDebugView(activity, KNBConfig.getBooleanConfig(KNBConfig.CONFIG_SWITCH_USING_OFFLINE, true))) != null) {
                        arrayList.add(debugView);
                    }
                    this.mTvUrl.setOnClickListener(new AnonymousClass7(titansDebugDialog, arrayList));
                } else {
                    this.mTvUrl.setVisibility(8);
                }
            }
            resetBackgroudColor();
            long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
            TitansTimingReport.getInstance().onWebOtherViewCreateTime(currentTimeMillis3);
            if (this.mWebView != null) {
                this.mWebView.setDownloadListener(new InternalDownloadListener());
            }
            if (this.autoSetCookiesAfterViewCreated) {
                setWebViewCookies();
            }
            TitansTimingReport.getInstance().onWebViewEnvInitEnd(currentTimeMillis3);
            return true;
        } catch (Throwable th) {
            this.isWebViewInitFailed = true;
            if (this.onWebViewInitFailedListener != null) {
                this.onWebViewInitFailedListener.onFailed(th);
            }
            return false;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl$7  reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass7 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final /* synthetic */ ITitansDebugDialog val$debugDialog;
        public final /* synthetic */ List val$debugItemList;

        public AnonymousClass7(ITitansDebugDialog iTitansDebugDialog, List list) {
            this.val$debugDialog = iTitansDebugDialog;
            this.val$debugItemList = list;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8eda197e353b7e5c4a7630e9ecb2b76f", 4611686018427387906L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8eda197e353b7e5c4a7630e9ecb2b76f");
            } else {
                this.val$debugDialog.showDebugDialog(new ITitansDebugDialogConfig() { // from class: com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl.7.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.sankuai.titans.debug.adapter.dialog.ITitansDebugDialogConfig
                    public Activity getActivity() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7928840aa6f0d6bd0acbcb64682d2e6a", RobustBitConfig.DEFAULT_VALUE)) {
                            return (Activity) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7928840aa6f0d6bd0acbcb64682d2e6a");
                        }
                        if (KNBWebCompatDelegateImpl.this.getContext() instanceof Activity) {
                            return (Activity) KNBWebCompatDelegateImpl.this.getContext();
                        }
                        return null;
                    }

                    @Override // com.sankuai.titans.debug.adapter.dialog.ITitansDebugDialogConfig
                    public View.OnClickListener getRefreshClickListener() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "aead95d7f94b1be86d538a8eafa339a9", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "aead95d7f94b1be86d538a8eafa339a9") : new View.OnClickListener() { // from class: com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl.7.1.1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // android.view.View.OnClickListener
                            public void onClick(View view2) {
                                Object[] objArr3 = {view2};
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "5968dfa188af567af3f2a9b11bece26a", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "5968dfa188af567af3f2a9b11bece26a");
                                } else if (KNBWebCompatDelegateImpl.this.mWebView != null) {
                                    KNBWebCompatDelegateImpl.this.mWebView.reload();
                                }
                            }
                        };
                    }

                    @Override // com.sankuai.titans.debug.adapter.dialog.ITitansDebugDialogConfig
                    public View.OnClickListener getHiddenClickListener() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6e60525f551fb3c6f362dff41e3fa032", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6e60525f551fb3c6f362dff41e3fa032") : new View.OnClickListener() { // from class: com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl.7.1.2
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // android.view.View.OnClickListener
                            public void onClick(View view2) {
                                Object[] objArr3 = {view2};
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "5c4a7deed8a77253c323e36f79bd2293", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "5c4a7deed8a77253c323e36f79bd2293");
                                } else {
                                    KNBWebCompatDelegateImpl.this.mTvUrl.setVisibility(8);
                                }
                            }
                        };
                    }

                    @Override // com.sankuai.titans.debug.adapter.dialog.ITitansDebugDialogConfig
                    public String getUA() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ec7bab85c0defdcaa16307ca4093e929", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ec7bab85c0defdcaa16307ca4093e929") : TitansWebManager.ua();
                    }

                    @Override // com.sankuai.titans.debug.adapter.dialog.ITitansDebugDialogConfig
                    public List<View> getDebugItems() {
                        return AnonymousClass7.this.val$debugItemList;
                    }

                    @Override // com.sankuai.titans.debug.adapter.dialog.ITitansDebugDialogConfig
                    public String getScheme() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f146922e56177a94ea01cd5b373a40ca", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f146922e56177a94ea01cd5b373a40ca") : KNBWebManager.getEnvironment().getWebviewUri();
                    }

                    @Override // com.sankuai.titans.debug.adapter.dialog.ITitansDebugDialogConfig
                    public String getUrl() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "107fd73fb0797b333bc72a2723a9121c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "107fd73fb0797b333bc72a2723a9121c") : KNBWebCompatDelegateImpl.this.mTvUrl.getText().toString();
                    }
                });
            }
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public JSONObject getWebViewEnv() {
        return this.webViewEnv;
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebCompatDelegate
    public void onCreated(Bundle bundle) {
        boolean z = true;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "835892f67f82dd145fda0f8839eca97f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "835892f67f82dd145fda0f8839eca97f");
            return;
        }
        if (!this.isPause) {
            loadUrlOnCreate(bundle);
        } else {
            Log.e(TAG, "cancel Load Url on Paused");
            c.a("cancel Load Url on Paused", 35, new String[]{LOGAN_TAG_DONT_LOAD_URL_ON_PAUSE});
            this.cachedBundleOnPause = bundle;
            this.isPausedOnLoadUrl = true;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rawdata", this.mArguments == null ? "" : this.mArguments.getString("_k_k_o_u_", ""));
            if (bundle == null) {
                z = false;
            }
            jSONObject.put("restore", z);
            this.webViewEnv.put("entry", jSONObject);
        } catch (Throwable th) {
            if (KNBWebManager.isDebug()) {
                throw new RuntimeException(th);
            }
        }
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebCompatDelegate
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e74723101d68fddb141c3694a6ac405", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e74723101d68fddb141c3694a6ac405");
        } else if (this.mWebView != null) {
            this.mWebView.saveState(bundle);
        }
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebCompatDelegate
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d5b79728c692f077d989b36300e0d421", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d5b79728c692f077d989b36300e0d421");
            return;
        }
        this.isPause = false;
        this.hasLoaded = false;
        TitansCrashReporter.changeUrlFromMap(toString());
        if (this.mWebView != null) {
            this.mWebView.onResume();
            if (this.isFromBackground) {
                publish("foreground");
                this.isFromBackground = false;
                reportCompatAppearTime();
            } else {
                appear();
            }
        }
        if (this.isPausedOnLoadUrl) {
            c.a("load url on resume", 35, new String[]{LOGAN_TAG_DONT_LOAD_URL_ON_PAUSE});
            loadUrlOnCreate(this.cachedBundleOnPause);
            this.cachedBundleOnPause = null;
            this.isPausedOnLoadUrl = false;
        }
    }

    private void loadUrlOnCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0766858ce29e5a8d31f1ec09b7d37c46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0766858ce29e5a8d31f1ec09b7d37c46");
        } else if (bundle != null) {
            if (this.mWebView == null || this.mWebView.restoreState(bundle) != null || TextUtils.isEmpty(this.mUrl)) {
                return;
            }
            loadUrl(processUrl(this.mUrl), this.mHeaders);
        } else if (TextUtils.isEmpty(this.mUrl)) {
        } else {
            loadUrl(processUrl(this.mUrl), this.mHeaders);
        }
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebCompatDelegate
    public void appear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "874e7255830fe626409265217444010e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "874e7255830fe626409265217444010e");
            return;
        }
        loadJs("javascript:window.DPApp && window.DPApp.onAppear && window.DPApp.onAppear();" + JavaScriptComposer.makeCustomeEvent("KNB:appear", "web view did appear"));
        this.isAppear = true;
        reportCompatAppearTime();
    }

    @Override // com.dianping.titans.js.KNBJsHost
    public void setWebViewCanPause(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c04b1d7d0e9cd65e15ccedf7c73d625", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c04b1d7d0e9cd65e15ccedf7c73d625");
        } else if (TextUtils.isEmpty(this.mUrl) || !this.mUrl.contains("trip/live-video/live-index/index")) {
        } else {
            this.mWebViewCanPause = z;
        }
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebCompatDelegate
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d53482f29593a226369fa42e0d62468", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d53482f29593a226369fa42e0d62468");
            return;
        }
        this.isPause = true;
        for (Map.Entry<String, JsHandler> entry : this.mJsHandlerMap.entrySet()) {
            if (!TextUtils.isEmpty(entry.getKey()) && (entry.getValue() instanceof BaseJsHandler)) {
                ((BaseJsHandler) entry.getValue()).onPause();
            }
        }
        if (this.mWebView != null) {
            if (this.mWebViewCanPause) {
                this.mWebView.onPause();
            }
            if (this.hasStartActivity) {
                disappear();
                this.hasStartActivity = false;
                this.hasLoaded = true;
            }
        }
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebCompatDelegate
    public void disappear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e7ff455dd4a33c2b1e721019dbcbcafd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e7ff455dd4a33c2b1e721019dbcbcafd");
            return;
        }
        loadJs("javascript:window.DPApp && window.DPApp.onDisappear && window.DPApp.onDisappear();" + JavaScriptComposer.makeCustomeEvent("KNB:disappear", "web view will disappear"));
        this.isAppear = false;
        reportCompatAppearElapse();
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebCompatDelegate
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9684d4bc0bd183abb37f11666c2a5b6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9684d4bc0bd183abb37f11666c2a5b6a");
            return;
        }
        if (!this.hasLoaded) {
            this.hasLoaded = true;
            this.isFromBackground = ProcessUtil.isBackground(getContext());
            if (this.isFromBackground) {
                publish("background");
                reportCompatAppearElapse();
            } else {
                disappear();
            }
        }
        TitansCrashReporter.clearKNBUrl();
        JsHandlerReportImpl.triggerUsageReport();
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebCompatDelegate
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6775841089f2c30086229b415da8550", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6775841089f2c30086229b415da8550");
            return;
        }
        TitansCrashReporter.removeUrlFromMap(toString());
        TitansReporter.removeTitansReportBuilder(this);
        this.mIsFinished = true;
        for (Map.Entry<String, JsHandler> entry : this.mJsHandlerMap.entrySet()) {
            if (!TextUtils.isEmpty(entry.getKey())) {
                entry.getValue().onDestroy();
            }
        }
        if (this.mLayWeb != null) {
            this.mLayWeb.removeAllViews();
        }
        if (this.mWebView != null) {
            this.mWebView.removeAllViews();
            this.mWebView.destroy();
        }
        if (this.hasPublishForMultiProcess) {
            PublishReceiverManager.unregisterReceiver(this.mContext);
        }
        AbstractJSBPerformer jSBPerformer = KNBWebManager.getJSBPerformer();
        if (jSBPerformer != null) {
            jSBPerformer.stopLocating();
        }
        try {
            this.mContext.unregisterReceiver(this.sNetChangedListener);
            if (this.hasDMObserved) {
                this.mContext.getApplicationContext().unregisterReceiver(this.mDownloadListener);
            }
        } catch (Throwable th) {
            if (KNBWebManager.isDebug()) {
                Log.e(TAG, null, th);
            }
        }
        JsHandlerFactory.removeJsHost(this);
        EventReporter eventReporter = EventReporter.getInstance();
        long currentTimeMillis = System.currentTimeMillis();
        Uri parse = this.mUrl != null ? Uri.parse(this.mUrl) : null;
        eventReporter.reportTiming("Page.Run", parse, currentTimeMillis - this.knbCreateInitTime);
        eventReporter.reportTiming("Page.RunAlive", parse, this.knbCompatAppearElapse);
        if (this.mNovaEftedWebViewClient != null && !this.mNovaEftedWebViewClient.isPageFinished()) {
            eventReporter.reportPageAccess(parse, 2, BuildConfig.VERSION_NAME);
            eventReporter.reportTiming("Page.Abort", parse, currentTimeMillis - this.mNovaEftedWebViewClient.obtainPageStartedTime());
            eventReporter.reportTiming("FullPage.Abort", parse, currentTimeMillis - this.knbCreateInitTime);
        }
        if (!this.mSendEventPageTTIDone) {
            eventReporter.reportTiming("Page.Abort.TTI", parse, currentTimeMillis - this.knbCreateInitTime, this.mSendEventLastFrame);
        }
        if (this.mLayTitle != null) {
            this.mLayTitle.onDestroy();
        }
        SensorHandler.getInstance(getContext()).unregisterShakeListener(this.shakeListener);
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebCompatDelegate
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f32e1ec3a0470cc3d4e2deee2a6e3c36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f32e1ec3a0470cc3d4e2deee2a6e3c36");
        } else if (this.isWebViewInitFailed) {
            finish();
        } else {
            LineTitleLayout dynamicTitleBar = getDynamicTitleBar();
            if (dynamicTitleBar != null) {
                List<View> childrenByAction = dynamicTitleBar.getChildrenByAction("back");
                int size = childrenByAction == null ? 0 : childrenByAction.size();
                if (size == 0) {
                    goBack();
                    return;
                }
                for (int i = 0; i < size; i++) {
                    childrenByAction.get(i).performClick();
                }
            } else if (getTitleBarHost() != null) {
                getTitleBarHost().performLLClick();
            }
        }
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebCompatDelegate
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9fbcf338ce695786e27f58a5d675d70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9fbcf338ce695786e27f58a5d675d70");
            return;
        }
        for (Map.Entry<String, JsHandler> entry : this.mJsHandlerMap.entrySet()) {
            if (!TextUtils.isEmpty(entry.getKey())) {
                entry.getValue().onActivityResult(i, i2, intent);
            }
        }
        if (i == 110) {
            if (intent != null) {
                String a = f.a(intent, "resultData");
                this.result = new JSONObject();
                try {
                    try {
                        this.result.put(Constant.KEY_RESULT_CODE, i2);
                        this.result.put("resultData", a);
                        return;
                    } catch (JSONException unused) {
                        return;
                    }
                } catch (JSONException unused2) {
                    this.result.put("errorCode", "-1");
                    this.result.put("errorMsg", "internal error.");
                    this.result.put("status", "fail");
                    return;
                }
            }
            this.result = null;
            return;
        }
        if (i == 3) {
            if (Build.VERSION.SDK_INT >= 21 && this.mUploadCallbackAboveL != null) {
                this.mUploadCallbackAboveL.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(i2, intent));
            } else if (this.mUploadMessage != null) {
                this.mUploadMessage.onReceiveValue((intent == null || i2 != -1) ? null : intent.getData());
                this.mUploadMessage = null;
                return;
            } else {
                return;
            }
        } else if (i != 4 || Build.VERSION.SDK_INT < 21) {
            return;
        } else {
            if (this.mUploadCallbackAboveL != null) {
                ShowFileChooserUtils.handleActivityResult(this.mUploadCallbackAboveL, i2, intent);
            }
        }
        this.mUploadCallbackAboveL = null;
    }

    @Override // com.dianping.titans.js.JsHost
    public JSONObject getResult() {
        return this.result;
    }

    @Override // com.dianping.titans.js.JsHost
    public void onWebViewTitleReceived(String str) {
        BaseTitleBar titleBarHost;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3153a5effc08f0715a1f676677a08f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3153a5effc08f0715a1f676677a08f0");
            return;
        }
        LineTitleLayout dynamicTitleBar = getDynamicTitleBar();
        if (dynamicTitleBar != null) {
            setTitle(dynamicTitleBar, str, false);
        } else if (this.mHasTitleSettled || (titleBarHost = getTitleBarHost()) == null) {
        } else {
            titleBarHost.setWebTitle(str);
        }
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebCompatDelegate
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "83eaa26cc542f5adbbcaabffb7a7c05d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "83eaa26cc542f5adbbcaabffb7a7c05d");
            return;
        }
        for (String str : this.mJsHandlerMap.keySet()) {
            if (!TextUtils.isEmpty(str)) {
                this.mJsHandlerMap.get(str).onRequestPermissionsResult(i, strArr, iArr);
            }
        }
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebCompatDelegate
    public void setArguments(Bundle bundle) {
        this.mArguments = bundle;
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebCompatDelegate
    public void setupWebSettings(WebSettings webSettings) {
        Object[] objArr = {webSettings};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "275d0a47b1ae77f999c2517cdbf2bb04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "275d0a47b1ae77f999c2517cdbf2bb04");
            return;
        }
        super.setupWebSettings(webSettings);
        StringBuilder sb = new StringBuilder(webSettings.getUserAgentString());
        if (KNBWebManager.sOnAppendUAListener != null && !TextUtils.isEmpty(KNBWebManager.sOnAppendUAListener.onAppendUA())) {
            sb.append(StringUtil.SPACE);
            sb.append(KNBWebManager.sOnAppendUAListener.onAppendUA());
        }
        if (!sb.toString().contains(TitansWebManager.ua())) {
            sb.append(StringUtil.SPACE);
            sb.append(TitansWebManager.ua());
        }
        if (this.mOnAppendUAListener != null && !TextUtils.isEmpty(this.mOnAppendUAListener.onAppendUA())) {
            sb.append(StringUtil.SPACE);
            sb.append(this.mOnAppendUAListener.onAppendUA());
        }
        String str = StringUtil.SPACE + getAppUA(getContext().getApplicationContext());
        if (!sb.toString().contains(str)) {
            sb.append(str);
        }
        webSettings.setUserAgentString(sb.toString());
        CrashUtil.recordWebUserAgent(sb.toString());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
        if (r1.equals("com.sankuai.movie") != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String getAppUA(android.content.Context r13) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl.getAppUA(android.content.Context):java.lang.String");
    }

    public void initWebView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4bd66a8e2a1a04791ba443697cbbfb28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4bd66a8e2a1a04791ba443697cbbfb28");
        } else if (this.mWebView == null) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                CookieManager.getInstance().setAcceptThirdPartyCookies(this.mWebView, this.acceptThirdPartyCookies);
            }
            WebSettings settings = this.mWebView.getSettings();
            this.mWebView.setWebChromeClient(createWebChromeClient());
            this.mWebView.setWebViewClient(createWebViewClient());
            this.mWebView.setScrollBarStyle(0);
            if (Build.VERSION.SDK_INT >= 11) {
                this.mWebView.removeJavascriptInterface("searchBoxJavaBridge_");
            }
            setupWebSettings(settings);
            this.mWebView.addJavascriptInterface(new KNBInterface(this), "KNBTitansX");
            this.mWebView.addJavascriptInterface(new KNBTitansXSync(this), "KNBTitansXSync");
            if (this.mWebView instanceof TitansWebView) {
                ((TitansWebView) this.mWebView).setResizeListener(new TitansWebView.ResizeListener() { // from class: com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl.8
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.dianping.titans.widget.TitansWebView.ResizeListener
                    public void onWebViewSizeChanged(int i, int i2, int i3, int i4) {
                        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5565b00c37f41c43199e172fd68dc047", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5565b00c37f41c43199e172fd68dc047");
                            return;
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("action", "resize");
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("width", i3);
                            jSONObject2.put("height", i4);
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("width", i);
                            jSONObject3.put("height", i2);
                            jSONObject.put("from", jSONObject2);
                            jSONObject.put(RemoteMessageConst.TO, jSONObject3);
                            KNBWebCompatDelegateImpl.this.publish(jSONObject);
                        } catch (JSONException unused) {
                        }
                    }
                });
                ((TitansWebView) this.mWebView).setScrollListener(new TitansWebView.ScrollListener() { // from class: com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl.9
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.dianping.titans.widget.TitansWebView.ScrollListener
                    public void onWebViewScrollChanged(int i, int i2, int i3, int i4) {
                        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ba955029424a970fcccf63e60402ce5b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ba955029424a970fcccf63e60402ce5b");
                        } else if (KNBWebCompatDelegateImpl.this.mOnScroll) {
                            KNBWebCompatDelegateImpl.this.loadJs("javascript:window.DPApp && window.DPApp.onScroll && window.DPApp.onScroll({offset:" + i2 + "});");
                        }
                    }
                });
                ((TitansWebView) this.mWebView).setVisibleListener(new TitansWebView.VisibleListener() { // from class: com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl.10
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.dianping.titans.widget.TitansWebView.VisibleListener
                    public void onVisibleChanged(boolean z) {
                        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "02107395c1805c79ce6b6d54e1c9791c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "02107395c1805c79ce6b6d54e1c9791c");
                            return;
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("visible", z);
                        } catch (JSONException e) {
                            if (KNBWebManager.isDebug()) {
                                e.printStackTrace();
                            }
                        }
                        KNBWebCompatDelegateImpl.this.loadJs(JavaScriptComposer.makeCustomeEvent("KNB:visibilityChanged", jSONObject));
                    }
                });
            }
            this.mWebView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl.11
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.view.View.OnLongClickListener
                public boolean onLongClick(View view) {
                    int type;
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6dcaeb843541af88392d1dc79156e334", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6dcaeb843541af88392d1dc79156e334")).booleanValue();
                    }
                    if (KNBWebCompatDelegateImpl.this.isActivated() && (view instanceof WebView)) {
                        try {
                            WebView.HitTestResult hitTestResult = ((WebView) view).getHitTestResult();
                            if (hitTestResult != null && ((type = hitTestResult.getType()) == 5 || type == 8)) {
                                final String extra = hitTestResult.getExtra();
                                Context context = view.getContext();
                                new AlertDialog.Builder(KNBWebCompatDelegateImpl.this.getActivity()).setItems(new String[]{context.getString(R.string.save_picture_to_album), context.getString(R.string.cancel)}, new DialogInterface.OnClickListener() { // from class: com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl.11.1
                                    public static ChangeQuickRedirect changeQuickRedirect;

                                    @Override // android.content.DialogInterface.OnClickListener
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        Object[] objArr3 = {dialogInterface, Integer.valueOf(i)};
                                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "c57532533e05167ac26d7cdb3c4c726c", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "c57532533e05167ac26d7cdb3c4c726c");
                                        } else if (i == 0) {
                                            KNBWebCompatDelegateImpl.this.saveImage(extra);
                                        } else if (i == 1) {
                                            dialogInterface.cancel();
                                        }
                                    }
                                }).show();
                                return true;
                            }
                        } catch (Exception unused) {
                        }
                    }
                    return false;
                }
            });
        }
    }

    public WebChromeClient createWebChromeClient() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e33c9c58fbd39f18622459dcf5a4368", RobustBitConfig.DEFAULT_VALUE)) {
            return (WebChromeClient) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e33c9c58fbd39f18622459dcf5a4368");
        }
        this.mNovaEfteWebChromeClient = new KNBWebChromeClient(this, new KNBWebChromeListenerImpl(this));
        this.mNovaEfteWebChromeClient.setWebView(this.mWebView);
        this.mNovaEfteWebChromeClient.setOnProgressChangeListener(this.onProgressChangeListener);
        return this.mNovaEfteWebChromeClient;
    }

    public WebViewClient createWebViewClient() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f888179a89cb006c3e0ca5ccca4c819", RobustBitConfig.DEFAULT_VALUE)) {
            return (WebViewClient) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f888179a89cb006c3e0ca5ccca4c819");
        }
        KNBWebViewClient kNBWebViewClient = new KNBWebViewClient(this, new KNBWebClientListenerImpl(this));
        this.mNovaEftedWebViewClient = kNBWebViewClient;
        return kNBWebViewClient;
    }

    public void handleArguments() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf8fc1f195a65e0515f52d14a10a760b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf8fc1f195a65e0515f52d14a10a760b");
        } else if (this.mArguments == null) {
        } else {
            String string = this.mArguments.getString(getInnerURLKey());
            if (TextUtils.isEmpty(string)) {
                string = this.mArguments.getString("_k_k_o_u_");
            }
            if (TextUtils.isEmpty(string) && getActivity() != null && getActivity().getIntent() != null && getActivity().getIntent().getData() != null) {
                string = getActivity().getIntent().getData().toString();
                if (!URLUtil.isNetworkUrl(string)) {
                    string = null;
                }
            }
            if (!TextUtils.isEmpty(string)) {
                if (URLUtil.isHttpsUrl(string) || URLUtil.isHttpUrl(string)) {
                    this.mUrl = string;
                } else {
                    try {
                        this.mUrl = URLDecoder.decode(string);
                    } catch (Exception unused) {
                        this.mUrl = string;
                    }
                }
                if (this.mUrl.startsWith("//")) {
                    this.mUrl = "https:" + this.mUrl;
                }
            }
            String argument = getArgument("notitlebar", "");
            if (!TextUtils.isEmpty(argument)) {
                this.mIsNoTitleBar = ("1".equals(argument) || "true".equals(argument)) ? true : true;
            }
            try {
                this.future = Integer.parseInt(getArgument("future", "0"));
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            try {
                String argument2 = getArgument("webColor", "");
                if (!TextUtils.isEmpty(argument2)) {
                    this.schemeWebBgColor = WebUtil.getRGBAColor(argument2);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (hasFuture(2)) {
                initImmersiveStatusBar();
            }
            this.noQuery = "1".equals(this.mArguments.getString("noquery", null));
        }
    }

    private String getArgument(String str, String str2) {
        Uri uri;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2fc940538b1574604c56a39a554d142e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2fc940538b1574604c56a39a554d142e");
        }
        if (this.mArguments != null) {
            String string = this.mArguments.getString(str, null);
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
        }
        if (!TextUtils.isEmpty(this.mUrl)) {
            try {
                uri = Uri.parse(this.mUrl);
            } catch (Exception unused) {
                uri = null;
            }
            if (uri != null && uri.isHierarchical()) {
                String queryParameter = uri.getQueryParameter(str);
                if (!TextUtils.isEmpty(queryParameter)) {
                    return queryParameter;
                }
            }
        }
        return str2;
    }

    private void initImmersiveStatusBar() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af9a3f00cf5e44c484d305c3a54a97d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af9a3f00cf5e44c484d305c3a54a97d0");
        } else if (Build.VERSION.SDK_INT < 21 || !this.mIsNoTitleBar || getActivity() == null || getActivity().isFinishing() || getActivity().getWindow() == null || getActivity().getWindow().getDecorView() == null) {
        } else {
            Window window = getActivity().getWindow();
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility() | 1024;
            if (hasFuture(4)) {
                systemUiVisibility = systemUiVisibility | 4096 | 2 | 4;
                decorView.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl.12
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // android.view.View.OnSystemUiVisibilityChangeListener
                    public void onSystemUiVisibilityChange(int i) {
                        Object[] objArr2 = {Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6c0980073786917756a5147d58275ef2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6c0980073786917756a5147d58275ef2");
                        } else if ((i & 2) != 0 || KNBWebCompatDelegateImpl.this.getActivity() == null || KNBWebCompatDelegateImpl.this.getActivity().isFinishing()) {
                        } else {
                            KNBWebCompatDelegateImpl.this.getActivity().getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl.12.1
                                public static ChangeQuickRedirect changeQuickRedirect;

                                @Override // java.lang.Runnable
                                public void run() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "afe2d52f6b9065823683d9f896407caa", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "afe2d52f6b9065823683d9f896407caa");
                                    } else if (KNBWebCompatDelegateImpl.this.getActivity() == null || KNBWebCompatDelegateImpl.this.getActivity().isFinishing()) {
                                    } else {
                                        KNBWebCompatDelegateImpl.this.getActivity().getWindow().getDecorView().setSystemUiVisibility(KNBWebCompatDelegateImpl.this.getActivity().getWindow().getDecorView().getSystemUiVisibility() | 4 | 2 | 4096);
                                    }
                                }
                            }, 16L);
                        }
                    }
                });
            }
            decorView.setSystemUiVisibility(systemUiVisibility);
        }
    }

    private boolean hasFuture(int i) {
        return (this.future & i) == i;
    }

    public BaseTitleBar createDefaultTitleBar() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6005a099abb9c7765a825f554a16e17b", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseTitleBar) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6005a099abb9c7765a825f554a16e17b");
        }
        BaseTitleBar defaultTitleBar = getUIManager().getDefaultTitleBar();
        return defaultTitleBar != null ? defaultTitleBar : new DefaultTitleBar(getContext());
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initTitleBar(boolean r13) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl.initTitleBar(boolean):void");
    }

    public String processUrl(String str) {
        Intent handleGetIntent;
        Uri data;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "998f841c66d049816f4cb86382b4aab1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "998f841c66d049816f4cb86382b4aab1");
        }
        Uri parse = Uri.parse(str);
        if (parse.isHierarchical()) {
            this.mTitle = parse.getQueryParameter("title");
        }
        if (TextUtils.isEmpty(this.mTitle) && this.mActivityHandler != null && (handleGetIntent = this.mActivityHandler.handleGetIntent()) != null && (data = handleGetIntent.getData()) != null && data.isHierarchical()) {
            this.mTitle = data.getQueryParameter("title");
        }
        return str;
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebCompatDelegate
    public String wrapUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "817756fc9cdae92d231c4913a9f5e07b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "817756fc9cdae92d231c4913a9f5e07b");
        }
        if (this.noQuery) {
            return str;
        }
        Uri parse = Uri.parse(str);
        String host = parse.getHost();
        String path = parse.getPath();
        String queryParameter = parse.isHierarchical() ? parse.getQueryParameter("_mtcq") : "";
        if ((TextUtils.isEmpty(queryParameter) || !queryParameter.equals("0")) && !TextUtils.equals(host, "t.meituan.com")) {
            StringBuilder sb = new StringBuilder();
            sb.append(host);
            sb.append(path);
            return (TextUtils.equals(sb.toString(), "m.dianping.com/synthesis/shortlink") || this.mAnalyzeParamsListener == null || !KNBWebManager.needWrapUrl(str)) ? str : this.mAnalyzeParamsListener.appendAnalyzeParams(str);
        }
        return str;
    }

    public void initMask(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84be9eb5b5c3a86578209ad122b226c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84be9eb5b5c3a86578209ad122b226c9");
            return;
        }
        this.mLayMask = (FrameLayout) view.findViewById(R.id.mask);
        if (this.mLayMask == null) {
            return;
        }
        this.mLayMask.removeAllViews();
        LayoutInflater.from(this.mContext).inflate(getUIManager().getMaskLayoutResId(), (ViewGroup) this.mLayMask, true).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl.15
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ca99333bf89a0771ac22f764e65dd1e7", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ca99333bf89a0771ac22f764e65dd1e7");
                    return;
                }
                if (KNBWebCompatDelegateImpl.this.mWebView != null) {
                    KNBWebCompatDelegateImpl.this.mWebView.reload();
                }
                KNBWebCompatDelegateImpl.this.hideMask();
            }
        });
    }

    public void resetMask() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0dc6a2382746c62cf06da3f1c956ddcc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0dc6a2382746c62cf06da3f1c956ddcc");
        } else if (this.mLayMask == null) {
        } else {
            int i = R.string.service_unavailable;
            boolean z = true;
            try {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) getContext().getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    if (activeNetworkInfo.isConnected()) {
                        z = false;
                    }
                }
            } catch (Exception unused) {
            }
            if (z) {
                i = R.string.default_error_message;
            }
            try {
                ((TextView) this.mLayMask.findViewById(16908308)).setText(i);
            } catch (Exception unused2) {
            }
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public void showMask() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d43ac323ca15c148d23480b0884066f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d43ac323ca15c148d23480b0884066f3");
        } else {
            showMask(0, "show mask", getUrl());
        }
    }

    @Override // com.dianping.titans.js.KNBJsHost
    public void showMask(int i, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e76895b99a3c73f992a5a049eceb7fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e76895b99a3c73f992a5a049eceb7fa");
            return;
        }
        if (!this.isMaskInited) {
            initMask(this.mRootView);
            this.isMaskInited = true;
        }
        if (this.mLayMask == null) {
            return;
        }
        resetMask();
        ViewUtils.showView(this.mLayMask);
        if (this.mWebView != null) {
            ViewUtils.hideView(this.mWebView, false);
        }
        TitansUIManager.ReceivedErrorListener receivedErrorListener = getUIManager().getReceivedErrorListener();
        if (receivedErrorListener != null) {
            receivedErrorListener.onReceivedError(this.mLayMask, i, str, str2);
        }
    }

    private void setTitle(LineTitleLayout lineTitleLayout, String str, boolean z) {
        boolean z2 = true;
        Object[] objArr = {lineTitleLayout, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af6d45b1c043b928eec53caa6329cddd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af6d45b1c043b928eec53caa6329cddd");
            return;
        }
        if (z) {
            if (!this.mHasTitleSettled) {
                this.mHasTitleSettled = true;
            }
        } else {
            z2 = true ^ this.mHasTitleSettled;
        }
        if (z2) {
            View primaryView = lineTitleLayout.getPrimaryView();
            if (primaryView instanceof TextView) {
                ((TextView) primaryView).setText(str);
            }
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public void setTitle(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f211018005950684527100a78a9e59f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f211018005950684527100a78a9e59f2");
            return;
        }
        LineTitleLayout dynamicTitleBar = getDynamicTitleBar();
        if (dynamicTitleBar != null) {
            setTitle(dynamicTitleBar, str, true);
            return;
        }
        if (!this.mHasTitleSettled) {
            this.mHasTitleSettled = true;
        }
        BaseTitleBar titleBarHost = getTitleBarHost();
        if (titleBarHost != null) {
            titleBarHost.setWebTitle(str);
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public void goBack() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9dc16d273e40cd1bd732913ae3e62f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9dc16d273e40cd1bd732913ae3e62f7");
        } else if (this.mNovaEfteWebChromeClient != null && this.mNovaEfteWebChromeClient.mCustomView != null) {
            this.mNovaEfteWebChromeClient.onHideCustomView();
        } else if (canGoBack()) {
            this.mWebView.goBack();
            this.mIsBtnCloseShow = true;
        } else {
            finish();
        }
    }

    public void hideMask() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d255761a77a4f52c230a90406fd4de34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d255761a77a4f52c230a90406fd4de34");
        } else if (this.mLayMask == null) {
        } else {
            ViewUtils.hideView(this.mLayMask, true);
            if (this.mWebView != null) {
                ViewUtils.showView(this.mWebView);
            }
        }
    }

    public JsHandler getSubscribeJsHandler(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ddc2ae3242d2f025f2dc2ef4df560b84", RobustBitConfig.DEFAULT_VALUE) ? (JsHandler) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ddc2ae3242d2f025f2dc2ef4df560b84") : this.mSubscribeJsHandlerMap.get(str);
    }

    public boolean canGoBack() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42f5d6cb49c6fa22215a0d0b99d6851d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42f5d6cb49c6fa22215a0d0b99d6851d")).booleanValue() : (TextUtils.isEmpty(this.mUrl) || this.mWebView == null || !this.mWebView.canGoBack()) ? false : true;
    }

    public void showLoadingView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b1b4c82585ef9794624205d4fcaab8e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b1b4c82585ef9794624205d4fcaab8e8");
            return;
        }
        View view = null;
        if (this.mOnLoadingListener != null && this.mOnLoadingListener.getLoadingDrawable() != null) {
            view = this.mOnLoadingListener.getLoadingView(LayoutInflater.from(getContext()));
        }
        if (view == null || this.mLayVideo == null) {
            return;
        }
        this.mLayVideo.addView(view);
        this.mLayVideo.setVisibility(0);
        if (this.mWebView != null) {
            this.mWebView.setVisibility(8);
        }
        if (this.mOnLoadingListener != null && this.mOnLoadingListener.getLoadingImageView() != null) {
            this.mOnLoadingListener.getLoadingImageView().setImageDrawable(this.mOnLoadingListener.getLoadingDrawable());
        }
        operationDrawable(true);
    }

    public void resetLoading() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ca806bccdf1194340d0c8c34392e9bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ca806bccdf1194340d0c8c34392e9bb");
            return;
        }
        operationDrawable(false);
        if (this.mWebView != null) {
            this.mWebView.setVisibility(0);
        }
        if (this.mLayVideo != null) {
            this.mLayVideo.setVisibility(8);
            if (this.mLayVideo.getChildCount() > 0) {
                this.mLayVideo.removeAllViews();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveImage(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7a2a4ae108565839e7b2d83b99c6721", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7a2a4ae108565839e7b2d83b99c6721");
        } else if (this.mWebView == null) {
        } else {
            if (!Environment.getExternalStorageState().equals("mounted")) {
                this.mWebView.post(new Runnable() { // from class: com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl.16
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "85f7e008ed09d27dabd4fdee3f3aaa9c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "85f7e008ed09d27dabd4fdee3f3aaa9c");
                        } else if (KNBWebCompatDelegateImpl.this.mContext == null || KNBWebCompatDelegateImpl.this.mWebView == null) {
                        } else {
                            UIUtil.showLongToast(KNBWebCompatDelegateImpl.this.mWebView, KNBWebCompatDelegateImpl.this.mContext.getString(R.string.knb_can_not_save_pic));
                        }
                    }
                });
                return;
            }
            this.mDownloadImgUrl = str;
            TitansPermissionUtil.requestPermission(getActivity(), PermissionGuard.PERMISSION_STORAGE, "pt-e5d5124c14e96708", new IRequestPermissionCallback() { // from class: com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl.17
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.titans.result.IRequestPermissionCallback
                public void onResult(boolean z, int i) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "046b434ee844d3dcdd18ec7ef15587e3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "046b434ee844d3dcdd18ec7ef15587e3");
                    } else if (z) {
                        KNBWebCompatDelegateImpl.this.downloadImage();
                    } else {
                        UIUtil.showShortToast(KNBWebCompatDelegateImpl.this.getActivity(), "没有保存图片权限");
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void downloadImage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "16fa4d81e3f7c87fba12a89ba0dbe79e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "16fa4d81e3f7c87fba12a89ba0dbe79e");
        } else if (TextUtils.isEmpty(this.mDownloadImgUrl)) {
        } else {
            ImageDownloadUtil.downloadFile(getContext(), this.mDownloadImgUrl, "pt-e5d5124c14e96708", new ImageDownloadUtil.DownloadCallback() { // from class: com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl.18
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.titans.utils.ImageDownloadUtil.DownloadCallback
                public void onFail(KNBJsErrorInfo kNBJsErrorInfo) {
                    Object[] objArr2 = {kNBJsErrorInfo};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f24b1408da5c5f331dd6bae9a569d998", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f24b1408da5c5f331dd6bae9a569d998");
                    } else {
                        KNBWebCompatDelegateImpl.this.mWebView.post(new Runnable() { // from class: com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl.18.1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // java.lang.Runnable
                            public void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "b5906bf6b46079e04e42619cb3a04548", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "b5906bf6b46079e04e42619cb3a04548");
                                } else if (KNBWebCompatDelegateImpl.this.mContext == null || KNBWebCompatDelegateImpl.this.mWebView == null) {
                                } else {
                                    UIUtil.showLongToast(KNBWebCompatDelegateImpl.this.mWebView, KNBWebCompatDelegateImpl.this.mContext.getString(R.string.knb_save_failed));
                                }
                            }
                        });
                    }
                }

                @Override // com.dianping.titans.utils.ImageDownloadUtil.DownloadCallback
                public void onSuccess(String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "482276ec61c5dbfe4860143628b23f0d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "482276ec61c5dbfe4860143628b23f0d");
                    } else {
                        KNBWebCompatDelegateImpl.this.mWebView.post(new Runnable() { // from class: com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl.18.2
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // java.lang.Runnable
                            public void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "8ba3652a7b187a342fab4f6a7ffa9aa1", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "8ba3652a7b187a342fab4f6a7ffa9aa1");
                                } else if (KNBWebCompatDelegateImpl.this.mContext == null || KNBWebCompatDelegateImpl.this.mWebView == null) {
                                } else {
                                    UIUtil.showLongToast(KNBWebCompatDelegateImpl.this.mWebView, KNBWebCompatDelegateImpl.this.mContext.getString(R.string.knb_save_success));
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    private void setWebViewCookies() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dbc8badd7ddfcfda6df9f17b776758a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dbc8badd7ddfcfda6df9f17b776758a8");
        } else if (this.hasCookiesSettled) {
        } else {
            this.hasCookiesSettled = true;
            CookieUtil.setCookie(getCityCookie());
            CookieUtil.setCookie(getNetworkCookie());
            CookieUtil.setCookie(getUUIDCookie());
            CookieUtil.setCookie(getLocationCookie());
            CookieUtil.setCookie(getTokenCookie());
            if (KNBWebManager.getiSetCookie() != null) {
                KNBWebManager.getiSetCookie().onSetCookie();
            }
        }
    }

    private HttpCookie getCityCookie() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c93dad1cf5a489c1d25c38f1c9bc54d", RobustBitConfig.DEFAULT_VALUE)) {
            return (HttpCookie) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c93dad1cf5a489c1d25c38f1c9bc54d");
        }
        String valueOf = String.valueOf(getCityId());
        if (TextUtils.isEmpty(valueOf)) {
            return null;
        }
        HttpCookie httpCookie = new HttpCookie(Constants.Environment.KEY_CITYID, valueOf);
        httpCookie.setMaxAge(314496000L);
        return httpCookie;
    }

    private HttpCookie getUUIDCookie() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d0435c20b1ba6dbe3a54cc59222151f4", RobustBitConfig.DEFAULT_VALUE)) {
            return (HttpCookie) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d0435c20b1ba6dbe3a54cc59222151f4");
        }
        String uuid = getUUID();
        if (TextUtils.isEmpty(uuid)) {
            return null;
        }
        HttpCookie httpCookie = new HttpCookie(TextUtils.isEmpty(CookieUtil.getUuidCookieKey()) ? "uuid" : CookieUtil.getUuidCookieKey(), uuid);
        httpCookie.setMaxAge(314496000L);
        return httpCookie;
    }

    private HttpCookie getLocationCookie() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "307e408df101fe8f84fce0bdf633eacd", RobustBitConfig.DEFAULT_VALUE)) {
            return (HttpCookie) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "307e408df101fe8f84fce0bdf633eacd");
        }
        boolean isCookiePrivacySwitch = PrivacyTitansManager.getInstance().isCookiePrivacySwitch();
        c.a("KNBWebCompatDelegateImpl.getLocationCookie---cookiePrivacySwitch=" + isCookiePrivacySwitch, 35, new String[]{"privacy_cookie"});
        HttpCookie httpCookie = null;
        if (isCookiePrivacySwitch) {
            HttpCookie httpCookie2 = new HttpCookie("latlng", "");
            httpCookie2.setMaxAge(3600L);
            return httpCookie2;
        }
        String lat = getLat();
        String lng = getLng();
        if (!TextUtils.isEmpty(lat) || !TextUtils.isEmpty(lng)) {
            httpCookie = new HttpCookie("latlng", lat + CommonConstant.Symbol.COMMA + lng + CommonConstant.Symbol.COMMA + System.currentTimeMillis());
            httpCookie.setMaxAge(3600L);
            z = true;
        }
        c.a("KNBWebCompatDelegateImpl.getLocationCookie---cookiePrivacySwitch=false ;hasLocationCookieValue" + z, 35, new String[]{"privacy_cookie"});
        return httpCookie;
    }

    private HttpCookie getNetworkCookie() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b101363bc080e71aaeab2350ad856374", RobustBitConfig.DEFAULT_VALUE)) {
            return (HttpCookie) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b101363bc080e71aaeab2350ad856374");
        }
        HttpCookie httpCookie = new HttpCookie("network", NetworkUtil.getNetworkTypeString(this.mContext.getApplicationContext(), "pt-9099367dd7fbc289"));
        httpCookie.setMaxAge(TbsDownloadConfig.DEFAULT_RETRY_INTERVAL_SEC);
        return httpCookie;
    }

    private HttpCookie getTokenCookie() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9eb52ef49b4f83de4a5a80ea369a8a1c", RobustBitConfig.DEFAULT_VALUE)) {
            return (HttpCookie) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9eb52ef49b4f83de4a5a80ea369a8a1c");
        }
        String userToken = getUserToken();
        if (TextUtils.isEmpty(userToken)) {
            return null;
        }
        return new HttpCookie(TextUtils.isEmpty(CookieUtil.getTokenCookieKey()) ? "token" : CookieUtil.getTokenCookieKey(), userToken);
    }

    private void operationDrawable(boolean z) {
        ImageView loadingImageView;
        Drawable drawable;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ddcd187f9fbbcc77e580b1a7e321a2d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ddcd187f9fbbcc77e580b1a7e321a2d2");
        } else if (this.mOnLoadingListener == null || (loadingImageView = this.mOnLoadingListener.getLoadingImageView()) == null || (drawable = loadingImageView.getDrawable()) == null || !(drawable instanceof AnimationDrawable)) {
        } else {
            AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
            animationDrawable.stop();
            if (z) {
                animationDrawable.start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void downloadByDM(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f82548368a0a4cc37ff1bafb4c1bbd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f82548368a0a4cc37ff1bafb4c1bbd2");
            return;
        }
        if (!this.hasDMObserved) {
            try {
                this.mContext.getApplicationContext().registerReceiver(this.mDownloadListener, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
                this.hasDMObserved = true;
            } catch (Throwable th) {
                this.hasDMObserved = false;
                if (KNBWebManager.isDebug()) {
                    Log.e(TAG, null, th);
                }
            }
        }
        DownloadManager downloadManager = (DownloadManager) this.mContext.getSystemService("download");
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setMimeType(str2);
        request.setNotificationVisibility(1);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str3);
        request.allowScanningByMediaScanner();
        if (downloadManager != null) {
            downloadManager.enqueue(request);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class InternalDownloadListener implements DownloadListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        public InternalDownloadListener() {
            Object[] objArr = {KNBWebCompatDelegateImpl.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e86ed7700cbe1d73ab380c747a0e6d2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e86ed7700cbe1d73ab380c747a0e6d2");
            }
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(final String str, String str2, String str3, final String str4, long j) {
            String str5;
            boolean z = true;
            Object[] objArr = {str, str2, str3, str4, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b2230b107a34fc15307ca94713f0168", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b2230b107a34fc15307ca94713f0168");
                return;
            }
            if (KNBWebManager.isDebug()) {
                StringBuilder sb = new StringBuilder("onDownloadStart url: ");
                sb.append(str);
                sb.append(" mime: ");
                sb.append(str4);
                sb.append(" content: ");
                sb.append(str3);
                sb.append(" len: ");
                sb.append(j);
            }
            try {
                if (KNBWebCompatDelegateImpl.this.isActivated()) {
                    TitansReporter.webviewLog("onDownloadStart", "url:" + str + "/ua" + str2 + "/mimeType" + str4);
                    List<String> stringListConfig = KNBConfig.getStringListConfig(KNBConfig.CONFIG_DEPLOY_WHITE, Collections.EMPTY_LIST);
                    int size = stringListConfig.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            z = false;
                            break;
                        } else if (str.contains(stringListConfig.get(i))) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    reportDownloadInfo(str, str2, str3, str4, j, z);
                    KNBWebCompatDelegateImpl.this.mCurrentDownloadUrl = str;
                    if (str4 != null && str4.contains("pdf")) {
                        KNBWebCompatDelegateImpl.this.loadUrl("https://static.meituan.net/bs/mbs-pages/master/pdf-viewer.html?url=" + URLEncoder.encode(str));
                        return;
                    }
                    final String guessFileName = UriUtil.guessFileName(str, str3, str4);
                    if (TextUtils.isEmpty(guessFileName)) {
                        guessFileName = URLUtil.guessFileName(str, str3, str4);
                    }
                    if (!z) {
                        UIUtil.showShortToast(KNBWebCompatDelegateImpl.this.getActivity(), KNBWebCompatDelegateImpl.this.getContext().getString(R.string.knb_download_forbidden) + guessFileName);
                        return;
                    }
                    AlertDialog.Builder builder = new AlertDialog.Builder(KNBWebCompatDelegateImpl.this.getActivity());
                    Context context = KNBWebCompatDelegateImpl.this.getContext();
                    double d = (((100 * j) / 1024) / 1024) / 100.0d;
                    String str6 = context.getString(R.string.knb_download_file) + guessFileName + context.getString(R.string.knb_download_size);
                    if (d > 0.0d) {
                        str5 = str6 + d + ErrorCode.ERROR_TYPE_M;
                    } else {
                        str5 = str6 + context.getString(R.string.knb_download_unknown);
                    }
                    builder.setMessage(str5).setTitle(context.getString(R.string.knb_download_ensure)).setPositiveButton(context.getString(R.string.knb_sure), new DialogInterface.OnClickListener() { // from class: com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl.InternalDownloadListener.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i2) {
                            Object[] objArr2 = {dialogInterface, Integer.valueOf(i2)};
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f490b8fd26efc2fd0b34a0f13afae222", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f490b8fd26efc2fd0b34a0f13afae222");
                                return;
                            }
                            dialogInterface.dismiss();
                            TitansPermissionUtil.requestPermission(KNBWebCompatDelegateImpl.this.getActivity(), PermissionGuard.PERMISSION_STORAGE, "pt-1772329138bd898d", new IRequestPermissionCallback() { // from class: com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl.InternalDownloadListener.1.1
                                public static ChangeQuickRedirect changeQuickRedirect;

                                @Override // com.sankuai.titans.result.IRequestPermissionCallback
                                public void onResult(boolean z2, int i3) {
                                    Object[] objArr3 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i3)};
                                    ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "51cab585738f5f3f37b1880c0dd46f0f", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "51cab585738f5f3f37b1880c0dd46f0f");
                                    } else if (!z2) {
                                        KNBWebCompatDelegateImpl.this.downloadByOther(str);
                                    } else {
                                        try {
                                            KNBWebCompatDelegateImpl.this.downloadByDM(str, str4, guessFileName);
                                        } catch (Throwable unused) {
                                            KNBWebCompatDelegateImpl.this.downloadByOther(str);
                                        }
                                    }
                                }
                            });
                        }
                    }).show();
                }
            } catch (Throwable th) {
                if (KNBWebManager.isDebug()) {
                    Log.e(KNBWebCompatDelegateImpl.TAG, null, th);
                }
            }
        }

        private void reportDownloadInfo(String str, String str2, String str3, String str4, long j, boolean z) {
            Object[] objArr = {str, str2, str3, str4, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81a6e9dd56d0fe8d325b679e5311ff8f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81a6e9dd56d0fe8d325b679e5311ff8f");
                return;
            }
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("case", "WebViewDownload");
                hashMap.put("component", "knbWeb");
                hashMap.put("url", str);
                hashMap.put("userAgent", str2);
                hashMap.put("contentDisposition", str3);
                hashMap.put("mimeType", str4);
                hashMap.put("contentLength", Long.valueOf(j));
                hashMap.put(DeviceInfo.TM, Long.valueOf(System.currentTimeMillis()));
                hashMap.put("canDownload", Integer.valueOf(z ? 1 : 0));
                TitansReporter.reportDownloadInfo(hashMap);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void downloadByOther(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee4819e1274dd13731da409547e28c8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee4819e1274dd13731da409547e28c8e");
            return;
        }
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Throwable unused) {
            if (this.mWebView != null) {
                this.mWebView.post(new Runnable() { // from class: com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl.21
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bfd4cfd0e3c0c40e7e08ba4e3b032f90", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bfd4cfd0e3c0c40e7e08ba4e3b032f90");
                        } else {
                            UIUtil.showShortToast(KNBWebCompatDelegateImpl.this.mWebView, KNBWebCompatDelegateImpl.this.mContext == null ? "下载失败，请检查是否安装浏览器" : KNBWebCompatDelegateImpl.this.mContext.getString(R.string.knb_download_fail_text));
                        }
                    }
                });
            }
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public void getCapture(final String str, final CaptureJsHandler.BitmapCallbackListener bitmapCallbackListener) {
        Object[] objArr = {str, bitmapCallbackListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9432b66029344f5c478fa6630fc054e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9432b66029344f5c478fa6630fc054e6");
        } else if (this.mWebView == null) {
            if (bitmapCallbackListener != null) {
                bitmapCallbackListener.onGetBitmap(null, null);
            }
        } else {
            this.mWebView.post(new Runnable() { // from class: com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl.22
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "974589fd5981ccf6d8a1e1a45bcde7ce", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "974589fd5981ccf6d8a1e1a45bcde7ce");
                        return;
                    }
                    KNBWebCompatDelegateImpl.this.callback = bitmapCallbackListener;
                }
            });
            try {
                if (TextUtils.equals(CaptureJsHandler.CAPTURE_TYPE_DEFAULT, str)) {
                    bitmapCallbackListener.onGetBitmap(getCaptureScreen(), Bitmap.CompressFormat.JPEG);
                } else if (TextUtils.equals("webview", str)) {
                    this.mWebView.post(new Runnable() { // from class: com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl.23
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // java.lang.Runnable
                        public void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bbaf47934714932be01fc4a2119ae4af", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bbaf47934714932be01fc4a2119ae4af");
                                return;
                            }
                            try {
                                bitmapCallbackListener.onGetBitmap(KNBWebCompatDelegateImpl.this.getCaptureWebview(), Bitmap.CompressFormat.JPEG);
                            } catch (OutOfMemoryError unused) {
                                bitmapCallbackListener.onOOM();
                            }
                        }
                    });
                } else if (TextUtils.isEmpty(str) || !str.startsWith("#")) {
                } else {
                    this.mWebView.post(new Runnable() { // from class: com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl.24
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // java.lang.Runnable
                        public void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5d3ab04df88533fe7b66a78e47f6b039", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5d3ab04df88533fe7b66a78e47f6b039");
                            } else {
                                KNBWebCompatDelegateImpl.this.getCaptureById(str.substring(1));
                            }
                        }
                    });
                    this.mWebView.postDelayed(new Runnable() { // from class: com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl.25
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // java.lang.Runnable
                        public void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ab8548df07abfca1c602d68292c74c6a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ab8548df07abfca1c602d68292c74c6a");
                                return;
                            }
                            if (KNBWebCompatDelegateImpl.this.callback != null) {
                                KNBWebCompatDelegateImpl.this.callback.onTimeOut();
                            }
                            KNBWebCompatDelegateImpl.this.callback = null;
                        }
                    }, 10000L);
                }
            } catch (OutOfMemoryError unused) {
                bitmapCallbackListener.onOOM();
            }
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public WebView getWebView() {
        return this.mWebView;
    }

    public Bitmap getCaptureScreen() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0096c462edc3059395bfa76c6bcf8c3e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0096c462edc3059395bfa76c6bcf8c3e");
        }
        Activity activity = getActivity();
        if (activity == null) {
            return Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
        }
        View decorView = activity.getWindow().getDecorView();
        Bitmap createBitmap = Bitmap.createBitmap(decorView.getWidth(), decorView.getHeight(), Bitmap.Config.ARGB_8888);
        decorView.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebCompatDelegate
    public Bitmap getCaptureWebview() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88ccf62702ad9a9f08b8112358b8e29c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88ccf62702ad9a9f08b8112358b8e29c");
        }
        if (this.mWebView == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(this.mWebView.getWidth(), (int) (this.mWebView.getContentHeight() * this.mWebView.getScale()), Bitmap.Config.ARGB_8888);
        this.mWebView.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public void getCaptureById(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6957411bf904a2c0013bbdf8b60413b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6957411bf904a2c0013bbdf8b60413b0");
            return;
        }
        loadJs("javascript:function jsGetPic(id){\n var str = 'getCapturePic://' + document.getElementById(id).toDataURL();\n console.log(str);\n}");
        loadJs("javascript:jsGetPic(\"" + str + "\")");
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebCompatDelegate
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String substring;
        Object[] objArr = {consoleMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c5fc6c8a8b26a2366d47409009e95c5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c5fc6c8a8b26a2366d47409009e95c5")).booleanValue();
        }
        if (consoleMessage != null && consoleMessage.message() != null && consoleMessage.message().startsWith("getCapturePic://")) {
            String message = consoleMessage.message();
            Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
            int indexOf = message.indexOf("base64,");
            if (indexOf < 0) {
                substring = message;
            } else {
                substring = message.substring(indexOf + 7);
                if (message.substring(0, indexOf).contains("image/jpeg")) {
                    compressFormat = Bitmap.CompressFormat.JPEG;
                } else if (message.substring(0, indexOf).contains("image/webp")) {
                    compressFormat = Bitmap.CompressFormat.WEBP;
                }
            }
            if (this.callback != null) {
                try {
                    byte[] decode = Base64.decode(substring, 0);
                    this.callback.onGetBitmap(a.a(decode, 0, decode.length), compressFormat);
                } catch (OutOfMemoryError unused) {
                    this.callback.onOOM();
                }
                this.callback = null;
            }
            return true;
        } else if (this.mOnWebChromeClientListener != null) {
            return this.mOnWebChromeClientListener.onConsoleMessage(consoleMessage);
        } else {
            return false;
        }
    }

    private boolean inflateDynamicTitleBar() {
        Pair<LineTitleLayout, ZIndexFrameLayout.LayoutParams> parse;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd116babf6c37ae6eac9223c61d88c42", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd116babf6c37ae6eac9223c61d88c42")).booleanValue();
        }
        try {
            if (hasFuture(1)) {
                JSONObject jSONObject = (JSONObject) KNBConfig.getConfig(KNBConfig.CONFIG_DESIGN_TITLE_BAR, JSONObject.class, null);
                if (this.inflateTitleBarListener != null) {
                    parse = this.inflateTitleBarListener.onInflateDynamicTitleBar(getContext(), jSONObject, new JsHostResourceProvider(this));
                } else {
                    parse = jSONObject != null ? DynamicTitleParser.parse(getContext(), jSONObject, new JsHostResourceProvider(this)) : null;
                }
                if (parse != null && parse.first != null) {
                    return setDynamicTitleBar((LineTitleLayout) parse.first, (ViewGroup.LayoutParams) parse.second);
                }
                return false;
            }
            return false;
        } catch (Throwable th) {
            if (KNBWebManager.isDebug()) {
                Log.e(TAG, null, th);
            }
            return false;
        }
    }

    private void inflateTitleBar() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae66b015d78eb1541263e7d061a67c58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae66b015d78eb1541263e7d061a67c58");
        } else if (inflateDynamicTitleBar()) {
        } else {
            BaseTitleBar createDefaultTitleBar = createDefaultTitleBar();
            this.mLayTitle = createDefaultTitleBar;
            this.mDefaultTitleBar = createDefaultTitleBar;
            this.mLayWeb.addView(this.mLayTitle, 0, this.mTitleParams);
            initTitleBar(false);
            this.mTitleShadow = (ImageView) this.mRootView.findViewById(R.id.iv_titleshadow);
            TitansUIManager uIManager = getUIManager();
            if (uIManager != null) {
                this.mTitleShadow.setImageResource(uIManager.getTitleShadowResId());
            }
            this.mTitleShadow.setVisibility(this.mIsNoTitleBar ? 8 : 0);
        }
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebCompatDelegate
    public void onActivityHandlerSettled() {
        Uri data;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6698a807d359782768bdd44b206e960c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6698a807d359782768bdd44b206e960c");
            return;
        }
        ViewStub viewStub = (ViewStub) this.mRootView.findViewById(R.id.web_navi_bar);
        Intent handleGetIntent = this.mActivityHandler.handleGetIntent();
        if (handleGetIntent != null && (data = handleGetIntent.getData()) != null && data.isHierarchical()) {
            String queryParameter = data.getQueryParameter("thirdparty");
            this.mIsThirdParty = "1".equals(queryParameter) || "true".equals(queryParameter);
        }
        if (this.mIsThirdParty) {
            viewStub.setVisibility(0);
            viewStub.setLayoutResource(getNavigatorLayoutId());
            viewStub.inflate();
            View findViewById = this.mRootView.findViewById(R.id.lay_navigator);
            if (findViewById instanceof NavigateBar) {
                ((NavigateBar) findViewById).setHost(this);
                ViewUtils.showView(findViewById);
            }
            if (this.mLayWeb != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mLayWeb.getLayoutParams();
                layoutParams.bottomMargin = ViewUtils.dip2px(this.mContext, 56.0f);
                this.mLayWeb.setLayoutParams(layoutParams);
            }
        } else {
            viewStub.setVisibility(8);
        }
        if (!this.autoSetCookiesAfterViewCreated) {
            setWebViewCookies();
        }
        if (this.autoInflateTitleBar) {
            return;
        }
        inflateTitleBar();
    }

    @Override // com.dianping.titans.js.KNBJsHost
    public LineTitleLayout getDynamicTitleBar() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7329dab195f333f4c737430d607d059", RobustBitConfig.DEFAULT_VALUE)) {
            return (LineTitleLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7329dab195f333f4c737430d607d059");
        }
        if (hasFuture(1)) {
            return this.dynamicTitleBar;
        }
        return null;
    }

    private void setupDynamicTitleBar(LineTitleLayout lineTitleLayout) {
        Object[] objArr = {lineTitleLayout};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e380ff5db74ad37cd7eeab11076c599b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e380ff5db74ad37cd7eeab11076c599b");
        } else if (lineTitleLayout != null) {
            String[] strArr = {"back", ACTION_CLOSE, ACTION_RELOAD, "custom"};
            LineTitleLayout.OnElementClickListener onElementClickListener = new LineTitleLayout.OnElementClickListener() { // from class: com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl.26
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
                    if (r15.equals(com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl.ACTION_RELOAD) != false) goto L17;
                 */
                @Override // com.dianping.titans.widget.LineTitleLayout.OnElementClickListener
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
                        com.meituan.robust.ChangeQuickRedirect r11 = com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl.AnonymousClass26.changeQuickRedirect
                        java.lang.String r12 = "32aa3da5c5942bb9597c2c7b88fc309b"
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
                            case 0: goto Laa;
                            case 1: goto La4;
                            case 2: goto L96;
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
                        com.dianping.titans.widget.LineTitleLayout$LayoutParams r14 = (com.dianping.titans.widget.LineTitleLayout.LayoutParams) r14     // Catch: org.json.JSONException -> L80
                        java.lang.String r14 = r14.name     // Catch: org.json.JSONException -> L80
                        r15.put(r0, r14)     // Catch: org.json.JSONException -> L80
                        goto L8a
                    L80:
                        r14 = move-exception
                        boolean r0 = com.sankuai.meituan.android.knb.KNBWebManager.isDebug()
                        if (r0 == 0) goto L8a
                        r14.printStackTrace()
                    L8a:
                        com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl r14 = com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl.this
                        java.lang.String r0 = "KNB:titleBarClicked"
                        java.lang.String r15 = com.dianping.titans.utils.JavaScriptComposer.makeCustomeEvent(r0, r15)
                        r14.loadJs(r15)
                        return r10
                    L96:
                        com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl r14 = com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl.this
                        android.webkit.WebView r14 = r14.mWebView
                        if (r14 == 0) goto La3
                        com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl r14 = com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl.this
                        android.webkit.WebView r14 = r14.mWebView
                        r14.reload()
                    La3:
                        return r10
                    La4:
                        com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl r14 = com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl.this
                        r14.finish()
                        return r10
                    Laa:
                        com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl r14 = com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl.this
                        r14.goBack()
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl.AnonymousClass26.onClick(android.view.View, java.lang.String):boolean");
                }
            };
            for (int i = 0; i < 4; i++) {
                String str = strArr[i];
                if (lineTitleLayout.getOnElementClickListener(str) == null) {
                    lineTitleLayout.setOnElementClickListener(str, onElementClickListener);
                }
            }
            View primaryView = lineTitleLayout.getPrimaryView();
            if (!(primaryView instanceof TextView) || TextUtils.isEmpty(((TextView) primaryView).getText())) {
                return;
            }
            this.mHasTitleSettled = true;
        }
    }

    @Override // com.dianping.titans.js.KNBJsHost
    public boolean setDynamicTitleBar(LineTitleLayout lineTitleLayout, ViewGroup.LayoutParams layoutParams) {
        ZIndexFrameLayout.LayoutParams layoutParams2;
        Object[] objArr = {lineTitleLayout, layoutParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ecedf683a2aa416a1055ad2e588dce42", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ecedf683a2aa416a1055ad2e588dce42")).booleanValue();
        }
        if (!hasFuture(1) || lineTitleLayout == null) {
            return false;
        }
        LineTitleLayout dynamicTitleBar = getDynamicTitleBar();
        if (dynamicTitleBar != null) {
            this.multipleIndexContainer.removeView(dynamicTitleBar);
        }
        if (this.mTitleShadow == null) {
            this.mTitleShadow = (ImageView) this.mRootView.findViewById(R.id.iv_titleshadow);
        }
        if (this.mTitleShadow != null) {
            this.mTitleShadow.setVisibility(8);
        }
        this.dynamicTitleBar = lineTitleLayout;
        if (layoutParams instanceof ZIndexFrameLayout.LayoutParams) {
            layoutParams2 = (ZIndexFrameLayout.LayoutParams) layoutParams;
        } else {
            layoutParams2 = new ZIndexFrameLayout.LayoutParams(layoutParams);
        }
        this.multipleIndexContainer.addViewZIndexCare(lineTitleLayout, true, layoutParams2);
        setupDynamicTitleBar(lineTitleLayout);
        return true;
    }

    @Override // com.dianping.titans.js.KNBJsHost
    @NonNull
    public JSONObject getHostState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9ab0bfeb974b649d70fec1da2594f61", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9ab0bfeb974b649d70fec1da2594f61");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appear", this.isAppear);
            jSONObject.put("foreground", !ProcessUtil.isBackground(getContext()));
            if (this.mNovaEftedWebViewClient != null) {
                jSONObject.put("page_tti_done", this.mSendEventPageTTIDone);
                jSONObject.put("page_start_load_time", this.mNovaEftedWebViewClient.obtainPageStartedTime());
                jSONObject.put("current_download_url", this.mCurrentDownloadUrl);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    private void reportCompatAppearTime() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92c43621b70f4f25880ad8fc4be0586e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92c43621b70f4f25880ad8fc4be0586e");
        } else {
            this.knbCompatAppearTime = System.currentTimeMillis();
        }
    }

    private void reportCompatAppearElapse() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68b330ff001a9a52e33e7009d8b781d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68b330ff001a9a52e33e7009d8b781d7");
            return;
        }
        this.knbCompatAppearElapse += System.currentTimeMillis() - this.knbCompatAppearTime;
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebCompatDelegate, com.dianping.titans.js.KNBJsHost
    public void onMessageReceive(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e2885a8bef75dfffacd675c17353c8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e2885a8bef75dfffacd675c17353c8d");
        } else if (TextUtils.equals("Send.Event", str)) {
            String optString = jSONObject.optString(JsBridgeResult.PROPERTY_GET_MEDIA_FRAME_FRAME);
            if (TextUtils.equals("Page.TTI", optString)) {
                this.mSendEventPageTTIDone = true;
            } else {
                this.mSendEventLastFrame = optString;
            }
        } else {
            super.onMessageReceive(str, jSONObject);
        }
    }
}
