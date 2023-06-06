package com.dianping.shield.entity;

import com.dianping.agentsdk.framework.af;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ExposedAction {
    public static ChangeQuickRedirect changeQuickRedirect;
    public CellType cellType;
    public boolean isAddExposed;
    public boolean isAgentExposed;
    public af owner;
    public int row;
    public int section;

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2d9d381062caa6f627f2ccf26060f75", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2d9d381062caa6f627f2ccf26060f75")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExposedAction exposedAction = (ExposedAction) obj;
        return this.section == exposedAction.section && this.row == exposedAction.row && this.isAgentExposed == exposedAction.isAgentExposed && this.owner.equals(exposedAction.owner) && this.cellType == exposedAction.cellType;
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9877057458f9538a6bc5d459b04d1a6b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9877057458f9538a6bc5d459b04d1a6b")).intValue();
        }
        return (((((((this.owner.hashCode() * 31) + this.section) * 31) + this.row) * 31) + (this.cellType != null ? this.cellType.hashCode() : 0)) * 31) + (this.isAgentExposed ? 1 : 0);
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d1a3da74fe2301c0ddbdf0e59ff9d74", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d1a3da74fe2301c0ddbdf0e59ff9d74");
        }
        return "ExposedAction{owner=" + this.owner + ", section=" + this.section + ", row=" + this.row + ", cellType=" + this.cellType + ", isAddExposed=" + this.isAddExposed + ", isAgentExposed=" + this.isAgentExposed + '}';
    }

    public ExposedAction(af afVar, int i, int i2, CellType cellType, boolean z, boolean z2) {
        Object[] objArr = {afVar, Integer.valueOf(i), Integer.valueOf(i2), cellType, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a272aebeaac940dc135158c37070a1b0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a272aebeaac940dc135158c37070a1b0");
            return;
        }
        this.owner = afVar;
        this.section = i;
        this.row = i2;
        this.cellType = cellType;
        this.isAddExposed = z;
        this.isAgentExposed = z2;
    }
}
