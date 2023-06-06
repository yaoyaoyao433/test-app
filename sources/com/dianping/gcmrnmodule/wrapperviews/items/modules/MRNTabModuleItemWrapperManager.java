package com.dianping.gcmrnmodule.wrapperviews.items.modules;

import com.dianping.shield.dynamic.model.module.TabModuleInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@ReactModule(name = MRNTabModuleItemWrapperManager.REACT_CLASS)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001f\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0002\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0002\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNTabModuleItemWrapperManager;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNBaseTabModuleItemWrapperManager;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNTabModuleItemWrapperView;", "()V", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getName", "", "setDisableLinkNextForTab", "", Constants.EventType.VIEW, "disableLinkNextForTab", "", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNTabModuleItemWrapperView;Ljava/lang/Boolean;)V", "setSectionHeaderBackgroundColor", DMKeys.KEY_SECTION_HEADER_BACKGROUND_COLOR, "Lcom/facebook/react/bridge/Dynamic;", "setSectionHeaderHeight", "sectionHeaderHeight", "", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNTabModuleItemWrapperView;Ljava/lang/Integer;)V", "Companion", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class MRNTabModuleItemWrapperManager extends MRNBaseTabModuleItemWrapperManager<g> {
    public static final a Companion = new a(null);
    @NotNull
    public static final String REACT_CLASS = "MRNTabModuleItemWrapper";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public final String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public final g createViewInstance(@NotNull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a765f700d7935ee7e056cc9dd7e4b0a", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a765f700d7935ee7e056cc9dd7e4b0a");
        }
        kotlin.jvm.internal.h.b(aoVar, "reactContext");
        return new g(aoVar);
    }

    @ReactProp(name = "sectionHeaderHeight")
    public final void setSectionHeaderHeight(@NotNull g gVar, @Nullable Integer num) {
        Object[] objArr = {gVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb6c2a4954a9e489ba6cd531f45d6080", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb6c2a4954a9e489ba6cd531f45d6080");
            return;
        }
        kotlin.jvm.internal.h.b(gVar, Constants.EventType.VIEW);
        ((TabModuleInfo) gVar.getInfo()).setSectionHeaderHeight(num);
        com.dianping.gcmrnmodule.b.a().a(gVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_SECTION_HEADER_BACKGROUND_COLOR)
    public final void setSectionHeaderBackgroundColor(@NotNull g gVar, @Nullable Dynamic dynamic) {
        Object[] objArr = {gVar, dynamic};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0656da75ff534a5ab21c591a32f2f6a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0656da75ff534a5ab21c591a32f2f6a8");
            return;
        }
        kotlin.jvm.internal.h.b(gVar, Constants.EventType.VIEW);
        ((TabModuleInfo) gVar.getInfo()).setSectionHeaderBackgroundColor(dynamic != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.a(dynamic) : null);
        com.dianping.gcmrnmodule.b.a().a(gVar.getHostWrapperView());
    }

    @ReactProp(name = "disableLinkNextForTab")
    public final void setDisableLinkNextForTab(@NotNull g gVar, @Nullable Boolean bool) {
        Object[] objArr = {gVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3383ae5e4ca09cd5e324d3ae6bc8026a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3383ae5e4ca09cd5e324d3ae6bc8026a");
            return;
        }
        kotlin.jvm.internal.h.b(gVar, Constants.EventType.VIEW);
        ((TabModuleInfo) gVar.getInfo()).setDisableLinkNextForTab(bool);
        com.dianping.gcmrnmodule.b.a().a(gVar.getHostWrapperView());
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNTabModuleItemWrapperManager$Companion;", "", "()V", "REACT_CLASS", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.f fVar) {
            this();
        }
    }
}
