package com.meituan.android.yoda.knb.plugin;

import android.graphics.Bitmap;
import android.webkit.ConsoleMessage;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.context.ITitansWebPageContext;
import com.sankuai.titans.protocol.lifecycle.WebOverrideUrlLoadingParam;
import com.sankuai.titans.protocol.lifecycle.WebPageLifeCycleAdapter;
import com.sankuai.titans.protocol.lifecycle.WebUrlLoadParam;
import com.sankuai.titans.protocol.utils.WebResourceError;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends WebPageLifeCycleAdapter {
    public static ChangeQuickRedirect a;
    private final String b;
    private String c;
    private String d;
    private String e;
    private WeakReference<com.meituan.android.yoda.monitor.a> f;

    public b(String str, String str2, String str3, WeakReference<com.meituan.android.yoda.monitor.a> weakReference) {
        Object[] objArr = {str, str2, str3, weakReference};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a60ed3e1bfdbb7f04f1659f057eac0cc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a60ed3e1bfdbb7f04f1659f057eac0cc");
            return;
        }
        this.b = "YodaKNBWebPageLifeCycle";
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = weakReference;
    }

    @Override // com.sankuai.titans.protocol.lifecycle.WebPageLifeCycleAdapter, com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
    public final boolean onWebUrlLoad(ITitansWebPageContext iTitansWebPageContext, WebUrlLoadParam webUrlLoadParam) {
        Object[] objArr = {iTitansWebPageContext, webUrlLoadParam};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69af7e1d94df5a694135f09cea4bb2db", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69af7e1d94df5a694135f09cea4bb2db")).booleanValue();
        }
        if (iTitansWebPageContext != null) {
            com.meituan.android.yoda.monitor.log.a.a("YodaKNBWebPageLifeCycle", "onWebUrlLoad, requestCode = " + this.e + ", originUrl = " + iTitansWebPageContext.getOriginalUrl() + ", url = " + iTitansWebPageContext.getUrl() + ", ua = " + iTitansWebPageContext.getUA(), true);
        } else {
            com.meituan.android.yoda.monitor.log.a.a("YodaKNBWebPageLifeCycle", "onWebUrlLoad, webPageContext is null. requestCode = " + this.e, true);
        }
        return false;
    }

    @Override // com.sankuai.titans.protocol.lifecycle.WebPageLifeCycleAdapter, com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
    public final boolean onWebOverrideUrlLoading(ITitansWebPageContext iTitansWebPageContext, WebOverrideUrlLoadingParam webOverrideUrlLoadingParam) {
        Object[] objArr = {iTitansWebPageContext, webOverrideUrlLoadingParam};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4dd12ff48e891966504c803fec102b2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4dd12ff48e891966504c803fec102b2")).booleanValue();
        }
        if (iTitansWebPageContext != null) {
            com.meituan.android.yoda.monitor.log.a.a("YodaKNBWebPageLifeCycle", "onWebOverrideUrlLoading, requestCode = " + this.e + ", originUrl = " + iTitansWebPageContext.getOriginalUrl() + ", url = " + iTitansWebPageContext.getUrl(), true);
        } else {
            com.meituan.android.yoda.monitor.log.a.a("YodaKNBWebPageLifeCycle", "onWebOverrideUrlLoading, webPageContext is null. requestCode = " + this.e, true);
        }
        return false;
    }

    @Override // com.sankuai.titans.protocol.lifecycle.WebPageLifeCycleAdapter, com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
    public final void onWebPageStarted(ITitansWebPageContext iTitansWebPageContext, String str, Bitmap bitmap) {
        Object[] objArr = {iTitansWebPageContext, str, bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43fe73256fb56b391b40bb27eac0d8ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43fe73256fb56b391b40bb27eac0d8ef");
        } else if (iTitansWebPageContext != null) {
            com.meituan.android.yoda.monitor.log.a.a("YodaKNBWebPageLifeCycle", "onWebPageStarted, requestCode = " + this.e + ", originUrl = " + iTitansWebPageContext.getOriginalUrl() + ", url = " + iTitansWebPageContext.getUrl(), true);
            if (this.f == null || this.f.get() == null) {
                return;
            }
            this.f.get().a(this.c, iTitansWebPageContext.getUrl());
        } else {
            com.meituan.android.yoda.monitor.log.a.a("YodaKNBWebPageLifeCycle", "onWebPageStarted, webPageContext is null. requestCode = " + this.e, true);
        }
    }

    @Override // com.sankuai.titans.protocol.lifecycle.WebPageLifeCycleAdapter, com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
    public final void onWebPageFinish(ITitansWebPageContext iTitansWebPageContext) {
        Object[] objArr = {iTitansWebPageContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c508be20e44694a49b08edd48e178044", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c508be20e44694a49b08edd48e178044");
        } else if (iTitansWebPageContext != null) {
            com.meituan.android.yoda.monitor.log.a.a("YodaKNBWebPageLifeCycle", "onWebPageFinish, requestCode = " + this.e + ", originUrl = " + iTitansWebPageContext.getOriginalUrl() + ", url = " + iTitansWebPageContext.getUrl(), true);
            if (this.f == null || this.f.get() == null) {
                return;
            }
            this.f.get().b(this.d, iTitansWebPageContext.getUrl());
        } else {
            com.meituan.android.yoda.monitor.log.a.a("YodaKNBWebPageLifeCycle", "onWebPageFinish, webPageContext is null. requestCode = " + this.e, true);
        }
    }

    @Override // com.sankuai.titans.protocol.lifecycle.WebPageLifeCycleAdapter, com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
    public final void onWebReceivedError(ITitansWebPageContext iTitansWebPageContext, String str, int i, String str2) {
        Object[] objArr = {iTitansWebPageContext, str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d67dc70feefbbef47bc2c5f495467760", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d67dc70feefbbef47bc2c5f495467760");
        } else if (iTitansWebPageContext != null) {
            com.meituan.android.yoda.monitor.log.a.a("YodaKNBWebPageLifeCycle", "onWebReceivedError1, requestCode = " + this.e + ", originUrl = " + iTitansWebPageContext.getOriginalUrl() + ", url = " + iTitansWebPageContext.getUrl() + ", errorCode = " + i + ", msg = " + str2, true);
        } else {
            com.meituan.android.yoda.monitor.log.a.a("YodaKNBWebPageLifeCycle", "onWebReceivedError1, webPageContext is null. requestCode = " + this.e, true);
        }
    }

    @Override // com.sankuai.titans.protocol.lifecycle.WebPageLifeCycleAdapter, com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
    public final void onWebReceivedError(ITitansWebPageContext iTitansWebPageContext, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        int i = 0;
        Object[] objArr = {iTitansWebPageContext, webResourceRequest, webResourceError};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6997f27d1d60856ae9b58e6101014716", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6997f27d1d60856ae9b58e6101014716");
        } else if (webResourceRequest == null) {
        } else {
            String str = "";
            boolean isForMainFrame = webResourceRequest.isForMainFrame();
            String str2 = "";
            if (iTitansWebPageContext != null) {
                if (webResourceError != null) {
                    i = webResourceError.getErrorCode();
                    if (webResourceError.getDescription() != null) {
                        str2 = webResourceError.getDescription().toString();
                    }
                }
                str = iTitansWebPageContext.getUrl();
                com.meituan.android.yoda.monitor.log.a.a("YodaKNBWebPageLifeCycle", "onWebReceivedError2, requestCode = " + this.e + ", block = " + isForMainFrame + ", originUrl = " + iTitansWebPageContext.getOriginalUrl() + ", url = " + str + ", errorCode = " + i + ", msg = " + str2, true);
            } else {
                com.meituan.android.yoda.monitor.log.a.a("YodaKNBWebPageLifeCycle", "onWebReceivedError2, webPageContext is null. requestCode = " + this.e, true);
            }
            String str3 = str2;
            String str4 = str;
            if (this.f == null || this.f.get() == null) {
                return;
            }
            this.f.get().a(this.d, str4, isForMainFrame, 705, str3);
        }
    }

    @Override // com.sankuai.titans.protocol.lifecycle.WebPageLifeCycleAdapter, com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
    public final void onWebReceivedHttpError(ITitansWebPageContext iTitansWebPageContext, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        Object[] objArr = {iTitansWebPageContext, webResourceRequest, webResourceResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38053fede9f0fdb4beb975adbea4c4b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38053fede9f0fdb4beb975adbea4c4b2");
            return;
        }
        String str = "";
        if (iTitansWebPageContext != null) {
            str = iTitansWebPageContext.getUrl();
            com.meituan.android.yoda.monitor.log.a.a("YodaKNBWebPageLifeCycle", "onWebReceivedHttpError, requestCode = " + this.e + ", originUrl = " + iTitansWebPageContext.getOriginalUrl() + ", url = " + str, true);
        } else {
            com.meituan.android.yoda.monitor.log.a.a("YodaKNBWebPageLifeCycle", "onWebReceivedHttpError, webPageContext is null. requestCode = " + this.e, true);
        }
        String str2 = str;
        if (this.f == null || this.f.get() == null) {
            return;
        }
        this.f.get().a(this.d, str2, false, 705, "");
    }

    @Override // com.sankuai.titans.protocol.lifecycle.WebPageLifeCycleAdapter, com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
    public final boolean onConsoleMessage(ITitansWebPageContext iTitansWebPageContext, ConsoleMessage consoleMessage) {
        Object[] objArr = {iTitansWebPageContext, consoleMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2c445fd5e2b26d7391f51b849176d00", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2c445fd5e2b26d7391f51b849176d00")).booleanValue();
        }
        if (consoleMessage != null) {
            com.meituan.android.yoda.monitor.log.a.a("YodaKNBWebPageLifeCycle", "onConsoleMessage, requestCode = " + this.e + ", consoleMessage = " + consoleMessage.message(), true);
        } else {
            com.meituan.android.yoda.monitor.log.a.a("YodaKNBWebPageLifeCycle", "onConsoleMessage, consoleMessage is null. requestCode = " + this.e, true);
        }
        return false;
    }
}
