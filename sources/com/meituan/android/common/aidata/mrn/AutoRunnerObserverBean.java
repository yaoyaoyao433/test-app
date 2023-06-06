package com.meituan.android.common.aidata.mrn;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AutoRunnerObserverBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String containerID;
    public Object customParam;
    public String interceptID;
    public String resourceID;
    public boolean shouldIntercept;
    public String subscriberID;
    public int type;

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33e938f4c4c95ec77efc900e37db5b3f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33e938f4c4c95ec77efc900e37db5b3f")).intValue() : Objects.hash(this.containerID, this.subscriberID, Integer.valueOf(this.type));
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31fa7a5543965415912f451d683cb261", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31fa7a5543965415912f451d683cb261")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AutoRunnerObserverBean autoRunnerObserverBean = (AutoRunnerObserverBean) obj;
        return Objects.equals(this.subscriberID, autoRunnerObserverBean.subscriberID) && Objects.equals(this.containerID, autoRunnerObserverBean.containerID) && this.type == autoRunnerObserverBean.type;
    }
}
