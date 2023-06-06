package com.dianping.shield.manager.feature;

import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import com.dianping.agentsdk.framework.g;
import com.dianping.shield.bridge.feature.AgentGlobalPositionInterface;
import com.dianping.shield.node.cellnode.ShieldCellGroup;
import com.dianping.shield.node.cellnode.ShieldViewCell;
import com.dianping.shield.node.itemcallbacks.SectionBgViewMapCallback;
import com.dianping.shield.preload.ShieldPreloadInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J$\u0010\u0018\u001a\u00020\u00192\u001a\u0010\u001a\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001bj\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c`\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J \u0010&\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020#2\u0006\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020%H\u0016J\b\u0010)\u001a\u00020\u0019H\u0016J\b\u0010*\u001a\u00020\u0019H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006+"}, d2 = {"Lcom/dianping/shield/manager/feature/HasBackgroundNodeCollector;", "Lcom/dianping/shield/manager/feature/CellManagerFeatureInterface;", "Lcom/dianping/shield/manager/feature/CellManagerScrollListenerInterface;", "Lcom/dianping/shield/preload/ShieldPreloadInterface;", "agentGlobalPositionInterface", "Lcom/dianping/shield/bridge/feature/AgentGlobalPositionInterface;", "(Lcom/dianping/shield/bridge/feature/AgentGlobalPositionInterface;)V", "childBgInfoArray", "Landroid/util/SparseArray;", "Lcom/dianping/agentsdk/framework/BackgroundViewInfo;", "handler", "Landroid/os/Handler;", "looper", "Lcom/dianping/shield/manager/feature/LoopCellGroupsCollector;", "getLooper", "()Lcom/dianping/shield/manager/feature/LoopCellGroupsCollector;", "setLooper", "(Lcom/dianping/shield/manager/feature/LoopCellGroupsCollector;)V", "sectionBgViewMapCallback", "Lcom/dianping/shield/node/itemcallbacks/SectionBgViewMapCallback;", "getSectionBgViewMapCallback", "()Lcom/dianping/shield/node/itemcallbacks/SectionBgViewMapCallback;", "setSectionBgViewMapCallback", "(Lcom/dianping/shield/node/itemcallbacks/SectionBgViewMapCallback;)V", "onAdapterNotify", "", "cellGroups", "Ljava/util/ArrayList;", "Lcom/dianping/shield/node/cellnode/ShieldCellGroup;", "Lkotlin/collections/ArrayList;", "onCellNodeRefresh", "shieldViewCell", "Lcom/dianping/shield/node/cellnode/ShieldViewCell;", "onScrollStateChanged", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "newState", "", "onScrolled", "dx", "dy", "shieldPreload", "shieldRecycle", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class HasBackgroundNodeCollector implements CellManagerFeatureInterface, CellManagerScrollListenerInterface, ShieldPreloadInterface {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final AgentGlobalPositionInterface agentGlobalPositionInterface;
    private final SparseArray<g> childBgInfoArray;
    private final Handler handler;
    @Nullable
    private LoopCellGroupsCollector looper;
    @Nullable
    private SectionBgViewMapCallback sectionBgViewMapCallback;

    @Override // com.dianping.shield.manager.feature.CellManagerFeatureInterface
    public final void onCellNodeRefresh(@NotNull ShieldViewCell shieldViewCell) {
        Object[] objArr = {shieldViewCell};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b49ecf2b1903ce837640ce616e2def5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b49ecf2b1903ce837640ce616e2def5c");
        } else {
            h.b(shieldViewCell, "shieldViewCell");
        }
    }

    @Override // com.dianping.shield.manager.feature.CellManagerScrollListenerInterface
    public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
        Object[] objArr = {recyclerView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54dc654c3ad0399bca368eb1e6f72694", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54dc654c3ad0399bca368eb1e6f72694");
        } else {
            h.b(recyclerView, "recyclerView");
        }
    }

    @Override // com.dianping.shield.preload.ShieldPreloadInterface
    public final void shieldPreload() {
    }

    public HasBackgroundNodeCollector(@NotNull AgentGlobalPositionInterface agentGlobalPositionInterface) {
        h.b(agentGlobalPositionInterface, "agentGlobalPositionInterface");
        Object[] objArr = {agentGlobalPositionInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1636ead4ca6684bf9926e7bd8661a569", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1636ead4ca6684bf9926e7bd8661a569");
            return;
        }
        this.agentGlobalPositionInterface = agentGlobalPositionInterface;
        this.childBgInfoArray = new SparseArray<>();
        this.handler = new Handler(Looper.getMainLooper());
    }

    @Nullable
    public final LoopCellGroupsCollector getLooper() {
        return this.looper;
    }

    public final void setLooper(@Nullable LoopCellGroupsCollector loopCellGroupsCollector) {
        this.looper = loopCellGroupsCollector;
    }

    @Nullable
    public final SectionBgViewMapCallback getSectionBgViewMapCallback() {
        return this.sectionBgViewMapCallback;
    }

    public final void setSectionBgViewMapCallback(@Nullable SectionBgViewMapCallback sectionBgViewMapCallback) {
        this.sectionBgViewMapCallback = sectionBgViewMapCallback;
    }

    @Override // com.dianping.shield.preload.ShieldPreloadInterface
    public final void shieldRecycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5fdc969a45bee788206091fcf4afd608", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5fdc969a45bee788206091fcf4afd608");
            return;
        }
        this.looper = null;
        this.sectionBgViewMapCallback = null;
        this.childBgInfoArray.clear();
    }

    @Override // com.dianping.shield.manager.feature.CellManagerFeatureInterface
    public final void onAdapterNotify(@NotNull ArrayList<ShieldCellGroup> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23b7de5219690125b4abb1c4fdd40ada", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23b7de5219690125b4abb1c4fdd40ada");
            return;
        }
        h.b(arrayList, "cellGroups");
        LoopCellGroupsCollector loopCellGroupsCollector = this.looper;
        if (loopCellGroupsCollector != null) {
            loopCellGroupsCollector.addBeforeLoopAction(new HasBackgroundNodeCollector$onAdapterNotify$1(this));
        }
        LoopCellGroupsCollector loopCellGroupsCollector2 = this.looper;
        if (loopCellGroupsCollector2 != null) {
            loopCellGroupsCollector2.addIndexedSectionAction(new HasBackgroundNodeCollector$onAdapterNotify$2(this));
        }
        LoopCellGroupsCollector loopCellGroupsCollector3 = this.looper;
        if (loopCellGroupsCollector3 != null) {
            loopCellGroupsCollector3.addAfterLoopAction(new HasBackgroundNodeCollector$onAdapterNotify$3(this));
        }
    }

    @Override // com.dianping.shield.manager.feature.CellManagerScrollListenerInterface
    public final void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
        Object[] objArr = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6ff69925968918e21878ec590d88d83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6ff69925968918e21878ec590d88d83");
            return;
        }
        h.b(recyclerView, "recyclerView");
        this.handler.post(new Runnable() { // from class: com.dianping.shield.manager.feature.HasBackgroundNodeCollector$onScrolled$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public final void run() {
                SparseArray<g> sparseArray;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4bb0aa00d3a7cf8796901e9a0537f200", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4bb0aa00d3a7cf8796901e9a0537f200");
                    return;
                }
                SectionBgViewMapCallback sectionBgViewMapCallback = HasBackgroundNodeCollector.this.getSectionBgViewMapCallback();
                if (sectionBgViewMapCallback != null) {
                    sparseArray = HasBackgroundNodeCollector.this.childBgInfoArray;
                    sectionBgViewMapCallback.setSectionBgViewMap(sparseArray);
                }
            }
        });
    }
}
