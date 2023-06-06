package com.sankuai.titans.proxy.localId;

import android.support.annotation.RequiresApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.context.ITitansWebPageContext;
import com.sankuai.titans.protocol.lifecycle.WebPageLifeCycleAdapter;
import com.sankuai.titans.protocol.utils.LocalIdUtils;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class LocalIdPageLifeCycle extends WebPageLifeCycleAdapter {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.titans.protocol.lifecycle.WebPageLifeCycleAdapter, com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
    public WebResourceResponse onWebShouldInterceptRequest(ITitansWebPageContext iTitansWebPageContext, String str) {
        Object[] objArr = {iTitansWebPageContext, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8b089f222bae1dd01b7a19352d799da", RobustBitConfig.DEFAULT_VALUE)) {
            return (WebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8b089f222bae1dd01b7a19352d799da");
        }
        InputStream inputStream = LocalIdUtils.getInputStream(iTitansWebPageContext.getContainerContext().getActivity(), str);
        if (inputStream != null) {
            return new WebResourceResponse("image/*", "UTF-8", inputStream);
        }
        return null;
    }

    @Override // com.sankuai.titans.protocol.lifecycle.WebPageLifeCycleAdapter, com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
    @RequiresApi(api = 21)
    public WebResourceResponse onWebShouldInterceptRequest(ITitansWebPageContext iTitansWebPageContext, WebResourceRequest webResourceRequest) {
        Object[] objArr = {iTitansWebPageContext, webResourceRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3fb43cd2d2cb3a1baea98c3d27181691", RobustBitConfig.DEFAULT_VALUE) ? (WebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3fb43cd2d2cb3a1baea98c3d27181691") : onWebShouldInterceptRequest(iTitansWebPageContext, webResourceRequest.getUrl().toString());
    }
}
