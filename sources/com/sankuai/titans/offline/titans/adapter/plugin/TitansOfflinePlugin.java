package com.sankuai.titans.offline.titans.adapter.plugin;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.View;
import com.dianping.titans.offline.OfflineCenter;
import com.dianping.titans.offline.OfflineInitConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.offline.titans.adapter.plugin.debug.OfflineDebugView;
import com.sankuai.titans.protocol.context.ITitansContext;
import com.sankuai.titans.protocol.lifecycle.IContainerLifeCycle;
import com.sankuai.titans.protocol.lifecycle.ITitansPlugin;
import com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle;
import com.sankuai.titans.protocol.lifecycle.LifeCycle;
import com.sankuai.titans.protocol.lifecycle.annotation.TitansPlugin;
/* compiled from: ProGuard */
@TitansPlugin(events = {LifeCycle.Event.OnWebShouldInterceptRequestEx, LifeCycle.Event.OnWebFinish}, name = "TitansOfflinePlugin", version = "3.0.1")
/* loaded from: classes4.dex */
public class TitansOfflinePlugin implements ITitansPlugin {
    public static ChangeQuickRedirect changeQuickRedirect;
    private OfflineInitConfig offlineInitConfig;
    private ITitansContext titansContext;

    @Override // com.sankuai.titans.protocol.lifecycle.ITitansPlugin
    public IContainerLifeCycle getContainerLifeCycle() {
        return null;
    }

    public TitansOfflinePlugin(@NonNull OfflineInitConfig offlineInitConfig) {
        Object[] objArr = {offlineInitConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a40666cc23181407b877779d4b168c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a40666cc23181407b877779d4b168c3");
        } else {
            this.offlineInitConfig = offlineInitConfig;
        }
    }

    @Override // com.sankuai.titans.protocol.lifecycle.ITitansPlugin
    public void onTitansReady(ITitansContext iTitansContext) {
        Object[] objArr = {iTitansContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84c7c588a8a6c98175435acb979c06d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84c7c588a8a6c98175435acb979c06d8");
            return;
        }
        OfflineCenter.createInstance(iTitansContext.getApplicationContext(), this.offlineInitConfig);
        this.titansContext = iTitansContext;
        OfflineCenter.getInstance().pullOfflineConfig();
    }

    @Override // com.sankuai.titans.protocol.lifecycle.ITitansPlugin
    public IWebPageLifeCycle getWebPageLifeCycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2adbc3363fbdfb204b9663af9b60709", RobustBitConfig.DEFAULT_VALUE) ? (IWebPageLifeCycle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2adbc3363fbdfb204b9663af9b60709") : new TitansOfflineWebPageLifeCycle();
    }

    @Override // com.sankuai.titans.protocol.lifecycle.ITitansPlugin
    public View getDebugItem(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4aa0747659cc6cfa8f6438af8fbd531e", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4aa0747659cc6cfa8f6438af8fbd531e") : new OfflineDebugView(activity).setToastService(this.titansContext.getServiceManager().getToastService());
    }
}
