package com.sankuai.titans.proxy.nativeretry;

import android.support.annotation.RequiresApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.context.ITitansWebPageContext;
import com.sankuai.titans.protocol.lifecycle.WebPageLifeCycleAdapter;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class NativeRetryPageLifeCycle extends WebPageLifeCycleAdapter {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.titans.protocol.lifecycle.WebPageLifeCycleAdapter, com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
    @RequiresApi(api = 21)
    public WebResourceResponse onWebShouldInterceptRequest(ITitansWebPageContext iTitansWebPageContext, WebResourceRequest webResourceRequest) {
        Object[] objArr = {iTitansWebPageContext, webResourceRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3f5b5891369dabe69ad7a0d9df2b3ab", RobustBitConfig.DEFAULT_VALUE)) {
            return (WebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3f5b5891369dabe69ad7a0d9df2b3ab");
        }
        try {
            return NativeRetryManager.getInstance(iTitansWebPageContext.getContainerContext().getActivity()).getRetryResponse(webResourceRequest);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
