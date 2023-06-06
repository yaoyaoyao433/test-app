package com.dianping.shield.dynamic.model.module;

import com.dianping.shield.dynamic.model.DiffableInfo;
import com.dianping.shield.dynamic.model.extra.ColorUnionType;
import com.dianping.shield.dynamic.model.extra.MGEInfo;
import com.dianping.shield.dynamic.model.section.SectionInfo;
import com.dianping.shield.dynamic.model.view.HoverViewInfo;
import com.dianping.shield.dynamic.model.view.PopViewInfo;
import com.dianping.shield.dynamic.model.view.ViewInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR.\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001`\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010'\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u0010\n\u0002\u0010,\u001a\u0004\b'\u0010)\"\u0004\b*\u0010+R\u001e\u0010-\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u0010\n\u0002\u0010,\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+R\u001e\u0010/\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u0010\n\u0002\u0010,\u001a\u0004\b/\u0010)\"\u0004\b0\u0010+R\u001e\u00101\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b2\u0010\u0006\"\u0004\b3\u0010\bR\u001c\u00104\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001e\"\u0004\b6\u0010 R\u001c\u00107\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u001e\"\u0004\b9\u0010 R\u001e\u0010:\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b;\u0010\u0006\"\u0004\b<\u0010\bR\u001c\u0010=\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u001e\"\u0004\b?\u0010 R\u001e\u0010@\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\bA\u0010\u0006\"\u0004\bB\u0010\bR\u001c\u0010C\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u001e\"\u0004\bE\u0010 R\u001c\u0010F\u001a\u0004\u0018\u00010GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001c\u0010L\u001a\u0004\u0018\u00010MX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001e\u0010R\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\bS\u0010\u0006\"\u0004\bT\u0010\bR\u001c\u0010U\u001a\u0004\u0018\u00010MX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010O\"\u0004\bW\u0010QR\u001e\u0010X\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\bY\u0010\u0006\"\u0004\bZ\u0010\bR:\u0010[\u001a\"\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020]\u0018\u00010\\j\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020]\u0018\u0001`^X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u001c\u0010c\u001a\u0004\u0018\u00010dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010f\"\u0004\bg\u0010h¨\u0006i"}, d2 = {"Lcom/dianping/shield/dynamic/model/module/BaseModuleInfo;", "Lcom/dianping/shield/dynamic/model/DiffableInfo;", "()V", "animationType", "", "getAnimationType", "()Ljava/lang/Integer;", "setAnimationType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", DMKeys.KEY_AUTO_EXPOSE_VIEW_TYPE, "getAutoExposeViewType", "setAutoExposeViewType", "children", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/model/section/SectionInfo;", "Lkotlin/collections/ArrayList;", "getChildren", "()Ljava/util/ArrayList;", "setChildren", "(Ljava/util/ArrayList;)V", DMKeys.KEY_EMPTY_MESSAGE, "", "getEmptyMessage", "()Ljava/lang/String;", "setEmptyMessage", "(Ljava/lang/String;)V", "emptyView", "Lcom/dianping/shield/dynamic/model/view/ViewInfo;", "getEmptyView", "()Lcom/dianping/shield/dynamic/model/view/ViewInfo;", "setEmptyView", "(Lcom/dianping/shield/dynamic/model/view/ViewInfo;)V", "hoverView", "Lcom/dianping/shield/dynamic/model/view/HoverViewInfo;", "getHoverView", "()Lcom/dianping/shield/dynamic/model/view/HoverViewInfo;", "setHoverView", "(Lcom/dianping/shield/dynamic/model/view/HoverViewInfo;)V", DMKeys.KEY_IS_EMPTY, "", "()Ljava/lang/Boolean;", "setEmpty", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", DMKeys.KEY_HIDE_LOADING_MORE_VIEW_BACKGROUND, "setLoadingMoreCellHideBackground", DMKeys.KEY_HIDE_LOADING_MORE_FAIL_VIEW_BACKGROUND, "setLoadingMoreFailCellHideBackground", "linkType", "getLinkType", "setLinkType", "loadingFailView", "getLoadingFailView", "setLoadingFailView", "loadingMoreFailView", "getLoadingMoreFailView", "setLoadingMoreFailView", DMKeys.KEY_LOADING_MORE_STATUS, "getLoadingMoreStatus", "setLoadingMoreStatus", "loadingMoreView", "getLoadingMoreView", "setLoadingMoreView", "loadingStatus", "getLoadingStatus", "setLoadingStatus", "loadingView", "getLoadingView", "setLoadingView", "popView", "Lcom/dianping/shield/dynamic/model/view/PopViewInfo;", "getPopView", "()Lcom/dianping/shield/dynamic/model/view/PopViewInfo;", "setPopView", "(Lcom/dianping/shield/dynamic/model/view/PopViewInfo;)V", DMKeys.KEY_SECTION_FOOTER_BACKGROUND_COLOR, "Lcom/dianping/shield/dynamic/model/extra/ColorUnionType;", "getSectionFooterBackgroundColor", "()Lcom/dianping/shield/dynamic/model/extra/ColorUnionType;", "setSectionFooterBackgroundColor", "(Lcom/dianping/shield/dynamic/model/extra/ColorUnionType;)V", "sectionFooterHeight", "getSectionFooterHeight", "setSectionFooterHeight", DMKeys.KEY_SECTION_HEADER_BACKGROUND_COLOR, "getSectionHeaderBackgroundColor", "setSectionHeaderBackgroundColor", "sectionHeaderHeight", "getSectionHeaderHeight", "setSectionHeaderHeight", "skeletonInfo", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getSkeletonInfo", "()Ljava/util/HashMap;", "setSkeletonInfo", "(Ljava/util/HashMap;)V", DMKeys.KEY_VIEW_MGE_INFO, "Lcom/dianping/shield/dynamic/model/extra/MGEInfo;", "getViewMgeInfo", "()Lcom/dianping/shield/dynamic/model/extra/MGEInfo;", "setViewMgeInfo", "(Lcom/dianping/shield/dynamic/model/extra/MGEInfo;)V", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public abstract class BaseModuleInfo implements DiffableInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private Integer animationType;
    @Nullable
    private Integer autoExposeViewType;
    @Nullable
    private ArrayList<SectionInfo> children;
    @Nullable
    private String emptyMessage;
    @Nullable
    private ViewInfo emptyView;
    @Nullable
    private HoverViewInfo hoverView;
    @Nullable
    private Boolean isEmpty;
    @Nullable
    private Boolean isLoadingMoreCellHideBackground;
    @Nullable
    private Boolean isLoadingMoreFailCellHideBackground;
    @Nullable
    private Integer linkType;
    @Nullable
    private ViewInfo loadingFailView;
    @Nullable
    private ViewInfo loadingMoreFailView;
    @Nullable
    private Integer loadingMoreStatus;
    @Nullable
    private ViewInfo loadingMoreView;
    @Nullable
    private Integer loadingStatus;
    @Nullable
    private ViewInfo loadingView;
    @Nullable
    private PopViewInfo popView;
    @Nullable
    private ColorUnionType sectionFooterBackgroundColor;
    @Nullable
    private Integer sectionFooterHeight;
    @Nullable
    private ColorUnionType sectionHeaderBackgroundColor;
    @Nullable
    private Integer sectionHeaderHeight;
    @Nullable
    private HashMap<String, Object> skeletonInfo;
    @Nullable
    private MGEInfo viewMgeInfo;

    @Nullable
    public final ArrayList<SectionInfo> getChildren() {
        return this.children;
    }

    public final void setChildren(@Nullable ArrayList<SectionInfo> arrayList) {
        this.children = arrayList;
    }

    @Nullable
    public final HoverViewInfo getHoverView() {
        return this.hoverView;
    }

    public final void setHoverView(@Nullable HoverViewInfo hoverViewInfo) {
        this.hoverView = hoverViewInfo;
    }

    @Nullable
    public final PopViewInfo getPopView() {
        return this.popView;
    }

    public final void setPopView(@Nullable PopViewInfo popViewInfo) {
        this.popView = popViewInfo;
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
    public final Integer getLinkType() {
        return this.linkType;
    }

    public final void setLinkType(@Nullable Integer num) {
        this.linkType = num;
    }

    @Nullable
    public final Integer getLoadingStatus() {
        return this.loadingStatus;
    }

    public final void setLoadingStatus(@Nullable Integer num) {
        this.loadingStatus = num;
    }

    @Nullable
    public final Integer getLoadingMoreStatus() {
        return this.loadingMoreStatus;
    }

    public final void setLoadingMoreStatus(@Nullable Integer num) {
        this.loadingMoreStatus = num;
    }

    @Nullable
    public final Boolean isEmpty() {
        return this.isEmpty;
    }

    public final void setEmpty(@Nullable Boolean bool) {
        this.isEmpty = bool;
    }

    @Nullable
    public final String getEmptyMessage() {
        return this.emptyMessage;
    }

    public final void setEmptyMessage(@Nullable String str) {
        this.emptyMessage = str;
    }

    @Nullable
    public final MGEInfo getViewMgeInfo() {
        return this.viewMgeInfo;
    }

    public final void setViewMgeInfo(@Nullable MGEInfo mGEInfo) {
        this.viewMgeInfo = mGEInfo;
    }

    @Nullable
    public final Integer getAnimationType() {
        return this.animationType;
    }

    public final void setAnimationType(@Nullable Integer num) {
        this.animationType = num;
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

    @Nullable
    public final Boolean isLoadingMoreCellHideBackground() {
        return this.isLoadingMoreCellHideBackground;
    }

    public final void setLoadingMoreCellHideBackground(@Nullable Boolean bool) {
        this.isLoadingMoreCellHideBackground = bool;
    }

    @Nullable
    public final Boolean isLoadingMoreFailCellHideBackground() {
        return this.isLoadingMoreFailCellHideBackground;
    }

    public final void setLoadingMoreFailCellHideBackground(@Nullable Boolean bool) {
        this.isLoadingMoreFailCellHideBackground = bool;
    }

    @Nullable
    public final Integer getAutoExposeViewType() {
        return this.autoExposeViewType;
    }

    public final void setAutoExposeViewType(@Nullable Integer num) {
        this.autoExposeViewType = num;
    }

    @Nullable
    public final ViewInfo getLoadingView() {
        return this.loadingView;
    }

    public final void setLoadingView(@Nullable ViewInfo viewInfo) {
        this.loadingView = viewInfo;
    }

    @Nullable
    public final ViewInfo getLoadingFailView() {
        return this.loadingFailView;
    }

    public final void setLoadingFailView(@Nullable ViewInfo viewInfo) {
        this.loadingFailView = viewInfo;
    }

    @Nullable
    public final ViewInfo getLoadingMoreView() {
        return this.loadingMoreView;
    }

    public final void setLoadingMoreView(@Nullable ViewInfo viewInfo) {
        this.loadingMoreView = viewInfo;
    }

    @Nullable
    public final ViewInfo getLoadingMoreFailView() {
        return this.loadingMoreFailView;
    }

    public final void setLoadingMoreFailView(@Nullable ViewInfo viewInfo) {
        this.loadingMoreFailView = viewInfo;
    }

    @Nullable
    public final ViewInfo getEmptyView() {
        return this.emptyView;
    }

    public final void setEmptyView(@Nullable ViewInfo viewInfo) {
        this.emptyView = viewInfo;
    }

    @Nullable
    public final HashMap<String, Object> getSkeletonInfo() {
        return this.skeletonInfo;
    }

    public final void setSkeletonInfo(@Nullable HashMap<String, Object> hashMap) {
        this.skeletonInfo = hashMap;
    }
}
