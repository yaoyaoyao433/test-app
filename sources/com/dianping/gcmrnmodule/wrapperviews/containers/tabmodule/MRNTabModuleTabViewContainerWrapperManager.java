package com.dianping.gcmrnmodule.wrapperviews.containers.tabmodule;

import com.dianping.gcmrnmodule.wrapperviews.base.MRNModuleBaseViewGroupManager;
import com.dianping.gcmrnmodule.wrapperviews.shadow.MRNModuleWrapperHostWrapperShadowView;
import com.dianping.shield.dynamic.model.extra.ScrollEvent;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.v;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@ReactModule(name = MRNTabModuleTabViewContainerWrapperManager.REACT_CLASS)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0014J\u0016\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0018\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0012H\u0007J\u0018\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0012H\u0007J\u0018\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0012H\u0007J\u0018\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0012H\u0007J\u001f\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0002\u0010\u001e¨\u0006 "}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/containers/tabmodule/MRNTabModuleTabViewContainerWrapperManager;", "Lcom/dianping/gcmrnmodule/wrapperviews/base/MRNModuleBaseViewGroupManager;", "Lcom/dianping/gcmrnmodule/wrapperviews/containers/tabmodule/MRNTabModuleTabViewContainerWrapperView;", "()V", "createMRNModuleShadowNode", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getExportedCustomDirectEventTypeConstants", "", "", "", "getName", "setOnMomentumScrollBegin", "", Constants.EventType.VIEW, DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN, "", "setOnMomentumScrollEnd", DMKeys.KEY_ON_MOMENTUM_SCROLL_END, "setOnScroll", "onScroll", "setOnScrollBeginDrag", DMKeys.KEY_ON_SCROLL_BEGIN_DRAG, "setOnScrollEndDrag", DMKeys.KEY_ON_SCROLL_END_DRAG, "setScrollEventThrottled", DMKeys.KEY_THROTTLE, "", "(Lcom/dianping/gcmrnmodule/wrapperviews/containers/tabmodule/MRNTabModuleTabViewContainerWrapperView;Ljava/lang/Integer;)V", "Companion", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class MRNTabModuleTabViewContainerWrapperManager extends MRNModuleBaseViewGroupManager<b> {
    public static final a Companion = new a(null);
    @NotNull
    public static final String REACT_CLASS = "MRNTabModuleTabViewContainerWrapper";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public final String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public final b createViewInstance(@NotNull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b640eba2fc21131530afaf004ab3995", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b640eba2fc21131530afaf004ab3995");
        }
        h.b(aoVar, "reactContext");
        return new b(aoVar);
    }

    @ReactProp(defaultBoolean = false, name = DMKeys.KEY_ON_SCROLL_BEGIN_DRAG)
    public final void setOnScrollBeginDrag(@NotNull b bVar, boolean z) {
        Object[] objArr = {bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92607c5e2219f50ae204ad0591c58296", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92607c5e2219f50ae204ad0591c58296");
            return;
        }
        h.b(bVar, Constants.EventType.VIEW);
        if (z) {
            ScrollEvent tabScrollEvent = bVar.getTabScrollEvent();
            tabScrollEvent.setOnScrollBeginDrag("gdm_onScrollBeginDragCallback:" + bVar.getId());
        } else {
            bVar.getTabScrollEvent().setOnScrollBeginDrag(null);
        }
        com.dianping.gcmrnmodule.b.a().a(bVar.getHostWrapperView());
    }

    @ReactProp(defaultBoolean = false, name = DMKeys.KEY_ON_SCROLL_END_DRAG)
    public final void setOnScrollEndDrag(@NotNull b bVar, boolean z) {
        Object[] objArr = {bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab2f898de318c6b0333bbdc0455bd8f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab2f898de318c6b0333bbdc0455bd8f8");
            return;
        }
        h.b(bVar, Constants.EventType.VIEW);
        if (z) {
            ScrollEvent tabScrollEvent = bVar.getTabScrollEvent();
            tabScrollEvent.setOnScrollEndDrag("gdm_onScrollEndDragCallback:" + bVar.getId());
        } else {
            bVar.getTabScrollEvent().setOnScrollEndDrag(null);
        }
        com.dianping.gcmrnmodule.b.a().a(bVar.getHostWrapperView());
    }

    @ReactProp(defaultBoolean = false, name = "onScroll")
    public final void setOnScroll(@NotNull b bVar, boolean z) {
        Object[] objArr = {bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc879cb6ceac4cc4dfe850d3b87b6686", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc879cb6ceac4cc4dfe850d3b87b6686");
            return;
        }
        h.b(bVar, Constants.EventType.VIEW);
        if (z) {
            ScrollEvent tabScrollEvent = bVar.getTabScrollEvent();
            tabScrollEvent.setOnScroll("gdm_onScrollCallback:" + bVar.getId());
        } else {
            bVar.getTabScrollEvent().setOnScroll(null);
        }
        com.dianping.gcmrnmodule.b.a().a(bVar.getHostWrapperView());
    }

    @ReactProp(defaultBoolean = false, name = DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN)
    public final void setOnMomentumScrollBegin(@NotNull b bVar, boolean z) {
        Object[] objArr = {bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd41ec9fc4723b552e38d8b1f28eb984", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd41ec9fc4723b552e38d8b1f28eb984");
            return;
        }
        h.b(bVar, Constants.EventType.VIEW);
        if (z) {
            ScrollEvent tabScrollEvent = bVar.getTabScrollEvent();
            tabScrollEvent.setOnMomentumScrollBegin("gdm_onMomentumScrollBeginCallback:" + bVar.getId());
        } else {
            bVar.getTabScrollEvent().setOnMomentumScrollBegin(null);
        }
        com.dianping.gcmrnmodule.b.a().a(bVar.getHostWrapperView());
    }

    @ReactProp(defaultBoolean = false, name = DMKeys.KEY_ON_MOMENTUM_SCROLL_END)
    public final void setOnMomentumScrollEnd(@NotNull b bVar, boolean z) {
        Object[] objArr = {bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b00783c218b4170df18a35827269975c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b00783c218b4170df18a35827269975c");
            return;
        }
        h.b(bVar, Constants.EventType.VIEW);
        if (z) {
            ScrollEvent tabScrollEvent = bVar.getTabScrollEvent();
            tabScrollEvent.setOnMomentumScrollEnd("gdm_onMomentumScrollEndCallback:" + bVar.getId());
        } else {
            bVar.getTabScrollEvent().setOnMomentumScrollEnd(null);
        }
        com.dianping.gcmrnmodule.b.a().a(bVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_THROTTLE)
    public final void setScrollEventThrottled(@NotNull b bVar, @Nullable Integer num) {
        Object[] objArr = {bVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c277901dbb328cd4a2312b5716ea1de4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c277901dbb328cd4a2312b5716ea1de4");
            return;
        }
        h.b(bVar, Constants.EventType.VIEW);
        bVar.getTabScrollEvent().setScrollEventThrottle(num);
        com.dianping.gcmrnmodule.b.a().a(bVar.getHostWrapperView());
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.base.MRNModuleBaseViewGroupManager
    @NotNull
    public final LayoutShadowNode createMRNModuleShadowNode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "121b9d3416fb2ae4467ae72b51436613", RobustBitConfig.DEFAULT_VALUE) ? (LayoutShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "121b9d3416fb2ae4467ae72b51436613") : new MRNModuleWrapperHostWrapperShadowView();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public final Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6bf676374a21ebd3f19b07df3fc0df38", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6bf676374a21ebd3f19b07df3fc0df38");
        }
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        Map a2 = com.facebook.react.common.c.b().a("onTabButtonsNeedUpdate", com.facebook.react.common.c.a("registrationName", "onTabButtonsNeedUpdate")).a(DMKeys.KEY_ON_SCROLL_BEGIN_DRAG, com.facebook.react.common.c.a("registrationName", DMKeys.KEY_ON_SCROLL_BEGIN_DRAG)).a(DMKeys.KEY_ON_SCROLL_END_DRAG, com.facebook.react.common.c.a("registrationName", DMKeys.KEY_ON_SCROLL_END_DRAG)).a("onScroll", com.facebook.react.common.c.a("registrationName", "onScroll")).a(DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN, com.facebook.react.common.c.a("registrationName", DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN)).a(DMKeys.KEY_ON_MOMENTUM_SCROLL_END, com.facebook.react.common.c.a("registrationName", DMKeys.KEY_ON_MOMENTUM_SCROLL_END)).a();
        h.a((Object) a2, "MapBuilder.builder<Strin…\n                .build()");
        Map<String, Object> b = v.b(a2);
        if (exportedCustomDirectEventTypeConstants != null) {
            b.putAll(exportedCustomDirectEventTypeConstants);
        }
        return b;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/containers/tabmodule/MRNTabModuleTabViewContainerWrapperManager$Companion;", "", "()V", "REACT_CLASS", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }
}
