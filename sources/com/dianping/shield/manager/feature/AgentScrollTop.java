package com.dianping.shield.manager.feature;

import android.support.v7.widget.RecyclerView;
import com.dianping.agentsdk.framework.AgentInterface;
import com.dianping.shield.bridge.feature.AgentScrollerInterface;
import com.dianping.shield.entity.AgentScrollerParams;
import com.dianping.shield.node.cellnode.ShieldCellGroup;
import com.dianping.shield.node.cellnode.ShieldViewCell;
import com.dianping.shield.preload.ShieldPreloadInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J$\u0010\f\u001a\u00020\r2\u001a\u0010\u000e\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0010`\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J \u0010\u0019\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0018H\u0016J\b\u0010\u001c\u001a\u00020\rH\u0016J\b\u0010\u001d\u001a\u00020\rH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/dianping/shield/manager/feature/AgentScrollTop;", "Lcom/dianping/shield/manager/feature/CellManagerFeatureInterface;", "Lcom/dianping/shield/manager/feature/CellManagerScrollListenerInterface;", "Lcom/dianping/shield/preload/ShieldPreloadInterface;", "scroller", "Lcom/dianping/shield/bridge/feature/AgentScrollerInterface;", "(Lcom/dianping/shield/bridge/feature/AgentScrollerInterface;)V", "idNeedScroll", "", "scrollToTopByFirstMarkedAgent", "scrollToTopCell", "Lcom/dianping/shield/node/cellnode/ShieldViewCell;", "onAdapterNotify", "", "cellGroups", "Ljava/util/ArrayList;", "Lcom/dianping/shield/node/cellnode/ShieldCellGroup;", "Lkotlin/collections/ArrayList;", "onCellNodeRefresh", "shieldViewCell", "onScrollStateChanged", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "newState", "", "onScrolled", "dx", "dy", "shieldPreload", "shieldRecycle", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class AgentScrollTop implements CellManagerFeatureInterface, CellManagerScrollListenerInterface, ShieldPreloadInterface {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean idNeedScroll;
    @JvmField
    public boolean scrollToTopByFirstMarkedAgent;
    private ShieldViewCell scrollToTopCell;
    private final AgentScrollerInterface scroller;

    @Override // com.dianping.shield.manager.feature.CellManagerScrollListenerInterface
    public final void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
        Object[] objArr = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c73e10963ca3d69c76a34dc9914854d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c73e10963ca3d69c76a34dc9914854d");
        } else {
            h.b(recyclerView, "recyclerView");
        }
    }

    @Override // com.dianping.shield.preload.ShieldPreloadInterface
    public final void shieldPreload() {
    }

    public AgentScrollTop(@NotNull AgentScrollerInterface agentScrollerInterface) {
        h.b(agentScrollerInterface, "scroller");
        Object[] objArr = {agentScrollerInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45233be872de42b4138d82defd696697", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45233be872de42b4138d82defd696697");
            return;
        }
        this.scroller = agentScrollerInterface;
        this.idNeedScroll = true;
    }

    @Override // com.dianping.shield.preload.ShieldPreloadInterface
    public final void shieldRecycle() {
        this.idNeedScroll = true;
        this.scrollToTopCell = null;
        this.scrollToTopByFirstMarkedAgent = false;
    }

    @Override // com.dianping.shield.manager.feature.CellManagerFeatureInterface
    public final void onCellNodeRefresh(@NotNull ShieldViewCell shieldViewCell) {
        Object[] objArr = {shieldViewCell};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4df4cee4ec3b58765f1b2d911eed3a48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4df4cee4ec3b58765f1b2d911eed3a48");
            return;
        }
        h.b(shieldViewCell, "shieldViewCell");
        if (shieldViewCell.needScrollToTop && this.idNeedScroll) {
            if (!this.scrollToTopByFirstMarkedAgent || this.scrollToTopCell == null) {
                this.scrollToTopCell = shieldViewCell;
            }
        }
    }

    @Override // com.dianping.shield.manager.feature.CellManagerFeatureInterface
    public final void onAdapterNotify(@NotNull ArrayList<ShieldCellGroup> arrayList) {
        ShieldViewCell shieldViewCell;
        AgentInterface agentInterface;
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af6bcbdf3cf7eb7ba465fa6ef63ecbd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af6bcbdf3cf7eb7ba465fa6ef63ecbd9");
            return;
        }
        h.b(arrayList, "cellGroups");
        if (!this.idNeedScroll || (shieldViewCell = this.scrollToTopCell) == null || (agentInterface = shieldViewCell.owner) == null) {
            return;
        }
        AgentScrollerInterface agentScrollerInterface = this.scroller;
        AgentScrollerParams smooth = AgentScrollerParams.toAgent(agentInterface).setNeedAutoOffset(true).setSmooth(false);
        h.a((Object) smooth, "AgentScrollerParams.toAg…et(true).setSmooth(false)");
        agentScrollerInterface.scrollToNode(smooth);
    }

    @Override // com.dianping.shield.manager.feature.CellManagerScrollListenerInterface
    public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
        Object[] objArr = {recyclerView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05823faa4c5a000a5352550981a26747", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05823faa4c5a000a5352550981a26747");
            return;
        }
        h.b(recyclerView, "recyclerView");
        if (this.scrollToTopCell != null && this.idNeedScroll && i == 1) {
            this.idNeedScroll = false;
        }
    }
}
