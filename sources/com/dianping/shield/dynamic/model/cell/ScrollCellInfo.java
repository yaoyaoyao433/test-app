package com.dianping.shield.dynamic.model.cell;

import com.dianping.shield.dynamic.model.cell.CellInfo;
import com.dianping.shield.dynamic.model.extra.ExposeInfo;
import com.dianping.shield.dynamic.model.extra.MarginInfo;
import com.dianping.shield.dynamic.model.extra.ScrollEvent;
import com.dianping.shield.dynamic.model.view.ExtraViewUnionType;
import com.dianping.shield.dynamic.model.view.ScrollCellAttachViewInfo;
import com.dianping.shield.dynamic.model.view.ViewInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\bG\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B#\u0012\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007¢\u0006\u0002\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010#\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b$\u0010\u0012\"\u0004\b%\u0010\u0014R\u001c\u0010&\u001a\u0004\u0018\u00010'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010,\u001a\u0004\u0018\u00010\u001dX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b-\u0010\u001f\"\u0004\b.\u0010!R.\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u0010\bR\u001e\u00102\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b3\u0010\u0012\"\u0004\b4\u0010\u0014R\u001c\u00105\u001a\u0004\u0018\u000106X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001c\u0010;\u001a\u0004\u0018\u00010\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\f\"\u0004\b=\u0010\u000eR\u001e\u0010>\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b?\u0010\u001f\"\u0004\b@\u0010!R\u001e\u0010A\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\bB\u0010\u001f\"\u0004\bC\u0010!R\u001c\u0010D\u001a\u0004\u0018\u00010\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\f\"\u0004\bF\u0010\u000eR\u001e\u0010G\u001a\u0004\u0018\u00010\u0010X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\bH\u0010\u0012\"\u0004\bI\u0010\u0014R\u001e\u0010J\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\bK\u0010\u0012\"\u0004\bL\u0010\u0014R\u001c\u0010M\u001a\u0004\u0018\u00010'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010)\"\u0004\bO\u0010+R\u001c\u0010P\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\f\"\u0004\bR\u0010\u000eR\u001c\u0010S\u001a\u0004\u0018\u00010\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\f\"\u0004\bU\u0010\u000eR\u001c\u0010V\u001a\u0004\u0018\u00010\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\f\"\u0004\bX\u0010\u000eR\u001c\u0010Y\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010\f\"\u0004\b[\u0010\u000eR\u001c\u0010\\\u001a\u0004\u0018\u00010\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010\f\"\u0004\b^\u0010\u000eR\u001c\u0010_\u001a\u0004\u0018\u00010\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010\f\"\u0004\ba\u0010\u000eR\u001c\u0010b\u001a\u0004\u0018\u00010\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010\f\"\u0004\bd\u0010\u000eR\u001e\u0010e\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\bf\u0010\u0012\"\u0004\bg\u0010\u0014R\u001e\u0010h\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\bi\u0010\u0012\"\u0004\bj\u0010\u0014R\u001e\u0010k\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\bl\u0010\u0012\"\u0004\bm\u0010\u0014R\u001e\u0010n\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\bo\u0010\u001f\"\u0004\bp\u0010!R\u001e\u0010q\u001a\u0004\u0018\u00010\u0010X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\br\u0010\u0012\"\u0004\bs\u0010\u0014R\u001e\u0010t\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\bu\u0010\u0012\"\u0004\bv\u0010\u0014R\u001e\u0010w\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\bx\u0010\u0012\"\u0004\by\u0010\u0014R\u001e\u0010z\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b{\u0010\u0012\"\u0004\b|\u0010\u0014¨\u0006}"}, d2 = {"Lcom/dianping/shield/dynamic/model/cell/ScrollCellInfo;", "Lcom/dianping/shield/dynamic/model/cell/CellInfo$BaseCellInfo;", "Lcom/dianping/shield/dynamic/model/extra/ExposeInfo;", "Lcom/dianping/shield/dynamic/model/extra/ScrollEvent;", "children", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/model/view/ViewInfo;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", DMKeys.KEY_APPEAR_ON_SCREEN_CALLBACK, "", "getAppearOnScreenCallback", "()Ljava/lang/String;", "setAppearOnScreenCallback", "(Ljava/lang/String;)V", DMKeys.KEY_SCROLL_ATTACH_TRIGGER_DISTANCE, "", "getAttachTriggerDistance", "()Ljava/lang/Integer;", "setAttachTriggerDistance", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "attachView", "Lcom/dianping/shield/dynamic/model/view/ScrollCellAttachViewInfo;", "getAttachView", "()Lcom/dianping/shield/dynamic/model/view/ScrollCellAttachViewInfo;", "setAttachView", "(Lcom/dianping/shield/dynamic/model/view/ScrollCellAttachViewInfo;)V", "autoContentMargin", "", "getAutoContentMargin", "()Ljava/lang/Boolean;", "setAutoContentMargin", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", DMKeys.KEY_AUTO_LOOP_INTERVAL, "getAutoLoopInterval", "setAutoLoopInterval", "backgroundView", "Lcom/dianping/shield/dynamic/model/view/ExtraViewUnionType$ExtraViewInfo;", "getBackgroundView", "()Lcom/dianping/shield/dynamic/model/view/ExtraViewUnionType$ExtraViewInfo;", "setBackgroundView", "(Lcom/dianping/shield/dynamic/model/view/ExtraViewUnionType$ExtraViewInfo;)V", DMKeys.KEY_CAN_REPEAT_EXPOSE, "getCanRepeatExpose", "setCanRepeatExpose", "getChildren", "()Ljava/util/ArrayList;", "setChildren", DMKeys.KEY_COLCOUNT, "getColCount", "setColCount", DMKeys.KEY_CONTENT_MARGIN_INFO, "Lcom/dianping/shield/dynamic/model/extra/MarginInfo;", "getContentMarginInfo", "()Lcom/dianping/shield/dynamic/model/extra/MarginInfo;", "setContentMarginInfo", "(Lcom/dianping/shield/dynamic/model/extra/MarginInfo;)V", DMKeys.KEY_DISAPPEAR_FROM_SCREEN_CALLBACK, "getDisappearFromScreenCallback", "setDisappearFromScreenCallback", DMKeys.KEY_ENABLE_ADAPTIVE_CELL_HEIGHT, "getEnableAdaptiveCellHeight", "setEnableAdaptiveCellHeight", DMKeys.KEY_ENABLE_ADAPTIVE_CELL_HEIGHT_ANIMATION, "getEnableAdaptiveCellHeightAnimation", "setEnableAdaptiveCellHeightAnimation", DMKeys.KEY_EXPOSE_CALLBACK, "getExposeCallback", "setExposeCallback", DMKeys.KEY_EXPOSE_DELAY, "getExposeDelay", "setExposeDelay", DMKeys.KEY_SCROLL_GALLERY_GAP, "getGalleryGap", "setGalleryGap", "maskView", "getMaskView", "setMaskView", "onAttachTriggered", "getOnAttachTriggered", "setOnAttachTriggered", DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN, "getOnMomentumScrollBegin", "setOnMomentumScrollBegin", DMKeys.KEY_ON_MOMENTUM_SCROLL_END, "getOnMomentumScrollEnd", "setOnMomentumScrollEnd", "onPageChanged", "getOnPageChanged", "setOnPageChanged", "onScroll", "getOnScroll", "setOnScroll", DMKeys.KEY_ON_SCROLL_BEGIN_DRAG, "getOnScrollBeginDrag", "setOnScrollBeginDrag", DMKeys.KEY_ON_SCROLL_END_DRAG, "getOnScrollEndDrag", "setOnScrollEndDrag", DMKeys.KEY_PAGE_INDEX, "getPageIndex", "setPageIndex", DMKeys.KEY_ROWCOUNT, "getRowCount", "setRowCount", DMKeys.KEY_SCROLL_DIRECTION, "getScrollDirection", "setScrollDirection", "scrollEnabled", "getScrollEnabled", "setScrollEnabled", DMKeys.KEY_THROTTLE, "getScrollEventThrottle", "setScrollEventThrottle", DMKeys.KEY_SCROLL_STYLE, "getScrollStyle", "setScrollStyle", DMKeys.KEY_XGAP, "getXGap", "setXGap", DMKeys.KEY_YGAP, "getYGap", "setYGap", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ScrollCellInfo extends CellInfo.BaseCellInfo implements ExposeInfo, ScrollEvent {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private String appearOnScreenCallback;
    @Nullable
    private Integer attachTriggerDistance;
    @Nullable
    private ScrollCellAttachViewInfo attachView;
    @Nullable
    private Boolean autoContentMargin;
    @Nullable
    private Integer autoLoopInterval;
    @Nullable
    private ExtraViewUnionType.ExtraViewInfo backgroundView;
    @Nullable
    private Boolean canRepeatExpose;
    @Nullable
    private ArrayList<ViewInfo> children;
    @Nullable
    private Integer colCount;
    @Nullable
    private MarginInfo contentMarginInfo;
    @Nullable
    private String disappearFromScreenCallback;
    @Nullable
    private Boolean enableAdaptiveCellHeight;
    @Nullable
    private Boolean enableAdaptiveCellHeightAnimation;
    @Nullable
    private String exposeCallback;
    @Nullable
    private Integer exposeDelay;
    @Nullable
    private Integer galleryGap;
    @Nullable
    private ExtraViewUnionType.ExtraViewInfo maskView;
    @Nullable
    private String onAttachTriggered;
    @Nullable
    private String onMomentumScrollBegin;
    @Nullable
    private String onMomentumScrollEnd;
    @Nullable
    private String onPageChanged;
    @Nullable
    private String onScroll;
    @Nullable
    private String onScrollBeginDrag;
    @Nullable
    private String onScrollEndDrag;
    @Nullable
    private Integer pageIndex;
    @Nullable
    private Integer rowCount;
    @Nullable
    private Integer scrollDirection;
    @Nullable
    private Boolean scrollEnabled;
    @Nullable
    private Integer scrollEventThrottle;
    @Nullable
    private Integer scrollStyle;
    @Nullable
    private Integer xGap;
    @Nullable
    private Integer yGap;

    public ScrollCellInfo() {
        this(null, 1, null);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dcb710a97419e513994c612c54c7bd75", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dcb710a97419e513994c612c54c7bd75");
        }
    }

    public ScrollCellInfo(@Nullable ArrayList<ViewInfo> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "19beeb0a9a35145b1a784c7605413eae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "19beeb0a9a35145b1a784c7605413eae");
        } else {
            this.children = arrayList;
        }
    }

    public /* synthetic */ ScrollCellInfo(ArrayList arrayList, int i, f fVar) {
        this((i & 1) != 0 ? null : arrayList);
    }

    @Nullable
    public final ArrayList<ViewInfo> getChildren() {
        return this.children;
    }

    public final void setChildren(@Nullable ArrayList<ViewInfo> arrayList) {
        this.children = arrayList;
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

    @Override // com.dianping.shield.dynamic.model.extra.ScrollEvent
    @Nullable
    public final Integer getScrollEventThrottle() {
        return this.scrollEventThrottle;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ScrollEvent
    public final void setScrollEventThrottle(@Nullable Integer num) {
        this.scrollEventThrottle = num;
    }

    @Nullable
    public final ExtraViewUnionType.ExtraViewInfo getBackgroundView() {
        return this.backgroundView;
    }

    public final void setBackgroundView(@Nullable ExtraViewUnionType.ExtraViewInfo extraViewInfo) {
        this.backgroundView = extraViewInfo;
    }

    @Nullable
    public final ExtraViewUnionType.ExtraViewInfo getMaskView() {
        return this.maskView;
    }

    public final void setMaskView(@Nullable ExtraViewUnionType.ExtraViewInfo extraViewInfo) {
        this.maskView = extraViewInfo;
    }

    @Nullable
    public final ScrollCellAttachViewInfo getAttachView() {
        return this.attachView;
    }

    public final void setAttachView(@Nullable ScrollCellAttachViewInfo scrollCellAttachViewInfo) {
        this.attachView = scrollCellAttachViewInfo;
    }

    @Nullable
    public final Integer getScrollStyle() {
        return this.scrollStyle;
    }

    public final void setScrollStyle(@Nullable Integer num) {
        this.scrollStyle = num;
    }

    @Nullable
    public final Integer getScrollDirection() {
        return this.scrollDirection;
    }

    public final void setScrollDirection(@Nullable Integer num) {
        this.scrollDirection = num;
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
    public final Integer getColCount() {
        return this.colCount;
    }

    public final void setColCount(@Nullable Integer num) {
        this.colCount = num;
    }

    @Nullable
    public final Integer getRowCount() {
        return this.rowCount;
    }

    public final void setRowCount(@Nullable Integer num) {
        this.rowCount = num;
    }

    @Nullable
    public final Integer getXGap() {
        return this.xGap;
    }

    public final void setXGap(@Nullable Integer num) {
        this.xGap = num;
    }

    @Nullable
    public final Integer getYGap() {
        return this.yGap;
    }

    public final void setYGap(@Nullable Integer num) {
        this.yGap = num;
    }

    @Nullable
    public final Integer getGalleryGap() {
        return this.galleryGap;
    }

    public final void setGalleryGap(@Nullable Integer num) {
        this.galleryGap = num;
    }

    @Nullable
    public final Integer getAutoLoopInterval() {
        return this.autoLoopInterval;
    }

    public final void setAutoLoopInterval(@Nullable Integer num) {
        this.autoLoopInterval = num;
    }

    @Nullable
    public final Integer getAttachTriggerDistance() {
        return this.attachTriggerDistance;
    }

    public final void setAttachTriggerDistance(@Nullable Integer num) {
        this.attachTriggerDistance = num;
    }

    @Nullable
    public final Boolean getScrollEnabled() {
        return this.scrollEnabled;
    }

    public final void setScrollEnabled(@Nullable Boolean bool) {
        this.scrollEnabled = bool;
    }

    @Nullable
    public final Integer getPageIndex() {
        return this.pageIndex;
    }

    public final void setPageIndex(@Nullable Integer num) {
        this.pageIndex = num;
    }

    @Nullable
    public final Boolean getEnableAdaptiveCellHeight() {
        return this.enableAdaptiveCellHeight;
    }

    public final void setEnableAdaptiveCellHeight(@Nullable Boolean bool) {
        this.enableAdaptiveCellHeight = bool;
    }

    @Nullable
    public final Boolean getEnableAdaptiveCellHeightAnimation() {
        return this.enableAdaptiveCellHeightAnimation;
    }

    public final void setEnableAdaptiveCellHeightAnimation(@Nullable Boolean bool) {
        this.enableAdaptiveCellHeightAnimation = bool;
    }

    @Nullable
    public final String getOnPageChanged() {
        return this.onPageChanged;
    }

    public final void setOnPageChanged(@Nullable String str) {
        this.onPageChanged = str;
    }

    @Nullable
    public final String getOnAttachTriggered() {
        return this.onAttachTriggered;
    }

    public final void setOnAttachTriggered(@Nullable String str) {
        this.onAttachTriggered = str;
    }
}
