package com.meituan.android.common.mrn.analytics.library;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ExposureInfoId {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String containerId;
    public String mreqId;

    public ExposureInfoId(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1fde361063a8caf4ae9666222235129", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1fde361063a8caf4ae9666222235129");
            return;
        }
        this.mreqId = str2;
        this.containerId = str;
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6d58237736db3180fa5ccb5957d8bbd", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6d58237736db3180fa5ccb5957d8bbd")).intValue() : Objects.hash(this.containerId, this.mreqId);
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a91e18fc3b053cda0a7bceaa221305b1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a91e18fc3b053cda0a7bceaa221305b1")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExposureInfoId exposureInfoId = (ExposureInfoId) obj;
        return Objects.equals(this.mreqId, exposureInfoId.mreqId) && Objects.equals(this.containerId, exposureInfoId.containerId);
    }
}
