package com.dianping.shield.manager.feature;

import com.dianping.agentsdk.framework.AgentInterface;
import com.dianping.agentsdk.framework.ar;
import com.dianping.shield.consts.ShieldConst;
import com.dianping.shield.node.cellnode.ShieldCellGroup;
import com.dianping.shield.node.cellnode.ShieldViewCell;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J$\u0010\u000f\u001a\u00020\u00102\u001a\u0010\u0011\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00120\bj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0012`\nH\u0016J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/dianping/shield/manager/feature/AgentVisibiltyCollector;", "Lcom/dianping/shield/manager/feature/CellManagerFeatureInterface;", "whiteBoard", "Lcom/dianping/agentsdk/framework/WhiteBoard;", "loopCellGroupsCollector", "Lcom/dianping/shield/manager/feature/LoopCellGroupsCollector;", "(Lcom/dianping/agentsdk/framework/WhiteBoard;Lcom/dianping/shield/manager/feature/LoopCellGroupsCollector;)V", "oldAgentList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getOldAgentList", "()Ljava/util/ArrayList;", "setOldAgentList", "(Ljava/util/ArrayList;)V", "onAdapterNotify", "", "cellGroups", "Lcom/dianping/shield/node/cellnode/ShieldCellGroup;", "onCellNodeRefresh", "shieldViewCell", "Lcom/dianping/shield/node/cellnode/ShieldViewCell;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class AgentVisibiltyCollector implements CellManagerFeatureInterface {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final LoopCellGroupsCollector loopCellGroupsCollector;
    @NotNull
    private ArrayList<String> oldAgentList;
    private final ar whiteBoard;

    @Override // com.dianping.shield.manager.feature.CellManagerFeatureInterface
    public final void onCellNodeRefresh(@NotNull ShieldViewCell shieldViewCell) {
        Object[] objArr = {shieldViewCell};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e43461e0414201131343aecdb5923910", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e43461e0414201131343aecdb5923910");
        } else {
            h.b(shieldViewCell, "shieldViewCell");
        }
    }

    public AgentVisibiltyCollector(@Nullable ar arVar, @NotNull LoopCellGroupsCollector loopCellGroupsCollector) {
        h.b(loopCellGroupsCollector, "loopCellGroupsCollector");
        Object[] objArr = {arVar, loopCellGroupsCollector};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "851ee5e5381146a57afaf8b9e5aa0776", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "851ee5e5381146a57afaf8b9e5aa0776");
            return;
        }
        this.whiteBoard = arVar;
        this.loopCellGroupsCollector = loopCellGroupsCollector;
        this.oldAgentList = new ArrayList<>();
    }

    @NotNull
    public final ArrayList<String> getOldAgentList() {
        return this.oldAgentList;
    }

    public final void setOldAgentList(@NotNull ArrayList<String> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de4bbbabc204eb774bf811c13c22f7e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de4bbbabc204eb774bf811c13c22f7e8");
            return;
        }
        h.b(arrayList, "<set-?>");
        this.oldAgentList = arrayList;
    }

    @Override // com.dianping.shield.manager.feature.CellManagerFeatureInterface
    public final void onAdapterNotify(@NotNull ArrayList<ShieldCellGroup> arrayList) {
        ArrayList<ShieldViewCell> arrayList2;
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9456560f45272f2cb8cb4084113dfc52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9456560f45272f2cb8cb4084113dfc52");
            return;
        }
        h.b(arrayList, "cellGroups");
        ArrayList<String> arrayList3 = new ArrayList<>();
        for (ShieldCellGroup shieldCellGroup : arrayList) {
            if (shieldCellGroup != null && (arrayList2 = shieldCellGroup.shieldViewCells) != null) {
                for (ShieldViewCell shieldViewCell : arrayList2) {
                    AgentInterface agentInterface = shieldViewCell.owner;
                    String str = (agentInterface == null || (str = agentInterface.getHostName()) == null) ? "" : "";
                    if (this.whiteBoard != null) {
                        if (shieldViewCell.getViewCellTotalRange() > 0) {
                            arrayList3.add(str);
                            ar arVar = this.whiteBoard;
                            if (!arVar.d(ShieldConst.AGENT_VISIBILITY_KEY + str)) {
                                ar arVar2 = this.whiteBoard;
                                arVar2.a(ShieldConst.AGENT_VISIBILITY_KEY + str, true);
                            }
                        } else {
                            ar arVar3 = this.whiteBoard;
                            if (arVar3.d(ShieldConst.AGENT_VISIBILITY_KEY + str)) {
                                ar arVar4 = this.whiteBoard;
                                arVar4.a(ShieldConst.AGENT_VISIBILITY_KEY + str, false);
                            }
                        }
                    }
                }
            }
        }
        if (arrayList3.size() == this.oldAgentList.size() && arrayList3.equals(this.oldAgentList)) {
            return;
        }
        this.oldAgentList = arrayList3;
        ar arVar5 = this.whiteBoard;
        if (arVar5 != null) {
            arVar5.a(ShieldConst.AGENT_VISIBILITY_LIST_KEY, (Serializable) arrayList3);
        }
    }
}
