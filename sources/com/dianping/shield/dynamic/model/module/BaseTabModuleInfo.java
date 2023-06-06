package com.dianping.shield.dynamic.model.module;

import com.dianping.shield.dynamic.model.extra.ColorUnionType;
import com.dianping.shield.dynamic.model.extra.HoverInfo;
import com.dianping.shield.dynamic.model.extra.MGEInfo;
import com.dianping.shield.dynamic.model.extra.MarginInfo;
import com.dianping.shield.dynamic.model.extra.ScrollEvent;
import com.dianping.shield.dynamic.model.view.ExtraViewUnionType;
import com.dianping.shield.dynamic.model.view.TabInfo;
import com.dianping.shield.dynamic.model.view.TabViewInfo;
import com.dianping.shield.dynamic.model.view.ViewInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0006\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u001e\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\f\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0006X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0010\u0010\b\"\u0004\b\u0011\u0010\nR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0006X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0013\u0010\b\"\u0004\b\u0014\u0010\nR\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R2\u0010(\u001a\u001a\u0012\u0006\b\u0000\u0012\u00020*\u0018\u00010)j\f\u0012\u0006\b\u0000\u0012\u00020*\u0018\u0001`+X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u00100\u001a\u0004\u0018\u000101X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001c\u00106\u001a\u0004\u0018\u000107X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001e\u0010<\u001a\u0004\u0018\u00010=X\u0096\u000e¢\u0006\u0010\n\u0002\u0010B\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001c\u0010C\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001e\u0010H\u001a\u0004\u0018\u00010\u0006X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\bH\u0010\b\"\u0004\bI\u0010\nR\u001c\u0010J\u001a\u0004\u0018\u00010KX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001c\u0010P\u001a\u0004\u0018\u00010#X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010%\"\u0004\bR\u0010'R\u001e\u0010S\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\bT\u0010\u0018\"\u0004\bU\u0010\u001aR\u001c\u0010V\u001a\u0004\u0018\u00010\u001dX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\u001f\"\u0004\bX\u0010!R\u001c\u0010Y\u001a\u0004\u0018\u00010\u001dX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010\u001f\"\u0004\b[\u0010!R\u001e\u0010\\\u001a\u0004\u0018\u00010]X\u0096\u000e¢\u0006\u0010\n\u0002\u0010b\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u001e\u0010c\u001a\u0004\u0018\u00010\u0016X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\bd\u0010\u0018\"\u0004\be\u0010\u001aR\u001e\u0010f\u001a\u0004\u0018\u00010\u0016X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\bg\u0010\u0018\"\u0004\bh\u0010\u001aR\u001e\u0010i\u001a\u0004\u0018\u00010\u0016X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\bj\u0010\u0018\"\u0004\bk\u0010\u001aR\u001c\u0010l\u001a\u0004\u0018\u00010\u001dX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010\u001f\"\u0004\bn\u0010!R\u001e\u0010o\u001a\u0004\u0018\u00010\u0016X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\bp\u0010\u0018\"\u0004\bq\u0010\u001aR\u001e\u0010r\u001a\u0004\u0018\u00010\u0006X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\bs\u0010\b\"\u0004\bt\u0010\nR\u001e\u0010u\u001a\u0004\u0018\u00010\u0006X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\bv\u0010\b\"\u0004\bw\u0010\nR\u001e\u0010x\u001a\u0004\u0018\u00010\u0006X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\by\u0010\b\"\u0004\bz\u0010\nR\u001d\u0010{\u001a\u0004\u0018\u00010|X\u0096\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R\u001f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u001dX\u0096\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0001\u0010\u001f\"\u0005\b\u0083\u0001\u0010!R\u001f\u0010\u0084\u0001\u001a\u0004\u0018\u000107X\u0096\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0001\u00109\"\u0005\b\u0086\u0001\u0010;R!\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0016X\u0096\u000e¢\u0006\u0012\n\u0002\u0010\u001b\u001a\u0005\b\u0088\u0001\u0010\u0018\"\u0005\b\u0089\u0001\u0010\u001aR!\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0006X\u0096\u000e¢\u0006\u0012\n\u0002\u0010\u000b\u001a\u0005\b\u008b\u0001\u0010\b\"\u0005\b\u008c\u0001\u0010\nR!\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0006X\u0096\u000e¢\u0006\u0012\n\u0002\u0010\u000b\u001a\u0005\b\u008e\u0001\u0010\b\"\u0005\b\u008f\u0001\u0010\nR!\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0016X\u0096\u000e¢\u0006\u0012\n\u0002\u0010\u001b\u001a\u0005\b\u0091\u0001\u0010\u0018\"\u0005\b\u0092\u0001\u0010\u001aR!\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0016X\u0096\u000e¢\u0006\u0012\n\u0002\u0010\u001b\u001a\u0005\b\u0094\u0001\u0010\u0018\"\u0005\b\u0095\u0001\u0010\u001aR!\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0006X\u0096\u000e¢\u0006\u0012\n\u0002\u0010\u000b\u001a\u0005\b\u0097\u0001\u0010\b\"\u0005\b\u0098\u0001\u0010\nR3\u0010\u0099\u0001\u001a\u0018\u0012\u0005\u0012\u00030\u009a\u0001\u0018\u00010)j\u000b\u0012\u0005\u0012\u00030\u009a\u0001\u0018\u0001`+X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009b\u0001\u0010-\"\u0005\b\u009c\u0001\u0010/R!\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0016X\u0096\u000e¢\u0006\u0012\n\u0002\u0010\u001b\u001a\u0005\b\u009e\u0001\u0010\u0018\"\u0005\b\u009f\u0001\u0010\u001aR\u001f\u0010 \u0001\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¡\u0001\u0010E\"\u0005\b¢\u0001\u0010GR!\u0010£\u0001\u001a\u0004\u0018\u00010\u0016X\u0096\u000e¢\u0006\u0012\n\u0002\u0010\u001b\u001a\u0005\b¤\u0001\u0010\u0018\"\u0005\b¥\u0001\u0010\u001aR!\u0010¦\u0001\u001a\u0004\u0018\u00010\u0016X\u0096\u000e¢\u0006\u0012\n\u0002\u0010\u001b\u001a\u0005\b§\u0001\u0010\u0018\"\u0005\b¨\u0001\u0010\u001aR\u001f\u0010©\u0001\u001a\u0004\u0018\u00010\u001dX\u0096\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bª\u0001\u0010\u001f\"\u0005\b«\u0001\u0010!R!\u0010¬\u0001\u001a\u0004\u0018\u00010\u0016X\u0096\u000e¢\u0006\u0012\n\u0002\u0010\u001b\u001a\u0005\b\u00ad\u0001\u0010\u0018\"\u0005\b®\u0001\u0010\u001aR\u001f\u0010¯\u0001\u001a\u0004\u0018\u000101X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b°\u0001\u00103\"\u0005\b±\u0001\u00105R!\u0010²\u0001\u001a\u0004\u0018\u00010\u0016X\u0096\u000e¢\u0006\u0012\n\u0002\u0010\u001b\u001a\u0005\b³\u0001\u0010\u0018\"\u0005\b´\u0001\u0010\u001aR!\u0010µ\u0001\u001a\u0004\u0018\u00010\u0016X\u0096\u000e¢\u0006\u0012\n\u0002\u0010\u001b\u001a\u0005\b¶\u0001\u0010\u0018\"\u0005\b·\u0001\u0010\u001a¨\u0006¸\u0001"}, d2 = {"Lcom/dianping/shield/dynamic/model/module/BaseTabModuleInfo;", "Lcom/dianping/shield/dynamic/model/view/TabInfo;", "Lcom/dianping/shield/dynamic/model/extra/HoverInfo;", "Lcom/dianping/shield/dynamic/model/extra/ScrollEvent;", "()V", DMKeys.KEY_HOVER_ALWAYS, "", "getAlwaysHover", "()Ljava/lang/Boolean;", "setAlwaysHover", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", DMKeys.KEY_AUTO_MARGIN, "getAutoMargin", "setAutoMargin", DMKeys.KEY_HOVER_AUTO_OFFSET, "getAutoOffset", "setAutoOffset", DMKeys.KEY_HOVER_AUTO_STOP_HOVER, "getAutoStopHover", "setAutoStopHover", DMKeys.KEY_HOVER_AUTO_STOP_HOVER_TYPE, "", "getAutoStopHoverType", "()Ljava/lang/Integer;", "setAutoStopHoverType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "backgroundColor", "", "getBackgroundColor", "()Ljava/lang/String;", "setBackgroundColor", "(Ljava/lang/String;)V", "backgroundView", "Lcom/dianping/shield/dynamic/model/view/ExtraViewUnionType$ExtraViewInfo;", "getBackgroundView", "()Lcom/dianping/shield/dynamic/model/view/ExtraViewUnionType$ExtraViewInfo;", "setBackgroundView", "(Lcom/dianping/shield/dynamic/model/view/ExtraViewUnionType$ExtraViewInfo;)V", "children", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/model/view/TabViewInfo;", "Lkotlin/collections/ArrayList;", "getChildren", "()Ljava/util/ArrayList;", "setChildren", "(Ljava/util/ArrayList;)V", DMKeys.KEY_CLICK_MGE_INFO, "Lcom/dianping/shield/dynamic/model/extra/MGEInfo;", "getClickMgeInfo", "()Lcom/dianping/shield/dynamic/model/extra/MGEInfo;", "setClickMgeInfo", "(Lcom/dianping/shield/dynamic/model/extra/MGEInfo;)V", DMKeys.KEY_GRADIENT_BACKGROUND_COLOR, "Lcom/dianping/shield/dynamic/model/extra/ColorUnionType$GradientColorInfo;", "getGradientBackgroundColor", "()Lcom/dianping/shield/dynamic/model/extra/ColorUnionType$GradientColorInfo;", "setGradientBackgroundColor", "(Lcom/dianping/shield/dynamic/model/extra/ColorUnionType$GradientColorInfo;)V", DMKeys.KEY_HOVER_OFFSET, "", "getHoverOffset", "()Ljava/lang/Float;", "setHoverOffset", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "hoverScrollEvent", "getHoverScrollEvent", "()Lcom/dianping/shield/dynamic/model/extra/ScrollEvent;", "setHoverScrollEvent", "(Lcom/dianping/shield/dynamic/model/extra/ScrollEvent;)V", "isEqualized", "setEqualized", DMKeys.KEY_MARGIN_INFO, "Lcom/dianping/shield/dynamic/model/extra/MarginInfo;", "getMarginInfo", "()Lcom/dianping/shield/dynamic/model/extra/MarginInfo;", "setMarginInfo", "(Lcom/dianping/shield/dynamic/model/extra/MarginInfo;)V", "maskView", "getMaskView", "setMaskView", DMKeys.KEY_TAB_MIN_SHOW_TAB_COUNT, "getMinShowTabCount", "setMinShowTabCount", "onHoverStatusChanged", "getOnHoverStatusChanged", "setOnHoverStatusChanged", "onSelect", "getOnSelect", "setOnSelect", DMKeys.KEY_TAB_RATIO_FOR_SLIDE_BAR_WIDTH, "", "getRatioForSlideBarWidth", "()Ljava/lang/Double;", "setRatioForSlideBarWidth", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", DMKeys.KEY_THROTTLE, "getScrollEventThrottle", "setScrollEventThrottle", DMKeys.KEY_TAB_SELECT_INDEX, "getSelectIndex", "setSelectIndex", DMKeys.KEY_TAB_SELECTED_TEXT_SIZE, "getSelectedTextSize", "setSelectedTextSize", DMKeys.KEY_TAB_SELECTED_TITLE_COLOR, "getSelectedTitleColor", "setSelectedTitleColor", DMKeys.KEY_TAB_TITLE_SELECTED_STYLE, "getSelectedTitleFont", "setSelectedTitleFont", DMKeys.KEY_HOVER_SHOW_BOTTOM_LINE, "getShowBottomLine", "setShowBottomLine", DMKeys.KEY_HOVER_SHOW_SHADOW, "getShowShadow", "setShowShadow", DMKeys.KEY_HOVER_SHOW_TOP_LINE, "getShowTopLine", "setShowTopLine", "slideBar", "Lcom/dianping/shield/dynamic/model/view/ViewInfo;", "getSlideBar", "()Lcom/dianping/shield/dynamic/model/view/ViewInfo;", "setSlideBar", "(Lcom/dianping/shield/dynamic/model/view/ViewInfo;)V", DMKeys.KEY_TAB_SLIDEBAR_COLOR, "getSlideBarColor", "setSlideBarColor", DMKeys.KEY_SLIDE_BAR_GRADIENT_COLOR, "getSlideBarGradientColor", "setSlideBarGradientColor", DMKeys.KEY_TAB_SLIDEBAR_HEIGHT, "getSlideBarHeight", "setSlideBarHeight", "slideBarIsAbove", "getSlideBarIsAbove", "setSlideBarIsAbove", DMKeys.KEY_TAB_SLIDE_BAR_IS_ROUNDED, "getSlideBarIsRounded", "setSlideBarIsRounded", "slideBarOffset", "getSlideBarOffset", "setSlideBarOffset", DMKeys.KEY_TAB_SLIDEBAR_WIDTH, "getSlideBarWidth", "setSlideBarWidth", DMKeys.KEY_TAB_SLIDE_BAR_WRAP, "getSlideBarWrapTitle", "setSlideBarWrapTitle", DMKeys.KEY_TAB_CONFIGS, "Lcom/dianping/shield/dynamic/model/module/TabModuleConfigInfo;", "getTabConfigs", "setTabConfigs", DMKeys.KEY_TAB_HEIGHT, "getTabHeight", "setTabHeight", "tabScrollEvent", "getTabScrollEvent", "setTabScrollEvent", DMKeys.KEY_TAB_WIDTH, "getTabWidth", "setTabWidth", DMKeys.KEY_TAB_TEXT_SIZE, "getTextSize", "setTextSize", "titleColor", "getTitleColor", "setTitleColor", "titleFont", "getTitleFont", "setTitleFont", DMKeys.KEY_VIEW_MGE_INFO, "getViewMgeInfo", "setViewMgeInfo", DMKeys.KEY_XGAP, "getXGap", "setXGap", DMKeys.KEY_HOVER_Z_POSITION, "getZPosition", "setZPosition", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public abstract class BaseTabModuleInfo implements HoverInfo, ScrollEvent, TabInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private Boolean alwaysHover;
    @Nullable
    private Boolean autoMargin;
    @Nullable
    private Boolean autoOffset;
    @Nullable
    private Boolean autoStopHover;
    @Nullable
    private Integer autoStopHoverType;
    @Nullable
    private String backgroundColor;
    @Nullable
    private ExtraViewUnionType.ExtraViewInfo backgroundView;
    @Nullable
    private ArrayList<? super TabViewInfo> children;
    @Nullable
    private MGEInfo clickMgeInfo;
    @Nullable
    private ColorUnionType.GradientColorInfo gradientBackgroundColor;
    @Nullable
    private Float hoverOffset;
    @Nullable
    private ScrollEvent hoverScrollEvent;
    @Nullable
    private Boolean isEqualized;
    @Nullable
    private MarginInfo marginInfo;
    @Nullable
    private ExtraViewUnionType.ExtraViewInfo maskView;
    @Nullable
    private Integer minShowTabCount;
    @Nullable
    private String onHoverStatusChanged;
    @Nullable
    private String onSelect;
    @Nullable
    private Double ratioForSlideBarWidth;
    @Nullable
    private Integer scrollEventThrottle;
    @Nullable
    private Integer selectIndex;
    @Nullable
    private Integer selectedTextSize;
    @Nullable
    private String selectedTitleColor;
    @Nullable
    private Integer selectedTitleFont;
    @Nullable
    private Boolean showBottomLine;
    @Nullable
    private Boolean showShadow;
    @Nullable
    private Boolean showTopLine;
    @Nullable
    private ViewInfo slideBar;
    @Nullable
    private String slideBarColor;
    @Nullable
    private ColorUnionType.GradientColorInfo slideBarGradientColor;
    @Nullable
    private Integer slideBarHeight;
    @Nullable
    private Boolean slideBarIsAbove;
    @Nullable
    private Boolean slideBarIsRounded;
    @Nullable
    private Integer slideBarOffset;
    @Nullable
    private Integer slideBarWidth;
    @Nullable
    private Boolean slideBarWrapTitle;
    @Nullable
    private ArrayList<TabModuleConfigInfo> tabConfigs;
    @Nullable
    private Integer tabHeight;
    @Nullable
    private ScrollEvent tabScrollEvent;
    @Nullable
    private Integer tabWidth;
    @Nullable
    private Integer textSize;
    @Nullable
    private String titleColor;
    @Nullable
    private Integer titleFont;
    @Nullable
    private MGEInfo viewMgeInfo;
    @Nullable
    private Integer xGap;
    @Nullable
    private Integer zPosition;

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public ArrayList<? super TabViewInfo> getChildren() {
        return this.children;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public void setChildren(@Nullable ArrayList<? super TabViewInfo> arrayList) {
        this.children = arrayList;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public ExtraViewUnionType.ExtraViewInfo getBackgroundView() {
        return this.backgroundView;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public void setBackgroundView(@Nullable ExtraViewUnionType.ExtraViewInfo extraViewInfo) {
        this.backgroundView = extraViewInfo;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public ExtraViewUnionType.ExtraViewInfo getMaskView() {
        return this.maskView;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public void setMaskView(@Nullable ExtraViewUnionType.ExtraViewInfo extraViewInfo) {
        this.maskView = extraViewInfo;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public ViewInfo getSlideBar() {
        return this.slideBar;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public void setSlideBar(@Nullable ViewInfo viewInfo) {
        this.slideBar = viewInfo;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public Integer getTextSize() {
        return this.textSize;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public void setTextSize(@Nullable Integer num) {
        this.textSize = num;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public Integer getSelectedTextSize() {
        return this.selectedTextSize;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public void setSelectedTextSize(@Nullable Integer num) {
        this.selectedTextSize = num;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public String getTitleColor() {
        return this.titleColor;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public void setTitleColor(@Nullable String str) {
        this.titleColor = str;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public String getSelectedTitleColor() {
        return this.selectedTitleColor;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public void setSelectedTitleColor(@Nullable String str) {
        this.selectedTitleColor = str;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public Integer getTabWidth() {
        return this.tabWidth;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public void setTabWidth(@Nullable Integer num) {
        this.tabWidth = num;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public Integer getTabHeight() {
        return this.tabHeight;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public void setTabHeight(@Nullable Integer num) {
        this.tabHeight = num;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public Integer getXGap() {
        return this.xGap;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public void setXGap(@Nullable Integer num) {
        this.xGap = num;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public String getSlideBarColor() {
        return this.slideBarColor;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public void setSlideBarColor(@Nullable String str) {
        this.slideBarColor = str;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public ColorUnionType.GradientColorInfo getSlideBarGradientColor() {
        return this.slideBarGradientColor;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public void setSlideBarGradientColor(@Nullable ColorUnionType.GradientColorInfo gradientColorInfo) {
        this.slideBarGradientColor = gradientColorInfo;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public Integer getSlideBarWidth() {
        return this.slideBarWidth;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public void setSlideBarWidth(@Nullable Integer num) {
        this.slideBarWidth = num;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public Integer getSlideBarHeight() {
        return this.slideBarHeight;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public void setSlideBarHeight(@Nullable Integer num) {
        this.slideBarHeight = num;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public Boolean getSlideBarIsAbove() {
        return this.slideBarIsAbove;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public void setSlideBarIsAbove(@Nullable Boolean bool) {
        this.slideBarIsAbove = bool;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public Boolean getSlideBarIsRounded() {
        return this.slideBarIsRounded;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public void setSlideBarIsRounded(@Nullable Boolean bool) {
        this.slideBarIsRounded = bool;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public Double getRatioForSlideBarWidth() {
        return this.ratioForSlideBarWidth;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public void setRatioForSlideBarWidth(@Nullable Double d) {
        this.ratioForSlideBarWidth = d;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public Boolean getSlideBarWrapTitle() {
        return this.slideBarWrapTitle;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public void setSlideBarWrapTitle(@Nullable Boolean bool) {
        this.slideBarWrapTitle = bool;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public Integer getSlideBarOffset() {
        return this.slideBarOffset;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public void setSlideBarOffset(@Nullable Integer num) {
        this.slideBarOffset = num;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public Integer getSelectIndex() {
        return this.selectIndex;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public void setSelectIndex(@Nullable Integer num) {
        this.selectIndex = num;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public Boolean isEqualized() {
        return this.isEqualized;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public void setEqualized(@Nullable Boolean bool) {
        this.isEqualized = bool;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public String getOnSelect() {
        return this.onSelect;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public void setOnSelect(@Nullable String str) {
        this.onSelect = str;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    @Nullable
    public Boolean getAlwaysHover() {
        return this.alwaysHover;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    public void setAlwaysHover(@Nullable Boolean bool) {
        this.alwaysHover = bool;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    @Nullable
    public Float getHoverOffset() {
        return this.hoverOffset;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    public void setHoverOffset(@Nullable Float f) {
        this.hoverOffset = f;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    @Nullable
    public Boolean getAutoOffset() {
        return this.autoOffset;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    public void setAutoOffset(@Nullable Boolean bool) {
        this.autoOffset = bool;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    @Nullable
    public Boolean getShowTopLine() {
        return this.showTopLine;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    public void setShowTopLine(@Nullable Boolean bool) {
        this.showTopLine = bool;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    @Nullable
    public Boolean getShowBottomLine() {
        return this.showBottomLine;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    public void setShowBottomLine(@Nullable Boolean bool) {
        this.showBottomLine = bool;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    @Nullable
    public Boolean getShowShadow() {
        return this.showShadow;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    public void setShowShadow(@Nullable Boolean bool) {
        this.showShadow = bool;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    @Nullable
    public Integer getZPosition() {
        return this.zPosition;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    public void setZPosition(@Nullable Integer num) {
        this.zPosition = num;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    @Nullable
    public Boolean getAutoStopHover() {
        return this.autoStopHover;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    public void setAutoStopHover(@Nullable Boolean bool) {
        this.autoStopHover = bool;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    @Nullable
    public Integer getAutoStopHoverType() {
        return this.autoStopHoverType;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    public void setAutoStopHoverType(@Nullable Integer num) {
        this.autoStopHoverType = num;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    @Nullable
    public String getOnHoverStatusChanged() {
        return this.onHoverStatusChanged;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    public void setOnHoverStatusChanged(@Nullable String str) {
        this.onHoverStatusChanged = str;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ScrollEvent
    @Nullable
    public Integer getScrollEventThrottle() {
        return this.scrollEventThrottle;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ScrollEvent
    public void setScrollEventThrottle(@Nullable Integer num) {
        this.scrollEventThrottle = num;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public Integer getTitleFont() {
        return this.titleFont;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public void setTitleFont(@Nullable Integer num) {
        this.titleFont = num;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public Integer getSelectedTitleFont() {
        return this.selectedTitleFont;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public void setSelectedTitleFont(@Nullable Integer num) {
        this.selectedTitleFont = num;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    @Nullable
    public ScrollEvent getHoverScrollEvent() {
        return this.hoverScrollEvent;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    public void setHoverScrollEvent(@Nullable ScrollEvent scrollEvent) {
        this.hoverScrollEvent = scrollEvent;
    }

    @Nullable
    public final ArrayList<TabModuleConfigInfo> getTabConfigs() {
        return this.tabConfigs;
    }

    public final void setTabConfigs(@Nullable ArrayList<TabModuleConfigInfo> arrayList) {
        this.tabConfigs = arrayList;
    }

    @Nullable
    public final Integer getMinShowTabCount() {
        return this.minShowTabCount;
    }

    public final void setMinShowTabCount(@Nullable Integer num) {
        this.minShowTabCount = num;
    }

    @Nullable
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final void setBackgroundColor(@Nullable String str) {
        this.backgroundColor = str;
    }

    @Nullable
    public final ColorUnionType.GradientColorInfo getGradientBackgroundColor() {
        return this.gradientBackgroundColor;
    }

    public final void setGradientBackgroundColor(@Nullable ColorUnionType.GradientColorInfo gradientColorInfo) {
        this.gradientBackgroundColor = gradientColorInfo;
    }

    @Nullable
    public final Boolean getAutoMargin() {
        return this.autoMargin;
    }

    public final void setAutoMargin(@Nullable Boolean bool) {
        this.autoMargin = bool;
    }

    @Nullable
    public final MarginInfo getMarginInfo() {
        return this.marginInfo;
    }

    public final void setMarginInfo(@Nullable MarginInfo marginInfo) {
        this.marginInfo = marginInfo;
    }

    @Nullable
    public final MGEInfo getClickMgeInfo() {
        return this.clickMgeInfo;
    }

    public final void setClickMgeInfo(@Nullable MGEInfo mGEInfo) {
        this.clickMgeInfo = mGEInfo;
    }

    @Nullable
    public final MGEInfo getViewMgeInfo() {
        return this.viewMgeInfo;
    }

    public final void setViewMgeInfo(@Nullable MGEInfo mGEInfo) {
        this.viewMgeInfo = mGEInfo;
    }

    @Nullable
    public final ScrollEvent getTabScrollEvent() {
        return this.tabScrollEvent;
    }

    public final void setTabScrollEvent(@Nullable ScrollEvent scrollEvent) {
        this.tabScrollEvent = scrollEvent;
    }
}
