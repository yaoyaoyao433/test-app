package com.dianping.shield.entity;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ExposedDetails {
    public static ChangeQuickRedirect changeQuickRedirect;
    public CellType cellType;
    public boolean isComplete;
    public int row;
    public int section;

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be51043458d50e07ee95df42d8db1209", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be51043458d50e07ee95df42d8db1209")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExposedDetails exposedDetails = (ExposedDetails) obj;
        return this.section == exposedDetails.section && this.row == exposedDetails.row && this.isComplete == exposedDetails.isComplete && this.cellType == exposedDetails.cellType;
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b4ab5c399931188a39902e49c0ccf72", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b4ab5c399931188a39902e49c0ccf72")).intValue();
        }
        return (((((this.section * 31) + this.row) * 31) + (this.cellType != null ? this.cellType.hashCode() : 0)) * 31) + (this.isComplete ? 1 : 0);
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b7423225c6fc3a7753c0fe1aaa3c637", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b7423225c6fc3a7753c0fe1aaa3c637");
        }
        return "ExposedDetails{section=" + this.section + ", row=" + this.row + ", cellType=" + this.cellType + ", isComplete=" + this.isComplete + '}';
    }
}
