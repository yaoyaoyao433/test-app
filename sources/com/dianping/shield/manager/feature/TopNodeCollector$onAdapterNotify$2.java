package com.dianping.shield.manager.feature;

import android.util.SparseArray;
import com.dianping.agentsdk.framework.AgentInterface;
import com.dianping.shield.bridge.feature.AgentGlobalPositionInterface;
import com.dianping.shield.entity.NodeInfo;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.dianping.shield.node.cellnode.ShieldFloatViewDisplayNode;
import com.dianping.shield.node.cellnode.ShieldRow;
import com.dianping.shield.node.cellnode.ShieldSection;
import com.dianping.shield.node.cellnode.ShieldViewCell;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.functions.c;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import kotlin.r;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "rowIndex", "", "shieldRow", "Lcom/dianping/shield/node/cellnode/ShieldRow;", "invoke"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class TopNodeCollector$onAdapterNotify$2 extends i implements c<Integer, ShieldRow, r> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ TopNodeCollector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopNodeCollector$onAdapterNotify$2(TopNodeCollector topNodeCollector) {
        super(2);
        this.this$0 = topNodeCollector;
    }

    @Override // kotlin.jvm.functions.c
    public final /* synthetic */ r invoke(Integer num, ShieldRow shieldRow) {
        invoke(num.intValue(), shieldRow);
        return r.a;
    }

    public final void invoke(int i, @NotNull ShieldRow shieldRow) {
        AgentGlobalPositionInterface agentGlobalPositionInterface;
        HashSet hashSet;
        ShieldViewCell shieldViewCell;
        ShieldDisplayNode displayNodeAtPosition;
        int computeBottomInfo;
        SparseArray sparseArray;
        SparseArray sparseArray2;
        ShieldDisplayNode displayNodeAtPosition2;
        int computeTopInfo;
        SparseArray sparseArray3;
        Object[] objArr = {Integer.valueOf(i), shieldRow};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "16d7bc321546f2db398465239d1e9a2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "16d7bc321546f2db398465239d1e9a2a");
            return;
        }
        h.b(shieldRow, "shieldRow");
        AgentInterface agentInterface = null;
        if (shieldRow.getTopInfo() != null && (displayNodeAtPosition2 = shieldRow.getDisplayNodeAtPosition(0)) != null) {
            TopNodeCollector topNodeCollector = this.this$0;
            ShieldSection shieldSection = shieldRow.sectionParent;
            computeTopInfo = topNodeCollector.computeTopInfo(displayNodeAtPosition2, i, shieldSection != null ? shieldSection.cellParent : null);
            sparseArray3 = this.this$0.hoverNodesArray;
            sparseArray3.put(computeTopInfo, displayNodeAtPosition2);
        }
        if (shieldRow.getBottomInfo() != null && (displayNodeAtPosition = shieldRow.getDisplayNodeAtPosition(0)) != null) {
            TopNodeCollector topNodeCollector2 = this.this$0;
            ShieldSection shieldSection2 = shieldRow.sectionParent;
            computeBottomInfo = topNodeCollector2.computeBottomInfo(displayNodeAtPosition, i, shieldSection2 != null ? shieldSection2.cellParent : null);
            sparseArray = this.this$0.hoverNodesArray;
            if (sparseArray.indexOfKey(computeBottomInfo) < 0) {
                sparseArray2 = this.this$0.hoverNodesArray;
                sparseArray2.put(computeBottomInfo, displayNodeAtPosition);
            }
        }
        ShieldFloatViewDisplayNode shieldFloatViewDisplayNode = shieldRow.shieldFloatViewNode;
        if (shieldFloatViewDisplayNode == null || shieldFloatViewDisplayNode.viewPaintingCallback == null) {
            return;
        }
        int currentRowIndex = shieldRow.currentRowIndex();
        ShieldSection shieldSection3 = shieldRow.sectionParent;
        int currentSectionIndex = shieldSection3 != null ? shieldSection3.currentSectionIndex() : -1;
        ShieldSection shieldSection4 = shieldRow.sectionParent;
        if (shieldSection4 != null && (shieldViewCell = shieldSection4.cellParent) != null) {
            agentInterface = shieldViewCell.owner;
        }
        agentGlobalPositionInterface = this.this$0.agentGlobalPosition;
        NodeInfo row = NodeInfo.row(agentInterface, currentSectionIndex, currentRowIndex);
        h.a((Object) row, "NodeInfo.row(agent, sectionIndex, rowIndex)");
        int nodeGlobalPosition = agentGlobalPositionInterface.getNodeGlobalPosition(row);
        ShieldFloatViewDisplayNode shieldFloatViewDisplayNode2 = shieldRow.shieldFloatViewNode;
        if (shieldFloatViewDisplayNode2 != null) {
            shieldFloatViewDisplayNode2.anchorPosition = nodeGlobalPosition;
        }
        hashSet = this.this$0.floatNodeHashSet;
        hashSet.add(shieldRow.shieldFloatViewNode);
    }
}
