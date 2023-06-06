package com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer;

import android.view.View;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ao;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@ReactModule(name = MRNModuleEmptyViewContainerManager.NAME)
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0011"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/containers/viewscontainer/MRNModuleEmptyViewContainerManager;", "Lcom/dianping/gcmrnmodule/wrapperviews/containers/viewscontainer/MRNModuleViewContainerManager;", "()V", "checkChildren", "", "parent", "Lcom/dianping/gcmrnmodule/wrapperviews/containers/viewscontainer/MRNModuleViewContainerWrapperView;", "child", "Landroid/view/View;", "index", "", "createViewInstance", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getName", "", "Companion", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class MRNModuleEmptyViewContainerManager extends MRNModuleViewContainerManager {
    public static final a Companion = new a(null);
    @NotNull
    public static final String NAME = "MRNModuleEmptyViewContainerWrapper";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.MRNModuleViewContainerManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public final String getName() {
        return NAME;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/containers/viewscontainer/MRNModuleEmptyViewContainerManager$Companion;", "", "()V", "NAME", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.f fVar) {
            this();
        }
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.MRNModuleViewContainerManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public final k createViewInstance(@NotNull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ccd06440bf4c1215f002e218d927103", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ccd06440bf4c1215f002e218d927103");
        }
        kotlin.jvm.internal.h.b(aoVar, "context");
        return new c(aoVar);
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.MRNModuleViewContainerManager, com.dianping.gcmrnmodule.wrapperviews.base.MRNModuleBaseViewGroupManager
    public final void checkChildren(@NotNull k kVar, @Nullable View view, int i) {
        Object[] objArr = {kVar, view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91b780b3c411d4be4929b9a500d7b7be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91b780b3c411d4be4929b9a500d7b7be");
            return;
        }
        kotlin.jvm.internal.h.b(kVar, "parent");
        SoftAssertions.assertCondition(view instanceof com.dianping.gcmrnmodule.wrapperviews.items.viewitems.c, "MRNModule 的 emptyView 属性需要使用 MRNModuleView 标签");
    }
}
