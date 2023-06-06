package com.sankuai.titans;

import android.app.Activity;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.config.ConfigManager;
import com.sankuai.titans.protocol.adaptor.IAppTitansInfo;
import com.sankuai.titans.protocol.context.ITitansContext;
import com.sankuai.titans.protocol.lifecycle.IContainerLifeCycle;
import com.sankuai.titans.protocol.lifecycle.ITitansPlugin;
import com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle;
import com.sankuai.titans.protocol.lifecycle.annotation.TitansPlugin;
import java.util.HashMap;
/* compiled from: ProGuard */
@TitansPlugin(events = {}, name = "titans_config_plugin", version = "20.14.1")
/* loaded from: classes4.dex */
public class TitansConfigPlugin implements ITitansPlugin {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.titans.protocol.lifecycle.ITitansPlugin
    public IContainerLifeCycle getContainerLifeCycle() {
        return null;
    }

    @Override // com.sankuai.titans.protocol.lifecycle.ITitansPlugin
    public View getDebugItem(Activity activity) {
        return null;
    }

    @Override // com.sankuai.titans.protocol.lifecycle.ITitansPlugin
    public IWebPageLifeCycle getWebPageLifeCycle() {
        return null;
    }

    @Override // com.sankuai.titans.protocol.lifecycle.ITitansPlugin
    public void onTitansReady(ITitansContext iTitansContext) {
        Object[] objArr = {iTitansContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f74976737efdeb49b50605e698216ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f74976737efdeb49b50605e698216ff");
            return;
        }
        HashMap hashMap = new HashMap();
        IAppTitansInfo appInfo = iTitansContext.getAppInfo();
        hashMap.put("appid", appInfo.titansAppId());
        if (appInfo.isDebugMode()) {
            hashMap.put("isHornTest", Boolean.TRUE);
        }
        hashMap.put("titansVersion", "20.14.1");
        hashMap.put("source", "client");
        ConfigManager.pullCloudConfig("webview", hashMap);
    }
}
