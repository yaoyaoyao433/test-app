package com.meituan.android.mrn.component.mrnwebview;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.facebook.react.views.scroll.h;
import com.facebook.react.views.scroll.i;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.android.recce.props.gens.OverScrollMode;
import com.meituan.android.recce.props.gens.ShowsHorizontalScrollIndicator;
import com.meituan.android.recce.props.gens.ShowsVerticalScrollIndicator;
import com.meituan.dio.easy.DioFile;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBConfig;
import com.sankuai.meituan.android.knb.KNBWebCompactFactory;
import com.sankuai.meituan.android.knb.KNBWebCompat;
import com.sankuai.meituan.android.knb.listener.OnAnalyzeParamsListener;
import com.sankuai.meituan.android.knb.listener.OnProgressChangeListener;
import com.sankuai.meituan.android.knb.listener.OnWebChromeClientListener;
import com.sankuai.meituan.android.knb.listener.OnWebClientListener;
import com.sankuai.titans.protocol.bean.TitansConstants;
import com.sankuai.titans.proxy.util.Constants;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public static String b;
    @Nullable
    protected static String c;
    @Nullable
    protected static String d;
    @Deprecated
    private static OnAnalyzeParamsListener e;

    @ReactProp(name = "allowsFullscreenVideo")
    public static void setAllowsFullscreenVideo(c cVar, @Nullable Boolean bool) {
    }

    public static void a(c cVar, com.facebook.react.uimanager.events.b bVar) {
        Object[] objArr = {cVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "30f8c5564f39a665d99efd57e8654a68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "30f8c5564f39a665d99efd57e8654a68");
        } else {
            ((UIManagerModule) ((ReactContext) cVar.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().a(bVar);
        }
    }

    @TargetApi(21)
    public static c a(ao aoVar) {
        KNBWebCompat kNBCompact;
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a3085c5fb000c1bc0be9918770bcd9a5", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a3085c5fb000c1bc0be9918770bcd9a5");
        }
        Object[] objArr2 = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "638c3c0406affcaef87322dc0cf9e07f", RobustBitConfig.DEFAULT_VALUE)) {
            kNBCompact = (KNBWebCompat) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "638c3c0406affcaef87322dc0cf9e07f");
        } else {
            kNBCompact = KNBWebCompactFactory.getKNBCompact(1, null);
            kNBCompact.onCreate(aoVar.getBaseContext(), (Bundle) null);
            kNBCompact.getWebSettings().invisibleTitleBar();
        }
        c cVar = new c(aoVar, kNBCompact);
        Object[] objArr3 = {aoVar, cVar};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "431dd2ce30f15a36126a6830c6954115", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "431dd2ce30f15a36126a6830c6954115");
        } else {
            a aVar = new a(aoVar, cVar);
            cVar.getKnbWebCompat().setOnWebChromeClientListener(aVar);
            cVar.getKnbWebCompat().setOnProgressChangeListener(aVar);
        }
        cVar.addView(kNBCompact.onCreateView(LayoutInflater.from(aoVar), cVar));
        com.meituan.android.mrn.event.listeners.e.a(aoVar, cVar);
        WebSettings settings = kNBCompact.getWebView().getSettings();
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        if (Build.VERSION.SDK_INT >= 16) {
            settings.setAllowFileAccessFromFileURLs(false);
            setAllowUniversalAccessFromFileURLs(cVar, false);
        }
        setMixedContentMode(cVar, "never");
        cVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return cVar;
    }

    @ReactProp(name = "appendCommonParams")
    @Deprecated
    public static void setAppendCommonParams(c cVar, boolean z) {
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f090a0940d7880a21ac6e801a80097e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f090a0940d7880a21ac6e801a80097e4");
        } else {
            cVar.getKnbWebCompat().setOnAnalyzeParamsListener(z ? e : null);
        }
    }

    @ReactProp(name = "javaScriptEnabled")
    public static void setJavaScriptEnabled(c cVar, boolean z) {
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "06591df45267a49fe27671d6310592a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "06591df45267a49fe27671d6310592a3");
        } else {
            cVar.getSettings().setJavaScriptEnabled(z);
        }
    }

    @ReactProp(name = ShowsHorizontalScrollIndicator.LOWER_CASE_NAME)
    public static void setShowsHorizontalScrollIndicator(c cVar, boolean z) {
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "06cf128f90cfb8dc8052a50235883f22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "06cf128f90cfb8dc8052a50235883f22");
        } else {
            cVar.getWebView().setHorizontalScrollBarEnabled(z);
        }
    }

    @ReactProp(name = ShowsVerticalScrollIndicator.LOWER_CASE_NAME)
    public static void setShowsVerticalScrollIndicator(c cVar, boolean z) {
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "637f85cb30f4677c5b0dcbd45330bcb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "637f85cb30f4677c5b0dcbd45330bcb9");
        } else {
            cVar.getWebView().setVerticalScrollBarEnabled(z);
        }
    }

    @ReactProp(name = "cacheEnabled")
    public static void setCacheEnabled(c cVar, boolean z) {
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9123c8511cecf96617cee91d47454230", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9123c8511cecf96617cee91d47454230");
            return;
        }
        WebView webView = cVar.getWebView();
        if (z) {
            Context context = webView.getContext();
            if (context != null) {
                webView.getSettings().setAppCachePath(q.a(context, MRNTitansWebViewManager.KEY_CIPS, "cache", u.b).getAbsolutePath());
                webView.getSettings().setCacheMode(-1);
                webView.getSettings().setAppCacheEnabled(true);
                return;
            }
            return;
        }
        webView.getSettings().setCacheMode(2);
        webView.getSettings().setAppCacheEnabled(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
        if (r14.equals("LOAD_CACHE_ONLY") == false) goto L23;
     */
    @com.facebook.react.uimanager.annotations.ReactProp(name = "cacheMode")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void setCacheMode(com.meituan.android.mrn.component.mrnwebview.b.c r13, java.lang.String r14) {
        /*
            r0 = 2
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            r10 = 1
            r8[r10] = r14
            com.meituan.robust.ChangeQuickRedirect r11 = com.meituan.android.mrn.component.mrnwebview.b.a
            java.lang.String r12 = "b8e267a11b8ce950b1ee4be4cbf6194b"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r11
            r5 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1f
            r13 = 0
            com.meituan.robust.PatchProxy.accessDispatch(r8, r13, r11, r10, r12)
            return
        L1f:
            int r1 = r14.hashCode()
            r2 = -2059164003(0xffffffff8543a69d, float:-9.199458E-36)
            r3 = 3
            r4 = -1
            if (r1 == r2) goto L57
            r2 = -1215135800(0xffffffffb7927fc8, float:-1.7464059E-5)
            if (r1 == r2) goto L4d
            r2 = -873877826(0xffffffffcbe9aebe, float:-3.0629244E7)
            if (r1 == r2) goto L43
            r2 = 1548620642(0x5c4e1362, float:2.32020627E17)
            if (r1 == r2) goto L3a
            goto L61
        L3a:
            java.lang.String r1 = "LOAD_CACHE_ONLY"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L61
            goto L62
        L43:
            java.lang.String r1 = "LOAD_CACHE_ELSE_NETWORK"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L61
            r9 = 1
            goto L62
        L4d:
            java.lang.String r1 = "LOAD_DEFAULT"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L61
            r9 = 3
            goto L62
        L57:
            java.lang.String r1 = "LOAD_NO_CACHE"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L61
            r9 = 2
            goto L62
        L61:
            r9 = -1
        L62:
            switch(r9) {
                case 0: goto L74;
                case 1: goto L6f;
                case 2: goto L6a;
                default: goto L65;
            }
        L65:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r4)
            goto L78
        L6a:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
            goto L78
        L6f:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)
            goto L78
        L74:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r3)
        L78:
            android.webkit.WebSettings r13 = r13.getSettings()
            int r14 = r14.intValue()
            r13.setCacheMode(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.mrn.component.mrnwebview.b.setCacheMode(com.meituan.android.mrn.component.mrnwebview.b$c, java.lang.String):void");
    }

    @ReactProp(name = "androidHardwareAccelerationDisabled")
    public static void setHardwareAccelerationDisabled(c cVar, boolean z) {
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d4f2782f3c69d5e59357a38ecf2153f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d4f2782f3c69d5e59357a38ecf2153f4");
            return;
        }
        WebView webView = cVar.getWebView();
        if (z) {
            webView.setLayerType(1, null);
        }
    }

    @ReactProp(name = OverScrollMode.LOWER_CASE_NAME)
    public static void setOverScrollMode(c cVar, String str) {
        Integer num;
        Object[] objArr = {cVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6c9859e1b2b1700c290a8a3d206d1b35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6c9859e1b2b1700c290a8a3d206d1b35");
            return;
        }
        WebView webView = cVar.getWebView();
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1414557169) {
            if (hashCode != 104712844) {
                if (hashCode == 951530617 && str.equals("content")) {
                    c2 = 1;
                }
            } else if (str.equals("never")) {
                c2 = 0;
            }
        } else if (str.equals("always")) {
            c2 = 2;
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
    public static void setThirdPartyCookiesEnabled(c cVar, boolean z) {
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5f22fa74ffa4d7bf12586d0f0fac69f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5f22fa74ffa4d7bf12586d0f0fac69f6");
        } else if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(cVar.getWebView(), z);
        }
    }

    @ReactProp(name = "textZoom")
    public static void setTextZoom(c cVar, int i) {
        Object[] objArr = {cVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d7e76641a032560ebcb7dfc33d67af9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d7e76641a032560ebcb7dfc33d67af9b");
        } else {
            cVar.getSettings().setTextZoom(i);
        }
    }

    @ReactProp(name = "scalesPageToFit")
    public static void setScalesPageToFit(c cVar, boolean z) {
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9bc67b2302a2f9a57f27d02529594c44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9bc67b2302a2f9a57f27d02529594c44");
            return;
        }
        WebView webView = cVar.getWebView();
        webView.getSettings().setLoadWithOverviewMode(z);
        webView.getSettings().setUseWideViewPort(z);
    }

    @ReactProp(name = "domStorageEnabled")
    public static void setDomStorageEnabled(c cVar, boolean z) {
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f605957280003bc4d4ce30e74aa4277b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f605957280003bc4d4ce30e74aa4277b");
        } else {
            cVar.getSettings().setDomStorageEnabled(z);
        }
    }

    @ReactProp(name = "userAgent")
    public static void setUserAgent(c cVar, @Nullable String str) {
        Object[] objArr = {cVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cb7a9c234861df207281fddd31affbbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cb7a9c234861df207281fddd31affbbc");
            return;
        }
        if (str != null) {
            c = str;
        } else {
            c = null;
        }
        d(cVar);
    }

    @ReactProp(name = "applicationNameForUserAgent")
    public static void setApplicationNameForUserAgent(c cVar, @Nullable String str) {
        Object[] objArr = {cVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b76e1cb97a342940d964ad444457c0df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b76e1cb97a342940d964ad444457c0df");
            return;
        }
        if (str != null) {
            if (Build.VERSION.SDK_INT >= 17) {
                String defaultUserAgent = WebSettings.getDefaultUserAgent(cVar.getContext());
                d = defaultUserAgent + StringUtil.SPACE + str;
            }
        } else {
            d = null;
        }
        d(cVar);
    }

    private static void d(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "22fd706ba2adfc07e369aacd9b112b11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "22fd706ba2adfc07e369aacd9b112b11");
            return;
        }
        WebView webView = cVar.getWebView();
        if (c != null) {
            webView.getSettings().setUserAgentString(c);
        } else if (d != null) {
            webView.getSettings().setUserAgentString(d);
        } else if (Build.VERSION.SDK_INT >= 17) {
            webView.getSettings().setUserAgentString(WebSettings.getDefaultUserAgent(webView.getContext()));
        }
    }

    @ReactProp(name = "mediaPlaybackRequiresUserAction")
    @TargetApi(17)
    public static void setMediaPlaybackRequiresUserAction(c cVar, boolean z) {
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "39fc21747fc4484945a0a87c7cd5df0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "39fc21747fc4484945a0a87c7cd5df0e");
        } else {
            cVar.getSettings().setMediaPlaybackRequiresUserGesture(z);
        }
    }

    @ReactProp(name = "allowFileAccessFromFileURLs")
    public static void setAllowFileAccessFromFileURLs(c cVar, boolean z) {
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "855012fcd35964cdc493435b7826f38f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "855012fcd35964cdc493435b7826f38f");
        } else {
            cVar.getSettings().setAllowFileAccessFromFileURLs(z);
        }
    }

    @ReactProp(name = "allowUniversalAccessFromFileURLs")
    public static void setAllowUniversalAccessFromFileURLs(c cVar, boolean z) {
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4f9668e90c3c21a28f6ef313e0042b04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4f9668e90c3c21a28f6ef313e0042b04");
        } else {
            cVar.getSettings().setAllowUniversalAccessFromFileURLs(z);
        }
    }

    @ReactProp(name = "saveFormDataDisabled")
    public static void setSaveFormDataDisabled(c cVar, boolean z) {
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fac97905e84c42c033a9a3b005e8636d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fac97905e84c42c033a9a3b005e8636d");
        } else {
            cVar.getSettings().setSaveFormData(!z ? 1 : 0);
        }
    }

    @ReactProp(name = "injectedJavaScript")
    public static void setInjectedJavaScript(c cVar, @Nullable String str) {
        Object[] objArr = {cVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e23fcc8a0e7889ccfc34077cb8f26194", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e23fcc8a0e7889ccfc34077cb8f26194");
        } else {
            cVar.setInjectedJavaScript(str);
        }
    }

    @ReactProp(name = "messagingEnabled")
    public static void setMessagingEnabled(c cVar, boolean z) {
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "59cd8ebca6cef4037dca47f9abec2f55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "59cd8ebca6cef4037dca47f9abec2f55");
        } else {
            cVar.setMessagingEnabled(z);
        }
    }

    @ReactProp(name = "incognito")
    public static void setIncognito(c cVar, boolean z) {
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5741e68e6add4b59a3a2894cfe7f5201", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5741e68e6add4b59a3a2894cfe7f5201");
            return;
        }
        WebView webView = cVar.getWebView();
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().removeAllCookies(null);
        } else {
            CookieManager.getInstance().removeAllCookie();
        }
        webView.getSettings().setCacheMode(2);
        webView.getSettings().setAppCacheEnabled(!z ? 1 : 0);
        webView.clearHistory();
        webView.clearCache(z);
        webView.clearFormData();
        webView.getSettings().setSavePassword(!z ? 1 : 0);
        webView.getSettings().setSaveFormData(!z ? 1 : 0);
    }

    public static void a(@NonNull c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        byte[] bArr = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "696c8fa7821eadb2ef136a72a9cdac47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "696c8fa7821eadb2ef136a72a9cdac47");
        } else if (cVar.a()) {
            ReadableMap pendingSource = cVar.getPendingSource();
            cVar.b();
            WebView webView = cVar.getWebView();
            KNBWebCompat knbWebCompat = cVar.getKnbWebCompat();
            if (pendingSource != null) {
                if (pendingSource.hasKey(Constants.KEY_CONTENT_TYPE_HTML)) {
                    webView.loadDataWithBaseURL(pendingSource.hasKey("baseUrl") ? pendingSource.getString("baseUrl") : "", pendingSource.getString(Constants.KEY_CONTENT_TYPE_HTML), com.dianping.titans.utils.Constants.MIME_TYPE_HTML, "UTF-8", null);
                    return;
                } else if (pendingSource.hasKey(com.meituan.metrics.common.Constants.TRAFFIC_URI)) {
                    String string = pendingSource.getString(com.meituan.metrics.common.Constants.TRAFFIC_URI);
                    String url = webView.getUrl();
                    if (url == null || !url.equals(string)) {
                        if (string != null && string.startsWith("file://")) {
                            Context context = cVar.getContext();
                            Object[] objArr2 = {context, string};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "23bad28fcd3a7b058374d3d3006f8f77", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "23bad28fcd3a7b058374d3d3006f8f77");
                            } else if (!TextUtils.isEmpty(string)) {
                                try {
                                    String path = Uri.parse(string).getPath();
                                    if (path != null) {
                                        String canonicalPath = new File(path).getParentFile().getCanonicalPath();
                                        if (canonicalPath.startsWith(q.a(context, "mrn_default", (String) null, u.e).getParentFile().getCanonicalPath())) {
                                            List<String> stringListConfig = KNBConfig.getStringListConfig(KNBConfig.CONFIG_FILE_PROTOCOL_WHITE_LIST, Collections.EMPTY_LIST);
                                            if (!stringListConfig.contains(canonicalPath)) {
                                                stringListConfig.add(canonicalPath);
                                                KNBConfig.setConfig(KNBConfig.CONFIG_FILE_PROTOCOL_WHITE_LIST, stringListConfig);
                                            }
                                        }
                                    }
                                } catch (IOException unused) {
                                }
                            }
                        }
                        if (pendingSource.hasKey("method") && pendingSource.getString("method").equalsIgnoreCase("POST")) {
                            if (pendingSource.hasKey("body")) {
                                String string2 = pendingSource.getString("body");
                                try {
                                    bArr = string2.getBytes("UTF-8");
                                } catch (UnsupportedEncodingException unused2) {
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
                        if (pendingSource.hasKey("headers")) {
                            ReadableMap map = pendingSource.getMap("headers");
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
                        Uri parse = Uri.parse(string);
                        if (com.meituan.android.mrn.util.b.a(parse)) {
                            try {
                                DioFile b2 = com.meituan.android.mrn.util.b.b(parse);
                                knbWebCompat.loadUrl("about:blank");
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = DioFile.a;
                                webView.loadDataWithBaseURL(string, new String(PatchProxy.isSupport(objArr3, b2, changeQuickRedirect3, false, "0a9d296a5165e12d49cb5cfce737f121", RobustBitConfig.DEFAULT_VALUE) ? (byte[]) PatchProxy.accessDispatch(objArr3, b2, changeQuickRedirect3, false, "0a9d296a5165e12d49cb5cfce737f121") : b2.a(false)), com.dianping.titans.utils.Constants.MIME_TYPE_HTML, "UTF-8", null);
                                return;
                            } catch (Throwable th) {
                                th.printStackTrace();
                                knbWebCompat.loadUrl("about:blank");
                                return;
                            }
                        }
                        knbWebCompat.loadUrl(string, hashMap);
                        return;
                    }
                    return;
                }
            }
            knbWebCompat.loadUrl("about:blank");
        }
    }

    @ReactProp(name = "source")
    public final void setSource(c cVar, @Nullable ReadableMap readableMap) {
        Object[] objArr = {cVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd3beebb7229f7cd9bed3afe9a5af98a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd3beebb7229f7cd9bed3afe9a5af98a");
        } else {
            cVar.setPendingSource(readableMap);
        }
    }

    @ReactProp(name = "onContentSizeChange")
    public static void setOnContentSizeChange(c cVar, boolean z) {
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "43ad48d1ad7b7a541515a5f51e6b8b02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "43ad48d1ad7b7a541515a5f51e6b8b02");
        } else {
            cVar.setSendContentSizeChangeEvents(z);
        }
    }

    @ReactProp(name = "mixedContentMode")
    public static void setMixedContentMode(c cVar, @Nullable String str) {
        Object[] objArr = {cVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a92ac502119231f9a6b90280fba008f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a92ac502119231f9a6b90280fba008f2");
            return;
        }
        WebView webView = cVar.getWebView();
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
    public static void setUrlPrefixesForDefaultIntent(c cVar, @Nullable ReadableArray readableArray) {
        Object[] objArr = {cVar, readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c8487b95aad300547a0ff32187df283d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c8487b95aad300547a0ff32187df283d");
            return;
        }
        C0281b rNCWebViewClient = cVar.getRNCWebViewClient();
        if (rNCWebViewClient == null || readableArray == null) {
            return;
        }
        rNCWebViewClient.a(readableArray);
    }

    @ReactProp(name = "allowFileAccess")
    public static void setAllowFileAccess(c cVar, @Nullable Boolean bool) {
        boolean z = false;
        Object[] objArr = {cVar, bool};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "42e8ec58101c16411f5200eb6bce1b20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "42e8ec58101c16411f5200eb6bce1b20");
            return;
        }
        WebSettings settings = cVar.getSettings();
        if (bool != null && bool.booleanValue()) {
            z = true;
        }
        settings.setAllowFileAccess(z);
    }

    @ReactProp(name = "geolocationEnabled")
    public static void setGeolocationEnabled(c cVar, @Nullable Boolean bool) {
        boolean z = false;
        Object[] objArr = {cVar, bool};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "141b00f896b4248907e4a087cabd6a6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "141b00f896b4248907e4a087cabd6a6f");
            return;
        }
        WebSettings settings = cVar.getSettings();
        if (bool != null && bool.booleanValue()) {
            z = true;
        }
        settings.setGeolocationEnabled(z);
    }

    @ReactProp(name = "onScroll")
    public static void setOnScroll(c cVar, boolean z) {
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5afd64bbd8612084c50aac9dc1c2813d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5afd64bbd8612084c50aac9dc1c2813d");
        } else {
            cVar.setHasScrollEvent(z);
        }
    }

    public static void b(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "29b2dd2a478de10dd8e3c081e3c602af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "29b2dd2a478de10dd8e3c081e3c602af");
        } else {
            cVar.setWebViewClient(new C0281b(cVar));
        }
    }

    public static void a(c cVar, int i, @Nullable ReadableArray readableArray) {
        boolean z = false;
        Object[] objArr = {cVar, Integer.valueOf(i), readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cb1ab0b4f21d95fd312185a46da6d74e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cb1ab0b4f21d95fd312185a46da6d74e");
            return;
        }
        WebView webView = cVar.getWebView();
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
                    cVar.a("(function () {var event;var data = " + jSONObject.toString() + ";try {event = new MessageEvent('message', data);} catch (e) {event = document.createEvent('MessageEvent');event.initMessageEvent('message', true, true, data.data, data.origin, data.lastEventId, data.source);}document.dispatchEvent(event);})();");
                    return;
                } catch (JSONException e2) {
                    throw new RuntimeException(e2);
                }
            case 6:
                cVar.a(readableArray.getString(0));
                return;
            case 7:
                if (readableArray == null) {
                    throw new RuntimeException("Arguments for loading an url are null!");
                }
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

    public static void c(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "72f6e7706bd974bac2bf541e484093da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "72f6e7706bd974bac2bf541e484093da");
        } else {
            cVar.f();
        }
    }

    public static MRNWebViewModule a(ReactContext reactContext) {
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "48e99fe15e43a2ba0195cc7e2fc42afe", RobustBitConfig.DEFAULT_VALUE) ? (MRNWebViewModule) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "48e99fe15e43a2ba0195cc7e2fc42afe") : (MRNWebViewModule) reactContext.getNativeModule(MRNWebViewModule.class);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.mrn.component.mrnwebview.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0281b implements OnWebClientListener {
        public static ChangeQuickRedirect a;
        protected c b;
        protected boolean c;
        @Nullable
        protected ReadableArray d;

        @Override // com.sankuai.meituan.android.knb.listener.OnWebClientListener
        public final void onReceivedSslError(SslErrorHandler sslErrorHandler, SslError sslError) {
        }

        public C0281b(c cVar) {
            Object[] objArr = {cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9d24abad8cca58df04e373e796275d6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9d24abad8cca58df04e373e796275d6");
                return;
            }
            this.c = false;
            this.b = cVar;
        }

        @Override // com.sankuai.meituan.android.knb.listener.OnWebClientListener
        public final void onPageFinished(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0bb7875180cffd0caafdc310af7c61e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0bb7875180cffd0caafdc310af7c61e");
            } else if (this.c) {
            } else {
                this.b.e();
                a(str);
            }
        }

        @Override // com.sankuai.meituan.android.knb.listener.OnWebClientListener
        public final void onPageStarted(String str, Bitmap bitmap) {
            Object[] objArr = {str, bitmap};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55f8133ca9d528f97a346867ab2fd469", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55f8133ca9d528f97a346867ab2fd469");
                return;
            }
            this.c = false;
            b.a(this.b, new com.meituan.android.mrn.component.mrnwebview.events.d(this.b.getId(), a(this.b, str)));
        }

        @Override // com.sankuai.meituan.android.knb.listener.OnWebClientListener
        public final boolean shouldOverrideUrlLoading(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f0a5dc2f578c51505cc9495aaa1d18f", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f0a5dc2f578c51505cc9495aaa1d18f")).booleanValue();
            }
            b.b = str;
            if (str.startsWith(TitansConstants.JS_SCHEMA)) {
                return false;
            }
            b.a(this.b, new com.meituan.android.mrn.component.mrnwebview.events.f(this.b.getId(), a(this.b, str)));
            return true;
        }

        @Override // com.sankuai.meituan.android.knb.listener.OnWebClientListener
        public final void onReceivedError(int i, String str, String str2) {
            Object[] objArr = {Integer.valueOf(i), str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4416fe9147f2a308ac8633e37f224a50", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4416fe9147f2a308ac8633e37f224a50");
                return;
            }
            this.c = true;
            a(str2);
            WritableMap a2 = a(this.b, str2);
            a2.putDouble("code", i);
            a2.putString("description", str);
            b.a(this.b, new com.meituan.android.mrn.component.mrnwebview.events.a(this.b.getId(), a2));
        }

        private void a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1404a369726f16d533dd4a727d21a906", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1404a369726f16d533dd4a727d21a906");
            } else {
                b.a(this.b, new com.meituan.android.mrn.component.mrnwebview.events.b(this.b.getId(), a(this.b, str)));
            }
        }

        public final WritableMap a(c cVar, String str) {
            boolean z = false;
            Object[] objArr = {cVar, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f98a52f8e631d9b7fc161f10dc5e5676", RobustBitConfig.DEFAULT_VALUE)) {
                return (WritableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f98a52f8e631d9b7fc161f10dc5e5676");
            }
            WebView webView = cVar.getWebView();
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("target", cVar.getId());
            createMap.putString("url", str);
            if (!this.c && webView.getProgress() != 100) {
                z = true;
            }
            createMap.putBoolean("loading", z);
            createMap.putString("title", webView.getTitle());
            createMap.putBoolean("canGoBack", webView.canGoBack());
            createMap.putBoolean("canGoForward", webView.canGoForward());
            return createMap;
        }

        public final void a(ReadableArray readableArray) {
            this.d = readableArray;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a implements OnProgressChangeListener, OnWebChromeClientListener {
        public static ChangeQuickRedirect a;
        protected ReactContext b;
        protected c c;

        @Override // com.sankuai.meituan.android.knb.listener.OnWebChromeClientListener
        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            return true;
        }

        @Override // com.sankuai.meituan.android.knb.listener.OnWebChromeClientListener
        public final boolean onFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
            return false;
        }

        public a(ReactContext reactContext, c cVar) {
            Object[] objArr = {reactContext, cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4dc2923e537144716f2b4d2e674bcb70", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4dc2923e537144716f2b4d2e674bcb70");
                return;
            }
            this.b = reactContext;
            this.c = cVar;
        }

        @Override // com.sankuai.meituan.android.knb.listener.OnProgressChangeListener
        public final void onProgressChanged(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f17f6595294fc3ff662e2729409fbbc5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f17f6595294fc3ff662e2729409fbbc5");
                return;
            }
            WebView webView = this.c.getWebView();
            String url = webView.getUrl();
            if (url == null || b.b == null || url.equals(b.b)) {
                WritableMap createMap = Arguments.createMap();
                createMap.putDouble("target", this.c.getId());
                createMap.putString("title", webView.getTitle());
                createMap.putString("url", url);
                createMap.putBoolean("canGoBack", webView.canGoBack());
                createMap.putBoolean("canGoForward", webView.canGoForward());
                createMap.putDouble(NotificationCompat.CATEGORY_PROGRESS, i / 100.0f);
                b.a(this.c, new com.meituan.android.mrn.component.mrnwebview.events.c(this.c.getId(), createMap));
            }
        }

        @Override // com.sankuai.meituan.android.knb.listener.OnWebChromeClientListener
        @TargetApi(21)
        public final boolean onShowFileChooser(ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            WritableMap writableMap;
            Object[] objArr = {valueCallback, fileChooserParams};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa6023f2b06f7081483ca81e0dd1fe91", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa6023f2b06f7081483ca81e0dd1fe91")).booleanValue();
            }
            try {
                return b.a(this.b).startPhotoPickerIntent(valueCallback, fileChooserParams.createIntent(), fileChooserParams.getAcceptTypes(), fileChooserParams.getMode() == 1);
            } catch (IOException e) {
                e.printStackTrace();
                String str = "";
                if (this.c != null && this.c.getWebView() != null) {
                    str = this.c.getWebView().getUrl();
                }
                c cVar = this.c;
                Object[] objArr2 = {cVar, str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "07daf964594e972988fd2261bc617bbf", RobustBitConfig.DEFAULT_VALUE)) {
                    writableMap = (WritableMap) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "07daf964594e972988fd2261bc617bbf");
                } else {
                    WebView webView = cVar.getWebView();
                    WritableMap createMap = Arguments.createMap();
                    createMap.putDouble("target", cVar.getId());
                    createMap.putString("url", str);
                    createMap.putBoolean("loading", webView.getProgress() != 100);
                    createMap.putString("title", webView.getTitle());
                    createMap.putBoolean("canGoBack", webView.canGoBack());
                    createMap.putBoolean("canGoForward", webView.canGoForward());
                    writableMap = createMap;
                }
                writableMap.putDouble("code", -7.0d);
                writableMap.putString("description", e.getMessage());
                b.a(this.c, new com.meituan.android.mrn.component.mrnwebview.events.a(this.c.getId(), writableMap));
                return false;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class c extends com.meituan.android.mrn.component.mrnwebview.a {
        public static ChangeQuickRedirect g;
        public C0281b h;
        protected boolean i;
        protected boolean j;
        protected KNBWebCompat k;
        private com.facebook.react.views.scroll.b l;

        public c(ao aoVar, KNBWebCompat kNBWebCompat) {
            super(aoVar);
            Object[] objArr = {aoVar, kNBWebCompat};
            ChangeQuickRedirect changeQuickRedirect = g;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aeede988aaa2a2a0fd2877b618b4dcea", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aeede988aaa2a2a0fd2877b618b4dcea");
                return;
            }
            this.i = false;
            this.j = false;
            this.k = kNBWebCompat;
        }

        public final void setSendContentSizeChangeEvents(boolean z) {
            this.i = z;
        }

        public final void setHasScrollEvent(boolean z) {
            this.j = z;
        }

        public final KNBWebCompat getKnbWebCompat() {
            return this.k;
        }

        public final WebView getWebView() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = g;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "369d528f8a6623a00d7287572c8b03de", RobustBitConfig.DEFAULT_VALUE)) {
                return (WebView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "369d528f8a6623a00d7287572c8b03de");
            }
            if (this.k != null) {
                return this.k.getWebView();
            }
            return null;
        }

        public final WebSettings getSettings() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = g;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d585c3d108c0b892cef6239173c86d18", RobustBitConfig.DEFAULT_VALUE)) {
                return (WebSettings) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d585c3d108c0b892cef6239173c86d18");
            }
            WebView webView = getWebView();
            if (webView != null) {
                return webView.getSettings();
            }
            return null;
        }

        @Override // com.meituan.android.mrn.component.mrnwebview.a, com.facebook.react.bridge.LifecycleEventListener
        public final void onHostResume() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = g;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6d47a64bda9e0d7b0f316a3acf483c9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6d47a64bda9e0d7b0f316a3acf483c9");
                return;
            }
            this.k.onStart();
            this.k.onResume();
        }

        @Override // com.meituan.android.mrn.component.mrnwebview.a, com.facebook.react.bridge.LifecycleEventListener
        public final void onHostPause() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = g;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34982062ca9e41463d206f5ec0709a5d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34982062ca9e41463d206f5ec0709a5d");
                return;
            }
            this.k.onPause();
            this.k.onStop();
        }

        @Override // com.meituan.android.mrn.component.mrnwebview.a, com.facebook.react.bridge.LifecycleEventListener
        public final void onHostDestroy() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = g;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e64b19bcd065e881b7d8fbbac5df885", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e64b19bcd065e881b7d8fbbac5df885");
                return;
            }
            f();
            this.k.onDestroy();
        }

        @Override // android.view.View
        public final void onSizeChanged(int i, int i2, int i3, int i4) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
            ChangeQuickRedirect changeQuickRedirect = g;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a81e515aba7ee4b4f877280ff8ac189e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a81e515aba7ee4b4f877280ff8ac189e");
                return;
            }
            super.onSizeChanged(i, i2, i3, i4);
            if (this.i) {
                a(this, new com.facebook.react.uimanager.events.a(getId(), i, i2));
            }
        }

        public final void setWebViewClient(C0281b c0281b) {
            Object[] objArr = {c0281b};
            ChangeQuickRedirect changeQuickRedirect = g;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2caa570f90409e3d523c26121a638e75", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2caa570f90409e3d523c26121a638e75");
            } else if (getWebView() == null) {
            } else {
                this.k.setOnWebViewClientListener(c0281b);
                this.h = c0281b;
            }
        }

        @Nullable
        public final C0281b getRNCWebViewClient() {
            return this.h;
        }

        @Override // com.meituan.android.mrn.component.mrnwebview.a
        @SuppressLint({"AddJavascriptInterface"})
        public final void setMessagingEnabled(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = g;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67174e3bd9c641a14c3cb4d8fe711459", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67174e3bd9c641a14c3cb4d8fe711459");
                return;
            }
            WebView webView = getWebView();
            if (webView == null || c() == z) {
                return;
            }
            this.c = z;
            if (z) {
                Object[] objArr2 = {this};
                ChangeQuickRedirect changeQuickRedirect2 = g;
                webView.addJavascriptInterface(PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bc879d79b813f0ad4a77979833b04797", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bc879d79b813f0ad4a77979833b04797") : new f(this), MRNWebViewModule.MODULE_NAME);
                return;
            }
            webView.removeJavascriptInterface(MRNWebViewModule.MODULE_NAME);
        }

        @Override // com.meituan.android.mrn.component.mrnwebview.a
        public final void a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = g;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d686435e63b0b77e97388a4ff387408d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d686435e63b0b77e97388a4ff387408d");
                return;
            }
            WebView webView = getWebView();
            if (webView == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 19) {
                webView.evaluateJavascript(str, null);
                return;
            }
            try {
                KNBWebCompat kNBWebCompat = this.k;
                kNBWebCompat.loadUrl(TitansConstants.JAVASCRIPT_PREFIX + URLEncoder.encode(str, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        }

        public final void e() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = g;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42f5e4cd8885cc4183129a2fa48b21a7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42f5e4cd8885cc4183129a2fa48b21a7");
                return;
            }
            WebView webView = getWebView();
            if (webView == null || !webView.getSettings().getJavaScriptEnabled() || this.b == null || TextUtils.isEmpty(this.b)) {
                return;
            }
            a("(function() {\n" + this.b + ";\n})();");
        }

        @Override // com.meituan.android.mrn.component.mrnwebview.a
        public final void b(final String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = g;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "854046f18b1a843eb91d889ac1b4176d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "854046f18b1a843eb91d889ac1b4176d");
                return;
            }
            final WebView webView = getWebView();
            if (webView == null) {
                return;
            }
            if (this.h != null) {
                webView.post(new Runnable() { // from class: com.meituan.android.mrn.component.mrnwebview.b.c.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b0a35ce8b0268f40dc6c10078f0facbd", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b0a35ce8b0268f40dc6c10078f0facbd");
                        } else if (c.this.h == null) {
                        } else {
                            WritableMap a2 = c.this.h.a(c.this, webView.getUrl());
                            a2.putString("data", str);
                            com.meituan.android.mrn.component.mrnwebview.a.a(c.this, new com.meituan.android.mrn.component.mrnwebview.events.e(c.this.getId(), a2));
                        }
                    }
                });
                return;
            }
            WritableMap createMap = Arguments.createMap();
            createMap.putString("data", str);
            a(this, new com.meituan.android.mrn.component.mrnwebview.events.e(getId(), createMap));
        }

        @Override // android.view.View
        public final void onScrollChanged(int i, int i2, int i3, int i4) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
            ChangeQuickRedirect changeQuickRedirect = g;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d6df1b29d3266eb7f75668a82acec03", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d6df1b29d3266eb7f75668a82acec03");
                return;
            }
            super.onScrollChanged(i, i2, i3, i4);
            if (this.j) {
                if (this.l == null) {
                    this.l = new com.facebook.react.views.scroll.b();
                }
                if (this.l.a(i, i2)) {
                    a(this, h.a(getId(), i.SCROLL, i, i2, this.l.a(), this.l.b(), computeHorizontalScrollRange(), computeVerticalScrollRange(), getWidth(), getHeight()));
                }
            }
        }

        public final void f() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = g;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5983c578482ed33e32abf53649e1ef20", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5983c578482ed33e32abf53649e1ef20");
                return;
            }
            WebView webView = getWebView();
            if (webView == null) {
                return;
            }
            setWebViewClient(null);
            webView.destroy();
        }
    }
}
