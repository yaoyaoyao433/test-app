package com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer;

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
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@ReactModule(name = MRNModuleViewContainerManager.REACT_CLASS)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0017\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016¨\u0006\u0013"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/containers/viewscontainer/MRNModuleViewContainerManager;", "Lcom/dianping/gcmrnmodule/wrapperviews/base/MRNModuleBaseViewGroupManager;", "Lcom/dianping/gcmrnmodule/wrapperviews/containers/viewscontainer/MRNModuleViewContainerWrapperView;", "()V", "checkChildren", "", "parent", "child", "Landroid/view/View;", "index", "", "createMRNModuleShadowNode", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "createViewInstance", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getName", "", "Companion", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public class MRNModuleViewContainerManager extends MRNModuleBaseViewGroupManager<k> {
    public static final a Companion = new a(null);
    @NotNull
    public static final String REACT_CLASS = "MRNModuleViewContainerWrapper";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public k createViewInstance(@NotNull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e066464a15d21d3c0e2fb7e702d989b9", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e066464a15d21d3c0e2fb7e702d989b9");
        }
        kotlin.jvm.internal.h.b(aoVar, "context");
        return new k(aoVar);
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.base.MRNModuleBaseViewGroupManager
    @NotNull
    public LayoutShadowNode createMRNModuleShadowNode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3149bdc454fdcaf4ccae4d9b5e5903e3", RobustBitConfig.DEFAULT_VALUE) ? (LayoutShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3149bdc454fdcaf4ccae4d9b5e5903e3") : new MRNModuleViewHostWrapperShadowView();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.dianping.gcmrnmodule.wrapperviews.base.MRNModuleBaseViewGroupManager
    public void checkChildren(@NotNull k kVar, @Nullable View view, int i) {
        Object[] objArr = {kVar, view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3bd4fe28c4252d7e01380f1f5ad8c62f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3bd4fe28c4252d7e01380f1f5ad8c62f");
            return;
        }
        kotlin.jvm.internal.h.b(kVar, "parent");
        SoftAssertions.assertCondition(view instanceof com.dianping.gcmrnmodule.wrapperviews.items.viewitems.c, "MRNModuleGridCell 的 children 属性需要使用 MRNModuleGridItemView/MRNModuleReusableView/MRNModuleView 标签\nMRNModuleScrollCell 的 children 属性需要使用 MRNModuleView 标签\nMRNModuleGridSection 的 children 属性需要使用 MRNModuleReusableView/MRNModuleView 标签\nMRNModuleWaterfallSection 的 children 属性需要使用 MRNModuleReusableView/MRNModuleView 标签\nMRNModuleTabViewsContainer 的 children 属性需要使用 MRNModuleView 标签\n");
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/containers/viewscontainer/MRNModuleViewContainerManager$Companion;", "", "()V", "REACT_CLASS", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.f fVar) {
            this();
        }
    }
}
