package com.dianping.shield.entity;

import com.dianping.agentsdk.sectionrecycler.section.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ExposedInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    public ExposedDetails details;
    public c owner;

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "452e13e74fdfec3be05486e936f5c738", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "452e13e74fdfec3be05486e936f5c738")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExposedInfo exposedInfo = (ExposedInfo) obj;
        if (this.owner.equals(exposedInfo.owner)) {
            return this.details.equals(exposedInfo.details);
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4723a1044a9b64056b5f79c13079dce", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4723a1044a9b64056b5f79c13079dce")).intValue() : (this.owner.hashCode() * 31) + this.details.hashCode();
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fdf4e8ed9abe5dfa070f49cb64e17abe", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fdf4e8ed9abe5dfa070f49cb64e17abe");
        }
        return "ExposedInfo{owner=" + this.owner + "owner agent interface=" + this.owner.getAgentInterface() + "owner cell interface=" + this.owner.getSectionCellInterface() + ", details=" + this.details + '}';
    }

    public ExposedInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d3dbb67b88de34943e2d3ff3741ba1c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d3dbb67b88de34943e2d3ff3741ba1c");
        } else {
            this.details = new ExposedDetails();
        }
    }
}
