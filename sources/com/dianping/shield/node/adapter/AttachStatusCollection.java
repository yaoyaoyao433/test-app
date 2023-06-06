package com.dianping.shield.node.adapter;

import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.node.adapter.hotzone.HotZoneLocation;
import com.dianping.shield.node.adapter.status.ElementContainerCommonInterface;
import com.dianping.shield.preload.ShieldPreloadInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class AttachStatusCollection implements ShieldPreloadInterface {
    public static ChangeQuickRedirect changeQuickRedirect;
    private ElementContainerCommonInterface elementContainerCommonFeature;
    protected ArrayList<ViewLocationChangeProcessor> processorList;
    private boolean running;

    @Override // com.dianping.shield.preload.ShieldPreloadInterface
    public void shieldPreload() {
    }

    public AttachStatusCollection() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b23c4526833946b85f2de44c0d8ef90b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b23c4526833946b85f2de44c0d8ef90b");
            return;
        }
        this.processorList = new ArrayList<>();
        this.running = true;
    }

    public void setRunning(boolean z) {
        this.running = z;
    }

    public void addAttStatusManager(ViewLocationChangeProcessor viewLocationChangeProcessor) {
        Object[] objArr = {viewLocationChangeProcessor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9515decbfd3eab887d22dffb35cce84c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9515decbfd3eab887d22dffb35cce84c");
        } else {
            this.processorList.add(viewLocationChangeProcessor);
        }
    }

    public void removeAttStatusManager(ViewLocationChangeProcessor viewLocationChangeProcessor) {
        Object[] objArr = {viewLocationChangeProcessor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68aa954b700923726a22f6c6909837f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68aa954b700923726a22f6c6909837f4");
        } else {
            this.processorList.remove(viewLocationChangeProcessor);
        }
    }

    public void removeAllViewLocationProcessors() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d6ce600ea972e97c144d1d9207c4090e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d6ce600ea972e97c144d1d9207c4090e");
        } else {
            this.processorList.clear();
        }
    }

    public void updateFistLastPositionInfo(int i, HotZoneLocation.ScrollOrientation scrollOrientation, ScrollDirection scrollDirection) {
        Object[] objArr = {Integer.valueOf(i), scrollOrientation, scrollDirection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "002607fdd87c187aafb1091b9ac7d2d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "002607fdd87c187aafb1091b9ac7d2d6");
        } else {
            updateFistLastPositionInfo(i, scrollOrientation, scrollDirection, false);
        }
    }

    public void updateFistLastPositionInfo(int i, HotZoneLocation.ScrollOrientation scrollOrientation, ScrollDirection scrollDirection, boolean z) {
        Object[] objArr = {Integer.valueOf(i), scrollOrientation, scrollDirection, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "560f9a6da96450b78f07b31892b60bf9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "560f9a6da96450b78f07b31892b60bf9");
        } else if (this.running) {
            updateIndex(scrollOrientation, i, z);
            updateProcessors(scrollDirection);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0107 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void updateIndex(com.dianping.shield.node.adapter.hotzone.HotZoneLocation.ScrollOrientation r19, int r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.node.adapter.AttachStatusCollection.updateIndex(com.dianping.shield.node.adapter.hotzone.HotZoneLocation$ScrollOrientation, int, boolean):void");
    }

    public void updateProcessors(ScrollDirection scrollDirection) {
        Object[] objArr = {scrollDirection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "87c2709b0ff1ae78779c17800ff8314a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "87c2709b0ff1ae78779c17800ff8314a");
            return;
        }
        Iterator<ViewLocationChangeProcessor> it = this.processorList.iterator();
        while (it.hasNext()) {
            it.next().onViewLocationChanged(scrollDirection);
        }
    }

    public void setElementContainerCommonFeature(ElementContainerCommonInterface elementContainerCommonInterface) {
        this.elementContainerCommonFeature = elementContainerCommonInterface;
    }

    public void storeCurrentInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54b48448fcbc96489c1fa003ddc7e1a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54b48448fcbc96489c1fa003ddc7e1a0");
            return;
        }
        Iterator<ViewLocationChangeProcessor> it = this.processorList.iterator();
        while (it.hasNext()) {
            ViewLocationChangeProcessor next = it.next();
            if (next instanceof AttachStatusManager) {
                ((AttachStatusManager) next).storeCurrentInfo();
            }
        }
    }

    public void clearStoredPositionInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1e848719a933f61a7b78bf4d5b42d05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1e848719a933f61a7b78bf4d5b42d05");
            return;
        }
        Iterator<ViewLocationChangeProcessor> it = this.processorList.iterator();
        while (it.hasNext()) {
            ViewLocationChangeProcessor next = it.next();
            if (next instanceof AttachStatusManager) {
                ((AttachStatusManager) next).clearStoredPositionInfo();
            }
        }
    }

    public void clearCurrentInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf6eb5fa117da339539789e5f6fe242b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf6eb5fa117da339539789e5f6fe242b");
            return;
        }
        Iterator<ViewLocationChangeProcessor> it = this.processorList.iterator();
        while (it.hasNext()) {
            ViewLocationChangeProcessor next = it.next();
            if (next instanceof AttachStatusManager) {
                ((AttachStatusManager) next).clearCurrentInfo();
            }
        }
    }

    public void clearAttachStatus() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7bf6488a28ac00462679f4b82c1060be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7bf6488a28ac00462679f4b82c1060be");
            return;
        }
        Iterator<ViewLocationChangeProcessor> it = this.processorList.iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
    }

    public void setNeedLoadStore(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b1957c0644a837f9028111a2c817a286", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b1957c0644a837f9028111a2c817a286");
            return;
        }
        Iterator<ViewLocationChangeProcessor> it = this.processorList.iterator();
        while (it.hasNext()) {
            ViewLocationChangeProcessor next = it.next();
            if (next instanceof AttachStatusManager) {
                ((AttachStatusManager) next).setNeedLoadStore(z);
            }
        }
    }

    @Override // com.dianping.shield.preload.ShieldPreloadInterface
    public void shieldRecycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38dea61992e068f20079e1dee3c3d936", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38dea61992e068f20079e1dee3c3d936");
            return;
        }
        this.running = true;
        for (int size = this.processorList.size() - 1; size >= 0; size--) {
            if ((this.processorList.get(size) instanceof HotZoneAgentManager) || (this.processorList.get(size) instanceof HotZoneItemManager)) {
                this.processorList.remove(size);
            }
        }
    }
}
