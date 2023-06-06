package com.sankuai.meituan.android.knb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import com.dianping.titans.ui.ComplexButton;
import com.dianping.titans.ui.ITitleBar;
import com.dianping.titans.ui.TitansUIManager;
import com.dianping.titans.utils.TitansTimingReport;
import com.dianping.titans.widget.BaseTitleBar;
import com.dianping.titans.widget.LineTitleLayout;
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
import com.sankuai.titans.protocol.bean.TitansConstants;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class KNBWebCompat {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean enableSlowDraw;
    private String innerURLKey;
    private KNBWebCompatDelegate mDelegate;
    private WebHandler mWebHandler;
    private WebSettings mWebSettings;
    private OnWebViewInitFailedListener onWebViewInitFailedListener;
    private String prefixURL;
    private boolean showTitleBarOnReceivedError;
    private int type;

    public KNBWebCompat() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1922719e4803013e8334be8ccdb1882a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1922719e4803013e8334be8ccdb1882a");
            return;
        }
        this.showTitleBarOnReceivedError = true;
        this.enableSlowDraw = false;
        this.innerURLKey = "url";
        this.type = 0;
    }

    public KNBWebCompat(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30deb05ce15d650777d7c7ce5567ebf8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30deb05ce15d650777d7c7ce5567ebf8");
            return;
        }
        this.showTitleBarOnReceivedError = true;
        this.enableSlowDraw = false;
        this.innerURLKey = "url";
        this.type = i;
    }

    private void create(Context context, Bundle bundle) {
        Object[] objArr = {context, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "919cb1a9cc51ed030f0ac0baa75bb059", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "919cb1a9cc51ed030f0ac0baa75bb059");
        } else if (this.mDelegate != null) {
        } else {
            TitansTimingReport.getInstance().onContainerCreate();
            KNBInitCallback initCallback = KNBWebManager.getInitCallback();
            if (initCallback != null) {
                initCallback.init(context);
                KNBWebManager.setInitCallback(null);
            }
            TitansTimingReport.getInstance().globalInitCompleted();
            this.mDelegate = getDelegate(context);
            this.mDelegate.prefixURL = this.prefixURL;
            this.mDelegate.innerURLKey = this.innerURLKey;
            this.mDelegate.setOnWebViewInitFailedListener(this.onWebViewInitFailedListener);
            this.mDelegate.setArguments(bundle);
            this.mDelegate.onCreate();
            this.mDelegate.showTitleBarOnReceivedError = this.showTitleBarOnReceivedError;
            this.mWebHandler = new WebHandler();
            this.mWebSettings = new WebSettings();
        }
    }

    @Deprecated
    public final void onCreate(@NonNull Activity activity, @NonNull Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26a08b405deed102b9a1f17c909998cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26a08b405deed102b9a1f17c909998cc");
        } else {
            create(activity, bundle);
        }
    }

    public final void onCreate(@NonNull Context context, @NonNull Bundle bundle) {
        Object[] objArr = {context, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5084c66263b5eb95c6969b0546760306", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5084c66263b5eb95c6969b0546760306");
        } else {
            create(context, bundle);
        }
    }

    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07f844f6f69d1f27a65d6550f300baaf", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07f844f6f69d1f27a65d6550f300baaf");
        }
        if (this.mDelegate != null) {
            return this.mDelegate.onCreateView(layoutInflater, viewGroup);
        }
        return null;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "433c0430804d0f13edc5f20b669a40a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "433c0430804d0f13edc5f20b669a40a3");
        } else if (this.mDelegate != null) {
            this.mDelegate.onSaveInstanceState(bundle);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7633ca6aaae85036750031f031661f26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7633ca6aaae85036750031f031661f26");
        } else if (this.mDelegate != null) {
            this.mDelegate.onCreated(bundle);
        }
    }

    public final void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38ee35ffde317fda03441825a6be37c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38ee35ffde317fda03441825a6be37c4");
        } else if (this.mDelegate != null) {
            this.mDelegate.onStart();
        }
    }

    public final void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8bd6ae7c111c92ca48d988e42e74c8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8bd6ae7c111c92ca48d988e42e74c8e");
        } else if (this.mDelegate != null) {
            this.mDelegate.onResume();
        }
    }

    public final void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "18ee23aa2d80b57e4fa5bda226657bdb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "18ee23aa2d80b57e4fa5bda226657bdb");
        } else if (this.mDelegate != null) {
            this.mDelegate.onPause();
        }
    }

    public final void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb5d1abf6a212a8919b77f91ebb7e2be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb5d1abf6a212a8919b77f91ebb7e2be");
        } else if (this.mDelegate != null) {
            this.mDelegate.onStop();
        }
    }

    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2256b5c21798d35d7cd7dec176492eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2256b5c21798d35d7cd7dec176492eb");
            return;
        }
        if (this.mDelegate != null) {
            this.mDelegate.onDestroy();
        }
        TitansTimingReport.getInstance().onContainerDestroy();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec1dda0bd6bfe3246ee59acacca2a5c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec1dda0bd6bfe3246ee59acacca2a5c8");
        } else if (this.mDelegate != null) {
            this.mDelegate.onActivityResult(i, i2, intent);
        }
    }

    public final void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0813b5aeedd67ca50cdc71b2145ade8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0813b5aeedd67ca50cdc71b2145ade8d");
        } else if (this.mDelegate != null) {
            this.mDelegate.onBackPressed();
        }
    }

    public final void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d1265effc13a42c35f8ee19c8a7f734", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d1265effc13a42c35f8ee19c8a7f734");
        } else if (this.mDelegate != null) {
            this.mDelegate.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public final void setOnHiddenListener(OnHiddenListener onHiddenListener) {
        Object[] objArr = {onHiddenListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f70708cdf47270f483eedfd7489f661e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f70708cdf47270f483eedfd7489f661e");
        } else if (this.mDelegate != null) {
            this.mDelegate.setOnHiddenListener(onHiddenListener);
        }
    }

    public final void setOnWebViewInitFailedListener(OnWebViewInitFailedListener onWebViewInitFailedListener) {
        Object[] objArr = {onWebViewInitFailedListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ded3f30f61636f83acd521de47f6ca8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ded3f30f61636f83acd521de47f6ca8");
            return;
        }
        this.onWebViewInitFailedListener = onWebViewInitFailedListener;
        if (this.mDelegate != null) {
            this.mDelegate.setOnWebViewInitFailedListener(onWebViewInitFailedListener);
        }
    }

    public final void setOnAnalyzeParamsListener(OnAnalyzeParamsListener onAnalyzeParamsListener) {
        Object[] objArr = {onAnalyzeParamsListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ebad5599e76e468fb70e545e7bdf22a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ebad5599e76e468fb70e545e7bdf22a4");
        } else {
            this.mDelegate.setOnAnalyzeParamsListener(onAnalyzeParamsListener);
        }
    }

    public final void setOnLoginListener(OnLoginListener onLoginListener) {
        Object[] objArr = {onLoginListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "084faa3a256ffac02819d0e197203aef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "084faa3a256ffac02819d0e197203aef");
        } else if (this.mDelegate != null) {
            this.mDelegate.setOnLoginListener(onLoginListener);
        }
    }

    public final void setOnWebViewClientListener(OnWebClientListener onWebClientListener) {
        Object[] objArr = {onWebClientListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13b7e76051528b6f61cacda442ed1c90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13b7e76051528b6f61cacda442ed1c90");
        } else if (this.mDelegate != null) {
            this.mDelegate.setOnWebViewClientListener(onWebClientListener);
        }
    }

    @Deprecated
    public final void setOnFavoriteListener(OnFavoriteListener onFavoriteListener) {
        Object[] objArr = {onFavoriteListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a46af858871ddc94c4cfcabc54cce93c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a46af858871ddc94c4cfcabc54cce93c");
        } else if (this.mDelegate != null) {
            this.mDelegate.setOnFavoriteListener(onFavoriteListener);
        }
    }

    @Deprecated
    public final void setOnCommonShareListener(OnCommonShareListener onCommonShareListener) {
        Object[] objArr = {onCommonShareListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f96ac6ea68ec76ac3f15f81feed51da1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f96ac6ea68ec76ac3f15f81feed51da1");
        } else if (this.mDelegate != null) {
            this.mDelegate.setOnCommonShareListener(onCommonShareListener);
        }
    }

    @Deprecated
    public final void setOnMgeRedircetListener(OnMGERedirectUrlListener onMGERedirectUrlListener) {
        Object[] objArr = {onMGERedirectUrlListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59adb4484cab7a38d92b5812eeb06280", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59adb4484cab7a38d92b5812eeb06280");
        } else if (this.mDelegate != null) {
            this.mDelegate.setOnMgeRedircetListener(onMGERedirectUrlListener);
        }
    }

    public final void setOnWebChromeClientListener(OnWebChromeClientListener onWebChromeClientListener) {
        Object[] objArr = {onWebChromeClientListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "41be170dfb6b90a3e1bed124a458686f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "41be170dfb6b90a3e1bed124a458686f");
        } else if (this.mDelegate != null) {
            this.mDelegate.setOnWebChromeClientListener(onWebChromeClientListener);
        }
    }

    public final void setOnLoadingListener(OnLoadingListener onLoadingListener) {
        Object[] objArr = {onLoadingListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6880fc86864d2471ad79f85be0bf24d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6880fc86864d2471ad79f85be0bf24d8");
        } else if (this.mDelegate != null) {
            this.mDelegate.setOnLoadingListener(onLoadingListener);
        }
    }

    public final void setOnAppendUAListener(OnAppendUAListener onAppendUAListener) {
        Object[] objArr = {onAppendUAListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23f8f6f583d7da975578d5fa9959d64d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23f8f6f583d7da975578d5fa9959d64d");
        } else if (this.mDelegate != null) {
            this.mDelegate.setOnAppendUAListener(onAppendUAListener);
        }
    }

    public final void setOnProgressChangeListener(OnProgressChangeListener onProgressChangeListener) {
        Object[] objArr = {onProgressChangeListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec178cf3036d9ad67262cd7658ed245a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec178cf3036d9ad67262cd7658ed245a");
        } else if (this.mDelegate != null) {
            this.mDelegate.setOnProgressChangeListener(onProgressChangeListener);
        }
    }

    public final void registerMessageReceiverListener(OnMessageReceiveListener onMessageReceiveListener) {
        Object[] objArr = {onMessageReceiveListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0427ac99502df9e6b612bde8bb448ca0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0427ac99502df9e6b612bde8bb448ca0");
        } else if (this.mDelegate != null) {
            this.mDelegate.registerOnMessageReceiveListener(onMessageReceiveListener);
        }
    }

    public final void unregisterMessageReceiverListener(OnMessageReceiveListener onMessageReceiveListener) {
        Object[] objArr = {onMessageReceiveListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e78f2a1af41f0b42522426f11bf124e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e78f2a1af41f0b42522426f11bf124e3");
        } else if (this.mDelegate != null) {
            this.mDelegate.unregisterOnMessageReceiveListener(onMessageReceiveListener);
        }
    }

    public final void setHeaders(Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45d428d43e137a421a4cfdf8642f3295", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45d428d43e137a421a4cfdf8642f3295");
        } else if (this.mDelegate != null) {
            this.mDelegate.setHeaders(map);
        }
    }

    public final void setOnFilterTouchListener(OnFilterTouchListener onFilterTouchListener) {
        Object[] objArr = {onFilterTouchListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c0298731c8f2273be177dacfda87d20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c0298731c8f2273be177dacfda87d20");
        } else if (this.mDelegate != null) {
            this.mDelegate.setOnFilterTouchListener(onFilterTouchListener);
        }
    }

    @Deprecated
    public final void setLLButtonClickListener(View.OnClickListener onClickListener) {
        if (this.mDelegate != null) {
            this.mDelegate.mLLButtonClickListener = onClickListener;
        }
    }

    public final ITitleBar getTitleBarHost() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1eb5c2bbfb2956c73e3167cd3d9ac201", RobustBitConfig.DEFAULT_VALUE)) {
            return (ITitleBar) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1eb5c2bbfb2956c73e3167cd3d9ac201");
        }
        if (this.mDelegate == null) {
            return null;
        }
        return this.mDelegate.getTitleBarHost();
    }

    public final WebSettings getWebSettings() {
        return this.mWebSettings;
    }

    public final WebHandler getWebHandler() {
        return this.mWebHandler;
    }

    public final long reportPageTTI() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a59b6c8751a8199179648f2753690954", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a59b6c8751a8199179648f2753690954")).longValue();
        }
        if (this.mDelegate != null) {
            return this.mDelegate.reportPageTTI();
        }
        return 0L;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class WebSettings {
        public static ChangeQuickRedirect changeQuickRedirect;

        public WebSettings() {
            Object[] objArr = {KNBWebCompat.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec3d2bf693034a033e31208e637bd9c9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec3d2bf693034a033e31208e637bd9c9");
            }
        }

        public void invisibleTitleBar() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b76ee3597bac585f46894a9d4b02311", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b76ee3597bac585f46894a9d4b02311");
                return;
            }
            KNBWebCompat.this.mDelegate.mIsNoTitleBar = true;
            ITitleBar titleBarHost = KNBWebCompat.this.mDelegate.getTitleBarHost();
            if (titleBarHost != null) {
                titleBarHost.showTitleBar(false);
            }
            ImageView imageView = KNBWebCompat.this.mDelegate.mTitleShadow;
            if (imageView == null || imageView.getVisibility() == 8) {
                return;
            }
            imageView.setVisibility(8);
        }

        public void visibleTitleBar() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3cf747341f192fbcbcde47bfb8cddf7a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3cf747341f192fbcbcde47bfb8cddf7a");
                return;
            }
            KNBWebCompat.this.mDelegate.mIsNoTitleBar = false;
            ITitleBar titleBarHost = KNBWebCompat.this.mDelegate.getTitleBarHost();
            if (titleBarHost != null) {
                titleBarHost.showTitleBar(true);
            }
            ImageView imageView = KNBWebCompat.this.mDelegate.mTitleShadow;
            if (imageView == null || imageView.getVisibility() == 0) {
                return;
            }
            imageView.setVisibility(0);
        }

        public void setBackgroundColor(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b35abb08745488ab11e7836e1002d18", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b35abb08745488ab11e7836e1002d18");
            } else {
                KNBWebCompat.this.mDelegate.setBackgroundColorForCurrentCompact(i);
            }
        }

        public void setAcceptThirdPartyCookies(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4bec3eff77b122b50ce5e862f2ea88e8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4bec3eff77b122b50ce5e862f2ea88e8");
            } else if (KNBWebCompat.this.mDelegate != null) {
                KNBWebCompat.this.mDelegate.setAcceptThirdPartyCookies(z);
                if (Build.VERSION.SDK_INT < 21 || KNBWebCompat.this.mDelegate.mWebView == null) {
                    return;
                }
                CookieManager.getInstance().setAcceptThirdPartyCookies(KNBWebCompat.this.mDelegate.mWebView, z);
            }
        }

        public void setLoadUrl(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14c4c2f60ae7ed35f1f389767f60cd15", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14c4c2f60ae7ed35f1f389767f60cd15");
            } else {
                KNBWebCompat.this.mDelegate.mUrl = str;
            }
        }

        @Deprecated
        public void loadUrl(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a953f94e26738a00bcc2abb2b8f7714", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a953f94e26738a00bcc2abb2b8f7714");
            } else {
                KNBWebCompat.this.mWebHandler.loadUrl(str);
            }
        }

        @Deprecated
        public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
            Object[] objArr = {str, str2, str3, str4, str5};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9acbec1cfa7738752060ad3f41afb75f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9acbec1cfa7738752060ad3f41afb75f");
            } else {
                KNBWebCompat.this.mWebHandler.loadDataWithBaseURL(str, str2, str3, str4, str5);
            }
        }

        @Deprecated
        public String getUrl() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3afe77e8be2982ad6b2e2bd4e46a01dd", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3afe77e8be2982ad6b2e2bd4e46a01dd") : KNBWebCompat.this.mWebHandler.getUrl();
        }

        public void setUIManager(TitansUIManager titansUIManager) {
            Object[] objArr = {titansUIManager};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "746c774d5fa7ed2295be31f03d77916c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "746c774d5fa7ed2295be31f03d77916c");
            } else {
                KNBWebCompat.this.mDelegate.setUIManager(titansUIManager);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class WebHandler {
        public static ChangeQuickRedirect changeQuickRedirect;

        public WebHandler() {
            Object[] objArr = {KNBWebCompat.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de9e96a0bb7d337edc5373599189b9e9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de9e96a0bb7d337edc5373599189b9e9");
            }
        }

        public void loadUrl(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3149a1d4a1acdfc3d461d373cb213670", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3149a1d4a1acdfc3d461d373cb213670");
            } else if (KNBWebCompat.this.mDelegate != null) {
                KNBWebCompat.this.mDelegate.loadUrl(str);
            }
        }

        public void loadUrl(String str, Map<String, String> map) {
            Object[] objArr = {str, map};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b92874b40728644119458411d435e2d5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b92874b40728644119458411d435e2d5");
            } else if (KNBWebCompat.this.mDelegate != null) {
                KNBWebCompat.this.mDelegate.loadUrl(str, map);
            }
        }

        public void loadJs(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "549cfd637d1a73d1cafa77dc0936bb58", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "549cfd637d1a73d1cafa77dc0936bb58");
            } else if (KNBWebCompat.this.mDelegate == null || TextUtils.isEmpty(str) || !str.startsWith(TitansConstants.JAVASCRIPT_PREFIX)) {
            } else {
                KNBWebCompat.this.mDelegate.loadJs(str);
            }
        }

        public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
            Object[] objArr = {str, str2, str3, str4, str5};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b4cff29c3c63747843f7ec1a9521f01", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b4cff29c3c63747843f7ec1a9521f01");
            } else if (KNBWebCompat.this.mDelegate.mWebView != null) {
                KNBWebCompat.this.mDelegate.mWebView.loadDataWithBaseURL(str, str2, str3, str4, str5);
            }
        }

        public String getUrl() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2bab7fed3c3b9dabfa92e8ca3ab6f8ec", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2bab7fed3c3b9dabfa92e8ca3ab6f8ec") : KNBWebCompat.this.mDelegate.mWebView != null ? KNBWebCompat.this.mDelegate.mWebView.getUrl() : "";
        }

        public String getOriginalUrl() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff70005e50a8b32f8c7db9c0a7f5a057", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff70005e50a8b32f8c7db9c0a7f5a057") : (KNBWebCompat.this.mDelegate == null || KNBWebCompat.this.mDelegate.mWebView == null) ? "" : KNBWebCompat.this.mDelegate.mWebView.getOriginalUrl();
        }

        public void setBackPerformClickListener(ComplexButton.PerformClickListener performClickListener) {
            Object[] objArr = {performClickListener};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bbf48c69613d4e87fc2ed51fe20421ce", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bbf48c69613d4e87fc2ed51fe20421ce");
            } else if (KNBWebCompat.this.mDelegate.getTitleBarHost() instanceof BaseTitleBar) {
                ((BaseTitleBar) KNBWebCompat.this.mDelegate.getTitleBarHost()).mButtonLL.setPerformClickListener(performClickListener);
            }
        }

        public void replaceTitleBar(BaseTitleBar baseTitleBar) {
            Object[] objArr = {baseTitleBar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8862d9e82cf7501a52d776d85c425f4f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8862d9e82cf7501a52d776d85c425f4f");
            } else if (baseTitleBar != null) {
                KNBWebCompat.this.mDelegate.replaceTitleBar(baseTitleBar);
            }
        }

        public ITitleBar getTitleBar() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "178bd6e335a4abab8b80ffcbeeb7f21c", RobustBitConfig.DEFAULT_VALUE) ? (ITitleBar) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "178bd6e335a4abab8b80ffcbeeb7f21c") : KNBWebCompat.this.mDelegate.getTitleBarHost();
        }

        public Bitmap getCaptureWebView() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "024ce5fba8a8e3630c17c23da2fede96", RobustBitConfig.DEFAULT_VALUE) ? (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "024ce5fba8a8e3630c17c23da2fede96") : KNBWebCompat.this.mDelegate.getCaptureWebview();
        }

        public void postUrl(String str, byte[] bArr) {
            Object[] objArr = {str, bArr};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "975c734391d91f6049842c2029a661a5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "975c734391d91f6049842c2029a661a5");
            } else if (KNBWebCompat.this.mDelegate.mWebView != null) {
                KNBWebCompat.this.mDelegate.mWebView.postUrl(str, bArr);
            }
        }

        public boolean canGoBack() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "890b26d6708393c264bd2546f9717d5b", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "890b26d6708393c264bd2546f9717d5b")).booleanValue();
            }
            if (KNBWebCompat.this.mDelegate.mWebView != null) {
                return KNBWebCompat.this.mDelegate.mWebView.canGoBack();
            }
            return false;
        }

        public void goBack() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51cc2834bc41ca3308e485746b186fb6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51cc2834bc41ca3308e485746b186fb6");
            } else if (KNBWebCompat.this.mDelegate.mWebView != null) {
                KNBWebCompat.this.mDelegate.mWebView.goBack();
            }
        }

        public void reload() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d121ff93225c7051e428d3962d86c7fe", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d121ff93225c7051e428d3962d86c7fe");
            } else if (KNBWebCompat.this.mDelegate.mWebView != null) {
                KNBWebCompat.this.mDelegate.mWebView.reload();
            }
        }

        public void clearHistory() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76b7ce550a29e7a7c1376be49cc78c05", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76b7ce550a29e7a7c1376be49cc78c05");
            } else if (KNBWebCompat.this.mDelegate.mWebView != null) {
                KNBWebCompat.this.mDelegate.mWebView.clearHistory();
            }
        }

        public void setTitleBarBackground(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d5d81ca4268ded6791ab8de6c0cdff1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d5d81ca4268ded6791ab8de6c0cdff1");
            } else if (KNBWebCompat.this.mDelegate.getTitleBarHost() != null) {
                KNBWebCompat.this.mDelegate.getTitleBarHost().setBackgroundColor(i);
            }
        }

        public void setWebViewClient(WebViewClient webViewClient) {
            Object[] objArr = {webViewClient};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0816851805288619af6efddc189f08d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0816851805288619af6efddc189f08d");
            } else if (KNBWebCompat.this.mDelegate.mWebView != null) {
                KNBWebCompat.this.mDelegate.mWebView.setWebViewClient(webViewClient);
            }
        }

        public void setDownloadListener(DownloadListener downloadListener) {
            Object[] objArr = {downloadListener};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c5ebba1a350ed4f604ee56a2d98b992", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c5ebba1a350ed4f604ee56a2d98b992");
            } else if (KNBWebCompat.this.mDelegate.mWebView != null) {
                KNBWebCompat.this.mDelegate.mWebView.setDownloadListener(downloadListener);
            }
        }

        public void setWebChromeClient(WebChromeClient webChromeClient) {
            Object[] objArr = {webChromeClient};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7ea456e9335eeffe2f83a4305297194", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7ea456e9335eeffe2f83a4305297194");
            } else if (KNBWebCompat.this.mDelegate.mWebView != null) {
                KNBWebCompat.this.mDelegate.mWebView.setWebChromeClient(webChromeClient);
            }
        }

        public android.webkit.WebSettings getSettings() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a36c8372b5c1fca3fc9212ea72f6f3c1", RobustBitConfig.DEFAULT_VALUE)) {
                return (android.webkit.WebSettings) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a36c8372b5c1fca3fc9212ea72f6f3c1");
            }
            if (KNBWebCompat.this.mDelegate.mWebView != null) {
                return KNBWebCompat.this.mDelegate.mWebView.getSettings();
            }
            return null;
        }

        public float getScale() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8d7e122ae9737ad42d1e686338cdc9a", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8d7e122ae9737ad42d1e686338cdc9a")).floatValue();
            }
            if (KNBWebCompat.this.mDelegate.mWebView != null) {
                return KNBWebCompat.this.mDelegate.mWebView.getScale();
            }
            return 1.0f;
        }

        public void stopLoading() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "356463489cf1a248646a7efbd3d6f88b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "356463489cf1a248646a7efbd3d6f88b");
            } else if (KNBWebCompat.this.mDelegate.mWebView != null) {
                KNBWebCompat.this.mDelegate.mWebView.stopLoading();
            }
        }

        public void setHorizontalScrollBarEnable(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69ebef03cd18b966137fdeb203bfd54f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69ebef03cd18b966137fdeb203bfd54f");
            } else if (KNBWebCompat.this.mDelegate.mWebView != null) {
                KNBWebCompat.this.mDelegate.mWebView.setHorizontalScrollBarEnabled(z);
            }
        }

        public void setVerticalScrollBarEnable(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da3042500020da26452f3733d66e2fb3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da3042500020da26452f3733d66e2fb3");
            } else if (KNBWebCompat.this.mDelegate.mWebView != null) {
                KNBWebCompat.this.mDelegate.mWebView.setVerticalScrollBarEnabled(z);
            }
        }
    }

    public final void loadUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d306902d19aa10b1f8ea6c2ffb76665", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d306902d19aa10b1f8ea6c2ffb76665");
        } else if (getWebHandler() != null) {
            getWebHandler().loadUrl(str);
        }
    }

    public final void loadUrl(String str, Map<String, String> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6954c236a0c816a13d6d83c4fc8b9bdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6954c236a0c816a13d6d83c4fc8b9bdf");
        } else if (getWebHandler() != null) {
            getWebHandler().loadUrl(str, map);
        }
    }

    @NonNull
    private KNBWebCompatDelegate getDelegate(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44d884f1cbe4546773bcb1d723dd3d09", RobustBitConfig.DEFAULT_VALUE)) {
            return (KNBWebCompatDelegate) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44d884f1cbe4546773bcb1d723dd3d09");
        }
        if (this.mDelegate == null) {
            this.mDelegate = KNBWebCompatDelegate.create(context, this.type);
        }
        return this.mDelegate;
    }

    public final void setCloseBtnDisable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "047fb254650b9f3216adba4abab3354b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "047fb254650b9f3216adba4abab3354b");
        } else if (this.mDelegate != null) {
            this.mDelegate.setIsBtnCloseDisable(z);
        }
    }

    public final void setShowTitleBarOnReceivedError(boolean z) {
        this.showTitleBarOnReceivedError = z;
        if (this.mDelegate != null) {
            this.mDelegate.showTitleBarOnReceivedError = z;
        }
    }

    public final void setActivity(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f0b21c2a579178fd76943c773df41c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f0b21c2a579178fd76943c773df41c8");
        } else if (this.mDelegate != null) {
            this.mDelegate.setActivityHandler(new KnbActivityHandler(activity));
        }
    }

    public final void setAllowUniversalAccessFromFileURLs(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "460c7fa8681c621a0a3114260604a65f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "460c7fa8681c621a0a3114260604a65f");
        } else if (this.mDelegate != null) {
            this.mDelegate.isAllowUniversalAccessFromFileURLs = z ? (short) 1 : (short) 2;
        }
    }

    public final void setAllowFileAccessFromFileURLs(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "acb3dd6693cd74cf620350a7acb8bc11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "acb3dd6693cd74cf620350a7acb8bc11");
        } else if (this.mDelegate != null) {
            this.mDelegate.isAllowFileAccessFromFileURLs = z ? (short) 1 : (short) 2;
        }
    }

    public final void setAllowFileAccess(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa2e1ead763f25a2ce9fe4ca8a7e9b70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa2e1ead763f25a2ce9fe4ca8a7e9b70");
        } else if (this.mDelegate != null) {
            this.mDelegate.isAllowFileAccess = z ? (short) 1 : (short) 2;
        }
    }

    public final boolean setEnableSlowDraw(boolean z) {
        if (this.mDelegate != null) {
            return false;
        }
        this.enableSlowDraw = z;
        return true;
    }

    public final void setAutoSetCookiesAfterViewCreated(boolean z) {
        if (this.mDelegate != null) {
            this.mDelegate.autoSetCookiesAfterViewCreated = z;
        }
    }

    public final void setAutoInflateTitleBar(boolean z) {
        if (this.mDelegate != null) {
            this.mDelegate.autoInflateTitleBar = z;
        }
    }

    public final boolean putExtraArguments(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c947d0be65d9fa289e9e0e7f69591bcd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c947d0be65d9fa289e9e0e7f69591bcd")).booleanValue();
        }
        if (this.mDelegate == null || bundle == null) {
            return false;
        }
        Bundle bundle2 = this.mDelegate.mArguments;
        if (bundle2 == null) {
            KNBWebCompatDelegate kNBWebCompatDelegate = this.mDelegate;
            Bundle bundle3 = new Bundle();
            kNBWebCompatDelegate.mArguments = bundle3;
            bundle2 = bundle3;
        }
        bundle2.putAll(bundle);
        return true;
    }

    public final WebView getWebView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c3e9ecc88f75bb1d69ff9709cec7b8ea", RobustBitConfig.DEFAULT_VALUE)) {
            return (WebView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c3e9ecc88f75bb1d69ff9709cec7b8ea");
        }
        if (this.mDelegate != null) {
            return this.mDelegate.getWebView();
        }
        return null;
    }

    public final void setOnFinishListener(OnFinishListener onFinishListener) {
        Object[] objArr = {onFinishListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "93b61bf24ba5075b70ea129cbbc764c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "93b61bf24ba5075b70ea129cbbc764c1");
        } else if (this.mDelegate != null) {
            this.mDelegate.setOnFinishListener(onFinishListener);
        }
    }

    public final void setOnFinishHandler(OnFinishHandler onFinishHandler) {
        Object[] objArr = {onFinishHandler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab1bf037ecccf5bcf0f9b35f01c4cc4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab1bf037ecccf5bcf0f9b35f01c4cc4d");
        } else if (this.mDelegate != null) {
            this.mDelegate.setOnFinishHandler(onFinishHandler);
        }
    }

    public final boolean setOnInflateTitleBarListener(OnInflateTitleBarListener onInflateTitleBarListener) {
        if (this.mDelegate == null) {
            return false;
        }
        this.mDelegate.inflateTitleBarListener = onInflateTitleBarListener;
        return true;
    }

    public final LineTitleLayout getDynamicTitleBar() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "741a7f22ce92da24678f8c7f37c02847", RobustBitConfig.DEFAULT_VALUE)) {
            return (LineTitleLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "741a7f22ce92da24678f8c7f37c02847");
        }
        if (this.mDelegate == null) {
            return null;
        }
        return this.mDelegate.getDynamicTitleBar();
    }

    public final void appear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57392d2dfc55ab34f57b1a1d393d5698", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57392d2dfc55ab34f57b1a1d393d5698");
        } else if (this.mDelegate != null) {
            this.mDelegate.appear();
        }
    }

    public final void disAppear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0174f24e9254fe5193a79e34aef5cd94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0174f24e9254fe5193a79e34aef5cd94");
        } else if (this.mDelegate != null) {
            this.mDelegate.disappear();
        }
    }

    public final void setInnerURLKey(String str) {
        this.innerURLKey = str;
        if (this.mDelegate != null) {
            this.mDelegate.innerURLKey = str;
        }
    }

    public final void setPrefixURL(String str) {
        this.prefixURL = str;
        if (this.mDelegate != null) {
            this.mDelegate.prefixURL = str;
        }
    }
}
