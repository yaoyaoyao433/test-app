package com.dianping.gcmrnmodule.wrapperviews.containers.tab;

import android.view.View;
import com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.MRNModuleViewContainerManager;
import com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.k;
import com.dianping.gcmrnmodule.wrapperviews.items.viewitems.c;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ao;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@ReactModule(name = MRNModuleTabSlideBarContainerManager.REACT_CLASS)
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0012"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/containers/tab/MRNModuleTabSlideBarContainerManager;", "Lcom/dianping/gcmrnmodule/wrapperviews/containers/viewscontainer/MRNModuleViewContainerManager;", "()V", "checkChildren", "", "parent", "Lcom/dianping/gcmrnmodule/wrapperviews/containers/viewscontainer/MRNModuleViewContainerWrapperView;", "child", "Landroid/view/View;", "index", "", "createViewInstance", "Lcom/dianping/gcmrnmodule/wrapperviews/containers/tab/MRNModuleTabSlideBarContainerWrapperView;", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getName", "", "Companion", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class MRNModuleTabSlideBarContainerManager extends MRNModuleViewContainerManager {
    public static final a Companion = new a(null);
    @NotNull
    public static final String REACT_CLASS = "MRNModuleTabSlideBarContainerWrapper";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.MRNModuleViewContainerManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public final String getName() {
        return REACT_CLASS;
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.MRNModuleViewContainerManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public final com.dianping.gcmrnmodule.wrapperviews.containers.tab.a createViewInstance(@NotNull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "015dbd22c83e76d814ba51f744995ee6", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.gcmrnmodule.wrapperviews.containers.tab.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "015dbd22c83e76d814ba51f744995ee6");
        }
        h.b(aoVar, "context");
        return new com.dianping.gcmrnmodule.wrapperviews.containers.tab.a(aoVar);
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.MRNModuleViewContainerManager, com.dianping.gcmrnmodule.wrapperviews.base.MRNModuleBaseViewGroupManager
    public final void checkChildren(@NotNull k kVar, @Nullable View view, int i) {
        Object[] objArr = {kVar, view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5fe5a491f528cc2a15fc15b50269dddf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5fe5a491f528cc2a15fc15b50269dddf");
            return;
        }
        h.b(kVar, "parent");
        SoftAssertions.assertCondition(view instanceof c, "MRNModuleTabCell 的 slideBar 属性需要使用 MRNModuleView 标签");
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/containers/tab/MRNModuleTabSlideBarContainerManager$Companion;", "", "()V", "REACT_CLASS", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }
}
