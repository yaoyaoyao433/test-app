package com.sankuai.titans.base;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.support.annotation.RequiresApi;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.context.ITitansContainerContext;
import com.sankuai.titans.protocol.context.ITitansWebPageContext;
import com.sankuai.titans.protocol.lifecycle.ITitansPlugin;
import com.sankuai.titans.protocol.lifecycle.WebOverrideUrlLoadingParam;
import com.sankuai.titans.protocol.lifecycle.WebUrlLoadParam;
import com.sankuai.titans.protocol.services.IThreadPoolService;
import com.sankuai.titans.protocol.utils.SslErrorHandler;
import com.sankuai.titans.protocol.utils.WebResourceError;
import com.sankuai.titans.protocol.webcompat.IWebView;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class FragmentObserveUtil {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static ContainerObservable initContainerObservable(List<ITitansPlugin> list, ITitansContainerContext iTitansContainerContext) {
        Object[] objArr = {list, iTitansContainerContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5f183c52a866700a2172458fcfc5704c", RobustBitConfig.DEFAULT_VALUE)) {
            return (ContainerObservable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5f183c52a866700a2172458fcfc5704c");
        }
        if (list == null || iTitansContainerContext == null) {
            return null;
        }
        return new ContainerObservable(list, iTitansContainerContext);
    }

    public static void onContainerCreated(ContainerObservable containerObservable) {
        Object[] objArr = {containerObservable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d3484eb9a0096d63110e22f6de0acb36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d3484eb9a0096d63110e22f6de0acb36");
        } else if (containerObservable == null) {
        } else {
            containerObservable.onContainerCreated();
        }
    }

    public static void onContainerStart(ContainerObservable containerObservable) {
        Object[] objArr = {containerObservable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ee8a3103b8a070b2041ffe37b5821cdd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ee8a3103b8a070b2041ffe37b5821cdd");
        } else if (containerObservable == null) {
        } else {
            containerObservable.onContainerStart();
        }
    }

    public static void onContainerResume(ContainerObservable containerObservable) {
        Object[] objArr = {containerObservable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "83b24647fe4b9a8c302d395b29cd79d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "83b24647fe4b9a8c302d395b29cd79d1");
        } else if (containerObservable == null) {
        } else {
            containerObservable.onContainerResume();
        }
    }

    public static void onContainerPause(ContainerObservable containerObservable) {
        Object[] objArr = {containerObservable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ab47dd82210984684f4e6e137ed4d59a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ab47dd82210984684f4e6e137ed4d59a");
        } else if (containerObservable == null) {
        } else {
            containerObservable.onContainerPause();
        }
    }

    public static void onContainerStop(ContainerObservable containerObservable) {
        Object[] objArr = {containerObservable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8adc51e39fa0d183f424d8d553afb6a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8adc51e39fa0d183f424d8d553afb6a0");
        } else if (containerObservable == null) {
        } else {
            containerObservable.onContainerStop();
        }
    }

    public static void onContainerDestroy(ContainerObservable containerObservable) {
        Object[] objArr = {containerObservable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0df81248fcbae4786cf7714a10743871", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0df81248fcbae4786cf7714a10743871");
        } else if (containerObservable == null) {
        } else {
            containerObservable.onContainerDestroy();
        }
    }

    public static WebPageObservable initPageObservable(List<ITitansPlugin> list, ITitansWebPageContext iTitansWebPageContext, IThreadPoolService iThreadPoolService) {
        Object[] objArr = {list, iTitansWebPageContext, iThreadPoolService};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "619d879eb9d1e0b9711d69c0903f1421", RobustBitConfig.DEFAULT_VALUE)) {
            return (WebPageObservable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "619d879eb9d1e0b9711d69c0903f1421");
        }
        if (list == null || iTitansWebPageContext == null || iThreadPoolService == null) {
            return null;
        }
        return new WebPageObservable(list, iTitansWebPageContext, iThreadPoolService);
    }

    public static void onWebUrlLoad(WebPageObservable webPageObservable, WebUrlLoadParam webUrlLoadParam) {
        Object[] objArr = {webPageObservable, webUrlLoadParam};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a2359e48413fe295f3b02739ed6d0625", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a2359e48413fe295f3b02739ed6d0625");
        } else if (webPageObservable == null) {
        } else {
            webPageObservable.onWebUrlLoad(webUrlLoadParam);
        }
    }

    @Deprecated
    public static boolean openFileChooser(WebPageObservable webPageObservable, ValueCallback<Uri> valueCallback, String str, String str2) {
        Object[] objArr = {webPageObservable, valueCallback, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a1d5550cd51b20cf00d4f2fdb93219cc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a1d5550cd51b20cf00d4f2fdb93219cc")).booleanValue();
        }
        if (webPageObservable == null) {
            return false;
        }
        return webPageObservable.openFileChooser(valueCallback, str, str2);
    }

    public static boolean onConsoleMessage(WebPageObservable webPageObservable, ConsoleMessage consoleMessage) {
        Object[] objArr = {webPageObservable, consoleMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "27d967cd48dc28837101fda2de1a4047", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "27d967cd48dc28837101fda2de1a4047")).booleanValue();
        }
        if (webPageObservable == null) {
            return false;
        }
        return webPageObservable.onConsoleMessage(consoleMessage);
    }

    @RequiresApi(api = 21)
    public static boolean onShowFileChooser(WebPageObservable webPageObservable, IWebView iWebView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Object[] objArr = {webPageObservable, iWebView, valueCallback, fileChooserParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bfee24687c7a7559d4b69f6bef49d083", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bfee24687c7a7559d4b69f6bef49d083")).booleanValue();
        }
        if (webPageObservable == null) {
            return false;
        }
        return webPageObservable.onShowFileChooser(iWebView, valueCallback, fileChooserParams);
    }

    public static boolean onWebOverrideUrlLoading(WebPageObservable webPageObservable, WebOverrideUrlLoadingParam webOverrideUrlLoadingParam) {
        Object[] objArr = {webPageObservable, webOverrideUrlLoadingParam};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ffaf3eddf5b38f847e4055af363b1a37", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ffaf3eddf5b38f847e4055af363b1a37")).booleanValue();
        }
        if (webPageObservable == null) {
            return false;
        }
        return webPageObservable.onWebOverrideUrlLoading(webOverrideUrlLoadingParam);
    }

    public static void onWebPageStarted(WebPageObservable webPageObservable, String str, Bitmap bitmap) {
        Object[] objArr = {webPageObservable, str, bitmap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "01e042d0e10485ed5221175e9e0f8afb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "01e042d0e10485ed5221175e9e0f8afb");
        } else if (webPageObservable == null) {
        } else {
            webPageObservable.onWebPageStarted(str, bitmap);
        }
    }

    public static void onWebPageFinish(WebPageObservable webPageObservable) {
        Object[] objArr = {webPageObservable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c87a362ddb41d0ea08b45bc80073684e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c87a362ddb41d0ea08b45bc80073684e");
        } else if (webPageObservable == null) {
        } else {
            webPageObservable.onWebPageFinish();
        }
    }

    public static WebResourceResponse onWebShouldInterceptRequest(WebPageObservable webPageObservable, String str) {
        Object[] objArr = {webPageObservable, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c068582be6b72acc981f3873e0ebfd0f", RobustBitConfig.DEFAULT_VALUE)) {
            return (WebResourceResponse) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c068582be6b72acc981f3873e0ebfd0f");
        }
        if (webPageObservable == null) {
            return null;
        }
        return webPageObservable.onWebShouldInterceptRequest(str);
    }

    public static void onReceivedWebResourceResponse(WebPageObservable webPageObservable, String str) {
        Object[] objArr = {webPageObservable, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dd939e73ec1a45ef096d976b5c606918", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dd939e73ec1a45ef096d976b5c606918");
        } else if (webPageObservable == null) {
        } else {
            webPageObservable.onReceivedWebResourceResponse(str);
        }
    }

    @RequiresApi(api = 21)
    public static WebResourceResponse onWebShouldInterceptRequest(WebPageObservable webPageObservable, WebResourceRequest webResourceRequest) {
        Object[] objArr = {webPageObservable, webResourceRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fa0dad619788daa032f3baaabbede566", RobustBitConfig.DEFAULT_VALUE)) {
            return (WebResourceResponse) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fa0dad619788daa032f3baaabbede566");
        }
        if (webPageObservable == null) {
            return null;
        }
        return webPageObservable.onWebShouldInterceptRequest(webResourceRequest);
    }

    public static void onWebReceivedError(WebPageObservable webPageObservable, int i, String str, String str2) {
        Object[] objArr = {webPageObservable, Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9e94ee3fc9ce8f14eedd322b3f5ff31c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9e94ee3fc9ce8f14eedd322b3f5ff31c");
        } else if (webPageObservable == null) {
        } else {
            webPageObservable.onWebReceivedError(i, str, str2);
        }
    }

    @RequiresApi(api = 23)
    public static void onWebReceivedError(WebPageObservable webPageObservable, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Object[] objArr = {webPageObservable, webResourceRequest, webResourceError};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8b22804b57f80cd1de0de033f336543c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8b22804b57f80cd1de0de033f336543c");
        } else if (webPageObservable == null) {
        } else {
            webPageObservable.onWebReceivedError(webResourceRequest, webResourceError);
        }
    }

    @RequiresApi(api = 23)
    public static void onWebReceivedHttpError(WebPageObservable webPageObservable, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        Object[] objArr = {webPageObservable, webResourceRequest, webResourceResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3e5e902a4cae3ab7a4eaf7a63a4acd7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3e5e902a4cae3ab7a4eaf7a63a4acd7c");
        } else if (webPageObservable == null) {
        } else {
            webPageObservable.onWebReceivedHttpError(webResourceRequest, webResourceResponse);
        }
    }

    public static boolean onWebReceivedSslError(WebPageObservable webPageObservable, SslErrorHandler sslErrorHandler, SslError sslError) {
        Object[] objArr = {webPageObservable, sslErrorHandler, sslError};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "09631b4d1af08d0600d64c16d653ef29", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "09631b4d1af08d0600d64c16d653ef29")).booleanValue();
        }
        if (webPageObservable == null) {
            return false;
        }
        return webPageObservable.onWebReceivedSslError(sslErrorHandler, sslError);
    }

    public static void onWebDoUpdateVisitedHistory(WebPageObservable webPageObservable, IWebView iWebView, String str, boolean z) {
        Object[] objArr = {webPageObservable, iWebView, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "310107f5ea82f61e85e661157534b079", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "310107f5ea82f61e85e661157534b079");
        } else if (webPageObservable == null) {
        } else {
            webPageObservable.onWebDoUpdateVisitedHistory(iWebView, str, z);
        }
    }
}
