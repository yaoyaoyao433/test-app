package com.dianping.gcmrnmodule.wrapperviews.items.modules;

import com.dianping.gcmrnmodule.wrapperviews.base.MRNModuleBaseViewGroupManager;
import com.dianping.gcmrnmodule.wrapperviews.items.modules.a;
import com.dianping.shield.dynamic.model.module.BaseTabModuleInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.v;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0006\n\u0002\b-\b&\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016J#\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0002\u0010\u000eJ#\u0010\u000f\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0002\u0010\u000eJ#\u0010\u0011\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0002\u0010\u000eJ#\u0010\u0013\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0002\u0010\u000eJ#\u0010\u0015\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010\u0018J#\u0010\u0019\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010\u0018J\u001e\u0010\u001b\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0007J\u001e\u0010\u001e\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001dH\u0007J#\u0010 \u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010\u0018J\u001e\u0010\"\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010#\u001a\u0004\u0018\u00010\u001dH\u0007J#\u0010$\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010\u0018J\u001c\u0010&\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010'\u001a\u00020\rH\u0007J\u001c\u0010(\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010)\u001a\u00020\rH\u0007J\u001c\u0010*\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010+\u001a\u00020\rH\u0007J\u001c\u0010,\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010-\u001a\u00020\rH\u0007J\u001c\u0010.\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010/\u001a\u00020\rH\u0007J\u001c\u00100\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u00101\u001a\u00020\rH\u0007J\u001c\u00102\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u00103\u001a\u00020\rH\u0007J\u001c\u00104\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u00105\u001a\u000206H\u0007J#\u00107\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u00108\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010\u0018J#\u00109\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010:\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010\u0018J#\u0010;\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010<\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010\u0018J#\u0010=\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010>\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010\u0018J#\u0010?\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010@\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0002\u0010\u000eJ#\u0010A\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010B\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0002\u0010\u000eJ#\u0010C\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010D\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0002\u0010\u000eJ#\u0010E\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010F\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010\u0018J\u001e\u0010G\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010H\u001a\u0004\u0018\u00010\u001dH\u0007J#\u0010I\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010J\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010\u0018J#\u0010K\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010L\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0002\u0010\u000eJ#\u0010M\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010N\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0002\u0010\u000eJ#\u0010O\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010P\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010\u0018J#\u0010Q\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010R\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010\u0018J#\u0010S\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010T\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010\u0018J#\u0010U\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010V\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010\u0018J#\u0010W\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010X\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010\u0018J#\u0010Y\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010Z\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010\u0018J\u001e\u0010[\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\\\u001a\u0004\u0018\u00010\u001dH\u0007J#\u0010]\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010^\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010\u0018J#\u0010_\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010`\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010\u0018J#\u0010a\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010b\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0002\u0010\u000e¨\u0006c"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNBaseTabModuleItemWrapperManager;", "T", "Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNBaseTabModuleItemWrapperView;", "Lcom/dianping/gcmrnmodule/wrapperviews/base/MRNModuleBaseViewGroupManager;", "()V", "getExportedCustomDirectEventTypeConstants", "", "", "", "setAlwaysHover", "", Constants.EventType.VIEW, DMKeys.KEY_HOVER_ALWAYS, "", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNBaseTabModuleItemWrapperView;Ljava/lang/Boolean;)V", "setAutoMargin", DMKeys.KEY_AUTO_MARGIN, "setAutoOffset", DMKeys.KEY_HOVER_AUTO_OFFSET, "setAutoStopHover", DMKeys.KEY_HOVER_AUTO_STOP_HOVER, "setAutoStopHoverType", DMKeys.KEY_HOVER_AUTO_STOP_HOVER_TYPE, "", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNBaseTabModuleItemWrapperView;Ljava/lang/Integer;)V", "setCellBackgroundColor", "backgroundColor", "setClickMgeInfo", DMKeys.KEY_CLICK_MGE_INFO, "Lcom/facebook/react/bridge/ReadableMap;", "setGradientBackgroundColor", DMKeys.KEY_GRADIENT_BACKGROUND_COLOR, "setHoverOffset", DMKeys.KEY_HOVER_OFFSET, "setMarginInfo", DMKeys.KEY_MARGIN_INFO, "setMinShowTabCount", DMKeys.KEY_TAB_MIN_SHOW_TAB_COUNT, "setOnHoverStatusChanged", "onHoverStatusChanged", "setOnMomentumScrollBegin", DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN, "setOnMomentumScrollEnd", DMKeys.KEY_ON_MOMENTUM_SCROLL_END, "setOnScroll", "onScroll", "setOnScrollBeginDrag", DMKeys.KEY_ON_SCROLL_BEGIN_DRAG, "setOnScrollEndDrag", DMKeys.KEY_ON_SCROLL_END_DRAG, "setOnSelect", "onSelect", "setRatioForSlideBarWidth", DMKeys.KEY_TAB_RATIO_FOR_SLIDE_BAR_WIDTH, "", "setScrollEventThrottled", DMKeys.KEY_THROTTLE, "setSelectIndex", DMKeys.KEY_TAB_SELECT_INDEX, "setSelectedTextSize", "selectTextSize", "setSelectedTitleColor", DMKeys.KEY_TAB_SELECTED_TITLE_COLOR, "setShowBottomLine", DMKeys.KEY_HOVER_SHOW_BOTTOM_LINE, "setShowShadow", DMKeys.KEY_HOVER_SHOW_SHADOW, "setShowTopLine", DMKeys.KEY_HOVER_SHOW_TOP_LINE, "setSlideBarColor", DMKeys.KEY_TAB_SLIDEBAR_COLOR, "setSlideBarGradientColor", DMKeys.KEY_SLIDE_BAR_GRADIENT_COLOR, "setSlideBarHeight", DMKeys.KEY_TAB_SLIDEBAR_HEIGHT, "setSlideBarIsAbove", "slideBarIsAbove", "setSlideBarIsRounded", DMKeys.KEY_TAB_SLIDE_BAR_IS_ROUNDED, "setSlideBarOffset", "slideBarOffset", "setSlideBarWidth", DMKeys.KEY_TAB_SLIDEBAR_WIDTH, "setTabHeight", DMKeys.KEY_TAB_HEIGHT, "setTabWidth", DMKeys.KEY_TAB_WIDTH, "setTextSize", DMKeys.KEY_TAB_TEXT_SIZE, "setTitleColor", "titleColor", "setViewMgeInfo", DMKeys.KEY_VIEW_MGE_INFO, "setXGap", DMKeys.KEY_XGAP, "setZPosition", DMKeys.KEY_HOVER_Z_POSITION, "setslideBarWrapTitle", DMKeys.KEY_TAB_SLIDE_BAR_WRAP, "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public abstract class MRNBaseTabModuleItemWrapperManager<T extends a<?>> extends MRNModuleBaseViewGroupManager<T> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @ReactProp(name = DMKeys.KEY_TAB_MIN_SHOW_TAB_COUNT)
    public final void setMinShowTabCount(@NotNull a<?> aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c5f9fcbf75e2e6397d1bfd5044c2d4f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c5f9fcbf75e2e6397d1bfd5044c2d4f8");
            return;
        }
        kotlin.jvm.internal.h.b(aVar, Constants.EventType.VIEW);
        ((BaseTabModuleInfo) aVar.getInfo()).setMinShowTabCount(num);
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = "backgroundColor")
    public final void setCellBackgroundColor(@NotNull a<?> aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22d5b7bc05fa5812d3acfceee76caeff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22d5b7bc05fa5812d3acfceee76caeff");
            return;
        }
        kotlin.jvm.internal.h.b(aVar, Constants.EventType.VIEW);
        ((BaseTabModuleInfo) aVar.getInfo()).setBackgroundColor(num != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.a(num.intValue()) : null);
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_GRADIENT_BACKGROUND_COLOR)
    public final void setGradientBackgroundColor(@NotNull a<?> aVar, @Nullable ReadableMap readableMap) {
        Object[] objArr = {aVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a30252bd1dc6b9ad175ba94aa058627", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a30252bd1dc6b9ad175ba94aa058627");
            return;
        }
        kotlin.jvm.internal.h.b(aVar, Constants.EventType.VIEW);
        ((BaseTabModuleInfo) aVar.getInfo()).setGradientBackgroundColor(readableMap != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.k(readableMap) : null);
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_AUTO_MARGIN)
    public final void setAutoMargin(@NotNull a<?> aVar, @Nullable Boolean bool) {
        Object[] objArr = {aVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e4342f78b3f200ec1707d5a6c5e55d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e4342f78b3f200ec1707d5a6c5e55d0");
            return;
        }
        kotlin.jvm.internal.h.b(aVar, Constants.EventType.VIEW);
        ((BaseTabModuleInfo) aVar.getInfo()).setAutoMargin(bool);
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_MARGIN_INFO)
    public final void setMarginInfo(@NotNull a<?> aVar, @Nullable ReadableMap readableMap) {
        Object[] objArr = {aVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09e0fb2e1308a5ffd190f23876b40981", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09e0fb2e1308a5ffd190f23876b40981");
            return;
        }
        kotlin.jvm.internal.h.b(aVar, Constants.EventType.VIEW);
        ((BaseTabModuleInfo) aVar.getInfo()).setMarginInfo(readableMap != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.g(readableMap) : null);
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_CLICK_MGE_INFO)
    public final void setClickMgeInfo(@NotNull a<?> aVar, @Nullable ReadableMap readableMap) {
        Object[] objArr = {aVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd377c05546ea0b8c73194b1a25c8aac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd377c05546ea0b8c73194b1a25c8aac");
            return;
        }
        kotlin.jvm.internal.h.b(aVar, Constants.EventType.VIEW);
        ((BaseTabModuleInfo) aVar.getInfo()).setClickMgeInfo(readableMap != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.f(readableMap) : null);
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_VIEW_MGE_INFO)
    public final void setViewMgeInfo(@NotNull a<?> aVar, @Nullable ReadableMap readableMap) {
        Object[] objArr = {aVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7877b2f51c35175a5ae5aa36953bf851", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7877b2f51c35175a5ae5aa36953bf851");
            return;
        }
        kotlin.jvm.internal.h.b(aVar, Constants.EventType.VIEW);
        ((BaseTabModuleInfo) aVar.getInfo()).setViewMgeInfo(readableMap != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.f(readableMap) : null);
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_HOVER_ALWAYS)
    public final void setAlwaysHover(@NotNull a<?> aVar, @Nullable Boolean bool) {
        Object[] objArr = {aVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f299cab6e3fe6e8339afe6ed9f5c13b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f299cab6e3fe6e8339afe6ed9f5c13b9");
            return;
        }
        kotlin.jvm.internal.h.b(aVar, Constants.EventType.VIEW);
        ((BaseTabModuleInfo) aVar.getInfo()).setAlwaysHover(bool);
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_HOVER_OFFSET)
    public final void setHoverOffset(@NotNull a<?> aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c734d84d2ef9181476ff44a46736f174", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c734d84d2ef9181476ff44a46736f174");
            return;
        }
        kotlin.jvm.internal.h.b(aVar, Constants.EventType.VIEW);
        ((BaseTabModuleInfo) aVar.getInfo()).setHoverOffset(num != null ? Float.valueOf(num.intValue()) : null);
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_HOVER_AUTO_OFFSET)
    public final void setAutoOffset(@NotNull a<?> aVar, @Nullable Boolean bool) {
        Object[] objArr = {aVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "734fc3de6953c409e37cbf7060d5320f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "734fc3de6953c409e37cbf7060d5320f");
            return;
        }
        kotlin.jvm.internal.h.b(aVar, Constants.EventType.VIEW);
        ((BaseTabModuleInfo) aVar.getInfo()).setAutoOffset(bool);
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_HOVER_SHOW_TOP_LINE)
    public final void setShowTopLine(@NotNull a<?> aVar, @Nullable Boolean bool) {
        Object[] objArr = {aVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "86009858ed787e0a708e8f0b51337dfb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "86009858ed787e0a708e8f0b51337dfb");
            return;
        }
        kotlin.jvm.internal.h.b(aVar, Constants.EventType.VIEW);
        ((BaseTabModuleInfo) aVar.getInfo()).setShowTopLine(bool);
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_HOVER_SHOW_BOTTOM_LINE)
    public final void setShowBottomLine(@NotNull a<?> aVar, @Nullable Boolean bool) {
        Object[] objArr = {aVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7225b2e71efa020abe6099774a682107", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7225b2e71efa020abe6099774a682107");
            return;
        }
        kotlin.jvm.internal.h.b(aVar, Constants.EventType.VIEW);
        ((BaseTabModuleInfo) aVar.getInfo()).setShowBottomLine(bool);
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_HOVER_SHOW_SHADOW)
    public final void setShowShadow(@NotNull a<?> aVar, @Nullable Boolean bool) {
        Object[] objArr = {aVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "596ae5634ddccf28269da2b8494ba183", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "596ae5634ddccf28269da2b8494ba183");
            return;
        }
        kotlin.jvm.internal.h.b(aVar, Constants.EventType.VIEW);
        ((BaseTabModuleInfo) aVar.getInfo()).setShowShadow(bool);
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_HOVER_Z_POSITION)
    public final void setZPosition(@NotNull a<?> aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aeab064882f59feda520bf914cd0b7fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aeab064882f59feda520bf914cd0b7fc");
            return;
        }
        kotlin.jvm.internal.h.b(aVar, Constants.EventType.VIEW);
        ((BaseTabModuleInfo) aVar.getInfo()).setZPosition(num);
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_HOVER_AUTO_STOP_HOVER)
    public final void setAutoStopHover(@NotNull a<?> aVar, @Nullable Boolean bool) {
        Object[] objArr = {aVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a160b03f6a9e2190dbcb88108d595e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a160b03f6a9e2190dbcb88108d595e9");
            return;
        }
        kotlin.jvm.internal.h.b(aVar, Constants.EventType.VIEW);
        ((BaseTabModuleInfo) aVar.getInfo()).setAutoStopHover(bool);
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_HOVER_AUTO_STOP_HOVER_TYPE)
    public final void setAutoStopHoverType(@NotNull a<?> aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1573f0ae0ffd3d6dd6d4c33e3d86e126", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1573f0ae0ffd3d6dd6d4c33e3d86e126");
            return;
        }
        kotlin.jvm.internal.h.b(aVar, Constants.EventType.VIEW);
        ((BaseTabModuleInfo) aVar.getInfo()).setAutoStopHoverType(num);
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = "onHoverStatusChanged")
    public final void setOnHoverStatusChanged(@NotNull a<?> aVar, boolean z) {
        String str;
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e66427a59825c0cd3393d4683cf77b54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e66427a59825c0cd3393d4683cf77b54");
            return;
        }
        kotlin.jvm.internal.h.b(aVar, Constants.EventType.VIEW);
        BaseTabModuleInfo baseTabModuleInfo = (BaseTabModuleInfo) aVar.getInfo();
        if (z) {
            w wVar = w.a;
            str = String.format("gdm_hoverStatusChangedCallBack:%s", Arrays.copyOf(new Object[]{Integer.valueOf(aVar.getId())}, 1));
            kotlin.jvm.internal.h.a((Object) str, "java.lang.String.format(format, *args)");
        } else {
            str = null;
        }
        baseTabModuleInfo.setOnHoverStatusChanged(str);
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_TAB_TEXT_SIZE)
    public final void setTextSize(@NotNull a<?> aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8c6b9c0493a42273e99909b7a547806", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8c6b9c0493a42273e99909b7a547806");
            return;
        }
        kotlin.jvm.internal.h.b(aVar, Constants.EventType.VIEW);
        ((BaseTabModuleInfo) aVar.getInfo()).setTextSize(num);
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = "titleColor")
    public final void setTitleColor(@NotNull a<?> aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2fdcb260cf0a77d60eeee8824e02cc41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2fdcb260cf0a77d60eeee8824e02cc41");
            return;
        }
        kotlin.jvm.internal.h.b(aVar, Constants.EventType.VIEW);
        ((BaseTabModuleInfo) aVar.getInfo()).setTitleColor(num != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.a(num.intValue()) : null);
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_TAB_SELECTED_TITLE_COLOR)
    public final void setSelectedTitleColor(@NotNull a<?> aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bbeaa3ce0998550e798501dc01eb4ae3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bbeaa3ce0998550e798501dc01eb4ae3");
            return;
        }
        kotlin.jvm.internal.h.b(aVar, Constants.EventType.VIEW);
        ((BaseTabModuleInfo) aVar.getInfo()).setSelectedTitleColor(num != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.a(num.intValue()) : null);
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_TAB_WIDTH)
    public final void setTabWidth(@NotNull a<?> aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88fe9716ee4fae8258b65f06b0439b14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88fe9716ee4fae8258b65f06b0439b14");
            return;
        }
        kotlin.jvm.internal.h.b(aVar, Constants.EventType.VIEW);
        ((BaseTabModuleInfo) aVar.getInfo()).setTabWidth(num);
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_TAB_HEIGHT)
    public final void setTabHeight(@NotNull a<?> aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d40eb7804160191dbe94c755f79467cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d40eb7804160191dbe94c755f79467cf");
            return;
        }
        kotlin.jvm.internal.h.b(aVar, Constants.EventType.VIEW);
        ((BaseTabModuleInfo) aVar.getInfo()).setTabHeight(num);
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_XGAP)
    public final void setXGap(@NotNull a<?> aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4bb42e5d22765b3f91d5901b04a7d238", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4bb42e5d22765b3f91d5901b04a7d238");
            return;
        }
        kotlin.jvm.internal.h.b(aVar, Constants.EventType.VIEW);
        ((BaseTabModuleInfo) aVar.getInfo()).setXGap(num);
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_TAB_SLIDEBAR_COLOR)
    public final void setSlideBarColor(@NotNull a<?> aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e04a5f75b3741ea4ec9eb904dd0e093", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e04a5f75b3741ea4ec9eb904dd0e093");
            return;
        }
        kotlin.jvm.internal.h.b(aVar, Constants.EventType.VIEW);
        ((BaseTabModuleInfo) aVar.getInfo()).setSlideBarColor(num != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.a(num.intValue()) : null);
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_SLIDE_BAR_GRADIENT_COLOR)
    public final void setSlideBarGradientColor(@NotNull a<?> aVar, @Nullable ReadableMap readableMap) {
        Object[] objArr = {aVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f44bc96ea8a683b6a2302e6c9f874437", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f44bc96ea8a683b6a2302e6c9f874437");
            return;
        }
        kotlin.jvm.internal.h.b(aVar, Constants.EventType.VIEW);
        ((BaseTabModuleInfo) aVar.getInfo()).setSlideBarGradientColor(readableMap != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.k(readableMap) : null);
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_TAB_SLIDEBAR_WIDTH)
    public final void setSlideBarWidth(@NotNull a<?> aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "242f6e19e1966bc09c263b535be8f85a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "242f6e19e1966bc09c263b535be8f85a");
            return;
        }
        kotlin.jvm.internal.h.b(aVar, Constants.EventType.VIEW);
        ((BaseTabModuleInfo) aVar.getInfo()).setSlideBarWidth(num);
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_TAB_SLIDEBAR_HEIGHT)
    public final void setSlideBarHeight(@NotNull a<?> aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91a9ef1d83dd4ee519dd3507c4b756ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91a9ef1d83dd4ee519dd3507c4b756ca");
            return;
        }
        kotlin.jvm.internal.h.b(aVar, Constants.EventType.VIEW);
        ((BaseTabModuleInfo) aVar.getInfo()).setSlideBarHeight(num);
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = "slideBarIsAbove")
    public final void setSlideBarIsAbove(@NotNull a<?> aVar, @Nullable Boolean bool) {
        Object[] objArr = {aVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "033f5443c383687a68bf3a871fbee17d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "033f5443c383687a68bf3a871fbee17d");
            return;
        }
        kotlin.jvm.internal.h.b(aVar, Constants.EventType.VIEW);
        ((BaseTabModuleInfo) aVar.getInfo()).setSlideBarIsAbove(bool);
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = "slideBarOffset")
    public final void setSlideBarOffset(@NotNull a<?> aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13f0303e85da4455b5519045073b345c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13f0303e85da4455b5519045073b345c");
            return;
        }
        kotlin.jvm.internal.h.b(aVar, Constants.EventType.VIEW);
        ((BaseTabModuleInfo) aVar.getInfo()).setSlideBarOffset(num);
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_TAB_SLIDE_BAR_IS_ROUNDED)
    public final void setSlideBarIsRounded(@NotNull a<?> aVar, @Nullable Boolean bool) {
        Object[] objArr = {aVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "922b06b3cf3dcfb0b0c5edb7601ecc95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "922b06b3cf3dcfb0b0c5edb7601ecc95");
            return;
        }
        kotlin.jvm.internal.h.b(aVar, Constants.EventType.VIEW);
        ((BaseTabModuleInfo) aVar.getInfo()).setSlideBarIsRounded(bool);
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_TAB_RATIO_FOR_SLIDE_BAR_WIDTH)
    public final void setRatioForSlideBarWidth(@NotNull a<?> aVar, double d) {
        Object[] objArr = {aVar, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ecee552369c61cd98302e14fbe89fe3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ecee552369c61cd98302e14fbe89fe3");
            return;
        }
        kotlin.jvm.internal.h.b(aVar, Constants.EventType.VIEW);
        ((BaseTabModuleInfo) aVar.getInfo()).setRatioForSlideBarWidth(Double.valueOf(d));
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_TAB_SLIDE_BAR_WRAP)
    public final void setslideBarWrapTitle(@NotNull a<?> aVar, @Nullable Boolean bool) {
        Object[] objArr = {aVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd3daafc3d997e63cc760437b98bdc50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd3daafc3d997e63cc760437b98bdc50");
            return;
        }
        kotlin.jvm.internal.h.b(aVar, Constants.EventType.VIEW);
        ((BaseTabModuleInfo) aVar.getInfo()).setSlideBarWrapTitle(bool);
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_TAB_SELECT_INDEX)
    public final void setSelectIndex(@NotNull a<?> aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4fd977f41c035af4cc32449171552c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4fd977f41c035af4cc32449171552c6");
            return;
        }
        kotlin.jvm.internal.h.b(aVar, Constants.EventType.VIEW);
        ((BaseTabModuleInfo) aVar.getInfo()).setSelectIndex(num);
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_TAB_SELECTED_TEXT_SIZE)
    public final void setSelectedTextSize(@NotNull a<?> aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7528ed9c4b74305d0bd8b5e97f6c7d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7528ed9c4b74305d0bd8b5e97f6c7d2");
            return;
        }
        kotlin.jvm.internal.h.b(aVar, Constants.EventType.VIEW);
        ((BaseTabModuleInfo) aVar.getInfo()).setSelectedTextSize(num);
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(defaultBoolean = false, name = "onSelect")
    public final void setOnSelect(@NotNull a<?> aVar, boolean z) {
        String str;
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d426d5331ea6fa2381e81e952f2b649d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d426d5331ea6fa2381e81e952f2b649d");
            return;
        }
        kotlin.jvm.internal.h.b(aVar, Constants.EventType.VIEW);
        BaseTabModuleInfo baseTabModuleInfo = (BaseTabModuleInfo) aVar.getInfo();
        if (z) {
            str = "gdm_didSelectCallback:" + aVar.getId();
        } else {
            str = null;
        }
        baseTabModuleInfo.setOnSelect(str);
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(defaultBoolean = false, name = DMKeys.KEY_ON_SCROLL_BEGIN_DRAG)
    public final void setOnScrollBeginDrag(@NotNull a<?> aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2cb39f40616df94b87e4e9cb6d0f67c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2cb39f40616df94b87e4e9cb6d0f67c1");
            return;
        }
        kotlin.jvm.internal.h.b(aVar, Constants.EventType.VIEW);
        if (z) {
            ((BaseTabModuleInfo) aVar.getInfo()).setOnScrollBeginDrag("gdm_onScrollBeginDragCallback:" + aVar.getId());
        } else {
            ((BaseTabModuleInfo) aVar.getInfo()).setOnScrollBeginDrag(null);
        }
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(defaultBoolean = false, name = DMKeys.KEY_ON_SCROLL_END_DRAG)
    public final void setOnScrollEndDrag(@NotNull a<?> aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "826e223ab7879b7be61922b3ee0698d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "826e223ab7879b7be61922b3ee0698d0");
            return;
        }
        kotlin.jvm.internal.h.b(aVar, Constants.EventType.VIEW);
        if (z) {
            ((BaseTabModuleInfo) aVar.getInfo()).setOnScrollEndDrag("gdm_onScrollEndDragCallback:" + aVar.getId());
        } else {
            ((BaseTabModuleInfo) aVar.getInfo()).setOnScrollEndDrag(null);
        }
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(defaultBoolean = false, name = "onScroll")
    public final void setOnScroll(@NotNull a<?> aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae2b0c45f2db7dd19715c078ee9a130b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae2b0c45f2db7dd19715c078ee9a130b");
            return;
        }
        kotlin.jvm.internal.h.b(aVar, Constants.EventType.VIEW);
        if (z) {
            ((BaseTabModuleInfo) aVar.getInfo()).setOnScroll("gdm_onScrollCallback:" + aVar.getId());
        } else {
            ((BaseTabModuleInfo) aVar.getInfo()).setOnScroll(null);
        }
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(defaultBoolean = false, name = DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN)
    public final void setOnMomentumScrollBegin(@NotNull a<?> aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c94e7fa5ed5dae4347b0e46a83fc96a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c94e7fa5ed5dae4347b0e46a83fc96a");
            return;
        }
        kotlin.jvm.internal.h.b(aVar, Constants.EventType.VIEW);
        if (z) {
            ((BaseTabModuleInfo) aVar.getInfo()).setOnMomentumScrollBegin("gdm_onMomentumScrollBeginCallback:" + aVar.getId());
        } else {
            ((BaseTabModuleInfo) aVar.getInfo()).setOnMomentumScrollBegin(null);
        }
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(defaultBoolean = false, name = DMKeys.KEY_ON_MOMENTUM_SCROLL_END)
    public final void setOnMomentumScrollEnd(@NotNull a<?> aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3174e584d18bbeb23268550c86a2da43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3174e584d18bbeb23268550c86a2da43");
            return;
        }
        kotlin.jvm.internal.h.b(aVar, Constants.EventType.VIEW);
        if (z) {
            ((BaseTabModuleInfo) aVar.getInfo()).setOnMomentumScrollEnd("gdm_onMomentumScrollEndCallback:" + aVar.getId());
        } else {
            ((BaseTabModuleInfo) aVar.getInfo()).setOnMomentumScrollEnd(null);
        }
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_THROTTLE)
    public final void setScrollEventThrottled(@NotNull a<?> aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "734b6ddab82ab9e5b7a9d6ddd16e1cf8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "734b6ddab82ab9e5b7a9d6ddd16e1cf8");
            return;
        }
        kotlin.jvm.internal.h.b(aVar, Constants.EventType.VIEW);
        ((BaseTabModuleInfo) aVar.getInfo()).setScrollEventThrottle(num);
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "828ff70e20588b7220fac5015e95ae2a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "828ff70e20588b7220fac5015e95ae2a");
        }
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        Map a = com.facebook.react.common.c.b().a("onSelect", com.facebook.react.common.c.a("registrationName", "onSelect")).a("onHoverStatusChanged", com.facebook.react.common.c.a("registrationName", "onHoverStatusChanged")).a(DMKeys.KEY_ON_SCROLL_BEGIN_DRAG, com.facebook.react.common.c.a("registrationName", DMKeys.KEY_ON_SCROLL_BEGIN_DRAG)).a(DMKeys.KEY_ON_SCROLL_END_DRAG, com.facebook.react.common.c.a("registrationName", DMKeys.KEY_ON_SCROLL_END_DRAG)).a("onScroll", com.facebook.react.common.c.a("registrationName", "onScroll")).a(DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN, com.facebook.react.common.c.a("registrationName", DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN)).a(DMKeys.KEY_ON_MOMENTUM_SCROLL_END, com.facebook.react.common.c.a("registrationName", DMKeys.KEY_ON_MOMENTUM_SCROLL_END)).a();
        kotlin.jvm.internal.h.a((Object) a, "MapBuilder.builder<Strin…\n                .build()");
        Map<String, Object> b = v.b(a);
        if (exportedCustomDirectEventTypeConstants != null) {
            b.putAll(exportedCustomDirectEventTypeConstants);
        }
        return b;
    }
}
