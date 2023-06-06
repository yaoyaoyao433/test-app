package com.dianping.gcmrnmodule.wrapperviews.containers.module;

import android.view.View;
import com.dianping.gcmrnmodule.wrapperviews.base.MRNModuleBaseViewGroupManager;
import com.dianping.gcmrnmodule.wrapperviews.shadow.MRNModuleViewHostWrapperShadowView;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ao;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@ReactModule(name = MRNModuleHoverViewContainerManager.REACT_CLASS)
/* loaded from: classes.dex */
public class MRNModuleHoverViewContainerManager extends MRNModuleBaseViewGroupManager<a> {
    protected static final String REACT_CLASS = "MRNModuleHoverViewContainerWrapper";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ac8d59b6dc3031c6c07e55c2381501a", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ac8d59b6dc3031c6c07e55c2381501a") : new a(aoVar);
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.base.MRNModuleBaseViewGroupManager
    @NotNull
    public LayoutShadowNode createMRNModuleShadowNode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4ccdaf97cd74f1b756925359cf5e1d1", RobustBitConfig.DEFAULT_VALUE) ? (LayoutShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4ccdaf97cd74f1b756925359cf5e1d1") : new MRNModuleViewHostWrapperShadowView();
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.base.MRNModuleBaseViewGroupManager
    public void checkChildren(@NotNull a aVar, @Nullable View view, int i) {
        Object[] objArr = {aVar, view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6752796d4b85c3d348238698d02bef28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6752796d4b85c3d348238698d02bef28");
        } else {
            SoftAssertions.assertCondition(view instanceof com.dianping.gcmrnmodule.wrapperviews.items.viewitems.hover.a, "MRNModule 的 hoverView 属性需要使用 MRNModuleHoverView 标签");
        }
    }
}
