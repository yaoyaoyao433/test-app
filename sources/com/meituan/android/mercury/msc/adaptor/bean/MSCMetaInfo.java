package com.meituan.android.mercury.msc.adaptor.bean;

import android.support.annotation.Keep;
import com.meituan.met.mercury.load.bean.MSCAppIdPublishId;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class MSCMetaInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<MSCAppIdPublishId> mscAppVersionsToDelete;
    private List<MSCAppMetaInfo> mscApps;
    private List<String> vipMscApps;

    public void setMscApps(List<MSCAppMetaInfo> list) {
        this.mscApps = list;
    }

    public List<MSCAppMetaInfo> getMscApps() {
        return this.mscApps;
    }

    public void setMscAppVersionsToDelete(List<MSCAppIdPublishId> list) {
        this.mscAppVersionsToDelete = list;
    }

    public List<MSCAppIdPublishId> getMscAppVersionsToDelete() {
        return this.mscAppVersionsToDelete;
    }

    public void setVipMscApps(List<String> list) {
        this.vipMscApps = list;
    }

    public List<String> getVipMscApps() {
        return this.vipMscApps;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe8394f6bc577d3a035d132906d22219", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe8394f6bc577d3a035d132906d22219");
        }
        return "MSCMetaInfo{mscApps=" + this.mscApps + ", mscAppVersionsToDelete=" + this.mscAppVersionsToDelete + ", vipMscApps=" + this.vipMscApps + '}';
    }
}
