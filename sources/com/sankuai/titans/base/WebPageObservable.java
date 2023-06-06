package com.sankuai.titans.base;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.context.ITitansWebPageContext;
import com.sankuai.titans.protocol.lifecycle.ITitansPlugin;
import com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle;
import com.sankuai.titans.protocol.lifecycle.WebOverrideUrlLoadingParam;
import com.sankuai.titans.protocol.lifecycle.WebUrlLoadParam;
import com.sankuai.titans.protocol.lifecycle.annotation.TitansPlugin;
import com.sankuai.titans.protocol.services.IStatisticsService;
import com.sankuai.titans.protocol.services.IThreadPoolService;
import com.sankuai.titans.protocol.services.statisticInfo.LifeCycleInfo;
import com.sankuai.titans.protocol.services.statisticInfo.LifeCycleType;
import com.sankuai.titans.protocol.services.statisticInfo.PluginErrorInfo;
import com.sankuai.titans.protocol.utils.SslErrorHandler;
import com.sankuai.titans.protocol.utils.WebResourceError;
import com.sankuai.titans.protocol.webcompat.IWebView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WebPageObservable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final List<IWebPageLifeCycle> mLifeCycleList;
    private final String mScheme;
    private final IThreadPoolService mThreadPoolService;
    private final ITitansWebPageContext mWebPageContext;
    private final IStatisticsService statisticsService;
    private final Map<IWebPageLifeCycle, TitansPlugin> titansPluginMap;

    /* JADX WARN: Multi-variable type inference failed */
    public WebPageObservable(@NonNull List<ITitansPlugin> list, ITitansWebPageContext iTitansWebPageContext, @NonNull IThreadPoolService iThreadPoolService) {
        IWebPageLifeCycle webPageLifeCycle;
        Object[] objArr = {list, iTitansWebPageContext, iThreadPoolService};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "98643f192a7843d97f4e398770241770", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "98643f192a7843d97f4e398770241770");
            return;
        }
        this.titansPluginMap = new HashMap();
        this.mThreadPoolService = iThreadPoolService;
        this.mWebPageContext = iTitansWebPageContext;
        this.mScheme = iTitansWebPageContext.getContainerContext().getContainerAdapter().scheme();
        this.statisticsService = this.mWebPageContext.getContainerContext().getTitansContext().getServiceManager().getStatisticsService();
        this.mLifeCycleList = new ArrayList();
        for (ITitansPlugin iTitansPlugin : list) {
            if (iTitansPlugin != null && (webPageLifeCycle = iTitansPlugin.getWebPageLifeCycle()) != null) {
                this.mLifeCycleList.add(webPageLifeCycle);
                this.titansPluginMap.put(webPageLifeCycle, iTitansPlugin.getClass().getAnnotation(TitansPlugin.class));
            }
        }
    }

    public void onWebUrlLoad(WebUrlLoadParam webUrlLoadParam) {
        Object[] objArr = {webUrlLoadParam};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5cbebd3f7139d6f07a0aa000b2b70017", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5cbebd3f7139d6f07a0aa000b2b70017");
            return;
        }
        LifeCycleInfo pageLifeCycleInfo = getPageLifeCycleInfo(null, "onWebUrlLoad", System.currentTimeMillis());
        for (IWebPageLifeCycle iWebPageLifeCycle : this.mLifeCycleList) {
            if (iWebPageLifeCycle != null) {
                LifeCycleInfo pageLifeCycleInfo2 = getPageLifeCycleInfo(iWebPageLifeCycle, "onWebUrlLoad", System.currentTimeMillis());
                try {
                    boolean onWebUrlLoad = iWebPageLifeCycle.onWebUrlLoad(this.mWebPageContext, webUrlLoadParam);
                    reportLifeCycleInfo(pageLifeCycleInfo2);
                    if (onWebUrlLoad) {
                        break;
                    }
                } catch (Throwable th) {
                    reportErrorInfo(iWebPageLifeCycle, "onWebUrlLoad", this.mWebPageContext.getUrl(), th);
                }
            }
        }
        reportLifeCycleInfo(pageLifeCycleInfo);
    }

    public boolean onWebOverrideUrlLoading(WebOverrideUrlLoadingParam webOverrideUrlLoadingParam) {
        boolean z;
        boolean z2 = false;
        Object[] objArr = {webOverrideUrlLoadingParam};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f1def81b3b1392d0152fee9181d13ef", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f1def81b3b1392d0152fee9181d13ef")).booleanValue();
        }
        LifeCycleInfo pageLifeCycleInfo = getPageLifeCycleInfo(null, "onWebOverrideUrlLoading", System.currentTimeMillis());
        Iterator<IWebPageLifeCycle> it = this.mLifeCycleList.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = z2;
                break;
            }
            IWebPageLifeCycle next = it.next();
            if (next != null) {
                LifeCycleInfo pageLifeCycleInfo2 = getPageLifeCycleInfo(next, "onWebOverrideUrlLoading", System.currentTimeMillis());
                try {
                    z = next.onWebOverrideUrlLoading(this.mWebPageContext, webOverrideUrlLoadingParam);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    reportLifeCycleInfo(pageLifeCycleInfo2);
                    if (z) {
                        break;
                    }
                    z2 = z;
                } catch (Throwable th2) {
                    th = th2;
                    z2 = z;
                    reportErrorInfo(next, "onWebOverrideUrlLoading", this.mWebPageContext.getUrl(), th);
                }
            }
        }
        reportLifeCycleInfo(pageLifeCycleInfo);
        return z;
    }

    public void onWebPageStarted(String str, Bitmap bitmap) {
        Object[] objArr = {str, bitmap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4129b67f4a02aceb7e342861dec16c4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4129b67f4a02aceb7e342861dec16c4f");
            return;
        }
        LifeCycleInfo pageLifeCycleInfo = getPageLifeCycleInfo(null, "onWebPageStarted", System.currentTimeMillis());
        for (IWebPageLifeCycle iWebPageLifeCycle : this.mLifeCycleList) {
            if (iWebPageLifeCycle != null) {
                LifeCycleInfo pageLifeCycleInfo2 = getPageLifeCycleInfo(iWebPageLifeCycle, "onWebPageStarted", System.currentTimeMillis());
                try {
                    iWebPageLifeCycle.onWebPageStarted(this.mWebPageContext, str, bitmap);
                    reportLifeCycleInfo(pageLifeCycleInfo2);
                } catch (Throwable th) {
                    reportErrorInfo(iWebPageLifeCycle, "onWebPageStarted", this.mWebPageContext.getUrl(), th);
                }
            }
        }
        reportLifeCycleInfo(pageLifeCycleInfo);
    }

    public void onWebPageFinish() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "570f25f5364d8b6ae5843385c2b0d2d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "570f25f5364d8b6ae5843385c2b0d2d0");
            return;
        }
        LifeCycleInfo pageLifeCycleInfo = getPageLifeCycleInfo(null, "onWebPageFinish", System.currentTimeMillis());
        for (IWebPageLifeCycle iWebPageLifeCycle : this.mLifeCycleList) {
            if (iWebPageLifeCycle != null) {
                LifeCycleInfo pageLifeCycleInfo2 = getPageLifeCycleInfo(iWebPageLifeCycle, "onWebPageFinish", System.currentTimeMillis());
                try {
                    iWebPageLifeCycle.onWebPageFinish(this.mWebPageContext);
                    reportLifeCycleInfo(pageLifeCycleInfo2);
                } catch (Throwable th) {
                    reportErrorInfo(iWebPageLifeCycle, "onWebPageFinish", this.mWebPageContext.getUrl(), th);
                }
            }
        }
        reportLifeCycleInfo(pageLifeCycleInfo);
    }

    public WebResourceResponse onWebShouldInterceptRequest(String str) {
        WebResourceResponse webResourceResponse;
        Throwable th;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f61254a9b1c18d1b6efde6cc4721ed90", RobustBitConfig.DEFAULT_VALUE)) {
            return (WebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f61254a9b1c18d1b6efde6cc4721ed90");
        }
        WebResourceResponse webResourceResponse2 = null;
        LifeCycleInfo pageLifeCycleInfo = getPageLifeCycleInfo(null, "onWebShouldInterceptRequest", System.currentTimeMillis());
        Iterator<IWebPageLifeCycle> it = this.mLifeCycleList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            IWebPageLifeCycle next = it.next();
            if (next != null) {
                LifeCycleInfo pageLifeCycleInfo2 = getPageLifeCycleInfo(next, "onWebShouldInterceptRequest", System.currentTimeMillis());
                try {
                    webResourceResponse = next.onWebShouldInterceptRequest(this.mWebPageContext, str);
                    try {
                        if (TextUtils.equals(str, this.mWebPageContext.getUrl())) {
                            reportLifeCycleInfo(pageLifeCycleInfo2);
                        }
                        if (webResourceResponse != null) {
                            webResourceResponse2 = webResourceResponse;
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        reportErrorInfo(next, "onWebShouldInterceptRequest", this.mWebPageContext.getUrl(), th);
                        webResourceResponse2 = webResourceResponse;
                    }
                } catch (Throwable th3) {
                    webResourceResponse = webResourceResponse2;
                    th = th3;
                }
                webResourceResponse2 = webResourceResponse;
            }
        }
        if (TextUtils.equals(str, this.mWebPageContext.getUrl())) {
            reportLifeCycleInfo(pageLifeCycleInfo);
        }
        return webResourceResponse2;
    }

    @RequiresApi(api = 21)
    public WebResourceResponse onWebShouldInterceptRequest(WebResourceRequest webResourceRequest) {
        WebResourceResponse webResourceResponse;
        Throwable th;
        Object[] objArr = {webResourceRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b91bcf33639c2f929be3656586a0f74b", RobustBitConfig.DEFAULT_VALUE)) {
            return (WebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b91bcf33639c2f929be3656586a0f74b");
        }
        WebResourceResponse webResourceResponse2 = null;
        LifeCycleInfo pageLifeCycleInfo = getPageLifeCycleInfo(null, "onWebShouldInterceptRequest", System.currentTimeMillis());
        Iterator<IWebPageLifeCycle> it = this.mLifeCycleList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            IWebPageLifeCycle next = it.next();
            if (next != null) {
                LifeCycleInfo pageLifeCycleInfo2 = getPageLifeCycleInfo(next, "onWebShouldInterceptRequest", System.currentTimeMillis());
                try {
                    webResourceResponse = next.onWebShouldInterceptRequest(this.mWebPageContext, webResourceRequest);
                    try {
                        if (webResourceRequest.isForMainFrame()) {
                            reportLifeCycleInfo(pageLifeCycleInfo2);
                        }
                        if (webResourceResponse != null) {
                            webResourceResponse2 = webResourceResponse;
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        reportErrorInfo(next, "onWebShouldInterceptRequest", this.mWebPageContext.getUrl(), th);
                        webResourceResponse2 = webResourceResponse;
                    }
                } catch (Throwable th3) {
                    webResourceResponse = webResourceResponse2;
                    th = th3;
                }
                webResourceResponse2 = webResourceResponse;
            }
        }
        if (webResourceRequest.isForMainFrame()) {
            reportLifeCycleInfo(pageLifeCycleInfo);
        }
        return webResourceResponse2;
    }

    public void onReceivedWebResourceResponse(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27920aa88748f4a207cb0f91c402751a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27920aa88748f4a207cb0f91c402751a");
        } else {
            this.mThreadPoolService.executeOnThreadPool("Titans:onReceivedWebResourceResponse", new Runnable() { // from class: com.sankuai.titans.base.WebPageObservable.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "000e8f69de05b36619056f23fc88b795", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "000e8f69de05b36619056f23fc88b795");
                        return;
                    }
                    LifeCycleInfo pageLifeCycleInfo = WebPageObservable.this.getPageLifeCycleInfo(null, "onReceivedWebResourceResponse", System.currentTimeMillis());
                    for (IWebPageLifeCycle iWebPageLifeCycle : WebPageObservable.this.mLifeCycleList) {
                        if (iWebPageLifeCycle != null) {
                            LifeCycleInfo pageLifeCycleInfo2 = WebPageObservable.this.getPageLifeCycleInfo(iWebPageLifeCycle, "onReceivedWebResourceResponse", System.currentTimeMillis());
                            try {
                                iWebPageLifeCycle.onReceivedWebResourceResponse(WebPageObservable.this.mWebPageContext, str);
                                WebPageObservable.this.reportLifeCycleInfo(pageLifeCycleInfo2);
                            } catch (Throwable th) {
                                WebPageObservable.this.reportErrorInfo(iWebPageLifeCycle, "onReceivedWebResourceResponse", WebPageObservable.this.mWebPageContext.getUrl(), th);
                            }
                        }
                    }
                    WebPageObservable.this.reportLifeCycleInfo(pageLifeCycleInfo);
                }
            });
        }
    }

    public void onWebReceivedError(int i, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e684dd5903092a85938bf542dff038e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e684dd5903092a85938bf542dff038e6");
            return;
        }
        LifeCycleInfo pageLifeCycleInfo = getPageLifeCycleInfo(null, "onWebReceivedError", System.currentTimeMillis());
        for (IWebPageLifeCycle iWebPageLifeCycle : this.mLifeCycleList) {
            if (iWebPageLifeCycle != null) {
                LifeCycleInfo pageLifeCycleInfo2 = getPageLifeCycleInfo(iWebPageLifeCycle, "onWebReceivedError", System.currentTimeMillis());
                try {
                    iWebPageLifeCycle.onWebReceivedError(this.mWebPageContext, str2, i, str);
                    reportLifeCycleInfo(pageLifeCycleInfo2);
                } catch (Throwable th) {
                    reportErrorInfo(iWebPageLifeCycle, "onWebReceivedError", this.mWebPageContext.getUrl(), th);
                }
            }
        }
        reportLifeCycleInfo(pageLifeCycleInfo);
    }

    @RequiresApi(api = 23)
    public void onWebReceivedError(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Object[] objArr = {webResourceRequest, webResourceError};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b2b938181f3c88a29ec421174c47997", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b2b938181f3c88a29ec421174c47997");
            return;
        }
        LifeCycleInfo pageLifeCycleInfo = getPageLifeCycleInfo(null, "onWebReceivedError", System.currentTimeMillis());
        for (IWebPageLifeCycle iWebPageLifeCycle : this.mLifeCycleList) {
            if (iWebPageLifeCycle != null) {
                LifeCycleInfo pageLifeCycleInfo2 = getPageLifeCycleInfo(iWebPageLifeCycle, "onWebReceivedError", System.currentTimeMillis());
                try {
                    iWebPageLifeCycle.onWebReceivedError(this.mWebPageContext, webResourceRequest, webResourceError);
                    reportLifeCycleInfo(pageLifeCycleInfo2);
                } catch (Throwable th) {
                    reportErrorInfo(iWebPageLifeCycle, "onWebReceivedError", this.mWebPageContext.getUrl(), th);
                }
            }
        }
        reportLifeCycleInfo(pageLifeCycleInfo);
    }

    @RequiresApi(api = 23)
    public void onWebReceivedHttpError(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        Object[] objArr = {webResourceRequest, webResourceResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9ee9532164daf6be93bc2072ff12b2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9ee9532164daf6be93bc2072ff12b2f");
            return;
        }
        LifeCycleInfo pageLifeCycleInfo = getPageLifeCycleInfo(null, "onWebReceivedHttpError", System.currentTimeMillis());
        for (IWebPageLifeCycle iWebPageLifeCycle : this.mLifeCycleList) {
            if (iWebPageLifeCycle != null) {
                LifeCycleInfo pageLifeCycleInfo2 = getPageLifeCycleInfo(iWebPageLifeCycle, "onWebReceivedHttpError", System.currentTimeMillis());
                try {
                    iWebPageLifeCycle.onWebReceivedHttpError(this.mWebPageContext, webResourceRequest, webResourceResponse);
                    reportLifeCycleInfo(pageLifeCycleInfo2);
                } catch (Throwable th) {
                    reportErrorInfo(iWebPageLifeCycle, "onWebReceivedHttpError", this.mWebPageContext.getUrl(), th);
                }
            }
        }
        reportLifeCycleInfo(pageLifeCycleInfo);
    }

    public boolean onWebReceivedSslError(SslErrorHandler sslErrorHandler, SslError sslError) {
        Object[] objArr = {sslErrorHandler, sslError};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a13db8a17a920d3444976f631aeda87", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a13db8a17a920d3444976f631aeda87")).booleanValue();
        }
        reportPageError("onWebReceivedSslError", this.mWebPageContext.getUrl(), sslError.toString());
        LifeCycleInfo pageLifeCycleInfo = getPageLifeCycleInfo(null, "onWebReceivedSslError", System.currentTimeMillis());
        while (true) {
            boolean z = true;
            for (IWebPageLifeCycle iWebPageLifeCycle : this.mLifeCycleList) {
                if (iWebPageLifeCycle != null) {
                    LifeCycleInfo pageLifeCycleInfo2 = getPageLifeCycleInfo(iWebPageLifeCycle, "onWebReceivedSslError", System.currentTimeMillis());
                    try {
                        boolean onWebReceivedSslError = iWebPageLifeCycle.onWebReceivedSslError(this.mWebPageContext, sslErrorHandler, sslError);
                        reportLifeCycleInfo(pageLifeCycleInfo2);
                        if (!z || !onWebReceivedSslError) {
                            z = false;
                        }
                    } catch (Throwable th) {
                        reportErrorInfo(iWebPageLifeCycle, "onWebReceivedSslError", this.mWebPageContext.getUrl(), th);
                    }
                }
            }
            reportLifeCycleInfo(pageLifeCycleInfo);
            return z;
        }
    }

    public void onWebDoUpdateVisitedHistory(IWebView iWebView, String str, boolean z) {
        Object[] objArr = {iWebView, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9400eeb386563d29c1ab292da1067d4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9400eeb386563d29c1ab292da1067d4c");
            return;
        }
        LifeCycleInfo pageLifeCycleInfo = getPageLifeCycleInfo(null, "onWebDoUpdateVisitedHistory", System.currentTimeMillis());
        for (IWebPageLifeCycle iWebPageLifeCycle : this.mLifeCycleList) {
            if (iWebPageLifeCycle != null) {
                LifeCycleInfo pageLifeCycleInfo2 = getPageLifeCycleInfo(iWebPageLifeCycle, "onWebDoUpdateVisitedHistory", System.currentTimeMillis());
                try {
                    iWebPageLifeCycle.onWebDoUpdateVisitedHistory(this.mWebPageContext, str, z);
                    iWebPageLifeCycle.onWebDoUpdateVisitedHistory(this.mWebPageContext, iWebView, str, z);
                    reportLifeCycleInfo(pageLifeCycleInfo2);
                } catch (Throwable th) {
                    reportErrorInfo(iWebPageLifeCycle, "onWebDoUpdateVisitedHistory", this.mWebPageContext.getUrl(), th);
                }
            }
        }
        reportLifeCycleInfo(pageLifeCycleInfo);
    }

    @RequiresApi(api = 21)
    public boolean onShowFileChooser(IWebView iWebView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        boolean z = false;
        Object[] objArr = {iWebView, valueCallback, fileChooserParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f838fcb8967a13daba411a099f6adef", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f838fcb8967a13daba411a099f6adef")).booleanValue();
        }
        for (IWebPageLifeCycle iWebPageLifeCycle : this.mLifeCycleList) {
            if (iWebPageLifeCycle != null) {
                try {
                    boolean onShowFileChooser = iWebPageLifeCycle.onShowFileChooser(this.mWebPageContext, iWebView, valueCallback, fileChooserParams);
                    if (onShowFileChooser) {
                        return onShowFileChooser;
                    }
                    z = onShowFileChooser;
                } catch (Throwable th) {
                    reportErrorInfo(iWebPageLifeCycle, "onShowFileChooser", this.mWebPageContext.getUrl(), th);
                }
            }
        }
        return z;
    }

    @Deprecated
    public boolean openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        boolean z = false;
        Object[] objArr = {valueCallback, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ffa9719982c848fd754c492285a44e26", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ffa9719982c848fd754c492285a44e26")).booleanValue();
        }
        for (IWebPageLifeCycle iWebPageLifeCycle : this.mLifeCycleList) {
            if (iWebPageLifeCycle != null) {
                try {
                    boolean openFileChooser = iWebPageLifeCycle.openFileChooser(this.mWebPageContext, valueCallback, str, str2);
                    if (openFileChooser) {
                        return openFileChooser;
                    }
                    z = openFileChooser;
                } catch (Throwable th) {
                    reportErrorInfo(iWebPageLifeCycle, "openFileChooser", this.mWebPageContext.getUrl(), th);
                }
            }
        }
        return z;
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        boolean z = false;
        Object[] objArr = {consoleMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e892bbf8fc8ddb58e874f142caeb82a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e892bbf8fc8ddb58e874f142caeb82a")).booleanValue();
        }
        for (IWebPageLifeCycle iWebPageLifeCycle : this.mLifeCycleList) {
            if (iWebPageLifeCycle != null) {
                try {
                    boolean onConsoleMessage = iWebPageLifeCycle.onConsoleMessage(this.mWebPageContext, consoleMessage);
                    if (onConsoleMessage) {
                        return onConsoleMessage;
                    }
                    z = onConsoleMessage;
                } catch (Throwable th) {
                    reportErrorInfo(iWebPageLifeCycle, "onConsoleMessage", this.mWebPageContext.getUrl(), th);
                }
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public LifeCycleInfo getPageLifeCycleInfo(IWebPageLifeCycle iWebPageLifeCycle, String str, long j) {
        LifeCycleInfo lifeCycleInfo;
        Object[] objArr = {iWebPageLifeCycle, str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4dd8c970d3db690f0225d49b8b9c73c5", RobustBitConfig.DEFAULT_VALUE)) {
            return (LifeCycleInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4dd8c970d3db690f0225d49b8b9c73c5");
        }
        if (iWebPageLifeCycle == null) {
            lifeCycleInfo = new LifeCycleInfo("$all", "20.14.1", "20.14.1", LifeCycleType.WebPage, str);
        } else {
            TitansPlugin titansPlugin = this.titansPluginMap.get(iWebPageLifeCycle);
            lifeCycleInfo = new LifeCycleInfo(titansPlugin.name(), titansPlugin.version(), "20.14.1", LifeCycleType.WebPage, str);
        }
        lifeCycleInfo.setStartTime(j);
        lifeCycleInfo.setScheme(this.mScheme);
        lifeCycleInfo.setSourceUrl(this.mWebPageContext.getOriginalUrl());
        lifeCycleInfo.setTargetUrl(this.mWebPageContext.getUrl());
        return lifeCycleInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportErrorInfo(IWebPageLifeCycle iWebPageLifeCycle, String str, String str2, Throwable th) {
        Object[] objArr = {iWebPageLifeCycle, str, str2, th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce599981937c5f62183c2fb31e3b2a32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce599981937c5f62183c2fb31e3b2a32");
            return;
        }
        TitansPlugin titansPlugin = this.titansPluginMap.get(iWebPageLifeCycle);
        this.statisticsService.reportErrorInfo(new PluginErrorInfo(LifeCycleType.WebPage, str, titansPlugin.name(), titansPlugin.version(), str2, th));
    }

    private void reportPageError(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d18c6183d0dabf25b0f5381a6e6c87ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d18c6183d0dabf25b0f5381a6e6c87ee");
        } else {
            this.statisticsService.reportErrorInfo(new PluginErrorInfo((LifeCycleType) null, str, (String) null, (String) null, str2, str3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportLifeCycleInfo(LifeCycleInfo lifeCycleInfo) {
        Object[] objArr = {lifeCycleInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3fbdd7be5b6ec9b14696359cf6c5866d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3fbdd7be5b6ec9b14696359cf6c5866d");
            return;
        }
        lifeCycleInfo.setEndTime(System.currentTimeMillis());
        this.statisticsService.reportLifeCycleInfo(lifeCycleInfo);
    }
}
