package com.dianping.gcmrnmodule.wrapperviews.items.cellitems.scroll;

import com.dianping.gcmrnmodule.b;
import com.dianping.gcmrnmodule.wrapperviews.items.cellitems.MRNModuleCellItemManager;
import com.dianping.shield.dynamic.model.cell.ScrollCellInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.c;
import com.facebook.react.module.annotations.ReactModule;
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
@ReactModule(name = MRNModuleScrollCellItemManager.REACT_CLASS)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0007\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001;B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0016\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\u001f\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011J\u001a\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007J\u001f\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011J\u0018\u0010\u001b\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J\u0018\u0010\u001e\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001dH\u0007J\u0018\u0010 \u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u001dH\u0007J\u0018\u0010\"\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u001dH\u0007J\u0018\u0010$\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u001dH\u0007J\u0018\u0010&\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u001dH\u0007J\u0018\u0010(\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u001dH\u0007J\u001f\u0010*\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011J\u001f\u0010,\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010-\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011J\u001f\u0010.\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010/\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011J\u001f\u00100\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u00101\u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0002\u00102J\u001f\u00103\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u00104\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011J\u001f\u00105\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u00106\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011J\u001f\u00107\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u00108\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011J\u001f\u00109\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010:\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011¨\u0006<"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/scroll/MRNModuleScrollCellItemManager;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/MRNModuleCellItemManager;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/scroll/MRNModuleScrollCellItemWrapperView;", "()V", "createViewInstance", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getExportedCustomDirectEventTypeConstants", "", "", "", "getName", "setAttachTriggerDistance", "", Constants.EventType.VIEW, DMKeys.KEY_SCROLL_ATTACH_TRIGGER_DISTANCE, "", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/scroll/MRNModuleScrollCellItemWrapperView;Ljava/lang/Integer;)V", "setAutoLoopInterval", DMKeys.KEY_AUTO_LOOP_INTERVAL, "setColCount", DMKeys.KEY_COLCOUNT, "setContentMarginInfo", DMKeys.KEY_CONTENT_MARGIN_INFO, "Lcom/facebook/react/bridge/ReadableMap;", "setGalleryGap", DMKeys.KEY_SCROLL_GALLERY_GAP, "setOnAttachTriggered", "onAttachTriggered", "", "setOnMomentumScrollBegin", DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN, "setOnMomentumScrollEnd", DMKeys.KEY_ON_MOMENTUM_SCROLL_END, "setOnPageChanged", "onPageChanged", "setOnScroll", "onScroll", "setOnScrollBeginDrag", DMKeys.KEY_ON_SCROLL_BEGIN_DRAG, "setOnScrollEndDrag", DMKeys.KEY_ON_SCROLL_END_DRAG, "setPageIndex", DMKeys.KEY_PAGE_INDEX, "setRowCount", DMKeys.KEY_ROWCOUNT, "setScrollDirection", DMKeys.KEY_SCROLL_DIRECTION, "setScrollEnabled", "scrollEnabled", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/scroll/MRNModuleScrollCellItemWrapperView;Ljava/lang/Boolean;)V", "setScrollEventThrottled", DMKeys.KEY_THROTTLE, "setScrollStyle", DMKeys.KEY_SCROLL_STYLE, "setXGap", DMKeys.KEY_XGAP, "setYGap", DMKeys.KEY_YGAP, "Companion", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class MRNModuleScrollCellItemManager extends MRNModuleCellItemManager<com.dianping.gcmrnmodule.wrapperviews.items.cellitems.scroll.a> {
    public static final a Companion = new a(null);
    @NotNull
    public static final String REACT_CLASS = "MRNModuleScrollCellItemWrapper";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.cellitems.MRNModuleCellItemManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public final String getName() {
        return REACT_CLASS;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/scroll/MRNModuleScrollCellItemManager$Companion;", "", "()V", "REACT_CLASS", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public final com.dianping.gcmrnmodule.wrapperviews.items.cellitems.scroll.a createViewInstance(@NotNull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a429fad0235ceb17e7a3bd338c5b7b4", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.gcmrnmodule.wrapperviews.items.cellitems.scroll.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a429fad0235ceb17e7a3bd338c5b7b4");
        }
        h.b(aoVar, "context");
        return new com.dianping.gcmrnmodule.wrapperviews.items.cellitems.scroll.a(aoVar);
    }

    @ReactProp(name = DMKeys.KEY_CONTENT_MARGIN_INFO)
    public final void setContentMarginInfo(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.scroll.a aVar, @Nullable ReadableMap readableMap) {
        Object[] objArr = {aVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68a3f6af22662fb855ad272f29da9dc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68a3f6af22662fb855ad272f29da9dc4");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((ScrollCellInfo) aVar.getInfo()).setContentMarginInfo(readableMap != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.g(readableMap) : null);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_SCROLL_STYLE)
    public final void setScrollStyle(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.scroll.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fcd43642741d76d8c0757f3adf26aa03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fcd43642741d76d8c0757f3adf26aa03");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((ScrollCellInfo) aVar.getInfo()).setScrollStyle(num);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_SCROLL_DIRECTION)
    public final void setScrollDirection(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.scroll.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1a1f8c1f8f520bdd0f6fe7ab046e93e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1a1f8c1f8f520bdd0f6fe7ab046e93e");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((ScrollCellInfo) aVar.getInfo()).setScrollDirection(num);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_COLCOUNT)
    public final void setColCount(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.scroll.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0df7f4fdea1cb90c54a567358f65405a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0df7f4fdea1cb90c54a567358f65405a");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((ScrollCellInfo) aVar.getInfo()).setColCount(num);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_ROWCOUNT)
    public final void setRowCount(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.scroll.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24ce02a8edb9fe459141c287de438cc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24ce02a8edb9fe459141c287de438cc5");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((ScrollCellInfo) aVar.getInfo()).setRowCount(num);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_XGAP)
    public final void setXGap(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.scroll.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c250610045d8d64a21b56fc4bb735b3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c250610045d8d64a21b56fc4bb735b3c");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((ScrollCellInfo) aVar.getInfo()).setXGap(num);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_YGAP)
    public final void setYGap(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.scroll.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc51c796658e5e6860c7cd3810f74724", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc51c796658e5e6860c7cd3810f74724");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((ScrollCellInfo) aVar.getInfo()).setYGap(num);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_SCROLL_GALLERY_GAP)
    public final void setGalleryGap(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.scroll.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3681d5fa9919862eea0ca2e14bcb521", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3681d5fa9919862eea0ca2e14bcb521");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((ScrollCellInfo) aVar.getInfo()).setGalleryGap(num);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_AUTO_LOOP_INTERVAL)
    public final void setAutoLoopInterval(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.scroll.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ec76bb30b53f0d11b2a2eddd6fd8d65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ec76bb30b53f0d11b2a2eddd6fd8d65");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((ScrollCellInfo) aVar.getInfo()).setAutoLoopInterval(num);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_SCROLL_ATTACH_TRIGGER_DISTANCE)
    public final void setAttachTriggerDistance(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.scroll.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "566b91901dfb355e04c8799277e9dc6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "566b91901dfb355e04c8799277e9dc6f");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((ScrollCellInfo) aVar.getInfo()).setAttachTriggerDistance(num);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = "onAttachTriggered")
    public final void setOnAttachTriggered(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.scroll.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "286a23b71742e5b8c7ee1d134ba29fad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "286a23b71742e5b8c7ee1d134ba29fad");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        if (z) {
            w wVar = w.a;
            String format = String.format("gdm_attachTriggeredCallBack:%s", Arrays.copyOf(new Object[]{Integer.valueOf(aVar.getId())}, 1));
            h.a((Object) format, "java.lang.String.format(format, *args)");
            ((ScrollCellInfo) aVar.getInfo()).setOnAttachTriggered(format);
        } else {
            ((ScrollCellInfo) aVar.getInfo()).setOnAttachTriggered(null);
        }
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = "onPageChanged")
    public final void setOnPageChanged(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.scroll.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a3d7b81f2ea238431d293e73bdb5f79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a3d7b81f2ea238431d293e73bdb5f79");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        if (z) {
            w wVar = w.a;
            String format = String.format("gdm_pageChangedCallBack:%s", Arrays.copyOf(new Object[]{Integer.valueOf(aVar.getId())}, 1));
            h.a((Object) format, "java.lang.String.format(format, *args)");
            ((ScrollCellInfo) aVar.getInfo()).setOnPageChanged(format);
        } else {
            ((ScrollCellInfo) aVar.getInfo()).setOnPageChanged(null);
        }
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_PAGE_INDEX)
    public final void setPageIndex(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.scroll.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fbefcbebb560612be73f104a15b3c9b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fbefcbebb560612be73f104a15b3c9b8");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((ScrollCellInfo) aVar.getInfo()).setPageIndex(num);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(defaultBoolean = true, name = "scrollEnabled")
    public final void setScrollEnabled(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.scroll.a aVar, @Nullable Boolean bool) {
        Object[] objArr = {aVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60ec58d51dc76b84b574341563ee6f0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60ec58d51dc76b84b574341563ee6f0c");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((ScrollCellInfo) aVar.getInfo()).setScrollEnabled(bool);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_ON_SCROLL_BEGIN_DRAG)
    public final void setOnScrollBeginDrag(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.scroll.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9fe9e747e835ad671c84c7b608e372fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9fe9e747e835ad671c84c7b608e372fd");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        if (z) {
            w wVar = w.a;
            String format = String.format("gdm_onScrollBeginDragCallback:%s", Arrays.copyOf(new Object[]{Integer.valueOf(aVar.getId())}, 1));
            h.a((Object) format, "java.lang.String.format(format, *args)");
            ((ScrollCellInfo) aVar.getInfo()).setOnScrollBeginDrag(format);
        } else {
            ((ScrollCellInfo) aVar.getInfo()).setOnScrollBeginDrag(null);
        }
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_ON_SCROLL_END_DRAG)
    public final void setOnScrollEndDrag(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.scroll.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61b7ffb8a6926209363ce3e0c0f7639a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61b7ffb8a6926209363ce3e0c0f7639a");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        if (z) {
            w wVar = w.a;
            String format = String.format("gdm_onScrollEndDragCallback:%s", Arrays.copyOf(new Object[]{Integer.valueOf(aVar.getId())}, 1));
            h.a((Object) format, "java.lang.String.format(format, *args)");
            ((ScrollCellInfo) aVar.getInfo()).setOnScrollEndDrag(format);
        } else {
            ((ScrollCellInfo) aVar.getInfo()).setOnScrollEndDrag(null);
        }
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = "onScroll")
    public final void setOnScroll(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.scroll.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6bbf218dd19e0dfc0ae17a3d5a3c624c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6bbf218dd19e0dfc0ae17a3d5a3c624c");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        if (z) {
            w wVar = w.a;
            String format = String.format("gdm_onScrollCallback:%s", Arrays.copyOf(new Object[]{Integer.valueOf(aVar.getId())}, 1));
            h.a((Object) format, "java.lang.String.format(format, *args)");
            ((ScrollCellInfo) aVar.getInfo()).setOnScroll(format);
        } else {
            ((ScrollCellInfo) aVar.getInfo()).setOnScroll(null);
        }
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN)
    public final void setOnMomentumScrollBegin(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.scroll.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46fdac1e9ad24617e2132e93a17fe0fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46fdac1e9ad24617e2132e93a17fe0fb");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        if (z) {
            w wVar = w.a;
            String format = String.format("gdm_onMomentumScrollBeginCallback:%s", Arrays.copyOf(new Object[]{Integer.valueOf(aVar.getId())}, 1));
            h.a((Object) format, "java.lang.String.format(format, *args)");
            ((ScrollCellInfo) aVar.getInfo()).setOnMomentumScrollBegin(format);
        } else {
            ((ScrollCellInfo) aVar.getInfo()).setOnMomentumScrollBegin(null);
        }
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_ON_MOMENTUM_SCROLL_END)
    public final void setOnMomentumScrollEnd(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.scroll.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af7cd981ad319553d74740d40b910e21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af7cd981ad319553d74740d40b910e21");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        if (z) {
            w wVar = w.a;
            String format = String.format("gdm_onMomentumScrollEndCallback:%s", Arrays.copyOf(new Object[]{Integer.valueOf(aVar.getId())}, 1));
            h.a((Object) format, "java.lang.String.format(format, *args)");
            ((ScrollCellInfo) aVar.getInfo()).setOnMomentumScrollEnd(format);
        } else {
            ((ScrollCellInfo) aVar.getInfo()).setOnMomentumScrollEnd(null);
        }
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_THROTTLE)
    public final void setScrollEventThrottled(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.scroll.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e81a02f7fe3d0daa990a3bef1530a76c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e81a02f7fe3d0daa990a3bef1530a76c");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((ScrollCellInfo) aVar.getInfo()).setScrollEventThrottle(num);
        b.a().a(aVar.getHostWrapperView());
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.cellitems.MRNModuleCellItemManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public final Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4ea8b4243386df5cb6f347da8bde625", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4ea8b4243386df5cb6f347da8bde625");
        }
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        Map a2 = c.b().a("onAttachTriggered", c.a("registrationName", "onAttachTriggered")).a("onPageChanged", c.a("registrationName", "onPageChanged")).a(DMKeys.KEY_ON_SCROLL_BEGIN_DRAG, c.a("registrationName", DMKeys.KEY_ON_SCROLL_BEGIN_DRAG)).a(DMKeys.KEY_ON_SCROLL_END_DRAG, c.a("registrationName", DMKeys.KEY_ON_SCROLL_END_DRAG)).a("onScroll", c.a("registrationName", "onScroll")).a(DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN, c.a("registrationName", DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN)).a(DMKeys.KEY_ON_MOMENTUM_SCROLL_END, c.a("registrationName", DMKeys.KEY_ON_MOMENTUM_SCROLL_END)).a();
        h.a((Object) a2, "MapBuilder.builder<Strin…\n                .build()");
        Map<String, Object> b = v.b(a2);
        if (exportedCustomDirectEventTypeConstants != null) {
            b.putAll(exportedCustomDirectEventTypeConstants);
        }
        return b;
    }
}
