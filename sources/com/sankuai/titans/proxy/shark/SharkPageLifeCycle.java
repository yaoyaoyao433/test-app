package com.sankuai.titans.proxy.shark;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.context.ITitansWebPageContext;
import com.sankuai.titans.protocol.lifecycle.WebPageLifeCycleAdapter;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SharkPageLifeCycle extends WebPageLifeCycleAdapter {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.titans.protocol.lifecycle.WebPageLifeCycleAdapter, com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
    public WebResourceResponse onWebShouldInterceptRequest(ITitansWebPageContext iTitansWebPageContext, WebResourceRequest webResourceRequest) {
        Object[] objArr = {iTitansWebPageContext, webResourceRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a5813b8621a7a065deaf2524c5570391", RobustBitConfig.DEFAULT_VALUE)) {
            return (WebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a5813b8621a7a065deaf2524c5570391");
        }
        try {
            return new SharkManager(iTitansWebPageContext.getContainerContext().getTitansContext().getServiceManager().getStatisticsService()).getSharkResponse(webResourceRequest);
        } catch (Exception e) {
            iTitansWebPageContext.getContainerContext().getTitansContext().getServiceManager().getStatisticsService().reportClassError("SharkManager", "getFormatCookieString", e);
            return null;
        }
    }
}
