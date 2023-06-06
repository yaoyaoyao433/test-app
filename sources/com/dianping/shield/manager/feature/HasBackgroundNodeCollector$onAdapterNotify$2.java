package com.dianping.shield.manager.feature;

import android.util.SparseArray;
import com.dianping.agentsdk.framework.g;
import com.dianping.shield.bridge.feature.AgentGlobalPositionInterface;
import com.dianping.shield.entity.NodeInfo;
import com.dianping.shield.node.cellnode.ShieldSection;
import com.dianping.shield.node.cellnode.ShieldViewCell;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.c;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import kotlin.r;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "sectionIndex", "", "shieldSection", "Lcom/dianping/shield/node/cellnode/ShieldSection;", "invoke"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class HasBackgroundNodeCollector$onAdapterNotify$2 extends i implements c<Integer, ShieldSection, r> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ HasBackgroundNodeCollector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HasBackgroundNodeCollector$onAdapterNotify$2(HasBackgroundNodeCollector hasBackgroundNodeCollector) {
        super(2);
        this.this$0 = hasBackgroundNodeCollector;
    }

    @Override // kotlin.jvm.functions.c
    public final /* synthetic */ r invoke(Integer num, ShieldSection shieldSection) {
        invoke(num.intValue(), shieldSection);
        return r.a;
    }

    public final void invoke(int i, @NotNull ShieldSection shieldSection) {
        AgentGlobalPositionInterface agentGlobalPositionInterface;
        SparseArray sparseArray;
        Object[] objArr = {Integer.valueOf(i), shieldSection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef6185d9988c576cc7d9f8e73a647836", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef6185d9988c576cc7d9f8e73a647836");
            return;
        }
        h.b(shieldSection, "shieldSection");
        g gVar = shieldSection.backgroundViewInfo;
        if (gVar == null || gVar.b == null) {
            return;
        }
        agentGlobalPositionInterface = this.this$0.agentGlobalPositionInterface;
        ShieldViewCell shieldViewCell = shieldSection.cellParent;
        NodeInfo agent = NodeInfo.agent(shieldViewCell != null ? shieldViewCell.owner : null);
        h.a((Object) agent, "NodeInfo.agent(shieldSection.cellParent?.owner)");
        int nodeGlobalPosition = agentGlobalPositionInterface.getNodeGlobalPosition(agent);
        sparseArray = this.this$0.childBgInfoArray;
        sparseArray.put(nodeGlobalPosition, shieldSection.backgroundViewInfo);
    }
}
