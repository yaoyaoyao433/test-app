package com.dianping.shield.dynamic.model.cell;

import com.dianping.shield.dynamic.model.cell.CellInfo;
import com.dianping.shield.dynamic.model.extra.ColorUnionType;
import com.dianping.shield.dynamic.model.extra.ExposeInfo;
import com.dianping.shield.dynamic.model.extra.HoverInfo;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b*\n\u0002\u0010\u0006\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b,\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0005¢\u0006\u0002\u0010\u0006R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0015\u0010\n\"\u0004\b\u0016\u0010\fR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\bX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0018\u0010\n\"\u0004\b\u0019\u0010\fR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\bX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u001b\u0010\n\"\u0004\b\u001c\u0010\fR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0096\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R.\u0010*\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u00010+j\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001`,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001e\u00101\u001a\u0004\u0018\u00010\bX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b2\u0010\n\"\u0004\b3\u0010\fR2\u00104\u001a\u001a\u0012\u0006\b\u0000\u0012\u000205\u0018\u00010+j\f\u0012\u0006\b\u0000\u0012\u000205\u0018\u0001`,X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010.\"\u0004\b7\u00100R\u001c\u00108\u001a\u0004\u0018\u000109X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001c\u0010>\u001a\u0004\u0018\u00010\u000fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u0011\"\u0004\b@\u0010\u0013R\u001e\u0010A\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\bB\u0010\n\"\u0004\bC\u0010\fR\u001c\u0010D\u001a\u0004\u0018\u00010\u000fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u0011\"\u0004\bF\u0010\u0013R\u001e\u0010G\u001a\u0004\u0018\u00010\u001eX\u0096\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\bH\u0010 \"\u0004\bI\u0010\"R\u001e\u0010J\u001a\u0004\u0018\u00010KX\u0096\u000e¢\u0006\u0010\n\u0002\u0010P\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001c\u0010Q\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u001e\u0010V\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\bW\u0010 \"\u0004\bX\u0010\"R\u001e\u0010Y\u001a\u0004\u0018\u00010\bX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\bY\u0010\n\"\u0004\bZ\u0010\fR\u001e\u0010[\u001a\u0004\u0018\u00010\bX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b[\u0010\n\"\u0004\b\\\u0010\fR\u001c\u0010]\u001a\u0004\u0018\u00010%X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010'\"\u0004\b_\u0010)R\u001c\u0010`\u001a\u0004\u0018\u00010\u000fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010\u0011\"\u0004\bb\u0010\u0013R\u001c\u0010c\u001a\u0004\u0018\u00010\u000fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010\u0011\"\u0004\be\u0010\u0013R\u001c\u0010f\u001a\u0004\u0018\u00010\u000fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010\u0011\"\u0004\bh\u0010\u0013R\u001c\u0010i\u001a\u0004\u0018\u00010\u000fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010\u0011\"\u0004\bk\u0010\u0013R\u001c\u0010l\u001a\u0004\u0018\u00010\u000fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010\u0011\"\u0004\bn\u0010\u0013R\u001c\u0010o\u001a\u0004\u0018\u00010\u000fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010\u0011\"\u0004\bq\u0010\u0013R\u001c\u0010r\u001a\u0004\u0018\u00010\u000fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010\u0011\"\u0004\bt\u0010\u0013R\u001e\u0010u\u001a\u0004\u0018\u00010vX\u0096\u000e¢\u0006\u0010\n\u0002\u0010{\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\u001e\u0010|\u001a\u0004\u0018\u00010\u001eX\u0096\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b}\u0010 \"\u0004\b~\u0010\"R \u0010\u007f\u001a\u0004\u0018\u00010\u001eX\u0096\u000e¢\u0006\u0012\n\u0002\u0010#\u001a\u0005\b\u0080\u0001\u0010 \"\u0005\b\u0081\u0001\u0010\"R!\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u001eX\u0096\u000e¢\u0006\u0012\n\u0002\u0010#\u001a\u0005\b\u0083\u0001\u0010 \"\u0005\b\u0084\u0001\u0010\"R\u001f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u000fX\u0096\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0086\u0001\u0010\u0011\"\u0005\b\u0087\u0001\u0010\u0013R!\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u001eX\u0096\u000e¢\u0006\u0012\n\u0002\u0010#\u001a\u0005\b\u0089\u0001\u0010 \"\u0005\b\u008a\u0001\u0010\"R!\u0010\u008b\u0001\u001a\u0004\u0018\u00010\bX\u0096\u000e¢\u0006\u0012\n\u0002\u0010\r\u001a\u0005\b\u008c\u0001\u0010\n\"\u0005\b\u008d\u0001\u0010\fR!\u0010\u008e\u0001\u001a\u0004\u0018\u00010\bX\u0096\u000e¢\u0006\u0012\n\u0002\u0010\r\u001a\u0005\b\u008f\u0001\u0010\n\"\u0005\b\u0090\u0001\u0010\fR!\u0010\u0091\u0001\u001a\u0004\u0018\u00010\bX\u0096\u000e¢\u0006\u0012\n\u0002\u0010\r\u001a\u0005\b\u0092\u0001\u0010\n\"\u0005\b\u0093\u0001\u0010\fR\"\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0095\u0001X\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u000fX\u0096\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009b\u0001\u0010\u0011\"\u0005\b\u009c\u0001\u0010\u0013R\"\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u009e\u0001X\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001R!\u0010£\u0001\u001a\u0004\u0018\u00010\u001eX\u0096\u000e¢\u0006\u0012\n\u0002\u0010#\u001a\u0005\b¤\u0001\u0010 \"\u0005\b¥\u0001\u0010\"R!\u0010¦\u0001\u001a\u0004\u0018\u00010\bX\u0096\u000e¢\u0006\u0012\n\u0002\u0010\r\u001a\u0005\b§\u0001\u0010\n\"\u0005\b¨\u0001\u0010\fR!\u0010©\u0001\u001a\u0004\u0018\u00010\bX\u0096\u000e¢\u0006\u0012\n\u0002\u0010\r\u001a\u0005\bª\u0001\u0010\n\"\u0005\b«\u0001\u0010\fR!\u0010¬\u0001\u001a\u0004\u0018\u00010\u001eX\u0096\u000e¢\u0006\u0012\n\u0002\u0010#\u001a\u0005\b\u00ad\u0001\u0010 \"\u0005\b®\u0001\u0010\"R!\u0010¯\u0001\u001a\u0004\u0018\u00010\u001eX\u0096\u000e¢\u0006\u0012\n\u0002\u0010#\u001a\u0005\b°\u0001\u0010 \"\u0005\b±\u0001\u0010\"R!\u0010²\u0001\u001a\u0004\u0018\u00010\bX\u0096\u000e¢\u0006\u0012\n\u0002\u0010\r\u001a\u0005\b³\u0001\u0010\n\"\u0005\b´\u0001\u0010\fR!\u0010µ\u0001\u001a\u0004\u0018\u00010\u001eX\u0096\u000e¢\u0006\u0012\n\u0002\u0010#\u001a\u0005\b¶\u0001\u0010 \"\u0005\b·\u0001\u0010\"R!\u0010¸\u0001\u001a\u0004\u0018\u00010\u001eX\u0096\u000e¢\u0006\u0012\n\u0002\u0010#\u001a\u0005\b¹\u0001\u0010 \"\u0005\bº\u0001\u0010\"R!\u0010»\u0001\u001a\u0004\u0018\u00010\u001eX\u0096\u000e¢\u0006\u0012\n\u0002\u0010#\u001a\u0005\b¼\u0001\u0010 \"\u0005\b½\u0001\u0010\"R\u001f\u0010¾\u0001\u001a\u0004\u0018\u00010\u000fX\u0096\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¿\u0001\u0010\u0011\"\u0005\bÀ\u0001\u0010\u0013R!\u0010Á\u0001\u001a\u0004\u0018\u00010\u001eX\u0096\u000e¢\u0006\u0012\n\u0002\u0010#\u001a\u0005\bÂ\u0001\u0010 \"\u0005\bÃ\u0001\u0010\"R!\u0010Ä\u0001\u001a\u0004\u0018\u00010\u001eX\u0096\u000e¢\u0006\u0012\n\u0002\u0010#\u001a\u0005\bÅ\u0001\u0010 \"\u0005\bÆ\u0001\u0010\"R!\u0010Ç\u0001\u001a\u0004\u0018\u00010\u001eX\u0096\u000e¢\u0006\u0012\n\u0002\u0010#\u001a\u0005\bÈ\u0001\u0010 \"\u0005\bÉ\u0001\u0010\"¨\u0006Ê\u0001"}, d2 = {"Lcom/dianping/shield/dynamic/model/cell/TabCellInfo;", "Lcom/dianping/shield/dynamic/model/cell/CellInfo$BaseCellInfo;", "Lcom/dianping/shield/dynamic/model/extra/ExposeInfo;", "Lcom/dianping/shield/dynamic/model/view/TabInfo;", "Lcom/dianping/shield/dynamic/model/extra/HoverInfo;", "Lcom/dianping/shield/dynamic/model/extra/ScrollEvent;", "()V", DMKeys.KEY_HOVER_ALWAYS, "", "getAlwaysHover", "()Ljava/lang/Boolean;", "setAlwaysHover", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", DMKeys.KEY_APPEAR_ON_SCREEN_CALLBACK, "", "getAppearOnScreenCallback", "()Ljava/lang/String;", "setAppearOnScreenCallback", "(Ljava/lang/String;)V", "autoContentMargin", "getAutoContentMargin", "setAutoContentMargin", DMKeys.KEY_HOVER_AUTO_OFFSET, "getAutoOffset", "setAutoOffset", DMKeys.KEY_HOVER_AUTO_STOP_HOVER, "getAutoStopHover", "setAutoStopHover", DMKeys.KEY_HOVER_AUTO_STOP_HOVER_TYPE, "", "getAutoStopHoverType", "()Ljava/lang/Integer;", "setAutoStopHoverType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "backgroundView", "Lcom/dianping/shield/dynamic/model/view/ExtraViewUnionType$ExtraViewInfo;", "getBackgroundView", "()Lcom/dianping/shield/dynamic/model/view/ExtraViewUnionType$ExtraViewInfo;", "setBackgroundView", "(Lcom/dianping/shield/dynamic/model/view/ExtraViewUnionType$ExtraViewInfo;)V", DMKeys.KEY_TAB_BUTTON_TITLES, "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getButtonTitles", "()Ljava/util/ArrayList;", "setButtonTitles", "(Ljava/util/ArrayList;)V", DMKeys.KEY_CAN_REPEAT_EXPOSE, "getCanRepeatExpose", "setCanRepeatExpose", "children", "Lcom/dianping/shield/dynamic/model/view/TabViewInfo;", "getChildren", "setChildren", DMKeys.KEY_CONTENT_MARGIN_INFO, "Lcom/dianping/shield/dynamic/model/extra/MarginInfo;", "getContentMarginInfo", "()Lcom/dianping/shield/dynamic/model/extra/MarginInfo;", "setContentMarginInfo", "(Lcom/dianping/shield/dynamic/model/extra/MarginInfo;)V", DMKeys.KEY_DISAPPEAR_FROM_SCREEN_CALLBACK, "getDisappearFromScreenCallback", "setDisappearFromScreenCallback", DMKeys.KEY_TAB_ENABLE_HOVER, "getEnableHover", "setEnableHover", DMKeys.KEY_EXPOSE_CALLBACK, "getExposeCallback", "setExposeCallback", DMKeys.KEY_EXPOSE_DELAY, "getExposeDelay", "setExposeDelay", DMKeys.KEY_HOVER_OFFSET, "", "getHoverOffset", "()Ljava/lang/Float;", "setHoverOffset", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "hoverScrollEvent", "getHoverScrollEvent", "()Lcom/dianping/shield/dynamic/model/extra/ScrollEvent;", "setHoverScrollEvent", "(Lcom/dianping/shield/dynamic/model/extra/ScrollEvent;)V", DMKeys.KEY_TAB_INITIAL_SELECTED_INDEX, "getInitialSelectedIndex", "setInitialSelectedIndex", "isEqualized", "setEqualized", "isHoverTop", "setHoverTop", "maskView", "getMaskView", "setMaskView", "onHoverStatusChanged", "getOnHoverStatusChanged", "setOnHoverStatusChanged", DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN, "getOnMomentumScrollBegin", "setOnMomentumScrollBegin", DMKeys.KEY_ON_MOMENTUM_SCROLL_END, "getOnMomentumScrollEnd", "setOnMomentumScrollEnd", "onScroll", "getOnScroll", "setOnScroll", DMKeys.KEY_ON_SCROLL_BEGIN_DRAG, "getOnScrollBeginDrag", "setOnScrollBeginDrag", DMKeys.KEY_ON_SCROLL_END_DRAG, "getOnScrollEndDrag", "setOnScrollEndDrag", "onSelect", "getOnSelect", "setOnSelect", DMKeys.KEY_TAB_RATIO_FOR_SLIDE_BAR_WIDTH, "", "getRatioForSlideBarWidth", "()Ljava/lang/Double;", "setRatioForSlideBarWidth", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", DMKeys.KEY_THROTTLE, "getScrollEventThrottle", "setScrollEventThrottle", DMKeys.KEY_TAB_SELECT_INDEX, "getSelectIndex", "setSelectIndex", DMKeys.KEY_TAB_SELECTED_TEXT_SIZE, "getSelectedTextSize", "setSelectedTextSize", DMKeys.KEY_TAB_SELECTED_TITLE_COLOR, "getSelectedTitleColor", "setSelectedTitleColor", DMKeys.KEY_TAB_TITLE_SELECTED_STYLE, "getSelectedTitleFont", "setSelectedTitleFont", DMKeys.KEY_HOVER_SHOW_BOTTOM_LINE, "getShowBottomLine", "setShowBottomLine", DMKeys.KEY_HOVER_SHOW_SHADOW, "getShowShadow", "setShowShadow", DMKeys.KEY_HOVER_SHOW_TOP_LINE, "getShowTopLine", "setShowTopLine", "slideBar", "Lcom/dianping/shield/dynamic/model/view/ViewInfo;", "getSlideBar", "()Lcom/dianping/shield/dynamic/model/view/ViewInfo;", "setSlideBar", "(Lcom/dianping/shield/dynamic/model/view/ViewInfo;)V", DMKeys.KEY_TAB_SLIDEBAR_COLOR, "getSlideBarColor", "setSlideBarColor", DMKeys.KEY_SLIDE_BAR_GRADIENT_COLOR, "Lcom/dianping/shield/dynamic/model/extra/ColorUnionType$GradientColorInfo;", "getSlideBarGradientColor", "()Lcom/dianping/shield/dynamic/model/extra/ColorUnionType$GradientColorInfo;", "setSlideBarGradientColor", "(Lcom/dianping/shield/dynamic/model/extra/ColorUnionType$GradientColorInfo;)V", DMKeys.KEY_TAB_SLIDEBAR_HEIGHT, "getSlideBarHeight", "setSlideBarHeight", "slideBarIsAbove", "getSlideBarIsAbove", "setSlideBarIsAbove", DMKeys.KEY_TAB_SLIDE_BAR_IS_ROUNDED, "getSlideBarIsRounded", "setSlideBarIsRounded", "slideBarOffset", "getSlideBarOffset", "setSlideBarOffset", DMKeys.KEY_TAB_SLIDEBAR_WIDTH, "getSlideBarWidth", "setSlideBarWidth", DMKeys.KEY_TAB_SLIDE_BAR_WRAP, "getSlideBarWrapTitle", "setSlideBarWrapTitle", DMKeys.KEY_TAB_HEIGHT, "getTabHeight", "setTabHeight", DMKeys.KEY_TAB_WIDTH, "getTabWidth", "setTabWidth", DMKeys.KEY_TAB_TEXT_SIZE, "getTextSize", "setTextSize", "titleColor", "getTitleColor", "setTitleColor", "titleFont", "getTitleFont", "setTitleFont", DMKeys.KEY_XGAP, "getXGap", "setXGap", DMKeys.KEY_HOVER_Z_POSITION, "getZPosition", "setZPosition", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class TabCellInfo extends CellInfo.BaseCellInfo implements ExposeInfo, HoverInfo, ScrollEvent, TabInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private Boolean alwaysHover;
    @Nullable
    private String appearOnScreenCallback;
    @Nullable
    private Boolean autoContentMargin;
    @Nullable
    private Boolean autoOffset;
    @Nullable
    private Boolean autoStopHover;
    @Nullable
    private Integer autoStopHoverType;
    @Nullable
    private ExtraViewUnionType.ExtraViewInfo backgroundView;
    @Nullable
    private ArrayList<String> buttonTitles;
    @Nullable
    private Boolean canRepeatExpose;
    @Nullable
    private ArrayList<? super TabViewInfo> children;
    @Nullable
    private MarginInfo contentMarginInfo;
    @Nullable
    private String disappearFromScreenCallback;
    @Nullable
    private Boolean enableHover;
    @Nullable
    private String exposeCallback;
    @Nullable
    private Integer exposeDelay;
    @Nullable
    private Float hoverOffset;
    @Nullable
    private ScrollEvent hoverScrollEvent;
    @Nullable
    private Integer initialSelectedIndex;
    @Nullable
    private Boolean isEqualized;
    @Nullable
    private Boolean isHoverTop;
    @Nullable
    private ExtraViewUnionType.ExtraViewInfo maskView;
    @Nullable
    private String onHoverStatusChanged;
    @Nullable
    private String onMomentumScrollBegin;
    @Nullable
    private String onMomentumScrollEnd;
    @Nullable
    private String onScroll;
    @Nullable
    private String onScrollBeginDrag;
    @Nullable
    private String onScrollEndDrag;
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
    private Integer tabHeight;
    @Nullable
    private Integer tabWidth;
    @Nullable
    private Integer textSize;
    @Nullable
    private String titleColor;
    @Nullable
    private Integer titleFont;
    @Nullable
    private Integer xGap;
    @Nullable
    private Integer zPosition;

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    @Nullable
    public final Boolean isHoverTop() {
        return this.isHoverTop;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    public final void setHoverTop(@Nullable Boolean bool) {
        this.isHoverTop = bool;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ScrollEvent
    @Nullable
    public final String getOnScroll() {
        return this.onScroll;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ScrollEvent
    public final void setOnScroll(@Nullable String str) {
        this.onScroll = str;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ScrollEvent
    @Nullable
    public final String getOnMomentumScrollBegin() {
        return this.onMomentumScrollBegin;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ScrollEvent
    public final void setOnMomentumScrollBegin(@Nullable String str) {
        this.onMomentumScrollBegin = str;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ScrollEvent
    @Nullable
    public final String getOnMomentumScrollEnd() {
        return this.onMomentumScrollEnd;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ScrollEvent
    public final void setOnMomentumScrollEnd(@Nullable String str) {
        this.onMomentumScrollEnd = str;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ScrollEvent
    @Nullable
    public final String getOnScrollBeginDrag() {
        return this.onScrollBeginDrag;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ScrollEvent
    public final void setOnScrollBeginDrag(@Nullable String str) {
        this.onScrollBeginDrag = str;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ScrollEvent
    @Nullable
    public final String getOnScrollEndDrag() {
        return this.onScrollEndDrag;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ScrollEvent
    public final void setOnScrollEndDrag(@Nullable String str) {
        this.onScrollEndDrag = str;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ExposeInfo
    @Nullable
    public final Integer getExposeDelay() {
        return this.exposeDelay;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ExposeInfo
    public final void setExposeDelay(@Nullable Integer num) {
        this.exposeDelay = num;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ExposeInfo
    @Nullable
    public final Boolean getCanRepeatExpose() {
        return this.canRepeatExpose;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ExposeInfo
    public final void setCanRepeatExpose(@Nullable Boolean bool) {
        this.canRepeatExpose = bool;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ExposeInfo
    @Nullable
    public final String getExposeCallback() {
        return this.exposeCallback;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ExposeInfo
    public final void setExposeCallback(@Nullable String str) {
        this.exposeCallback = str;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ExposeInfo
    @Nullable
    public final String getAppearOnScreenCallback() {
        return this.appearOnScreenCallback;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ExposeInfo
    public final void setAppearOnScreenCallback(@Nullable String str) {
        this.appearOnScreenCallback = str;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ExposeInfo
    @Nullable
    public final String getDisappearFromScreenCallback() {
        return this.disappearFromScreenCallback;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ExposeInfo
    public final void setDisappearFromScreenCallback(@Nullable String str) {
        this.disappearFromScreenCallback = str;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public final ArrayList<? super TabViewInfo> getChildren() {
        return this.children;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public final void setChildren(@Nullable ArrayList<? super TabViewInfo> arrayList) {
        this.children = arrayList;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public final ExtraViewUnionType.ExtraViewInfo getBackgroundView() {
        return this.backgroundView;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public final void setBackgroundView(@Nullable ExtraViewUnionType.ExtraViewInfo extraViewInfo) {
        this.backgroundView = extraViewInfo;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public final ExtraViewUnionType.ExtraViewInfo getMaskView() {
        return this.maskView;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public final void setMaskView(@Nullable ExtraViewUnionType.ExtraViewInfo extraViewInfo) {
        this.maskView = extraViewInfo;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public final ViewInfo getSlideBar() {
        return this.slideBar;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public final void setSlideBar(@Nullable ViewInfo viewInfo) {
        this.slideBar = viewInfo;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public final Integer getTextSize() {
        return this.textSize;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public final void setTextSize(@Nullable Integer num) {
        this.textSize = num;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public final Integer getSelectedTextSize() {
        return this.selectedTextSize;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public final void setSelectedTextSize(@Nullable Integer num) {
        this.selectedTextSize = num;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public final String getTitleColor() {
        return this.titleColor;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public final void setTitleColor(@Nullable String str) {
        this.titleColor = str;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public final Integer getTitleFont() {
        return this.titleFont;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public final void setTitleFont(@Nullable Integer num) {
        this.titleFont = num;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public final Integer getSelectedTitleFont() {
        return this.selectedTitleFont;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public final void setSelectedTitleFont(@Nullable Integer num) {
        this.selectedTitleFont = num;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public final String getSelectedTitleColor() {
        return this.selectedTitleColor;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public final void setSelectedTitleColor(@Nullable String str) {
        this.selectedTitleColor = str;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public final Integer getTabWidth() {
        return this.tabWidth;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public final void setTabWidth(@Nullable Integer num) {
        this.tabWidth = num;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public final Integer getTabHeight() {
        return this.tabHeight;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public final void setTabHeight(@Nullable Integer num) {
        this.tabHeight = num;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public final Integer getXGap() {
        return this.xGap;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public final void setXGap(@Nullable Integer num) {
        this.xGap = num;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public final String getSlideBarColor() {
        return this.slideBarColor;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public final void setSlideBarColor(@Nullable String str) {
        this.slideBarColor = str;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public final ColorUnionType.GradientColorInfo getSlideBarGradientColor() {
        return this.slideBarGradientColor;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public final void setSlideBarGradientColor(@Nullable ColorUnionType.GradientColorInfo gradientColorInfo) {
        this.slideBarGradientColor = gradientColorInfo;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public final Integer getSlideBarWidth() {
        return this.slideBarWidth;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public final void setSlideBarWidth(@Nullable Integer num) {
        this.slideBarWidth = num;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public final Integer getSlideBarHeight() {
        return this.slideBarHeight;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public final void setSlideBarHeight(@Nullable Integer num) {
        this.slideBarHeight = num;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public final Boolean getSlideBarIsAbove() {
        return this.slideBarIsAbove;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public final void setSlideBarIsAbove(@Nullable Boolean bool) {
        this.slideBarIsAbove = bool;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public final Boolean getSlideBarIsRounded() {
        return this.slideBarIsRounded;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public final void setSlideBarIsRounded(@Nullable Boolean bool) {
        this.slideBarIsRounded = bool;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public final Double getRatioForSlideBarWidth() {
        return this.ratioForSlideBarWidth;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public final void setRatioForSlideBarWidth(@Nullable Double d) {
        this.ratioForSlideBarWidth = d;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public final Boolean getSlideBarWrapTitle() {
        return this.slideBarWrapTitle;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public final void setSlideBarWrapTitle(@Nullable Boolean bool) {
        this.slideBarWrapTitle = bool;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public final Integer getSlideBarOffset() {
        return this.slideBarOffset;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public final void setSlideBarOffset(@Nullable Integer num) {
        this.slideBarOffset = num;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public final Integer getSelectIndex() {
        return this.selectIndex;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public final void setSelectIndex(@Nullable Integer num) {
        this.selectIndex = num;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public final Boolean isEqualized() {
        return this.isEqualized;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public final void setEqualized(@Nullable Boolean bool) {
        this.isEqualized = bool;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    @Nullable
    public final String getOnSelect() {
        return this.onSelect;
    }

    @Override // com.dianping.shield.dynamic.model.view.TabInfo
    public final void setOnSelect(@Nullable String str) {
        this.onSelect = str;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    @Nullable
    public final Boolean getAlwaysHover() {
        return this.alwaysHover;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    public final void setAlwaysHover(@Nullable Boolean bool) {
        this.alwaysHover = bool;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    @Nullable
    public final Float getHoverOffset() {
        return this.hoverOffset;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    public final void setHoverOffset(@Nullable Float f) {
        this.hoverOffset = f;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    @Nullable
    public final Boolean getAutoOffset() {
        return this.autoOffset;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    public final void setAutoOffset(@Nullable Boolean bool) {
        this.autoOffset = bool;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    @Nullable
    public final Boolean getShowTopLine() {
        return this.showTopLine;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    public final void setShowTopLine(@Nullable Boolean bool) {
        this.showTopLine = bool;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    @Nullable
    public final Boolean getShowBottomLine() {
        return this.showBottomLine;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    public final void setShowBottomLine(@Nullable Boolean bool) {
        this.showBottomLine = bool;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    @Nullable
    public final Boolean getShowShadow() {
        return this.showShadow;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    public final void setShowShadow(@Nullable Boolean bool) {
        this.showShadow = bool;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    @Nullable
    public final Integer getZPosition() {
        return this.zPosition;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    public final void setZPosition(@Nullable Integer num) {
        this.zPosition = num;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    @Nullable
    public final Boolean getAutoStopHover() {
        return this.autoStopHover;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    public final void setAutoStopHover(@Nullable Boolean bool) {
        this.autoStopHover = bool;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    @Nullable
    public final Integer getAutoStopHoverType() {
        return this.autoStopHoverType;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    public final void setAutoStopHoverType(@Nullable Integer num) {
        this.autoStopHoverType = num;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    @Nullable
    public final String getOnHoverStatusChanged() {
        return this.onHoverStatusChanged;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    public final void setOnHoverStatusChanged(@Nullable String str) {
        this.onHoverStatusChanged = str;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ScrollEvent
    @Nullable
    public final Integer getScrollEventThrottle() {
        return this.scrollEventThrottle;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ScrollEvent
    public final void setScrollEventThrottle(@Nullable Integer num) {
        this.scrollEventThrottle = num;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    @Nullable
    public final ScrollEvent getHoverScrollEvent() {
        return this.hoverScrollEvent;
    }

    @Override // com.dianping.shield.dynamic.model.extra.HoverInfo
    public final void setHoverScrollEvent(@Nullable ScrollEvent scrollEvent) {
        this.hoverScrollEvent = scrollEvent;
    }

    @Nullable
    public final MarginInfo getContentMarginInfo() {
        return this.contentMarginInfo;
    }

    public final void setContentMarginInfo(@Nullable MarginInfo marginInfo) {
        this.contentMarginInfo = marginInfo;
    }

    @Nullable
    public final Boolean getAutoContentMargin() {
        return this.autoContentMargin;
    }

    public final void setAutoContentMargin(@Nullable Boolean bool) {
        this.autoContentMargin = bool;
    }

    @Nullable
    public final ArrayList<String> getButtonTitles() {
        return this.buttonTitles;
    }

    public final void setButtonTitles(@Nullable ArrayList<String> arrayList) {
        this.buttonTitles = arrayList;
    }

    @Nullable
    public final Integer getInitialSelectedIndex() {
        return this.initialSelectedIndex;
    }

    public final void setInitialSelectedIndex(@Nullable Integer num) {
        this.initialSelectedIndex = num;
    }

    @Nullable
    public final Boolean getEnableHover() {
        return this.enableHover;
    }

    public final void setEnableHover(@Nullable Boolean bool) {
        this.enableHover = bool;
    }
}
