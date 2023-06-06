package com.sankuai.titans.proxy.nativeretry;

import android.app.Activity;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.context.ITitansContext;
import com.sankuai.titans.protocol.lifecycle.IContainerLifeCycle;
import com.sankuai.titans.protocol.lifecycle.ITitansPlugin;
import com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle;
import com.sankuai.titans.protocol.lifecycle.annotation.TitansPlugin;
/* compiled from: ProGuard */
@TitansPlugin(events = {}, name = "NativeRetryPlugin", version = "20.14.1")
/* loaded from: classes4.dex */
public class NativeRetryPlugin implements ITitansPlugin {
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
    public void onTitansReady(ITitansContext iTitansContext) {
    }

    @Override // com.sankuai.titans.protocol.lifecycle.ITitansPlugin
    public IWebPageLifeCycle getWebPageLifeCycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1a59dd4c09690485645702686cf7e1c", RobustBitConfig.DEFAULT_VALUE) ? (IWebPageLifeCycle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1a59dd4c09690485645702686cf7e1c") : new NativeRetryPageLifeCycle();
    }
}
