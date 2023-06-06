package com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer;

import android.view.View;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ao;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@ReactModule(name = MRNModuleMaskViewContainerManager.REACT_CLASS)
/* loaded from: classes.dex */
public class MRNModuleMaskViewContainerManager extends MRNModuleViewContainerManager {
    protected static final String REACT_CLASS = "MRNModuleMaskViewContainerWrapper";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.MRNModuleViewContainerManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.MRNModuleViewContainerManager, com.facebook.react.uimanager.ViewManager
    public h createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0b30226365b4fc20ffd5b9c792f1af1", RobustBitConfig.DEFAULT_VALUE) ? (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0b30226365b4fc20ffd5b9c792f1af1") : new h(aoVar);
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.MRNModuleViewContainerManager, com.dianping.gcmrnmodule.wrapperviews.base.MRNModuleBaseViewGroupManager
    public void checkChildren(@NotNull k kVar, @Nullable View view, int i) {
        Object[] objArr = {kVar, view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3bacbb61351e07a35b1a4e44b7c8fae5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3bacbb61351e07a35b1a4e44b7c8fae5");
        } else {
            SoftAssertions.assertCondition(view instanceof com.dianping.gcmrnmodule.wrapperviews.items.viewitems.extra.a, "MRNModulesVC/MRNModulesVCPage/MRNModuleScrollCell 的 maskView 属性需要使用 MRNModuleExtraView 标签\nMRNModuleGridCell 的 maskView 属性需要使用 MRNModuleExtraView/MRNModuleExtraReusableView 标签");
        }
    }
}
