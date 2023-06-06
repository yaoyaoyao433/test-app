package com.dianping.gcmrnmodule.wrapperviews.items.cellitems.tab;

import com.dianping.gcmrnmodule.b;
import com.dianping.gcmrnmodule.wrapperviews.items.cellitems.MRNModuleCellItemManager;
import com.dianping.shield.dynamic.model.cell.TabCellInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.c;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.v;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@ReactModule(name = MRNModuleTabCellItemManager.REACT_CLASS)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0006\n\u0002\b*\b\u0007\u0018\u0000 _2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001_B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0016\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\u001f\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0002\u0010\u0019J\u001a\u0010\u001a\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0007J\u001a\u0010\u001d\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0007J\u001f\u0010 \u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011J\u001f\u0010\"\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0002\u0010\u0019J\u001f\u0010$\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0002\u0010\u0019J\u0018\u0010&\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0010H\u0007J\u0018\u0010(\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u0010H\u0007J\u0018\u0010*\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u0010H\u0007J\u0018\u0010,\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u0010H\u0007J\u0018\u0010.\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u0010H\u0007J\u0018\u00100\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u0010H\u0007J\u0018\u00102\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u0010H\u0007J\u0018\u00104\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u00105\u001a\u000206H\u0007J\u001f\u00107\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u00108\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0002\u0010\u0019J\u001f\u00109\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010:\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0002\u0010\u0019J\u001f\u0010;\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010<\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0002\u0010\u0019J\u001f\u0010=\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010>\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0002\u0010\u0019J\u001f\u0010?\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010@\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011J\u001f\u0010A\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010B\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011J\u001f\u0010C\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010D\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011J\u001f\u0010E\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010F\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0002\u0010\u0019J\u001a\u0010G\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010H\u001a\u0004\u0018\u00010\u001fH\u0007J\u001f\u0010I\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010J\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0002\u0010\u0019J\u001f\u0010K\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010L\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011J\u001f\u0010M\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010N\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011J\u001f\u0010O\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010P\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0002\u0010\u0019J\u001f\u0010Q\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010R\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0002\u0010\u0019J\u001f\u0010S\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010T\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0002\u0010\u0019J\u001f\u0010U\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010V\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0002\u0010\u0019J\u001f\u0010W\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010X\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0002\u0010\u0019J\u001f\u0010Y\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010Z\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0002\u0010\u0019J\u001f\u0010[\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\\\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0002\u0010\u0019J\u001f\u0010]\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010^\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011¨\u0006`"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/tab/MRNModuleTabCellItemManager;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/MRNModuleCellItemManager;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/tab/MRNModuleTabCellItemWrapperView;", "()V", "createViewInstance", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getExportedCustomDirectEventTypeConstants", "", "", "", "getName", "setAlwaysHover", "", Constants.EventType.VIEW, DMKeys.KEY_HOVER_ALWAYS, "", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/tab/MRNModuleTabCellItemWrapperView;Ljava/lang/Boolean;)V", "setAutoOffset", DMKeys.KEY_HOVER_AUTO_OFFSET, "setAutoStopHover", DMKeys.KEY_HOVER_AUTO_STOP_HOVER, "setAutoStopHoverType", DMKeys.KEY_HOVER_AUTO_STOP_HOVER_TYPE, "", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/tab/MRNModuleTabCellItemWrapperView;Ljava/lang/Integer;)V", "setButtonTitles", DMKeys.KEY_TAB_BUTTON_TITLES, "Lcom/facebook/react/bridge/ReadableArray;", "setContentMarginInfo", DMKeys.KEY_CONTENT_MARGIN_INFO, "Lcom/facebook/react/bridge/ReadableMap;", "setEnableHover", DMKeys.KEY_TAB_ENABLE_HOVER, "setHoverOffset", DMKeys.KEY_HOVER_OFFSET, "setInitialSelectedIndex", DMKeys.KEY_TAB_INITIAL_SELECTED_INDEX, "setOnHoverStatusChanged", "onHoverStatusChanged", "setOnMomentumScrollBegin", DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN, "setOnMomentumScrollEnd", DMKeys.KEY_ON_MOMENTUM_SCROLL_END, "setOnScroll", "onScroll", "setOnScrollBeginDrag", DMKeys.KEY_ON_SCROLL_BEGIN_DRAG, "setOnScrollEndDrag", DMKeys.KEY_ON_SCROLL_END_DRAG, "setOnSelect", "onSelect", "setRatioForSlideBarWidth", DMKeys.KEY_TAB_RATIO_FOR_SLIDE_BAR_WIDTH, "", "setScrollEventThrottled", DMKeys.KEY_THROTTLE, "setSelectIndex", DMKeys.KEY_TAB_SELECT_INDEX, "setSelectedTextSize", "selectTextSize", "setSelectedTitleColor", DMKeys.KEY_TAB_SELECTED_TITLE_COLOR, "setShowBottomLine", DMKeys.KEY_HOVER_SHOW_BOTTOM_LINE, "setShowShadow", DMKeys.KEY_HOVER_SHOW_SHADOW, "setShowTopLine", DMKeys.KEY_HOVER_SHOW_TOP_LINE, "setSlideBarColor", DMKeys.KEY_TAB_SLIDEBAR_COLOR, "setSlideBarGradientColor", DMKeys.KEY_SLIDE_BAR_GRADIENT_COLOR, "setSlideBarHeight", DMKeys.KEY_TAB_SLIDEBAR_HEIGHT, "setSlideBarIsAbove", "slideBarIsAbove", "setSlideBarIsRounded", DMKeys.KEY_TAB_SLIDE_BAR_IS_ROUNDED, "setSlideBarWidth", DMKeys.KEY_TAB_SLIDEBAR_WIDTH, "setTabHeight", DMKeys.KEY_TAB_HEIGHT, "setTabWidth", DMKeys.KEY_TAB_WIDTH, "setTextSize", DMKeys.KEY_TAB_TEXT_SIZE, "setTitleColor", "titleColor", "setXGap", DMKeys.KEY_XGAP, "setZPosition", DMKeys.KEY_HOVER_Z_POSITION, "setslideBarWrapTitle", DMKeys.KEY_TAB_SLIDE_BAR_WRAP, "Companion", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class MRNModuleTabCellItemManager extends MRNModuleCellItemManager<com.dianping.gcmrnmodule.wrapperviews.items.cellitems.tab.a> {
    public static final a Companion = new a(null);
    @NotNull
    public static final String REACT_CLASS = "MRNModuleTabCellItemWrapper";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.cellitems.MRNModuleCellItemManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public final String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public final com.dianping.gcmrnmodule.wrapperviews.items.cellitems.tab.a createViewInstance(@NotNull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4044aefc30f150e1eeddb32df9ea1750", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.gcmrnmodule.wrapperviews.items.cellitems.tab.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4044aefc30f150e1eeddb32df9ea1750");
        }
        h.b(aoVar, "context");
        return new com.dianping.gcmrnmodule.wrapperviews.items.cellitems.tab.a(aoVar);
    }

    @ReactProp(name = DMKeys.KEY_CONTENT_MARGIN_INFO)
    public final void setContentMarginInfo(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.tab.a aVar, @Nullable ReadableMap readableMap) {
        Object[] objArr = {aVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8c0d81de2830632c4a2fdd5dfcbf0dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8c0d81de2830632c4a2fdd5dfcbf0dc");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((TabCellInfo) aVar.getInfo()).setContentMarginInfo(readableMap != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.g(readableMap) : null);
        b.a().a(aVar.getHostWrapperView());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ReactProp(name = DMKeys.KEY_TAB_BUTTON_TITLES)
    public final void setButtonTitles(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.tab.a aVar, @Nullable ReadableArray readableArray) {
        Object[] objArr = {aVar, readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2856c85483035a8ed6e6f9445268ef7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2856c85483035a8ed6e6f9445268ef7b");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        TabCellInfo tabCellInfo = (TabCellInfo) aVar.getInfo();
        ArrayList<Object> arrayList = readableArray != null ? readableArray.toArrayList() : null;
        if (!(arrayList instanceof ArrayList)) {
            arrayList = null;
        }
        tabCellInfo.setButtonTitles(arrayList);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_TAB_INITIAL_SELECTED_INDEX)
    public final void setInitialSelectedIndex(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.tab.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b00a064fc528083925329196fbb6c65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b00a064fc528083925329196fbb6c65");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((TabCellInfo) aVar.getInfo()).setInitialSelectedIndex(num);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_TAB_ENABLE_HOVER)
    public final void setEnableHover(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.tab.a aVar, @Nullable Boolean bool) {
        Object[] objArr = {aVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5db0951951dc334fa8c0757812f7f648", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5db0951951dc334fa8c0757812f7f648");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((TabCellInfo) aVar.getInfo()).setEnableHover(bool);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_HOVER_ALWAYS)
    public final void setAlwaysHover(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.tab.a aVar, @Nullable Boolean bool) {
        Object[] objArr = {aVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a529112ca1cd8c5968b1a130bfb1b76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a529112ca1cd8c5968b1a130bfb1b76");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((TabCellInfo) aVar.getInfo()).setAlwaysHover(bool);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_HOVER_OFFSET)
    public final void setHoverOffset(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.tab.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2022dfe240ae3d55ca93e280e4d8bd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2022dfe240ae3d55ca93e280e4d8bd0");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((TabCellInfo) aVar.getInfo()).setHoverOffset(num != null ? Float.valueOf(num.intValue()) : null);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_HOVER_AUTO_OFFSET)
    public final void setAutoOffset(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.tab.a aVar, @Nullable Boolean bool) {
        Object[] objArr = {aVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee721f30f84a8aa65eb7348657913b66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee721f30f84a8aa65eb7348657913b66");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((TabCellInfo) aVar.getInfo()).setAutoOffset(bool);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_HOVER_SHOW_TOP_LINE)
    public final void setShowTopLine(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.tab.a aVar, @Nullable Boolean bool) {
        Object[] objArr = {aVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b42dd4da8e2da78f16fa941f6588905", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b42dd4da8e2da78f16fa941f6588905");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((TabCellInfo) aVar.getInfo()).setShowTopLine(bool);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_HOVER_SHOW_BOTTOM_LINE)
    public final void setShowBottomLine(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.tab.a aVar, @Nullable Boolean bool) {
        Object[] objArr = {aVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14ce4d6592f36b6b2c55b1312c4c29e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14ce4d6592f36b6b2c55b1312c4c29e2");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((TabCellInfo) aVar.getInfo()).setShowBottomLine(bool);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_HOVER_SHOW_SHADOW)
    public final void setShowShadow(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.tab.a aVar, @Nullable Boolean bool) {
        Object[] objArr = {aVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ceede2e281e93d208ec23145a748545", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ceede2e281e93d208ec23145a748545");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((TabCellInfo) aVar.getInfo()).setShowShadow(bool);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_HOVER_Z_POSITION)
    public final void setZPosition(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.tab.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a5a1b9f4db89469d6c8a339f248ae92f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a5a1b9f4db89469d6c8a339f248ae92f");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((TabCellInfo) aVar.getInfo()).setZPosition(num);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_HOVER_AUTO_STOP_HOVER)
    public final void setAutoStopHover(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.tab.a aVar, @Nullable Boolean bool) {
        Object[] objArr = {aVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d54fc8b7be0323e4a5edb7ab0937b55a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d54fc8b7be0323e4a5edb7ab0937b55a");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((TabCellInfo) aVar.getInfo()).setAutoStopHover(bool);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_HOVER_AUTO_STOP_HOVER_TYPE)
    public final void setAutoStopHoverType(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.tab.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "82ea7ef262965243f01a8f1f383b2383", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "82ea7ef262965243f01a8f1f383b2383");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((TabCellInfo) aVar.getInfo()).setAutoStopHoverType(num);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_TAB_TEXT_SIZE)
    public final void setTextSize(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.tab.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe1488ba4efe2bbc2a8b8fab6e485137", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe1488ba4efe2bbc2a8b8fab6e485137");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((TabCellInfo) aVar.getInfo()).setTextSize(num);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = "titleColor")
    public final void setTitleColor(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.tab.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a157ee561473050d8ad6145b7cf1921d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a157ee561473050d8ad6145b7cf1921d");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((TabCellInfo) aVar.getInfo()).setTitleColor(num != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.a(num.intValue()) : null);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_TAB_SELECTED_TITLE_COLOR)
    public final void setSelectedTitleColor(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.tab.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1cf4c304047d9fd83af14760f3546ca7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1cf4c304047d9fd83af14760f3546ca7");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((TabCellInfo) aVar.getInfo()).setSelectedTitleColor(num != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.a(num.intValue()) : null);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_TAB_WIDTH)
    public final void setTabWidth(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.tab.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eea263889315034b0f130fc8d91ce109", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eea263889315034b0f130fc8d91ce109");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((TabCellInfo) aVar.getInfo()).setTabWidth(num);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_TAB_HEIGHT)
    public final void setTabHeight(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.tab.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a1eb504cb27279d05f601bf35958fe2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a1eb504cb27279d05f601bf35958fe2");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((TabCellInfo) aVar.getInfo()).setTabHeight(num);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_XGAP)
    public final void setXGap(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.tab.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9fd903b90f1b2b0879bffeeff715437c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9fd903b90f1b2b0879bffeeff715437c");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((TabCellInfo) aVar.getInfo()).setXGap(num);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_TAB_SLIDEBAR_COLOR)
    public final void setSlideBarColor(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.tab.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3cbbe0fc4129d638da7813f2bf5f3fb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3cbbe0fc4129d638da7813f2bf5f3fb3");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((TabCellInfo) aVar.getInfo()).setSlideBarColor(num != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.a(num.intValue()) : null);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_SLIDE_BAR_GRADIENT_COLOR)
    public final void setSlideBarGradientColor(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.tab.a aVar, @Nullable ReadableMap readableMap) {
        Object[] objArr = {aVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "727e408dae8e5adef4803751997b8fac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "727e408dae8e5adef4803751997b8fac");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((TabCellInfo) aVar.getInfo()).setSlideBarGradientColor(readableMap != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.k(readableMap) : null);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_TAB_SLIDEBAR_WIDTH)
    public final void setSlideBarWidth(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.tab.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ae2985e037f3d8a1f53457332d39405", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ae2985e037f3d8a1f53457332d39405");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((TabCellInfo) aVar.getInfo()).setSlideBarWidth(num);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_TAB_SLIDEBAR_HEIGHT)
    public final void setSlideBarHeight(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.tab.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63010bf20764b2a28ba39b4c6ccc9938", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63010bf20764b2a28ba39b4c6ccc9938");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((TabCellInfo) aVar.getInfo()).setSlideBarHeight(num);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = "slideBarIsAbove")
    public final void setSlideBarIsAbove(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.tab.a aVar, @Nullable Boolean bool) {
        Object[] objArr = {aVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a882f8642e14e3364eebb18e8ab72016", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a882f8642e14e3364eebb18e8ab72016");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((TabCellInfo) aVar.getInfo()).setSlideBarIsAbove(bool);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_TAB_SLIDE_BAR_IS_ROUNDED)
    public final void setSlideBarIsRounded(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.tab.a aVar, @Nullable Boolean bool) {
        Object[] objArr = {aVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7185792115db39142d3b690b0da66e5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7185792115db39142d3b690b0da66e5f");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((TabCellInfo) aVar.getInfo()).setSlideBarIsRounded(bool);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_TAB_SLIDE_BAR_WRAP)
    public final void setslideBarWrapTitle(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.tab.a aVar, @Nullable Boolean bool) {
        Object[] objArr = {aVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc42d66160a035df18fe72b415422ed4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc42d66160a035df18fe72b415422ed4");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((TabCellInfo) aVar.getInfo()).setSlideBarWrapTitle(bool);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_TAB_RATIO_FOR_SLIDE_BAR_WIDTH)
    public final void setRatioForSlideBarWidth(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.tab.a aVar, double d) {
        Object[] objArr = {aVar, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ec8f657d371b6a12710d80f8e3a0e31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ec8f657d371b6a12710d80f8e3a0e31");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((TabCellInfo) aVar.getInfo()).setRatioForSlideBarWidth(Double.valueOf(d));
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_TAB_SELECT_INDEX)
    public final void setSelectIndex(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.tab.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7cf95bd3b3f2b7b02bc109163524437a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7cf95bd3b3f2b7b02bc109163524437a");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((TabCellInfo) aVar.getInfo()).setSelectIndex(num);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_TAB_SELECTED_TEXT_SIZE)
    public final void setSelectedTextSize(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.tab.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3cf8e8d292712aa4a682812d0211cb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3cf8e8d292712aa4a682812d0211cb2");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((TabCellInfo) aVar.getInfo()).setSelectedTextSize(num);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = "onSelect")
    public final void setOnSelect(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.tab.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77d1a00718d529746113ddccec502921", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77d1a00718d529746113ddccec502921");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        if (z) {
            ((TabCellInfo) aVar.getInfo()).setOnSelect("gdm_didSelectCallback:" + aVar.getId());
        } else {
            ((TabCellInfo) aVar.getInfo()).setOnSelect(null);
        }
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = "onHoverStatusChanged")
    public final void setOnHoverStatusChanged(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.tab.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b29f22ac06026fd246bc426174c77398", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b29f22ac06026fd246bc426174c77398");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        if (z) {
            ((TabCellInfo) aVar.getInfo()).setOnHoverStatusChanged("gdm_hoverStatusChangedCallBack:" + aVar.getId());
        } else {
            ((TabCellInfo) aVar.getInfo()).setOnHoverStatusChanged(null);
        }
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_ON_SCROLL_BEGIN_DRAG)
    public final void setOnScrollBeginDrag(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.tab.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "656c99c4d906cbf7134cd76a516b5cf8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "656c99c4d906cbf7134cd76a516b5cf8");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        if (z) {
            ((TabCellInfo) aVar.getInfo()).setOnScrollBeginDrag("gdm_onScrollBeginDragCallback:" + aVar.getId());
        } else {
            ((TabCellInfo) aVar.getInfo()).setOnScrollBeginDrag(null);
        }
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_ON_SCROLL_END_DRAG)
    public final void setOnScrollEndDrag(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.tab.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b1aef56645637bc9e4c92322cfddaa8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b1aef56645637bc9e4c92322cfddaa8");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        if (z) {
            ((TabCellInfo) aVar.getInfo()).setOnScrollEndDrag("gdm_onScrollEndDragCallback:" + aVar.getId());
        } else {
            ((TabCellInfo) aVar.getInfo()).setOnScrollEndDrag(null);
        }
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = "onScroll")
    public final void setOnScroll(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.tab.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51a79afe34ad485328bec25b33eefd52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51a79afe34ad485328bec25b33eefd52");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        if (z) {
            ((TabCellInfo) aVar.getInfo()).setOnScroll("gdm_onScrollCallback:" + aVar.getId());
        } else {
            ((TabCellInfo) aVar.getInfo()).setOnScroll(null);
        }
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN)
    public final void setOnMomentumScrollBegin(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.tab.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "150cf18193ceaad6058781864c19494a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "150cf18193ceaad6058781864c19494a");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        if (z) {
            ((TabCellInfo) aVar.getInfo()).setOnMomentumScrollBegin("gdm_onMomentumScrollBeginCallback:" + aVar.getId());
        } else {
            ((TabCellInfo) aVar.getInfo()).setOnMomentumScrollBegin(null);
        }
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_ON_MOMENTUM_SCROLL_END)
    public final void setOnMomentumScrollEnd(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.tab.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d71af3e164151a4bd62d127f8d4d5637", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d71af3e164151a4bd62d127f8d4d5637");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        if (z) {
            ((TabCellInfo) aVar.getInfo()).setOnMomentumScrollEnd("gdm_onMomentumScrollEndCallback:" + aVar.getId());
        } else {
            ((TabCellInfo) aVar.getInfo()).setOnMomentumScrollEnd(null);
        }
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_THROTTLE)
    public final void setScrollEventThrottled(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.tab.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "422b5474189f433f75a61358f416fa76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "422b5474189f433f75a61358f416fa76");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((TabCellInfo) aVar.getInfo()).setScrollEventThrottle(num);
        b.a().a(aVar.getHostWrapperView());
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.cellitems.MRNModuleCellItemManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public final Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31d94313041846b1ac22ba85b03685c1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31d94313041846b1ac22ba85b03685c1");
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
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/tab/MRNModuleTabCellItemManager$Companion;", "", "()V", "REACT_CLASS", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }
}
