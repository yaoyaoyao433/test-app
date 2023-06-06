package com.sankuai.titans.offline.titans.adapter.plugin;

import android.support.annotation.RequiresApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.dianping.titans.offline.OfflineCenter;
import com.dianping.titans.offline.util.Reporter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.config.Config;
import com.sankuai.titans.config.ConfigManager;
import com.sankuai.titans.config.Switch;
import com.sankuai.titans.protocol.context.ITitansWebPageContext;
import com.sankuai.titans.protocol.lifecycle.WebPageLifeCycleAdapter;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TitansOfflineWebPageLifeCycle extends WebPageLifeCycleAdapter {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.titans.protocol.lifecycle.WebPageLifeCycleAdapter, com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
    @RequiresApi(api = 21)
    public WebResourceResponse onWebShouldInterceptRequest(ITitansWebPageContext iTitansWebPageContext, WebResourceRequest webResourceRequest) {
        Object[] objArr = {iTitansWebPageContext, webResourceRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fedd92756cd1543be6cc12482b6b77ae", RobustBitConfig.DEFAULT_VALUE)) {
            return (WebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fedd92756cd1543be6cc12482b6b77ae");
        }
        Switch r0 = ((Config) ConfigManager.getConfig("webview", Config.class, new Config())).switcher;
        if (r0 == null || r0.usingOffline) {
            try {
                return OfflineCenter.getInstance().getWebResourceResponse(webResourceRequest, iTitansWebPageContext.getUrl());
            } catch (Exception e) {
                Reporter reporter = Reporter.getInstance();
                reporter.webLog("intercept_error: ", webResourceRequest.getUrl() + ", ex: " + e.getMessage());
                return null;
            }
        }
        return null;
    }
}
