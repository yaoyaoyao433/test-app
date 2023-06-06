package com.dianping.gcmrnmodule.wrapperviews.items.cellitems.hover;

import com.dianping.gcmrnmodule.b;
import com.dianping.gcmrnmodule.wrapperviews.items.cellitems.MRNModuleCellItemManager;
import com.dianping.gcmrnmodule.wrapperviews.shadow.MRNModuleViewHostWrapperShadowView;
import com.dianping.shield.dynamic.model.cell.HoverCellInfo;
import com.dianping.shield.dynamic.model.extra.ScrollEvent;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.facebook.react.common.c;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.v;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@ReactModule(name = MRNModuleHoverCellItemManager.REACT_CLASS)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b!\b\u0007\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001:B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\u001f\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0002\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0002\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0002\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0002\u0010\u0013J\u001a\u0010 \u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u000bH\u0007J\u0018\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0012H\u0007J\u0018\u0010$\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u0012H\u0007J\u0018\u0010&\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0012H\u0007J\u0018\u0010(\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u0012H\u0007J\u0018\u0010*\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u0012H\u0007J\u0018\u0010,\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u0012H\u0007J\u0018\u0010.\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u0012H\u0007J\u001f\u00100\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u00101\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010\u001bJ\u001f\u00102\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u00103\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0002\u0010\u0013J\u001f\u00104\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u00105\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0002\u0010\u0013J\u001f\u00106\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u00107\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0002\u0010\u0013J\u001f\u00108\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u00109\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010\u001b¨\u0006;"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/hover/MRNModuleHoverCellItemManager;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/MRNModuleCellItemManager;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/hover/MRNModuleHoverCellItemWrapperView;", "()V", "createMRNModuleShadowNode", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "createViewInstance", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getExportedCustomDirectEventTypeConstants", "", "", "", "getName", "setAlwaysHover", "", Constants.EventType.VIEW, DMKeys.KEY_HOVER_ALWAYS, "", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/hover/MRNModuleHoverCellItemWrapperView;Ljava/lang/Boolean;)V", "setAutoOffset", DMKeys.KEY_HOVER_AUTO_OFFSET, "setAutoStopHover", DMKeys.KEY_HOVER_AUTO_STOP_HOVER, "setAutoStopHoverType", DMKeys.KEY_HOVER_AUTO_STOP_HOVER_TYPE, "", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/hover/MRNModuleHoverCellItemWrapperView;Ljava/lang/Integer;)V", "setHoverOffset", DMKeys.KEY_HOVER_OFFSET, "setIsHoverTop", "isHoverTop", "setJumpUrl", DMKeys.KEY_JUMP_URL, "setOnHoverStatusChanged", "onHoverStatusChanged", "setOnMomentumScrollBegin", DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN, "setOnMomentumScrollEnd", DMKeys.KEY_ON_MOMENTUM_SCROLL_END, "setOnScroll", "onScroll", "setOnScrollBeginDrag", DMKeys.KEY_ON_SCROLL_BEGIN_DRAG, "setOnScrollEndDrag", DMKeys.KEY_ON_SCROLL_END_DRAG, "setOnSelect", "onSelect", "setScrollEventThrottled", DMKeys.KEY_THROTTLE, "setShowBottomLine", DMKeys.KEY_HOVER_SHOW_BOTTOM_LINE, "setShowShadow", DMKeys.KEY_HOVER_SHOW_SHADOW, "setShowTopLine", DMKeys.KEY_HOVER_SHOW_TOP_LINE, "setZPosition", DMKeys.KEY_HOVER_Z_POSITION, "Companion", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class MRNModuleHoverCellItemManager extends MRNModuleCellItemManager<com.dianping.gcmrnmodule.wrapperviews.items.cellitems.hover.a> {
    public static final a Companion = new a(null);
    @NotNull
    public static final String REACT_CLASS = "MRNModuleHoverCellItemWrapper";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.cellitems.MRNModuleCellItemManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public final String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public final com.dianping.gcmrnmodule.wrapperviews.items.cellitems.hover.a createViewInstance(@NotNull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3390fbc562fd56da382f509b58b86874", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.gcmrnmodule.wrapperviews.items.cellitems.hover.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3390fbc562fd56da382f509b58b86874");
        }
        h.b(aoVar, "context");
        return new com.dianping.gcmrnmodule.wrapperviews.items.cellitems.hover.a(aoVar);
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.cellitems.MRNModuleCellItemManager, com.dianping.gcmrnmodule.wrapperviews.base.MRNModuleBaseViewGroupManager
    @NotNull
    public final LayoutShadowNode createMRNModuleShadowNode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42e5e6d7234142908cc0b950cd0dbcba", RobustBitConfig.DEFAULT_VALUE) ? (LayoutShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42e5e6d7234142908cc0b950cd0dbcba") : new MRNModuleViewHostWrapperShadowView();
    }

    @ReactProp(name = DMKeys.KEY_JUMP_URL)
    public final void setJumpUrl(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.hover.a aVar, @Nullable String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d8d53cc236b7153a42f27660b4583db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d8d53cc236b7153a42f27660b4583db");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((HoverCellInfo) aVar.getInfo()).setJumpUrl(str);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_HOVER_ALWAYS)
    public final void setAlwaysHover(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.hover.a aVar, @Nullable Boolean bool) {
        Object[] objArr = {aVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c88881af2fe612f269ab18dfde0e4dcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c88881af2fe612f269ab18dfde0e4dcd");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((HoverCellInfo) aVar.getInfo()).setAlwaysHover(bool);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_HOVER_OFFSET)
    public final void setHoverOffset(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.hover.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72808761f3f440d803f049d409b54cc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72808761f3f440d803f049d409b54cc8");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((HoverCellInfo) aVar.getInfo()).setHoverOffset(num != null ? Float.valueOf(num.intValue()) : null);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_HOVER_AUTO_OFFSET)
    public final void setAutoOffset(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.hover.a aVar, @Nullable Boolean bool) {
        Object[] objArr = {aVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f3690c7d8f48b8ec4b54c8549a3c703", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f3690c7d8f48b8ec4b54c8549a3c703");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((HoverCellInfo) aVar.getInfo()).setAutoOffset(bool);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_HOVER_SHOW_TOP_LINE)
    public final void setShowTopLine(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.hover.a aVar, @Nullable Boolean bool) {
        Object[] objArr = {aVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c28e804e17963a38a9d4d22533cc29b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c28e804e17963a38a9d4d22533cc29b");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((HoverCellInfo) aVar.getInfo()).setShowTopLine(bool);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_HOVER_SHOW_BOTTOM_LINE)
    public final void setShowBottomLine(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.hover.a aVar, @Nullable Boolean bool) {
        Object[] objArr = {aVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f581915c78ee4d9317a8bb77cb5da9ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f581915c78ee4d9317a8bb77cb5da9ec");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((HoverCellInfo) aVar.getInfo()).setShowBottomLine(bool);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_HOVER_SHOW_SHADOW)
    public final void setShowShadow(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.hover.a aVar, @Nullable Boolean bool) {
        Object[] objArr = {aVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70dee6a115aef278eee59a9d3108cd5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70dee6a115aef278eee59a9d3108cd5f");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((HoverCellInfo) aVar.getInfo()).setShowShadow(bool);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_HOVER_Z_POSITION)
    public final void setZPosition(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.hover.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b547cfbcdfc9255cf45dc0fc45c2e93a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b547cfbcdfc9255cf45dc0fc45c2e93a");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((HoverCellInfo) aVar.getInfo()).setZPosition(num);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_HOVER_AUTO_STOP_HOVER)
    public final void setAutoStopHover(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.hover.a aVar, @Nullable Boolean bool) {
        Object[] objArr = {aVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b882fe1f573ba6bd285a7a84798a818f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b882fe1f573ba6bd285a7a84798a818f");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((HoverCellInfo) aVar.getInfo()).setAutoStopHover(bool);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_HOVER_AUTO_STOP_HOVER_TYPE)
    public final void setAutoStopHoverType(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.hover.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fcdd3bcf1196b43e7ff54518b151525d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fcdd3bcf1196b43e7ff54518b151525d");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((HoverCellInfo) aVar.getInfo()).setAutoStopHoverType(num);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = "isHoverTop")
    public final void setIsHoverTop(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.hover.a aVar, @Nullable Boolean bool) {
        Object[] objArr = {aVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ecd00cc5d0f20a698e4502e846acf65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ecd00cc5d0f20a698e4502e846acf65");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((HoverCellInfo) aVar.getInfo()).setHoverTop(bool);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = "onSelect")
    public final void setOnSelect(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.hover.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e09b60710166520cf18b8042bdae0740", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e09b60710166520cf18b8042bdae0740");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        if (z) {
            w wVar = w.a;
            String format = String.format("gdm_didSelectCallback:%s", Arrays.copyOf(new Object[]{Integer.valueOf(aVar.getId())}, 1));
            h.a((Object) format, "java.lang.String.format(format, *args)");
            ((HoverCellInfo) aVar.getInfo()).setDidSelectCallback(format);
        } else {
            ((HoverCellInfo) aVar.getInfo()).setDidSelectCallback(null);
        }
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = "onHoverStatusChanged")
    public final void setOnHoverStatusChanged(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.hover.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da04c2d923fca3804203e30917c41e66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da04c2d923fca3804203e30917c41e66");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        if (z) {
            w wVar = w.a;
            String format = String.format("gdm_hoverStatusChangedCallBack:%s", Arrays.copyOf(new Object[]{Integer.valueOf(aVar.getId())}, 1));
            h.a((Object) format, "java.lang.String.format(format, *args)");
            ((HoverCellInfo) aVar.getInfo()).setOnHoverStatusChanged(format);
        } else {
            ((HoverCellInfo) aVar.getInfo()).setOnHoverStatusChanged(null);
        }
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(defaultBoolean = false, name = DMKeys.KEY_ON_SCROLL_BEGIN_DRAG)
    public final void setOnScrollBeginDrag(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.hover.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e54b17f3a6b5dc3fac238e2831f05921", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e54b17f3a6b5dc3fac238e2831f05921");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        if (z) {
            ScrollEvent hoverScrollEvent = aVar.getHoverScrollEvent();
            hoverScrollEvent.setOnScrollBeginDrag("gdm_onScrollBeginDragCallback:" + aVar.getId());
        } else {
            aVar.getHoverScrollEvent().setOnScrollBeginDrag(null);
        }
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(defaultBoolean = false, name = DMKeys.KEY_ON_SCROLL_END_DRAG)
    public final void setOnScrollEndDrag(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.hover.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f102a22f05f35664927d93eda650057", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f102a22f05f35664927d93eda650057");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        if (z) {
            ScrollEvent hoverScrollEvent = aVar.getHoverScrollEvent();
            hoverScrollEvent.setOnScrollEndDrag("gdm_onScrollEndDragCallback:" + aVar.getId());
        } else {
            aVar.getHoverScrollEvent().setOnScrollEndDrag(null);
        }
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(defaultBoolean = false, name = "onScroll")
    public final void setOnScroll(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.hover.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "806b53c8ea123d1f5630e11a109c97a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "806b53c8ea123d1f5630e11a109c97a7");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        if (z) {
            ScrollEvent hoverScrollEvent = aVar.getHoverScrollEvent();
            hoverScrollEvent.setOnScroll("gdm_onScrollCallback:" + aVar.getId());
        } else {
            aVar.getHoverScrollEvent().setOnScroll(null);
        }
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(defaultBoolean = false, name = DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN)
    public final void setOnMomentumScrollBegin(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.hover.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "364304f56530d9a716541b27f26ec51f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "364304f56530d9a716541b27f26ec51f");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        if (z) {
            ScrollEvent hoverScrollEvent = aVar.getHoverScrollEvent();
            hoverScrollEvent.setOnMomentumScrollBegin("gdm_onMomentumScrollBeginCallback:" + aVar.getId());
        } else {
            aVar.getHoverScrollEvent().setOnMomentumScrollBegin(null);
        }
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(defaultBoolean = false, name = DMKeys.KEY_ON_MOMENTUM_SCROLL_END)
    public final void setOnMomentumScrollEnd(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.hover.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ba06468c5fc0a9184a6cfec91d2d778", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ba06468c5fc0a9184a6cfec91d2d778");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        if (z) {
            ScrollEvent hoverScrollEvent = aVar.getHoverScrollEvent();
            hoverScrollEvent.setOnMomentumScrollEnd("gdm_onMomentumScrollEndCallback:" + aVar.getId());
        } else {
            aVar.getHoverScrollEvent().setOnMomentumScrollEnd(null);
        }
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_THROTTLE)
    public final void setScrollEventThrottled(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.hover.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14d4d32d26fae0022e251afe75b8da5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14d4d32d26fae0022e251afe75b8da5b");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        aVar.getHoverScrollEvent().setScrollEventThrottle(num);
        b.a().a(aVar.getHostWrapperView());
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.cellitems.MRNModuleCellItemManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public final Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9cab8f75f550518fafe37d1abce1281f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9cab8f75f550518fafe37d1abce1281f");
        }
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        Map a2 = c.b().a("onSelect", c.a("registrationName", "onSelect")).a("onHoverStatusChanged", c.a("registrationName", "onHoverStatusChanged")).a(DMKeys.KEY_ON_SCROLL_BEGIN_DRAG, c.a("registrationName", DMKeys.KEY_ON_SCROLL_BEGIN_DRAG)).a(DMKeys.KEY_ON_SCROLL_END_DRAG, c.a("registrationName", DMKeys.KEY_ON_SCROLL_END_DRAG)).a("onScroll", c.a("registrationName", "onScroll")).a(DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN, c.a("registrationName", DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN)).a(DMKeys.KEY_ON_MOMENTUM_SCROLL_END, c.a("registrationName", DMKeys.KEY_ON_MOMENTUM_SCROLL_END)).a();
        h.a((Object) a2, "MapBuilder.builder<Strin…\n                .build()");
        Map<String, Object> b = v.b(a2);
        if (exportedCustomDirectEventTypeConstants != null) {
            b.putAll(exportedCustomDirectEventTypeConstants);
        }
        return b;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/hover/MRNModuleHoverCellItemManager$Companion;", "", "()V", "REACT_CLASS", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }
}
