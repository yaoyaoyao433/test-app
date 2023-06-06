package com.dianping.shield.manager.feature;

import android.util.SparseArray;
import com.dianping.shield.bridge.feature.AgentGlobalPositionInterface;
import com.dianping.shield.entity.CellType;
import com.dianping.shield.manager.ShieldSectionManager;
import com.dianping.shield.manager.feature.TopNodeCollector;
import com.dianping.shield.node.adapter.ShieldDisplayNodeAdapter;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.dianping.shield.node.cellnode.InnerBottomInfo;
import com.dianping.shield.node.cellnode.InnerHoverInfo;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.cellnode.RangeDispatcher;
import com.dianping.shield.node.cellnode.ShieldCellGroup;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.dianping.shield.node.cellnode.ShieldFloatViewDisplayNode;
import com.dianping.shield.node.cellnode.ShieldRow;
import com.dianping.shield.node.cellnode.ShieldSection;
import com.dianping.shield.node.cellnode.ShieldViewCell;
import com.dianping.shield.node.useritem.BottomInfo;
import com.dianping.shield.node.useritem.HoverState;
import com.dianping.shield.node.useritem.TopInfo;
import com.dianping.shield.utils.RangeRemoveableArrayList;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\"\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\"\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J$\u0010\u0019\u001a\u00020\u001a2\u001a\u0010\u001b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001cj\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d`\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u0017H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u000b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\r0\fj\n\u0012\u0006\u0012\u0004\u0018\u00010\r`\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/dianping/shield/manager/feature/TopNodeCollector;", "Lcom/dianping/shield/manager/feature/CellManagerFeatureInterface;", "shieldDisplayNodeAdapter", "Lcom/dianping/shield/node/adapter/ShieldDisplayNodeAdapter;", "sectionManager", "Lcom/dianping/shield/manager/ShieldSectionManager;", "looper", "Lcom/dianping/shield/manager/feature/LoopCellGroupsCollector;", "agentGlobalPosition", "Lcom/dianping/shield/bridge/feature/AgentGlobalPositionInterface;", "(Lcom/dianping/shield/node/adapter/ShieldDisplayNodeAdapter;Lcom/dianping/shield/manager/ShieldSectionManager;Lcom/dianping/shield/manager/feature/LoopCellGroupsCollector;Lcom/dianping/shield/bridge/feature/AgentGlobalPositionInterface;)V", "floatNodeHashSet", "Ljava/util/HashSet;", "Lcom/dianping/shield/node/cellnode/ShieldFloatViewDisplayNode;", "Lkotlin/collections/HashSet;", "hoverNodesArray", "Landroid/util/SparseArray;", "Lcom/dianping/shield/node/cellnode/ShieldDisplayNode;", "computeBottomInfo", "", "node", "rIdx", "viewcell", "Lcom/dianping/shield/node/cellnode/ShieldViewCell;", "computeTopInfo", "onAdapterNotify", "", "cellGroups", "Ljava/util/ArrayList;", "Lcom/dianping/shield/node/cellnode/ShieldCellGroup;", "Lkotlin/collections/ArrayList;", "onCellNodeRefresh", "shieldViewCell", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class TopNodeCollector implements CellManagerFeatureInterface {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final AgentGlobalPositionInterface agentGlobalPosition;
    private HashSet<ShieldFloatViewDisplayNode> floatNodeHashSet;
    private SparseArray<ShieldDisplayNode> hoverNodesArray;
    private final LoopCellGroupsCollector looper;
    private final ShieldSectionManager sectionManager;
    private final ShieldDisplayNodeAdapter shieldDisplayNodeAdapter;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            int[] iArr = new int[TopInfo.StartType.valuesCustom().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[TopInfo.StartType.SELF.ordinal()] = 1;
            $EnumSwitchMapping$0[TopInfo.StartType.ALWAYS.ordinal()] = 2;
            int[] iArr2 = new int[TopInfo.EndType.valuesCustom().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[TopInfo.EndType.MODULE.ordinal()] = 1;
            $EnumSwitchMapping$1[TopInfo.EndType.SECTION.ordinal()] = 2;
            $EnumSwitchMapping$1[TopInfo.EndType.CELL.ordinal()] = 3;
            int[] iArr3 = new int[InnerHoverInfo.HoverState.valuesCustom().length];
            $EnumSwitchMapping$2 = iArr3;
            iArr3[InnerHoverInfo.HoverState.NORMAL.ordinal()] = 1;
            $EnumSwitchMapping$2[InnerHoverInfo.HoverState.HOVER.ordinal()] = 2;
            $EnumSwitchMapping$2[InnerHoverInfo.HoverState.END.ordinal()] = 3;
            int[] iArr4 = new int[BottomInfo.StartType.valuesCustom().length];
            $EnumSwitchMapping$3 = iArr4;
            iArr4[BottomInfo.StartType.SELF.ordinal()] = 1;
            $EnumSwitchMapping$3[BottomInfo.StartType.ALWAYS.ordinal()] = 2;
            int[] iArr5 = new int[BottomInfo.EndType.valuesCustom().length];
            $EnumSwitchMapping$4 = iArr5;
            iArr5[BottomInfo.EndType.MODULE.ordinal()] = 1;
            $EnumSwitchMapping$4[BottomInfo.EndType.SECTION.ordinal()] = 2;
            $EnumSwitchMapping$4[BottomInfo.EndType.CELL.ordinal()] = 3;
            int[] iArr6 = new int[InnerHoverInfo.HoverState.valuesCustom().length];
            $EnumSwitchMapping$5 = iArr6;
            iArr6[InnerHoverInfo.HoverState.NORMAL.ordinal()] = 1;
            $EnumSwitchMapping$5[InnerHoverInfo.HoverState.HOVER.ordinal()] = 2;
            $EnumSwitchMapping$5[InnerHoverInfo.HoverState.END.ordinal()] = 3;
        }
    }

    @Override // com.dianping.shield.manager.feature.CellManagerFeatureInterface
    public final void onCellNodeRefresh(@NotNull ShieldViewCell shieldViewCell) {
        Object[] objArr = {shieldViewCell};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b486137b942e4e1d16b65e2bdeef1eec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b486137b942e4e1d16b65e2bdeef1eec");
        } else {
            h.b(shieldViewCell, "shieldViewCell");
        }
    }

    public TopNodeCollector(@NotNull ShieldDisplayNodeAdapter shieldDisplayNodeAdapter, @NotNull ShieldSectionManager shieldSectionManager, @NotNull LoopCellGroupsCollector loopCellGroupsCollector, @NotNull AgentGlobalPositionInterface agentGlobalPositionInterface) {
        h.b(shieldDisplayNodeAdapter, "shieldDisplayNodeAdapter");
        h.b(shieldSectionManager, "sectionManager");
        h.b(loopCellGroupsCollector, "looper");
        h.b(agentGlobalPositionInterface, "agentGlobalPosition");
        Object[] objArr = {shieldDisplayNodeAdapter, shieldSectionManager, loopCellGroupsCollector, agentGlobalPositionInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd324edbc852cf81eaecefe8f8d4eb46", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd324edbc852cf81eaecefe8f8d4eb46");
            return;
        }
        this.shieldDisplayNodeAdapter = shieldDisplayNodeAdapter;
        this.sectionManager = shieldSectionManager;
        this.looper = loopCellGroupsCollector;
        this.agentGlobalPosition = agentGlobalPositionInterface;
        this.hoverNodesArray = new SparseArray<>();
        this.floatNodeHashSet = new HashSet<>();
    }

    @Override // com.dianping.shield.manager.feature.CellManagerFeatureInterface
    public final void onAdapterNotify(@NotNull ArrayList<ShieldCellGroup> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bcd9f3c26844c00a17d5280d3cb7e8bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bcd9f3c26844c00a17d5280d3cb7e8bb");
            return;
        }
        h.b(arrayList, "cellGroups");
        this.looper.addBeforeLoopAction(new TopNodeCollector$onAdapterNotify$1(this));
        this.looper.addIndexedPreloadRowAction(new TopNodeCollector$onAdapterNotify$2(this));
        this.looper.addIndexedViewCellAction(new TopNodeCollector$onAdapterNotify$3(this));
        this.looper.addAfterLoopAction(new TopNodeCollector$onAdapterNotify$4(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int computeTopInfo(com.dianping.shield.node.cellnode.ShieldDisplayNode r13, int r14, com.dianping.shield.node.cellnode.ShieldViewCell r15) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.manager.feature.TopNodeCollector.computeTopInfo(com.dianping.shield.node.cellnode.ShieldDisplayNode, int, com.dianping.shield.node.cellnode.ShieldViewCell):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int computeBottomInfo(ShieldDisplayNode shieldDisplayNode, int i, ShieldViewCell shieldViewCell) {
        final BottomInfo.OnBottomStateChangeListener onBottomStateChangeListener;
        RangeRemoveableArrayList<ShieldSection> rangeRemoveableArrayList;
        ShieldSection shieldSection;
        ShieldSection shieldSection2;
        RangeDispatcher rangeDispatcher;
        ShieldSection shieldSection3;
        Object[] objArr = {shieldDisplayNode, Integer.valueOf(i), shieldViewCell};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2a56d34cebbdd763ac9894e0edbae25", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2a56d34cebbdd763ac9894e0edbae25")).intValue();
        }
        ShieldRow shieldRow = shieldDisplayNode.rowParent;
        InnerHoverInfo.HoverStateChangeListener hoverStateChangeListener = null;
        BottomInfo bottomInfo = shieldRow != null ? shieldRow.getBottomInfo() : null;
        InnerBottomInfo innerBottomInfo = new InnerBottomInfo();
        innerBottomInfo.bottomInfo = bottomInfo;
        ShieldRow shieldRow2 = shieldDisplayNode.rowParent;
        int i2 = -1;
        int sectionStartPosition = (shieldRow2 == null || (shieldSection3 = shieldRow2.sectionParent) == null) ? -1 : this.sectionManager.getSectionStartPosition(shieldSection3);
        ShieldRow shieldRow3 = shieldDisplayNode.rowParent;
        int startPosition = (shieldRow3 == null || (shieldSection2 = shieldRow3.sectionParent) == null || (rangeDispatcher = shieldSection2.getRangeDispatcher()) == null) ? -1 : rangeDispatcher.getStartPosition(i);
        BottomInfo.StartType startType = bottomInfo != null ? bottomInfo.startType : null;
        int i3 = Integer.MAX_VALUE;
        if (startType != null) {
            switch (WhenMappings.$EnumSwitchMapping$3[startType.ordinal()]) {
                case 1:
                    i3 = sectionStartPosition + startPosition;
                    break;
                case 2:
                    break;
                default:
                    throw new j();
            }
        }
        innerBottomInfo.startPos = i3;
        BottomInfo.EndType endType = bottomInfo != null ? bottomInfo.endType : null;
        if (endType != null) {
            switch (WhenMappings.$EnumSwitchMapping$4[endType.ordinal()]) {
                case 1:
                    ShieldSection shieldSection4 = (shieldViewCell == null || (rangeRemoveableArrayList = shieldViewCell.shieldSections) == null) ? null : (ShieldSection) kotlin.collections.h.e((List<? extends Object>) rangeRemoveableArrayList);
                    if (shieldSection4 != null) {
                        i2 = this.sectionManager.getSectionStartPosition(shieldSection4);
                        break;
                    }
                    break;
                case 2:
                    ShieldRow shieldRow4 = shieldDisplayNode.rowParent;
                    if (shieldRow4 != null && (shieldSection = shieldRow4.sectionParent) != null) {
                        i2 = this.sectionManager.getSectionStartPosition(shieldSection);
                        break;
                    }
                    break;
                case 3:
                    i2 = sectionStartPosition + startPosition;
                    break;
            }
        }
        innerBottomInfo.endPos = i2;
        innerBottomInfo.offset = bottomInfo != null ? bottomInfo.offset : 0;
        if (innerBottomInfo.offset != 0) {
            innerBottomInfo.mode = InnerBottomInfo.Mode.OVERLAY;
        }
        innerBottomInfo.needAutoOffset = false;
        innerBottomInfo.zPosition = bottomInfo != null ? bottomInfo.zPosition : 0;
        innerBottomInfo.topDrawable = bottomInfo != null ? bottomInfo.topDrawable : null;
        innerBottomInfo.bottomDrawable = bottomInfo != null ? bottomInfo.bottomDrawable : null;
        if (bottomInfo != null && (onBottomStateChangeListener = bottomInfo.onBottomStateChangeListener) != null) {
            hoverStateChangeListener = new InnerHoverInfo.HoverStateChangeListener() { // from class: com.dianping.shield.manager.feature.TopNodeCollector$computeBottomInfo$1$4$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.shield.node.cellnode.InnerHoverInfo.HoverStateChangeListener
                public final void onStateChanged(ShieldDisplayNode shieldDisplayNode2, InnerHoverInfo.HoverState hoverState) {
                    HoverState hoverState2;
                    Object[] objArr2 = {shieldDisplayNode2, hoverState};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b68efeeba154f541a2cef3d3f7c59214", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b68efeeba154f541a2cef3d3f7c59214");
                        return;
                    }
                    if (hoverState != null) {
                        switch (TopNodeCollector.WhenMappings.$EnumSwitchMapping$5[hoverState.ordinal()]) {
                            case 1:
                                hoverState2 = HoverState.NORMAL;
                                break;
                            case 2:
                                hoverState2 = HoverState.HOVER;
                                break;
                            case 3:
                                hoverState2 = HoverState.END;
                                break;
                            default:
                                throw new j();
                        }
                    } else {
                        hoverState2 = HoverState.NORMAL;
                    }
                    HoverState hoverState3 = hoverState2;
                    BottomInfo.OnBottomStateChangeListener onBottomStateChangeListener2 = BottomInfo.OnBottomStateChangeListener.this;
                    ShieldViewHolder shieldViewHolder = shieldDisplayNode2.viewHolder;
                    NodePath path = shieldDisplayNode2.getPath();
                    CellType cellType = path != null ? path.cellType : null;
                    NodePath path2 = shieldDisplayNode2.getPath();
                    int i4 = path2 != null ? path2.section : -1;
                    NodePath path3 = shieldDisplayNode2.getPath();
                    onBottomStateChangeListener2.onBottomStageChanged(shieldViewHolder, cellType, i4, path3 != null ? path3.row : -1, hoverState3);
                }
            };
        }
        innerBottomInfo.listener = hoverStateChangeListener;
        shieldDisplayNode.innerBottomInfo = innerBottomInfo;
        return sectionStartPosition + startPosition;
    }
}
