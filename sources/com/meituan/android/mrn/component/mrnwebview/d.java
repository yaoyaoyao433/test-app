package com.meituan.android.mrn.component.mrnwebview;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.bean.TitansConstants;
import com.sankuai.titans.protocol.context.ITitansContainerContext;
import com.sankuai.titans.protocol.context.ITitansContext;
import com.sankuai.titans.protocol.context.ITitansWebPageContext;
import com.sankuai.titans.protocol.lifecycle.IContainerLifeCycle;
import com.sankuai.titans.protocol.lifecycle.ITitansPlugin;
import com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle;
import com.sankuai.titans.protocol.lifecycle.WebOverrideUrlLoadingParam;
import com.sankuai.titans.protocol.lifecycle.WebPageLifeCycleAdapter;
import com.sankuai.titans.protocol.lifecycle.WebUrlLoadParam;
import com.sankuai.titans.protocol.lifecycle.annotation.TitansPlugin;
import com.sankuai.titans.protocol.utils.SslErrorHandler;
import com.sankuai.titans.protocol.utils.WebResourceError;
import com.sankuai.titans.protocol.webcompat.IWebView;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Map;
/* compiled from: ProGuard */
@TitansPlugin(events = {}, name = "MRNWebviewTitansPlugin", version = "1.0.0")
/* loaded from: classes2.dex */
public final class d implements ITitansPlugin {
    public static ChangeQuickRedirect a;
    private static String d;
    protected boolean b;
    ITitansWebPageContext c;
    private WeakReference<a> e;

    @Override // com.sankuai.titans.protocol.lifecycle.ITitansPlugin
    public final IContainerLifeCycle getContainerLifeCycle() {
        return null;
    }

    @Override // com.sankuai.titans.protocol.lifecycle.ITitansPlugin
    public final View getDebugItem(Activity activity) {
        return null;
    }

    @Override // com.sankuai.titans.protocol.lifecycle.ITitansPlugin
    public final void onTitansReady(ITitansContext iTitansContext) {
    }

