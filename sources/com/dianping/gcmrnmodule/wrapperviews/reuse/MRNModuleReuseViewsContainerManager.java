package com.dianping.gcmrnmodule.wrapperviews.reuse;

import android.view.View;
import com.dianping.gcmrnmodule.wrapperviews.base.MRNModuleBaseViewGroupManager;
import com.dianping.gcmrnmodule.wrapperviews.shadow.MRNModuleBaseWrapperShadowView;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ao;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import javax.annotation.Nullable;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@ReactModule(name = MRNModuleReuseViewsContainerManager.REACT_CLASS)
/* loaded from: classes.dex */
public class MRNModuleReuseViewsContainerManager extends MRNModuleBaseViewGroupManager<b> {
    public static final String REACT_CLASS = "MRNModuleReuseViewsContainerWrapper";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public b createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f564c252595c1941542d9aaf94c6066b", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f564c252595c1941542d9aaf94c6066b") : new b(aoVar);
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.base.MRNModuleBaseViewGroupManager
    @NotNull
    public LayoutShadowNode createMRNModuleShadowNode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2d01d932f7af986a86f1e94f2018ecb", RobustBitConfig.DEFAULT_VALUE) ? (LayoutShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2d01d932f7af986a86f1e94f2018ecb") : new MRNModuleBaseWrapperShadowView();
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.base.MRNModuleBaseViewGroupManager
    public void addView(@NotNull b bVar, View view, int i) {
        Object[] objArr = {bVar, view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e674c420db4d4eee2f87ee979b5b32a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e674c420db4d4eee2f87ee979b5b32a2");
            return;
        }
        super.addView((MRNModuleReuseViewsContainerManager) bVar, view, i);
        if (view instanceof a) {
            a aVar = (a) view;
            if (aVar.getMRNView() == null || aVar.g == null) {
                return;
            }
            bVar.a(aVar.getMRNView(), aVar.g);
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8945e678e8c363029b6e2fc8c58b15df", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8945e678e8c363029b6e2fc8c58b15df") : com.facebook.react.common.c.b().a("onDisplayingViewsChanged", com.facebook.react.common.c.a("registrationName", "onDisplayingViewsChanged")).a();
    }
}
