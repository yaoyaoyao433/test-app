package com.meituan.android.common.weaver.impl.knb;

import android.app.Activity;
import android.view.View;
import com.meituan.android.common.weaver.impl.ErrorReporter;
import com.meituan.android.common.weaver.impl.blank.Blanks;
import com.meituan.android.common.weaver.impl.utils.Logger;
import com.meituan.android.common.weaver.interfaces.Weaver;
import com.meituan.android.common.weaver.interfaces.ffp.ContainerEvent;
import com.meituan.android.common.weaver.interfaces.ffp.FFPUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.context.ITitansContext;
import com.sankuai.titans.protocol.context.ITitansWebPageContext;
import com.sankuai.titans.protocol.lifecycle.IContainerLifeCycle;
import com.sankuai.titans.protocol.lifecycle.ITitansPlugin;
import com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle;
import com.sankuai.titans.protocol.lifecycle.WebOverrideUrlLoadingParam;
import com.sankuai.titans.protocol.lifecycle.WebPageLifeCycleAdapter;
import com.sankuai.titans.protocol.lifecycle.WebUrlLoadParam;
import com.sankuai.titans.protocol.lifecycle.annotation.TitansPlugin;
import java.util.HashMap;
/* compiled from: ProGuard */
@TitansPlugin(events = {}, name = "FFPRoutePlugin", version = "1")
/* loaded from: classes2.dex */
public class KNBRoutePlugin implements ITitansPlugin {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final ErrorReporter mReporter = new ErrorReporter("KNB", 3);

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

    /* JADX INFO: Access modifiers changed from: private */
    public void recordRouteEvent(ITitansWebPageContext iTitansWebPageContext, String str, String str2) {
        Object[] objArr = {iTitansWebPageContext, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0fef860358fd5637f7a64979810321f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0fef860358fd5637f7a64979810321f");
            return;
        }
        try {
            Activity activity = iTitansWebPageContext.getContainerContext().getActivity();
            HashMap hashMap = new HashMap();
            hashMap.put(ContainerEvent.EXTRA_TYPE, str);
            hashMap.put(ContainerEvent.EXTRA_CREATE_MS, Long.valueOf(FFPUtil.currentTimeMillis()));
            Logger.getLogger().d("recordRouteEvent: ", str);
            Weaver.getWeaver().weave(ContainerEvent.of(ContainerEvent.CONTAINER_NAME_KNB, activity, iTitansWebPageContext.getContainerContext(), hashMap));
            if (Blanks.sEnable) {
                KNBPagePath kNBPagePath = new KNBPagePath(activity, str2);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("newKNB", Boolean.TRUE);
                hashMap2.put("pageUrl", str2);
                kNBPagePath.setOptions(hashMap2);
                Blanks.getInstance().scheduleContainerDetector(activity, FFPUtil.idOfObj(iTitansWebPageContext.getContainerContext()), kNBPagePath, null);
            }
        } catch (Throwable th) {
            mReporter.report(th);
        }
    }

    @Override // com.sankuai.titans.protocol.lifecycle.ITitansPlugin
    public IWebPageLifeCycle getWebPageLifeCycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4b7793ee01f09ebe5479b4f87e0cbac", RobustBitConfig.DEFAULT_VALUE) ? (IWebPageLifeCycle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4b7793ee01f09ebe5479b4f87e0cbac") : new WebPageLifeCycleAdapter() { // from class: com.meituan.android.common.weaver.impl.knb.KNBRoutePlugin.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.sankuai.titans.protocol.lifecycle.WebPageLifeCycleAdapter, com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
            public boolean onWebUrlLoad(ITitansWebPageContext iTitansWebPageContext, WebUrlLoadParam webUrlLoadParam) {
                Object[] objArr2 = {iTitansWebPageContext, webUrlLoadParam};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f8aba8f27cc25ce6371b20954163251f", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f8aba8f27cc25ce6371b20954163251f")).booleanValue();
                }
                KNBRoutePlugin.this.recordRouteEvent(iTitansWebPageContext, ContainerEvent.TYPE_ROUTE_LOAD_URL, webUrlLoadParam.getUrl());
                return super.onWebUrlLoad(iTitansWebPageContext, webUrlLoadParam);
            }

            @Override // com.sankuai.titans.protocol.lifecycle.WebPageLifeCycleAdapter, com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
            public boolean onWebOverrideUrlLoading(ITitansWebPageContext iTitansWebPageContext, WebOverrideUrlLoadingParam webOverrideUrlLoadingParam) {
                Object[] objArr2 = {iTitansWebPageContext, webOverrideUrlLoadingParam};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6a4d8ce6a1c4cea32322c17ccb156bb6", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6a4d8ce6a1c4cea32322c17ccb156bb6")).booleanValue();
                }
                KNBRoutePlugin.this.recordRouteEvent(iTitansWebPageContext, ContainerEvent.TYPE_ROUTE_OVERLOAD_URL, webOverrideUrlLoadingParam.getUrl());
                return super.onWebOverrideUrlLoading(iTitansWebPageContext, webOverrideUrlLoadingParam);
            }
        };
    }
}
