package com.dianping.shield.node.adapter;

import com.dianping.shield.entity.CellInfo;
import com.dianping.shield.entity.CellType;
import com.dianping.shield.entity.HotZoneYRange;
import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.feature.HotZoneItemStatusInterface;
import com.dianping.shield.node.adapter.hotzone.CellHotZoneInfo;
import com.dianping.shield.node.adapter.hotzone.HotZoneInfo;
import com.dianping.shield.node.adapter.hotzone.HotZoneLocation;
import com.dianping.shield.node.adapter.status.ViewLocationRectInterface;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.dianping.shield.node.cellnode.ShieldViewCell;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class HotZoneItemManager extends HotZoneManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected ArrayList<CellHotZoneInfo> cellLocationList;
    protected ArrayList<CellHotZoneInfo> hotZoneCellList;
    protected HotZoneItemStatusInterface hotZoneItemStatusInterface;
    protected boolean isAddLastRowIndex;
    protected ArrayList<CellInfo> targetCellList;

    public HotZoneItemManager(ViewLocationRectInterface viewLocationRectInterface) {
        super(viewLocationRectInterface);
        Object[] objArr = {viewLocationRectInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "10eef67850c39f9afd87a8ca2e0c3e7f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "10eef67850c39f9afd87a8ca2e0c3e7f");
            return;
        }
        this.cellLocationList = new ArrayList<>();
        this.hotZoneCellList = new ArrayList<>();
        this.isAddLastRowIndex = false;
    }

    @Override // com.dianping.shield.node.adapter.HotZoneManager
    public HotZoneYRange getHotZoneYRange() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a41a2440281e2bb3b44f3adec2f4e370", RobustBitConfig.DEFAULT_VALUE)) {
            return (HotZoneYRange) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a41a2440281e2bb3b44f3adec2f4e370");
        }
        if (this.hotZoneItemStatusInterface != null) {
            return this.hotZoneItemStatusInterface.defineHotZone();
        }
        return null;
    }

    public void setHotZoneItemStatusInterface(HotZoneItemStatusInterface hotZoneItemStatusInterface) {
        Object[] objArr = {hotZoneItemStatusInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c251dcd72e5be3a2d892fdb3ef41c0b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c251dcd72e5be3a2d892fdb3ef41c0b6");
            return;
        }
        this.hotZoneItemStatusInterface = hotZoneItemStatusInterface;
        this.targetCellList = hotZoneItemStatusInterface.targetCells();
    }

    private CellInfo getCellInfo(ShieldDisplayNode shieldDisplayNode) {
        Object[] objArr = {shieldDisplayNode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2af2b4d2551a4ec37cd1dfbcf29d58d0", RobustBitConfig.DEFAULT_VALUE)) {
            return (CellInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2af2b4d2551a4ec37cd1dfbcf29d58d0");
        }
        int currentRowIndex = shieldDisplayNode.rowParent.currentRowIndex();
        int currentSectionIndex = shieldDisplayNode.rowParent.sectionParent.currentSectionIndex();
        CellType cellType = null;
        if (currentRowIndex > 0) {
            cellType = CellType.NORMAL;
        } else if (currentRowIndex == -1) {
            cellType = CellType.HEADER;
        } else if (currentRowIndex == -2) {
            cellType = CellType.FOOTER;
        }
        return new CellInfo(currentSectionIndex, currentRowIndex, cellType);
    }

    private CellInfo getCellInfo(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "785a5783765338abc7021b09215ec7cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (CellInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "785a5783765338abc7021b09215ec7cd");
        }
        CellType cellType = null;
        if (i2 > 0) {
            cellType = CellType.NORMAL;
        } else if (i2 == -1) {
            cellType = CellType.HEADER;
        } else if (i2 == -2) {
            cellType = CellType.FOOTER;
        }
        return new CellInfo(i, i2, cellType);
    }

    private boolean isHotZoneCell(ArrayList<CellInfo> arrayList, CellInfo cellInfo) {
        Object[] objArr = {arrayList, cellInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8b68439fa46b75f123c7d5d9880643b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8b68439fa46b75f123c7d5d9880643b")).booleanValue();
        }
        if (arrayList.size() == 0) {
            return false;
        }
        for (int i = 0; i < arrayList.size() - 1; i++) {
            CellInfo cellInfo2 = arrayList.get(i);
            CellInfo cellInfo3 = arrayList.get(i);
            if (cellInfo.section >= cellInfo2.section && cellInfo.section <= cellInfo3.section && cellInfo.row >= cellInfo2.row && cellInfo.row <= cellInfo.row) {
                return true;
            }
        }
        return false;
    }

    private void addLastRow(ShieldDisplayNode shieldDisplayNode) {
        Object[] objArr = {shieldDisplayNode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a546a5ccc58b9c95fe8e61aa48a983b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a546a5ccc58b9c95fe8e61aa48a983b3");
            return;
        }
        ShieldViewCell shieldViewCell = shieldDisplayNode.rowParent.sectionParent.cellParent;
        int size = shieldViewCell.shieldSections.size() - 1;
        this.targetCellList.add(getCellInfo(size, shieldViewCell.getEntry(size).shieldRows.size() > 0 ? shieldViewCell.getEntry(size).shieldRows.size() - 1 : 0));
        this.isAddLastRowIndex = true;
    }

    @Override // com.dianping.shield.node.adapter.HotZoneManager
    public void updateHotZoneLocation(ArrayList<HotZoneInfo> arrayList, ScrollDirection scrollDirection) {
        Object[] objArr = {arrayList, scrollDirection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "453d8cce29ad78481628abcf857e9ce8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "453d8cce29ad78481628abcf857e9ce8");
        } else if (arrayList.size() != 0 && this.hotZoneItemStatusInterface != null) {
            this.cellLocationList.clear();
            this.hotZoneCellList.clear();
            for (int i = 0; i < arrayList.size(); i++) {
                HotZoneLocation hotZoneLocation = arrayList.get(i).hotZoneLocation;
                ShieldDisplayNode shieldDisplayNode = arrayList.get(i).shieldDisplayNode;
                if (shieldDisplayNode == null) {
                    break;
                }
                CellInfo cellInfo = getCellInfo(shieldDisplayNode);
                CellHotZoneInfo cellHotZoneInfo = new CellHotZoneInfo(cellInfo, hotZoneLocation);
                if (isHotZoneCell(this.targetCellList, cellInfo)) {
                    if (!this.isAddLastRowIndex) {
                        addLastRow(shieldDisplayNode);
                    }
                    this.hotZoneCellList.add(cellHotZoneInfo);
                }
                this.cellLocationList.add(cellHotZoneInfo);
                StringBuilder sb = new StringBuilder("--------------前indexsection");
                sb.append(cellHotZoneInfo.cellInfo.section);
                sb.append("row");
                sb.append(cellHotZoneInfo.cellInfo.row);
                sb.append("Location");
                sb.append(cellHotZoneInfo.hotZoneLocation);
            }
            if (this.targetCellList.size() > 0) {
                this.hotZoneItemStatusInterface.onHotZoneLocationChanged(this.hotZoneCellList, scrollDirection);
            } else {
                this.hotZoneItemStatusInterface.onHotZoneLocationChanged(this.cellLocationList, scrollDirection);
            }
        }
    }
}
