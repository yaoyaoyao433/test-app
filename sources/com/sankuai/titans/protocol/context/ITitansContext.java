package com.sankuai.titans.protocol.context;

import android.content.Context;
import com.sankuai.titans.protocol.adaptor.IAppTitansInfo;
import com.sankuai.titans.protocol.jsbridge.IJsHostCenter;
import com.sankuai.titans.protocol.services.IServiceManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface ITitansContext {
    IAppTitansInfo getAppInfo();

    Context getApplicationContext();

    IJsHostCenter getJsHostCenter();

    IServiceManager getServiceManager();
}
