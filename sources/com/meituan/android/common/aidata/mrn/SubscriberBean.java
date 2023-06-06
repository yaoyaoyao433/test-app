package com.meituan.android.common.aidata.mrn;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SubscriberBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    public List<String> mCepIdList;
    public String mRnContainerID;
    public String mSubscribeId;

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fecbd63c89dab233aa78bec3093e05aa", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fecbd63c89dab233aa78bec3093e05aa")).intValue() : Objects.hash(this.mRnContainerID, this.mSubscribeId);
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4d032b9811ee74d21a5333fdb893c43", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4d032b9811ee74d21a5333fdb893c43")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubscriberBean subscriberBean = (SubscriberBean) obj;
        return Objects.equals(this.mSubscribeId, subscriberBean.mSubscribeId) && Objects.equals(this.mRnContainerID, subscriberBean.mRnContainerID);
    }
}
