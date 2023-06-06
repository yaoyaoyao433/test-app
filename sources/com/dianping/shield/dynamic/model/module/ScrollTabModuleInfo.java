package com.dianping.shield.dynamic.model.module;

import com.dianping.shield.dynamic.model.extra.ColorUnionType;
import com.dianping.shield.dynamic.model.extra.ScrollEvent;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u000eX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b \u0010\u0010\"\u0004\b!\u0010\u0012R\u001e\u0010\"\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\bR\u001c\u0010%\u001a\u0004\u0018\u00010\u0015X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0017\"\u0004\b'\u0010\u0019R\u001c\u0010(\u001a\u0004\u0018\u00010\u0015X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0017\"\u0004\b*\u0010\u0019R\u001c\u0010+\u001a\u0004\u0018\u00010\u0015X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0017\"\u0004\b-\u0010\u0019R\u001c\u0010.\u001a\u0004\u0018\u00010\u0015X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0017\"\u0004\b0\u0010\u0019R\u001c\u00101\u001a\u0004\u0018\u00010\u0015X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0017\"\u0004\b3\u0010\u0019R\u001c\u00104\u001a\u0004\u0018\u000105X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001c\u0010:\u001a\u0004\u0018\u00010;X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001e\u0010@\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\bA\u0010\u0006\"\u0004\bB\u0010\bR\u001c\u0010C\u001a\u0004\u0018\u00010;X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010=\"\u0004\bE\u0010?R\u001e\u0010F\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\bG\u0010\u0006\"\u0004\bH\u0010\b¨\u0006I"}, d2 = {"Lcom/dianping/shield/dynamic/model/module/ScrollTabModuleInfo;", "Lcom/dianping/shield/dynamic/model/module/BaseTabModuleInfo;", "()V", "bottomOffset", "", "getBottomOffset", "()Ljava/lang/Integer;", "setBottomOffset", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", DMKeys.KEY_TAB_CONTENT_BACKGROUND_COLOR, "getContentBackgroundColor", "setContentBackgroundColor", DMKeys.KEY_TAB_DISABLE_HORIZONTAL_SCROLL, "", "getDisableHorizontalScroll", "()Ljava/lang/Boolean;", "setDisableHorizontalScroll", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "identifier", "", "getIdentifier", "()Ljava/lang/String;", "setIdentifier", "(Ljava/lang/String;)V", DMKeys.KEY_TAB_INDEPENDENT_WHITEBOARD, "getIndependentWhiteBoard", "setIndependentWhiteBoard", "isHoverTop", "setHoverTop", DMKeys.KEY_TAB_LAZY_LOAD, "getLazyLoad", "setLazyLoad", DMKeys.KEY_TAB_MAX_LOADED_TAB_COUNT, "getMaxLoadedTabCount", "setMaxLoadedTabCount", DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN, "getOnMomentumScrollBegin", "setOnMomentumScrollBegin", DMKeys.KEY_ON_MOMENTUM_SCROLL_END, "getOnMomentumScrollEnd", "setOnMomentumScrollEnd", "onScroll", "getOnScroll", "setOnScroll", DMKeys.KEY_ON_SCROLL_BEGIN_DRAG, "getOnScrollBeginDrag", "setOnScrollBeginDrag", DMKeys.KEY_ON_SCROLL_END_DRAG, "getOnScrollEndDrag", "setOnScrollEndDrag", "pageChangeScrollEvent", "Lcom/dianping/shield/dynamic/model/extra/ScrollEvent;", "getPageChangeScrollEvent", "()Lcom/dianping/shield/dynamic/model/extra/ScrollEvent;", "setPageChangeScrollEvent", "(Lcom/dianping/shield/dynamic/model/extra/ScrollEvent;)V", DMKeys.KEY_SECTION_FOOTER_BACKGROUND_COLOR, "Lcom/dianping/shield/dynamic/model/extra/ColorUnionType;", "getSectionFooterBackgroundColor", "()Lcom/dianping/shield/dynamic/model/extra/ColorUnionType;", "setSectionFooterBackgroundColor", "(Lcom/dianping/shield/dynamic/model/extra/ColorUnionType;)V", "sectionFooterHeight", "getSectionFooterHeight", "setSectionFooterHeight", DMKeys.KEY_SECTION_HEADER_BACKGROUND_COLOR, "getSectionHeaderBackgroundColor", "setSectionHeaderBackgroundColor", "sectionHeaderHeight", "getSectionHeaderHeight", "setSectionHeaderHeight", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ScrollTabModuleInfo extends BaseTabModuleInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private Integer bottomOffset;
    @Nullable
    private Integer contentBackgroundColor;
    @Nullable
    private Boolean disableHorizontalScroll;
    @Nullable
    private String identifier;
    @Nullable
    private Boolean independentWhiteBoard;
    @Nullable
    private Boolean isHoverTop;
    @Nullable
    private Boolean lazyLoad;
    @Nullable
    private Integer maxLoadedTabCount;
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
    private ScrollEvent pageChangeScrollEvent;
    @Nullable
    private ColorUnionType sectionFooterBackgroundColor;
    @Nullable
    private Integer sectionFooterHeight;
    @Nullable
    private ColorUnionType sectionHeaderBackgroundColor;
    @Nullable
    private Integer sectionHeaderHeight;

    @Override // com.dianping.shield.dynamic.model.DiffableInfo
    @Nullable
    public final String getIdentifier() {
        return this.identifier;
    }

    @Override // com.dianping.shield.dynamic.model.DiffableInfo
    public final void setIdentifier(@Nullable String str) {
        this.identifier = str;
    }

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

    @Nullable
    public final Integer getContentBackgroundColor() {
        return this.contentBackgroundColor;
    }

    public final void setContentBackgroundColor(@Nullable Integer num) {
        this.contentBackgroundColor = num;
    }

    @Nullable
    public final Boolean getLazyLoad() {
        return this.lazyLoad;
    }

    public final void setLazyLoad(@Nullable Boolean bool) {
        this.lazyLoad = bool;
    }

    @Nullable
    public final Boolean getIndependentWhiteBoard() {
        return this.independentWhiteBoard;
    }

    public final void setIndependentWhiteBoard(@Nullable Boolean bool) {
        this.independentWhiteBoard = bool;
    }

    @Nullable
    public final Integer getMaxLoadedTabCount() {
        return this.maxLoadedTabCount;
    }

    public final void setMaxLoadedTabCount(@Nullable Integer num) {
        this.maxLoadedTabCount = num;
    }

    @Nullable
    public final Boolean getDisableHorizontalScroll() {
        return this.disableHorizontalScroll;
    }

    public final void setDisableHorizontalScroll(@Nullable Boolean bool) {
        this.disableHorizontalScroll = bool;
    }

    @Nullable
    public final Integer getBottomOffset() {
        return this.bottomOffset;
    }

    public final void setBottomOffset(@Nullable Integer num) {
        this.bottomOffset = num;
    }

    @Nullable
    public final ScrollEvent getPageChangeScrollEvent() {
        return this.pageChangeScrollEvent;
    }

    public final void setPageChangeScrollEvent(@Nullable ScrollEvent scrollEvent) {
        this.pageChangeScrollEvent = scrollEvent;
    }

    @Nullable
    public final Integer getSectionHeaderHeight() {
        return this.sectionHeaderHeight;
    }

    public final void setSectionHeaderHeight(@Nullable Integer num) {
        this.sectionHeaderHeight = num;
    }

    @Nullable
    public final Integer getSectionFooterHeight() {
        return this.sectionFooterHeight;
    }

    public final void setSectionFooterHeight(@Nullable Integer num) {
        this.sectionFooterHeight = num;
    }

    @Nullable
    public final ColorUnionType getSectionHeaderBackgroundColor() {
        return this.sectionHeaderBackgroundColor;
    }

    public final void setSectionHeaderBackgroundColor(@Nullable ColorUnionType colorUnionType) {
        this.sectionHeaderBackgroundColor = colorUnionType;
    }

    @Nullable
    public final ColorUnionType getSectionFooterBackgroundColor() {
        return this.sectionFooterBackgroundColor;
    }

    public final void setSectionFooterBackgroundColor(@Nullable ColorUnionType colorUnionType) {
        this.sectionFooterBackgroundColor = colorUnionType;
    }
}
