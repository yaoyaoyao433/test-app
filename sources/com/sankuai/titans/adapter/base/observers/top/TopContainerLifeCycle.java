package com.sankuai.titans.adapter.base.observers.top;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.adapter.base.TitansCrashReporter;
import com.sankuai.titans.protocol.context.ITitansContainerContext;
import com.sankuai.titans.protocol.lifecycle.ContainerLifeCycleAdapter;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TopContainerLifeCycle extends ContainerLifeCycleAdapter {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.titans.protocol.lifecycle.ContainerLifeCycleAdapter, com.sankuai.titans.protocol.lifecycle.IContainerLifeCycle
    public void onContainerResume(ITitansContainerContext iTitansContainerContext) {
        Object[] objArr = {iTitansContainerContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6876d07f04aa47be2116d339ff0ee32f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6876d07f04aa47be2116d339ff0ee32f");
            return;
        }
        super.onContainerResume(iTitansContainerContext);
        TitansCrashReporter.changeUrlFromMap(iTitansContainerContext.toString());
    }

    @Override // com.sankuai.titans.protocol.lifecycle.ContainerLifeCycleAdapter, com.sankuai.titans.protocol.lifecycle.IContainerLifeCycle
    public void onContainerStop(ITitansContainerContext iTitansContainerContext) {
        Object[] objArr = {iTitansContainerContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c37dc91a85f89e8066f477add70719b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c37dc91a85f89e8066f477add70719b6");
            return;
        }
        super.onContainerStop(iTitansContainerContext);
        TitansCrashReporter.clearKNBUrl();
    }

    @Override // com.sankuai.titans.protocol.lifecycle.ContainerLifeCycleAdapter, com.sankuai.titans.protocol.lifecycle.IContainerLifeCycle
    public void onContainerDestroy(ITitansContainerContext iTitansContainerContext) {
        Object[] objArr = {iTitansContainerContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa33367145368c1eed9d027f8772f6f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa33367145368c1eed9d027f8772f6f2");
            return;
        }
        super.onContainerDestroy(iTitansContainerContext);
        TitansCrashReporter.removeUrlFromMap(iTitansContainerContext.toString());
    }
}
