package com.dianping.shield.entity;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class CellInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    public CellType cellType;
    public int row;
    public int section;

    public CellInfo(int i, int i2, CellType cellType) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), cellType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e1f3832c60e15e70a6ff12906920913c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e1f3832c60e15e70a6ff12906920913c");
            return;
        }
        this.section = i;
        this.row = i2;
        this.cellType = cellType;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d7b062b9ae402e4885d48d6680d32c4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d7b062b9ae402e4885d48d6680d32c4")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CellInfo cellInfo = (CellInfo) obj;
        return this.section == cellInfo.section && this.row == cellInfo.row && this.cellType == cellInfo.cellType;
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "781a1f9b8de1c71890536ca426556781", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "781a1f9b8de1c71890536ca426556781")).intValue() : (((this.section * 31) + this.row) * 31) + this.cellType.hashCode();
    }
}
