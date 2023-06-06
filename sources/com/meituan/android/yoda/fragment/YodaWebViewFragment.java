package com.meituan.android.yoda.fragment;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JsPromptResult;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.meituan.SafeWebView;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.yoda.retrofit.Error;
import com.meituan.android.yoda.util.o;
import com.meituan.android.yoda.util.x;
import com.meituan.android.yoda.util.y;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.bean.TitansConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class YodaWebViewFragment extends BaseFragment implements com.meituan.android.yoda.interfaces.b {
    public static ChangeQuickRedirect o;
    private final int p;
    private final int q;
    private final int r;
    private com.meituan.android.yoda.callbacks.c s;
    private String t;
    private FrameLayout u;
    private WebView v;
    private ValueCallback<Uri[]> w;
    private HashMap<String, Boolean> x;
    private com.meituan.android.privacy.interfaces.g y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static final class CallbackError {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int code;
        public String msg;
        public String requestCode;
        public int status;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static final class CallbackNextVerify {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int listIndex;
        public int next;
        public String requestCode;
        public int status;
        public String yodaAction;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static final class CallbackSuccess {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String requestCode;
        public String responseCode;
        public int status;
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void b(String str) {
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void b(String str, Error error) {
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void b(String str, String str2) {
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void c(String str, int i, @Nullable Bundle bundle) {
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void d(String str, int i, @Nullable Bundle bundle) {
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final String e() {
        return null;
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final int g() {
        return 0;
    }

    public YodaWebViewFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45260e39269055e620157163a7b63c30", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45260e39269055e620157163a7b63c30");
            return;
        }
        this.p = 1;
        this.q = 0;
        this.r = 2;
        this.x = new HashMap<>();
        this.y = new com.meituan.android.privacy.interfaces.g() { // from class: com.meituan.android.yoda.fragment.YodaWebViewFragment.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.interfaces.d
            public final void onResult(String str, int i) {
                Object[] objArr2 = {str, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "407b5d9e48b684e880a5126d4dfed407", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "407b5d9e48b684e880a5126d4dfed407");
                    return;
                }
                String str2 = YodaWebViewFragment.this.c;
                com.meituan.android.yoda.monitor.log.a.a(str2, "PermissionCallback, id= " + str + StringUtil.SPACE + i, true);
                if (i > 0) {
                    YodaWebViewFragment.this.x.put(str, Boolean.TRUE);
                    for (Boolean bool : YodaWebViewFragment.this.x.values()) {
                        if (!bool.booleanValue()) {
                            return;
                        }
                    }
                    YodaWebViewFragment.this.k();
                }
            }
        };
    }

    public static /* synthetic */ void a(YodaWebViewFragment yodaWebViewFragment, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        boolean z = false;
        Object[] objArr = {valueCallback, fileChooserParams};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, yodaWebViewFragment, changeQuickRedirect, false, "953104e744e4a89e20417118aa9b0f30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, yodaWebViewFragment, changeQuickRedirect, false, "953104e744e4a89e20417118aa9b0f30");
            return;
        }
        if (yodaWebViewFragment.w != null) {
            yodaWebViewFragment.w.onReceiveValue(null);
            yodaWebViewFragment.w = null;
        }
        yodaWebViewFragment.w = valueCallback;
        String[] acceptTypes = fileChooserParams.getAcceptTypes();
        if (acceptTypes != null || acceptTypes.length > 0) {
            for (int i = 0; i < acceptTypes.length; i++) {
                if (!TextUtils.isEmpty(acceptTypes[i]) && acceptTypes[i].startsWith("video/*")) {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = o;
                    if (PatchProxy.isSupport(objArr2, yodaWebViewFragment, changeQuickRedirect2, false, "b0615d050d77bb8cac585562f6f43033", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr2, yodaWebViewFragment, changeQuickRedirect2, false, "b0615d050d77bb8cac585562f6f43033")).booleanValue();
                    } else {
                        String[] strArr = {PermissionGuard.PERMISSION_CAMERA, PermissionGuard.PERMISSION_MICROPHONE};
                        String[] strArr2 = {"jcyf-3e2361e8b87eaf2d", "jcyf-0268d593bb3f5183"};
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (int i2 = 0; i2 < 2; i2++) {
                            if (Privacy.createPermissionGuard().a(yodaWebViewFragment.getContext(), strArr[i2], strArr2[i2]) <= 0) {
                                arrayList.add(strArr[i2]);
                                arrayList2.add(strArr2[i2]);
                            }
                        }
                        if (arrayList.size() > 0) {
                            String[] strArr3 = (String[]) arrayList.toArray(new String[arrayList.size()]);
                            yodaWebViewFragment.x.clear();
                            for (int i3 = 0; i3 < strArr3.length; i3++) {
                                yodaWebViewFragment.x.put(strArr3[i3], Boolean.FALSE);
                                Privacy.createPermissionGuard().a((Activity) yodaWebViewFragment.getActivity(), strArr3[i3], (String) arrayList2.get(i3), (com.meituan.android.privacy.interfaces.d) yodaWebViewFragment.y);
                                String str = yodaWebViewFragment.c;
                                com.meituan.android.yoda.monitor.log.a.a(str, "checkVideoPermission " + strArr3[i3] + " = false", true);
                            }
                            com.meituan.android.yoda.monitor.log.a.a(yodaWebViewFragment.c, "checkVideoPermission = false", true);
                        } else {
                            com.meituan.android.yoda.monitor.log.a.a(yodaWebViewFragment.c, "checkVideoPermission = true", true);
                            z = true;
                        }
                    }
                    if (z) {
                        yodaWebViewFragment.k();
                        return;
                    }
                    return;
                }
            }
        }
    }

    public static /* synthetic */ void a(YodaWebViewFragment yodaWebViewFragment, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, yodaWebViewFragment, changeQuickRedirect, false, "79c0971942d20e7624f40490ae6bdf77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, yodaWebViewFragment, changeQuickRedirect, false, "79c0971942d20e7624f40490ae6bdf77");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (Build.VERSION.SDK_INT >= 19) {
                if (str.startsWith(TitansConstants.JAVASCRIPT_PREFIX)) {
                    str = str.substring(TitansConstants.JAVASCRIPT_PREFIX.length());
                }
                yodaWebViewFragment.v.evaluateJavascript(str, null);
                return;
            }
            yodaWebViewFragment.v.loadUrl(str);
        }
    }

    public static /* synthetic */ boolean b(YodaWebViewFragment yodaWebViewFragment, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, yodaWebViewFragment, changeQuickRedirect, false, "90df36ba52ca3a28325800d311d4b918", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, yodaWebViewFragment, changeQuickRedirect, false, "90df36ba52ca3a28325800d311d4b918")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith("tel:")) {
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = o;
            if (PatchProxy.isSupport(objArr2, yodaWebViewFragment, changeQuickRedirect2, false, "cea2f1287f8c6cabc3e2cfdf504a1937", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr2, yodaWebViewFragment, changeQuickRedirect2, false, "cea2f1287f8c6cabc3e2cfdf504a1937")).booleanValue();
            }
            yodaWebViewFragment.startActivity(new Intent("android.intent.action.DIAL", Uri.parse(str)));
            return true;
        } else if (str.startsWith("sms:")) {
            Object[] objArr3 = {str};
            ChangeQuickRedirect changeQuickRedirect3 = o;
            if (PatchProxy.isSupport(objArr3, yodaWebViewFragment, changeQuickRedirect3, false, "7a9c3ad116c9c226f16819cdac725c8d", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr3, yodaWebViewFragment, changeQuickRedirect3, false, "7a9c3ad116c9c226f16819cdac725c8d")).booleanValue();
            }
            String[] split = str.split("\\?");
            if (split == null || split.length < 2) {
                x.a(yodaWebViewFragment.getActivity(), "H5参数错误");
                return false;
            } else if (TextUtils.isEmpty(split[0]) || split[0].length() <= 4) {
                x.a(yodaWebViewFragment.getActivity(), "H5参数错误");
                return false;
            } else {
                String substring = split[0].substring(4);
                String substring2 = split[1].substring(5);
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + substring));
                intent.putExtra("sms_body", substring2);
                yodaWebViewFragment.startActivity(intent);
                return true;
            }
        } else {
            return false;
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c01a993b3d669f7fd7620e6dd6fca08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c01a993b3d669f7fd7620e6dd6fca08");
            return;
        }
        super.onAttach(context);
        if (context instanceof com.meituan.android.yoda.callbacks.c) {
            this.s = (com.meituan.android.yoda.callbacks.c) context;
            this.s.a(this);
        }
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = o;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1090c379cc000b0ec65c9de73ecc774", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1090c379cc000b0ec65c9de73ecc774") : layoutInflater.inflate(R.layout.yoda_fragment_webview, viewGroup, false);
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "051c00c6be1bc64577c04870b4d495e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "051c00c6be1bc64577c04870b4d495e9");
            return;
        }
        super.onActivityCreated(bundle);
        if (TextUtils.isEmpty(this.t)) {
            return;
        }
        this.v.loadUrl(this.t);
        Uri.parse(this.t);
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51c993161bb8c9afb3fb3eb2a31c6e07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51c993161bb8c9afb3fb3eb2a31c6e07");
            return;
        }
        super.onViewCreated(view, bundle);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = o;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e70c3fd4909e0253732441d21f3418b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e70c3fd4909e0253732441d21f3418b0");
        } else {
            this.c = getClass().getSimpleName();
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = o;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "dd251668c2d34e0d168c91810604aa35", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "dd251668c2d34e0d168c91810604aa35");
            } else if (getArguments() != null) {
                this.t = getArguments().getString("wenview_url");
                String string = getArguments().getString("listIndex");
                if (!TextUtils.isEmpty(string)) {
                    this.t = Uri.parse(this.t).buildUpon().appendQueryParameter("listIndex", string).build().toString();
                }
                this.t = x.d(this.t);
            }
        }
        this.v = new SafeWebView(getActivity());
        this.u = (FrameLayout) view.findViewById(R.id.yoda_webview_container);
        this.u.addView(this.v, new FrameLayout.LayoutParams(-1, -1));
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = o;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9ead9d427ea33803c786972cfc29e780", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9ead9d427ea33803c786972cfc29e780");
            return;
        }
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = o;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "f3ac4dcb24495ff9e67af99c5caa5d35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "f3ac4dcb24495ff9e67af99c5caa5d35");
        } else {
            WebSettings settings = this.v.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setNeedInitialFocus(true);
            settings.setLoadsImagesAutomatically(true);
            settings.setDefaultTextEncodingName("utf-8");
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            settings.setDomStorageEnabled(true);
        }
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = o;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "78ad9b8e5d63a619cd86bfd9b5c45c26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "78ad9b8e5d63a619cd86bfd9b5c45c26");
        } else {
            this.v.setWebViewClient(new WebViewClient() { // from class: com.meituan.android.yoda.fragment.YodaWebViewFragment.1
                public static ChangeQuickRedirect a;

                @Override // android.webkit.WebViewClient
                public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    Object[] objArr7 = {webView, str, bitmap};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "c659cbab10150ab8aa659b03a08f4cbf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "c659cbab10150ab8aa659b03a08f4cbf");
                        return;
                    }
                    super.onPageStarted(webView, str, bitmap);
                    YodaWebViewFragment.a(YodaWebViewFragment.this, "javascript:var YODA_Bridge = {}; YODA_Bridge.publish = function (obj) { window.prompt(obj) }; YODA_Bridge.version = 1;");
                    YodaWebViewFragment.this.c("yoda_web_page_launch", str);
                    String str2 = YodaWebViewFragment.this.c;
                    com.meituan.android.yoda.monitor.log.a.a(str2, "WebViewClient.onPageStarted, requestCode = " + YodaWebViewFragment.this.d, true);
                }

                @Override // android.webkit.WebViewClient
                public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                    Object[] objArr7 = {webView, webResourceRequest};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "f6ffe52f7cd7035a20cb96a6d03723fa", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "f6ffe52f7cd7035a20cb96a6d03723fa")).booleanValue();
                    }
                    if (webResourceRequest == null) {
                        return false;
                    }
                    if (Build.VERSION.SDK_INT >= 21) {
                        String str = YodaWebViewFragment.this.c;
                        com.meituan.android.yoda.monitor.log.a.a(str, "WebViewClient.shouldOverrideUrlLoading, request = " + webResourceRequest.getUrl().toString(), true);
                        if (YodaWebViewFragment.b(YodaWebViewFragment.this, webResourceRequest.getUrl().toString())) {
                            return true;
                        }
                    } else {
                        String str2 = YodaWebViewFragment.this.c;
                        com.meituan.android.yoda.monitor.log.a.a(str2, "WebViewClient.shouldOverrideUrlLoading, request = " + webResourceRequest.toString(), true);
                        if (YodaWebViewFragment.b(YodaWebViewFragment.this, webResourceRequest.toString())) {
                            return true;
                        }
                    }
                    return false;
                }

                @Override // android.webkit.WebViewClient
                public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    Object[] objArr7 = {webView, str};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "aaf9b233ea83673e6533143288bceed1", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "aaf9b233ea83673e6533143288bceed1")).booleanValue();
                    }
                    String str2 = YodaWebViewFragment.this.c;
                    com.meituan.android.yoda.monitor.log.a.a(str2, "WebViewClient.shouldOverrideUrlLoading, url = " + str, true);
                    return YodaWebViewFragment.b(YodaWebViewFragment.this, str);
                }

                @Override // android.webkit.WebViewClient
                public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    Object[] objArr7 = {webView, sslErrorHandler, sslError};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "035129fc3a797de52e711a5f5cf53051", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "035129fc3a797de52e711a5f5cf53051");
                        return;
                    }
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                    String str = YodaWebViewFragment.this.c;
                    com.meituan.android.yoda.monitor.log.a.a(str, "WebViewClient.onReceivedSslError, requestCode = " + YodaWebViewFragment.this.d, true);
                }

                @Override // android.webkit.WebViewClient
                public final void onReceivedError(WebView webView, int i, String str, String str2) {
                    Object[] objArr7 = {webView, Integer.valueOf(i), str, str2};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "20e0d31538611e147dd2a6ef3ee7b577", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "20e0d31538611e147dd2a6ef3ee7b577");
                        return;
                    }
                    super.onReceivedError(webView, i, str, str2);
                    String str3 = YodaWebViewFragment.this.c;
                    com.meituan.android.yoda.monitor.log.a.a(str3, "WebViewClient.onReceivedError, requestCode = " + YodaWebViewFragment.this.d + ", errorCode = " + i + ", description = " + str, true);
                }

                @Override // android.webkit.WebViewClient
                public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                    Object[] objArr7 = {webView, webResourceRequest, webResourceError};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "f922069faff2c9b52d5d4710b9f7d154", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "f922069faff2c9b52d5d4710b9f7d154");
                        return;
                    }
                    super.onReceivedError(webView, webResourceRequest, webResourceError);
                    if (webResourceRequest == null) {
                        return;
                    }
                    String uri = webResourceRequest.getUrl() != null ? webResourceRequest.getUrl().toString() : "";
                    boolean isForMainFrame = webResourceRequest.isForMainFrame();
                    String obj = webResourceError != null ? webResourceError.toString() : "";
                    YodaWebViewFragment.this.a("yoda_web_page_launch_status", uri, isForMainFrame, 705);
                    String str = YodaWebViewFragment.this.c;
                    com.meituan.android.yoda.monitor.log.a.a(str, "WebViewClient.onReceivedError, requestCode = " + YodaWebViewFragment.this.d + ", block = " + isForMainFrame + ", url = " + uri + ", error = " + obj, true);
                }

                @Override // android.webkit.WebViewClient
                public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                    Object[] objArr7 = {webView, webResourceRequest, webResourceResponse};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "933d258b45154fa856c9656b5f851915", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "933d258b45154fa856c9656b5f851915");
                        return;
                    }
                    super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                    if (webResourceRequest == null) {
                        return;
                    }
                    String uri = webResourceRequest.getUrl() != null ? webResourceRequest.getUrl().toString() : "";
                    YodaWebViewFragment.this.a("yoda_web_page_launch_status", uri, false, 705);
                    String str = YodaWebViewFragment.this.c;
                    com.meituan.android.yoda.monitor.log.a.a(str, "WebViewClient.onReceivedHttpError, requestCode = " + YodaWebViewFragment.this.d + ", url = " + uri, true);
                }

                @Override // android.webkit.WebViewClient
                public final void onPageFinished(WebView webView, String str) {
                    Object[] objArr7 = {webView, str};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "f7f058ba1d2d4b3f1addb133903479c2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "f7f058ba1d2d4b3f1addb133903479c2");
                        return;
                    }
                    super.onPageFinished(webView, str);
                    YodaWebViewFragment.a(YodaWebViewFragment.this, "javascript:var YODA_Bridge = {}; YODA_Bridge.publish = function (obj) { window.prompt(obj) }; YODA_Bridge.version = 1;");
                    YodaWebViewFragment.this.d("yoda_web_page_launch_status", str);
                    String str2 = YodaWebViewFragment.this.c;
                    com.meituan.android.yoda.monitor.log.a.a(str2, "WebViewClient.onPageFinished, requestCode = " + YodaWebViewFragment.this.d, true);
                }
            });
        }
        Object[] objArr7 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect7 = o;
        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "af1136afa3483d86797f08ecbc09a28d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "af1136afa3483d86797f08ecbc09a28d");
        } else {
            this.v.setWebChromeClient(new WebChromeClient() { // from class: com.meituan.android.yoda.fragment.YodaWebViewFragment.2
                public static ChangeQuickRedirect a;

                @Override // android.webkit.WebChromeClient
                public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
                    Object[] objArr8 = {webView, str, str2, str3, jsPromptResult};
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "4a6cfdc3baedd39cdb7d6cb5d5b4f9d6", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "4a6cfdc3baedd39cdb7d6cb5d5b4f9d6")).booleanValue();
                    }
                    String str4 = YodaWebViewFragment.this.c;
                    com.meituan.android.yoda.monitor.log.a.a(str4, "onJsPrompt,url:" + str + ", message:" + str2, false);
                    if (YodaWebViewFragment.this.a(str2, str3, jsPromptResult)) {
                        return true;
                    }
                    return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
                }

                @Override // android.webkit.WebChromeClient
                public final void onPermissionRequest(PermissionRequest permissionRequest) {
                    Object[] objArr8 = {permissionRequest};
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "c9b8f28b63631fa4269abef86134f1e9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "c9b8f28b63631fa4269abef86134f1e9");
                    } else if (Build.VERSION.SDK_INT >= 21) {
                        String arrays = Arrays.toString(permissionRequest.getResources());
                        String str = YodaWebViewFragment.this.c;
                        com.meituan.android.yoda.monitor.log.a.a(str, "WebChromeClient.onPermissionRequest, permission = " + arrays, true);
                        permissionRequest.grant(permissionRequest.getResources());
                    }
                }

                @Override // android.webkit.WebChromeClient
                public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                    Object[] objArr8 = {webView, valueCallback, fileChooserParams};
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "75772a6d65ee6355cd9ebe0e65a10831", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "75772a6d65ee6355cd9ebe0e65a10831")).booleanValue();
                    }
                    YodaWebViewFragment.a(YodaWebViewFragment.this, valueCallback, fileChooserParams);
                    return true;
                }
            });
        }
        Object[] objArr8 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect8 = o;
        if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "9f7674180143f73eb34b9bbaae3b4650", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "9f7674180143f73eb34b9bbaae3b4650");
            return;
        }
        this.v.removeJavascriptInterface("searchBoxJavaBridge_");
        this.v.removeJavascriptInterface("accessibility");
        this.v.removeJavascriptInterface("accessibilityTraversal");
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "379ea30536872571cf4f4657fbc95e74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "379ea30536872571cf4f4657fbc95e74");
            return;
        }
        y.b(getView());
        super.onResume();
    }

    @Override // com.meituan.android.yoda.interfaces.b
    public final boolean j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ef5fe441b50a2b4f3ee14aa24e83b2d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ef5fe441b50a2b4f3ee14aa24e83b2d")).booleanValue();
        }
        if (this.v.canGoBack()) {
            this.v.goBack();
            return true;
        }
        return false;
    }

    @Override // com.meituan.android.yoda.interfaces.b
    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "424bce28ff8584a98f25624a38ed255e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "424bce28ff8584a98f25624a38ed255e");
        } else if (i == 101 || i == 65637) {
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.w == null) {
                    return;
                }
                Uri data = (intent == null || i2 != -1) ? null : intent.getData();
                if (i2 == -1) {
                    this.w.onReceiveValue(new Uri[]{data});
                } else {
                    this.w.onReceiveValue(new Uri[0]);
                }
                this.w = null;
                return;
            }
            x.a(getActivity(), "获取文件失败");
        }
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0037e45f3ab6f093a9278cc05115189a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0037e45f3ab6f093a9278cc05115189a");
        } else if (z) {
            y.b(this.v);
        }
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2360220998208f9b0a704c9b2e199aac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2360220998208f9b0a704c9b2e199aac");
            return;
        }
        if (this.s != null) {
            if (this.s.a() == this) {
                this.s.b(this);
            }
            this.s = null;
        }
        this.u.removeAllViews();
        if (this.v != null) {
            this.v.loadUrl("about:blank");
            this.v.destroy();
            this.v = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de29ac7998ec4960031fec20c0695537", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de29ac7998ec4960031fec20c0695537");
            return;
        }
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        intent.putExtra("android.intent.extra.videoQuality", 1);
        intent.putExtra("android.intent.extra.durationLimit", 20);
        try {
            startActivityForResult(intent, 101);
        } catch (ActivityNotFoundException e) {
            this.w = null;
            String str = this.c;
            com.meituan.android.yoda.monitor.log.a.a(str, "recordVideo exception = " + e.getMessage(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str, String str2, JsPromptResult jsPromptResult) {
        JSONObject jSONObject;
        Object[] objArr = {str, str2, jsPromptResult};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "543dd54f9439ac4a2c3f00e102b6913b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "543dd54f9439ac4a2c3f00e102b6913b")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String str3 = this.c;
        com.meituan.android.yoda.monitor.log.a.a(str3, "handleJSMessage, data = " + str, true);
        try {
            if (str.contains("addRequestSignature")) {
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject = new JSONObject(str2);
                } else {
                    jSONObject = new JSONObject(str);
                }
            } else {
                jSONObject = new JSONObject(str);
            }
            if (jSONObject.has("action")) {
                String valueOf = String.valueOf(jSONObject.get("action"));
                if ("regionalChoice".equals(valueOf)) {
                    Object[] objArr2 = {jSONObject};
                    ChangeQuickRedirect changeQuickRedirect2 = o;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3d5d42d378f89f2428e276e76932a67d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3d5d42d378f89f2428e276e76932a67d");
                    } else {
                        try {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                            if (jSONObject2.has("name") && jSONObject2.has("code")) {
                                Object[] objArr3 = {jSONObject2};
                                ChangeQuickRedirect changeQuickRedirect3 = o;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f0a4ac4e7506942045072fd9a8bd6dc7", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f0a4ac4e7506942045072fd9a8bd6dc7");
                                } else if (getActivity() instanceof com.meituan.android.yoda.callbacks.c) {
                                    getActivity();
                                }
                            }
                            o.a().a(getActivity());
                        } catch (Exception unused) {
                        }
                    }
                    if (jsPromptResult != null) {
                        jsPromptResult.cancel();
                    }
                    return true;
                } else if ("yodaWebCallback".equalsIgnoreCase(valueOf)) {
                    boolean a = a(jSONObject);
                    if (a && jsPromptResult != null) {
                        jsPromptResult.cancel();
                    }
                    return a;
                } else if ("addRequestSignature".equals(valueOf)) {
                    String a2 = x.a(jSONObject);
                    if (jsPromptResult != null) {
                        jsPromptResult.confirm(a2);
                    }
                    return true;
                } else if ("getFingerprint".equals(valueOf)) {
                    String j = x.j();
                    if (jsPromptResult != null) {
                        jsPromptResult.confirm(j);
                    }
                    return true;
                }
            }
        } catch (Exception e) {
            com.meituan.android.yoda.monitor.log.a.a(this.c, e.getMessage(), true);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0097 A[Catch: Exception -> 0x0198, TRY_ENTER, TryCatch #0 {Exception -> 0x0198, blocks: (B:6:0x0022, B:9:0x003c, B:17:0x005a, B:19:0x005e, B:21:0x0068, B:22:0x006a, B:28:0x0097, B:31:0x00a7, B:33:0x00af, B:34:0x00cc, B:36:0x00d4, B:37:0x00f2, B:39:0x0148, B:45:0x0165, B:47:0x0169, B:49:0x0173, B:50:0x0175), top: B:54:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0165 A[Catch: Exception -> 0x0198, TRY_ENTER, TryCatch #0 {Exception -> 0x0198, blocks: (B:6:0x0022, B:9:0x003c, B:17:0x005a, B:19:0x005e, B:21:0x0068, B:22:0x006a, B:28:0x0097, B:31:0x00a7, B:33:0x00af, B:34:0x00cc, B:36:0x00d4, B:37:0x00f2, B:39:0x0148, B:45:0x0165, B:47:0x0169, B:49:0x0173, B:50:0x0175), top: B:54:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(org.json.JSONObject r13) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.yoda.fragment.YodaWebViewFragment.a(org.json.JSONObject):boolean");
    }
}
