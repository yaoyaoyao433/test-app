package com.dianping.shield.manager.feature;

import android.support.v7.widget.RecyclerView;
import com.dianping.shield.feature.HotZoneItemStatusInterface;
import com.dianping.shield.feature.HotZoneStatusInterface;
import com.dianping.shield.node.adapter.HotZoneAgentManager;
import com.dianping.shield.node.adapter.HotZoneItemManager;
import com.dianping.shield.node.adapter.ShieldDisplayNodeAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016R\u0012\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/dianping/shield/manager/feature/HotZoneScrollListener;", "Lcom/dianping/shield/manager/feature/CellManagerScrollListenerInterface;", "nodeAdapter", "Lcom/dianping/shield/node/adapter/ShieldDisplayNodeAdapter;", "(Lcom/dianping/shield/node/adapter/ShieldDisplayNodeAdapter;)V", "isScrollingForHotZone", "", "changeHotZoneObserverStatus", "", "needNotify", "onScrollStateChanged", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "newState", "", "onScrolled", "dx", "dy", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class HotZoneScrollListener implements CellManagerScrollListenerInterface {
    public static ChangeQuickRedirect changeQuickRedirect;
    @JvmField
    public boolean isScrollingForHotZone;
    private final ShieldDisplayNodeAdapter nodeAdapter;

    public HotZoneScrollListener(@NotNull ShieldDisplayNodeAdapter shieldDisplayNodeAdapter) {
        h.b(shieldDisplayNodeAdapter, "nodeAdapter");
        Object[] objArr = {shieldDisplayNodeAdapter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f58c6c8ebc5758469517544cb171802", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f58c6c8ebc5758469517544cb171802");
        } else {
            this.nodeAdapter = shieldDisplayNodeAdapter;
        }
    }

    @Override // com.dianping.shield.manager.feature.CellManagerScrollListenerInterface
    public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
        Object[] objArr = {recyclerView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f96595e4f63e951238f197e0221666a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f96595e4f63e951238f197e0221666a3");
            return;
        }
        h.b(recyclerView, "recyclerView");
        if (this.isScrollingForHotZone && i == 0) {
            changeHotZoneObserverStatus(true);
            this.isScrollingForHotZone = false;
            return;
        }
        changeHotZoneObserverStatus(false);
    }

    @Override // com.dianping.shield.manager.feature.CellManagerScrollListenerInterface
    public final void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
        Object[] objArr = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4db972186ac73df50fa4820233b098b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4db972186ac73df50fa4820233b098b");
            return;
        }
        h.b(recyclerView, "recyclerView");
        if (!this.isScrollingForHotZone) {
            changeHotZoneObserverStatus(true);
        } else {
            changeHotZoneObserverStatus(false);
        }
    }

    public final void changeHotZoneObserverStatus(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12a7bcff6a64000901ec99d2a09b0142", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12a7bcff6a64000901ec99d2a09b0142");
            return;
        }
        HashMap<HotZoneItemStatusInterface, HotZoneItemManager> hotZoneItemStatusInterfaceHashMap = this.nodeAdapter.getHotZoneItemStatusInterfaceHashMap();
        HashMap<HotZoneStatusInterface, HotZoneAgentManager> hotZoneStatusInterfaceHashMap = this.nodeAdapter.getHotZoneStatusInterfaceHashMap();
        for (HotZoneItemManager hotZoneItemManager : hotZoneItemStatusInterfaceHashMap.values()) {
            hotZoneItemManager.isObserverLocationChanged(z);
        }
        for (HotZoneAgentManager hotZoneAgentManager : hotZoneStatusInterfaceHashMap.values()) {
            hotZoneAgentManager.isObserverLocationChanged(z);
        }
    }
}
