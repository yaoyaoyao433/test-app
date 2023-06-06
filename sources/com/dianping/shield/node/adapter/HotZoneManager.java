package com.dianping.shield.node.adapter;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import com.dianping.shield.entity.HotZoneYRange;
import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.node.adapter.hotzone.HotZoneInfo;
import com.dianping.shield.node.adapter.hotzone.HotZoneLocation;
import com.dianping.shield.node.adapter.status.ViewLocationRectInterface;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class HotZoneManager extends ViewLocationChangeProcessor<ShieldDisplayNode> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean needObserver;
    private NodeList nodeList;
    private boolean onlyObserverInHotZone;
    private RecyclerView recyclerView;
    private boolean reverseRange;

    public abstract HotZoneYRange getHotZoneYRange();

    public abstract void updateHotZoneLocation(ArrayList<HotZoneInfo> arrayList, ScrollDirection scrollDirection);

    public HotZoneManager(ViewLocationRectInterface viewLocationRectInterface) {
        super(viewLocationRectInterface);
        Object[] objArr = {viewLocationRectInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88eaa470081aee814b98f8fad9cb939b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88eaa470081aee814b98f8fad9cb939b");
            return;
        }
        this.onlyObserverInHotZone = true;
        this.reverseRange = false;
    }

    public void setNodeList(NodeList nodeList) {
        this.nodeList = nodeList;
    }

    public void isObserverLocationChanged(boolean z) {
        this.needObserver = z;
    }

    public void setReverseRange(boolean z) {
        this.reverseRange = z;
    }

    public void setOnlyObserverInHotZone(boolean z) {
        this.onlyObserverInHotZone = z;
    }

    @Override // com.dianping.shield.node.adapter.ViewLocationChangeProcessor
    public void onViewLocationChanged(ScrollDirection scrollDirection) {
        Object[] objArr = {scrollDirection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9deadc72e0f2e545cdc00000fcaabb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9deadc72e0f2e545cdc00000fcaabb7");
        } else if (this.needObserver) {
            updateHotZoneState(this.firstLastPositionInfo.locationSparseArray, scrollDirection);
        }
    }

    private ShieldDisplayNode getDisplayNode(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9f9b8800a92522edbbfb835cdb0638a", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldDisplayNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9f9b8800a92522edbbfb835cdb0638a");
        }
        if (i < 0 || this.nodeList == null || i >= this.nodeList.size()) {
            return null;
        }
        return this.nodeList.getDisplayElement(i);
    }

    private void updateHotZoneState(SparseArray<HotZoneLocation> sparseArray, ScrollDirection scrollDirection) {
        Object[] objArr = {sparseArray, scrollDirection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ac2acba3c2af0df973bb1153a247b63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ac2acba3c2af0df973bb1153a247b63");
        } else if (sparseArray.size() != 0) {
            ArrayList<HotZoneInfo> arrayList = new ArrayList<>();
            for (int i = 0; i < sparseArray.size(); i++) {
                int keyAt = sparseArray.keyAt(i);
                HotZoneLocation valueAt = sparseArray.valueAt(i);
                ShieldDisplayNode displayNode = getDisplayNode(keyAt);
                if (displayNode == null) {
                    break;
                }
                if (this.onlyObserverInHotZone) {
                    if (valueAt == HotZoneLocation.BT_BE || valueAt == HotZoneLocation.BT_BT || valueAt == HotZoneLocation.US_BE || valueAt == HotZoneLocation.US_BT) {
                        arrayList.add(new HotZoneInfo(displayNode, valueAt));
                    }
                } else {
                    arrayList.add(new HotZoneInfo(displayNode, valueAt));
                }
            }
            updateHotZoneLocation(arrayList, scrollDirection);
        }
    }
}
