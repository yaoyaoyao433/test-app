package com.meituan.android.yoda.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JsPromptResult;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.meituan.SafeWebView;
import com.meituan.android.yoda.util.x;
import com.meituan.android.yoda.util.y;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.bean.TitansConstants;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class SimpleWebViewFragment extends Fragment {
    public static ChangeQuickRedirect a;
    FrameLayout b;
    com.sankuai.meituan.android.ui.widget.a c;
    View d;
    private com.meituan.android.yoda.interfaces.c e;
    private String f;
    private WebView g;
    private ValueCallback<Uri[]> h;

    public SimpleWebViewFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c72be053059463611021ce4a1948223", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c72be053059463611021ce4a1948223");
            return;
        }
        this.c = null;
        this.d = null;
    }

    public static /* synthetic */ void a(SimpleWebViewFragment simpleWebViewFragment, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, simpleWebViewFragment, changeQuickRedirect, false, "ced0fe2abad3baf11a0d5c826a81d184", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, simpleWebViewFragment, changeQuickRedirect, false, "ced0fe2abad3baf11a0d5c826a81d184");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (Build.VERSION.SDK_INT >= 19) {
                if (str.startsWith(TitansConstants.JAVASCRIPT_PREFIX)) {
                    str = str.substring(TitansConstants.JAVASCRIPT_PREFIX.length());
                }
                simpleWebViewFragment.g.evaluateJavascript(str, null);
                return;
            }
            simpleWebViewFragment.g.loadUrl(str);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c33ad99e2c4dbb29348b3716d7087661", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c33ad99e2c4dbb29348b3716d7087661");
            return;
        }
        super.onAttach(context);
        if (context instanceof com.meituan.android.yoda.interfaces.c) {
            this.e = (com.meituan.android.yoda.interfaces.c) context;
        }
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90f92ecc0b0eabf3b051835ec651af3e", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90f92ecc0b0eabf3b051835ec651af3e") : layoutInflater.inflate(R.layout.yoda_fragment_webview, viewGroup, false);
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13e71cdfccf04934f2a78291f000d91a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13e71cdfccf04934f2a78291f000d91a");
            return;
        }
        super.onActivityCreated(bundle);
        if (TextUtils.isEmpty(this.f)) {
            return;
        }
        this.g.loadUrl(this.f);
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e0fdb1806e504f76f11c9333bad286b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e0fdb1806e504f76f11c9333bad286b");
            return;
        }
        super.onViewCreated(view, bundle);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5c400cab56e5a3e449b6494c8f007735", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5c400cab56e5a3e449b6494c8f007735");
        } else {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2c861ad5f9058d2cf55f8bf9d89263ce", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2c861ad5f9058d2cf55f8bf9d89263ce");
            } else if (getArguments() != null) {
                this.f = getArguments().getString("wenview_url");
                String string = getArguments().getString("listIndex");
                if (!TextUtils.isEmpty(string)) {
                    this.f = Uri.parse(this.f).buildUpon().appendQueryParameter("listIndex", string).build().toString();
                }
                this.f = x.d(this.f);
            }
        }
        this.g = new SafeWebView(getActivity());
        this.b = (FrameLayout) view.findViewById(R.id.yoda_webview_container);
        this.b.addView(this.g, new FrameLayout.LayoutParams(-1, -1));
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "21a570645ba10666538ee637749587c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "21a570645ba10666538ee637749587c6");
            return;
        }
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "d4428d1149b5a8c6a1e93db133eb7600", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "d4428d1149b5a8c6a1e93db133eb7600");
        } else {
            WebSettings settings = this.g.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setNeedInitialFocus(true);
            settings.setLoadsImagesAutomatically(true);
            settings.setDefaultTextEncodingName("utf-8");
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            settings.setDomStorageEnabled(true);
        }
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = a;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "393e70eeec426c4fc49783c9f09fe913", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "393e70eeec426c4fc49783c9f09fe913");
        } else {
            this.g.setWebViewClient(new WebViewClient() { // from class: com.meituan.android.yoda.fragment.SimpleWebViewFragment.1
                public static ChangeQuickRedirect a;

                @Override // android.webkit.WebViewClient
                public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    Object[] objArr7 = {webView, str, bitmap};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "85d9b2540f8845d3430d46fe6e1bfdb7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "85d9b2540f8845d3430d46fe6e1bfdb7");
                        return;
                    }
                    SimpleWebViewFragment simpleWebViewFragment = SimpleWebViewFragment.this;
                    Object[] objArr8 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect8 = SimpleWebViewFragment.a;
                    if (PatchProxy.isSupport(objArr8, simpleWebViewFragment, changeQuickRedirect8, false, "ebb4c284c4aa4fc76e9c419170c3408f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, simpleWebViewFragment, changeQuickRedirect8, false, "ebb4c284c4aa4fc76e9c419170c3408f");
                    } else {
                        try {
                            simpleWebViewFragment.b.setBackground(null);
                            simpleWebViewFragment.d = new View(simpleWebViewFragment.getActivity());
                            simpleWebViewFragment.b.addView(simpleWebViewFragment.d, simpleWebViewFragment.b.getChildCount(), new ViewGroup.LayoutParams(-1, -1));
                            ImageView imageView = new ImageView(simpleWebViewFragment.getActivity());
                            imageView.setImageDrawable(x.c((int) R.drawable.yoda_dialog_ios_anim_rotation));
                            imageView.setLayoutParams(new ViewGroup.LayoutParams((int) x.a(40.0f), (int) x.a(40.0f)));
                            simpleWebViewFragment.c = new com.sankuai.meituan.android.ui.widget.a(simpleWebViewFragment.b, "数据加载中", -2);
                            simpleWebViewFragment.c.a(20.0f).a(imageView).b(Color.parseColor("#CD111111")).a();
                        } catch (Exception unused) {
                        }
                    }
                    super.onPageStarted(webView, str, bitmap);
                    com.meituan.android.yoda.monitor.log.a.a("SimpleWebViewFragment", "WebViewClient.onPageStarted", true);
                }

                @Override // android.webkit.WebViewClient
                public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                    Object[] objArr7 = {webView, webResourceRequest};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "f2eda39cb033e980c17e9e83ecae47bd", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "f2eda39cb033e980c17e9e83ecae47bd")).booleanValue();
                    }
                    if (Build.VERSION.SDK_INT >= 21) {
                        webView.loadUrl(webResourceRequest.getUrl().toString());
                    } else {
                        webView.loadUrl(webResourceRequest.toString());
                    }
                    com.meituan.android.yoda.monitor.log.a.a("SimpleWebViewFragment", "WebViewClient.shouldOverrideUrlLoading", true);
                    return true;
                }

                @Override // android.webkit.WebViewClient
                public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    Object[] objArr7 = {webView, str};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "13e87dfe9c1aacc836fb28335beaa2c3", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "13e87dfe9c1aacc836fb28335beaa2c3")).booleanValue();
                    }
                    webView.loadUrl(str);
                    com.meituan.android.yoda.monitor.log.a.a("SimpleWebViewFragment", "WebViewClient.shouldOverrideUrlLoading", true);
                    return true;
                }

                @Override // android.webkit.WebViewClient
                public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    Object[] objArr7 = {webView, sslErrorHandler, sslError};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "5e301e1bb4feba88fe91f187eee74dd5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "5e301e1bb4feba88fe91f187eee74dd5");
                        return;
                    }
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                    com.meituan.android.yoda.monitor.log.a.a("SimpleWebViewFragment", "WebViewClient.onReceivedSslError", true);
                }

                @Override // android.webkit.WebViewClient
                public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                    Object[] objArr7 = {webView, webResourceRequest, webResourceError};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "745f90b0a70b3b92f2f6d8548e421031", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "745f90b0a70b3b92f2f6d8548e421031");
                        return;
                    }
                    super.onReceivedError(webView, webResourceRequest, webResourceError);
                    com.meituan.android.yoda.monitor.log.a.a("SimpleWebViewFragment", "WebViewClient.onReceivedError", true);
                }

                @Override // android.webkit.WebViewClient
                public final void onPageFinished(WebView webView, String str) {
                    ViewGroup viewGroup;
                    Object[] objArr7 = {webView, str};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "897f0be3185eb4b6580e73164518e823", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "897f0be3185eb4b6580e73164518e823");
                        return;
                    }
                    SimpleWebViewFragment simpleWebViewFragment = SimpleWebViewFragment.this;
                    Object[] objArr8 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect8 = SimpleWebViewFragment.a;
                    if (PatchProxy.isSupport(objArr8, simpleWebViewFragment, changeQuickRedirect8, false, "ddfda581bd89d11059d5abfdc83c3572", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, simpleWebViewFragment, changeQuickRedirect8, false, "ddfda581bd89d11059d5abfdc83c3572");
                    } else {
                        try {
                            if (simpleWebViewFragment.b != null && simpleWebViewFragment.b.getRootView() != null && (viewGroup = (ViewGroup) simpleWebViewFragment.b.getRootView().findViewById(16908290)) != null) {
                                viewGroup.removeView(simpleWebViewFragment.d);
                            }
                            if (simpleWebViewFragment.c != null) {
                                simpleWebViewFragment.c.b();
                            }
                        } catch (Exception unused) {
                        }
                    }
                    super.onPageFinished(webView, str);
                    SimpleWebViewFragment.a(SimpleWebViewFragment.this, "javascript:var YODA_Bridge = {}; YODA_Bridge.publish = function (obj) { window.prompt(obj) }; YODA_Bridge.version = 1;");
                    com.meituan.android.yoda.monitor.log.a.a("SimpleWebViewFragment", "WebViewClient.onPageFinished", true);
                }
            });
        }
        Object[] objArr7 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect7 = a;
        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "43dccce3513fa2bc54103e5242e9cb9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "43dccce3513fa2bc54103e5242e9cb9b");
        } else {
            this.g.setWebChromeClient(new WebChromeClient() { // from class: com.meituan.android.yoda.fragment.SimpleWebViewFragment.2
                public static ChangeQuickRedirect a;

                @Override // android.webkit.WebChromeClient
                public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
                    Object[] objArr8 = {webView, str, str2, str3, jsPromptResult};
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "98b045c46db2018e32f78a1293a3ec47", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "98b045c46db2018e32f78a1293a3ec47")).booleanValue();
                    }
                    com.meituan.android.yoda.monitor.log.a.a("SimpleWebViewFragment", "WebChromeClient.onJsPrompt,url:" + str + ", message:" + str2, true);
                    if (SimpleWebViewFragment.this.a(str2, str3, jsPromptResult)) {
                        return true;
                    }
                    return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
                }

                @Override // android.webkit.WebChromeClient
                public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                    Object[] objArr8 = {webView, valueCallback, fileChooserParams};
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "c41ec3c9e754113436218de544c560af", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "c41ec3c9e754113436218de544c560af")).booleanValue();
                    }
                    SimpleWebViewFragment.this.h = valueCallback;
                    com.meituan.android.yoda.monitor.log.a.a("SimpleWebViewFragment", "WebChromeClient.onShowFileChooser", true);
                    return SimpleWebViewFragment.this.a(SimpleWebViewFragment.this.getActivity());
                }
            });
        }
        Object[] objArr8 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect8 = a;
        if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "11fafa45f58f1161cc00820c618a8a22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "11fafa45f58f1161cc00820c618a8a22");
            return;
        }
        this.g.removeJavascriptInterface("searchBoxJavaBridge_");
        this.g.removeJavascriptInterface("accessibility");
        this.g.removeJavascriptInterface("accessibilityTraversal");
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a984be6f80f9efd724cb7073400cea8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a984be6f80f9efd724cb7073400cea8");
            return;
        }
        y.b(getView());
        super.onResume();
        if (this.e != null) {
            if ("protocol_webview_fragment".equals(getTag())) {
                this.e.b(x.a((int) R.string.yoda_face_protocol));
            } else {
                this.e.b(x.a((int) R.string.yoda_face_faq_title));
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroyView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd25c0d97039302bbf299dd50e132511", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd25c0d97039302bbf299dd50e132511");
        } else {
            super.onDestroyView();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abd2a8bfe4ed9d2b5ee6484dd71fe066", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abd2a8bfe4ed9d2b5ee6484dd71fe066");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        if (i == 100) {
            Object[] objArr2 = {Integer.valueOf(i2), intent};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a6a4294de6cc8042eb88a85b16ed7a1b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a6a4294de6cc8042eb88a85b16ed7a1b");
            } else {
                Uri data = (i2 != -1 || intent == null || intent.getData() == null) ? null : intent.getData();
                if (this.h != null) {
                    this.h.onReceiveValue(data != null ? new Uri[]{data} : null);
                    this.h = null;
                }
            }
        }
        com.meituan.android.privacy.aop.a.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str, String str2, JsPromptResult jsPromptResult) {
        JSONObject jSONObject;
        Object[] objArr = {str, str2, jsPromptResult};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c4275d99d4229a07902720aa2f60110", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c4275d99d4229a07902720aa2f60110")).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            com.meituan.android.yoda.monitor.log.a.a("SimpleWebViewFragment", "handleJSMessage, data = " + str, true);
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
                    String string = jSONObject.getString("action");
                    if ("regionalChoice".equals(string)) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                        if (jSONObject2.has("name") && jSONObject2.has("code")) {
                            Object[] objArr2 = {jSONObject2};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b7c81969fefe16c76f3bbdc9e236df47", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b7c81969fefe16c76f3bbdc9e236df47");
                            } else if (getActivity() instanceof com.meituan.android.yoda.callbacks.c) {
                                getActivity();
                            }
                        }
                        try {
                            getParentFragment().getChildFragmentManager().popBackStack();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        if (jsPromptResult != null) {
                            jsPromptResult.cancel();
                        }
                        return true;
                    } else if ("YodaJsAction".equals(string)) {
                        if (this.e != null) {
                            this.e.i();
                        }
                        if (jsPromptResult != null) {
                            jsPromptResult.cancel();
                        }
                        return true;
                    } else if ("YodaJsUpdateTitleAction".equals(string)) {
                        if (jSONObject.has("data")) {
                            JSONObject jSONObject3 = jSONObject.getJSONObject("data");
                            if (jSONObject3.has("title")) {
                                String string2 = jSONObject3.getString("title");
                                if (!TextUtils.isEmpty(string2) && this.e != null && isResumed()) {
                                    this.e.b(string2);
                                }
                            }
                        }
                        if (jsPromptResult != null) {
                            jsPromptResult.cancel();
                        }
                        return true;
                    } else if ("addRequestSignature".equals(string)) {
                        String a2 = x.a(jSONObject);
                        if (jsPromptResult != null) {
                            jsPromptResult.confirm(a2);
                        }
                        return true;
                    } else if ("getFingerprint".equals(string)) {
                        String j = x.j();
                        if (jsPromptResult != null) {
                            jsPromptResult.confirm(j);
                        }
                        return true;
                    }
                }
                jSONObject.getJSONObject("data");
            } catch (Exception e2) {
                com.meituan.android.yoda.monitor.log.a.a("SimpleWebViewFragment", e2.getMessage(), true);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f94fd939c75b103788c53638e7d9ced7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f94fd939c75b103788c53638e7d9ced7")).booleanValue();
        }
        try {
            Intent intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            intent.addFlags(2);
            intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
            activity.startActivityForResult(intent, 100);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
