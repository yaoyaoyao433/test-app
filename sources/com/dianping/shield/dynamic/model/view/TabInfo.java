package com.dianping.shield.dynamic.model.view;

import com.dianping.shield.dynamic.model.DiffableInfo;
import com.dianping.shield.dynamic.model.extra.ColorUnionType;
import com.dianping.shield.dynamic.model.view.ExtraViewUnionType;
import com.dianping.shield.dynamic.utils.DMKeys;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b)\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R0\u0010\b\u001a\u001a\u0012\u0006\b\u0000\u0012\u00020\n\u0018\u00010\tj\f\u0012\u0006\b\u0000\u0012\u00020\n\u0018\u0001`\u000bX¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u0011X¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0005\"\u0004\b\u0017\u0010\u0007R\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u0019X¦\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u001fX¦\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u0004\u0018\u00010%X¦\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u0004\u0018\u00010%X¦\u000e¢\u0006\f\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R\u001a\u0010-\u001a\u0004\u0018\u00010\u0019X¦\u000e¢\u0006\f\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u0010\u001dR\u001a\u00100\u001a\u0004\u0018\u00010%X¦\u000e¢\u0006\f\u001a\u0004\b1\u0010'\"\u0004\b2\u0010)R\u001a\u00103\u001a\u0004\u0018\u000104X¦\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u00109\u001a\u0004\u0018\u00010\u0019X¦\u000e¢\u0006\f\u001a\u0004\b:\u0010\u001b\"\u0004\b;\u0010\u001dR\u001a\u0010<\u001a\u0004\u0018\u00010=X¦\u000e¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001a\u0010B\u001a\u0004\u0018\u00010%X¦\u000e¢\u0006\f\u001a\u0004\bC\u0010'\"\u0004\bD\u0010)R\u001a\u0010E\u001a\u0004\u0018\u00010\u0011X¦\u000e¢\u0006\f\u001a\u0004\bF\u0010\u0012\"\u0004\bG\u0010\u0014R\u001a\u0010H\u001a\u0004\u0018\u00010\u0011X¦\u000e¢\u0006\f\u001a\u0004\bI\u0010\u0012\"\u0004\bJ\u0010\u0014R\u001a\u0010K\u001a\u0004\u0018\u00010%X¦\u000e¢\u0006\f\u001a\u0004\bL\u0010'\"\u0004\bM\u0010)R\u001a\u0010N\u001a\u0004\u0018\u00010%X¦\u000e¢\u0006\f\u001a\u0004\bO\u0010'\"\u0004\bP\u0010)R\u001a\u0010Q\u001a\u0004\u0018\u00010\u0011X¦\u000e¢\u0006\f\u001a\u0004\bR\u0010\u0012\"\u0004\bS\u0010\u0014R\u001a\u0010T\u001a\u0004\u0018\u00010%X¦\u000e¢\u0006\f\u001a\u0004\bU\u0010'\"\u0004\bV\u0010)R\u001a\u0010W\u001a\u0004\u0018\u00010%X¦\u000e¢\u0006\f\u001a\u0004\bX\u0010'\"\u0004\bY\u0010)R\u001a\u0010Z\u001a\u0004\u0018\u00010%X¦\u000e¢\u0006\f\u001a\u0004\b[\u0010'\"\u0004\b\\\u0010)R\u001a\u0010]\u001a\u0004\u0018\u00010\u0019X¦\u000e¢\u0006\f\u001a\u0004\b^\u0010\u001b\"\u0004\b_\u0010\u001dR\u001a\u0010`\u001a\u0004\u0018\u00010%X¦\u000e¢\u0006\f\u001a\u0004\ba\u0010'\"\u0004\bb\u0010)R\u001a\u0010c\u001a\u0004\u0018\u00010%X¦\u000e¢\u0006\f\u001a\u0004\bd\u0010'\"\u0004\be\u0010)¨\u0006f"}, d2 = {"Lcom/dianping/shield/dynamic/model/view/TabInfo;", "Lcom/dianping/shield/dynamic/model/DiffableInfo;", "backgroundView", "Lcom/dianping/shield/dynamic/model/view/ExtraViewUnionType$ExtraViewInfo;", "getBackgroundView", "()Lcom/dianping/shield/dynamic/model/view/ExtraViewUnionType$ExtraViewInfo;", "setBackgroundView", "(Lcom/dianping/shield/dynamic/model/view/ExtraViewUnionType$ExtraViewInfo;)V", "children", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/model/view/TabViewInfo;", "Lkotlin/collections/ArrayList;", "getChildren", "()Ljava/util/ArrayList;", "setChildren", "(Ljava/util/ArrayList;)V", "isEqualized", "", "()Ljava/lang/Boolean;", "setEqualized", "(Ljava/lang/Boolean;)V", "maskView", "getMaskView", "setMaskView", "onSelect", "", "getOnSelect", "()Ljava/lang/String;", "setOnSelect", "(Ljava/lang/String;)V", DMKeys.KEY_TAB_RATIO_FOR_SLIDE_BAR_WIDTH, "", "getRatioForSlideBarWidth", "()Ljava/lang/Double;", "setRatioForSlideBarWidth", "(Ljava/lang/Double;)V", DMKeys.KEY_TAB_SELECT_INDEX, "", "getSelectIndex", "()Ljava/lang/Integer;", "setSelectIndex", "(Ljava/lang/Integer;)V", DMKeys.KEY_TAB_SELECTED_TEXT_SIZE, "getSelectedTextSize", "setSelectedTextSize", DMKeys.KEY_TAB_SELECTED_TITLE_COLOR, "getSelectedTitleColor", "setSelectedTitleColor", DMKeys.KEY_TAB_TITLE_SELECTED_STYLE, "getSelectedTitleFont", "setSelectedTitleFont", "slideBar", "Lcom/dianping/shield/dynamic/model/view/ViewInfo;", "getSlideBar", "()Lcom/dianping/shield/dynamic/model/view/ViewInfo;", "setSlideBar", "(Lcom/dianping/shield/dynamic/model/view/ViewInfo;)V", DMKeys.KEY_TAB_SLIDEBAR_COLOR, "getSlideBarColor", "setSlideBarColor", DMKeys.KEY_SLIDE_BAR_GRADIENT_COLOR, "Lcom/dianping/shield/dynamic/model/extra/ColorUnionType$GradientColorInfo;", "getSlideBarGradientColor", "()Lcom/dianping/shield/dynamic/model/extra/ColorUnionType$GradientColorInfo;", "setSlideBarGradientColor", "(Lcom/dianping/shield/dynamic/model/extra/ColorUnionType$GradientColorInfo;)V", DMKeys.KEY_TAB_SLIDEBAR_HEIGHT, "getSlideBarHeight", "setSlideBarHeight", "slideBarIsAbove", "getSlideBarIsAbove", "setSlideBarIsAbove", DMKeys.KEY_TAB_SLIDE_BAR_IS_ROUNDED, "getSlideBarIsRounded", "setSlideBarIsRounded", "slideBarOffset", "getSlideBarOffset", "setSlideBarOffset", DMKeys.KEY_TAB_SLIDEBAR_WIDTH, "getSlideBarWidth", "setSlideBarWidth", DMKeys.KEY_TAB_SLIDE_BAR_WRAP, "getSlideBarWrapTitle", "setSlideBarWrapTitle", DMKeys.KEY_TAB_HEIGHT, "getTabHeight", "setTabHeight", DMKeys.KEY_TAB_WIDTH, "getTabWidth", "setTabWidth", DMKeys.KEY_TAB_TEXT_SIZE, "getTextSize", "setTextSize", "titleColor", "getTitleColor", "setTitleColor", "titleFont", "getTitleFont", "setTitleFont", DMKeys.KEY_XGAP, "getXGap", "setXGap", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface TabInfo extends DiffableInfo {
    @Nullable
    ExtraViewUnionType.ExtraViewInfo getBackgroundView();

    @Nullable
    ArrayList<? super TabViewInfo> getChildren();

    @Nullable
    ExtraViewUnionType.ExtraViewInfo getMaskView();

    @Nullable
    String getOnSelect();

    @Nullable
    Double getRatioForSlideBarWidth();

    @Nullable
    Integer getSelectIndex();

    @Nullable
    Integer getSelectedTextSize();

    @Nullable
    String getSelectedTitleColor();

    @Nullable
    Integer getSelectedTitleFont();

    @Nullable
    ViewInfo getSlideBar();

    @Nullable
    String getSlideBarColor();

    @Nullable
    ColorUnionType.GradientColorInfo getSlideBarGradientColor();

    @Nullable
    Integer getSlideBarHeight();

    @Nullable
    Boolean getSlideBarIsAbove();

    @Nullable
    Boolean getSlideBarIsRounded();

    @Nullable
    Integer getSlideBarOffset();

    @Nullable
    Integer getSlideBarWidth();

    @Nullable
    Boolean getSlideBarWrapTitle();

    @Nullable
    Integer getTabHeight();

    @Nullable
    Integer getTabWidth();

    @Nullable
    Integer getTextSize();

    @Nullable
    String getTitleColor();

    @Nullable
    Integer getTitleFont();

    @Nullable
    Integer getXGap();

    @Nullable
    Boolean isEqualized();

    void setBackgroundView(@Nullable ExtraViewUnionType.ExtraViewInfo extraViewInfo);

    void setChildren(@Nullable ArrayList<? super TabViewInfo> arrayList);

    void setEqualized(@Nullable Boolean bool);

    void setMaskView(@Nullable ExtraViewUnionType.ExtraViewInfo extraViewInfo);

    void setOnSelect(@Nullable String str);

    void setRatioForSlideBarWidth(@Nullable Double d);

    void setSelectIndex(@Nullable Integer num);

    void setSelectedTextSize(@Nullable Integer num);

    void setSelectedTitleColor(@Nullable String str);

    void setSelectedTitleFont(@Nullable Integer num);

    void setSlideBar(@Nullable ViewInfo viewInfo);

    void setSlideBarColor(@Nullable String str);

    void setSlideBarGradientColor(@Nullable ColorUnionType.GradientColorInfo gradientColorInfo);

    void setSlideBarHeight(@Nullable Integer num);

    void setSlideBarIsAbove(@Nullable Boolean bool);

    void setSlideBarIsRounded(@Nullable Boolean bool);

    void setSlideBarOffset(@Nullable Integer num);

    void setSlideBarWidth(@Nullable Integer num);

    void setSlideBarWrapTitle(@Nullable Boolean bool);

    void setTabHeight(@Nullable Integer num);

    void setTabWidth(@Nullable Integer num);

    void setTextSize(@Nullable Integer num);

    void setTitleColor(@Nullable String str);

    void setTitleFont(@Nullable Integer num);

    void setXGap(@Nullable Integer num);
}
