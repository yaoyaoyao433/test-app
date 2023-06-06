package com.sankuai.titans.base;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.titans.protocol.adaptor.IAppTitansInfo;
import com.sankuai.titans.protocol.context.ITitansContext;
import com.sankuai.titans.protocol.jsbridge.IJsHostCenter;
import com.sankuai.titans.protocol.services.IServiceManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TitansContext implements ITitansContext {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final IAppTitansInfo appInfo;
    private final Context applicationContext;
    private final IJsHostCenter jsHostCenter;
    private final IServiceManager serviceManager;

    public TitansContext(@NonNull Context context, @NonNull IAppTitansInfo iAppTitansInfo, IServiceManager iServiceManager, IJsHostCenter iJsHostCenter) {
        Object[] objArr = {context, iAppTitansInfo, iServiceManager, iJsHostCenter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd46ea57da523adc0034e7e8fa0b1655", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd46ea57da523adc0034e7e8fa0b1655");
            return;
        }
        this.applicationContext = context;
        this.appInfo = iAppTitansInfo;
        this.jsHostCenter = iJsHostCenter;
        this.serviceManager = iServiceManager;
    }

    @Override // com.sankuai.titans.protocol.context.ITitansContext
    public Context getApplicationContext() {
        return this.applicationContext;
    }

    @Override // com.sankuai.titans.protocol.context.ITitansContext
    public IAppTitansInfo getAppInfo() {
        return this.appInfo;
    }

    @Override // com.sankuai.titans.protocol.context.ITitansContext
    public IJsHostCenter getJsHostCenter() {
        return this.jsHostCenter;
    }

    @Override // com.sankuai.titans.protocol.context.ITitansContext
    public IServiceManager getServiceManager() {
        return this.serviceManager;
    }
}
