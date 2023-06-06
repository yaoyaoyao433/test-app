package com.dianping.shield.dynamic.utils;

import android.annotation.SuppressLint;
import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.agentsdk.framework.AgentInterface;
import com.dianping.agentsdk.framework.ab;
import com.dianping.agentsdk.pagecontainer.b;
import com.dianping.shield.bridge.feature.ShieldGlobalFeatureInterface;
import com.dianping.shield.component.extensions.common.BaseScrollableRowItem;
import com.dianping.shield.component.interfaces.OnDragStatusListener;
import com.dianping.shield.component.utils.ComponentScrollEventHelper;
import com.dianping.shield.component.widgets.PageContainerRecyclerView;
import com.dianping.shield.component.widgets.container.CommonPageContainer;
import com.dianping.shield.dynamic.diff.ScrollEventDiff;
import com.dianping.shield.dynamic.model.extra.ScrollEvent;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.entity.CellType;
import com.dianping.shield.entity.IndexPath;
import com.dianping.shield.entity.NodeInfo;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.itemcallbacks.ContentOffsetListener;
import com.dianping.shield.node.useritem.HoverState;
import com.dianping.shield.node.useritem.TopInfo;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002:\u0005@ABCDB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001a\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\n\b\u0002\u0010=\u001a\u0004\u0018\u000100J\b\u0010>\u001a\u00020\u0007H\u0016J\b\u0010?\u001a\u00020\u0007H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00060\rR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00060\u000fR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR\u001a\u0010\u0015\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00060\u001fR\u00020\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0012\u0010$\u001a\u00060%R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\t\"\u0004\b(\u0010\u000bR\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010/\u001a\u0004\u0018\u000100X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0010\u00105\u001a\u0004\u0018\u000106X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u00107\u001a\u000608R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006E"}, d2 = {"Lcom/dianping/shield/dynamic/utils/HoverCellScrollEventDetector;", "Lcom/dianping/shield/dynamic/diff/ScrollEventDiff;", "Lcom/dianping/shield/component/utils/ComponentScrollEventHelper$IScrollRange;", "hostChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "(Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;)V", "alinePageTop", "", "getAlinePageTop", "()I", "setAlinePageTop", "(I)V", "beginDragListener", "Lcom/dianping/shield/dynamic/utils/HoverCellScrollEventDetector$PageContainerOnDragStatusListener;", "contentOffsetListener", "Lcom/dianping/shield/dynamic/utils/HoverCellScrollEventDetector$PageContainerContentOffsetListener;", "getHostChassis", "()Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "hoverEndPosition", "getHoverEndPosition", "setHoverEndPosition", DMKeys.KEY_HOVER_OFFSET, "getHoverOffset", "setHoverOffset", "hoverState", "Lcom/dianping/shield/node/useritem/HoverState;", "getHoverState", "()Lcom/dianping/shield/node/useritem/HoverState;", "setHoverState", "(Lcom/dianping/shield/node/useritem/HoverState;)V", "hoverStateChangeListener", "Lcom/dianping/shield/dynamic/utils/HoverCellScrollEventDetector$HoverStateChangeListener;", "getHoverStateChangeListener", "()Lcom/dianping/shield/dynamic/utils/HoverCellScrollEventDetector$HoverStateChangeListener;", "setHoverStateChangeListener", "(Lcom/dianping/shield/dynamic/utils/HoverCellScrollEventDetector$HoverStateChangeListener;)V", "momentumScrollAndDragEndListener", "Lcom/dianping/shield/dynamic/utils/HoverCellScrollEventDetector$PageContainerMomentumScrollAndDragEndListener;", "offsetToAnchor", "getOffsetToAnchor", "setOffsetToAnchor", "path", "Lcom/dianping/shield/node/cellnode/NodePath;", "getPath", "()Lcom/dianping/shield/node/cellnode/NodePath;", "setPath", "(Lcom/dianping/shield/node/cellnode/NodePath;)V", "scrollEventDispatcherProvider", "Lcom/dianping/shield/component/utils/ComponentScrollEventHelper$IEventDispatcherProvider;", "getScrollEventDispatcherProvider", "()Lcom/dianping/shield/component/utils/ComponentScrollEventHelper$IEventDispatcherProvider;", "setScrollEventDispatcherProvider", "(Lcom/dianping/shield/component/utils/ComponentScrollEventHelper$IEventDispatcherProvider;)V", "scrollEventHelper", "Lcom/dianping/shield/component/utils/ComponentScrollEventHelper;", "topParamsChangeListener", "Lcom/dianping/shield/dynamic/utils/HoverCellScrollEventDetector$PageContainerTopParamsChangeListener;", "bindListener", "", "scrollEvent", "Lcom/dianping/shield/dynamic/model/extra/ScrollEvent;", "dispatcherProvider", "getTotalHorizontalScrollRange", "getTotalVerticalScrollRange", "HoverStateChangeListener", "PageContainerContentOffsetListener", "PageContainerMomentumScrollAndDragEndListener", "PageContainerOnDragStatusListener", "PageContainerTopParamsChangeListener", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class HoverCellScrollEventDetector implements ComponentScrollEventHelper.IScrollRange, ScrollEventDiff {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int alinePageTop;
    private final PageContainerOnDragStatusListener beginDragListener;
    private final PageContainerContentOffsetListener contentOffsetListener;
    @NotNull
    private final DynamicChassisInterface hostChassis;
    private int hoverEndPosition;
    private int hoverOffset;
    @NotNull
    private HoverState hoverState;
    @NotNull
    private HoverStateChangeListener hoverStateChangeListener;
    private PageContainerMomentumScrollAndDragEndListener momentumScrollAndDragEndListener;
    private int offsetToAnchor;
    @Nullable
    private NodePath path;
    @Nullable
    private ComponentScrollEventHelper.IEventDispatcherProvider scrollEventDispatcherProvider;
    private ComponentScrollEventHelper scrollEventHelper;
    private final PageContainerTopParamsChangeListener topParamsChangeListener;

    public HoverCellScrollEventDetector(@NotNull DynamicChassisInterface dynamicChassisInterface) {
        h.b(dynamicChassisInterface, "hostChassis");
        Object[] objArr = {dynamicChassisInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30b32a2de1b79d0d1b7897fcd68a511b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30b32a2de1b79d0d1b7897fcd68a511b");
            return;
        }
        this.hostChassis = dynamicChassisInterface;
        this.offsetToAnchor = Integer.MAX_VALUE;
        this.alinePageTop = Integer.MAX_VALUE;
        this.hoverState = HoverState.NORMAL;
        this.hoverStateChangeListener = new HoverStateChangeListener();
        this.beginDragListener = new PageContainerOnDragStatusListener();
        this.contentOffsetListener = new PageContainerContentOffsetListener();
        this.topParamsChangeListener = new PageContainerTopParamsChangeListener();
        this.momentumScrollAndDragEndListener = new PageContainerMomentumScrollAndDragEndListener();
    }

    @Override // com.dianping.shield.dynamic.diff.ScrollEventDiff
    @Nullable
    public final ComponentScrollEventHelper.IEventDispatcherProvider createScrollEventDispatcher(@NotNull ScrollEvent scrollEvent, @Nullable ComponentScrollEventHelper.IEventDispatcherProvider iEventDispatcherProvider) {
        Object[] objArr = {scrollEvent, iEventDispatcherProvider};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2bbfdb817efef6677785304dd34e8db6", RobustBitConfig.DEFAULT_VALUE)) {
            return (ComponentScrollEventHelper.IEventDispatcherProvider) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2bbfdb817efef6677785304dd34e8db6");
        }
        h.b(scrollEvent, "scrollEvent");
        return ScrollEventDiff.DefaultImpls.createScrollEventDispatcher(this, scrollEvent, iEventDispatcherProvider);
    }

    @Override // com.dianping.shield.dynamic.diff.ScrollEventDiff, com.dianping.shield.dynamic.diff.extra.HoverInfoDiffProxy, com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy
    @NotNull
    public final DynamicChassisInterface getHostChassis() {
        return this.hostChassis;
    }

    @Override // com.dianping.shield.dynamic.diff.ScrollEventDiff
    public final void setScrollEventDispatcher(@NotNull ScrollEvent scrollEvent, @NotNull BaseScrollableRowItem baseScrollableRowItem) {
        Object[] objArr = {scrollEvent, baseScrollableRowItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8afd11e074fce33bc202cd4d10243a46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8afd11e074fce33bc202cd4d10243a46");
            return;
        }
        h.b(scrollEvent, "scrollEvent");
        h.b(baseScrollableRowItem, "baseScrollableRowItem");
        ScrollEventDiff.DefaultImpls.setScrollEventDispatcher(this, scrollEvent, baseScrollableRowItem);
    }

    public final int getHoverEndPosition() {
        return this.hoverEndPosition;
    }

    public final void setHoverEndPosition(int i) {
        this.hoverEndPosition = i;
    }

    public final int getOffsetToAnchor() {
        return this.offsetToAnchor;
    }

    public final void setOffsetToAnchor(int i) {
        this.offsetToAnchor = i;
    }

    public final int getAlinePageTop() {
        return this.alinePageTop;
    }

    public final void setAlinePageTop(int i) {
        this.alinePageTop = i;
    }

    @NotNull
    public final HoverState getHoverState() {
        return this.hoverState;
    }

    public final void setHoverState(@NotNull HoverState hoverState) {
        Object[] objArr = {hoverState};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "438198c07999f9e7a48ab0d3082430c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "438198c07999f9e7a48ab0d3082430c5");
            return;
        }
        h.b(hoverState, "<set-?>");
        this.hoverState = hoverState;
    }

    public final int getHoverOffset() {
        return this.hoverOffset;
    }

    public final void setHoverOffset(int i) {
        this.hoverOffset = i;
    }

    @Nullable
    public final NodePath getPath() {
        return this.path;
    }

    public final void setPath(@Nullable NodePath nodePath) {
        this.path = nodePath;
    }

    @NotNull
    public final HoverStateChangeListener getHoverStateChangeListener() {
        return this.hoverStateChangeListener;
    }

    public final void setHoverStateChangeListener(@NotNull HoverStateChangeListener hoverStateChangeListener) {
        Object[] objArr = {hoverStateChangeListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d72733cff7755f94f2752d17507cf33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d72733cff7755f94f2752d17507cf33");
            return;
        }
        h.b(hoverStateChangeListener, "<set-?>");
        this.hoverStateChangeListener = hoverStateChangeListener;
    }

    @Nullable
    public final ComponentScrollEventHelper.IEventDispatcherProvider getScrollEventDispatcherProvider() {
        return this.scrollEventDispatcherProvider;
    }

    public final void setScrollEventDispatcherProvider(@Nullable ComponentScrollEventHelper.IEventDispatcherProvider iEventDispatcherProvider) {
        this.scrollEventDispatcherProvider = iEventDispatcherProvider;
    }

    public static /* synthetic */ void bindListener$default(HoverCellScrollEventDetector hoverCellScrollEventDetector, ScrollEvent scrollEvent, ComponentScrollEventHelper.IEventDispatcherProvider iEventDispatcherProvider, int i, Object obj) {
        if ((i & 2) != 0) {
            iEventDispatcherProvider = null;
        }
        hoverCellScrollEventDetector.bindListener(scrollEvent, iEventDispatcherProvider);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00dc, code lost:
        if ((r14.length() > 0) != true) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ef, code lost:
        if ((r14.length() > 0) != true) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindListener(@org.jetbrains.annotations.NotNull com.dianping.shield.dynamic.model.extra.ScrollEvent r13, @org.jetbrains.annotations.Nullable com.dianping.shield.component.utils.ComponentScrollEventHelper.IEventDispatcherProvider r14) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.dynamic.utils.HoverCellScrollEventDetector.bindListener(com.dianping.shield.dynamic.model.extra.ScrollEvent, com.dianping.shield.component.utils.ComponentScrollEventHelper$IEventDispatcherProvider):void");
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016¨\u0006\u000e"}, d2 = {"Lcom/dianping/shield/dynamic/utils/HoverCellScrollEventDetector$HoverStateChangeListener;", "Lcom/dianping/shield/node/useritem/TopInfo$OnTopStateChangeListener;", "(Lcom/dianping/shield/dynamic/utils/HoverCellScrollEventDetector;)V", "onTopStageChanged", "", "viewHolder", "Lcom/dianping/shield/node/adapter/ShieldViewHolder;", "cellType", "Lcom/dianping/shield/entity/CellType;", "section", "", "row", "state", "Lcom/dianping/shield/node/useritem/HoverState;", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public final class HoverStateChangeListener implements TopInfo.OnTopStateChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        public HoverStateChangeListener() {
        }

        @Override // com.dianping.shield.node.useritem.TopInfo.OnTopStateChangeListener
        public final void onTopStageChanged(@Nullable ShieldViewHolder shieldViewHolder, @Nullable CellType cellType, int i, int i2, @Nullable HoverState hoverState) {
            Object[] objArr = {shieldViewHolder, cellType, Integer.valueOf(i), Integer.valueOf(i2), hoverState};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "646985d1054560be2ababd548f413d55", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "646985d1054560be2ababd548f413d55");
                return;
            }
            HoverCellScrollEventDetector hoverCellScrollEventDetector = HoverCellScrollEventDetector.this;
            if (hoverState == null) {
                hoverState = HoverState.NORMAL;
            }
            hoverCellScrollEventDetector.setHoverState(hoverState);
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/dianping/shield/dynamic/utils/HoverCellScrollEventDetector$PageContainerTopParamsChangeListener;", "Lcom/dianping/agentsdk/pagecontainer/OnTopParamsChangeListener;", "(Lcom/dianping/shield/dynamic/utils/HoverCellScrollEventDetector;)V", "OnTopParamsChange", "", "hasChange", "", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public final class PageContainerTopParamsChangeListener implements b {
        public static ChangeQuickRedirect changeQuickRedirect;

        public PageContainerTopParamsChangeListener() {
        }

        @Override // com.dianping.agentsdk.pagecontainer.b
        public final void OnTopParamsChange(boolean z) {
            Integer num;
            ShieldGlobalFeatureInterface feature;
            IndexPath indexPath;
            IndexPath indexPath2;
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "64bbf0c1e250cb17b00c0f136062b417", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "64bbf0c1e250cb17b00c0f136062b417");
                return;
            }
            DynamicChassisInterface hostChassis = HoverCellScrollEventDetector.this.getHostChassis();
            ab<?> pageContainer = hostChassis != null ? hostChassis.getPageContainer() : null;
            if (!(pageContainer instanceof CommonPageContainer)) {
                pageContainer = null;
            }
            CommonPageContainer commonPageContainer = (CommonPageContainer) pageContainer;
            ViewGroup agentContainerView = commonPageContainer != null ? commonPageContainer.getAgentContainerView() : null;
            if (z && (HoverCellScrollEventDetector.this.getHostChassis() instanceof AgentInterface) && (agentContainerView instanceof PageContainerRecyclerView)) {
                DynamicChassisInterface hostChassis2 = HoverCellScrollEventDetector.this.getHostChassis();
                int i = -1;
                if (hostChassis2 != null && (feature = hostChassis2.getFeature()) != null) {
                    DynamicChassisInterface hostChassis3 = HoverCellScrollEventDetector.this.getHostChassis();
                    if (hostChassis3 == null) {
                        throw new o("null cannot be cast to non-null type com.dianping.agentsdk.framework.AgentInterface");
                    }
                    AgentInterface agentInterface = (AgentInterface) hostChassis3;
                    NodePath path = HoverCellScrollEventDetector.this.getPath();
                    if (path != null && (indexPath2 = path.indexPath) != null) {
                        i = indexPath2.section;
                    }
                    NodePath path2 = HoverCellScrollEventDetector.this.getPath();
                    NodeInfo row = NodeInfo.row(agentInterface, i, (path2 == null || (indexPath = path2.indexPath) == null) ? -3 : indexPath.row);
                    h.a((Object) row, "NodeInfo.row((hostChassi…th?.indexPath?.row ?: -3)");
                    i = feature.getNodeGlobalPosition(row);
                }
                Pair<Integer, Integer> viewTopBottom = ((PageContainerRecyclerView) agentContainerView).getViewTopBottom(i);
                HoverCellScrollEventDetector.this.setAlinePageTop((viewTopBottom == null || (num = (Integer) viewTopBottom.first) == null) ? Integer.MAX_VALUE : num.intValue());
                if (HoverCellScrollEventDetector.this.getOffsetToAnchor() == Integer.MAX_VALUE) {
                    HoverCellScrollEventDetector.this.setOffsetToAnchor(HoverCellScrollEventDetector.this.getAlinePageTop());
                    ComponentScrollEventHelper componentScrollEventHelper = HoverCellScrollEventDetector.this.scrollEventHelper;
                    if (componentScrollEventHelper != null) {
                        componentScrollEventHelper.setOffsetToAnchor(HoverCellScrollEventDetector.this.getOffsetToAnchor());
                    }
                }
            }
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0017¨\u0006\t"}, d2 = {"Lcom/dianping/shield/dynamic/utils/HoverCellScrollEventDetector$PageContainerMomentumScrollAndDragEndListener;", "Landroid/view/View$OnTouchListener;", "(Lcom/dianping/shield/dynamic/utils/HoverCellScrollEventDetector;)V", "onTouch", "", "v", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public final class PageContainerMomentumScrollAndDragEndListener implements View.OnTouchListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        public PageContainerMomentumScrollAndDragEndListener() {
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouch(@Nullable View view, @Nullable MotionEvent motionEvent) {
            ComponentScrollEventHelper componentScrollEventHelper;
            ComponentScrollEventHelper componentScrollEventHelper2;
            Object[] objArr = {view, motionEvent};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce41126ab99eac36c45ac7847f645c75", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce41126ab99eac36c45ac7847f645c75")).booleanValue();
            }
            ComponentScrollEventHelper componentScrollEventHelper3 = HoverCellScrollEventDetector.this.scrollEventHelper;
            if (componentScrollEventHelper3 != null && componentScrollEventHelper3.needDragEvent() && motionEvent != null && (componentScrollEventHelper2 = HoverCellScrollEventDetector.this.scrollEventHelper) != null) {
                componentScrollEventHelper2.handleEndDragByTouchEvent(motionEvent);
            }
            ComponentScrollEventHelper componentScrollEventHelper4 = HoverCellScrollEventDetector.this.scrollEventHelper;
            if (componentScrollEventHelper4 != null && componentScrollEventHelper4.needMomentumEvent() && motionEvent != null && (componentScrollEventHelper = HoverCellScrollEventDetector.this.scrollEventHelper) != null) {
                componentScrollEventHelper.handleMomentumScrollAndDragEndByEvent(motionEvent);
            }
            return false;
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/dianping/shield/dynamic/utils/HoverCellScrollEventDetector$PageContainerOnDragStatusListener;", "Lcom/dianping/shield/component/interfaces/OnDragStatusListener;", "(Lcom/dianping/shield/dynamic/utils/HoverCellScrollEventDetector;)V", "onBeginDrag", "", "recyclerView", "Lcom/dianping/shield/component/widgets/PageContainerRecyclerView;", "onEndDrag", "xVelocity", "", "yVelocity", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public final class PageContainerOnDragStatusListener implements OnDragStatusListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // com.dianping.shield.component.interfaces.OnDragStatusListener
        public final void onEndDrag(@NotNull PageContainerRecyclerView pageContainerRecyclerView, float f, float f2) {
            Object[] objArr = {pageContainerRecyclerView, Float.valueOf(f), Float.valueOf(f2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b9dee6b194b9d7e6c9b71c829d65ea5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b9dee6b194b9d7e6c9b71c829d65ea5");
            } else {
                h.b(pageContainerRecyclerView, "recyclerView");
            }
        }

        public PageContainerOnDragStatusListener() {
        }

        @Override // com.dianping.shield.component.interfaces.OnDragStatusListener
        public final void onBeginDrag(@NotNull PageContainerRecyclerView pageContainerRecyclerView) {
            ComponentScrollEventHelper componentScrollEventHelper;
            Object[] objArr = {pageContainerRecyclerView};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3685d989e73180e941ef4a7a407525c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3685d989e73180e941ef4a7a407525c");
                return;
            }
            h.b(pageContainerRecyclerView, "recyclerView");
            ComponentScrollEventHelper componentScrollEventHelper2 = HoverCellScrollEventDetector.this.scrollEventHelper;
            if (componentScrollEventHelper2 == null || !componentScrollEventHelper2.needDragEvent() || (componentScrollEventHelper = HoverCellScrollEventDetector.this.scrollEventHelper) == null) {
                return;
            }
            componentScrollEventHelper.handleBeginDrag(0, pageContainerRecyclerView.getScrollY());
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/dianping/shield/dynamic/utils/HoverCellScrollEventDetector$PageContainerContentOffsetListener;", "Lcom/dianping/shield/node/itemcallbacks/ContentOffsetListener;", "(Lcom/dianping/shield/dynamic/utils/HoverCellScrollEventDetector;)V", "offsetChanged", "", Constants.GestureMoveEvent.KEY_X, "", Constants.GestureMoveEvent.KEY_Y, "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public final class PageContainerContentOffsetListener implements ContentOffsetListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        public PageContainerContentOffsetListener() {
        }

        @Override // com.dianping.shield.node.itemcallbacks.ContentOffsetListener
        public final void offsetChanged(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "29180dfd51479e7cb0cfc4b5fe391247", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "29180dfd51479e7cb0cfc4b5fe391247");
                return;
            }
            ComponentScrollEventHelper componentScrollEventHelper = HoverCellScrollEventDetector.this.scrollEventHelper;
            if (componentScrollEventHelper == null || !componentScrollEventHelper.needScrollEvent()) {
                return;
            }
            if (HoverCellScrollEventDetector.this.getHoverState() == HoverState.NORMAL) {
                int alinePageTop = (HoverCellScrollEventDetector.this.getAlinePageTop() - i2) - HoverCellScrollEventDetector.this.getHoverOffset();
                if (alinePageTop > 0) {
                    HoverCellScrollEventDetector.this.setOffsetToAnchor(alinePageTop);
                }
            } else if (HoverCellScrollEventDetector.this.getHoverState() == HoverState.HOVER) {
                HoverCellScrollEventDetector.this.setOffsetToAnchor(0);
                HoverCellScrollEventDetector.this.setHoverEndPosition(0);
            } else if (HoverCellScrollEventDetector.this.getHoverEndPosition() == 0) {
                HoverCellScrollEventDetector.this.setHoverEndPosition(i2);
            } else {
                int hoverEndPosition = HoverCellScrollEventDetector.this.getHoverEndPosition();
                if (hoverEndPosition >= 0 && i2 > hoverEndPosition) {
                    HoverCellScrollEventDetector.this.setOffsetToAnchor(HoverCellScrollEventDetector.this.getHoverEndPosition() - i2);
                }
            }
            ComponentScrollEventHelper componentScrollEventHelper2 = HoverCellScrollEventDetector.this.scrollEventHelper;
            if (componentScrollEventHelper2 != null) {
                componentScrollEventHelper2.setOffsetToAnchor(HoverCellScrollEventDetector.this.getOffsetToAnchor());
            }
            ComponentScrollEventHelper componentScrollEventHelper3 = HoverCellScrollEventDetector.this.scrollEventHelper;
            if (componentScrollEventHelper3 != null) {
                componentScrollEventHelper3.handleScrollEvent(i, i2);
            }
        }
    }

    @Override // com.dianping.shield.component.utils.ComponentScrollEventHelper.IScrollRange
    public final int getTotalVerticalScrollRange() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fdd7557c4f5ddc56d9b2a1710eec6809", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fdd7557c4f5ddc56d9b2a1710eec6809")).intValue();
        }
        ab<?> pageContainer = getHostChassis().getPageContainer();
        if (!(pageContainer instanceof CommonPageContainer)) {
            pageContainer = null;
        }
        CommonPageContainer commonPageContainer = (CommonPageContainer) pageContainer;
        ViewGroup agentContainerView = commonPageContainer != null ? commonPageContainer.getAgentContainerView() : null;
        if (!(agentContainerView instanceof RecyclerView)) {
            agentContainerView = null;
        }
        RecyclerView recyclerView = (RecyclerView) agentContainerView;
        if (recyclerView != null) {
            return recyclerView.computeVerticalScrollRange();
        }
        return 0;
    }

    @Override // com.dianping.shield.component.utils.ComponentScrollEventHelper.IScrollRange
    public final int getTotalHorizontalScrollRange() {
        ViewGroup agentContainerView;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b4b324ccc1148c938eba6e9a3731c5e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b4b324ccc1148c938eba6e9a3731c5e")).intValue();
        }
        ab<?> pageContainer = getHostChassis().getPageContainer();
        if (!(pageContainer instanceof CommonPageContainer)) {
            pageContainer = null;
        }
        CommonPageContainer commonPageContainer = (CommonPageContainer) pageContainer;
        if (commonPageContainer == null || (agentContainerView = commonPageContainer.getAgentContainerView()) == null) {
            return 0;
        }
        return agentContainerView.getWidth();
    }
}
