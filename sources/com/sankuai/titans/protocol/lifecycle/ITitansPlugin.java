package com.sankuai.titans.protocol.lifecycle;

import android.app.Activity;
import android.view.View;
import com.sankuai.titans.protocol.context.ITitansContext;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface ITitansPlugin {
    IContainerLifeCycle getContainerLifeCycle();

    View getDebugItem(Activity activity);

    IWebPageLifeCycle getWebPageLifeCycle();

    void onTitansReady(ITitansContext iTitansContext);
}