    public d(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "982907fddc449bf9d9353e732e2c1dc1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "982907fddc449bf9d9353e732e2c1dc1");
            return;
        }
        this.b = false;
        this.e = new WeakReference<>(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(WeakReference<a> weakReference, com.facebook.react.uimanager.events.b bVar) {
        Object[] objArr = {weakReference, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "936a205397c89f4256f415ca53cc97d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "936a205397c89f4256f415ca53cc97d3");
            return;
        }
        a aVar = weakReference.get();
        if (aVar == null) {
            com.facebook.common.logging.a.b("MRNWebviewTitansPlugin#dispatchEvent", "webViewWrapperWeakReference get null");
        } else {
            ((UIManagerModule) ((ReactContext) aVar.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().a(bVar);
        }
    }

    public static WritableMap a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "43ea37c1c505cdc1afb74754566808d6", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "43ea37c1c505cdc1afb74754566808d6");
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("target", i);
        createMap.putString("url", str);
        return createMap;
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82f37566f3e0c264e5bd98df49219611", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82f37566f3e0c264e5bd98df49219611");
            return;
        }
        a aVar = this.e.get();
        if (aVar == null) {
            com.facebook.common.logging.a.b("MRNWebviewTitansPlugin#emitFinishEvent", "webViewWrapperWeakReference get null");
            return;
        }
        int id = aVar.getId();
        b(this.e, new com.meituan.android.mrn.component.mrnwebview.events.b(id, a(id, str)));
    }

    @Override // com.sankuai.titans.protocol.lifecycle.ITitansPlugin
    public final IWebPageLifeCycle getWebPageLifeCycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "948b23670f7bc3cb5ad7f34d8bbdae45", RobustBitConfig.DEFAULT_VALUE) ? (IWebPageLifeCycle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "948b23670f7bc3cb5ad7f34d8bbdae45") : new WebPageLifeCycleAdapter() { // from class: com.meituan.android.mrn.component.mrnwebview.d.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.titans.protocol.lifecycle.WebPageLifeCycleAdapter, com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
            public final boolean onWebReceivedSslError(ITitansWebPageContext iTitansWebPageContext, SslErrorHandler sslErrorHandler, SslError sslError) {
                return false;
            }

            @Override // com.sankuai.titans.protocol.lifecycle.WebPageLifeCycleAdapter, com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
            public final boolean onWebUrlLoad(ITitansWebPageContext iTitansWebPageContext, WebUrlLoadParam webUrlLoadParam) {
                Object[] objArr2 = {iTitansWebPageContext, webUrlLoadParam};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "690aeff00928ae31707c59161ac43145", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "690aeff00928ae31707c59161ac43145")).booleanValue();
                }
                a aVar = (a) d.this.e.get();
                if (aVar == null) {
                    return false;
                }
                Map headers = aVar.getHeaders();
                boolean z = aVar.f;
                if (headers != null && headers.size() > 0) {
                    webUrlLoadParam.getAdditionalHeaders().putAll(headers);
                }
                if (MRNTitansWebViewManager.getsOnAppendAnalyzeParamsListener() != null && z && webUrlLoadParam.getUrl() != null && webUrlLoadParam.getUrl().length() > 0) {
                    webUrlLoadParam.setUrl(MRNTitansWebViewManager.getsOnAppendAnalyzeParamsListener().a(webUrlLoadParam.getUrl()));
                }
                if (iTitansWebPageContext == null) {
                    d.this.c = iTitansWebPageContext;
                }
                return false;
            }

            @Override // com.sankuai.titans.protocol.lifecycle.WebPageLifeCycleAdapter, com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
            public final boolean onWebOverrideUrlLoading(ITitansWebPageContext iTitansWebPageContext, WebOverrideUrlLoadingParam webOverrideUrlLoadingParam) {
                Object[] objArr2 = {iTitansWebPageContext, webOverrideUrlLoadingParam};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4b152b419074846277ecc6877e214c10", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4b152b419074846277ecc6877e214c10")).booleanValue();
                }
                String url = webOverrideUrlLoadingParam.getUrl();
                String unused = d.d = url;
                return url.startsWith(TitansConstants.JS_SCHEMA) ? false : false;
            }

            @Override // com.sankuai.titans.protocol.lifecycle.WebPageLifeCycleAdapter, com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
            public final void onWebPageStarted(ITitansWebPageContext iTitansWebPageContext, String str, Bitmap bitmap) {
                Object[] objArr2 = {iTitansWebPageContext, str, bitmap};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "06dcccca93160d39705840fc5cf9b136", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "06dcccca93160d39705840fc5cf9b136");
                    return;
                }
                d.this.b = false;
                a aVar = (a) d.this.e.get();
                if (aVar == null) {
                    com.facebook.common.logging.a.b("MRNWebviewTitansPlugin#onWebPageStarted", "webViewWrapperWeakReference get null");
                    return;
                }
                int id = aVar.getId();
                d.b(d.this.e, new com.meituan.android.mrn.component.mrnwebview.events.d(id, d.a(id, str)));
            }

            @Override // com.sankuai.titans.protocol.lifecycle.WebPageLifeCycleAdapter, com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
            public final void onWebPageFinish(ITitansWebPageContext iTitansWebPageContext) {
                Object[] objArr2 = {iTitansWebPageContext};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "096ba163106cffae198bc784c4ccc4d0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "096ba163106cffae198bc784c4ccc4d0");
                    return;
                }
                a aVar = (a) d.this.e.get();
                if (aVar == null) {
                    com.facebook.common.logging.a.b("MRNWebviewTitansPlugin#onWebPageFinish", "webViewWrapperWeakReference get null");
                    return;
                }
                String injectedJS = aVar.getInjectedJS();
                if (d.this.b) {
                    return;
                }
                com.facebook.common.logging.a.a("MRNWebviewTitansPlugin#onWebPageFinish", "loadJs ", injectedJS);
                ITitansContainerContext containerContext = iTitansWebPageContext.getContainerContext();
                containerContext.loadJs("javascript:(function() {\n" + injectedJS + ";\n})();", new ValueCallback() { // from class: com.meituan.android.mrn.component.mrnwebview.d.1.1
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                    }
                });
                d.this.a(iTitansWebPageContext.getUrl());
            }

            @Override // com.sankuai.titans.protocol.lifecycle.WebPageLifeCycleAdapter, com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
            public final void onWebReceivedError(ITitansWebPageContext iTitansWebPageContext, String str, int i, String str2) {
                Object[] objArr2 = {iTitansWebPageContext, str, Integer.valueOf(i), str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0ce2b8fe07714da5930e1ee9a628cbb2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0ce2b8fe07714da5930e1ee9a628cbb2");
                    return;
                }
                d.this.b = true;
                com.facebook.common.logging.a.b("MRNWebviewTitansPlugin#onWebReceivedError", "errorUrl " + str + " errorCode " + i + " errorDescription " + str2);
                d.this.a(str);
                a aVar = (a) d.this.e.get();
                if (aVar == null) {
                    com.facebook.common.logging.a.b("MRNWebviewTitansPlugin#onWebReceivedError", "webViewWrapperWeakReference get null");
                    return;
                }
                int id = aVar.getId();
                WritableMap a2 = d.a(id, str);
                a2.putDouble("code", i);
                a2.putString("description", str2);
                d.b(d.this.e, new com.meituan.android.mrn.component.mrnwebview.events.a(id, a2));
            }

            @Override // com.sankuai.titans.protocol.lifecycle.WebPageLifeCycleAdapter, com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
            @RequiresApi(api = 23)
            public final void onWebReceivedError(ITitansWebPageContext iTitansWebPageContext, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                Object[] objArr2 = {iTitansWebPageContext, webResourceRequest, webResourceError};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e86b424a267c0cd982c42d7bc741218e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e86b424a267c0cd982c42d7bc741218e");
                } else if (webResourceRequest.isForMainFrame()) {
                    d.this.b = true;
                    String uri = webResourceRequest.getUrl().toString();
                    com.facebook.common.logging.a.b("MRNWebviewTitansPlugin#onWebReceivedError WebResourceRequest", "errorUrl " + uri + " errorCode " + webResourceError.getErrorCode() + " errorDescription " + ((Object) webResourceError.getDescription()));
                    d.this.a(uri);
                    a aVar = (a) d.this.e.get();
                    if (aVar == null) {
                        com.facebook.common.logging.a.b("MRNWebviewTitansPlugin#onWebReceivedError", "webViewWrapperWeakReference get null");
                        return;
                    }
                    int id = aVar.getId();
                    WritableMap a2 = d.a(id, uri);
                    a2.putDouble("code", webResourceError.getErrorCode());
                    a2.putString("description", webResourceError.getDescription().toString());
                    d.b(d.this.e, new com.meituan.android.mrn.component.mrnwebview.events.a(id, a2));
                }
            }

            @Override // com.sankuai.titans.protocol.lifecycle.WebPageLifeCycleAdapter, com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
            @TargetApi(21)
            public final boolean onShowFileChooser(ITitansWebPageContext iTitansWebPageContext, IWebView iWebView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                Object[] objArr2 = {iTitansWebPageContext, iWebView, valueCallback, fileChooserParams};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d712f832aba83cede62c4a665bbc9c2d", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d712f832aba83cede62c4a665bbc9c2d")).booleanValue();
                }
                String[] acceptTypes = fileChooserParams.getAcceptTypes();
                boolean z = fileChooserParams.getMode() == 1;
                a aVar = (a) d.this.e.get();
                if (aVar == null) {
                    return false;
                }
                int id = aVar.getId();
                try {
                    return ((MRNWebViewModule) ((ReactContext) aVar.getContext()).getNativeModule(MRNWebViewModule.class)).startPhotoPickerIntent(valueCallback, fileChooserParams.createIntent(), acceptTypes, z);
                } catch (IOException e) {
                    e.printStackTrace();
                    WritableMap a2 = d.a(id, iTitansWebPageContext.getUrl());
                    a2.putDouble("code", -7.0d);
                    a2.putString("description", e.getMessage());
                    d.b(d.this.e, new com.meituan.android.mrn.component.mrnwebview.events.a(id, a2));
                    return false;
                }
            }
        };
    }
}
