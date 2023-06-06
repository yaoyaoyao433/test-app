package com.dianping.gcmrnmodule.wrapperviews.containers.tabmodule;

import com.dianping.gcmrnmodule.wrapperviews.base.MRNModuleBaseViewGroupManager;
import com.dianping.shield.dynamic.model.extra.ScrollEvent;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.facebook.react.module.annotations.ReactModule;
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
@ReactModule(name = MRNTabModuleTabsModulesContainerWrapperManager.REACT_CLASS)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\u0016\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0010H\u0007J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0010H\u0007J\u0018\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0010H\u0007J\u0018\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0010H\u0007J\u001f\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007¢\u0006\u0002\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/containers/tabmodule/MRNTabModuleTabsModulesContainerWrapperManager;", "Lcom/dianping/gcmrnmodule/wrapperviews/base/MRNModuleBaseViewGroupManager;", "Lcom/dianping/gcmrnmodule/wrapperviews/containers/tabmodule/MRNTabModuleTabsModulesContainerWrapperView;", "()V", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getExportedCustomDirectEventTypeConstants", "", "", "", "getName", "setOnMomentumScrollBegin", "", Constants.EventType.VIEW, DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN, "", "setOnMomentumScrollEnd", DMKeys.KEY_ON_MOMENTUM_SCROLL_END, "setOnScroll", "onScroll", "setOnScrollBeginDrag", DMKeys.KEY_ON_SCROLL_BEGIN_DRAG, "setOnScrollEndDrag", DMKeys.KEY_ON_SCROLL_END_DRAG, "setScrollEventThrottled", DMKeys.KEY_THROTTLE, "", "(Lcom/dianping/gcmrnmodule/wrapperviews/containers/tabmodule/MRNTabModuleTabsModulesContainerWrapperView;Ljava/lang/Integer;)V", "Companion", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class MRNTabModuleTabsModulesContainerWrapperManager extends MRNModuleBaseViewGroupManager<c> {
    public static final a Companion = new a(null);
    @NotNull
    public static final String REACT_CLASS = "MRNTabModuleTabsModulesContainerWrapper";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public final String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public final c createViewInstance(@NotNull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dbd5ddac9ca39ab3aaceeca69f6033ca", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dbd5ddac9ca39ab3aaceeca69f6033ca");
        }
        h.b(aoVar, "reactContext");
        return new c(aoVar);
    }

    @ReactProp(defaultBoolean = false, name = DMKeys.KEY_ON_SCROLL_BEGIN_DRAG)
    public final void setOnScrollBeginDrag(@NotNull c cVar, boolean z) {
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d37749ca04fc9ad549620f7bf5fd4494", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d37749ca04fc9ad549620f7bf5fd4494");
            return;
        }
        h.b(cVar, Constants.EventType.VIEW);
        if (z) {
            ScrollEvent pageChangeScrollEvent = cVar.getPageChangeScrollEvent();
            pageChangeScrollEvent.setOnScrollBeginDrag("gdm_onScrollBeginDragCallback:" + cVar.getId());
        } else {
            cVar.getPageChangeScrollEvent().setOnScrollBeginDrag(null);
        }
        com.dianping.gcmrnmodule.b.a().a(cVar.getHostWrapperView());
    }

    @ReactProp(defaultBoolean = false, name = DMKeys.KEY_ON_SCROLL_END_DRAG)
    public final void setOnScrollEndDrag(@NotNull c cVar, boolean z) {
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1be1a251dafd06caf3f5aa2b89b5b63b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1be1a251dafd06caf3f5aa2b89b5b63b");
            return;
        }
        h.b(cVar, Constants.EventType.VIEW);
        if (z) {
            ScrollEvent pageChangeScrollEvent = cVar.getPageChangeScrollEvent();
            pageChangeScrollEvent.setOnScrollEndDrag("gdm_onScrollEndDragCallback:" + cVar.getId());
        } else {
            cVar.getPageChangeScrollEvent().setOnScrollEndDrag(null);
        }
        com.dianping.gcmrnmodule.b.a().a(cVar.getHostWrapperView());
    }

    @ReactProp(defaultBoolean = false, name = "onScroll")
    public final void setOnScroll(@NotNull c cVar, boolean z) {
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "380065ee50e4422935da3b18119d643c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "380065ee50e4422935da3b18119d643c");
            return;
        }
        h.b(cVar, Constants.EventType.VIEW);
        if (z) {
            ScrollEvent pageChangeScrollEvent = cVar.getPageChangeScrollEvent();
            pageChangeScrollEvent.setOnScroll("gdm_onScrollCallback:" + cVar.getId());
        } else {
            cVar.getPageChangeScrollEvent().setOnScroll(null);
        }
        com.dianping.gcmrnmodule.b.a().a(cVar.getHostWrapperView());
    }

    @ReactProp(defaultBoolean = false, name = DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN)
    public final void setOnMomentumScrollBegin(@NotNull c cVar, boolean z) {
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78e2efe0502cc10a284f11dda6709074", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78e2efe0502cc10a284f11dda6709074");
            return;
        }
        h.b(cVar, Constants.EventType.VIEW);
        if (z) {
            ScrollEvent pageChangeScrollEvent = cVar.getPageChangeScrollEvent();
            pageChangeScrollEvent.setOnMomentumScrollBegin("gdm_onMomentumScrollBeginCallback:" + cVar.getId());
        } else {
            cVar.getPageChangeScrollEvent().setOnMomentumScrollBegin(null);
        }
        com.dianping.gcmrnmodule.b.a().a(cVar.getHostWrapperView());
    }

    @ReactProp(defaultBoolean = false, name = DMKeys.KEY_ON_MOMENTUM_SCROLL_END)
    public final void setOnMomentumScrollEnd(@NotNull c cVar, boolean z) {
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3eb56cb7cfd7a40bfbc83c8931bc67b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3eb56cb7cfd7a40bfbc83c8931bc67b6");
            return;
        }
        h.b(cVar, Constants.EventType.VIEW);
        if (z) {
            ScrollEvent pageChangeScrollEvent = cVar.getPageChangeScrollEvent();
            pageChangeScrollEvent.setOnMomentumScrollEnd("gdm_onMomentumScrollEndCallback:" + cVar.getId());
        } else {
            cVar.getPageChangeScrollEvent().setOnMomentumScrollEnd(null);
        }
        com.dianping.gcmrnmodule.b.a().a(cVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_THROTTLE)
    public final void setScrollEventThrottled(@NotNull c cVar, @Nullable Integer num) {
        Object[] objArr = {cVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3bef7cb0c106dc4143af58ca49c5faa3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3bef7cb0c106dc4143af58ca49c5faa3");
            return;
        }
        h.b(cVar, Constants.EventType.VIEW);
        cVar.getPageChangeScrollEvent().setScrollEventThrottle(num);
        com.dianping.gcmrnmodule.b.a().a(cVar.getHostWrapperView());
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public final Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec8ffa2dadd0e9f8277a2cd96645eba5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec8ffa2dadd0e9f8277a2cd96645eba5");
        }
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        Map a2 = com.facebook.react.common.c.b().a(DMKeys.KEY_ON_SCROLL_BEGIN_DRAG, com.facebook.react.common.c.a("registrationName", DMKeys.KEY_ON_SCROLL_BEGIN_DRAG)).a(DMKeys.KEY_ON_SCROLL_END_DRAG, com.facebook.react.common.c.a("registrationName", DMKeys.KEY_ON_SCROLL_END_DRAG)).a("onScroll", com.facebook.react.common.c.a("registrationName", "onScroll")).a(DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN, com.facebook.react.common.c.a("registrationName", DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN)).a(DMKeys.KEY_ON_MOMENTUM_SCROLL_END, com.facebook.react.common.c.a("registrationName", DMKeys.KEY_ON_MOMENTUM_SCROLL_END)).a();
        h.a((Object) a2, "MapBuilder.builder<Strin…\n                .build()");
        Map<String, Object> b = v.b(a2);
        if (exportedCustomDirectEventTypeConstants != null) {
            b.putAll(exportedCustomDirectEventTypeConstants);
        }
        return b;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/containers/tabmodule/MRNTabModuleTabsModulesContainerWrapperManager$Companion;", "", "()V", "REACT_CLASS", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }
}
